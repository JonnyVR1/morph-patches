package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;
import p153l.fig0;
import p153l.m31;

/* JADX INFO: loaded from: classes6.dex */
public final class BytesToNameCanonicalizer {
    private static final int DEFAULT_T_SIZE = 64;
    static final int INITIAL_COLLISION_LEN = 32;
    static final int LAST_VALID_BUCKET = 254;
    private static final int MAX_COLL_CHAIN_LENGTH = 100;
    private static final int MAX_ENTRIES_FOR_REUSE = 6000;
    private static final int MAX_T_SIZE = 65536;
    static final int MIN_HASH_SIZE = 16;
    private static final int MULT = 33;
    private static final int MULT2 = 65599;
    private static final int MULT3 = 31;
    protected int _collCount;
    protected int _collEnd;
    protected Bucket[] _collList;
    private boolean _collListShared;
    protected int _count;
    protected final boolean _failOnDoS;
    protected int[] _hash;
    protected int _hashMask;
    private boolean _hashShared;
    protected boolean _intern;
    protected int _longestCollisionList;
    protected Name[] _mainNames;
    private boolean _namesShared;
    private transient boolean _needRehash;
    protected BitSet _overflows;
    protected final BytesToNameCanonicalizer _parent;
    private final int _seed;
    protected final AtomicReference<TableInfo> _tableInfo;

    private BytesToNameCanonicalizer(BytesToNameCanonicalizer bytesToNameCanonicalizer, boolean z, int i, boolean z2, TableInfo tableInfo) {
        this._parent = bytesToNameCanonicalizer;
        this._seed = i;
        this._intern = z;
        this._failOnDoS = z2;
        this._tableInfo = null;
        this._count = tableInfo.count;
        this._hashMask = tableInfo.mainHashMask;
        this._hash = tableInfo.mainHash;
        this._mainNames = tableInfo.mainNames;
        this._collList = tableInfo.collList;
        this._collCount = tableInfo.collCount;
        this._collEnd = tableInfo.collEnd;
        this._longestCollisionList = tableInfo.longestCollisionList;
        this._needRehash = false;
        this._hashShared = true;
        this._namesShared = true;
        this._collListShared = true;
    }

    private void _addSymbol(int i, Name name) {
        int iFindBestBucket;
        if (this._hashShared) {
            unshareMain();
        }
        if (this._needRehash) {
            rehash();
        }
        this._count++;
        int i2 = this._hashMask & i;
        if (this._mainNames[i2] == null) {
            this._hash[i2] = i << 8;
            if (this._namesShared) {
                unshareNames();
            }
            this._mainNames[i2] = name;
        } else {
            if (this._collListShared) {
                unshareCollision();
            }
            this._collCount++;
            int i3 = this._hash[i2];
            int i4 = i3 & 255;
            if (i4 == 0) {
                iFindBestBucket = this._collEnd;
                if (iFindBestBucket <= LAST_VALID_BUCKET) {
                    this._collEnd = iFindBestBucket + 1;
                    if (iFindBestBucket >= this._collList.length) {
                        expandCollision();
                    }
                } else {
                    iFindBestBucket = findBestBucket();
                }
                this._hash[i2] = (i3 & (-256)) | (iFindBestBucket + 1);
            } else {
                iFindBestBucket = i4 - 1;
            }
            Bucket bucket = new Bucket(name, this._collList[iFindBestBucket]);
            int i5 = bucket.length;
            if (i5 > 100) {
                _handleSpillOverflow(iFindBestBucket, bucket);
            } else {
                this._collList[iFindBestBucket] = bucket;
                this._longestCollisionList = Math.max(i5, this._longestCollisionList);
            }
        }
        int length = this._hash.length;
        int i6 = this._count;
        if (i6 > (length >> 1)) {
            int i7 = length >> 2;
            if (i6 > length - i7) {
                this._needRehash = true;
            } else if (this._collCount >= i7) {
                this._needRehash = true;
            }
        }
    }

