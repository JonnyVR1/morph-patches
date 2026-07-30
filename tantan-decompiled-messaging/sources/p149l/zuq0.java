package p149l;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class zuq0 {

    /* JADX INFO: renamed from: a */
    private static File f204876a = null;

    /* JADX INFO: renamed from: b */
    private static volatile boolean f204877b = false;

    /* JADX INFO: renamed from: c */
    private static volatile boolean f204878c = false;

    /* JADX INFO: renamed from: d */
    private static Map<String, String> f204879d;

    /* JADX INFO: renamed from: l.zuq0$a */
    public static class RunnableC21774a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            zuq0.m220244f();
            if (zuq0.m220242d(false)) {
                fiq0.m121555a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m220239a(String str) {
        if (f204879d == null) {
            f204879d = new HashMap();
        }
        f204879d.put(str, String.valueOf(System.currentTimeMillis()));
        tx00.m190920i(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m220240b(boolean z, JSONArray jSONArray) {
        try {
            luq0.m151798l(new File(dwq0.m113905E(hrq0.m132700i()), "apmlite/configCrash/configFile"), jSONArray, false);
        } catch (IOException unused) {
        }
        try {
            luq0.m151797k(m220248j(), f204879d);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m220241c() {
        return f204877b;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m220242d(boolean z) {
        File fileM220248j = m220248j();
        try {
            Map<String, String> mapM151783D = f204879d;
            if (mapM151783D == null) {
                mapM151783D = luq0.m151783D(fileM220248j);
            }
            f204879d = mapM151783D;
            if (mapM151783D == null) {
                f204879d = new HashMap();
                return true;
            }
            if (mapM151783D.size() < plq0.m170251j()) {
                return true;
            }
            Iterator<String> it = plq0.m170252k().iterator();
            while (it.hasNext()) {
                if (!f204879d.containsKey(it.next())) {
                    return true;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z2 = false;
            for (Map.Entry<String, String> entry : f204879d.entrySet()) {
                try {
                    long jLongValue = Long.decode(entry.getValue()).longValue();
                    if (drq0.m113321d(entry.getKey())) {
                        if (jCurrentTimeMillis - jLongValue > drq0.m113323g(entry.getKey())) {
                            z2 = true;
                        }
                    }
                } catch (Throwable th) {
                    kwq0.m147633f(th);
                }
            }
            kwq0.m147628a(z2 ? "config should be updated" : "config should not be updated");
            return z2;
        } catch (Throwable th2) {
            Log.e("npth", NotificationCompat.CATEGORY_ERROR, th2);
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m220243e() {
        return f204878c;
    }

    /* JADX INFO: renamed from: f */
    public static void m220244f() {
        if (f204877b) {
            return;
        }
        f204878c = true;
        File file = new File(dwq0.m113905E(hrq0.m132700i()), "apmlite/configCrash/configFile");
        if (file.exists()) {
            try {
                iiq0.m136431f(new JSONArray(luq0.m151811y(file)), false);
                f204877b = true;
            } catch (Throwable unused) {
                iiq0.m136431f(null, false);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m220245g() {
        m220244f();
        if (m220242d(false)) {
            fiq0.m121555a();
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m220246h() {
        wvq0.m205758b().m151992e(new RunnableC21774a());
    }

    /* JADX INFO: renamed from: i */
    public static void m220247i() {
        Map<String, String> map = f204879d;
        if (map != null) {
            map.clear();
        }
    }

    /* JADX INFO: renamed from: j */
    private static File m220248j() {
        if (f204876a == null) {
            f204876a = new File(dwq0.m113905E(hrq0.m132700i()), "apmlite/configCrash/configInvalid");
        }
        return f204876a;
    }
}
