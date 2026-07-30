package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import p153l.fig0;

/* JADX INFO: renamed from: com.google.protobuf.s */
/* JADX INFO: loaded from: classes7.dex */
public final class C3444s<E> extends AbstractC3428c<E> {

    /* JADX INFO: renamed from: c */
    public static final C3444s<Object> f11668c;

    /* JADX INFO: renamed from: b */
    public final List<E> f11669b;

    static {
        C3444s<Object> c3444s = new C3444s<>();
        f11668c = c3444s;
        c3444s.mo17139n();
    }

    public C3444s() {
        this(new ArrayList(10));
    }

    /* JADX INFO: renamed from: c */
    public static <E> C3444s<E> m17342c() {
        return (C3444s<E>) f11668c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        m17138a();
        this.f11669b.add(i, e);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.C3437l.h, com.google.protobuf.C3437l.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C3444s<E> mo17143d(int i) {
        if (i < size()) {
            fig0.m125680a();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f11669b);
        return new C3444s<>(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        return this.f11669b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        m17138a();
        E eRemove = this.f11669b.remove(i);
        ((AbstractList) this).modCount++;
        return eRemove;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        m17138a();
        E e2 = this.f11669b.set(i, e);
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11669b.size();
    }

    public C3444s(List<E> list) {
        this.f11669b = list;
    }
}
