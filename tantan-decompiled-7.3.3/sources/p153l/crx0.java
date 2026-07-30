package p153l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class crx0 extends mow0 implements RandomAccess, krx0, bxx0 {

    /* JADX INFO: renamed from: d */
    public static final int[] f83374d;

    /* JADX INFO: renamed from: e */
    public static final crx0 f83375e;

    /* JADX INFO: renamed from: b */
    public int[] f83376b;

    /* JADX INFO: renamed from: c */
    public int f83377c;

    static {
        int[] iArr = new int[0];
        f83374d = iArr;
        f83375e = new crx0(iArr, 0, false);
    }

    public crx0() {
        this(f83374d, 0, true);
    }

    /* JADX INFO: renamed from: f */
    public static crx0 m112091f() {
        return f83375e;
    }

    /* JADX INFO: renamed from: h */
    public static int m112092h(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m159318a();
        if (i < 0 || i > (i2 = this.f83377c)) {
            kym.m151996a(m112095i(i));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.f83376b;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[m112092h(length)];
            System.arraycopy(this.f83376b, 0, iArr2, 0, i);
            System.arraycopy(this.f83376b, i, iArr2, i3, this.f83377c - i);
            this.f83376b = iArr2;
        }
        this.f83376b[i] = iIntValue;
        this.f83377c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p153l.mow0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m159318a();
        Charset charset = srx0.f170385a;
        collection.getClass();
        if (!(collection instanceof crx0)) {
            return super.addAll(collection);
        }
        crx0 crx0Var = (crx0) collection;
        int i = crx0Var.f83377c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f83377c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        int[] iArr = this.f83376b;
        if (i3 > iArr.length) {
            this.f83376b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(crx0Var.f83376b, 0, this.f83376b, this.f83377c, crx0Var.f83377c);
        this.f83377c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final int m112093c(int i) {
        m112096j(i);
        return this.f83376b[i];
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
        if (!(obj instanceof crx0)) {
            return super.equals(obj);
        }
        crx0 crx0Var = (crx0) obj;
        if (this.f83377c != crx0Var.f83377c) {
            return false;
        }
        int[] iArr = crx0Var.f83376b;
        for (int i = 0; i < this.f83377c; i++) {
            if (this.f83376b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m112094g(int i) {
        m159318a();
        int i2 = this.f83377c;
        int length = this.f83376b.length;
        if (i2 == length) {
            int[] iArr = new int[m112092h(length)];
            System.arraycopy(this.f83376b, 0, iArr, 0, this.f83377c);
            this.f83376b = iArr;
        }
        int[] iArr2 = this.f83376b;
        int i3 = this.f83377c;
        this.f83377c = i3 + 1;
        iArr2[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m112096j(i);
        return Integer.valueOf(this.f83376b[i]);
    }

    @Override // p153l.mow0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f83377c; i2++) {
            i = (i * 31) + this.f83376b[i2];
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final String m112095i(int i) {
        return "Index:" + i + ", Size:" + this.f83377c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f83377c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f83376b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m112096j(int i) {
        if (i < 0 || i >= this.f83377c) {
            kym.m151996a(m112095i(i));
        }
    }

    @Override // p153l.mow0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m159318a();
        m112096j(i);
        int[] iArr = this.f83376b;
        int i2 = iArr[i];
        int i3 = this.f83377c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f83377c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m159318a();
        if (i2 < i) {
            kym.m151996a("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f83376b;
        System.arraycopy(iArr, i2, iArr, i, this.f83377c - i2);
        this.f83377c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m159318a();
        m112096j(i);
        int[] iArr = this.f83376b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f83377c;
    }

    @Override // p153l.orx0
    public final /* bridge */ /* synthetic */ orx0 zzd(int i) {
        if (i >= this.f83377c) {
            return new crx0(i == 0 ? f83374d : Arrays.copyOf(this.f83376b, i), this.f83377c, true);
        }
        fig0.m125680a();
        return null;
    }

    public final void zzh(int i) {
        int length = this.f83376b.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f83376b = new int[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = m112092h(length);
        }
        this.f83376b = Arrays.copyOf(this.f83376b, length);
    }

    public crx0(int[] iArr, int i, boolean z) {
        super(z);
        this.f83376b = iArr;
        this.f83377c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m112094g(((Integer) obj).intValue());
        return true;
    }
}
