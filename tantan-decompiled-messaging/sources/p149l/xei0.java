package p149l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class xei0 {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, yei0> f192600a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static yei0 m208579a() {
        return m208583e("beatles_apm");
    }

    /* JADX INFO: renamed from: b */
    public static yei0 m208580b() {
        return m208583e("beatles_emergency_thread");
    }

    /* JADX INFO: renamed from: c */
    public static yei0 m208581c() {
        return m208583e("generate-logcat-file");
    }

    /* JADX INFO: renamed from: d */
    public static yei0 m208582d() {
        return m208583e("beatles_report_thread");
    }

    /* JADX INFO: renamed from: e */
    public static yei0 m208583e(String str) {
        yei0 yei0Var = f192600a.get(str);
        if (yei0Var != null) {
            return yei0Var;
        }
        yei0 yei0Var2 = new yei0(str);
        yei0Var2.start();
        f192600a.put(str, yei0Var2);
        return yei0Var2;
    }
}
