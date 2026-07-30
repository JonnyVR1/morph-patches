package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p153l.fig0;
import p153l.jym;
import p153l.kym;

/* JADX INFO: renamed from: com.google.protobuf.j */
/* JADX INFO: loaded from: classes7.dex */
public final class C3435j extends AbstractC3428c<Float> implements C3437l.e, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C3435j f11637d;

    /* JADX INFO: renamed from: b */
    public float[] f11638b;

    /* JADX INFO: renamed from: c */
    public int f11639c;

    static {
        C3435j c3435j = new C3435j();
        f11637d = c3435j;
        c3435j.mo17139n();
    }

    public C3435j() {
        this(new float[10], 0);
    }

    /* JADX INFO: renamed from: g */
    public static C3435j m17243g() {
        return f11637d;
    }

    /* JADX INFO: renamed from: h */
    private void m17244h(int i) {
        if (i < 0 || i >= this.f11639c) {
            kym.m151996a(m17245j(i));
        }
    }

    /* JADX INFO: renamed from: j */
    private String m17245j(int i) {
        return "Index:" + i + ", Size:" + this.f11639c;
    }

    @Override // com.google.protobuf.C3437l.e
    /* JADX INFO: renamed from: M */
    public void mo17246M(float f) {
        m17248f(this.f11639c, f);
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        m17138a();
        collection.getClass();
        if (!(collection instanceof C3435j)) {
            return super.addAll(collection);
        }
        C3435j c3435j = (C3435j) collection;
        int i = c3435j.f11639c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11639c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        float[] fArr = this.f11638b;
        if (i3 > fArr.length) {
            this.f11638b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c3435j.f11638b, 0, this.f11638b, this.f11639c, c3435j.f11639c);
        this.f11639c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, Float f) {
        m17248f(i, f.floatValue());
    }

    @Override // com.google.protobuf.C3437l.h, com.google.protobuf.C3437l.a
    /* JADX INFO: renamed from: d */
    public C3437l.h<Float> mo17143d(int i) {
        if (i >= this.f11639c) {
            return new C3435j(Arrays.copyOf(this.f11638b, i), this.f11639c);
        }
        fig0.m125680a();
        return null;
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3435j)) {
            return super.equals(obj);
        }
        C3435j c3435j = (C3435j) obj;
        if (this.f11639c != c3435j.f11639c) {
            return false;
        }
        float[] fArr = c3435j.f11638b;
        for (int i = 0; i < this.f11639c; i++) {
            if (this.f11638b[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m17248f(int i, float f) {
        int i2;
        m17138a();
        if (i < 0 || i > (i2 = this.f11639c)) {
            kym.m151996a(m17245j(i));
            return;
        }
        float[] fArr = this.f11638b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f11638b, i, fArr2, i + 1, this.f11639c - i);
            this.f11638b = fArr2;
        }
        this.f11638b[i] = f;
        this.f11639c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.C3437l.e
    public float getFloat(int i) {
        m17244h(i);
        return this.f11638b[i];
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f11639c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f11638b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Float get(int i) {
        return Float.valueOf(getFloat(i));
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Float remove(int i) {
        m17138a();
        m17244h(i);
        float[] fArr = this.f11638b;
        float f = fArr[i];
        System.arraycopy(fArr, i + 1, fArr, i, this.f11639c - i);
        this.f11639c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Float set(int i, Float f) {
        return Float.valueOf(setFloat(i, f.floatValue()));
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m17138a();
        for (int i = 0; i < this.f11639c; i++) {
            if (obj.equals(Float.valueOf(this.f11638b[i]))) {
                float[] fArr = this.f11638b;
                System.arraycopy(fArr, i + 1, fArr, i, this.f11639c - i);
                this.f11639c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.C3437l.e
    public float setFloat(int i, float f) {
        m17138a();
        m17244h(i);
        float[] fArr = this.f11638b;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11639c;
    }

    public C3435j(float[] fArr, int i) {
        this.f11638b = fArr;
        this.f11639c = i;
    }
}
