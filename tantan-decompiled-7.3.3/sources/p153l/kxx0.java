package p153l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class kxx0 extends mow0 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final Object[] f129250d;

    /* JADX INFO: renamed from: e */
    public static final kxx0 f129251e;

    /* JADX INFO: renamed from: b */
    public Object[] f129252b;

    /* JADX INFO: renamed from: c */
    public int f129253c;

    static {
        Object[] objArr = new Object[0];
        f129250d = objArr;
        f129251e = new kxx0(objArr, 0, false);
    }

    public kxx0(Object[] objArr, int i, boolean z) {
        super(z);
        this.f129252b = objArr;
        this.f129253c = i;
    }

    /* JADX INFO: renamed from: c */
    public static kxx0 m151897c() {
        return f129251e;
    }

    /* JADX INFO: renamed from: g */
    private static int m151898g(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: h */
    private final String m151899h(int i) {
        return "Index:" + i + ", Size:" + this.f129253c;
    }

    /* JADX INFO: renamed from: i */
    private final void m151900i(int i) {
        if (i < 0 || i >= this.f129253c) {
            kym.m151996a(m151899h(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m159318a();
        if (i < 0 || i > (i2 = this.f129253c)) {
            kym.m151996a(m151899h(i));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.f129252b;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[m151898g(length)];
            System.arraycopy(this.f129252b, 0, objArr2, 0, i);
            System.arraycopy(this.f129252b, i, objArr2, i3, this.f129253c - i);
            this.f129252b = objArr2;
        }
        this.f129252b[i] = obj;
        this.f129253c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: f */
    public final void m151901f(int i) {
        int length = this.f129252b.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f129252b = new Object[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = m151898g(length);
        }
        this.f129252b = Arrays.copyOf(this.f129252b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m151900i(i);
        return this.f129252b[i];
    }

    @Override // p153l.mow0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m159318a();
        m151900i(i);
        Object[] objArr = this.f129252b;
        Object obj = objArr[i];
        int i2 = this.f129253c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f129253c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m159318a();
        m151900i(i);
        Object[] objArr = this.f129252b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f129253c;
    }

    @Override // p153l.orx0
    public final /* bridge */ /* synthetic */ orx0 zzd(int i) {
        if (i >= this.f129253c) {
            return new kxx0(i == 0 ? f129250d : Arrays.copyOf(this.f129252b, i), this.f129253c, true);
        }
        fig0.m125680a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m159318a();
        int i = this.f129253c;
        int length = this.f129252b.length;
        if (i == length) {
            this.f129252b = Arrays.copyOf(this.f129252b, m151898g(length));
        }
        Object[] objArr = this.f129252b;
        int i2 = this.f129253c;
        this.f129253c = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
