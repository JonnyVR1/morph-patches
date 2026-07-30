package com.p051p1.mobile.putong.core.api;

import android.content.Context;
import android.content.Intent;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.data.ClientAction;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterActivities;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.GeoLocation;
import com.p051p1.mobile.putong.location.AbstractC13226a;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.a39;
import p153l.axa;
import p153l.b89;
import p153l.b8b;
import p153l.bq7;
import p153l.br8;
import p153l.c09;
import p153l.cb9;
import p153l.cd9;
import p153l.cf7;
import p153l.cn7;
import p153l.cob;
import p153l.cv6;
import p153l.cza;
import p153l.d19;
import p153l.d7a;
import p153l.dcb;
import p153l.dkb;
import p153l.dt8;
import p153l.dt9;
import p153l.dw6;
import p153l.dx6;
import p153l.dy6;
import p153l.e3c0;
import p153l.e59;
import p153l.e8a;
import p153l.ecj;
import p153l.ela;
import p153l.enb;
import p153l.eq7;
import p153l.esb;
import p153l.f49;
import p153l.f4a;
import p153l.fb9;
import p153l.fg7;
import p153l.ft9;
import p153l.fy6;
import p153l.g1y;
import p153l.gta;
import p153l.gy6;
import p153l.gya;
import p153l.h79;
import p153l.hlg;
import p153l.hva;
import p153l.icb;
import p153l.ina;
import p153l.j7b;
import p153l.jan;
import p153l.joa;
import p153l.jxd0;
import p153l.kcg0;
import p153l.kua;
import p153l.kva;
import p153l.l99;
import p153l.l9c;
import p153l.lc9;
import p153l.lqb;
import p153l.lu8;
import p153l.m27;
import p153l.m69;
import p153l.m6n;
import p153l.mk8;
import p153l.ml9;
import p153l.mq7;
import p153l.n87;
import p153l.nd9;
import p153l.no7;
import p153l.o7a;
import p153l.oqb;
import p153l.p4a;
import p153l.pcg0;
import p153l.pcj;
import p153l.pla;
import p153l.psd0;
import p153l.pwa;
import p153l.q16;
import p153l.q7b;
import p153l.qa9;
import p153l.qf7;
import p153l.qs8;
import p153l.qu6;
import p153l.qx6;
import p153l.r4a;
import p153l.r79;
import p153l.rl9;
import p153l.rnb;
import p153l.s07;
import p153l.s59;
import p153l.s99;
import p153l.sbb;
import p153l.sd8;
import p153l.se9;
import p153l.si20;
import p153l.sk9;
import p153l.sua;
import p153l.sw6;
import p153l.ta9;
import p153l.tqb;
import p153l.tx6;
import p153l.u7b;
import p153l.uab;
import p153l.uf7;
import p153l.ui80;
import p153l.uqb0;
import p153l.ura;
import p153l.usa;
import p153l.uwa;
import p153l.v99;
import p153l.vw6;
import p153l.wk4;
import p153l.wyd0;
import p153l.x20;
import p153l.x69;
import p153l.xab;
import p153l.xf9;
import p153l.y19;
import p153l.y20;
import p153l.y6b;
import p153l.yd9;
import p153l.yna;
import p153l.z99;
import p153l.ze9;
import p153l.zt9;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.c */
/* JADX INFO: loaded from: classes9.dex */
public class C4883c extends dy6 {

    /* JADX INFO: renamed from: R2 */
    public static ArrayList<WeakReference<C4883c>> f20290R2 = new ArrayList<>();

    /* JADX INFO: renamed from: A0 */
    public gy6 f20291A0;

    /* JADX INFO: renamed from: A1 */
    public b89 f20292A1;

    /* JADX INFO: renamed from: A2 */
    public e8a f20293A2;

    /* JADX INFO: renamed from: B0 */
    public C4886d0 f20294B0;

    /* JADX INFO: renamed from: B1 */
    public gya f20295B1;

    /* JADX INFO: renamed from: B2 */
    public sk9 f20296B2;

    /* JADX INFO: renamed from: C0 */
    public joa f20297C0;

