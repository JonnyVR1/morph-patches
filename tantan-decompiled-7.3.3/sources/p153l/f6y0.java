package p153l;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class f6y0 extends pux0<Long> implements b3y0, lby0, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final long[] f97460d;

    /* JADX INFO: renamed from: e */
    public static final f6y0 f97461e;

    /* JADX INFO: renamed from: b */
    public long[] f97462b;

    /* JADX INFO: renamed from: c */
    public int f97463c;

    static {
        long[] jArr = new long[0];
        f97460d = jArr;
        f97461e = new f6y0(jArr, 0, false);
    }

    public f6y0() {
        this(f97460d, 0, true);
    }

    /* JADX INFO: renamed from: f */
    public static f6y0 m124330f() {
        return f97461e;
    }

    /* JADX INFO: renamed from: h */
    public static int m124331h(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m173917a();
        if (i < 0 || i > (i2 = this.f97463c)) {
            kym.m151996a(m124334i(i));
            return;
        }
        long[] jArr = this.f97462b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[m124331h(jArr.length)];
            System.arraycopy(this.f97462b, 0, jArr2, 0, i);
            System.arraycopy(this.f97462b, i, jArr2, i + 1, this.f97463c - i);
            this.f97462b = jArr2;
        }
        this.f97462b[i] = jLongValue;
        this.f97463c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p153l.pux0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m173917a();
        i2y0.m138253e(collection);
        if (!(collection instanceof f6y0)) {
            return super.addAll(collection);
        }
        f6y0 f6y0Var = (f6y0) collection;
        int i = f6y0Var.f97463c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f97463c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        long[] jArr = this.f97462b;
        if (i3 > jArr.length) {
            this.f97462b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(f6y0Var.f97462b, 0, this.f97462b, this.f97463c, f6y0Var.f97463c);
        this.f97463c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m124332c(long j) {
        m173917a();
        int i = this.f97463c;
        long[] jArr = this.f97462b;
        if (i == jArr.length) {
            long[] jArr2 = new long[m124331h(jArr.length)];
            System.arraycopy(this.f97462b, 0, jArr2, 0, this.f97463c);
            this.f97462b = jArr2;
        }
        long[] jArr3 = this.f97462b;
        int i2 = this.f97463c;
        this.f97463c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p153l.b3y0
    /* JADX INFO: renamed from: e */
    public final long mo102379e(int i) {
        m124335j(i);
        return this.f97462b[i];
    }

    @Override // p153l.pux0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6y0)) {
            return super.equals(obj);
        }
        f6y0 f6y0Var = (f6y0) obj;
        if (this.f97463c != f6y0Var.f97463c) {
            return false;
        }
        long[] jArr = f6y0Var.f97462b;
        for (int i = 0; i < this.f97463c; i++) {
            if (this.f97462b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m124333g(int i) {
        long[] jArr = this.f97462b;
        if (i <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.f97462b = new long[Math.max(i, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i) {
            length = m124331h(length);
        }
        this.f97462b = Arrays.copyOf(this.f97462b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo102379e(i));
    }

    @Override // p153l.pux0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM138250b = 1;
        for (int i = 0; i < this.f97463c; i++) {
            iM138250b = (iM138250b * 31) + i2y0.m138250b(this.f97462b[i]);
        }
        return iM138250b;
    }

    /* JADX INFO: renamed from: i */
    public final String m124334i(int i) {
        return "Index:" + i + ", Size:" + this.f97463c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f97462b[i] == jLongValue) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m124335j(int i) {
        if (i < 0 || i >= this.f97463c) {
            kym.m151996a(m124334i(i));
        }
    }

    @Override // p153l.pux0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m173917a();
        m124335j(i);
        long[] jArr = this.f97462b;
        long j = jArr[i];
        int i2 = this.f97463c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f97463c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m173917a();
        if (i2 < i) {
            kym.m151996a("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f97462b;
        System.arraycopy(jArr, i2, jArr, i, this.f97463c - i2);
        this.f97463c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m173917a();
        m124335j(i);
        long[] jArr = this.f97462b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f97463c;
    }

    @Override // p153l.i4y0
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final b3y0 zza(int i) {
        if (i >= this.f97463c) {
            return new f6y0(i == 0 ? f97460d : Arrays.copyOf(this.f97462b, i), this.f97463c, true);
        }
        fig0.m125680a();
        return null;
    }

    public f6y0(long[] jArr, int i, boolean z) {
        super(z);
        this.f97462b = jArr;
        this.f97463c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m124332c(((Long) obj).longValue());
        return true;
    }
}
