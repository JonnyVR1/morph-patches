package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p153l.fig0;
import p153l.jym;
import p153l.kym;

/* JADX INFO: renamed from: com.google.protobuf.f */
/* JADX INFO: loaded from: classes7.dex */
public final class C3431f extends AbstractC3428c<Double> implements C3437l.b, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C3431f f11623d;

    /* JADX INFO: renamed from: b */
    public double[] f11624b;

    /* JADX INFO: renamed from: c */
    public int f11625c;

    static {
        C3431f c3431f = new C3431f();
        f11623d = c3431f;
        c3431f.mo17139n();
    }

    public C3431f() {
        this(new double[10], 0);
    }

    /* JADX INFO: renamed from: g */
    public static C3431f m17202g() {
        return f11623d;
    }

    /* JADX INFO: renamed from: h */
    private void m17203h(int i) {
        if (i < 0 || i >= this.f11625c) {
            kym.m151996a(m17204l(i));
        }
    }

    /* JADX INFO: renamed from: l */
    private String m17204l(int i) {
        return "Index:" + i + ", Size:" + this.f11625c;
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        m17138a();
        collection.getClass();
        if (!(collection instanceof C3431f)) {
            return super.addAll(collection);
        }
        C3431f c3431f = (C3431f) collection;
        int i = c3431f.f11625c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11625c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        double[] dArr = this.f11624b;
        if (i3 > dArr.length) {
            this.f11624b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(c3431f.f11624b, 0, this.f11624b, this.f11625c, c3431f.f11625c);
        this.f11625c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, Double d) {
        m17206f(i, d.doubleValue());
    }

    @Override // com.google.protobuf.C3437l.h, com.google.protobuf.C3437l.a
    /* JADX INFO: renamed from: d */
    public C3437l.h<Double> mo17143d(int i) {
        if (i >= this.f11625c) {
            return new C3431f(Arrays.copyOf(this.f11624b, i), this.f11625c);
        }
        fig0.m125680a();
        return null;
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3431f)) {
            return super.equals(obj);
        }
        C3431f c3431f = (C3431f) obj;
        if (this.f11625c != c3431f.f11625c) {
            return false;
        }
        double[] dArr = c3431f.f11624b;
        for (int i = 0; i < this.f11625c; i++) {
            if (this.f11624b[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m17206f(int i, double d) {
        int i2;
        m17138a();
        if (i < 0 || i > (i2 = this.f11625c)) {
            kym.m151996a(m17204l(i));
            return;
        }
        double[] dArr = this.f11624b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f11624b, i, dArr2, i + 1, this.f11625c - i);
            this.f11624b = dArr2;
        }
        this.f11624b[i] = d;
        this.f11625c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM17265e = 1;
        for (int i = 0; i < this.f11625c; i++) {
            iM17265e = (iM17265e * 31) + C3437l.m17265e(Double.doubleToLongBits(this.f11624b[i]));
        }
        return iM17265e;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Double get(int i) {
        return Double.valueOf(m17208j(i));
    }

    /* JADX INFO: renamed from: j */
    public double m17208j(int i) {
        m17203h(i);
        return this.f11624b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Double remove(int i) {
        m17138a();
        m17203h(i);
        double[] dArr = this.f11624b;
        double d = dArr[i];
        System.arraycopy(dArr, i + 1, dArr, i, this.f11625c - i);
        this.f11625c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Double set(int i, Double d) {
        return Double.valueOf(m17211r(i, d.doubleValue()));
    }

    /* JADX INFO: renamed from: r */
    public double m17211r(int i, double d) {
        m17138a();
        m17203h(i);
        double[] dArr = this.f11624b;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m17138a();
        for (int i = 0; i < this.f11625c; i++) {
            if (obj.equals(Double.valueOf(this.f11624b[i]))) {
                double[] dArr = this.f11624b;
                System.arraycopy(dArr, i + 1, dArr, i, this.f11625c - i);
                this.f11625c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11625c;
    }

    public C3431f(double[] dArr, int i) {
        this.f11624b = dArr;
        this.f11625c = i;
    }
}