    /* JADX INFO: renamed from: C1 */
    public fb9 f20298C1;

    /* JADX INFO: renamed from: C2 */
    public sd8 f20299C2;

    /* JADX INFO: renamed from: D0 */
    public C4907v f20300D0;

    /* JADX INFO: renamed from: D1 */
    public s59 f20301D1;

    /* JADX INFO: renamed from: D2 */
    public n87 f20302D2;

    /* JADX INFO: renamed from: E0 */
    public ina f20303E0;

    /* JADX INFO: renamed from: E1 */
    public cd9 f20304E1;

    /* JADX INFO: renamed from: E2 */
    public qu6 f20305E2;

    /* JADX INFO: renamed from: F0 */
    public dx6 f20306F0;

    /* JADX INFO: renamed from: F1 */
    public v99 f20307F1;

    /* JADX INFO: renamed from: F2 */
    public br8 f20308F2;

    /* JADX INFO: renamed from: G0 */
    public s07 f20309G0;

    /* JADX INFO: renamed from: G1 */
    public cob f20310G1;

    /* JADX INFO: renamed from: G2 */
    public lc9 f20311G2;

    /* JADX INFO: renamed from: H0 */
    public lqb f20312H0;

    /* JADX INFO: renamed from: H1 */
    public f49 f20313H1;

    /* JADX INFO: renamed from: H2 */
    public cb9 f20314H2;

    /* JADX INFO: renamed from: I0 */
    public jan f20315I0;

    /* JADX INFO: renamed from: I1 */
    public uf7 f20316I1;

    /* JADX INFO: renamed from: I2 */
    public String f20317I2;

    /* JADX INFO: renamed from: J0 */
    public m27 f20318J0;

    /* JADX INFO: renamed from: J1 */
    public C4903r f20319J1;

    /* JADX INFO: renamed from: J2 */
    public boolean f20320J2;

    /* JADX INFO: renamed from: K0 */
    public cza f20321K0;

    /* JADX INFO: renamed from: K1 */
    public C4893h f20322K1;

    /* JADX INFO: renamed from: K2 */
    public q16 f20323K2;

    /* JADX INFO: renamed from: L0 */
    public se9 f20324L0;

    /* JADX INFO: renamed from: L1 */
    public bq7 f20325L1;

    /* JADX INFO: renamed from: L2 */
    public ui80 f20326L2;

    /* JADX INFO: renamed from: M0 */
    public u7b f20327M0;

    /* JADX INFO: renamed from: M1 */
    public cn7 f20328M1;

    /* JADX INFO: renamed from: M2 */
    public esb f20329M2;

    /* JADX INFO: renamed from: N0 */
    public C4889f f20330N0;

    /* JADX INFO: renamed from: N1 */
    public wk4 f20331N1;

    /* JADX INFO: renamed from: N2 */
    public Location f20332N2;

    /* JADX INFO: renamed from: O0 */
    public CoreAutoPay f20333O0;

    /* JADX INFO: renamed from: O1 */
    public sbb f20334O1;

    /* JADX INFO: renamed from: O2 */
    public wyd0 f20335O2;

    /* JADX INFO: renamed from: P0 */
    public d7a f20336P0;

    /* JADX INFO: renamed from: P1 */
    public e59 f20337P1;

    /* JADX INFO: renamed from: P2 */
    public wyd0 f20338P2;

    /* JADX INFO: renamed from: Q0 */
    public dcb f20339Q0;

    /* JADX INFO: renamed from: Q1 */
    public C4905t f20340Q1;

    /* JADX INFO: renamed from: Q2 */
    public jxd0 f20341Q2;

    /* JADX INFO: renamed from: R0 */
    public rnb f20343R0;

    /* JADX INFO: renamed from: R1 */
    public qs8 f20344R1;

    /* JADX INFO: renamed from: S0 */
    public C4896k f20346S0;

    /* JADX INFO: renamed from: S1 */
    public d19 f20347S1;

    /* JADX INFO: renamed from: T */
    public final String f20348T;

    /* JADX INFO: renamed from: T0 */
    public Counter f20349T0;

