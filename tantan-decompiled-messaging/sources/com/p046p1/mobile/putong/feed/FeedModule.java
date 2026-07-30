package com.p046p1.mobile.putong.feed;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p046p1.mobile.putong.feed.api.C10734a;
import com.p046p1.mobile.putong.feed.api.C10735b;
import com.p046p1.mobile.putong.feed.newui.webview.FeedWebViewBridgeImplementation;
import com.p046p1.mobile.putong.feed.p058js.bridge.FeedBridgeImplementation;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.putong.module.Module;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.util.HashMap;
import java.util.Iterator;
import p133rx.C22306c;
import p149l.bt00;
import p149l.byg;
import p149l.cja;
import p149l.cwh;
import p149l.cxh;
import p149l.doq;
import p149l.f8c;
import p149l.fk8;
import p149l.fm20;
import p149l.h7h0;
import p149l.hr8;
import p149l.izb;
import p149l.m3i;
import p149l.nkg;
import p149l.ptm;
import p149l.qai;
import p149l.qib0;
import p149l.roj0;
import p149l.rs9;
import p149l.vqg;
import p149l.xia;
import p149l.y9j;
import p149l.yni;
import p149l.z6h;

/* JADX INFO: loaded from: classes12.dex */
@Route(name = "FeedModule", path = "/feed_module/module")
public class FeedModule implements Module {

    /* JADX INFO: renamed from: a */
    public static Application f38852a;

    /* JADX INFO: renamed from: b */
    public static C10734a f38853b;

    /* JADX INFO: renamed from: c */
    public static C10735b f38854c;

    /* JADX INFO: renamed from: d */
    public static xia f38855d;

    /* JADX INFO: renamed from: e */
    public static hr8 f38856e;

    /* JADX INFO: renamed from: f */
    public static cja f38857f;

    /* JADX INFO: renamed from: g */
    public static fk8 f38858g;

    /* JADX INFO: renamed from: h */
    public static rs9 f38859h;

    /* JADX INFO: renamed from: i */
    public static byg f38860i;

    /* JADX INFO: renamed from: F */
    public static AccountService m60221F() {
        return qib0.f154713b0.f139230a;
    }

    /* JADX INFO: renamed from: H */
    public static CoreService m60222H() {
        return qib0.f154713b0.f139231b;
    }

    /* JADX INFO: renamed from: M */
    public static LiveService m60223M() {
        return qib0.f154713b0.f139232c;
    }

