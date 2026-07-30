package p149l;

import com.tencent.ugc.TXRecordCommon;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@eud(objectTypeIndication = 64, tags = {5})
public class hd1 extends vi2 {

    /* JADX INFO: renamed from: V */
    public static Map<Integer, Integer> f107121V = new HashMap();

    /* JADX INFO: renamed from: W */
    public static Map<Integer, String> f107122W = new HashMap();

    /* JADX INFO: renamed from: A */
    public int f107123A;

    /* JADX INFO: renamed from: B */
    public boolean f107124B;

    /* JADX INFO: renamed from: C */
    public boolean f107125C;

    /* JADX INFO: renamed from: D */
    public boolean f107126D;

    /* JADX INFO: renamed from: E */
    public int f107127E;

    /* JADX INFO: renamed from: F */
    public boolean f107128F;

    /* JADX INFO: renamed from: G */
    public int f107129G;

    /* JADX INFO: renamed from: H */
    public int f107130H;

    /* JADX INFO: renamed from: I */
    public int f107131I;

    /* JADX INFO: renamed from: J */
    public int f107132J;

    /* JADX INFO: renamed from: K */
    public int f107133K;

    /* JADX INFO: renamed from: L */
    public int f107134L;

    /* JADX INFO: renamed from: M */
    public int f107135M;

    /* JADX INFO: renamed from: N */
    public int f107136N;

    /* JADX INFO: renamed from: O */
    public int f107137O;

    /* JADX INFO: renamed from: P */
    public int f107138P;

    /* JADX INFO: renamed from: Q */
    public int f107139Q;

    /* JADX INFO: renamed from: R */
    public int f107140R;

    /* JADX INFO: renamed from: S */
    public int f107141S;

    /* JADX INFO: renamed from: T */
    public int f107142T;

    /* JADX INFO: renamed from: U */
    public boolean f107143U;

    /* JADX INFO: renamed from: d */
    byte[] f107144d;

    /* JADX INFO: renamed from: e */
    public C17281a f107145e;

    /* JADX INFO: renamed from: f */
    public int f107146f;

    /* JADX INFO: renamed from: g */
    public int f107147g;

    /* JADX INFO: renamed from: h */
    public int f107148h;

    /* JADX INFO: renamed from: i */
    public int f107149i;

    /* JADX INFO: renamed from: j */
    public int f107150j;

    /* JADX INFO: renamed from: k */
    public boolean f107151k;

    /* JADX INFO: renamed from: l */
    public boolean f107152l;

    /* JADX INFO: renamed from: m */
    public int f107153m;

    /* JADX INFO: renamed from: n */
    public int f107154n;

    /* JADX INFO: renamed from: o */
    public int f107155o;

    /* JADX INFO: renamed from: p */
    public int f107156p;

    /* JADX INFO: renamed from: q */
    public int f107157q;

    /* JADX INFO: renamed from: r */
    public int f107158r;

    /* JADX INFO: renamed from: s */
    public int f107159s;

    /* JADX INFO: renamed from: t */
    public int f107160t;

    /* JADX INFO: renamed from: u */
    public int f107161u;

    /* JADX INFO: renamed from: v */
    public int f107162v;

    /* JADX INFO: renamed from: w */
    public int f107163w;

    /* JADX INFO: renamed from: x */
    public int f107164x;

    /* JADX INFO: renamed from: y */
    public int f107165y;

    /* JADX INFO: renamed from: z */
    public int f107166z;

    /* JADX INFO: renamed from: l.hd1$a */
    public class C17281a {

        /* JADX INFO: renamed from: a */
        public boolean f107167a;

        /* JADX INFO: renamed from: b */
        public boolean f107168b;

        /* JADX INFO: renamed from: c */
        public boolean f107169c;

        /* JADX INFO: renamed from: d */
        public boolean f107170d;

        /* JADX INFO: renamed from: e */
        public boolean f107171e;

        /* JADX INFO: renamed from: f */
        public boolean f107172f;

        /* JADX INFO: renamed from: g */
        public boolean f107173g;

