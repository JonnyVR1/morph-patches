package p149l;

import androidx.annotation.Nullable;
import com.tencent.youtu.sdkkitframework.common.WeJson;

/* JADX INFO: loaded from: classes.dex */
public class xmf0<E> implements Cloneable {

    /* JADX INFO: renamed from: e */
    public static final Object f193553e = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f193554a;

    /* JADX INFO: renamed from: b */
    public int[] f193555b;

    /* JADX INFO: renamed from: c */
    public Object[] f193556c;

    /* JADX INFO: renamed from: d */
    public int f193557d;

    public xmf0(int i) {
        this.f193554a = false;
        if (i == 0) {
            this.f193555b = p06.f146544a;
            this.f193556c = p06.f146546c;
        } else {
            int iM166915e = p06.m166915e(i);
            this.f193555b = new int[iM166915e];
            this.f193556c = new Object[iM166915e];
        }
    }

    /* JADX INFO: renamed from: a */
    public void m210126a(int i, E e) {
        int i2 = this.f193557d;
        if (i2 != 0 && i <= this.f193555b[i2 - 1]) {
            m210133k(i, e);
            return;
        }
        if (this.f193554a && i2 >= this.f193555b.length) {
            m210128c();
        }
        int i3 = this.f193557d;
        if (i3 >= this.f193555b.length) {
            int iM166915e = p06.m166915e(i3 + 1);
            int[] iArr = new int[iM166915e];
            Object[] objArr = new Object[iM166915e];
            int[] iArr2 = this.f193555b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f193556c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f193555b = iArr;
            this.f193556c = objArr;
        }
        this.f193555b[i3] = i;
        this.f193556c[i3] = e;
        this.f193557d = i3 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public xmf0<E> clone() {
        try {
            xmf0<E> xmf0Var = (xmf0) super.clone();
            xmf0Var.f193555b = (int[]) this.f193555b.clone();
            xmf0Var.f193556c = (Object[]) this.f193556c.clone();
            return xmf0Var;
        } catch (CloneNotSupportedException e) {
            y9g0.m213537a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m210128c() {
        int i = this.f193557d;
        int[] iArr = this.f193555b;
        Object[] objArr = this.f193556c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f193553e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f193554a = false;
        this.f193557d = i2;
    }

    public void clear() {
        int i = this.f193557d;
        Object[] objArr = this.f193556c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f193557d = 0;
        this.f193554a = false;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public E m210129d(int i) {
        return m210130e(i, null);
    }

    /* JADX INFO: renamed from: e */
    public E m210130e(int i, E e) {
        E e2;
        int iM166911a = p06.m166911a(this.f193555b, this.f193557d, i);
        return (iM166911a < 0 || (e2 = (E) this.f193556c[iM166911a]) == f193553e) ? e : e2;
    }

    /* JADX INFO: renamed from: f */
    public int m210131f(E e) {
        if (this.f193554a) {
            m210128c();
        }
        for (int i = 0; i < this.f193557d; i++) {
            if (this.f193556c[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public int m210132j(int i) {
        if (this.f193554a) {
            m210128c();
        }
        return this.f193555b[i];
    }

    /* JADX INFO: renamed from: k */
    public void m210133k(int i, E e) {
        int iM166911a = p06.m166911a(this.f193555b, this.f193557d, i);
        if (iM166911a >= 0) {
            this.f193556c[iM166911a] = e;
            return;
        }
        int i2 = ~iM166911a;
        int i3 = this.f193557d;
        if (i2 < i3) {
            Object[] objArr = this.f193556c;
            if (objArr[i2] == f193553e) {
                this.f193555b[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f193554a && i3 >= this.f193555b.length) {
            m210128c();
            i2 = ~p06.m166911a(this.f193555b, this.f193557d, i);
        }
        int i4 = this.f193557d;
        if (i4 >= this.f193555b.length) {
            int iM166915e = p06.m166915e(i4 + 1);
            int[] iArr = new int[iM166915e];
            Object[] objArr2 = new Object[iM166915e];
            int[] iArr2 = this.f193555b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f193556c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f193555b = iArr;
            this.f193556c = objArr2;
        }
        int i5 = this.f193557d;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f193555b;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f193556c;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f193557d - i2);
        }
        this.f193555b[i2] = i;
        this.f193556c[i2] = e;
        this.f193557d++;
    }

    /* JADX INFO: renamed from: l */
    public int m210134l() {
        if (this.f193554a) {
            m210128c();
        }
        return this.f193557d;
    }

    /* JADX INFO: renamed from: m */
    public E m210135m(int i) {
        if (this.f193554a) {
            m210128c();
        }
        return (E) this.f193556c[i];
    }

    public String toString() {
        if (m210134l() <= 0) {
            return WeJson.EMPTY_MAP;
        }
        StringBuilder sb = new StringBuilder(this.f193557d * 28);
        sb.append('{');
        for (int i = 0; i < this.f193557d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m210132j(i));
            sb.append('=');
            E eM210135m = m210135m(i);
            if (eM210135m != this) {
                sb.append(eM210135m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public xmf0() {
        this(10);
    }
}
