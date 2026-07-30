package p153l;

import com.google.android.gms.internal.measurement.C2374v0;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzjc;
import com.google.android.gms.internal.measurement.zzkb;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class efy0 {

    /* JADX INFO: renamed from: f */
    public static final efy0 f93877f = new efy0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f93878a;

    /* JADX INFO: renamed from: b */
    public int[] f93879b;

    /* JADX INFO: renamed from: c */
    public Object[] f93880c;

    /* JADX INFO: renamed from: d */
    public int f93881d;

    /* JADX INFO: renamed from: e */
    public boolean f93882e;

    public efy0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f93881d = -1;
        this.f93878a = i;
        this.f93879b = iArr;
        this.f93880c = objArr;
        this.f93882e = z;
    }

    /* JADX INFO: renamed from: c */
    public static efy0 m120736c(efy0 efy0Var, efy0 efy0Var2) {
        int i = efy0Var.f93878a + efy0Var2.f93878a;
        int[] iArrCopyOf = Arrays.copyOf(efy0Var.f93879b, i);
        System.arraycopy(efy0Var2.f93879b, 0, iArrCopyOf, efy0Var.f93878a, efy0Var2.f93878a);
        Object[] objArrCopyOf = Arrays.copyOf(efy0Var.f93880c, i);
        System.arraycopy(efy0Var2.f93880c, 0, objArrCopyOf, efy0Var.f93878a, efy0Var2.f93878a);
        return new efy0(i, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: f */
    public static void m120737f(int i, Object obj, shy0 shy0Var) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            shy0Var.mo185976j(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            shy0Var.mo185968b(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            shy0Var.mo185992z(i2, (zzik) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 == 5) {
                shy0Var.mo185977k(i2, ((Integer) obj).intValue());
                return;
            } else {
                iig0.m140070a(zzkb.zza());
                return;
            }
        }
        if (shy0Var.zza() == 1) {
            shy0Var.mo185971e(i2);
            ((efy0) obj).m120747j(shy0Var);
            shy0Var.zza(i2);
        } else {
            shy0Var.zza(i2);
            ((efy0) obj).m120747j(shy0Var);
            shy0Var.mo185971e(i2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static efy0 m120738k() {
        return f93877f;
    }

    /* JADX INFO: renamed from: l */
    public static efy0 m120739l() {
        return new efy0();
    }

    /* JADX INFO: renamed from: a */
    public final int m120740a() {
        int iM14724q0;
        int i = this.f93881d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f93878a; i3++) {
            int i4 = this.f93879b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                iM14724q0 = zzjc.m14724q0(i5, ((Long) this.f93880c[i3]).longValue());
            } else if (i6 == 1) {
                iM14724q0 = zzjc.m14695T(i5, ((Long) this.f93880c[i3]).longValue());
            } else if (i6 == 2) {
                iM14724q0 = zzjc.m14696U(i5, (zzik) this.f93880c[i3]);
            } else if (i6 == 3) {
                iM14724q0 = (zzjc.m14728w0(i5) << 1) + ((efy0) this.f93880c[i3]).m120740a();
            } else {
                if (i6 != 5) {
                    xpg0.m212648a(zzkb.zza());
                    return 0;
                }
                iM14724q0 = zzjc.m14719l0(i5, ((Integer) this.f93880c[i3]).intValue());
            }
            i2 += iM14724q0;
        }
        this.f93881d = i2;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public final efy0 m120741b(efy0 efy0Var) {
        if (efy0Var.equals(f93877f)) {
            return this;
        }
        m120749n();
        int i = this.f93878a + efy0Var.f93878a;
        m120742d(i);
        System.arraycopy(efy0Var.f93879b, 0, this.f93879b, this.f93878a, efy0Var.f93878a);
        System.arraycopy(efy0Var.f93880c, 0, this.f93880c, this.f93878a, efy0Var.f93878a);
        this.f93878a = i;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final void m120742d(int i) {
        int[] iArr = this.f93879b;
        if (i > iArr.length) {
            int i2 = this.f93878a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f93879b = Arrays.copyOf(iArr, i);
            this.f93880c = Arrays.copyOf(this.f93880c, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m120743e(int i, Object obj) {
        m120749n();
        m120742d(this.f93878a + 1);
        int[] iArr = this.f93879b;
        int i2 = this.f93878a;
        iArr[i2] = i;
        this.f93880c[i2] = obj;
        this.f93878a = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof efy0)) {
            return false;
        }
        efy0 efy0Var = (efy0) obj;
        int i = this.f93878a;
        if (i == efy0Var.f93878a) {
            int[] iArr = this.f93879b;
            int[] iArr2 = efy0Var.f93879b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f93880c;
            Object[] objArr2 = efy0Var.f93880c;
            int i3 = this.f93878a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m120744g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f93878a; i2++) {
            C2374v0.m14466c(sb, i, String.valueOf(this.f93879b[i2] >>> 3), this.f93880c[i2]);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m120745h(shy0 shy0Var) throws IOException {
        if (shy0Var.zza() == 2) {
            for (int i = this.f93878a - 1; i >= 0; i--) {
                shy0Var.mo185981o(this.f93879b[i] >>> 3, this.f93880c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f93878a; i2++) {
            shy0Var.mo185981o(this.f93879b[i2] >>> 3, this.f93880c[i2]);
        }
    }

    public final int hashCode() {
        int i = this.f93878a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f93879b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f93880c;
        int i6 = this.f93878a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final int m120746i() {
        int i = this.f93881d;
        if (i != -1) {
            return i;
        }
        int iM14705d0 = 0;
        for (int i2 = 0; i2 < this.f93878a; i2++) {
            iM14705d0 += zzjc.m14705d0(this.f93879b[i2] >>> 3, (zzik) this.f93880c[i2]);
        }
        this.f93881d = iM14705d0;
        return iM14705d0;
    }

    /* JADX INFO: renamed from: j */
    public final void m120747j(shy0 shy0Var) throws IOException {
        if (this.f93878a == 0) {
            return;
        }
        if (shy0Var.zza() == 1) {
            for (int i = 0; i < this.f93878a; i++) {
                m120737f(this.f93879b[i], this.f93880c[i], shy0Var);
            }
            return;
        }
        for (int i2 = this.f93878a - 1; i2 >= 0; i2--) {
            m120737f(this.f93879b[i2], this.f93880c[i2], shy0Var);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m120748m() {
        if (this.f93882e) {
            this.f93882e = false;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m120749n() {
        if (this.f93882e) {
            return;
        }
        l710.m153113a();
    }

    public efy0() {
        this(0, new int[8], new Object[8], true);
    }
}
