package p153l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class ghx0 extends bgx0 implements RandomAccess, fjx0, mkx0 {

    /* JADX INFO: renamed from: d */
    public static final ghx0 f104174d = new ghx0(new double[0], 0, false);

    /* JADX INFO: renamed from: b */
    public double[] f104175b;

    /* JADX INFO: renamed from: c */
    public int f104176c;

    public ghx0() {
        this(new double[10], 0, true);
    }

    /* JADX INFO: renamed from: f */
    private final String m130280f(int i) {
        return "Index:" + i + ", Size:" + this.f104176c;
    }

    /* JADX INFO: renamed from: g */
    private final void m130281g(int i) {
        if (i < 0 || i >= this.f104176c) {
            kym.m151996a(m130280f(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m104285a();
        if (i < 0 || i > (i2 = this.f104176c)) {
            kym.m151996a(m130280f(i));
            return;
        }
        int i3 = i + 1;
        double[] dArr = this.f104175b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f104175b, i, dArr2, i3, this.f104176c - i);
            this.f104175b = dArr2;
        }
        this.f104175b[i] = dDoubleValue;
        this.f104176c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p153l.bgx0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m104285a();
        Charset charset = gjx0.f104688a;
        collection.getClass();
        if (!(collection instanceof ghx0)) {
            return super.addAll(collection);
        }
        ghx0 ghx0Var = (ghx0) collection;
        int i = ghx0Var.f104176c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f104176c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        double[] dArr = this.f104175b;
        if (i3 > dArr.length) {
            this.f104175b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(ghx0Var.f104175b, 0, this.f104175b, this.f104176c, ghx0Var.f104176c);
        this.f104176c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m130282c(double d) {
        m104285a();
        int i = this.f104176c;
        double[] dArr = this.f104175b;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f104175b = dArr2;
        }
        double[] dArr3 = this.f104175b;
        int i2 = this.f104176c;
        this.f104176c = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghx0)) {
            return super.equals(obj);
        }
        ghx0 ghx0Var = (ghx0) obj;
        if (this.f104176c != ghx0Var.f104176c) {
            return false;
        }
        double[] dArr = ghx0Var.f104175b;
        for (int i = 0; i < this.f104176c; i++) {
            if (Double.doubleToLongBits(this.f104175b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m130281g(i);
        return Double.valueOf(this.f104175b[i]);
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f104176c; i2++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f104175b[i2]);
            Charset charset = gjx0.f104688a;
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
        int i = this.f104176c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f104175b[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m104285a();
        m130281g(i);
        double[] dArr = this.f104175b;
        double d = dArr[i];
        int i2 = this.f104176c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f104176c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m104285a();
        if (i2 < i) {
            kym.m151996a("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.f104175b;
        System.arraycopy(dArr, i2, dArr, i, this.f104176c - i2);
        this.f104176c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m104285a();
        m130281g(i);
        double[] dArr = this.f104175b;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f104176c;
    }

    @Override // p153l.fjx0
    public final /* bridge */ /* synthetic */ fjx0 zzd(int i) {
        if (i >= this.f104176c) {
            return new ghx0(Arrays.copyOf(this.f104175b, i), this.f104176c, true);
        }
        fig0.m125680a();
        return null;
    }

    public ghx0(double[] dArr, int i, boolean z) {
        super(z);
        this.f104175b = dArr;
        this.f104176c = i;
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m130282c(((Double) obj).doubleValue());
        return true;
    }
}
