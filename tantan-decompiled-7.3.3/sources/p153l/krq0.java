package p153l;

import com.apm.lite.p010j.C0926e;
import com.clevertap.android.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class krq0 {

    /* JADX INFO: renamed from: a */
    private static Runnable f128496a = new RunnableC18248a();

    /* JADX INFO: renamed from: b */
    private static int f128497b = 0;

    /* JADX INFO: renamed from: l.krq0$a */
    public static class RunnableC18248a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            r5r0 r5r0VarM108080b;
            Runnable runnable;
            long j;
            c5r0.m108080b().m179948j(krq0.f128496a);
            if (l5r0.m152978c(n0r0.m161022i())) {
                krq0.m151117g();
            }
            if (krq0.f128497b > 0) {
                if (lrq0.m155646j(n0r0.m161022i())) {
                    r5r0VarM108080b = c5r0.m108080b();
                    runnable = krq0.f128496a;
                    j = 15000;
                } else {
                    r5r0VarM108080b = c5r0.m108080b();
                    runnable = krq0.f128496a;
                    j = Constants.ONE_MIN_IN_MILLIS;
                }
                r5r0VarM108080b.m179946f(runnable, j);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m151111a() {
        f128497b = 40;
        c5r0.m108080b().m179945e(f128496a);
    }

    /* JADX INFO: renamed from: b */
    public static void m151112b() {
        if (!f4r0.m124030e()) {
            f4r0.m124031f();
        }
        if (l5r0.m152978c(n0r0.m161022i()) && f4r0.m124029d(false)) {
            m151117g();
        }
    }

    /* JADX INFO: renamed from: f */
    private static byte[] m151116f() {
        try {
            return C0926e.m5134l(n0r0.m161024k().m169519b(), null, vuq0.m202879c().toString().getBytes());
        } catch (Throwable th) {
            q5r0.m175516f(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static synchronized void m151117g() {
        try {
            int i = f128497b;
            if (i > 0) {
                f128497b = i - 1;
            }
            q5r0.m175511a("try fetchApmConfig");
            if (lrq0.m155646j(n0r0.m161022i())) {
                JSONArray jSONArrayOptJSONArray = null;
                try {
                    byte[] bArrM151116f = m151116f();
                    if (bArrM151116f != null) {
                        jSONArrayOptJSONArray = new JSONObject(new String(bArrM151116f)).optJSONArray("data");
                    }
                } catch (Throwable th) {
                    q5r0.m175515e("npth", th);
                }
                q5r0.m175511a("after fetchApmConfig net " + jSONArrayOptJSONArray);
                if (jSONArrayOptJSONArray != null) {
                    nrq0.m164509f(jSONArrayOptJSONArray, true);
                    f128497b = 0;
                } else {
                    f128497b -= 10;
                }
            } else {
                f4r0.m124031f();
                if (f4r0.m124028c()) {
                    f128497b = 0;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