    /* JADX INFO: renamed from: T1 */
    public hva f20350T1;

    /* JADX INFO: renamed from: U */
    public fy6 f20351U;

    /* JADX INFO: renamed from: U0 */
    public C22507a<Counter> f20352U0;

    /* JADX INFO: renamed from: U1 */
    public fg7 f20353U1;

    /* JADX INFO: renamed from: V */
    public fy6 f20354V;

    /* JADX INFO: renamed from: V0 */
    public jxd0 f20355V0;

    /* JADX INFO: renamed from: V1 */
    public p4a f20356V1;

    /* JADX INFO: renamed from: W */
    public eq7 f20357W;

    /* JADX INFO: renamed from: W0 */
    public boolean f20358W0;

    /* JADX INFO: renamed from: W1 */
    public mq7 f20359W1;

    /* JADX INFO: renamed from: X */
    public pwa f20360X;

    /* JADX INFO: renamed from: X0 */
    public boolean f20361X0;

    /* JADX INFO: renamed from: X1 */
    public nd9 f20362X1;

    /* JADX INFO: renamed from: Y */
    public C4908w f20363Y;

    /* JADX INFO: renamed from: Y0 */
    public r4a f20364Y0;

    /* JADX INFO: renamed from: Y1 */
    public qx6 f20365Y1;

    /* JADX INFO: renamed from: Z */
    public C4911z f20366Z;

    /* JADX INFO: renamed from: Z0 */
    public xf9 f20367Z0;

    /* JADX INFO: renamed from: Z1 */
    public ta9 f20368Z1;

    /* JADX INFO: renamed from: a0 */
    public sw6 f20369a0;

    /* JADX INFO: renamed from: a1 */
    public r79 f20370a1;

    /* JADX INFO: renamed from: a2 */
    public kva f20371a2;

    /* JADX INFO: renamed from: b0 */
    public vw6 f20372b0;

    /* JADX INFO: renamed from: b1 */
    public xab f20373b1;

    /* JADX INFO: renamed from: b2 */
    public h79 f20374b2;

    /* JADX INFO: renamed from: c0 */
    public ml9 f20375c0;

    /* JADX INFO: renamed from: c1 */
    public usa f20376c1;

    /* JADX INFO: renamed from: c2 */
    public dw6 f20377c2;

    /* JADX INFO: renamed from: d0 */
    public kua f20378d0;

    /* JADX INFO: renamed from: d1 */
    public C4909x f20379d1;

    /* JADX INFO: renamed from: d2 */
    public a39 f20380d2;

    /* JADX INFO: renamed from: e0 */
    public dkb f20381e0;

    /* JADX INFO: renamed from: e1 */
    public final uwa f20382e1;

    /* JADX INFO: renamed from: e2 */
    public pla f20383e2;

    /* JADX INFO: renamed from: f0 */
    public C4891g f20384f0;

    /* JADX INFO: renamed from: f1 */
    public lu8 f20385f1;

    /* JADX INFO: renamed from: f2 */
    public y6b f20386f2;

    /* JADX INFO: renamed from: g0 */
    public C4887e f20387g0;

    /* JADX INFO: renamed from: g1 */
    public m6n f20388g1;

    /* JADX INFO: renamed from: g2 */
    public tqb f20389g2;

    /* JADX INFO: renamed from: h0 */
    public c09 f20390h0;

    /* JADX INFO: renamed from: h1 */
    public o7a f20391h1;

    /* JADX INFO: renamed from: h2 */
    public no7 f20392h2;

    /* JADX INFO: renamed from: i0 */
    public C4885d f20393i0;

    /* JADX INFO: renamed from: i1 */
    public y19 f20394i1;

    /* JADX INFO: renamed from: i2 */
    public sua f20395i2;

    /* JADX INFO: renamed from: j0 */
    public CoreProduct f20396j0;

    /* JADX INFO: renamed from: j1 */
    public CoreInnerPush f20397j1;

    /* JADX INFO: renamed from: j2 */
    public e3c0 f20398j2;

    /* JADX INFO: renamed from: k0 */
    public C4902q f20399k0;

