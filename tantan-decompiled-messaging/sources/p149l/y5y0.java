package p149l;

import com.google.android.gms.internal.measurement.C2351v0;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzjc;
import com.google.android.gms.internal.measurement.zzkb;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class y5y0 {

    /* JADX INFO: renamed from: f */
    public static final y5y0 f196489f = new y5y0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f196490a;

    /* JADX INFO: renamed from: b */
    public int[] f196491b;

    /* JADX INFO: renamed from: c */
    public Object[] f196492c;

    /* JADX INFO: renamed from: d */
    public int f196493d;

    /* JADX INFO: renamed from: e */
    public boolean f196494e;

    public y5y0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f196493d = -1;
        this.f196490a = i;
        this.f196491b = iArr;
        this.f196492c = objArr;
        this.f196494e = z;
    }

    /* JADX INFO: renamed from: c */
    public static y5y0 m213021c(y5y0 y5y0Var, y5y0 y5y0Var2) {
        int i = y5y0Var.f196490a + y5y0Var2.f196490a;
        int[] iArrCopyOf = Arrays.copyOf(y5y0Var.f196491b, i);
        System.arraycopy(y5y0Var2.f196491b, 0, iArrCopyOf, y5y0Var.f196490a, y5y0Var2.f196490a);
        Object[] objArrCopyOf = Arrays.copyOf(y5y0Var.f196492c, i);
        System.arraycopy(y5y0Var2.f196492c, 0, objArrCopyOf, y5y0Var.f196490a, y5y0Var2.f196490a);
        return new y5y0(i, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: f */
    public static void m213022f(int i, Object obj, m8y0 m8y0Var) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            m8y0Var.mo153547j(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            m8y0Var.mo153539b(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            m8y0Var.mo153563z(i2, (zzik) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 == 5) {
                m8y0Var.mo153548k(i2, ((Integer) obj).intValue());
                return;
            } else {
                aag0.m95543a(zzkb.zza());
                return;
            }
        }
        if (m8y0Var.zza() == 1) {
            m8y0Var.mo153542e(i2);
            ((y5y0) obj).m213032j(m8y0Var);
            m8y0Var.zza(i2);
        } else {
            m8y0Var.zza(i2);
            ((y5y0) obj).m213032j(m8y0Var);
            m8y0Var.mo153542e(i2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static y5y0 m213023k() {
        return f196489f;
    }

    /* JADX INFO: renamed from: l */
    public static y5y0 m213024l() {
        return new y5y0();
    }

    /* JADX INFO: renamed from: a */
    public final int m213025a() {
        int iM14670q0;
        int i = this.f196493d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f196490a; i3++) {
            int i4 = this.f196491b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                iM14670q0 = zzjc.m14670q0(i5, ((Long) this.f196492c[i3]).longValue());
            } else if (i6 == 1) {
                iM14670q0 = zzjc.m14641T(i5, ((Long) this.f196492c[i3]).longValue());
            } else if (i6 == 2) {
                iM14670q0 = zzjc.m14642U(i5, (zzik) this.f196492c[i3]);
            } else if (i6 == 3) {
                iM14670q0 = (zzjc.m14674w0(i5) << 1) + ((y5y0) this.f196492c[i3]).m213025a();
            } else {
                if (i6 != 5) {
                    phg0.m168968a(zzkb.zza());
                    return 0;
                }
                iM14670q0 = zzjc.m14665l0(i5, ((Integer) this.f196492c[i3]).intValue());
            }
            i2 += iM14670q0;
        }
        this.f196493d = i2;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public final y5y0 m213026b(y5y0 y5y0Var) {
        if (y5y0Var.equals(f196489f)) {
            return this;
        }
        m213034n();
        int i = this.f196490a + y5y0Var.f196490a;
        m213027d(i);
        System.arraycopy(y5y0Var.f196491b, 0, this.f196491b, this.f196490a, y5y0Var.f196490a);
        System.arraycopy(y5y0Var.f196492c, 0, this.f196492c, this.f196490a, y5y0Var.f196490a);
        this.f196490a = i;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final void m213027d(int i) {
        int[] iArr = this.f196491b;
        if (i > iArr.length) {
            int i2 = this.f196490a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f196491b = Arrays.copyOf(iArr, i);
            this.f196492c = Arrays.copyOf(this.f196492c, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m213028e(int i, Object obj) {
        m213034n();
        m213027d(this.f196490a + 1);
        int[] iArr = this.f196491b;
        int i2 = this.f196490a;
        iArr[i2] = i;
        this.f196492c[i2] = obj;
        this.f196490a = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y5y0)) {
            return false;
        }
        y5y0 y5y0Var = (y5y0) obj;
        int i = this.f196490a;
        if (i == y5y0Var.f196490a) {
            int[] iArr = this.f196491b;
            int[] iArr2 = y5y0Var.f196491b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f196492c;
            Object[] objArr2 = y5y0Var.f196492c;
            int i3 = this.f196490a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m213029g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f196490a; i2++) {
            C2351v0.m14412c(sb, i, String.valueOf(this.f196491b[i2] >>> 3), this.f196492c[i2]);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m213030h(m8y0 m8y0Var) throws IOException {
        if (m8y0Var.zza() == 2) {
            for (int i = this.f196490a - 1; i >= 0; i--) {
                m8y0Var.mo153552o(this.f196491b[i] >>> 3, this.f196492c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f196490a; i2++) {
            m8y0Var.mo153552o(this.f196491b[i2] >>> 3, this.f196492c[i2]);
        }
    }

    public final int hashCode() {
        int i = this.f196490a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f196491b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f196492c;
        int i6 = this.f196490a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final int m213031i() {
        int i = this.f196493d;
        if (i != -1) {
            return i;
        }
        int iM14651d0 = 0;
        for (int i2 = 0; i2 < this.f196490a; i2++) {
            iM14651d0 += zzjc.m14651d0(this.f196491b[i2] >>> 3, (zzik) this.f196492c[i2]);
        }
        this.f196493d = iM14651d0;
        return iM14651d0;
    }

    /* JADX INFO: renamed from: j */
    public final void m213032j(m8y0 m8y0Var) throws IOException {
        if (this.f196490a == 0) {
            return;
        }
        if (m8y0Var.zza() == 1) {
            for (int i = 0; i < this.f196490a; i++) {
                m213022f(this.f196491b[i], this.f196492c[i], m8y0Var);
            }
            return;
        }
        for (int i2 = this.f196490a - 1; i2 >= 0; i2--) {
            m213022f(this.f196491b[i2], this.f196492c[i2], m8y0Var);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m213033m() {
        if (this.f196494e) {
            this.f196494e = false;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m213034n() {
        if (this.f196494e) {
            return;
        }
        bz00.m104536a();
    }

    public y5y0() {
        this(0, new int[8], new Object[8], true);
    }
}
