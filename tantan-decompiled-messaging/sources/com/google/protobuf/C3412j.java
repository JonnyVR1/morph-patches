package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p149l.iwm;
import p149l.jwm;
import p149l.x9g0;

/* JADX INFO: renamed from: com.google.protobuf.j */
/* JADX INFO: loaded from: classes7.dex */
public final class C3412j extends AbstractC3405c<Float> implements C3414l.e, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C3412j f11600d;

    /* JADX INFO: renamed from: b */
    public float[] f11601b;

    /* JADX INFO: renamed from: c */
    public int f11602c;

    static {
        C3412j c3412j = new C3412j();
        f11600d = c3412j;
        c3412j.mo17084n();
    }

    public C3412j() {
        this(new float[10], 0);
    }

    /* JADX INFO: renamed from: g */
    public static C3412j m17188g() {
        return f11600d;
    }

    /* JADX INFO: renamed from: h */
    private void m17189h(int i) {
        if (i < 0 || i >= this.f11602c) {
            jwm.m143661a(m17190j(i));
        }
    }

    /* JADX INFO: renamed from: j */
    private String m17190j(int i) {
        return "Index:" + i + ", Size:" + this.f11602c;
    }

    @Override // com.google.protobuf.C3414l.e
    /* JADX INFO: renamed from: M */
    public void mo17191M(float f) {
        m17193f(this.f11602c, f);
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        m17083a();
        collection.getClass();
        if (!(collection instanceof C3412j)) {
            return super.addAll(collection);
        }
        C3412j c3412j = (C3412j) collection;
        int i = c3412j.f11602c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11602c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        float[] fArr = this.f11601b;
        if (i3 > fArr.length) {
            this.f11601b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c3412j.f11601b, 0, this.f11601b, this.f11602c, c3412j.f11602c);
        this.f11602c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, Float f) {
        m17193f(i, f.floatValue());
    }

    @Override // com.google.protobuf.C3414l.h, com.google.protobuf.C3414l.a
    /* JADX INFO: renamed from: d */
    public C3414l.h<Float> mo17088d(int i) {
        if (i >= this.f11602c) {
            return new C3412j(Arrays.copyOf(this.f11601b, i), this.f11602c);
        }
        x9g0.m207497a();
        return null;
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3412j)) {
            return super.equals(obj);
        }
        C3412j c3412j = (C3412j) obj;
        if (this.f11602c != c3412j.f11602c) {
            return false;
        }
        float[] fArr = c3412j.f11601b;
        for (int i = 0; i < this.f11602c; i++) {
            if (this.f11601b[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m17193f(int i, float f) {
        int i2;
        m17083a();
        if (i < 0 || i > (i2 = this.f11602c)) {
            jwm.m143661a(m17190j(i));
            return;
        }
        float[] fArr = this.f11601b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f11601b, i, fArr2, i + 1, this.f11602c - i);
            this.f11601b = fArr2;
        }
        this.f11601b[i] = f;
        this.f11602c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.C3414l.e
    public float getFloat(int i) {
        m17189h(i);
        return this.f11601b[i];
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f11602c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f11601b[i]);
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
        m17083a();
        m17189h(i);
        float[] fArr = this.f11601b;
        float f = fArr[i];
        System.arraycopy(fArr, i + 1, fArr, i, this.f11602c - i);
        this.f11602c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Float set(int i, Float f) {
        return Float.valueOf(setFloat(i, f.floatValue()));
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m17083a();
        for (int i = 0; i < this.f11602c; i++) {
            if (obj.equals(Float.valueOf(this.f11601b[i]))) {
                float[] fArr = this.f11601b;
                System.arraycopy(fArr, i + 1, fArr, i, this.f11602c - i);
                this.f11602c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.C3414l.e
    public float setFloat(int i, float f) {
        m17083a();
        m17189h(i);
        float[] fArr = this.f11601b;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11602c;
    }

    public C3412j(float[] fArr, int i) {
        this.f11601b = fArr;
        this.f11602c = i;
    }
}
