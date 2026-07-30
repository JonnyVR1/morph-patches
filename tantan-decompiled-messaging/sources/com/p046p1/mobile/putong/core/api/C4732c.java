package com.p046p1.mobile.putong.core.api;

import android.content.Context;
import android.content.Intent;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.data.ClientAction;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterActivities;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.GeoLocation;
import com.p046p1.mobile.putong.location.AbstractC13063a;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.ap7;
import p149l.apb;
import p149l.av6;
import p149l.avb0;
import p149l.aw6;
import p149l.ax6;
import p149l.bf7;
import p149l.c4g0;
import p149l.c6a;
import p149l.c89;
import p149l.cb9;
import p149l.cx6;
import p149l.d30;
import p149l.d3a;
import p149l.d59;
import p149l.d6b;
import p149l.dk9;
import p149l.dka;
import p149l.dmb;
import p149l.dva;
import p149l.dx6;
import p149l.e30;
import p149l.ec9;
import p149l.et8;
import p149l.f3a;
import p149l.f8c;
import p149l.fab;
import p149l.fpb;
import p149l.gta;
import p149l.h4g0;
import p149l.h6b;
import p149l.h99;
import p149l.h9b;
import p149l.hpd0;
import p149l.i69;
import p149l.ij8;
import p149l.ik9;
import p149l.ip7;
import p149l.iqa;
import p149l.ira;
import p149l.iva;
import p149l.j17;
import p149l.j49;
import p149l.j77;
import p149l.j89;
import p149l.j8n;
import p149l.jd9;
import p149l.jj9;
import p149l.jn7;
import p149l.jsx;
import p149l.k99;
import p149l.k9b;
import p149l.k9j;
import p149l.ka20;
import p149l.l06;
import p149l.l5b;
import p149l.lr8;
import p149l.m4n;
import p149l.m89;
import p149l.me7;
import p149l.mkd0;
import p149l.mma;
import p149l.nt6;
import p149l.nw6;
import p149l.o59;
import p149l.o6b;
import p149l.oa80;
import p149l.oc8;
import p149l.oe9;
import p149l.omb;
import p149l.os9;
import p149l.ova;
import p149l.pc9;
import p149l.pib;
import p149l.pv6;
import p149l.pz6;
import p149l.q09;
import p149l.q89;
import p149l.qab;
import p149l.qd9;
import p149l.qe7;
import p149l.qib0;
import p149l.qlb;
import p149l.qqb;
import p149l.qw6;
import p149l.qxa;
import p149l.r5a;
import p149l.s19;
import p149l.s69;
import p149l.s6a;
import p149l.sja;
import p149l.sr9;
import p149l.sv6;
import p149l.t99;
import p149l.tb9;
import p149l.tjg;
import p149l.u2a;
import p149l.uab;
import p149l.uqd0;
import p149l.ur9;
import p149l.ura;
import p149l.uwa;
import p149l.uy8;
import p149l.v39;
import p149l.v9j;
import p149l.vta;
import p149l.vz8;
import p149l.w29;
import p149l.w5b;
import p149l.w99;
import p149l.wla;
import p149l.wp8;
import p149l.wr8;
import p149l.xj4;
import p149l.xma;
import p149l.xo7;
import p149l.xob;
import p149l.y59;
import p149l.yd7;
import p149l.yl7;
import p149l.ysa;
import p149l.yta;
import p149l.zt6;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.c */
/* JADX INFO: loaded from: classes9.dex */
public class C4732c extends ax6 {

    /* JADX INFO: renamed from: R2 */
    public static ArrayList<WeakReference<C4732c>> f19548R2 = new ArrayList<>();

    /* JADX INFO: renamed from: A0 */
    public dx6 f19549A0;

    /* JADX INFO: renamed from: A1 */
    public s69 f19550A1;

    /* JADX INFO: renamed from: A2 */
    public s6a f19551A2;

    /* JADX INFO: renamed from: B0 */
    public C4735d0 f19552B0;

    /* JADX INFO: renamed from: B1 */
    public uwa f19553B1;

    /* JADX INFO: renamed from: B2 */
    public jj9 f19554B2;

