package p149l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class z6x0 extends v6x0 implements RandomAccess, z9x0, gbx0 {

    /* JADX INFO: renamed from: d */
    public static final z6x0 f201968d = new z6x0(new boolean[0], 0, false);

    /* JADX INFO: renamed from: b */
    public boolean[] f201969b;

    /* JADX INFO: renamed from: c */
    public int f201970c;

    public z6x0() {
        this(new boolean[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m197278a();
        if (i < 0 || i > (i2 = this.f201970c)) {
            jwm.m143661a(m217423f(i));
            return;
        }
        int i3 = i + 1;
        boolean[] zArr = this.f201969b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f201969b, i, zArr2, i3, this.f201970c - i);
            this.f201969b = zArr2;
        }
        this.f201969b[i] = zBooleanValue;
        this.f201970c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p149l.v6x0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m197278a();
        Charset charset = aax0.f68607a;
        collection.getClass();
        if (!(collection instanceof z6x0)) {
            return super.addAll(collection);
        }
        z6x0 z6x0Var = (z6x0) collection;
        int i = z6x0Var.f201970c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f201970c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f201969b;
        if (i3 > zArr.length) {
            this.f201969b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(z6x0Var.f201969b, 0, this.f201969b, this.f201970c, z6x0Var.f201970c);
        this.f201970c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m217422c(boolean z) {
        m197278a();
        int i = this.f201970c;
        boolean[] zArr = this.f201969b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f201969b = zArr2;
        }
        boolean[] zArr3 = this.f201969b;
        int i2 = this.f201970c;
        this.f201970c = i2 + 1;
        zArr3[i2] = z;
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
        if (!(obj instanceof z6x0)) {
            return super.equals(obj);
        }
        z6x0 z6x0Var = (z6x0) obj;
        if (this.f201970c != z6x0Var.f201970c) {
            return false;
        }
        boolean[] zArr = z6x0Var.f201969b;
        for (int i = 0; i < this.f201970c; i++) {
            if (this.f201969b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final String m217423f(int i) {
        return "Index:" + i + ", Size:" + this.f201970c;
    }

    /* JADX INFO: renamed from: g */
    public final void m217424g(int i) {
        if (i < 0 || i >= this.f201970c) {
            jwm.m143661a(m217423f(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m217424g(i);
        return Boolean.valueOf(this.f201969b[i]);
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM95573a = 1;
        for (int i = 0; i < this.f201970c; i++) {
            iM95573a = (iM95573a * 31) + aax0.m95573a(this.f201969b[i]);
        }
        return iM95573a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f201970c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f201969b[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m197278a();
        m217424g(i);
        boolean[] zArr = this.f201969b;
        boolean z = zArr[i];
        int i2 = this.f201970c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f201970c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m197278a();
        if (i2 < i) {
            jwm.m143661a("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.f201969b;
        System.arraycopy(zArr, i2, zArr, i, this.f201970c - i2);
        this.f201970c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m197278a();
        m217424g(i);
        boolean[] zArr = this.f201969b;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f201970c;
    }

    @Override // p149l.z9x0
    public final /* bridge */ /* synthetic */ z9x0 zzd(int i) {
        if (i >= this.f201970c) {
            return new z6x0(Arrays.copyOf(this.f201969b, i), this.f201970c, true);
        }
        x9g0.m207497a();
        return null;
    }

    public z6x0(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f201969b = zArr;
        this.f201970c = i;
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m217422c(((Boolean) obj).booleanValue());
        return true;
    }
}
