package p153l;

import com.momo.xeengine.XEnginePreferences;
import com.p046mm.mediasdk.bean.RecorderInitConfig;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import java.util.Objects;
import java.util.regex.Pattern;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes13.dex */
public class uc4 {

    /* JADX INFO: renamed from: a */
    public static final String f178403a = qv5.m178248b();

    /* JADX INFO: renamed from: b */
    public static boolean f178404b = false;

    /* JADX INFO: renamed from: l.uc4$a */
    public class C20542a extends ysd0 {
        @Override // p153l.ysd0
        /* JADX INFO: renamed from: a */
        public boolean mo195365a() {
            return false;
        }

        @Override // p153l.ysd0
        /* JADX INFO: renamed from: b */
        public String mo160634b() {
            return uc4.f178403a;
        }

        @Override // p153l.ysd0
        /* JADX INFO: renamed from: g */
        public boolean mo160638g() {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m195352b(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: f */
    public static boolean m195356f() {
        try {
            XEnginePreferences.setApplicationContext(App.f16088e);
            XEnginePreferences.checkEngineEnv();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m195357g(String str) {
        return m195363m(str) && Double.valueOf(str).doubleValue() <= 7.0d && Double.valueOf(str).doubleValue() >= 7.0d;
    }

    /* JADX INFO: renamed from: h */
    public static void m195358h(uxj0 uxj0Var) {
        oc4.m167075E();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m195359i() {
        return SharedLibraryLoader.m82637k().m82646q("b_feed");
    }

    /* JADX INFO: renamed from: j */
    public static void m195360j() {
        m195364n().observeOn(Schedulers.m222739io()).doOnNext(new y20() { // from class: l.pc4
            @Override // p153l.y20
            public final void call(Object obj) {
                uc4.m195358h((uxj0) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.qc4
            @Override // p153l.y20
            public final void call(Object obj) {
                uc4.m195352b((uxj0) obj);
            }
        }, new y20() { // from class: l.rc4
            @Override // p153l.y20
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public static void m195361k() {
        if (f178404b) {
            return;
        }
        XEnginePreferences.setApplicationContext(App.f16088e);
        m195362l();
        f178404b = true;
    }

    /* JADX INFO: renamed from: l */
    public static void m195362l() {
        C20542a c20542a = new C20542a();
        vxd0 vxd0Var = new vxd0("last_immediately_code", 0);
        RecorderInitConfig.C4153b c4153bM20622i = new RecorderInitConfig.C4153b(f178403a).m20624k(uqb0.f180413s).m20623j(uqb0.f180415t).m20622i(FeedModule.m61405F().userId());
        int iIntValue = vxd0Var.get().intValue();
        int i = uqb0.f180415t;
        if (iIntValue == i) {
            c4153bM20622i.m20621h(1440);
            c20542a.f201391a = 86400000L;
        } else {
            vxd0Var.put(Integer.valueOf(i));
        }
        mx3.m160626e().m160629g(App.f16088e, c20542a);
        be00.m103676c(App.f16088e, c4153bM20622i.m20620g());
    }

    /* JADX INFO: renamed from: m */
    public static boolean m195363m(String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        return Pattern.compile("^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: n */
    public static C22421c<uxj0> m195364n() {
        return SharedLibraryLoader.m82637k().m82647r("b_feed").doOnNext(new y20() { // from class: l.sc4
            @Override // p153l.y20
            public final void call(Object obj) {
                uc4.m195361k();
            }
        }).map(new qcj() { // from class: l.tc4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }
}
