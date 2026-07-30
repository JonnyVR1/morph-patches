package p149l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class a8x0 extends v6x0 implements RandomAccess, z9x0, gbx0 {

    /* JADX INFO: renamed from: d */
    public static final a8x0 f68099d = new a8x0(new double[0], 0, false);

    /* JADX INFO: renamed from: b */
    public double[] f68100b;

    /* JADX INFO: renamed from: c */
    public int f68101c;

    public a8x0() {
        this(new double[10], 0, true);
    }

    /* JADX INFO: renamed from: f */
    private final String m95385f(int i) {
        return "Index:" + i + ", Size:" + this.f68101c;
    }

    /* JADX INFO: renamed from: g */
    private final void m95386g(int i) {
        if (i < 0 || i >= this.f68101c) {
            jwm.m143661a(m95385f(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m197278a();
        if (i < 0 || i > (i2 = this.f68101c)) {
            jwm.m143661a(m95385f(i));
            return;
        }
        int i3 = i + 1;
        double[] dArr = this.f68100b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f68100b, i, dArr2, i3, this.f68101c - i);
            this.f68100b = dArr2;
        }
        this.f68100b[i] = dDoubleValue;
        this.f68101c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p149l.v6x0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m197278a();
        Charset charset = aax0.f68607a;
        collection.getClass();
        if (!(collection instanceof a8x0)) {
            return super.addAll(collection);
        }
        a8x0 a8x0Var = (a8x0) collection;
        int i = a8x0Var.f68101c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f68101c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        double[] dArr = this.f68100b;
        if (i3 > dArr.length) {
            this.f68100b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(a8x0Var.f68100b, 0, this.f68100b, this.f68101c, a8x0Var.f68101c);
        this.f68101c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m95387c(double d) {
        m197278a();
        int i = this.f68101c;
        double[] dArr = this.f68100b;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f68100b = dArr2;
        }
        double[] dArr3 = this.f68100b;
        int i2 = this.f68101c;
        this.f68101c = i2 + 1;
        dArr3[i2] = d;
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
        if (!(obj instanceof a8x0)) {
            return super.equals(obj);
        }
        a8x0 a8x0Var = (a8x0) obj;
        if (this.f68101c != a8x0Var.f68101c) {
            return false;
        }
        double[] dArr = a8x0Var.f68100b;
        for (int i = 0; i < this.f68101c; i++) {
            if (Double.doubleToLongBits(this.f68100b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m95386g(i);
        return Double.valueOf(this.f68100b[i]);
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f68101c; i2++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f68100b[i2]);
            Charset charset = aax0.f68607a;
            i = (i * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f68101c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f68100b[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m197278a();
        m95386g(i);
        double[] dArr = this.f68100b;
        double d = dArr[i];
        int i2 = this.f68101c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f68101c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m197278a();
        if (i2 < i) {
            jwm.m143661a("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.f68100b;
        System.arraycopy(dArr, i2, dArr, i, this.f68101c - i2);
        this.f68101c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m197278a();
        m95386g(i);
        double[] dArr = this.f68100b;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f68101c;
    }

    @Override // p149l.z9x0
    public final /* bridge */ /* synthetic */ z9x0 zzd(int i) {
        if (i >= this.f68101c) {
            return new a8x0(Arrays.copyOf(this.f68100b, i), this.f68101c, true);
        }
        x9g0.m207497a();
        return null;
    }

    public a8x0(double[] dArr, int i, boolean z) {
        super(z);
        this.f68100b = dArr;
        this.f68101c = i;
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m95387c(((Double) obj).doubleValue());
        return true;
    }
}
