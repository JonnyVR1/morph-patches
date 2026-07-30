package p149l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class j8x0 extends v6x0 implements RandomAccess, z9x0, gbx0 {

    /* JADX INFO: renamed from: d */
    public static final j8x0 f116822d = new j8x0(new float[0], 0, false);

    /* JADX INFO: renamed from: b */
    public float[] f116823b;

    /* JADX INFO: renamed from: c */
    public int f116824c;

    public j8x0() {
        this(new float[10], 0, true);
    }

    /* JADX INFO: renamed from: f */
    private final String m140475f(int i) {
        return "Index:" + i + ", Size:" + this.f116824c;
    }

    /* JADX INFO: renamed from: g */
    private final void m140476g(int i) {
        if (i < 0 || i >= this.f116824c) {
            jwm.m143661a(m140475f(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m197278a();
        if (i < 0 || i > (i2 = this.f116824c)) {
            jwm.m143661a(m140475f(i));
            return;
        }
        int i3 = i + 1;
        float[] fArr = this.f116823b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f116823b, i, fArr2, i3, this.f116824c - i);
            this.f116823b = fArr2;
        }
        this.f116823b[i] = fFloatValue;
        this.f116824c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p149l.v6x0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m197278a();
        Charset charset = aax0.f68607a;
        collection.getClass();
        if (!(collection instanceof j8x0)) {
            return super.addAll(collection);
        }
        j8x0 j8x0Var = (j8x0) collection;
        int i = j8x0Var.f116824c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f116824c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        float[] fArr = this.f116823b;
        if (i3 > fArr.length) {
            this.f116823b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(j8x0Var.f116823b, 0, this.f116823b, this.f116824c, j8x0Var.f116824c);
        this.f116824c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m140477c(float f) {
        m197278a();
        int i = this.f116824c;
        float[] fArr = this.f116823b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f116823b = fArr2;
        }
        float[] fArr3 = this.f116823b;
        int i2 = this.f116824c;
        this.f116824c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8x0)) {
            return super.equals(obj);
        }
        j8x0 j8x0Var = (j8x0) obj;
        if (this.f116824c != j8x0Var.f116824c) {
            return false;
        }
        float[] fArr = j8x0Var.f116823b;
        for (int i = 0; i < this.f116824c; i++) {
            if (Float.floatToIntBits(this.f116823b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m140476g(i);
        return Float.valueOf(this.f116823b[i]);
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f116824c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f116823b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f116824c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f116823b[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m197278a();
        m140476g(i);
        float[] fArr = this.f116823b;
        float f = fArr[i];
        int i2 = this.f116824c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f116824c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m197278a();
        if (i2 < i) {
            jwm.m143661a("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.f116823b;
        System.arraycopy(fArr, i2, fArr, i, this.f116824c - i2);
        this.f116824c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m197278a();
        m140476g(i);
        float[] fArr = this.f116823b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f116824c;
    }

    @Override // p149l.z9x0
    public final /* bridge */ /* synthetic */ z9x0 zzd(int i) {
        if (i >= this.f116824c) {
            return new j8x0(Arrays.copyOf(this.f116823b, i), this.f116824c, true);
        }
        x9g0.m207497a();
        return null;
    }

    public j8x0(float[] fArr, int i, boolean z) {
        super(z);
        this.f116823b = fArr;
        this.f116824c = i;
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m140477c(((Float) obj).floatValue());
        return true;
    }
}
