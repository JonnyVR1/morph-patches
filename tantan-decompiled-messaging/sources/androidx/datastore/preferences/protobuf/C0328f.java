package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p149l.iwm;
import p149l.jwm;
import p149l.nm80;
import p149l.x9g0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0328f extends AbstractC0322c<Boolean> implements C0350s.a, RandomAccess, nm80 {

    /* JADX INFO: renamed from: d */
    public static final C0328f f1638d;

    /* JADX INFO: renamed from: b */
    public boolean[] f1639b;

    /* JADX INFO: renamed from: c */
    public int f1640c;

    static {
        C0328f c0328f = new C0328f(new boolean[0], 0);
        f1638d = c0328f;
        c0328f.mo1819n();
    }

    public C0328f() {
        this(new boolean[10], 0);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        m1818a();
        C0350s.m2339a(collection);
        if (!(collection instanceof C0328f)) {
            return super.addAll(collection);
        }
        C0328f c0328f = (C0328f) collection;
        int i = c0328f.f1640c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f1640c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f1639b;
        if (i3 > zArr.length) {
            this.f1639b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(c0328f.f1639b, 0, this.f1639b, this.f1640c, c0328f.f1640c);
        this.f1640c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, Boolean bool) {
        m2016g(i, bool.booleanValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0328f)) {
            return super.equals(obj);
        }
        C0328f c0328f = (C0328f) obj;
        if (this.f1640c != c0328f.f1640c) {
            return false;
        }
        boolean[] zArr = c0328f.f1639b;
        for (int i = 0; i < this.f1640c; i++) {
            if (this.f1639b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        m2017h(bool.booleanValue());
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m2016g(int i, boolean z) {
        int i2;
        m1818a();
        if (i < 0 || i > (i2 = this.f1640c)) {
            jwm.m143661a(m2021o(i));
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
    public void m2017h(boolean z) {
        m1818a();
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

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM2341c = 1;
        for (int i = 0; i < this.f1640c; i++) {
            iM2341c = (iM2341c * 31) + C0350s.m2341c(this.f1639b[i]);
        }
        return iM2341c;
    }

    /* JADX INFO: renamed from: i */
    public final void m2018i(int i) {
        if (i < 0 || i >= this.f1640c) {
            jwm.m143661a(m2021o(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i) {
        return Boolean.valueOf(m2020l(i));
    }

    /* JADX INFO: renamed from: l */
    public boolean m2020l(int i) {
        m2018i(i);
        return this.f1639b[i];
    }

    /* JADX INFO: renamed from: o */
    public final String m2021o(int i) {
        return "Index:" + i + ", Size:" + this.f1640c;
    }

    @Override // androidx.datastore.preferences.protobuf.C0350s.i
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C0350s.a mo2014d(int i) {
        if (i >= this.f1640c) {
            return new C0328f(Arrays.copyOf(this.f1639b, i), this.f1640c);
        }
        x9g0.m207497a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i) {
        m1818a();
        m2018i(i);
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

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m1818a();
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
        m1818a();
        if (i2 < i) {
            jwm.m143661a("toIndex < fromIndex");
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
        return Boolean.valueOf(m2025v(i, bool.booleanValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f1640c;
    }

    /* JADX INFO: renamed from: v */
    public boolean m2025v(int i, boolean z) {
        m1818a();
        m2018i(i);
        boolean[] zArr = this.f1639b;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    public C0328f(boolean[] zArr, int i) {
        this.f1639b = zArr;
        this.f1640c = i;
    }
}
