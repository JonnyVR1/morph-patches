package com.p051p1.mobile.putong.feed;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p051p1.mobile.putong.feed.api.C10897a;
import com.p051p1.mobile.putong.feed.api.C10898b;
import com.p051p1.mobile.putong.feed.newui.webview.FeedWebViewBridgeImplementation;
import com.p051p1.mobile.putong.feed.p063js.bridge.FeedBridgeImplementation;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.putong.module.Module;
import java.util.HashMap;
import java.util.Iterator;
import p137rx.C22421c;
import p153l.b5i;
import p153l.cmg;
import p153l.cqq;
import p153l.cu9;
import p153l.fci;
import p153l.jka;
import p153l.jl8;
import p153l.k110;
import p153l.ksg;
import p153l.l9c;
import p153l.ms8;
import p153l.o8h;
import p153l.oka;
import p153l.pfh0;
import p153l.pu20;
import p153l.qvm;
import p153l.qzg;
import p153l.rxh;
import p153l.ryh;
import p153l.scj;
import p153l.uqb0;
import p153l.uqi;
import p153l.uxj0;
import p153l.w0c;

/* JADX INFO: loaded from: classes13.dex */
@Route(name = "FeedModule", path = "/feed_module/module")
public class FeedModule implements Module {

    /* JADX INFO: renamed from: a */
    public static Application f39700a;

    /* JADX INFO: renamed from: b */
    public static C10897a f39701b;

    /* JADX INFO: renamed from: c */
    public static C10898b f39702c;

    /* JADX INFO: renamed from: d */
    public static jka f39703d;

    /* JADX INFO: renamed from: e */
    public static ms8 f39704e;

    /* JADX INFO: renamed from: f */
    public static oka f39705f;

    /* JADX INFO: renamed from: g */
    public static jl8 f39706g;

    /* JADX INFO: renamed from: h */
    public static cu9 f39707h;

    /* JADX INFO: renamed from: i */
    public static qzg f39708i;

    /* JADX INFO: renamed from: F */
    public static AccountService m61405F() {
        return uqb0.f180396b0.f170324a;
    }

    /* JADX INFO: renamed from: H */
    public static CoreService m61406H() {
        return uqb0.f180396b0.f170325b;
    }

    /* JADX INFO: renamed from: M */
    public static LiveService m61407M() {
        return uqb0.f180396b0.f170326c;
    }