    /* JADX INFO: renamed from: k1 */
    public ela f20400k1;

    /* JADX INFO: renamed from: k2 */
    public j7b f20401k2;

    /* JADX INFO: renamed from: l0 */
    public g1y f20402l0;

    /* JADX INFO: renamed from: l1 */
    public C4900o f20403l1;

    /* JADX INFO: renamed from: l2 */
    public cf7 f20404l2;

    /* JADX INFO: renamed from: m0 */
    public CoreSuggested f20405m0;

    /* JADX INFO: renamed from: m1 */
    public C4904s f20406m1;

    /* JADX INFO: renamed from: m2 */
    public f4a f20407m2;

    /* JADX INFO: renamed from: n0 */
    public C4882b0 f20408n0;

    /* JADX INFO: renamed from: n1 */
    public C4898m f20409n1;

    /* JADX INFO: renamed from: n2 */
    public enb f20410n2;

    /* JADX INFO: renamed from: o0 */
    public C4899n f20411o0;

    /* JADX INFO: renamed from: o1 */
    public dt9 f20412o1;

    /* JADX INFO: renamed from: o2 */
    public qf7 f20413o2;

    /* JADX INFO: renamed from: p0 */
    public z99 f20414p0;

    /* JADX INFO: renamed from: p1 */
    public CoreAudioMatch f20415p1;

    /* JADX INFO: renamed from: p2 */
    public s99 f20416p2;

    /* JADX INFO: renamed from: q0 */
    public oqb f20417q0;

    /* JADX INFO: renamed from: q1 */
    public C4894i f20418q1;

    /* JADX INFO: renamed from: q2 */
    public ura f20419q2;

    /* JADX INFO: renamed from: r0 */
    public C4895j f20420r0;

    /* JADX INFO: renamed from: r1 */
    public tx6 f20421r1;

    /* JADX INFO: renamed from: r2 */
    public mk8 f20422r2;

    /* JADX INFO: renamed from: s0 */
    public rl9 f20423s0;

    /* JADX INFO: renamed from: s1 */
    public C4901p f20424s1;

    /* JADX INFO: renamed from: s2 */
    public hlg f20425s2;

    /* JADX INFO: renamed from: t0 */
    public CoreAITranslate f20426t0;

    /* JADX INFO: renamed from: t1 */
    public RunnableC4884c0 f20427t1;

    /* JADX INFO: renamed from: t2 */
    public yd9 f20428t2;

    /* JADX INFO: renamed from: u0 */
    public CoreLikers f20429u0;

    /* JADX INFO: renamed from: u1 */
    public ft9 f20430u1;

    /* JADX INFO: renamed from: u2 */
    public icb f20431u2;

    /* JADX INFO: renamed from: v0 */
    public l99 f20432v0;

    /* JADX INFO: renamed from: v1 */
    public dt8 f20433v1;

    /* JADX INFO: renamed from: v2 */
    public qa9 f20434v2;

    /* JADX INFO: renamed from: w0 */
    public x69 f20435w0;

    /* JADX INFO: renamed from: w1 */
    public b8b f20436w1;

    /* JADX INFO: renamed from: w2 */
    public zt9 f20437w2;

    /* JADX INFO: renamed from: x0 */
    public CoreIntlAffiliatePromotions f20438x0;

    /* JADX INFO: renamed from: x1 */
    public axa f20439x1;

    /* JADX INFO: renamed from: x2 */
    public cv6 f20440x2;

    /* JADX INFO: renamed from: y0 */
    public q7b f20441y0;

    /* JADX INFO: renamed from: y1 */
    public ze9 f20442y1;

    /* JADX INFO: renamed from: y2 */
    public yna f20443y2;

    /* JADX INFO: renamed from: z0 */
    public uab f20444z0;

    /* JADX INFO: renamed from: z1 */
    public m69 f20445z1;

    /* JADX INFO: renamed from: z2 */
    public CoreJustVerificationCardApi f20446z2;

    /* JADX INFO: renamed from: R */
    public long f20342R = 0;

