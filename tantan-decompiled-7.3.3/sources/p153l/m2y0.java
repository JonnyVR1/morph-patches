package p153l;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class m2y0 extends pux0<Integer> implements z3y0, lby0, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final int[] f134630d;

    /* JADX INFO: renamed from: e */
    public static final m2y0 f134631e;

    /* JADX INFO: renamed from: b */
    public int[] f134632b;

    /* JADX INFO: renamed from: c */
    public int f134633c;

    static {
        int[] iArr = new int[0];
        f134630d = iArr;
        f134631e = new m2y0(iArr, 0, false);
    }

    public m2y0() {
        this(f134630d, 0, true);
    }

    /* JADX INFO: renamed from: f */
    public static m2y0 m156909f() {
        return f134631e;
    }

    /* JADX INFO: renamed from: i */
    public static int m156910i(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m173917a();
        if (i < 0 || i > (i2 = this.f134633c)) {
            kym.m151996a(m156914j(i));
            return;
        }
        int[] iArr = this.f134632b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[m156910i(iArr.length)];
            System.arraycopy(this.f134632b, 0, iArr2, 0, i);
            System.arraycopy(this.f134632b, i, iArr2, i + 1, this.f134633c - i);
            this.f134632b = iArr2;
        }
        this.f134632b[i] = iIntValue;
        this.f134633c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p153l.pux0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m173917a();
        i2y0.m138253e(collection);
        if (!(collection instanceof m2y0)) {
            return super.addAll(collection);
        }
        m2y0 m2y0Var = (m2y0) collection;
        int i = m2y0Var.f134633c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f134633c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        int[] iArr = this.f134632b;
        if (i3 > iArr.length) {
            this.f134632b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(m2y0Var.f134632b, 0, this.f134632b, this.f134633c, m2y0Var.f134633c);
        this.f134633c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final int m156911c(int i) {
        zzh(i);
        return this.f134632b[i];
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
        if (!(obj instanceof m2y0)) {
            return super.equals(obj);
        }
        m2y0 m2y0Var = (m2y0) obj;
        if (this.f134633c != m2y0Var.f134633c) {
            return false;
        }
        int[] iArr = m2y0Var.f134632b;
        for (int i = 0; i < this.f134633c; i++) {
            if (this.f134632b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m156912g(int i) {
        m173917a();
        int i2 = this.f134633c;
        int[] iArr = this.f134632b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[m156910i(iArr.length)];
            System.arraycopy(this.f134632b, 0, iArr2, 0, this.f134633c);
            this.f134632b = iArr2;
        }
        int[] iArr3 = this.f134632b;
        int i3 = this.f134633c;
        this.f134633c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(m156911c(i));
    }

    /* JADX INFO: renamed from: h */
    public final void m156913h(int i) {
        int[] iArr = this.f134632b;
        if (i <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.f134632b = new int[Math.max(i, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i) {
            length = m156910i(length);
        }
        this.f134632b = Arrays.copyOf(this.f134632b, length);
    }

    @Override // p153l.pux0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f134633c; i2++) {
            i = (i * 31) + this.f134632b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f134632b[i] == iIntValue) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final String m156914j(int i) {
        return "Index:" + i + ", Size:" + this.f134633c;
    }

    @Override // p153l.pux0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m173917a();
        zzh(i);
        int[] iArr = this.f134632b;
        int i2 = iArr[i];
        int i3 = this.f134633c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f134633c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m173917a();
        if (i2 < i) {
            kym.m151996a("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f134632b;
        System.arraycopy(iArr, i2, iArr, i, this.f134633c - i2);
        this.f134633c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m173917a();
        zzh(i);
        int[] iArr = this.f134632b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f134633c;
    }

    @Override // p153l.i4y0
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final z3y0 zza(int i) {
        if (i >= this.f134633c) {
            return new m2y0(i == 0 ? f134630d : Arrays.copyOf(this.f134632b, i), this.f134633c, true);
        }
        fig0.m125680a();
        return null;
    }

    public final void zzh(int i) {
        if (i < 0 || i >= this.f134633c) {
            kym.m151996a(m156914j(i));
        }
    }

    public m2y0(int[] iArr, int i, boolean z) {
        super(z);
        this.f134632b = iArr;
        this.f134633c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m156912g(((Integer) obj).intValue());
        return true;
    }
}
