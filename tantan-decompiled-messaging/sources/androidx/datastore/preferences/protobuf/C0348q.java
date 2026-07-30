package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p149l.iwm;
import p149l.jwm;
import p149l.nm80;
import p149l.x9g0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0348q extends AbstractC0322c<Float> implements C0350s.f, RandomAccess, nm80 {

    /* JADX INFO: renamed from: d */
    public static final C0348q f1731d;

    /* JADX INFO: renamed from: b */
    public float[] f1732b;

    /* JADX INFO: renamed from: c */
    public int f1733c;

    static {
        C0348q c0348q = new C0348q(new float[0], 0);
        f1731d = c0348q;
        c0348q.mo1819n();
    }

    public C0348q() {
        this(new float[10], 0);
    }

    /* JADX INFO: renamed from: h */
    private void m2319h(int i) {
        if (i < 0 || i >= this.f1733c) {
            jwm.m143661a(m2320j(i));
        }
    }

    /* JADX INFO: renamed from: j */
    private String m2320j(int i) {
        return "Index:" + i + ", Size:" + this.f1733c;
    }

    /* JADX INFO: renamed from: M */
    public void m2321M(float f) {
        m1818a();
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

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        m1818a();
        C0350s.m2339a(collection);
        if (!(collection instanceof C0348q)) {
            return super.addAll(collection);
        }
        C0348q c0348q = (C0348q) collection;
        int i = c0348q.f1733c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f1733c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        float[] fArr = this.f1732b;
        if (i3 > fArr.length) {
            this.f1732b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c0348q.f1732b, 0, this.f1732b, this.f1733c, c0348q.f1733c);
        this.f1733c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, Float f) {
        m2324g(i, f.floatValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0348q)) {
            return super.equals(obj);
        }
        C0348q c0348q = (C0348q) obj;
        if (this.f1733c != c0348q.f1733c) {
            return false;
        }
        float[] fArr = c0348q.f1732b;
        for (int i = 0; i < this.f1733c; i++) {
            if (Float.floatToIntBits(this.f1732b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f) {
        m2321M(f.floatValue());
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m2324g(int i, float f) {
        int i2;
        m1818a();
        if (i < 0 || i > (i2 = this.f1733c)) {
            jwm.m143661a(m2320j(i));
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
        m2319h(i);
        return this.f1732b[i];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractList, java.util.Collection, java.util.List
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

    @Override // androidx.datastore.preferences.protobuf.C0350s.i
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0350s.f mo2014d(int i) {
        if (i >= this.f1733c) {
            return new C0348q(Arrays.copyOf(this.f1732b, i), this.f1733c);
        }
        x9g0.m207497a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Float remove(int i) {
        m1818a();
        m2319h(i);
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

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m1818a();
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
        m1818a();
        if (i2 < i) {
            jwm.m143661a("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.f1732b;
        System.arraycopy(fArr, i2, fArr, i, this.f1733c - i2);
        this.f1733c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public float setFloat(int i, float f) {
        m1818a();
        m2319h(i);
        float[] fArr = this.f1732b;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f1733c;
    }

    public C0348q(float[] fArr, int i) {
        this.f1732b = fArr;
        this.f1733c = i;
    }
}
