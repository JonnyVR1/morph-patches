package p006l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.immomo.hdata.android.MDevice;
import com.immomo.mmdns.DNSManager;
import com.immomo.mmdns.MDDNSEntrance;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import l.e30;
import l.mkd0;
import l.roj0;
import l.x4j0;
import rx.schedulers.Schedulers;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xgw {

    /* JADX INFO: renamed from: a */
    public static String f27510a = "";

    /* JADX INFO: renamed from: b */
    public static boolean f27511b = true;

    /* JADX INFO: renamed from: c */
    public static a<roj0> f27512c = a.b();

    static {
        try {
            f27511b = RemoteConfig.x().s("android_momosec_config");
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m27227c(String str, String str2, String str3, roj0 roj0Var) {
        try {
            MDevice.collect(str, str2, str3, mr4.f17192a, rb20.m22789d(), "tantan#tantantribe", new C1438b());
        } catch (Throwable th) {
            CrashHelper.c(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m27228d(@NonNull final String str, @NonNull final String str2, @NonNull final String str3) {
        if (f27511b) {
            if ("launch".equals(str) || "guest".equals(str)) {
                Act.foreground().take(1).subscribe(mkd0.G(new e30() { // from class: l.ugw
                    public final void call(Object obj) {
                        xgw.m27229e(str, str2, str3);
                    }
                }));
            } else {
                m27229e(str, str2, str3);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m27229e(@NonNull final String str, @NonNull final String str2, @NonNull final String str3) {
        f27512c.observeOn(Schedulers.io()).subscribe(mkd0.G(new e30() { // from class: l.vgw
            public final void call(Object obj) {
                xgw.m27227c(str, str3, str2, (roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public static void m27230f() {
        try {
            MDevice.getMMuidV3(qib0.f19805c0.userId(), new C1437a());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m27231g() {
        String strM23745d = sh50.m23745d();
        if (!TextUtils.isEmpty(strM23745d)) {
            return strM23745d;
        }
        String strM17914b = k200.m17914b();
        if (!TextUtils.isEmpty(strM17914b)) {
            return strM17914b;
        }
        return System.currentTimeMillis() + "";
    }

    /* JADX INFO: renamed from: h */
    public static void m27232h() {
        m27228d("guest", "a6fd94677fded2e38b978b5d530506aa", m27231g());
    }

    /* JADX INFO: renamed from: i */
    public static void m27233i() {
        MDevice.init(App.e, new MDevice.Config() { // from class: l.wgw
            public final MDDNSEntrance getDnsInstance() {
                return DNSManager.getInstance(oph0.f18319b);
            }
        });
        f27512c.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: j */
    public static void m27234j(String str) {
        f27510a = str;
        m27228d("launch", qib0.f19805c0.accessToken(), str);
    }

    /* JADX INFO: renamed from: k */
    public static void m27235k(String str) {
        f27510a = str;
        m27228d("login", qib0.f19805c0.accessToken(), str);
    }

    /* JADX INFO: renamed from: l */
    public static void m27236l() {
        m27228d("logout", "a6fd94677fded2e38b978b5d530506aa", f27510a);
    }

    /* JADX INFO: renamed from: m */
    public static void m27237m() {
        m27228d("picture_verification", qib0.f19805c0.accessToken(), f27510a);
    }

    /* JADX INFO: renamed from: n */
    public static void m27238n(String str) {
        f27510a = str;
        m27228d("register", qib0.f19805c0.accessToken(), str);
    }

    /* JADX INFO: renamed from: l.xgw$a */
    public class C1437a implements MDevice.MmuidCallBack {
        public void onMMUIDGetComplete(String str) {
        }

        public void onMMUIDGetError(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: l.xgw$b */
    public class C1438b implements x4j0 {
        /* JADX INFO: renamed from: a */
        public void m27239a(String str, String str2) {
        }
    }
}
