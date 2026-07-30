package p153l;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class x1y0 extends pux0<Float> implements i4y0<Float>, lby0, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final float[] f192105d;

    /* JADX INFO: renamed from: b */
    public float[] f192106b;

    /* JADX INFO: renamed from: c */
    public int f192107c;

    static {
        float[] fArr = new float[0];
        f192105d = fArr;
        new x1y0(fArr, 0, false);
    }

    public x1y0() {
        this(f192105d, 0, true);
    }

    /* JADX INFO: renamed from: h */
    private static int m209116h(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: i */
    private final String m209117i(int i) {
        return "Index:" + i + ", Size:" + this.f192107c;
    }

    /* JADX INFO: renamed from: j */
    private final void m209118j(int i) {
        if (i < 0 || i >= this.f192107c) {
            kym.m151996a(m209117i(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m173917a();
        if (i < 0 || i > (i2 = this.f192107c)) {
            kym.m151996a(m209117i(i));
            return;
        }
        float[] fArr = this.f192106b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[m209116h(fArr.length)];
            System.arraycopy(this.f192106b, 0, fArr2, 0, i);
            System.arraycopy(this.f192106b, i, fArr2, i + 1, this.f192107c - i);
            this.f192106b = fArr2;
        }
        this.f192106b[i] = fFloatValue;
        this.f192107c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p153l.pux0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m173917a();
        i2y0.m138253e(collection);
        if (!(collection instanceof x1y0)) {
            return super.addAll(collection);
        }
        x1y0 x1y0Var = (x1y0) collection;
        int i = x1y0Var.f192107c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f192107c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        float[] fArr = this.f192106b;
        if (i3 > fArr.length) {
            this.f192106b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(x1y0Var.f192106b, 0, this.f192106b, this.f192107c, x1y0Var.f192107c);
        this.f192107c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m209119c(float f) {
        m173917a();
        int i = this.f192107c;
        float[] fArr = this.f192106b;
        if (i == fArr.length) {
            float[] fArr2 = new float[m209116h(fArr.length)];
            System.arraycopy(this.f192106b, 0, fArr2, 0, this.f192107c);
            this.f192106b = fArr2;
        }
        float[] fArr3 = this.f192106b;
        int i2 = this.f192107c;
        this.f192107c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p153l.pux0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1y0)) {
            return super.equals(obj);
        }
        x1y0 x1y0Var = (x1y0) obj;
        if (this.f192107c != x1y0Var.f192107c) {
            return false;
        }
        float[] fArr = x1y0Var.f192106b;
        for (int i = 0; i < this.f192107c; i++) {
            if (Float.floatToIntBits(this.f192106b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final float m209120f(int i) {
        m209118j(i);
        return this.f192106b[i];
    }

    /* JADX INFO: renamed from: g */
    public final void m209121g(int i) {
        float[] fArr = this.f192106b;
        if (i <= fArr.length) {
            return;
        }
        if (fArr.length == 0) {
            this.f192106b = new float[Math.max(i, 10)];
            return;
        }
        int length = fArr.length;
        while (length < i) {
            length = m209116h(length);
        }
        this.f192106b = Arrays.copyOf(this.f192106b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Float.valueOf(m209120f(i));
    }

    @Override // p153l.pux0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f192107c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f192106b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f192106b[i] == fFloatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // p153l.pux0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m173917a();
        m209118j(i);
        float[] fArr = this.f192106b;
        float f = fArr[i];
        int i2 = this.f192107c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f192107c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m173917a();
        if (i2 < i) {
            kym.m151996a("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.f192106b;
        System.arraycopy(fArr, i2, fArr, i, this.f192107c - i2);
        this.f192107c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m173917a();
        m209118j(i);
        float[] fArr = this.f192106b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f192107c;
    }

    @Override // p153l.i4y0
    public final /* synthetic */ i4y0<Float> zza(int i) {
        if (i >= this.f192107c) {
            return new x1y0(i == 0 ? f192105d : Arrays.copyOf(this.f192106b, i), this.f192107c, true);
        }
        fig0.m125680a();
        return null;
    }

    public x1y0(float[] fArr, int i, boolean z) {
        super(z);
        this.f192106b = fArr;
        this.f192107c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m209119c(((Float) obj).floatValue());
        return true;
    }
}
