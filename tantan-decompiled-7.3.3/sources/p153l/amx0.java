package p153l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class amx0 extends mow0 implements RandomAccess, orx0, bxx0 {

    /* JADX INFO: renamed from: d */
    public static final float[] f72290d;

    /* JADX INFO: renamed from: b */
    public float[] f72291b;

    /* JADX INFO: renamed from: c */
    public int f72292c;

    static {
        float[] fArr = new float[0];
        f72290d = fArr;
        new amx0(fArr, 0, false);
    }

    public amx0() {
        this(f72290d, 0, true);
    }

    /* JADX INFO: renamed from: h */
    private static int m98876h(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: i */
    private final String m98877i(int i) {
        return "Index:" + i + ", Size:" + this.f72292c;
    }

    /* JADX INFO: renamed from: j */
    private final void m98878j(int i) {
        if (i < 0 || i >= this.f72292c) {
            kym.m151996a(m98877i(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m159318a();
        if (i < 0 || i > (i2 = this.f72292c)) {
            kym.m151996a(m98877i(i));
            return;
        }
        int i3 = i + 1;
        float[] fArr = this.f72291b;
        int length = fArr.length;
        if (i2 < length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[m98876h(length)];
            System.arraycopy(this.f72291b, 0, fArr2, 0, i);
            System.arraycopy(this.f72291b, i, fArr2, i3, this.f72292c - i);
            this.f72291b = fArr2;
        }
        this.f72291b[i] = fFloatValue;
        this.f72292c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p153l.mow0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m159318a();
        Charset charset = srx0.f170385a;
        collection.getClass();
        if (!(collection instanceof amx0)) {
            return super.addAll(collection);
        }
        amx0 amx0Var = (amx0) collection;
        int i = amx0Var.f72292c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f72292c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        float[] fArr = this.f72291b;
        if (i3 > fArr.length) {
            this.f72291b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(amx0Var.f72291b, 0, this.f72291b, this.f72292c, amx0Var.f72292c);
        this.f72292c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final float m98879c(int i) {
        m98878j(i);
        return this.f72291b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p153l.mow0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amx0)) {
            return super.equals(obj);
        }
        amx0 amx0Var = (amx0) obj;
        if (this.f72292c != amx0Var.f72292c) {
            return false;
        }
        float[] fArr = amx0Var.f72291b;
        for (int i = 0; i < this.f72292c; i++) {
            if (Float.floatToIntBits(this.f72291b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m98880f(float f) {
        m159318a();
        int i = this.f72292c;
        int length = this.f72291b.length;
        if (i == length) {
            float[] fArr = new float[m98876h(length)];
            System.arraycopy(this.f72291b, 0, fArr, 0, this.f72292c);
            this.f72291b = fArr;
        }
        float[] fArr2 = this.f72291b;
        int i2 = this.f72292c;
        this.f72292c = i2 + 1;
        fArr2[i2] = f;
    }

    /* JADX INFO: renamed from: g */
    public final void m98881g(int i) {
        int length = this.f72291b.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f72291b = new float[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = m98876h(length);
        }
        this.f72291b = Arrays.copyOf(this.f72291b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m98878j(i);
        return Float.valueOf(this.f72291b[i]);
    }

    @Override // p153l.mow0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f72292c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f72291b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f72292c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f72291b[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p153l.mow0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m159318a();
        m98878j(i);
        float[] fArr = this.f72291b;
        float f = fArr[i];
        int i2 = this.f72292c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f72292c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m159318a();
        if (i2 < i) {
            kym.m151996a("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.f72291b;
        System.arraycopy(fArr, i2, fArr, i, this.f72292c - i2);
        this.f72292c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m159318a();
        m98878j(i);
        float[] fArr = this.f72291b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f72292c;
    }

    @Override // p153l.orx0
    public final /* bridge */ /* synthetic */ orx0 zzd(int i) {
        if (i >= this.f72292c) {
            return new amx0(i == 0 ? f72290d : Arrays.copyOf(this.f72291b, i), this.f72292c, true);
        }
        fig0.m125680a();
        return null;
    }

    public amx0(float[] fArr, int i, boolean z) {
        super(z);
        this.f72291b = fArr;
        this.f72292c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m98880f(((Float) obj).floatValue());
        return true;
    }
}