    /* JADX INFO: renamed from: Um */
    public static void m61408Um(String str) {
        long jM80482A = RemoteConfig.m80481x().m80482A("clear_feed_cache_threshold");
        long size = 0;
        if (jM80482A > 0) {
            StringBuilder sb = new StringBuilder("FeedModule reportCacheSize when " + str);
            if (f39703d != null) {
                sb.append("corePhotoAlbum.momentsMap=");
                sb.append(f39703d.f121357i0.size());
                sb.append("corePhotoAlbum.momentVoiceLiveInfosMap=");
                sb.append(f39703d.f121355h0.size());
                sb.append("corePhotoAlbum.usersMap=");
                sb.append(f39703d.f121285A0.size());
                sb.append("corePhotoAlbum.userStatesMap=");
                sb.append(f39703d.f121314M0.size());
                sb.append("corePhotoAlbum.commentsMap=");
                sb.append(f39703d.f121300H0.size());
                size = ((long) f39703d.f121357i0.size()) + ((long) f39703d.f121355h0.size()) + ((long) f39703d.f121285A0.size()) + ((long) f39703d.f121314M0.size()) + ((long) f39703d.f121300H0.size());
            }
            cu9 cu9Var = f39707h;
            if (cu9Var != null) {
                for (String str2 : cu9Var.feedCachePool.keySet()) {
                    HashMap mapM112658u0 = f39707h.m112658u0(str2);
                    if (mapM112658u0 == null) {
                        sb.append("coreMlnPhotoAlbum.");
                        sb.append(str2);
                        sb.append("= null");
                    } else {
                        sb.append("coreMlnPhotoAlbum.");
                        sb.append(str2);
                        sb.append("=");
                        sb.append(mapM112658u0.size());
                        size += (long) mapM112658u0.size();
                    }
                }
            }
            if (size >= jM80482A) {
                jka jkaVar = f39703d;
                if (jkaVar != null) {
                    jkaVar.f121357i0.clear();
                    f39703d.f121355h0.clear();
                    f39703d.f121285A0.clear();
                    f39703d.f121314M0.clear();
                    f39703d.f121300H0.clear();
                }
                cu9 cu9Var2 = f39707h;
                if (cu9Var2 != null) {
                    Iterator<String> it = cu9Var2.feedCachePool.keySet().iterator();
                    while (it.hasNext()) {
                        HashMap mapM112658u1 = f39707h.m112658u0(it.next());
                        if (mapM112658u1 != null) {
                            mapM112658u1.clear();
                        }
                    }
                }
                CrashHelper.m82479c(new RuntimeException(sb.toString()));
            }
        }
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ec */
    public void mo29133Ec() {
        ABManager.m30323R(new cmg());
        ABManager.m30323R(new o8h());
        ryh.m183608c();
    }

    /* JADX INFO: renamed from: J */
    public final void m61409J() {
        pfh0.m172101a();
        pu20.f154145j = null;
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22421c<uxj0> mo29134Jh() {
        return C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: K */
    public final void m61410K() {
        String strM173816k = pu20.m173816k();
        if (TextUtils.equals(strM173816k, pu20.m173823r())) {
            f39703d.m145680d7("p_discover_discussion", "");
        }
        if (TextUtils.equals(strM173816k, pu20.m173822q())) {
            f39703d.m145680d7("p_discover_dating", "");
        }
        f39703d.m145680d7("p_like", "");
    }

    /* JADX INFO: renamed from: L */
    public final void m61411L() {
        f39707h = new cu9();
        f39701b = new C10897a();
        f39702c = new C10898b();
        f39703d = new jka();
        f39705f = new oka();
        if (cmg.m111220l0()) {
            f39703d.m145567Mc();
        }
        m61410K();
        f39703d.m145716i8(true);
        if (cmg.m111238u0()) {
            f39703d.m145506E7();
        }
        if (cmg.m111243x()) {
            f39703d.m145590Q7("brand");
        }
        f39704e = new ms8();
        f39706g = new jl8();
        m61409J();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ma */
    public void mo29135Ma() {
        qzg qzgVar = f39708i;
        if (qzgVar != null) {
            qzgVar.mo133950i();
        }
        l9c l9cVarM153394o = l9c.m153394o();
        qzg qzgVar2 = new qzg();
        l9cVarM153394o.m153417y(qzgVar2);
        f39708i = qzgVar2;
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo29136Qh() {
        rxh.m183543b();
        cqq.m111970e().m111977h(FeedBridgeImplementation.class);
        cqq.m111970e().m111977h(FeedWebViewBridgeImplementation.class);
        w0c.m204134O("tantan_moment", new scj() { // from class: l.ifh
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new odh((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ft */
    public C22421c<uxj0> mo29137ft() {
        return C22421c.just(uxj0.f181467a);
    }

    @Override // com.tantanapp.putong.module.Module
    public Context getContext() {
        return f39700a;
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
        f39700a = (Application) context;
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ms */
    public void mo29138ms() {
        f39701b.clearRequestsAndStop();
        f39702c.clearRequestsAndStop();
        f39703d.clearRequestsAndStop();
        f39705f.clearRequestsAndStop();
        f39704e.clearRequestsAndStop();
        k110.m147841b();
        ksg.f128560a = 0;
        qvm.m178365d().m178371i();
        b5i.m102594m().m102610w();
    }

    @Override // com.tantanapp.putong.module.Module
    public void onLowMemory() {
    }

    @Override // com.tantanapp.putong.module.Module
    public void onTrimMemory(int i) {
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: tr */
    public void mo29139tr(boolean z) {
        LaunchStep launchStep = LaunchStep.FeedAfterSignIn;
        uqi.m197339f(launchStep);
        m61411L();
        if (z) {
            f39702c.f40057M.m159280q();
        }
        fci.C16948a.m125012c();
        uqi.m197337d(launchStep);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: zf */
    public void mo30938zf() {
    }
}
