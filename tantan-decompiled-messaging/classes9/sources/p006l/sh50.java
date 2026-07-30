package p006l;

import android.os.SystemClock;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import l.d2m;
import l.juk;
import l.rml;
import l.stc0;
import l.stv;
import l.th50;
import l.wyl;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class sh50 {

    /* JADX INFO: renamed from: a */
    public static boolean f21303a = false;

    /* JADX INFO: renamed from: b */
    public static long f21304b;

    /* JADX INFO: renamed from: l.sh50$a */
    public class C1260a implements rml {
        /* JADX INFO: renamed from: a */
        public String m23748a() {
            return "putong";
        }

        /* JADX INFO: renamed from: b */
        public String m23749b() {
            try {
                return k0n.m17897a();
            } catch (Throwable unused) {
                return "";
            }
        }

        /* JADX INFO: renamed from: c */
        public String m23750c() {
            return k200.m17914b();
        }

        /* JADX INFO: renamed from: d */
        public String m23751d() {
            return stv.a(App.e);
        }

        public String getDeviceInfo() {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ stc0 m23743b(stc0 stc0Var) {
        stc0 stc0VarB = qib0.f19784H.basic(stc0Var.h()).b();
        try {
            return qib0.f19784H.maybeUpdateRequestBeforeCall(stc0VarB);
        } catch (Exception e) {
            CrashHelper.c(e);
            return stc0VarB;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m23744c() {
        th50.b(App.e, new C1260a());
        zvf0.H("unionid", th50.e());
        th50.h(new wyl() { // from class: l.ph50
            public final void onSuccess(String str) {
                zvf0.H("unionid", str);
            }
        });
        th50.i(new d2m() { // from class: l.qh50
            /* JADX INFO: renamed from: a */
            public final stc0 m22091a(stc0 stc0Var) {
                return sh50.m23743b(stc0Var);
            }
        });
        th50.j(juk.e());
    }

    /* JADX INFO: renamed from: d */
    public static String m23745d() {
        return th50.e();
    }

    /* JADX INFO: renamed from: e */
    public static long m23746e() {
        return f21304b;
    }

    /* JADX INFO: renamed from: f */
    public static void m23747f() {
        if (f21303a) {
            return;
        }
        f21304b = SystemClock.elapsedRealtime();
        th50.g();
        f21303a = true;
    }
}
