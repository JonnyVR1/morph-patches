package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: loaded from: classes6.dex */
public final class CharsToNameCanonicalizer {
    protected static final int DEFAULT_T_SIZE = 64;
    public static final int HASH_MULT = 33;
    static final int MAX_COLL_CHAIN_LENGTH = 100;
    static final int MAX_ENTRIES_FOR_REUSE = 12000;
    protected static final int MAX_T_SIZE = 65536;
    static final CharsToNameCanonicalizer sBootstrapSymbolTable = new CharsToNameCanonicalizer();
    protected Bucket[] _buckets;
    protected boolean _canonicalize;
    protected boolean _dirty;
    protected final int _flags;
    private final int _hashSeed;
    protected int _indexMask;
    protected int _longestCollisionList;
    protected BitSet _overflows;
    protected CharsToNameCanonicalizer _parent;
    protected int _size;
    protected int _sizeThreshold;
    protected String[] _symbols;

    public static final class Bucket {
        public final int length;
        public final Bucket next;
        public final String symbol;

        public Bucket(String str, Bucket bucket) {
            this.symbol = str;
            this.next = bucket;
            this.length = bucket != null ? 1 + bucket.length : 1;
        }

        public String has(char[] cArr, int i, int i2) {
            if (this.symbol.length() != i2) {
                return null;
            }
            int i3 = 0;
            while (this.symbol.charAt(i3) == cArr[i + i3]) {
                i3++;
                if (i3 >= i2) {
                    return this.symbol;
                }
            }
            return null;
        }
    }

