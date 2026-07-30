package p153l;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class f4r0 {

    /* JADX INFO: renamed from: a */
    private static File f97130a = null;

    /* JADX INFO: renamed from: b */
    private static volatile boolean f97131b = false;

    /* JADX INFO: renamed from: c */
    private static volatile boolean f97132c = false;

    /* JADX INFO: renamed from: d */
    private static Map<String, String> f97133d;

    /* JADX INFO: renamed from: l.f4r0$a */
    public static class RunnableC16891a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            f4r0.m124031f();
            if (f4r0.m124029d(false)) {
                krq0.m151111a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m124026a(String str) {
        if (f97133d == null) {
            f97133d = new HashMap();
        }
        f97133d.put(str, String.valueOf(System.currentTimeMillis()));
        d610.m114346i(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m124027b(boolean z, JSONArray jSONArray) {
        try {
            r3r0.m179686l(new File(j5r0.m143557E(n0r0.m161022i()), "apmlite/configCrash/configFile"), jSONArray, false);
        } catch (IOException unused) {
        }
        try {
            r3r0.m179685k(m124035j(), f97133d);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m124028c() {
        return f97131b;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m124029d(boolean z) {
        File fileM124035j = m124035j();
        try {
            Map<String, String> mapM179671D = f97133d;
            if (mapM179671D == null) {
                mapM179671D = r3r0.m179671D(fileM124035j);
            }
            f97133d = mapM179671D;
            if (mapM179671D == null) {
                f97133d = new HashMap();
                return true;
            }
            if (mapM179671D.size() < vuq0.m202886j()) {
                return true;
            }
            Iterator<String> it = vuq0.m202887k().iterator();
            while (it.hasNext()) {
                if (!f97133d.containsKey(it.next())) {
                    return true;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z2 = false;
            for (Map.Entry<String, String> entry : f97133d.entrySet()) {
                try {
                    long jLongValue = Long.decode(entry.getValue()).longValue();
                    if (j0r0.m142990d(entry.getKey())) {
                        if (jCurrentTimeMillis - jLongValue > j0r0.m142992g(entry.getKey())) {
                            z2 = true;
                        }
                    }
                } catch (Throwable th) {
                    q5r0.m175516f(th);
                }
            }
            q5r0.m175511a(z2 ? "config should be updated" : "config should not be updated");
            return z2;
        } catch (Throwable th2) {
            Log.e("npth", NotificationCompat.CATEGORY_ERROR, th2);
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m124030e() {
        return f97132c;
    }

    /* JADX INFO: renamed from: f */
    public static void m124031f() {
        if (f97131b) {
            return;
        }
        f97132c = true;
        File file = new File(j5r0.m143557E(n0r0.m161022i()), "apmlite/configCrash/configFile");
        if (file.exists()) {
            try {
                nrq0.m164509f(new JSONArray(r3r0.m179699y(file)), false);
                f97131b = true;
            } catch (Throwable unused) {
                nrq0.m164509f(null, false);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m124032g() {
        m124031f();
        if (m124029d(false)) {
            krq0.m151111a();
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m124033h() {
        c5r0.m108080b().m179945e(new RunnableC16891a());
    }

    /* JADX INFO: renamed from: i */
    public static void m124034i() {
        Map<String, String> map = f97133d;
        if (map != null) {
            map.clear();
        }
    }

    /* JADX INFO: renamed from: j */
    private static File m124035j() {
        if (f97130a == null) {
            f97130a = new File(j5r0.m143557E(n0r0.m161022i()), "apmlite/configCrash/configInvalid");
        }
        return f97130a;
    }
}