    /* JADX INFO: renamed from: C0 */
    public xma f19555C0;

    /* JADX INFO: renamed from: C1 */
    public w99 f19556C1;

    /* JADX INFO: renamed from: C2 */
    public oc8 f19557C2;

    /* JADX INFO: renamed from: D0 */
    public C4756v f19558D0;

    /* JADX INFO: renamed from: D1 */
    public j49 f19559D1;

    /* JADX INFO: renamed from: D2 */
    public j77 f19560D2;

    /* JADX INFO: renamed from: E0 */
    public wla f19561E0;

    /* JADX INFO: renamed from: E1 */
    public tb9 f19562E1;

    /* JADX INFO: renamed from: E2 */
    public nt6 f19563E2;

    /* JADX INFO: renamed from: F0 */
    public aw6 f19564F0;

    /* JADX INFO: renamed from: F1 */
    public m89 f19565F1;

    /* JADX INFO: renamed from: F2 */
    public wp8 f19566F2;

    /* JADX INFO: renamed from: G0 */
    public pz6 f19567G0;

    /* JADX INFO: renamed from: G1 */
    public omb f19568G1;

    /* JADX INFO: renamed from: G2 */
    public cb9 f19569G2;

    /* JADX INFO: renamed from: H0 */
    public xob f19570H0;

    /* JADX INFO: renamed from: H1 */
    public w29 f19571H1;

    /* JADX INFO: renamed from: H2 */
    public t99 f19572H2;

    /* JADX INFO: renamed from: I0 */
    public j8n f19573I0;

    /* JADX INFO: renamed from: I1 */
    public qe7 f19574I1;

    /* JADX INFO: renamed from: I2 */
    public String f19575I2;

    /* JADX INFO: renamed from: J0 */
    public j17 f19576J0;

    /* JADX INFO: renamed from: J1 */
    public C4752r f19577J1;

    /* JADX INFO: renamed from: J2 */
    public boolean f19578J2;

    /* JADX INFO: renamed from: K0 */
    public qxa f19579K0;

    /* JADX INFO: renamed from: K1 */
    public C4742h f19580K1;

    /* JADX INFO: renamed from: K2 */
    public l06 f19581K2;

    /* JADX INFO: renamed from: L0 */
    public jd9 f19582L0;

    /* JADX INFO: renamed from: L1 */
    public xo7 f19583L1;

    /* JADX INFO: renamed from: L2 */
    public oa80 f19584L2;

    /* JADX INFO: renamed from: M0 */
    public h6b f19585M0;

    /* JADX INFO: renamed from: M1 */
    public yl7 f19586M1;

    /* JADX INFO: renamed from: M2 */
    public qqb f19587M2;

    /* JADX INFO: renamed from: N0 */
    public C4738f f19588N0;

    /* JADX INFO: renamed from: N1 */
    public xj4 f19589N1;

    /* JADX INFO: renamed from: N2 */
    public Location f19590N2;

    /* JADX INFO: renamed from: O0 */
    public CoreAutoPay f19591O0;

    /* JADX INFO: renamed from: O1 */
    public fab f19592O1;

    /* JADX INFO: renamed from: O2 */
    public uqd0 f19593O2;

    /* JADX INFO: renamed from: P0 */
    public r5a f19594P0;

    /* JADX INFO: renamed from: P1 */
    public v39 f19595P1;

    /* JADX INFO: renamed from: P2 */
    public uqd0 f19596P2;

    /* JADX INFO: renamed from: Q0 */
    public qab f19597Q0;

    /* JADX INFO: renamed from: Q1 */
    public C4754t f19598Q1;

    /* JADX INFO: renamed from: Q2 */
    public hpd0 f19599Q2;

    /* JADX INFO: renamed from: R0 */
    public dmb f19601R0;

    /* JADX INFO: renamed from: R1 */
    public lr8 f19602R1;

    /* JADX INFO: renamed from: S0 */
    public C4745k f19604S0;

    /* JADX INFO: renamed from: S1 */
    public vz8 f19605S1;

    /* JADX INFO: renamed from: T */
    public final String f19606T;

