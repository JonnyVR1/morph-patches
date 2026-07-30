package p149l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class whx0 extends gfw0 implements RandomAccess, eix0, vnx0 {

    /* JADX INFO: renamed from: d */
    public static final int[] f186480d;

    /* JADX INFO: renamed from: e */
    public static final whx0 f186481e;

    /* JADX INFO: renamed from: b */
    public int[] f186482b;

    /* JADX INFO: renamed from: c */
    public int f186483c;

    static {
        int[] iArr = new int[0];
        f186480d = iArr;
        f186481e = new whx0(iArr, 0, false);
    }

    public whx0() {
        this(f186480d, 0, true);
    }

    /* JADX INFO: renamed from: f */
    public static whx0 m203253f() {
        return f186481e;
    }

    /* JADX INFO: renamed from: h */
    public static int m203254h(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m125929a();
        if (i < 0 || i > (i2 = this.f186483c)) {
            jwm.m143661a(m203257i(i));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.f186482b;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[m203254h(length)];
            System.arraycopy(this.f186482b, 0, iArr2, 0, i);
            System.arraycopy(this.f186482b, i, iArr2, i3, this.f186483c - i);
            this.f186482b = iArr2;
        }
        this.f186482b[i] = iIntValue;
        this.f186483c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p149l.gfw0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m125929a();
        Charset charset = mix0.f134047a;
        collection.getClass();
        if (!(collection instanceof whx0)) {
            return super.addAll(collection);
        }
        whx0 whx0Var = (whx0) collection;
        int i = whx0Var.f186483c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f186483c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        int[] iArr = this.f186482b;
        if (i3 > iArr.length) {
            this.f186482b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(whx0Var.f186482b, 0, this.f186482b, this.f186483c, whx0Var.f186483c);
        this.f186483c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final int m203255c(int i) {
        m203258j(i);
        return this.f186482b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p149l.gfw0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whx0)) {
            return super.equals(obj);
        }
        whx0 whx0Var = (whx0) obj;
        if (this.f186483c != whx0Var.f186483c) {
            return false;
        }
        int[] iArr = whx0Var.f186482b;
        for (int i = 0; i < this.f186483c; i++) {
            if (this.f186482b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m203256g(int i) {
        m125929a();
        int i2 = this.f186483c;
        int length = this.f186482b.length;
        if (i2 == length) {
            int[] iArr = new int[m203254h(length)];
            System.arraycopy(this.f186482b, 0, iArr, 0, this.f186483c);
            this.f186482b = iArr;
        }
        int[] iArr2 = this.f186482b;
        int i3 = this.f186483c;
        this.f186483c = i3 + 1;
        iArr2[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m203258j(i);
        return Integer.valueOf(this.f186482b[i]);
    }

    @Override // p149l.gfw0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f186483c; i2++) {
            i = (i * 31) + this.f186482b[i2];
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final String m203257i(int i) {
        return "Index:" + i + ", Size:" + this.f186483c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f186483c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f186482b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m203258j(int i) {
        if (i < 0 || i >= this.f186483c) {
            jwm.m143661a(m203257i(i));
        }
    }

    @Override // p149l.gfw0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m125929a();
        m203258j(i);
        int[] iArr = this.f186482b;
        int i2 = iArr[i];
        int i3 = this.f186483c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f186483c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m125929a();
        if (i2 < i) {
            jwm.m143661a("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f186482b;
        System.arraycopy(iArr, i2, iArr, i, this.f186483c - i2);
        this.f186483c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m125929a();
        m203258j(i);
        int[] iArr = this.f186482b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f186483c;
    }

    @Override // p149l.iix0
    public final /* bridge */ /* synthetic */ iix0 zzd(int i) {
        if (i >= this.f186483c) {
            return new whx0(i == 0 ? f186480d : Arrays.copyOf(this.f186482b, i), this.f186483c, true);
        }
        x9g0.m207497a();
        return null;
    }

    public final void zzh(int i) {
        int length = this.f186482b.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f186482b = new int[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = m203254h(length);
        }
        this.f186482b = Arrays.copyOf(this.f186482b, length);
    }

    public whx0(int[] iArr, int i, boolean z) {
        super(z);
        this.f186482b = iArr;
        this.f186483c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m203256g(((Integer) obj).intValue());
        return true;
    }
}
