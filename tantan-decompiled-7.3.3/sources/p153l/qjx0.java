package p153l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class qjx0 extends bgx0 implements RandomAccess, ejx0, mkx0 {

    /* JADX INFO: renamed from: d */
    public static final qjx0 f158063d = new qjx0(new long[0], 0, false);

    /* JADX INFO: renamed from: b */
    public long[] f158064b;

    /* JADX INFO: renamed from: c */
    public int f158065c;

    public qjx0() {
        this(new long[10], 0, true);
    }

    /* JADX INFO: renamed from: f */
    public static qjx0 m176900f() {
        return f158063d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m104285a();
        if (i < 0 || i > (i2 = this.f158065c)) {
            kym.m151996a(m176903h(i));
            return;
        }
        int i3 = i + 1;
        long[] jArr = this.f158064b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f158064b, i, jArr2, i3, this.f158065c - i);
            this.f158064b = jArr2;
        }
        this.f158064b[i] = jLongValue;
        this.f158065c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p153l.bgx0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m104285a();
        Charset charset = gjx0.f104688a;
        collection.getClass();
        if (!(collection instanceof qjx0)) {
            return super.addAll(collection);
        }
        qjx0 qjx0Var = (qjx0) collection;
        int i = qjx0Var.f158065c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f158065c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        long[] jArr = this.f158064b;
        if (i3 > jArr.length) {
            this.f158064b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(qjx0Var.f158064b, 0, this.f158064b, this.f158065c, qjx0Var.f158065c);
        this.f158065c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final long m176901c(int i) {
        m176904i(i);
        return this.f158064b[i];
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
        if (!(obj instanceof qjx0)) {
            return super.equals(obj);
        }
        qjx0 qjx0Var = (qjx0) obj;
        if (this.f158065c != qjx0Var.f158065c) {
            return false;
        }
        long[] jArr = qjx0Var.f158064b;
        for (int i = 0; i < this.f158065c; i++) {
            if (this.f158064b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m176902g(long j) {
        m104285a();
        int i = this.f158065c;
        long[] jArr = this.f158064b;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f158064b = jArr2;
        }
        long[] jArr3 = this.f158064b;
        int i2 = this.f158065c;
        this.f158065c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m176904i(i);
        return Long.valueOf(this.f158064b[i]);
    }

    /* JADX INFO: renamed from: h */
    public final String m176903h(int i) {
        return "Index:" + i + ", Size:" + this.f158065c;
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f158065c; i2++) {
            long j = this.f158064b[i2];
            Charset charset = gjx0.f104688a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final void m176904i(int i) {
        if (i < 0 || i >= this.f158065c) {
            kym.m151996a(m176903h(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f158065c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f158064b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m104285a();
        m176904i(i);
        long[] jArr = this.f158064b;
        long j = jArr[i];
        int i2 = this.f158065c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f158065c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m104285a();
        if (i2 < i) {
            kym.m151996a("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f158064b;
        System.arraycopy(jArr, i2, jArr, i, this.f158065c - i2);
        this.f158065c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m104285a();
        m176904i(i);
        long[] jArr = this.f158064b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f158065c;
    }

    @Override // p153l.fjx0
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final ejx0 zzd(int i) {
        if (i >= this.f158065c) {
            return new qjx0(Arrays.copyOf(this.f158064b, i), this.f158065c, true);
        }
        fig0.m125680a();
        return null;
    }

    public qjx0(long[] jArr, int i, boolean z) {
        super(z);
        this.f158064b = jArr;
        this.f158065c = i;
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m176902g(((Long) obj).longValue());
        return true;
    }
}
