package p149l;

import com.google.android.gms.internal.ads.AbstractC2214o5;
import com.google.android.gms.internal.ads.C2238r5;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class jcx0 {

    /* JADX INFO: renamed from: f */
    public static final jcx0 f117352f = new jcx0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f117353a;

    /* JADX INFO: renamed from: b */
    public int[] f117354b;

    /* JADX INFO: renamed from: c */
    public Object[] f117355c;

    /* JADX INFO: renamed from: d */
    public int f117356d;

    /* JADX INFO: renamed from: e */
    public boolean f117357e;

    public jcx0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f117356d = -1;
        this.f117353a = i;
        this.f117354b = iArr;
        this.f117355c = objArr;
        this.f117357e = z;
    }

    /* JADX INFO: renamed from: c */
    public static jcx0 m140997c() {
        return f117352f;
    }

    /* JADX INFO: renamed from: e */
    public static jcx0 m140998e(jcx0 jcx0Var, jcx0 jcx0Var2) {
        int i = jcx0Var.f117353a + jcx0Var2.f117353a;
        int[] iArrCopyOf = Arrays.copyOf(jcx0Var.f117354b, i);
        System.arraycopy(jcx0Var2.f117354b, 0, iArrCopyOf, jcx0Var.f117353a, jcx0Var2.f117353a);
        Object[] objArrCopyOf = Arrays.copyOf(jcx0Var.f117355c, i);
        System.arraycopy(jcx0Var2.f117355c, 0, objArrCopyOf, jcx0Var.f117353a, jcx0Var2.f117353a);
        return new jcx0(i, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: f */
    public static jcx0 m140999f() {
        return new jcx0(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final int m141000a() {
        int iM13095B;
        int iM13096b;
        int iM13095B2;
        int i = this.f117356d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f117353a; i3++) {
            int i4 = this.f117354b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f117355c[i3]).getClass();
                    iM13095B2 = AbstractC2214o5.m13095B(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    zzgyl zzgylVar = (zzgyl) this.f117355c[i3];
                    int iM13095B3 = AbstractC2214o5.m13095B(i7);
                    int iZzd = zzgylVar.zzd();
                    iM13095B2 = iM13095B3 + AbstractC2214o5.m13095B(iZzd) + iZzd;
                } else if (i6 == 3) {
                    int iM13095B4 = AbstractC2214o5.m13095B(i5 << 3);
                    iM13095B = iM13095B4 + iM13095B4;
                    iM13096b = ((jcx0) this.f117355c[i3]).m141000a();
                } else {
                    if (i6 != 5) {
                        phg0.m168968a(zzhag.zza());
                        return 0;
                    }
                    ((Integer) this.f117355c[i3]).getClass();
                    iM13095B2 = AbstractC2214o5.m13095B(i5 << 3) + 4;
                }
                i2 += iM13095B2;
            } else {
                int i8 = i5 << 3;
                long jLongValue = ((Long) this.f117355c[i3]).longValue();
                iM13095B = AbstractC2214o5.m13095B(i8);
                iM13096b = AbstractC2214o5.m13096b(jLongValue);
            }
            iM13095B2 = iM13095B + iM13096b;
            i2 += iM13095B2;
        }
        this.f117356d = i2;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public final int m141001b() {
        int i = this.f117356d;
        if (i != -1) {
            return i;
        }
        int iM13095B = 0;
        for (int i2 = 0; i2 < this.f117353a; i2++) {
            int i3 = this.f117354b[i2] >>> 3;
            zzgyl zzgylVar = (zzgyl) this.f117355c[i2];
            int iM13095B2 = AbstractC2214o5.m13095B(8);
            int iM13095B3 = AbstractC2214o5.m13095B(16) + AbstractC2214o5.m13095B(i3);
            int iM13095B4 = AbstractC2214o5.m13095B(24);
            int iZzd = zzgylVar.zzd();
            iM13095B += iM13095B2 + iM13095B2 + iM13095B3 + iM13095B4 + AbstractC2214o5.m13095B(iZzd) + iZzd;
        }
        this.f117356d = iM13095B;
        return iM13095B;
    }

    /* JADX INFO: renamed from: d */
    public final jcx0 m141002d(jcx0 jcx0Var) {
        if (jcx0Var.equals(f117352f)) {
            return this;
        }
        m141003g();
        int i = this.f117353a + jcx0Var.f117353a;
        m141008l(i);
        System.arraycopy(jcx0Var.f117354b, 0, this.f117354b, this.f117353a, jcx0Var.f117353a);
        System.arraycopy(jcx0Var.f117355c, 0, this.f117355c, this.f117353a, jcx0Var.f117353a);
        this.f117353a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jcx0)) {
            return false;
        }
        jcx0 jcx0Var = (jcx0) obj;
        int i = this.f117353a;
        if (i == jcx0Var.f117353a) {
            int[] iArr = this.f117354b;
            int[] iArr2 = jcx0Var.f117354b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f117355c;
            Object[] objArr2 = jcx0Var.f117355c;
            int i3 = this.f117353a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m141003g() {
        if (this.f117357e) {
            return;
        }
        bz00.m104536a();
    }

    /* JADX INFO: renamed from: h */
    public final void m141004h() {
        if (this.f117357e) {
            this.f117357e = false;
        }
    }

    public final int hashCode() {
        int i = this.f117353a;
        int i2 = i + 527;
        int[] iArr = this.f117354b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f117355c;
        int i6 = this.f117353a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m141005i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f117353a; i2++) {
            C2238r5.m13234b(sb, i, String.valueOf(this.f117354b[i2] >>> 3), this.f117355c[i2]);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m141006j(int i, Object obj) {
        m141003g();
        m141008l(this.f117353a + 1);
        int[] iArr = this.f117354b;
        int i2 = this.f117353a;
        iArr[i2] = i;
        this.f117355c[i2] = obj;
        this.f117353a = i2 + 1;
    }

    /* JADX INFO: renamed from: k */
    public final void m141007k(z7x0 z7x0Var) throws IOException {
        if (this.f117353a != 0) {
            for (int i = 0; i < this.f117353a; i++) {
                int i2 = this.f117354b[i];
                Object obj = this.f117355c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    z7x0Var.m217511E(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    z7x0Var.m217540x(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    z7x0Var.m217531o(i4, (zzgyl) obj);
                } else if (i3 == 3) {
                    z7x0Var.m217522e(i4);
                    ((jcx0) obj).m141007k(z7x0Var);
                    z7x0Var.m217535s(i4);
                } else {
                    if (i3 != 5) {
                        aag0.m95543a(zzhag.zza());
                        return;
                    }
                    z7x0Var.m217538v(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m141008l(int i) {
        int[] iArr = this.f117354b;
        if (i > iArr.length) {
            int i2 = this.f117353a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f117354b = Arrays.copyOf(iArr, i);
            this.f117355c = Arrays.copyOf(this.f117355c, i);
        }
    }

    public jcx0() {
        this(0, new int[8], new Object[8], true);
    }
}
