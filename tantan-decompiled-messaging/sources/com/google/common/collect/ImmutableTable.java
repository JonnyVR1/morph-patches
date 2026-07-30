package com.google.common.collect;

import com.google.common.base.C2654a;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.aiq;
import p149l.dpj0;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ImmutableTable<R, C, V> extends AbstractC2966e<R, C, V> implements Serializable {

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
                return ImmutableTable.m15862of();
            }
            int i = 0;
            if (objArr.length == 1) {
                return ImmutableTable.m15863of(this.rowKeys[0], this.columnKeys[0], objArr[0]);
            }
            ImmutableList.C2781a c2781a = new ImmutableList.C2781a(objArr.length);
            while (true) {
                Object[] objArr2 = this.cellValues;
                if (i >= objArr2.length) {
                    return RegularImmutableTable.forOrderedComponents(c2781a.m15702m(), ImmutableSet.copyOf(this.rowKeys), ImmutableSet.copyOf(this.columnKeys));
                }
                c2781a.mo15683a(ImmutableTable.cellOf(this.rowKeys[this.cellRowIndices[i]], this.columnKeys[this.cellColumnIndices[i]], objArr2[i]));
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableTable$a */
    public static final class C2810a<R, C, V> {

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC2979r.a<R, C, V>> f10937a = Lists.m15923j();

        /* JADX INFO: renamed from: b */
        public Comparator<? super R> f10938b;

        /* JADX INFO: renamed from: c */
        public Comparator<? super C> f10939c;

        /* JADX INFO: renamed from: a */
        public ImmutableTable<R, C, V> m15864a() {
            return m15865b();
        }

        /* JADX INFO: renamed from: b */
        public ImmutableTable<R, C, V> m15865b() {
            int size = this.f10937a.size();
            if (size == 0) {
                return ImmutableTable.m15862of();
            }
            List<InterfaceC2979r.a<R, C, V>> list = this.f10937a;
            return size != 1 ? RegularImmutableTable.forCells(list, this.f10938b, this.f10939c) : new SingletonImmutableTable((InterfaceC2979r.a) aiq.m96884j(list));
        }

        /* JADX INFO: renamed from: c */
        public C2810a<R, C, V> m15866c(InterfaceC2979r.a<? extends R, ? extends C, ? extends V> aVar) {
            if (!(aVar instanceof Tables.ImmutableCell)) {
                m15867d(aVar.getRowKey(), aVar.getColumnKey(), aVar.getValue());
                return this;
            }
            sf80.m183895q(aVar.getRowKey(), "row");
            sf80.m183895q(aVar.getColumnKey(), "column");
            sf80.m183895q(aVar.getValue(), "value");
            this.f10937a.add(aVar);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C2810a<R, C, V> m15867d(R r, C c, V v2) {
            this.f10937a.add(ImmutableTable.cellOf(r, c, v2));
            return this;
        }
    }

    public static <R, C, V> C2810a<R, C, V> builder() {
        return new C2810a<>();
    }

    public static <R, C, V> InterfaceC2979r.a<R, C, V> cellOf(R r, C c, V v2) {
        return Tables.m16174c(sf80.m183895q(r, "rowKey"), sf80.m183895q(c, "columnKey"), sf80.m183895q(v2, "value"));
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(Iterable<? extends InterfaceC2979r.a<? extends R, ? extends C, ? extends V>> iterable) {
        C2810a c2810aBuilder = builder();
        Iterator<? extends InterfaceC2979r.a<? extends R, ? extends C, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            c2810aBuilder.m15866c(it.next());
        }
        return c2810aBuilder.m15864a();
    }

    /* JADX INFO: renamed from: of */
    public static <R, C, V> ImmutableTable<R, C, V> m15863of(R r, C c, V v2) {
        return new SingletonImmutableTable(r, c, v2);
    }

    @Override // com.google.common.collect.AbstractC2966e
    public final dpj0<InterfaceC2979r.a<R, C, V>> cellIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public ImmutableSet<InterfaceC2979r.a<R, C, V>> cellSet() {
        return (ImmutableSet) super.cellSet();
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public ImmutableMap<R, V> column(C c) {
        sf80.m183895q(c, "columnKey");
        return (ImmutableMap) C2654a.m15426a((ImmutableMap) columnMap().get(c), ImmutableMap.m15715of());
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public ImmutableSet<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public abstract ImmutableMap<C, Map<R, V>> columnMap();

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public boolean contains(Object obj, Object obj2) {
        return get(obj, obj2) != null;
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ boolean containsColumn(Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ boolean containsRow(Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.AbstractC2966e
    public abstract ImmutableSet<InterfaceC2979r.a<R, C, V>> createCellSet();

    public abstract SerializedForm createSerializedForm();

    @Override // com.google.common.collect.AbstractC2966e
    public abstract ImmutableCollection<V> createValues();

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ Object get(Object obj, Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    @Deprecated
    public final V put(R r, C c, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    @Deprecated
    public final void putAll(InterfaceC2979r<? extends R, ? extends C, ? extends V> interfaceC2979r) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    @Deprecated
    public final V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public ImmutableMap<C, V> row(R r) {
        sf80.m183895q(r, "rowKey");
        return (ImmutableMap) C2654a.m15426a((ImmutableMap) rowMap().get(r), ImmutableMap.m15715of());
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public ImmutableSet<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public abstract ImmutableMap<R, Map<C, V>> rowMap();

    @Override // com.google.common.collect.InterfaceC2979r
    public abstract /* synthetic */ int size();

    @Override // com.google.common.collect.AbstractC2966e
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    @Override // com.google.common.collect.AbstractC2966e
    public final Iterator<V> valuesIterator() {
        throw new AssertionError("should never be called");
    }

    public final Object writeReplace() {
        return createSerializedForm();
    }

    /* JADX INFO: renamed from: of */
    public static <R, C, V> ImmutableTable<R, C, V> m15862of() {
        return (ImmutableTable<R, C, V>) SparseImmutableTable.EMPTY;
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(InterfaceC2979r<? extends R, ? extends C, ? extends V> interfaceC2979r) {
        if (interfaceC2979r instanceof ImmutableTable) {
            return (ImmutableTable) interfaceC2979r;
        }
        return copyOf(interfaceC2979r.cellSet());
    }
}
