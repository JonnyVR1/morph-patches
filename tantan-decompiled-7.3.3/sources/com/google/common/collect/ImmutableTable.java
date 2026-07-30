package com.google.common.collect;

import com.google.common.base.C2677a;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.akq;
import p153l.gyj0;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ImmutableTable<R, C, V> extends AbstractC2989e<R, C, V> implements Serializable {

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final int[] cellColumnIndices;
        private final int[] cellRowIndices;
        private final Object[] cellValues;
        private final Object[] columnKeys;
        private final Object[] rowKeys;

        private SerializedForm(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.rowKeys = objArr;
            this.columnKeys = objArr2;
            this.cellValues = objArr3;
            this.cellRowIndices = iArr;
            this.cellColumnIndices = iArr2;
        }

        public static SerializedForm create(ImmutableTable<?, ?, ?> immutableTable, int[] iArr, int[] iArr2) {
            return new SerializedForm(immutableTable.rowKeySet().toArray(), immutableTable.columnKeySet().toArray(), immutableTable.values().toArray(), iArr, iArr2);
        }

        public Object readResolve() {
            Object[] objArr = this.cellValues;
            if (objArr.length == 0) {
                return ImmutableTable.m15916of();
            }
            int i = 0;
            if (objArr.length == 1) {
                return ImmutableTable.m15917of(this.rowKeys[0], this.columnKeys[0], objArr[0]);
            }
            ImmutableList.C2804a c2804a = new ImmutableList.C2804a(objArr.length);
            while (true) {
                Object[] objArr2 = this.cellValues;
                if (i >= objArr2.length) {
                    return RegularImmutableTable.forOrderedComponents(c2804a.m15756m(), ImmutableSet.copyOf(this.rowKeys), ImmutableSet.copyOf(this.columnKeys));
                }
                c2804a.mo15737a(ImmutableTable.cellOf(this.rowKeys[this.cellRowIndices[i]], this.columnKeys[this.cellColumnIndices[i]], objArr2[i]));
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableTable$a */
    public static final class C2833a<R, C, V> {

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC3002r.a<R, C, V>> f10974a = Lists.m15977j();

        /* JADX INFO: renamed from: b */
        public Comparator<? super R> f10975b;

        /* JADX INFO: renamed from: c */
        public Comparator<? super C> f10976c;

        /* JADX INFO: renamed from: a */
        public ImmutableTable<R, C, V> m15918a() {
            return m15919b();
        }

        /* JADX INFO: renamed from: b */
        public ImmutableTable<R, C, V> m15919b() {
            int size = this.f10974a.size();
            if (size == 0) {
                return ImmutableTable.m15916of();
            }
            List<InterfaceC3002r.a<R, C, V>> list = this.f10974a;
            return size != 1 ? RegularImmutableTable.forCells(list, this.f10975b, this.f10976c) : new SingletonImmutableTable((InterfaceC3002r.a) akq.m98602j(list));
        }

        /* JADX INFO: renamed from: c */
        public C2833a<R, C, V> m15920c(InterfaceC3002r.a<? extends R, ? extends C, ? extends V> aVar) {
            if (!(aVar instanceof Tables.ImmutableCell)) {
                m15921d(aVar.getRowKey(), aVar.getColumnKey(), aVar.getValue());
                return this;
            }
            xn80.m212112q(aVar.getRowKey(), "row");
            xn80.m212112q(aVar.getColumnKey(), "column");
            xn80.m212112q(aVar.getValue(), "value");
            this.f10974a.add(aVar);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C2833a<R, C, V> m15921d(R r, C c, V v2) {
            this.f10974a.add(ImmutableTable.cellOf(r, c, v2));
            return this;
        }
    }

    public static <R, C, V> C2833a<R, C, V> builder() {
        return new C2833a<>();
    }

    public static <R, C, V> InterfaceC3002r.a<R, C, V> cellOf(R r, C c, V v2) {
        return Tables.m16228c(xn80.m212112q(r, "rowKey"), xn80.m212112q(c, "columnKey"), xn80.m212112q(v2, "value"));
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(Iterable<? extends InterfaceC3002r.a<? extends R, ? extends C, ? extends V>> iterable) {
        C2833a c2833aBuilder = builder();
        Iterator<? extends InterfaceC3002r.a<? extends R, ? extends C, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            c2833aBuilder.m15920c(it.next());
        }
        return c2833aBuilder.m15918a();
    }

    /* JADX INFO: renamed from: of */
    public static <R, C, V> ImmutableTable<R, C, V> m15917of(R r, C c, V v2) {
        return new SingletonImmutableTable(r, c, v2);
    }

    @Override // com.google.common.collect.AbstractC2989e
    public final gyj0<InterfaceC3002r.a<R, C, V>> cellIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public ImmutableSet<InterfaceC3002r.a<R, C, V>> cellSet() {
        return (ImmutableSet) super.cellSet();
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public ImmutableMap<R, V> column(C c) {
        xn80.m212112q(c, "columnKey");
        return (ImmutableMap) C2677a.m15480a((ImmutableMap) columnMap().get(c), ImmutableMap.m15769of());
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public ImmutableSet<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public abstract ImmutableMap<C, Map<R, V>> columnMap();

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public boolean contains(Object obj, Object obj2) {
        return get(obj, obj2) != null;
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ boolean containsColumn(Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ boolean containsRow(Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.AbstractC2989e
    public abstract ImmutableSet<InterfaceC3002r.a<R, C, V>> createCellSet();

    public abstract SerializedForm createSerializedForm();

    @Override // com.google.common.collect.AbstractC2989e
    public abstract ImmutableCollection<V> createValues();

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ Object get(Object obj, Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    @Deprecated
    public final V put(R r, C c, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    @Deprecated
    public final void putAll(InterfaceC3002r<? extends R, ? extends C, ? extends V> interfaceC3002r) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    @Deprecated
    public final V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public ImmutableMap<C, V> row(R r) {
        xn80.m212112q(r, "rowKey");
        return (ImmutableMap) C2677a.m15480a((ImmutableMap) rowMap().get(r), ImmutableMap.m15769of());
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public ImmutableSet<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public abstract ImmutableMap<R, Map<C, V>> rowMap();

    @Override // com.google.common.collect.InterfaceC3002r
    public abstract /* synthetic */ int size();

    @Override // com.google.common.collect.AbstractC2989e
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    @Override // com.google.common.collect.AbstractC2989e
    public final Iterator<V> valuesIterator() {
        throw new AssertionError("should never be called");
    }

    public final Object writeReplace() {
        return createSerializedForm();
    }

    /* JADX INFO: renamed from: of */
    public static <R, C, V> ImmutableTable<R, C, V> m15916of() {
        return (ImmutableTable<R, C, V>) SparseImmutableTable.EMPTY;
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(InterfaceC3002r<? extends R, ? extends C, ? extends V> interfaceC3002r) {
        if (interfaceC3002r instanceof ImmutableTable) {
            return (ImmutableTable) interfaceC3002r;
        }
        return copyOf(interfaceC3002r.cellSet());
    }
}
