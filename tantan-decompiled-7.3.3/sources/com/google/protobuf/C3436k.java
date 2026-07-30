package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p153l.fig0;
import p153l.jym;
import p153l.kym;

/* JADX INFO: renamed from: com.google.protobuf.k */
/* JADX INFO: loaded from: classes7.dex */
public final class C3436k extends AbstractC3428c<Integer> implements C3437l.f, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C3436k f11640d;

    /* JADX INFO: renamed from: b */
    public int[] f11641b;

    /* JADX INFO: renamed from: c */
    public int f11642c;

    static {
        C3436k c3436k = new C3436k();
        f11640d = c3436k;
        c3436k.mo17139n();
    }

    public C3436k() {
        this(new int[10], 0);
    }

    /* JADX INFO: renamed from: g */
    public static C3436k m17252g() {
        return f11640d;
    }

    /* JADX INFO: renamed from: h */
    private void m17253h(int i) {
        if (i < 0 || i >= this.f11642c) {
            kym.m151996a(m17254j(i));
        }
    }

    /* JADX INFO: renamed from: j */
    private String m17254j(int i) {
        return "Index:" + i + ", Size:" + this.f11642c;
    }

    @Override // com.google.protobuf.C3437l.f
    /* JADX INFO: renamed from: U */
    public void mo17255U(int i) {
        m17257f(this.f11642c, i);
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        m17138a();
        collection.getClass();
        if (!(collection instanceof C3436k)) {
            return super.addAll(collection);
        }
        C3436k c3436k = (C3436k) collection;
        int i = c3436k.f11642c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11642c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        int[] iArr = this.f11641b;
        if (i3 > iArr.length) {
            this.f11641b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c3436k.f11641b, 0, this.f11641b, this.f11642c, c3436k.f11642c);
        this.f11642c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, Integer num) {
        m17257f(i, num.intValue());
    }

    @Override // com.google.protobuf.C3437l.h, com.google.protobuf.C3437l.a
    /* JADX INFO: renamed from: d */
    public C3437l.h<Integer> mo17143d(int i) {
        if (i >= this.f11642c) {
            return new C3436k(Arrays.copyOf(this.f11641b, i), this.f11642c);
        }
        fig0.m125680a();
        return null;
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3436k)) {
            return super.equals(obj);
        }
        C3436k c3436k = (C3436k) obj;
        if (this.f11642c != c3436k.f11642c) {
            return false;
        }
        int[] iArr = c3436k.f11641b;
        for (int i = 0; i < this.f11642c; i++) {
            if (this.f11641b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m17257f(int i, int i2) {
        int i3;
        m17138a();
        if (i < 0 || i > (i3 = this.f11642c)) {
            kym.m151996a(m17254j(i));
            return;
        }
        int[] iArr = this.f11641b;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f11641b, i, iArr2, i + 1, this.f11642c - i);
            this.f11641b = iArr2;
        }
        this.f11641b[i] = i2;
        this.f11642c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.C3437l.f
    public int getInt(int i) {
        m17253h(i);
        return this.f11641b[i];
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f11642c; i2++) {
            i = (i * 31) + this.f11641b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i) {
        m17138a();
        m17253h(i);
        int[] iArr = this.f11641b;
        int i2 = iArr[i];
        System.arraycopy(iArr, i + 1, iArr, i, this.f11642c - i);
        this.f11642c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(setInt(i, num.intValue()));
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m17138a();
        for (int i = 0; i < this.f11642c; i++) {
            if (obj.equals(Integer.valueOf(this.f11641b[i]))) {
                int[] iArr = this.f11641b;
                System.arraycopy(iArr, i + 1, iArr, i, this.f11642c - i);
                this.f11642c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.C3437l.f
    public int setInt(int i, int i2) {
        m17138a();
        m17253h(i);
        int[] iArr = this.f11641b;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11642c;
    }

    public C3436k(int[] iArr, int i) {
        this.f11641b = iArr;
        this.f11642c = i;
    }
}
