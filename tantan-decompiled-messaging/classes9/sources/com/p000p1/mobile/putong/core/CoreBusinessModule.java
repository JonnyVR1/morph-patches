package com.p000p1.mobile.putong.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.immomo.android.network.metrics.NetworkMetricsStatistics;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.api.WebSocketManager;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreBusinessModule;
import com.p000p1.mobile.putong.core.api.C0155a0;
import com.p000p1.mobile.putong.core.api.C0163e0;
import com.p000p1.mobile.putong.core.app.LocalChangedListener;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.ExtraActLifecycle;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.GroupApply;
import com.p1.mobile.putong.core.data.GroupApplyStatus;
import com.p1.mobile.putong.core.data.GroupNotification;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.newui.fake.b;
import com.p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.a;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.diamond.TabUniteManager;
import com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation;
import com.p1.mobile.putong.core.ui.jsbridge.TantanCoreBridge;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.ConversationStatus;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.IdealTag;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.PictureIdealInfo;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserActivityInfo;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.util.launch.LaunchStep;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.putong.module.Module;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l.ac50;
import l.ah60;
import l.ax40;
import l.bcp;
import l.c3e0;
import l.c500;
import l.cvv;
import l.dd9;
import l.doq;
import l.dtb0;
import l.e30;
import l.e3a;
import l.e51;
import l.eoj0;
import l.ew40;
import l.fm4;
import l.g3a;
import l.g5e0;
import l.g7c;
import l.gai0;
import l.gj40;
import l.gr2;
import l.hb30;
import l.hbw;
import l.hdb0;
import l.i7i0;
import l.ic50;
import l.idi;
import l.igj;
import l.izb;
import l.j63;
import l.j760;
import l.jly;
import l.ke7;
import l.kk9;
import l.kqi0;
import l.kye;
import l.lc60;
import l.lqf;
import l.lrb;
import l.lz4;
import l.m4i0;
import l.m6h0;
import l.mah0;
import l.mkd0;
import l.ml6;
import l.mqi0;
import l.mrm;
import l.mtm;
import l.n940;
import l.nah0;
import l.njf0;
import l.nt30;
import l.o8m;
import l.och0;
import l.ogj;
import l.oqh0;
import l.p09;
import l.p1i;
import l.q5k0;
import l.q8p;
import l.qk8;
import l.qqh0;
import l.qqi0;
import l.r07;
import l.r6n;
import l.ran;
import l.roj0;
import l.ruy;
import l.s6r;
import l.s8i0;
import l.s9;
import l.sa40;
import l.snm;
import l.su4;
import l.tqm0;
import l.u97;
import l.ubo;
import l.uqd0;
import l.va40;
import l.vi4;
import l.vo8;
import l.vwb;
import l.w0i0;
import l.w6h0;
import l.w9j;
import l.wai0;
import l.wc80;
import l.wf6;
import l.wn90;
import l.x4i;
import l.x6r;
import l.xdx;
import l.xhx;
import l.xs90;
import l.xwc0;
import l.xxe;
import l.y1j;
import l.y8p;
import l.y9j;
import l.yc50;
import l.yki0;
import l.yni;
import l.zgq0;
import l.zpd0;
import l.zuj0;
import p006l.a3w;
import p006l.ab40;
import p006l.azc0;
import p006l.b3w;
import p006l.c3w;
import p006l.d3w;
import p006l.da0;
import p006l.do80;
import p006l.dzc0;
import p006l.e900;
import p006l.exb0;
import p006l.ezc0;
import p006l.fap;
import p006l.fzc0;
import p006l.g0w;
import p006l.g6a;
import p006l.g6w;
import p006l.gkl0;
import p006l.gr9;
import p006l.gt80;
import p006l.gzc0;
import p006l.h6a;
import p006l.hzc0;
import p006l.inl0;
import p006l.k0f0;
import p006l.ke50;
import p006l.lva;
import p006l.m0f0;
import p006l.mr8;
import p006l.mx0;
import p006l.myc0;
import p006l.nd2;
import p006l.ogl0;
import p006l.osd0;
import p006l.p0d0;
import p006l.p1w;
import p006l.psa;
import p006l.pv6;
import p006l.q2w;
import p006l.q850;
import p006l.qib0;
import p006l.r2w;
import p006l.r3l0;
import p006l.r65;
import p006l.rwb0;
import p006l.rwk0;
import p006l.rxg0;
import p006l.s1w;
import p006l.s8b0;
import p006l.sbe0;
import p006l.sj20;
import p006l.sqb0;
import p006l.src0;
import p006l.swh0;
import p006l.t2w;
import p006l.tae0;
import p006l.ts9;
import p006l.u2w;
import p006l.u59;
import p006l.ugc0;
import p006l.uld0;
import p006l.upa;
import p006l.us9;
import p006l.v2a;
import p006l.v2w;
import p006l.vy8;
import p006l.w2w;
import p006l.wge0;
import p006l.wi60;
import p006l.wp0;
import p006l.x2c0;
import p006l.x2w;
import p006l.xh40;
import p006l.xxk;
import p006l.xz6;
import p006l.xzc0;
import p006l.y2w;
import p006l.z2w;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Route(name = "CoreBusinessModule", path = "/core_module/module")
public class CoreBusinessModule implements Module {

    /* JADX INFO: renamed from: c */
    public static r07 f1522c;

    /* JADX INFO: renamed from: d */
    public static gr2 f1523d;

    /* JADX INFO: renamed from: e */
    public static psa f1524e;

    /* JADX INFO: renamed from: g */
    public static kk9 f1526g;

