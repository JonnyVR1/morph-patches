package p153l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class qby0<E> extends pux0<E> implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final Object[] f156523d;

    /* JADX INFO: renamed from: e */
    public static final qby0<Object> f156524e;

    /* JADX INFO: renamed from: b */
    public E[] f156525b;

    /* JADX INFO: renamed from: c */
    public int f156526c;

    static {
        Object[] objArr = new Object[0];
        f156523d = objArr;
        f156524e = new qby0<>(objArr, 0, false);
    }

    public qby0(E[] eArr, int i, boolean z) {
        super(z);
        this.f156525b = eArr;
        this.f156526c = i;
    }

    /* JADX INFO: renamed from: f */
    private static int m176091f(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: g */
    private final String m176092g(int i) {
        return "Index:" + i + ", Size:" + this.f156526c;
    }

    /* JADX INFO: renamed from: h */
    public static <E> qby0<E> m176093h() {
        return (qby0<E>) f156524e;
    }

    /* JADX INFO: renamed from: i */
    private final void m176094i(int i) {
        if (i < 0 || i >= this.f156526c) {
            kym.m151996a(m176092g(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        m173917a();
        if (i < 0 || i > (i2 = this.f156526c)) {
            kym.m151996a(m176092g(i));
            return;
        }
        E[] eArr = this.f156525b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[m176091f(eArr.length)];
            System.arraycopy(this.f156525b, 0, eArr2, 0, i);
            System.arraycopy(this.f156525b, i, eArr2, i + 1, this.f156526c - i);
            this.f156525b = eArr2;
        }
        this.f156525b[i] = e;
        this.f156526c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: c */
    public final void m176095c(int i) {
        E[] eArr = this.f156525b;
        if (i <= eArr.length) {
            return;
        }
        if (eArr.length == 0) {
            this.f156525b = (E[]) new Object[Math.max(i, 10)];
            return;
        }
        int length = eArr.length;
        while (length < i) {
            length = m176091f(length);
        }
        this.f156525b = (E[]) Arrays.copyOf(this.f156525b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        m176094i(i);
        return this.f156525b[i];
    }

    @Override // p153l.pux0, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        m173917a();
        m176094i(i);
        E[] eArr = this.f156525b;
        E e = eArr[i];
        int i2 = this.f156526c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f156526c--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        m173917a();
        m176094i(i);
        E[] eArr = this.f156525b;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f156526c;
    }

    @Override // p153l.i4y0
    public final /* synthetic */ i4y0 zza(int i) {
        if (i >= this.f156526c) {
            return new qby0(i == 0 ? f156523d : Arrays.copyOf(this.f156525b, i), this.f156526c, true);
        }
        fig0.m125680a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        m173917a();
        int i = this.f156526c;
        E[] eArr = this.f156525b;
        if (i == eArr.length) {
            this.f156525b = (E[]) Arrays.copyOf(this.f156525b, m176091f(eArr.length));
        }
        E[] eArr2 = this.f156525b;
        int i2 = this.f156526c;
        this.f156526c = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }
}
