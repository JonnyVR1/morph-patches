package p153l;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class ozx0 extends pux0<Double> implements i4y0<Double>, lby0, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final double[] f149973d;

    /* JADX INFO: renamed from: b */
    public double[] f149974b;

    /* JADX INFO: renamed from: c */
    public int f149975c;

    static {
        double[] dArr = new double[0];
        f149973d = dArr;
        new ozx0(dArr, 0, false);
    }

    public ozx0() {
        this(f149973d, 0, true);
    }

    /* JADX INFO: renamed from: h */
    public static int m170006h(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m173917a();
        if (i < 0 || i > (i2 = this.f149975c)) {
            kym.m151996a(m170010i(i));
            return;
        }
        double[] dArr = this.f149974b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[m170006h(dArr.length)];
            System.arraycopy(this.f149974b, 0, dArr2, 0, i);
            System.arraycopy(this.f149974b, i, dArr2, i + 1, this.f149975c - i);
            this.f149974b = dArr2;
        }
        this.f149974b[i] = dDoubleValue;
        this.f149975c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p153l.pux0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m173917a();
        i2y0.m138253e(collection);
        if (!(collection instanceof ozx0)) {
            return super.addAll(collection);
        }
        ozx0 ozx0Var = (ozx0) collection;
        int i = ozx0Var.f149975c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f149975c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        double[] dArr = this.f149974b;
        if (i3 > dArr.length) {
            this.f149974b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(ozx0Var.f149974b, 0, this.f149974b, this.f149975c, ozx0Var.f149975c);
        this.f149975c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m170007c(double d) {
        m173917a();
        int i = this.f149975c;
        double[] dArr = this.f149974b;
        if (i == dArr.length) {
            double[] dArr2 = new double[m170006h(dArr.length)];
            System.arraycopy(this.f149974b, 0, dArr2, 0, this.f149975c);
            this.f149974b = dArr2;
        }
        double[] dArr3 = this.f149974b;
        int i2 = this.f149975c;
        this.f149975c = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p153l.pux0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozx0)) {
            return super.equals(obj);
        }
        ozx0 ozx0Var = (ozx0) obj;
        if (this.f149975c != ozx0Var.f149975c) {
            return false;
        }
        double[] dArr = ozx0Var.f149974b;
        for (int i = 0; i < this.f149975c; i++) {
            if (Double.doubleToLongBits(this.f149974b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final double m170008f(int i) {
        m170011j(i);
        return this.f149974b[i];
    }

    /* JADX INFO: renamed from: g */
    public final void m170009g(int i) {
        double[] dArr = this.f149974b;
        if (i <= dArr.length) {
            return;
        }
        if (dArr.length == 0) {
            this.f149974b = new double[Math.max(i, 10)];
            return;
        }
        int length = dArr.length;
        while (length < i) {
            length = m170006h(length);
        }
        this.f149974b = Arrays.copyOf(this.f149974b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Double.valueOf(m170008f(i));
    }

    @Override // p153l.pux0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM138250b = 1;
        for (int i = 0; i < this.f149975c; i++) {
            iM138250b = (iM138250b * 31) + i2y0.m138250b(Double.doubleToLongBits(this.f149974b[i]));
        }
        return iM138250b;
    }

    /* JADX INFO: renamed from: i */
    public final String m170010i(int i) {
        return "Index:" + i + ", Size:" + this.f149975c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f149974b[i] == dDoubleValue) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m170011j(int i) {
        if (i < 0 || i >= this.f149975c) {
            kym.m151996a(m170010i(i));
        }
    }

    @Override // p153l.pux0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m173917a();
        m170011j(i);
        double[] dArr = this.f149974b;
        double d = dArr[i];
        int i2 = this.f149975c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f149975c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m173917a();
        if (i2 < i) {
            kym.m151996a("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.f149974b;
        System.arraycopy(dArr, i2, dArr, i, this.f149975c - i2);
        this.f149975c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m173917a();
        m170011j(i);
        double[] dArr = this.f149974b;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f149975c;
    }

    @Override // p153l.i4y0
    public final /* synthetic */ i4y0<Double> zza(int i) {
        if (i >= this.f149975c) {
            return new ozx0(i == 0 ? f149973d : Arrays.copyOf(this.f149974b, i), this.f149975c, true);
        }
        fig0.m125680a();
        return null;
    }

    public ozx0(double[] dArr, int i, boolean z) {
        super(z);
        this.f149974b = dArr;
        this.f149975c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m170007c(((Double) obj).doubleValue());
        return true;
    }
}
