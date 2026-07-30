package p149l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class xkx0 extends gfw0 implements RandomAccess, iix0, vnx0 {

    /* JADX INFO: renamed from: d */
    public static final long[] f193364d;

    /* JADX INFO: renamed from: b */
    public long[] f193365b;

    /* JADX INFO: renamed from: c */
    public int f193366c;

    static {
        long[] jArr = new long[0];
        f193364d = jArr;
        new xkx0(jArr, 0, false);
    }

    public xkx0() {
        this(f193364d, 0, true);
    }

    /* JADX INFO: renamed from: h */
    private static int m209833h(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: i */
    private final String m209834i(int i) {
        return "Index:" + i + ", Size:" + this.f193366c;
    }

    /* JADX INFO: renamed from: j */
    private final void m209835j(int i) {
        if (i < 0 || i >= this.f193366c) {
            jwm.m143661a(m209834i(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m125929a();
        if (i < 0 || i > (i2 = this.f193366c)) {
            jwm.m143661a(m209834i(i));
            return;
        }
        int i3 = i + 1;
        long[] jArr = this.f193365b;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[m209833h(length)];
            System.arraycopy(this.f193365b, 0, jArr2, 0, i);
            System.arraycopy(this.f193365b, i, jArr2, i3, this.f193366c - i);
            this.f193365b = jArr2;
        }
        this.f193365b[i] = jLongValue;
        this.f193366c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p149l.gfw0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m125929a();
        Charset charset = mix0.f134047a;
        collection.getClass();
        if (!(collection instanceof xkx0)) {
            return super.addAll(collection);
        }
        xkx0 xkx0Var = (xkx0) collection;
        int i = xkx0Var.f193366c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f193366c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        long[] jArr = this.f193365b;
        if (i3 > jArr.length) {
            this.f193365b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(xkx0Var.f193365b, 0, this.f193365b, this.f193366c, xkx0Var.f193366c);
        this.f193366c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final long m209836c(int i) {
        m209835j(i);
        return this.f193365b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p149l.gfw0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkx0)) {
            return super.equals(obj);
        }
        xkx0 xkx0Var = (xkx0) obj;
        if (this.f193366c != xkx0Var.f193366c) {
            return false;
        }
        long[] jArr = xkx0Var.f193365b;
        for (int i = 0; i < this.f193366c; i++) {
            if (this.f193365b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m209837f(long j) {
        m125929a();
        int i = this.f193366c;
        int length = this.f193365b.length;
        if (i == length) {
            long[] jArr = new long[m209833h(length)];
            System.arraycopy(this.f193365b, 0, jArr, 0, this.f193366c);
            this.f193365b = jArr;
        }
        long[] jArr2 = this.f193365b;
        int i2 = this.f193366c;
        this.f193366c = i2 + 1;
        jArr2[i2] = j;
    }

    /* JADX INFO: renamed from: g */
    public final void m209838g(int i) {
        int length = this.f193365b.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f193365b = new long[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = m209833h(length);
        }
        this.f193365b = Arrays.copyOf(this.f193365b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m209835j(i);
        return Long.valueOf(this.f193365b[i]);
    }

    @Override // p149l.gfw0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f193366c; i2++) {
            long j = this.f193365b[i2];
            Charset charset = mix0.f134047a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f193366c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f193365b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p149l.gfw0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m125929a();
        m209835j(i);
        long[] jArr = this.f193365b;
        long j = jArr[i];
        int i2 = this.f193366c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f193366c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m125929a();
        if (i2 < i) {
            jwm.m143661a("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f193365b;
        System.arraycopy(jArr, i2, jArr, i, this.f193366c - i2);
        this.f193366c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m125929a();
        m209835j(i);
        long[] jArr = this.f193365b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f193366c;
    }

    @Override // p149l.iix0
    public final /* bridge */ /* synthetic */ iix0 zzd(int i) {
        if (i >= this.f193366c) {
            return new xkx0(i == 0 ? f193364d : Arrays.copyOf(this.f193365b, i), this.f193366c, true);
        }
        x9g0.m207497a();
        return null;
    }

    public xkx0(long[] jArr, int i, boolean z) {
        super(z);
        this.f193365b = jArr;
        this.f193366c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m209837f(((Long) obj).longValue());
        return true;
    }
}
