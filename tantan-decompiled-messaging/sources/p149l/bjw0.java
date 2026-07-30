package p149l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class bjw0 extends gfw0 implements RandomAccess, iix0, vnx0 {

    /* JADX INFO: renamed from: d */
    public static final boolean[] f75947d;

    /* JADX INFO: renamed from: b */
    public boolean[] f75948b;

    /* JADX INFO: renamed from: c */
    public int f75949c;

    static {
        boolean[] zArr = new boolean[0];
        f75947d = zArr;
        new bjw0(zArr, 0, false);
    }

    public bjw0() {
        this(f75947d, 0, true);
    }

    /* JADX INFO: renamed from: g */
    public static int m102237g(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m125929a();
        if (i < 0 || i > (i2 = this.f75949c)) {
            jwm.m143661a(m102240h(i));
            return;
        }
        int i3 = i + 1;
        boolean[] zArr = this.f75948b;
        int length = zArr.length;
        if (i2 < length) {
            System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[m102237g(length)];
            System.arraycopy(this.f75948b, 0, zArr2, 0, i);
            System.arraycopy(this.f75948b, i, zArr2, i3, this.f75949c - i);
            this.f75948b = zArr2;
        }
        this.f75948b[i] = zBooleanValue;
        this.f75949c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p149l.gfw0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m125929a();
        Charset charset = mix0.f134047a;
        collection.getClass();
        if (!(collection instanceof bjw0)) {
            return super.addAll(collection);
        }
        bjw0 bjw0Var = (bjw0) collection;
        int i = bjw0Var.f75949c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f75949c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f75948b;
        if (i3 > zArr.length) {
            this.f75948b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(bjw0Var.f75948b, 0, this.f75948b, this.f75949c, bjw0Var.f75949c);
        this.f75949c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m102238c(boolean z) {
        m125929a();
        int i = this.f75949c;
        int length = this.f75948b.length;
        if (i == length) {
            boolean[] zArr = new boolean[m102237g(length)];
            System.arraycopy(this.f75948b, 0, zArr, 0, this.f75949c);
            this.f75948b = zArr;
        }
        boolean[] zArr2 = this.f75948b;
        int i2 = this.f75949c;
        this.f75949c = i2 + 1;
        zArr2[i2] = z;
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
        if (!(obj instanceof bjw0)) {
            return super.equals(obj);
        }
        bjw0 bjw0Var = (bjw0) obj;
        if (this.f75949c != bjw0Var.f75949c) {
            return false;
        }
        boolean[] zArr = bjw0Var.f75948b;
        for (int i = 0; i < this.f75949c; i++) {
            if (this.f75948b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m102239f(int i) {
        m102241i(i);
        return this.f75948b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m102241i(i);
        return Boolean.valueOf(this.f75948b[i]);
    }

    /* JADX INFO: renamed from: h */
    public final String m102240h(int i) {
        return "Index:" + i + ", Size:" + this.f75949c;
    }

    @Override // p149l.gfw0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM154765a = 1;
        for (int i = 0; i < this.f75949c; i++) {
            iM154765a = (iM154765a * 31) + mix0.m154765a(this.f75948b[i]);
        }
        return iM154765a;
    }

    /* JADX INFO: renamed from: i */
    public final void m102241i(int i) {
        if (i < 0 || i >= this.f75949c) {
            jwm.m143661a(m102240h(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f75949c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f75948b[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p149l.gfw0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m125929a();
        m102241i(i);
        boolean[] zArr = this.f75948b;
        boolean z = zArr[i];
        int i2 = this.f75949c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f75949c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m125929a();
        if (i2 < i) {
            jwm.m143661a("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.f75948b;
        System.arraycopy(zArr, i2, zArr, i, this.f75949c - i2);
        this.f75949c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m125929a();
        m102241i(i);
        boolean[] zArr = this.f75948b;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f75949c;
    }

    @Override // p149l.iix0
    public final /* bridge */ /* synthetic */ iix0 zzd(int i) {
        if (i >= this.f75949c) {
            return new bjw0(i == 0 ? f75947d : Arrays.copyOf(this.f75948b, i), this.f75949c, true);
        }
        x9g0.m207497a();
        return null;
    }

    public bjw0(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f75948b = zArr;
        this.f75949c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m102238c(((Boolean) obj).booleanValue());
        return true;
    }
}
