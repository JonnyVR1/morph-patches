package p149l;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.ExtraActLifecycle;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.external.module.api.LiveAssertApi;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class s9s {

    /* JADX INFO: renamed from: a */
    public static Application f163227a = null;

    /* JADX INFO: renamed from: b */
    public static uut f163228b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f163229c = false;

    /* JADX INFO: renamed from: d */
    public static LiveAssertApi f163230d;

    /* JADX INFO: renamed from: e */
    public static ezr f163231e;

    /* JADX INFO: renamed from: f */
    public static i4t f163232f = new i4t();

    public s9s(Context context) {
        f163227a = (Application) context;
        if (rw0.m181367a()) {
            f163230d = new LiveAssertApi();
        } else {
            m182772l();
            d2s.m109831d(new upf());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m182757a(uut uutVar, BLiveSettings bLiveSettings) {
        try {
            if (bLiveSettings.liveConfig != null && !ckw.m107429a(uutVar.m195696O4(), w8u.m202222y(l9s.m149047J()))) {
                ckw.m107430b(uutVar.m195696O4(), bLiveSettings.liveConfig.license.secretKey, px0.m171778b(f163227a), w8u.m202222y(l9s.m149047J()), px0.m171777a(f163227a), null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m182760d(Act.C4299r c4299r) {
        if (c4299r != null) {
            f163228b.m121230k();
        } else {
            hfw.m130790a("[live]", "开始后台请求配置接口 ， 进入拒绝策略");
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ BLiveSettings m182761e(BLiveSettings bLiveSettings, User user) {
        return bLiveSettings;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m182762f(uut uutVar, Act.C4299r c4299r) {
        if (c4299r == null) {
            hfw.m130790a("[live]", "开始后台请求配置接口 ， 进入拒绝策略");
        } else {
            uutVar.m121230k().subscribe();
            uutVar.m121236q();
        }
    }

    /* JADX INFO: renamed from: m */
    public static <V> V m182763m(gld0<V> gld0Var) {
        if (f163231e == null) {
            f163231e = new ezr();
        }
        return (V) f163231e.m119009a(gld0Var);
    }

    /* JADX INFO: renamed from: n */
    public static void m182764n(LiveRegionTag liveRegionTag) {
        m182766q(f163228b);
        m182765p();
        f163232f.m134385r(liveRegionTag);
        uvr.m196087d().m121236q();
    }

    /* JADX INFO: renamed from: p */
    public static void m182765p() {
        if (NullChecker.m81303a(f163230d)) {
            f163230d.refreshLiveAssets();
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m182766q(final uut uutVar) {
        if (uutVar == null) {
            return;
        }
        if (uutVar.m195940s6()) {
            Act.foreground().take(1).subscribe(ffw.m121193d(new e30() { // from class: l.m9s
                @Override // p149l.e30
                public final void call(Object obj) {
                    s9s.m182762f(uutVar, (Act.C4299r) obj);
                }
            }));
        } else {
            uutVar.m121230k().subscribe();
            uutVar.m121236q();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m182767g() {
        if (rw0.m181367a()) {
            return;
        }
        LiveSquareApi.requestMyLiveHierarchy();
    }

    /* JADX INFO: renamed from: h */
    public void m182768h() {
        m182774r();
    }

    /* JADX INFO: renamed from: i */
    public void m182769i() {
        if (f163229c) {
            l5h0.m148643a();
            m182775s(f163228b);
            m182766q(f163228b);
            if (!vdt.m198092b(2)) {
                afn.m96259a().m96263e();
            }
            LiveSquareApi.requestMyLiveHierarchy();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m182770j(uut uutVar) {
        f163231e = new ezr();
        f163228b = uutVar;
        d2s.m109831d(new upf());
        f163229c = true;
    }

    /* JADX INFO: renamed from: k */
    public void m182771k(boolean z) {
        if (!f163229c || z) {
            f163229c = true;
            f163231e = new ezr();
            m182772l();
            uut uutVar = new uut(f163227a, new e30() { // from class: l.p9s
                @Override // p149l.e30
                public final void call(Object obj) {
                    pgi0.m168730l().m168749v((BLiveSettings) obj);
                }
            });
            f163228b = uutVar;
            m182775s(uutVar);
            if ((Build.BRAND.toLowerCase().contains("realme") || bne0.m102783l()) && f163228b.m195940s6()) {
                Act.foreground().take(1).subscribe(ffw.m121193d(new e30() { // from class: l.q9s
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        s9s.m182760d((Act.C4299r) obj);
                    }
                }));
            } else if (vdt.m198092b(1)) {
                f163228b.m121236q();
            } else {
                f163228b.m121230k();
            }
            f163230d = new LiveAssertApi();
            if (vdt.m198092b(2)) {
                return;
            }
            afn.m96259a().m96263e();
        }
    }

    /* JADX INFO: renamed from: l */
    public final i4t m182772l() {
        if (f163232f == null) {
            f163232f = new i4t();
        }
        return f163232f;
    }

    /* JADX INFO: renamed from: o */
    public void m182773o() {
        l310.m148347v();
        pgi0.m168730l().m168750w();
        fnk0.m122316b().m122317a();
        f163230d.clean();
        sgj.m184089b();
        l9s.m149044G().mo67280r9().mo123875a();
        f163229c = false;
    }

    /* JADX INFO: renamed from: r */
    public final void m182774r() {
        lqf.m151015a().m151016b(ExtraActLifecycle.onInitDataOnCreate, new e30() { // from class: l.r9s
            @Override // p149l.e30
            public final void call(Object obj) {
                pgi0.m168730l().m168735g((Act) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m182775s(final uut uutVar) {
        mkd0.m154984r(uutVar.m121230k(), l9s.m149046I(), new x9j() { // from class: l.n9s
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return s9s.m182761e((BLiveSettings) obj, (User) obj2);
            }
        }).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.o9s
            @Override // p149l.e30
            public final void call(Object obj) {
                s9s.m182757a(uutVar, (BLiveSettings) obj);
            }
        }));
    }
}