    /* JADX INFO: renamed from: T0 */
    public Counter f19607T0;

    /* JADX INFO: renamed from: T1 */
    public vta f19608T1;

    /* JADX INFO: renamed from: U */
    public cx6 f19609U;

    /* JADX INFO: renamed from: U0 */
    public C22392a<Counter> f19610U0;

    /* JADX INFO: renamed from: U1 */
    public bf7 f19611U1;

    /* JADX INFO: renamed from: V */
    public cx6 f19612V;

    /* JADX INFO: renamed from: V0 */
    public hpd0 f19613V0;

    /* JADX INFO: renamed from: V1 */
    public d3a f19614V1;

    /* JADX INFO: renamed from: W */
    public ap7 f19615W;

    /* JADX INFO: renamed from: W0 */
    public boolean f19616W0;

    /* JADX INFO: renamed from: W1 */
    public ip7 f19617W1;

    /* JADX INFO: renamed from: X */
    public dva f19618X;

    /* JADX INFO: renamed from: X0 */
    public boolean f19619X0;

    /* JADX INFO: renamed from: X1 */
    public ec9 f19620X1;

    /* JADX INFO: renamed from: Y */
    public C4757w f19621Y;

    /* JADX INFO: renamed from: Y0 */
    public f3a f19622Y0;

    /* JADX INFO: renamed from: Y1 */
    public nw6 f19623Y1;

    /* JADX INFO: renamed from: Z */
    public C4760z f19624Z;

    /* JADX INFO: renamed from: Z0 */
    public oe9 f19625Z0;

    /* JADX INFO: renamed from: Z1 */
    public k99 f19626Z1;

    /* JADX INFO: renamed from: a0 */
    public pv6 f19627a0;

    /* JADX INFO: renamed from: a1 */
    public i69 f19628a1;

    /* JADX INFO: renamed from: a2 */
    public yta f19629a2;

    /* JADX INFO: renamed from: b0 */
    public sv6 f19630b0;

    /* JADX INFO: renamed from: b1 */
    public k9b f19631b1;

    /* JADX INFO: renamed from: b2 */
    public y59 f19632b2;

    /* JADX INFO: renamed from: c0 */
    public dk9 f19633c0;

    /* JADX INFO: renamed from: c1 */
    public ira f19634c1;

    /* JADX INFO: renamed from: c2 */
    public av6 f19635c2;

    /* JADX INFO: renamed from: d0 */
    public ysa f19636d0;

    /* JADX INFO: renamed from: d1 */
    public C4758x f19637d1;

    /* JADX INFO: renamed from: d2 */
    public s19 f19638d2;

    /* JADX INFO: renamed from: e0 */
    public pib f19639e0;

    /* JADX INFO: renamed from: e1 */
    public final iva f19640e1;

    /* JADX INFO: renamed from: e2 */
    public dka f19641e2;

    /* JADX INFO: renamed from: f0 */
    public C4740g f19642f0;

    /* JADX INFO: renamed from: f1 */
    public et8 f19643f1;

    /* JADX INFO: renamed from: f2 */
    public l5b f19644f2;

    /* JADX INFO: renamed from: g0 */
    public C4736e f19645g0;

    /* JADX INFO: renamed from: g1 */
    public m4n f19646g1;

    /* JADX INFO: renamed from: g2 */
    public fpb f19647g2;

    /* JADX INFO: renamed from: h0 */
    public uy8 f19648h0;

    /* JADX INFO: renamed from: h1 */
    public c6a f19649h1;

    /* JADX INFO: renamed from: h2 */
    public jn7 f19650h2;

    /* JADX INFO: renamed from: i0 */
    public C4734d f19651i0;

    /* JADX INFO: renamed from: i1 */
    public q09 f19652i1;

    /* JADX INFO: renamed from: i2 */
    public gta f19653i2;

    /* JADX INFO: renamed from: j0 */
    public CoreProduct f19654j0;

    /* JADX INFO: renamed from: j1 */
    public CoreInnerPush f19655j1;

    /* JADX INFO: renamed from: j2 */
    public avb0 f19656j2;

