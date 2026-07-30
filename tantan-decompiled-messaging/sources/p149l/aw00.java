package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.heytap.mcssdk.mode.Message;
import com.immomo.medialog.BatteryMetrics;
import com.p046p1.mobile.putong.data.User;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: classes6.dex */
public class aw00 extends bw00 implements dxl {

    /* JADX INFO: renamed from: A */
    private long f71984A;

    /* JADX INFO: renamed from: B */
    private long f71985B;

    /* JADX INFO: renamed from: C */
    private long f71986C;

    /* JADX INFO: renamed from: D */
    private long f71987D;

    /* JADX INFO: renamed from: E */
    private volatile long f71988E;

    /* JADX INFO: renamed from: F */
    private String f71989F;

    /* JADX INFO: renamed from: G */
    private long f71990G;

    /* JADX INFO: renamed from: H */
    private long f71991H;

    /* JADX INFO: renamed from: I */
    private long f71992I;

    /* JADX INFO: renamed from: J */
    private long f71993J;

    /* JADX INFO: renamed from: u */
    protected String f71994u;

    /* JADX INFO: renamed from: v */
    private long f71995v;

    /* JADX INFO: renamed from: w */
    private long f71996w;

    /* JADX INFO: renamed from: x */
    private long f71997x;

    /* JADX INFO: renamed from: y */
    private long f71998y;

    /* JADX INFO: renamed from: z */
    private long f71999z;

    public aw00(String str) {
        super(str);
        this.f71994u = "v2.pushLiveAidStop";
        this.f71989F = "";
        this.f71990G = 0L;
        this.f71991H = 0L;
        this.f71992I = 0L;
        this.f71993J = 0L;
        this.f77554a = "v2.pushLiveAidWatch";
        this.f77555b = "v2.pullWatch";
        this.f77556c = "v2.pushLiveAidStart";
        this.f77557d = "v2.pushLiveAidStop";
        this.f77558e = "v2.pushBitrateChange";
        this.f71987D = System.currentTimeMillis();
        this.f71989F = imx.m137109p();
    }

    /* JADX INFO: renamed from: p */
    private boolean m99214p(Object obj) {
        return obj != null && (obj instanceof ewl) && ((ewl) obj).mo20019j1(4115, 0, null) == 256;
    }

    @Override // p149l.bw00, p149l.dxl
    /* JADX INFO: renamed from: G1 */
    public void mo99215G1(ewl ewlVar) {
        super.mo99215G1(ewlVar);
        this.f71995v = 0L;
        this.f71996w = 0L;
        this.f71997x = 0L;
        this.f71998y = 0L;
        this.f71999z = 0L;
        this.f71984A = 0L;
        this.f71985B = 0L;
        this.f71986C = 0L;
        this.f71988E = 0L;
        this.f71990G = 0L;
        this.f71991H = 0L;
        this.f71992I = 0L;
        this.f71987D = System.currentTimeMillis();
    }

    @Override // p149l.bw00, p149l.hu00.InterfaceC17394c
    /* JADX INFO: renamed from: a */
    public void mo99216a(int i, int i2, Object obj) {
        super.mo99216a(i, i2, obj);
    }

    @Override // p149l.bw00
    /* JADX INFO: renamed from: g */
    public long mo99217g(Object obj, int i) {
        return (i == 100 && this.f71988E >= 2) ? 1L : 0L;
    }

    @Override // p149l.bw00
    /* JADX INFO: renamed from: i */
    public String mo99218i(Object obj) {
        if (this.f77564k != 0 || !m104119e(obj) || !this.f77565l.equals(obj.toString()) || !(obj instanceof ewl)) {
            return "";
        }
        ewl ewlVar = (ewl) obj;
        int iMo19937J0 = (int) ewlVar.mo19937J0();
        int iMo19988X0 = (int) ewlVar.mo19988X0();
        int iMo20048u1 = (int) ewlVar.mo20048u1();
        int iMo19919D0 = (int) ewlVar.mo19919D0();
        return "{" + System.currentTimeMillis() + Constants.SEPARATOR_COMMA + iMo19937J0 + Constants.SEPARATOR_COMMA + iMo19988X0 + Constants.SEPARATOR_COMMA + iMo20048u1 + Constants.SEPARATOR_COMMA + iMo19919D0 + "}";
    }

