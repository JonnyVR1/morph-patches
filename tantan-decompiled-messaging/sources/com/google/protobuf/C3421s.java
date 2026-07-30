package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import p149l.x9g0;

/* JADX INFO: renamed from: com.google.protobuf.s */
/* JADX INFO: loaded from: classes7.dex */
public final class C3421s<E> extends AbstractC3405c<E> {

    /* JADX INFO: renamed from: c */
    public static final C3421s<Object> f11631c;

    /* JADX INFO: renamed from: b */
    public final List<E> f11632b;

    static {
        C3421s<Object> c3421s = new C3421s<>();
        f11631c = c3421s;
        c3421s.mo17084n();
    }

    public C3421s() {
        this(new ArrayList(10));
    }

    /* JADX INFO: renamed from: c */
    public static <E> C3421s<E> m17287c() {
        return (C3421s<E>) f11631c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        m17083a();
        this.f11632b.add(i, e);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.C3414l.h, com.google.protobuf.C3414l.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C3421s<E> mo17088d(int i) {
        if (i < size()) {
            x9g0.m207497a();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f11632b);
        return new C3421s<>(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        return this.f11632b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        m17083a();
        E eRemove = this.f11632b.remove(i);
        ((AbstractList) this).modCount++;
        return eRemove;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        m17083a();
        E e2 = this.f11632b.set(i, e);
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11632b.size();
    }

    public C3421s(List<E> list) {
        this.f11632b = list;
    }
}
