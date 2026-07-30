package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p153l.fig0;
import p153l.jym;
import p153l.kym;

/* JADX INFO: renamed from: com.google.protobuf.o */
/* JADX INFO: loaded from: classes7.dex */
public final class C3440o extends AbstractC3428c<Long> implements C3437l.g, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C3440o f11657d;

    /* JADX INFO: renamed from: b */
    public long[] f11658b;

    /* JADX INFO: renamed from: c */
    public int f11659c;

    static {
        C3440o c3440o = new C3440o();
        f11657d = c3440o;
        c3440o.mo17139n();
    }

    public C3440o() {
        this(new long[10], 0);
    }

    /* JADX INFO: renamed from: g */
    public static C3440o m17322g() {
        return f11657d;
    }

    /* JADX INFO: renamed from: h */
    private void m17323h(int i) {
        if (i < 0 || i >= this.f11659c) {
            kym.m151996a(m17324j(i));
        }
    }

    /* JADX INFO: renamed from: j */
    private String m17324j(int i) {
        return "Index:" + i + ", Size:" + this.f11659c;
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        m17138a();
        collection.getClass();
        if (!(collection instanceof C3440o)) {
            return super.addAll(collection);
        }
        C3440o c3440o = (C3440o) collection;
        int i = c3440o.f11659c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11659c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        long[] jArr = this.f11658b;
        if (i3 > jArr.length) {
            this.f11658b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c3440o.f11658b, 0, this.f11658b, this.f11659c, c3440o.f11659c);
        this.f11659c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, Long l2) {
        m17326f(i, l2.longValue());
    }

    @Override // com.google.protobuf.C3437l.h, com.google.protobuf.C3437l.a
    /* JADX INFO: renamed from: d */
    public C3437l.h<Long> mo17143d(int i) {
        if (i >= this.f11659c) {
            return new C3440o(Arrays.copyOf(this.f11658b, i), this.f11659c);
        }
        fig0.m125680a();
        return null;
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3440o)) {
            return super.equals(obj);
        }
        C3440o c3440o = (C3440o) obj;
        if (this.f11659c != c3440o.f11659c) {
            return false;
        }
        long[] jArr = c3440o.f11658b;
        for (int i = 0; i < this.f11659c; i++) {
            if (this.f11658b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m17326f(int i, long j) {
        int i2;
        m17138a();
        if (i < 0 || i > (i2 = this.f11659c)) {
            kym.m151996a(m17324j(i));
            return;
        }
        long[] jArr = this.f11658b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f11658b, i, jArr2, i + 1, this.f11659c - i);
            this.f11658b = jArr2;
        }
        this.f11658b[i] = j;
        this.f11659c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.C3437l.g
    public long getLong(int i) {
        m17323h(i);
        return this.f11658b[i];
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM17265e = 1;
        for (int i = 0; i < this.f11659c; i++) {
            iM17265e = (iM17265e * 31) + C3437l.m17265e(this.f11658b[i]);
        }
        return iM17265e;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long remove(int i) {
        m17138a();
        m17323h(i);
        long[] jArr = this.f11658b;
        long j = jArr[i];
        System.arraycopy(jArr, i + 1, jArr, i, this.f11659c - i);
        this.f11659c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Long set(int i, Long l2) {
        return Long.valueOf(setLong(i, l2.longValue()));
    }

    @Override // com.google.protobuf.AbstractC3428c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m17138a();
        for (int i = 0; i < this.f11659c; i++) {
            if (obj.equals(Long.valueOf(this.f11658b[i]))) {
                long[] jArr = this.f11658b;
                System.arraycopy(jArr, i + 1, jArr, i, this.f11659c - i);
                this.f11659c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.C3437l.g
    public long setLong(int i, long j) {
        m17138a();
        m17323h(i);
        long[] jArr = this.f11658b;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11659c;
    }

    @Override // com.google.protobuf.C3437l.g
    /* JADX INFO: renamed from: u */
    public void mo17267u(long j) {
        m17326f(this.f11659c, j);
    }

    public C3440o(long[] jArr, int i) {
        this.f11658b = jArr;
        this.f11659c = i;
    }
}
