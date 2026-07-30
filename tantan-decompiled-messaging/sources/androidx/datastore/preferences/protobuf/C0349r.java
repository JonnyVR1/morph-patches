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

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0349r extends AbstractC0322c<Integer> implements C0350s.g, RandomAccess, nm80 {

    /* JADX INFO: renamed from: d */
    public static final C0349r f1734d;

    /* JADX INFO: renamed from: b */
    public int[] f1735b;

    /* JADX INFO: renamed from: c */
    public int f1736c;

    static {
        C0349r c0349r = new C0349r(new int[0], 0);
        f1734d = c0349r;
        c0349r.mo1819n();
    }

    public C0349r() {
        this(new int[10], 0);
    }

    /* JADX INFO: renamed from: h */
    private void m2329h(int i) {
        if (i < 0 || i >= this.f1736c) {
            jwm.m143661a(m2330j(i));
        }
    }

    /* JADX INFO: renamed from: j */
    private String m2330j(int i) {
        return "Index:" + i + ", Size:" + this.f1736c;
    }

    /* JADX INFO: renamed from: T */
    public void m2331T(int i) {
        m1818a();
        int i2 = this.f1736c;
        int[] iArr = this.f1735b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f1735b = iArr2;
        }
        int[] iArr3 = this.f1735b;
        int i3 = this.f1736c;
        this.f1736c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        m1818a();
        C0350s.m2339a(collection);
        if (!(collection instanceof C0349r)) {
            return super.addAll(collection);
        }
        C0349r c0349r = (C0349r) collection;
        int i = c0349r.f1736c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f1736c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        int[] iArr = this.f1735b;
        if (i3 > iArr.length) {
            this.f1735b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c0349r.f1735b, 0, this.f1735b, this.f1736c, c0349r.f1736c);
        this.f1736c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, Integer num) {
        m2334g(i, num.intValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0349r)) {
            return super.equals(obj);
        }
        C0349r c0349r = (C0349r) obj;
        if (this.f1736c != c0349r.f1736c) {
            return false;
        }
        int[] iArr = c0349r.f1735b;
        for (int i = 0; i < this.f1736c; i++) {
            if (this.f1735b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        m2331T(num.intValue());
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m2334g(int i, int i2) {
        int i3;
        m1818a();
        if (i < 0 || i > (i3 = this.f1736c)) {
            jwm.m143661a(m2330j(i));
            return;
        }
        int[] iArr = this.f1735b;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f1735b, i, iArr2, i + 1, this.f1736c - i);
            this.f1735b = iArr2;
        }
        this.f1735b[i] = i2;
        this.f1736c++;
        ((AbstractList) this).modCount++;
    }

    public int getInt(int i) {
        m2329h(i);
        return this.f1735b[i];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f1736c; i2++) {
            i = (i * 31) + this.f1735b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // androidx.datastore.preferences.protobuf.C0350s.i
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0350s.g mo2014d(int i) {
        if (i >= this.f1736c) {
            return new C0349r(Arrays.copyOf(this.f1735b, i), this.f1736c);
        }
        x9g0.m207497a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i) {
        m1818a();
        m2329h(i);
        int[] iArr = this.f1735b;
        int i2 = iArr[i];
        int i3 = this.f1736c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f1736c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(setInt(i, num.intValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m1818a();
        for (int i = 0; i < this.f1736c; i++) {
            if (obj.equals(Integer.valueOf(this.f1735b[i]))) {
                int[] iArr = this.f1735b;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f1736c - i) - 1);
                this.f1736c--;
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
        int[] iArr = this.f1735b;
        System.arraycopy(iArr, i2, iArr, i, this.f1736c - i2);
        this.f1736c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public int setInt(int i, int i2) {
        m1818a();
        m2329h(i);
        int[] iArr = this.f1735b;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f1736c;
    }

    public C0349r(int[] iArr, int i) {
        this.f1735b = iArr;
        this.f1736c = i;
    }
}