    /* JADX INFO: renamed from: k0 */
    public C4751q f19657k0;

    /* JADX INFO: renamed from: k1 */
    public sja f19658k1;

    /* JADX INFO: renamed from: k2 */
    public w5b f19659k2;

    /* JADX INFO: renamed from: l0 */
    public jsx f19660l0;

    /* JADX INFO: renamed from: l1 */
    public C4749o f19661l1;

    /* JADX INFO: renamed from: l2 */
    public yd7 f19662l2;

    /* JADX INFO: renamed from: m0 */
    public CoreSuggested f19663m0;

    /* JADX INFO: renamed from: m1 */
    public C4753s f19664m1;

    /* JADX INFO: renamed from: m2 */
    public u2a f19665m2;

    /* JADX INFO: renamed from: n0 */
    public C4731b0 f19666n0;

    /* JADX INFO: renamed from: n1 */
    public C4747m f19667n1;

    /* JADX INFO: renamed from: n2 */
    public qlb f19668n2;

    /* JADX INFO: renamed from: o0 */
    public C4748n f19669o0;

    /* JADX INFO: renamed from: o1 */
    public sr9 f19670o1;

    /* JADX INFO: renamed from: o2 */
    public me7 f19671o2;

    /* JADX INFO: renamed from: p0 */
    public q89 f19672p0;

    /* JADX INFO: renamed from: p1 */
    public CoreAudioMatch f19673p1;

    /* JADX INFO: renamed from: p2 */
    public j89 f19674p2;

    /* JADX INFO: renamed from: q0 */
    public apb f19675q0;

    /* JADX INFO: renamed from: q1 */
    public C4743i f19676q1;

    /* JADX INFO: renamed from: q2 */
    public iqa f19677q2;

    /* JADX INFO: renamed from: r0 */
    public C4744j f19678r0;

    /* JADX INFO: renamed from: r1 */
    public qw6 f19679r1;

    /* JADX INFO: renamed from: r2 */
    public ij8 f19680r2;

    /* JADX INFO: renamed from: s0 */
    public ik9 f19681s0;

    /* JADX INFO: renamed from: s1 */
    public C4750p f19682s1;

    /* JADX INFO: renamed from: s2 */
    public tjg f19683s2;

    /* JADX INFO: renamed from: t0 */
    public CoreAITranslate f19684t0;

    /* JADX INFO: renamed from: t1 */
    public RunnableC4733c0 f19685t1;

    /* JADX INFO: renamed from: t2 */
    public pc9 f19686t2;

    /* JADX INFO: renamed from: u0 */
    public CoreLikers f19687u0;

    /* JADX INFO: renamed from: u1 */
    public ur9 f19688u1;

    /* JADX INFO: renamed from: u2 */
    public uab f19689u2;

    /* JADX INFO: renamed from: v0 */
    public c89 f19690v0;

    /* JADX INFO: renamed from: v1 */
    public wr8 f19691v1;

    /* JADX INFO: renamed from: v2 */
    public h99 f19692v2;

    /* JADX INFO: renamed from: w0 */
    public o59 f19693w0;

    /* JADX INFO: renamed from: w1 */
    public o6b f19694w1;

    /* JADX INFO: renamed from: w2 */
    public os9 f19695w2;

    /* JADX INFO: renamed from: x0 */
    public CoreIntlAffiliatePromotions f19696x0;

    /* JADX INFO: renamed from: x1 */
    public ova f19697x1;

    /* JADX INFO: renamed from: x2 */
    public zt6 f19698x2;

    /* JADX INFO: renamed from: y0 */
    public d6b f19699y0;

    /* JADX INFO: renamed from: y1 */
    public qd9 f19700y1;

    /* JADX INFO: renamed from: y2 */
    public mma f19701y2;

    /* JADX INFO: renamed from: z0 */
    public h9b f19702z0;

    /* JADX INFO: renamed from: z1 */
    public d59 f19703z1;

    /* JADX INFO: renamed from: z2 */
    public CoreJustVerificationCardApi f19704z2;

    /* JADX INFO: renamed from: R */
    public long f19600R = 0;

