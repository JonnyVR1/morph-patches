package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import p153l.fig0;
import p153l.kym;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0332g0<E> extends AbstractC0323c<E> implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C0332g0<Object> f1673d;

    /* JADX INFO: renamed from: b */
    public E[] f1674b;

    /* JADX INFO: renamed from: c */
    public int f1675c;

    static {
        C0332g0<Object> c0332g0 = new C0332g0<>(new Object[0], 0);
        f1673d = c0332g0;
        c0332g0.mo1820n();
    }

    public C0332g0(E[] eArr, int i) {
        this.f1674b = eArr;
        this.f1675c = i;
    }

    /* JADX INFO: renamed from: c */
    public static <E> E[] m2108c(int i) {
        return (E[]) new Object[i];
    }

    /* JADX INFO: renamed from: f */
    public static <E> C0332g0<E> m2109f() {
        return (C0332g0<E>) f1673d;
    }

    /* JADX INFO: renamed from: g */
    private void m2110g(int i) {
        if (i < 0 || i >= this.f1675c) {
            kym.m151996a(m2111h(i));
        }
    }

    /* JADX INFO: renamed from: h */
    private String m2111h(int i) {
        return "Index:" + i + ", Size:" + this.f1675c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        m1819a();
        if (i < 0 || i > (i2 = this.f1675c)) {
            kym.m151996a(m2111h(i));
            return;
        }
        E[] eArr = this.f1674b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) m2108c(((i2 * 3) / 2) + 1);
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
        m2110g(i);
        return this.f1674b[i];
    }

    @Override // androidx.datastore.preferences.protobuf.C0351s.i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0332g0<E> mo2015d(int i) {
        if (i >= this.f1675c) {
            return new C0332g0<>(Arrays.copyOf(this.f1674b, i), this.f1675c);
        }
        fig0.m125680a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        m1819a();
        m2110g(i);
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
        m1819a();
        m2110g(i);
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

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        m1819a();
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
