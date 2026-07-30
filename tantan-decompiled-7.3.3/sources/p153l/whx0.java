package p153l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class whx0 extends bgx0 implements RandomAccess, aix0, mkx0 {

    /* JADX INFO: renamed from: d */
    public static final whx0 f189320d = new whx0(new int[0], 0, false);

    /* JADX INFO: renamed from: b */
    public int[] f189321b;

    /* JADX INFO: renamed from: c */
    public int f189322c;

    public whx0() {
        this(new int[10], 0, true);
    }

    /* JADX INFO: renamed from: f */
    public static whx0 m206524f() {
        return f189320d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m104285a();
        if (i < 0 || i > (i2 = this.f189322c)) {
            kym.m151996a(m206526g(i));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.f189321b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f189321b, i, iArr2, i3, this.f189322c - i);
            this.f189321b = iArr2;
        }
        this.f189321b[i] = iIntValue;
        this.f189322c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p153l.bgx0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m104285a();
        Charset charset = gjx0.f104688a;
        collection.getClass();
        if (!(collection instanceof whx0)) {
            return super.addAll(collection);
        }
        whx0 whx0Var = (whx0) collection;
        int i = whx0Var.f189322c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f189322c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        int[] iArr = this.f189321b;
        if (i3 > iArr.length) {
            this.f189321b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(whx0Var.f189321b, 0, this.f189321b, this.f189322c, whx0Var.f189322c);
        this.f189322c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final int m206525c(int i) {
        m206527h(i);
        return this.f189321b[i];
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
        if (!(obj instanceof whx0)) {
            return super.equals(obj);
        }
        whx0 whx0Var = (whx0) obj;
        if (this.f189322c != whx0Var.f189322c) {
            return false;
        }
        int[] iArr = whx0Var.f189321b;
        for (int i = 0; i < this.f189322c; i++) {
            if (this.f189321b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final String m206526g(int i) {
        return "Index:" + i + ", Size:" + this.f189322c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m206527h(i);
        return Integer.valueOf(this.f189321b[i]);
    }

    /* JADX INFO: renamed from: h */
    public final void m206527h(int i) {
        if (i < 0 || i >= this.f189322c) {
            kym.m151996a(m206526g(i));
        }
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f189322c; i2++) {
            i = (i * 31) + this.f189321b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f189322c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f189321b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m104285a();
        m206527h(i);
        int[] iArr = this.f189321b;
        int i2 = iArr[i];
        int i3 = this.f189322c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f189322c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m104285a();
        if (i2 < i) {
            kym.m151996a("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f189321b;
        System.arraycopy(iArr, i2, iArr, i, this.f189322c - i2);
        this.f189322c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m104285a();
        m206527h(i);
        int[] iArr = this.f189321b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f189322c;
    }

    @Override // p153l.fjx0
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final aix0 zzd(int i) {
        if (i >= this.f189322c) {
            return new whx0(Arrays.copyOf(this.f189321b, i), this.f189322c, true);
        }
        fig0.m125680a();
        return null;
    }

    @Override // p153l.aix0
    public final void zzh(int i) {
        m104285a();
        int i2 = this.f189322c;
        int[] iArr = this.f189321b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f189321b = iArr2;
        }
        int[] iArr3 = this.f189321b;
        int i3 = this.f189322c;
        this.f189322c = i3 + 1;
        iArr3[i3] = i;
    }

    public whx0(int[] iArr, int i, boolean z) {
        super(z);
        this.f189321b = iArr;
        this.f189322c = i;
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
