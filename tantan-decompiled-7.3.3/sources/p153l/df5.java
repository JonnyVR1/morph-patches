package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.InterfaceC1886e;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class df5 implements InterfaceC1886e {

    /* JADX INFO: renamed from: f */
    public static final df5 f88116f = new df5(1, 2, 3, null);

    /* JADX INFO: renamed from: g */
    public static final df5 f88117g = new C16515b().m115503c(1).m115502b(1).m115504d(2).m115501a();

    /* JADX INFO: renamed from: h */
    public static final String f88118h = bmk0.m105181z0(0);

    /* JADX INFO: renamed from: i */
    public static final String f88119i = bmk0.m105181z0(1);

    /* JADX INFO: renamed from: j */
    public static final String f88120j = bmk0.m105181z0(2);

    /* JADX INFO: renamed from: k */
    public static final String f88121k = bmk0.m105181z0(3);

    /* JADX INFO: renamed from: l */
    public static final InterfaceC1886e.a<df5> f88122l = new InterfaceC1886e.a() { // from class: l.cf5
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return df5.m115491a(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f88123a;

    /* JADX INFO: renamed from: b */
    public final int f88124b;

    /* JADX INFO: renamed from: c */
    public final int f88125c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final byte[] f88126d;

    /* JADX INFO: renamed from: e */
    public int f88127e;

    @Deprecated
    public df5(int i, int i2, int i3, @Nullable byte[] bArr) {
        this.f88123a = i;
        this.f88124b = i2;
        this.f88125c = i3;
        this.f88126d = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ df5 m115491a(Bundle bundle) {
        return new df5(bundle.getInt(f88118h, -1), bundle.getInt(f88119i, -1), bundle.getInt(f88120j, -1), bundle.getByteArray(f88121k));
    }

    /* JADX INFO: renamed from: c */
    public static String m115492c(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? "Undefined color range" : "Limited range";
        }
        return "Full range";
    }

    /* JADX INFO: renamed from: d */
    public static String m115493d(int i) {
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
    public static String m115494e(int i) {
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
    public static boolean m115495f(@Nullable df5 df5Var) {
        if (df5Var == null) {
            return false;
        }
        int i = df5Var.f88125c;
        return i == 7 || i == 6;
    }

    @Pure
    /* JADX INFO: renamed from: h */
    public static int m115496h(int i) {
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
    public static int m115497i(int i) {
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
    public C16515b m115498b() {
        return new C16515b();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && df5.class == obj.getClass()) {
            df5 df5Var = (df5) obj;
            if (this.f88123a == df5Var.f88123a && this.f88124b == df5Var.f88124b && this.f88125c == df5Var.f88125c && Arrays.equals(this.f88126d, df5Var.f88126d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m115499g() {
        return (this.f88123a == -1 || this.f88124b == -1 || this.f88125c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f88127e == 0) {
            this.f88127e = ((((((527 + this.f88123a) * 31) + this.f88124b) * 31) + this.f88125c) * 31) + Arrays.hashCode(this.f88126d);
        }
        return this.f88127e;
    }

    /* JADX INFO: renamed from: j */
    public String m115500j() {
        return !m115499g() ? "NA" : bmk0.m105071D("%s/%s/%s", m115493d(this.f88123a), m115492c(this.f88124b), m115494e(this.f88125c));
    }

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f88118h, this.f88123a);
        bundle.putInt(f88119i, this.f88124b);
        bundle.putInt(f88120j, this.f88125c);
        bundle.putByteArray(f88121k, this.f88126d);
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(m115493d(this.f88123a));
        sb.append(", ");
        sb.append(m115492c(this.f88124b));
        sb.append(", ");
        sb.append(m115494e(this.f88125c));
        sb.append(", ");
        sb.append(this.f88126d != null);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: l.df5$b */
    public static final class C16515b {

        /* JADX INFO: renamed from: a */
        public int f88128a;

        /* JADX INFO: renamed from: b */
        public int f88129b;

        /* JADX INFO: renamed from: c */
        public int f88130c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public byte[] f88131d;

        public C16515b(df5 df5Var) {
            this.f88128a = df5Var.f88123a;
            this.f88129b = df5Var.f88124b;
            this.f88130c = df5Var.f88125c;
            this.f88131d = df5Var.f88126d;
        }

        /* JADX INFO: renamed from: a */
        public df5 m115501a() {
            return new df5(this.f88128a, this.f88129b, this.f88130c, this.f88131d);
        }

        /* JADX INFO: renamed from: b */
        public C16515b m115502b(int i) {
            this.f88129b = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C16515b m115503c(int i) {
            this.f88128a = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C16515b m115504d(int i) {
            this.f88130c = i;
            return this;
        }

        public C16515b() {
            this.f88128a = -1;
            this.f88129b = -1;
            this.f88130c = -1;
        }
    }
}
