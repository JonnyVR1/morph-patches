package p153l;

import com.tantanapp.common.utils.CrashHelper;
import com.tencent.youtu.sdkkitframework.common.WeJson;

/* JADX INFO: loaded from: classes9.dex */
public class fvf0<E> implements Cloneable {

    /* JADX INFO: renamed from: e */
    public static final Object f101010e = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f101011a;

    /* JADX INFO: renamed from: b */
    public int[] f101012b;

    /* JADX INFO: renamed from: c */
    public Object[] f101013c;

    /* JADX INFO: renamed from: d */
    public int f101014d;

    public fvf0(int i) {
        this.f101011a = false;
        if (i == 0) {
            this.f101012b = r01.f160565a;
            this.f101013c = r01.f160567c;
        } else {
            Object[] objArr = new Object[i];
            this.f101013c = objArr;
            this.f101012b = new int[objArr.length];
        }
        this.f101014d = 0;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fvf0<E> clone() {
        fvf0<E> fvf0Var = null;
        try {
            fvf0<E> fvf0Var2 = (fvf0) super.clone();
            try {
                fvf0Var2.f101012b = (int[]) this.f101012b.clone();
                fvf0Var2.f101013c = (Object[]) this.f101013c.clone();
                return fvf0Var2;
            } catch (CloneNotSupportedException e) {
                e = e;
                fvf0Var = fvf0Var2;
                CrashHelper.m82479c(e);
                return fvf0Var;
            }
        } catch (CloneNotSupportedException e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m127611b(int i) {
        int iM179191a = r01.m179191a(this.f101012b, this.f101014d, i);
        if (iM179191a >= 0) {
            Object[] objArr = this.f101013c;
            Object obj = objArr[iM179191a];
            Object obj2 = f101010e;
            if (obj != obj2) {
                objArr[iM179191a] = obj2;
                this.f101011a = true;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m127612c() {
        int i = this.f101014d;
        int[] iArr = this.f101012b;
        Object[] objArr = this.f101013c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f101010e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f101011a = false;
        this.f101014d = i2;
    }

    public void clear() {
        int i = this.f101014d;
        Object[] objArr = this.f101013c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f101014d = 0;
        this.f101011a = false;
    }

    /* JADX INFO: renamed from: d */
    public E m127613d(int i) {
        return m127614e(i, null);
    }

    /* JADX INFO: renamed from: e */
    public E m127614e(int i, E e) {
        E e2;
        int iM179191a = r01.m179191a(this.f101012b, this.f101014d, i);
        return (iM179191a < 0 || (e2 = (E) this.f101013c[iM179191a]) == f101010e) ? e : e2;
    }

    /* JADX INFO: renamed from: f */
    public int m127615f(int i) {
        if (this.f101011a) {
            m127612c();
        }
        return this.f101012b[i];
    }

    /* JADX INFO: renamed from: j */
    public void m127616j(int i, E e) {
        int iM179191a = r01.m179191a(this.f101012b, this.f101014d, i);
        if (iM179191a >= 0) {
            this.f101013c[iM179191a] = e;
            return;
        }
        int i2 = ~iM179191a;
        int i3 = this.f101014d;
        if (i2 < i3) {
            Object[] objArr = this.f101013c;
            if (objArr[i2] == f101010e) {
                this.f101012b[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f101011a && i3 >= this.f101012b.length) {
            m127612c();
            i2 = ~r01.m179191a(this.f101012b, this.f101014d, i);
        }
        this.f101012b = r01.m179193c(this.f101012b, this.f101014d, i2, i);
        this.f101013c = r01.m179194d(this.f101013c, this.f101014d, i2, e);
        this.f101014d++;
    }

    /* JADX INFO: renamed from: k */
    public void m127617k(int i) {
        m127611b(i);
    }

    /* JADX INFO: renamed from: l */
    public int m127618l() {
        if (this.f101011a) {
            m127612c();
        }
        return this.f101014d;
    }

    /* JADX INFO: renamed from: m */
    public E m127619m(int i) {
        if (this.f101011a) {
            m127612c();
        }
        return (E) this.f101013c[i];
    }

    public String toString() {
        if (m127618l() <= 0) {
            return WeJson.EMPTY_MAP;
        }
        StringBuilder sb = new StringBuilder(this.f101014d * 28);
        sb.append('{');
        for (int i = 0; i < this.f101014d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m127615f(i));
            sb.append('=');
            E eM127619m = m127619m(i);
            if (eM127619m != this) {
                sb.append(eM127619m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public fvf0() {
        this(10);
    }
}