    /* JADX INFO: renamed from: a */
    public zpd0 f1529a = new zpd0("sameDaylastActiveTime", 0L);

    /* JADX INFO: renamed from: b */
    public zpd0 f1530b = new zpd0("lastActiveTimeCursor", 0L);

    /* JADX INFO: renamed from: f */
    public static u97 f1525f = new u97();

    /* JADX INFO: renamed from: h */
    public static us9 f1527h = new us9();

    /* JADX INFO: renamed from: i */
    public static boolean f1528i = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.CoreBusinessModule$a */
    public class C0138a implements yc50 {
        public C0138a() {
        }

        /* JADX INFO: renamed from: a */
        public List<zuj0> m1844a() {
            return e3a.a();
        }

        /* JADX INFO: renamed from: b */
        public HashMap<String, Integer> m1845b() {
            HashMap<String, Integer> mapA = qk8.a();
            if (upa.m25545z()) {
                mapA.put("assets://asset/asset.PNG?id=core_oms_ready_active&ext=PNG", Integer.valueOf(x2c0.f26900mh));
                mapA.put("assets://asset/asset.PNG?id=core_oms_verification_fail&ext=PNG", Integer.valueOf(x2c0.f26964oh));
                mapA.put("assets://asset/asset.PNG?id=core_oms_verification_complete&ext=PNG", Integer.valueOf(x2c0.f26932nh));
                return mapA;
            }
            mapA.put("assets://asset/asset.PNG?id=core_oms_ready_active&ext=PNG", Integer.valueOf(x2c0.f27125ti));
            mapA.put("assets://asset/asset.PNG?id=core_oms_verification_fail&ext=PNG", Integer.valueOf(x2c0.f27189vi));
            mapA.put("assets://asset/asset.PNG?id=core_oms_verification_complete&ext=PNG", Integer.valueOf(x2c0.f27157ui));
            return mapA;
        }

        /* JADX INFO: renamed from: c */
        public List<cvv.c> m1846c() {
            kk9 kk9Var = CoreBusinessModule.f1526g;
            return kk9Var == null ? new ArrayList() : kk9Var.c();
        }

        /* JADX INFO: renamed from: d */
        public List<ac50> m1847d() {
            return g3a.b();
        }

