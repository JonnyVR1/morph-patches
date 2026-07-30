package p153l;

import androidx.annotation.Nullable;
import com.tencent.youtu.sdkkitframework.common.WeJson;

/* JADX INFO: loaded from: classes.dex */
public class j4w<E> implements Cloneable {

    /* JADX INFO: renamed from: e */
    public static final Object f118331e = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f118332a;

    /* JADX INFO: renamed from: b */
    public long[] f118333b;

    /* JADX INFO: renamed from: c */
    public Object[] f118334c;

    /* JADX INFO: renamed from: d */
    public int f118335d;

    public j4w(int i) {
        this.f118332a = false;
        if (i == 0) {
            this.f118333b = u16.f176971b;
            this.f118334c = u16.f176972c;
        } else {
            int iM193901f = u16.m193901f(i);
            this.f118333b = new long[iM193901f];
            this.f118334c = new Object[iM193901f];
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j4w<E> clone() {
        try {
            j4w<E> j4wVar = (j4w) super.clone();
            j4wVar.f118333b = (long[]) this.f118333b.clone();
            j4wVar.f118334c = (Object[]) this.f118334c.clone();
            return j4wVar;
        } catch (CloneNotSupportedException e) {
            gig0.m130323a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m143456b(long j) {
        return m143461j(j) >= 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public void m143457c(long j) {
        m143465n(j);
    }

    public void clear() {
        int i = this.f118335d;
        Object[] objArr = this.f118334c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f118335d = 0;
        this.f118332a = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m143458d() {
        int i = this.f118335d;
        long[] jArr = this.f118333b;
        Object[] objArr = this.f118334c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f118331e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f118332a = false;
        this.f118335d = i2;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public E m143459e(long j) {
        return m143460f(j, null);
    }

    /* JADX INFO: renamed from: f */
    public E m143460f(long j, E e) {
        E e2;
        int iM193897b = u16.m193897b(this.f118333b, this.f118335d, j);
        return (iM193897b < 0 || (e2 = (E) this.f118334c[iM193897b]) == f118331e) ? e : e2;
    }

    /* JADX INFO: renamed from: j */
    public int m143461j(long j) {
        if (this.f118332a) {
            m143458d();
        }
        return u16.m193897b(this.f118333b, this.f118335d, j);
    }

    /* JADX INFO: renamed from: k */
    public boolean m143462k() {
        return m143467p() == 0;
    }

    /* JADX INFO: renamed from: l */
    public long m143463l(int i) {
        if (this.f118332a) {
            m143458d();
        }
        return this.f118333b[i];
    }

    /* JADX INFO: renamed from: m */
    public void m143464m(long j, E e) {
        int iM193897b = u16.m193897b(this.f118333b, this.f118335d, j);
        if (iM193897b >= 0) {
            this.f118334c[iM193897b] = e;
            return;
        }
        int i = ~iM193897b;
        int i2 = this.f118335d;
        if (i < i2) {
            Object[] objArr = this.f118334c;
            if (objArr[i] == f118331e) {
                this.f118333b[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f118332a && i2 >= this.f118333b.length) {
            m143458d();
            i = ~u16.m193897b(this.f118333b, this.f118335d, j);
        }
        int i3 = this.f118335d;
        if (i3 >= this.f118333b.length) {
            int iM193901f = u16.m193901f(i3 + 1);
            long[] jArr = new long[iM193901f];
            Object[] objArr2 = new Object[iM193901f];
            long[] jArr2 = this.f118333b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f118334c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f118333b = jArr;
            this.f118334c = objArr2;
        }
        int i4 = this.f118335d;
        if (i4 - i != 0) {
            long[] jArr3 = this.f118333b;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f118334c;
            System.arraycopy(objArr4, i, objArr4, i5, this.f118335d - i);
        }
        this.f118333b[i] = j;
        this.f118334c[i] = e;
        this.f118335d++;
    }

    /* JADX INFO: renamed from: n */
    public void m143465n(long j) {
        int iM193897b = u16.m193897b(this.f118333b, this.f118335d, j);
        if (iM193897b >= 0) {
            Object[] objArr = this.f118334c;
            Object obj = objArr[iM193897b];
            Object obj2 = f118331e;
            if (obj != obj2) {
                objArr[iM193897b] = obj2;
                this.f118332a = true;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m143466o(int i) {
        Object[] objArr = this.f118334c;
        Object obj = objArr[i];
        Object obj2 = f118331e;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f118332a = true;
        }
    }

    /* JADX INFO: renamed from: p */
    public int m143467p() {
        if (this.f118332a) {
            m143458d();
        }
        return this.f118335d;
    }

    /* JADX INFO: renamed from: q */
    public E m143468q(int i) {
        if (this.f118332a) {
            m143458d();
        }
        return (E) this.f118334c[i];
    }

    public String toString() {
        if (m143467p() <= 0) {
            return WeJson.EMPTY_MAP;
        }
        StringBuilder sb = new StringBuilder(this.f118335d * 28);
        sb.append('{');
        for (int i = 0; i < this.f118335d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m143463l(i));
            sb.append('=');
            E eM143468q = m143468q(i);
            if (eM143468q != this) {
                sb.append(eM143468q);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public j4w() {
        this(10);
    }
}
