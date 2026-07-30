package p153l;

import com.tencent.ugc.TXRecordCommon;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@svd(objectTypeIndication = 64, tags = {5})
public class od1 extends cj2 {

    /* JADX INFO: renamed from: V */
    public static Map<Integer, Integer> f146756V = new HashMap();

    /* JADX INFO: renamed from: W */
    public static Map<Integer, String> f146757W = new HashMap();

    /* JADX INFO: renamed from: A */
    public int f146758A;

    /* JADX INFO: renamed from: B */
    public boolean f146759B;

    /* JADX INFO: renamed from: C */
    public boolean f146760C;

    /* JADX INFO: renamed from: D */
    public boolean f146761D;

    /* JADX INFO: renamed from: E */
    public int f146762E;

    /* JADX INFO: renamed from: F */
    public boolean f146763F;

    /* JADX INFO: renamed from: G */
    public int f146764G;

    /* JADX INFO: renamed from: H */
    public int f146765H;

    /* JADX INFO: renamed from: I */
    public int f146766I;

    /* JADX INFO: renamed from: J */
    public int f146767J;

    /* JADX INFO: renamed from: K */
    public int f146768K;

    /* JADX INFO: renamed from: L */
    public int f146769L;

    /* JADX INFO: renamed from: M */
    public int f146770M;

    /* JADX INFO: renamed from: N */
    public int f146771N;

    /* JADX INFO: renamed from: O */
    public int f146772O;

    /* JADX INFO: renamed from: P */
    public int f146773P;

    /* JADX INFO: renamed from: Q */
    public int f146774Q;

    /* JADX INFO: renamed from: R */
    public int f146775R;

    /* JADX INFO: renamed from: S */
    public int f146776S;

    /* JADX INFO: renamed from: T */
    public int f146777T;

    /* JADX INFO: renamed from: U */
    public boolean f146778U;

    /* JADX INFO: renamed from: d */
    byte[] f146779d;

    /* JADX INFO: renamed from: e */
    public C19104a f146780e;

    /* JADX INFO: renamed from: f */
    public int f146781f;

    /* JADX INFO: renamed from: g */
    public int f146782g;

    /* JADX INFO: renamed from: h */
    public int f146783h;

    /* JADX INFO: renamed from: i */
    public int f146784i;

    /* JADX INFO: renamed from: j */
    public int f146785j;

    /* JADX INFO: renamed from: k */
    public boolean f146786k;

    /* JADX INFO: renamed from: l */
    public boolean f146787l;

    /* JADX INFO: renamed from: m */
    public int f146788m;

    /* JADX INFO: renamed from: n */
    public int f146789n;

    /* JADX INFO: renamed from: o */
    public int f146790o;

    /* JADX INFO: renamed from: p */
    public int f146791p;

    /* JADX INFO: renamed from: q */
    public int f146792q;

    /* JADX INFO: renamed from: r */
    public int f146793r;

    /* JADX INFO: renamed from: s */
    public int f146794s;

    /* JADX INFO: renamed from: t */
    public int f146795t;

    /* JADX INFO: renamed from: u */
    public int f146796u;

    /* JADX INFO: renamed from: v */
    public int f146797v;

    /* JADX INFO: renamed from: w */
    public int f146798w;

    /* JADX INFO: renamed from: x */
    public int f146799x;

    /* JADX INFO: renamed from: y */
    public int f146800y;

    /* JADX INFO: renamed from: z */
    public int f146801z;

    /* JADX INFO: renamed from: l.od1$a */
    public class C19104a {

        /* JADX INFO: renamed from: a */
        public boolean f146802a;

        /* JADX INFO: renamed from: b */
        public boolean f146803b;

        /* JADX INFO: renamed from: c */
        public boolean f146804c;

        /* JADX INFO: renamed from: d */
        public boolean f146805d;

        /* JADX INFO: renamed from: e */
        public boolean f146806e;

        /* JADX INFO: renamed from: f */
        public boolean f146807f;

        /* JADX INFO: renamed from: g */
        public boolean f146808g;

