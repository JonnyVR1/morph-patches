package p149l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class kax0 extends v6x0 implements RandomAccess, y9x0, gbx0 {

    /* JADX INFO: renamed from: d */
    public static final kax0 f122158d = new kax0(new long[0], 0, false);

    /* JADX INFO: renamed from: b */
    public long[] f122159b;

    /* JADX INFO: renamed from: c */
    public int f122160c;

    public kax0() {
        this(new long[10], 0, true);
    }

    /* JADX INFO: renamed from: f */
    public static kax0 m145189f() {
        return f122158d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m197278a();
        if (i < 0 || i > (i2 = this.f122160c)) {
            jwm.m143661a(m145192h(i));
            return;
        }
        int i3 = i + 1;
        long[] jArr = this.f122159b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f122159b, i, jArr2, i3, this.f122160c - i);
            this.f122159b = jArr2;
        }
        this.f122159b[i] = jLongValue;
        this.f122160c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p149l.v6x0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m197278a();
        Charset charset = aax0.f68607a;
        collection.getClass();
        if (!(collection instanceof kax0)) {
            return super.addAll(collection);
        }
        kax0 kax0Var = (kax0) collection;
        int i = kax0Var.f122160c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f122160c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        long[] jArr = this.f122159b;
        if (i3 > jArr.length) {
            this.f122159b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(kax0Var.f122159b, 0, this.f122159b, this.f122160c, kax0Var.f122160c);
        this.f122160c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final long m145190c(int i) {
        m145193i(i);
        return this.f122159b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kax0)) {
            return super.equals(obj);
        }
        kax0 kax0Var = (kax0) obj;
        if (this.f122160c != kax0Var.f122160c) {
            return false;
        }
        long[] jArr = kax0Var.f122159b;
        for (int i = 0; i < this.f122160c; i++) {
            if (this.f122159b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m145191g(long j) {
        m197278a();
        int i = this.f122160c;
        long[] jArr = this.f122159b;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f122159b = jArr2;
        }
        long[] jArr3 = this.f122159b;
        int i2 = this.f122160c;
        this.f122160c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m145193i(i);
        return Long.valueOf(this.f122159b[i]);
    }

    /* JADX INFO: renamed from: h */
    public final String m145192h(int i) {
        return "Index:" + i + ", Size:" + this.f122160c;
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f122160c; i2++) {
            long j = this.f122159b[i2];
            Charset charset = aax0.f68607a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final void m145193i(int i) {
        if (i < 0 || i >= this.f122160c) {
            jwm.m143661a(m145192h(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f122160c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f122159b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m197278a();
        m145193i(i);
        long[] jArr = this.f122159b;
        long j = jArr[i];
        int i2 = this.f122160c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f122160c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m197278a();
        if (i2 < i) {
            jwm.m143661a("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f122159b;
        System.arraycopy(jArr, i2, jArr, i, this.f122160c - i2);
        this.f122160c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m197278a();
        m145193i(i);
        long[] jArr = this.f122159b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f122160c;
    }

    @Override // p149l.z9x0
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final y9x0 zzd(int i) {
        if (i >= this.f122160c) {
            return new kax0(Arrays.copyOf(this.f122159b, i), this.f122160c, true);
        }
        x9g0.m207497a();
        return null;
    }

    public kax0(long[] jArr, int i, boolean z) {
        super(z);
        this.f122159b = jArr;
        this.f122160c = i;
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m145191g(((Long) obj).longValue());
        return true;
    }
}
