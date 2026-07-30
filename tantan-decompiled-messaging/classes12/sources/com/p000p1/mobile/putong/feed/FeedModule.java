package com.p000p1.mobile.putong.feed;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.p000p1.mobile.putong.feed.api.C1578a;
import com.p000p1.mobile.putong.feed.api.C1579b;
import com.p000p1.mobile.putong.feed.newui.webview.FeedWebViewBridgeImplementation;
import com.p000p1.mobile.putong.feed.p003js.bridge.FeedBridgeImplementation;
import com.p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.putong.module.Module;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import java.util.HashMap;
import java.util.Iterator;
import l.doq;
import l.izb;
import l.qib0;
import l.roj0;
import l.y9j;
import l.yni;
import p007l.bt00;
import p007l.byg;
import p007l.cja;
import p007l.cwh;
import p007l.cxh;
import p007l.f8c;
import p007l.fk8;
import p007l.fm20;
import p007l.h7h0;
import p007l.hr8;
import p007l.m3i;
import p007l.nkg;
import p007l.ptm;
import p007l.qai;
import p007l.rs9;
import p007l.vqg;
import p007l.xia;
import p007l.z6h;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Route(name = "FeedModule", path = "/feed_module/module")
public class FeedModule implements Module {

    /* JADX INFO: renamed from: a */
    public static Application f313a;

    /* JADX INFO: renamed from: b */
    public static C1578a f314b;

    /* JADX INFO: renamed from: c */
    public static C1579b f315c;

    /* JADX INFO: renamed from: d */
    public static xia f316d;

    /* JADX INFO: renamed from: e */
    public static hr8 f317e;

    /* JADX INFO: renamed from: f */
    public static cja f318f;

    /* JADX INFO: renamed from: g */
    public static fk8 f319g;

    /* JADX INFO: renamed from: h */
    public static rs9 f320h;

    /* JADX INFO: renamed from: i */
    public static byg f321i;

    /* JADX INFO: renamed from: F */
    public static AccountService m1139F() {
        return qib0.b0.a;
    }

    /* JADX INFO: renamed from: H */
    public static CoreService m1140H() {
        return qib0.b0.b;
    }

    /* JADX INFO: renamed from: M */
    public static LiveService m1141M() {
        return qib0.b0.c;
    }

    /* JADX INFO: renamed from: Um */
    public static void m1142Um(String str) {
        long jA = RemoteConfig.x().A("clear_feed_cache_threshold");
        long size = 0;
        if (jA > 0) {
            StringBuilder sb = new StringBuilder("FeedModule reportCacheSize when " + str);
            if (f316d != null) {
                sb.append("corePhotoAlbum.momentsMap=");
                sb.append(f316d.f14982i0.size());
                sb.append("corePhotoAlbum.momentVoiceLiveInfosMap=");
                sb.append(f316d.f14980h0.size());
                sb.append("corePhotoAlbum.usersMap=");
                sb.append(f316d.f14910A0.size());
                sb.append("corePhotoAlbum.userStatesMap=");
                sb.append(f316d.f14939M0.size());
                sb.append("corePhotoAlbum.commentsMap=");
                sb.append(f316d.f14925H0.size());
                size = ((long) f316d.f14982i0.size()) + ((long) f316d.f14980h0.size()) + ((long) f316d.f14910A0.size()) + ((long) f316d.f14939M0.size()) + ((long) f316d.f14925H0.size());
            }
            rs9 rs9Var = f320h;
            if (rs9Var != null) {
                for (String str2 : rs9Var.feedCachePool.keySet()) {
                    HashMap mapM13959u0 = f320h.m13959u0(str2);
                    if (mapM13959u0 == null) {
                        sb.append("coreMlnPhotoAlbum.");
                        sb.append(str2);
                        sb.append("= null");
                    } else {
                        sb.append("coreMlnPhotoAlbum.");
                        sb.append(str2);
                        sb.append("=");
                        sb.append(mapM13959u0.size());
                        size += (long) mapM13959u0.size();
                    }
                }
            }
            if (size >= jA) {
                xia xiaVar = f316d;
                if (xiaVar != null) {
                    xiaVar.f14982i0.clear();
                    f316d.f14980h0.clear();
                    f316d.f14910A0.clear();
                    f316d.f14939M0.clear();
                    f316d.f14925H0.clear();
                }
                rs9 rs9Var2 = f320h;
                if (rs9Var2 != null) {
                    Iterator<String> it = rs9Var2.feedCachePool.keySet().iterator();
                    while (it.hasNext()) {
                        HashMap mapM13959u1 = f320h.m13959u0(it.next());
                        if (mapM13959u1 != null) {
                            mapM13959u1.clear();
                        }
                    }
                }
                CrashHelper.c(new RuntimeException(sb.toString()));
            }
        }
    }

