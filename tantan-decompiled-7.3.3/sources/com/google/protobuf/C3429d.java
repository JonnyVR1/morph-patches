package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p153l.fig0;
import p153l.jym;
import p153l.kym;

/* JADX INFO: renamed from: com.google.protobuf.d */
/* JADX INFO: loaded from: classes7.dex */
public final class C3429d extends AbstractC3428c<Boolean> implements C3437l.a, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C3429d f11607d;

    /* JADX INFO: renamed from: b */
    public boolean[] f11608b;

    /* JADX INFO: renamed from: c */
    public int f11609c;

    static {
        C3429d c3429d = new C3429d();
        f11607d = c3429d;
        c3429d.mo17139n();
    }

    public C3429d() {
        this(new boolean[10], 0);
    }

    /* JADX INFO: renamed from: g */
    public static C3429d m17141g() {
        return f11607d;
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        m17138a();
        collection.getClass();
        if (!(collection instanceof C3429d)) {
            return super.addAll(collection);
        }
        C3429d c3429d = (C3429d) collection;
        int i = c3429d.f11609c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11609c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f11608b;
        if (i3 > zArr.length) {
            this.f11608b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(c3429d.f11608b, 0, this.f11608b, this.f11609c, c3429d.f11609c);
        this.f11609c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, Boolean bool) {
        m17144f(i, bool.booleanValue());
    }

    @Override // com.google.protobuf.C3437l.h, com.google.protobuf.C3437l.a
    /* JADX INFO: renamed from: d */
    public C3437l.h<Boolean> mo17143d(int i) {
        if (i >= this.f11609c) {
            return new C3429d(Arrays.copyOf(this.f11608b, i), this.f11609c);
        }
        fig0.m125680a();
        return null;
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3429d)) {
            return super.equals(obj);
        }
        C3429d c3429d = (C3429d) obj;
        if (this.f11609c != c3429d.f11609c) {
            return false;
        }
        boolean[] zArr = c3429d.f11608b;
        for (int i = 0; i < this.f11609c; i++) {
            if (this.f11608b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m17144f(int i, boolean z) {
        int i2;
        m17138a();
        if (i < 0 || i > (i2 = this.f11609c)) {
            kym.m151996a(m17148l(i));
            return;
        }
        boolean[] zArr = this.f11608b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f11608b, i, zArr2, i + 1, this.f11609c - i);
            this.f11608b = zArr2;
        }
        this.f11608b[i] = z;
        this.f11609c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: h */
    public final void m17145h(int i) {
        if (i < 0 || i >= this.f11609c) {
            kym.m151996a(m17148l(i));
        }
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM17262b = 1;
        for (int i = 0; i < this.f11609c; i++) {
            iM17262b = (iM17262b * 31) + C3437l.m17262b(this.f11608b[i]);
        }
        return iM17262b;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i) {
        return Boolean.valueOf(m17147j(i));
    }

    /* JADX INFO: renamed from: j */
    public boolean m17147j(int i) {
        m17145h(i);
        return this.f11608b[i];
    }

    /* JADX INFO: renamed from: l */
    public final String m17148l(int i) {
        return "Index:" + i + ", Size:" + this.f11609c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i) {
        m17138a();
        m17145h(i);
        boolean[] zArr = this.f11608b;
        boolean z = zArr[i];
        System.arraycopy(zArr, i + 1, zArr, i, this.f11609c - i);
        this.f11609c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(m17151r(i, bool.booleanValue()));
    }

    /* JADX INFO: renamed from: r */
    public boolean m17151r(int i, boolean z) {
        m17138a();
        m17145h(i);
        boolean[] zArr = this.f11608b;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m17138a();
        for (int i = 0; i < this.f11609c; i++) {
            if (obj.equals(Boolean.valueOf(this.f11608b[i]))) {
                boolean[] zArr = this.f11608b;
                System.arraycopy(zArr, i + 1, zArr, i, this.f11609c - i);
                this.f11609c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11609c;
    }

    public C3429d(boolean[] zArr, int i) {
        this.f11608b = zArr;
        this.f11609c = i;
    }
}
