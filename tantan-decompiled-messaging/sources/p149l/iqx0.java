package p149l;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class iqx0 extends jlx0<Double> implements cvx0<Double>, f2y0, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final double[] f114564d;

    /* JADX INFO: renamed from: b */
    public double[] f114565b;

    /* JADX INFO: renamed from: c */
    public int f114566c;

    static {
        double[] dArr = new double[0];
        f114564d = dArr;
        new iqx0(dArr, 0, false);
    }

    public iqx0() {
        this(f114564d, 0, true);
    }

    /* JADX INFO: renamed from: h */
    public static int m137810h(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m142120a();
        if (i < 0 || i > (i2 = this.f114566c)) {
            jwm.m143661a(m137814i(i));
            return;
        }
        double[] dArr = this.f114565b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[m137810h(dArr.length)];
            System.arraycopy(this.f114565b, 0, dArr2, 0, i);
            System.arraycopy(this.f114565b, i, dArr2, i + 1, this.f114566c - i);
            this.f114565b = dArr2;
        }
        this.f114565b[i] = dDoubleValue;
        this.f114566c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p149l.jlx0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m142120a();
        ctx0.m108707e(collection);
        if (!(collection instanceof iqx0)) {
            return super.addAll(collection);
        }
        iqx0 iqx0Var = (iqx0) collection;
        int i = iqx0Var.f114566c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f114566c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        double[] dArr = this.f114565b;
        if (i3 > dArr.length) {
            this.f114565b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(iqx0Var.f114565b, 0, this.f114565b, this.f114566c, iqx0Var.f114566c);
        this.f114566c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m137811c(double d) {
        m142120a();
        int i = this.f114566c;
        double[] dArr = this.f114565b;
        if (i == dArr.length) {
            double[] dArr2 = new double[m137810h(dArr.length)];
            System.arraycopy(this.f114565b, 0, dArr2, 0, this.f114566c);
            this.f114565b = dArr2;
        }
        double[] dArr3 = this.f114565b;
        int i2 = this.f114566c;
        this.f114566c = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p149l.jlx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqx0)) {
            return super.equals(obj);
        }
        iqx0 iqx0Var = (iqx0) obj;
        if (this.f114566c != iqx0Var.f114566c) {
            return false;
        }
        double[] dArr = iqx0Var.f114565b;
        for (int i = 0; i < this.f114566c; i++) {
            if (Double.doubleToLongBits(this.f114565b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final double m137812f(int i) {
        m137815j(i);
        return this.f114565b[i];
    }

    /* JADX INFO: renamed from: g */
    public final void m137813g(int i) {
        double[] dArr = this.f114565b;
        if (i <= dArr.length) {
            return;
        }
        if (dArr.length == 0) {
            this.f114565b = new double[Math.max(i, 10)];
            return;
        }
        int length = dArr.length;
        while (length < i) {
            length = m137810h(length);
        }
        this.f114565b = Arrays.copyOf(this.f114565b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Double.valueOf(m137812f(i));
    }

    @Override // p149l.jlx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM108704b = 1;
        for (int i = 0; i < this.f114566c; i++) {
            iM108704b = (iM108704b * 31) + ctx0.m108704b(Double.doubleToLongBits(this.f114565b[i]));
        }
        return iM108704b;
    }

    /* JADX INFO: renamed from: i */
    public final String m137814i(int i) {
        return "Index:" + i + ", Size:" + this.f114566c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f114565b[i] == dDoubleValue) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m137815j(int i) {
        if (i < 0 || i >= this.f114566c) {
            jwm.m143661a(m137814i(i));
        }
    }

    @Override // p149l.jlx0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m142120a();
        m137815j(i);
        double[] dArr = this.f114565b;
        double d = dArr[i];
        int i2 = this.f114566c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f114566c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m142120a();
        if (i2 < i) {
            jwm.m143661a("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.f114565b;
        System.arraycopy(dArr, i2, dArr, i, this.f114566c - i2);
        this.f114566c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m142120a();
        m137815j(i);
        double[] dArr = this.f114565b;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f114566c;
    }

    @Override // p149l.cvx0
    public final /* synthetic */ cvx0<Double> zza(int i) {
        if (i >= this.f114566c) {
            return new iqx0(i == 0 ? f114564d : Arrays.copyOf(this.f114565b, i), this.f114566c, true);
        }
        x9g0.m207497a();
        return null;
    }

    public iqx0(double[] dArr, int i, boolean z) {
        super(z);
        this.f114565b = dArr;
        this.f114566c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m137811c(((Double) obj).doubleValue());
        return true;
    }
}
