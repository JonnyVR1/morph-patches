package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import p149l.jwm;
import p149l.x9g0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0331g0<E> extends AbstractC0322c<E> implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C0331g0<Object> f1673d;

    /* JADX INFO: renamed from: b */
    public E[] f1674b;

    /* JADX INFO: renamed from: c */
    public int f1675c;

    static {
        C0331g0<Object> c0331g0 = new C0331g0<>(new Object[0], 0);
        f1673d = c0331g0;
        c0331g0.mo1819n();
    }

    public C0331g0(E[] eArr, int i) {
        this.f1674b = eArr;
        this.f1675c = i;
    }

    /* JADX INFO: renamed from: c */
    public static <E> E[] m2107c(int i) {
        return (E[]) new Object[i];
    }

    /* JADX INFO: renamed from: f */
    public static <E> C0331g0<E> m2108f() {
        return (C0331g0<E>) f1673d;
    }

    /* JADX INFO: renamed from: g */
    private void m2109g(int i) {
        if (i < 0 || i >= this.f1675c) {
            jwm.m143661a(m2110h(i));
        }
    }

    /* JADX INFO: renamed from: h */
    private String m2110h(int i) {
        return "Index:" + i + ", Size:" + this.f1675c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        m1818a();
        if (i < 0 || i > (i2 = this.f1675c)) {
            jwm.m143661a(m2110h(i));
            return;
        }
        E[] eArr = this.f1674b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) m2107c(((i2 * 3) / 2) + 1);
            System.arraycopy(this.f1674b, 0, eArr2, 0, i);
            System.arraycopy(this.f1674b, i, eArr2, i + 1, this.f1675c - i);
            this.f1674b = eArr2;
        }
        this.f1674b[i] = e;
        this.f1675c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        m2109g(i);
        return this.f1674b[i];
    }

    @Override // androidx.datastore.preferences.protobuf.C0350s.i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0331g0<E> mo2014d(int i) {
        if (i >= this.f1675c) {
            return new C0331g0<>(Arrays.copyOf(this.f1674b, i), this.f1675c);
        }
        x9g0.m207497a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        m1818a();
        m2109g(i);
        E[] eArr = this.f1674b;
        E e = eArr[i];
        int i2 = this.f1675c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f1675c--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        m1818a();
        m2109g(i);
        E[] eArr = this.f1674b;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f1675c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        m1818a();
        int i = this.f1675c;
        E[] eArr = this.f1674b;
        if (i == eArr.length) {
            this.f1674b = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f1674b;
        int i2 = this.f1675c;
        this.f1675c = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }
}