    private void _handleSpillOverflow(int i, Bucket bucket) {
        BitSet bitSet = this._overflows;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this._overflows = bitSet2;
            bitSet2.set(i);
        } else if (bitSet.get(i)) {
            if (this._failOnDoS) {
                reportTooManyCollisions(100);
            }
            this._intern = false;
        } else {
            this._overflows.set(i);
        }
        this._collList[i] = null;
        this._count -= bucket.length;
        this._longestCollisionList = -1;
    }

    public static int[] calcQuads(byte[] bArr) {
        int length = bArr.length;
        int[] iArr = new int[(length + 3) / 4];
        int i = 0;
        while (i < length) {
            int i2 = bArr[i] & 255;
            int i3 = i + 1;
            if (i3 < length) {
                i2 = (i2 << 8) | (bArr[i3] & 255);
                i3 = i + 2;
                if (i3 < length) {
                    i2 = (i2 << 8) | (bArr[i3] & 255);
                    i3 = i + 3;
                    if (i3 < length) {
                        i2 = (bArr[i3] & 255) | (i2 << 8);
                    }
                }
            }
            iArr[i3 >> 2] = i2;
            i = i3 + 1;
        }
        return iArr;
    }

    private static Name constructName(int i, String str, int[] iArr, int i2) {
        if (i2 < 4) {
            if (i2 == 1) {
                return new Name1(str, i, iArr[0]);
            }
            if (i2 == 2) {
                return new Name2(str, i, iArr[0], iArr[1]);
            }
            if (i2 == 3) {
                return new Name3(str, i, iArr[0], iArr[1], iArr[2]);
            }
        }
        return NameN.construct(str, i, iArr, i2);
    }

    public static BytesToNameCanonicalizer createRoot() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    private void expandCollision() {
        Bucket[] bucketArr = this._collList;
        this._collList = (Bucket[]) Arrays.copyOf(bucketArr, bucketArr.length * 2);
    }

    private int findBestBucket() {
        Bucket[] bucketArr = this._collList;
        int i = this._collEnd;
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            Bucket bucket = bucketArr[i4];
            if (bucket != null) {
                int i5 = bucket.length;
                if (i5 < i2) {
                    if (i5 != 1) {
                        i3 = i4;
                        i2 = i5;
                    }
                }
            }
            return i4;
        }
        return i3;
    }

    public static Name getEmptyName() {
        return Name1.getEmptyName();
    }

    private TableInfo initTableInfo(int i) {
        return new TableInfo(0, i - 1, new int[i], new Name[i], null, 0, 0, 0);
    }

    private void mergeChild(TableInfo tableInfo) {
        int i = tableInfo.count;
        TableInfo tableInfo2 = this._tableInfo.get();
        if (i == tableInfo2.count) {
            return;
        }
        if (i > 6000) {
            tableInfo = initTableInfo(64);
        }
        m31.m156916a(this._tableInfo, tableInfo2, tableInfo);
    }

    private void nukeSymbols() {
        this._count = 0;
        this._longestCollisionList = 0;
        Arrays.fill(this._hash, 0);
        Arrays.fill(this._mainNames, (Object) null);
        Arrays.fill(this._collList, (Object) null);
        this._collCount = 0;
        this._collEnd = 0;
    }

    private void rehash() {
        int iFindBestBucket;
        this._needRehash = false;
        this._namesShared = false;
        int length = this._hash.length;
        int i = length + length;
        if (i > 65536) {
            nukeSymbols();
            return;
        }
        this._hash = new int[i];
        this._hashMask = i - 1;
        Name[] nameArr = this._mainNames;
        this._mainNames = new Name[i];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            Name name = nameArr[i3];
            if (name != null) {
                i2++;
                int iHashCode = name.hashCode();
                int i4 = this._hashMask & iHashCode;
                this._mainNames[i4] = name;
                this._hash[i4] = iHashCode << 8;
            }
        }
        int i5 = this._collEnd;
        if (i5 == 0) {
            this._longestCollisionList = 0;
            return;
        }
        this._collCount = 0;
        this._collEnd = 0;
        this._collListShared = false;
        Bucket[] bucketArr = this._collList;
        this._collList = new Bucket[bucketArr.length];
        int iMax = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            for (Bucket bucket = bucketArr[i6]; bucket != null; bucket = bucket.next) {
                i2++;
                Name name2 = bucket.name;
                int iHashCode2 = name2.hashCode();
                int i7 = this._hashMask & iHashCode2;
                int[] iArr = this._hash;
                int i8 = iArr[i7];
                Name[] nameArr2 = this._mainNames;
                if (nameArr2[i7] == null) {
                    iArr[i7] = iHashCode2 << 8;
                    nameArr2[i7] = name2;
                } else {
                    this._collCount++;
                    int i9 = i8 & 255;
                    if (i9 == 0) {
                        iFindBestBucket = this._collEnd;
                        if (iFindBestBucket <= LAST_VALID_BUCKET) {
                            this._collEnd = iFindBestBucket + 1;
                            if (iFindBestBucket >= this._collList.length) {
                                expandCollision();
                            }
                        } else {
                            iFindBestBucket = findBestBucket();
                        }
                        this._hash[i7] = (i8 & (-256)) | (iFindBestBucket + 1);
                    } else {
                        iFindBestBucket = i9 - 1;
                    }
                    Bucket bucket2 = new Bucket(name2, this._collList[iFindBestBucket]);
                    this._collList[iFindBestBucket] = bucket2;
                    iMax = Math.max(iMax, bucket2.length);
                }
            }
        }
        this._longestCollisionList = iMax;
        if (i2 == this._count) {
            return;
        }
        throw new RuntimeException("Internal error: count after rehash " + i2 + "; should be " + this._count);
    }

    private void unshareCollision() {
        Bucket[] bucketArr = this._collList;
        if (bucketArr == null) {
            this._collList = new Bucket[32];
        } else {
            this._collList = (Bucket[]) Arrays.copyOf(bucketArr, bucketArr.length);
        }
        this._collListShared = false;
    }

    private void unshareMain() {
        int[] iArr = this._hash;
        this._hash = Arrays.copyOf(iArr, iArr.length);
        this._hashShared = false;
    }

    private void unshareNames() {
        Name[] nameArr = this._mainNames;
        this._mainNames = (Name[]) Arrays.copyOf(nameArr, nameArr.length);
        this._namesShared = false;
    }

    public Name addName(String str, int[] iArr, int i) {
        int iCalcHash;
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        if (i < 3) {
            iCalcHash = i == 1 ? calcHash(iArr[0]) : calcHash(iArr[0], iArr[1]);
        } else {
            iCalcHash = calcHash(iArr, i);
        }
        Name nameConstructName = constructName(iCalcHash, str, iArr, i);
        _addSymbol(iCalcHash, nameConstructName);
        return nameConstructName;
    }

    public int bucketCount() {
        return this._hash.length;
    }

    public int calcHash(int[] iArr, int i) {
        if (i < 3) {
            fig0.m125680a();
            return 0;
        }
        int i2 = this._seed ^ iArr[0];
        int i3 = (((i2 + (i2 >>> 9)) * 33) + iArr[1]) * MULT2;
        int i4 = (i3 + (i3 >>> 15)) ^ iArr[2];
        int i5 = i4 + (i4 >>> 17);
        for (int i6 = 3; i6 < i; i6++) {
            int i7 = (i5 * 31) ^ iArr[i6];
            int i8 = i7 + (i7 >>> 3);
            i5 = i8 ^ (i8 << 7);
        }
        int i9 = i5 + (i5 >>> 15);
        return i9 ^ (i9 << 9);
    }

    public int collisionCount() {
        return this._collCount;
    }

    public Name findName(int[] iArr, int i) {
        if (i < 3) {
            return findName(iArr[0], i >= 2 ? iArr[1] : 0);
        }
        int iCalcHash = calcHash(iArr, i);
        int i2 = this._hashMask & iCalcHash;
        int i3 = this._hash[i2];
        if ((((i3 >> 8) ^ iCalcHash) << 8) == 0) {
            Name name = this._mainNames[i2];
            if (name == null || name.equals(iArr, i)) {
                return name;
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = i3 & 255;
        if (i4 > 0) {
            Bucket bucket = this._collList[i4 - 1];
            if (bucket != null) {
                return bucket.find(iCalcHash, iArr, i);
            }
        }
        return null;
    }

    public int hashSeed() {
        return this._seed;
    }

    public BytesToNameCanonicalizer makeChild(int i) {
        return new BytesToNameCanonicalizer(this, JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i), this._seed, JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i), this._tableInfo.get());
    }

    public int maxCollisionLength() {
        return this._longestCollisionList;
    }

    public boolean maybeDirty() {
        return !this._hashShared;
    }

    public void release() {
        if (this._parent == null || !maybeDirty()) {
            return;
        }
        this._parent.mergeChild(new TableInfo(this));
        this._hashShared = true;
        this._namesShared = true;
        this._collListShared = true;
    }

    public void reportTooManyCollisions(int i) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this._count + ") now exceeds maximum, " + i + " -- suspect a DoS attack based on hash collisions");
    }

    public int size() {
        AtomicReference<TableInfo> atomicReference = this._tableInfo;
        return atomicReference != null ? atomicReference.get().count : this._count;
    }

    public static BytesToNameCanonicalizer createRoot(int i) {
        return new BytesToNameCanonicalizer(64, true, i, true);
    }

    @Deprecated
    public BytesToNameCanonicalizer makeChild(boolean z, boolean z2) {
        return new BytesToNameCanonicalizer(this, z2, this._seed, true, this._tableInfo.get());
    }

    public static final class Bucket {
        public final int hash;
        public final int length;
        public final Name name;
        public final Bucket next;

        public Bucket(Name name, Bucket bucket) {
            this.name = name;
            this.next = bucket;
            this.length = bucket != null ? 1 + bucket.length : 1;
            this.hash = name.hashCode();
        }

        public Name find(int i, int i2, int i3) {
            if (this.hash == i && this.name.equals(i2, i3)) {
                return this.name;
            }
            while (true) {
                this = this.next;
                if (this == null) {
                    return null;
                }
                if (this.hash == i) {
                    Name name = this.name;
                    if (name.equals(i2, i3)) {
                        return name;
                    }
                }
            }
        }

        public Name find(int i, int[] iArr, int i2) {
            if (this.hash == i && this.name.equals(iArr, i2)) {
                return this.name;
            }
            while (true) {
                this = this.next;
                if (this == null) {
                    return null;
                }
                if (this.hash == i) {
                    Name name = this.name;
                    if (name.equals(iArr, i2)) {
                        return name;
                    }
                }
            }
        }
    }

    public static final class TableInfo {
        public final int collCount;
        public final int collEnd;
        public final Bucket[] collList;
        public final int count;
        public final int longestCollisionList;
        public final int[] mainHash;
        public final int mainHashMask;
        public final Name[] mainNames;

        public TableInfo(BytesToNameCanonicalizer bytesToNameCanonicalizer) {
            this.count = bytesToNameCanonicalizer._count;
            this.mainHashMask = bytesToNameCanonicalizer._hashMask;
            this.mainHash = bytesToNameCanonicalizer._hash;
            this.mainNames = bytesToNameCanonicalizer._mainNames;
            this.collList = bytesToNameCanonicalizer._collList;
            this.collCount = bytesToNameCanonicalizer._collCount;
            this.collEnd = bytesToNameCanonicalizer._collEnd;
            this.longestCollisionList = bytesToNameCanonicalizer._longestCollisionList;
        }

        public TableInfo(int i, int i2, int[] iArr, Name[] nameArr, Bucket[] bucketArr, int i3, int i4, int i5) {
            this.count = i;
            this.mainHashMask = i2;
            this.mainHash = iArr;
            this.mainNames = nameArr;
            this.collList = bucketArr;
            this.collCount = i3;
            this.collEnd = i4;
            this.longestCollisionList = i5;
        }
    }

    public Name addName(String str, int i, int i2) {
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        int iCalcHash = i2 == 0 ? calcHash(i) : calcHash(i, i2);
        Name nameConstructName = constructName(iCalcHash, str, i, i2);
        _addSymbol(iCalcHash, nameConstructName);
        return nameConstructName;
    }

    private BytesToNameCanonicalizer(int i, boolean z, int i2, boolean z2) {
        this._parent = null;
        this._seed = i2;
        this._intern = z;
        this._failOnDoS = z2;
        int i3 = 16;
        if (i < 16) {
            i = i3;
        } else if (((i - 1) & i) != 0) {
            while (i3 < i) {
                i3 += i3;
            }
            i = i3;
        }
        this._tableInfo = new AtomicReference<>(initTableInfo(i));
    }

    private static Name constructName(int i, String str, int i2, int i3) {
        if (i3 == 0) {
            return new Name1(str, i, i2);
        }
        return new Name2(str, i, i2, i3);
    }

    public int calcHash(int i, int i2) {
        int i3 = this._seed ^ ((i ^ (i >>> 15)) + (i2 * 33));
        return i3 + (i3 >>> 7);
    }

    public int calcHash(int i) {
        int i2 = this._seed ^ i;
        int i3 = i2 + (i2 >>> 15);
        return i3 ^ (i3 >>> 9);
    }

    public Name findName(int i, int i2) {
        int iCalcHash = i2 == 0 ? calcHash(i) : calcHash(i, i2);
        int i3 = this._hashMask & iCalcHash;
        int i4 = this._hash[i3];
        if ((((i4 >> 8) ^ iCalcHash) << 8) == 0) {
            Name name = this._mainNames[i3];
            if (name == null) {
                return null;
            }
            if (name.equals(i, i2)) {
                return name;
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = i4 & 255;
        if (i5 > 0) {
            Bucket bucket = this._collList[i5 - 1];
            if (bucket != null) {
                return bucket.find(iCalcHash, i, i2);
            }
        }
        return null;
    }

    public Name findName(int i) {
        int iCalcHash = calcHash(i);
        int i2 = this._hashMask & iCalcHash;
        int i3 = this._hash[i2];
        if ((((i3 >> 8) ^ iCalcHash) << 8) == 0) {
            Name name = this._mainNames[i2];
            if (name == null) {
                return null;
            }
            if (name.equals(i)) {
                return name;
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = i3 & 255;
        if (i4 > 0) {
            Bucket bucket = this._collList[i4 - 1];
            if (bucket != null) {
                return bucket.find(iCalcHash, i, 0);
            }
        }
        return null;
    }
}
