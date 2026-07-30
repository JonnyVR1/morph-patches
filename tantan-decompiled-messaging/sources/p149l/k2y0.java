package p149l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class k2y0<E> extends jlx0<E> implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final Object[] f120783d;

    /* JADX INFO: renamed from: e */
    public static final k2y0<Object> f120784e;

    /* JADX INFO: renamed from: b */
    public E[] f120785b;

    /* JADX INFO: renamed from: c */
    public int f120786c;

    static {
        Object[] objArr = new Object[0];
        f120783d = objArr;
        f120784e = new k2y0<>(objArr, 0, false);
    }

    public k2y0(E[] eArr, int i, boolean z) {
        super(z);
        this.f120785b = eArr;
        this.f120786c = i;
    }

    /* JADX INFO: renamed from: f */
    private static int m144357f(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: g */
    private final String m144358g(int i) {
        return "Index:" + i + ", Size:" + this.f120786c;
    }

    /* JADX INFO: renamed from: h */
    public static <E> k2y0<E> m144359h() {
        return (k2y0<E>) f120784e;
    }

    /* JADX INFO: renamed from: i */
    private final void m144360i(int i) {
        if (i < 0 || i >= this.f120786c) {
            jwm.m143661a(m144358g(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        m142120a();
        if (i < 0 || i > (i2 = this.f120786c)) {
            jwm.m143661a(m144358g(i));
            return;
        }
        E[] eArr = this.f120785b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[m144357f(eArr.length)];
            System.arraycopy(this.f120785b, 0, eArr2, 0, i);
            System.arraycopy(this.f120785b, i, eArr2, i + 1, this.f120786c - i);
            this.f120785b = eArr2;
        }
        this.f120785b[i] = e;
        this.f120786c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: c */
    public final void m144361c(int i) {
        E[] eArr = this.f120785b;
        if (i <= eArr.length) {
            return;
        }
        if (eArr.length == 0) {
            this.f120785b = (E[]) new Object[Math.max(i, 10)];
            return;
        }
        int length = eArr.length;
        while (length < i) {
            length = m144357f(length);
        }
        this.f120785b = (E[]) Arrays.copyOf(this.f120785b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        m144360i(i);
        return this.f120785b[i];
    }

    @Override // p149l.jlx0, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        m142120a();
        m144360i(i);
        E[] eArr = this.f120785b;
        E e = eArr[i];
        int i2 = this.f120786c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f120786c--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        m142120a();
        m144360i(i);
        E[] eArr = this.f120785b;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f120786c;
    }

    @Override // p149l.cvx0
    public final /* synthetic */ cvx0 zza(int i) {
        if (i >= this.f120786c) {
            return new k2y0(i == 0 ? f120783d : Arrays.copyOf(this.f120785b, i), this.f120786c, true);
        }
        x9g0.m207497a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        m142120a();
        int i = this.f120786c;
        E[] eArr = this.f120785b;
        if (i == eArr.length) {
            this.f120785b = (E[]) Arrays.copyOf(this.f120785b, m144357f(eArr.length));
        }
        E[] eArr2 = this.f120785b;
        int i2 = this.f120786c;
        this.f120786c = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }
}
