package p149l;

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
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class hn4 extends ln4 {

    /* JADX INFO: renamed from: h */
    public final int f108554h;

    /* JADX INFO: renamed from: i */
    public final int f108555i;

    /* JADX INFO: renamed from: j */
    public final int f108556j;

    /* JADX INFO: renamed from: k */
    public final long f108557k;

    /* JADX INFO: renamed from: n */
    @Nullable
    public List<ywb> f108560n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public List<ywb> f108561o;

    /* JADX INFO: renamed from: p */
    public int f108562p;

    /* JADX INFO: renamed from: q */
    public int f108563q;

    /* JADX INFO: renamed from: r */
    public boolean f108564r;

    /* JADX INFO: renamed from: s */
    public boolean f108565s;

    /* JADX INFO: renamed from: t */
    public byte f108566t;

    /* JADX INFO: renamed from: u */
    public byte f108567u;

    /* JADX INFO: renamed from: w */
    public boolean f108569w;

    /* JADX INFO: renamed from: x */
    public long f108570x;

    /* JADX INFO: renamed from: y */
    public static final int[] f108551y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: z */
    public static final int[] f108552z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: A */
    public static final int[] f108545A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: B */
    public static final int[] f108546B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: C */
    public static final int[] f108547C = {CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 176, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 251};

    /* JADX INFO: renamed from: D */
    public static final int[] f108548D = {193, 201, Primes.SMALL_FACTOR_LIMIT, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, Opcodes.IFNONNULL, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 187};

    /* JADX INFO: renamed from: E */
    public static final int[] f108549E = {CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 228, 214, 246, 223, 165, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, 9474, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: F */
    public static final boolean[] f108550F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: g */
    public final d860 f108553g = new d860();

    /* JADX INFO: renamed from: l */
    public final ArrayList<C17345a> f108558l = new ArrayList<>();

    /* JADX INFO: renamed from: m */
    public C17345a f108559m = new C17345a(0, 4);

    /* JADX INFO: renamed from: v */
    public int f108568v = 0;

    /* JADX INFO: renamed from: l.hn4$a */
    public static final class C17345a {

        /* JADX INFO: renamed from: a */
        public final List<a> f108571a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final List<SpannableString> f108572b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final StringBuilder f108573c = new StringBuilder();

        /* JADX INFO: renamed from: d */
        public int f108574d;

        /* JADX INFO: renamed from: e */
        public int f108575e;

        /* JADX INFO: renamed from: f */
        public int f108576f;

        /* JADX INFO: renamed from: g */
        public int f108577g;

        /* JADX INFO: renamed from: h */
        public int f108578h;

        /* JADX INFO: renamed from: l.hn4$a$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public final int f108579a;

            /* JADX INFO: renamed from: b */
            public final boolean f108580b;

            /* JADX INFO: renamed from: c */
            public int f108581c;

            public a(int i, boolean z, int i2) {
                this.f108579a = i;
                this.f108580b = z;
                this.f108581c = i2;
            }
        }

        public C17345a(int i, int i2) {
            m131873j(i);
            this.f108578h = i2;
        }

        /* JADX INFO: renamed from: n */
        public static void m131865n(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }

        /* JADX INFO: renamed from: o */
        public static void m131866o(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        /* JADX INFO: renamed from: q */
        public static void m131867q(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        /* JADX INFO: renamed from: e */
        public void m131868e(char c) {
            if (this.f108573c.length() < 32) {
                this.f108573c.append(c);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m131869f() {
            int length = this.f108573c.length();
            if (length > 0) {
                this.f108573c.delete(length - 1, length);
                for (int size = this.f108571a.size() - 1; size >= 0; size--) {
                    a aVar = this.f108571a.get(size);
                    int i = aVar.f108581c;
                    if (i != length) {
                        return;
                    }
                    aVar.f108581c = i - 1;
                }
            }
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public ywb m131870g(int i) {
            float f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < this.f108572b.size(); i2++) {
                spannableStringBuilder.append((CharSequence) this.f108572b.get(i2));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) m131871h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i3 = this.f108575e + this.f108576f;
            int length = (32 - i3) - spannableStringBuilder.length();
            int i4 = i3 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.f108577g != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.f108577g != 2 || i4 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i3 = 32 - length;
                }
                f = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i5 = this.f108574d;
            if (i5 > 7) {
                i5 -= 17;
            } else if (this.f108577g == 1) {
                i5 -= this.f108578h - 1;
            }
            return new ywb.C21557b().m216325o(spannableStringBuilder).m216326p(Layout.Alignment.ALIGN_NORMAL).m216318h(i5, 1).m216321k(f).m216322l(i).m216311a();
        }

        /* JADX INFO: renamed from: h */
        public final SpannableString m131871h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f108573c);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 < this.f108571a.size()) {
                a aVar = this.f108571a.get(i5);
                boolean z2 = aVar.f108580b;
                int i7 = aVar.f108579a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i4 = hn4.f108545A[i7];
                    }
                    z = z3;
                }
                int i8 = aVar.f108581c;
                i5++;
                if (i8 != (i5 < this.f108571a.size() ? this.f108571a.get(i5).f108581c : length)) {
                    if (i != -1 && !z2) {
                        m131867q(spannableStringBuilder, i, i8);
                        i = -1;
                    } else if (i == -1 && z2) {
                        i = i8;
                    }
                    if (i2 != -1 && !z) {
                        m131866o(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z) {
                        i2 = i8;
                    }
                    if (i4 != i3) {
                        m131865n(spannableStringBuilder, i6, i8, i3);
                        i3 = i4;
                        i6 = i8;
                    }
                }
            }
            if (i != -1 && i != length) {
                m131867q(spannableStringBuilder, i, length);
            }
            if (i2 != -1 && i2 != length) {
                m131866o(spannableStringBuilder, i2, length);
            }
            if (i6 != length) {
                m131865n(spannableStringBuilder, i6, length, i3);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* JADX INFO: renamed from: i */
        public boolean m131872i() {
            return this.f108571a.isEmpty() && this.f108572b.isEmpty() && this.f108573c.length() == 0;
        }

        /* JADX INFO: renamed from: j */
        public void m131873j(int i) {
            this.f108577g = i;
            this.f108571a.clear();
            this.f108572b.clear();
            this.f108573c.setLength(0);
            this.f108574d = 15;
            this.f108575e = 0;
            this.f108576f = 0;
        }

        /* JADX INFO: renamed from: k */
        public void m131874k() {
            this.f108572b.add(m131871h());
            this.f108573c.setLength(0);
            this.f108571a.clear();
            int iMin = Math.min(this.f108578h, this.f108574d);
            while (this.f108572b.size() >= iMin) {
                this.f108572b.remove(0);
            }
        }

        /* JADX INFO: renamed from: l */
        public void m131875l(int i) {
            this.f108577g = i;
        }

        /* JADX INFO: renamed from: m */
        public void m131876m(int i) {
            this.f108578h = i;
        }

        /* JADX INFO: renamed from: p */
        public void m131877p(int i, boolean z) {
            this.f108571a.add(new a(i, z, this.f108573c.length()));
        }
    }

    public hn4(String str, int i, long j) {
        this.f108557k = j > 0 ? j * 1000 : -9223372036854775807L;
        this.f108554h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f108556j = 0;
            this.f108555i = 0;
        } else if (i == 2) {
            this.f108556j = 1;
            this.f108555i = 0;
        } else if (i == 3) {
            this.f108556j = 0;
            this.f108555i = 1;
        } else if (i != 4) {
            jwv.m143689i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f108556j = 0;
            this.f108555i = 0;
        } else {
            this.f108556j = 1;
            this.f108555i = 1;
        }
        m131847M(0);
        m131846L();
        this.f108569w = true;
        this.f108570x = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: A */
    public static boolean m131827A(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m131828B(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m131829C(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m131830D(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m131831E(byte b) {
        return (b & 240) == 16;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m131832G(byte b) {
        return (b & 246) == 20;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m131833H(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m131834I(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m131835J(byte b) {
        return 1 <= b && b <= 15;
    }

    /* JADX INFO: renamed from: p */
    public static char m131837p(byte b) {
        return (char) f108546B[(b & 127) - 32];
    }

    /* JADX INFO: renamed from: q */
    public static int m131838q(byte b) {
        return (b >> 3) & 1;
    }

    /* JADX INFO: renamed from: s */
    public static char m131839s(byte b) {
        return (char) f108548D[b & 31];
    }

    /* JADX INFO: renamed from: t */
    public static char m131840t(byte b) {
        return (char) f108549E[b & 31];
    }

    /* JADX INFO: renamed from: u */
    public static char m131841u(byte b, byte b2) {
        return (b & 1) == 0 ? m131839s(b2) : m131840t(b2);
    }

    /* JADX INFO: renamed from: v */
    public static char m131842v(byte b) {
        return (char) f108547C[b & 15];
    }

    /* JADX INFO: renamed from: z */
    public static boolean m131843z(byte b) {
        return (b & 224) == 0;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m131844F(boolean z, byte b, byte b2) {
        if (!z || !m131831E(b)) {
            this.f108565s = false;
        } else {
            if (this.f108565s && this.f108566t == b && this.f108567u == b2) {
                this.f108565s = false;
                return true;
            }
            this.f108565s = true;
            this.f108566t = b;
            this.f108567u = b2;
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final void m131845K(byte b, byte b2) {
        if (m131835J(b)) {
            this.f108569w = false;
            return;
        }
        if (m131832G(b)) {
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
                                this.f108569w = false;
                                break;
                        }
                        return;
                }
            }
            this.f108569w = true;
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m131846L() {
        this.f108559m.m131873j(this.f108562p);
        this.f108558l.clear();
        this.f108558l.add(this.f108559m);
    }

    /* JADX INFO: renamed from: M */
    public final void m131847M(int i) {
        int i2 = this.f108562p;
        if (i2 == i) {
            return;
        }
        this.f108562p = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.f108558l.size(); i3++) {
                this.f108558l.get(i3).m131875l(i);
            }
            return;
        }
        m131846L();
        if (i2 == 3 || i == 1 || i == 0) {
            this.f108560n = Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m131848N(int i) {
        this.f108563q = i;
        this.f108559m.m131876m(i);
    }

    /* JADX INFO: renamed from: O */
    public final boolean m131849O() {
        return (this.f108557k == -9223372036854775807L || this.f108570x == -9223372036854775807L || m150648j() - this.f108570x < this.f108557k) ? false : true;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m131850P(byte b) {
        if (m131843z(b)) {
            this.f108568v = m131838q(b);
        }
        return this.f108568v == this.f108556j;
    }

    @Override // p149l.ln4, p149l.g5g0
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo124526b(long j) {
        super.mo124526b(j);
    }

    @Override // p149l.ln4
    /* JADX INFO: renamed from: e */
    public e5g0 mo131851e() {
        List<ywb> list = this.f108560n;
        this.f108561o = list;
        return new mn4((List) p11.m167011e(list));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // p149l.ln4
    /* JADX INFO: renamed from: f */
    public void mo131852f(j5g0 j5g0Var) {
        boolean z;
        ByteBuffer byteBuffer = (ByteBuffer) p11.m167011e(j5g0Var.f7375c);
        this.f108553g.m110290S(byteBuffer.array(), byteBuffer.limit());
        boolean z2 = false;
        while (true) {
            int iM110295a = this.f108553g.m110295a();
            int i = this.f108554h;
            if (iM110295a < i) {
                break;
            }
            int iM110279H = i == 2 ? -4 : this.f108553g.m110279H();
            int iM110279H2 = this.f108553g.m110279H();
            int iM110279H3 = this.f108553g.m110279H();
            if ((iM110279H & 2) == 0 && (iM110279H & 1) == this.f108555i) {
                byte b = (byte) (iM110279H2 & 127);
                byte b2 = (byte) (iM110279H3 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z3 = this.f108564r;
                    if ((iM110279H & 4) == 4) {
                        boolean[] zArr = f108550F;
                        if (zArr[iM110279H2] && zArr[iM110279H3]) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    this.f108564r = z;
                    if (!m131844F(z, b, b2)) {
                        if (this.f108564r) {
                            m131845K(b, b2);
                            if (this.f108569w && m131850P(b)) {
                                if (!m131843z(b)) {
                                    this.f108559m.m131868e(m131837p(b));
                                    if ((b2 & 224) != 0) {
                                        this.f108559m.m131868e(m131837p(b2));
                                    }
                                } else if (m131833H(b, b2)) {
                                    this.f108559m.m131868e(m131842v(b2));
                                } else if (m131827A(b, b2)) {
                                    this.f108559m.m131869f();
                                    this.f108559m.m131868e(m131841u(b, b2));
                                } else if (m131828B(b, b2)) {
                                    m131858w(b2);
                                } else if (m131830D(b, b2)) {
                                    m131860y(b, b2);
                                } else if (m131834I(b, b2)) {
                                    this.f108559m.f108576f = b2 - 32;
                                } else if (m131829C(b, b2)) {
                                    m131859x(b2);
                                }
                                z2 = true;
                            }
                        } else if (z3) {
                            m131846L();
                            z2 = true;
                        }
                    }
                }
            }
        }
        if (z2) {
            int i2 = this.f108562p;
            if (i2 == 1 || i2 == 3) {
                this.f108560n = m131857r();
                this.f108570x = m150648j();
            }
        }
    }

    @Override // p149l.ln4, p149l.bhd
    public void flush() {
        super.flush();
        this.f108560n = null;
        this.f108561o = null;
        m131847M(0);
        m131848N(4);
        m131846L();
        this.f108564r = false;
        this.f108565s = false;
        this.f108566t = (byte) 0;
        this.f108567u = (byte) 0;
        this.f108568v = 0;
        this.f108569w = true;
        this.f108570x = -9223372036854775807L;
    }

    @Override // p149l.ln4
    @Nullable
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ j5g0 mo101811a() throws SubtitleDecoderException {
        return super.mo101811a();
    }

    @Override // p149l.ln4, p149l.bhd
    @Nullable
    /* JADX INFO: renamed from: h */
    public k5g0 mo101812c() throws SubtitleDecoderException {
        k5g0 k5g0VarM150647i;
        k5g0 k5g0VarMo101812c = super.mo101812c();
        if (k5g0VarMo101812c != null) {
            return k5g0VarMo101812c;
        }
        if (!m131849O() || (k5g0VarM150647i = m150647i()) == null) {
            return null;
        }
        this.f108560n = Collections.EMPTY_LIST;
        this.f108570x = -9223372036854775807L;
        k5g0VarM150647i.m144539v(m150648j(), mo131851e(), Long.MAX_VALUE);
        return k5g0VarM150647i;
    }

    @Override // p149l.ln4
    /* JADX INFO: renamed from: k */
    public boolean mo131855k() {
        return this.f108560n != this.f108561o;
    }

    @Override // p149l.ln4
    /* JADX INFO: renamed from: l */
    public /* bridge */ /* synthetic */ void mo101813d(j5g0 j5g0Var) throws SubtitleDecoderException {
        super.mo101813d(j5g0Var);
    }

    /* JADX INFO: renamed from: r */
    public final List<ywb> m131857r() {
        int size = this.f108558l.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            ywb ywbVarM131870g = this.f108558l.get(i).m131870g(Integer.MIN_VALUE);
            arrayList.add(ywbVarM131870g);
            if (ywbVarM131870g != null) {
                iMin = Math.min(iMin, ywbVarM131870g.f200439i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            ywb ywbVar = (ywb) arrayList.get(i2);
            if (ywbVar != null) {
                if (ywbVar.f200439i != iMin) {
                    ywbVar = (ywb) p11.m167011e(this.f108558l.get(i2).m131870g(iMin));
                }
                arrayList2.add(ywbVar);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: w */
    public final void m131858w(byte b) {
        this.f108559m.m131868e(' ');
        this.f108559m.m131877p((b >> 1) & 7, (b & 1) == 1);
    }

    /* JADX INFO: renamed from: x */
    public final void m131859x(byte b) {
        if (b == 32) {
            m131847M(2);
            return;
        }
        if (b == 41) {
            m131847M(3);
            return;
        }
        switch (b) {
            case 37:
                m131847M(1);
                m131848N(2);
                break;
            case 38:
                m131847M(1);
                m131848N(3);
                break;
            case 39:
                m131847M(1);
                m131848N(4);
                break;
            default:
                int i = this.f108562p;
                if (i != 0) {
                    if (b != 33) {
                        switch (b) {
                            case 44:
                                this.f108560n = Collections.EMPTY_LIST;
                                if (i == 1 || i == 3) {
                                    m131846L();
                                }
                                break;
                            case 45:
                                if (i == 1 && !this.f108559m.m131872i()) {
                                    this.f108559m.m131874k();
                                    break;
                                }
                                break;
                            case 46:
                                m131846L();
                                break;
                            case 47:
                                this.f108560n = m131857r();
                                m131846L();
                                break;
                        }
                    } else {
                        this.f108559m.m131869f();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m131860y(byte b, byte b2) {
        int i = f108551y[b & 7];
        if ((b2 & HttpTokens.SPACE) != 0) {
            i++;
        }
        if (i != this.f108559m.f108574d) {
            if (this.f108562p != 1 && !this.f108559m.m131872i()) {
                C17345a c17345a = new C17345a(this.f108562p, this.f108563q);
                this.f108559m = c17345a;
                this.f108558l.add(c17345a);
            }
            this.f108559m.f108574d = i;
        }
        boolean z = (b2 & Tnaf.POW_2_WIDTH) == 16;
        boolean z2 = (b2 & 1) == 1;
        int i2 = (b2 >> 1) & 7;
        this.f108559m.m131877p(z ? 8 : i2, z2);
        if (z) {
            this.f108559m.f108575e = f108552z[i2];
        }
    }

    @Override // p149l.ln4, p149l.bhd
    public void release() {
    }
}