    @Override // p149l.bw00
    /* JADX INFO: renamed from: j */
    public String mo99219j(Object obj, int i) {
        String str = null;
        if (m104119e(obj) && this.f77565l.equals(obj.toString()) && (obj instanceof ewl)) {
            String strMo20010g1 = ((ewl) obj).mo20010g1(i, 0, null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (strMo20010g1 != null) {
                str = "{" + jCurrentTimeMillis + Constants.SEPARATOR_COMMA + strMo20010g1 + "}";
            }
        }
        n8c.m158483a("zhengjijian", "pushSomethingExt " + str);
        return str;
    }

    @Override // p149l.bw00
    /* JADX INFO: renamed from: l */
    public String mo99220l(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        n8c.m158488f("watchaid", "" + obj);
        xxx.m211572F().m211591T();
        if (obj == null || !(obj instanceof ewl)) {
            return "";
        }
        heb0 heb0Var = new heb0();
        String strMo19920D1 = this.f77565l;
        if (m104119e(obj)) {
            ewl ewlVar = (ewl) obj;
            if (!TextUtils.isEmpty(ewlVar.mo19920D1())) {
                strMo19920D1 = ewlVar.mo19920D1();
            }
        }
        boolean zM196411a = uze.m196411a(true, "video/hevc");
        heb0Var.m156461a(heb0.f107348c, System.currentTimeMillis() + "");
        heb0Var.m156461a(heb0.f107349d, m104119e(obj) ? ((ewl) obj).getServerIpAddr() : StringUtil.ALL_INTERFACES);
        int i = heb0.f107350e;
        boolean zM104119e = m104119e(obj);
        String str11 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        if (zM104119e) {
            str = ((ewl) obj).mo19980V0() + "";
        } else {
            str = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        heb0Var.m156461a(i, str);
        int i2 = heb0.f107351f;
        if (m104119e(obj)) {
            str2 = ((ewl) obj).mo20041r0() + "";
        } else {
            str2 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        heb0Var.m156461a(i2, str2);
        int i3 = heb0.f107352g;
        if (m104119e(obj)) {
            str3 = ((ewl) obj).mo20025l1() + "";
        } else {
            str3 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        heb0Var.m156461a(i3, str3);
        int i4 = heb0.f107353h;
        if (m104119e(obj)) {
            str4 = ((ewl) obj).mo20047u0() + "";
        } else {
            str4 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        heb0Var.m156461a(i4, str4);
        int i5 = heb0.f107354i;
        if (m104119e(this.f77572s)) {
            str5 = this.f77572s.mo18368d() + "";
        } else {
            str5 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        heb0Var.m156461a(i5, str5);
        heb0Var.m156461a(heb0.f107355j, "0");
        heb0Var.m156461a(heb0.f107356k, strMo19920D1);
        int i6 = heb0.f107357l;
        if (m104119e(this.f77572s)) {
            str6 = this.f77572s.getPushType() + "";
        } else {
            str6 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        heb0Var.m156461a(i6, str6);
        int i7 = heb0.f107358m;
        if (m104119e(this.f77572s)) {
            str7 = this.f77572s.mo18367c() + "";
        } else {
            str7 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        heb0Var.m156461a(i7, str7);
        int i8 = heb0.f107359n;
        if (m104119e(obj)) {
            str8 = ((ewl) obj).getVideoWidth() + "";
        } else {
            str8 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        heb0Var.m156461a(i8, str8);
        int i9 = heb0.f107360o;
        if (m104119e(obj)) {
            str9 = ((ewl) obj).mo20022k0() + "";
        } else {
            str9 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        heb0Var.m156461a(i9, str9);
        heb0Var.m156461a(heb0.f107361p, zM196411a ? "1" : "0");
        if (m104119e(obj)) {
            str10 = ((ewl) obj).mo20036p1() + "";
        } else {
            str10 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        heb0Var.m156461a(14, str10);
        if (m104119e(obj)) {
            str11 = ((ewl) obj).mo19914A0() + "";
        }
        heb0Var.m156461a(15, str11);
        heb0Var.m156461a(heb0.f107362q, BatteryMetrics.getInstance().getIpAddr());
        n8c.m158483a("zhengjijian", "startPush [" + obj.toString() + "] " + heb0Var.toString());
        return heb0Var.toString();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    @Override // p149l.bw00
    /* JADX INFO: renamed from: m */
    public String mo99221m(Object obj, int i) {
        long jMo19952N0;
        long jMo20019j1;
        String str;
        n8c.m158488f("watchaid", "" + obj);
        ieb0 ieb0Var = new ieb0();
        if (obj != null && (obj instanceof ewl)) {
            if (m104119e(obj)) {
                ewl ewlVar = (ewl) obj;
                if (ewlVar.mo19952N0() > 0) {
                    jMo19952N0 = ewlVar.mo19952N0();
                } else {
                    jMo19952N0 = 0;
                }
            } else {
                jMo19952N0 = 0;
            }
            String strMo19920D1 = this.f77565l;
            if (m104119e(obj)) {
                ewl ewlVar2 = (ewl) obj;
                if (!TextUtils.isEmpty(ewlVar2.mo19920D1())) {
                    strMo19920D1 = ewlVar2.mo19920D1();
                }
            }
            ewl ewlVar3 = (ewl) obj;
            if (ewlVar3.mo20019j1(4125, 0, null) == 1) {
                jMo20019j1 = m104119e(obj) ? ewlVar3.mo20019j1(4124, 0, null) : 0L;
                if (jMo20019j1 != 0) {
                    jMo20019j1 = System.currentTimeMillis() - jMo20019j1;
                }
            } else {
                jMo20019j1 = -1;
            }
            ieb0Var.m156461a(ieb0.f112742c, System.currentTimeMillis() + "");
            int i2 = ieb0.f112743d;
            boolean zM104119e = m104119e(this.f77572s);
            String str2 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
            if (zM104119e) {
                str = this.f77572s.mo18365a() + "";
            } else {
                str = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
            }
            ieb0Var.m156461a(i2, str);
            ieb0Var.m156461a(ieb0.f112744e, jMo19952N0 + "");
            ieb0Var.m156461a(ieb0.f112745f, m104119e(obj) ? ewlVar3.getServerIpAddr() : StringUtil.ALL_INTERFACES);
            ieb0Var.m156461a(ieb0.f112746g, strMo19920D1);
            ieb0Var.m156461a(ieb0.f112747h, this.f71989F);
            ieb0Var.m156461a(ieb0.f112748i, jMo20019j1 + "");
            int i3 = ieb0.f112749j;
            if (m104119e(this.f77572s)) {
                str2 = this.f77572s.mo18368d() + "";
            }
            ieb0Var.m156461a(i3, str2);
        }
        n8c.m158483a("zhengjijian", "stopPush [" + obj.toString() + "] " + ieb0Var.toString());
        return ieb0Var.toString();
    }

    @Override // p149l.bw00
    /* JADX INFO: renamed from: o */
    public String mo99222o(Object obj) {
        String str;
        String string;
        String str2;
        String str3;
        String str4;
        String str5;
        String string2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        int i;
        Object obj2;
        String strMo20010g1;
        String str20;
        String str21;
        String str22;
        String str23;
        Object obj3;
        int i2;
        long jMo20019j1;
        Object obj4;
        int i3;
        String strMo20010g2;
        n8c.m158488f("watchaid", "" + obj);
        xxx.m211572F().m211590S();
        jeb0 jeb0Var = new jeb0();
        if (obj != null && (obj instanceof ewl)) {
            long jMo20054x1 = m104119e(obj) ? ((ewl) obj).mo20054x1() : 0L;
            long jMo19998a0 = m104119e(obj) ? ((ewl) obj).mo19998a0() : 0L;
            long jMo19956O0 = m104119e(obj) ? ((ewl) obj).mo19956O0() : 0L;
            long jMo20038q1 = m104119e(obj) ? ((ewl) obj).mo20038q1() : 0L;
            long jMo20001b1 = m104119e(obj) ? ((ewl) obj).mo20001b1() : 0L;
            long jMo20009g0 = m104119e(obj) ? ((ewl) obj).mo20009g0() : 0L;
            long jMo19927F1 = m104119e(obj) ? ((ewl) obj).mo19927F1() : 0L;
            long jMo20034o0 = m104119e(obj) ? ((ewl) obj).mo20034o0() : 0L;
            String strMo20010g3 = m104119e(obj) ? ((ewl) obj).mo20010g1(4107, 0, null) : "0";
            String strMo20010g4 = m104119e(obj) ? ((ewl) obj).mo20010g1(4132, 0, null) : "0";
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jMo20054x1;
            long j2 = this.f71985B;
            long j3 = jMo19927F1 > j2 ? jMo19927F1 - j2 : 0L;
            if (j3 == 0 && m99214p(obj)) {
                this.f71988E++;
            } else {
                this.f71988E = 0L;
            }
            String str24 = xxx.m211572F().m211637v() + Constants.SEPARATOR_COMMA + xxx.m211572F().m211635t() + Constants.SEPARATOR_COMMA + xxx.m211572F().m211602c() + Constants.SEPARATOR_COMMA + xxx.m211572F().m211580I();
            long j4 = j3;
            jeb0Var.m156461a(jeb0.f117516c, System.currentTimeMillis() + "");
            int i4 = jeb0.f117518d;
            long j5 = this.f71995v;
            jeb0Var.m156461a(i4, String.valueOf(j > j5 ? j - j5 : 0L));
            int i5 = jeb0.f117520e;
            long j6 = this.f71996w;
            jeb0Var.m156461a(i5, String.valueOf(jMo19998a0 > j6 ? jMo19998a0 - j6 : 0L));
            int i6 = jeb0.f117522f;
            if (m104119e(obj)) {
                StringBuilder sb = new StringBuilder();
                str = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
                sb.append(((ewl) obj).mo20048u1());
                sb.append("");
                string = sb.toString();
            } else {
                str = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
                string = str;
            }
            jeb0Var.m156461a(i6, string);
            int i7 = jeb0.f117524g;
            long j7 = this.f71997x;
            jeb0Var.m156461a(i7, String.valueOf(jMo19956O0 > j7 ? jMo19956O0 - j7 : 0L));
            int i8 = jeb0.f117526h;
            long j8 = this.f71998y;
            jeb0Var.m156461a(i8, String.valueOf(jMo20038q1 > j8 ? jMo20038q1 - j8 : 0L));
            int i9 = jeb0.f117528i;
            long j9 = this.f71999z;
            long j10 = jMo20001b1;
            jeb0Var.m156461a(i9, String.valueOf(j10 > j9 ? j10 - j9 : 0L));
            int i10 = jeb0.f117530j;
            if (m104119e(obj)) {
                str2 = ((ewl) obj).mo20003c0() + "";
            } else {
                str2 = str;
            }
            jeb0Var.m156461a(i10, str2);
            int i11 = jeb0.f117531k;
            if (m104119e(obj)) {
                str3 = ((ewl) obj).mo19930G0() + "";
            } else {
                str3 = str;
            }
            jeb0Var.m156461a(i11, str3);
            int i12 = jeb0.f117532l;
            if (m104119e(obj)) {
                str4 = ((ewl) obj).mo20030n0() + "";
            } else {
                str4 = str;
            }
            jeb0Var.m156461a(i12, str4);
            int i13 = jeb0.f117533m;
            long j11 = this.f71984A;
            long j12 = jMo20009g0;
            jeb0Var.m156461a(i13, String.valueOf(j12 > j11 ? j12 - j11 : 0L));
            jeb0Var.m156461a(jeb0.f117534n, String.valueOf(j4));
            int i14 = jeb0.f117535o;
            if (m104119e(obj)) {
                StringBuilder sb2 = new StringBuilder();
                str5 = str;
                sb2.append(((ewl) obj).mo20031n1());
                sb2.append("");
                string2 = sb2.toString();
            } else {
                str5 = str;
                string2 = str5;
            }
            jeb0Var.m156461a(i14, string2);
            int i15 = jeb0.f117536p;
            if (m104119e(obj)) {
                str6 = ((ewl) obj).mo19926F0() + "";
            } else {
                str6 = str5;
            }
            jeb0Var.m156461a(i15, str6);
            jeb0Var.m156461a(jeb0.f117537q, "" + s7y.m182539h().m182545e());
            jeb0Var.m156461a(jeb0.f117538r, m104119e(this.f77572s) ? this.f77572s.mo18366b() : str5);
            int i16 = jeb0.f117539s;
            if (m104119e(obj)) {
                str7 = ((ewl) obj).mo19943L0() + "";
            } else {
                str7 = str5;
            }
            jeb0Var.m156461a(i16, str7);
            int i17 = jeb0.f117540t;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(jMo20034o0 != 0 ? (jMo20034o0 - this.f71986C) - (jCurrentTimeMillis - this.f71987D) : 0L);
            sb3.append("");
            jeb0Var.m156461a(i17, sb3.toString());
            int i18 = jeb0.f117541u;
            if (m104119e(obj)) {
                str8 = ((ewl) obj).mo19937J0() + "";
            } else {
                str8 = str5;
            }
            jeb0Var.m156461a(i18, str8);
            int i19 = jeb0.f117542v;
            if (m104119e(obj)) {
                str9 = ((ewl) obj).mo20052w1() + "";
            } else {
                str9 = str5;
            }
            jeb0Var.m156461a(i19, str9);
            long jM211632r = xxx.m211572F().m211632r();
            long jM211630q = xxx.m211572F().m211630q();
            long j13 = jMo20038q1;
            jeb0Var.m156461a(jeb0.f117543w, jM211632r + "");
            jeb0Var.m156461a(jeb0.f117544x, jM211630q + "");
            int i20 = jeb0.f117545y;
            if (m104119e(this.f77570q)) {
                str10 = this.f77570q.mo140644I0() + "";
            } else {
                str10 = str5;
            }
            jeb0Var.m156461a(i20, str10);
            int i21 = jeb0.f117546z;
            if (m104119e(this.f77570q)) {
                str11 = this.f77570q.mo140673v1() + "";
            } else {
                str11 = str5;
            }
            jeb0Var.m156461a(i21, str11);
            long jM211640y = xxx.m211572F().m211640y();
            long jM211639x = xxx.m211572F().m211639x();
            jeb0Var.m156461a(jeb0.f117488A, jM211640y + "");
            jeb0Var.m156461a(jeb0.f117489B, jM211639x + "");
            int i22 = jeb0.f117490C;
            if (m104119e(obj)) {
                str12 = ((ewl) obj).mo20014h1() + "";
            } else {
                str12 = str5;
            }
            jeb0Var.m156461a(i22, str12);
            int i23 = jeb0.f117491D;
            if (m104119e(obj)) {
                str13 = ((ewl) obj).mo19992Y0() + "";
            } else {
                str13 = str5;
            }
            jeb0Var.m156461a(i23, str13);
            int i24 = jeb0.f117492E;
            if (m104119e(obj)) {
                str14 = ((ewl) obj).mo20028m0() + "";
            } else {
                str14 = str5;
            }
            jeb0Var.m156461a(i24, str14);
            int i25 = jeb0.f117493F;
            if (m104119e(obj)) {
                str15 = ((ewl) obj).mo19963Q0() + "";
            } else {
                str15 = str5;
            }
            jeb0Var.m156461a(i25, str15);
            int i26 = jeb0.f117494G;
            if (m104119e(obj)) {
                str16 = ((ewl) obj).getVideoWidth() + "";
            } else {
                str16 = str5;
            }
            jeb0Var.m156461a(i26, str16);
            int i27 = jeb0.f117495H;
            if (m104119e(obj)) {
                str17 = ((ewl) obj).mo20022k0() + "";
            } else {
                str17 = str5;
            }
            jeb0Var.m156461a(i27, str17);
            int i28 = jeb0.f117496I;
            if (m104119e(obj)) {
                str18 = ((ewl) obj).mo19948M0() + "";
            } else {
                str18 = str5;
            }
            jeb0Var.m156461a(i28, str18);
            int i29 = jeb0.f117497J;
            if (m104119e(obj)) {
                str19 = ((ewl) obj).getRoomType() + "";
            } else {
                str19 = str5;
            }
            jeb0Var.m156461a(i29, str19);
            long jMo20013h0 = m104119e(obj) ? ((ewl) obj).mo20013h0() : 0L;
            long jMo19953N1 = m104119e(obj) ? ((ewl) obj).mo19953N1() : 0L;
            long jMo19983W0 = m104119e(obj) ? ((ewl) obj).mo19983W0() : 0L;
            int i30 = jeb0.f117498K;
            long j14 = jMo19956O0;
            long j15 = this.f71990G;
            jeb0Var.m156461a(i30, String.valueOf(jMo20013h0 > j15 ? jMo20013h0 - j15 : 0L));
            int i31 = jeb0.f117499L;
            long j16 = this.f71991H;
            jeb0Var.m156461a(i31, String.valueOf(jMo19953N1 > j16 ? jMo19953N1 - j16 : 0L));
            int i32 = jeb0.f117500M;
            long j17 = this.f71992I;
            jeb0Var.m156461a(i32, String.valueOf(jMo19983W0 > j17 ? jMo19983W0 - j17 : 0L));
            this.f71990G = jMo20013h0;
            this.f71991H = jMo19953N1;
            this.f71992I = jMo19983W0;
            int i33 = jeb0.f117501N;
            if (m104119e(obj)) {
                i = 0;
                obj2 = null;
                strMo20010g1 = ((ewl) obj).mo20010g1(4117, 0, null);
            } else {
                i = 0;
                obj2 = null;
                strMo20010g1 = str5;
            }
            jeb0Var.m156461a(i33, strMo20010g1);
            int i34 = jeb0.f117502O;
            if (m104119e(obj)) {
                str20 = ((ewl) obj).mo20019j1(4118, i, obj2) + "";
            } else {
                str20 = str5;
            }
            jeb0Var.m156461a(i34, str20);
            int i35 = jeb0.f117503P;
            if (m104119e(obj)) {
                str21 = ((ewl) obj).mo20010g1(4119, 0, null) + "";
            } else {
                str21 = str5;
            }
            jeb0Var.m156461a(i35, str21);
            int i36 = jeb0.f117504Q;
            if (m104119e(obj)) {
                str22 = ((ewl) obj).mo20010g1(4120, 0, null) + "";
            } else {
                str22 = str5;
            }
            jeb0Var.m156461a(i36, str22);
            int i37 = jeb0.f117505R;
            if (m104119e(obj)) {
                str23 = ((ewl) obj).mo20019j1(4123, 0, null) + "";
            } else {
                str23 = str5;
            }
            jeb0Var.m156461a(i37, str23);
            jeb0Var.m156461a(jeb0.f117506S, str24);
            jeb0Var.m156461a(jeb0.f117507T, User.ID_TEAM_ACCOUNT);
            jeb0Var.m156461a(jeb0.f117508U, m104119e(obj) ? ((ewl) obj).mo20010g1(Message.MESSAGE_SMS_DATA, 0, null) : str5);
            jeb0Var.m156461a(jeb0.f117509V, xxx.m211572F().m211604d() + Constants.SEPARATOR_COMMA + xxx.m211572F().m211628p() + Constants.SEPARATOR_COMMA + xxx.m211572F().m211573A() + Constants.SEPARATOR_COMMA + xxx.m211572F().m211577E());
            int i38 = jeb0.f117510W;
            StringBuilder sb4 = new StringBuilder("");
            sb4.append(xxx.m211572F().m211582K());
            jeb0Var.m156461a(i38, sb4.toString());
            jeb0Var.m156461a(jeb0.f117511X, strMo20010g3);
            jeb0Var.m156461a(jeb0.f117512Y, "" + xxx.m211572F().m211579H());
            jeb0Var.m156461a(jeb0.f117513Z, this.f71993J + "");
            jeb0Var.m156461a(jeb0.f117514a0, strMo20010g4);
            if (m104119e(obj)) {
                obj3 = null;
                i2 = 0;
                jMo20019j1 = ((ewl) obj).mo20019j1(4133, 0, null);
            } else {
                obj3 = null;
                i2 = 0;
                jMo20019j1 = 0;
            }
            long jMo20019j2 = m104119e(obj) ? ((ewl) obj).mo20019j1(4134, i2, obj3) : 0L;
            if (jMo20019j1 > 0) {
                jMo20019j1 /= 1000;
            }
            if (jMo20019j2 > 0) {
                jMo20019j2 /= 1000;
            }
            jeb0Var.m156461a(jeb0.f117515b0, jMo20019j1 + "");
            jeb0Var.m156461a(jeb0.f117517c0, jMo20019j2 + "");
            if (m104119e(obj)) {
                obj4 = null;
                i3 = 0;
                strMo20010g2 = ((ewl) obj).mo20010g1(4128, 0, null);
            } else {
                obj4 = null;
                i3 = 0;
                strMo20010g2 = "100";
            }
            long jMo20019j3 = m104119e(obj) ? ((ewl) obj).mo20019j1(4126, i3, obj4) : 0L;
            long jMo20019j4 = m104119e(obj) ? ((ewl) obj).mo20019j1(4127, i3, obj4) : 0L;
            long jMo20019j5 = m104119e(obj) ? ((ewl) obj).mo20019j1(4130, i3, obj4) : 0L;
            long jMo20019j6 = m104119e(obj) ? ((ewl) obj).mo20019j1(4131, i3, obj4) : 0L;
            jeb0Var.m156461a(jeb0.f117519d0, strMo20010g2 + "");
            jeb0Var.m156461a(jeb0.f117521e0, jMo20019j3 + "");
            jeb0Var.m156461a(jeb0.f117523f0, jMo20019j4 + "");
            jeb0Var.m156461a(jeb0.f117525g0, jMo20019j5 + "");
            jeb0Var.m156461a(jeb0.f117527h0, xxx.m211572F().m211576D() ? "1" : "0");
            jeb0Var.m156461a(jeb0.f117529i0, jMo20019j6 + "");
            xxx.m211572F().m211591T();
            this.f71995v = j;
            this.f71996w = jMo19998a0;
            this.f71997x = j14;
            this.f71998y = j13;
            this.f71999z = j10;
            this.f71984A = j12;
            this.f71985B = jMo19927F1;
            this.f71986C = jMo20034o0;
            this.f71987D = jCurrentTimeMillis;
            this.f71993J++;
            n8c.m158483a("NetUtils", "pushWatch " + jeb0Var.toString());
        }
        if ((m104119e(obj) ? ((ewl) obj).mo20019j1(4135, 0, null) : 0L) == 0 && this.f71988E == 3 && m104119e(obj)) {
            ((ewl) obj).mo20010g1(4108, 0, null);
        }
        return jeb0Var.toString();
    }
}
