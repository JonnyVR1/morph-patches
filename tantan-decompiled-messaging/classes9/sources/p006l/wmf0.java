package p006l;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wmf0<E> implements Cloneable {

    /* JADX INFO: renamed from: e */
    public static final Object f25235e = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f25236a;

    /* JADX INFO: renamed from: b */
    public int[] f25237b;

    /* JADX INFO: renamed from: c */
    public Object[] f25238c;

    /* JADX INFO: renamed from: d */
    public int f25239d;

    public wmf0(int i) {
        this.f25236a = false;
        if (i == 0) {
            this.f25237b = k01.f15520a;
            this.f25238c = k01.f15522c;
        } else {
            Object[] objArr = new Object[i];
            this.f25238c = objArr;
            this.f25237b = new int[objArr.length];
        }
        this.f25239d = 0;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wmf0<E> clone() {
        wmf0<E> wmf0Var = null;
        try {
            wmf0<E> wmf0Var2 = (wmf0) super.clone();
            try {
                wmf0Var2.f25237b = (int[]) this.f25237b.clone();
                wmf0Var2.f25238c = (Object[]) this.f25238c.clone();
                return wmf0Var2;
            } catch (CloneNotSupportedException e) {
                e = e;
                wmf0Var = wmf0Var2;
                CrashHelper.c(e);
                return wmf0Var;
            }
        } catch (CloneNotSupportedException e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m26500b(int i) {
        int iM17875a = k01.m17875a(this.f25237b, this.f25239d, i);
        if (iM17875a >= 0) {
            Object[] objArr = this.f25238c;
            Object obj = objArr[iM17875a];
            Object obj2 = f25235e;
            if (obj != obj2) {
                objArr[iM17875a] = obj2;
                this.f25236a = true;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m26501c() {
        int i = this.f25239d;
        int[] iArr = this.f25237b;
        Object[] objArr = this.f25238c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f25235e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f25236a = false;
        this.f25239d = i2;
    }

    public void clear() {
        int i = this.f25239d;
        Object[] objArr = this.f25238c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f25239d = 0;
        this.f25236a = false;
    }

    /* JADX INFO: renamed from: d */
    public E m26502d(int i) {
        return m26503e(i, null);
    }

    /* JADX INFO: renamed from: e */
    public E m26503e(int i, E e) {
        E e2;
        int iM17875a = k01.m17875a(this.f25237b, this.f25239d, i);
        return (iM17875a < 0 || (e2 = (E) this.f25238c[iM17875a]) == f25235e) ? e : e2;
    }

    /* JADX INFO: renamed from: f */
    public int m26504f(int i) {
        if (this.f25236a) {
            m26501c();
        }
        return this.f25237b[i];
    }

    /* JADX INFO: renamed from: j */
    public void m26505j(int i, E e) {
        int iM17875a = k01.m17875a(this.f25237b, this.f25239d, i);
        if (iM17875a >= 0) {
            this.f25238c[iM17875a] = e;
            return;
        }
        int i2 = ~iM17875a;
        int i3 = this.f25239d;
        if (i2 < i3) {
            Object[] objArr = this.f25238c;
            if (objArr[i2] == f25235e) {
                this.f25237b[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f25236a && i3 >= this.f25237b.length) {
            m26501c();
            i2 = ~k01.m17875a(this.f25237b, this.f25239d, i);
        }
        this.f25237b = k01.m17877c(this.f25237b, this.f25239d, i2, i);
        this.f25238c = k01.m17878d(this.f25238c, this.f25239d, i2, e);
        this.f25239d++;
    }

    /* JADX INFO: renamed from: k */
    public void m26506k(int i) {
        m26500b(i);
    }

    /* JADX INFO: renamed from: l */
    public int m26507l() {
        if (this.f25236a) {
            m26501c();
        }
        return this.f25239d;
    }

    /* JADX INFO: renamed from: m */
    public E m26508m(int i) {
        if (this.f25236a) {
            m26501c();
        }
        return (E) this.f25238c[i];
    }

    public String toString() {
        if (m26507l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f25239d * 28);
        sb.append('{');
        for (int i = 0; i < this.f25239d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m26504f(i));
            sb.append('=');
            E eM26508m = m26508m(i);
            if (eM26508m != this) {
                sb.append(eM26508m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public wmf0() {
        this(10);
    }
}
