package com.p051p1.mobile.putong.core;

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
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.immomo.android.network.metrics.NetworkMetricsStatistics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.ExtraActLifecycle;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.api.WebSocketManager;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.api.C4880a0;
import com.p051p1.mobile.putong.core.api.C4888e0;
import com.p051p1.mobile.putong.core.app.LocalChangedListener;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.ChatGroupMemberStatus;
import com.p051p1.mobile.putong.core.data.ChatGroupStatus;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.GroupApply;
import com.p051p1.mobile.putong.core.data.GroupApplyStatus;
import com.p051p1.mobile.putong.core.data.GroupNotification;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.fake.C7997b;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8018a;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.diamond.TabUniteManager;
import com.p051p1.mobile.putong.core.p058ui.jsbridge.CoreBridgeImplementation;
import com.p051p1.mobile.putong.core.p058ui.jsbridge.TantanCoreBridge;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.match.C8619b;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.p060gp.C8509a;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.IdealTag;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.PictureIdealInfo;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserActivityInfo;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.putong.module.Module;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.C18823n9;
import p153l.a17;
import p153l.a5i0;
import p153l.a5w;
import p153l.a8d0;
import p153l.aq8;
import p153l.aw90;
import p153l.b1a0;
import p153l.b240;
import p153l.b5d0;
import p153l.b5w;
import p153l.bep;
import p153l.bi40;
import p153l.bpc0;
import p153l.bpe0;
import p153l.br60;
import p153l.bua;
import p153l.byd0;
import p153l.bze;
import p153l.c4k0;
import p153l.cjj;
import p153l.cl80;
import p153l.cqq;
import p153l.cs20;
import p153l.d09;
import p153l.d79;
import p153l.d7d0;
import p153l.dbc0;
import p153l.dxv;
import p153l.e2w;
import p153l.e3i;
import p153l.e8w;
import p153l.ebm;
import p153l.efh0;
import p153l.en4;
import p153l.eqq0;
import p153l.eu9;
import p153l.fcp;
import p153l.fdw;
import p153l.fl50;
import p153l.fp60;
import p153l.fu9;
import p153l.g4a;
import p153l.g7d0;
import p153l.gbe0;
import p153l.gj40;
import p153l.gra;
import p153l.guy;
import p153l.h1c0;
import p153l.h7d0;
import p153l.hk50;
import p153l.hw80;
import p153l.hxj0;
import p153l.i5c0;
import p153l.i7d0;
import p153l.ijj;
import p153l.j7d0;
import p153l.jj40;
import p153l.jyb;
import p153l.k05;
import p153l.k190;
import p153l.k7d0;
import p153l.kde0;
import p153l.ktl0;
import p153l.l51;
import p153l.llb0;
import p153l.lq40;
import p153l.m6i;
import p153l.m8c;
import p153l.me9;
import p153l.mwl0;
import p153l.n0l;
import p153l.n3w;
import p153l.nh00;
import p153l.nvm;
import p153l.nzi0;
import p153l.o3z;
import p153l.o4w;
import p153l.of7;
import p153l.oj40;
import p153l.otm;
import p153l.p4w;
import p153l.p550;
import p153l.p6d0;
import p153l.pf60;
import p153l.pk50;
import p153l.pm6;
import p153l.psd0;
import p153l.pzi0;
import p153l.q0e0;
import p153l.q3w;
import p153l.q4a;
import p153l.qap;
import p153l.qcj;
import p153l.qk60;
import p153l.r4w;
import p153l.r8f0;
import p153l.r8n;
import p153l.rcn;
import p153l.rd00;
import p153l.rm50;
import p153l.rs9;
import p153l.rv4;
import p153l.s4a;
import p153l.s4w;
import p153l.s75;
import p153l.s7a;
import p153l.s8d0;
import p153l.scj;
import p153l.sp0;
import p153l.spl0;
import p153l.srf;
import p153l.sw6;
import p153l.t450;
import p153l.t4j;
import p153l.t4w;
import p153l.t7a;
import p153l.t8f0;
import p153l.t8r;
import p153l.tl9;
import p153l.ts8;
import p153l.tx0;
import p153l.tzi0;
import p153l.u17;
import p153l.u4w;
import p153l.ud2;
import p153l.udo;
import p153l.ueh0;
import p153l.uih0;
import p153l.uj4;
import p153l.upm;
import p153l.uqb0;
import p153l.uqi;
import p153l.uqx;
import p153l.ur40;
import p153l.uxj0;
import p153l.v4c0;
import p153l.v4w;
import p153l.vih0;
import p153l.vj30;
import p153l.vl8;
import p153l.vyh0;
import p153l.w0c;
import p153l.w4w;
import p153l.wcl0;
import p153l.wek0;
import p153l.wgb0;
import p153l.wgx;
import p153l.wkh0;
import p153l.wr2;
import p153l.wrf0;
import p153l.wtd0;
import p153l.wyb0;
import p153l.wyd0;
import p153l.x19;
import p153l.x4w;
import p153l.x5l0;
import p153l.xei;
import p153l.xg50;
import p153l.xje0;
import p153l.xwa;
import p153l.xzc0;
import p153l.xzm0;
import p153l.y20;
import p153l.y4w;
import p153l.y63;
import p153l.y8r;
import p153l.ya7;
import p153l.yap;
import p153l.yie0;
import p153l.yti0;
import p153l.yyh0;
import p153l.z4w;
import p153l.z5h0;
import p153l.z90;
import p153l.zg6;
import p153l.zsb;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "CoreBusinessModule", path = "/core_module/module")
public class CoreBusinessModule implements Module {

