package p149l;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class zlx0 extends jlx0<Boolean> implements cvx0<Boolean>, f2y0, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final boolean[] f203673d;

    /* JADX INFO: renamed from: b */
    public boolean[] f203674b;

    /* JADX INFO: renamed from: c */
    public int f203675c;

    static {
        boolean[] zArr = new boolean[0];
        f203673d = zArr;
        new zlx0(zArr, 0, false);
    }

    public zlx0() {
        this(f203673d, 0, true);
    }

    /* JADX INFO: renamed from: g */
    public static int m219293g(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: i */
    private final void m219294i(int i) {
        if (i < 0 || i >= this.f203675c) {
            jwm.m143661a(m219297h(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m142120a();
        if (i < 0 || i > (i2 = this.f203675c)) {
            jwm.m143661a(m219297h(i));
            return;
        }
        boolean[] zArr = this.f203674b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[m219293g(zArr.length)];
            System.arraycopy(this.f203674b, 0, zArr2, 0, i);
            System.arraycopy(this.f203674b, i, zArr2, i + 1, this.f203675c - i);
            this.f203674b = zArr2;
        }
        this.f203674b[i] = zBooleanValue;
        this.f203675c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p149l.jlx0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m142120a();
        ctx0.m108707e(collection);
        if (!(collection instanceof zlx0)) {
            return super.addAll(collection);
        }
        zlx0 zlx0Var = (zlx0) collection;
        int i = zlx0Var.f203675c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f203675c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f203674b;
        if (i3 > zArr.length) {
            this.f203674b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(zlx0Var.f203674b, 0, this.f203674b, this.f203675c, zlx0Var.f203675c);
        this.f203675c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m219295c(boolean z) {
        m142120a();
        int i = this.f203675c;
        boolean[] zArr = this.f203674b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[m219293g(zArr.length)];
            System.arraycopy(this.f203674b, 0, zArr2, 0, this.f203675c);
            this.f203674b = zArr2;
        }
        boolean[] zArr3 = this.f203674b;
        int i2 = this.f203675c;
        this.f203675c = i2 + 1;
        zArr3[i2] = z;
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
        if (!(obj instanceof zlx0)) {
            return super.equals(obj);
        }
        zlx0 zlx0Var = (zlx0) obj;
        if (this.f203675c != zlx0Var.f203675c) {
            return false;
        }
        boolean[] zArr = zlx0Var.f203674b;
        for (int i = 0; i < this.f203675c; i++) {
            if (this.f203674b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m219296f(int i) {
        m219294i(i);
        return this.f203674b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Boolean.valueOf(m219296f(i));
    }

    /* JADX INFO: renamed from: h */
    public final String m219297h(int i) {
        return "Index:" + i + ", Size:" + this.f203675c;
    }

    @Override // p149l.jlx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM108705c = 1;
        for (int i = 0; i < this.f203675c; i++) {
            iM108705c = (iM108705c * 31) + ctx0.m108705c(this.f203674b[i]);
        }
        return iM108705c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f203674b[i] == zBooleanValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // p149l.jlx0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m142120a();
        m219294i(i);
        boolean[] zArr = this.f203674b;
        boolean z = zArr[i];
        int i2 = this.f203675c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f203675c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m142120a();
        if (i2 < i) {
            jwm.m143661a("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.f203674b;
        System.arraycopy(zArr, i2, zArr, i, this.f203675c - i2);
        this.f203675c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m142120a();
        m219294i(i);
        boolean[] zArr = this.f203674b;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f203675c;
    }

    @Override // p149l.cvx0
    public final /* synthetic */ cvx0<Boolean> zza(int i) {
        if (i >= this.f203675c) {
            return new zlx0(i == 0 ? f203673d : Arrays.copyOf(this.f203674b, i), this.f203675c, true);
        }
        x9g0.m207497a();
        return null;
    }

    public zlx0(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f203674b = zArr;
        this.f203675c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m219295c(((Boolean) obj).booleanValue());
        return true;
    }
}
