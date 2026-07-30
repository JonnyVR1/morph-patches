package p153l;

import android.os.SystemClock;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.open.SocialOperation;

/* JADX INFO: loaded from: classes9.dex */
public class yp50 {

    /* JADX INFO: renamed from: a */
    public static boolean f201043a = false;

    /* JADX INFO: renamed from: b */
    public static long f201044b;

    /* JADX INFO: renamed from: l.yp50$a */
    public class C21654a implements cpl {
        @Override // p153l.cpl
        /* JADX INFO: renamed from: a */
        public String mo111807a() {
            return "putong";
        }

        @Override // p153l.cpl
        /* JADX INFO: renamed from: b */
        public String mo111808b() {
            try {
                return k2n.m147979a();
            } catch (Throwable unused) {
                return "";
            }
        }

        @Override // p153l.cpl
        /* JADX INFO: renamed from: c */
        public String mo111809c() {
            return hb00.m134333b();
        }

        @Override // p153l.cpl
        /* JADX INFO: renamed from: d */
        public String mo111810d() {
            return tvv.m192837a(App.f16088e);
        }

        @Override // p153l.cpl
        public String getDeviceInfo() {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ x1d0 m216999b(x1d0 x1d0Var) {
        x1d0 x1d0VarM209028b = uqb0.f180376H.basic(x1d0Var.m209023h()).m209028b();
        try {
            return uqb0.f180376H.maybeUpdateRequestBeforeCall(x1d0VarM209028b);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return x1d0VarM209028b;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m217000c() {
        zp50.m220813b(App.f16088e, new C21654a());
        i4g0.m138499H(SocialOperation.GAME_UNION_ID, zp50.m220816e());
        zp50.m220819h(new r1m() { // from class: l.vp50
            @Override // p153l.r1m
            public final void onSuccess(String str) {
                i4g0.m138499H(SocialOperation.GAME_UNION_ID, str);
            }
        });
        zp50.m220820i(new w4m() { // from class: l.wp50
            @Override // p153l.w4m
            /* JADX INFO: renamed from: a */
            public final x1d0 mo204900a(x1d0 x1d0Var) {
                return yp50.m216999b(x1d0Var);
            }
        });
        zp50.m220821j(zwk.m221905e());
    }

    /* JADX INFO: renamed from: d */
    public static String m217001d() {
        return zp50.m220816e();
    }

    /* JADX INFO: renamed from: e */
    public static long m217002e() {
        return f201044b;
    }

    /* JADX INFO: renamed from: f */
    public static void m217003f() {
        if (f201043a) {
            return;
        }
        f201044b = SystemClock.elapsedRealtime();
        zp50.m220818g();
        f201043a = true;
    }
}
