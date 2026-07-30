package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    static final RegularImmutableMultiset<Object> EMPTY = new RegularImmutableMultiset<>(C2973l.m16265b());
    final transient C2973l<E> contents;
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
            return RegularImmutableMultiset.this.contents.m16279i(i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return RegularImmutableMultiset.this.contents.m16273C();
        }
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final int[] counts;
        final Object[] elements;

        public SerializedForm(InterfaceC2972k<? extends Object> interfaceC2972k) {
            int size = interfaceC2972k.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (InterfaceC2972k.a<? extends Object> aVar : interfaceC2972k.entrySet()) {
                this.elements[i] = aVar.getElement();
                this.counts[i] = aVar.getCount();
                i++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            ImmutableMultiset.C2794b c2794b = new ImmutableMultiset.C2794b(this.elements.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.elements;
                if (i >= objArr.length) {
                    return c2794b.mo15756k();
                }
                c2794b.mo15755j(objArr[i], this.counts[i]);
                i++;
            }
        }
    }

    public RegularImmutableMultiset(C2973l<E> c2973l) {
        this.contents = c2973l;
        long jM16280k = 0;
        for (int i = 0; i < c2973l.m16273C(); i++) {
            jM16280k += (long) c2973l.m16280k(i);
        }
        this.size = Ints.m16468m(jM16280k);
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.InterfaceC2972k
    public int count(Object obj) {
        return this.contents.m16277f(obj);
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.InterfaceC2972k
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
    public InterfaceC2972k.a<E> getEntry(int i) {
        return this.contents.m16278g(i);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2972k
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
