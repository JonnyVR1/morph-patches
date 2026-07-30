package p149l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class eox0 extends gfw0 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final Object[] f92501d;

    /* JADX INFO: renamed from: e */
    public static final eox0 f92502e;

    /* JADX INFO: renamed from: b */
    public Object[] f92503b;

    /* JADX INFO: renamed from: c */
    public int f92504c;

    static {
        Object[] objArr = new Object[0];
        f92501d = objArr;
        f92502e = new eox0(objArr, 0, false);
    }

    public eox0(Object[] objArr, int i, boolean z) {
        super(z);
        this.f92503b = objArr;
        this.f92504c = i;
    }

    /* JADX INFO: renamed from: c */
    public static eox0 m117519c() {
        return f92502e;
    }

    /* JADX INFO: renamed from: g */
    private static int m117520g(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: h */
    private final String m117521h(int i) {
        return "Index:" + i + ", Size:" + this.f92504c;
    }

    /* JADX INFO: renamed from: i */
    private final void m117522i(int i) {
        if (i < 0 || i >= this.f92504c) {
            jwm.m143661a(m117521h(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m125929a();
        if (i < 0 || i > (i2 = this.f92504c)) {
            jwm.m143661a(m117521h(i));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.f92503b;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[m117520g(length)];
            System.arraycopy(this.f92503b, 0, objArr2, 0, i);
            System.arraycopy(this.f92503b, i, objArr2, i3, this.f92504c - i);
            this.f92503b = objArr2;
        }
        this.f92503b[i] = obj;
        this.f92504c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: f */
    public final void m117523f(int i) {
        int length = this.f92503b.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f92503b = new Object[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = m117520g(length);
        }
        this.f92503b = Arrays.copyOf(this.f92503b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m117522i(i);
        return this.f92503b[i];
    }

    @Override // p149l.gfw0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m125929a();
        m117522i(i);
        Object[] objArr = this.f92503b;
        Object obj = objArr[i];
        int i2 = this.f92504c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f92504c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m125929a();
        m117522i(i);
        Object[] objArr = this.f92503b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f92504c;
    }

    @Override // p149l.iix0
    public final /* bridge */ /* synthetic */ iix0 zzd(int i) {
        if (i >= this.f92504c) {
            return new eox0(i == 0 ? f92501d : Arrays.copyOf(this.f92503b, i), this.f92504c, true);
        }
        x9g0.m207497a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m125929a();
        int i = this.f92504c;
        int length = this.f92503b.length;
        if (i == length) {
            this.f92503b = Arrays.copyOf(this.f92503b, m117520g(length));
        }
        Object[] objArr = this.f92503b;
        int i2 = this.f92504c;
        this.f92504c = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
