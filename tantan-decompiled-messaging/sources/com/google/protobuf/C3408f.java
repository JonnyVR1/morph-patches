package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p149l.iwm;
import p149l.jwm;
import p149l.x9g0;

/* JADX INFO: renamed from: com.google.protobuf.f */
/* JADX INFO: loaded from: classes7.dex */
public final class C3408f extends AbstractC3405c<Double> implements C3414l.b, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C3408f f11586d;

    /* JADX INFO: renamed from: b */
    public double[] f11587b;

    /* JADX INFO: renamed from: c */
    public int f11588c;

    static {
        C3408f c3408f = new C3408f();
        f11586d = c3408f;
        c3408f.mo17084n();
    }

    public C3408f() {
        this(new double[10], 0);
    }

    /* JADX INFO: renamed from: g */
    public static C3408f m17147g() {
        return f11586d;
    }

    /* JADX INFO: renamed from: h */
    private void m17148h(int i) {
        if (i < 0 || i >= this.f11588c) {
            jwm.m143661a(m17149l(i));
        }
    }

    /* JADX INFO: renamed from: l */
    private String m17149l(int i) {
        return "Index:" + i + ", Size:" + this.f11588c;
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        m17083a();
        collection.getClass();
        if (!(collection instanceof C3408f)) {
            return super.addAll(collection);
        }
        C3408f c3408f = (C3408f) collection;
        int i = c3408f.f11588c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11588c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        double[] dArr = this.f11587b;
        if (i3 > dArr.length) {
            this.f11587b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(c3408f.f11587b, 0, this.f11587b, this.f11588c, c3408f.f11588c);
        this.f11588c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, Double d) {
        m17151f(i, d.doubleValue());
    }

    @Override // com.google.protobuf.C3414l.h, com.google.protobuf.C3414l.a
    /* JADX INFO: renamed from: d */
    public C3414l.h<Double> mo17088d(int i) {
        if (i >= this.f11588c) {
            return new C3408f(Arrays.copyOf(this.f11587b, i), this.f11588c);
        }
        x9g0.m207497a();
        return null;
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3408f)) {
            return super.equals(obj);
        }
        C3408f c3408f = (C3408f) obj;
        if (this.f11588c != c3408f.f11588c) {
            return false;
        }
        double[] dArr = c3408f.f11587b;
        for (int i = 0; i < this.f11588c; i++) {
            if (this.f11587b[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m17151f(int i, double d) {
        int i2;
        m17083a();
        if (i < 0 || i > (i2 = this.f11588c)) {
            jwm.m143661a(m17149l(i));
            return;
        }
        double[] dArr = this.f11587b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f11587b, i, dArr2, i + 1, this.f11588c - i);
            this.f11587b = dArr2;
        }
        this.f11587b[i] = d;
        this.f11588c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM17210e = 1;
        for (int i = 0; i < this.f11588c; i++) {
            iM17210e = (iM17210e * 31) + C3414l.m17210e(Double.doubleToLongBits(this.f11587b[i]));
        }
        return iM17210e;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Double get(int i) {
        return Double.valueOf(m17153j(i));
    }

    /* JADX INFO: renamed from: j */
    public double m17153j(int i) {
        m17148h(i);
        return this.f11587b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Double remove(int i) {
        m17083a();
        m17148h(i);
        double[] dArr = this.f11587b;
        double d = dArr[i];
        System.arraycopy(dArr, i + 1, dArr, i, this.f11588c - i);
        this.f11588c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Double set(int i, Double d) {
        return Double.valueOf(m17156r(i, d.doubleValue()));
    }

    /* JADX INFO: renamed from: r */
    public double m17156r(int i, double d) {
        m17083a();
        m17148h(i);
        double[] dArr = this.f11587b;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m17083a();
        for (int i = 0; i < this.f11588c; i++) {
            if (obj.equals(Double.valueOf(this.f11587b[i]))) {
                double[] dArr = this.f11587b;
                System.arraycopy(dArr, i + 1, dArr, i, this.f11588c - i);
                this.f11588c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11588c;
    }

    public C3408f(double[] dArr, int i) {
        this.f11587b = dArr;
        this.f11588c = i;
    }
}
