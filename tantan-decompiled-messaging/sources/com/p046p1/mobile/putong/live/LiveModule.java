package com.p046p1.mobile.putong.live;

import android.app.Application;
import android.content.Context;
import android.net.NetworkInfo;
import com.momo.xeengine.XEnginePreferences;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.ExtraActLifecycle;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.apibean.LiveClientSwitchesBean;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.webview.LiveCameraBridgeImplementation;
import com.p046p1.mobile.putong.live.external.square.home.LiveLocaleChangedReceiver;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.putong.module.Module;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import p133rx.C22306c;
import p149l.bqf;
import p149l.cqf;
import p149l.doq;
import p149l.e30;
import p149l.e51;
import p149l.eqf;
import p149l.eqs;
import p149l.f8c;
import p149l.ffw;
import p149l.g6s;
import p149l.gkh0;
import p149l.hfw;
import p149l.izb;
import p149l.l9s;
import p149l.lcu;
import p149l.lor;
import p149l.lqf;
import p149l.nbt;
import p149l.o4s;
import p149l.qib0;
import p149l.roj0;
import p149l.rw0;
import p149l.s9s;
import p149l.tht;
import p149l.tpf;
import p149l.uut;
import p149l.uvr;
import p149l.vdt;
import p149l.vpv;
import p149l.w8u;
import p149l.y9j;
import p149l.ypv;
import p149l.zpf;

/* JADX INFO: loaded from: classes13.dex */
@Route(name = "me_", path = "/live_module/module")
public class LiveModule implements Module {

    /* JADX INFO: renamed from: h */
    public static Application f44056h;

    /* JADX INFO: renamed from: i */
    public static g6s f44057i;

    /* JADX INFO: renamed from: a */
    public s9s f44058a;

    /* JADX INFO: renamed from: b */
    public ypv f44059b;

    /* JADX INFO: renamed from: d */
    public lcu f44061d;

    /* JADX INFO: renamed from: e */
    public o4s f44062e;

    /* JADX INFO: renamed from: c */
    public boolean f44060c = false;

    /* JADX INFO: renamed from: f */
    public boolean f44063f = true;

