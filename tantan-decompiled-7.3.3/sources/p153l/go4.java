package p153l;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.asm.Opcodes;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class go4 extends ko4 {

    /* JADX INFO: renamed from: h */
    public final int f105214h;

    /* JADX INFO: renamed from: i */
    public final int f105215i;

    /* JADX INFO: renamed from: j */
    public final int f105216j;

    /* JADX INFO: renamed from: k */
    public final long f105217k;

    /* JADX INFO: renamed from: n */
    @Nullable
    public List<myb> f105220n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public List<myb> f105221o;

    /* JADX INFO: renamed from: p */
    public int f105222p;

    /* JADX INFO: renamed from: q */
    public int f105223q;

    /* JADX INFO: renamed from: r */
    public boolean f105224r;

    /* JADX INFO: renamed from: s */
    public boolean f105225s;

    /* JADX INFO: renamed from: t */
    public byte f105226t;

    /* JADX INFO: renamed from: u */
    public byte f105227u;

    /* JADX INFO: renamed from: w */
    public boolean f105229w;

    /* JADX INFO: renamed from: x */
    public long f105230x;

    /* JADX INFO: renamed from: y */
    public static final int[] f105211y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: z */
    public static final int[] f105212z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: A */
    public static final int[] f105205A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: B */
    public static final int[] f105206B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: C */
    public static final int[] f105207C = {CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 176, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 251};

    /* JADX INFO: renamed from: D */
    public static final int[] f105208D = {193, 201, Primes.SMALL_FACTOR_LIMIT, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, Opcodes.IFNONNULL, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 187};

    /* JADX INFO: renamed from: E */
    public static final int[] f105209E = {CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 228, 214, 246, 223, 165, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, 9474, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: F */
    public static final boolean[] f105210F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: g */
    public final ig60 f105213g = new ig60();

    /* JADX INFO: renamed from: l */
    public final ArrayList<C17266a> f105218l = new ArrayList<>();

    /* JADX INFO: renamed from: m */
    public C17266a f105219m = new C17266a(0, 4);

    /* JADX INFO: renamed from: v */
    public int f105228v = 0;

    /* JADX INFO: renamed from: l.go4$a */
    public static final class C17266a {

        /* JADX INFO: renamed from: a */
        public final List<a> f105231a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final List<SpannableString> f105232b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final StringBuilder f105233c = new StringBuilder();

        /* JADX INFO: renamed from: d */
        public int f105234d;

        /* JADX INFO: renamed from: e */
        public int f105235e;

        /* JADX INFO: renamed from: f */
        public int f105236f;

        /* JADX INFO: renamed from: g */
        public int f105237g;

        /* JADX INFO: renamed from: h */
        public int f105238h;

        /* JADX INFO: renamed from: l.go4$a$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public final int f105239a;

            /* JADX INFO: renamed from: b */
            public final boolean f105240b;

            /* JADX INFO: renamed from: c */
            public int f105241c;

            public a(int i, boolean z, int i2) {
                this.f105239a = i;
                this.f105240b = z;
                this.f105241c = i2;
            }
        }

        public C17266a(int i, int i2) {
            m131079j(i);
            this.f105238h = i2;
        }

        /* JADX INFO: renamed from: n */
        public static void m131071n(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }

        /* JADX INFO: renamed from: o */
        public static void m131072o(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        /* JADX INFO: renamed from: q */
        public static void m131073q(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        /* JADX INFO: renamed from: e */
        public void m131074e(char c) {
            if (this.f105233c.length() < 32) {
                this.f105233c.append(c);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m131075f() {
            int length = this.f105233c.length();
            if (length > 0) {
                this.f105233c.delete(length - 1, length);
                for (int size = this.f105231a.size() - 1; size >= 0; size--) {
                    a aVar = this.f105231a.get(size);
                    int i = aVar.f105241c;
                    if (i != length) {
                        return;
                    }
                    aVar.f105241c = i - 1;
                }
            }
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public myb m131076g(int i) {
            float f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < this.f105232b.size(); i2++) {
                spannableStringBuilder.append((CharSequence) this.f105232b.get(i2));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) m131077h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i3 = this.f105235e + this.f105236f;
            int length = (32 - i3) - spannableStringBuilder.length();
            int i4 = i3 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.f105237g != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.f105237g != 2 || i4 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i3 = 32 - length;
                }
                f = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i5 = this.f105234d;
            if (i5 > 7) {
                i5 -= 17;
            } else if (this.f105237g == 1) {
                i5 -= this.f105238h - 1;
            }
            return new myb.C18746b().m160768o(spannableStringBuilder).m160769p(Layout.Alignment.ALIGN_NORMAL).m160761h(i5, 1).m160764k(f).m160765l(i).m160754a();
        }

        /* JADX INFO: renamed from: h */
        public final SpannableString m131077h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f105233c);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 < this.f105231a.size()) {
                a aVar = this.f105231a.get(i5);
                boolean z2 = aVar.f105240b;
                int i7 = aVar.f105239a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i4 = go4.f105205A[i7];
                    }
                    z = z3;
                }
                int i8 = aVar.f105241c;
                i5++;
                if (i8 != (i5 < this.f105231a.size() ? this.f105231a.get(i5).f105241c : length)) {
                    if (i != -1 && !z2) {
                        m131073q(spannableStringBuilder, i, i8);
                        i = -1;
                    } else if (i == -1 && z2) {
                        i = i8;
                    }
                    if (i2 != -1 && !z) {
                        m131072o(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z) {
                        i2 = i8;
                    }
                    if (i4 != i3) {
                        m131071n(spannableStringBuilder, i6, i8, i3);
                        i3 = i4;
                        i6 = i8;
                    }
                }
            }
            if (i != -1 && i != length) {
                m131073q(spannableStringBuilder, i, length);
            }
            if (i2 != -1 && i2 != length) {
                m131072o(spannableStringBuilder, i2, length);
            }
            if (i6 != length) {
                m131071n(spannableStringBuilder, i6, length, i3);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* JADX INFO: renamed from: i */
        public boolean m131078i() {
            return this.f105231a.isEmpty() && this.f105232b.isEmpty() && this.f105233c.length() == 0;
        }

        /* JADX INFO: renamed from: j */
        public void m131079j(int i) {
            this.f105237g = i;
            this.f105231a.clear();
            this.f105232b.clear();
            this.f105233c.setLength(0);
            this.f105234d = 15;
            this.f105235e = 0;
            this.f105236f = 0;
        }

        /* JADX INFO: renamed from: k */
        public void m131080k() {
            this.f105232b.add(m131077h());
            this.f105233c.setLength(0);
            this.f105231a.clear();
            int iMin = Math.min(this.f105238h, this.f105234d);
            while (this.f105232b.size() >= iMin) {
                this.f105232b.remove(0);
            }
        }

        /* JADX INFO: renamed from: l */
        public void m131081l(int i) {
            this.f105237g = i;
        }

        /* JADX INFO: renamed from: m */
        public void m131082m(int i) {
            this.f105238h = i;
        }

        /* JADX INFO: renamed from: p */
        public void m131083p(int i, boolean z) {
            this.f105231a.add(new a(i, z, this.f105233c.length()));
        }
    }

    public go4(String str, int i, long j) {
        this.f105217k = j > 0 ? j * 1000 : -9223372036854775807L;
        this.f105214h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f105216j = 0;
            this.f105215i = 0;
        } else if (i == 2) {
            this.f105216j = 1;
            this.f105215i = 0;
        } else if (i == 3) {
            this.f105216j = 0;
            this.f105215i = 1;
        } else if (i != 4) {
            kyv.m152151i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f105216j = 0;
            this.f105215i = 0;
        } else {
            this.f105216j = 1;
            this.f105215i = 1;
        }
        m131051M(0);
        m131050L();
        this.f105229w = true;
        this.f105230x = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: A */
    public static boolean m131031A(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m131032B(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m131033C(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m131034D(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m131035E(byte b) {
        return (b & 240) == 16;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m131036G(byte b) {
        return (b & 246) == 20;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m131037H(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m131038I(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m131039J(byte b) {
        return 1 <= b && b <= 15;
    }

    /* JADX INFO: renamed from: p */
    public static char m131041p(byte b) {
        return (char) f105206B[(b & 127) - 32];
    }

    /* JADX INFO: renamed from: q */
    public static int m131042q(byte b) {
        return (b >> 3) & 1;
    }

    /* JADX INFO: renamed from: s */
    public static char m131043s(byte b) {
        return (char) f105208D[b & 31];
    }

    /* JADX INFO: renamed from: t */
    public static char m131044t(byte b) {
        return (char) f105209E[b & 31];
    }

    /* JADX INFO: renamed from: u */
    public static char m131045u(byte b, byte b2) {
        return (b & 1) == 0 ? m131043s(b2) : m131044t(b2);
    }

    /* JADX INFO: renamed from: v */
    public static char m131046v(byte b) {
        return (char) f105207C[b & 15];
    }

    /* JADX INFO: renamed from: z */
    public static boolean m131047z(byte b) {
        return (b & 224) == 0;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m131048F(boolean z, byte b, byte b2) {
        if (!z || !m131035E(b)) {
            this.f105225s = false;
        } else {
            if (this.f105225s && this.f105226t == b && this.f105227u == b2) {
                this.f105225s = false;
                return true;
            }
            this.f105225s = true;
            this.f105226t = b;
            this.f105227u = b2;
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final void m131049K(byte b, byte b2) {
        if (m131039J(b)) {
            this.f105229w = false;
            return;
        }
        if (m131036G(b)) {
            if (b2 != 32 && b2 != 47) {
                switch (b2) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b2) {
                            case 42:
                            case 43:
                                this.f105229w = false;
                                break;
                        }
                        return;
                }
            }
            this.f105229w = true;
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m131050L() {
        this.f105219m.m131079j(this.f105222p);
        this.f105218l.clear();
        this.f105218l.add(this.f105219m);
    }

    /* JADX INFO: renamed from: M */
    public final void m131051M(int i) {
        int i2 = this.f105222p;
        if (i2 == i) {
            return;
        }
        this.f105222p = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.f105218l.size(); i3++) {
                this.f105218l.get(i3).m131081l(i);
            }
            return;
        }
        m131050L();
        if (i2 == 3 || i == 1 || i == 0) {
            this.f105220n = Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m131052N(int i) {
        this.f105223q = i;
        this.f105219m.m131082m(i);
    }

    /* JADX INFO: renamed from: O */
    public final boolean m131053O() {
        return (this.f105217k == -9223372036854775807L || this.f105230x == -9223372036854775807L || m150579j() - this.f105230x < this.f105217k) ? false : true;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m131054P(byte b) {
        if (m131047z(b)) {
            this.f105228v = m131042q(b);
        }
        return this.f105228v == this.f105216j;
    }

    @Override // p153l.ko4, p153l.odg0
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo131055b(long j) {
        super.mo131055b(j);
    }

    @Override // p153l.ko4
    /* JADX INFO: renamed from: e */
    public mdg0 mo131057e() {
        List<myb> list = this.f105220n;
        this.f105221o = list;
        return new lo4((List) w11.m204369e(list));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // p153l.ko4
    /* JADX INFO: renamed from: f */
    public void mo131058f(rdg0 rdg0Var) {
        boolean z;
        ByteBuffer byteBuffer = (ByteBuffer) w11.m204369e(rdg0Var.f7412c);
        this.f105213g.m139806S(byteBuffer.array(), byteBuffer.limit());
        boolean z2 = false;
        while (true) {
            int iM139811a = this.f105213g.m139811a();
            int i = this.f105214h;
            if (iM139811a < i) {
                break;
            }
            int iM139795H = i == 2 ? -4 : this.f105213g.m139795H();
            int iM139795H2 = this.f105213g.m139795H();
            int iM139795H3 = this.f105213g.m139795H();
            if ((iM139795H & 2) == 0 && (iM139795H & 1) == this.f105215i) {
                byte b = (byte) (iM139795H2 & 127);
                byte b2 = (byte) (iM139795H3 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z3 = this.f105224r;
                    if ((iM139795H & 4) == 4) {
                        boolean[] zArr = f105210F;
                        if (zArr[iM139795H2] && zArr[iM139795H3]) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    this.f105224r = z;
                    if (!m131048F(z, b, b2)) {
                        if (this.f105224r) {
                            m131049K(b, b2);
                            if (this.f105229w && m131054P(b)) {
                                if (!m131047z(b)) {
                                    this.f105219m.m131074e(m131041p(b));
                                    if ((b2 & 224) != 0) {
                                        this.f105219m.m131074e(m131041p(b2));
                                    }
                                } else if (m131037H(b, b2)) {
                                    this.f105219m.m131074e(m131046v(b2));
                                } else if (m131031A(b, b2)) {
                                    this.f105219m.m131075f();
                                    this.f105219m.m131074e(m131045u(b, b2));
                                } else if (m131032B(b, b2)) {
                                    m131064w(b2);
                                } else if (m131034D(b, b2)) {
                                    m131066y(b, b2);
                                } else if (m131038I(b, b2)) {
                                    this.f105219m.f105236f = b2 - 32;
                                } else if (m131033C(b, b2)) {
                                    m131065x(b2);
                                }
                                z2 = true;
                            }
                        } else if (z3) {
                            m131050L();
                            z2 = true;
                        }
                    }
                }
            }
        }
        if (z2) {
            int i2 = this.f105222p;
            if (i2 == 1 || i2 == 3) {
                this.f105220n = m131063r();
                this.f105230x = m150579j();
            }
        }
    }

    @Override // p153l.ko4, p153l.hid
    public void flush() {
        super.flush();
        this.f105220n = null;
        this.f105221o = null;
        m131051M(0);
        m131052N(4);
        m131050L();
        this.f105224r = false;
        this.f105225s = false;
        this.f105226t = (byte) 0;
        this.f105227u = (byte) 0;
        this.f105228v = 0;
        this.f105229w = true;
        this.f105230x = -9223372036854775807L;
    }

    @Override // p153l.ko4
    @Nullable
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ rdg0 mo135120a() throws SubtitleDecoderException {
        return super.mo135120a();
    }

    @Override // p153l.ko4, p153l.hid
    @Nullable
    /* JADX INFO: renamed from: h */
    public sdg0 mo131056c() throws SubtitleDecoderException {
        sdg0 sdg0VarM150578i;
        sdg0 sdg0VarMo131056c = super.mo131056c();
        if (sdg0VarMo131056c != null) {
            return sdg0VarMo131056c;
        }
        if (!m131053O() || (sdg0VarM150578i = m150578i()) == null) {
            return null;
        }
        this.f105220n = Collections.EMPTY_LIST;
        this.f105230x = -9223372036854775807L;
        sdg0VarM150578i.m185463v(m150579j(), mo131057e(), Long.MAX_VALUE);
        return sdg0VarM150578i;
    }

    @Override // p153l.ko4
    /* JADX INFO: renamed from: k */
    public boolean mo131061k() {
        return this.f105220n != this.f105221o;
    }

    @Override // p153l.ko4
    /* JADX INFO: renamed from: l */
    public /* bridge */ /* synthetic */ void mo135121d(rdg0 rdg0Var) throws SubtitleDecoderException {
        super.mo135121d(rdg0Var);
    }

    /* JADX INFO: renamed from: r */
    public final List<myb> m131063r() {
        int size = this.f105218l.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            myb mybVarM131076g = this.f105218l.get(i).m131076g(Integer.MIN_VALUE);
            arrayList.add(mybVarM131076g);
            if (mybVarM131076g != null) {
                iMin = Math.min(iMin, mybVarM131076g.f139375i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            myb mybVar = (myb) arrayList.get(i2);
            if (mybVar != null) {
                if (mybVar.f139375i != iMin) {
                    mybVar = (myb) w11.m204369e(this.f105218l.get(i2).m131076g(iMin));
                }
                arrayList2.add(mybVar);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: w */
    public final void m131064w(byte b) {
        this.f105219m.m131074e(' ');
        this.f105219m.m131083p((b >> 1) & 7, (b & 1) == 1);
    }

    /* JADX INFO: renamed from: x */
    public final void m131065x(byte b) {
        if (b == 32) {
            m131051M(2);
            return;
        }
        if (b == 41) {
            m131051M(3);
            return;
        }
        switch (b) {
            case 37:
                m131051M(1);
                m131052N(2);
                break;
            case 38:
                m131051M(1);
                m131052N(3);
                break;
            case 39:
                m131051M(1);
                m131052N(4);
                break;
            default:
                int i = this.f105222p;
                if (i != 0) {
                    if (b != 33) {
                        switch (b) {
                            case 44:
                                this.f105220n = Collections.EMPTY_LIST;
                                if (i == 1 || i == 3) {
                                    m131050L();
                                }
                                break;
                            case 45:
                                if (i == 1 && !this.f105219m.m131078i()) {
                                    this.f105219m.m131080k();
                                    break;
                                }
                                break;
                            case 46:
                                m131050L();
                                break;
                            case 47:
                                this.f105220n = m131063r();
                                m131050L();
                                break;
                        }
                    } else {
                        this.f105219m.m131075f();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m131066y(byte b, byte b2) {
        int i = f105211y[b & 7];
        if ((b2 & HttpTokens.SPACE) != 0) {
            i++;
        }
        if (i != this.f105219m.f105234d) {
            if (this.f105222p != 1 && !this.f105219m.m131078i()) {
                C17266a c17266a = new C17266a(this.f105222p, this.f105223q);
                this.f105219m = c17266a;
                this.f105218l.add(c17266a);
            }
            this.f105219m.f105234d = i;
        }
        boolean z = (b2 & Tnaf.POW_2_WIDTH) == 16;
        boolean z2 = (b2 & 1) == 1;
        int i2 = (b2 >> 1) & 7;
        this.f105219m.m131083p(z ? 8 : i2, z2);
        if (z) {
            this.f105219m.f105235e = f105212z[i2];
        }
    }

    @Override // p153l.ko4, p153l.hid
    public void release() {
    }
}
