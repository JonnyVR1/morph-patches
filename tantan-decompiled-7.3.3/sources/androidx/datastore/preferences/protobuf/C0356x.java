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

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0356x extends AbstractC0323c<Long> implements C0351s.h, RandomAccess, ru80 {

    /* JADX INFO: renamed from: d */
    public static final C0356x f1756d;

    /* JADX INFO: renamed from: b */
    public long[] f1757b;

    /* JADX INFO: renamed from: c */
    public int f1758c;

    static {
        C0356x c0356x = new C0356x(new long[0], 0);
        f1756d = c0356x;
        c0356x.mo1820n();
    }

    public C0356x() {
        this(new long[10], 0);
    }

    /* JADX INFO: renamed from: h */
    private void m2375h(int i) {
        if (i < 0 || i >= this.f1758c) {
            kym.m151996a(m2376j(i));
        }
    }

    /* JADX INFO: renamed from: j */
    private String m2376j(int i) {
        return "Index:" + i + ", Size:" + this.f1758c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        m1819a();
        C0351s.m2340a(collection);
        if (!(collection instanceof C0356x)) {
            return super.addAll(collection);
        }
        C0356x c0356x = (C0356x) collection;
        int i = c0356x.f1758c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f1758c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        long[] jArr = this.f1757b;
        if (i3 > jArr.length) {
            this.f1757b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c0356x.f1757b, 0, this.f1757b, this.f1758c, c0356x.f1758c);
        this.f1758c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, Long l2) {
        m2379g(i, l2.longValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0356x)) {
            return super.equals(obj);
        }
        C0356x c0356x = (C0356x) obj;
        if (this.f1758c != c0356x.f1758c) {
            return false;
        }
        long[] jArr = c0356x.f1757b;
        for (int i = 0; i < this.f1758c; i++) {
            if (this.f1757b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l2) {
        m2384u(l2.longValue());
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m2379g(int i, long j) {
        int i2;
        m1819a();
        if (i < 0 || i > (i2 = this.f1758c)) {
            kym.m151996a(m2376j(i));
            return;
        }
        long[] jArr = this.f1757b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f1757b, i, jArr2, i + 1, this.f1758c - i);
            this.f1757b = jArr2;
        }
        this.f1757b[i] = j;
        this.f1758c++;
        ((AbstractList) this).modCount++;
    }

    public long getLong(int i) {
        m2375h(i);
        return this.f1757b[i];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM2345f = 1;
        for (int i = 0; i < this.f1758c; i++) {
            iM2345f = (iM2345f * 31) + C0351s.m2345f(this.f1757b[i]);
        }
        return iM2345f;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // androidx.datastore.preferences.protobuf.C0351s.i
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0351s.h mo2015d(int i) {
        if (i >= this.f1758c) {
            return new C0356x(Arrays.copyOf(this.f1757b, i), this.f1758c);
        }
        fig0.m125680a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Long remove(int i) {
        m1819a();
        m2375h(i);
        long[] jArr = this.f1757b;
        long j = jArr[i];
        int i2 = this.f1758c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f1758c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Long set(int i, Long l2) {
        return Long.valueOf(setLong(i, l2.longValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m1819a();
        for (int i = 0; i < this.f1758c; i++) {
            if (obj.equals(Long.valueOf(this.f1757b[i]))) {
                long[] jArr = this.f1757b;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f1758c - i) - 1);
                this.f1758c--;
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
        long[] jArr = this.f1757b;
        System.arraycopy(jArr, i2, jArr, i, this.f1758c - i2);
        this.f1758c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public long setLong(int i, long j) {
        m1819a();
        m2375h(i);
        long[] jArr = this.f1757b;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f1758c;
    }

    /* JADX INFO: renamed from: u */
    public void m2384u(long j) {
        m1819a();
        int i = this.f1758c;
        long[] jArr = this.f1757b;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f1757b = jArr2;
        }
        long[] jArr3 = this.f1757b;
        int i2 = this.f1758c;
        this.f1758c = i2 + 1;
        jArr3[i2] = j;
    }

    public C0356x(long[] jArr, int i) {
        this.f1757b = jArr;
        this.f1758c = i;
    }
}
