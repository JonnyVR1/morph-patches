package p153l;

import com.google.android.gms.internal.ads.AbstractC2237o5;
import com.google.android.gms.internal.ads.C2261r5;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class plx0 {

    /* JADX INFO: renamed from: f */
    public static final plx0 f153099f = new plx0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f153100a;

    /* JADX INFO: renamed from: b */
    public int[] f153101b;

    /* JADX INFO: renamed from: c */
    public Object[] f153102c;

    /* JADX INFO: renamed from: d */
    public int f153103d;

    /* JADX INFO: renamed from: e */
    public boolean f153104e;

    public plx0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f153103d = -1;
        this.f153100a = i;
        this.f153101b = iArr;
        this.f153102c = objArr;
        this.f153104e = z;
    }

    /* JADX INFO: renamed from: c */
    public static plx0 m172889c() {
        return f153099f;
    }

    /* JADX INFO: renamed from: e */
    public static plx0 m172890e(plx0 plx0Var, plx0 plx0Var2) {
        int i = plx0Var.f153100a + plx0Var2.f153100a;
        int[] iArrCopyOf = Arrays.copyOf(plx0Var.f153101b, i);
        System.arraycopy(plx0Var2.f153101b, 0, iArrCopyOf, plx0Var.f153100a, plx0Var2.f153100a);
        Object[] objArrCopyOf = Arrays.copyOf(plx0Var.f153102c, i);
        System.arraycopy(plx0Var2.f153102c, 0, objArrCopyOf, plx0Var.f153100a, plx0Var2.f153100a);
        return new plx0(i, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: f */
    public static plx0 m172891f() {
        return new plx0(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final int m172892a() {
        int iM13149B;
        int iM13150b;
        int iM13149B2;
        int i = this.f153103d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f153100a; i3++) {
            int i4 = this.f153101b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f153102c[i3]).getClass();
                    iM13149B2 = AbstractC2237o5.m13149B(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    zzgyl zzgylVar = (zzgyl) this.f153102c[i3];
                    int iM13149B3 = AbstractC2237o5.m13149B(i7);
                    int iZzd = zzgylVar.zzd();
                    iM13149B2 = iM13149B3 + AbstractC2237o5.m13149B(iZzd) + iZzd;
                } else if (i6 == 3) {
                    int iM13149B4 = AbstractC2237o5.m13149B(i5 << 3);
                    iM13149B = iM13149B4 + iM13149B4;
                    iM13150b = ((plx0) this.f153102c[i3]).m172892a();
                } else {
                    if (i6 != 5) {
                        xpg0.m212648a(zzhag.zza());
                        return 0;
                    }
                    ((Integer) this.f153102c[i3]).getClass();
                    iM13149B2 = AbstractC2237o5.m13149B(i5 << 3) + 4;
                }
                i2 += iM13149B2;
            } else {
                int i8 = i5 << 3;
                long jLongValue = ((Long) this.f153102c[i3]).longValue();
                iM13149B = AbstractC2237o5.m13149B(i8);
                iM13150b = AbstractC2237o5.m13150b(jLongValue);
            }
            iM13149B2 = iM13149B + iM13150b;
            i2 += iM13149B2;
        }
        this.f153103d = i2;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public final int m172893b() {
        int i = this.f153103d;
        if (i != -1) {
            return i;
        }
        int iM13149B = 0;
        for (int i2 = 0; i2 < this.f153100a; i2++) {
            int i3 = this.f153101b[i2] >>> 3;
            zzgyl zzgylVar = (zzgyl) this.f153102c[i2];
            int iM13149B2 = AbstractC2237o5.m13149B(8);
            int iM13149B3 = AbstractC2237o5.m13149B(16) + AbstractC2237o5.m13149B(i3);
            int iM13149B4 = AbstractC2237o5.m13149B(24);
            int iZzd = zzgylVar.zzd();
            iM13149B += iM13149B2 + iM13149B2 + iM13149B3 + iM13149B4 + AbstractC2237o5.m13149B(iZzd) + iZzd;
        }
        this.f153103d = iM13149B;
        return iM13149B;
    }

    /* JADX INFO: renamed from: d */
    public final plx0 m172894d(plx0 plx0Var) {
        if (plx0Var.equals(f153099f)) {
            return this;
        }
        m172895g();
        int i = this.f153100a + plx0Var.f153100a;
        m172900l(i);
        System.arraycopy(plx0Var.f153101b, 0, this.f153101b, this.f153100a, plx0Var.f153100a);
        System.arraycopy(plx0Var.f153102c, 0, this.f153102c, this.f153100a, plx0Var.f153100a);
        this.f153100a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof plx0)) {
            return false;
        }
        plx0 plx0Var = (plx0) obj;
        int i = this.f153100a;
        if (i == plx0Var.f153100a) {
            int[] iArr = this.f153101b;
            int[] iArr2 = plx0Var.f153101b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f153102c;
            Object[] objArr2 = plx0Var.f153102c;
            int i3 = this.f153100a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m172895g() {
        if (this.f153104e) {
            return;
        }
        l710.m153113a();
    }

    /* JADX INFO: renamed from: h */
    public final void m172896h() {
        if (this.f153104e) {
            this.f153104e = false;
        }
    }

    public final int hashCode() {
        int i = this.f153100a;
        int i2 = i + 527;
        int[] iArr = this.f153101b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f153102c;
        int i6 = this.f153100a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m172897i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f153100a; i2++) {
            C2261r5.m13288b(sb, i, String.valueOf(this.f153101b[i2] >>> 3), this.f153102c[i2]);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m172898j(int i, Object obj) {
        m172895g();
        m172900l(this.f153100a + 1);
        int[] iArr = this.f153101b;
        int i2 = this.f153100a;
        iArr[i2] = i;
        this.f153102c[i2] = obj;
        this.f153100a = i2 + 1;
    }

    /* JADX INFO: renamed from: k */
    public final void m172899k(fhx0 fhx0Var) throws IOException {
        if (this.f153100a != 0) {
            for (int i = 0; i < this.f153100a; i++) {
                int i2 = this.f153101b[i];
                Object obj = this.f153102c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    fhx0Var.m125615E(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    fhx0Var.m125644x(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    fhx0Var.m125635o(i4, (zzgyl) obj);
                } else if (i3 == 3) {
                    fhx0Var.m125626e(i4);
                    ((plx0) obj).m172899k(fhx0Var);
                    fhx0Var.m125639s(i4);
                } else {
                    if (i3 != 5) {
                        iig0.m140070a(zzhag.zza());
                        return;
                    }
                    fhx0Var.m125642v(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m172900l(int i) {
        int[] iArr = this.f153101b;
        if (i > iArr.length) {
            int i2 = this.f153100a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f153101b = Arrays.copyOf(iArr, i);
            this.f153102c = Arrays.copyOf(this.f153102c, i);
        }
    }

    public plx0() {
        this(0, new int[8], new Object[8], true);
    }
}
