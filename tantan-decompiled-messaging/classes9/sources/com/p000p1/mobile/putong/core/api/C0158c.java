package com.p000p1.mobile.putong.core.api;

import android.content.Context;
import android.content.Intent;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.data.ClientAction;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterActivities;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.GeoLocation;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l.c4g0;
import l.d30;
import l.e30;
import l.f8c;
import l.h4g0;
import l.hpd0;
import l.k9j;
import l.mkd0;
import l.uqd0;
import l.utc0;
import l.v9j;
import p006l.ap7;
import p006l.apb;
import p006l.av6;
import p006l.avb0;
import p006l.aw6;
import p006l.ax6;
import p006l.bf7;
import p006l.c6a;
import p006l.c89;
import p006l.cb9;
import p006l.cx6;
import p006l.d3a;
import p006l.d59;
import p006l.d6b;
import p006l.dk9;
import p006l.dka;
import p006l.dmb;
import p006l.dva;
import p006l.dx6;
import p006l.ec9;
import p006l.et8;
import p006l.f3a;
import p006l.fab;
import p006l.fpb;
import p006l.gta;
import p006l.h6b;
import p006l.h99;
import p006l.h9b;
import p006l.i69;
import p006l.ij8;
import p006l.ik9;
import p006l.ip7;
import p006l.iqa;
import p006l.ira;
import p006l.iva;
import p006l.j17;
import p006l.j49;
import p006l.j77;
import p006l.j89;
import p006l.j8n;
import p006l.jd9;
import p006l.jj9;
import p006l.jn7;
import p006l.jsx;
import p006l.k99;
import p006l.k9b;
import p006l.ka20;
import p006l.l06;
import p006l.l5b;
import p006l.lr8;
import p006l.m4n;
import p006l.m89;
import p006l.me7;
import p006l.mma;
import p006l.nt6;
import p006l.nw6;
import p006l.o59;
import p006l.o6b;
import p006l.oa80;
import p006l.oc8;
import p006l.oe9;
import p006l.omb;
import p006l.os9;
import p006l.ova;
import p006l.pc9;
import p006l.pib;
import p006l.pv6;
import p006l.pz6;
import p006l.q09;
import p006l.q89;
import p006l.qab;
import p006l.qd9;
import p006l.qe7;
import p006l.qib0;
import p006l.qlb;
import p006l.qqb;
import p006l.qw6;
import p006l.qxa;
import p006l.r5a;
import p006l.s19;
import p006l.s69;
import p006l.s6a;
import p006l.sja;
import p006l.sr9;
import p006l.sv6;
import p006l.t99;
import p006l.tb9;
import p006l.tjg;
import p006l.u2a;
import p006l.uab;
import p006l.ur9;
import p006l.ura;
import p006l.uwa;
import p006l.uy8;
import p006l.v39;
import p006l.vta;
import p006l.vz8;
import p006l.w29;
import p006l.w5b;
import p006l.w99;
import p006l.wla;
import p006l.wp8;
import p006l.wr8;
import p006l.xj4;
import p006l.xma;
import p006l.xo7;
import p006l.xob;
import p006l.y59;
import p006l.yd7;
import p006l.yl7;
import p006l.ysa;
import p006l.yta;
import p006l.zt6;
import rx.c;
import rx.subjects.a;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0158c extends ax6 {

    /* JADX INFO: renamed from: R2 */
    public static ArrayList<WeakReference<C0158c>> f3537R2 = new ArrayList<>();

    /* JADX INFO: renamed from: A0 */
    public dx6 f3538A0;

    /* JADX INFO: renamed from: A1 */
    public s69 f3539A1;

    /* JADX INFO: renamed from: A2 */
    public s6a f3540A2;

    /* JADX INFO: renamed from: B0 */
    public C0161d0 f3541B0;

    /* JADX INFO: renamed from: B1 */
    public uwa f3542B1;

    /* JADX INFO: renamed from: B2 */
    public jj9 f3543B2;

    /* JADX INFO: renamed from: C0 */
    public xma f3544C0;

    /* JADX INFO: renamed from: C1 */
    public w99 f3545C1;

    /* JADX INFO: renamed from: C2 */
    public oc8 f3546C2;

    /* JADX INFO: renamed from: D0 */
    public C0182v f3547D0;

    /* JADX INFO: renamed from: D1 */
    public j49 f3548D1;

    /* JADX INFO: renamed from: D2 */
    public j77 f3549D2;

    /* JADX INFO: renamed from: E0 */
    public wla f3550E0;

    /* JADX INFO: renamed from: E1 */
    public tb9 f3551E1;

    /* JADX INFO: renamed from: E2 */
    public nt6 f3552E2;

    /* JADX INFO: renamed from: F0 */
    public aw6 f3553F0;

    /* JADX INFO: renamed from: F1 */
    public m89 f3554F1;

    /* JADX INFO: renamed from: F2 */
    public wp8 f3555F2;

    /* JADX INFO: renamed from: G0 */
    public pz6 f3556G0;

    /* JADX INFO: renamed from: G1 */
    public omb f3557G1;

    /* JADX INFO: renamed from: G2 */
    public cb9 f3558G2;

    /* JADX INFO: renamed from: H0 */
    public xob f3559H0;

    /* JADX INFO: renamed from: H1 */
    public w29 f3560H1;

    /* JADX INFO: renamed from: H2 */
    public t99 f3561H2;

    /* JADX INFO: renamed from: I0 */
    public j8n f3562I0;

    /* JADX INFO: renamed from: I1 */
    public qe7 f3563I1;

    /* JADX INFO: renamed from: I2 */
    public String f3564I2;

    /* JADX INFO: renamed from: J0 */
    public j17 f3565J0;

    /* JADX INFO: renamed from: J1 */
    public C0178r f3566J1;

    /* JADX INFO: renamed from: J2 */
    public boolean f3567J2;

    /* JADX INFO: renamed from: K0 */
    public qxa f3568K0;

    /* JADX INFO: renamed from: K1 */
    public C0168h f3569K1;

    /* JADX INFO: renamed from: K2 */
    public l06 f3570K2;

    /* JADX INFO: renamed from: L0 */
    public jd9 f3571L0;

    /* JADX INFO: renamed from: L1 */
    public xo7 f3572L1;

    /* JADX INFO: renamed from: L2 */
    public oa80 f3573L2;

    /* JADX INFO: renamed from: M0 */
    public h6b f3574M0;

    /* JADX INFO: renamed from: M1 */
    public yl7 f3575M1;

    /* JADX INFO: renamed from: M2 */
    public qqb f3576M2;

    /* JADX INFO: renamed from: N0 */
    public C0164f f3577N0;

    /* JADX INFO: renamed from: N1 */
    public xj4 f3578N1;

    /* JADX INFO: renamed from: N2 */
    public Location f3579N2;

    /* JADX INFO: renamed from: O0 */
    public CoreAutoPay f3580O0;

    /* JADX INFO: renamed from: O1 */
    public fab f3581O1;

    /* JADX INFO: renamed from: O2 */
    public uqd0 f3582O2;

    /* JADX INFO: renamed from: P0 */
    public r5a f3583P0;

    /* JADX INFO: renamed from: P1 */
    public v39 f3584P1;

    /* JADX INFO: renamed from: P2 */
    public uqd0 f3585P2;

    /* JADX INFO: renamed from: Q0 */
    public qab f3586Q0;

    /* JADX INFO: renamed from: Q1 */
    public C0180t f3587Q1;

    /* JADX INFO: renamed from: Q2 */
    public hpd0 f3588Q2;

    /* JADX INFO: renamed from: R0 */
    public dmb f3590R0;

    /* JADX INFO: renamed from: R1 */
    public lr8 f3591R1;

    /* JADX INFO: renamed from: S0 */
    public C0171k f3593S0;

    /* JADX INFO: renamed from: S1 */
    public vz8 f3594S1;

    /* JADX INFO: renamed from: T */
    public final String f3595T;

    /* JADX INFO: renamed from: T0 */
    public Counter f3596T0;

    /* JADX INFO: renamed from: T1 */
    public vta f3597T1;

    /* JADX INFO: renamed from: U */
    public cx6 f3598U;

    /* JADX INFO: renamed from: U0 */
    public a<Counter> f3599U0;

    /* JADX INFO: renamed from: U1 */
    public bf7 f3600U1;

    /* JADX INFO: renamed from: V */
    public cx6 f3601V;

    /* JADX INFO: renamed from: V0 */
    public hpd0 f3602V0;

    /* JADX INFO: renamed from: V1 */
    public d3a f3603V1;

    /* JADX INFO: renamed from: W */
    public ap7 f3604W;

    /* JADX INFO: renamed from: W0 */
    public boolean f3605W0;

    /* JADX INFO: renamed from: W1 */
    public ip7 f3606W1;

    /* JADX INFO: renamed from: X */
    public dva f3607X;

    /* JADX INFO: renamed from: X0 */
    public boolean f3608X0;

    /* JADX INFO: renamed from: X1 */
    public ec9 f3609X1;

    /* JADX INFO: renamed from: Y */
    public C0183w f3610Y;

    /* JADX INFO: renamed from: Y0 */
    public f3a f3611Y0;

    /* JADX INFO: renamed from: Y1 */
    public nw6 f3612Y1;

    /* JADX INFO: renamed from: Z */
    public C0186z f3613Z;

    /* JADX INFO: renamed from: Z0 */
    public oe9 f3614Z0;

    /* JADX INFO: renamed from: Z1 */
    public k99 f3615Z1;

    /* JADX INFO: renamed from: a0 */
    public pv6 f3616a0;

    /* JADX INFO: renamed from: a1 */
    public i69 f3617a1;

    /* JADX INFO: renamed from: a2 */
    public yta f3618a2;

    /* JADX INFO: renamed from: b0 */
    public sv6 f3619b0;

    /* JADX INFO: renamed from: b1 */
    public k9b f3620b1;

    /* JADX INFO: renamed from: b2 */
    public y59 f3621b2;

    /* JADX INFO: renamed from: c0 */
    public dk9 f3622c0;

    /* JADX INFO: renamed from: c1 */
    public ira f3623c1;

    /* JADX INFO: renamed from: c2 */
    public av6 f3624c2;

    /* JADX INFO: renamed from: d0 */
    public ysa f3625d0;

    /* JADX INFO: renamed from: d1 */
    public C0184x f3626d1;

    /* JADX INFO: renamed from: d2 */
    public s19 f3627d2;

    /* JADX INFO: renamed from: e0 */
    public pib f3628e0;

    /* JADX INFO: renamed from: e1 */
    public final iva f3629e1;

    /* JADX INFO: renamed from: e2 */
    public dka f3630e2;

    /* JADX INFO: renamed from: f0 */
    public C0166g f3631f0;

    /* JADX INFO: renamed from: f1 */
    public et8 f3632f1;

    /* JADX INFO: renamed from: f2 */
    public l5b f3633f2;

    /* JADX INFO: renamed from: g0 */
    public C0162e f3634g0;

    /* JADX INFO: renamed from: g1 */
    public m4n f3635g1;

    /* JADX INFO: renamed from: g2 */
    public fpb f3636g2;

    /* JADX INFO: renamed from: h0 */
    public uy8 f3637h0;

    /* JADX INFO: renamed from: h1 */
    public c6a f3638h1;

    /* JADX INFO: renamed from: h2 */
    public jn7 f3639h2;

    /* JADX INFO: renamed from: i0 */
    public C0160d f3640i0;

    /* JADX INFO: renamed from: i1 */
    public q09 f3641i1;

    /* JADX INFO: renamed from: i2 */
    public gta f3642i2;

    /* JADX INFO: renamed from: j0 */
    public CoreProduct f3643j0;

    /* JADX INFO: renamed from: j1 */
    public CoreInnerPush f3644j1;

    /* JADX INFO: renamed from: j2 */
    public avb0 f3645j2;

    /* JADX INFO: renamed from: k0 */
    public C0177q f3646k0;

    /* JADX INFO: renamed from: k1 */
    public sja f3647k1;

    /* JADX INFO: renamed from: k2 */
    public w5b f3648k2;

    /* JADX INFO: renamed from: l0 */
    public jsx f3649l0;

    /* JADX INFO: renamed from: l1 */
    public C0175o f3650l1;

    /* JADX INFO: renamed from: l2 */
    public yd7 f3651l2;

    /* JADX INFO: renamed from: m0 */
    public CoreSuggested f3652m0;

    /* JADX INFO: renamed from: m1 */
    public C0179s f3653m1;

    /* JADX INFO: renamed from: m2 */
    public u2a f3654m2;

    /* JADX INFO: renamed from: n0 */
    public C0157b0 f3655n0;

    /* JADX INFO: renamed from: n1 */
    public C0173m f3656n1;

    /* JADX INFO: renamed from: n2 */
    public qlb f3657n2;

    /* JADX INFO: renamed from: o0 */
    public C0174n f3658o0;

    /* JADX INFO: renamed from: o1 */
    public sr9 f3659o1;

    /* JADX INFO: renamed from: o2 */
    public me7 f3660o2;

    /* JADX INFO: renamed from: p0 */
    public q89 f3661p0;

    /* JADX INFO: renamed from: p1 */
    public CoreAudioMatch f3662p1;

    /* JADX INFO: renamed from: p2 */
    public j89 f3663p2;

    /* JADX INFO: renamed from: q0 */
    public apb f3664q0;

    /* JADX INFO: renamed from: q1 */
    public C0169i f3665q1;

    /* JADX INFO: renamed from: q2 */
    public iqa f3666q2;

    /* JADX INFO: renamed from: r0 */
    public C0170j f3667r0;

    /* JADX INFO: renamed from: r1 */
    public qw6 f3668r1;

    /* JADX INFO: renamed from: r2 */
    public ij8 f3669r2;

    /* JADX INFO: renamed from: s0 */
    public ik9 f3670s0;

    /* JADX INFO: renamed from: s1 */
    public C0176p f3671s1;

    /* JADX INFO: renamed from: s2 */
    public tjg f3672s2;

    /* JADX INFO: renamed from: t0 */
    public CoreAITranslate f3673t0;

    /* JADX INFO: renamed from: t1 */
    public RunnableC0159c0 f3674t1;

    /* JADX INFO: renamed from: t2 */
    public pc9 f3675t2;

    /* JADX INFO: renamed from: u0 */
    public CoreLikers f3676u0;

    /* JADX INFO: renamed from: u1 */
    public ur9 f3677u1;

    /* JADX INFO: renamed from: u2 */
    public uab f3678u2;

    /* JADX INFO: renamed from: v0 */
    public c89 f3679v0;

    /* JADX INFO: renamed from: v1 */
    public wr8 f3680v1;

    /* JADX INFO: renamed from: v2 */
    public h99 f3681v2;

    /* JADX INFO: renamed from: w0 */
    public o59 f3682w0;

    /* JADX INFO: renamed from: w1 */
    public o6b f3683w1;

    /* JADX INFO: renamed from: w2 */
    public os9 f3684w2;

    /* JADX INFO: renamed from: x0 */
    public CoreIntlAffiliatePromotions f3685x0;

    /* JADX INFO: renamed from: x1 */
    public ova f3686x1;

    /* JADX INFO: renamed from: x2 */
    public zt6 f3687x2;

    /* JADX INFO: renamed from: y0 */
    public d6b f3688y0;

    /* JADX INFO: renamed from: y1 */
    public qd9 f3689y1;

    /* JADX INFO: renamed from: y2 */
    public mma f3690y2;

    /* JADX INFO: renamed from: z0 */
    public h9b f3691z0;

    /* JADX INFO: renamed from: z1 */
    public d59 f3692z1;

    /* JADX INFO: renamed from: z2 */
    public CoreJustVerificationCardApi f3693z2;

    /* JADX INFO: renamed from: R */
    public long f3589R = 0;

    /* JADX INFO: renamed from: S */
    public boolean f3592S = false;

    public C0158c() {
        f3537R2.add(new WeakReference<>(this));
        String strUserId = CoreModule.m1850H().userId();
        this.f3595T = strUserId;
        cx6 cx6Var = new cx6();
        this.f3598U = cx6Var;
        this.f3601V = cx6Var;
        this.f3604W = new ap7(this);
        this.f3607X = new dva(this);
        this.f3610Y = new C0183w(this);
        this.f3613Z = new C0186z(this);
        this.f3616a0 = new pv6(this);
        this.f3619b0 = new sv6(this);
        this.f3622c0 = new dk9(this);
        this.f3625d0 = new ysa(this);
        this.f3628e0 = new pib(this, strUserId);
        this.f3631f0 = new C0166g(this);
        this.f3634g0 = new C0162e(this);
        this.f3637h0 = new uy8(this);
        this.f3640i0 = new C0160d(this);
        this.f3643j0 = new CoreProduct(this);
        this.f3646k0 = new C0177q(this);
        this.f3649l0 = new jsx();
        this.f3652m0 = new CoreSuggested(this);
        this.f3655n0 = new C0157b0(this);
        this.f3658o0 = new C0174n(this);
        this.f3661p0 = new q89(this);
        this.f3664q0 = new apb(this);
        this.f3667r0 = new C0170j(this);
        this.f3670s0 = new ik9(this);
        this.f3673t0 = new CoreAITranslate(this);
        this.f3676u0 = new CoreLikers(this);
        this.f3679v0 = new c89(this);
        this.f3682w0 = new o59(this);
        this.f3685x0 = new CoreIntlAffiliatePromotions(this);
        this.f3688y0 = new d6b(this);
        this.f3691z0 = new h9b(this);
        this.f3538A0 = new dx6(this);
        this.f3541B0 = new C0161d0(this);
        this.f3544C0 = new xma(this);
        this.f3547D0 = new C0182v(this);
        this.f3550E0 = new wla(this);
        this.f3553F0 = new aw6(this);
        this.f3556G0 = new pz6(this);
        this.f3559H0 = new xob(this);
        this.f3562I0 = new j8n(this);
        this.f3565J0 = new j17(this);
        this.f3568K0 = new qxa(this);
        this.f3571L0 = new jd9(this);
        this.f3574M0 = new h6b(this);
        this.f3577N0 = new C0164f(this);
        this.f3580O0 = new CoreAutoPay(this);
        this.f3583P0 = new r5a(this);
        this.f3586Q0 = new qab(this);
        this.f3590R0 = new dmb(this);
        this.f3593S0 = new C0171k(this);
        this.f3596T0 = null;
        this.f3599U0 = a.b();
        Boolean bool = Boolean.FALSE;
        this.f3602V0 = new hpd0("show_see_list_rule_" + strUserId, bool);
        this.f3605W0 = false;
        this.f3608X0 = false;
        this.f3611Y0 = new f3a();
        this.f3614Z0 = new oe9(this);
        this.f3617a1 = new i69(this);
        this.f3620b1 = new k9b(this);
        this.f3623c1 = new ira(this);
        this.f3626d1 = new C0184x(this);
        this.f3629e1 = new iva(this);
        this.f3632f1 = new et8(this);
        this.f3635g1 = new m4n();
        this.f3638h1 = new c6a(this);
        this.f3641i1 = new q09(this);
        this.f3644j1 = new CoreInnerPush();
        this.f3647k1 = new sja(this);
        this.f3650l1 = new C0175o(this);
        this.f3653m1 = new C0179s(this);
        this.f3656n1 = new C0173m(this);
        this.f3659o1 = new sr9(this);
        this.f3662p1 = new CoreAudioMatch(this);
        this.f3665q1 = new C0169i(this);
        this.f3668r1 = new qw6(this);
        this.f3671s1 = new C0176p(this);
        this.f3674t1 = new RunnableC0159c0();
        this.f3677u1 = new ur9(this);
        this.f3680v1 = new wr8(this);
        this.f3683w1 = new o6b();
        this.f3686x1 = new ova();
        this.f3689y1 = new qd9();
        this.f3692z1 = new d59();
        this.f3539A1 = new s69();
        this.f3542B1 = new uwa();
        this.f3545C1 = new w99();
        this.f3548D1 = new j49();
        this.f3551E1 = new tb9(this);
        this.f3554F1 = new m89();
        this.f3557G1 = new omb();
        this.f3560H1 = new w29(this);
        this.f3563I1 = new qe7(this);
        this.f3566J1 = new C0178r(this);
        this.f3569K1 = new C0168h(this);
        this.f3572L1 = new xo7();
        this.f3575M1 = new yl7(this);
        this.f3578N1 = new xj4(this);
        this.f3581O1 = new fab(this);
        this.f3584P1 = new v39(this);
        this.f3587Q1 = new C0180t(this);
        this.f3591R1 = new lr8(this);
        this.f3594S1 = new vz8(this);
        this.f3597T1 = new vta(this);
        this.f3600U1 = new bf7(this);
        this.f3603V1 = new d3a(this);
        this.f3606W1 = new ip7(this);
        this.f3609X1 = new ec9(this);
        this.f3612Y1 = new nw6(this);
        this.f3615Z1 = new k99(this);
        this.f3618a2 = new yta(this);
        this.f3621b2 = new y59(this);
        this.f3624c2 = new av6(this);
        this.f3627d2 = new s19(this);
        this.f3630e2 = new dka(this);
        this.f3633f2 = new l5b(this);
        this.f3636g2 = new fpb(this);
        this.f3639h2 = new jn7(this);
        this.f3642i2 = new gta(this);
        this.f3645j2 = new avb0(this);
        this.f3648k2 = new w5b(this);
        this.f3651l2 = new yd7(this);
        this.f3654m2 = new u2a(this);
        this.f3657n2 = new qlb(this);
        this.f3660o2 = new me7(this);
        this.f3663p2 = new j89();
        this.f3666q2 = new iqa(this);
        this.f3669r2 = new ij8(this);
        this.f3672s2 = new tjg(this);
        this.f3675t2 = new pc9(this);
        this.f3678u2 = new uab(this);
        this.f3681v2 = new h99(this);
        this.f3684w2 = new os9(this);
        this.f3687x2 = new zt6(this);
        this.f3690y2 = new mma(this);
        this.f3693z2 = new CoreJustVerificationCardApi(this);
        this.f3540A2 = new s6a(this);
        this.f3543B2 = new jj9(this);
        this.f3546C2 = new oc8(this);
        this.f3549D2 = new j77(this);
        this.f3552E2 = new nt6();
        this.f3555F2 = new wp8(this);
        this.f3558G2 = new cb9(this);
        this.f3561H2 = new t99(this);
        this.f3564I2 = "";
        this.f3567J2 = false;
        this.f3570K2 = new l06(this);
        this.f3573L2 = new oa80();
        this.f3576M2 = new qqb();
        this.f3579N2 = null;
        this.f3582O2 = new uqd0("good2fake_alert", "");
        this.f3585P2 = new uqd0("studentVerificationReason_alert", "");
        this.f3588Q2 = new hpd0("refreshAtNewUi" + strUserId, bool);
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ void m3394b3(Throwable th) {
    }

    /* JADX INFO: renamed from: A3 */
    public Intent m3399A3(Context context, boolean z, boolean z2) {
        return ura.m25555e().m25559d().m5898zm(context, z, z2);
    }

    /* JADX INFO: renamed from: B3 */
    public void m3400B3() {
        CoreModule.f1534c.f3652m0.m3073s6("initiative", "cold", null);
        CoreModule.f1534c.f3628e0.m21417W9(CoreModule.m1850H().userId());
        CoreModule.f1534c.f3559H0.m27536k5();
        if (CoreModule.m1851K().xf()) {
            CoreModule.f1534c.f3562I0.m17378P3();
        }
        CoreModule.f1534c.f3631f0.m4580Fo();
        CoreModule.f1534c.f3541B0.m3547p4(CoreModule.m1850H().userId());
        CoreModule.f1534c.f3631f0.m4541Co();
        if (ura.m25555e().m25559d().m5634Hg() || ura.m25555e().m25559d().m5778h5()) {
            CoreModule.f1534c.f3553F0.m12317q3();
        }
        CoreModule.f1534c.f3628e0.m21447ea();
        CoreModule.f1534c.f3652m0.m3058n6();
        CoreModule.f1534c.f3631f0.f3868M2.z();
        CoreModule.f1534c.f3631f0.f3868M2.k().subscribe();
        CoreModule.f1534c.f3559H0.m27534j5();
        if (ura.m25555e().m25559d().m5803k()) {
            CoreModule.f1534c.f3647k1.m23842A3();
        }
    }

    /* JADX INFO: renamed from: C3 */
    public void m3401C3() {
        if (ura.m25555e().m25559d().m5803k()) {
            CoreModule.f1534c.f3647k1.m23842A3();
        }
        CoreModule.f1534c.f3541B0.m3547p4(this.f3595T);
        CoreModule.f1534c.f3652m0.m3057m8();
        CoreModule.f1534c.f3613Z.f4131S.z();
        CoreModule.f1534c.f3625d0.f28368R.z();
        CoreModule.f1534c.f3628e0.m21447ea();
        CoreModule.f1534c.f3640i0.f3729S.z();
        if (ura.m25555e().m25559d().m5840q()) {
            CoreModule.f1534c.f3613Z.f4132T.z();
        }
    }

    /* JADX INFO: renamed from: D3 */
    public c4g0 m3402D3() {
        qib0.f19778E.u(300000L);
        return h4g0.c(new c4g0[]{qib0.f19778E.p().subscribe(mkd0.G(new e30() { // from class: l.vw6
            public final void call(Object obj) {
                this.f24497a.m3418s3((Location) obj);
            }
        })), this.f3649l0.m17793f(), this.f3573L2.m20449i(), this.f3576M2.m22330h(), h4g0.a(new d30() { // from class: l.ww6
            public final void call() {
                this.f25431a.m3419t3();
            }
        })});
    }

    /* JADX INFO: renamed from: E3 */
    public void m3403E3(Counter counter) {
        Counter counter2 = this.f3596T0;
        if (counter2 == null) {
            this.f3596T0 = counter;
        } else {
            counter.mergeData(counter2);
            this.f3596T0 = counter;
        }
        this.f3599U0.onNext(this.f3596T0);
    }

    /* JADX INFO: renamed from: F3 */
    public void m3404F3(Counter counter) {
        this.f3596T0 = counter;
    }

    /* JADX INFO: renamed from: G3 */
    public void m3405G3(int i) {
        Counter counter = this.f3596T0;
        if (counter == null || i <= 0) {
            return;
        }
        CounterActivities counterActivities = counter.activities;
        int i2 = counterActivities.unread - i;
        counterActivities.unread = i2;
        counterActivities.unread = Math.max(0, i2);
        this.f3599U0.onNext(this.f3596T0);
    }

    /* JADX INFO: renamed from: g3 */
    public void m3406g3() {
        Counter counter = this.f3596T0;
        if (counter != null) {
            counter.activities.unread = 0;
            counter.moments.unreadMomentLikes = 0;
            this.f3599U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: h3 */
    public void m3407h3() {
        Counter counter = this.f3596T0;
        if (counter != null) {
            counter.activities.unread = counter.followships.unreadFollowers;
            counter.moments.unreadMomentLikes = 0;
            this.f3599U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: i3 */
    public void m3408i3() {
        Counter counter = this.f3596T0;
        if (counter != null) {
            counter.viewers.unread = 0;
            this.f3599U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: j3 */
    public void m3409j3() {
        Counter counter = this.f3596T0;
        if (counter != null) {
            counter.followships.unreadFollowers = 0;
            this.f3599U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: k3 */
    public void m3410k3() {
        Counter counter = this.f3596T0;
        if (counter != null) {
            counter.moments.unreadMomentLikes = 0;
            this.f3599U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: l3 */
    public void m3411l3() {
        Counter counter = this.f3596T0;
        if (counter != null) {
            counter.mytantan.unread = 0;
            this.f3599U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: m3 */
    public void m3412m3() {
        Counter counter = this.f3596T0;
        if (counter != null) {
            counter.moments.unreadLikeFeeds = 0;
            this.f3599U0.onNext(counter);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public c<Counter> m3413n3() {
        return this.f3599U0.doOnNext(new e30() { // from class: l.uw6
            public final void call(Object obj) {
                this.f23775a.m3416q3((Counter) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public Counter m3414o3() {
        return this.f3596T0;
    }

    /* JADX INFO: renamed from: p3 */
    public long m3415p3() {
        return CoreModule.m1851K().xf() ? this.f3562I0.m17373K3() : this.f3559H0.m27522Y4();
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m3416q3(Counter counter) {
        boolean z = this.f3608X0;
        boolean zM5298Ld = CoreModule.m1854P().m11706a().m5298Ld(counter);
        this.f3608X0 = !zM5298Ld;
        if (!this.f3605W0 || z || zM5298Ld) {
            return;
        }
        this.f3602V0.put(Boolean.TRUE);
        this.f3605W0 = false;
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m3417r3(Location location, Envelope envelope) {
        this.f3579N2 = location;
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m3418s3(Location location) {
        if (this.f3579N2 == null) {
            this.f3579N2 = location;
        } else {
            if (!NullChecker.a(location) || com.p1.mobile.putong.location.a.f(this.f3579N2.u(), location.u(), this.f3579N2.x(), location.x(), 0.0d, 0.0d) < 500.0d) {
                return;
            }
            m3420u3(location);
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m3419t3() {
        clearRequestsAndStop();
        this.f3625d0.f28368R.o();
        this.f3613Z.m6854i3();
        k9j.F();
        this.f3570K2.close();
        this.f3631f0.m4904gq();
    }

    /* JADX INFO: renamed from: u3 */
    public final void m3420u3(final Location location) {
        CoreModule.f1534c.f3628e0.f19127z1.put("");
        final GeoLocation geoLocation = new GeoLocation();
        geoLocation.coordinates = new DoublePair(location.u(), location.x());
        geoLocation.intent = ClientAction.get("backgroundChange");
        geoLocation.uncertainty = (int) location.s();
        new ka20(new v9j() { // from class: l.xw6
            public final Object call() {
                return qib0.f19784H.auth().q(C0154a.m3143J0("/locations")).l(utc0.create(Network.JSON, geoLocation.toJson())).b();
            }
        }, Envelope.JSON_ADAPTER).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.yw6
            public final void call(Object obj) {
                this.f28427a.m3417r3(location, (Envelope) obj);
            }
        }, new e30() { // from class: l.zw6
            public final void call(Object obj) {
                C0158c.m3394b3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v3 */
    public void m3421v3(Counter counter) {
        if (counter == null || counter.equals(this.f3596T0)) {
            return;
        }
        Counter counter2 = this.f3596T0;
        if (counter2 != null) {
            counter.mergeData(counter2);
        }
        this.f3596T0 = counter;
        this.f3599U0.onNext(counter);
    }

    /* JADX INFO: renamed from: w3 */
    public void m3422w3(Envelope envelope, d30 d30Var) {
        m3424y3(envelope, d30Var, false, false, false);
    }

    /* JADX INFO: renamed from: x3 */
    public void m3423x3(Envelope envelope, d30 d30Var, boolean z) {
        m3424y3(envelope, d30Var, z, false, false);
    }

    /* JADX INFO: renamed from: y3 */
    public void m3424y3(Envelope envelope, d30 d30Var, boolean z, boolean z2, boolean z3) {
        if (envelope != null) {
            this.f3570K2.m18415B(envelope);
        }
        f8c.o().x(envelope, d30Var, z, z2, z3);
    }

    /* JADX INFO: renamed from: z3 */
    public Intent m3425z3(Context context, boolean z) {
        return ura.m25555e().m25559d().newMainActClearStack(context, z);
    }
}