    /* JADX INFO: renamed from: c */
    public static u17 f18252c;

    /* JADX INFO: renamed from: d */
    public static wr2 f18253d;

    /* JADX INFO: renamed from: e */
    public static bua f18254e;

    /* JADX INFO: renamed from: g */
    public static tl9 f18256g;

    /* JADX INFO: renamed from: a */
    public byd0 f18259a = new byd0("sameDaylastActiveTime", 0L);

    /* JADX INFO: renamed from: b */
    public byd0 f18260b = new byd0("lastActiveTimeCursor", 0L);

    /* JADX INFO: renamed from: f */
    public static ya7 f18255f = new ya7();

    /* JADX INFO: renamed from: h */
    public static fu9 f18257h = new fu9();

    /* JADX INFO: renamed from: i */
    public static boolean f18258i = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.CoreBusinessModule$a */
    public class C4863a implements fl50 {
        public C4863a() {
        }

        @Override // p153l.fl50
        /* JADX INFO: renamed from: a */
        public List<c4k0> mo30923a() {
            return q4a.m175203a();
        }

        @Override // p153l.fl50
        /* JADX INFO: renamed from: b */
        public HashMap<String, Integer> mo30924b() {
            HashMap<String, Integer> mapM201596a = vl8.m201596a();
            if (gra.m131778z()) {
                mapM201596a.put("assets://asset/asset.PNG?id=core_oms_ready_active&ext=PNG", Integer.valueOf(dbc0.f86827ai));
                mapM201596a.put("assets://asset/asset.PNG?id=core_oms_verification_fail&ext=PNG", Integer.valueOf(dbc0.f86893ci));
                mapM201596a.put("assets://asset/asset.PNG?id=core_oms_verification_complete&ext=PNG", Integer.valueOf(dbc0.f86860bi));
                return mapM201596a;
            }
            mapM201596a.put("assets://asset/asset.PNG?id=core_oms_ready_active&ext=PNG", Integer.valueOf(dbc0.f87058hj));
            mapM201596a.put("assets://asset/asset.PNG?id=core_oms_verification_fail&ext=PNG", Integer.valueOf(dbc0.f87122jj));
            mapM201596a.put("assets://asset/asset.PNG?id=core_oms_verification_complete&ext=PNG", Integer.valueOf(dbc0.f87090ij));
            return mapM201596a;
        }

        @Override // p153l.fl50
        /* JADX INFO: renamed from: c */
        public List<dxv.InterfaceC16648c> mo30925c() {
            tl9 tl9Var = CoreBusinessModule.f18256g;
            return tl9Var == null ? new ArrayList() : tl9Var.m191630c();
        }

        @Override // p153l.fl50
        /* JADX INFO: renamed from: d */
        public List<hk50> mo30926d() {
            return s4a.m184454b();
        }