    /* JADX INFO: renamed from: S */
    public boolean f20345S = false;

    public C4883c() {
        f20290R2.add(new WeakReference<>(this));
        String strUserId = CoreModule.m30929H().userId();
        this.f20348T = strUserId;
        fy6 fy6Var = new fy6();
        this.f20351U = fy6Var;
        this.f20354V = fy6Var;
        this.f20357W = new eq7(this);
        this.f20360X = new pwa(this);
        this.f20363Y = new C4908w(this);
        this.f20366Z = new C4911z(this);
        this.f20369a0 = new sw6(this);
        this.f20372b0 = new vw6(this);
        this.f20375c0 = new ml9(this);
        this.f20378d0 = new kua(this);
        this.f20381e0 = new dkb(this, strUserId);
        this.f20384f0 = new C4891g(this);
        this.f20387g0 = new C4887e(this);
        this.f20390h0 = new c09(this);
        this.f20393i0 = new C4885d(this);
        this.f20396j0 = new CoreProduct(this);
        this.f20399k0 = new C4902q(this);
        this.f20402l0 = new g1y();
        this.f20405m0 = new CoreSuggested(this);
        this.f20408n0 = new C4882b0(this);
        this.f20411o0 = new C4899n(this);
        this.f20414p0 = new z99(this);
        this.f20417q0 = new oqb(this);
        this.f20420r0 = new C4895j(this);
        this.f20423s0 = new rl9(this);
        this.f20426t0 = new CoreAITranslate(this);
        this.f20429u0 = new CoreLikers(this);
        this.f20432v0 = new l99(this);
        this.f20435w0 = new x69(this);
        this.f20438x0 = new CoreIntlAffiliatePromotions(this);
        this.f20441y0 = new q7b(this);
        this.f20444z0 = new uab(this);
        this.f20291A0 = new gy6(this);
        this.f20294B0 = new C4886d0(this);
        this.f20297C0 = new joa(this);
        this.f20300D0 = new C4907v(this);
        this.f20303E0 = new ina(this);
        this.f20306F0 = new dx6(this);
        this.f20309G0 = new s07(this);
        this.f20312H0 = new lqb(this);
        this.f20315I0 = new jan(this);
        this.f20318J0 = new m27(this);
        this.f20321K0 = new cza(this);
        this.f20324L0 = new se9(this);
        this.f20327M0 = new u7b(this);
        this.f20330N0 = new C4889f(this);
        this.f20333O0 = new CoreAutoPay(this);
        this.f20336P0 = new d7a(this);
        this.f20339Q0 = new dcb(this);
        this.f20343R0 = new rnb(this);
        this.f20346S0 = new C4896k(this);
        this.f20349T0 = null;
        this.f20352U0 = C22507a.m222758b();
        Boolean bool = Boolean.FALSE;
        this.f20355V0 = new jxd0("show_see_list_rule_" + strUserId, bool);
        this.f20358W0 = false;
        this.f20361X0 = false;
        this.f20364Y0 = new r4a();
        this.f20367Z0 = new xf9(this);
        this.f20370a1 = new r79(this);
        this.f20373b1 = new xab(this);
        this.f20376c1 = new usa(this);
        this.f20379d1 = new C4909x(this);
        this.f20382e1 = new uwa(this);
        this.f20385f1 = new lu8(this);
        this.f20388g1 = new m6n();
        this.f20391h1 = new o7a(this);
        this.f20394i1 = new y19(this);
        this.f20397j1 = new CoreInnerPush();
        this.f20400k1 = new ela(this);
        this.f20403l1 = new C4900o(this);
        this.f20406m1 = new C4904s(this);
        this.f20409n1 = new C4898m(this);
        this.f20412o1 = new dt9(this);
        this.f20415p1 = new CoreAudioMatch(this);
        this.f20418q1 = new C4894i(this);
        this.f20421r1 = new tx6(this);
        this.f20424s1 = new C4901p(this);
        this.f20427t1 = new RunnableC4884c0();
        this.f20430u1 = new ft9(this);
        this.f20433v1 = new dt8(this);
        this.f20436w1 = new b8b();
        this.f20439x1 = new axa();
        this.f20442y1 = new ze9();
        this.f20445z1 = new m69();
        this.f20292A1 = new b89();
        this.f20295B1 = new gya();
        this.f20298C1 = new fb9();
        this.f20301D1 = new s59();
        this.f20304E1 = new cd9(this);
        this.f20307F1 = new v99();
        this.f20310G1 = new cob();
        this.f20313H1 = new f49(this);
        this.f20316I1 = new uf7(this);
        this.f20319J1 = new C4903r(this);
        this.f20322K1 = new C4893h(this);
        this.f20325L1 = new bq7();
        this.f20328M1 = new cn7(this);
        this.f20331N1 = new wk4(this);
        this.f20334O1 = new sbb(this);
        this.f20337P1 = new e59(this);
        this.f20340Q1 = new C4905t(this);
        this.f20344R1 = new qs8(this);
        this.f20347S1 = new d19(this);
        this.f20350T1 = new hva(this);
        this.f20353U1 = new fg7(this);
        this.f20356V1 = new p4a(this);
        this.f20359W1 = new mq7(this);
        this.f20362X1 = new nd9(this);
        this.f20365Y1 = new qx6(this);
        this.f20368Z1 = new ta9(this);
        this.f20371a2 = new kva(this);
        this.f20374b2 = new h79(this);
        this.f20377c2 = new dw6(this);
        this.f20380d2 = new a39(this);
        this.f20383e2 = new pla(this);
        this.f20386f2 = new y6b(this);
        this.f20389g2 = new tqb(this);
        this.f20392h2 = new no7(this);
        this.f20395i2 = new sua(this);
        this.f20398j2 = new e3c0(this);
        this.f20401k2 = new j7b(this);
        this.f20404l2 = new cf7(this);
        this.f20407m2 = new f4a(this);
        this.f20410n2 = new enb(this);
        this.f20413o2 = new qf7(this);
        this.f20416p2 = new s99();
        this.f20419q2 = new ura(this);
        this.f20422r2 = new mk8(this);
        this.f20425s2 = new hlg(this);
        this.f20428t2 = new yd9(this);
        this.f20431u2 = new icb(this);
        this.f20434v2 = new qa9(this);
        this.f20437w2 = new zt9(this);
        this.f20440x2 = new cv6(this);
        this.f20443y2 = new yna(this);
        this.f20446z2 = new CoreJustVerificationCardApi(this);
        this.f20293A2 = new e8a(this);
        this.f20296B2 = new sk9(this);
        this.f20299C2 = new sd8(this);
        this.f20302D2 = new n87(this);
        this.f20305E2 = new qu6();
        this.f20308F2 = new br8(this);
        this.f20311G2 = new lc9(this);
        this.f20314H2 = new cb9(this);
        this.f20317I2 = "";
        this.f20320J2 = false;
        this.f20323K2 = new q16(this);
        this.f20326L2 = new ui80();
        this.f20329M2 = new esb();
        this.f20332N2 = null;
        this.f20335O2 = new wyd0("good2fake_alert", "");
        this.f20338P2 = new wyd0("studentVerificationReason_alert", "");
        this.f20341Q2 = new jxd0("refreshAtNewUi" + strUserId, bool);
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ void m32467b3(Throwable th) {
    }

    /* JADX INFO: renamed from: A3 */
    public Intent m32472A3(Context context, boolean z, boolean z2) {
        return gta.m132210e().m132214d().mo34964zm(context, z, z2);
    }

    /* JADX INFO: renamed from: B3 */
    public void m32473B3() {
        CoreModule.f18264c.f20405m0.m32146s6("initiative", "cold", null);
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
        CoreModule.f18264c.f20312H0.m155449k5();
        if (CoreModule.m30930K().mo31838xf()) {
            CoreModule.f18264c.f20315I0.m144059P3();
        }
        CoreModule.f18264c.f20384f0.m33653Fo();
        CoreModule.f18264c.f20294B0.m32620p4(CoreModule.m30929H().userId());
        CoreModule.f18264c.f20384f0.m33614Co();
        if (gta.m132210e().m132214d().mo34700Hg() || gta.m132210e().m132214d().mo34844h5()) {
            CoreModule.f18264c.f20306F0.m118454q3();
        }
        CoreModule.f18264c.f20381e0.m116557ea();
        CoreModule.f18264c.f20405m0.m32131n6();
        CoreModule.f18264c.f20384f0.f20621M2.m159280q();
        CoreModule.f18264c.f20384f0.f20621M2.m159274k().subscribe();
        CoreModule.f18264c.f20312H0.m155447j5();
        if (gta.m132210e().m132214d().mo34869k()) {
            CoreModule.f18264c.f20400k1.m121123A3();
        }
    }

    /* JADX INFO: renamed from: C3 */
    public void m32474C3() {
        if (gta.m132210e().m132214d().mo34869k()) {
            CoreModule.f18264c.f20400k1.m121123A3();
        }
        CoreModule.f18264c.f20294B0.m32620p4(this.f20348T);
        CoreModule.f18264c.f20405m0.m32130m8();
        CoreModule.f18264c.f20366Z.f20884S.m159280q();
        CoreModule.f18264c.f20378d0.f128826R.m159280q();
        CoreModule.f18264c.f20381e0.m116557ea();
        CoreModule.f18264c.f20393i0.f20482S.m159280q();
        if (gta.m132210e().m132214d().mo34906q()) {
            CoreModule.f18264c.f20366Z.f20885T.m159280q();
        }
    }

    /* JADX INFO: renamed from: D3 */
    public kcg0 m32475D3() {
        uqb0.f180370E.m80052u(Constants.INBOX_V2_THROTTLE_WINDOW_MS);
        return pcg0.m171650c(uqb0.f180370E.m80047p().subscribe(psd0.m173596G(new y20() { // from class: l.yx6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201933a.m32491s3((Location) obj);
            }
        })), this.f20402l0.m128579f(), this.f20326L2.m196149i(), this.f20329M2.m122313h(), pcg0.m171648a(new x20() { // from class: l.zx6
            @Override // p153l.x20
            public final void call() {
                this.f206440a.m32492t3();
            }
        }));
    }

