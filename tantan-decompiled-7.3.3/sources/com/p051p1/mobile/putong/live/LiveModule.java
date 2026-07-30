package com.p051p1.mobile.putong.live;

import android.app.Application;
import android.content.Context;
import android.net.NetworkInfo;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.momo.xeengine.XEnginePreferences;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.ExtraActLifecycle;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.apibean.LiveClientSwitchesBean;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.webview.LiveCameraBridgeImplementation;
import com.p051p1.mobile.putong.live.external.square.home.LiveLocaleChangedReceiver;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.putong.module.Module;
import p137rx.C22421c;
import p153l.arf;
import p153l.cqq;
import p153l.dhw;
import p153l.fhw;
import p153l.fss;
import p153l.grf;
import p153l.h8s;
import p153l.irf;
import p153l.jrf;
import p153l.l51;
import p153l.l9c;
import p153l.lrf;
import p153l.mbs;
import p153l.meu;
import p153l.mqr;
import p153l.nsh0;
import p153l.odt;
import p153l.p6s;
import p153l.scj;
import p153l.srf;
import p153l.tbs;
import p153l.ujt;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vwt;
import p153l.vxr;
import p153l.w0c;
import p153l.wft;
import p153l.wrv;
import p153l.xau;
import p153l.y20;
import p153l.yw0;
import p153l.zrv;

/* JADX INFO: loaded from: classes13.dex */
@Route(name = "me_", path = "/live_module/module")
public class LiveModule implements Module {

    /* JADX INFO: renamed from: h */
    public static Application f44904h;

    /* JADX INFO: renamed from: i */
    public static h8s f44905i;

    /* JADX INFO: renamed from: a */
    public tbs f44906a;

    /* JADX INFO: renamed from: b */
    public zrv f44907b;

    /* JADX INFO: renamed from: d */
    public meu f44909d;

    /* JADX INFO: renamed from: e */
    public p6s f44910e;

    /* JADX INFO: renamed from: c */
    public boolean f44908c = false;

    /* JADX INFO: renamed from: f */
    public boolean f44911f = true;

