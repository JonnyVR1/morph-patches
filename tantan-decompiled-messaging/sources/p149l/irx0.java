package p149l;

import com.google.android.gms.internal.play_billing.AbstractC2372a0;
import com.google.android.gms.internal.play_billing.C2386g0;
import com.google.android.gms.internal.play_billing.zzgk;
import com.google.android.gms.internal.play_billing.zzhq;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class irx0 {

    /* JADX INFO: renamed from: f */
    public static final irx0 f114698f = new irx0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f114699a;

    /* JADX INFO: renamed from: b */
    public int[] f114700b;

    /* JADX INFO: renamed from: c */
    public Object[] f114701c;

    /* JADX INFO: renamed from: d */
    public int f114702d;

    /* JADX INFO: renamed from: e */
    public boolean f114703e;

    public irx0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f114702d = -1;
        this.f114699a = i;
        this.f114700b = iArr;
        this.f114701c = objArr;
        this.f114703e = z;
    }

    /* JADX INFO: renamed from: c */
    public static irx0 m137921c() {
        return f114698f;
    }

    /* JADX INFO: renamed from: e */
    public static irx0 m137922e(irx0 irx0Var, irx0 irx0Var2) {
        int i = irx0Var.f114699a + irx0Var2.f114699a;
        int[] iArrCopyOf = Arrays.copyOf(irx0Var.f114700b, i);
        System.arraycopy(irx0Var2.f114700b, 0, iArrCopyOf, irx0Var.f114699a, irx0Var2.f114699a);
        Object[] objArrCopyOf = Arrays.copyOf(irx0Var.f114701c, i);
        System.arraycopy(irx0Var2.f114701c, 0, objArrCopyOf, irx0Var.f114699a, irx0Var2.f114699a);
        return new irx0(i, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: f */
    public static irx0 m137923f() {
        return new irx0(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final int m137924a() {
        int iM14717B;
        int iM14718a;
        int iM14717B2;
        int i = this.f114702d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f114699a; i3++) {
            int i4 = this.f114700b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f114701c[i3]).getClass();
                    iM14717B2 = AbstractC2372a0.m14717B(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    zzgk zzgkVar = (zzgk) this.f114701c[i3];
                    int iM14717B3 = AbstractC2372a0.m14717B(i7);
                    int iZzd = zzgkVar.zzd();
                    iM14717B2 = iM14717B3 + AbstractC2372a0.m14717B(iZzd) + iZzd;
                } else if (i6 == 3) {
                    int iM14717B4 = AbstractC2372a0.m14717B(i5 << 3);
                    iM14717B = iM14717B4 + iM14717B4;
                    iM14718a = ((irx0) this.f114701c[i3]).m137924a();
                } else {
                    if (i6 != 5) {
                        phg0.m168968a(new zzhq("Protocol message tag had invalid wire type."));
                        return 0;
                    }
                    ((Integer) this.f114701c[i3]).getClass();
                    iM14717B2 = AbstractC2372a0.m14717B(i5 << 3) + 4;
                }
                i2 += iM14717B2;
            } else {
                int i8 = i5 << 3;
                long jLongValue = ((Long) this.f114701c[i3]).longValue();
                iM14717B = AbstractC2372a0.m14717B(i8);
                iM14718a = AbstractC2372a0.m14718a(jLongValue);
            }
            iM14717B2 = iM14717B + iM14718a;
            i2 += iM14717B2;
        }
        this.f114702d = i2;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public final int m137925b() {
        int i = this.f114702d;
        if (i != -1) {
            return i;
        }
        int iM14717B = 0;
        for (int i2 = 0; i2 < this.f114699a; i2++) {
            int i3 = this.f114700b[i2] >>> 3;
            zzgk zzgkVar = (zzgk) this.f114701c[i2];
            int iM14717B2 = AbstractC2372a0.m14717B(8);
            int iM14717B3 = AbstractC2372a0.m14717B(16) + AbstractC2372a0.m14717B(i3);
            int iM14717B4 = AbstractC2372a0.m14717B(24);
            int iZzd = zzgkVar.zzd();
            iM14717B += iM14717B2 + iM14717B2 + iM14717B3 + iM14717B4 + AbstractC2372a0.m14717B(iZzd) + iZzd;
        }
        this.f114702d = iM14717B;
        return iM14717B;
    }

    /* JADX INFO: renamed from: d */
    public final irx0 m137926d(irx0 irx0Var) {
        if (irx0Var.equals(f114698f)) {
            return this;
        }
        m137927g();
        int i = this.f114699a + irx0Var.f114699a;
        m137933m(i);
        System.arraycopy(irx0Var.f114700b, 0, this.f114700b, this.f114699a, irx0Var.f114699a);
        System.arraycopy(irx0Var.f114701c, 0, this.f114701c, this.f114699a, irx0Var.f114699a);
        this.f114699a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof irx0)) {
            return false;
        }
        irx0 irx0Var = (irx0) obj;
        int i = this.f114699a;
        if (i == irx0Var.f114699a) {
            int[] iArr = this.f114700b;
            int[] iArr2 = irx0Var.f114700b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f114701c;
            Object[] objArr2 = irx0Var.f114701c;
            int i3 = this.f114699a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m137927g() {
        if (this.f114703e) {
            return;
        }
        bz00.m104536a();
    }

    /* JADX INFO: renamed from: h */
    public final void m137928h() {
        if (this.f114703e) {
            this.f114703e = false;
        }
    }

    public final int hashCode() {
        int i = this.f114699a;
        int i2 = i + 527;
        int[] iArr = this.f114700b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f114701c;
        int i6 = this.f114699a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m137929i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f114699a; i2++) {
            C2386g0.m14790b(sb, i, String.valueOf(this.f114700b[i2] >>> 3), this.f114701c[i2]);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m137930j(int i, Object obj) {
        m137927g();
        m137933m(this.f114699a + 1);
        int[] iArr = this.f114700b;
        int i2 = this.f114699a;
        iArr[i2] = i;
        this.f114701c[i2] = obj;
        this.f114699a = i2 + 1;
    }

    /* JADX INFO: renamed from: k */
    public final void m137931k(itx0 itx0Var) throws IOException {
        for (int i = 0; i < this.f114699a; i++) {
            itx0Var.mo138311x(this.f114700b[i] >>> 3, this.f114701c[i]);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m137932l(itx0 itx0Var) throws IOException {
        if (this.f114699a != 0) {
            for (int i = 0; i < this.f114699a; i++) {
                int i2 = this.f114700b[i];
                Object obj = this.f114701c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    itx0Var.mo138282E(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    itx0Var.mo138295h(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    itx0Var.mo138312y(i4, (zzgk) obj);
                } else if (i3 == 3) {
                    itx0Var.mo138303p(i4);
                    ((irx0) obj).m137932l(itx0Var);
                    itx0Var.zzh(i4);
                } else {
                    if (i3 != 5) {
                        aag0.m95543a(new zzhq("Protocol message tag had invalid wire type."));
                        return;
                    }
                    itx0Var.mo138305r(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m137933m(int i) {
        int[] iArr = this.f114700b;
        if (i > iArr.length) {
            int i2 = this.f114699a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f114700b = Arrays.copyOf(iArr, i);
            this.f114701c = Arrays.copyOf(this.f114701c, i);
        }
    }

    public irx0() {
        this(0, new int[8], new Object[8], true);
    }
}