    /* JADX INFO: renamed from: E3 */
    public void m32476E3(Counter counter) {
        Counter counter2 = this.f20349T0;
        if (counter2 == null) {
            this.f20349T0 = counter;
        } else {
            counter.mergeData(counter2);
            this.f20349T0 = counter;
        }
        this.f20352U0.onNext(this.f20349T0);
    }

    /* JADX INFO: renamed from: F3 */
    public void m32477F3(Counter counter) {
        this.f20349T0 = counter;
    }

    /* JADX INFO: renamed from: G3 */
    public void m32478G3(int i) {
        Counter counter = this.f20349T0;
        if (counter == null || i <= 0) {
            return;
        }
        CounterActivities counterActivities = counter.activities;
        int i2 = counterActivities.unread - i;
        counterActivities.unread = i2;
        counterActivities.unread = Math.max(0, i2);
        this.f20352U0.onNext(this.f20349T0);
    }

    /* JADX INFO: renamed from: g3 */
    public void m32479g3() {
        Counter counter = this.f20349T0;
        if (counter != null) {
            counter.activities.unread = 0;
            counter.moments.unreadMomentLikes = 0;
            this.f20352U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: h3 */
    public void m32480h3() {
        Counter counter = this.f20349T0;
        if (counter != null) {
            counter.activities.unread = counter.followships.unreadFollowers;
            counter.moments.unreadMomentLikes = 0;
            this.f20352U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: i3 */
    public void m32481i3() {
        Counter counter = this.f20349T0;
        if (counter != null) {
            counter.viewers.unread = 0;
            this.f20352U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: j3 */
    public void m32482j3() {
        Counter counter = this.f20349T0;
        if (counter != null) {
            counter.followships.unreadFollowers = 0;
            this.f20352U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: k3 */
    public void m32483k3() {
        Counter counter = this.f20349T0;
        if (counter != null) {
            counter.moments.unreadMomentLikes = 0;
            this.f20352U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: l3 */
    public void m32484l3() {
        Counter counter = this.f20349T0;
        if (counter != null) {
            counter.mytantan.unread = 0;
            this.f20352U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: m3 */
    public void m32485m3() {
        Counter counter = this.f20349T0;
        if (counter != null) {
            counter.moments.unreadLikeFeeds = 0;
            this.f20352U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public C22421c<Counter> m32486n3() {
        return this.f20352U0.doOnNext(new y20() { // from class: l.xx6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196607a.m32489q3((Counter) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public Counter m32487o3() {
        return this.f20349T0;
    }

    /* JADX INFO: renamed from: p3 */
    public long m32488p3() {
        return CoreModule.m30930K().mo31838xf() ? this.f20315I0.m144054K3() : this.f20312H0.m155435Y4();
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m32489q3(Counter counter) {
        boolean z = this.f20361X0;
        boolean zMo34364Ld = CoreModule.m30933P().m143405a().mo34364Ld(counter);
        this.f20361X0 = !zMo34364Ld;
        if (!this.f20358W0 || z || zMo34364Ld) {
            return;
        }
        this.f20355V0.put(Boolean.TRUE);
        this.f20358W0 = false;
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m32490r3(Location location, Envelope envelope) {
        this.f20332N2 = location;
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m32491s3(Location location) {
        if (this.f20332N2 == null) {
            this.f20332N2 = location;
        } else {
            if (!NullChecker.m82486a(location) || AbstractC13226a.m80039f(this.f20332N2.m80014u(), location.m80014u(), this.f20332N2.m80016x(), location.m80016x(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) < 500.0d) {
                return;
            }
            m32493u3(location);
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m32492t3() {
        clearRequestsAndStop();
        this.f20378d0.f128826R.m159278o();
        this.f20366Z.m35920i3();
        ecj.m120372F();
        this.f20323K2.close();
        this.f20384f0.m33977gq();
    }

    /* JADX INFO: renamed from: u3 */
    public final void m32493u3(final Location location) {
        CoreModule.f18264c.f20381e0.f89372z1.put("");
        final GeoLocation geoLocation = new GeoLocation();
        geoLocation.coordinates = new DoublePair(location.m80014u(), location.m80016x());
        geoLocation.intent = ClientAction.get(ClientAction.backgroundChange);
        geoLocation.uncertainty = (int) location.m80012s();
        new si20(new pcj() { // from class: l.ay6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(C4879a.m32216J0("/locations")).m209038l(z1d0.create(Network.JSON, geoLocation.toJson())).m209028b();
            }
        }, Envelope.JSON_ADAPTER).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.by6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78987a.m32490r3(location, (Envelope) obj);
            }
        }, new y20() { // from class: l.cy6
            @Override // p153l.y20
            public final void call(Object obj) {
                C4883c.m32467b3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v3 */
    public void m32494v3(Counter counter) {
        if (counter == null || counter.equals(this.f20349T0)) {
            return;
        }
        Counter counter2 = this.f20349T0;
        if (counter2 != null) {
            counter.mergeData(counter2);
        }
        this.f20349T0 = counter;
        this.f20352U0.onNext(counter);
    }

    /* JADX INFO: renamed from: w3 */
    public void m32495w3(Envelope envelope, x20 x20Var) {
        m32497y3(envelope, x20Var, false, false, false);
    }

    /* JADX INFO: renamed from: x3 */
    public void m32496x3(Envelope envelope, x20 x20Var, boolean z) {
        m32497y3(envelope, x20Var, z, false, false);
    }

    /* JADX INFO: renamed from: y3 */
    public void m32497y3(Envelope envelope, x20 x20Var, boolean z, boolean z2, boolean z3) {
        if (envelope != null) {
            this.f20323K2.m174828B(envelope);
        }
        l9c.m153394o().m153416x(envelope, x20Var, z, z2, z3);
    }

    /* JADX INFO: renamed from: z3 */
    public Intent m32498z3(Context context, boolean z) {
        return gta.m132210e().m132214d().newMainActClearStack(context, z);
    }
}
