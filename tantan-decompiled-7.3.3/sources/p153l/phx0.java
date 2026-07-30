package p153l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class phx0 extends bgx0 implements RandomAccess, fjx0, mkx0 {

    /* JADX INFO: renamed from: d */
    public static final phx0 f152495d = new phx0(new float[0], 0, false);

    /* JADX INFO: renamed from: b */
    public float[] f152496b;

    /* JADX INFO: renamed from: c */
    public int f152497c;

    public phx0() {
        this(new float[10], 0, true);
    }

    /* JADX INFO: renamed from: f */
    private final String m172348f(int i) {
        return "Index:" + i + ", Size:" + this.f152497c;
    }

    /* JADX INFO: renamed from: g */
    private final void m172349g(int i) {
        if (i < 0 || i >= this.f152497c) {
            kym.m151996a(m172348f(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m104285a();
        if (i < 0 || i > (i2 = this.f152497c)) {
            kym.m151996a(m172348f(i));
            return;
        }
        int i3 = i + 1;
        float[] fArr = this.f152496b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f152496b, i, fArr2, i3, this.f152497c - i);
            this.f152496b = fArr2;
        }
        this.f152496b[i] = fFloatValue;
        this.f152497c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p153l.bgx0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m104285a();
        Charset charset = gjx0.f104688a;
        collection.getClass();
        if (!(collection instanceof phx0)) {
            return super.addAll(collection);
        }
        phx0 phx0Var = (phx0) collection;
        int i = phx0Var.f152497c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f152497c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        float[] fArr = this.f152496b;
        if (i3 > fArr.length) {
            this.f152496b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(phx0Var.f152496b, 0, this.f152496b, this.f152497c, phx0Var.f152497c);
        this.f152497c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m172350c(float f) {
        m104285a();
        int i = this.f152497c;
        float[] fArr = this.f152496b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f152496b = fArr2;
        }
        float[] fArr3 = this.f152496b;
        int i2 = this.f152497c;
        this.f152497c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phx0)) {
            return super.equals(obj);
        }
        phx0 phx0Var = (phx0) obj;
        if (this.f152497c != phx0Var.f152497c) {
            return false;
        }
        float[] fArr = phx0Var.f152496b;
        for (int i = 0; i < this.f152497c; i++) {
            if (Float.floatToIntBits(this.f152496b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m172349g(i);
        return Float.valueOf(this.f152496b[i]);
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f152497c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f152496b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f152497c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f152496b[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m104285a();
        m172349g(i);
        float[] fArr = this.f152496b;
        float f = fArr[i];
        int i2 = this.f152497c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f152497c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m104285a();
        if (i2 < i) {
            kym.m151996a("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.f152496b;
        System.arraycopy(fArr, i2, fArr, i, this.f152497c - i2);
        this.f152497c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m104285a();
        m172349g(i);
        float[] fArr = this.f152496b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f152497c;
    }

    @Override // p153l.fjx0
    public final /* bridge */ /* synthetic */ fjx0 zzd(int i) {
        if (i >= this.f152497c) {
            return new phx0(Arrays.copyOf(this.f152496b, i), this.f152497c, true);
        }
        fig0.m125680a();
        return null;
    }

    public phx0(float[] fArr, int i, boolean z) {
        super(z);
        this.f152496b = fArr;
        this.f152497c = i;
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m172350c(((Float) obj).floatValue());
        return true;
    }
}
