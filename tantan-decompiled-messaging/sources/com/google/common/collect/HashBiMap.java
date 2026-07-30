package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p149l.AbstractC19437q7;
import p149l.ggf0;
import p149l.lmr;
import p149l.lwk;
import p149l.sd5;
import p149l.sf80;
import p149l.tw2;
import p149l.v050;
import p149l.vu40;
import p149l.zvk;

/* JADX INFO: loaded from: classes7.dex */
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements tw2<K, V>, Serializable {
    private static final int ABSENT = -1;
    private static final int ENDPOINT = -2;
    private transient Set<Map.Entry<K, V>> entrySet;
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;
    private transient tw2<V, K> inverse;
    private transient Set<K> keySet;
    transient K[] keys;
    private transient int lastInInsertionOrder;
    transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    private transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    transient int size;
    private transient Set<V> valueSet;
    transient V[] values;

    public static class Inverse<K, V> extends AbstractMap<V, K> implements tw2<V, K>, Serializable {
        private final HashBiMap<K, V> forward;
        private transient Set<Map.Entry<V, K>> inverseEntrySet;

        public Inverse(HashBiMap<K, V> hashBiMap) {
            this.forward = hashBiMap;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            ((HashBiMap) this.forward).inverse = this;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.forward.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.forward.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            return this.forward.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.inverseEntrySet;
            if (set != null) {
                return set;
            }
            C2770d c2770d = new C2770d(this.forward);
            this.inverseEntrySet = c2770d;
            return c2770d;
        }

        @Override // p149l.tw2
        public K forcePut(V v2, K k) {
            return this.forward.putInverse(v2, k, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K get(Object obj) {
            return this.forward.getInverse(obj);
        }

        @Override // p149l.tw2
        public tw2<K, V> inverse() {
            return this.forward;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.forward.values();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K put(V v2, K k) {
            return this.forward.putInverse(v2, k, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K remove(Object obj) {
            return this.forward.removeInverse(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.forward.size;
        }

        @Override // java.util.AbstractMap, java.util.Map, p149l.tw2
        public Set<K> values() {
            return this.forward.keySet();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.HashBiMap$a */
    public final class C2767a extends AbstractC19437q7<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f10865a;

        /* JADX INFO: renamed from: b */
        public int f10866b;

        public C2767a(int i) {
            this.f10865a = (K) vu40.m200060a(HashBiMap.this.keys[i]);
            this.f10866b = i;
        }

        /* JADX INFO: renamed from: a */
        public void m15641a() {
            int i = this.f10866b;
            if (i != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i <= hashBiMap.size && v050.m196470a(hashBiMap.keys[i], this.f10865a)) {
                    return;
                }
            }
            this.f10866b = HashBiMap.this.findEntryByKey(this.f10865a);
        }

        @Override // p149l.AbstractC19437q7, java.util.Map.Entry
        public K getKey() {
            return this.f10865a;
        }

        @Override // p149l.AbstractC19437q7, java.util.Map.Entry
        public V getValue() {
            m15641a();
            int i = this.f10866b;
            return i == -1 ? (V) vu40.m200061b() : (V) vu40.m200060a(HashBiMap.this.values[i]);
        }

        @Override // p149l.AbstractC19437q7, java.util.Map.Entry
        public V setValue(V v2) {
            m15641a();
            int i = this.f10866b;
            HashBiMap hashBiMap = HashBiMap.this;
            if (i == -1) {
                hashBiMap.put(this.f10865a, v2);
                return (V) vu40.m200061b();
            }
            V v3 = (V) vu40.m200060a(hashBiMap.values[i]);
            if (v050.m196470a(v3, v2)) {
                return v2;
            }
            HashBiMap.this.replaceValueInEntry(this.f10866b, v2, false);
            return v3;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.HashBiMap$b */
    public static final class C2768b<K, V> extends AbstractC19437q7<V, K> {

        /* JADX INFO: renamed from: a */
        public final HashBiMap<K, V> f10868a;

        /* JADX INFO: renamed from: b */
        public final V f10869b;

        /* JADX INFO: renamed from: c */
        public int f10870c;

        public C2768b(HashBiMap<K, V> hashBiMap, int i) {
            this.f10868a = hashBiMap;
            this.f10869b = (V) vu40.m200060a(hashBiMap.values[i]);
            this.f10870c = i;
        }

        /* JADX INFO: renamed from: a */
        private void m15642a() {
            int i = this.f10870c;
            if (i != -1) {
                HashBiMap<K, V> hashBiMap = this.f10868a;
                if (i <= hashBiMap.size && v050.m196470a(this.f10869b, hashBiMap.values[i])) {
                    return;
                }
            }
            this.f10870c = this.f10868a.findEntryByValue(this.f10869b);
        }

        @Override // p149l.AbstractC19437q7, java.util.Map.Entry
        public V getKey() {
            return this.f10869b;
        }

        @Override // p149l.AbstractC19437q7, java.util.Map.Entry
        public K getValue() {
            m15642a();
            int i = this.f10870c;
            return i == -1 ? (K) vu40.m200061b() : (K) vu40.m200060a(this.f10868a.keys[i]);
        }

        @Override // p149l.AbstractC19437q7, java.util.Map.Entry
        public K setValue(K k) {
            m15642a();
            int i = this.f10870c;
            HashBiMap<K, V> hashBiMap = this.f10868a;
            if (i == -1) {
                hashBiMap.putInverse(this.f10869b, k, false);
                return (K) vu40.m200061b();
            }
            K k2 = (K) vu40.m200060a(hashBiMap.keys[i]);
            if (v050.m196470a(k2, k)) {
                return k;
            }
            this.f10868a.replaceKeyInEntry(this.f10870c, k, false);
            return k2;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.HashBiMap$c */
    public final class C2769c extends AbstractC2773g<K, V, Map.Entry<K, V>> {
        public C2769c() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.AbstractC2773g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo15643a(int i) {
            return new C2767a(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iFindEntryByKey = HashBiMap.this.findEntryByKey(key);
                if (iFindEntryByKey != -1 && v050.m196470a(value, HashBiMap.this.values[iFindEntryByKey])) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iM151974d = lwk.m151974d(key);
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(key, iM151974d);
            if (iFindEntryByKey == -1 || !v050.m196470a(value, HashBiMap.this.values[iFindEntryByKey])) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iM151974d);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.HashBiMap$d */
    public static class C2770d<K, V> extends AbstractC2773g<K, V, Map.Entry<V, K>> {
        public C2770d(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        @Override // com.google.common.collect.HashBiMap.AbstractC2773g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<V, K> mo15643a(int i) {
            return new C2768b(this.f10874a, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iFindEntryByValue = this.f10874a.findEntryByValue(key);
                if (iFindEntryByValue != -1 && v050.m196470a(this.f10874a.keys[iFindEntryByValue], value)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iM151974d = lwk.m151974d(key);
            int iFindEntryByValue = this.f10874a.findEntryByValue(key, iM151974d);
            if (iFindEntryByValue == -1 || !v050.m196470a(this.f10874a.keys[iFindEntryByValue], value)) {
                return false;
            }
            this.f10874a.removeEntryValueHashKnown(iFindEntryByValue, iM151974d);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.HashBiMap$e */
    public final class C2771e extends AbstractC2773g<K, V, K> {
        public C2771e() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.AbstractC2773g
        /* JADX INFO: renamed from: a */
        public K mo15643a(int i) {
            return (K) vu40.m200060a(HashBiMap.this.keys[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iM151974d = lwk.m151974d(obj);
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(obj, iM151974d);
            if (iFindEntryByKey == -1) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iM151974d);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.HashBiMap$f */
    public final class C2772f extends AbstractC2773g<K, V, V> {
        public C2772f() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.AbstractC2773g
        /* JADX INFO: renamed from: a */
        public V mo15643a(int i) {
            return (V) vu40.m200060a(HashBiMap.this.values[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iM151974d = lwk.m151974d(obj);
            int iFindEntryByValue = HashBiMap.this.findEntryByValue(obj, iM151974d);
            if (iFindEntryByValue == -1) {
                return false;
            }
            HashBiMap.this.removeEntryValueHashKnown(iFindEntryByValue, iM151974d);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.HashBiMap$g */
    public static abstract class AbstractC2773g<K, V, T> extends AbstractSet<T> {

        /* JADX INFO: renamed from: a */
        public final HashBiMap<K, V> f10874a;

        /* JADX INFO: renamed from: com.google.common.collect.HashBiMap$g$a */
        public class a implements Iterator<T> {

            /* JADX INFO: renamed from: a */
            public int f10875a;

            /* JADX INFO: renamed from: b */
            public int f10876b = -1;

            /* JADX INFO: renamed from: c */
            public int f10877c;

            /* JADX INFO: renamed from: d */
            public int f10878d;

            public a() {
                this.f10875a = ((HashBiMap) AbstractC2773g.this.f10874a).firstInInsertionOrder;
                HashBiMap<K, V> hashBiMap = AbstractC2773g.this.f10874a;
                this.f10877c = hashBiMap.modCount;
                this.f10878d = hashBiMap.size;
            }

            /* JADX INFO: renamed from: a */
            public final void m15646a() {
                if (AbstractC2773g.this.f10874a.modCount == this.f10877c) {
                    return;
                }
                ggf0.m125962a();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m15646a();
                return this.f10875a != -2 && this.f10878d > 0;
            }

            @Override // java.util.Iterator
            public T next() {
                if (!hasNext()) {
                    lmr.m150601a();
                    return null;
                }
                T t = (T) AbstractC2773g.this.mo15643a(this.f10875a);
                this.f10876b = this.f10875a;
                this.f10875a = ((HashBiMap) AbstractC2773g.this.f10874a).nextInInsertionOrder[this.f10875a];
                this.f10878d--;
                return t;
            }

            @Override // java.util.Iterator
            public void remove() {
                m15646a();
                sd5.m183447e(this.f10876b != -1);
                AbstractC2773g.this.f10874a.removeEntry(this.f10876b);
                int i = this.f10875a;
                HashBiMap<K, V> hashBiMap = AbstractC2773g.this.f10874a;
                if (i == hashBiMap.size) {
                    this.f10875a = this.f10876b;
                }
                this.f10876b = -1;
                this.f10877c = hashBiMap.modCount;
            }
        }

        public AbstractC2773g(HashBiMap<K, V> hashBiMap) {
            this.f10874a = hashBiMap;
        }

        /* JADX INFO: renamed from: a */
        public abstract T mo15643a(int i);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f10874a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f10874a.size;
        }
    }

    private HashBiMap(int i) {
        init(i);
    }

    private int bucket(int i) {
        return (this.hashTableKToV.length - 1) & i;
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> hashBiMapCreate = create(map.size());
        hashBiMapCreate.putAll(map);
        return hashBiMapCreate;
    }

    private static int[] createFilledWithAbsent(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void deleteFromTableKToV(int i, int i2) {
        sf80.m183882d(i != -1);
        int iBucket = bucket(i2);
        int[] iArr = this.hashTableKToV;
        int i3 = iArr[iBucket];
        int[] iArr2 = this.nextInBucketKToV;
        if (i3 == i) {
            iArr[iBucket] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = iArr2[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                String strValueOf = String.valueOf(this.keys[i]);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 32);
                sb.append("Expected to find entry with key ");
                sb.append(strValueOf);
                throw new AssertionError(sb.toString());
            }
            int[] iArr3 = this.nextInBucketKToV;
            if (i3 == i) {
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = iArr3[i3];
        }
    }

    private void deleteFromTableVToK(int i, int i2) {
        sf80.m183882d(i != -1);
        int iBucket = bucket(i2);
        int[] iArr = this.hashTableVToK;
        int i3 = iArr[iBucket];
        int[] iArr2 = this.nextInBucketVToK;
        if (i3 == i) {
            iArr[iBucket] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = iArr2[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                String strValueOf = String.valueOf(this.values[i]);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
                sb.append("Expected to find entry with value ");
                sb.append(strValueOf);
                throw new AssertionError(sb.toString());
            }
            int[] iArr3 = this.nextInBucketVToK;
            if (i3 == i) {
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = iArr3[i3];
        }
    }

    private void ensureCapacity(int i) {
        int[] iArr = this.nextInBucketKToV;
        if (iArr.length < i) {
            int iM15682e = ImmutableCollection.AbstractC2778b.m15682e(iArr.length, i);
            this.keys = (K[]) Arrays.copyOf(this.keys, iM15682e);
            this.values = (V[]) Arrays.copyOf(this.values, iM15682e);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, iM15682e);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, iM15682e);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, iM15682e);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, iM15682e);
        }
        if (this.hashTableKToV.length < i) {
            int iM151971a = lwk.m151971a(i, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(iM151971a);
            this.hashTableVToK = createFilledWithAbsent(iM151971a);
            for (int i2 = 0; i2 < this.size; i2++) {
                int iBucket = bucket(lwk.m151974d(this.keys[i2]));
                int[] iArr2 = this.nextInBucketKToV;
                int[] iArr3 = this.hashTableKToV;
                iArr2[i2] = iArr3[iBucket];
                iArr3[iBucket] = i2;
                int iBucket2 = bucket(lwk.m151974d(this.values[i2]));
                int[] iArr4 = this.nextInBucketVToK;
                int[] iArr5 = this.hashTableVToK;
                iArr4[i2] = iArr5[iBucket2];
                iArr5[iBucket2] = i2;
            }
        }
    }

    private static int[] expandAndFillWithAbsent(int[] iArr, int i) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(iArrCopyOf, length, i, -1);
        return iArrCopyOf;
    }

    private void insertIntoTableKToV(int i, int i2) {
        sf80.m183882d(i != -1);
        int iBucket = bucket(i2);
        int[] iArr = this.nextInBucketKToV;
        int[] iArr2 = this.hashTableKToV;
        iArr[i] = iArr2[iBucket];
        iArr2[iBucket] = i;
    }

    private void insertIntoTableVToK(int i, int i2) {
        sf80.m183882d(i != -1);
        int iBucket = bucket(i2);
        int[] iArr = this.nextInBucketVToK;
        int[] iArr2 = this.hashTableVToK;
        iArr[i] = iArr2[iBucket];
        iArr2[iBucket] = i;
    }

    private void moveEntryToIndex(int i, int i2) {
        int i3;
        int[] iArr;
        int i4;
        int[] iArr2;
        if (i == i2) {
            return;
        }
        int i5 = this.prevInInsertionOrder[i];
        int i6 = this.nextInInsertionOrder[i];
        setSucceeds(i5, i2);
        setSucceeds(i2, i6);
        K[] kArr = this.keys;
        K k = kArr[i];
        V[] vArr = this.values;
        V v2 = vArr[i];
        kArr[i2] = k;
        vArr[i2] = v2;
        int iBucket = bucket(lwk.m151974d(k));
        int[] iArr3 = this.hashTableKToV;
        int i7 = iArr3[iBucket];
        if (i7 == i) {
            iArr3[iBucket] = i2;
        } else {
            int i8 = this.nextInBucketKToV[i7];
            while (true) {
                i3 = i7;
                i7 = i8;
                iArr = this.nextInBucketKToV;
                if (i7 == i) {
                    break;
                } else {
                    i8 = iArr[i7];
                }
            }
            iArr[i3] = i2;
        }
        int[] iArr4 = this.nextInBucketKToV;
        iArr4[i2] = iArr4[i];
        iArr4[i] = -1;
        int iBucket2 = bucket(lwk.m151974d(v2));
        int[] iArr5 = this.hashTableVToK;
        int i9 = iArr5[iBucket2];
        if (i9 == i) {
            iArr5[iBucket2] = i2;
        } else {
            int i10 = this.nextInBucketVToK[i9];
            while (true) {
                i4 = i9;
                i9 = i10;
                iArr2 = this.nextInBucketVToK;
                if (i9 == i) {
                    break;
                } else {
                    i10 = iArr2[i9];
                }
            }
            iArr2[i4] = i2;
        }
        int[] iArr6 = this.nextInBucketVToK;
        iArr6[i2] = iArr6[i];
        iArr6[i] = -1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iM16311h = C2976o.m16311h(objectInputStream);
        init(16);
        C2976o.m16306c(this, objectInputStream, iM16311h);
    }

    private void removeEntry(int i, int i2, int i3) {
        sf80.m183882d(i != -1);
        deleteFromTableKToV(i, i2);
        deleteFromTableVToK(i, i3);
        setSucceeds(this.prevInInsertionOrder[i], this.nextInInsertionOrder[i]);
        moveEntryToIndex(this.size - 1, i);
        K[] kArr = this.keys;
        int i4 = this.size;
        kArr[i4 - 1] = null;
        this.values[i4 - 1] = null;
        this.size = i4 - 1;
        this.modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceKeyInEntry(int i, K k, boolean z) {
        int i2;
        sf80.m183882d(i != -1);
        int iM151974d = lwk.m151974d(k);
        int iFindEntryByKey = findEntryByKey(k, iM151974d);
        int i3 = this.lastInInsertionOrder;
        if (iFindEntryByKey == -1) {
            i2 = -2;
        } else if (!z) {
            String strValueOf = String.valueOf(k);
            zvk.m220414a(strValueOf.length() + 28, "Key already present in map: ", strValueOf);
            return;
        } else {
            i3 = this.prevInInsertionOrder[iFindEntryByKey];
            i2 = this.nextInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iM151974d);
            if (i == this.size) {
                i = iFindEntryByKey;
            }
        }
        if (i3 == i) {
            i3 = this.prevInInsertionOrder[i];
        } else if (i3 == this.size) {
            i3 = iFindEntryByKey;
        }
        if (i2 == i) {
            iFindEntryByKey = this.nextInInsertionOrder[i];
        } else if (i2 != this.size) {
            iFindEntryByKey = i2;
        }
        setSucceeds(this.prevInInsertionOrder[i], this.nextInInsertionOrder[i]);
        deleteFromTableKToV(i, lwk.m151974d(this.keys[i]));
        this.keys[i] = k;
        insertIntoTableKToV(i, lwk.m151974d(k));
        setSucceeds(i3, i);
        setSucceeds(i, iFindEntryByKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceValueInEntry(int i, V v2, boolean z) {
        sf80.m183882d(i != -1);
        int iM151974d = lwk.m151974d(v2);
        int iFindEntryByValue = findEntryByValue(v2, iM151974d);
        if (iFindEntryByValue != -1) {
            if (!z) {
                String strValueOf = String.valueOf(v2);
                zvk.m220414a(strValueOf.length() + 30, "Value already present in map: ", strValueOf);
                return;
            } else {
                removeEntryValueHashKnown(iFindEntryByValue, iM151974d);
                if (i == this.size) {
                    i = iFindEntryByValue;
                }
            }
        }
        deleteFromTableVToK(i, lwk.m151974d(this.values[i]));
        this.values[i] = v2;
        insertIntoTableVToK(i, iM151974d);
    }

    private void setSucceeds(int i, int i2) {
        if (i == -2) {
            this.firstInInsertionOrder = i2;
        } else {
            this.nextInInsertionOrder[i] = i2;
        }
        if (i2 == -2) {
            this.lastInInsertionOrder = i;
        } else {
            this.prevInInsertionOrder[i2] = i;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C2976o.m16312i(this, objectOutputStream);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, (Object) null);
        Arrays.fill(this.hashTableKToV, -1);
        Arrays.fill(this.hashTableVToK, -1);
        Arrays.fill(this.nextInBucketKToV, 0, this.size, -1);
        Arrays.fill(this.nextInBucketVToK, 0, this.size, -1);
        Arrays.fill(this.prevInInsertionOrder, 0, this.size, -1);
        Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
        this.size = 0;
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findEntryByKey(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        return findEntryByValue(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        C2769c c2769c = new C2769c();
        this.entrySet = c2769c;
        return c2769c;
    }

    public int findEntry(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[bucket(i)];
        while (i2 != -1) {
            if (v050.m196470a(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    public int findEntryByKey(Object obj, int i) {
        return findEntry(obj, i, this.hashTableKToV, this.nextInBucketKToV, this.keys);
    }

    public int findEntryByValue(Object obj, int i) {
        return findEntry(obj, i, this.hashTableVToK, this.nextInBucketVToK, this.values);
    }

    @Override // p149l.tw2
    public V forcePut(K k, V v2) {
        return put(k, v2, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int iFindEntryByKey = findEntryByKey(obj);
        if (iFindEntryByKey == -1) {
            return null;
        }
        return this.values[iFindEntryByKey];
    }

    public K getInverse(Object obj) {
        int iFindEntryByValue = findEntryByValue(obj);
        if (iFindEntryByValue == -1) {
            return null;
        }
        return this.keys[iFindEntryByValue];
    }

    public void init(int i) {
        sd5.m183444b(i, "expectedSize");
        int iM151971a = lwk.m151971a(i, 1.0d);
        this.size = 0;
        this.keys = (K[]) new Object[i];
        this.values = (V[]) new Object[i];
        this.hashTableKToV = createFilledWithAbsent(iM151971a);
        this.hashTableVToK = createFilledWithAbsent(iM151971a);
        this.nextInBucketKToV = createFilledWithAbsent(i);
        this.nextInBucketVToK = createFilledWithAbsent(i);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(i);
        this.nextInInsertionOrder = createFilledWithAbsent(i);
    }

    @Override // p149l.tw2
    public tw2<V, K> inverse() {
        tw2<V, K> tw2Var = this.inverse;
        if (tw2Var != null) {
            return tw2Var;
        }
        Inverse inverse = new Inverse(this);
        this.inverse = inverse;
        return inverse;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        C2771e c2771e = new C2771e();
        this.keySet = c2771e;
        return c2771e;
    }

    public V put(K k, V v2, boolean z) {
        int iM151974d = lwk.m151974d(k);
        int iFindEntryByKey = findEntryByKey(k, iM151974d);
        if (iFindEntryByKey != -1) {
            V v3 = this.values[iFindEntryByKey];
            if (v050.m196470a(v3, v2)) {
                return v2;
            }
            replaceValueInEntry(iFindEntryByKey, v2, z);
            return v3;
        }
        int iM151974d2 = lwk.m151974d(v2);
        int iFindEntryByValue = findEntryByValue(v2, iM151974d2);
        if (!z) {
            sf80.m183889k(iFindEntryByValue == -1, "Value already present: %s", v2);
        } else if (iFindEntryByValue != -1) {
            removeEntryValueHashKnown(iFindEntryByValue, iM151974d2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i = this.size;
        kArr[i] = k;
        this.values[i] = v2;
        insertIntoTableKToV(i, iM151974d);
        insertIntoTableVToK(this.size, iM151974d2);
        setSucceeds(this.lastInInsertionOrder, this.size);
        setSucceeds(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    public K putInverse(V v2, K k, boolean z) {
        int iM151974d = lwk.m151974d(v2);
        int iFindEntryByValue = findEntryByValue(v2, iM151974d);
        if (iFindEntryByValue != -1) {
            K k2 = this.keys[iFindEntryByValue];
            if (v050.m196470a(k2, k)) {
                return k;
            }
            replaceKeyInEntry(iFindEntryByValue, k, z);
            return k2;
        }
        int i = this.lastInInsertionOrder;
        int iM151974d2 = lwk.m151974d(k);
        int iFindEntryByKey = findEntryByKey(k, iM151974d2);
        if (!z) {
            sf80.m183889k(iFindEntryByKey == -1, "Key already present: %s", k);
        } else if (iFindEntryByKey != -1) {
            i = this.prevInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iM151974d2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i2 = this.size;
        kArr[i2] = k;
        this.values[i2] = v2;
        insertIntoTableKToV(i2, iM151974d2);
        insertIntoTableVToK(this.size, iM151974d);
        int i3 = i == -2 ? this.firstInInsertionOrder : this.nextInInsertionOrder[i];
        setSucceeds(i, this.size);
        setSucceeds(this.size, i3);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        int iM151974d = lwk.m151974d(obj);
        int iFindEntryByKey = findEntryByKey(obj, iM151974d);
        if (iFindEntryByKey == -1) {
            return null;
        }
        V v2 = this.values[iFindEntryByKey];
        removeEntryKeyHashKnown(iFindEntryByKey, iM151974d);
        return v2;
    }

    public void removeEntryKeyHashKnown(int i, int i2) {
        removeEntry(i, i2, lwk.m151974d(this.values[i]));
    }

    public void removeEntryValueHashKnown(int i, int i2) {
        removeEntry(i, lwk.m151974d(this.keys[i]), i2);
    }

    public K removeInverse(Object obj) {
        int iM151974d = lwk.m151974d(obj);
        int iFindEntryByValue = findEntryByValue(obj, iM151974d);
        if (iFindEntryByValue == -1) {
            return null;
        }
        K k = this.keys[iFindEntryByValue];
        removeEntryValueHashKnown(iFindEntryByValue, iM151974d);
        return k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map, p149l.tw2
    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        C2772f c2772f = new C2772f();
        this.valueSet = c2772f;
        return c2772f;
    }

    public static <K, V> HashBiMap<K, V> create(int i) {
        return new HashBiMap<>(i);
    }

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    public int findEntryByKey(Object obj) {
        return findEntryByKey(obj, lwk.m151974d(obj));
    }

    public int findEntryByValue(Object obj) {
        return findEntryByValue(obj, lwk.m151974d(obj));
    }

    public void removeEntry(int i) {
        removeEntryKeyHashKnown(i, lwk.m151974d(this.keys[i]));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v2) {
        return put(k, v2, false);
    }
}
