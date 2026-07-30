package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.InterfaceC1863e;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class de5 implements InterfaceC1863e {

    /* JADX INFO: renamed from: f */
    public static final de5 f85701f = new de5(1, 2, 3, null);

    /* JADX INFO: renamed from: g */
    public static final de5 f85702g = new C16341b().m111106c(1).m111105b(1).m111107d(2).m111104a();

    /* JADX INFO: renamed from: h */
    public static final String f85703h = vck0.m197903z0(0);

    /* JADX INFO: renamed from: i */
    public static final String f85704i = vck0.m197903z0(1);

    /* JADX INFO: renamed from: j */
    public static final String f85705j = vck0.m197903z0(2);

    /* JADX INFO: renamed from: k */
    public static final String f85706k = vck0.m197903z0(3);

    /* JADX INFO: renamed from: l */
    public static final InterfaceC1863e.a<de5> f85707l = new InterfaceC1863e.a() { // from class: l.ce5
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return de5.m111094a(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f85708a;

    /* JADX INFO: renamed from: b */
    public final int f85709b;

    /* JADX INFO: renamed from: c */
    public final int f85710c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final byte[] f85711d;

    /* JADX INFO: renamed from: e */
    public int f85712e;

    @Deprecated
    public de5(int i, int i2, int i3, @Nullable byte[] bArr) {
        this.f85708a = i;
        this.f85709b = i2;
        this.f85710c = i3;
        this.f85711d = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ de5 m111094a(Bundle bundle) {
        return new de5(bundle.getInt(f85703h, -1), bundle.getInt(f85704i, -1), bundle.getInt(f85705j, -1), bundle.getByteArray(f85706k));
    }

    /* JADX INFO: renamed from: c */
    public static String m111095c(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? "Undefined color range" : "Limited range";
        }
        return "Full range";
    }

    /* JADX INFO: renamed from: d */
    public static String m111096d(int i) {
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

    /* JADX INFO: renamed from: e */
    public static String m111097e(int i) {
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

    /* JADX INFO: renamed from: f */
    public static boolean m111098f(@Nullable de5 de5Var) {
        if (de5Var == null) {
            return false;
        }
        int i = de5Var.f85710c;
        return i == 7 || i == 6;
    }

    @Pure
    /* JADX INFO: renamed from: h */
    public static int m111099h(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    /* JADX INFO: renamed from: i */
    public static int m111100i(int i) {
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

    /* JADX INFO: renamed from: b */
    public C16341b m111101b() {
        return new C16341b();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && de5.class == obj.getClass()) {
            de5 de5Var = (de5) obj;
            if (this.f85708a == de5Var.f85708a && this.f85709b == de5Var.f85709b && this.f85710c == de5Var.f85710c && Arrays.equals(this.f85711d, de5Var.f85711d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m111102g() {
        return (this.f85708a == -1 || this.f85709b == -1 || this.f85710c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f85712e == 0) {
            this.f85712e = ((((((527 + this.f85708a) * 31) + this.f85709b) * 31) + this.f85710c) * 31) + Arrays.hashCode(this.f85711d);
        }
        return this.f85712e;
    }

    /* JADX INFO: renamed from: j */
    public String m111103j() {
        return !m111102g() ? "NA" : vck0.m197793D("%s/%s/%s", m111096d(this.f85708a), m111095c(this.f85709b), m111097e(this.f85710c));
    }

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f85703h, this.f85708a);
        bundle.putInt(f85704i, this.f85709b);
        bundle.putInt(f85705j, this.f85710c);
        bundle.putByteArray(f85706k, this.f85711d);
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(m111096d(this.f85708a));
        sb.append(", ");
        sb.append(m111095c(this.f85709b));
        sb.append(", ");
        sb.append(m111097e(this.f85710c));
        sb.append(", ");
        sb.append(this.f85711d != null);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: l.de5$b */
    public static final class C16341b {

        /* JADX INFO: renamed from: a */
        public int f85713a;

        /* JADX INFO: renamed from: b */
        public int f85714b;

        /* JADX INFO: renamed from: c */
        public int f85715c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public byte[] f85716d;

        public C16341b(de5 de5Var) {
            this.f85713a = de5Var.f85708a;
            this.f85714b = de5Var.f85709b;
            this.f85715c = de5Var.f85710c;
            this.f85716d = de5Var.f85711d;
        }

        /* JADX INFO: renamed from: a */
        public de5 m111104a() {
            return new de5(this.f85713a, this.f85714b, this.f85715c, this.f85716d);
        }

        /* JADX INFO: renamed from: b */
        public C16341b m111105b(int i) {
            this.f85714b = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C16341b m111106c(int i) {
            this.f85713a = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C16341b m111107d(int i) {
            this.f85715c = i;
            return this;
        }

        public C16341b() {
            this.f85713a = -1;
            this.f85714b = -1;
            this.f85715c = -1;
        }
    }
}
