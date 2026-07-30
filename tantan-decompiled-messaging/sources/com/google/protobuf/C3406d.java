package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p149l.iwm;
import p149l.jwm;
import p149l.x9g0;

/* JADX INFO: renamed from: com.google.protobuf.d */
/* JADX INFO: loaded from: classes7.dex */
public final class C3406d extends AbstractC3405c<Boolean> implements C3414l.a, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C3406d f11570d;

    /* JADX INFO: renamed from: b */
    public boolean[] f11571b;

    /* JADX INFO: renamed from: c */
    public int f11572c;

    static {
        C3406d c3406d = new C3406d();
        f11570d = c3406d;
        c3406d.mo17084n();
    }

    public C3406d() {
        this(new boolean[10], 0);
    }

    /* JADX INFO: renamed from: g */
    public static C3406d m17086g() {
        return f11570d;
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        m17083a();
        collection.getClass();
        if (!(collection instanceof C3406d)) {
            return super.addAll(collection);
        }
        C3406d c3406d = (C3406d) collection;
        int i = c3406d.f11572c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11572c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f11571b;
        if (i3 > zArr.length) {
            this.f11571b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(c3406d.f11571b, 0, this.f11571b, this.f11572c, c3406d.f11572c);
        this.f11572c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, Boolean bool) {
        m17089f(i, bool.booleanValue());
    }

    @Override // com.google.protobuf.C3414l.h, com.google.protobuf.C3414l.a
    /* JADX INFO: renamed from: d */
    public C3414l.h<Boolean> mo17088d(int i) {
        if (i >= this.f11572c) {
            return new C3406d(Arrays.copyOf(this.f11571b, i), this.f11572c);
        }
        x9g0.m207497a();
        return null;
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3406d)) {
            return super.equals(obj);
        }
        C3406d c3406d = (C3406d) obj;
        if (this.f11572c != c3406d.f11572c) {
            return false;
        }
        boolean[] zArr = c3406d.f11571b;
        for (int i = 0; i < this.f11572c; i++) {
            if (this.f11571b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m17089f(int i, boolean z) {
        int i2;
        m17083a();
        if (i < 0 || i > (i2 = this.f11572c)) {
            jwm.m143661a(m17093l(i));
            return;
        }
        boolean[] zArr = this.f11571b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f11571b, i, zArr2, i + 1, this.f11572c - i);
            this.f11571b = zArr2;
        }
        this.f11571b[i] = z;
        this.f11572c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: h */
    public final void m17090h(int i) {
        if (i < 0 || i >= this.f11572c) {
            jwm.m143661a(m17093l(i));
        }
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM17207b = 1;
        for (int i = 0; i < this.f11572c; i++) {
            iM17207b = (iM17207b * 31) + C3414l.m17207b(this.f11571b[i]);
        }
        return iM17207b;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i) {
        return Boolean.valueOf(m17092j(i));
    }

    /* JADX INFO: renamed from: j */
    public boolean m17092j(int i) {
        m17090h(i);
        return this.f11571b[i];
    }

    /* JADX INFO: renamed from: l */
    public final String m17093l(int i) {
        return "Index:" + i + ", Size:" + this.f11572c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i) {
        m17083a();
        m17090h(i);
        boolean[] zArr = this.f11571b;
        boolean z = zArr[i];
        System.arraycopy(zArr, i + 1, zArr, i, this.f11572c - i);
        this.f11572c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(m17096r(i, bool.booleanValue()));
    }

    /* JADX INFO: renamed from: r */
    public boolean m17096r(int i, boolean z) {
        m17083a();
        m17090h(i);
        boolean[] zArr = this.f11571b;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m17083a();
        for (int i = 0; i < this.f11572c; i++) {
            if (obj.equals(Boolean.valueOf(this.f11571b[i]))) {
                boolean[] zArr = this.f11571b;
                System.arraycopy(zArr, i + 1, zArr, i, this.f11572c - i);
                this.f11572c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11572c;
    }

    public C3406d(boolean[] zArr, int i) {
        this.f11571b = zArr;
        this.f11572c = i;
    }
}
