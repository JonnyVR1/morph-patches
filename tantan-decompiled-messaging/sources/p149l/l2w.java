package p149l;

import androidx.annotation.Nullable;
import com.tencent.youtu.sdkkitframework.common.WeJson;

/* JADX INFO: loaded from: classes.dex */
public class l2w<E> implements Cloneable {

    /* JADX INFO: renamed from: e */
    public static final Object f125816e = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f125817a;

    /* JADX INFO: renamed from: b */
    public long[] f125818b;

    /* JADX INFO: renamed from: c */
    public Object[] f125819c;

    /* JADX INFO: renamed from: d */
    public int f125820d;

    public l2w(int i) {
        this.f125817a = false;
        if (i == 0) {
            this.f125818b = p06.f146545b;
            this.f125819c = p06.f146546c;
        } else {
            int iM166916f = p06.m166916f(i);
            this.f125818b = new long[iM166916f];
            this.f125819c = new Object[iM166916f];
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public l2w<E> clone() {
        try {
            l2w<E> l2wVar = (l2w) super.clone();
            l2wVar.f125818b = (long[]) this.f125818b.clone();
            l2wVar.f125819c = (Object[]) this.f125819c.clone();
            return l2wVar;
        } catch (CloneNotSupportedException e) {
            y9g0.m213537a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m148308b(long j) {
        return m148313j(j) >= 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public void m148309c(long j) {
        m148317n(j);
    }

    public void clear() {
        int i = this.f125820d;
        Object[] objArr = this.f125819c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f125820d = 0;
        this.f125817a = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m148310d() {
        int i = this.f125820d;
        long[] jArr = this.f125818b;
        Object[] objArr = this.f125819c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f125816e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f125817a = false;
        this.f125820d = i2;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public E m148311e(long j) {
        return m148312f(j, null);
    }

    /* JADX INFO: renamed from: f */
    public E m148312f(long j, E e) {
        E e2;
        int iM166912b = p06.m166912b(this.f125818b, this.f125820d, j);
        return (iM166912b < 0 || (e2 = (E) this.f125819c[iM166912b]) == f125816e) ? e : e2;
    }

    /* JADX INFO: renamed from: j */
    public int m148313j(long j) {
        if (this.f125817a) {
            m148310d();
        }
        return p06.m166912b(this.f125818b, this.f125820d, j);
    }

    /* JADX INFO: renamed from: k */
    public boolean m148314k() {
        return m148319p() == 0;
    }

    /* JADX INFO: renamed from: l */
    public long m148315l(int i) {
        if (this.f125817a) {
            m148310d();
        }
        return this.f125818b[i];
    }

    /* JADX INFO: renamed from: m */
    public void m148316m(long j, E e) {
        int iM166912b = p06.m166912b(this.f125818b, this.f125820d, j);
        if (iM166912b >= 0) {
            this.f125819c[iM166912b] = e;
            return;
        }
        int i = ~iM166912b;
        int i2 = this.f125820d;
        if (i < i2) {
            Object[] objArr = this.f125819c;
            if (objArr[i] == f125816e) {
                this.f125818b[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f125817a && i2 >= this.f125818b.length) {
            m148310d();
            i = ~p06.m166912b(this.f125818b, this.f125820d, j);
        }
        int i3 = this.f125820d;
        if (i3 >= this.f125818b.length) {
            int iM166916f = p06.m166916f(i3 + 1);
            long[] jArr = new long[iM166916f];
            Object[] objArr2 = new Object[iM166916f];
            long[] jArr2 = this.f125818b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f125819c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f125818b = jArr;
            this.f125819c = objArr2;
        }
        int i4 = this.f125820d;
        if (i4 - i != 0) {
            long[] jArr3 = this.f125818b;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f125819c;
            System.arraycopy(objArr4, i, objArr4, i5, this.f125820d - i);
        }
        this.f125818b[i] = j;
        this.f125819c[i] = e;
        this.f125820d++;
    }

    /* JADX INFO: renamed from: n */
    public void m148317n(long j) {
        int iM166912b = p06.m166912b(this.f125818b, this.f125820d, j);
        if (iM166912b >= 0) {
            Object[] objArr = this.f125819c;
            Object obj = objArr[iM166912b];
            Object obj2 = f125816e;
            if (obj != obj2) {
                objArr[iM166912b] = obj2;
                this.f125817a = true;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m148318o(int i) {
        Object[] objArr = this.f125819c;
        Object obj = objArr[i];
        Object obj2 = f125816e;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f125817a = true;
        }
    }

    /* JADX INFO: renamed from: p */
    public int m148319p() {
        if (this.f125817a) {
            m148310d();
        }
        return this.f125820d;
    }

    /* JADX INFO: renamed from: q */
    public E m148320q(int i) {
        if (this.f125817a) {
            m148310d();
        }
        return (E) this.f125819c[i];
    }

    public String toString() {
        if (m148319p() <= 0) {
            return WeJson.EMPTY_MAP;
        }
        StringBuilder sb = new StringBuilder(this.f125820d * 28);
        sb.append('{');
        for (int i = 0; i < this.f125820d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m148315l(i));
            sb.append('=');
            E eM148320q = m148320q(i);
            if (eM148320q != this) {
                sb.append(eM148320q);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public l2w() {
        this(10);
    }
}
