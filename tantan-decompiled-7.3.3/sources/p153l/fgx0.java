package p153l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class fgx0 extends bgx0 implements RandomAccess, fjx0, mkx0 {

    /* JADX INFO: renamed from: d */
    public static final fgx0 f98985d = new fgx0(new boolean[0], 0, false);

    /* JADX INFO: renamed from: b */
    public boolean[] f98986b;

    /* JADX INFO: renamed from: c */
    public int f98987c;

    public fgx0() {
        this(new boolean[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m104285a();
        if (i < 0 || i > (i2 = this.f98987c)) {
            kym.m151996a(m125536f(i));
            return;
        }
        int i3 = i + 1;
        boolean[] zArr = this.f98986b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f98986b, i, zArr2, i3, this.f98987c - i);
            this.f98986b = zArr2;
        }
        this.f98986b[i] = zBooleanValue;
        this.f98987c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p153l.bgx0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m104285a();
        Charset charset = gjx0.f104688a;
        collection.getClass();
        if (!(collection instanceof fgx0)) {
            return super.addAll(collection);
        }
        fgx0 fgx0Var = (fgx0) collection;
        int i = fgx0Var.f98987c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f98987c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f98986b;
        if (i3 > zArr.length) {
            this.f98986b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(fgx0Var.f98986b, 0, this.f98986b, this.f98987c, fgx0Var.f98987c);
        this.f98987c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m125535c(boolean z) {
        m104285a();
        int i = this.f98987c;
        boolean[] zArr = this.f98986b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f98986b = zArr2;
        }
        boolean[] zArr3 = this.f98986b;
        int i2 = this.f98987c;
        this.f98987c = i2 + 1;
        zArr3[i2] = z;
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
        if (!(obj instanceof fgx0)) {
            return super.equals(obj);
        }
        fgx0 fgx0Var = (fgx0) obj;
        if (this.f98987c != fgx0Var.f98987c) {
            return false;
        }
        boolean[] zArr = fgx0Var.f98986b;
        for (int i = 0; i < this.f98987c; i++) {
            if (this.f98986b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final String m125536f(int i) {
        return "Index:" + i + ", Size:" + this.f98987c;
    }

    /* JADX INFO: renamed from: g */
    public final void m125537g(int i) {
        if (i < 0 || i >= this.f98987c) {
            kym.m151996a(m125536f(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m125537g(i);
        return Boolean.valueOf(this.f98986b[i]);
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM130562a = 1;
        for (int i = 0; i < this.f98987c; i++) {
            iM130562a = (iM130562a * 31) + gjx0.m130562a(this.f98986b[i]);
        }
        return iM130562a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f98987c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f98986b[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m104285a();
        m125537g(i);
        boolean[] zArr = this.f98986b;
        boolean z = zArr[i];
        int i2 = this.f98987c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f98987c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m104285a();
        if (i2 < i) {
            kym.m151996a("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.f98986b;
        System.arraycopy(zArr, i2, zArr, i, this.f98987c - i2);
        this.f98987c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m104285a();
        m125537g(i);
        boolean[] zArr = this.f98986b;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f98987c;
    }

    @Override // p153l.fjx0
    public final /* bridge */ /* synthetic */ fjx0 zzd(int i) {
        if (i >= this.f98987c) {
            return new fgx0(Arrays.copyOf(this.f98986b, i), this.f98987c, true);
        }
        fig0.m125680a();
        return null;
    }

    public fgx0(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f98986b = zArr;
        this.f98987c = i;
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m125535c(((Boolean) obj).booleanValue());
        return true;
    }
}
