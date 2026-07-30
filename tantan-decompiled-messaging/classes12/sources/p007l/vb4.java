package p007l;

import com.mm.mediasdk.bean.RecorderInitConfig;
import com.momo.xeengine.XEnginePreferences;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.android.app.App;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import java.util.Objects;
import java.util.regex.Pattern;
import l.e30;
import l.jo0;
import l.mkd0;
import l.mu5;
import l.n500;
import l.nw3;
import l.qib0;
import l.roj0;
import l.tpd0;
import l.vkd0;
import l.w9j;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class vb4 {

    /* JADX INFO: renamed from: a */
    public static final String f14134a = mu5.b();

    /* JADX INFO: renamed from: b */
    public static boolean f14135b = false;

    /* JADX INFO: renamed from: l.vb4$a */
    public class C2522a extends vkd0 {
        /* JADX INFO: renamed from: a */
        public boolean m15416a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public String m15417b() {
            return vb4.f14134a;
        }

        /* JADX INFO: renamed from: g */
        public boolean m15418g() {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15403b(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: f */
    public static boolean m15407f() {
        try {
            XEnginePreferences.setApplicationContext(App.e);
            XEnginePreferences.checkEngineEnv();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m15408g(String str) {
        return m15414m(str) && Double.valueOf(str).doubleValue() <= 7.0d && Double.valueOf(str).doubleValue() >= 7.0d;
    }

    /* JADX INFO: renamed from: h */
    public static void m15409h(roj0 roj0Var) throws Throwable {
        pb4.m12955E();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m15410i() {
        return SharedLibraryLoader.k().q("b_feed");
    }

    /* JADX INFO: renamed from: j */
    public static void m15411j() {
        m15415n().observeOn(Schedulers.io()).doOnNext(new e30() { // from class: l.qb4
            public final void call(Object obj) throws Throwable {
                vb4.m15409h((roj0) obj);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.rb4
            public final void call(Object obj) {
                vb4.m15403b((roj0) obj);
            }
        }, new e30() { // from class: l.sb4
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public static void m15412k() {
        if (f14135b) {
            return;
        }
        XEnginePreferences.setApplicationContext(App.e);
        m15413l();
        f14135b = true;
    }

    /* JADX INFO: renamed from: l */
    public static void m15413l() {
        C2522a c2522a = new C2522a();
        tpd0 tpd0Var = new tpd0("last_immediately_code", 0);
        RecorderInitConfig.b bVarI = new RecorderInitConfig.b(f14134a).k(qib0.s).j(qib0.t).i(FeedModule.m1139F().userId());
        int iIntValue = ((Integer) tpd0Var.get()).intValue();
        int i = qib0.t;
        if (iIntValue == i) {
            bVarI.h(1440);
            ((vkd0) c2522a).a = 86400000L;
        } else {
            tpd0Var.put(Integer.valueOf(i));
        }
        nw3.e().g(App.e, c2522a);
        n500.c(App.e, bVarI.g());
    }

    /* JADX INFO: renamed from: m */
    public static boolean m15414m(String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        return Pattern.compile("^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: n */
    public static c<roj0> m15415n() {
        return SharedLibraryLoader.k().r("b_feed").doOnNext(new e30() { // from class: l.tb4
            public final void call(Object obj) {
                vb4.m15412k();
            }
        }).map(new w9j() { // from class: l.ub4
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }
}
