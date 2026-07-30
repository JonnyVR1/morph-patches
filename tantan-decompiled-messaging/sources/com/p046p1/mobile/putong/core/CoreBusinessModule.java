package com.p046p1.mobile.putong.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.immomo.android.network.metrics.NetworkMetricsStatistics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.ExtraActLifecycle;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.api.WebSocketManager;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.api.C4729a0;
import com.p046p1.mobile.putong.core.api.C4737e0;
import com.p046p1.mobile.putong.core.app.LocalChangedListener;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.ChatGroupMemberStatus;
import com.p046p1.mobile.putong.core.data.ChatGroupStatus;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.GroupApply;
import com.p046p1.mobile.putong.core.data.GroupApplyStatus;
import com.p046p1.mobile.putong.core.data.GroupNotification;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.fake.C7846b;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7867a;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.diamond.TabUniteManager;
import com.p046p1.mobile.putong.core.p053ui.jsbridge.CoreBridgeImplementation;
import com.p046p1.mobile.putong.core.p053ui.jsbridge.TantanCoreBridge;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.match.C8456b;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.p055gp.C8346a;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.IdealTag;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.PictureIdealInfo;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserActivityInfo;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.putong.module.Module;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.C19873s9;
import p149l.a3w;
import p149l.ab40;
import p149l.ac50;
import p149l.ah60;
import p149l.ax40;
import p149l.azc0;
import p149l.b3w;
import p149l.bcp;
import p149l.c3e0;
import p149l.c3w;
import p149l.c500;
import p149l.cvv;
import p149l.d3w;
import p149l.da0;
import p149l.dd9;
import p149l.do80;
import p149l.doq;
import p149l.dtb0;
import p149l.dzc0;
import p149l.e30;
import p149l.e3a;
import p149l.e51;
import p149l.e900;
import p149l.eoj0;
import p149l.ew40;
import p149l.exb0;
import p149l.ezc0;
import p149l.fap;
import p149l.fm4;
import p149l.fzc0;
import p149l.g0w;
import p149l.g3a;
import p149l.g5e0;
import p149l.g6a;
import p149l.g6w;
import p149l.g7c;
import p149l.gj40;
import p149l.gkl0;
import p149l.gr2;
import p149l.gr9;
import p149l.gt80;
import p149l.gzc0;
import p149l.h6a;
import p149l.hb30;
import p149l.hbw;
import p149l.hdb0;
import p149l.hzc0;
import p149l.ic50;
import p149l.idi;
import p149l.igj;
import p149l.inl0;
import p149l.izb;
import p149l.j63;
import p149l.j760;
import p149l.jly;
import p149l.k0f0;
import p149l.ke50;
import p149l.ke7;
import p149l.kk9;
import p149l.kqi0;
import p149l.lc60;
import p149l.lqf;
import p149l.lrb;
import p149l.lva;
import p149l.lz4;
import p149l.m0f0;
import p149l.m6h0;
import p149l.mah0;
import p149l.mkd0;
import p149l.ml6;
import p149l.mqi0;
import p149l.mr8;
import p149l.mrm;
import p149l.mtm;
import p149l.mx0;
import p149l.myc0;
import p149l.n940;
import p149l.nah0;
import p149l.nd2;
import p149l.njf0;
import p149l.nt30;
import p149l.o8m;
import p149l.och0;
import p149l.ogj;
import p149l.ogl0;
import p149l.oqh0;
import p149l.osd0;
import p149l.p09;
import p149l.p0d0;
import p149l.p1i;
import p149l.p1w;
import p149l.psa;
import p149l.pv6;
import p149l.q2w;
import p149l.q5k0;
import p149l.q850;
import p149l.q8p;
import p149l.qib0;
import p149l.qk8;
import p149l.qqh0;
import p149l.qqi0;
import p149l.r07;
import p149l.r2w;
import p149l.r3l0;
import p149l.r65;
import p149l.r6n;
import p149l.ran;
import p149l.roj0;
import p149l.ruy;
import p149l.rwb0;
import p149l.rwk0;
import p149l.rxg0;
import p149l.s1w;
import p149l.s6r;
import p149l.s8b0;
import p149l.sa40;
import p149l.sbe0;
import p149l.sj20;
import p149l.snm;
import p149l.sqb0;
import p149l.src0;
import p149l.su4;
import p149l.swh0;
import p149l.t2w;
import p149l.tae0;
import p149l.tqm0;
import p149l.ts9;
import p149l.u2w;
import p149l.u59;
import p149l.u97;
import p149l.ubo;
import p149l.ugc0;
import p149l.uld0;
import p149l.upa;
import p149l.uqd0;
import p149l.us9;
import p149l.v2a;
import p149l.v2w;
import p149l.va40;
import p149l.vi4;
import p149l.vo8;
import p149l.vwb;
import p149l.vy8;
import p149l.w2w;
import p149l.w6h0;
import p149l.w9j;
import p149l.wc80;
import p149l.wf6;
import p149l.wge0;
import p149l.wi60;
import p149l.wn90;
import p149l.wp0;
import p149l.x2c0;
import p149l.x2w;
import p149l.x4i;
import p149l.x6r;
import p149l.xdx;
import p149l.xh40;
import p149l.xhx;
import p149l.xs90;
import p149l.xwc0;
import p149l.xxe;
import p149l.xxk;
import p149l.xz6;
import p149l.xzc0;
import p149l.y1j;
import p149l.y2w;
import p149l.y8p;
import p149l.y9j;
import p149l.yc50;
import p149l.yki0;
import p149l.yni;
import p149l.z2w;
import p149l.zgq0;
import p149l.zpd0;
import p149l.zuj0;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "CoreBusinessModule", path = "/core_module/module")
public class CoreBusinessModule implements Module {

