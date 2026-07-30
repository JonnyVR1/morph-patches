package p153l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class dux0 extends mow0 implements RandomAccess, orx0, bxx0 {

    /* JADX INFO: renamed from: d */
    public static final long[] f90884d;

    /* JADX INFO: renamed from: b */
    public long[] f90885b;

    /* JADX INFO: renamed from: c */
    public int f90886c;

    static {
        long[] jArr = new long[0];
        f90884d = jArr;
        new dux0(jArr, 0, false);
    }

    public dux0() {
        this(f90884d, 0, true);
    }

    /* JADX INFO: renamed from: h */
    private static int m118224h(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: i */
    private final String m118225i(int i) {
        return "Index:" + i + ", Size:" + this.f90886c;
    }

    /* JADX INFO: renamed from: j */
    private final void m118226j(int i) {
        if (i < 0 || i >= this.f90886c) {
            kym.m151996a(m118225i(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m159318a();
        if (i < 0 || i > (i2 = this.f90886c)) {
            kym.m151996a(m118225i(i));
            return;
        }
        int i3 = i + 1;
        long[] jArr = this.f90885b;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[m118224h(length)];
            System.arraycopy(this.f90885b, 0, jArr2, 0, i);
            System.arraycopy(this.f90885b, i, jArr2, i3, this.f90886c - i);
            this.f90885b = jArr2;
        }
        this.f90885b[i] = jLongValue;
        this.f90886c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p153l.mow0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m159318a();
        Charset charset = srx0.f170385a;
        collection.getClass();
        if (!(collection instanceof dux0)) {
            return super.addAll(collection);
        }
        dux0 dux0Var = (dux0) collection;
        int i = dux0Var.f90886c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f90886c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        long[] jArr = this.f90885b;
        if (i3 > jArr.length) {
            this.f90885b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(dux0Var.f90885b, 0, this.f90885b, this.f90886c, dux0Var.f90886c);
        this.f90886c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final long m118227c(int i) {
        m118226j(i);
        return this.f90885b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p153l.mow0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dux0)) {
            return super.equals(obj);
        }
        dux0 dux0Var = (dux0) obj;
        if (this.f90886c != dux0Var.f90886c) {
            return false;
        }
        long[] jArr = dux0Var.f90885b;
        for (int i = 0; i < this.f90886c; i++) {
            if (this.f90885b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m118228f(long j) {
        m159318a();
        int i = this.f90886c;
        int length = this.f90885b.length;
        if (i == length) {
            long[] jArr = new long[m118224h(length)];
            System.arraycopy(this.f90885b, 0, jArr, 0, this.f90886c);
            this.f90885b = jArr;
        }
        long[] jArr2 = this.f90885b;
        int i2 = this.f90886c;
        this.f90886c = i2 + 1;
        jArr2[i2] = j;
    }

    /* JADX INFO: renamed from: g */
    public final void m118229g(int i) {
        int length = this.f90885b.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f90885b = new long[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = m118224h(length);
        }
        this.f90885b = Arrays.copyOf(this.f90885b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m118226j(i);
        return Long.valueOf(this.f90885b[i]);
    }

    @Override // p153l.mow0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f90886c; i2++) {
            long j = this.f90885b[i2];
            Charset charset = srx0.f170385a;
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
        int i = this.f90886c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f90885b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p153l.mow0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m159318a();
        m118226j(i);
        long[] jArr = this.f90885b;
        long j = jArr[i];
        int i2 = this.f90886c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f90886c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m159318a();
        if (i2 < i) {
            kym.m151996a("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f90885b;
        System.arraycopy(jArr, i2, jArr, i, this.f90886c - i2);
        this.f90886c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m159318a();
        m118226j(i);
        long[] jArr = this.f90885b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f90886c;
    }

    @Override // p153l.orx0
    public final /* bridge */ /* synthetic */ orx0 zzd(int i) {
        if (i >= this.f90886c) {
            return new dux0(i == 0 ? f90884d : Arrays.copyOf(this.f90885b, i), this.f90886c, true);
        }
        fig0.m125680a();
        return null;
    }

    public dux0(long[] jArr, int i, boolean z) {
        super(z);
        this.f90885b = jArr;
        this.f90886c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m118228f(((Long) obj).longValue());
        return true;
    }
}
