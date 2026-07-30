package p149l;

import com.apm.lite.p009j.C0922e;
import com.clevertap.android.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class fiq0 {

    /* JADX INFO: renamed from: a */
    private static Runnable f97711a = new RunnableC16848a();

    /* JADX INFO: renamed from: b */
    private static int f97712b = 0;

    /* JADX INFO: renamed from: l.fiq0$a */
    public static class RunnableC16848a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            lwq0 lwq0VarM205758b;
            Runnable runnable;
            long j;
            wvq0.m205758b().m151995j(fiq0.f97711a);
            if (fwq0.m123554c(hrq0.m132700i())) {
                fiq0.m121561g();
            }
            if (fiq0.f97712b > 0) {
                if (giq0.m126395j(hrq0.m132700i())) {
                    lwq0VarM205758b = wvq0.m205758b();
                    runnable = fiq0.f97711a;
                    j = 15000;
                } else {
                    lwq0VarM205758b = wvq0.m205758b();
                    runnable = fiq0.f97711a;
                    j = Constants.ONE_MIN_IN_MILLIS;
                }
                lwq0VarM205758b.m151993f(runnable, j);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m121555a() {
        f97712b = 40;
        wvq0.m205758b().m151992e(f97711a);
    }

    /* JADX INFO: renamed from: b */
    public static void m121556b() {
        if (!zuq0.m220243e()) {
            zuq0.m220244f();
        }
        if (fwq0.m123554c(hrq0.m132700i()) && zuq0.m220242d(false)) {
            m121561g();
        }
    }

    /* JADX INFO: renamed from: f */
    private static byte[] m121560f() {
        try {
            return C0922e.m5124l(hrq0.m132702k().m143398b(), null, plq0.m170244c().toString().getBytes());
        } catch (Throwable th) {
            kwq0.m147633f(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static synchronized void m121561g() {
        try {
            int i = f97712b;
            if (i > 0) {
                f97712b = i - 1;
            }
            kwq0.m147628a("try fetchApmConfig");
            if (giq0.m126395j(hrq0.m132700i())) {
                JSONArray jSONArrayOptJSONArray = null;
                try {
                    byte[] bArrM121560f = m121560f();
                    if (bArrM121560f != null) {
                        jSONArrayOptJSONArray = new JSONObject(new String(bArrM121560f)).optJSONArray("data");
                    }
                } catch (Throwable th) {
                    kwq0.m147632e("npth", th);
                }
                kwq0.m147628a("after fetchApmConfig net " + jSONArrayOptJSONArray);
                if (jSONArrayOptJSONArray != null) {
                    iiq0.m136431f(jSONArrayOptJSONArray, true);
                    f97712b = 0;
                } else {
                    f97712b -= 10;
                }
            } else {
                zuq0.m220244f();
                if (zuq0.m220241c()) {
                    f97712b = 0;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
