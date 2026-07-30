package p149l;

import com.tantanapp.common.utils.CrashHelper;
import com.tencent.youtu.sdkkitframework.common.WeJson;

/* JADX INFO: loaded from: classes9.dex */
public class wmf0<E> implements Cloneable {

    /* JADX INFO: renamed from: e */
    public static final Object f187068e = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f187069a;

    /* JADX INFO: renamed from: b */
    public int[] f187070b;

    /* JADX INFO: renamed from: c */
    public Object[] f187071c;

    /* JADX INFO: renamed from: d */
    public int f187072d;

    public wmf0(int i) {
        this.f187069a = false;
        if (i == 0) {
            this.f187070b = k01.f120437a;
            this.f187071c = k01.f120439c;
        } else {
            Object[] objArr = new Object[i];
            this.f187071c = objArr;
            this.f187070b = new int[objArr.length];
        }
        this.f187072d = 0;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wmf0<E> clone() {
        wmf0<E> wmf0Var = null;
        try {
            wmf0<E> wmf0Var2 = (wmf0) super.clone();
            try {
                wmf0Var2.f187070b = (int[]) this.f187070b.clone();
                wmf0Var2.f187071c = (Object[]) this.f187071c.clone();
                return wmf0Var2;
            } catch (CloneNotSupportedException e) {
                e = e;
                wmf0Var = wmf0Var2;
                CrashHelper.m81296c(e);
                return wmf0Var;
            }
        } catch (CloneNotSupportedException e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m203981b(int i) {
        int iM143972a = k01.m143972a(this.f187070b, this.f187072d, i);
        if (iM143972a >= 0) {
            Object[] objArr = this.f187071c;
            Object obj = objArr[iM143972a];
            Object obj2 = f187068e;
            if (obj != obj2) {
                objArr[iM143972a] = obj2;
                this.f187069a = true;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m203982c() {
        int i = this.f187072d;
        int[] iArr = this.f187070b;
        Object[] objArr = this.f187071c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f187068e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f187069a = false;
        this.f187072d = i2;
    }

    public void clear() {
        int i = this.f187072d;
        Object[] objArr = this.f187071c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f187072d = 0;
        this.f187069a = false;
    }

    /* JADX INFO: renamed from: d */
    public E m203983d(int i) {
        return m203984e(i, null);
    }

    /* JADX INFO: renamed from: e */
    public E m203984e(int i, E e) {
        E e2;
        int iM143972a = k01.m143972a(this.f187070b, this.f187072d, i);
        return (iM143972a < 0 || (e2 = (E) this.f187071c[iM143972a]) == f187068e) ? e : e2;
    }

    /* JADX INFO: renamed from: f */
    public int m203985f(int i) {
        if (this.f187069a) {
            m203982c();
        }
        return this.f187070b[i];
    }

    /* JADX INFO: renamed from: j */
    public void m203986j(int i, E e) {
        int iM143972a = k01.m143972a(this.f187070b, this.f187072d, i);
        if (iM143972a >= 0) {
            this.f187071c[iM143972a] = e;
            return;
        }
        int i2 = ~iM143972a;
        int i3 = this.f187072d;
        if (i2 < i3) {
            Object[] objArr = this.f187071c;
            if (objArr[i2] == f187068e) {
                this.f187070b[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f187069a && i3 >= this.f187070b.length) {
            m203982c();
            i2 = ~k01.m143972a(this.f187070b, this.f187072d, i);
        }
        this.f187070b = k01.m143974c(this.f187070b, this.f187072d, i2, i);
        this.f187071c = k01.m143975d(this.f187071c, this.f187072d, i2, e);
        this.f187072d++;
    }

    /* JADX INFO: renamed from: k */
    public void m203987k(int i) {
        m203981b(i);
    }

    /* JADX INFO: renamed from: l */
    public int m203988l() {
        if (this.f187069a) {
            m203982c();
        }
        return this.f187072d;
    }

    /* JADX INFO: renamed from: m */
    public E m203989m(int i) {
        if (this.f187069a) {
            m203982c();
        }
        return (E) this.f187071c[i];
    }

    public String toString() {
        if (m203988l() <= 0) {
            return WeJson.EMPTY_MAP;
        }
        StringBuilder sb = new StringBuilder(this.f187072d * 28);
        sb.append('{');
        for (int i = 0; i < this.f187072d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m203985f(i));
            sb.append('=');
            E eM203989m = m203989m(i);
            if (eM203989m != this) {
                sb.append(eM203989m);
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
