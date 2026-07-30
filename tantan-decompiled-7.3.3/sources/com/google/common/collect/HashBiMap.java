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
import p153l.AbstractC18359l7;
import p153l.bzk;
import p153l.jx2;
import p153l.k350;
import p153l.k950;
import p153l.mor;
import p153l.nof0;
import p153l.pyk;
import p153l.se5;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements jx2<K, V>, Serializable {
    private static final int ABSENT = -1;
    private static final int ENDPOINT = -2;
    private transient Set<Map.Entry<K, V>> entrySet;
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;
    private transient jx2<V, K> inverse;
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

    public static class Inverse<K, V> extends AbstractMap<V, K> implements jx2<V, K>, Serializable {
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
            C2793d c2793d = new C2793d(this.forward);
            this.inverseEntrySet = c2793d;
            return c2793d;
        }

        @Override // p153l.jx2
        public K forcePut(V v2, K k) {
            return this.forward.putInverse(v2, k, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K get(Object obj) {
            return this.forward.getInverse(obj);
        }

        @Override // p153l.jx2
        public jx2<K, V> inverse() {
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

        @Override // java.util.AbstractMap, java.util.Map, p153l.jx2
        public Set<K> values() {
            return this.forward.keySet();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.HashBiMap$a */
    public final class C2790a extends AbstractC18359l7<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f10902a;

        /* JADX INFO: renamed from: b */
        public int f10903b;

        public C2790a(int i) {
            this.f10902a = (K) k350.m147997a(HashBiMap.this.keys[i]);
            this.f10903b = i;
        }

        /* JADX INFO: renamed from: a */
        public void m15695a() {
            int i = this.f10903b;
            if (i != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i <= hashBiMap.size && k950.m148863a(hashBiMap.keys[i], this.f10902a)) {
                    return;
                }
            }
            this.f10903b = HashBiMap.this.findEntryByKey(this.f10902a);
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public K getKey() {
            return this.f10902a;
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public V getValue() {
            m15695a();
            int i = this.f10903b;
            return i == -1 ? (V) k350.m147998b() : (V) k350.m147997a(HashBiMap.this.values[i]);
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public V setValue(V v2) {
            m15695a();
            int i = this.f10903b;
            HashBiMap hashBiMap = HashBiMap.this;
            if (i == -1) {
                hashBiMap.put(this.f10902a, v2);
                return (V) k350.m147998b();
            }
            V v3 = (V) k350.m147997a(hashBiMap.values[i]);
            if (k950.m148863a(v3, v2)) {
                return v2;
            }
            HashBiMap.this.replaceValueInEntry(this.f10903b, v2, false);
            return v3;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.HashBiMap$b */
    public static final class C2791b<K, V> extends AbstractC18359l7<V, K> {

        /* JADX INFO: renamed from: a */
        public final HashBiMap<K, V> f10905a;

        /* JADX INFO: renamed from: b */
        public final V f10906b;

        /* JADX INFO: renamed from: c */
        public int f10907c;

        public C2791b(HashBiMap<K, V> hashBiMap, int i) {
            this.f10905a = hashBiMap;
            this.f10906b = (V) k350.m147997a(hashBiMap.values[i]);
            this.f10907c = i;
        }

        /* JADX INFO: renamed from: a */
        private void m15696a() {
            int i = this.f10907c;
            if (i != -1) {
                HashBiMap<K, V> hashBiMap = this.f10905a;
                if (i <= hashBiMap.size && k950.m148863a(this.f10906b, hashBiMap.values[i])) {
                    return;
                }
            }
            this.f10907c = this.f10905a.findEntryByValue(this.f10906b);
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public V getKey() {
            return this.f10906b;
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public K getValue() {
            m15696a();
            int i = this.f10907c;
            return i == -1 ? (K) k350.m147998b() : (K) k350.m147997a(this.f10905a.keys[i]);
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public K setValue(K k) {
            m15696a();
            int i = this.f10907c;
            HashBiMap<K, V> hashBiMap = this.f10905a;
            if (i == -1) {
                hashBiMap.putInverse(this.f10906b, k, false);
                return (K) k350.m147998b();
            }
            K k2 = (K) k350.m147997a(hashBiMap.keys[i]);
            if (k950.m148863a(k2, k)) {
                return k;
            }
            this.f10905a.replaceKeyInEntry(this.f10907c, k, false);
            return k2;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.HashBiMap$c */
    public final class C2792c extends AbstractC2796g<K, V, Map.Entry<K, V>> {
        public C2792c() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.AbstractC2796g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo15697a(int i) {
            return new C2790a(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iFindEntryByKey = HashBiMap.this.findEntryByKey(key);
                if (iFindEntryByKey != -1 && k950.m148863a(value, HashBiMap.this.values[iFindEntryByKey])) {
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
            int iM107166d = bzk.m107166d(key);
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(key, iM107166d);
            if (iFindEntryByKey == -1 || !k950.m148863a(value, HashBiMap.this.values[iFindEntryByKey])) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iM107166d);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.HashBiMap$d */
    public static class C2793d<K, V> extends AbstractC2796g<K, V, Map.Entry<V, K>> {
        public C2793d(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        @Override // com.google.common.collect.HashBiMap.AbstractC2796g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<V, K> mo15697a(int i) {
            return new C2791b(this.f10911a, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iFindEntryByValue = this.f10911a.findEntryByValue(key);
                if (iFindEntryByValue != -1 && k950.m148863a(this.f10911a.keys[iFindEntryByValue], value)) {
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
            int iM107166d = bzk.m107166d(key);
            int iFindEntryByValue = this.f10911a.findEntryByValue(key, iM107166d);
            if (iFindEntryByValue == -1 || !k950.m148863a(this.f10911a.keys[iFindEntryByValue], value)) {
                return false;
            }
            this.f10911a.removeEntryValueHashKnown(iFindEntryByValue, iM107166d);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.HashBiMap$e */
    public final class C2794e extends AbstractC2796g<K, V, K> {
        public C2794e() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.AbstractC2796g
        /* JADX INFO: renamed from: a */
        public K mo15697a(int i) {
            return (K) k350.m147997a(HashBiMap.this.keys[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iM107166d = bzk.m107166d(obj);
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(obj, iM107166d);
            if (iFindEntryByKey == -1) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iM107166d);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.HashBiMap$f */
    public final class C2795f extends AbstractC2796g<K, V, V> {
        public C2795f() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.AbstractC2796g
        /* JADX INFO: renamed from: a */
        public V mo15697a(int i) {
            return (V) k350.m147997a(HashBiMap.this.values[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iM107166d = bzk.m107166d(obj);
            int iFindEntryByValue = HashBiMap.this.findEntryByValue(obj, iM107166d);
            if (iFindEntryByValue == -1) {
                return false;
            }
            HashBiMap.this.removeEntryValueHashKnown(iFindEntryByValue, iM107166d);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.HashBiMap$g */
    public static abstract class AbstractC2796g<K, V, T> extends AbstractSet<T> {

        /* JADX INFO: renamed from: a */
        public final HashBiMap<K, V> f10911a;

        /* JADX INFO: renamed from: com.google.common.collect.HashBiMap$g$a */
        public class a implements Iterator<T> {

            /* JADX INFO: renamed from: a */
            public int f10912a;

            /* JADX INFO: renamed from: b */
            public int f10913b = -1;

            /* JADX INFO: renamed from: c */
            public int f10914c;

            /* JADX INFO: renamed from: d */
            public int f10915d;

            public a() {
                this.f10912a = ((HashBiMap) AbstractC2796g.this.f10911a).firstInInsertionOrder;
                HashBiMap<K, V> hashBiMap = AbstractC2796g.this.f10911a;
                this.f10914c = hashBiMap.modCount;
                this.f10915d = hashBiMap.size;
            }

            /* JADX INFO: renamed from: a */
            public final void m15700a() {
                if (AbstractC2796g.this.f10911a.modCount == this.f10914c) {
                    return;
                }
                nof0.m164126a();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m15700a();
                return this.f10912a != -2 && this.f10915d > 0;
            }

            @Override // java.util.Iterator
            public T next() {
                if (!hasNext()) {
                    mor.m159308a();
                    return null;
                }
                T t = (T) AbstractC2796g.this.mo15697a(this.f10912a);
                this.f10913b = this.f10912a;
                this.f10912a = ((HashBiMap) AbstractC2796g.this.f10911a).nextInInsertionOrder[this.f10912a];
                this.f10915d--;
                return t;
            }

            @Override // java.util.Iterator
            public void remove() {
                m15700a();
                se5.m185519e(this.f10913b != -1);
                AbstractC2796g.this.f10911a.removeEntry(this.f10913b);
                int i = this.f10912a;
                HashBiMap<K, V> hashBiMap = AbstractC2796g.this.f10911a;
                if (i == hashBiMap.size) {
                    this.f10912a = this.f10913b;
                }
                this.f10913b = -1;
                this.f10914c = hashBiMap.modCount;
            }
        }

        public AbstractC2796g(HashBiMap<K, V> hashBiMap) {
            this.f10911a = hashBiMap;
        }

        /* JADX INFO: renamed from: a */
        public abstract T mo15697a(int i);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f10911a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f10911a.size;
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
        xn80.m212099d(i != -1);
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
        xn80.m212099d(i != -1);
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
            int iM15736e = ImmutableCollection.AbstractC2801b.m15736e(iArr.length, i);
            this.keys = (K[]) Arrays.copyOf(this.keys, iM15736e);
            this.values = (V[]) Arrays.copyOf(this.values, iM15736e);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, iM15736e);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, iM15736e);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, iM15736e);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, iM15736e);
        }
        if (this.hashTableKToV.length < i) {
            int iM107163a = bzk.m107163a(i, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(iM107163a);
            this.hashTableVToK = createFilledWithAbsent(iM107163a);
            for (int i2 = 0; i2 < this.size; i2++) {
                int iBucket = bucket(bzk.m107166d(this.keys[i2]));
                int[] iArr2 = this.nextInBucketKToV;
                int[] iArr3 = this.hashTableKToV;
                iArr2[i2] = iArr3[iBucket];
                iArr3[iBucket] = i2;
                int iBucket2 = bucket(bzk.m107166d(this.values[i2]));
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
        xn80.m212099d(i != -1);
        int iBucket = bucket(i2);
        int[] iArr = this.nextInBucketKToV;
        int[] iArr2 = this.hashTableKToV;
        iArr[i] = iArr2[iBucket];
        iArr2[iBucket] = i;
    }

    private void insertIntoTableVToK(int i, int i2) {
        xn80.m212099d(i != -1);
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
        int iBucket = bucket(bzk.m107166d(k));
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
        int iBucket2 = bucket(bzk.m107166d(v2));
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
        int iM16365h = C2999o.m16365h(objectInputStream);
        init(16);
        C2999o.m16360c(this, objectInputStream, iM16365h);
    }

    private void removeEntry(int i, int i2, int i3) {
        xn80.m212099d(i != -1);
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
        xn80.m212099d(i != -1);
        int iM107166d = bzk.m107166d(k);
        int iFindEntryByKey = findEntryByKey(k, iM107166d);
        int i3 = this.lastInInsertionOrder;
        if (iFindEntryByKey == -1) {
            i2 = -2;
        } else if (!z) {
            String strValueOf = String.valueOf(k);
            pyk.m174297a(strValueOf.length() + 28, "Key already present in map: ", strValueOf);
            return;
        } else {
            i3 = this.prevInInsertionOrder[iFindEntryByKey];
            i2 = this.nextInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iM107166d);
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
        deleteFromTableKToV(i, bzk.m107166d(this.keys[i]));
        this.keys[i] = k;
        insertIntoTableKToV(i, bzk.m107166d(k));
        setSucceeds(i3, i);
        setSucceeds(i, iFindEntryByKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceValueInEntry(int i, V v2, boolean z) {
        xn80.m212099d(i != -1);
        int iM107166d = bzk.m107166d(v2);
        int iFindEntryByValue = findEntryByValue(v2, iM107166d);
        if (iFindEntryByValue != -1) {
            if (!z) {
                String strValueOf = String.valueOf(v2);
                pyk.m174297a(strValueOf.length() + 30, "Value already present in map: ", strValueOf);
                return;
            } else {
                removeEntryValueHashKnown(iFindEntryByValue, iM107166d);
                if (i == this.size) {
                    i = iFindEntryByValue;
                }
            }
        }
        deleteFromTableVToK(i, bzk.m107166d(this.values[i]));
        this.values[i] = v2;
        insertIntoTableVToK(i, iM107166d);
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
        C2999o.m16366i(this, objectOutputStream);
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
        C2792c c2792c = new C2792c();
        this.entrySet = c2792c;
        return c2792c;
    }

    public int findEntry(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[bucket(i)];
        while (i2 != -1) {
            if (k950.m148863a(objArr[i2], obj)) {
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

    @Override // p153l.jx2
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
        se5.m185516b(i, "expectedSize");
        int iM107163a = bzk.m107163a(i, 1.0d);
        this.size = 0;
        this.keys = (K[]) new Object[i];
        this.values = (V[]) new Object[i];
        this.hashTableKToV = createFilledWithAbsent(iM107163a);
        this.hashTableVToK = createFilledWithAbsent(iM107163a);
        this.nextInBucketKToV = createFilledWithAbsent(i);
        this.nextInBucketVToK = createFilledWithAbsent(i);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(i);
        this.nextInInsertionOrder = createFilledWithAbsent(i);
    }

    @Override // p153l.jx2
    public jx2<V, K> inverse() {
        jx2<V, K> jx2Var = this.inverse;
        if (jx2Var != null) {
            return jx2Var;
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
        C2794e c2794e = new C2794e();
        this.keySet = c2794e;
        return c2794e;
    }

    public V put(K k, V v2, boolean z) {
        int iM107166d = bzk.m107166d(k);
        int iFindEntryByKey = findEntryByKey(k, iM107166d);
        if (iFindEntryByKey != -1) {
            V v3 = this.values[iFindEntryByKey];
            if (k950.m148863a(v3, v2)) {
                return v2;
            }
            replaceValueInEntry(iFindEntryByKey, v2, z);
            return v3;
        }
        int iM107166d2 = bzk.m107166d(v2);
        int iFindEntryByValue = findEntryByValue(v2, iM107166d2);
        if (!z) {
            xn80.m212106k(iFindEntryByValue == -1, "Value already present: %s", v2);
        } else if (iFindEntryByValue != -1) {
            removeEntryValueHashKnown(iFindEntryByValue, iM107166d2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i = this.size;
        kArr[i] = k;
        this.values[i] = v2;
        insertIntoTableKToV(i, iM107166d);
        insertIntoTableVToK(this.size, iM107166d2);
        setSucceeds(this.lastInInsertionOrder, this.size);
        setSucceeds(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    public K putInverse(V v2, K k, boolean z) {
        int iM107166d = bzk.m107166d(v2);
        int iFindEntryByValue = findEntryByValue(v2, iM107166d);
        if (iFindEntryByValue != -1) {
            K k2 = this.keys[iFindEntryByValue];
            if (k950.m148863a(k2, k)) {
                return k;
            }
            replaceKeyInEntry(iFindEntryByValue, k, z);
            return k2;
        }
        int i = this.lastInInsertionOrder;
        int iM107166d2 = bzk.m107166d(k);
        int iFindEntryByKey = findEntryByKey(k, iM107166d2);
        if (!z) {
            xn80.m212106k(iFindEntryByKey == -1, "Key already present: %s", k);
        } else if (iFindEntryByKey != -1) {
            i = this.prevInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iM107166d2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i2 = this.size;
        kArr[i2] = k;
        this.values[i2] = v2;
        insertIntoTableKToV(i2, iM107166d2);
        insertIntoTableVToK(this.size, iM107166d);
        int i3 = i == -2 ? this.firstInInsertionOrder : this.nextInInsertionOrder[i];
        setSucceeds(i, this.size);
        setSucceeds(this.size, i3);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        int iM107166d = bzk.m107166d(obj);
        int iFindEntryByKey = findEntryByKey(obj, iM107166d);
        if (iFindEntryByKey == -1) {
            return null;
        }
        V v2 = this.values[iFindEntryByKey];
        removeEntryKeyHashKnown(iFindEntryByKey, iM107166d);
        return v2;
    }

    public void removeEntryKeyHashKnown(int i, int i2) {
        removeEntry(i, i2, bzk.m107166d(this.values[i]));
    }

    public void removeEntryValueHashKnown(int i, int i2) {
        removeEntry(i, bzk.m107166d(this.keys[i]), i2);
    }

    public K removeInverse(Object obj) {
        int iM107166d = bzk.m107166d(obj);
        int iFindEntryByValue = findEntryByValue(obj, iM107166d);
        if (iFindEntryByValue == -1) {
            return null;
        }
        K k = this.keys[iFindEntryByValue];
        removeEntryValueHashKnown(iFindEntryByValue, iM107166d);
        return k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map, p153l.jx2
    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        C2795f c2795f = new C2795f();
        this.valueSet = c2795f;
        return c2795f;
    }

    public static <K, V> HashBiMap<K, V> create(int i) {
        return new HashBiMap<>(i);
    }

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    public int findEntryByKey(Object obj) {
        return findEntryByKey(obj, bzk.m107166d(obj));
    }

    public int findEntryByValue(Object obj) {
        return findEntryByValue(obj, bzk.m107166d(obj));
    }

    public void removeEntry(int i) {
        removeEntryKeyHashKnown(i, bzk.m107166d(this.keys[i]));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v2) {
        return put(k, v2, false);
    }
}
