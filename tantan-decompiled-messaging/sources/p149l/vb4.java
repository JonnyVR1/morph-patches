package p149l;

import com.momo.xeengine.XEnginePreferences;
import com.p041mm.mediasdk.bean.RecorderInitConfig;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import java.util.Objects;
import java.util.regex.Pattern;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes12.dex */
public class vb4 {

    /* JADX INFO: renamed from: a */
    public static final String f180803a = mu5.m156377b();

    /* JADX INFO: renamed from: b */
    public static boolean f180804b = false;

    /* JADX INFO: renamed from: l.vb4$a */
    public class C20606a extends vkd0 {
        @Override // p149l.vkd0
        /* JADX INFO: renamed from: a */
        public boolean mo197681a() {
            return false;
        }

        @Override // p149l.vkd0
        /* JADX INFO: renamed from: b */
        public String mo161783b() {
            return vb4.f180803a;
        }

        @Override // p149l.vkd0
        /* JADX INFO: renamed from: g */
        public boolean mo161787g() {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m197668b(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: f */
    public static boolean m197672f() {
        try {
            XEnginePreferences.setApplicationContext(App.f15369e);
            XEnginePreferences.checkEngineEnv();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m197673g(String str) {
        return m197679m(str) && Double.valueOf(str).doubleValue() <= 7.0d && Double.valueOf(str).doubleValue() >= 7.0d;
    }

    /* JADX INFO: renamed from: h */
    public static void m197674h(roj0 roj0Var) {
        pb4.m168136E();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m197675i() {
        return SharedLibraryLoader.m81454k().m81463q("b_feed");
    }

    /* JADX INFO: renamed from: j */
    public static void m197676j() {
        m197680n().observeOn(Schedulers.m221493io()).doOnNext(new e30() { // from class: l.qb4
            @Override // p149l.e30
            public final void call(Object obj) {
                vb4.m197674h((roj0) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.rb4
            @Override // p149l.e30
            public final void call(Object obj) {
                vb4.m197668b((roj0) obj);
            }
        }, new e30() { // from class: l.sb4
            @Override // p149l.e30
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public static void m197677k() {
        if (f180804b) {
            return;
        }
        XEnginePreferences.setApplicationContext(App.f15369e);
        m197678l();
        f180804b = true;
    }

    /* JADX INFO: renamed from: l */
    public static void m197678l() {
        C20606a c20606a = new C20606a();
        tpd0 tpd0Var = new tpd0("last_immediately_code", 0);
        RecorderInitConfig.C4002b c4002bM19623i = new RecorderInitConfig.C4002b(f180803a).m19625k(qib0.f154730s).m19624j(qib0.f154732t).m19623i(FeedModule.m60221F().userId());
        int iIntValue = tpd0Var.get().intValue();
        int i = qib0.f154732t;
        if (iIntValue == i) {
            c4002bM19623i.m19622h(1440);
            c20606a.f181780a = 86400000L;
        } else {
            tpd0Var.put(Integer.valueOf(i));
        }
        nw3.m161776e().m161779g(App.f15369e, c20606a);
        n500.m157982c(App.f15369e, c4002bM19623i.m19621g());
    }

    /* JADX INFO: renamed from: m */
    public static boolean m197679m(String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        return Pattern.compile("^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: n */
    public static C22306c<roj0> m197680n() {
        return SharedLibraryLoader.m81454k().m81464r("b_feed").doOnNext(new e30() { // from class: l.tb4
            @Override // p149l.e30
            public final void call(Object obj) {
                vb4.m197677k();
            }
        }).map(new w9j() { // from class: l.ub4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }
}