    /* JADX INFO: renamed from: Ec */
    public void m1143Ec() {
        ABManager.R(new nkg());
        ABManager.R(new z6h());
        cxh.m9253c();
    }

    /* JADX INFO: renamed from: J */
    public final void m1144J() {
        h7h0.m10553a();
        fm20.f8159j = null;
    }

    /* JADX INFO: renamed from: Jh */
    public c<roj0> m1145Jh() {
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: K */
    public final void m1146K() {
        String strM10231k = fm20.m10231k();
        if (TextUtils.equals(strM10231k, fm20.m10238r())) {
            f316d.m16620d7("p_discover_discussion", "");
        }
        if (TextUtils.equals(strM10231k, fm20.m10237q())) {
            f316d.m16620d7("p_discover_dating", "");
        }
        f316d.m16620d7("p_like", "");
    }

    /* JADX INFO: renamed from: L */
    public final void m1147L() {
        f320h = new rs9();
        f314b = new C1578a();
        f315c = new C1579b();
        f316d = new xia();
        f318f = new cja();
        if (nkg.m12250l0()) {
            f316d.m16507Mc();
        }
        m1146K();
        f316d.m16656i8(true);
        if (nkg.m12268u0()) {
            f316d.m16446E7();
        }
        if (nkg.m12273x()) {
            f316d.m16530Q7("brand");
        }
        f317e = new hr8();
        f319g = new fk8();
        m1144J();
    }

    /* JADX INFO: renamed from: Ma */
    public void m1148Ma() {
        byg bygVar = f321i;
        if (bygVar != null) {
            bygVar.mo8751i();
        }
        f8c f8cVarM10082o = f8c.m10082o();
        byg bygVar2 = new byg();
        f8cVarM10082o.m10105y(bygVar2);
        f321i = bygVar2;
    }

    /* JADX INFO: renamed from: Qh */
    public void m1149Qh() {
        cwh.m9246b();
        doq.e().h(FeedBridgeImplementation.class);
        doq.e().h(FeedWebViewBridgeImplementation.class);
        izb.C("tantan_moment", new y9j() { // from class: l.tdh
            /* JADX INFO: renamed from: a */
            public final Object m14482a(Object obj, Object obj2, Object obj3) {
                return new zbh((PutongAct) obj, (String) obj2, (MKWebView) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: ft */
    public c<roj0> m1150ft() {
        return c.just(roj0.a);
    }

    public Context getContext() {
        return f313a;
    }

    public void init(Context context) {
        f313a = (Application) context;
    }

    /* JADX INFO: renamed from: ms */
    public void m1151ms() {
        f314b.clearRequestsAndStop();
        f315c.clearRequestsAndStop();
        f316d.clearRequestsAndStop();
        f318f.clearRequestsAndStop();
        f317e.clearRequestsAndStop();
        bt00.m9030b();
        vqg.f14268a = 0;
        ptm.m13221d().m13227i();
        m3i.m11762m().m11778w();
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
    }

    /* JADX INFO: renamed from: tr */
    public void m1152tr(boolean z) {
        LaunchStep launchStep = LaunchStep.FeedAfterSignIn;
        yni.f(new LaunchStep[]{launchStep});
        m1147L();
        if (z) {
            f315c.f670M.z();
        }
        qai.C2467a.m13499c();
        yni.d(launchStep);
    }

    /* JADX INFO: renamed from: zf */
    public void m1153zf() {
    }
}
