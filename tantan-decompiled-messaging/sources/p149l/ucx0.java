package p149l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class ucx0 extends gfw0 implements RandomAccess, iix0, vnx0 {

    /* JADX INFO: renamed from: d */
    public static final float[] f175876d;

    /* JADX INFO: renamed from: b */
    public float[] f175877b;

    /* JADX INFO: renamed from: c */
    public int f175878c;

    static {
        float[] fArr = new float[0];
        f175876d = fArr;
        new ucx0(fArr, 0, false);
    }

    public ucx0() {
        this(f175876d, 0, true);
    }

    /* JADX INFO: renamed from: h */
    private static int m193106h(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: i */
    private final String m193107i(int i) {
        return "Index:" + i + ", Size:" + this.f175878c;
    }

    /* JADX INFO: renamed from: j */
    private final void m193108j(int i) {
        if (i < 0 || i >= this.f175878c) {
            jwm.m143661a(m193107i(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m125929a();
        if (i < 0 || i > (i2 = this.f175878c)) {
            jwm.m143661a(m193107i(i));
            return;
        }
        int i3 = i + 1;
        float[] fArr = this.f175877b;
        int length = fArr.length;
        if (i2 < length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[m193106h(length)];
            System.arraycopy(this.f175877b, 0, fArr2, 0, i);
            System.arraycopy(this.f175877b, i, fArr2, i3, this.f175878c - i);
            this.f175877b = fArr2;
        }
        this.f175877b[i] = fFloatValue;
        this.f175878c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p149l.gfw0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m125929a();
        Charset charset = mix0.f134047a;
        collection.getClass();
        if (!(collection instanceof ucx0)) {
            return super.addAll(collection);
        }
        ucx0 ucx0Var = (ucx0) collection;
        int i = ucx0Var.f175878c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f175878c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        float[] fArr = this.f175877b;
        if (i3 > fArr.length) {
            this.f175877b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(ucx0Var.f175877b, 0, this.f175877b, this.f175878c, ucx0Var.f175878c);
        this.f175878c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final float m193109c(int i) {
        m193108j(i);
        return this.f175877b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p149l.gfw0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucx0)) {
            return super.equals(obj);
        }
        ucx0 ucx0Var = (ucx0) obj;
        if (this.f175878c != ucx0Var.f175878c) {
            return false;
        }
        float[] fArr = ucx0Var.f175877b;
        for (int i = 0; i < this.f175878c; i++) {
            if (Float.floatToIntBits(this.f175877b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m193110f(float f) {
        m125929a();
        int i = this.f175878c;
        int length = this.f175877b.length;
        if (i == length) {
            float[] fArr = new float[m193106h(length)];
            System.arraycopy(this.f175877b, 0, fArr, 0, this.f175878c);
            this.f175877b = fArr;
        }
        float[] fArr2 = this.f175877b;
        int i2 = this.f175878c;
        this.f175878c = i2 + 1;
        fArr2[i2] = f;
    }

    /* JADX INFO: renamed from: g */
    public final void m193111g(int i) {
        int length = this.f175877b.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f175877b = new float[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = m193106h(length);
        }
        this.f175877b = Arrays.copyOf(this.f175877b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m193108j(i);
        return Float.valueOf(this.f175877b[i]);
    }

    @Override // p149l.gfw0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f175878c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f175877b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f175878c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f175877b[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p149l.gfw0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m125929a();
        m193108j(i);
        float[] fArr = this.f175877b;
        float f = fArr[i];
        int i2 = this.f175878c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f175878c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m125929a();
        if (i2 < i) {
            jwm.m143661a("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.f175877b;
        System.arraycopy(fArr, i2, fArr, i, this.f175878c - i2);
        this.f175878c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m125929a();
        m193108j(i);
        float[] fArr = this.f175877b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f175878c;
    }

    @Override // p149l.iix0
    public final /* bridge */ /* synthetic */ iix0 zzd(int i) {
        if (i >= this.f175878c) {
            return new ucx0(i == 0 ? f175876d : Arrays.copyOf(this.f175877b, i), this.f175878c, true);
        }
        x9g0.m207497a();
        return null;
    }

    public ucx0(float[] fArr, int i, boolean z) {
        super(z);
        this.f175877b = fArr;
        this.f175878c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m193110f(((Float) obj).floatValue());
        return true;
    }
}
