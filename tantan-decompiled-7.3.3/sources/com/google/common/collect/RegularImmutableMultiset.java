package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    static final RegularImmutableMultiset<Object> EMPTY = new RegularImmutableMultiset<>(C2996l.m16319b());
    final transient C2996l<E> contents;
    private transient ImmutableSet<E> elementSet;
    private final transient int size;

    public final class ElementSet extends IndexedImmutableSet<E> {
        private ElementSet() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public E get(int i) {
            return RegularImmutableMultiset.this.contents.m16333i(i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return RegularImmutableMultiset.this.contents.m16327C();
        }
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final int[] counts;
        final Object[] elements;

        public SerializedForm(InterfaceC2995k<? extends Object> interfaceC2995k) {
            int size = interfaceC2995k.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (InterfaceC2995k.a<? extends Object> aVar : interfaceC2995k.entrySet()) {
                this.elements[i] = aVar.getElement();
                this.counts[i] = aVar.getCount();
                i++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            ImmutableMultiset.C2817b c2817b = new ImmutableMultiset.C2817b(this.elements.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.elements;
                if (i >= objArr.length) {
                    return c2817b.mo15810k();
                }
                c2817b.mo15809j(objArr[i], this.counts[i]);
                i++;
            }
        }
    }

    public RegularImmutableMultiset(C2996l<E> c2996l) {
        this.contents = c2996l;
        long jM16334k = 0;
        for (int i = 0; i < c2996l.m16327C(); i++) {
            jM16334k += (long) c2996l.m16334k(i);
        }
        this.size = Ints.m16523m(jM16334k);
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.InterfaceC2995k
    public int count(Object obj) {
        return this.contents.m16331f(obj);
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.InterfaceC2995k
    public ImmutableSet<E> elementSet() {
        ImmutableSet<E> immutableSet = this.elementSet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ElementSet elementSet = new ElementSet();
        this.elementSet = elementSet;
        return elementSet;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public InterfaceC2995k.a<E> getEntry(int i) {
        return this.contents.m16332g(i);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2995k
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
