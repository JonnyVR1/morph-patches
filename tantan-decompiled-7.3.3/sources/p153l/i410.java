package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.heytap.mcssdk.mode.Message;
import com.immomo.medialog.BatteryMetrics;
import com.p051p1.mobile.putong.data.User;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: classes8.dex */
public class i410 extends j410 implements wzl {

    /* JADX INFO: renamed from: A */
    private long f112805A;

    /* JADX INFO: renamed from: B */
    private long f112806B;

    /* JADX INFO: renamed from: C */
    private long f112807C;

    /* JADX INFO: renamed from: D */
    private long f112808D;

    /* JADX INFO: renamed from: E */
    private volatile long f112809E;

    /* JADX INFO: renamed from: F */
    private String f112810F;

    /* JADX INFO: renamed from: G */
    private long f112811G;

    /* JADX INFO: renamed from: H */
    private long f112812H;

    /* JADX INFO: renamed from: I */
    private long f112813I;

    /* JADX INFO: renamed from: J */
    private long f112814J;

    /* JADX INFO: renamed from: u */
    protected String f112815u;

    /* JADX INFO: renamed from: v */
    private long f112816v;

    /* JADX INFO: renamed from: w */
    private long f112817w;

    /* JADX INFO: renamed from: x */
    private long f112818x;

    /* JADX INFO: renamed from: y */
    private long f112819y;

    /* JADX INFO: renamed from: z */
    private long f112820z;

    public i410(String str) {
        super(str);
        this.f112815u = "v2.pushLiveAidStop";
        this.f112810F = "";
        this.f112811G = 0L;
        this.f112812H = 0L;
        this.f112813I = 0L;
        this.f112814J = 0L;
        this.f118235a = "v2.pushLiveAidWatch";
        this.f118236b = "v2.pullWatch";
        this.f118237c = "v2.pushLiveAidStart";
        this.f118238d = "v2.pushLiveAidStop";
        this.f118239e = "v2.pushBitrateChange";
        this.f112808D = System.currentTimeMillis();
        this.f112810F = fvx.m127730p();
    }

    /* JADX INFO: renamed from: p */
    private boolean m138378p(Object obj) {
        return obj != null && (obj instanceof wyl) && ((wyl) obj).mo21018j1(4115, 0, null) == 256;
    }

    @Override // p153l.j410, p153l.wzl
    /* JADX INFO: renamed from: G1 */
    public void mo138379G1(wyl wylVar) {
        super.mo138379G1(wylVar);
        this.f112816v = 0L;
        this.f112817w = 0L;
        this.f112818x = 0L;
        this.f112819y = 0L;
        this.f112820z = 0L;
        this.f112805A = 0L;
        this.f112806B = 0L;
        this.f112807C = 0L;
        this.f112809E = 0L;
        this.f112811G = 0L;
        this.f112812H = 0L;
        this.f112813I = 0L;
        this.f112808D = System.currentTimeMillis();
    }

    @Override // p153l.j410, p153l.q210.InterfaceC19502c
    /* JADX INFO: renamed from: a */
    public void mo133538a(int i, int i2, Object obj) {
        super.mo133538a(i, i2, obj);
    }

    @Override // p153l.j410
    /* JADX INFO: renamed from: g */
    public long mo138380g(Object obj, int i) {
        return (i == 100 && this.f112809E >= 2) ? 1L : 0L;
    }

    @Override // p153l.j410
    /* JADX INFO: renamed from: i */
    public String mo138381i(Object obj) {
        if (this.f118245k != 0 || !m143393e(obj) || !this.f118246l.equals(obj.toString()) || !(obj instanceof wyl)) {
            return "";
        }
        wyl wylVar = (wyl) obj;
        int iMo20936J0 = (int) wylVar.mo20936J0();
        int iMo20987X0 = (int) wylVar.mo20987X0();
        int iMo21047u1 = (int) wylVar.mo21047u1();
        int iMo20918D0 = (int) wylVar.mo20918D0();
        return "{" + System.currentTimeMillis() + Constants.SEPARATOR_COMMA + iMo20936J0 + Constants.SEPARATOR_COMMA + iMo20987X0 + Constants.SEPARATOR_COMMA + iMo21047u1 + Constants.SEPARATOR_COMMA + iMo20918D0 + "}";
    }

