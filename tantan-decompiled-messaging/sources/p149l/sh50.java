package p149l;

import android.os.SystemClock;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.open.SocialOperation;

/* JADX INFO: loaded from: classes9.dex */
public class sh50 {

    /* JADX INFO: renamed from: a */
    public static boolean f164514a = false;

    /* JADX INFO: renamed from: b */
    public static long f164515b;

    /* JADX INFO: renamed from: l.sh50$a */
    public class C19945a implements rml {
        @Override // p149l.rml
        /* JADX INFO: renamed from: a */
        public String mo180018a() {
            return "putong";
        }

        @Override // p149l.rml
        /* JADX INFO: renamed from: b */
        public String mo180019b() {
            try {
                return k0n.m144071a();
            } catch (Throwable unused) {
                return "";
            }
        }

        @Override // p149l.rml
        /* JADX INFO: renamed from: c */
        public String mo180020c() {
            return k200.m144241b();
        }

        @Override // p149l.rml
        /* JADX INFO: renamed from: d */
        public String mo180021d() {
            return stv.m185972a(App.f15369e);
        }

        @Override // p149l.rml
        public String getDeviceInfo() {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ stc0 m184157b(stc0 stc0Var) {
        stc0 stc0VarM185883b = qib0.f154693H.basic(stc0Var.m185878h()).m185883b();
        try {
            return qib0.f154693H.maybeUpdateRequestBeforeCall(stc0VarM185883b);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return stc0VarM185883b;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m184158c() {
        th50.m188867b(App.f15369e, new C19945a());
        zvf0.m220375H(SocialOperation.GAME_UNION_ID, th50.m188870e());
        th50.m188873h(new wyl() { // from class: l.ph50
            @Override // p149l.wyl
            public final void onSuccess(String str) {
                zvf0.m220375H(SocialOperation.GAME_UNION_ID, str);
            }
        });
        th50.m188874i(new d2m() { // from class: l.qh50
            @Override // p149l.d2m
            /* JADX INFO: renamed from: a */
            public final stc0 mo109814a(stc0 stc0Var) {
                return sh50.m184157b(stc0Var);
            }
        });
        th50.m188875j(juk.m143323e());
    }

    /* JADX INFO: renamed from: d */
    public static String m184159d() {
        return th50.m188870e();
    }

    /* JADX INFO: renamed from: e */
    public static long m184160e() {
        return f164515b;
    }

    /* JADX INFO: renamed from: f */
    public static void m184161f() {
        if (f164514a) {
            return;
        }
        f164515b = SystemClock.elapsedRealtime();
        th50.m188872g();
        f164514a = true;
    }
}