        @Override // p153l.fl50
        /* JADX INFO: renamed from: e */
        public List<hk50> mo30927e() {
            return s4a.m184453a();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.CoreBusinessModule$b */
    public class C4864b implements OnCompleteListener<String> {
        public C4864b() {
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@NonNull Task<String> task) {
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m30884F(Act.C4450r c4450r) {
        if (NullChecker.m82486a(c4450r) && NullChecker.m82486a(CoreModule.f18264c) && CoreModule.m30929H().signedIn_()) {
            CoreModule.f18264c.f20384f0.m33653Fo();
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ IdealTag m30885H(User user, final String str) {
        return (IdealTag) jyb.m147529r(user.ideal.details, new qcj() { // from class: l.i97
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((IdealTag) obj).f39608id, str));
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m30887K() {
        pk50.m172568j().m172572d();
        NewMainAct.m40697M5(App.f16088e, null);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ IdealTag m30890N(String str) {
        IdealTag idealTagNew_ = IdealTag.new_();
        idealTagNew_.f39608id = str;
        return idealTagNew_;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m30891P(Act act) {
        if (NullChecker.m82486a(CoreModule.f18264c) && CoreModule.f18264c.f20396j0.f20035f0 && NullChecker.m82486a(Act.foreground_()) && Act.foreground_().f16062a.get() == act) {
            CoreModule.f18264c.f20396j0.m31640v4();
        }
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m30894S(Act.C4450r c4450r) {
        if (!NullChecker.m82486a(c4450r)) {
            HomeStatisticsHelper.m37695F(LiveRegionTag.others);
        } else {
            Activity activity = c4450r.f16062a.get();
            uqi.m197334a(activity == null ? false : activity.getClass().getName().equals(NewMainAct.class.getName()));
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m30895T(uxj0 uxj0Var) {
        if (gra.m131778z()) {
            pk50.m172568j().m172585r("assets://asset/asset.PNG?id=core_oms_ready_active&ext=PNG", dbc0.f86827ai);
            pk50.m172568j().m172585r("assets://asset/asset.PNG?id=core_oms_verification_fail&ext=PNG", dbc0.f86893ci);
            pk50.m172568j().m172585r("assets://asset/asset.PNG?id=core_oms_verification_complete&ext=PNG", dbc0.f86860bi);
        } else {
            pk50.m172568j().m172585r("assets://asset/asset.PNG?id=core_oms_ready_active&ext=PNG", dbc0.f87058hj);
            pk50.m172568j().m172585r("assets://asset/asset.PNG?id=core_oms_verification_fail&ext=PNG", dbc0.f87122jj);
            pk50.m172568j().m172585r("assets://asset/asset.PNG?id=core_oms_verification_complete&ext=PNG", dbc0.f87090ij);
        }
        if (CoreModule.f18264c.f20405m0.f20212z1.get().booleanValue()) {
            C8018a.m38417i().m38427p();
            C22507a<pf60<Boolean, Boolean>> c22507a = uqb0.f180363A0;
            c22507a.m137019l(new pf60<>(c22507a.m222761e().f152156a, Boolean.TRUE));
        }
        if (!pzi0.m174439D(CoreModule.f18264c.f20381e0.f89063K3.get().longValue())) {
            CoreModule.f18264c.f20381e0.f89070L3.clear();
            CoreModule.f18264c.f20381e0.f89063K3.put(Long.valueOf(pzi0.m174454o()));
        }
        CoreModule.f18264c.f20381e0.f89070L3.m203841a(1);
        if (gra.m131589K1() && !pzi0.m174438C(pzi0.m174454o(), CoreModule.f18264c.f20381e0.f88996A5.get().longValue())) {
            CoreModule.f18264c.f20381e0.f88996A5.put(Long.valueOf(pzi0.m174454o()));
            CoreModule.f18264c.f20381e0.f89003B5.put(0);
        }
        l51.m152919y(new Runnable() { // from class: l.l97
            @Override // java.lang.Runnable
            public final void run() {
                CoreBusinessModule.m30899Y();
            }
        });
        if (gra.m131605N2()) {
            CoreModule.f18264c.f20405m0.m32159w8();
        }
        if (spl0.m187365Q()) {
            i5c0.m138650i().m138653j();
            if (spl0.m187384j()) {
                uqb0.f180374G.m127154r0("https://static.tancdn.com/pe-webplatform/gcyXEc-3NM-VdbuEN0wPLIzc.webp");
                uqb0.f180374G.m127154r0("https://static.tancdn.com/pe-webplatform/WZj8NDixaW5RhIFWlQug_4JA.webp");
            }
            if (spl0.m187376b0()) {
                uqb0.f180374G.m127154r0("https://static.tancdn.com/pe-webplatform/iKiD6UfDTb_pOoQZ2RHTCzP5.webp");
                uqb0.f180374G.m127154r0("https://static.tancdn.com/pe-webplatform/Espsnpgm79p15sNAVGOcsGTv.webp");
            }
        }
        if (spl0.m187366R()) {
            h1c0.INSTANCE.m133322c();
        }
        if (spl0.m187369U()) {
            q0e0.INSTANCE.m174707l();
        }
        if (s7a.m184979h()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://fe-static.tancdn.com/v1/raw/fc24b12c-e55f-404c-8da2-a7916aacc4a814.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/8aebaed7-dff9-4bc9-9693-f2eb3509473214.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/84570b50-d8bb-472f-b054-29051c568dec14.svga");
            SVGALoader.with(App.f16088e).batchDownload(arrayList);
        }
        if (rm50.m182044e()) {
            uqb0.f180374G.m127154r0("https://auto.tancdn.com/v1/images/eyJpZCI6IlFZMlVFTU02WE1PVFpYM0RLVkhLTldOVjZISkRCNzEyIiwidyI6NzE4LCJoIjo0MzgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTg3ODQ2NzM1MjE4MTE0NjI5fQ.png");
        }
        C4522a.m22099p().m22101B(TextUtils.equals(ABManager.m30348i0("continue_popup"), AuthenticationTokenClaims.JSON_KEY_EXP));
        if (C4522a.m22099p().m22107I()) {
            C4522a.m22099p().m22126x(RemoteConfig.m80481x().m80485F("popup_schedule_config"));
        }
        gbe0.m129776b().m129779d();
        t8r.m189686a().m189689d(new me9());
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m30896V(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m30897W(Act act, C4470c c4470c) {
        if (c4470c == C4470c.f16271m) {
            llb0.m154703c().m154704b(act.hashCode());
        }
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m30899Y() {
        wkh0.m206816b();
        guy.m132421N().m132456O();
        guy.m132421N().m132457P();
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m30900Z(Act act) {
        if (NullChecker.m82486a(CoreModule.f18264c)) {
            CoreModule.f18264c.f20405m0.f20127X = 0;
        }
        tx0.m193439o().m193450Q();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m30905e0() {
        String str = CoreModule.f18264c.f20381e0.f89372z1.get();
        Locale locale = Locale.getDefault();
        if (TextUtils.equals(str, locale.getLanguage())) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            CoreModule.f18264c.f20378d0.f128826R.m159278o();
        }
        CoreModule.f18264c.f20381e0.f89372z1.put(locale.getLanguage());
    }

    /* JADX INFO: renamed from: m0 */
    public static eu9 m30906m0() {
        return f18257h.m127438a();
    }

    /* JADX INFO: renamed from: z0 */
    public static void m30907z0() {
        if (CoreModule.f18271j == null) {
            CoreModule.f18271j = CoreModule.f18264c.f20323K2.m174831E();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m30908A0() {
        if (this.f18259a.get().longValue() == 0) {
            this.f18259a.put(Long.valueOf(pzi0.m174454o()));
            this.f18260b.put(Long.valueOf(pzi0.m174454o()));
            f18258i = false;
            return;
        }
        if (m30913h0(pzi0.m174454o(), this.f18259a.get().longValue())) {
            this.f18259a.put(Long.valueOf(pzi0.m174454o()));
        } else {
            this.f18260b.put(this.f18259a.get());
            this.f18259a.put(Long.valueOf(pzi0.m174454o()));
        }
        if (tzi0.m193670h(this.f18259a.get().longValue(), this.f18260b.get().longValue(), 1) && !tzi0.m193670h(this.f18259a.get().longValue(), this.f18260b.get().longValue(), 2)) {
            f18258i = true;
        } else if (tzi0.m193670h(this.f18259a.get().longValue(), this.f18260b.get().longValue(), 2)) {
            f18258i = false;
        }
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ai */
    public void mo30909Ai() {
        ABManager.m30356q().take(1).subscribe(psd0.m173596G(new y20() { // from class: l.z87
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBusinessModule.m30896V((uxj0) obj);
            }
        }));
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ec */
    public void mo29133Ec() {
        SystemClock.elapsedRealtime();
        m30918r0();
        pk50.m172568j().m172584q("core", new C4863a());
        a17.m95457h().m95459j();
        xwa.m213305E();
        m30920w0();
        m30919t0();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22421c<uxj0> mo29134Jh() {
        hw80.f111874f = false;
        C7997b.m37423r().m37433J();
        return C22421c.just(uxj0.f181467a);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ma */
    public void mo29135Ma() {
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo29136Qh() {
        m30912g0();
        aq8.m99437v();
        bua buaVar = new bua();
        f18254e = buaVar;
        buaVar.m106509p();
        Act.foreground().distinctUntilChanged(new qcj() { // from class: l.m97
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Act.C4450r) obj) != null);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.o97
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBusinessModule.m30884F((Act.C4450r) obj);
            }
        }));
        Act.foreground().subscribe(psd0.m173596G(new y20() { // from class: l.p97
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBusinessModule.m30894S((Act.C4450r) obj);
            }
        }));
        hxj0.m137613b();
        Envelope.registerApiParseCompleteListener(new Envelope.ApiParseCompleteListener() { // from class: l.q97
            @Override // com.p1.mobile.putong.data.Envelope.ApiParseCompleteListener
            public final void onComplete(Envelope envelope) {
                this.f156199a.m30914k0(envelope);
            }
        });
        m30916n0();
        cqq.m111970e().m111977h(CoreBridgeImplementation.class);
        w0c.m204134O("tantan_core", new scj() { // from class: l.p87
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new TantanCoreBridge((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        w0c.m204134O("tantan_usercenter", new scj() { // from class: l.q87
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new gji0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        w0c.m204134O("tantan_growth", new scj() { // from class: l.r87
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new e9i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        w0c.m204134O("tantan_verification", new scj() { // from class: l.s87
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new wji0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        w0c.m204134O("tantan_swipe", new scj() { // from class: l.t87
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new shi0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        w0c.m204134O("tantan_commercialize", new scj() { // from class: l.u87
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new vci0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        w0c.m204134O("tantan_settings", new scj() { // from class: l.n97
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new igi0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        LocalChangedListener.register(CoreModule.f18263b);
        CorePopLevel corePopLevel = CorePopLevel.UNKNOWN;
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Wn */
    public void mo30910Wn() {
        if (gra.m131693i()) {
            CoreModule.f18264c.f20384f0.m33630Ee();
        }
        r8f0.m180187f().m180192i(CoreModule.f18263b);
        bze.m107153h().m107154e();
        l51.m152919y(new Runnable() { // from class: l.o87
            @Override // java.lang.Runnable
            public final void run() {
                oze.m169928i();
            }
        });
        LaunchStep launchStep = LaunchStep.InitAllTags;
        uqi.m197339f(launchStep);
        gj40.m130415o().m130434S();
        uqi.m197337d(launchStep);
        if (s7a.m184987p()) {
            br60.m106057m().m106058A();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m30911f0() {
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ft */
    public C22421c<uxj0> mo29137ft() {
        return CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: g0 */
    public final void m30912g0() {
        if (f18253d == null) {
            wr2 wr2Var = CoreModule.f18274m;
            f18253d = wr2Var;
            wr2Var.m207529a(f18255f);
        }
    }

    @Override // com.tantanapp.putong.module.Module
    public Context getContext() {
        return CoreModule.f18263b;
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m30913h0(long j, long j2) {
        SimpleDateFormat simpleDateFormatM157356a = new m8c("yy/MM/dd", Locale.getDefault()).m157356a();
        return simpleDateFormatM157356a.format(new Date(j)).equals(simpleDateFormatM157356a.format(new Date(j2)));
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
        CoreModule.f18263b = (Application) context;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m30914k0(Envelope envelope) {
        Relationship relationship;
        Profile profile;
        if (envelope == null) {
            CrashHelper.m82485i(new Exception("return null envelope"), "core_business_module_api_parse_complete", CrashHelper.ReportLevel.p4, 100);
            return;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        for (Conversation conversation : ((CoreData) envelope.getModuleData(CoreData.class)).conversations) {
            if (conversation != null) {
                map2.put(conversation.f56859id, conversation.status);
                map3.put(conversation.f56859id, conversation.convType);
            }
        }
        for (Relationship relationship2 : ((CoreData) envelope.getModuleData(CoreData.class)).relationships) {
            if (relationship2 != null) {
                map.put(relationship2.f39654id, relationship2);
            }
        }
        HashMap map4 = new HashMap();
        if (NullChecker.m82486a(CoreModule.m30932N())) {
            List<Followship> listMo61491Pn = CoreModule.m30932N().mo61491Pn(envelope);
            if (!jyb.m147479J(listMo61491Pn)) {
                for (Followship followship : listMo61491Pn) {
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
                    user.localFollowship = (Followship) map4.get(user.f56859id);
                }
                if (NullChecker.m82486a(user.profile) && NullChecker.m82486a(user.profile.extensions) && NullChecker.m82486a(user.profile.extensions.game) && !jyb.m147479J(user.profile.extensions.game.screenshot) && user.profile.extensions.game.screenshot.size() > 3) {
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
                if (userActivityInfo != null && TextUtils.equals(userActivityInfo.userId, user.f56859id)) {
                    user.userActivityInfo = userActivityInfo;
                }
                if (map.size() != 0 && map.get(user.f56859id) != null) {
                    user.localRelationship = (Relationship) map.get(user.f56859id);
                    if (map2.size() != 0) {
                        user.localRelationship.conversationStatus = (ConversationStatus) map2.get(user.f56859id);
                    }
                    if (map3.size() == 0 || TextUtils.isEmpty((CharSequence) map3.get(user.f56859id))) {
                        User userM116506Q9 = CoreModule.f18264c.f20381e0.m116506Q9(user.f56859id);
                        if (userM116506Q9 != null && (relationship = userM116506Q9.localRelationship) != null && !TextUtils.isEmpty(relationship.convType)) {
                            user.localRelationship.convType = userM116506Q9.localRelationship.convType;
                        }
                    } else {
                        user.localRelationship.convType = (String) map3.get(user.f56859id);
                    }
                }
                if (gra.m131649Y1() && user.ideal != null) {
                    List<String> list = user.profile.extensions.basic.idealType;
                    if (list != null) {
                        boolean zM147479J = jyb.m147479J(list);
                        Profile profile2 = user.profile;
                        if (zM147479J) {
                            profile2.extensions.basic.ideal = jyb.m147507f0(new IdealTag[0]);
                        } else {
                            ArrayList arrayListM147522n = jyb.m147522n(jyb.m147486Q(profile2.extensions.basic.idealType, new qcj() { // from class: l.b97
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return CoreBusinessModule.m30885H(user, (String) obj);
                                }
                            }), new qcj() { // from class: l.c97
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return Boolean.valueOf(NullChecker.m82486a((IdealTag) obj));
                                }
                            });
                            if (!jyb.m147479J(arrayListM147522n)) {
                                user.profile.extensions.basic.ideal = arrayListM147522n;
                            }
                        }
                    }
                    if (!jyb.m147479J(user.ideal.mediaTagIdeal)) {
                        if (user.ideal.mediaTagIdeal != null) {
                            Iterator<Media> it = user.pictures.iterator();
                            while (it.hasNext()) {
                                it.next().tagIdealInfo = new ArrayList();
                            }
                        }
                        for (PictureIdealInfo pictureIdealInfo : user.ideal.mediaTagIdeal) {
                            if (pictureIdealInfo.index < user.pictures.size()) {
                                ArrayList arrayListM147486Q = jyb.m147486Q(pictureIdealInfo.idealTypes, new qcj() { // from class: l.d97
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return CoreBusinessModule.m30890N((String) obj);
                                    }
                                });
                                if (!jyb.m147479J(arrayListM147486Q)) {
                                    user.pictures.get(pictureIdealInfo.index).tagIdealInfo = arrayListM147486Q;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (gra.m131637V1()) {
            HashMap map5 = new HashMap();
            if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).conversations)) {
                for (Conversation conversation2 : ((CoreData) envelope.getModuleData(CoreData.class)).conversations) {
                    if (conversation2 != null && pm6.m172913a(conversation2)) {
                        map5.put(conversation2.otherUser, conversation2.f56859id);
                    }
                }
            }
            if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups)) {
                for (ChatGroup chatGroup : ((CoreData) envelope.getModuleData(CoreData.class)).chatGroups) {
                    if (chatGroup != null) {
                        String str = (String) map5.get(chatGroup.f56859id);
                        if (!TextUtils.isEmpty(str)) {
                            chatGroup.localConId = str;
                        }
                    }
                }
            }
            if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
                for (Message message : ((CoreData) envelope.getModuleData(CoreData.class)).messages) {
                    if (message != null && TEnum.equals(message.channel, "group")) {
                        String str2 = (String) map5.get(message.api_only_otherUser);
                        if (!TextUtils.isEmpty(str2)) {
                            message.cid = str2;
                        }
                    }
                }
            }
            if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups)) {
                for (ChatGroup chatGroup2 : ((CoreData) envelope.getModuleData(CoreData.class)).chatGroups) {
                    if (chatGroup2 != null) {
                        m30922y0(chatGroup2, envelope);
                    }
                }
            }
            if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).interestedGroups)) {
                for (ChatGroup chatGroup3 : ((CoreData) envelope.getModuleData(CoreData.class)).interestedGroups) {
                    if (chatGroup3 != null) {
                        m30922y0(chatGroup3, envelope);
                    }
                }
            }
            if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).groupNotifications)) {
                List<GroupApply> list2 = jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).groupApplies) ? Collections.EMPTY_LIST : ((CoreData) envelope.getModuleData(CoreData.class)).groupApplies;
                List<ChatGroup> list3 = jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups) ? Collections.EMPTY_LIST : ((CoreData) envelope.getModuleData(CoreData.class)).chatGroups;
                List<User> list4 = jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users) ? Collections.EMPTY_LIST : ((CommonData) envelope.getModuleData(CommonData.class)).users;
                ArrayList arrayList2 = new ArrayList();
                for (final GroupNotification groupNotification : ((CoreData) envelope.getModuleData(CoreData.class)).groupNotifications) {
                    if (groupNotification != null && "join_group_apply".equals(groupNotification.type)) {
                        groupNotification.groupApplyData = (GroupApply) jyb.m147529r(list2, new qcj() { // from class: l.e97
                            @Override // p153l.qcj
                            public final Object call(Object obj) {
                                return Boolean.valueOf(TextUtils.equals(((GroupApply) obj).f21146id, groupNotification.groupApply.f21146id));
                            }
                        });
                        groupNotification.chatGroupData = (ChatGroup) jyb.m147529r(list3, new qcj() { // from class: l.f97
                            @Override // p153l.qcj
                            public final Object call(Object obj) {
                                return Boolean.valueOf(TextUtils.equals(groupNotification.groupApplyData.groupId, ((ChatGroup) obj).f56859id));
                            }
                        });
                        groupNotification.userData = (User) jyb.m147529r(list4, new qcj() { // from class: l.g97
                            @Override // p153l.qcj
                            public final Object call(Object obj) {
                                return Boolean.valueOf(TextUtils.equals(groupNotification.groupApplyData.userId, ((User) obj).f56859id));
                            }
                        });
                        arrayList2.add(groupNotification);
                    }
                }
                ((CoreData) envelope.getModuleData(CoreData.class)).groupNotifications = arrayList2;
            }
        }
        s75.m184968q(envelope);
        fcp.m125031w(envelope);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m30915l0(Act act) {
        if (CoreModule.m30929H().signedIn_()) {
            m30908A0();
        }
        tx0.m193439o().m193449P();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ms */
    public void mo29138ms() {
        CoreModule.f18264c.clearRequestsAndStop();
        CoreModule.f18264c.f20300D0.clearRequestsAndStop();
        CoreModule.f18264c.f20384f0.m33643Fe();
        uqb0.f180388T.m30580R();
        wrf0.m207592j();
        upm.m197128Y();
        nh00.m163017a();
        x19.m208996w().m209009u();
        ts8.m192568b().m192569a();
        g7d0.m129314d0();
        C8509a.m46746j().m46749h();
        b240.f74490X0 = true;
        z5h0.m218679t();
        xzm0.m213760p().m213782z();
        if (xzm0.m213760p().m213775s()) {
            wyb0.m208524s0();
        }
        y63.m214366j().m214376t();
        C18823n9.m161958j().m161967s();
        zsb.m221313f().m221319j();
        a8d0.m96418F0();
        OnlineMatchManager.m51310e0();
        xzc0.m213707O();
        TabUniteManager.m46136i().m46144p();
        yti0.m217323k();
        t4j.m189283j();
        uqx.m197402y();
        fp60.m126544F();
        vj30.m201482t();
        yyh0.INSTANCE.m217994j();
        ktl0.m151365I0();
        s8d0.m185068k();
        b5d0.m102567a();
        qk60.m176926c();
        ueh0.m195762p();
        mwl0.m160568a();
        if (d09.m113376m() || d09.m113377n()) {
            of7.m167420o().m167431n();
        }
        a5i0.m96094F0();
        lq40.m155317b();
        yie0.m216085r();
        if (IntlCountryCodeController.m29110g()) {
            o3z.m165898g().m165907m();
        }
        ijj.m140191c().m140194d();
        z90.m219038c();
        wtd0.m207835m();
        t450.m189177m();
        i7d0.m138927c();
        aw90.m100581l0();
        j7d0.m143776e0();
        p6d0.m170848i0();
        b1a0.m101462e();
        C4880a0.m32390j().m32407v();
        rcn.m180797q().m180807w();
        C8509a.m46746j().m46756p();
        r8n.m180219f().m180232o();
        fcp.m125022i().m125043v();
        bep.INSTANCE.m103748m();
        udo.INSTANCE.m195503c();
        sp0.INSTANCE.m187288b();
        ur40.INSTANCE.m197465i();
        k7d0.m148636c0();
        kde0.m149192o().m149200v();
        ud2.m195456j().m195466m();
        if (d09.m113370g()) {
            uih0.m196194c1();
        }
        wgb0.m206191c();
        zg6.m219596g();
        if (h7d0.m133774m0()) {
            h7d0.m133775o0();
        }
        x5l0.m209397j();
        eqq0.m122036m();
        xje0.m211213e();
        d7d0.m114720f();
        bpe0.m105815g();
        k190.m147846b();
        CoreModule.f18264c.f20427t1.m32517s();
        CoreModule.f18264c.f20378d0.f128828T.put(0L);
        C8619b.m48829z();
        C8618a.m48757O();
        wkh0.m206819e();
        rv4.m183253c();
        uj4.m196319d();
        C8018a.m38417i().m38426o();
        k05.m147756r();
        if (C4522a.m22099p().m22107I()) {
            C4522a.m22099p().m22116m();
        }
        CoreModule.m30933P().m143405a().mo34503fl();
        vih0.m201340f();
        ebm.m120182c();
        wek0.m206002l();
        nvm.m164891y();
        en4.m121427i();
        fdw.m125141j();
        if (NullChecker.m82487b(CoreModule.f18270i)) {
            CoreModule.f18270i.unsubscribe();
        }
        if (NullChecker.m82486a(CoreModule.f18271j)) {
            CoreModule.f18271j.unsubscribe();
        }
        if (CoreModule.m30932N().mo61549ko()) {
            e3i.m119288c().m119294g();
        }
        CoreModule.f18271j = null;
        RemoteConfig.m80481x().m80504b0();
        C4888e0.m32953g();
        jj40.f121143f.clear();
        gj40.m130415o().m130427L();
        cl80.m110426e().m110438p();
        efh0.m120692j().m120699m();
        nzi0.m165372a().m165375d();
        if (CoreModule.f18276o.m132212b().mo34652wf()) {
            qap.INSTANCE.m175979q();
        }
        if (s7a.m184982k()) {
            xei.m210681k();
        }
        if (s7a.m184985n()) {
            p550.m170602l();
        }
        wgx.m206283A().m206309I();
        cs20.m112113a().m112119g();
        otm.m169126A();
        yap.m214906l();
        vyh0.m203996a();
        bi40.m104410a();
        bpc0.m105790b();
        try {
            String strUserId = CoreModule.m30929H().userId();
            if (TextUtils.isEmpty(strUserId)) {
                return;
            }
            new wyd0("live_region_tag_" + strUserId, "").clear();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m30916n0() {
        if (gra.m131542B()) {
            uqb0.f180374G.m127154r0("https://fe-static.tancdn.com/v1/images/eyJpZCI6IlZKWVdYSktTUEdJWUUyVVFVQkNYNk1NWDdQWUJRQzE0IiwidyI6NDIwLCJoIjo0MjEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MzQ1MTY1ODQ3ODUwNTg4NDE5fQ.webp");
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m30917o0() {
        try {
            rd00.m180829d(CoreModule.f18263b);
            y8r.m214774a().identifyLanguage("init").addOnCompleteListener(new C4864b());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m30918r0() {
        ABManager.m30323R(new gra());
        ABManager.m30323R(new spl0());
        ABManager.m30323R(new d09());
        ABManager.m30323R(new xg50());
        ABManager.m30323R(new wcl0());
        ABManager.m30323R(new d79());
        ABManager.m30323R(new g4a());
        ABManager.m30323R(new s7a());
        ABManager.m30323R(new t7a());
        ABManager.m30323R(new rs9());
        ABManager.m30323R(s75.m184964l());
    }

    /* JADX INFO: renamed from: t0 */
    public final void m30919t0() {
        srf srfVarM187598a = srf.m187598a();
        ExtraActLifecycle extraActLifecycle = ExtraActLifecycle.onInitSubscription;
        srfVarM187598a.m187599b(extraActLifecycle, new y20() { // from class: l.v87
            @Override // p153l.y20
            public final void call(Object obj) {
                new rrf((Act) obj).m182769e();
            }
        });
        srf.m187598a().m187599b(ExtraActLifecycle.onStopToBackground, new y20() { // from class: l.w87
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBusinessModule.m30900Z((Act) obj);
            }
        });
        srf.m187598a().m187599b(ExtraActLifecycle.onResumeFromBackground, new y20() { // from class: l.x87
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBusinessModule.m30891P((Act) obj);
            }
        });
        srf.m187598a().m187599b(ExtraActLifecycle.onResumeFromAppStartOrBackground, new y20() { // from class: l.y87
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197945a.m30915l0((Act) obj);
            }
        });
        srf.m187598a().m187599b(extraActLifecycle, new y20() { // from class: l.a97
            @Override // p153l.y20
            public final void call(Object obj) {
                Act act = (Act) obj;
                act.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.h97
                    @Override // p153l.y20
                    public final void call(Object obj2) {
                        CoreBusinessModule.m30897W(act, (C4470c) obj2);
                    }
                }));
            }
        });
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: tr */
    public void mo29139tr(boolean z) {
        LaunchStep launchStep = LaunchStep.CoreAfterSignIn;
        uqi.m197339f(launchStep);
        f18256g = new tl9();
        m30912g0();
        f18252c = CoreModule.f18275n;
        l51.m152913s(new Runnable() { // from class: l.j97
            @Override // java.lang.Runnable
            public final void run() {
                CoreBusinessModule.m30887K();
            }
        });
        m30905e0();
        m30921x0();
        CoreModule.f18264c.f20317I2 = "";
        rcn.m180797q().m180801p();
        C8509a.m46746j().m46748g();
        cjj.m110198F();
        CoreModule.f18264c.f20346S0.m35185B3();
        CoreModule.f18264c.f20391h1.m166318j3();
        fcp.m125022i().m125036e();
        d79.m114694o();
        if (uqb0.f180371E0.get().booleanValue()) {
            NetworkMetricsStatistics.INSTANCE.m19251b();
        }
        if (d09.m113370g()) {
            uih0.m196229w0();
        }
        xzm0.m213760p().m213763f();
        C7997b.m37423r().m37424A();
        if (z && CoreModule.m30929H().mo29162a().mo105649c()) {
            uqb0.f180383O.m191626P(true);
        }
        sw6.m188255o3();
        ABManager.m30356q().take(1).subscribe(psd0.m173596G(new y20() { // from class: l.k97
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBusinessModule.m30895T((uxj0) obj);
            }
        }));
        m30908A0();
        if (!d79.m114699q0()) {
            CoreModule.f18264c.f20382e1.m198339b3();
        }
        if (kde0.m149195u()) {
            kde0.m149192o().m149196n();
        }
        ts8.m192568b().m192570c();
        cl80.m110426e().m110432j();
        if (gra.m131621R1()) {
            m6i.f135005g = true;
        }
        CoreModule.f18264c.f20364Y0.m179745d();
        m30911f0();
        m30917o0();
        uqi.m197337d(launchStep);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m30920w0() {
        WebSocketManager.m30421Q().m30470f0(new s4w());
        WebSocketManager.m30421Q().m30470f0(new y4w());
        WebSocketManager.m30421Q().m30470f0(new w4w());
        WebSocketManager.m30421Q().m30470f0(new u4w());
        WebSocketManager.m30421Q().m30470f0(new z4w());
        WebSocketManager.m30421Q().m30470f0(new v4w());
        WebSocketManager.m30421Q().m30470f0(new x4w());
        WebSocketManager.m30421Q().m30470f0(new t4w());
        WebSocketManager.m30421Q().m30470f0(new r4w());
        WebSocketManager.m30421Q().m30469e0(new v4c0());
        WebSocketManager.m30421Q().m30469e0(new oj40());
        oj40.m167842j();
        WebSocketManager.m30421Q().m30469e0(new n0l());
        WebSocketManager.m30421Q().m30469e0(new p4w());
        WebSocketManager.m30421Q().m30469e0(new t8f0());
        WebSocketManager.m30421Q().m30469e0(new a5w());
        WebSocketManager.m30421Q().m30469e0(new q3w());
        WebSocketManager.m30421Q().m30469e0(new n3w());
        WebSocketManager.m30421Q().m30469e0(new e2w());
        WebSocketManager.m30421Q().m30469e0(new b5w());
        WebSocketManager.m30421Q().m30469e0(new o4w());
        WebSocketManager.m30421Q().m30469e0(new e8w());
        e8w.m119838j();
    }

    /* JADX INFO: renamed from: x0 */
    public void m30921x0() {
        String str;
        try {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (userM116600p9 == null) {
                return;
            }
            uqb0.m197255X0("gender", userM116600p9.gender.toString());
            if (userM116600p9.age.intValue() <= 20) {
                str = "18-20";
            } else if (userM116600p9.age.intValue() <= 22) {
                str = "21-22";
            } else if (userM116600p9.age.intValue() <= 25) {
                str = "23-25";
            } else if (userM116600p9.age.intValue() <= 30) {
                str = "26-30";
            } else {
                str = userM116600p9.age.intValue() <= 40 ? "31-40" : "41+";
            }
            uqb0.m197255X0("age_group", str);
            uqb0.m197255X0("latest_country_name_en", userM116600p9.location.region.country);
            uqb0.m197255X0("latest_city_name_en", userM116600p9.location.region.city);
            uqb0.m197255X0("latest_district_name_en", userM116600p9.location.region.district);
            VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
            if (CoreModule.f18264c.f20381e0.m116575j8(userM116600p9)) {
                uqb0.m197255X0(NotificationCompat.CATEGORY_STATUS, "default");
            } else if (userM116600p9.status.contains(UserStatus.get("hidden"))) {
                uqb0.m197255X0(NotificationCompat.CATEGORY_STATUS, "hidden");
            } else if (userM116600p9.isBanned()) {
                uqb0.m197255X0(NotificationCompat.CATEGORY_STATUS, ChatGroupStatus.banned);
            } else if (userM116600p9.inactivated) {
                uqb0.m197255X0(NotificationCompat.CATEGORY_STATUS, "inactivated");
            } else if (userM116600p9.veryUgly()) {
                uqb0.m197255X0(NotificationCompat.CATEGORY_STATUS, "inappropriate");
            } else if (!NullChecker.m82486a(verificationCenterM32615k4) || TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending")) {
                uqb0.m197255X0(NotificationCompat.CATEGORY_STATUS, "pending");
            }
            uqb0.m197255X0("popularity", String.valueOf(userM116600p9.popLevel));
            uqb0.m197255X0("lastest_os_name", "Android");
            uqb0.m197255X0("picture_verification", String.valueOf(userM116600p9.isPicVerificationVerified()));
            Settings settings = userM116600p9.settings;
            if (settings != null) {
                uqb0.m197255X0("student_verification", String.valueOf(TEnum.equals(settings.verification.studies.status, "verified")));
            }
            uqb0.m197255X0("is_see", String.valueOf(CoreModule.f18264c.f20358W0));
            uqb0.m197255X0("wealth_grade", String.valueOf(userM116600p9.hierarchy.grade));
            uqb0.m197255X0("isVIP", String.valueOf(userM116600p9.isVIP() || userM116600p9.isSVIP()));
            uqb0.m197255X0("mcc", String.valueOf(uqb0.f180400f0));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m30922y0(ChatGroup chatGroup, Envelope envelope) {
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).chatGroupMembers)) {
            for (ChatGroupMember chatGroupMember : ((CoreData) envelope.getModuleData(CoreData.class)).chatGroupMembers) {
                if (chatGroupMember != null && TextUtils.equals(chatGroup.f56859id, chatGroupMember.groupId) && TextUtils.equals(CoreModule.m30929H().userId(), chatGroupMember.userId)) {
                    if (!TEnum.equals(chatGroupMember.status, "default") && !TEnum.equals(chatGroupMember.status, ChatGroupMemberStatus.silenced)) {
                        break;
                    }
                    chatGroup.groupApply.status = GroupApplyStatus.get("approved");
                    return;
                }
            }
        }
        if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).groupApplies)) {
            return;
        }
        for (GroupApply groupApply : ((CoreData) envelope.getModuleData(CoreData.class)).groupApplies) {
            if (groupApply != null && TextUtils.equals(chatGroup.f56859id, groupApply.groupId) && TextUtils.equals(CoreModule.m30929H().userId(), groupApply.userId)) {
                if (TEnum.equals(groupApply.status, "default")) {
                    chatGroup.groupApply.status = GroupApplyStatus.get("default");
                    return;
                }
                return;
            }
        }
    }
}