    /* JADX INFO: renamed from: Um */
    public static void m60224Um(String str) {
        long jM79299A = RemoteConfig.m79298x().m79299A("clear_feed_cache_threshold");
        long size = 0;
        if (jM79299A > 0) {
            StringBuilder sb = new StringBuilder("FeedModule reportCacheSize when " + str);
            if (f38855d != null) {
                sb.append("corePhotoAlbum.momentsMap=");
                sb.append(f38855d.f193047i0.size());
                sb.append("corePhotoAlbum.momentVoiceLiveInfosMap=");
                sb.append(f38855d.f193045h0.size());
                sb.append("corePhotoAlbum.usersMap=");
                sb.append(f38855d.f192975A0.size());
                sb.append("corePhotoAlbum.userStatesMap=");
                sb.append(f38855d.f193004M0.size());
                sb.append("corePhotoAlbum.commentsMap=");
                sb.append(f38855d.f192990H0.size());
                size = ((long) f38855d.f193047i0.size()) + ((long) f38855d.f193045h0.size()) + ((long) f38855d.f192975A0.size()) + ((long) f38855d.f193004M0.size()) + ((long) f38855d.f192990H0.size());
            }
            rs9 rs9Var = f38859h;
            if (rs9Var != null) {
                for (String str2 : rs9Var.feedCachePool.keySet()) {
                    HashMap mapM180645u0 = f38859h.m180645u0(str2);
                    if (mapM180645u0 == null) {
                        sb.append("coreMlnPhotoAlbum.");
                        sb.append(str2);
                        sb.append("= null");
                    } else {
                        sb.append("coreMlnPhotoAlbum.");
                        sb.append(str2);
                        sb.append("=");
                        sb.append(mapM180645u0.size());
                        size += (long) mapM180645u0.size();
                    }
                }
            }
            if (size >= jM79299A) {
                xia xiaVar = f38855d;
                if (xiaVar != null) {
                    xiaVar.f193047i0.clear();
                    f38855d.f193045h0.clear();
                    f38855d.f192975A0.clear();
                    f38855d.f193004M0.clear();
                    f38855d.f192990H0.clear();
                }
                rs9 rs9Var2 = f38859h;
                if (rs9Var2 != null) {
                    Iterator<String> it = rs9Var2.feedCachePool.keySet().iterator();
                    while (it.hasNext()) {
                        HashMap mapM180645u1 = f38859h.m180645u0(it.next());
                        if (mapM180645u1 != null) {
                            mapM180645u1.clear();
                        }
                    }
                }
                CrashHelper.m81296c(new RuntimeException(sb.toString()));
            }
        }
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ec */
    public void mo28134Ec() {
        ABManager.m29325R(new nkg());
        ABManager.m29325R(new z6h());
        cxh.m109101c();
    }

    /* JADX INFO: renamed from: J */
    public final void m60225J() {
        h7h0.m129688a();
        fm20.f98247j = null;
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22306c<roj0> mo28135Jh() {
        return C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: K */
    public final void m60226K() {
        String strM122128k = fm20.m122128k();
        if (TextUtils.equals(strM122128k, fm20.m122135r())) {
            f38855d.m209439d7("p_discover_discussion", "");
        }
        if (TextUtils.equals(strM122128k, fm20.m122134q())) {
            f38855d.m209439d7("p_discover_dating", "");
        }
        f38855d.m209439d7("p_like", "");
    }

    /* JADX INFO: renamed from: L */
    public final void m60227L() {
        f38859h = new rs9();
        f38853b = new C10734a();
        f38854c = new C10735b();
        f38855d = new xia();
        f38857f = new cja();
        if (nkg.m159891l0()) {
            f38855d.m209326Mc();
        }
        m60226K();
        f38855d.m209475i8(true);
        if (nkg.m159909u0()) {
            f38855d.m209265E7();
        }
        if (nkg.m159914x()) {
            f38855d.m209349Q7("brand");
        }
        f38856e = new hr8();
        f38858g = new fk8();
        m60225J();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ma */
    public void mo28136Ma() {
        byg bygVar = f38860i;
        if (bygVar != null) {
            bygVar.mo100767i();
        }
        f8c f8cVarM119878o = f8c.m119878o();
        byg bygVar2 = new byg();
        f8cVarM119878o.m119901y(bygVar2);
        f38860i = bygVar2;
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo28137Qh() {
        cwh.m109048b();
        doq.m112810e().m112817h(FeedBridgeImplementation.class);
        doq.m112810e().m112817h(FeedWebViewBridgeImplementation.class);
        izb.m139033C("tantan_moment", new y9j() { // from class: l.tdh
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new zbh((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ft */
    public C22306c<roj0> mo28138ft() {
        return C22306c.just(roj0.f160388a);
    }

    @Override // com.tantanapp.putong.module.Module
    public Context getContext() {
        return f38852a;
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
        f38852a = (Application) context;
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ms */
    public void mo28139ms() {
        f38853b.clearRequestsAndStop();
        f38854c.clearRequestsAndStop();
        f38855d.clearRequestsAndStop();
        f38857f.clearRequestsAndStop();
        f38856e.clearRequestsAndStop();
        bt00.m103767b();
        vqg.f182637a = 0;
        ptm.m171352d().m171358i();
        m3i.m152923m().m152939w();
    }

    @Override // com.tantanapp.putong.module.Module
    public void onLowMemory() {
    }

    @Override // com.tantanapp.putong.module.Module
    public void onTrimMemory(int i) {
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: tr */
    public void mo28140tr(boolean z) {
        LaunchStep launchStep = LaunchStep.FeedAfterSignIn;
        yni.m215417f(launchStep);
        m60227L();
        if (z) {
            f38854c.f39209M.m121236q();
        }
        qai.C19451a.m173737c();
        yni.m215415d(launchStep);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: zf */
    public void mo29940zf() {
    }
}
