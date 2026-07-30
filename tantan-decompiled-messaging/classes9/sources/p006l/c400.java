package p006l;

import android.app.Application;
import android.os.Build;
import androidx.annotation.Nullable;
import com.immomo.mmutil.task.c;
import com.immomo.mwc.sdk.MWCEngine;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.http.DefaultHttpRequesterImpl;
import java.io.File;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import l.aow;
import l.cql;
import l.e30;
import l.e51;
import l.fvl;
import l.gnw;
import l.hnw;
import l.iiw;
import l.j400;
import l.jhw;
import l.k400;
import l.kul;
import l.lxv;
import l.m400;
import l.mgf0;
import l.mkd0;
import l.oiw;
import l.rhw;
import l.ugf0;
import l.vei;
import l.w9j;
import l.xtc0;
import l.y0f;
import l.ynw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class c400 {

    /* JADX INFO: renamed from: c */
    public static String f9340c;

    /* JADX INFO: renamed from: d */
    public static String f9341d;

    /* JADX INFO: renamed from: e */
    public static String f9342e;

    /* JADX INFO: renamed from: a */
    public static final String f9338a = "https://intl-fep-api.tantanapp.com/v4/config/ext/getWebConfig";

    /* JADX INFO: renamed from: b */
    public static final String f9339b = "https://intl-fep-api.tantanapp.com/v4/config/ext/checkUpdate";

    /* JADX INFO: renamed from: f */
    public static volatile boolean f9343f = false;

    /* JADX INFO: renamed from: l.c400$a */
    public class C0589a implements rhw {
        @Nullable
        /* JADX INFO: renamed from: a */
        public String m13137a() {
            return (NullChecker.a(qib0.f19805c0) && qib0.f19805c0.signedIn_()) ? qib0.f19805c0.userId() : "1";
        }

        /* JADX INFO: renamed from: b */
        public boolean m13138b() {
            return NullChecker.a(Act.foreground_()) && NullChecker.a(Act.foreground_().a.get());
        }
    }

    /* JADX INFO: renamed from: l.c400$b */
    public class C0590b extends ugf0 {
        /* JADX INFO: renamed from: b */
        public boolean m13139b() {
            return true;
        }
    }

    /* JADX INFO: renamed from: l.c400$c */
    public class C0591c implements fvl {
        /* JADX INFO: renamed from: a */
        public boolean m13140a(String str, Map<String, String> map, File file) {
            try {
                new DefaultHttpRequesterImpl().c(str, (Map) null, new File[]{file}, (String[]) null, map);
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        /* JADX INFO: renamed from: b */
        public String m13141b(String str, Map<String, String> map, byte[] bArr) {
            try {
                new DefaultHttpRequesterImpl().f(str, map, bArr);
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: l.c400$d */
    public class C0592d extends mgf0 {
        /* JADX INFO: renamed from: h */
        public String m13142h() {
            return (NullChecker.a(qib0.f19805c0) && qib0.f19805c0.signedIn_()) ? qib0.f19805c0.userId() : "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m13125b(Boolean bool) {
        try {
            if (bool.booleanValue()) {
                lxv.e();
            } else {
                lxv.f();
            }
        } catch (Throwable th) {
            CrashHelper.c(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m13126c() {
        try {
            xtc0.a(m13128e());
            xtc0.c(m13132i());
            vei.e().f();
            y0f.h();
            vei.e().m("launch", new cql[]{new k400()});
            if (Build.VERSION.SDK_INT >= 26) {
                ynw.b bVarB = aow.b();
                bVarB.l(new s4i0());
                aow.d(App.e, bVarB.k());
            } else {
                MWCEngine.N(false);
            }
            final oiw oiwVar = oiw.INSTANCE;
            Objects.requireNonNull(oiwVar);
            e51.G(new Runnable() { // from class: l.b400
                @Override // java.lang.Runnable
                public final void run() {
                    oiwVar.i();
                }
            });
        } catch (Throwable th) {
            if (th.getMessage() == null || !th.getMessage().contains("Failed to load WebView provider")) {
                CrashHelper.c(th);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m13127d() {
        return "momoKit/1.0.0 WebView momoWebView/8.29 tantan-android/" + qib0.f19821s + " tribe-android";
    }

    /* JADX INFO: renamed from: e */
    public static m400 m13128e() {
        return new m400(f9339b, m13130g(), m13129f());
    }

    /* JADX INFO: renamed from: f */
    public static HashMap<String, String> m13129f() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", m13131h());
        return map;
    }

    /* JADX INFO: renamed from: g */
    public static HashMap<String, String> m13130g() {
        HashMap<String, String> map = new HashMap<>();
        if (NullChecker.a(qib0.f19805c0) && qib0.f19805c0.signedIn_()) {
            map.put("uid", qib0.f19805c0.userId());
        } else {
            map.put("uid", "");
        }
        map.put("clientVersion", qib0.f19823t + "");
        map.put("extChannel", "intltantan");
        return map;
    }

    /* JADX INFO: renamed from: h */
    public static String m13131h() {
        return "tantan/" + qib0.f19821s + " Android/" + qib0.f19823t + " (" + URLEncoder.encode(Build.BRAND) + "; Android " + Build.VERSION.RELEASE + "; Gapps 0; " + rb20.m22791f() + "; " + mr4.f17192a + "; " + URLEncoder.encode(Build.MODEL) + ")";
    }

    /* JADX INFO: renamed from: i */
    public static m400 m13132i() {
        return new m400(f9338a, m13130g(), m13129f());
    }

    /* JADX INFO: renamed from: j */
    public static void m13133j(Application application) {
        if (f9343f) {
            return;
        }
        f9343f = true;
        m13134k(application);
        jhw jhwVar = new jhw();
        f9340c = application.getFilesDir().getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        sb.append(f9340c);
        String str = File.separator;
        sb.append(str);
        sb.append("mkHome");
        sb.append(str);
        sb.append("backup");
        f9341d = sb.toString();
        f9342e = f9340c + str + "mkHome" + str + "offline";
        jhwVar.l(f9340c).k("mkHome").g("mkImage").e(false).p(false).o(new d7i0()).d(false).h(true).i(new t4i0()).j(new C0590b()).n(new C0589a()).m(new iiw() { // from class: l.x300
            /* JADX INFO: renamed from: a */
            public final String m27152a() {
                return c400.m13127d();
            }
        });
        jhw.b(application, jhwVar);
        m13136m();
        m13135l();
    }

    /* JADX INFO: renamed from: k */
    public static void m13134k(Application application) {
        j400 j400Var = new j400();
        j400Var.a("tantan");
        xtc0.b(j400Var);
        gnw.b(application, new hnw.a().a("tantan").h("a45d4c0e-b117-3f").e(false).d(new C0592d()).c(new kul[]{new h2i0("tantan"), new h2i0("momo-basic"), new h2i0("momo-web")}).g(new C0591c()).b());
    }

    /* JADX INFO: renamed from: l */
    public static void m13135l() {
        Act.foreground().map(new w9j() { // from class: l.y300
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((Act.r) obj));
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.z300
            public final void call(Object obj) {
                c400.m13125b((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public static void m13136m() {
        c.d(1, new Runnable() { // from class: l.a400
            @Override // java.lang.Runnable
            public final void run() {
                c400.m13126c();
            }
        });
    }
}
