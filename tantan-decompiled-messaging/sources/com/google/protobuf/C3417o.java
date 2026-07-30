package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p149l.iwm;
import p149l.jwm;
import p149l.x9g0;

/* JADX INFO: renamed from: com.google.protobuf.o */
/* JADX INFO: loaded from: classes7.dex */
public final class C3417o extends AbstractC3405c<Long> implements C3414l.g, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C3417o f11620d;

    /* JADX INFO: renamed from: b */
    public long[] f11621b;

    /* JADX INFO: renamed from: c */
    public int f11622c;

    static {
        C3417o c3417o = new C3417o();
        f11620d = c3417o;
        c3417o.mo17084n();
    }

    public C3417o() {
        this(new long[10], 0);
    }

    /* JADX INFO: renamed from: g */
    public static C3417o m17267g() {
        return f11620d;
    }

    /* JADX INFO: renamed from: h */
    private void m17268h(int i) {
        if (i < 0 || i >= this.f11622c) {
            jwm.m143661a(m17269j(i));
        }
    }

    /* JADX INFO: renamed from: j */
    private String m17269j(int i) {
        return "Index:" + i + ", Size:" + this.f11622c;
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        m17083a();
        collection.getClass();
        if (!(collection instanceof C3417o)) {
            return super.addAll(collection);
        }
        C3417o c3417o = (C3417o) collection;
        int i = c3417o.f11622c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11622c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        long[] jArr = this.f11621b;
        if (i3 > jArr.length) {
            this.f11621b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c3417o.f11621b, 0, this.f11621b, this.f11622c, c3417o.f11622c);
        this.f11622c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, Long l2) {
        m17271f(i, l2.longValue());
    }

    @Override // com.google.protobuf.C3414l.h, com.google.protobuf.C3414l.a
    /* JADX INFO: renamed from: d */
    public C3414l.h<Long> mo17088d(int i) {
        if (i >= this.f11622c) {
            return new C3417o(Arrays.copyOf(this.f11621b, i), this.f11622c);
        }
        x9g0.m207497a();
        return null;
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3417o)) {
            return super.equals(obj);
        }
        C3417o c3417o = (C3417o) obj;
        if (this.f11622c != c3417o.f11622c) {
            return false;
        }
        long[] jArr = c3417o.f11621b;
        for (int i = 0; i < this.f11622c; i++) {
            if (this.f11621b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m17271f(int i, long j) {
        int i2;
        m17083a();
        if (i < 0 || i > (i2 = this.f11622c)) {
            jwm.m143661a(m17269j(i));
            return;
        }
        long[] jArr = this.f11621b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f11621b, i, jArr2, i + 1, this.f11622c - i);
            this.f11621b = jArr2;
        }
        this.f11621b[i] = j;
        this.f11622c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.C3414l.g
    public long getLong(int i) {
        m17268h(i);
        return this.f11621b[i];
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM17210e = 1;
        for (int i = 0; i < this.f11622c; i++) {
            iM17210e = (iM17210e * 31) + C3414l.m17210e(this.f11621b[i]);
        }
        return iM17210e;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long remove(int i) {
        m17083a();
        m17268h(i);
        long[] jArr = this.f11621b;
        long j = jArr[i];
        System.arraycopy(jArr, i + 1, jArr, i, this.f11622c - i);
        this.f11622c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Long set(int i, Long l2) {
        return Long.valueOf(setLong(i, l2.longValue()));
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m17083a();
        for (int i = 0; i < this.f11622c; i++) {
            if (obj.equals(Long.valueOf(this.f11621b[i]))) {
                long[] jArr = this.f11621b;
                System.arraycopy(jArr, i + 1, jArr, i, this.f11622c - i);
                this.f11622c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.C3414l.g
    public long setLong(int i, long j) {
        m17083a();
        m17268h(i);
        long[] jArr = this.f11621b;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11622c;
    }

    @Override // com.google.protobuf.C3414l.g
    /* JADX INFO: renamed from: u */
    public void mo17212u(long j) {
        m17271f(this.f11622c, j);
    }

    public C3417o(long[] jArr, int i) {
        this.f11621b = jArr;
        this.f11622c = i;
    }
}