        public C17281a(int i, r03 r03Var) {
            int iM177327a;
            this.f107167a = r03Var.m177328b();
            this.f107168b = r03Var.m177328b();
            this.f107169c = r03Var.m177328b();
            this.f107170d = r03Var.m177328b();
            boolean zM177328b = r03Var.m177328b();
            this.f107171e = zM177328b;
            if (zM177328b) {
                this.f107172f = r03Var.m177328b();
                this.f107173g = r03Var.m177328b();
                m130537a(i, r03Var);
            }
            while (r03Var.m177327a(4) != 0) {
                int iM177327a2 = r03Var.m177327a(4);
                if (iM177327a2 == 15) {
                    iM177327a = r03Var.m177327a(8);
                    iM177327a2 += iM177327a;
                } else {
                    iM177327a = 0;
                }
                if (iM177327a == 255) {
                    iM177327a2 += r03Var.m177327a(16);
                }
                for (int i2 = 0; i2 < iM177327a2; i2++) {
                    r03Var.m177327a(8);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m130537a(int i, r03 r03Var) {
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
                hd1.this.new C17282b(r03Var);
            }
        }
    }

    /* JADX INFO: renamed from: l.hd1$b */
    public class C17282b {

        /* JADX INFO: renamed from: a */
        public boolean f107175a;

        /* JADX INFO: renamed from: b */
        public int f107176b;

        /* JADX INFO: renamed from: c */
        public int f107177c;

        /* JADX INFO: renamed from: d */
        public int f107178d;

        /* JADX INFO: renamed from: e */
        public int f107179e;

        /* JADX INFO: renamed from: f */
        public boolean f107180f;

        /* JADX INFO: renamed from: g */
        public boolean f107181g;

        /* JADX INFO: renamed from: h */
        public int f107182h;

        /* JADX INFO: renamed from: i */
        public boolean f107183i;

        /* JADX INFO: renamed from: j */
        public int f107184j;

        /* JADX INFO: renamed from: k */
        public int f107185k;

        /* JADX INFO: renamed from: l */
        public int f107186l;

        /* JADX INFO: renamed from: m */
        public boolean f107187m;

        /* JADX INFO: renamed from: n */
        public boolean f107188n;

        public C17282b(r03 r03Var) {
            this.f107175a = r03Var.m177328b();
            this.f107176b = r03Var.m177327a(4);
            this.f107177c = r03Var.m177327a(4);
            this.f107178d = r03Var.m177327a(3);
            this.f107179e = r03Var.m177327a(2);
            this.f107180f = r03Var.m177328b();
            this.f107181g = r03Var.m177328b();
            if (this.f107180f) {
                this.f107182h = r03Var.m177327a(2);
                this.f107183i = r03Var.m177328b();
                this.f107184j = r03Var.m177327a(2);
            }
            if (this.f107181g) {
                this.f107185k = r03Var.m177327a(2);
                this.f107186l = r03Var.m177327a(2);
                this.f107187m = r03Var.m177328b();
            }
            this.f107188n = r03Var.m177328b();
        }
    }

    static {
        f107121V.put(0, 96000);
        f107121V.put(1, 88200);
        f107121V.put(2, 64000);
        f107121V.put(3, 48000);
        f107121V.put(4, 44100);
        f107121V.put(5, 32000);
        f107121V.put(6, 24000);
        f107121V.put(7, 22050);
        f107121V.put(8, 16000);
        f107121V.put(9, 12000);
        f107121V.put(10, 11025);
        f107121V.put(11, Integer.valueOf(TXRecordCommon.AUDIO_SAMPLERATE_8000));
        f107122W.put(1, "AAC main");
        f107122W.put(2, "AAC LC");
        f107122W.put(3, "AAC SSR");
        f107122W.put(4, "AAC LTP");
        f107122W.put(5, "SBR");
        f107122W.put(6, "AAC Scalable");
        f107122W.put(7, "TwinVQ");
        f107122W.put(8, "CELP");
        f107122W.put(9, "HVXC");
        f107122W.put(10, "(reserved)");
        f107122W.put(11, "(reserved)");
        f107122W.put(12, "TTSI");
        f107122W.put(13, "Main synthetic");
        f107122W.put(14, "Wavetable synthesis");
        f107122W.put(15, "General MIDI");
        f107122W.put(16, "Algorithmic Synthesis and Audio FX");
        f107122W.put(17, "ER AAC LC");
        f107122W.put(18, "(reserved)");
        f107122W.put(19, "ER AAC LTP");
        f107122W.put(20, "ER AAC Scalable");
        f107122W.put(21, "ER TwinVQ");
        f107122W.put(22, "ER BSAC");
        f107122W.put(23, "ER AAC LD");
        f107122W.put(24, "ER CELP");
        f107122W.put(25, "ER HVXC");
        f107122W.put(26, "ER HILN");
        f107122W.put(27, "ER Parametric");
        f107122W.put(28, "SSC");
        f107122W.put(29, "PS");
        f107122W.put(30, "MPEG Surround");
        f107122W.put(31, "(escape)");
        f107122W.put(32, "Layer-1");
        f107122W.put(33, "Layer-2");
        f107122W.put(34, "Layer-3");
        f107122W.put(35, "DST");
        f107122W.put(36, "ALS");
        f107122W.put(37, "SLS");
        f107122W.put(38, "SLS non-core");
        f107122W.put(39, "ER AAC ELD");
        f107122W.put(40, "SMR Simple");
        f107122W.put(41, "SMR Main");
    }

    /* JADX INFO: renamed from: f */
    private int m130530f(r03 r03Var) throws IOException {
        int iM177327a = r03Var.m177327a(5);
        return iM177327a == 31 ? r03Var.m177327a(6) + 32 : iM177327a;
    }

    /* JADX INFO: renamed from: g */
    private void m130531g(int i, int i2, int i3, r03 r03Var) throws IOException {
        this.f107132J = r03Var.m177327a(1);
        this.f107133K = r03Var.m177327a(2);
        int iM177327a = r03Var.m177327a(1);
        this.f107134L = iM177327a;
        if (iM177327a == 1) {
            this.f107135M = r03Var.m177327a(1);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m130532h(int i, int i2, int i3, r03 r03Var) throws IOException {
        this.f107161u = r03Var.m177327a(1);
        int iM177327a = r03Var.m177327a(1);
        this.f107162v = iM177327a;
        if (iM177327a == 1) {
            this.f107163w = r03Var.m177327a(14);
        }
        this.f107164x = r03Var.m177327a(1);
        if (i2 == 0) {
            qq3.m175877a("can't parse program_config_element yet");
            return;
        }
        if (i3 == 6 || i3 == 20) {
            this.f107165y = r03Var.m177327a(3);
        }
        if (this.f107164x == 1) {
            if (i3 == 22) {
                this.f107166z = r03Var.m177327a(5);
                this.f107123A = r03Var.m177327a(11);
            }
            if (i3 == 17 || i3 == 19 || i3 == 20 || i3 == 23) {
                this.f107124B = r03Var.m177328b();
                this.f107125C = r03Var.m177328b();
                this.f107126D = r03Var.m177328b();
            }
            this.f107127E = r03Var.m177327a(1);
        }
        this.f107128F = true;
    }

    /* JADX INFO: renamed from: i */
    private void m130533i(int i, int i2, int i3, r03 r03Var) throws IOException {
        this.f107136N = r03Var.m177327a(1);
        this.f107137O = r03Var.m177327a(8);
        this.f107138P = r03Var.m177327a(4);
        this.f107139Q = r03Var.m177327a(12);
        this.f107140R = r03Var.m177327a(2);
    }

    /* JADX INFO: renamed from: j */
    private void m130534j(int i, int i2, int i3, r03 r03Var) throws IOException {
        int iM177327a = r03Var.m177327a(1);
        this.f107141S = iM177327a;
        if (iM177327a == 1) {
            this.f107142T = r03Var.m177327a(2);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m130535k(int i, int i2, int i3, r03 r03Var) throws IOException {
        int iM177327a = r03Var.m177327a(2);
        this.f107130H = iM177327a;
        if (iM177327a != 1) {
            m130531g(i, i2, i3, r03Var);
        }
        if (this.f107130H != 0) {
            m130533i(i, i2, i3, r03Var);
        }
        this.f107131I = r03Var.m177327a(1);
        this.f107143U = true;
    }

    /* JADX INFO: renamed from: l */
    private void m130536l(int i, int i2, int i3, r03 r03Var) throws IOException {
        int iM177327a = r03Var.m177327a(1);
        this.f107129G = iM177327a;
        if (iM177327a == 1) {
            m130535k(i, i2, i3, r03Var);
        } else {
            m130534j(i, i2, i3, r03Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00ff  */
    @Override // p149l.vi2
    /* JADX INFO: renamed from: e */
    public void mo106861e(ByteBuffer byteBuffer) throws IOException {
        int iM177327a;
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(this.f181548b);
        byteBuffer.position(byteBuffer.position() + this.f181548b);
        byte[] bArr = new byte[this.f181548b];
        this.f107144d = bArr;
        byteBufferSlice.get(bArr);
        byteBufferSlice.rewind();
        r03 r03Var = new r03(byteBufferSlice);
        this.f107146f = m130530f(r03Var);
        int iM177327a2 = r03Var.m177327a(4);
        this.f107147g = iM177327a2;
        if (iM177327a2 == 15) {
            this.f107148h = r03Var.m177327a(24);
        }
        this.f107149i = r03Var.m177327a(4);
        int i = this.f107146f;
        if (i == 5 || i == 29) {
            this.f107150j = 5;
            this.f107151k = true;
            if (i == 29) {
                this.f107152l = true;
            }
            int iM177327a3 = r03Var.m177327a(4);
            this.f107153m = iM177327a3;
            if (iM177327a3 == 15) {
                this.f107154n = r03Var.m177327a(24);
            }
            int iM130530f = m130530f(r03Var);
            this.f107146f = iM130530f;
            if (iM130530f == 22) {
                this.f107155o = r03Var.m177327a(4);
            }
        } else {
            this.f107150j = 0;
        }
        int i2 = this.f107146f;
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
                m130532h(this.f107147g, this.f107149i, i2, r03Var);
                break;
            case 8:
                qq3.m175877a("can't parse CelpSpecificConfig yet");
                return;
            case 9:
                qq3.m175877a("can't parse HvxcSpecificConfig yet");
                return;
            case 12:
                qq3.m175877a("can't parse TTSSpecificConfig yet");
                return;
            case 13:
            case 14:
            case 15:
            case 16:
                qq3.m175877a("can't parse StructuredAudioSpecificConfig yet");
                return;
            case 24:
                qq3.m175877a("can't parse ErrorResilientCelpSpecificConfig yet");
                return;
            case 25:
                qq3.m175877a("can't parse ErrorResilientHvxcSpecificConfig yet");
                return;
            case 26:
            case 27:
                m130536l(this.f107147g, this.f107149i, i2, r03Var);
                break;
            case 28:
                qq3.m175877a("can't parse SSCSpecificConfig yet");
                return;
            case 30:
                this.f107156p = r03Var.m177327a(1);
                qq3.m175877a("can't parse SpatialSpecificConfig yet");
                return;
            case 32:
            case 33:
            case 34:
                qq3.m175877a("can't parse MPEG_1_2_SpecificConfig yet");
                return;
            case 35:
                qq3.m175877a("can't parse DSTSpecificConfig yet");
                return;
            case 36:
                this.f107157q = r03Var.m177327a(5);
                qq3.m175877a("can't parse ALSSpecificConfig yet");
                return;
            case 37:
            case 38:
                qq3.m175877a("can't parse SLSSpecificConfig yet");
                return;
            case 39:
                this.f107145e = new C17281a(this.f107149i, r03Var);
                break;
            case 40:
            case 41:
                qq3.m175877a("can't parse SymbolicMusicSpecificConfig yet");
                return;
        }
        int i3 = this.f107146f;
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
                    iM177327a = r03Var.m177327a(2);
                    this.f107158r = iM177327a;
                    if (iM177327a != 2) {
                        break;
                    }
                    qq3.m175877a("can't parse ErrorProtectionSpecificConfig yet");
                    return;
            }
        }
        iM177327a = r03Var.m177327a(2);
        this.f107158r = iM177327a;
        if (iM177327a != 2 || iM177327a == 3) {
            qq3.m175877a("can't parse ErrorProtectionSpecificConfig yet");
            return;
        } else if (iM177327a == 3) {
            int iM177327a4 = r03Var.m177327a(1);
            this.f107159s = iM177327a4;
            if (iM177327a4 == 0) {
                upk0.m194883a("not implemented");
                return;
            }
        }
        if (this.f107150j == 5 || r03Var.m177329c() < 16) {
            return;
        }
        int iM177327a5 = r03Var.m177327a(11);
        this.f107160t = iM177327a5;
        if (iM177327a5 == 695) {
            int iM130530f2 = m130530f(r03Var);
            this.f107150j = iM130530f2;
            if (iM130530f2 == 5) {
                boolean zM177328b = r03Var.m177328b();
                this.f107151k = zM177328b;
                if (zM177328b) {
                    int iM177327a6 = r03Var.m177327a(4);
                    this.f107153m = iM177327a6;
                    if (iM177327a6 == 15) {
                        this.f107154n = r03Var.m177327a(24);
                    }
                    if (r03Var.m177329c() >= 12) {
                        int iM177327a7 = r03Var.m177327a(11);
                        this.f107160t = iM177327a7;
                        if (iM177327a7 == 1352) {
                            this.f107152l = r03Var.m177328b();
                        }
                    }
                }
            }
            if (this.f107150j == 22) {
                boolean zM177328b2 = r03Var.m177328b();
                this.f107151k = zM177328b2;
                if (zM177328b2) {
                    int iM177327a8 = r03Var.m177327a(4);
                    this.f107153m = iM177327a8;
                    if (iM177327a8 == 15) {
                        this.f107154n = r03Var.m177327a(24);
                    }
                }
                this.f107155o = r03Var.m177327a(4);
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
        hd1 hd1Var = (hd1) obj;
        return this.f107125C == hd1Var.f107125C && this.f107124B == hd1Var.f107124B && this.f107126D == hd1Var.f107126D && this.f107146f == hd1Var.f107146f && this.f107149i == hd1Var.f107149i && this.f107163w == hd1Var.f107163w && this.f107162v == hd1Var.f107162v && this.f107159s == hd1Var.f107159s && this.f107158r == hd1Var.f107158r && this.f107134L == hd1Var.f107134L && this.f107150j == hd1Var.f107150j && this.f107155o == hd1Var.f107155o && this.f107164x == hd1Var.f107164x && this.f107127E == hd1Var.f107127E && this.f107154n == hd1Var.f107154n && this.f107153m == hd1Var.f107153m && this.f107157q == hd1Var.f107157q && this.f107161u == hd1Var.f107161u && this.f107128F == hd1Var.f107128F && this.f107140R == hd1Var.f107140R && this.f107141S == hd1Var.f107141S && this.f107142T == hd1Var.f107142T && this.f107139Q == hd1Var.f107139Q && this.f107137O == hd1Var.f107137O && this.f107136N == hd1Var.f107136N && this.f107138P == hd1Var.f107138P && this.f107133K == hd1Var.f107133K && this.f107132J == hd1Var.f107132J && this.f107129G == hd1Var.f107129G && this.f107165y == hd1Var.f107165y && this.f107123A == hd1Var.f107123A && this.f107166z == hd1Var.f107166z && this.f107131I == hd1Var.f107131I && this.f107130H == hd1Var.f107130H && this.f107143U == hd1Var.f107143U && this.f107152l == hd1Var.f107152l && this.f107156p == hd1Var.f107156p && this.f107148h == hd1Var.f107148h && this.f107147g == hd1Var.f107147g && this.f107151k == hd1Var.f107151k && this.f107160t == hd1Var.f107160t && this.f107135M == hd1Var.f107135M && Arrays.equals(this.f107144d, hd1Var.f107144d);
    }

    public int hashCode() {
        byte[] bArr = this.f107144d;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + this.f107146f) * 31) + this.f107147g) * 31) + this.f107148h) * 31) + this.f107149i) * 31) + this.f107150j) * 31) + (this.f107151k ? 1 : 0)) * 31) + (this.f107152l ? 1 : 0)) * 31) + this.f107153m) * 31) + this.f107154n) * 31) + this.f107155o) * 31) + this.f107156p) * 31) + this.f107157q) * 31) + this.f107158r) * 31) + this.f107159s) * 31) + this.f107160t) * 31) + this.f107161u) * 31) + this.f107162v) * 31) + this.f107163w) * 31) + this.f107164x) * 31) + this.f107165y) * 31) + this.f107166z) * 31) + this.f107123A) * 31) + (this.f107124B ? 1 : 0)) * 31) + (this.f107125C ? 1 : 0)) * 31) + (this.f107126D ? 1 : 0)) * 31) + this.f107127E) * 31) + (this.f107128F ? 1 : 0)) * 31) + this.f107129G) * 31) + this.f107130H) * 31) + this.f107131I) * 31) + this.f107132J) * 31) + this.f107133K) * 31) + this.f107134L) * 31) + this.f107135M) * 31) + this.f107136N) * 31) + this.f107137O) * 31) + this.f107138P) * 31) + this.f107139Q) * 31) + this.f107140R) * 31) + this.f107141S) * 31) + this.f107142T) * 31) + (this.f107143U ? 1 : 0);
    }

    @Override // p149l.vi2
    public String toString() {
        StringBuilder sb = new StringBuilder("AudioSpecificConfig{configBytes=");
        sb.append(qzk.m177232a(this.f107144d));
        sb.append(", audioObjectType=");
        sb.append(this.f107146f);
        sb.append(" (");
        sb.append(f107122W.get(Integer.valueOf(this.f107146f)));
        sb.append("), samplingFrequencyIndex=");
        sb.append(this.f107147g);
        sb.append(" (");
        sb.append(f107121V.get(Integer.valueOf(this.f107147g)));
        sb.append("), samplingFrequency=");
        sb.append(this.f107148h);
        sb.append(", channelConfiguration=");
        sb.append(this.f107149i);
        if (this.f107150j > 0) {
            sb.append(", extensionAudioObjectType=");
            sb.append(this.f107150j);
            sb.append(" (");
            sb.append(f107122W.get(Integer.valueOf(this.f107150j)));
            sb.append("), sbrPresentFlag=");
            sb.append(this.f107151k);
            sb.append(", psPresentFlag=");
            sb.append(this.f107152l);
            sb.append(", extensionSamplingFrequencyIndex=");
            sb.append(this.f107153m);
            sb.append(" (");
            sb.append(f107121V.get(Integer.valueOf(this.f107153m)));
            sb.append("), extensionSamplingFrequency=");
            sb.append(this.f107154n);
            sb.append(", extensionChannelConfiguration=");
            sb.append(this.f107155o);
        }
        sb.append(", syncExtensionType=");
        sb.append(this.f107160t);
        if (this.f107128F) {
            sb.append(", frameLengthFlag=");
            sb.append(this.f107161u);
            sb.append(", dependsOnCoreCoder=");
            sb.append(this.f107162v);
            sb.append(", coreCoderDelay=");
            sb.append(this.f107163w);
            sb.append(", extensionFlag=");
            sb.append(this.f107164x);
            sb.append(", layerNr=");
            sb.append(this.f107165y);
            sb.append(", numOfSubFrame=");
            sb.append(this.f107166z);
            sb.append(", layer_length=");
            sb.append(this.f107123A);
            sb.append(", aacSectionDataResilienceFlag=");
            sb.append(this.f107124B);
            sb.append(", aacScalefactorDataResilienceFlag=");
            sb.append(this.f107125C);
            sb.append(", aacSpectralDataResilienceFlag=");
            sb.append(this.f107126D);
            sb.append(", extensionFlag3=");
            sb.append(this.f107127E);
        }
        if (this.f107143U) {
            sb.append(", isBaseLayer=");
            sb.append(this.f107129G);
            sb.append(", paraMode=");
            sb.append(this.f107130H);
            sb.append(", paraExtensionFlag=");
            sb.append(this.f107131I);
            sb.append(", hvxcVarMode=");
            sb.append(this.f107132J);
            sb.append(", hvxcRateMode=");
            sb.append(this.f107133K);
            sb.append(", erHvxcExtensionFlag=");
            sb.append(this.f107134L);
            sb.append(", var_ScalableFlag=");
            sb.append(this.f107135M);
            sb.append(", hilnQuantMode=");
            sb.append(this.f107136N);
            sb.append(", hilnMaxNumLine=");
            sb.append(this.f107137O);
            sb.append(", hilnSampleRateCode=");
            sb.append(this.f107138P);
            sb.append(", hilnFrameLength=");
            sb.append(this.f107139Q);
            sb.append(", hilnContMode=");
            sb.append(this.f107140R);
            sb.append(", hilnEnhaLayer=");
            sb.append(this.f107141S);
            sb.append(", hilnEnhaQuantMode=");
            sb.append(this.f107142T);
        }
        sb.append('}');
        return sb.toString();
    }
}
