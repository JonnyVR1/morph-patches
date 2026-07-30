package p149l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class ibx0 extends v6x0 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final ibx0 f112391d = new ibx0(new Object[0], 0, false);

    /* JADX INFO: renamed from: b */
    public Object[] f112392b;

    /* JADX INFO: renamed from: c */
    public int f112393c;

    public ibx0(Object[] objArr, int i, boolean z) {
        super(z);
        this.f112392b = objArr;
        this.f112393c = i;
    }

    /* JADX INFO: renamed from: c */
    public static ibx0 m135273c() {
        return f112391d;
    }

    /* JADX INFO: renamed from: f */
    private final String m135274f(int i) {
        return "Index:" + i + ", Size:" + this.f112393c;
    }

    /* JADX INFO: renamed from: g */
    private final void m135275g(int i) {
        if (i < 0 || i >= this.f112393c) {
            jwm.m143661a(m135274f(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m197278a();
        if (i < 0 || i > (i2 = this.f112393c)) {
            jwm.m143661a(m135274f(i));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.f112392b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f112392b, i, objArr2, i3, this.f112393c - i);
            this.f112392b = objArr2;
        }
        this.f112392b[i] = obj;
        this.f112393c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m135275g(i);
        return this.f112392b[i];
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m197278a();
        m135275g(i);
        Object[] objArr = this.f112392b;
        Object obj = objArr[i];
        int i2 = this.f112393c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f112393c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m197278a();
        m135275g(i);
        Object[] objArr = this.f112392b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f112393c;
    }

    @Override // p149l.z9x0
    public final /* bridge */ /* synthetic */ z9x0 zzd(int i) {
        if (i >= this.f112393c) {
            return new ibx0(Arrays.copyOf(this.f112392b, i), this.f112393c, true);
        }
        x9g0.m207497a();
        return null;
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m197278a();
        int i = this.f112393c;
        Object[] objArr = this.f112392b;
        if (i == objArr.length) {
            this.f112392b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f112392b;
        int i2 = this.f112393c;
        this.f112393c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
