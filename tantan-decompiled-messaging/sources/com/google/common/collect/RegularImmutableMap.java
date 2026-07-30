package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import p149l.dpj0;
import p149l.lwk;
import p149l.sd5;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    private static final byte ABSENT = -1;
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 128;
    static final ImmutableMap<Object, Object> EMPTY = new RegularImmutableMap(null, new Object[0], 0);
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 32768;
    private static final long serialVersionUID = 0;
    final transient Object[] alternatingKeysAndValues;
    private final transient Object hashTable;
    private final transient int size;

    public static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        private final transient Object[] alternatingKeysAndValues;
        private final transient int keyOffset;
        private final transient ImmutableMap<K, V> map;
        private final transient int size;

        public EntrySet(ImmutableMap<K, V> immutableMap, Object[] objArr, int i, int i2) {
            this.map = immutableMap;
            this.alternatingKeysAndValues = objArr;
            this.keyOffset = i;
            this.size = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.map.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList<Map.Entry<K, V>> createAsList() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // java.util.List
                public Map.Entry<K, V> get(int i) {
                    sf80.m183892n(i, EntrySet.this.size);
                    int i2 = i * 2;
                    Object obj = EntrySet.this.alternatingKeysAndValues[EntrySet.this.keyOffset + i2];
                    Objects.requireNonNull(obj);
                    Object obj2 = EntrySet.this.alternatingKeysAndValues[i2 + (EntrySet.this.keyOffset ^ 1)];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override // com.google.common.collect.ImmutableCollection
                public boolean isPartialView() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return EntrySet.this.size;
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public dpj0<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.size;
        }
    }

    public static final class KeySet<K> extends ImmutableSet<K> {
        private final transient ImmutableList<K> list;
        private final transient ImmutableMap<K, ?> map;

        public KeySet(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.map = immutableMap;
            this.list = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public ImmutableList<K> asList() {
            return this.list;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.map.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public dpj0<K> iterator() {
            return asList().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.map.size();
        }
    }

    public static final class KeysOrValuesAsList extends ImmutableList<Object> {
        private final transient Object[] alternatingKeysAndValues;
        private final transient int offset;
        private final transient int size;

        public KeysOrValuesAsList(Object[] objArr, int i, int i2) {
            this.alternatingKeysAndValues = objArr;
            this.offset = i;
            this.size = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            sf80.m183892n(i, this.size);
            Object obj = this.alternatingKeysAndValues[(i * 2) + this.offset];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.size;
        }
    }

    private RegularImmutableMap(Object obj, Object[] objArr, int i) {
        this.hashTable = obj;
        this.alternatingKeysAndValues = objArr;
        this.size = i;
    }

    public static <K, V> RegularImmutableMap<K, V> create(int i, Object[] objArr, ImmutableMap.C2786b<K, V> c2786b) {
        if (i == 0) {
            return (RegularImmutableMap) EMPTY;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            sd5.m183443a(obj, obj2);
            return new RegularImmutableMap<>(null, objArr, 1);
        }
        sf80.m183897s(i, objArr.length >> 1);
        Object objCreateHashTable = createHashTable(objArr, i, ImmutableSet.chooseTableSize(i), 0);
        if (objCreateHashTable instanceof Object[]) {
            Object[] objArr2 = (Object[]) objCreateHashTable;
            ImmutableMap.C2786b.a aVar = (ImmutableMap.C2786b.a) objArr2[2];
            if (c2786b == null) {
                throw aVar.m15732a();
            }
            c2786b.f10892e = aVar;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objCreateHashTable = obj3;
            i = iIntValue;
        }
        return new RegularImmutableMap<>(objCreateHashTable, objArr, i);
    }

    private static Object createHashTable(Object[] objArr, int i, int i2, int i3) {
        int i4;
        ImmutableMap.C2786b.a aVar = null;
        int i5 = 1;
        if (i == 1) {
            Object obj = objArr[i3];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i3 ^ 1];
            Objects.requireNonNull(obj2);
            sd5.m183443a(obj, obj2);
            return null;
        }
        int i6 = i2 - 1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, ABSENT);
            int i7 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = (i8 * 2) + i3;
                int i10 = (i7 * 2) + i3;
                Object obj3 = objArr[i9];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i9 ^ 1];
                Objects.requireNonNull(obj4);
                sd5.m183443a(obj3, obj4);
                int iM151973c = lwk.m151973c(obj3.hashCode());
                while (true) {
                    int i11 = iM151973c & i6;
                    int i12 = bArr[i11] & ABSENT;
                    if (i12 == 255) {
                        bArr[i11] = (byte) i10;
                        if (i7 < i8) {
                            objArr[i10] = obj3;
                            objArr[i10 ^ 1] = obj4;
                        }
                        i7++;
                        break;
                    }
                    if (obj3.equals(objArr[i12])) {
                        int i13 = i12 ^ 1;
                        Object obj5 = objArr[i13];
                        Objects.requireNonNull(obj5);
                        aVar = new ImmutableMap.C2786b.a(obj3, obj4, obj5);
                        objArr[i13] = obj4;
                        break;
                    }
                    iM151973c = i11 + 1;
                }
            }
            return i7 == i ? bArr : new Object[]{bArr, Integer.valueOf(i7), aVar};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i14 = 0;
            for (int i15 = 0; i15 < i; i15++) {
                int i16 = (i15 * 2) + i3;
                int i17 = (i14 * 2) + i3;
                Object obj6 = objArr[i16];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i16 ^ 1];
                Objects.requireNonNull(obj7);
                sd5.m183443a(obj6, obj7);
                int iM151973c2 = lwk.m151973c(obj6.hashCode());
                while (true) {
                    int i18 = iM151973c2 & i6;
                    int i19 = sArr[i18] & 65535;
                    if (i19 == 65535) {
                        sArr[i18] = (short) i17;
                        if (i14 < i15) {
                            objArr[i17] = obj6;
                            objArr[i17 ^ 1] = obj7;
                        }
                        i14++;
                        break;
                    }
                    if (obj6.equals(objArr[i19])) {
                        int i20 = i19 ^ 1;
                        Object obj8 = objArr[i20];
                        Objects.requireNonNull(obj8);
                        aVar = new ImmutableMap.C2786b.a(obj6, obj7, obj8);
                        objArr[i20] = obj7;
                        break;
                    }
                    iM151973c2 = i18 + 1;
                }
            }
            return i14 == i ? sArr : new Object[]{sArr, Integer.valueOf(i14), aVar};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i21 = 0;
        int i22 = 0;
        while (i21 < i) {
            int i23 = (i21 * 2) + i3;
            int i24 = (i22 * 2) + i3;
            Object obj9 = objArr[i23];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i23 ^ i5];
            Objects.requireNonNull(obj10);
            sd5.m183443a(obj9, obj10);
            int iM151973c3 = lwk.m151973c(obj9.hashCode());
            while (true) {
                int i25 = iM151973c3 & i6;
                int i26 = iArr[i25];
                if (i26 == -1) {
                    iArr[i25] = i24;
                    if (i22 < i21) {
                        objArr[i24] = obj9;
                        objArr[i24 ^ 1] = obj10;
                    }
                    i22++;
                    i4 = i5;
                    break;
                }
                i4 = i5;
                if (obj9.equals(objArr[i26])) {
                    int i27 = i26 ^ 1;
                    Object obj11 = objArr[i27];
                    Objects.requireNonNull(obj11);
                    aVar = new ImmutableMap.C2786b.a(obj9, obj10, obj11);
                    objArr[i27] = obj10;
                    break;
                }
                iM151973c3 = i25 + 1;
                i5 = i4;
            }
            i21++;
            i5 = i4;
        }
        int i28 = i5;
        if (i22 == i) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i28] = Integer.valueOf(i22);
        objArr2[2] = aVar;
        return objArr2;
    }

    public static Object createHashTableOrThrow(Object[] objArr, int i, int i2, int i3) {
        Object objCreateHashTable = createHashTable(objArr, i, i2, i3);
        if (objCreateHashTable instanceof Object[]) {
            throw ((ImmutableMap.C2786b.a) ((Object[]) objCreateHashTable)[2]).m15732a();
        }
        return objCreateHashTable;
    }

    public static Object get(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iM151973c = lwk.m151973c(obj2.hashCode());
            while (true) {
                int i3 = iM151973c & length;
                int i4 = bArr[i3] & ABSENT;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iM151973c = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iM151973c2 = lwk.m151973c(obj2.hashCode());
            while (true) {
                int i5 = iM151973c2 & length2;
                int i6 = sArr[i5] & 65535;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iM151973c2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iM151973c3 = lwk.m151973c(obj2.hashCode());
            while (true) {
                int i7 = iM151973c3 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iM151973c3 = i7 + 1;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new EntrySet(this, this.alternatingKeysAndValues, 0, this.size);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
        return new KeySet(this, new KeysOrValuesAsList(this.alternatingKeysAndValues, 0, this.size));
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection<V> createValues() {
        return new KeysOrValuesAsList(this.alternatingKeysAndValues, 1, this.size);
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.size;
    }

    public static <K, V> RegularImmutableMap<K, V> create(int i, Object[] objArr) {
        return create(i, objArr, null);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj) {
        V v2 = (V) get(this.hashTable, this.alternatingKeysAndValues, this.size, 0, obj);
        if (v2 == null) {
            return null;
        }
        return v2;
    }
}
