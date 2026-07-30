package p153l;

import com.google.android.gms.internal.play_billing.AbstractC2395a0;
import com.google.android.gms.internal.play_billing.C2409g0;
import com.google.android.gms.internal.play_billing.zzgk;
import com.google.android.gms.internal.play_billing.zzhq;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class o0y0 {

    /* JADX INFO: renamed from: f */
    public static final o0y0 f144599f = new o0y0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f144600a;

    /* JADX INFO: renamed from: b */
    public int[] f144601b;

    /* JADX INFO: renamed from: c */
    public Object[] f144602c;

    /* JADX INFO: renamed from: d */
    public int f144603d;

    /* JADX INFO: renamed from: e */
    public boolean f144604e;

    public o0y0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f144603d = -1;
        this.f144600a = i;
        this.f144601b = iArr;
        this.f144602c = objArr;
        this.f144604e = z;
    }

    /* JADX INFO: renamed from: c */
    public static o0y0 m165555c() {
        return f144599f;
    }

    /* JADX INFO: renamed from: e */
    public static o0y0 m165556e(o0y0 o0y0Var, o0y0 o0y0Var2) {
        int i = o0y0Var.f144600a + o0y0Var2.f144600a;
        int[] iArrCopyOf = Arrays.copyOf(o0y0Var.f144601b, i);
        System.arraycopy(o0y0Var2.f144601b, 0, iArrCopyOf, o0y0Var.f144600a, o0y0Var2.f144600a);
        Object[] objArrCopyOf = Arrays.copyOf(o0y0Var.f144602c, i);
        System.arraycopy(o0y0Var2.f144602c, 0, objArrCopyOf, o0y0Var.f144600a, o0y0Var2.f144600a);
        return new o0y0(i, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: f */
    public static o0y0 m165557f() {
        return new o0y0(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final int m165558a() {
        int iM14771B;
        int iM14772a;
        int iM14771B2;
        int i = this.f144603d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f144600a; i3++) {
            int i4 = this.f144601b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f144602c[i3]).getClass();
                    iM14771B2 = AbstractC2395a0.m14771B(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    zzgk zzgkVar = (zzgk) this.f144602c[i3];
                    int iM14771B3 = AbstractC2395a0.m14771B(i7);
                    int iZzd = zzgkVar.zzd();
                    iM14771B2 = iM14771B3 + AbstractC2395a0.m14771B(iZzd) + iZzd;
                } else if (i6 == 3) {
                    int iM14771B4 = AbstractC2395a0.m14771B(i5 << 3);
                    iM14771B = iM14771B4 + iM14771B4;
                    iM14772a = ((o0y0) this.f144602c[i3]).m165558a();
                } else {
                    if (i6 != 5) {
                        xpg0.m212648a(new zzhq("Protocol message tag had invalid wire type."));
                        return 0;
                    }
                    ((Integer) this.f144602c[i3]).getClass();
                    iM14771B2 = AbstractC2395a0.m14771B(i5 << 3) + 4;
                }
                i2 += iM14771B2;
            } else {
                int i8 = i5 << 3;
                long jLongValue = ((Long) this.f144602c[i3]).longValue();
                iM14771B = AbstractC2395a0.m14771B(i8);
                iM14772a = AbstractC2395a0.m14772a(jLongValue);
            }
            iM14771B2 = iM14771B + iM14772a;
            i2 += iM14771B2;
        }
        this.f144603d = i2;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public final int m165559b() {
        int i = this.f144603d;
        if (i != -1) {
            return i;
        }
        int iM14771B = 0;
        for (int i2 = 0; i2 < this.f144600a; i2++) {
            int i3 = this.f144601b[i2] >>> 3;
            zzgk zzgkVar = (zzgk) this.f144602c[i2];
            int iM14771B2 = AbstractC2395a0.m14771B(8);
            int iM14771B3 = AbstractC2395a0.m14771B(16) + AbstractC2395a0.m14771B(i3);
            int iM14771B4 = AbstractC2395a0.m14771B(24);
            int iZzd = zzgkVar.zzd();
            iM14771B += iM14771B2 + iM14771B2 + iM14771B3 + iM14771B4 + AbstractC2395a0.m14771B(iZzd) + iZzd;
        }
        this.f144603d = iM14771B;
        return iM14771B;
    }

    /* JADX INFO: renamed from: d */
    public final o0y0 m165560d(o0y0 o0y0Var) {
        if (o0y0Var.equals(f144599f)) {
            return this;
        }
        m165561g();
        int i = this.f144600a + o0y0Var.f144600a;
        m165567m(i);
        System.arraycopy(o0y0Var.f144601b, 0, this.f144601b, this.f144600a, o0y0Var.f144600a);
        System.arraycopy(o0y0Var.f144602c, 0, this.f144602c, this.f144600a, o0y0Var.f144600a);
        this.f144600a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o0y0)) {
            return false;
        }
        o0y0 o0y0Var = (o0y0) obj;
        int i = this.f144600a;
        if (i == o0y0Var.f144600a) {
            int[] iArr = this.f144601b;
            int[] iArr2 = o0y0Var.f144601b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f144602c;
            Object[] objArr2 = o0y0Var.f144602c;
            int i3 = this.f144600a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m165561g() {
        if (this.f144604e) {
            return;
        }
        l710.m153113a();
    }

    /* JADX INFO: renamed from: h */
    public final void m165562h() {
        if (this.f144604e) {
            this.f144604e = false;
        }
    }

    public final int hashCode() {
        int i = this.f144600a;
        int i2 = i + 527;
        int[] iArr = this.f144601b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f144602c;
        int i6 = this.f144600a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m165563i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f144600a; i2++) {
            C2409g0.m14844b(sb, i, String.valueOf(this.f144601b[i2] >>> 3), this.f144602c[i2]);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m165564j(int i, Object obj) {
        m165561g();
        m165567m(this.f144600a + 1);
        int[] iArr = this.f144601b;
        int i2 = this.f144600a;
        iArr[i2] = i;
        this.f144602c[i2] = obj;
        this.f144600a = i2 + 1;
    }

    /* JADX INFO: renamed from: k */
    public final void m165565k(o2y0 o2y0Var) throws IOException {
        for (int i = 0; i < this.f144600a; i++) {
            o2y0Var.mo165828x(this.f144601b[i] >>> 3, this.f144602c[i]);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m165566l(o2y0 o2y0Var) throws IOException {
        if (this.f144600a != 0) {
            for (int i = 0; i < this.f144600a; i++) {
                int i2 = this.f144601b[i];
                Object obj = this.f144602c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    o2y0Var.mo165799E(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    o2y0Var.mo165812h(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    o2y0Var.mo165829y(i4, (zzgk) obj);
                } else if (i3 == 3) {
                    o2y0Var.mo165820p(i4);
                    ((o0y0) obj).m165566l(o2y0Var);
                    o2y0Var.zzh(i4);
                } else {
                    if (i3 != 5) {
                        iig0.m140070a(new zzhq("Protocol message tag had invalid wire type."));
                        return;
                    }
                    o2y0Var.mo165822r(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m165567m(int i) {
        int[] iArr = this.f144601b;
        if (i > iArr.length) {
            int i2 = this.f144600a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f144601b = Arrays.copyOf(iArr, i);
            this.f144602c = Arrays.copyOf(this.f144602c, i);
        }
    }

    public o0y0() {
        this(0, new int[8], new Object[8], true);
    }
}