    /* JADX INFO: renamed from: c */
    public static r07 f17533c;

    /* JADX INFO: renamed from: d */
    public static gr2 f17534d;

    /* JADX INFO: renamed from: e */
    public static psa f17535e;

    /* JADX INFO: renamed from: g */
    public static kk9 f17537g;

    /* JADX INFO: renamed from: a */
    public zpd0 f17540a = new zpd0("sameDaylastActiveTime", 0L);

    /* JADX INFO: renamed from: b */
    public zpd0 f17541b = new zpd0("lastActiveTimeCursor", 0L);

    /* JADX INFO: renamed from: f */
    public static u97 f17536f = new u97();

    /* JADX INFO: renamed from: h */
    public static us9 f17538h = new us9();

    /* JADX INFO: renamed from: i */
    public static boolean f17539i = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.CoreBusinessModule$a */
    public class C4712a implements yc50 {
        public C4712a() {
        }

        @Override // p149l.yc50
        /* JADX INFO: renamed from: a */
        public List<zuj0> mo29925a() {
            return e3a.m114585a();
        }

        @Override // p149l.yc50
        /* JADX INFO: renamed from: b */
        public HashMap<String, Integer> mo29926b() {
            HashMap<String, Integer> mapM175146a = qk8.m175146a();
            if (upa.m194847z()) {
                mapM175146a.put("assets://asset/asset.PNG?id=core_oms_ready_active&ext=PNG", Integer.valueOf(x2c0.f190364mh));
                mapM175146a.put("assets://asset/asset.PNG?id=core_oms_verification_fail&ext=PNG", Integer.valueOf(x2c0.f190428oh));
                mapM175146a.put("assets://asset/asset.PNG?id=core_oms_verification_complete&ext=PNG", Integer.valueOf(x2c0.f190396nh));
                return mapM175146a;
            }
            mapM175146a.put("assets://asset/asset.PNG?id=core_oms_ready_active&ext=PNG", Integer.valueOf(x2c0.f190589ti));
            mapM175146a.put("assets://asset/asset.PNG?id=core_oms_verification_fail&ext=PNG", Integer.valueOf(x2c0.f190653vi));
            mapM175146a.put("assets://asset/asset.PNG?id=core_oms_verification_complete&ext=PNG", Integer.valueOf(x2c0.f190621ui));
            return mapM175146a;
        }

        @Override // p149l.yc50
        /* JADX INFO: renamed from: c */
        public List<cvv.InterfaceC16252c> mo29927c() {
            kk9 kk9Var = CoreBusinessModule.f17537g;
            return kk9Var == null ? new ArrayList() : kk9Var.m146316c();
        }

        @Override // p149l.yc50
        /* JADX INFO: renamed from: d */
        public List<ac50> mo29928d() {
            return g3a.m124239b();
        }

