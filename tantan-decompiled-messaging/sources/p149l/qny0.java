package p149l;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Locale;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class qny0 {

    /* JADX INFO: renamed from: h */
    public static final qny0 f155499h;

    /* JADX INFO: renamed from: i */
    public static final qny0 f155500i;

    /* JADX INFO: renamed from: j */
    public static final String f155501j;

    /* JADX INFO: renamed from: k */
    public static final String f155502k;

    /* JADX INFO: renamed from: l */
    public static final String f155503l;

    /* JADX INFO: renamed from: m */
    public static final String f155504m;

    /* JADX INFO: renamed from: n */
    public static final String f155505n;

    /* JADX INFO: renamed from: o */
    public static final String f155506o;

    /* JADX INFO: renamed from: p */
    @Deprecated
    public static final g8y0 f155507p;

    /* JADX INFO: renamed from: a */
    public final int f155508a;

    /* JADX INFO: renamed from: b */
    public final int f155509b;

    /* JADX INFO: renamed from: c */
    public final int f155510c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final byte[] f155511d;

    /* JADX INFO: renamed from: e */
    public final int f155512e;

    /* JADX INFO: renamed from: f */
    public final int f155513f;

    /* JADX INFO: renamed from: g */
    public int f155514g;

    static {
        xjy0 xjy0Var = new xjy0();
        xjy0Var.m209757c(1);
        xjy0Var.m209756b(2);
        xjy0Var.m209758d(3);
        f155499h = xjy0Var.m209761g();
        xjy0 xjy0Var2 = new xjy0();
        xjy0Var2.m209757c(1);
        xjy0Var2.m209756b(1);
        xjy0Var2.m209758d(2);
        f155500i = xjy0Var2.m209761g();
        f155501j = Integer.toString(0, 36);
        f155502k = Integer.toString(1, 36);
        f155503l = Integer.toString(2, 36);
        f155504m = Integer.toString(3, 36);
        f155505n = Integer.toString(4, 36);
        f155506o = Integer.toString(5, 36);
        f155507p = new g8y0() { // from class: l.jfy0
        };
    }

    public /* synthetic */ qny0(int i, int i2, int i3, byte[] bArr, int i4, int i5, lly0 lly0Var) {
        this.f155508a = i;
        this.f155509b = i2;
        this.f155510c = i3;
        this.f155511d = bArr;
        this.f155512e = i4;
        this.f155513f = i5;
    }

    @Pure
    /* JADX INFO: renamed from: a */
    public static int m175707a(int i) {
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
    public static int m175708b(int i) {
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
    public static String m175709g(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? "Undefined color range" : "Limited range";
        }
        return "Full range";
    }

    /* JADX INFO: renamed from: h */
    public static String m175710h(int i) {
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
    public static String m175711i(int i) {
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
    public final xjy0 m175712c() {
        return new xjy0(this, null);
    }

    /* JADX INFO: renamed from: d */
    public final String m175713d() {
        String str;
        String str2;
        if (m175715f()) {
            str = String.format(Locale.US, "%s/%s/%s", m175710h(this.f155508a), m175709g(this.f155509b), m175711i(this.f155510c));
        } else {
            str = "NA/NA/NA";
        }
        if (m175714e()) {
            str2 = this.f155512e + "/" + this.f155513f;
        } else {
            str2 = "NA/NA";
        }
        return str + "/" + str2;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m175714e() {
        return (this.f155512e == -1 || this.f155513f == -1) ? false : true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qny0.class == obj.getClass()) {
            qny0 qny0Var = (qny0) obj;
            if (this.f155508a == qny0Var.f155508a && this.f155509b == qny0Var.f155509b && this.f155510c == qny0Var.f155510c && Arrays.equals(this.f155511d, qny0Var.f155511d) && this.f155512e == qny0Var.f155512e && this.f155513f == qny0Var.f155513f) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m175715f() {
        return (this.f155508a == -1 || this.f155509b == -1 || this.f155510c == -1) ? false : true;
    }

    public final int hashCode() {
        int i = this.f155514g;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((this.f155508a + 527) * 31) + this.f155509b) * 31) + this.f155510c) * 31) + Arrays.hashCode(this.f155511d)) * 31) + this.f155512e) * 31) + this.f155513f;
        this.f155514g = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str;
        int i = this.f155512e;
        String str2 = "NA";
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        int i2 = this.f155513f;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        byte[] bArr = this.f155511d;
        int i3 = this.f155510c;
        int i4 = this.f155509b;
        int i5 = this.f155508a;
        return "ColorInfo(" + m175710h(i5) + ", " + m175709g(i4) + ", " + m175711i(i3) + ", " + (bArr != null) + ", " + str + ", " + str2 + ")";
    }
}
