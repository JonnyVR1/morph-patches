package p153l;

import androidx.annotation.Nullable;
import com.tencent.youtu.sdkkitframework.common.WeJson;

/* JADX INFO: loaded from: classes.dex */
public class gvf0<E> implements Cloneable {

    /* JADX INFO: renamed from: e */
    public static final Object f106625e = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f106626a;

    /* JADX INFO: renamed from: b */
    public int[] f106627b;

    /* JADX INFO: renamed from: c */
    public Object[] f106628c;

    /* JADX INFO: renamed from: d */
    public int f106629d;

    public gvf0(int i) {
        this.f106626a = false;
        if (i == 0) {
            this.f106627b = u16.f176970a;
            this.f106628c = u16.f176972c;
        } else {
            int iM193900e = u16.m193900e(i);
            this.f106627b = new int[iM193900e];
            this.f106628c = new Object[iM193900e];
        }
    }

    /* JADX INFO: renamed from: a */
    public void m132546a(int i, E e) {
        int i2 = this.f106629d;
        if (i2 != 0 && i <= this.f106627b[i2 - 1]) {
            m132553k(i, e);
            return;
        }
        if (this.f106626a && i2 >= this.f106627b.length) {
            m132548c();
        }
        int i3 = this.f106629d;
        if (i3 >= this.f106627b.length) {
            int iM193900e = u16.m193900e(i3 + 1);
            int[] iArr = new int[iM193900e];
            Object[] objArr = new Object[iM193900e];
            int[] iArr2 = this.f106627b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f106628c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f106627b = iArr;
            this.f106628c = objArr;
        }
        this.f106627b[i3] = i;
        this.f106628c[i3] = e;
        this.f106629d = i3 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public gvf0<E> clone() {
        try {
            gvf0<E> gvf0Var = (gvf0) super.clone();
            gvf0Var.f106627b = (int[]) this.f106627b.clone();
            gvf0Var.f106628c = (Object[]) this.f106628c.clone();
            return gvf0Var;
        } catch (CloneNotSupportedException e) {
            gig0.m130323a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m132548c() {
        int i = this.f106629d;
        int[] iArr = this.f106627b;
        Object[] objArr = this.f106628c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f106625e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f106626a = false;
        this.f106629d = i2;
    }

    public void clear() {
        int i = this.f106629d;
        Object[] objArr = this.f106628c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f106629d = 0;
        this.f106626a = false;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public E m132549d(int i) {
        return m132550e(i, null);
    }

    /* JADX INFO: renamed from: e */
    public E m132550e(int i, E e) {
        E e2;
        int iM193896a = u16.m193896a(this.f106627b, this.f106629d, i);
        return (iM193896a < 0 || (e2 = (E) this.f106628c[iM193896a]) == f106625e) ? e : e2;
    }

    /* JADX INFO: renamed from: f */
    public int m132551f(E e) {
        if (this.f106626a) {
            m132548c();
        }
        for (int i = 0; i < this.f106629d; i++) {
            if (this.f106628c[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public int m132552j(int i) {
        if (this.f106626a) {
            m132548c();
        }
        return this.f106627b[i];
    }

    /* JADX INFO: renamed from: k */
    public void m132553k(int i, E e) {
        int iM193896a = u16.m193896a(this.f106627b, this.f106629d, i);
        if (iM193896a >= 0) {
            this.f106628c[iM193896a] = e;
            return;
        }
        int i2 = ~iM193896a;
        int i3 = this.f106629d;
        if (i2 < i3) {
            Object[] objArr = this.f106628c;
            if (objArr[i2] == f106625e) {
                this.f106627b[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f106626a && i3 >= this.f106627b.length) {
            m132548c();
            i2 = ~u16.m193896a(this.f106627b, this.f106629d, i);
        }
        int i4 = this.f106629d;
        if (i4 >= this.f106627b.length) {
            int iM193900e = u16.m193900e(i4 + 1);
            int[] iArr = new int[iM193900e];
            Object[] objArr2 = new Object[iM193900e];
            int[] iArr2 = this.f106627b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f106628c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f106627b = iArr;
            this.f106628c = objArr2;
        }
        int i5 = this.f106629d;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f106627b;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f106628c;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f106629d - i2);
        }
        this.f106627b[i2] = i;
        this.f106628c[i2] = e;
        this.f106629d++;
    }

    /* JADX INFO: renamed from: l */
    public int m132554l() {
        if (this.f106626a) {
            m132548c();
        }
        return this.f106629d;
    }

    /* JADX INFO: renamed from: m */
    public E m132555m(int i) {
        if (this.f106626a) {
            m132548c();
        }
        return (E) this.f106628c[i];
    }

    public String toString() {
        if (m132554l() <= 0) {
            return WeJson.EMPTY_MAP;
        }
        StringBuilder sb = new StringBuilder(this.f106629d * 28);
        sb.append('{');
        for (int i = 0; i < this.f106629d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m132552j(i));
            sb.append('=');
            E eM132555m = m132555m(i);
            if (eM132555m != this) {
                sb.append(eM132555m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public gvf0() {
        this(10);
    }
}