        public C19104a(int i, g13 g13Var) {
            int iM128488a;
            this.f146802a = g13Var.m128489b();
            this.f146803b = g13Var.m128489b();
            this.f146804c = g13Var.m128489b();
            this.f146805d = g13Var.m128489b();
            boolean zM128489b = g13Var.m128489b();
            this.f146806e = zM128489b;
            if (zM128489b) {
                this.f146807f = g13Var.m128489b();
                this.f146808g = g13Var.m128489b();
                m167248a(i, g13Var);
            }
            while (g13Var.m128488a(4) != 0) {
                int iM128488a2 = g13Var.m128488a(4);
                if (iM128488a2 == 15) {
                    iM128488a = g13Var.m128488a(8);
                    iM128488a2 += iM128488a;
                } else {
                    iM128488a = 0;
                }
                if (iM128488a == 255) {
                    iM128488a2 += g13Var.m128488a(16);
                }
                for (int i2 = 0; i2 < iM128488a2; i2++) {
                    g13Var.m128488a(8);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m167248a(int i, g13 g13Var) {
            int i2;
            switch (i) {
                case 1:
                case 2:
                    i2 = 1;
                    break;
                case 3:
                    i2 = 2;
                    break;
                case 4:
                case 5:
                case 6:
                    i2 = 3;
                    break;
                case 7:
                    i2 = 4;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                od1.this.new C19105b(g13Var);
            }
        }
    }

    /* JADX INFO: renamed from: l.od1$b */
    public class C19105b {

        /* JADX INFO: renamed from: a */
        public boolean f146810a;

        /* JADX INFO: renamed from: b */
        public int f146811b;

        /* JADX INFO: renamed from: c */
        public int f146812c;

        /* JADX INFO: renamed from: d */
        public int f146813d;

        /* JADX INFO: renamed from: e */
        public int f146814e;

        /* JADX INFO: renamed from: f */
        public boolean f146815f;

        /* JADX INFO: renamed from: g */
        public boolean f146816g;

        /* JADX INFO: renamed from: h */
        public int f146817h;

        /* JADX INFO: renamed from: i */
        public boolean f146818i;

        /* JADX INFO: renamed from: j */
        public int f146819j;

        /* JADX INFO: renamed from: k */
        public int f146820k;

        /* JADX INFO: renamed from: l */
        public int f146821l;

        /* JADX INFO: renamed from: m */
        public boolean f146822m;

        /* JADX INFO: renamed from: n */
        public boolean f146823n;

        public C19105b(g13 g13Var) {
            this.f146810a = g13Var.m128489b();
            this.f146811b = g13Var.m128488a(4);
            this.f146812c = g13Var.m128488a(4);
            this.f146813d = g13Var.m128488a(3);
            this.f146814e = g13Var.m128488a(2);
            this.f146815f = g13Var.m128489b();
            this.f146816g = g13Var.m128489b();
            if (this.f146815f) {
                this.f146817h = g13Var.m128488a(2);
                this.f146818i = g13Var.m128489b();
                this.f146819j = g13Var.m128488a(2);
            }
            if (this.f146816g) {
                this.f146820k = g13Var.m128488a(2);
                this.f146821l = g13Var.m128488a(2);
                this.f146822m = g13Var.m128489b();
            }
            this.f146823n = g13Var.m128489b();
        }
    }

    static {
        f146756V.put(0, 96000);
        f146756V.put(1, 88200);
        f146756V.put(2, 64000);
        f146756V.put(3, 48000);
        f146756V.put(4, 44100);
        f146756V.put(5, 32000);
        f146756V.put(6, 24000);
        f146756V.put(7, 22050);
        f146756V.put(8, 16000);
        f146756V.put(9, 12000);
        f146756V.put(10, 11025);
        f146756V.put(11, Integer.valueOf(TXRecordCommon.AUDIO_SAMPLERATE_8000));
        f146757W.put(1, "AAC main");
        f146757W.put(2, "AAC LC");
        f146757W.put(3, "AAC SSR");
        f146757W.put(4, "AAC LTP");
        f146757W.put(5, "SBR");
        f146757W.put(6, "AAC Scalable");
        f146757W.put(7, "TwinVQ");
        f146757W.put(8, "CELP");
        f146757W.put(9, "HVXC");
        f146757W.put(10, "(reserved)");
        f146757W.put(11, "(reserved)");
        f146757W.put(12, "TTSI");
        f146757W.put(13, "Main synthetic");
        f146757W.put(14, "Wavetable synthesis");
        f146757W.put(15, "General MIDI");
        f146757W.put(16, "Algorithmic Synthesis and Audio FX");
        f146757W.put(17, "ER AAC LC");
        f146757W.put(18, "(reserved)");
        f146757W.put(19, "ER AAC LTP");
        f146757W.put(20, "ER AAC Scalable");
        f146757W.put(21, "ER TwinVQ");
        f146757W.put(22, "ER BSAC");
        f146757W.put(23, "ER AAC LD");
        f146757W.put(24, "ER CELP");
        f146757W.put(25, "ER HVXC");
        f146757W.put(26, "ER HILN");
        f146757W.put(27, "ER Parametric");
        f146757W.put(28, "SSC");
        f146757W.put(29, "PS");
        f146757W.put(30, "MPEG Surround");
        f146757W.put(31, "(escape)");
        f146757W.put(32, "Layer-1");
        f146757W.put(33, "Layer-2");
        f146757W.put(34, "Layer-3");
        f146757W.put(35, "DST");
        f146757W.put(36, "ALS");
        f146757W.put(37, "SLS");
        f146757W.put(38, "SLS non-core");
        f146757W.put(39, "ER AAC ELD");
        f146757W.put(40, "SMR Simple");
        f146757W.put(41, "SMR Main");
    }

    /* JADX INFO: renamed from: f */
    private int m167241f(g13 g13Var) throws IOException {
        int iM128488a = g13Var.m128488a(5);
        return iM128488a == 31 ? g13Var.m128488a(6) + 32 : iM128488a;
    }

    /* JADX INFO: renamed from: g */
    private void m167242g(int i, int i2, int i3, g13 g13Var) throws IOException {
        this.f146767J = g13Var.m128488a(1);
        this.f146768K = g13Var.m128488a(2);
        int iM128488a = g13Var.m128488a(1);
        this.f146769L = iM128488a;
        if (iM128488a == 1) {
            this.f146770M = g13Var.m128488a(1);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m167243h(int i, int i2, int i3, g13 g13Var) throws IOException {
        this.f146796u = g13Var.m128488a(1);
        int iM128488a = g13Var.m128488a(1);
        this.f146797v = iM128488a;
        if (iM128488a == 1) {
            this.f146798w = g13Var.m128488a(14);
        }
        this.f146799x = g13Var.m128488a(1);
        if (i2 == 0) {
            pr3.m173429a("can't parse program_config_element yet");
            return;
        }
        if (i3 == 6 || i3 == 20) {
            this.f146800y = g13Var.m128488a(3);
        }
        if (this.f146799x == 1) {
            if (i3 == 22) {
                this.f146801z = g13Var.m128488a(5);
                this.f146758A = g13Var.m128488a(11);
            }
            if (i3 == 17 || i3 == 19 || i3 == 20 || i3 == 23) {
                this.f146759B = g13Var.m128489b();
                this.f146760C = g13Var.m128489b();
                this.f146761D = g13Var.m128489b();
            }
            this.f146762E = g13Var.m128488a(1);
        }
        this.f146763F = true;
    }

    /* JADX INFO: renamed from: i */
    private void m167244i(int i, int i2, int i3, g13 g13Var) throws IOException {
        this.f146771N = g13Var.m128488a(1);
        this.f146772O = g13Var.m128488a(8);
        this.f146773P = g13Var.m128488a(4);
        this.f146774Q = g13Var.m128488a(12);
        this.f146775R = g13Var.m128488a(2);
    }

    /* JADX INFO: renamed from: j */
    private void m167245j(int i, int i2, int i3, g13 g13Var) throws IOException {
        int iM128488a = g13Var.m128488a(1);
        this.f146776S = iM128488a;
        if (iM128488a == 1) {
            this.f146777T = g13Var.m128488a(2);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m167246k(int i, int i2, int i3, g13 g13Var) throws IOException {
        int iM128488a = g13Var.m128488a(2);
        this.f146765H = iM128488a;
        if (iM128488a != 1) {
            m167242g(i, i2, i3, g13Var);
        }
        if (this.f146765H != 0) {
            m167244i(i, i2, i3, g13Var);
        }
        this.f146766I = g13Var.m128488a(1);
        this.f146778U = true;
    }

    /* JADX INFO: renamed from: l */
    private void m167247l(int i, int i2, int i3, g13 g13Var) throws IOException {
        int iM128488a = g13Var.m128488a(1);
        this.f146764G = iM128488a;
        if (iM128488a == 1) {
            m167246k(i, i2, i3, g13Var);
        } else {
            m167245j(i, i2, i3, g13Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00ff  */
    @Override // p153l.cj2
    /* JADX INFO: renamed from: e */
    public void mo98560e(ByteBuffer byteBuffer) throws IOException {
        int iM128488a;
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(this.f82097b);
        byteBuffer.position(byteBuffer.position() + this.f82097b);
        byte[] bArr = new byte[this.f82097b];
        this.f146779d = bArr;
        byteBufferSlice.get(bArr);
        byteBufferSlice.rewind();
        g13 g13Var = new g13(byteBufferSlice);
        this.f146781f = m167241f(g13Var);
        int iM128488a2 = g13Var.m128488a(4);
        this.f146782g = iM128488a2;
        if (iM128488a2 == 15) {
            this.f146783h = g13Var.m128488a(24);
        }
        this.f146784i = g13Var.m128488a(4);
        int i = this.f146781f;
        if (i == 5 || i == 29) {
            this.f146785j = 5;
            this.f146786k = true;
            if (i == 29) {
                this.f146787l = true;
            }
            int iM128488a3 = g13Var.m128488a(4);
            this.f146788m = iM128488a3;
            if (iM128488a3 == 15) {
                this.f146789n = g13Var.m128488a(24);
            }
            int iM167241f = m167241f(g13Var);
            this.f146781f = iM167241f;
            if (iM167241f == 22) {
                this.f146790o = g13Var.m128488a(4);
            }
        } else {
            this.f146785j = 0;
        }
        int i2 = this.f146781f;
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                m167243h(this.f146782g, this.f146784i, i2, g13Var);
                break;
            case 8:
                pr3.m173429a("can't parse CelpSpecificConfig yet");
                return;
            case 9:
                pr3.m173429a("can't parse HvxcSpecificConfig yet");
                return;
            case 12:
                pr3.m173429a("can't parse TTSSpecificConfig yet");
                return;
            case 13:
            case 14:
            case 15:
            case 16:
                pr3.m173429a("can't parse StructuredAudioSpecificConfig yet");
                return;
            case 24:
                pr3.m173429a("can't parse ErrorResilientCelpSpecificConfig yet");
                return;
            case 25:
                pr3.m173429a("can't parse ErrorResilientHvxcSpecificConfig yet");
                return;
            case 26:
            case 27:
                m167247l(this.f146782g, this.f146784i, i2, g13Var);
                break;
            case 28:
                pr3.m173429a("can't parse SSCSpecificConfig yet");
                return;
            case 30:
                this.f146791p = g13Var.m128488a(1);
                pr3.m173429a("can't parse SpatialSpecificConfig yet");
                return;
            case 32:
            case 33:
            case 34:
                pr3.m173429a("can't parse MPEG_1_2_SpecificConfig yet");
                return;
            case 35:
                pr3.m173429a("can't parse DSTSpecificConfig yet");
                return;
            case 36:
                this.f146792q = g13Var.m128488a(5);
                pr3.m173429a("can't parse ALSSpecificConfig yet");
                return;
            case 37:
            case 38:
                pr3.m173429a("can't parse SLSSpecificConfig yet");
                return;
            case 39:
                this.f146780e = new C19104a(this.f146784i, g13Var);
                break;
            case 40:
            case 41:
                pr3.m173429a("can't parse SymbolicMusicSpecificConfig yet");
                return;
        }
        int i3 = this.f146781f;
        if (i3 != 17 && i3 != 39) {
            switch (i3) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    iM128488a = g13Var.m128488a(2);
                    this.f146793r = iM128488a;
                    if (iM128488a != 2) {
                        break;
                    }
                    pr3.m173429a("can't parse ErrorProtectionSpecificConfig yet");
                    return;
            }
        }
        iM128488a = g13Var.m128488a(2);
        this.f146793r = iM128488a;
        if (iM128488a != 2 || iM128488a == 3) {
            pr3.m173429a("can't parse ErrorProtectionSpecificConfig yet");
            return;
        } else if (iM128488a == 3) {
            int iM128488a4 = g13Var.m128488a(1);
            this.f146794s = iM128488a4;
            if (iM128488a4 == 0) {
                azk0.m101074a("not implemented");
                return;
            }
        }
        if (this.f146785j == 5 || g13Var.m128490c() < 16) {
            return;
        }
        int iM128488a5 = g13Var.m128488a(11);
        this.f146795t = iM128488a5;
        if (iM128488a5 == 695) {
            int iM167241f2 = m167241f(g13Var);
            this.f146785j = iM167241f2;
            if (iM167241f2 == 5) {
                boolean zM128489b = g13Var.m128489b();
                this.f146786k = zM128489b;
                if (zM128489b) {
                    int iM128488a6 = g13Var.m128488a(4);
                    this.f146788m = iM128488a6;
                    if (iM128488a6 == 15) {
                        this.f146789n = g13Var.m128488a(24);
                    }
                    if (g13Var.m128490c() >= 12) {
                        int iM128488a7 = g13Var.m128488a(11);
                        this.f146795t = iM128488a7;
                        if (iM128488a7 == 1352) {
                            this.f146787l = g13Var.m128489b();
                        }
                    }
                }
            }
            if (this.f146785j == 22) {
                boolean zM128489b2 = g13Var.m128489b();
                this.f146786k = zM128489b2;
                if (zM128489b2) {
                    int iM128488a8 = g13Var.m128488a(4);
                    this.f146788m = iM128488a8;
                    if (iM128488a8 == 15) {
                        this.f146789n = g13Var.m128488a(24);
                    }
                }
                this.f146790o = g13Var.m128488a(4);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        od1 od1Var = (od1) obj;
        return this.f146760C == od1Var.f146760C && this.f146759B == od1Var.f146759B && this.f146761D == od1Var.f146761D && this.f146781f == od1Var.f146781f && this.f146784i == od1Var.f146784i && this.f146798w == od1Var.f146798w && this.f146797v == od1Var.f146797v && this.f146794s == od1Var.f146794s && this.f146793r == od1Var.f146793r && this.f146769L == od1Var.f146769L && this.f146785j == od1Var.f146785j && this.f146790o == od1Var.f146790o && this.f146799x == od1Var.f146799x && this.f146762E == od1Var.f146762E && this.f146789n == od1Var.f146789n && this.f146788m == od1Var.f146788m && this.f146792q == od1Var.f146792q && this.f146796u == od1Var.f146796u && this.f146763F == od1Var.f146763F && this.f146775R == od1Var.f146775R && this.f146776S == od1Var.f146776S && this.f146777T == od1Var.f146777T && this.f146774Q == od1Var.f146774Q && this.f146772O == od1Var.f146772O && this.f146771N == od1Var.f146771N && this.f146773P == od1Var.f146773P && this.f146768K == od1Var.f146768K && this.f146767J == od1Var.f146767J && this.f146764G == od1Var.f146764G && this.f146800y == od1Var.f146800y && this.f146758A == od1Var.f146758A && this.f146801z == od1Var.f146801z && this.f146766I == od1Var.f146766I && this.f146765H == od1Var.f146765H && this.f146778U == od1Var.f146778U && this.f146787l == od1Var.f146787l && this.f146791p == od1Var.f146791p && this.f146783h == od1Var.f146783h && this.f146782g == od1Var.f146782g && this.f146786k == od1Var.f146786k && this.f146795t == od1Var.f146795t && this.f146770M == od1Var.f146770M && Arrays.equals(this.f146779d, od1Var.f146779d);
    }

    public int hashCode() {
        byte[] bArr = this.f146779d;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + this.f146781f) * 31) + this.f146782g) * 31) + this.f146783h) * 31) + this.f146784i) * 31) + this.f146785j) * 31) + (this.f146786k ? 1 : 0)) * 31) + (this.f146787l ? 1 : 0)) * 31) + this.f146788m) * 31) + this.f146789n) * 31) + this.f146790o) * 31) + this.f146791p) * 31) + this.f146792q) * 31) + this.f146793r) * 31) + this.f146794s) * 31) + this.f146795t) * 31) + this.f146796u) * 31) + this.f146797v) * 31) + this.f146798w) * 31) + this.f146799x) * 31) + this.f146800y) * 31) + this.f146801z) * 31) + this.f146758A) * 31) + (this.f146759B ? 1 : 0)) * 31) + (this.f146760C ? 1 : 0)) * 31) + (this.f146761D ? 1 : 0)) * 31) + this.f146762E) * 31) + (this.f146763F ? 1 : 0)) * 31) + this.f146764G) * 31) + this.f146765H) * 31) + this.f146766I) * 31) + this.f146767J) * 31) + this.f146768K) * 31) + this.f146769L) * 31) + this.f146770M) * 31) + this.f146771N) * 31) + this.f146772O) * 31) + this.f146773P) * 31) + this.f146774Q) * 31) + this.f146775R) * 31) + this.f146776S) * 31) + this.f146777T) * 31) + (this.f146778U ? 1 : 0);
    }

    @Override // p153l.cj2
    public String toString() {
        StringBuilder sb = new StringBuilder("AudioSpecificConfig{configBytes=");
        sb.append(g2l.m128633a(this.f146779d));
        sb.append(", audioObjectType=");
        sb.append(this.f146781f);
        sb.append(" (");
        sb.append(f146757W.get(Integer.valueOf(this.f146781f)));
        sb.append("), samplingFrequencyIndex=");
        sb.append(this.f146782g);
        sb.append(" (");
        sb.append(f146756V.get(Integer.valueOf(this.f146782g)));
        sb.append("), samplingFrequency=");
        sb.append(this.f146783h);
        sb.append(", channelConfiguration=");
        sb.append(this.f146784i);
        if (this.f146785j > 0) {
            sb.append(", extensionAudioObjectType=");
            sb.append(this.f146785j);
            sb.append(" (");
            sb.append(f146757W.get(Integer.valueOf(this.f146785j)));
            sb.append("), sbrPresentFlag=");
            sb.append(this.f146786k);
            sb.append(", psPresentFlag=");
            sb.append(this.f146787l);
            sb.append(", extensionSamplingFrequencyIndex=");
            sb.append(this.f146788m);
            sb.append(" (");
            sb.append(f146756V.get(Integer.valueOf(this.f146788m)));
            sb.append("), extensionSamplingFrequency=");
            sb.append(this.f146789n);
            sb.append(", extensionChannelConfiguration=");
            sb.append(this.f146790o);
        }
        sb.append(", syncExtensionType=");
        sb.append(this.f146795t);
        if (this.f146763F) {
            sb.append(", frameLengthFlag=");
            sb.append(this.f146796u);
            sb.append(", dependsOnCoreCoder=");
            sb.append(this.f146797v);
            sb.append(", coreCoderDelay=");
            sb.append(this.f146798w);
            sb.append(", extensionFlag=");
            sb.append(this.f146799x);
            sb.append(", layerNr=");
            sb.append(this.f146800y);
            sb.append(", numOfSubFrame=");
            sb.append(this.f146801z);
            sb.append(", layer_length=");
            sb.append(this.f146758A);
            sb.append(", aacSectionDataResilienceFlag=");
            sb.append(this.f146759B);
            sb.append(", aacScalefactorDataResilienceFlag=");
            sb.append(this.f146760C);
            sb.append(", aacSpectralDataResilienceFlag=");
            sb.append(this.f146761D);
            sb.append(", extensionFlag3=");
            sb.append(this.f146762E);
        }
        if (this.f146778U) {
            sb.append(", isBaseLayer=");
            sb.append(this.f146764G);
            sb.append(", paraMode=");
            sb.append(this.f146765H);
            sb.append(", paraExtensionFlag=");
            sb.append(this.f146766I);
            sb.append(", hvxcVarMode=");
            sb.append(this.f146767J);
            sb.append(", hvxcRateMode=");
            sb.append(this.f146768K);
            sb.append(", erHvxcExtensionFlag=");
            sb.append(this.f146769L);
            sb.append(", var_ScalableFlag=");
            sb.append(this.f146770M);
            sb.append(", hilnQuantMode=");
            sb.append(this.f146771N);
            sb.append(", hilnMaxNumLine=");
            sb.append(this.f146772O);
            sb.append(", hilnSampleRateCode=");
            sb.append(this.f146773P);
            sb.append(", hilnFrameLength=");
            sb.append(this.f146774Q);
            sb.append(", hilnContMode=");
            sb.append(this.f146775R);
            sb.append(", hilnEnhaLayer=");
            sb.append(this.f146776S);
            sb.append(", hilnEnhaQuantMode=");
            sb.append(this.f146777T);
        }
        sb.append('}');
        return sb.toString();
    }
}
