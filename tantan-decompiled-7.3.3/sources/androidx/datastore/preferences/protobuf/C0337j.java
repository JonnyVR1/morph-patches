package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p153l.fig0;
import p153l.jym;
import p153l.kym;
import p153l.ru80;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0337j extends AbstractC0323c<Double> implements C0351s.b, RandomAccess, ru80 {

    /* JADX INFO: renamed from: d */
    public static final C0337j f1683d;

    /* JADX INFO: renamed from: b */
    public double[] f1684b;

    /* JADX INFO: renamed from: c */
    public int f1685c;

    static {
        C0337j c0337j = new C0337j(new double[0], 0);
        f1683d = c0337j;
        c0337j.mo1820n();
    }

    public C0337j() {
        this(new double[10], 0);
    }

    /* JADX INFO: renamed from: i */
    private void m2129i(int i) {
        if (i < 0 || i >= this.f1685c) {
            kym.m151996a(m2130o(i));
        }
    }

    /* JADX INFO: renamed from: o */
    private String m2130o(int i) {
        return "Index:" + i + ", Size:" + this.f1685c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        m1819a();
        C0351s.m2340a(collection);
        if (!(collection instanceof C0337j)) {
            return super.addAll(collection);
        }
        C0337j c0337j = (C0337j) collection;
        int i = c0337j.f1685c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f1685c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        double[] dArr = this.f1684b;
        if (i3 > dArr.length) {
            this.f1684b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(c0337j.f1684b, 0, this.f1684b, this.f1685c, c0337j.f1685c);
        this.f1685c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, Double d) {
        m2134h(i, d.doubleValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0337j)) {
            return super.equals(obj);
        }
        C0337j c0337j = (C0337j) obj;
        if (this.f1685c != c0337j.f1685c) {
            return false;
        }
        double[] dArr = c0337j.f1684b;
        for (int i = 0; i < this.f1685c; i++) {
            if (Double.doubleToLongBits(this.f1684b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d) {
        m2133g(d.doubleValue());
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m2133g(double d) {
        m1819a();
        int i = this.f1685c;
        double[] dArr = this.f1684b;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f1684b = dArr2;
        }
        double[] dArr3 = this.f1684b;
        int i2 = this.f1685c;
        this.f1685c = i2 + 1;
        dArr3[i2] = d;
    }

    /* JADX INFO: renamed from: h */
    public final void m2134h(int i, double d) {
        int i2;
        m1819a();
        if (i < 0 || i > (i2 = this.f1685c)) {
            kym.m151996a(m2130o(i));
            return;
        }
        double[] dArr = this.f1684b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f1684b, i, dArr2, i + 1, this.f1685c - i);
            this.f1684b = dArr2;
        }
        this.f1684b[i] = d;
        this.f1685c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM2345f = 1;
        for (int i = 0; i < this.f1685c; i++) {
            iM2345f = (iM2345f * 31) + C0351s.m2345f(Double.doubleToLongBits(this.f1684b[i]));
        }
        return iM2345f;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Double get(int i) {
        return Double.valueOf(m2136l(i));
    }

    /* JADX INFO: renamed from: l */
    public double m2136l(int i) {
        m2129i(i);
        return this.f1684b[i];
    }

    @Override // androidx.datastore.preferences.protobuf.C0351s.i
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C0351s.b mo2015d(int i) {
        if (i >= this.f1685c) {
            return new C0337j(Arrays.copyOf(this.f1684b, i), this.f1685c);
        }
        fig0.m125680a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Double remove(int i) {
        m1819a();
        m2129i(i);
        double[] dArr = this.f1684b;
        double d = dArr[i];
        int i2 = this.f1685c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f1685c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m1819a();
        for (int i = 0; i < this.f1685c; i++) {
            if (obj.equals(Double.valueOf(this.f1684b[i]))) {
                double[] dArr = this.f1684b;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f1685c - i) - 1);
                this.f1685c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        m1819a();
        if (i2 < i) {
            kym.m151996a("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.f1684b;
        System.arraycopy(dArr, i2, dArr, i, this.f1685c - i2);
        this.f1685c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Double set(int i, Double d) {
        return Double.valueOf(m2140v(i, d.doubleValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f1685c;
    }

    /* JADX INFO: renamed from: v */
    public double m2140v(int i, double d) {
        m1819a();
        m2129i(i);
        double[] dArr = this.f1684b;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    public C0337j(double[] dArr, int i) {
        this.f1684b = dArr;
        this.f1685c = i;
    }
}
