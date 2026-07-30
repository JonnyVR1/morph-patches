package p153l;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Locale;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class wwy0 {

    /* JADX INFO: renamed from: h */
    public static final wwy0 f191338h;

    /* JADX INFO: renamed from: i */
    public static final wwy0 f191339i;

    /* JADX INFO: renamed from: j */
    public static final String f191340j;

    /* JADX INFO: renamed from: k */
    public static final String f191341k;

    /* JADX INFO: renamed from: l */
    public static final String f191342l;

    /* JADX INFO: renamed from: m */
    public static final String f191343m;

    /* JADX INFO: renamed from: n */
    public static final String f191344n;

    /* JADX INFO: renamed from: o */
    public static final String f191345o;

    /* JADX INFO: renamed from: p */
    @Deprecated
    public static final mhy0 f191346p;

    /* JADX INFO: renamed from: a */
    public final int f191347a;

    /* JADX INFO: renamed from: b */
    public final int f191348b;

    /* JADX INFO: renamed from: c */
    public final int f191349c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final byte[] f191350d;

    /* JADX INFO: renamed from: e */
    public final int f191351e;

    /* JADX INFO: renamed from: f */
    public final int f191352f;

    /* JADX INFO: renamed from: g */
    public int f191353g;

    static {
        dty0 dty0Var = new dty0();
        dty0Var.m117903c(1);
        dty0Var.m117902b(2);
        dty0Var.m117904d(3);
        f191338h = dty0Var.m117907g();
        dty0 dty0Var2 = new dty0();
        dty0Var2.m117903c(1);
        dty0Var2.m117902b(1);
        dty0Var2.m117904d(2);
        f191339i = dty0Var2.m117907g();
        f191340j = Integer.toString(0, 36);
        f191341k = Integer.toString(1, 36);
        f191342l = Integer.toString(2, 36);
        f191343m = Integer.toString(3, 36);
        f191344n = Integer.toString(4, 36);
        f191345o = Integer.toString(5, 36);
        f191346p = new mhy0() { // from class: l.poy0
        };
    }

    public /* synthetic */ wwy0(int i, int i2, int i3, byte[] bArr, int i4, int i5, ruy0 ruy0Var) {
        this.f191347a = i;
        this.f191348b = i2;
        this.f191349c = i3;
        this.f191350d = bArr;
        this.f191351e = i4;
        this.f191352f = i5;
    }

    @Pure
    /* JADX INFO: renamed from: a */
    public static int m208352a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    /* JADX INFO: renamed from: b */
    public static int m208353b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    /* JADX INFO: renamed from: g */
    public static String m208354g(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? "Undefined color range" : "Limited range";
        }
        return "Full range";
    }

    /* JADX INFO: renamed from: h */
    public static String m208355h(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i != 1) {
            return i != 2 ? "Undefined color space" : "BT601";
        }
        return "BT709";
    }

    /* JADX INFO: renamed from: i */
    public static String m208356i(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i != 6) {
            return i != 7 ? "Undefined color transfer" : "HLG";
        }
        return "ST2084 PQ";
    }

    /* JADX INFO: renamed from: c */
    public final dty0 m208357c() {
        return new dty0(this, null);
    }

    /* JADX INFO: renamed from: d */
    public final String m208358d() {
        String str;
        String str2;
        if (m208360f()) {
            str = String.format(Locale.US, "%s/%s/%s", m208355h(this.f191347a), m208354g(this.f191348b), m208356i(this.f191349c));
        } else {
            str = "NA/NA/NA";
        }
        if (m208359e()) {
            str2 = this.f191351e + "/" + this.f191352f;
        } else {
            str2 = "NA/NA";
        }
        return str + "/" + str2;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m208359e() {
        return (this.f191351e == -1 || this.f191352f == -1) ? false : true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wwy0.class == obj.getClass()) {
            wwy0 wwy0Var = (wwy0) obj;
            if (this.f191347a == wwy0Var.f191347a && this.f191348b == wwy0Var.f191348b && this.f191349c == wwy0Var.f191349c && Arrays.equals(this.f191350d, wwy0Var.f191350d) && this.f191351e == wwy0Var.f191351e && this.f191352f == wwy0Var.f191352f) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m208360f() {
        return (this.f191347a == -1 || this.f191348b == -1 || this.f191349c == -1) ? false : true;
    }

    public final int hashCode() {
        int i = this.f191353g;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((this.f191347a + 527) * 31) + this.f191348b) * 31) + this.f191349c) * 31) + Arrays.hashCode(this.f191350d)) * 31) + this.f191351e) * 31) + this.f191352f;
        this.f191353g = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str;
        int i = this.f191351e;
        String str2 = "NA";
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        int i2 = this.f191352f;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        byte[] bArr = this.f191350d;
        int i3 = this.f191349c;
        int i4 = this.f191348b;
        int i5 = this.f191347a;
        return "ColorInfo(" + m208355h(i5) + ", " + m208354g(i4) + ", " + m208356i(i3) + ", " + (bArr != null) + ", " + str + ", " + str2 + ")";
    }
}
