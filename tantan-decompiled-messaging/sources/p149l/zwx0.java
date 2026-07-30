package p149l;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class zwx0 extends jlx0<Long> implements vtx0, f2y0, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final long[] f205330d;

    /* JADX INFO: renamed from: e */
    public static final zwx0 f205331e;

    /* JADX INFO: renamed from: b */
    public long[] f205332b;

    /* JADX INFO: renamed from: c */
    public int f205333c;

    static {
        long[] jArr = new long[0];
        f205330d = jArr;
        f205331e = new zwx0(jArr, 0, false);
    }

    public zwx0() {
        this(f205330d, 0, true);
    }

    /* JADX INFO: renamed from: f */
    public static zwx0 m220736f() {
        return f205331e;
    }

    /* JADX INFO: renamed from: h */
    public static int m220737h(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m142120a();
        if (i < 0 || i > (i2 = this.f205333c)) {
            jwm.m143661a(m220740i(i));
            return;
        }
        long[] jArr = this.f205332b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[m220737h(jArr.length)];
            System.arraycopy(this.f205332b, 0, jArr2, 0, i);
            System.arraycopy(this.f205332b, i, jArr2, i + 1, this.f205333c - i);
            this.f205332b = jArr2;
        }
        this.f205332b[i] = jLongValue;
        this.f205333c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p149l.jlx0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m142120a();
        ctx0.m108707e(collection);
        if (!(collection instanceof zwx0)) {
            return super.addAll(collection);
        }
        zwx0 zwx0Var = (zwx0) collection;
        int i = zwx0Var.f205333c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f205333c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        long[] jArr = this.f205332b;
        if (i3 > jArr.length) {
            this.f205332b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(zwx0Var.f205332b, 0, this.f205332b, this.f205333c, zwx0Var.f205333c);
        this.f205333c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m220738c(long j) {
        m142120a();
        int i = this.f205333c;
        long[] jArr = this.f205332b;
        if (i == jArr.length) {
            long[] jArr2 = new long[m220737h(jArr.length)];
            System.arraycopy(this.f205332b, 0, jArr2, 0, this.f205333c);
            this.f205332b = jArr2;
        }
        long[] jArr3 = this.f205332b;
        int i2 = this.f205333c;
        this.f205333c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p149l.vtx0
    /* JADX INFO: renamed from: e */
    public final long mo200056e(int i) {
        m220741j(i);
        return this.f205332b[i];
    }

    @Override // p149l.jlx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwx0)) {
            return super.equals(obj);
        }
        zwx0 zwx0Var = (zwx0) obj;
        if (this.f205333c != zwx0Var.f205333c) {
            return false;
        }
        long[] jArr = zwx0Var.f205332b;
        for (int i = 0; i < this.f205333c; i++) {
            if (this.f205332b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m220739g(int i) {
        long[] jArr = this.f205332b;
        if (i <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.f205332b = new long[Math.max(i, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i) {
            length = m220737h(length);
        }
        this.f205332b = Arrays.copyOf(this.f205332b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo200056e(i));
    }

    @Override // p149l.jlx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM108704b = 1;
        for (int i = 0; i < this.f205333c; i++) {
            iM108704b = (iM108704b * 31) + ctx0.m108704b(this.f205332b[i]);
        }
        return iM108704b;
    }

    /* JADX INFO: renamed from: i */
    public final String m220740i(int i) {
        return "Index:" + i + ", Size:" + this.f205333c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f205332b[i] == jLongValue) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m220741j(int i) {
        if (i < 0 || i >= this.f205333c) {
            jwm.m143661a(m220740i(i));
        }
    }

    @Override // p149l.jlx0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m142120a();
        m220741j(i);
        long[] jArr = this.f205332b;
        long j = jArr[i];
        int i2 = this.f205333c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f205333c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m142120a();
        if (i2 < i) {
            jwm.m143661a("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f205332b;
        System.arraycopy(jArr, i2, jArr, i, this.f205333c - i2);
        this.f205333c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m142120a();
        m220741j(i);
        long[] jArr = this.f205332b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f205333c;
    }

    @Override // p149l.cvx0
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final vtx0 zza(int i) {
        if (i >= this.f205333c) {
            return new zwx0(i == 0 ? f205330d : Arrays.copyOf(this.f205332b, i), this.f205333c, true);
        }
        x9g0.m207497a();
        return null;
    }

    public zwx0(long[] jArr, int i, boolean z) {
        super(z);
        this.f205332b = jArr;
        this.f205333c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m220738c(((Long) obj).longValue());
        return true;
    }
}
