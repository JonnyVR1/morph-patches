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

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0349q extends AbstractC0323c<Float> implements C0351s.f, RandomAccess, ru80 {

    /* JADX INFO: renamed from: d */
    public static final C0349q f1731d;

    /* JADX INFO: renamed from: b */
    public float[] f1732b;

    /* JADX INFO: renamed from: c */
    public int f1733c;

    static {
        C0349q c0349q = new C0349q(new float[0], 0);
        f1731d = c0349q;
        c0349q.mo1820n();
    }

    public C0349q() {
        this(new float[10], 0);
    }

    /* JADX INFO: renamed from: h */
    private void m2320h(int i) {
        if (i < 0 || i >= this.f1733c) {
            kym.m151996a(m2321j(i));
        }
    }

    /* JADX INFO: renamed from: j */
    private String m2321j(int i) {
        return "Index:" + i + ", Size:" + this.f1733c;
    }

    /* JADX INFO: renamed from: M */
    public void m2322M(float f) {
        m1819a();
        int i = this.f1733c;
        float[] fArr = this.f1732b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f1732b = fArr2;
        }
        float[] fArr3 = this.f1732b;
        int i2 = this.f1733c;
        this.f1733c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        m1819a();
        C0351s.m2340a(collection);
        if (!(collection instanceof C0349q)) {
            return super.addAll(collection);
        }
        C0349q c0349q = (C0349q) collection;
        int i = c0349q.f1733c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f1733c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        float[] fArr = this.f1732b;
        if (i3 > fArr.length) {
            this.f1732b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c0349q.f1732b, 0, this.f1732b, this.f1733c, c0349q.f1733c);
        this.f1733c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, Float f) {
        m2325g(i, f.floatValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0349q)) {
            return super.equals(obj);
        }
        C0349q c0349q = (C0349q) obj;
        if (this.f1733c != c0349q.f1733c) {
            return false;
        }
        float[] fArr = c0349q.f1732b;
        for (int i = 0; i < this.f1733c; i++) {
            if (Float.floatToIntBits(this.f1732b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f) {
        m2322M(f.floatValue());
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m2325g(int i, float f) {
        int i2;
        m1819a();
        if (i < 0 || i > (i2 = this.f1733c)) {
            kym.m151996a(m2321j(i));
            return;
        }
        float[] fArr = this.f1732b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f1732b, i, fArr2, i + 1, this.f1733c - i);
            this.f1732b = fArr2;
        }
        this.f1732b[i] = f;
        this.f1733c++;
        ((AbstractList) this).modCount++;
    }

    public float getFloat(int i) {
        m2320h(i);
        return this.f1732b[i];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f1733c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f1732b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Float get(int i) {
        return Float.valueOf(getFloat(i));
    }

    @Override // androidx.datastore.preferences.protobuf.C0351s.i
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0351s.f mo2015d(int i) {
        if (i >= this.f1733c) {
            return new C0349q(Arrays.copyOf(this.f1732b, i), this.f1733c);
        }
        fig0.m125680a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Float remove(int i) {
        m1819a();
        m2320h(i);
        float[] fArr = this.f1732b;
        float f = fArr[i];
        int i2 = this.f1733c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f1733c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Float set(int i, Float f) {
        return Float.valueOf(setFloat(i, f.floatValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m1819a();
        for (int i = 0; i < this.f1733c; i++) {
            if (obj.equals(Float.valueOf(this.f1732b[i]))) {
                float[] fArr = this.f1732b;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f1733c - i) - 1);
                this.f1733c--;
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
        float[] fArr = this.f1732b;
        System.arraycopy(fArr, i2, fArr, i, this.f1733c - i2);
        this.f1733c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public float setFloat(int i, float f) {
        m1819a();
        m2320h(i);
        float[] fArr = this.f1732b;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f1733c;
    }

    public C0349q(float[] fArr, int i) {
        this.f1732b = fArr;
        this.f1733c = i;
    }
}
