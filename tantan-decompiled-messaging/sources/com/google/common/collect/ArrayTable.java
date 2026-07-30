package com.google.common.collect;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p149l.AbstractC18630n7;
import p149l.AbstractC19437q7;
import p149l.sf80;
import p149l.v050;

/* JADX INFO: loaded from: classes7.dex */
public final class ArrayTable<R, C, V> extends AbstractC2966e<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    private final V[][] array;
    private final ImmutableMap<C, Integer> columnKeyToIndex;
    private final ImmutableList<C> columnList;
    private transient ArrayTable<R, C, V>.C2742f columnMap;
    private final ImmutableMap<R, Integer> rowKeyToIndex;
    private final ImmutableList<R> rowList;
    private transient ArrayTable<R, C, V>.C2744h rowMap;

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$a */
    public class C2737a extends AbstractC18630n7<InterfaceC2979r.a<R, C, V>> {
        public C2737a(int i) {
            super(i);
        }

        @Override // p149l.AbstractC18630n7
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC2979r.a<R, C, V> mo15608a(int i) {
            return ArrayTable.this.getCell(i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$b */
    public class C2738b extends Tables.AbstractC2946b<R, C, V> {

        /* JADX INFO: renamed from: a */
        public final int f10814a;

        /* JADX INFO: renamed from: b */
        public final int f10815b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f10816c;

        public C2738b(int i) {
            this.f10816c = i;
            this.f10814a = i / ArrayTable.this.columnList.size();
            this.f10815b = i % ArrayTable.this.columnList.size();
        }

        @Override // com.google.common.collect.InterfaceC2979r.a
        public C getColumnKey() {
            return (C) ArrayTable.this.columnList.get(this.f10815b);
        }

        @Override // com.google.common.collect.InterfaceC2979r.a
        public R getRowKey() {
            return (R) ArrayTable.this.rowList.get(this.f10814a);
        }

        @Override // com.google.common.collect.InterfaceC2979r.a
        public V getValue() {
            return (V) ArrayTable.this.m15607at(this.f10814a, this.f10815b);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$c */
    public class C2739c extends AbstractC18630n7<V> {
        public C2739c(int i) {
            super(i);
        }

        @Override // p149l.AbstractC18630n7
        /* JADX INFO: renamed from: a */
        public V mo15608a(int i) {
            return (V) ArrayTable.this.getValue(i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$e */
    public class C2741e extends AbstractC2740d<R, V> {

        /* JADX INFO: renamed from: b */
        public final int f10823b;

        public C2741e(int i) {
            super(ArrayTable.this.rowKeyToIndex, null);
            this.f10823b = i;
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2740d
        /* JADX INFO: renamed from: d */
        public String mo15613d() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2740d
        /* JADX INFO: renamed from: e */
        public V mo15614e(int i) {
            return (V) ArrayTable.this.m15607at(i, this.f10823b);
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2740d
        /* JADX INFO: renamed from: f */
        public V mo15615f(int i, V v2) {
            return (V) ArrayTable.this.set(i, this.f10823b, v2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$g */
    public class C2743g extends AbstractC2740d<C, V> {

        /* JADX INFO: renamed from: b */
        public final int f10826b;

        public C2743g(int i) {
            super(ArrayTable.this.columnKeyToIndex, null);
            this.f10826b = i;
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2740d
        /* JADX INFO: renamed from: d */
        public String mo15613d() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2740d
        /* JADX INFO: renamed from: e */
        public V mo15614e(int i) {
            return (V) ArrayTable.this.m15607at(this.f10826b, i);
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2740d
        /* JADX INFO: renamed from: f */
        public V mo15615f(int i, V v2) {
            return (V) ArrayTable.this.set(this.f10826b, i, v2);
        }
    }

    private ArrayTable(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        ImmutableList<R> immutableListCopyOf = ImmutableList.copyOf(iterable);
        this.rowList = immutableListCopyOf;
        ImmutableList<C> immutableListCopyOf2 = ImmutableList.copyOf(iterable2);
        this.columnList = immutableListCopyOf2;
        sf80.m183882d(immutableListCopyOf.isEmpty() == immutableListCopyOf2.isEmpty());
        this.rowKeyToIndex = Maps.m16036k(immutableListCopyOf);
        this.columnKeyToIndex = Maps.m16036k(immutableListCopyOf2);
        this.array = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableListCopyOf.size(), immutableListCopyOf2.size()));
        eraseAll();
    }

    public static <R, C, V> ArrayTable<R, C, V> create(InterfaceC2979r<R, C, ? extends V> interfaceC2979r) {
        return interfaceC2979r instanceof ArrayTable ? new ArrayTable<>((ArrayTable) interfaceC2979r) : new ArrayTable<>(interfaceC2979r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC2979r.a<R, C, V> getCell(int i) {
        return new C2738b(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V getValue(int i) {
        return m15607at(i / this.columnList.size(), i % this.columnList.size());
    }

    /* JADX INFO: renamed from: at */
    public V m15607at(int i, int i2) {
        sf80.m183892n(i, this.rowList.size());
        sf80.m183892n(i2, this.columnList.size());
        return this.array[i][i2];
    }

    @Override // com.google.common.collect.AbstractC2966e
    public Iterator<InterfaceC2979r.a<R, C, V>> cellIterator() {
        return new C2737a(size());
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public Set<InterfaceC2979r.a<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public Map<R, V> column(C c) {
        sf80.m183894p(c);
        Integer num = this.columnKeyToIndex.get(c);
        return num == null ? Collections.EMPTY_MAP : new C2741e(num.intValue());
    }

    public ImmutableList<C> columnKeyList() {
        return this.columnList;
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public ImmutableSet<C> columnKeySet() {
        return this.columnKeyToIndex.keySet();
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public Map<C, Map<R, V>> columnMap() {
        ArrayTable<R, C, V>.C2742f c2742f = this.columnMap;
        if (c2742f != null) {
            return c2742f;
        }
        ArrayTable<R, C, V>.C2742f c2742f2 = new C2742f(this, null);
        this.columnMap = c2742f2;
        return c2742f2;
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public boolean contains(Object obj, Object obj2) {
        return containsRow(obj) && containsColumn(obj2);
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public boolean containsColumn(Object obj) {
        return this.columnKeyToIndex.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public boolean containsRow(Object obj) {
        return this.rowKeyToIndex.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public boolean containsValue(Object obj) {
        for (V[] vArr : this.array) {
            for (V v2 : vArr) {
                if (v050.m196470a(obj, v2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public V erase(Object obj, Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return set(num.intValue(), num2.intValue(), null);
    }

    public void eraseAll() {
        for (V[] vArr : this.array) {
            Arrays.fill(vArr, (Object) null);
        }
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public V get(Object obj, Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return m15607at(num.intValue(), num2.intValue());
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public boolean isEmpty() {
        return this.rowList.isEmpty() || this.columnList.isEmpty();
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public V put(R r, C c, V v2) {
        sf80.m183894p(r);
        sf80.m183894p(c);
        Integer num = this.rowKeyToIndex.get(r);
        sf80.m183890l(num != null, "Row %s not in %s", r, this.rowList);
        Integer num2 = this.columnKeyToIndex.get(c);
        sf80.m183890l(num2 != null, "Column %s not in %s", c, this.columnList);
        return set(num.intValue(), num2.intValue(), v2);
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public void putAll(InterfaceC2979r<? extends R, ? extends C, ? extends V> interfaceC2979r) {
        super.putAll(interfaceC2979r);
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    @Deprecated
    public V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public Map<C, V> row(R r) {
        sf80.m183894p(r);
        Integer num = this.rowKeyToIndex.get(r);
        return num == null ? Collections.EMPTY_MAP : new C2743g(num.intValue());
    }

    public ImmutableList<R> rowKeyList() {
        return this.rowList;
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public ImmutableSet<R> rowKeySet() {
        return this.rowKeyToIndex.keySet();
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public Map<R, Map<C, V>> rowMap() {
        ArrayTable<R, C, V>.C2744h c2744h = this.rowMap;
        if (c2744h != null) {
            return c2744h;
        }
        ArrayTable<R, C, V>.C2744h c2744h2 = new C2744h(this, null);
        this.rowMap = c2744h2;
        return c2744h2;
    }

    public V set(int i, int i2, V v2) {
        sf80.m183892n(i, this.rowList.size());
        sf80.m183892n(i2, this.columnList.size());
        V[] vArr = this.array[i];
        V v3 = vArr[i2];
        vArr[i2] = v2;
        return v3;
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public int size() {
        return this.rowList.size() * this.columnList.size();
    }

    public V[][] toArray(Class<V> cls) {
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) cls, this.rowList.size(), this.columnList.size()));
        for (int i = 0; i < this.rowList.size(); i++) {
            V[] vArr2 = this.array[i];
            System.arraycopy(vArr2, 0, vArr[i], 0, vArr2.length);
        }
        return vArr;
    }

    @Override // com.google.common.collect.AbstractC2966e
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractC2966e
    public Iterator<V> valuesIterator() {
        return new C2739c(size());
    }

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$d */
    public static abstract class AbstractC2740d<K, V> extends Maps.AbstractC2877l<K, V> {

        /* JADX INFO: renamed from: a */
        public final ImmutableMap<K, Integer> f10819a;

        /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$d$a */
        public class a extends AbstractC19437q7<K, V> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f10820a;

            public a(int i) {
                this.f10820a = i;
            }

            @Override // p149l.AbstractC19437q7, java.util.Map.Entry
            public K getKey() {
                return (K) AbstractC2740d.this.m15612c(this.f10820a);
            }

            @Override // p149l.AbstractC19437q7, java.util.Map.Entry
            public V getValue() {
                return (V) AbstractC2740d.this.mo15614e(this.f10820a);
            }

            @Override // p149l.AbstractC19437q7, java.util.Map.Entry
            public V setValue(V v2) {
                return (V) AbstractC2740d.this.mo15615f(this.f10820a, v2);
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$d$b */
        public class b extends AbstractC18630n7<Map.Entry<K, V>> {
            public b(int i) {
                super(i);
            }

            @Override // p149l.AbstractC18630n7
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> mo15608a(int i) {
                return AbstractC2740d.this.m15611b(i);
            }
        }

        public AbstractC2740d(ImmutableMap<K, Integer> immutableMap) {
            this.f10819a = immutableMap;
        }

        @Override // com.google.common.collect.Maps.AbstractC2877l
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<K, V>> mo15610a() {
            return new b(size());
        }

        /* JADX INFO: renamed from: b */
        public Map.Entry<K, V> m15611b(int i) {
            sf80.m183892n(i, size());
            return new a(i);
        }

        /* JADX INFO: renamed from: c */
        public K m15612c(int i) {
            return this.f10819a.keySet().asList().get(i);
        }

        @Override // com.google.common.collect.Maps.AbstractC2877l, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f10819a.containsKey(obj);
        }

        /* JADX INFO: renamed from: d */
        public abstract String mo15613d();

        /* JADX INFO: renamed from: e */
        public abstract V mo15614e(int i);

        /* JADX INFO: renamed from: f */
        public abstract V mo15615f(int i, V v2);

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            Integer num = this.f10819a.get(obj);
            if (num == null) {
                return null;
            }
            return mo15614e(num.intValue());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f10819a.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f10819a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v2) {
            Integer num = this.f10819a.get(k);
            if (num != null) {
                return mo15615f(num.intValue(), v2);
            }
            String strMo15613d = mo15613d();
            String strValueOf = String.valueOf(k);
            String strValueOf2 = String.valueOf(this.f10819a.keySet());
            StringBuilder sb = new StringBuilder(String.valueOf(strMo15613d).length() + 9 + strValueOf.length() + strValueOf2.length());
            sb.append(strMo15613d);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(strValueOf);
            sb.append(" not in ");
            sb.append(strValueOf2);
            throw new IllegalArgumentException(sb.toString());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f10819a.size();
        }

        public /* synthetic */ AbstractC2740d(ImmutableMap immutableMap, C2737a c2737a) {
            this(immutableMap);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$f */
    public class C2742f extends AbstractC2740d<C, Map<R, V>> {
        public C2742f() {
            super(ArrayTable.this.columnKeyToIndex, null);
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2740d
        /* JADX INFO: renamed from: d */
        public String mo15613d() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2740d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map<R, V> mo15614e(int i) {
            return new C2741e(i);
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2740d, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Map<R, V> put(C c, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2740d
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Map<R, V> mo15615f(int i, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ C2742f(ArrayTable arrayTable, C2737a c2737a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$h */
    public class C2744h extends AbstractC2740d<R, Map<C, V>> {
        public C2744h() {
            super(ArrayTable.this.rowKeyToIndex, null);
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2740d
        /* JADX INFO: renamed from: d */
        public String mo15613d() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2740d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map<C, V> mo15614e(int i) {
            return new C2743g(i);
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2740d, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Map<C, V> put(R r, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2740d
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Map<C, V> mo15615f(int i, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ C2744h(ArrayTable arrayTable, C2737a c2737a) {
            this();
        }
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        return new ArrayTable<>(iterable, iterable2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ArrayTable(InterfaceC2979r<R, C, ? extends V> interfaceC2979r) {
        this(interfaceC2979r.rowKeySet(), interfaceC2979r.columnKeySet());
        putAll(interfaceC2979r);
    }

    private ArrayTable(ArrayTable<R, C, V> arrayTable) {
        ImmutableList<R> immutableList = arrayTable.rowList;
        this.rowList = immutableList;
        ImmutableList<C> immutableList2 = arrayTable.columnList;
        this.columnList = immutableList2;
        this.rowKeyToIndex = arrayTable.rowKeyToIndex;
        this.columnKeyToIndex = arrayTable.columnKeyToIndex;
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableList.size(), immutableList2.size()));
        this.array = vArr;
        for (int i = 0; i < this.rowList.size(); i++) {
            V[] vArr2 = arrayTable.array[i];
            System.arraycopy(vArr2, 0, vArr[i], 0, vArr2.length);
        }
    }
}
