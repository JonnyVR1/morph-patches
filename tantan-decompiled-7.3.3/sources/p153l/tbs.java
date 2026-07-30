package p153l;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.ExtraActLifecycle;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.external.module.api.LiveAssertApi;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class tbs {

    /* JADX INFO: renamed from: a */
    public static Application f172988a = null;

    /* JADX INFO: renamed from: b */
    public static vwt f172989b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f172990c = false;

    /* JADX INFO: renamed from: d */
    public static LiveAssertApi f172991d;

    /* JADX INFO: renamed from: e */
    public static f1s f172992e;

    /* JADX INFO: renamed from: f */
    public static j6t f172993f = new j6t();

    public tbs(Context context) {
        f172988a = (Application) context;
        if (yw0.m217558a()) {
            f172991d = new LiveAssertApi();
        } else {
            m190086l();
            e4s.m119476d(new brf());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m190071a(vwt vwtVar, BLiveSettings bLiveSettings) {
        try {
            if (bLiveSettings.liveConfig != null && !bnw.m105627a(vwtVar.m203483O4(), xau.m209915y(mbs.m157824J()))) {
                bnw.m105628b(vwtVar.m203483O4(), bLiveSettings.liveConfig.license.secretKey, wx0.m208362b(f172988a), xau.m209915y(mbs.m157824J()), wx0.m208361a(f172988a), null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m190074d(Act.C4450r c4450r) {
        if (c4450r != null) {
            f172989b.m159274k();
        } else {
            fhw.m125605a("[live]", "开始后台请求配置接口 ， 进入拒绝策略");
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ BLiveSettings m190075e(BLiveSettings bLiveSettings, User user) {
        return bLiveSettings;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m190076f(vwt vwtVar, Act.C4450r c4450r) {
        if (c4450r == null) {
            fhw.m125605a("[live]", "开始后台请求配置接口 ， 进入拒绝策略");
        } else {
            vwtVar.m159274k().subscribe();
            vwtVar.m159280q();
        }
    }

    /* JADX INFO: renamed from: m */
    public static <V> V m190077m(itd0<V> itd0Var) {
        if (f172992e == null) {
            f172992e = new f1s();
        }
        return (V) f172992e.m123583a(itd0Var);
    }

    /* JADX INFO: renamed from: n */
    public static void m190078n(LiveRegionTag liveRegionTag) {
        m190080q(f172989b);
        m190079p();
        f172993f.m143716r(liveRegionTag);
        vxr.m203876d().m159280q();
    }

    /* JADX INFO: renamed from: p */
    public static void m190079p() {
        if (NullChecker.m82486a(f172991d)) {
            f172991d.refreshLiveAssets();
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m190080q(final vwt vwtVar) {
        if (vwtVar == null) {
            return;
        }
        if (vwtVar.m203727s6()) {
            Act.foreground().take(1).subscribe(dhw.m115825d(new y20() { // from class: l.nbs
                @Override // p153l.y20
                public final void call(Object obj) {
                    tbs.m190076f(vwtVar, (Act.C4450r) obj);
                }
            }));
        } else {
            vwtVar.m159274k().subscribe();
            vwtVar.m159280q();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m190081g() {
        if (yw0.m217558a()) {
            return;
        }
        LiveSquareApi.requestMyLiveHierarchy();
    }

    /* JADX INFO: renamed from: h */
    public void m190082h() {
        m190088r();
    }

    /* JADX INFO: renamed from: i */
    public void m190083i() {
        if (f172990c) {
            tdh0.m190630a();
            m190089s(f172989b);
            m190080q(f172989b);
            if (!wft.m206159b(2)) {
                ahn.m97854a().m97858e();
            }
            LiveSquareApi.requestMyLiveHierarchy();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m190084j(vwt vwtVar) {
        f172992e = new f1s();
        f172989b = vwtVar;
        e4s.m119476d(new brf());
        f172990c = true;
    }

    /* JADX INFO: renamed from: k */
    public void m190085k(boolean z) {
        if (!f172990c || z) {
            f172990c = true;
            f172992e = new f1s();
            m190086l();
            vwt vwtVar = new vwt(f172988a, new y20() { // from class: l.qbs
                @Override // p153l.y20
                public final void call(Object obj) {
                    ppi0.m173207l().m173226v((BLiveSettings) obj);
                }
            });
            f172989b = vwtVar;
            m190089s(vwtVar);
            if ((Build.BRAND.toLowerCase().contains("realme") || ive0.m142298l()) && f172989b.m203727s6()) {
                Act.foreground().take(1).subscribe(dhw.m115825d(new y20() { // from class: l.rbs
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        tbs.m190074d((Act.C4450r) obj);
                    }
                }));
            } else if (wft.m206159b(1)) {
                f172989b.m159280q();
            } else {
                f172989b.m159274k();
            }
            f172991d = new LiveAssertApi();
            if (wft.m206159b(2)) {
                return;
            }
            ahn.m97854a().m97858e();
        }
    }

    /* JADX INFO: renamed from: l */
    public final j6t m190086l() {
        if (f172993f == null) {
            f172993f = new j6t();
        }
        return f172993f;
    }

    /* JADX INFO: renamed from: o */
    public void m190087o() {
        vb10.m200662v();
        ppi0.m173207l().m173227w();
        lwk0.m156066b().m156067a();
        f172991d.clean();
        mjj.m158573b();
        mbs.m157821G().mo68463r9().mo108367a();
        f172990c = false;
    }

    /* JADX INFO: renamed from: r */
    public final void m190088r() {
        srf.m187598a().m187599b(ExtraActLifecycle.onInitDataOnCreate, new y20() { // from class: l.sbs
            @Override // p153l.y20
            public final void call(Object obj) {
                ppi0.m173207l().m173212g((Act) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m190089s(final vwt vwtVar) {
        psd0.m173625r(vwtVar.m159274k(), mbs.m157823I(), new rcj() { // from class: l.obs
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return tbs.m190075e((BLiveSettings) obj, (User) obj2);
            }
        }).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.pbs
            @Override // p153l.y20
            public final void call(Object obj) {
                tbs.m190071a(vwtVar, (BLiveSettings) obj);
            }
        }));
    }
}
