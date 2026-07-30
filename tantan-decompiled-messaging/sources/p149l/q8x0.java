package p149l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class q8x0 extends v6x0 implements RandomAccess, u8x0, gbx0 {

    /* JADX INFO: renamed from: d */
    public static final q8x0 f153342d = new q8x0(new int[0], 0, false);

    /* JADX INFO: renamed from: b */
    public int[] f153343b;

    /* JADX INFO: renamed from: c */
    public int f153344c;

    public q8x0() {
        this(new int[10], 0, true);
    }

    /* JADX INFO: renamed from: f */
    public static q8x0 m173576f() {
        return f153342d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m197278a();
        if (i < 0 || i > (i2 = this.f153344c)) {
            jwm.m143661a(m173578g(i));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.f153343b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f153343b, i, iArr2, i3, this.f153344c - i);
            this.f153343b = iArr2;
        }
        this.f153343b[i] = iIntValue;
        this.f153344c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p149l.v6x0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m197278a();
        Charset charset = aax0.f68607a;
        collection.getClass();
        if (!(collection instanceof q8x0)) {
            return super.addAll(collection);
        }
        q8x0 q8x0Var = (q8x0) collection;
        int i = q8x0Var.f153344c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f153344c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        int[] iArr = this.f153343b;
        if (i3 > iArr.length) {
            this.f153343b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(q8x0Var.f153343b, 0, this.f153343b, this.f153344c, q8x0Var.f153344c);
        this.f153344c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final int m173577c(int i) {
        m173579h(i);
        return this.f153343b[i];
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
        if (!(obj instanceof q8x0)) {
            return super.equals(obj);
        }
        q8x0 q8x0Var = (q8x0) obj;
        if (this.f153344c != q8x0Var.f153344c) {
            return false;
        }
        int[] iArr = q8x0Var.f153343b;
        for (int i = 0; i < this.f153344c; i++) {
            if (this.f153343b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final String m173578g(int i) {
        return "Index:" + i + ", Size:" + this.f153344c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m173579h(i);
        return Integer.valueOf(this.f153343b[i]);
    }

    /* JADX INFO: renamed from: h */
    public final void m173579h(int i) {
        if (i < 0 || i >= this.f153344c) {
            jwm.m143661a(m173578g(i));
        }
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f153344c; i2++) {
            i = (i * 31) + this.f153343b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f153344c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f153343b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m197278a();
        m173579h(i);
        int[] iArr = this.f153343b;
        int i2 = iArr[i];
        int i3 = this.f153344c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f153344c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m197278a();
        if (i2 < i) {
            jwm.m143661a("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f153343b;
        System.arraycopy(iArr, i2, iArr, i, this.f153344c - i2);
        this.f153344c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m197278a();
        m173579h(i);
        int[] iArr = this.f153343b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f153344c;
    }

    @Override // p149l.z9x0
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final u8x0 zzd(int i) {
        if (i >= this.f153344c) {
            return new q8x0(Arrays.copyOf(this.f153343b, i), this.f153344c, true);
        }
        x9g0.m207497a();
        return null;
    }

    @Override // p149l.u8x0
    public final void zzh(int i) {
        m197278a();
        int i2 = this.f153344c;
        int[] iArr = this.f153343b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f153343b = iArr2;
        }
        int[] iArr3 = this.f153343b;
        int i3 = this.f153344c;
        this.f153344c = i3 + 1;
        iArr3[i3] = i;
    }

    public q8x0(int[] iArr, int i, boolean z) {
        super(z);
        this.f153343b = iArr;
        this.f153344c = i;
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
