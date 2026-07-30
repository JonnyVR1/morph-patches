package p149l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class j2x0 extends gfw0 implements RandomAccess, iix0, vnx0 {

    /* JADX INFO: renamed from: d */
    public static final double[] f115984d;

    /* JADX INFO: renamed from: b */
    public double[] f115985b;

    /* JADX INFO: renamed from: c */
    public int f115986c;

    static {
        double[] dArr = new double[0];
        f115984d = dArr;
        new j2x0(dArr, 0, false);
    }

    public j2x0() {
        this(f115984d, 0, true);
    }

    /* JADX INFO: renamed from: h */
    public static int m139507h(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m125929a();
        if (i < 0 || i > (i2 = this.f115986c)) {
            jwm.m143661a(m139511i(i));
            return;
        }
        int i3 = i + 1;
        double[] dArr = this.f115985b;
        int length = dArr.length;
        if (i2 < length) {
            System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[m139507h(length)];
            System.arraycopy(this.f115985b, 0, dArr2, 0, i);
            System.arraycopy(this.f115985b, i, dArr2, i3, this.f115986c - i);
            this.f115985b = dArr2;
        }
        this.f115985b[i] = dDoubleValue;
        this.f115986c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p149l.gfw0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m125929a();
        Charset charset = mix0.f134047a;
        collection.getClass();
        if (!(collection instanceof j2x0)) {
            return super.addAll(collection);
        }
        j2x0 j2x0Var = (j2x0) collection;
        int i = j2x0Var.f115986c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f115986c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        double[] dArr = this.f115985b;
        if (i3 > dArr.length) {
            this.f115985b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(j2x0Var.f115985b, 0, this.f115985b, this.f115986c, j2x0Var.f115986c);
        this.f115986c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final double m139508c(int i) {
        m139512j(i);
        return this.f115985b[i];
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
        if (!(obj instanceof j2x0)) {
            return super.equals(obj);
        }
        j2x0 j2x0Var = (j2x0) obj;
        if (this.f115986c != j2x0Var.f115986c) {
            return false;
        }
        double[] dArr = j2x0Var.f115985b;
        for (int i = 0; i < this.f115986c; i++) {
            if (Double.doubleToLongBits(this.f115985b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m139509f(double d) {
        m125929a();
        int i = this.f115986c;
        int length = this.f115985b.length;
        if (i == length) {
            double[] dArr = new double[m139507h(length)];
            System.arraycopy(this.f115985b, 0, dArr, 0, this.f115986c);
            this.f115985b = dArr;
        }
        double[] dArr2 = this.f115985b;
        int i2 = this.f115986c;
        this.f115986c = i2 + 1;
        dArr2[i2] = d;
    }

    /* JADX INFO: renamed from: g */
    public final void m139510g(int i) {
        int length = this.f115985b.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f115985b = new double[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = m139507h(length);
        }
        this.f115985b = Arrays.copyOf(this.f115985b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m139512j(i);
        return Double.valueOf(this.f115985b[i]);
    }

    @Override // p149l.gfw0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f115986c; i2++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f115985b[i2]);
            Charset charset = mix0.f134047a;
            i = (i * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final String m139511i(int i) {
        return "Index:" + i + ", Size:" + this.f115986c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f115986c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f115985b[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m139512j(int i) {
        if (i < 0 || i >= this.f115986c) {
            jwm.m143661a(m139511i(i));
        }
    }

    @Override // p149l.gfw0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m125929a();
        m139512j(i);
        double[] dArr = this.f115985b;
        double d = dArr[i];
        int i2 = this.f115986c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f115986c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m125929a();
        if (i2 < i) {
            jwm.m143661a("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.f115985b;
        System.arraycopy(dArr, i2, dArr, i, this.f115986c - i2);
        this.f115986c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m125929a();
        m139512j(i);
        double[] dArr = this.f115985b;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f115986c;
    }

    @Override // p149l.iix0
    public final /* bridge */ /* synthetic */ iix0 zzd(int i) {
        if (i >= this.f115986c) {
            return new j2x0(i == 0 ? f115984d : Arrays.copyOf(this.f115985b, i), this.f115986c, true);
        }
        x9g0.m207497a();
        return null;
    }

    public j2x0(double[] dArr, int i, boolean z) {
        super(z);
        this.f115985b = dArr;
        this.f115986c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m139509f(((Double) obj).doubleValue());
        return true;
    }
}