    /* JADX INFO: renamed from: g */
    public boolean f44912g = true;

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ai */
    public void mo30909Ai() {
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ec */
    public void mo29133Ec() {
        ABManager.m30323R(new mqr());
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22421c<uxj0> mo29134Jh() {
        meu meuVar = this.f44909d;
        if (meuVar != null) {
            meuVar.m158102e();
        }
        nsh0.m164607i();
        return C22421c.just(uxj0.f181467a);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ma */
    public void mo29135Ma() {
        h8s h8sVar = f44905i;
        if (h8sVar != null) {
            h8sVar.mo133950i();
        }
        l9c l9cVarM153394o = l9c.m153394o();
        h8s h8sVar2 = new h8s();
        l9cVarM153394o.m153417y(h8sVar2);
        f44905i = h8sVar2;
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo29136Qh() {
        zrv.f205803e = f44904h;
        w0c.m204134O("tantan_live", new scj() { // from class: l.v5t
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new nei0((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
        cqq.m111970e().m111977h(LiveBridgeImpl.class);
        cqq.m111970e().m111977h(LiveCameraBridgeImplementation.class);
        odt.m167339j();
        ujt.m196461c();
        LiveLocaleChangedReceiver.register(f44904h);
        fss.m127255r();
        if (yw0.m217558a()) {
            return;
        }
        m68379Y().m190082h();
        vxr.m203878f().m203885b();
    }

    /* JADX INFO: renamed from: T */
    public final void m68375T() {
        this.f44911f = !TEnum.equals(uqb0.f180402h0, "unknown_");
    }

    /* JADX INFO: renamed from: V */
    public final void m68376V(LiveClientSwitchesBean liveClientSwitchesBean) {
        LiveClientSwitchesBean.LiveClientSwitchesGroup liveClientSwitchesGroup;
        LiveClientSwitchesBean.LiveSwitch liveSwitch;
        if (liveClientSwitchesBean == null || (liveClientSwitchesGroup = liveClientSwitchesBean.switches) == null || (liveSwitch = liveClientSwitchesGroup.realtime) == null || !liveSwitch.f45085on) {
            return;
        }
        LiveClientSwitchesBean.LiveSwitchConfig liveSwitchConfig = liveSwitch.config;
        try {
            nsh0.m164602d(f44904h, liveSwitchConfig, zrv.f205804f);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        this.f44909d = new meu(liveSwitchConfig);
    }

    /* JADX INFO: renamed from: W */
    public final void m68377W(boolean z) {
        boolean zM217558a = yw0.m217558a();
        boolean z2 = this.f44908c;
        if (zM217558a) {
            fhw.m125605a("[live]living_room", "LiveModule.ensureApi(). initApi is " + z2 + " , and newSignIn is " + z);
            if (!this.f44908c || z) {
                this.f44908c = true;
                final vwt vwtVar = new vwt(f44904h, new y20() { // from class: l.s5t
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ppi0.m173207l().m173226v((BLiveSettings) obj);
                    }
                });
                m68379Y().m190084j(vwtVar);
                m68380Z().m221202i(vwtVar);
                ABManager.m30356q().take(1).subscribe(dhw.m115825d(new y20() { // from class: l.t5t
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f172228a.m68383c0(vwtVar, (uxj0) obj);
                    }
                }));
                return;
            }
            return;
        }
        fhw.m125605a("[live]living_room", "LiveModule.ensureApi(). initApi is " + z2 + " , and newSignIn is " + z);
        if (!this.f44908c || z) {
            this.f44908c = true;
            m68379Y().m190085k(z);
            m68380Z().m221201h();
            ABManager.m30356q().take(1).subscribe(dhw.m115825d(new y20() { // from class: l.u5t
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f177671a.m68384d0((uxj0) obj);
                }
            }));
            p6s p6sVar = this.f44910e;
            if (p6sVar != null) {
                p6sVar.m159280q();
            }
        }
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Wn */
    public void mo30910Wn() {
        if (yw0.m217558a()) {
            l51.m152887G(new Runnable() { // from class: l.p5t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f150674a.m68382b0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m68378X(final boolean z) {
        fhw.m125605a("[live]living_room", "LiveModule.ensureApi(). initApi is " + this.f44908c + " , and newSignIn is " + z);
        if (this.f44908c && !z) {
            if (this.f44911f) {
                return;
            }
            if (TEnum.equals(uqb0.f180402h0, "unknown_")) {
                l51.m152888H(App.f16088e, new Runnable() { // from class: l.r5t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f161406a.m68387g0();
                    }
                }, 200L);
                return;
            } else {
                m68387g0();
                return;
            }
        }
        this.f44908c = true;
        m68381a0(z);
        ABManager.m30356q().take(1).subscribe(dhw.m115825d(new y20() { // from class: l.q5t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155754a.m68385e0(z, (uxj0) obj);
            }
        }));
        p6s p6sVar = this.f44910e;
        if (p6sVar != null) {
            p6sVar.m159280q();
        }
        m68375T();
    }

    /* JADX INFO: renamed from: Y */
    public final tbs m68379Y() {
        if (this.f44906a == null) {
            this.f44906a = new tbs(f44904h);
        }
        return this.f44906a;
    }

    /* JADX INFO: renamed from: Z */
    public final zrv m68380Z() {
        if (this.f44907b == null) {
            this.f44907b = new zrv(new wrv(new lrf(), new grf(), new arf(), new irf()));
        }
        return this.f44907b;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m68381a0(boolean z) {
        m68379Y().m190085k(z);
        m68380Z().m221201h();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m68382b0() {
        m68379Y().m190083i();
        m68380Z().m221198e();
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m68383c0(final vwt vwtVar, uxj0 uxj0Var) {
        if (mqr.m159592l()) {
            fhw.m125605a("[live]living_room", "LiveModule.ensureApi(). After ABManager. LiveAbController.isLiveEnable() is true");
            if (this.f44912g) {
                this.f44912g = false;
                srf.m187598a().m187599b(ExtraActLifecycle.onInitDataOnCreate, new y20() { // from class: l.l5t
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ppi0.m173207l().m173212g((Act) obj);
                    }
                });
                l51.m152919y(new Runnable() { // from class: l.m5t
                    @Override // java.lang.Runnable
                    public final void run() {
                        vwtVar.m159274k().subscribe();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m68384d0(uxj0 uxj0Var) {
        if (mqr.m159592l()) {
            fhw.m125605a("[live]living_room", "LiveModule.ensureApi(). After ABManager. LiveAbController.isLiveEnable() is true");
            m68379Y().m190081g();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m68385e0(boolean z, uxj0 uxj0Var) {
        if (mqr.m159592l()) {
            if (!tbs.f172990c) {
                m68381a0(z);
            }
            fhw.m125605a("[live]living_room", "LiveModule.ensureApi(). After ABManager. LiveAbController.isLiveEnable() is true");
            m68379Y().m190081g();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m68386f0(NetworkInfo networkInfo) {
        this.f44910e.m159280q();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ft */
    public C22421c<uxj0> mo29137ft() {
        if (yw0.m217558a()) {
            return C22421c.just(uxj0.f181467a);
        }
        if (wft.m206159b(1)) {
            m68377W(true);
        } else {
            m68378X(true);
        }
        return C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m68387g0() {
        tbs.m190079p();
        m68375T();
    }

    @Override // com.tantanapp.putong.module.Module
    public Context getContext() {
        return f44904h;
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
        Application application = (Application) context;
        f44904h = application;
        xau.m209899D(application);
        XEnginePreferences.initSDK(App.f16088e, mbs.m157873q(), "bafc9b2dac43efae663ff86726e4863f", true);
        p6s p6sVar = new p6s(context, new y20() { // from class: l.k5t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124127a.m68376V((LiveClientSwitchesBean) obj);
            }
        });
        this.f44910e = p6sVar;
        p6sVar.m159274k().subscribe();
        this.f44910e.m159280q();
        ConnectivityReceiver.m82473m().skip(1).distinctUntilChanged().subscribe(dhw.m115825d(new y20() { // from class: l.n5t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140382a.m68386f0((NetworkInfo) obj);
            }
        }));
        m68379Y();
        vxr.m203882j(f44904h, new jrf(), this.f44910e);
        m68380Z();
        l51.m152919y(new Runnable() { // from class: l.o5t
            @Override // java.lang.Runnable
            public final void run() {
                BLiveData.new_();
            }
        });
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ms */
    public void mo29138ms() {
        ((LiveServiceImpl) uqb0.f180396b0.f170326c).release();
        m68380Z().m221205q();
        m68379Y().m190087o();
        this.f44906a = null;
        this.f44907b = null;
        this.f44908c = false;
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: tr */
    public void mo29139tr(boolean z) {
        m68377W(false);
    }
}