        /* JADX INFO: renamed from: e */
        public List<ac50> m1848e() {
            return g3a.a();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.CoreBusinessModule$b */
    public class C0139b implements OnCompleteListener<String> {
        public C0139b() {
        }

        public void onComplete(@NonNull Task<String> task) {
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m1798F(Act.r rVar) {
        if (NullChecker.a(rVar) && NullChecker.a(CoreModule.f1534c) && CoreModule.m1850H().signedIn_()) {
            CoreModule.f1534c.f3631f0.m4580Fo();
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ IdealTag m1799H(User user, final String str) {
        return (IdealTag) vwb.r(user.ideal.details, new w9j() { // from class: l.e87
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((IdealTag) obj).id, str));
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m1801K() {
        ic50.j().d();
        NewMainAct.I5(App.e, (NavigationIntent) null);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ IdealTag m1804N(String str) {
        IdealTag idealTagNew_ = IdealTag.new_();
        idealTagNew_.id = str;
        return idealTagNew_;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m1805P(Act act) {
        if (NullChecker.a(CoreModule.f1534c) && CoreModule.f1534c.f3643j0.f3282f0 && NullChecker.a(Act.foreground_()) && Act.foreground_().a.get() == act) {
            CoreModule.f1534c.f3643j0.m2565v4();
        }
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m1808S(Act.r rVar) {
        if (!NullChecker.a(rVar)) {
            HomeStatisticsHelper.F("others");
        } else {
            Activity activity = (Activity) rVar.a.get();
            yni.a(activity == null ? false : activity.getClass().getName().equals(NewMainAct.class.getName()));
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m1809T(roj0 roj0Var) {
        if (upa.m25545z()) {
            ic50.j().r("assets://asset/asset.PNG?id=core_oms_ready_active&ext=PNG", x2c0.f26900mh);
            ic50.j().r("assets://asset/asset.PNG?id=core_oms_verification_fail&ext=PNG", x2c0.f26964oh);
            ic50.j().r("assets://asset/asset.PNG?id=core_oms_verification_complete&ext=PNG", x2c0.f26932nh);
        } else {
            ic50.j().r("assets://asset/asset.PNG?id=core_oms_ready_active&ext=PNG", x2c0.f27125ti);
            ic50.j().r("assets://asset/asset.PNG?id=core_oms_verification_fail&ext=PNG", x2c0.f27189vi);
            ic50.j().r("assets://asset/asset.PNG?id=core_oms_verification_complete&ext=PNG", x2c0.f27157ui);
        }
        if (((Boolean) CoreModule.f1534c.f3652m0.f3459z1.get()).booleanValue()) {
            a.i().p();
            rx.subjects.a<j760<Boolean, Boolean>> aVar = qib0.f19771A0;
            aVar.onNext(new j760((Boolean) ((j760) aVar.e()).a, Boolean.TRUE));
        }
        if (!mqi0.D(((Long) CoreModule.f1534c.f3628e0.f18818K3.get()).longValue())) {
            CoreModule.f1534c.f3628e0.f18825L3.clear();
            CoreModule.f1534c.f3628e0.f18818K3.put(Long.valueOf(mqi0.o()));
        }
        CoreModule.f1534c.f3628e0.f18825L3.a(1);
        if (upa.m25356K1() && !mqi0.C(mqi0.o(), ((Long) CoreModule.f1534c.f3628e0.f18751A5.get()).longValue())) {
            CoreModule.f1534c.f3628e0.f18751A5.put(Long.valueOf(mqi0.o()));
            CoreModule.f1534c.f3628e0.f18758B5.put(0);
        }
        e51.y(new Runnable() { // from class: l.h87
            @Override // java.lang.Runnable
            public final void run() {
                CoreBusinessModule.m1813Y();
            }
        });
        if (upa.m25372N2()) {
            CoreModule.f1534c.f3652m0.m3086w8();
        }
        if (ogl0.m20628Q()) {
            exb0.m14911i().m14914j();
            if (ogl0.m20647j()) {
                qib0.f19782G.m12784r0("https://static.tancdn.com/pe-webplatform/gcyXEc-3NM-VdbuEN0wPLIzc.webp");
                qib0.f19782G.m12784r0("https://static.tancdn.com/pe-webplatform/WZj8NDixaW5RhIFWlQug_4JA.webp");
            }
            if (ogl0.m20639b0()) {
                qib0.f19782G.m12784r0("https://static.tancdn.com/pe-webplatform/iKiD6UfDTb_pOoQZ2RHTCzP5.webp");
                qib0.f19782G.m12784r0("https://static.tancdn.com/pe-webplatform/Espsnpgm79p15sNAVGOcsGTv.webp");
            }
        }
        if (ogl0.m20629R()) {
            dtb0.INSTANCE.c();
        }
        if (ogl0.m20632U()) {
            osd0.INSTANCE.m20738l();
        }
        if (g6a.m15585h()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://fe-static.tancdn.com/v1/raw/fc24b12c-e55f-404c-8da2-a7916aacc4a814.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/8aebaed7-dff9-4bc9-9693-f2eb3509473214.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/84570b50-d8bb-472f-b054-29051c568dec14.svga");
            SVGALoader.with(App.e).batchDownload(arrayList);
        }
        if (ke50.m18105e()) {
            qib0.f19782G.m12784r0("https://auto.tancdn.com/v1/images/eyJpZCI6IlFZMlVFTU02WE1PVFpYM0RLVkhLTldOVjZISkRCNzEyIiwidyI6NzE4LCJoIjo0MzgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTg3ODQ2NzM1MjE4MTE0NjI5fQ.png");
        }
        com.p1.mobile.android.ui.poplevel.a.p().B(TextUtils.equals(ABManager.m1256i0("continue_popup"), "exp"));
        if (com.p1.mobile.android.ui.poplevel.a.p().I()) {
            com.p1.mobile.android.ui.poplevel.a.p().x(RemoteConfig.x().F("popup_schedule_config"));
        }
        c3e0.b().d();
        s6r.a().d(new dd9());
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m1810V(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m1811W(Act act, c cVar) {
        if (cVar == c.m) {
            hdb0.c().b(act.hashCode());
        }
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m1813Y() {
        och0.b();
        jly.N().O();
        jly.N().P();
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m1814Z(Act act) {
        if (NullChecker.a(CoreModule.f1534c)) {
            CoreModule.f1534c.f3652m0.f3374X = 0;
        }
        mx0.m19548o().m19559Q();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m1819e0() {
        String str = (String) CoreModule.f1534c.f3628e0.f19127z1.get();
        Locale locale = Locale.getDefault();
        if (TextUtils.equals(str, locale.getLanguage())) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            CoreModule.f1534c.f3625d0.f28368R.o();
        }
        CoreModule.f1534c.f3628e0.f19127z1.put(locale.getLanguage());
    }

    /* JADX INFO: renamed from: m0 */
    public static ts9 m1820m0() {
        return f1527h.m25561a();
    }

    /* JADX INFO: renamed from: z0 */
    public static void m1821z0() {
        if (CoreModule.f1541j == null) {
            CoreModule.f1541j = CoreModule.f1534c.f3570K2.m18418E();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m1822A0() {
        if (((Long) this.f1529a.get()).longValue() == 0) {
            this.f1529a.put(Long.valueOf(mqi0.o()));
            this.f1530b.put(Long.valueOf(mqi0.o()));
            f1528i = false;
            return;
        }
        if (m1832h0(mqi0.o(), ((Long) this.f1529a.get()).longValue())) {
            this.f1529a.put(Long.valueOf(mqi0.o()));
        } else {
            this.f1530b.put((Long) this.f1529a.get());
            this.f1529a.put(Long.valueOf(mqi0.o()));
        }
        if (qqi0.h(((Long) this.f1529a.get()).longValue(), ((Long) this.f1530b.get()).longValue(), 1) && !qqi0.h(((Long) this.f1529a.get()).longValue(), ((Long) this.f1530b.get()).longValue(), 2)) {
            f1528i = true;
        } else if (qqi0.h(((Long) this.f1529a.get()).longValue(), ((Long) this.f1530b.get()).longValue(), 2)) {
            f1528i = false;
        }
    }

    /* JADX INFO: renamed from: Ai */
    public void m1823Ai() {
        ABManager.m1264q().take(1).subscribe(mkd0.G(new e30() { // from class: l.v77
            public final void call(Object obj) {
                CoreBusinessModule.m1810V((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Ec */
    public void m1824Ec() {
        SystemClock.elapsedRealtime();
        m1838r0();
        ic50.j().q("core", new C0138a());
        xz6.m27689h().m27691j();
        lva.m19021E();
        m1841w0();
        m1839t0();
    }

    /* JADX INFO: renamed from: Jh */
    public rx.c<roj0> m1825Jh() {
        do80.f10491f = false;
        b.r().J();
        return rx.c.just(roj0.a);
    }

    /* JADX INFO: renamed from: Ma */
    public void m1826Ma() {
    }

    /* JADX INFO: renamed from: Qh */
    public void m1827Qh() {
        m1831g0();
        vo8.v();
        psa psaVar = new psa();
        f1524e = psaVar;
        psaVar.m21674p();
        Act.foreground().distinctUntilChanged(new w9j() { // from class: l.i87
            public final Object call(Object obj) {
                return Boolean.valueOf(((Act.r) obj) != null);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.k87
            public final void call(Object obj) {
                CoreBusinessModule.m1798F((Act.r) obj);
            }
        }));
        Act.foreground().subscribe(mkd0.G(new e30() { // from class: l.l87
            public final void call(Object obj) {
                CoreBusinessModule.m1808S((Act.r) obj);
            }
        }));
        eoj0.b();
        Envelope.registerApiParseCompleteListener(new Envelope.ApiParseCompleteListener() { // from class: l.m87
            public final void onComplete(Envelope envelope) {
                this.f16849a.m1833k0(envelope);
            }
        });
        m1836n0();
        doq.e().h(CoreBridgeImplementation.class);
        izb.C("tantan_core", new y9j() { // from class: l.l77
            /* JADX INFO: renamed from: a */
            public final Object m18604a(Object obj, Object obj2, Object obj3) {
                return new TantanCoreBridge((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        izb.C("tantan_usercenter", new y9j() { // from class: l.m77
            /* JADX INFO: renamed from: a */
            public final Object m19126a(Object obj, Object obj2, Object obj3) {
                return new gai0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        izb.C("tantan_growth", new y9j() { // from class: l.n77
            /* JADX INFO: renamed from: a */
            public final Object m19703a(Object obj, Object obj2, Object obj3) {
                return new w0i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        izb.C("tantan_verification", new y9j() { // from class: l.o77
            /* JADX INFO: renamed from: a */
            public final Object m20383a(Object obj, Object obj2, Object obj3) {
                return new wai0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        izb.C("tantan_swipe", new y9j() { // from class: l.p77
            /* JADX INFO: renamed from: a */
            public final Object m21050a(Object obj, Object obj2, Object obj3) {
                return new s8i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        izb.C("tantan_commercialize", new y9j() { // from class: l.q77
            /* JADX INFO: renamed from: a */
            public final Object m21955a(Object obj, Object obj2, Object obj3) {
                return new m4i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        izb.C("tantan_settings", new y9j() { // from class: l.j87
            /* JADX INFO: renamed from: a */
            public final Object m17331a(Object obj, Object obj2, Object obj3) {
                return new i7i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        LocalChangedListener.register(CoreModule.f1533b);
        CorePopLevel corePopLevel = CorePopLevel.UNKNOWN;
    }

    /* JADX INFO: renamed from: Wn */
    public void m1828Wn() {
        if (upa.m25460i()) {
            CoreModule.f1534c.f3631f0.m4557Ee();
        }
        k0f0.m17882f().m17887i(CoreModule.f1533b);
        xxe.h().e();
        e51.y(new Runnable() { // from class: l.k77
            @Override // java.lang.Runnable
            public final void run() {
                kye.i();
            }
        });
        LaunchStep launchStep = LaunchStep.InitAllTags;
        yni.f(new LaunchStep[]{launchStep});
        sa40.o().S();
        yni.d(launchStep);
        if (g6a.m15593p()) {
            wi60.m26386m().m26387A();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m1829f0() {
    }

    /* JADX INFO: renamed from: ft */
    public rx.c<roj0> m1830ft() {
        return CoreModule.f1534c.f3628e0.m21417W9(CoreModule.m1850H().userId());
    }

    /* JADX INFO: renamed from: g0 */
    public final void m1831g0() {
        if (f1523d == null) {
            gr2 gr2Var = CoreModule.f1544m;
            f1523d = gr2Var;
            gr2Var.a(f1525f);
        }
    }

    public Context getContext() {
        return CoreModule.f1533b;
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m1832h0(long j, long j2) {
        SimpleDateFormat simpleDateFormatA = new g7c("yy/MM/dd", Locale.getDefault()).a();
        return simpleDateFormatA.format(new Date(j)).equals(simpleDateFormatA.format(new Date(j2)));
    }

    public void init(Context context) {
        CoreModule.f1533b = (Application) context;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m1833k0(Envelope envelope) {
        Relationship relationship;
        Profile profile;
        if (envelope == null) {
            CrashHelper.i(new Exception("return null envelope"), "core_business_module_api_parse_complete", CrashHelper.ReportLevel.p4, 100);
            return;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        for (Conversation conversation : envelope.getModuleData(CoreData.class).conversations) {
            if (conversation != null) {
                map2.put(((DbObject) conversation).id, conversation.status);
                map3.put(((DbObject) conversation).id, conversation.convType);
            }
        }
        for (Relationship relationship2 : envelope.getModuleData(CoreData.class).relationships) {
            if (relationship2 != null) {
                map.put(relationship2.id, relationship2);
            }
        }
        HashMap map4 = new HashMap();
        if (NullChecker.a(CoreModule.m1853N())) {
            List<Followship> listPn = CoreModule.m1853N().Pn(envelope);
            if (!vwb.J(listPn)) {
                for (Followship followship : listPn) {
                    if (followship != null) {
                        map4.put(followship.otherUser, followship);
                    }
                }
            }
        }
        UserActivityInfo userActivityInfo = envelope.getModuleData(CommonData.class).userActivityInfo;
        for (final User user : envelope.getModuleData(CommonData.class).users) {
            if (user != null) {
                if (map4.size() != 0) {
                    user.localFollowship = (Followship) map4.get(((DbObject) user).id);
                }
                if (NullChecker.a(user.profile) && NullChecker.a(user.profile.extensions) && NullChecker.a(user.profile.extensions.game) && !vwb.J(user.profile.extensions.game.screenshot) && user.profile.extensions.game.screenshot.size() > 3) {
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    while (true) {
                        profile = user.profile;
                        if (i >= 3) {
                            break;
                        }
                        arrayList.add((String) profile.extensions.game.screenshot.get(i));
                        i++;
                    }
                    profile.extensions.game.screenshot = arrayList;
                }
                if (userActivityInfo != null && TextUtils.equals(userActivityInfo.userId, ((DbObject) user).id)) {
                    user.userActivityInfo = userActivityInfo;
                }
                if (map.size() != 0 && map.get(((DbObject) user).id) != null) {
                    user.localRelationship = (Relationship) map.get(((DbObject) user).id);
                    if (map2.size() != 0) {
                        user.localRelationship.conversationStatus = (ConversationStatus) map2.get(((DbObject) user).id);
                    }
                    if (map3.size() == 0 || TextUtils.isEmpty((CharSequence) map3.get(((DbObject) user).id))) {
                        User userM21396Q9 = CoreModule.f1534c.f3628e0.m21396Q9(((DbObject) user).id);
                        if (userM21396Q9 != null && (relationship = userM21396Q9.localRelationship) != null && !TextUtils.isEmpty(relationship.convType)) {
                            user.localRelationship.convType = userM21396Q9.localRelationship.convType;
                        }
                    } else {
                        user.localRelationship.convType = (String) map3.get(((DbObject) user).id);
                    }
                }
                if (upa.m25416Y1() && user.ideal != null) {
                    List list = user.profile.extensions.basic.idealType;
                    if (list != null) {
                        boolean zJ = vwb.J(list);
                        Profile profile2 = user.profile;
                        if (zJ) {
                            profile2.extensions.basic.ideal = vwb.f0(new IdealTag[0]);
                        } else {
                            ArrayList arrayListN = vwb.n(vwb.Q(profile2.extensions.basic.idealType, new w9j() { // from class: l.x77
                                public final Object call(Object obj) {
                                    return CoreBusinessModule.m1799H(user, (String) obj);
                                }
                            }), new w9j() { // from class: l.y77
                                public final Object call(Object obj) {
                                    return Boolean.valueOf(NullChecker.a((IdealTag) obj));
                                }
                            });
                            if (!vwb.J(arrayListN)) {
                                user.profile.extensions.basic.ideal = arrayListN;
                            }
                        }
                    }
                    if (!vwb.J(user.ideal.mediaTagIdeal)) {
                        if (user.ideal.mediaTagIdeal != null) {
                            Iterator it = user.pictures.iterator();
                            while (it.hasNext()) {
                                ((Media) it.next()).tagIdealInfo = new ArrayList();
                            }
                        }
                        for (PictureIdealInfo pictureIdealInfo : user.ideal.mediaTagIdeal) {
                            if (pictureIdealInfo.index < user.pictures.size()) {
                                ArrayList arrayListQ = vwb.Q(pictureIdealInfo.idealTypes, new w9j() { // from class: l.z77
                                    public final Object call(Object obj) {
                                        return CoreBusinessModule.m1804N((String) obj);
                                    }
                                });
                                if (!vwb.J(arrayListQ)) {
                                    ((Media) user.pictures.get(pictureIdealInfo.index)).tagIdealInfo = arrayListQ;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (upa.m25404V1()) {
            HashMap map5 = new HashMap();
            if (!vwb.J(envelope.getModuleData(CoreData.class).conversations)) {
                for (Conversation conversation2 : envelope.getModuleData(CoreData.class).conversations) {
                    if (conversation2 != null && ml6.a(conversation2)) {
                        map5.put(conversation2.otherUser, ((DbObject) conversation2).id);
                    }
                }
            }
            if (!vwb.J(envelope.getModuleData(CoreData.class).chatGroups)) {
                for (ChatGroup chatGroup : envelope.getModuleData(CoreData.class).chatGroups) {
                    if (chatGroup != null) {
                        String str = (String) map5.get(((DbObject) chatGroup).id);
                        if (!TextUtils.isEmpty(str)) {
                            chatGroup.localConId = str;
                        }
                    }
                }
            }
            if (!vwb.J(envelope.getModuleData(CoreData.class).messages)) {
                for (Message message : envelope.getModuleData(CoreData.class).messages) {
                    if (message != null && TEnum.equals(message.channel, "group")) {
                        String str2 = (String) map5.get(message.api_only_otherUser);
                        if (!TextUtils.isEmpty(str2)) {
                            message.cid = str2;
                        }
                    }
                }
            }
            if (!vwb.J(envelope.getModuleData(CoreData.class).chatGroups)) {
                for (ChatGroup chatGroup2 : envelope.getModuleData(CoreData.class).chatGroups) {
                    if (chatGroup2 != null) {
                        m1843y0(chatGroup2, envelope);
                    }
                }
            }
            if (!vwb.J(envelope.getModuleData(CoreData.class).interestedGroups)) {
                for (ChatGroup chatGroup3 : envelope.getModuleData(CoreData.class).interestedGroups) {
                    if (chatGroup3 != null) {
                        m1843y0(chatGroup3, envelope);
                    }
                }
            }
            if (!vwb.J(envelope.getModuleData(CoreData.class).groupNotifications)) {
                List list2 = vwb.J(envelope.getModuleData(CoreData.class).groupApplies) ? Collections.EMPTY_LIST : envelope.getModuleData(CoreData.class).groupApplies;
                List list3 = vwb.J(envelope.getModuleData(CoreData.class).chatGroups) ? Collections.EMPTY_LIST : envelope.getModuleData(CoreData.class).chatGroups;
                List list4 = vwb.J(envelope.getModuleData(CommonData.class).users) ? Collections.EMPTY_LIST : envelope.getModuleData(CommonData.class).users;
                ArrayList arrayList2 = new ArrayList();
                for (final GroupNotification groupNotification : envelope.getModuleData(CoreData.class).groupNotifications) {
                    if (groupNotification != null && "join_group_apply".equals(groupNotification.type)) {
                        groupNotification.groupApplyData = (GroupApply) vwb.r(list2, new w9j() { // from class: l.a87
                            public final Object call(Object obj) {
                                return Boolean.valueOf(TextUtils.equals(((GroupApply) obj).id, groupNotification.groupApply.id));
                            }
                        });
                        groupNotification.chatGroupData = (ChatGroup) vwb.r(list3, new w9j() { // from class: l.b87
                            public final Object call(Object obj) {
                                return Boolean.valueOf(TextUtils.equals(groupNotification.groupApplyData.groupId, ((DbObject) ((ChatGroup) obj)).id));
                            }
                        });
                        groupNotification.userData = (User) vwb.r(list4, new w9j() { // from class: l.c87
                            public final Object call(Object obj) {
                                return Boolean.valueOf(TextUtils.equals(groupNotification.groupApplyData.userId, ((DbObject) ((User) obj)).id));
                            }
                        });
                        arrayList2.add(groupNotification);
                    }
                }
                envelope.getModuleData(CoreData.class).groupNotifications = arrayList2;
            }
        }
        r65.m22704q(envelope);
        fap.m15284w(envelope);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m1834l0(Act act) {
        if (CoreModule.m1850H().signedIn_()) {
            m1822A0();
        }
        mx0.m19548o().m19558P();
    }

    /* JADX INFO: renamed from: ms */
    public void m1835ms() {
        CoreModule.f1534c.clearRequestsAndStop();
        CoreModule.f1534c.f3547D0.clearRequestsAndStop();
        CoreModule.f1534c.f3631f0.m4570Fe();
        qib0.f19796T.m1488R();
        njf0.j();
        snm.Y();
        e900.m14413a();
        p09.w().u();
        mr8.m19501b().m19502a();
        dzc0.m14320d0();
        com.p1.mobile.putong.core.ui.gp.a.j().h();
        nt30.X0 = true;
        rxg0.m23421t();
        tqm0.p().z();
        if (tqm0.p().s()) {
            sqb0.m24067s0();
        }
        j63.j().s();
        s9.j().s();
        lrb.f().j();
        xzc0.m27701F0();
        OnlineMatchManager.e0();
        src0.m24146O();
        TabUniteManager.i().p();
        yki0.k();
        y1j.j();
        xhx.y();
        ah60.F();
        hb30.t();
        qqh0.INSTANCE.j();
        gkl0.m15822I0();
        p0d0.m20998k();
        xwc0.a();
        lc60.c();
        m6h0.p();
        inl0.m16748a();
        if (vy8.m26022m() || vy8.m26023n()) {
            ke7.o().n();
        }
        swh0.m24240F0();
        xh40.m27241b();
        tae0.m24556r();
        if (IntlCountryCodeController.m6g()) {
            ruy.g().m();
        }
        ogj.c().d();
        da0.m13863c();
        uld0.m25257m();
        ew40.m();
        fzc0.m15535c();
        wn90.l0();
        gzc0.m16024e0();
        myc0.m19574i0();
        xs90.e();
        C0155a0.m3317j().m3334v();
        ran.q().w();
        com.p1.mobile.putong.core.ui.gp.a.j().p();
        r6n.f().o();
        fap.m15275i().m15296v();
        bcp.INSTANCE.m();
        ubo.INSTANCE.c();
        wp0.INSTANCE.m26562b();
        gj40.INSTANCE.i();
        hzc0.m16400c0();
        g5e0.o().v();
        nd2.m20050j().m20060m();
        if (vy8.m26016g()) {
            mah0.c1();
        }
        s8b0.m23522c();
        wf6.g();
        if (ezc0.m14948m0()) {
            ezc0.m14949o0();
        }
        rwk0.m23351j();
        zgq0.m();
        sbe0.m23689e();
        azc0.m12353f();
        wge0.m26362g();
        gt80.m15970b();
        CoreModule.f1534c.f3674t1.m3444s();
        CoreModule.f1534c.f3625d0.f28370T.put(0L);
        com.p1.mobile.putong.core.ui.match.b.z();
        com.p1.mobile.putong.core.ui.match.a.O();
        och0.e();
        su4.c();
        vi4.d();
        a.i().o();
        lz4.r();
        if (com.p1.mobile.android.ui.poplevel.a.p().I()) {
            com.p1.mobile.android.ui.poplevel.a.p().m();
        }
        CoreModule.m1854P().m11706a().m5437fl();
        nah0.f();
        o8m.c();
        q5k0.l();
        mtm.y();
        fm4.i();
        hbw.j();
        if (NullChecker.b(CoreModule.f1540i)) {
            CoreModule.f1540i.unsubscribe();
        }
        if (NullChecker.a(CoreModule.f1541j)) {
            CoreModule.f1541j.unsubscribe();
        }
        if (CoreModule.m1853N().ko()) {
            p1i.c().g();
        }
        CoreModule.f1541j = null;
        RemoteConfig.x().b0();
        C0163e0.m3880g();
        va40.f.clear();
        sa40.o().L();
        wc80.e().p();
        w6h0.j().m();
        kqi0.a().d();
        if (CoreModule.f1546o.m25557b().m5586wf()) {
            q8p.Companion.q();
        }
        if (g6a.m15588k()) {
            idi.k();
        }
        if (g6a.m15591n()) {
            ax40.l();
        }
        xdx.A().I();
        sj20.m23814a().m23820g();
        mrm.A();
        y8p.l();
        oqh0.a();
        n940.a();
        ugc0.m25206b();
        try {
            String strUserId = CoreModule.m1850H().userId();
            if (TextUtils.isEmpty(strUserId)) {
                return;
            }
            new uqd0("live_region_tag_" + strUserId, "").clear();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m1836n0() {
        if (upa.m25309B()) {
            qib0.f19782G.m12784r0("https://fe-static.tancdn.com/v1/images/eyJpZCI6IlZKWVdYSktTUEdJWUUyVVFVQkNYNk1NWDdQWUJRQzE0IiwidyI6NDIwLCJoIjo0MjEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MzQ1MTY1ODQ3ODUwNTg4NDE5fQ.webp");
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m1837o0() {
        try {
            c500.d(CoreModule.f1533b);
            x6r.a().identifyLanguage("init").addOnCompleteListener(new C0139b());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m1838r0() {
        ABManager.m1231R(new upa());
        ABManager.m1231R(new ogl0());
        ABManager.m1231R(new vy8());
        ABManager.m1231R(new q850());
        ABManager.m1231R(new r3l0());
        ABManager.m1231R(new u59());
        ABManager.m1231R(new v2a());
        ABManager.m1231R(new g6a());
        ABManager.m1231R(new h6a());
        ABManager.m1231R(new gr9());
        ABManager.m1231R(r65.m22700l());
    }

    /* JADX INFO: renamed from: t0 */
    public final void m1839t0() {
        lqf lqfVarA = lqf.a();
        ExtraActLifecycle extraActLifecycle = ExtraActLifecycle.onInitSubscription;
        lqfVarA.b(extraActLifecycle, new e30() { // from class: l.r77
            public final void call(Object obj) {
                new kqf((Act) obj).m18256e();
            }
        });
        lqf.a().b(ExtraActLifecycle.onStopToBackground, new e30() { // from class: l.s77
            public final void call(Object obj) {
                CoreBusinessModule.m1814Z((Act) obj);
            }
        });
        lqf.a().b(ExtraActLifecycle.onResumeFromBackground, new e30() { // from class: l.t77
            public final void call(Object obj) {
                CoreBusinessModule.m1805P((Act) obj);
            }
        });
        lqf.a().b(ExtraActLifecycle.onResumeFromAppStartOrBackground, new e30() { // from class: l.u77
            public final void call(Object obj) {
                this.f23380a.m1834l0((Act) obj);
            }
        });
        lqf.a().b(extraActLifecycle, new e30() { // from class: l.w77
            public final void call(Object obj) {
                Act act = (Act) obj;
                act.lifecycle().subscribe(mkd0.G(new e30() { // from class: l.d87
                    public final void call(Object obj2) {
                        CoreBusinessModule.m1811W(act, (c) obj2);
                    }
                }));
            }
        });
    }

    /* JADX INFO: renamed from: tr */
    public void m1840tr(boolean z) {
        LaunchStep launchStep = LaunchStep.CoreAfterSignIn;
        yni.f(new LaunchStep[]{launchStep});
        f1526g = new kk9();
        m1831g0();
        f1522c = CoreModule.f1545n;
        e51.s(new Runnable() { // from class: l.f87
            @Override // java.lang.Runnable
            public final void run() {
                CoreBusinessModule.m1801K();
            }
        });
        m1819e0();
        m1842x0();
        CoreModule.f1534c.f3564I2 = "";
        ran.q().p();
        com.p1.mobile.putong.core.ui.gp.a.j().g();
        igj.F();
        CoreModule.f1534c.f3593S0.m6119B3();
        CoreModule.f1534c.f3638h1.m13223j3();
        fap.m15275i().m15289e();
        u59.m25015o();
        if (((Boolean) qib0.f19779E0.get()).booleanValue()) {
            NetworkMetricsStatistics.INSTANCE.b();
        }
        if (vy8.m26016g()) {
            mah0.w0();
        }
        tqm0.p().f();
        b.r().A();
        if (z && CoreModule.m1850H().mo58a().mo16299c()) {
            qib0.f19791O.m21572P(true);
        }
        pv6.m21751o3();
        ABManager.m1264q().take(1).subscribe(mkd0.G(new e30() { // from class: l.g87
            public final void call(Object obj) {
                CoreBusinessModule.m1809T((roj0) obj);
            }
        }));
        m1822A0();
        if (!u59.m25012m0()) {
            CoreModule.f1534c.f3629e1.m17055b3();
        }
        if (g5e0.u()) {
            g5e0.o().n();
        }
        mr8.m19501b().m19503c();
        wc80.e().j();
        if (upa.m25388R1()) {
            x4i.g = true;
        }
        CoreModule.f1534c.f3611Y0.m15012d();
        m1829f0();
        m1837o0();
        yni.d(launchStep);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m1841w0() {
        WebSocketManager.m1329Q().m1378f0(new u2w());
        WebSocketManager.m1329Q().m1378f0(new a3w());
        WebSocketManager.m1329Q().m1378f0(new y2w());
        WebSocketManager.m1329Q().m1378f0(new w2w());
        WebSocketManager.m1329Q().m1378f0(new b3w());
        WebSocketManager.m1329Q().m1378f0(new x2w());
        WebSocketManager.m1329Q().m1378f0(new z2w());
        WebSocketManager.m1329Q().m1378f0(new v2w());
        WebSocketManager.m1329Q().m1378f0(new t2w());
        WebSocketManager.m1329Q().m1377e0(new rwb0());
        WebSocketManager.m1329Q().m1377e0(new ab40());
        ab40.m11804j();
        WebSocketManager.m1329Q().m1377e0(new xxk());
        WebSocketManager.m1329Q().m1377e0(new r2w());
        WebSocketManager.m1329Q().m1377e0(new m0f0());
        WebSocketManager.m1329Q().m1377e0(new c3w());
        WebSocketManager.m1329Q().m1377e0(new s1w());
        WebSocketManager.m1329Q().m1377e0(new p1w());
        WebSocketManager.m1329Q().m1377e0(new g0w());
        WebSocketManager.m1329Q().m1377e0(new d3w());
        WebSocketManager.m1329Q().m1377e0(new q2w());
        WebSocketManager.m1329Q().m1377e0(new g6w());
        g6w.m15625j();
    }

    /* JADX INFO: renamed from: x0 */
    public void m1842x0() {
        String str;
        try {
            User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
            if (userM21490p9 == null) {
                return;
            }
            qib0.m22145X0("gender", userM21490p9.gender.toString());
            if (userM21490p9.age.intValue() <= 20) {
                str = "18-20";
            } else if (userM21490p9.age.intValue() <= 22) {
                str = "21-22";
            } else if (userM21490p9.age.intValue() <= 25) {
                str = "23-25";
            } else if (userM21490p9.age.intValue() <= 30) {
                str = "26-30";
            } else {
                str = userM21490p9.age.intValue() <= 40 ? "31-40" : "41+";
            }
            qib0.m22145X0("age_group", str);
            qib0.m22145X0("latest_country_name_en", userM21490p9.location.region.country);
            qib0.m22145X0("latest_city_name_en", userM21490p9.location.region.city);
            qib0.m22145X0("latest_district_name_en", userM21490p9.location.region.district);
            VerificationCenter verificationCenterM3542k4 = CoreModule.f1534c.f3541B0.m3542k4();
            if (CoreModule.f1534c.f3628e0.m21465j8(userM21490p9)) {
                qib0.m22145X0("status", CameraSticker.CATEGORY_DEFAULT_FILTER);
            } else if (userM21490p9.status.contains(UserStatus.get("hidden"))) {
                qib0.m22145X0("status", "hidden");
            } else if (userM21490p9.isBanned()) {
                qib0.m22145X0("status", "banned");
            } else if (userM21490p9.inactivated) {
                qib0.m22145X0("status", "inactivated");
            } else if (userM21490p9.veryUgly()) {
                qib0.m22145X0("status", "inappropriate");
            } else if (!NullChecker.a(verificationCenterM3542k4) || TEnum.equals(verificationCenterM3542k4.picVerificationInfo.status, "pending")) {
                qib0.m22145X0("status", "pending");
            }
            qib0.m22145X0("popularity", String.valueOf(userM21490p9.popLevel));
            qib0.m22145X0("lastest_os_name", "Android");
            qib0.m22145X0("picture_verification", String.valueOf(userM21490p9.isPicVerificationVerified()));
            Settings settings = userM21490p9.settings;
            if (settings != null) {
                qib0.m22145X0("student_verification", String.valueOf(TEnum.equals(settings.verification.studies.status, "verified")));
            }
            qib0.m22145X0("is_see", String.valueOf(CoreModule.f1534c.f3605W0));
            qib0.m22145X0("wealth_grade", String.valueOf(userM21490p9.hierarchy.grade));
            qib0.m22145X0("isVIP", String.valueOf(userM21490p9.isVIP() || userM21490p9.isSVIP()));
            qib0.m22145X0("mcc", String.valueOf(qib0.f19808f0));
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m1843y0(ChatGroup chatGroup, Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CoreData.class).chatGroupMembers)) {
            for (ChatGroupMember chatGroupMember : envelope.getModuleData(CoreData.class).chatGroupMembers) {
                if (chatGroupMember != null && TextUtils.equals(((DbObject) chatGroup).id, chatGroupMember.groupId) && TextUtils.equals(CoreModule.m1850H().userId(), chatGroupMember.userId)) {
                    if (!TEnum.equals(chatGroupMember.status, CameraSticker.CATEGORY_DEFAULT_FILTER) && !TEnum.equals(chatGroupMember.status, "silenced")) {
                        break;
                    }
                    chatGroup.groupApply.status = GroupApplyStatus.get("approved");
                    return;
                }
            }
        }
        if (vwb.J(envelope.getModuleData(CoreData.class).groupApplies)) {
            return;
        }
        for (GroupApply groupApply : envelope.getModuleData(CoreData.class).groupApplies) {
            if (groupApply != null && TextUtils.equals(((DbObject) chatGroup).id, groupApply.groupId) && TextUtils.equals(CoreModule.m1850H().userId(), groupApply.userId)) {
                if (TEnum.equals(groupApply.status, CameraSticker.CATEGORY_DEFAULT_FILTER)) {
                    chatGroup.groupApply.status = GroupApplyStatus.get(CameraSticker.CATEGORY_DEFAULT_FILTER);
                    return;
                }
                return;
            }
        }
    }
}