    @Override // p153l.j410
    /* JADX INFO: renamed from: j */
    public String mo138382j(Object obj, int i) {
        String str = null;
        if (m143393e(obj) && this.f118246l.equals(obj.toString()) && (obj instanceof wyl)) {
            String strMo21009g1 = ((wyl) obj).mo21009g1(i, 0, null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (strMo21009g1 != null) {
                str = "{" + jCurrentTimeMillis + Constants.SEPARATOR_COMMA + strMo21009g1 + "}";
            }
        }
        t9c.m189743a("zhengjijian", "pushSomethingExt " + str);
        return str;
    }

    @Override // p153l.j410
    /* JADX INFO: renamed from: l */
    public String mo138383l(Object obj) {
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
        t9c.m189748f("watchaid", "" + obj);
        u6y.m194722F().m194741T();
        if (obj == null || !(obj instanceof wyl)) {
            return "";
        }
        lmb0 lmb0Var = new lmb0();
        String strMo20919D1 = this.f118246l;
        if (m143393e(obj)) {
            wyl wylVar = (wyl) obj;
            if (!TextUtils.isEmpty(wylVar.mo20919D1())) {
                strMo20919D1 = wylVar.mo20919D1();
            }
        }
        boolean zM213844a = y0f.m213844a(true, "video/hevc");
        lmb0Var.m199181a(lmb0.f132659c, System.currentTimeMillis() + "");
        lmb0Var.m199181a(lmb0.f132660d, m143393e(obj) ? ((wyl) obj).getServerIpAddr() : StringUtil.ALL_INTERFACES);
        int i = lmb0.f132661e;
        boolean zM143393e = m143393e(obj);
        String str11 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        if (zM143393e) {
            str = ((wyl) obj).mo20979V0() + "";
        } else {
            str = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        lmb0Var.m199181a(i, str);
        int i2 = lmb0.f132662f;
        if (m143393e(obj)) {
            str2 = ((wyl) obj).mo21040r0() + "";
        } else {
            str2 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        lmb0Var.m199181a(i2, str2);
        int i3 = lmb0.f132663g;
        if (m143393e(obj)) {
            str3 = ((wyl) obj).mo21024l1() + "";
        } else {
            str3 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        lmb0Var.m199181a(i3, str3);
        int i4 = lmb0.f132664h;
        if (m143393e(obj)) {
            str4 = ((wyl) obj).mo21046u0() + "";
        } else {
            str4 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        lmb0Var.m199181a(i4, str4);
        int i5 = lmb0.f132665i;
        if (m143393e(this.f118253s)) {
            str5 = this.f118253s.mo19377d() + "";
        } else {
            str5 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        lmb0Var.m199181a(i5, str5);
        lmb0Var.m199181a(lmb0.f132666j, "0");
        lmb0Var.m199181a(lmb0.f132667k, strMo20919D1);
        int i6 = lmb0.f132668l;
        if (m143393e(this.f118253s)) {
            str6 = this.f118253s.getPushType() + "";
        } else {
            str6 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        lmb0Var.m199181a(i6, str6);
        int i7 = lmb0.f132669m;
        if (m143393e(this.f118253s)) {
            str7 = this.f118253s.mo19376c() + "";
        } else {
            str7 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        lmb0Var.m199181a(i7, str7);
        int i8 = lmb0.f132670n;
        if (m143393e(obj)) {
            str8 = ((wyl) obj).getVideoWidth() + "";
        } else {
            str8 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        lmb0Var.m199181a(i8, str8);
        int i9 = lmb0.f132671o;
        if (m143393e(obj)) {
            str9 = ((wyl) obj).mo21021k0() + "";
        } else {
            str9 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        lmb0Var.m199181a(i9, str9);
        lmb0Var.m199181a(lmb0.f132672p, zM213844a ? "1" : "0");
        if (m143393e(obj)) {
            str10 = ((wyl) obj).mo21035p1() + "";
        } else {
            str10 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        lmb0Var.m199181a(14, str10);
        if (m143393e(obj)) {
            str11 = ((wyl) obj).mo20913A0() + "";
        }
        lmb0Var.m199181a(15, str11);
        lmb0Var.m199181a(lmb0.f132673q, BatteryMetrics.getInstance().getIpAddr());
        t9c.m189743a("zhengjijian", "startPush [" + obj.toString() + "] " + lmb0Var.toString());
        return lmb0Var.toString();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    @Override // p153l.j410
    /* JADX INFO: renamed from: m */
    public String mo138384m(Object obj, int i) {
        long jMo20951N0;
        long jMo21018j1;
        String str;
        t9c.m189748f("watchaid", "" + obj);
        mmb0 mmb0Var = new mmb0();
        if (obj != null && (obj instanceof wyl)) {
            if (m143393e(obj)) {
                wyl wylVar = (wyl) obj;
                if (wylVar.mo20951N0() > 0) {
                    jMo20951N0 = wylVar.mo20951N0();
                } else {
                    jMo20951N0 = 0;
                }
            } else {
                jMo20951N0 = 0;
            }
            String strMo20919D1 = this.f118246l;
            if (m143393e(obj)) {
                wyl wylVar2 = (wyl) obj;
                if (!TextUtils.isEmpty(wylVar2.mo20919D1())) {
                    strMo20919D1 = wylVar2.mo20919D1();
                }
            }
            wyl wylVar3 = (wyl) obj;
            if (wylVar3.mo21018j1(4125, 0, null) == 1) {
                jMo21018j1 = m143393e(obj) ? wylVar3.mo21018j1(4124, 0, null) : 0L;
                if (jMo21018j1 != 0) {
                    jMo21018j1 = System.currentTimeMillis() - jMo21018j1;
                }
            } else {
                jMo21018j1 = -1;
            }
            mmb0Var.m199181a(mmb0.f137549c, System.currentTimeMillis() + "");
            int i2 = mmb0.f137550d;
            boolean zM143393e = m143393e(this.f118253s);
            String str2 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
            if (zM143393e) {
                str = this.f118253s.mo19374a() + "";
            } else {
                str = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
            }
            mmb0Var.m199181a(i2, str);
            mmb0Var.m199181a(mmb0.f137551e, jMo20951N0 + "");
            mmb0Var.m199181a(mmb0.f137552f, m143393e(obj) ? wylVar3.getServerIpAddr() : StringUtil.ALL_INTERFACES);
            mmb0Var.m199181a(mmb0.f137553g, strMo20919D1);
            mmb0Var.m199181a(mmb0.f137554h, this.f112810F);
            mmb0Var.m199181a(mmb0.f137555i, jMo21018j1 + "");
            int i3 = mmb0.f137556j;
            if (m143393e(this.f118253s)) {
                str2 = this.f118253s.mo19377d() + "";
            }
            mmb0Var.m199181a(i3, str2);
        }
        t9c.m189743a("zhengjijian", "stopPush [" + obj.toString() + "] " + mmb0Var.toString());
        return mmb0Var.toString();
    }

    @Override // p153l.j410
    /* JADX INFO: renamed from: o */
    public String mo138385o(Object obj) {
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
        String strMo21009g1;
        String str20;
        String str21;
        String str22;
        String str23;
        Object obj3;
        int i2;
        long jMo21018j1;
        Object obj4;
        int i3;
        String strMo21009g2;
        t9c.m189748f("watchaid", "" + obj);
        u6y.m194722F().m194740S();
        nmb0 nmb0Var = new nmb0();
        if (obj != null && (obj instanceof wyl)) {
            long jMo21053x1 = m143393e(obj) ? ((wyl) obj).mo21053x1() : 0L;
            long jMo20997a0 = m143393e(obj) ? ((wyl) obj).mo20997a0() : 0L;
            long jMo20955O0 = m143393e(obj) ? ((wyl) obj).mo20955O0() : 0L;
            long jMo21037q1 = m143393e(obj) ? ((wyl) obj).mo21037q1() : 0L;
            long jMo21000b1 = m143393e(obj) ? ((wyl) obj).mo21000b1() : 0L;
            long jMo21008g0 = m143393e(obj) ? ((wyl) obj).mo21008g0() : 0L;
            long jMo20926F1 = m143393e(obj) ? ((wyl) obj).mo20926F1() : 0L;
            long jMo21033o0 = m143393e(obj) ? ((wyl) obj).mo21033o0() : 0L;
            String strMo21009g3 = m143393e(obj) ? ((wyl) obj).mo21009g1(4107, 0, null) : "0";
            String strMo21009g4 = m143393e(obj) ? ((wyl) obj).mo21009g1(4132, 0, null) : "0";
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jMo21053x1;
            long j2 = this.f112806B;
            long j3 = jMo20926F1 > j2 ? jMo20926F1 - j2 : 0L;
            if (j3 == 0 && m138378p(obj)) {
                this.f112809E++;
            } else {
                this.f112809E = 0L;
            }
            String str24 = u6y.m194722F().m194787v() + Constants.SEPARATOR_COMMA + u6y.m194722F().m194785t() + Constants.SEPARATOR_COMMA + u6y.m194722F().m194752c() + Constants.SEPARATOR_COMMA + u6y.m194722F().m194730I();
            long j4 = j3;
            nmb0Var.m199181a(nmb0.f142663c, System.currentTimeMillis() + "");
            int i4 = nmb0.f142665d;
            long j5 = this.f112816v;
            nmb0Var.m199181a(i4, String.valueOf(j > j5 ? j - j5 : 0L));
            int i5 = nmb0.f142667e;
            long j6 = this.f112817w;
            nmb0Var.m199181a(i5, String.valueOf(jMo20997a0 > j6 ? jMo20997a0 - j6 : 0L));
            int i6 = nmb0.f142669f;
            if (m143393e(obj)) {
                StringBuilder sb = new StringBuilder();
                str = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
                sb.append(((wyl) obj).mo21047u1());
                sb.append("");
                string = sb.toString();
            } else {
                str = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
                string = str;
            }
            nmb0Var.m199181a(i6, string);
            int i7 = nmb0.f142671g;
            long j7 = this.f112818x;
            nmb0Var.m199181a(i7, String.valueOf(jMo20955O0 > j7 ? jMo20955O0 - j7 : 0L));
            int i8 = nmb0.f142673h;
            long j8 = this.f112819y;
            nmb0Var.m199181a(i8, String.valueOf(jMo21037q1 > j8 ? jMo21037q1 - j8 : 0L));
            int i9 = nmb0.f142675i;
            long j9 = this.f112820z;
            long j10 = jMo21000b1;
            nmb0Var.m199181a(i9, String.valueOf(j10 > j9 ? j10 - j9 : 0L));
            int i10 = nmb0.f142677j;
            if (m143393e(obj)) {
                str2 = ((wyl) obj).mo21002c0() + "";
            } else {
                str2 = str;
            }
            nmb0Var.m199181a(i10, str2);
            int i11 = nmb0.f142678k;
            if (m143393e(obj)) {
                str3 = ((wyl) obj).mo20929G0() + "";
            } else {
                str3 = str;
            }
            nmb0Var.m199181a(i11, str3);
            int i12 = nmb0.f142679l;
            if (m143393e(obj)) {
                str4 = ((wyl) obj).mo21029n0() + "";
            } else {
                str4 = str;
            }
            nmb0Var.m199181a(i12, str4);
            int i13 = nmb0.f142680m;
            long j11 = this.f112805A;
            long j12 = jMo21008g0;
            nmb0Var.m199181a(i13, String.valueOf(j12 > j11 ? j12 - j11 : 0L));
            nmb0Var.m199181a(nmb0.f142681n, String.valueOf(j4));
            int i14 = nmb0.f142682o;
            if (m143393e(obj)) {
                StringBuilder sb2 = new StringBuilder();
                str5 = str;
                sb2.append(((wyl) obj).mo21030n1());
                sb2.append("");
                string2 = sb2.toString();
            } else {
                str5 = str;
                string2 = str5;
            }
            nmb0Var.m199181a(i14, string2);
            int i15 = nmb0.f142683p;
            if (m143393e(obj)) {
                str6 = ((wyl) obj).mo20925F0() + "";
            } else {
                str6 = str5;
            }
            nmb0Var.m199181a(i15, str6);
            nmb0Var.m199181a(nmb0.f142684q, "" + pgy.m172290h().m172296e());
            nmb0Var.m199181a(nmb0.f142685r, m143393e(this.f118253s) ? this.f118253s.mo19375b() : str5);
            int i16 = nmb0.f142686s;
            if (m143393e(obj)) {
                str7 = ((wyl) obj).mo20942L0() + "";
            } else {
                str7 = str5;
            }
            nmb0Var.m199181a(i16, str7);
            int i17 = nmb0.f142687t;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(jMo21033o0 != 0 ? (jMo21033o0 - this.f112807C) - (jCurrentTimeMillis - this.f112808D) : 0L);
            sb3.append("");
            nmb0Var.m199181a(i17, sb3.toString());
            int i18 = nmb0.f142688u;
            if (m143393e(obj)) {
                str8 = ((wyl) obj).mo20936J0() + "";
            } else {
                str8 = str5;
            }
            nmb0Var.m199181a(i18, str8);
            int i19 = nmb0.f142689v;
            if (m143393e(obj)) {
                str9 = ((wyl) obj).mo21051w1() + "";
            } else {
                str9 = str5;
            }
            nmb0Var.m199181a(i19, str9);
            long jM194782r = u6y.m194722F().m194782r();
            long jM194780q = u6y.m194722F().m194780q();
            long j13 = jMo21037q1;
            nmb0Var.m199181a(nmb0.f142690w, jM194782r + "");
            nmb0Var.m199181a(nmb0.f142691x, jM194780q + "");
            int i20 = nmb0.f142692y;
            if (m143393e(this.f118251q)) {
                str10 = this.f118251q.mo121925I0() + "";
            } else {
                str10 = str5;
            }
            nmb0Var.m199181a(i20, str10);
            int i21 = nmb0.f142693z;
            if (m143393e(this.f118251q)) {
                str11 = this.f118251q.mo121926v1() + "";
            } else {
                str11 = str5;
            }
            nmb0Var.m199181a(i21, str11);
            long jM194790y = u6y.m194722F().m194790y();
            long jM194789x = u6y.m194722F().m194789x();
            nmb0Var.m199181a(nmb0.f142635A, jM194790y + "");
            nmb0Var.m199181a(nmb0.f142636B, jM194789x + "");
            int i22 = nmb0.f142637C;
            if (m143393e(obj)) {
                str12 = ((wyl) obj).mo21013h1() + "";
            } else {
                str12 = str5;
            }
            nmb0Var.m199181a(i22, str12);
            int i23 = nmb0.f142638D;
            if (m143393e(obj)) {
                str13 = ((wyl) obj).mo20991Y0() + "";
            } else {
                str13 = str5;
            }
            nmb0Var.m199181a(i23, str13);
            int i24 = nmb0.f142639E;
            if (m143393e(obj)) {
                str14 = ((wyl) obj).mo21027m0() + "";
            } else {
                str14 = str5;
            }
            nmb0Var.m199181a(i24, str14);
            int i25 = nmb0.f142640F;
            if (m143393e(obj)) {
                str15 = ((wyl) obj).mo20962Q0() + "";
            } else {
                str15 = str5;
            }
            nmb0Var.m199181a(i25, str15);
            int i26 = nmb0.f142641G;
            if (m143393e(obj)) {
                str16 = ((wyl) obj).getVideoWidth() + "";
            } else {
                str16 = str5;
            }
            nmb0Var.m199181a(i26, str16);
            int i27 = nmb0.f142642H;
            if (m143393e(obj)) {
                str17 = ((wyl) obj).mo21021k0() + "";
            } else {
                str17 = str5;
            }
            nmb0Var.m199181a(i27, str17);
            int i28 = nmb0.f142643I;
            if (m143393e(obj)) {
                str18 = ((wyl) obj).mo20947M0() + "";
            } else {
                str18 = str5;
            }
            nmb0Var.m199181a(i28, str18);
            int i29 = nmb0.f142644J;
            if (m143393e(obj)) {
                str19 = ((wyl) obj).getRoomType() + "";
            } else {
                str19 = str5;
            }
            nmb0Var.m199181a(i29, str19);
            long jMo21012h0 = m143393e(obj) ? ((wyl) obj).mo21012h0() : 0L;
            long jMo20952N1 = m143393e(obj) ? ((wyl) obj).mo20952N1() : 0L;
            long jMo20982W0 = m143393e(obj) ? ((wyl) obj).mo20982W0() : 0L;
            int i30 = nmb0.f142645K;
            long j14 = jMo20955O0;
            long j15 = this.f112811G;
            nmb0Var.m199181a(i30, String.valueOf(jMo21012h0 > j15 ? jMo21012h0 - j15 : 0L));
            int i31 = nmb0.f142646L;
            long j16 = this.f112812H;
            nmb0Var.m199181a(i31, String.valueOf(jMo20952N1 > j16 ? jMo20952N1 - j16 : 0L));
            int i32 = nmb0.f142647M;
            long j17 = this.f112813I;
            nmb0Var.m199181a(i32, String.valueOf(jMo20982W0 > j17 ? jMo20982W0 - j17 : 0L));
            this.f112811G = jMo21012h0;
            this.f112812H = jMo20952N1;
            this.f112813I = jMo20982W0;
            int i33 = nmb0.f142648N;
            if (m143393e(obj)) {
                i = 0;
                obj2 = null;
                strMo21009g1 = ((wyl) obj).mo21009g1(4117, 0, null);
            } else {
                i = 0;
                obj2 = null;
                strMo21009g1 = str5;
            }
            nmb0Var.m199181a(i33, strMo21009g1);
            int i34 = nmb0.f142649O;
            if (m143393e(obj)) {
                str20 = ((wyl) obj).mo21018j1(4118, i, obj2) + "";
            } else {
                str20 = str5;
            }
            nmb0Var.m199181a(i34, str20);
            int i35 = nmb0.f142650P;
            if (m143393e(obj)) {
                str21 = ((wyl) obj).mo21009g1(4119, 0, null) + "";
            } else {
                str21 = str5;
            }
            nmb0Var.m199181a(i35, str21);
            int i36 = nmb0.f142651Q;
            if (m143393e(obj)) {
                str22 = ((wyl) obj).mo21009g1(4120, 0, null) + "";
            } else {
                str22 = str5;
            }
            nmb0Var.m199181a(i36, str22);
            int i37 = nmb0.f142652R;
            if (m143393e(obj)) {
                str23 = ((wyl) obj).mo21018j1(4123, 0, null) + "";
            } else {
                str23 = str5;
            }
            nmb0Var.m199181a(i37, str23);
            nmb0Var.m199181a(nmb0.f142653S, str24);
            nmb0Var.m199181a(nmb0.f142654T, User.ID_TEAM_ACCOUNT);
            nmb0Var.m199181a(nmb0.f142655U, m143393e(obj) ? ((wyl) obj).mo21009g1(Message.MESSAGE_SMS_DATA, 0, null) : str5);
            nmb0Var.m199181a(nmb0.f142656V, u6y.m194722F().m194754d() + Constants.SEPARATOR_COMMA + u6y.m194722F().m194778p() + Constants.SEPARATOR_COMMA + u6y.m194722F().m194723A() + Constants.SEPARATOR_COMMA + u6y.m194722F().m194727E());
            int i38 = nmb0.f142657W;
            StringBuilder sb4 = new StringBuilder("");
            sb4.append(u6y.m194722F().m194732K());
            nmb0Var.m199181a(i38, sb4.toString());
            nmb0Var.m199181a(nmb0.f142658X, strMo21009g3);
            nmb0Var.m199181a(nmb0.f142659Y, "" + u6y.m194722F().m194729H());
            nmb0Var.m199181a(nmb0.f142660Z, this.f112814J + "");
            nmb0Var.m199181a(nmb0.f142661a0, strMo21009g4);
            if (m143393e(obj)) {
                obj3 = null;
                i2 = 0;
                jMo21018j1 = ((wyl) obj).mo21018j1(4133, 0, null);
            } else {
                obj3 = null;
                i2 = 0;
                jMo21018j1 = 0;
            }
            long jMo21018j2 = m143393e(obj) ? ((wyl) obj).mo21018j1(4134, i2, obj3) : 0L;
            if (jMo21018j1 > 0) {
                jMo21018j1 /= 1000;
            }
            if (jMo21018j2 > 0) {
                jMo21018j2 /= 1000;
            }
            nmb0Var.m199181a(nmb0.f142662b0, jMo21018j1 + "");
            nmb0Var.m199181a(nmb0.f142664c0, jMo21018j2 + "");
            if (m143393e(obj)) {
                obj4 = null;
                i3 = 0;
                strMo21009g2 = ((wyl) obj).mo21009g1(4128, 0, null);
            } else {
                obj4 = null;
                i3 = 0;
                strMo21009g2 = "100";
            }
            long jMo21018j3 = m143393e(obj) ? ((wyl) obj).mo21018j1(4126, i3, obj4) : 0L;
            long jMo21018j4 = m143393e(obj) ? ((wyl) obj).mo21018j1(4127, i3, obj4) : 0L;
            long jMo21018j5 = m143393e(obj) ? ((wyl) obj).mo21018j1(4130, i3, obj4) : 0L;
            long jMo21018j6 = m143393e(obj) ? ((wyl) obj).mo21018j1(4131, i3, obj4) : 0L;
            nmb0Var.m199181a(nmb0.f142666d0, strMo21009g2 + "");
            nmb0Var.m199181a(nmb0.f142668e0, jMo21018j3 + "");
            nmb0Var.m199181a(nmb0.f142670f0, jMo21018j4 + "");
            nmb0Var.m199181a(nmb0.f142672g0, jMo21018j5 + "");
            nmb0Var.m199181a(nmb0.f142674h0, u6y.m194722F().m194726D() ? "1" : "0");
            nmb0Var.m199181a(nmb0.f142676i0, jMo21018j6 + "");
            u6y.m194722F().m194741T();
            this.f112816v = j;
            this.f112817w = jMo20997a0;
            this.f112818x = j14;
            this.f112819y = j13;
            this.f112820z = j10;
            this.f112805A = j12;
            this.f112806B = jMo20926F1;
            this.f112807C = jMo21033o0;
            this.f112808D = jCurrentTimeMillis;
            this.f112814J++;
            t9c.m189743a("NetUtils", "pushWatch " + nmb0Var.toString());
        }
        if ((m143393e(obj) ? ((wyl) obj).mo21018j1(4135, 0, null) : 0L) == 0 && this.f112809E == 3 && m143393e(obj)) {
            ((wyl) obj).mo21009g1(4108, 0, null);
        }
        return nmb0Var.toString();
    }
}