    /* JADX INFO: renamed from: S */
    public boolean f19603S = false;

    public C4732c() {
        f19548R2.add(new WeakReference<>(this));
        String strUserId = CoreModule.m29931H().userId();
        this.f19606T = strUserId;
        cx6 cx6Var = new cx6();
        this.f19609U = cx6Var;
        this.f19612V = cx6Var;
        this.f19615W = new ap7(this);
        this.f19618X = new dva(this);
        this.f19621Y = new C4757w(this);
        this.f19624Z = new C4760z(this);
        this.f19627a0 = new pv6(this);
        this.f19630b0 = new sv6(this);
        this.f19633c0 = new dk9(this);
        this.f19636d0 = new ysa(this);
        this.f19639e0 = new pib(this, strUserId);
        this.f19642f0 = new C4740g(this);
        this.f19645g0 = new C4736e(this);
        this.f19648h0 = new uy8(this);
        this.f19651i0 = new C4734d(this);
        this.f19654j0 = new CoreProduct(this);
        this.f19657k0 = new C4751q(this);
        this.f19660l0 = new jsx();
        this.f19663m0 = new CoreSuggested(this);
        this.f19666n0 = new C4731b0(this);
        this.f19669o0 = new C4748n(this);
        this.f19672p0 = new q89(this);
        this.f19675q0 = new apb(this);
        this.f19678r0 = new C4744j(this);
        this.f19681s0 = new ik9(this);
        this.f19684t0 = new CoreAITranslate(this);
        this.f19687u0 = new CoreLikers(this);
        this.f19690v0 = new c89(this);
        this.f19693w0 = new o59(this);
        this.f19696x0 = new CoreIntlAffiliatePromotions(this);
        this.f19699y0 = new d6b(this);
        this.f19702z0 = new h9b(this);
        this.f19549A0 = new dx6(this);
        this.f19552B0 = new C4735d0(this);
        this.f19555C0 = new xma(this);
        this.f19558D0 = new C4756v(this);
        this.f19561E0 = new wla(this);
        this.f19564F0 = new aw6(this);
        this.f19567G0 = new pz6(this);
        this.f19570H0 = new xob(this);
        this.f19573I0 = new j8n(this);
        this.f19576J0 = new j17(this);
        this.f19579K0 = new qxa(this);
        this.f19582L0 = new jd9(this);
        this.f19585M0 = new h6b(this);
        this.f19588N0 = new C4738f(this);
        this.f19591O0 = new CoreAutoPay(this);
        this.f19594P0 = new r5a(this);
        this.f19597Q0 = new qab(this);
        this.f19601R0 = new dmb(this);
        this.f19604S0 = new C4745k(this);
        this.f19607T0 = null;
        this.f19610U0 = C22392a.m221512b();
        Boolean bool = Boolean.FALSE;
        this.f19613V0 = new hpd0("show_see_list_rule_" + strUserId, bool);
        this.f19616W0 = false;
        this.f19619X0 = false;
        this.f19622Y0 = new f3a();
        this.f19625Z0 = new oe9(this);
        this.f19628a1 = new i69(this);
        this.f19631b1 = new k9b(this);
        this.f19634c1 = new ira(this);
        this.f19637d1 = new C4758x(this);
        this.f19640e1 = new iva(this);
        this.f19643f1 = new et8(this);
        this.f19646g1 = new m4n();
        this.f19649h1 = new c6a(this);
        this.f19652i1 = new q09(this);
        this.f19655j1 = new CoreInnerPush();
        this.f19658k1 = new sja(this);
        this.f19661l1 = new C4749o(this);
        this.f19664m1 = new C4753s(this);
        this.f19667n1 = new C4747m(this);
        this.f19670o1 = new sr9(this);
        this.f19673p1 = new CoreAudioMatch(this);
        this.f19676q1 = new C4743i(this);
        this.f19679r1 = new qw6(this);
        this.f19682s1 = new C4750p(this);
        this.f19685t1 = new RunnableC4733c0();
        this.f19688u1 = new ur9(this);
        this.f19691v1 = new wr8(this);
        this.f19694w1 = new o6b();
        this.f19697x1 = new ova();
        this.f19700y1 = new qd9();
        this.f19703z1 = new d59();
        this.f19550A1 = new s69();
        this.f19553B1 = new uwa();
        this.f19556C1 = new w99();
        this.f19559D1 = new j49();
        this.f19562E1 = new tb9(this);
        this.f19565F1 = new m89();
        this.f19568G1 = new omb();
        this.f19571H1 = new w29(this);
        this.f19574I1 = new qe7(this);
        this.f19577J1 = new C4752r(this);
        this.f19580K1 = new C4742h(this);
        this.f19583L1 = new xo7();
        this.f19586M1 = new yl7(this);
        this.f19589N1 = new xj4(this);
        this.f19592O1 = new fab(this);
        this.f19595P1 = new v39(this);
        this.f19598Q1 = new C4754t(this);
        this.f19602R1 = new lr8(this);
        this.f19605S1 = new vz8(this);
        this.f19608T1 = new vta(this);
        this.f19611U1 = new bf7(this);
        this.f19614V1 = new d3a(this);
        this.f19617W1 = new ip7(this);
        this.f19620X1 = new ec9(this);
        this.f19623Y1 = new nw6(this);
        this.f19626Z1 = new k99(this);
        this.f19629a2 = new yta(this);
        this.f19632b2 = new y59(this);
        this.f19635c2 = new av6(this);
        this.f19638d2 = new s19(this);
        this.f19641e2 = new dka(this);
        this.f19644f2 = new l5b(this);
        this.f19647g2 = new fpb(this);
        this.f19650h2 = new jn7(this);
        this.f19653i2 = new gta(this);
        this.f19656j2 = new avb0(this);
        this.f19659k2 = new w5b(this);
        this.f19662l2 = new yd7(this);
        this.f19665m2 = new u2a(this);
        this.f19668n2 = new qlb(this);
        this.f19671o2 = new me7(this);
        this.f19674p2 = new j89();
        this.f19677q2 = new iqa(this);
        this.f19680r2 = new ij8(this);
        this.f19683s2 = new tjg(this);
        this.f19686t2 = new pc9(this);
        this.f19689u2 = new uab(this);
        this.f19692v2 = new h99(this);
        this.f19695w2 = new os9(this);
        this.f19698x2 = new zt6(this);
        this.f19701y2 = new mma(this);
        this.f19704z2 = new CoreJustVerificationCardApi(this);
        this.f19551A2 = new s6a(this);
        this.f19554B2 = new jj9(this);
        this.f19557C2 = new oc8(this);
        this.f19560D2 = new j77(this);
        this.f19563E2 = new nt6();
        this.f19566F2 = new wp8(this);
        this.f19569G2 = new cb9(this);
        this.f19572H2 = new t99(this);
        this.f19575I2 = "";
        this.f19578J2 = false;
        this.f19581K2 = new l06(this);
        this.f19584L2 = new oa80();
        this.f19587M2 = new qqb();
        this.f19590N2 = null;
        this.f19593O2 = new uqd0("good2fake_alert", "");
        this.f19596P2 = new uqd0("studentVerificationReason_alert", "");
        this.f19599Q2 = new hpd0("refreshAtNewUi" + strUserId, bool);
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ void m31464b3(Throwable th) {
    }

    /* JADX INFO: renamed from: A3 */
    public Intent m31469A3(Context context, boolean z, boolean z2) {
        return ura.m195053e().m195057d().mo33961zm(context, z, z2);
    }

    /* JADX INFO: renamed from: B3 */
    public void m31470B3() {
        CoreModule.f17545c.f19663m0.m31143s6("initiative", "cold", null);
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
        CoreModule.f17545c.f19570H0.m210361k5();
        if (CoreModule.m29932K().mo30835xf()) {
            CoreModule.f17545c.f19573I0.m140262P3();
        }
        CoreModule.f17545c.f19642f0.m32650Fo();
        CoreModule.f17545c.f19552B0.m31617p4(CoreModule.m29931H().userId());
        CoreModule.f17545c.f19642f0.m32611Co();
        if (ura.m195053e().m195057d().mo33697Hg() || ura.m195053e().m195057d().mo33841h5()) {
            CoreModule.f17545c.f19564F0.m99250q3();
        }
        CoreModule.f17545c.f19639e0.m169484ea();
        CoreModule.f17545c.f19663m0.m31128n6();
        CoreModule.f17545c.f19642f0.f19879M2.m121236q();
        CoreModule.f17545c.f19642f0.f19879M2.m121230k().subscribe();
        CoreModule.f17545c.f19570H0.m210359j5();
        if (ura.m195053e().m195057d().mo33866k()) {
            CoreModule.f17545c.f19658k1.m184462A3();
        }
    }

    /* JADX INFO: renamed from: C3 */
    public void m31471C3() {
        if (ura.m195053e().m195057d().mo33866k()) {
            CoreModule.f17545c.f19658k1.m184462A3();
        }
        CoreModule.f17545c.f19552B0.m31617p4(this.f19606T);
        CoreModule.f17545c.f19663m0.m31127m8();
        CoreModule.f17545c.f19624Z.f20142S.m121236q();
        CoreModule.f17545c.f19636d0.f199753R.m121236q();
        CoreModule.f17545c.f19639e0.m169484ea();
        CoreModule.f17545c.f19651i0.f19740S.m121236q();
        if (ura.m195053e().m195057d().mo33903q()) {
            CoreModule.f17545c.f19624Z.f20143T.m121236q();
        }
    }

    /* JADX INFO: renamed from: D3 */
    public c4g0 m31472D3() {
        qib0.f154687E.m78869u(Constants.INBOX_V2_THROTTLE_WINDOW_MS);
        return h4g0.m129242c(qib0.f154687E.m78864p().subscribe(mkd0.m154955G(new e30() { // from class: l.vw6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183314a.m31488s3((Location) obj);
            }
        })), this.f19660l0.m143068f(), this.f19584L2.m163295i(), this.f19587M2.m175888h(), h4g0.m129240a(new d30() { // from class: l.ww6
            @Override // p149l.d30
            public final void call() {
                this.f188339a.m31489t3();
            }
        }));
    }

