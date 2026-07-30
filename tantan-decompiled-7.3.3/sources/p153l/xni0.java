package p153l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class xni0 {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, yni0> f195398a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static yni0 m212209a() {
        return m212213e("beatles_apm");
    }

    /* JADX INFO: renamed from: b */
    public static yni0 m212210b() {
        return m212213e("beatles_emergency_thread");
    }

    /* JADX INFO: renamed from: c */
    public static yni0 m212211c() {
        return m212213e("generate-logcat-file");
    }

    /* JADX INFO: renamed from: d */
    public static yni0 m212212d() {
        return m212213e("beatles_report_thread");
    }

    /* JADX INFO: renamed from: e */
    public static yni0 m212213e(String str) {
        yni0 yni0Var = f195398a.get(str);
        if (yni0Var != null) {
            return yni0Var;
        }
        yni0 yni0Var2 = new yni0(str);
        yni0Var2.start();
        f195398a.put(str, yni0Var2);
        return yni0Var2;
    }
}