    private CharsToNameCanonicalizer(CharsToNameCanonicalizer charsToNameCanonicalizer, int i, String[] strArr, Bucket[] bucketArr, int i2, int i3, int i4) {
        this._parent = charsToNameCanonicalizer;
        this._flags = i;
        this._canonicalize = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i);
        this._symbols = strArr;
        this._buckets = bucketArr;
        this._size = i2;
        this._hashSeed = i3;
        int length = strArr.length;
        this._sizeThreshold = _thresholdSize(length);
        this._indexMask = length - 1;
        this._longestCollisionList = i4;
        this._dirty = false;
    }

    private String _addSymbol(char[] cArr, int i, int i2, int i3, int i4) {
        if (!this._dirty) {
            copyArrays();
            this._dirty = true;
        } else if (this._size >= this._sizeThreshold) {
            rehash();
            i4 = _hashToIndex(calcHash(cArr, i, i2));
        }
        String str = new String(cArr, i, i2);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(this._flags)) {
            str = InternCache.instance.intern(str);
        }
        this._size++;
        String[] strArr = this._symbols;
        if (strArr[i4] == null) {
            strArr[i4] = str;
            return str;
        }
        int i5 = i4 >> 1;
        Bucket bucket = new Bucket(str, this._buckets[i5]);
        int i6 = bucket.length;
        if (i6 > 100) {
            _handleSpillOverflow(i5, bucket);
            return str;
        }
        this._buckets[i5] = bucket;
        this._longestCollisionList = Math.max(i6, this._longestCollisionList);
        return str;
    }

    private String _findSymbol2(char[] cArr, int i, int i2, Bucket bucket) {
        while (bucket != null) {
            String strHas = bucket.has(cArr, i, i2);
            if (strHas != null) {
                return strHas;
            }
            bucket = bucket.next;
        }
        return null;
    }

    private void _handleSpillOverflow(int i, Bucket bucket) {
        BitSet bitSet = this._overflows;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this._overflows = bitSet2;
            bitSet2.set(i);
        } else if (bitSet.get(i)) {
            if (JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this._flags)) {
                reportTooManyCollisions(100);
            }
            this._canonicalize = false;
        } else {
            this._overflows.set(i);
        }
        this._symbols[i + i] = bucket.symbol;
        this._buckets[i] = null;
        this._size -= bucket.length;
        this._longestCollisionList = -1;
    }

    private static int _thresholdSize(int i) {
        return i - (i >> 2);
    }

    private void copyArrays() {
        String[] strArr = this._symbols;
        this._symbols = (String[]) Arrays.copyOf(strArr, strArr.length);
        Bucket[] bucketArr = this._buckets;
        this._buckets = (Bucket[]) Arrays.copyOf(bucketArr, bucketArr.length);
    }

    public static CharsToNameCanonicalizer createRoot() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    private void initTables(int i) {
        this._symbols = new String[i];
        this._buckets = new Bucket[i >> 1];
        this._indexMask = i - 1;
        this._size = 0;
        this._longestCollisionList = 0;
        this._sizeThreshold = _thresholdSize(i);
    }

    private CharsToNameCanonicalizer makeOrphan(int i) {
        return new CharsToNameCanonicalizer(null, -1, this._symbols, this._buckets, this._size, i, this._longestCollisionList);
    }

    private void mergeChild(CharsToNameCanonicalizer charsToNameCanonicalizer) {
        if (charsToNameCanonicalizer.size() > MAX_ENTRIES_FOR_REUSE) {
            synchronized (this) {
                initTables(256);
                this._dirty = false;
            }
        } else {
            if (charsToNameCanonicalizer.size() <= size()) {
                return;
            }
            synchronized (this) {
                this._symbols = charsToNameCanonicalizer._symbols;
                this._buckets = charsToNameCanonicalizer._buckets;
                this._size = charsToNameCanonicalizer._size;
                this._sizeThreshold = charsToNameCanonicalizer._sizeThreshold;
                this._indexMask = charsToNameCanonicalizer._indexMask;
                this._longestCollisionList = charsToNameCanonicalizer._longestCollisionList;
                this._dirty = false;
            }
        }
    }

    private void rehash() {
        String[] strArr = this._symbols;
        int length = strArr.length;
        int i = length + length;
        if (i > 65536) {
            this._size = 0;
            this._canonicalize = false;
            this._symbols = new String[64];
            this._buckets = new Bucket[32];
            this._indexMask = 63;
            this._dirty = true;
            return;
        }
        Bucket[] bucketArr = this._buckets;
        this._symbols = new String[i];
        this._buckets = new Bucket[i >> 1];
        this._indexMask = i - 1;
        this._sizeThreshold = _thresholdSize(i);
        int i2 = 0;
        int iMax = 0;
        for (String str : strArr) {
            if (str != null) {
                i2++;
                int i_hashToIndex = _hashToIndex(calcHash(str));
                String[] strArr2 = this._symbols;
                if (strArr2[i_hashToIndex] == null) {
                    strArr2[i_hashToIndex] = str;
                } else {
                    int i3 = i_hashToIndex >> 1;
                    Bucket bucket = new Bucket(str, this._buckets[i3]);
                    this._buckets[i3] = bucket;
                    iMax = Math.max(iMax, bucket.length);
                }
            }
        }
        int i4 = length >> 1;
        for (int i5 = 0; i5 < i4; i5++) {
            for (Bucket bucket2 = bucketArr[i5]; bucket2 != null; bucket2 = bucket2.next) {
                i2++;
                String str2 = bucket2.symbol;
                int i_hashToIndex2 = _hashToIndex(calcHash(str2));
                String[] strArr3 = this._symbols;
                if (strArr3[i_hashToIndex2] == null) {
                    strArr3[i_hashToIndex2] = str2;
                } else {
                    int i6 = i_hashToIndex2 >> 1;
                    Bucket bucket3 = new Bucket(str2, this._buckets[i6]);
                    this._buckets[i6] = bucket3;
                    iMax = Math.max(iMax, bucket3.length);
                }
            }
        }
        this._longestCollisionList = iMax;
        this._overflows = null;
        if (i2 == this._size) {
            return;
        }
        throw new Error("Internal error on SymbolTable.rehash(): had " + this._size + " entries; now have " + i2 + ".");
    }

    public int _hashToIndex(int i) {
        return this._indexMask & (i + (i >>> 15));
    }

    public int bucketCount() {
        return this._symbols.length;
    }

    public int calcHash(String str) {
        int length = str.length();
        int iCharAt = this._hashSeed;
        for (int i = 0; i < length; i++) {
            iCharAt = (iCharAt * 33) + str.charAt(i);
        }
        if (iCharAt == 0) {
            return 1;
        }
        return iCharAt;
    }

    public int collisionCount() {
        int i = 0;
        for (Bucket bucket : this._buckets) {
            if (bucket != null) {
                i += bucket.length;
            }
        }
        return i;
    }

    public String findSymbol(char[] cArr, int i, int i2, int i3) {
        if (i2 < 1) {
            return "";
        }
        if (!this._canonicalize) {
            return new String(cArr, i, i2);
        }
        int i_hashToIndex = _hashToIndex(i3);
        String str = this._symbols[i_hashToIndex];
        if (str != null) {
            if (str.length() == i2) {
                int i4 = 0;
                while (str.charAt(i4) == cArr[i + i4]) {
                    i4++;
                    if (i4 == i2) {
                        return str;
                    }
                }
            }
            Bucket bucket = this._buckets[i_hashToIndex >> 1];
            if (bucket != null) {
                String strHas = bucket.has(cArr, i, i2);
                if (strHas != null) {
                    return strHas;
                }
                String str_findSymbol2 = _findSymbol2(cArr, i, i2, bucket.next);
                if (str_findSymbol2 != null) {
                    return str_findSymbol2;
                }
            }
        }
        return _addSymbol(cArr, i, i2, i3, i_hashToIndex);
    }

    public int hashSeed() {
        return this._hashSeed;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0019 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CharsToNameCanonicalizer makeChild(int i) throws Throwable {
        String[] strArr;
        Bucket[] bucketArr;
        int i2;
        int i3;
        int i4;
        synchronized (this) {
            try {
                strArr = this._symbols;
                bucketArr = this._buckets;
                i2 = this._size;
                i3 = this._hashSeed;
                i4 = this._longestCollisionList;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    throw th;
                }
            }
        }
        return new CharsToNameCanonicalizer(this, i, strArr, bucketArr, i2, i3, i4);
    }

    public int maxCollisionLength() {
        return this._longestCollisionList;
    }

    public boolean maybeDirty() {
        return this._dirty;
    }

    public void release() {
        CharsToNameCanonicalizer charsToNameCanonicalizer;
        if (maybeDirty() && (charsToNameCanonicalizer = this._parent) != null && this._canonicalize) {
            charsToNameCanonicalizer.mergeChild(this);
            this._dirty = false;
        }
    }

    public void reportTooManyCollisions(int i) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this._size + ") now exceeds maximum, " + i + " -- suspect a DoS attack based on hash collisions");
    }

    public int size() {
        return this._size;
    }

    public static CharsToNameCanonicalizer createRoot(int i) {
        return sBootstrapSymbolTable.makeOrphan(i);
    }

    public int calcHash(char[] cArr, int i, int i2) {
        int i3 = this._hashSeed;
        int i4 = i2 + i;
        while (i < i4) {
            i3 = (i3 * 33) + cArr[i];
            i++;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    private CharsToNameCanonicalizer() {
        this._canonicalize = true;
        this._flags = -1;
        this._dirty = true;
        this._hashSeed = 0;
        this._longestCollisionList = 0;
        initTables(64);
    }
}