    /* JADX INFO: renamed from: E3 */
    public void m31473E3(Counter counter) {
        Counter counter2 = this.f19607T0;
        if (counter2 == null) {
            this.f19607T0 = counter;
        } else {
            counter.mergeData(counter2);
            this.f19607T0 = counter;
        }
        this.f19610U0.onNext(this.f19607T0);
    }

    /* JADX INFO: renamed from: F3 */
    public void m31474F3(Counter counter) {
        this.f19607T0 = counter;
    }

    /* JADX INFO: renamed from: G3 */
    public void m31475G3(int i) {
        Counter counter = this.f19607T0;
        if (counter == null || i <= 0) {
            return;
        }
        CounterActivities counterActivities = counter.activities;
        int i2 = counterActivities.unread - i;
        counterActivities.unread = i2;
        counterActivities.unread = Math.max(0, i2);
        this.f19610U0.onNext(this.f19607T0);
    }

    /* JADX INFO: renamed from: g3 */
    public void m31476g3() {
        Counter counter = this.f19607T0;
        if (counter != null) {
            counter.activities.unread = 0;
            counter.moments.unreadMomentLikes = 0;
            this.f19610U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: h3 */
    public void m31477h3() {
        Counter counter = this.f19607T0;
        if (counter != null) {
            counter.activities.unread = counter.followships.unreadFollowers;
            counter.moments.unreadMomentLikes = 0;
            this.f19610U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: i3 */
    public void m31478i3() {
        Counter counter = this.f19607T0;
        if (counter != null) {
            counter.viewers.unread = 0;
            this.f19610U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: j3 */
    public void m31479j3() {
        Counter counter = this.f19607T0;
        if (counter != null) {
            counter.followships.unreadFollowers = 0;
            this.f19610U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: k3 */
    public void m31480k3() {
        Counter counter = this.f19607T0;
        if (counter != null) {
            counter.moments.unreadMomentLikes = 0;
            this.f19610U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: l3 */
    public void m31481l3() {
        Counter counter = this.f19607T0;
        if (counter != null) {
            counter.mytantan.unread = 0;
            this.f19610U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: m3 */
    public void m31482m3() {
        Counter counter = this.f19607T0;
        if (counter != null) {
            counter.moments.unreadLikeFeeds = 0;
            this.f19610U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public C22306c<Counter> m31483n3() {
        return this.f19610U0.doOnNext(new e30() { // from class: l.uw6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178624a.m31486q3((Counter) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public Counter m31484o3() {
        return this.f19607T0;
    }

    /* JADX INFO: renamed from: p3 */
    public long m31485p3() {
        return CoreModule.m29932K().mo30835xf() ? this.f19573I0.m140257K3() : this.f19570H0.m210347Y4();
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m31486q3(Counter counter) {
        boolean z = this.f19619X0;
        boolean zMo33361Ld = CoreModule.m29935P().m94651a().mo33361Ld(counter);
        this.f19619X0 = !zMo33361Ld;
        if (!this.f19616W0 || z || zMo33361Ld) {
            return;
        }
        this.f19613V0.put(Boolean.TRUE);
        this.f19616W0 = false;
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m31487r3(Location location, Envelope envelope) {
        this.f19590N2 = location;
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m31488s3(Location location) {
        if (this.f19590N2 == null) {
            this.f19590N2 = location;
        } else {
            if (!NullChecker.m81303a(location) || AbstractC13063a.m78856f(this.f19590N2.m78831u(), location.m78831u(), this.f19590N2.m78833x(), location.m78833x(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) < 500.0d) {
                return;
            }
            m31490u3(location);
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m31489t3() {
        clearRequestsAndStop();
        this.f19636d0.f199753R.m121234o();
        this.f19624Z.m34917i3();
        k9j.m145074F();
        this.f19581K2.close();
        this.f19642f0.m32974gq();
    }

    /* JADX INFO: renamed from: u3 */
    public final void m31490u3(final Location location) {
        CoreModule.f17545c.f19639e0.f149515z1.put("");
        final GeoLocation geoLocation = new GeoLocation();
        geoLocation.coordinates = new DoublePair(location.m78831u(), location.m78833x());
        geoLocation.intent = ClientAction.get(ClientAction.backgroundChange);
        geoLocation.uncertainty = (int) location.m78829s();
        new ka20(new v9j() { // from class: l.xw6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(C4728a.m31213J0("/locations")).m185893l(utc0.create(Network.JSON, geoLocation.toJson())).m185883b();
            }
        }, Envelope.JSON_ADAPTER).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.yw6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200381a.m31487r3(location, (Envelope) obj);
            }
        }, new e30() { // from class: l.zw6
            @Override // p149l.e30
            public final void call(Object obj) {
                C4732c.m31464b3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v3 */
    public void m31491v3(Counter counter) {
        if (counter == null || counter.equals(this.f19607T0)) {
            return;
        }
        Counter counter2 = this.f19607T0;
        if (counter2 != null) {
            counter.mergeData(counter2);
        }
        this.f19607T0 = counter;
        this.f19610U0.onNext(counter);
    }

    /* JADX INFO: renamed from: w3 */
    public void m31492w3(Envelope envelope, d30 d30Var) {
        m31494y3(envelope, d30Var, false, false, false);
    }

    /* JADX INFO: renamed from: x3 */
    public void m31493x3(Envelope envelope, d30 d30Var, boolean z) {
        m31494y3(envelope, d30Var, z, false, false);
    }

    /* JADX INFO: renamed from: y3 */
    public void m31494y3(Envelope envelope, d30 d30Var, boolean z, boolean z2, boolean z3) {
        if (envelope != null) {
            this.f19581K2.m148020B(envelope);
        }
        f8c.m119878o().m119900x(envelope, d30Var, z, z2, z3);
    }

    /* JADX INFO: renamed from: z3 */
    public Intent m31495z3(Context context, boolean z) {
        return ura.m195053e().m195057d().newMainActClearStack(context, z);
    }
}
