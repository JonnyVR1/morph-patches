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
import p153l.AbstractC17659i7;
import p153l.AbstractC18359l7;
import p153l.k950;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class ArrayTable<R, C, V> extends AbstractC2989e<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    private final V[][] array;
    private final ImmutableMap<C, Integer> columnKeyToIndex;
    private final ImmutableList<C> columnList;
    private transient ArrayTable<R, C, V>.C2765f columnMap;
    private final ImmutableMap<R, Integer> rowKeyToIndex;
    private final ImmutableList<R> rowList;
    private transient ArrayTable<R, C, V>.C2767h rowMap;

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$a */
    public class C2760a extends AbstractC17659i7<InterfaceC3002r.a<R, C, V>> {
        public C2760a(int i) {
            super(i);
        }

        @Override // p153l.AbstractC17659i7
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC3002r.a<R, C, V> mo15662a(int i) {
            return ArrayTable.this.getCell(i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$b */
    public class C2761b extends Tables.AbstractC2969b<R, C, V> {

        /* JADX INFO: renamed from: a */
        public final int f10851a;

        /* JADX INFO: renamed from: b */
        public final int f10852b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f10853c;

        public C2761b(int i) {
            this.f10853c = i;
            this.f10851a = i / ArrayTable.this.columnList.size();
            this.f10852b = i % ArrayTable.this.columnList.size();
        }

        @Override // com.google.common.collect.InterfaceC3002r.a
        public C getColumnKey() {
            return (C) ArrayTable.this.columnList.get(this.f10852b);
        }

        @Override // com.google.common.collect.InterfaceC3002r.a
        public R getRowKey() {
            return (R) ArrayTable.this.rowList.get(this.f10851a);
        }

        @Override // com.google.common.collect.InterfaceC3002r.a
        public V getValue() {
            return (V) ArrayTable.this.m15661at(this.f10851a, this.f10852b);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$c */
    public class C2762c extends AbstractC17659i7<V> {
        public C2762c(int i) {
            super(i);
        }

        @Override // p153l.AbstractC17659i7
        /* JADX INFO: renamed from: a */
        public V mo15662a(int i) {
            return (V) ArrayTable.this.getValue(i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$e */
    public class C2764e extends AbstractC2763d<R, V> {

        /* JADX INFO: renamed from: b */
        public final int f10860b;

        public C2764e(int i) {
            super(ArrayTable.this.rowKeyToIndex, null);
            this.f10860b = i;
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2763d
        /* JADX INFO: renamed from: d */
        public String mo15667d() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2763d
        /* JADX INFO: renamed from: e */
        public V mo15668e(int i) {
            return (V) ArrayTable.this.m15661at(i, this.f10860b);
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2763d
        /* JADX INFO: renamed from: f */
        public V mo15669f(int i, V v2) {
            return (V) ArrayTable.this.set(i, this.f10860b, v2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$g */
    public class C2766g extends AbstractC2763d<C, V> {

        /* JADX INFO: renamed from: b */
        public final int f10863b;

        public C2766g(int i) {
            super(ArrayTable.this.columnKeyToIndex, null);
            this.f10863b = i;
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2763d
        /* JADX INFO: renamed from: d */
        public String mo15667d() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2763d
        /* JADX INFO: renamed from: e */
        public V mo15668e(int i) {
            return (V) ArrayTable.this.m15661at(this.f10863b, i);
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2763d
        /* JADX INFO: renamed from: f */
        public V mo15669f(int i, V v2) {
            return (V) ArrayTable.this.set(this.f10863b, i, v2);
        }
    }

    private ArrayTable(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        ImmutableList<R> immutableListCopyOf = ImmutableList.copyOf(iterable);
        this.rowList = immutableListCopyOf;
        ImmutableList<C> immutableListCopyOf2 = ImmutableList.copyOf(iterable2);
        this.columnList = immutableListCopyOf2;
        xn80.m212099d(immutableListCopyOf.isEmpty() == immutableListCopyOf2.isEmpty());
        this.rowKeyToIndex = Maps.m16090k(immutableListCopyOf);
        this.columnKeyToIndex = Maps.m16090k(immutableListCopyOf2);
        this.array = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableListCopyOf.size(), immutableListCopyOf2.size()));
        eraseAll();
    }

    public static <R, C, V> ArrayTable<R, C, V> create(InterfaceC3002r<R, C, ? extends V> interfaceC3002r) {
        return interfaceC3002r instanceof ArrayTable ? new ArrayTable<>((ArrayTable) interfaceC3002r) : new ArrayTable<>(interfaceC3002r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC3002r.a<R, C, V> getCell(int i) {
        return new C2761b(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V getValue(int i) {
        return m15661at(i / this.columnList.size(), i % this.columnList.size());
    }

    /* JADX INFO: renamed from: at */
    public V m15661at(int i, int i2) {
        xn80.m212109n(i, this.rowList.size());
        xn80.m212109n(i2, this.columnList.size());
        return this.array[i][i2];
    }

    @Override // com.google.common.collect.AbstractC2989e
    public Iterator<InterfaceC3002r.a<R, C, V>> cellIterator() {
        return new C2760a(size());
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public Set<InterfaceC3002r.a<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public Map<R, V> column(C c) {
        xn80.m212111p(c);
        Integer num = this.columnKeyToIndex.get(c);
        return num == null ? Collections.EMPTY_MAP : new C2764e(num.intValue());
    }

    public ImmutableList<C> columnKeyList() {
        return this.columnList;
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public ImmutableSet<C> columnKeySet() {
        return this.columnKeyToIndex.keySet();
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public Map<C, Map<R, V>> columnMap() {
        ArrayTable<R, C, V>.C2765f c2765f = this.columnMap;
        if (c2765f != null) {
            return c2765f;
        }
        ArrayTable<R, C, V>.C2765f c2765f2 = new C2765f(this, null);
        this.columnMap = c2765f2;
        return c2765f2;
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public boolean contains(Object obj, Object obj2) {
        return containsRow(obj) && containsColumn(obj2);
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public boolean containsColumn(Object obj) {
        return this.columnKeyToIndex.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public boolean containsRow(Object obj) {
        return this.rowKeyToIndex.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public boolean containsValue(Object obj) {
        for (V[] vArr : this.array) {
            for (V v2 : vArr) {
                if (k950.m148863a(obj, v2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
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

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public V get(Object obj, Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return m15661at(num.intValue(), num2.intValue());
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public boolean isEmpty() {
        return this.rowList.isEmpty() || this.columnList.isEmpty();
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public V put(R r, C c, V v2) {
        xn80.m212111p(r);
        xn80.m212111p(c);
        Integer num = this.rowKeyToIndex.get(r);
        xn80.m212107l(num != null, "Row %s not in %s", r, this.rowList);
        Integer num2 = this.columnKeyToIndex.get(c);
        xn80.m212107l(num2 != null, "Column %s not in %s", c, this.columnList);
        return set(num.intValue(), num2.intValue(), v2);
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public void putAll(InterfaceC3002r<? extends R, ? extends C, ? extends V> interfaceC3002r) {
        super.putAll(interfaceC3002r);
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    @Deprecated
    public V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public Map<C, V> row(R r) {
        xn80.m212111p(r);
        Integer num = this.rowKeyToIndex.get(r);
        return num == null ? Collections.EMPTY_MAP : new C2766g(num.intValue());
    }

    public ImmutableList<R> rowKeyList() {
        return this.rowList;
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public ImmutableSet<R> rowKeySet() {
        return this.rowKeyToIndex.keySet();
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public Map<R, Map<C, V>> rowMap() {
        ArrayTable<R, C, V>.C2767h c2767h = this.rowMap;
        if (c2767h != null) {
            return c2767h;
        }
        ArrayTable<R, C, V>.C2767h c2767h2 = new C2767h(this, null);
        this.rowMap = c2767h2;
        return c2767h2;
    }

    public V set(int i, int i2, V v2) {
        xn80.m212109n(i, this.rowList.size());
        xn80.m212109n(i2, this.columnList.size());
        V[] vArr = this.array[i];
        V v3 = vArr[i2];
        vArr[i2] = v2;
        return v3;
    }

    @Override // com.google.common.collect.InterfaceC3002r
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

    @Override // com.google.common.collect.AbstractC2989e
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractC2989e
    public Iterator<V> valuesIterator() {
        return new C2762c(size());
    }

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$d */
    public static abstract class AbstractC2763d<K, V> extends Maps.AbstractC2900l<K, V> {

        /* JADX INFO: renamed from: a */
        public final ImmutableMap<K, Integer> f10856a;

        /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$d$a */
        public class a extends AbstractC18359l7<K, V> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f10857a;

            public a(int i) {
                this.f10857a = i;
            }

            @Override // p153l.AbstractC18359l7, java.util.Map.Entry
            public K getKey() {
                return (K) AbstractC2763d.this.m15666c(this.f10857a);
            }

            @Override // p153l.AbstractC18359l7, java.util.Map.Entry
            public V getValue() {
                return (V) AbstractC2763d.this.mo15668e(this.f10857a);
            }

            @Override // p153l.AbstractC18359l7, java.util.Map.Entry
            public V setValue(V v2) {
                return (V) AbstractC2763d.this.mo15669f(this.f10857a, v2);
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$d$b */
        public class b extends AbstractC17659i7<Map.Entry<K, V>> {
            public b(int i) {
                super(i);
            }

            @Override // p153l.AbstractC17659i7
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> mo15662a(int i) {
                return AbstractC2763d.this.m15665b(i);
            }
        }

        public AbstractC2763d(ImmutableMap<K, Integer> immutableMap) {
            this.f10856a = immutableMap;
        }

        @Override // com.google.common.collect.Maps.AbstractC2900l
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<K, V>> mo15664a() {
            return new b(size());
        }

        /* JADX INFO: renamed from: b */
        public Map.Entry<K, V> m15665b(int i) {
            xn80.m212109n(i, size());
            return new a(i);
        }

        /* JADX INFO: renamed from: c */
        public K m15666c(int i) {
            return this.f10856a.keySet().asList().get(i);
        }

        @Override // com.google.common.collect.Maps.AbstractC2900l, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f10856a.containsKey(obj);
        }

        /* JADX INFO: renamed from: d */
        public abstract String mo15667d();

        /* JADX INFO: renamed from: e */
        public abstract V mo15668e(int i);

        /* JADX INFO: renamed from: f */
        public abstract V mo15669f(int i, V v2);

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            Integer num = this.f10856a.get(obj);
            if (num == null) {
                return null;
            }
            return mo15668e(num.intValue());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f10856a.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f10856a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v2) {
            Integer num = this.f10856a.get(k);
            if (num != null) {
                return mo15669f(num.intValue(), v2);
            }
            String strMo15667d = mo15667d();
            String strValueOf = String.valueOf(k);
            String strValueOf2 = String.valueOf(this.f10856a.keySet());
            StringBuilder sb = new StringBuilder(String.valueOf(strMo15667d).length() + 9 + strValueOf.length() + strValueOf2.length());
            sb.append(strMo15667d);
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
            return this.f10856a.size();
        }

        public /* synthetic */ AbstractC2763d(ImmutableMap immutableMap, C2760a c2760a) {
            this(immutableMap);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$f */
    public class C2765f extends AbstractC2763d<C, Map<R, V>> {
        public C2765f() {
            super(ArrayTable.this.columnKeyToIndex, null);
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2763d
        /* JADX INFO: renamed from: d */
        public String mo15667d() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2763d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map<R, V> mo15668e(int i) {
            return new C2764e(i);
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2763d, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Map<R, V> put(C c, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2763d
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Map<R, V> mo15669f(int i, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ C2765f(ArrayTable arrayTable, C2760a c2760a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$h */
    public class C2767h extends AbstractC2763d<R, Map<C, V>> {
        public C2767h() {
            super(ArrayTable.this.rowKeyToIndex, null);
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2763d
        /* JADX INFO: renamed from: d */
        public String mo15667d() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2763d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map<C, V> mo15668e(int i) {
            return new C2766g(i);
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2763d, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Map<C, V> put(R r, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC2763d
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Map<C, V> mo15669f(int i, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ C2767h(ArrayTable arrayTable, C2760a c2760a) {
            this();
        }
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        return new ArrayTable<>(iterable, iterable2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ArrayTable(InterfaceC3002r<R, C, ? extends V> interfaceC3002r) {
        this(interfaceC3002r.rowKeySet(), interfaceC3002r.columnKeySet());
        putAll(interfaceC3002r);
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
