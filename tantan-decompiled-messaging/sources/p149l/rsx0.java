package p149l;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class rsx0 extends jlx0<Float> implements cvx0<Float>, f2y0, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final float[] f160921d;

    /* JADX INFO: renamed from: b */
    public float[] f160922b;

    /* JADX INFO: renamed from: c */
    public int f160923c;

    static {
        float[] fArr = new float[0];
        f160921d = fArr;
        new rsx0(fArr, 0, false);
    }

    public rsx0() {
        this(f160921d, 0, true);
    }

    /* JADX INFO: renamed from: h */
    private static int m180741h(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: i */
    private final String m180742i(int i) {
        return "Index:" + i + ", Size:" + this.f160923c;
    }

    /* JADX INFO: renamed from: j */
    private final void m180743j(int i) {
        if (i < 0 || i >= this.f160923c) {
            jwm.m143661a(m180742i(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m142120a();
        if (i < 0 || i > (i2 = this.f160923c)) {
            jwm.m143661a(m180742i(i));
            return;
        }
        float[] fArr = this.f160922b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[m180741h(fArr.length)];
            System.arraycopy(this.f160922b, 0, fArr2, 0, i);
            System.arraycopy(this.f160922b, i, fArr2, i + 1, this.f160923c - i);
            this.f160922b = fArr2;
        }
        this.f160922b[i] = fFloatValue;
        this.f160923c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p149l.jlx0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m142120a();
        ctx0.m108707e(collection);
        if (!(collection instanceof rsx0)) {
            return super.addAll(collection);
        }
        rsx0 rsx0Var = (rsx0) collection;
        int i = rsx0Var.f160923c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f160923c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        float[] fArr = this.f160922b;
        if (i3 > fArr.length) {
            this.f160922b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(rsx0Var.f160922b, 0, this.f160922b, this.f160923c, rsx0Var.f160923c);
        this.f160923c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m180744c(float f) {
        m142120a();
        int i = this.f160923c;
        float[] fArr = this.f160922b;
        if (i == fArr.length) {
            float[] fArr2 = new float[m180741h(fArr.length)];
            System.arraycopy(this.f160922b, 0, fArr2, 0, this.f160923c);
            this.f160922b = fArr2;
        }
        float[] fArr3 = this.f160922b;
        int i2 = this.f160923c;
        this.f160923c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p149l.jlx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsx0)) {
            return super.equals(obj);
        }
        rsx0 rsx0Var = (rsx0) obj;
        if (this.f160923c != rsx0Var.f160923c) {
            return false;
        }
        float[] fArr = rsx0Var.f160922b;
        for (int i = 0; i < this.f160923c; i++) {
            if (Float.floatToIntBits(this.f160922b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final float m180745f(int i) {
        m180743j(i);
        return this.f160922b[i];
    }

    /* JADX INFO: renamed from: g */
    public final void m180746g(int i) {
        float[] fArr = this.f160922b;
        if (i <= fArr.length) {
            return;
        }
        if (fArr.length == 0) {
            this.f160922b = new float[Math.max(i, 10)];
            return;
        }
        int length = fArr.length;
        while (length < i) {
            length = m180741h(length);
        }
        this.f160922b = Arrays.copyOf(this.f160922b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Float.valueOf(m180745f(i));
    }

    @Override // p149l.jlx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f160923c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f160922b[i]);
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
            if (this.f160922b[i] == fFloatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // p149l.jlx0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m142120a();
        m180743j(i);
        float[] fArr = this.f160922b;
        float f = fArr[i];
        int i2 = this.f160923c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f160923c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m142120a();
        if (i2 < i) {
            jwm.m143661a("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.f160922b;
        System.arraycopy(fArr, i2, fArr, i, this.f160923c - i2);
        this.f160923c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m142120a();
        m180743j(i);
        float[] fArr = this.f160922b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f160923c;
    }

    @Override // p149l.cvx0
    public final /* synthetic */ cvx0<Float> zza(int i) {
        if (i >= this.f160923c) {
            return new rsx0(i == 0 ? f160921d : Arrays.copyOf(this.f160922b, i), this.f160923c, true);
        }
        x9g0.m207497a();
        return null;
    }

    public rsx0(float[] fArr, int i, boolean z) {
        super(z);
        this.f160922b = fArr;
        this.f160923c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m180744c(((Float) obj).floatValue());
        return true;
    }
}
