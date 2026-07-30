package p153l;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class fvx0 extends pux0<Boolean> implements i4y0<Boolean>, lby0, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final boolean[] f101107d;

    /* JADX INFO: renamed from: b */
    public boolean[] f101108b;

    /* JADX INFO: renamed from: c */
    public int f101109c;

    static {
        boolean[] zArr = new boolean[0];
        f101107d = zArr;
        new fvx0(zArr, 0, false);
    }

    public fvx0() {
        this(f101107d, 0, true);
    }

    /* JADX INFO: renamed from: g */
    public static int m127741g(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: i */
    private final void m127742i(int i) {
        if (i < 0 || i >= this.f101109c) {
            kym.m151996a(m127745h(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m173917a();
        if (i < 0 || i > (i2 = this.f101109c)) {
            kym.m151996a(m127745h(i));
            return;
        }
        boolean[] zArr = this.f101108b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[m127741g(zArr.length)];
            System.arraycopy(this.f101108b, 0, zArr2, 0, i);
            System.arraycopy(this.f101108b, i, zArr2, i + 1, this.f101109c - i);
            this.f101108b = zArr2;
        }
        this.f101108b[i] = zBooleanValue;
        this.f101109c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p153l.pux0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m173917a();
        i2y0.m138253e(collection);
        if (!(collection instanceof fvx0)) {
            return super.addAll(collection);
        }
        fvx0 fvx0Var = (fvx0) collection;
        int i = fvx0Var.f101109c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f101109c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f101108b;
        if (i3 > zArr.length) {
            this.f101108b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(fvx0Var.f101108b, 0, this.f101108b, this.f101109c, fvx0Var.f101109c);
        this.f101109c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m127743c(boolean z) {
        m173917a();
        int i = this.f101109c;
        boolean[] zArr = this.f101108b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[m127741g(zArr.length)];
            System.arraycopy(this.f101108b, 0, zArr2, 0, this.f101109c);
            this.f101108b = zArr2;
        }
        boolean[] zArr3 = this.f101108b;
        int i2 = this.f101109c;
        this.f101109c = i2 + 1;
        zArr3[i2] = z;
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
        if (!(obj instanceof fvx0)) {
            return super.equals(obj);
        }
        fvx0 fvx0Var = (fvx0) obj;
        if (this.f101109c != fvx0Var.f101109c) {
            return false;
        }
        boolean[] zArr = fvx0Var.f101108b;
        for (int i = 0; i < this.f101109c; i++) {
            if (this.f101108b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m127744f(int i) {
        m127742i(i);
        return this.f101108b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Boolean.valueOf(m127744f(i));
    }

    /* JADX INFO: renamed from: h */
    public final String m127745h(int i) {
        return "Index:" + i + ", Size:" + this.f101109c;
    }

    @Override // p153l.pux0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM138251c = 1;
        for (int i = 0; i < this.f101109c; i++) {
            iM138251c = (iM138251c * 31) + i2y0.m138251c(this.f101108b[i]);
        }
        return iM138251c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f101108b[i] == zBooleanValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // p153l.pux0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m173917a();
        m127742i(i);
        boolean[] zArr = this.f101108b;
        boolean z = zArr[i];
        int i2 = this.f101109c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f101109c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m173917a();
        if (i2 < i) {
            kym.m151996a("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.f101108b;
        System.arraycopy(zArr, i2, zArr, i, this.f101109c - i2);
        this.f101109c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m173917a();
        m127742i(i);
        boolean[] zArr = this.f101108b;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f101109c;
    }

    @Override // p153l.i4y0
    public final /* synthetic */ i4y0<Boolean> zza(int i) {
        if (i >= this.f101109c) {
            return new fvx0(i == 0 ? f101107d : Arrays.copyOf(this.f101108b, i), this.f101109c, true);
        }
        fig0.m125680a();
        return null;
    }

    public fvx0(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f101108b = zArr;
        this.f101109c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m127743c(((Boolean) obj).booleanValue());
        return true;
    }
}