    /* JADX INFO: renamed from: g */
    public boolean f44064g = true;

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ai */
    public void mo29911Ai() {
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ec */
    public void mo28134Ec() {
        ABManager.m29325R(new lor());
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22306c<roj0> mo28135Jh() {
        lcu lcuVar = this.f44061d;
        if (lcuVar != null) {
            lcuVar.m149368e();
        }
        gkh0.m126626i();
        return C22306c.just(roj0.f160388a);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ma */
    public void mo28136Ma() {
        g6s g6sVar = f44057i;
        if (g6sVar != null) {
            g6sVar.mo100767i();
        }
        f8c f8cVarM119878o = f8c.m119878o();
        g6s g6sVar2 = new g6s();
        f8cVarM119878o.m119901y(g6sVar2);
        f44057i = g6sVar2;
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo28137Qh() {
        ypv.f199497e = f44056h;
        izb.m139033C("tantan_live", new y9j() { // from class: l.u3t
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new c6i0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        doq.m112810e().m112817h(LiveBridgeImpl.class);
        doq.m112810e().m112817h(LiveCameraBridgeImplementation.class);
        nbt.m158840j();
        tht.m188930c();
        LiveLocaleChangedReceiver.register(f44056h);
        eqs.m117790r();
        if (rw0.m181367a()) {
            return;
        }
        m67196Y().m182768h();
        uvr.m196089f().m196096b();
    }

    /* JADX INFO: renamed from: T */
    public final void m67192T() {
        this.f44063f = !TEnum.equals(qib0.f154719h0, "unknown_");
    }

    /* JADX INFO: renamed from: V */
    public final void m67193V(LiveClientSwitchesBean liveClientSwitchesBean) {
        LiveClientSwitchesBean.LiveClientSwitchesGroup liveClientSwitchesGroup;
        LiveClientSwitchesBean.LiveSwitch liveSwitch;
        if (liveClientSwitchesBean == null || (liveClientSwitchesGroup = liveClientSwitchesBean.switches) == null || (liveSwitch = liveClientSwitchesGroup.realtime) == null || !liveSwitch.f44237on) {
            return;
        }
        LiveClientSwitchesBean.LiveSwitchConfig liveSwitchConfig = liveSwitch.config;
        try {
            gkh0.m126621d(f44056h, liveSwitchConfig, ypv.f199498f);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        this.f44061d = new lcu(liveSwitchConfig);
    }

    /* JADX INFO: renamed from: W */
    public final void m67194W(boolean z) {
        boolean zM181367a = rw0.m181367a();
        boolean z2 = this.f44060c;
        if (zM181367a) {
            hfw.m130790a("[live]living_room", "LiveModule.ensureApi(). initApi is " + z2 + " , and newSignIn is " + z);
            if (!this.f44060c || z) {
                this.f44060c = true;
                final uut uutVar = new uut(f44056h, new e30() { // from class: l.r3t
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        pgi0.m168730l().m168749v((BLiveSettings) obj);
                    }
                });
                m67196Y().m182770j(uutVar);
                m67197Z().m215681i(uutVar);
                ABManager.m29358q().take(1).subscribe(ffw.m121193d(new e30() { // from class: l.s3t
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f162192a.m67200c0(uutVar, (roj0) obj);
                    }
                }));
                return;
            }
            return;
        }
        hfw.m130790a("[live]living_room", "LiveModule.ensureApi(). initApi is " + z2 + " , and newSignIn is " + z);
        if (!this.f44060c || z) {
            this.f44060c = true;
            m67196Y().m182771k(z);
            m67197Z().m215680h();
            ABManager.m29358q().take(1).subscribe(ffw.m121193d(new e30() { // from class: l.t3t
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f167654a.m67201d0((roj0) obj);
                }
            }));
            o4s o4sVar = this.f44062e;
            if (o4sVar != null) {
                o4sVar.m121236q();
            }
        }
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Wn */
    public void mo29912Wn() {
        if (rw0.m181367a()) {
            e51.m114742G(new Runnable() { // from class: l.o3t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f141708a.m67199b0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m67195X(final boolean z) {
        hfw.m130790a("[live]living_room", "LiveModule.ensureApi(). initApi is " + this.f44060c + " , and newSignIn is " + z);
        if (this.f44060c && !z) {
            if (this.f44063f) {
                return;
            }
            if (TEnum.equals(qib0.f154719h0, "unknown_")) {
                e51.m114743H(App.f15369e, new Runnable() { // from class: l.q3t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f152513a.m67204g0();
                    }
                }, 200L);
                return;
            } else {
                m67204g0();
                return;
            }
        }
        this.f44060c = true;
        m67198a0(z);
        ABManager.m29358q().take(1).subscribe(ffw.m121193d(new e30() { // from class: l.p3t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147016a.m67202e0(z, (roj0) obj);
            }
        }));
        o4s o4sVar = this.f44062e;
        if (o4sVar != null) {
            o4sVar.m121236q();
        }
        m67192T();
    }

    /* JADX INFO: renamed from: Y */
    public final s9s m67196Y() {
        if (this.f44058a == null) {
            this.f44058a = new s9s(f44056h);
        }
        return this.f44058a;
    }

    /* JADX INFO: renamed from: Z */
    public final ypv m67197Z() {
        if (this.f44059b == null) {
            this.f44059b = new ypv(new vpv(new eqf(), new zpf(), new tpf(), new bqf()));
        }
        return this.f44059b;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m67198a0(boolean z) {
        m67196Y().m182771k(z);
        m67197Z().m215680h();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m67199b0() {
        m67196Y().m182769i();
        m67197Z().m215677e();
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m67200c0(final uut uutVar, roj0 roj0Var) {
        if (lor.m150807l()) {
            hfw.m130790a("[live]living_room", "LiveModule.ensureApi(). After ABManager. LiveAbController.isLiveEnable() is true");
            if (this.f44064g) {
                this.f44064g = false;
                lqf.m151015a().m151016b(ExtraActLifecycle.onInitDataOnCreate, new e30() { // from class: l.k3t
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        pgi0.m168730l().m168735g((Act) obj);
                    }
                });
                e51.m114774y(new Runnable() { // from class: l.l3t
                    @Override // java.lang.Runnable
                    public final void run() {
                        uutVar.m121230k().subscribe();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m67201d0(roj0 roj0Var) {
        if (lor.m150807l()) {
            hfw.m130790a("[live]living_room", "LiveModule.ensureApi(). After ABManager. LiveAbController.isLiveEnable() is true");
            m67196Y().m182767g();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m67202e0(boolean z, roj0 roj0Var) {
        if (lor.m150807l()) {
            if (!s9s.f163229c) {
                m67198a0(z);
            }
            hfw.m130790a("[live]living_room", "LiveModule.ensureApi(). After ABManager. LiveAbController.isLiveEnable() is true");
            m67196Y().m182767g();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m67203f0(NetworkInfo networkInfo) {
        this.f44062e.m121236q();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ft */
    public C22306c<roj0> mo28138ft() {
        if (rw0.m181367a()) {
            return C22306c.just(roj0.f160388a);
        }
        if (vdt.m198092b(1)) {
            m67194W(true);
        } else {
            m67195X(true);
        }
        return C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m67204g0() {
        s9s.m182765p();
        m67192T();
    }

    @Override // com.tantanapp.putong.module.Module
    public Context getContext() {
        return f44056h;
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
        Application application = (Application) context;
        f44056h = application;
        w8u.m202206D(application);
        XEnginePreferences.initSDK(App.f15369e, l9s.m149096q(), "bafc9b2dac43efae663ff86726e4863f", true);
        o4s o4sVar = new o4s(context, new e30() { // from class: l.j3t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116110a.m67193V((LiveClientSwitchesBean) obj);
            }
        });
        this.f44062e = o4sVar;
        o4sVar.m121230k().subscribe();
        this.f44062e.m121236q();
        ConnectivityReceiver.m81290m().skip(1).distinctUntilChanged().subscribe(ffw.m121193d(new e30() { // from class: l.m3t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131119a.m67203f0((NetworkInfo) obj);
            }
        }));
        m67196Y();
        uvr.m196093j(f44056h, new cqf(), this.f44062e);
        m67197Z();
        e51.m114774y(new Runnable() { // from class: l.n3t
            @Override // java.lang.Runnable
            public final void run() {
                BLiveData.new_();
            }
        });
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ms */
    public void mo28139ms() {
        ((LiveServiceImpl) qib0.f154713b0.f139232c).release();
        m67197Z().m215684q();
        m67196Y().m182773o();
        this.f44058a = null;
        this.f44059b = null;
        this.f44060c = false;
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: tr */
    public void mo28140tr(boolean z) {
        m67194W(false);
    }
}
