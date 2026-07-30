package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p153l.AbstractC18359l7;
import p153l.bzk;
import p153l.k350;
import p153l.k950;
import p153l.mor;
import p153l.nof0;
import p153l.se5;
import p153l.un5;
import p153l.vn5;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;
    private static final Object NOT_FOUND = new Object();
    transient int[] entries;
    private transient Set<Map.Entry<K, V>> entrySetView;
    private transient Set<K> keySetView;
    transient Object[] keys;
    private transient int metadata;
    private transient int size;
    private transient Object table;
    transient Object[] values;
    private transient Collection<V> valuesView;

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$a */
    public class C2768a extends CompactHashMap<K, V>.AbstractC2772e<K> {
        public C2768a() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.AbstractC2772e
        /* JADX INFO: renamed from: b */
        public K mo15677b(int i) {
            return (K) CompactHashMap.this.key(i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$b */
    public class C2769b extends CompactHashMap<K, V>.AbstractC2772e<Map.Entry<K, V>> {
        public C2769b() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.AbstractC2772e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo15677b(int i) {
            return new C2774g(i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$c */
    public class C2770c extends CompactHashMap<K, V>.AbstractC2772e<V> {
        public C2770c() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.AbstractC2772e
        /* JADX INFO: renamed from: b */
        public V mo15677b(int i) {
            return (V) CompactHashMap.this.value(i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$d */
    public class C2771d extends AbstractSet<Map.Entry<K, V>> {
        public C2771d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iIndexOf = CompactHashMap.this.indexOf(entry.getKey());
                if (iIndexOf != -1 && k950.m148863a(CompactHashMap.this.value(iIndexOf), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return CompactHashMap.this.entrySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iHashTableMask;
            int iM201920f;
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (CompactHashMap.this.needsAllocArrays() || (iM201920f = vn5.m201920f(entry.getKey(), entry.getValue(), (iHashTableMask = CompactHashMap.this.hashTableMask()), CompactHashMap.this.requireTable(), CompactHashMap.this.requireEntries(), CompactHashMap.this.requireKeys(), CompactHashMap.this.requireValues())) == -1) {
                return false;
            }
            CompactHashMap.this.moveLastEntry(iM201920f, iHashTableMask);
            CompactHashMap.access$1210(CompactHashMap.this);
            CompactHashMap.this.incrementModCount();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$f */
    public class C2773f extends AbstractSet<K> {
        public C2773f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return CompactHashMap.this.keySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.keySet().remove(obj);
            }
            return CompactHashMap.this.removeHelper(obj) != CompactHashMap.NOT_FOUND;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$g */
    public final class C2774g extends AbstractC18359l7<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f10875a;

        /* JADX INFO: renamed from: b */
        public int f10876b;

        public C2774g(int i) {
            this.f10875a = (K) CompactHashMap.this.key(i);
            this.f10876b = i;
        }

        /* JADX INFO: renamed from: a */
        public final void m15681a() {
            int i = this.f10876b;
            if (i == -1 || i >= CompactHashMap.this.size() || !k950.m148863a(this.f10875a, CompactHashMap.this.key(this.f10876b))) {
                this.f10876b = CompactHashMap.this.indexOf(this.f10875a);
            }
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public K getKey() {
            return this.f10875a;
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public V getValue() {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return (V) k350.m147997a(mapDelegateOrNull.get(this.f10875a));
            }
            m15681a();
            int i = this.f10876b;
            return i == -1 ? (V) k350.m147998b() : (V) CompactHashMap.this.value(i);
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public V setValue(V v2) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return (V) k350.m147997a(mapDelegateOrNull.put(this.f10875a, v2));
            }
            m15681a();
            int i = this.f10876b;
            CompactHashMap compactHashMap = CompactHashMap.this;
            if (i == -1) {
                compactHashMap.put(this.f10875a, v2);
                return (V) k350.m147998b();
            }
            V v3 = (V) compactHashMap.value(i);
            CompactHashMap.this.setValue(this.f10876b, v2);
            return v3;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$h */
    public class C2775h extends AbstractCollection<V> {
        public C2775h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return CompactHashMap.this.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public CompactHashMap() {
        init(3);
    }

    public static /* synthetic */ int access$1210(CompactHashMap compactHashMap) {
        int i = compactHashMap.size;
        compactHashMap.size = i - 1;
        return i;
    }

    public static <K, V> CompactHashMap<K, V> create() {
        return new CompactHashMap<>();
    }

    public static <K, V> CompactHashMap<K, V> createWithExpectedSize(int i) {
        return new CompactHashMap<>(i);
    }

    private int entry(int i) {
        return requireEntries()[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int indexOf(Object obj) {
        if (needsAllocArrays()) {
            return -1;
        }
        int iM107166d = bzk.m107166d(obj);
        int iHashTableMask = hashTableMask();
        int iM201922h = vn5.m201922h(requireTable(), iM107166d & iHashTableMask);
        if (iM201922h == 0) {
            return -1;
        }
        int iM201916b = vn5.m201916b(iM107166d, iHashTableMask);
        do {
            int i = iM201922h - 1;
            int iEntry = entry(i);
            if (vn5.m201916b(iEntry, iHashTableMask) == iM201916b && k950.m148863a(obj, key(i))) {
                return i;
            }
            iM201922h = vn5.m201917c(iEntry, iHashTableMask);
        } while (iM201922h != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K key(int i) {
        return (K) requireKeys()[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            un5.m196828a(25, "Invalid size: ", i);
            return;
        }
        init(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object removeHelper(Object obj) {
        if (needsAllocArrays()) {
            return NOT_FOUND;
        }
        int iHashTableMask = hashTableMask();
        int iM201920f = vn5.m201920f(obj, null, iHashTableMask, requireTable(), requireEntries(), requireKeys(), null);
        if (iM201920f == -1) {
            return NOT_FOUND;
        }
        V vValue = value(iM201920f);
        moveLastEntry(iM201920f, iHashTableMask);
        this.size--;
        incrementModCount();
        return vValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] requireEntries() {
        int[] iArr = this.entries;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] requireKeys() {
        Object[] objArr = this.keys;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object requireTable() {
        Object obj = this.table;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] requireValues() {
        Object[] objArr = this.values;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void resizeMeMaybe(int i) {
        int iMin;
        int length = requireEntries().length;
        if (i <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        resizeEntries(iMin);
    }

    private int resizeTable(int i, int i2, int i3, int i4) {
        Object objM201915a = vn5.m201915a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            vn5.m201923i(objM201915a, i3 & i5, i4 + 1);
        }
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM201922h = vn5.m201922h(objRequireTable, i6);
            while (iM201922h != 0) {
                int i7 = iM201922h - 1;
                int i8 = iArrRequireEntries[i7];
                int iM201916b = vn5.m201916b(i8, i) | i6;
                int i9 = iM201916b & i5;
                int iM201922h2 = vn5.m201922h(objM201915a, i9);
                vn5.m201923i(objM201915a, i9, iM201922h);
                iArrRequireEntries[i7] = vn5.m201918d(iM201916b, iM201922h2, i5);
                iM201922h = vn5.m201917c(i8, i);
            }
        }
        this.table = objM201915a;
        setHashTableMask(i5);
        return i5;
    }

    private void setEntry(int i, int i2) {
        requireEntries()[i] = i2;
    }

    private void setHashTableMask(int i) {
        this.metadata = vn5.m201918d(this.metadata, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void setKey(int i, K k) {
        requireKeys()[i] = k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i, V v2) {
        requireValues()[i] = v2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V value(int i) {
        return (V) requireValues()[i];
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> itEntrySetIterator = entrySetIterator();
        while (itEntrySetIterator.hasNext()) {
            Map.Entry<K, V> next = itEntrySetIterator.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public void accessEntry(int i) {
    }

    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    public int allocArrays() {
        xn80.m212118w(needsAllocArrays(), "Arrays already allocated");
        int i = this.metadata;
        int iM201924j = vn5.m201924j(i);
        this.table = vn5.m201915a(iM201924j);
        setHashTableMask(iM201924j - 1);
        this.entries = new int[i];
        this.keys = new Object[i];
        this.values = new Object[i];
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            this.metadata = Ints.m16516f(size(), 3, 1073741823);
            mapDelegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        Arrays.fill(requireKeys(), 0, this.size, (Object) null);
        Arrays.fill(requireValues(), 0, this.size, (Object) null);
        vn5.m201921g(requireTable());
        Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.containsKey(obj);
        }
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.containsValue(obj);
        }
        for (int i = 0; i < this.size; i++) {
            if (k950.m148863a(obj, value(i))) {
                return true;
            }
        }
        return false;
    }

    public Map<K, V> convertToHashFloodingResistantImplementation() {
        Map<K, V> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int iFirstEntryIndex = firstEntryIndex();
        while (iFirstEntryIndex >= 0) {
            mapCreateHashFloodingResistantDelegate.put(key(iFirstEntryIndex), value(iFirstEntryIndex));
            iFirstEntryIndex = getSuccessor(iFirstEntryIndex);
        }
        this.table = mapCreateHashFloodingResistantDelegate;
        this.entries = null;
        this.keys = null;
        this.values = null;
        incrementModCount();
        return mapCreateHashFloodingResistantDelegate;
    }

    public Set<Map.Entry<K, V>> createEntrySet() {
        return new C2771d();
    }

    public Map<K, V> createHashFloodingResistantDelegate(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public Set<K> createKeySet() {
        return new C2773f();
    }

    public Collection<V> createValues() {
        return new C2775h();
    }

    public Map<K, V> delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySetView;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setCreateEntrySet = createEntrySet();
        this.entrySetView = setCreateEntrySet;
        return setCreateEntrySet;
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.entrySet().iterator() : new C2769b();
    }

    public int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.get(obj);
        }
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return null;
        }
        accessEntry(iIndexOf);
        return value(iIndexOf);
    }

    public int getSuccessor(int i) {
        int i2 = i + 1;
        if (i2 < this.size) {
            return i2;
        }
        return -1;
    }

    public void incrementModCount() {
        this.metadata += 32;
    }

    public void init(int i) {
        xn80.m212100e(i >= 0, "Expected size must be >= 0");
        this.metadata = Ints.m16516f(i, 1, 1073741823);
    }

    public void insertEntry(int i, K k, V v2, int i2, int i3) {
        setEntry(i, vn5.m201918d(i2, 0, i3));
        setKey(i, k);
        setValue(i, v2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySetView;
        if (set != null) {
            return set;
        }
        Set<K> setCreateKeySet = createKeySet();
        this.keySetView = setCreateKeySet;
        return setCreateKeySet;
    }

    public Iterator<K> keySetIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.keySet().iterator() : new C2768a();
    }

    public void moveLastEntry(int i, int i2) {
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireKeys = requireKeys();
        Object[] objArrRequireValues = requireValues();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrRequireKeys[i] = null;
            objArrRequireValues[i] = null;
            iArrRequireEntries[i] = 0;
            return;
        }
        Object obj = objArrRequireKeys[i3];
        objArrRequireKeys[i] = obj;
        objArrRequireValues[i] = objArrRequireValues[i3];
        objArrRequireKeys[i3] = null;
        objArrRequireValues[i3] = null;
        iArrRequireEntries[i] = iArrRequireEntries[i3];
        iArrRequireEntries[i3] = 0;
        int iM107166d = bzk.m107166d(obj) & i2;
        int iM201922h = vn5.m201922h(objRequireTable, iM107166d);
        if (iM201922h == size) {
            vn5.m201923i(objRequireTable, iM107166d, i + 1);
            return;
        }
        while (true) {
            int i4 = iM201922h - 1;
            int i5 = iArrRequireEntries[i4];
            int iM201917c = vn5.m201917c(i5, i2);
            if (iM201917c == size) {
                iArrRequireEntries[i4] = vn5.m201918d(i5, i + 1, i2);
                return;
            }
            iM201922h = iM201917c;
        }
    }

    public boolean needsAllocArrays() {
        return this.table == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v2) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.put(k, v2);
        }
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireKeys = requireKeys();
        Object[] objArrRequireValues = requireValues();
        int i = this.size;
        int i2 = i + 1;
        int iM107166d = bzk.m107166d(k);
        int iHashTableMask = hashTableMask();
        int i3 = iM107166d & iHashTableMask;
        int iM201922h = vn5.m201922h(requireTable(), i3);
        if (iM201922h != 0) {
            int iM201916b = vn5.m201916b(iM107166d, iHashTableMask);
            int i4 = 0;
            while (true) {
                int i5 = iM201922h - 1;
                int i6 = iArrRequireEntries[i5];
                if (vn5.m201916b(i6, iHashTableMask) == iM201916b && k950.m148863a(k, objArrRequireKeys[i5])) {
                    V v3 = (V) objArrRequireValues[i5];
                    objArrRequireValues[i5] = v2;
                    accessEntry(i5);
                    return v3;
                }
                int iM201917c = vn5.m201917c(i6, iHashTableMask);
                i4++;
                if (iM201917c == 0) {
                    if (i4 < 9) {
                        if (i2 <= iHashTableMask) {
                            iArrRequireEntries[i5] = vn5.m201918d(i6, i2, iHashTableMask);
                            break;
                        }
                        iHashTableMask = resizeTable(iHashTableMask, vn5.m201919e(iHashTableMask), iM107166d, i);
                        break;
                    }
                    return convertToHashFloodingResistantImplementation().put(k, v2);
                }
                iM201922h = iM201917c;
            }
        } else if (i2 > iHashTableMask) {
            iHashTableMask = resizeTable(iHashTableMask, vn5.m201919e(iHashTableMask), iM107166d, i);
        } else {
            vn5.m201923i(requireTable(), i3, i2);
        }
        int i7 = iHashTableMask;
        resizeMeMaybe(i2);
        insertEntry(i, k, v2, iM107166d, i7);
        this.size = i2;
        incrementModCount();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.remove(obj);
        }
        V v2 = (V) removeHelper(obj);
        if (v2 == NOT_FOUND) {
            return null;
        }
        return v2;
    }

    public void resizeEntries(int i) {
        this.entries = Arrays.copyOf(requireEntries(), i);
        this.keys = Arrays.copyOf(requireKeys(), i);
        this.values = Arrays.copyOf(requireValues(), i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.size() : this.size;
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            Map<K, V> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            mapCreateHashFloodingResistantDelegate.putAll(mapDelegateOrNull);
            this.table = mapCreateHashFloodingResistantDelegate;
            return;
        }
        int i = this.size;
        if (i < requireEntries().length) {
            resizeEntries(i);
        }
        int iM201924j = vn5.m201924j(i);
        int iHashTableMask = hashTableMask();
        if (iM201924j < iHashTableMask) {
            resizeTable(iHashTableMask, iM201924j, 0, 0);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.valuesView;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.valuesView = collectionCreateValues;
        return collectionCreateValues;
    }

    public Iterator<V> valuesIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.values().iterator() : new C2770c();
    }

    public CompactHashMap(int i) {
        init(i);
    }

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$e */
    public abstract class AbstractC2772e<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public int f10870a;

        /* JADX INFO: renamed from: b */
        public int f10871b;

        /* JADX INFO: renamed from: c */
        public int f10872c;

        public AbstractC2772e() {
            this.f10870a = CompactHashMap.this.metadata;
            this.f10871b = CompactHashMap.this.firstEntryIndex();
            this.f10872c = -1;
        }

        /* JADX INFO: renamed from: a */
        public final void m15679a() {
            if (CompactHashMap.this.metadata == this.f10870a) {
                return;
            }
            nof0.m164126a();
        }

        /* JADX INFO: renamed from: b */
        public abstract T mo15677b(int i);

        /* JADX INFO: renamed from: c */
        public void m15680c() {
            this.f10870a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10871b >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            m15679a();
            if (!hasNext()) {
                mor.m159308a();
                return null;
            }
            int i = this.f10871b;
            this.f10872c = i;
            T tMo15677b = mo15677b(i);
            this.f10871b = CompactHashMap.this.getSuccessor(this.f10871b);
            return tMo15677b;
        }

        @Override // java.util.Iterator
        public void remove() {
            m15679a();
            se5.m185519e(this.f10872c >= 0);
            m15680c();
            CompactHashMap compactHashMap = CompactHashMap.this;
            compactHashMap.remove(compactHashMap.key(this.f10872c));
            this.f10871b = CompactHashMap.this.adjustAfterRemove(this.f10871b, this.f10872c);
            this.f10872c = -1;
        }

        public /* synthetic */ AbstractC2772e(CompactHashMap compactHashMap, C2768a c2768a) {
            this();
        }
    }
}