        @Override // p149l.yc50
        /* JADX INFO: renamed from: e */
        public List<ac50> mo29929e() {
            return g3a.m124238a();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.CoreBusinessModule$b */
    public class C4713b implements OnCompleteListener<String> {
        public C4713b() {
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@NonNull Task<String> task) {
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m29886F(Act.C4299r c4299r) {
        if (NullChecker.m81303a(c4299r) && NullChecker.m81303a(CoreModule.f17545c) && CoreModule.m29931H().signedIn_()) {
            CoreModule.f17545c.f19642f0.m32650Fo();
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ IdealTag m29887H(User user, final String str) {
        return (IdealTag) vwb.m200346r(user.ideal.details, new w9j() { // from class: l.e87
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((IdealTag) obj).f38760id, str));
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m29889K() {
        ic50.m135327j().m135331d();
        NewMainAct.m39685I5(App.f15369e, null);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ IdealTag m29892N(String str) {
        IdealTag idealTagNew_ = IdealTag.new_();
        idealTagNew_.f38760id = str;
        return idealTagNew_;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m29893P(Act act) {
        if (NullChecker.m81303a(CoreModule.f17545c) && CoreModule.f17545c.f19654j0.f19293f0 && NullChecker.m81303a(Act.foreground_()) && Act.foreground_().f15343a.get() == act) {
            CoreModule.f17545c.f19654j0.m30637v4();
        }
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m29896S(Act.C4299r c4299r) {
        if (!NullChecker.m81303a(c4299r)) {
            HomeStatisticsHelper.m36692F(LiveRegionTag.others);
        } else {
            Activity activity = c4299r.f15343a.get();
            yni.m215412a(activity == null ? false : activity.getClass().getName().equals(NewMainAct.class.getName()));
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m29897T(roj0 roj0Var) {
        if (upa.m194847z()) {
            ic50.m135327j().m135344r("assets://asset/asset.PNG?id=core_oms_ready_active&ext=PNG", x2c0.f190364mh);
            ic50.m135327j().m135344r("assets://asset/asset.PNG?id=core_oms_verification_fail&ext=PNG", x2c0.f190428oh);
            ic50.m135327j().m135344r("assets://asset/asset.PNG?id=core_oms_verification_complete&ext=PNG", x2c0.f190396nh);
        } else {
            ic50.m135327j().m135344r("assets://asset/asset.PNG?id=core_oms_ready_active&ext=PNG", x2c0.f190589ti);
            ic50.m135327j().m135344r("assets://asset/asset.PNG?id=core_oms_verification_fail&ext=PNG", x2c0.f190653vi);
            ic50.m135327j().m135344r("assets://asset/asset.PNG?id=core_oms_verification_complete&ext=PNG", x2c0.f190621ui);
        }
        if (CoreModule.f17545c.f19663m0.f19470z1.get().booleanValue()) {
            C7867a.m37414i().m37424p();
            C22392a<j760<Boolean, Boolean>> c22392a = qib0.f154680A0;
            c22392a.m132487l(new j760<>(c22392a.m221515e().f116564a, Boolean.TRUE));
        }
        if (!mqi0.m155929D(CoreModule.f17545c.f19639e0.f149206K3.get().longValue())) {
            CoreModule.f17545c.f19639e0.f149213L3.clear();
            CoreModule.f17545c.f19639e0.f149206K3.put(Long.valueOf(mqi0.m155944o()));
        }
        CoreModule.f17545c.f19639e0.f149213L3.m189988a(1);
        if (upa.m194658K1() && !mqi0.m155928C(mqi0.m155944o(), CoreModule.f17545c.f19639e0.f149139A5.get().longValue())) {
            CoreModule.f17545c.f19639e0.f149139A5.put(Long.valueOf(mqi0.m155944o()));
            CoreModule.f17545c.f19639e0.f149146B5.put(0);
        }
        e51.m114774y(new Runnable() { // from class: l.h87
            @Override // java.lang.Runnable
            public final void run() {
                CoreBusinessModule.m29901Y();
            }
        });
        if (upa.m194674N2()) {
            CoreModule.f17545c.f19663m0.m31156w8();
        }
        if (ogl0.m164238Q()) {
            exb0.m118586i().m118589j();
            if (ogl0.m164257j()) {
                qib0.f154691G.m102371r0("https://static.tancdn.com/pe-webplatform/gcyXEc-3NM-VdbuEN0wPLIzc.webp");
                qib0.f154691G.m102371r0("https://static.tancdn.com/pe-webplatform/WZj8NDixaW5RhIFWlQug_4JA.webp");
            }
            if (ogl0.m164249b0()) {
                qib0.f154691G.m102371r0("https://static.tancdn.com/pe-webplatform/iKiD6UfDTb_pOoQZ2RHTCzP5.webp");
                qib0.f154691G.m102371r0("https://static.tancdn.com/pe-webplatform/Espsnpgm79p15sNAVGOcsGTv.webp");
            }
        }
        if (ogl0.m164239R()) {
            dtb0.INSTANCE.m113540c();
        }
        if (ogl0.m164242U()) {
            osd0.INSTANCE.m165752l();
        }
        if (g6a.m124559h()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://fe-static.tancdn.com/v1/raw/fc24b12c-e55f-404c-8da2-a7916aacc4a814.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/8aebaed7-dff9-4bc9-9693-f2eb3509473214.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/84570b50-d8bb-472f-b054-29051c568dec14.svga");
            SVGALoader.with(App.f15369e).batchDownload(arrayList);
        }
        if (ke50.m145718e()) {
            qib0.f154691G.m102371r0("https://auto.tancdn.com/v1/images/eyJpZCI6IlFZMlVFTU02WE1PVFpYM0RLVkhLTldOVjZISkRCNzEyIiwidyI6NzE4LCJoIjo0MzgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTg3ODQ2NzM1MjE4MTE0NjI5fQ.png");
        }
        C4371a.m21100p().m21102B(TextUtils.equals(ABManager.m29350i0("continue_popup"), AuthenticationTokenClaims.JSON_KEY_EXP));
        if (C4371a.m21100p().m21108I()) {
            C4371a.m21100p().m21127x(RemoteConfig.m79298x().m79302F("popup_schedule_config"));
        }
        c3e0.m105003b().m105006d();
        s6r.m182454a().m182457d(new dd9());
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m29898V(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m29899W(Act act, C4319c c4319c) {
        if (c4319c == C4319c.f15552m) {
            hdb0.m130575c().m130576b(act.hashCode());
        }
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m29901Y() {
        och0.m163514b();
        jly.m142126N().m142161O();
        jly.m142126N().m142162P();
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m29902Z(Act act) {
        if (NullChecker.m81303a(CoreModule.f17545c)) {
            CoreModule.f17545c.f19663m0.f19385X = 0;
        }
        mx0.m156802o().m156813Q();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m29907e0() {
        String str = CoreModule.f17545c.f19639e0.f149515z1.get();
        Locale locale = Locale.getDefault();
        if (TextUtils.equals(str, locale.getLanguage())) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            CoreModule.f17545c.f19636d0.f199753R.m121234o();
        }
        CoreModule.f17545c.f19639e0.f149515z1.put(locale.getLanguage());
    }

    /* JADX INFO: renamed from: m0 */
    public static ts9 m29908m0() {
        return f17538h.m195177a();
    }

    /* JADX INFO: renamed from: z0 */
    public static void m29909z0() {
        if (CoreModule.f17552j == null) {
            CoreModule.f17552j = CoreModule.f17545c.f19581K2.m148023E();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m29910A0() {
        if (this.f17540a.get().longValue() == 0) {
            this.f17540a.put(Long.valueOf(mqi0.m155944o()));
            this.f17541b.put(Long.valueOf(mqi0.m155944o()));
            f17539i = false;
            return;
        }
        if (m29915h0(mqi0.m155944o(), this.f17540a.get().longValue())) {
            this.f17540a.put(Long.valueOf(mqi0.m155944o()));
        } else {
            this.f17541b.put(this.f17540a.get());
            this.f17540a.put(Long.valueOf(mqi0.m155944o()));
        }
        if (qqi0.m175940h(this.f17540a.get().longValue(), this.f17541b.get().longValue(), 1) && !qqi0.m175940h(this.f17540a.get().longValue(), this.f17541b.get().longValue(), 2)) {
            f17539i = true;
        } else if (qqi0.m175940h(this.f17540a.get().longValue(), this.f17541b.get().longValue(), 2)) {
            f17539i = false;
        }
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ai */
    public void mo29911Ai() {
        ABManager.m29358q().take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.v77
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBusinessModule.m29898V((roj0) obj);
            }
        }));
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ec */
    public void mo28134Ec() {
        SystemClock.elapsedRealtime();
        m29920r0();
        ic50.m135327j().m135343q("core", new C4712a());
        xz6.m211889h().m211891j();
        lva.m151844E();
        m29922w0();
        m29921t0();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22306c<roj0> mo28135Jh() {
        do80.f87149f = false;
        C7846b.m36420r().m36430J();
        return C22306c.just(roj0.f160388a);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ma */
    public void mo28136Ma() {
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo28137Qh() {
        m29914g0();
        vo8.m199156v();
        psa psaVar = new psa();
        f17535e = psaVar;
        psaVar.m171130p();
        Act.foreground().distinctUntilChanged(new w9j() { // from class: l.i87
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Act.C4299r) obj) != null);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.k87
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBusinessModule.m29886F((Act.C4299r) obj);
            }
        }));
        Act.foreground().subscribe(mkd0.m154955G(new e30() { // from class: l.l87
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBusinessModule.m29896S((Act.C4299r) obj);
            }
        }));
        eoj0.m117352b();
        Envelope.registerApiParseCompleteListener(new Envelope.ApiParseCompleteListener() { // from class: l.m87
            @Override // com.p1.mobile.putong.data.Envelope.ApiParseCompleteListener
            public final void onComplete(Envelope envelope) {
                this.f132545a.m29916k0(envelope);
            }
        });
        m29918n0();
        doq.m112810e().m112817h(CoreBridgeImplementation.class);
        izb.m139033C("tantan_core", new y9j() { // from class: l.l77
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new TantanCoreBridge((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        izb.m139033C("tantan_usercenter", new y9j() { // from class: l.m77
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new gai0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        izb.m139033C("tantan_growth", new y9j() { // from class: l.n77
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new w0i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        izb.m139033C("tantan_verification", new y9j() { // from class: l.o77
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new wai0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        izb.m139033C("tantan_swipe", new y9j() { // from class: l.p77
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new s8i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        izb.m139033C("tantan_commercialize", new y9j() { // from class: l.q77
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new m4i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        izb.m139033C("tantan_settings", new y9j() { // from class: l.j87
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new i7i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        LocalChangedListener.register(CoreModule.f17544b);
        CorePopLevel corePopLevel = CorePopLevel.UNKNOWN;
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Wn */
    public void mo29912Wn() {
        if (upa.m194762i()) {
            CoreModule.f17545c.f19642f0.m32627Ee();
        }
        k0f0.m144032f().m144037i(CoreModule.f17544b);
        xxe.m211469h().m211470e();
        e51.m114774y(new Runnable() { // from class: l.k77
            @Override // java.lang.Runnable
            public final void run() {
                kye.m147863i();
            }
        });
        LaunchStep launchStep = LaunchStep.InitAllTags;
        yni.m215417f(launchStep);
        sa40.m182802o().m182821S();
        yni.m215415d(launchStep);
        if (g6a.m124567p()) {
            wi60.m203291m().m203292A();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m29913f0() {
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ft */
    public C22306c<roj0> mo28138ft() {
        return CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: g0 */
    public final void m29914g0() {
        if (f17534d == null) {
            gr2 gr2Var = CoreModule.f17555m;
            f17534d = gr2Var;
            gr2Var.m127648a(f17536f);
        }
    }

    @Override // com.tantanapp.putong.module.Module
    public Context getContext() {
        return CoreModule.f17544b;
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m29915h0(long j, long j2) {
        SimpleDateFormat simpleDateFormatM124687a = new g7c("yy/MM/dd", Locale.getDefault()).m124687a();
        return simpleDateFormatM124687a.format(new Date(j)).equals(simpleDateFormatM124687a.format(new Date(j2)));
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
        CoreModule.f17544b = (Application) context;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m29916k0(Envelope envelope) {
        Relationship relationship;
        Profile profile;
        if (envelope == null) {
            CrashHelper.m81302i(new Exception("return null envelope"), "core_business_module_api_parse_complete", CrashHelper.ReportLevel.p4, 100);
            return;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        for (Conversation conversation : ((CoreData) envelope.getModuleData(CoreData.class)).conversations) {
            if (conversation != null) {
                map2.put(conversation.f56011id, conversation.status);
                map3.put(conversation.f56011id, conversation.convType);
            }
        }
        for (Relationship relationship2 : ((CoreData) envelope.getModuleData(CoreData.class)).relationships) {
            if (relationship2 != null) {
                map.put(relationship2.f38806id, relationship2);
            }
        }
        HashMap map4 = new HashMap();
        if (NullChecker.m81303a(CoreModule.m29934N())) {
            List<Followship> listMo60307Pn = CoreModule.m29934N().mo60307Pn(envelope);
            if (!vwb.m200296J(listMo60307Pn)) {
                for (Followship followship : listMo60307Pn) {
                    if (followship != null) {
                        map4.put(followship.otherUser, followship);
                    }
                }
            }
        }
        UserActivityInfo userActivityInfo = ((CommonData) envelope.getModuleData(CommonData.class)).userActivityInfo;
        for (final User user : ((CommonData) envelope.getModuleData(CommonData.class)).users) {
            if (user != null) {
                if (map4.size() != 0) {
                    user.localFollowship = (Followship) map4.get(user.f56011id);
                }
                if (NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.extensions) && NullChecker.m81303a(user.profile.extensions.game) && !vwb.m200296J(user.profile.extensions.game.screenshot) && user.profile.extensions.game.screenshot.size() > 3) {
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    while (true) {
                        profile = user.profile;
                        if (i >= 3) {
                            break;
                        }
                        arrayList.add(profile.extensions.game.screenshot.get(i));
                        i++;
                    }
                    profile.extensions.game.screenshot = arrayList;
                }
                if (userActivityInfo != null && TextUtils.equals(userActivityInfo.userId, user.f56011id)) {
                    user.userActivityInfo = userActivityInfo;
                }
                if (map.size() != 0 && map.get(user.f56011id) != null) {
                    user.localRelationship = (Relationship) map.get(user.f56011id);
                    if (map2.size() != 0) {
                        user.localRelationship.conversationStatus = (ConversationStatus) map2.get(user.f56011id);
                    }
                    if (map3.size() == 0 || TextUtils.isEmpty((CharSequence) map3.get(user.f56011id))) {
                        User userM169433Q9 = CoreModule.f17545c.f19639e0.m169433Q9(user.f56011id);
                        if (userM169433Q9 != null && (relationship = userM169433Q9.localRelationship) != null && !TextUtils.isEmpty(relationship.convType)) {
                            user.localRelationship.convType = userM169433Q9.localRelationship.convType;
                        }
                    } else {
                        user.localRelationship.convType = (String) map3.get(user.f56011id);
                    }
                }
                if (upa.m194718Y1() && user.ideal != null) {
                    List<String> list = user.profile.extensions.basic.idealType;
                    if (list != null) {
                        boolean zM200296J = vwb.m200296J(list);
                        Profile profile2 = user.profile;
                        if (zM200296J) {
                            profile2.extensions.basic.ideal = vwb.m200324f0(new IdealTag[0]);
                        } else {
                            ArrayList arrayListM200339n = vwb.m200339n(vwb.m200303Q(profile2.extensions.basic.idealType, new w9j() { // from class: l.x77
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return CoreBusinessModule.m29887H(user, (String) obj);
                                }
                            }), new w9j() { // from class: l.y77
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return Boolean.valueOf(NullChecker.m81303a((IdealTag) obj));
                                }
                            });
                            if (!vwb.m200296J(arrayListM200339n)) {
                                user.profile.extensions.basic.ideal = arrayListM200339n;
                            }
                        }
                    }
                    if (!vwb.m200296J(user.ideal.mediaTagIdeal)) {
                        if (user.ideal.mediaTagIdeal != null) {
                            Iterator<Media> it = user.pictures.iterator();
                            while (it.hasNext()) {
                                it.next().tagIdealInfo = new ArrayList();
                            }
                        }
                        for (PictureIdealInfo pictureIdealInfo : user.ideal.mediaTagIdeal) {
                            if (pictureIdealInfo.index < user.pictures.size()) {
                                ArrayList arrayListM200303Q = vwb.m200303Q(pictureIdealInfo.idealTypes, new w9j() { // from class: l.z77
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return CoreBusinessModule.m29892N((String) obj);
                                    }
                                });
                                if (!vwb.m200296J(arrayListM200303Q)) {
                                    user.pictures.get(pictureIdealInfo.index).tagIdealInfo = arrayListM200303Q;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (upa.m194706V1()) {
            HashMap map5 = new HashMap();
            if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).conversations)) {
                for (Conversation conversation2 : ((CoreData) envelope.getModuleData(CoreData.class)).conversations) {
                    if (conversation2 != null && ml6.m155116a(conversation2)) {
                        map5.put(conversation2.otherUser, conversation2.f56011id);
                    }
                }
            }
            if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups)) {
                for (ChatGroup chatGroup : ((CoreData) envelope.getModuleData(CoreData.class)).chatGroups) {
                    if (chatGroup != null) {
                        String str = (String) map5.get(chatGroup.f56011id);
                        if (!TextUtils.isEmpty(str)) {
                            chatGroup.localConId = str;
                        }
                    }
                }
            }
            if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
                for (Message message : ((CoreData) envelope.getModuleData(CoreData.class)).messages) {
                    if (message != null && TEnum.equals(message.channel, "group")) {
                        String str2 = (String) map5.get(message.api_only_otherUser);
                        if (!TextUtils.isEmpty(str2)) {
                            message.cid = str2;
                        }
                    }
                }
            }
            if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups)) {
                for (ChatGroup chatGroup2 : ((CoreData) envelope.getModuleData(CoreData.class)).chatGroups) {
                    if (chatGroup2 != null) {
                        m29924y0(chatGroup2, envelope);
                    }
                }
            }
            if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).interestedGroups)) {
                for (ChatGroup chatGroup3 : ((CoreData) envelope.getModuleData(CoreData.class)).interestedGroups) {
                    if (chatGroup3 != null) {
                        m29924y0(chatGroup3, envelope);
                    }
                }
            }
            if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).groupNotifications)) {
                List<GroupApply> list2 = vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).groupApplies) ? Collections.EMPTY_LIST : ((CoreData) envelope.getModuleData(CoreData.class)).groupApplies;
                List<ChatGroup> list3 = vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups) ? Collections.EMPTY_LIST : ((CoreData) envelope.getModuleData(CoreData.class)).chatGroups;
                List<User> list4 = vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users) ? Collections.EMPTY_LIST : ((CommonData) envelope.getModuleData(CommonData.class)).users;
                ArrayList arrayList2 = new ArrayList();
                for (final GroupNotification groupNotification : ((CoreData) envelope.getModuleData(CoreData.class)).groupNotifications) {
                    if (groupNotification != null && "join_group_apply".equals(groupNotification.type)) {
                        groupNotification.groupApplyData = (GroupApply) vwb.m200346r(list2, new w9j() { // from class: l.a87
                            @Override // p149l.w9j
                            public final Object call(Object obj) {
                                return Boolean.valueOf(TextUtils.equals(((GroupApply) obj).f20404id, groupNotification.groupApply.f20404id));
                            }
                        });
                        groupNotification.chatGroupData = (ChatGroup) vwb.m200346r(list3, new w9j() { // from class: l.b87
                            @Override // p149l.w9j
                            public final Object call(Object obj) {
                                return Boolean.valueOf(TextUtils.equals(groupNotification.groupApplyData.groupId, ((ChatGroup) obj).f56011id));
                            }
                        });
                        groupNotification.userData = (User) vwb.m200346r(list4, new w9j() { // from class: l.c87
                            @Override // p149l.w9j
                            public final Object call(Object obj) {
                                return Boolean.valueOf(TextUtils.equals(groupNotification.groupApplyData.userId, ((User) obj).f56011id));
                            }
                        });
                        arrayList2.add(groupNotification);
                    }
                }
                ((CoreData) envelope.getModuleData(CoreData.class)).groupNotifications = arrayList2;
            }
        }
        r65.m178038q(envelope);
        fap.m120264w(envelope);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m29917l0(Act act) {
        if (CoreModule.m29931H().signedIn_()) {
            m29910A0();
        }
        mx0.m156802o().m156812P();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ms */
    public void mo28139ms() {
        CoreModule.f17545c.clearRequestsAndStop();
        CoreModule.f17545c.f19558D0.clearRequestsAndStop();
        CoreModule.f17545c.f19642f0.m32640Fe();
        qib0.f154705T.m29582R();
        njf0.m159659j();
        snm.m185094Y();
        e900.m115329a();
        p09.m166948w().m166961u();
        mr8.m156019b().m156020a();
        dzc0.m114116d0();
        C8346a.m45563j().m45566h();
        nt30.f140338X0 = true;
        rxg0.m181576t();
        tqm0.m190131p().m190153z();
        if (tqm0.m190131p().m190146s()) {
            sqb0.m185529s0();
        }
        j63.m139890j().m139899s();
        C19873s9.m182675j().m182684s();
        lrb.m151154f().m151160j();
        xzc0.m211955F0();
        OnlineMatchManager.m50127e0();
        src0.m185643O();
        TabUniteManager.m44953i().m44961p();
        yki0.m215128k();
        y1j.m212200j();
        xhx.m208873y();
        ah60.m96371F();
        hb30.m130314t();
        qqh0.INSTANCE.m175931j();
        gkl0.m126640I0();
        p0d0.m166974k();
        xwc0.m211325a();
        lc60.m149283c();
        m6h0.m153230p();
        inl0.m137147a();
        if (vy8.m200615m() || vy8.m200616n()) {
            ke7.m145732o().m145743n();
        }
        swh0.m186189F0();
        xh40.m208752b();
        tae0.m187714r();
        if (IntlCountryCodeController.m28111g()) {
            ruy.m181215g().m181224m();
        }
        ogj.m164200c().m164203d();
        da0.m110521c();
        uld0.m194222m();
        ew40.m118400m();
        fzc0.m123825c();
        wn90.m204621l0();
        gzc0.m128839e0();
        myc0.m157002i0();
        xs90.m210736e();
        C4729a0.m31387j().m31404v();
        ran.m178515q().m178525w();
        C8346a.m45563j().m45573p();
        r6n.m178067f().m178080o();
        fap.m120255i().m120276v();
        bcp.INSTANCE.m101109m();
        ubo.INSTANCE.m192882c();
        wp0.INSTANCE.m204880b();
        gj40.INSTANCE.m126447i();
        hzc0.m133667c0();
        g5e0.m124507o().m124515v();
        nd2.m158964j().m158974m();
        if (vy8.m200609g()) {
            mah0.m153700c1();
        }
        s8b0.m182582c();
        wf6.m202952g();
        if (ezc0.m118907m0()) {
            ezc0.m118908o0();
        }
        rwk0.m181427j();
        zgq0.m218674m();
        sbe0.m183219e();
        azc0.m99652f();
        wge0.m203035g();
        gt80.m127908b();
        CoreModule.f17545c.f19685t1.m31514s();
        CoreModule.f17545c.f19636d0.f199755T.put(0L);
        C8456b.m47646z();
        C8455a.m47574O();
        och0.m163517e();
        su4.m185993c();
        vi4.m198498d();
        C7867a.m37414i().m37423o();
        lz4.m152320r();
        if (C4371a.m21100p().m21108I()) {
            C4371a.m21100p().m21117m();
        }
        CoreModule.m29935P().m94651a().mo33500fl();
        nah0.m158681f();
        o8m.m163185c();
        q5k0.m173036l();
        mtm.m156264y();
        fm4.m122152i();
        hbw.m130341j();
        if (NullChecker.m81304b(CoreModule.f17551i)) {
            CoreModule.f17551i.unsubscribe();
        }
        if (NullChecker.m81303a(CoreModule.f17552j)) {
            CoreModule.f17552j.unsubscribe();
        }
        if (CoreModule.m29934N().mo60365ko()) {
            p1i.m167059c().m167065g();
        }
        CoreModule.f17552j = null;
        RemoteConfig.m79298x().m79321b0();
        C4737e0.m31950g();
        va40.f180706f.clear();
        sa40.m182802o().m182814L();
        wc80.m202636e().m202648p();
        w6h0.m201818j().m201825m();
        kqi0.m146947a().m146950d();
        if (CoreModule.f17557o.m195055b().mo33649wf()) {
            q8p.INSTANCE.m173442q();
        }
        if (g6a.m124562k()) {
            idi.m135448k();
        }
        if (g6a.m124565n()) {
            ax40.m99371l();
        }
        xdx.m208433A().m208459I();
        sj20.m184407a().m184413g();
        mrm.m156038A();
        y8p.m213417l();
        oqh0.m165458a();
        n940.m158530a();
        ugc0.m193535b();
        try {
            String strUserId = CoreModule.m29931H().userId();
            if (TextUtils.isEmpty(strUserId)) {
                return;
            }
            new uqd0("live_region_tag_" + strUserId, "").clear();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m29918n0() {
        if (upa.m194611B()) {
            qib0.f154691G.m102371r0("https://fe-static.tancdn.com/v1/images/eyJpZCI6IlZKWVdYSktTUEdJWUUyVVFVQkNYNk1NWDdQWUJRQzE0IiwidyI6NDIwLCJoIjo0MjEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MzQ1MTY1ODQ3ODUwNTg4NDE5fQ.webp");
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m29919o0() {
        try {
            c500.m105246d(CoreModule.f17544b);
            x6r.m207194a().identifyLanguage("init").addOnCompleteListener(new C4713b());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m29920r0() {
        ABManager.m29325R(new upa());
        ABManager.m29325R(new ogl0());
        ABManager.m29325R(new vy8());
        ABManager.m29325R(new q850());
        ABManager.m29325R(new r3l0());
        ABManager.m29325R(new u59());
        ABManager.m29325R(new v2a());
        ABManager.m29325R(new g6a());
        ABManager.m29325R(new h6a());
        ABManager.m29325R(new gr9());
        ABManager.m29325R(r65.m178034l());
    }

    /* JADX INFO: renamed from: t0 */
    public final void m29921t0() {
        lqf lqfVarM151015a = lqf.m151015a();
        ExtraActLifecycle extraActLifecycle = ExtraActLifecycle.onInitSubscription;
        lqfVarM151015a.m151016b(extraActLifecycle, new e30() { // from class: l.r77
            @Override // p149l.e30
            public final void call(Object obj) {
                new kqf((Act) obj).m146936e();
            }
        });
        lqf.m151015a().m151016b(ExtraActLifecycle.onStopToBackground, new e30() { // from class: l.s77
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBusinessModule.m29902Z((Act) obj);
            }
        });
        lqf.m151015a().m151016b(ExtraActLifecycle.onResumeFromBackground, new e30() { // from class: l.t77
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBusinessModule.m29893P((Act) obj);
            }
        });
        lqf.m151015a().m151016b(ExtraActLifecycle.onResumeFromAppStartOrBackground, new e30() { // from class: l.u77
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174943a.m29917l0((Act) obj);
            }
        });
        lqf.m151015a().m151016b(extraActLifecycle, new e30() { // from class: l.w77
            @Override // p149l.e30
            public final void call(Object obj) {
                Act act = (Act) obj;
                act.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.d87
                    @Override // p149l.e30
                    public final void call(Object obj2) {
                        CoreBusinessModule.m29899W(act, (C4319c) obj2);
                    }
                }));
            }
        });
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: tr */
    public void mo28140tr(boolean z) {
        LaunchStep launchStep = LaunchStep.CoreAfterSignIn;
        yni.m215417f(launchStep);
        f17537g = new kk9();
        m29914g0();
        f17533c = CoreModule.f17556n;
        e51.m114768s(new Runnable() { // from class: l.f87
            @Override // java.lang.Runnable
            public final void run() {
                CoreBusinessModule.m29889K();
            }
        });
        m29907e0();
        m29923x0();
        CoreModule.f17545c.f19575I2 = "";
        ran.m178515q().m178519p();
        C8346a.m45563j().m45565g();
        igj.m136002F();
        CoreModule.f17545c.f19604S0.m34182B3();
        CoreModule.f17545c.f19649h1.m105394j3();
        fap.m120255i().m120269e();
        u59.m191844o();
        if (qib0.f154688E0.get().booleanValue()) {
            NetworkMetricsStatistics.INSTANCE.m18174b();
        }
        if (vy8.m200609g()) {
            mah0.m153735w0();
        }
        tqm0.m190131p().m190134f();
        C7846b.m36420r().m36421A();
        if (z && CoreModule.m29931H().mo28163a().mo132033c()) {
            qib0.f154700O.m169990P(true);
        }
        pv6.m171559o3();
        ABManager.m29358q().take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.g87
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBusinessModule.m29897T((roj0) obj);
            }
        }));
        m29910A0();
        if (!u59.m191841m0()) {
            CoreModule.f17545c.f19640e1.m138534b3();
        }
        if (g5e0.m124510u()) {
            g5e0.m124507o().m124511n();
        }
        mr8.m156019b().m156021c();
        wc80.m202636e().m202642j();
        if (upa.m194690R1()) {
            x4i.f191031g = true;
        }
        CoreModule.f17545c.f19622Y0.m119254d();
        m29913f0();
        m29919o0();
        yni.m215415d(launchStep);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m29922w0() {
        WebSocketManager.m29423Q().m29472f0(new u2w());
        WebSocketManager.m29423Q().m29472f0(new a3w());
        WebSocketManager.m29423Q().m29472f0(new y2w());
        WebSocketManager.m29423Q().m29472f0(new w2w());
        WebSocketManager.m29423Q().m29472f0(new b3w());
        WebSocketManager.m29423Q().m29472f0(new x2w());
        WebSocketManager.m29423Q().m29472f0(new z2w());
        WebSocketManager.m29423Q().m29472f0(new v2w());
        WebSocketManager.m29423Q().m29472f0(new t2w());
        WebSocketManager.m29423Q().m29471e0(new rwb0());
        WebSocketManager.m29423Q().m29471e0(new ab40());
        ab40.m95579j();
        WebSocketManager.m29423Q().m29471e0(new xxk());
        WebSocketManager.m29423Q().m29471e0(new r2w());
        WebSocketManager.m29423Q().m29471e0(new m0f0());
        WebSocketManager.m29423Q().m29471e0(new c3w());
        WebSocketManager.m29423Q().m29471e0(new s1w());
        WebSocketManager.m29423Q().m29471e0(new p1w());
        WebSocketManager.m29423Q().m29471e0(new g0w());
        WebSocketManager.m29423Q().m29471e0(new d3w());
        WebSocketManager.m29423Q().m29471e0(new q2w());
        WebSocketManager.m29423Q().m29471e0(new g6w());
        g6w.m124667j();
    }

    /* JADX INFO: renamed from: x0 */
    public void m29923x0() {
        String str;
        try {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (userM169527p9 == null) {
                return;
            }
            qib0.m174801X0("gender", userM169527p9.gender.toString());
            if (userM169527p9.age.intValue() <= 20) {
                str = "18-20";
            } else if (userM169527p9.age.intValue() <= 22) {
                str = "21-22";
            } else if (userM169527p9.age.intValue() <= 25) {
                str = "23-25";
            } else if (userM169527p9.age.intValue() <= 30) {
                str = "26-30";
            } else {
                str = userM169527p9.age.intValue() <= 40 ? "31-40" : "41+";
            }
            qib0.m174801X0("age_group", str);
            qib0.m174801X0("latest_country_name_en", userM169527p9.location.region.country);
            qib0.m174801X0("latest_city_name_en", userM169527p9.location.region.city);
            qib0.m174801X0("latest_district_name_en", userM169527p9.location.region.district);
            VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
            if (CoreModule.f17545c.f19639e0.m169502j8(userM169527p9)) {
                qib0.m174801X0(NotificationCompat.CATEGORY_STATUS, "default");
            } else if (userM169527p9.status.contains(UserStatus.get("hidden"))) {
                qib0.m174801X0(NotificationCompat.CATEGORY_STATUS, "hidden");
            } else if (userM169527p9.isBanned()) {
                qib0.m174801X0(NotificationCompat.CATEGORY_STATUS, ChatGroupStatus.banned);
            } else if (userM169527p9.inactivated) {
                qib0.m174801X0(NotificationCompat.CATEGORY_STATUS, "inactivated");
            } else if (userM169527p9.veryUgly()) {
                qib0.m174801X0(NotificationCompat.CATEGORY_STATUS, "inappropriate");
            } else if (!NullChecker.m81303a(verificationCenterM31612k4) || TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending")) {
                qib0.m174801X0(NotificationCompat.CATEGORY_STATUS, "pending");
            }
            qib0.m174801X0("popularity", String.valueOf(userM169527p9.popLevel));
            qib0.m174801X0("lastest_os_name", "Android");
            qib0.m174801X0("picture_verification", String.valueOf(userM169527p9.isPicVerificationVerified()));
            Settings settings = userM169527p9.settings;
            if (settings != null) {
                qib0.m174801X0("student_verification", String.valueOf(TEnum.equals(settings.verification.studies.status, "verified")));
            }
            qib0.m174801X0("is_see", String.valueOf(CoreModule.f17545c.f19616W0));
            qib0.m174801X0("wealth_grade", String.valueOf(userM169527p9.hierarchy.grade));
            qib0.m174801X0("isVIP", String.valueOf(userM169527p9.isVIP() || userM169527p9.isSVIP()));
            qib0.m174801X0("mcc", String.valueOf(qib0.f154717f0));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m29924y0(ChatGroup chatGroup, Envelope envelope) {
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).chatGroupMembers)) {
            for (ChatGroupMember chatGroupMember : ((CoreData) envelope.getModuleData(CoreData.class)).chatGroupMembers) {
                if (chatGroupMember != null && TextUtils.equals(chatGroup.f56011id, chatGroupMember.groupId) && TextUtils.equals(CoreModule.m29931H().userId(), chatGroupMember.userId)) {
                    if (!TEnum.equals(chatGroupMember.status, "default") && !TEnum.equals(chatGroupMember.status, ChatGroupMemberStatus.silenced)) {
                        break;
                    }
                    chatGroup.groupApply.status = GroupApplyStatus.get("approved");
                    return;
                }
            }
        }
        if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).groupApplies)) {
            return;
        }
        for (GroupApply groupApply : ((CoreData) envelope.getModuleData(CoreData.class)).groupApplies) {
            if (groupApply != null && TextUtils.equals(chatGroup.f56011id, groupApply.groupId) && TextUtils.equals(CoreModule.m29931H().userId(), groupApply.userId)) {
                if (TEnum.equals(groupApply.status, "default")) {
                    chatGroup.groupApply.status = GroupApplyStatus.get("default");
                    return;
                }
                return;
            }
        }
    }
}
