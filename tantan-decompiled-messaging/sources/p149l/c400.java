package p149l;

import android.app.Application;
import android.os.Build;
import androidx.annotation.Nullable;
import com.immomo.mmutil.task.C3804c;
import com.immomo.mwc.sdk.MWCEngine;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.http.DefaultHttpRequesterImpl;
import java.io.File;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class c400 {

    /* JADX INFO: renamed from: c */
    public static String f79141c;

    /* JADX INFO: renamed from: d */
    public static String f79142d;

    /* JADX INFO: renamed from: e */
    public static String f79143e;

    /* JADX INFO: renamed from: a */
    public static final String f79139a = "https://intl-fep-api.tantanapp.com/v4/config/ext/getWebConfig";

    /* JADX INFO: renamed from: b */
    public static final String f79140b = "https://intl-fep-api.tantanapp.com/v4/config/ext/checkUpdate";

    /* JADX INFO: renamed from: f */
    public static volatile boolean f79144f = false;

    /* JADX INFO: renamed from: l.c400$a */
    public class C16060a implements rhw {
        @Override // p149l.rhw
        @Nullable
        /* JADX INFO: renamed from: a */
        public String mo105186a() {
            return (NullChecker.m81303a(qib0.f154714c0) && qib0.f154714c0.signedIn_()) ? qib0.f154714c0.userId() : "1";
        }

        @Override // p149l.rhw
        /* JADX INFO: renamed from: b */
        public boolean mo105187b() {
            return NullChecker.m81303a(Act.foreground_()) && NullChecker.m81303a(Act.foreground_().f15343a.get());
        }
    }

    /* JADX INFO: renamed from: l.c400$b */
    public class C16061b extends ugf0 {
        @Override // p149l.ugf0, p149l.xwm
        /* JADX INFO: renamed from: b */
        public boolean mo105188b() {
            return true;
        }
    }

    /* JADX INFO: renamed from: l.c400$c */
    public class C16062c implements fvl {
        @Override // p149l.fvl
        /* JADX INFO: renamed from: a */
        public boolean mo105189a(String str, Map<String, String> map, File file) {
            try {
                new DefaultHttpRequesterImpl().mo87145c(str, null, new File[]{file}, null, map);
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // p149l.fvl
        /* JADX INFO: renamed from: b */
        public String mo105190b(String str, Map<String, String> map, byte[] bArr) {
            try {
                new DefaultHttpRequesterImpl().mo87148f(str, map, bArr);
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: l.c400$d */
    public class C16063d extends mgf0 {
        @Override // p149l.mgf0
        /* JADX INFO: renamed from: h */
        public String mo105191h() {
            return (NullChecker.m81303a(qib0.f154714c0) && qib0.f154714c0.signedIn_()) ? qib0.f154714c0.userId() : "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m105174b(Boolean bool) {
        try {
            if (bool.booleanValue()) {
                lxv.m152099e();
            } else {
                lxv.m152100f();
            }
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m105175c() {
        try {
            xtc0.m210965a(m105177e());
            xtc0.m210967c(m105181i());
            vei.m198186e().m198190f();
            y0f.m212119h();
            vei.m198186e().m198196m("launch", new k400());
            if (Build.VERSION.SDK_INT >= 26) {
                ynw.C21448b c21448bM97987b = aow.m97987b();
                c21448bM97987b.m215462l(new s4i0());
                aow.m97989d(App.f15369e, c21448bM97987b.m215461k());
            } else {
                MWCEngine.m19371N(false);
            }
            final oiw oiwVar = oiw.INSTANCE;
            Objects.requireNonNull(oiwVar);
            e51.m114742G(new Runnable() { // from class: l.b400
                @Override // java.lang.Runnable
                public final void run() {
                    oiwVar.m164574i();
                }
            });
        } catch (Throwable th) {
            if (th.getMessage() == null || !th.getMessage().contains("Failed to load WebView provider")) {
                CrashHelper.m81296c(th);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m105176d() {
        return "momoKit/1.0.0 WebView momoWebView/8.29 tantan-android/" + qib0.f154730s + " tribe-android";
    }

    /* JADX INFO: renamed from: e */
    public static m400 m105177e() {
        return new m400(f79140b, m105179g(), m105178f());
    }

    /* JADX INFO: renamed from: f */
    public static HashMap<String, String> m105178f() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", m105180h());
        return map;
    }

    /* JADX INFO: renamed from: g */
    public static HashMap<String, String> m105179g() {
        HashMap<String, String> map = new HashMap<>();
        if (NullChecker.m81303a(qib0.f154714c0) && qib0.f154714c0.signedIn_()) {
            map.put(Oauth2AccessToken.KEY_UID, qib0.f154714c0.userId());
        } else {
            map.put(Oauth2AccessToken.KEY_UID, "");
        }
        map.put("clientVersion", qib0.f154732t + "");
        map.put("extChannel", "intltantan");
        return map;
    }

    /* JADX INFO: renamed from: h */
    public static String m105180h() {
        return "tantan/" + qib0.f154730s + " Android/" + qib0.f154732t + " (" + URLEncoder.encode(Build.BRAND) + "; Android " + Build.VERSION.RELEASE + "; Gapps 0; " + rb20.m178557f() + "; " + mr4.f135329a + "; " + URLEncoder.encode(Build.MODEL) + ")";
    }

    /* JADX INFO: renamed from: i */
    public static m400 m105181i() {
        return new m400(f79139a, m105179g(), m105178f());
    }

    /* JADX INFO: renamed from: j */
    public static void m105182j(Application application) {
        if (f79144f) {
            return;
        }
        f79144f = true;
        m105183k(application);
        jhw jhwVar = new jhw();
        f79141c = application.getFilesDir().getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        sb.append(f79141c);
        String str = File.separator;
        sb.append(str);
        sb.append("mkHome");
        sb.append(str);
        sb.append("backup");
        f79142d = sb.toString();
        f79143e = f79141c + str + "mkHome" + str + UserBanAppealSwitch.offline;
        jhwVar.m141607l(f79141c).m141606k("mkHome").m141602g("mkImage").m141601e(false).m141611p(false).m141610o(new d7i0()).m141600d(false).m141603h(true).m141604i(new t4i0()).m141605j(new C16061b()).m141609n(new C16060a()).m141608m(new iiw() { // from class: l.x300
            @Override // p149l.iiw
            /* JADX INFO: renamed from: a */
            public final String mo136480a() {
                return c400.m105176d();
            }
        });
        jhw.m141597b(application, jhwVar);
        m105185m();
        m105184l();
    }

    /* JADX INFO: renamed from: k */
    public static void m105183k(Application application) {
        j400 j400Var = new j400();
        j400Var.m139608a("tantan");
        xtc0.m210966b(j400Var);
        gnw.m127191b(application, new hnw.C17356a().m132019a("tantan").m132026h("a45d4c0e-b117-3f").m132023e(false).m132022d(new C16063d()).m132021c(new h2i0("tantan"), new h2i0("momo-basic"), new h2i0("momo-web")).m132025g(new C16062c()).m132020b());
    }

    /* JADX INFO: renamed from: l */
    public static void m105184l() {
        Act.foreground().map(new w9j() { // from class: l.y300
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((Act.C4299r) obj));
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.z300
            @Override // p149l.e30
            public final void call(Object obj) {
                c400.m105174b((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public static void m105185m() {
        C3804c.m18444d(1, new Runnable() { // from class: l.a400
            @Override // java.lang.Runnable
            public final void run() {
                c400.m105175c();
            }
        });
    }
}
