package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p153l.fig0;
import p153l.jym;
import p153l.kym;
import p153l.ru80;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0329f extends AbstractC0323c<Boolean> implements C0351s.a, RandomAccess, ru80 {

    /* JADX INFO: renamed from: d */
    public static final C0329f f1638d;

    /* JADX INFO: renamed from: b */
    public boolean[] f1639b;

    /* JADX INFO: renamed from: c */
    public int f1640c;

    static {
        C0329f c0329f = new C0329f(new boolean[0], 0);
        f1638d = c0329f;
        c0329f.mo1820n();
    }

    public C0329f() {
        this(new boolean[10], 0);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        m1819a();
        C0351s.m2340a(collection);
        if (!(collection instanceof C0329f)) {
            return super.addAll(collection);
        }
        C0329f c0329f = (C0329f) collection;
        int i = c0329f.f1640c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f1640c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f1639b;
        if (i3 > zArr.length) {
            this.f1639b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(c0329f.f1639b, 0, this.f1639b, this.f1640c, c0329f.f1640c);
        this.f1640c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, Boolean bool) {
        m2017g(i, bool.booleanValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0329f)) {
            return super.equals(obj);
        }
        C0329f c0329f = (C0329f) obj;
        if (this.f1640c != c0329f.f1640c) {
            return false;
        }
        boolean[] zArr = c0329f.f1639b;
        for (int i = 0; i < this.f1640c; i++) {
            if (this.f1639b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        m2018h(bool.booleanValue());
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m2017g(int i, boolean z) {
        int i2;
        m1819a();
        if (i < 0 || i > (i2 = this.f1640c)) {
            kym.m151996a(m2022o(i));
            return;
        }
        boolean[] zArr = this.f1639b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f1639b, i, zArr2, i + 1, this.f1640c - i);
            this.f1639b = zArr2;
        }
        this.f1639b[i] = z;
        this.f1640c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: h */
    public void m2018h(boolean z) {
        m1819a();
        int i = this.f1640c;
        boolean[] zArr = this.f1639b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f1639b = zArr2;
        }
        boolean[] zArr3 = this.f1639b;
        int i2 = this.f1640c;
        this.f1640c = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM2342c = 1;
        for (int i = 0; i < this.f1640c; i++) {
            iM2342c = (iM2342c * 31) + C0351s.m2342c(this.f1639b[i]);
        }
        return iM2342c;
    }

    /* JADX INFO: renamed from: i */
    public final void m2019i(int i) {
        if (i < 0 || i >= this.f1640c) {
            kym.m151996a(m2022o(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i) {
        return Boolean.valueOf(m2021l(i));
    }

    /* JADX INFO: renamed from: l */
    public boolean m2021l(int i) {
        m2019i(i);
        return this.f1639b[i];
    }

    /* JADX INFO: renamed from: o */
    public final String m2022o(int i) {
        return "Index:" + i + ", Size:" + this.f1640c;
    }

    @Override // androidx.datastore.preferences.protobuf.C0351s.i
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C0351s.a mo2015d(int i) {
        if (i >= this.f1640c) {
            return new C0329f(Arrays.copyOf(this.f1639b, i), this.f1640c);
        }
        fig0.m125680a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i) {
        m1819a();
        m2019i(i);
        boolean[] zArr = this.f1639b;
        boolean z = zArr[i];
        int i2 = this.f1640c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f1640c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m1819a();
        for (int i = 0; i < this.f1640c; i++) {
            if (obj.equals(Boolean.valueOf(this.f1639b[i]))) {
                boolean[] zArr = this.f1639b;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f1640c - i) - 1);
                this.f1640c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        m1819a();
        if (i2 < i) {
            kym.m151996a("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.f1639b;
        System.arraycopy(zArr, i2, zArr, i, this.f1640c - i2);
        this.f1640c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(m2026v(i, bool.booleanValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f1640c;
    }

    /* JADX INFO: renamed from: v */
    public boolean m2026v(int i, boolean z) {
        m1819a();
        m2019i(i);
        boolean[] zArr = this.f1639b;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    public C0329f(boolean[] zArr, int i) {
        this.f1639b = zArr;
        this.f1640c = i;
    }
}
