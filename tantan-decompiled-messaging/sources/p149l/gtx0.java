package p149l;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class gtx0 extends jlx0<Integer> implements tux0, f2y0, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final int[] f104357d;

    /* JADX INFO: renamed from: e */
    public static final gtx0 f104358e;

    /* JADX INFO: renamed from: b */
    public int[] f104359b;

    /* JADX INFO: renamed from: c */
    public int f104360c;

    static {
        int[] iArr = new int[0];
        f104357d = iArr;
        f104358e = new gtx0(iArr, 0, false);
    }

    public gtx0() {
        this(f104357d, 0, true);
    }

    /* JADX INFO: renamed from: f */
    public static gtx0 m128005f() {
        return f104358e;
    }

    /* JADX INFO: renamed from: i */
    public static int m128006i(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m142120a();
        if (i < 0 || i > (i2 = this.f104360c)) {
            jwm.m143661a(m128010j(i));
            return;
        }
        int[] iArr = this.f104359b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[m128006i(iArr.length)];
            System.arraycopy(this.f104359b, 0, iArr2, 0, i);
            System.arraycopy(this.f104359b, i, iArr2, i + 1, this.f104360c - i);
            this.f104359b = iArr2;
        }
        this.f104359b[i] = iIntValue;
        this.f104360c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p149l.jlx0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m142120a();
        ctx0.m108707e(collection);
        if (!(collection instanceof gtx0)) {
            return super.addAll(collection);
        }
        gtx0 gtx0Var = (gtx0) collection;
        int i = gtx0Var.f104360c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f104360c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        int[] iArr = this.f104359b;
        if (i3 > iArr.length) {
            this.f104359b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(gtx0Var.f104359b, 0, this.f104359b, this.f104360c, gtx0Var.f104360c);
        this.f104360c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final int m128007c(int i) {
        zzh(i);
        return this.f104359b[i];
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
        if (!(obj instanceof gtx0)) {
            return super.equals(obj);
        }
        gtx0 gtx0Var = (gtx0) obj;
        if (this.f104360c != gtx0Var.f104360c) {
            return false;
        }
        int[] iArr = gtx0Var.f104359b;
        for (int i = 0; i < this.f104360c; i++) {
            if (this.f104359b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m128008g(int i) {
        m142120a();
        int i2 = this.f104360c;
        int[] iArr = this.f104359b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[m128006i(iArr.length)];
            System.arraycopy(this.f104359b, 0, iArr2, 0, this.f104360c);
            this.f104359b = iArr2;
        }
        int[] iArr3 = this.f104359b;
        int i3 = this.f104360c;
        this.f104360c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(m128007c(i));
    }

    /* JADX INFO: renamed from: h */
    public final void m128009h(int i) {
        int[] iArr = this.f104359b;
        if (i <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.f104359b = new int[Math.max(i, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i) {
            length = m128006i(length);
        }
        this.f104359b = Arrays.copyOf(this.f104359b, length);
    }

    @Override // p149l.jlx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f104360c; i2++) {
            i = (i * 31) + this.f104359b[i2];
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
            if (this.f104359b[i] == iIntValue) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final String m128010j(int i) {
        return "Index:" + i + ", Size:" + this.f104360c;
    }

    @Override // p149l.jlx0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m142120a();
        zzh(i);
        int[] iArr = this.f104359b;
        int i2 = iArr[i];
        int i3 = this.f104360c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f104360c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m142120a();
        if (i2 < i) {
            jwm.m143661a("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f104359b;
        System.arraycopy(iArr, i2, iArr, i, this.f104360c - i2);
        this.f104360c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m142120a();
        zzh(i);
        int[] iArr = this.f104359b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f104360c;
    }

    @Override // p149l.cvx0
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final tux0 zza(int i) {
        if (i >= this.f104360c) {
            return new gtx0(i == 0 ? f104357d : Arrays.copyOf(this.f104359b, i), this.f104360c, true);
        }
        x9g0.m207497a();
        return null;
    }

    public final void zzh(int i) {
        if (i < 0 || i >= this.f104360c) {
            jwm.m143661a(m128010j(i));
        }
    }

    public gtx0(int[] iArr, int i, boolean z) {
        super(z);
        this.f104359b = iArr;
        this.f104360c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m128008g(((Integer) obj).intValue());
        return true;
    }
}
