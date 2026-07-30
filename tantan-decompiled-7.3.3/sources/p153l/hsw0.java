package p153l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class hsw0 extends mow0 implements RandomAccess, orx0, bxx0 {

    /* JADX INFO: renamed from: d */
    public static final boolean[] f111487d;

    /* JADX INFO: renamed from: b */
    public boolean[] f111488b;

    /* JADX INFO: renamed from: c */
    public int f111489c;

    static {
        boolean[] zArr = new boolean[0];
        f111487d = zArr;
        new hsw0(zArr, 0, false);
    }

    public hsw0() {
        this(f111487d, 0, true);
    }

    /* JADX INFO: renamed from: g */
    public static int m137042g(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m159318a();
        if (i < 0 || i > (i2 = this.f111489c)) {
            kym.m151996a(m137045h(i));
            return;
        }
        int i3 = i + 1;
        boolean[] zArr = this.f111488b;
        int length = zArr.length;
        if (i2 < length) {
            System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[m137042g(length)];
            System.arraycopy(this.f111488b, 0, zArr2, 0, i);
            System.arraycopy(this.f111488b, i, zArr2, i3, this.f111489c - i);
            this.f111488b = zArr2;
        }
        this.f111488b[i] = zBooleanValue;
        this.f111489c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p153l.mow0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m159318a();
        Charset charset = srx0.f170385a;
        collection.getClass();
        if (!(collection instanceof hsw0)) {
            return super.addAll(collection);
        }
        hsw0 hsw0Var = (hsw0) collection;
        int i = hsw0Var.f111489c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f111489c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f111488b;
        if (i3 > zArr.length) {
            this.f111488b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(hsw0Var.f111488b, 0, this.f111488b, this.f111489c, hsw0Var.f111489c);
        this.f111489c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m137043c(boolean z) {
        m159318a();
        int i = this.f111489c;
        int length = this.f111488b.length;
        if (i == length) {
            boolean[] zArr = new boolean[m137042g(length)];
            System.arraycopy(this.f111488b, 0, zArr, 0, this.f111489c);
            this.f111488b = zArr;
        }
        boolean[] zArr2 = this.f111488b;
        int i2 = this.f111489c;
        this.f111489c = i2 + 1;
        zArr2[i2] = z;
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
        if (!(obj instanceof hsw0)) {
            return super.equals(obj);
        }
        hsw0 hsw0Var = (hsw0) obj;
        if (this.f111489c != hsw0Var.f111489c) {
            return false;
        }
        boolean[] zArr = hsw0Var.f111488b;
        for (int i = 0; i < this.f111489c; i++) {
            if (this.f111488b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m137044f(int i) {
        m137046i(i);
        return this.f111488b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m137046i(i);
        return Boolean.valueOf(this.f111488b[i]);
    }

    /* JADX INFO: renamed from: h */
    public final String m137045h(int i) {
        return "Index:" + i + ", Size:" + this.f111489c;
    }

    @Override // p153l.mow0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM187640a = 1;
        for (int i = 0; i < this.f111489c; i++) {
            iM187640a = (iM187640a * 31) + srx0.m187640a(this.f111488b[i]);
        }
        return iM187640a;
    }

    /* JADX INFO: renamed from: i */
    public final void m137046i(int i) {
        if (i < 0 || i >= this.f111489c) {
            kym.m151996a(m137045h(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f111489c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f111488b[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p153l.mow0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m159318a();
        m137046i(i);
        boolean[] zArr = this.f111488b;
        boolean z = zArr[i];
        int i2 = this.f111489c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f111489c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m159318a();
        if (i2 < i) {
            kym.m151996a("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.f111488b;
        System.arraycopy(zArr, i2, zArr, i, this.f111489c - i2);
        this.f111489c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m159318a();
        m137046i(i);
        boolean[] zArr = this.f111488b;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f111489c;
    }

    @Override // p153l.orx0
    public final /* bridge */ /* synthetic */ orx0 zzd(int i) {
        if (i >= this.f111489c) {
            return new hsw0(i == 0 ? f111487d : Arrays.copyOf(this.f111488b, i), this.f111489c, true);
        }
        fig0.m125680a();
        return null;
    }

    public hsw0(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f111488b = zArr;
        this.f111489c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m137043c(((Boolean) obj).booleanValue());
        return true;
    }
}
