package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class w1c {

    /* JADX INFO: renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f186780b;

    /* JADX INFO: renamed from: a */
    private static final Map<String, q6e> f186779a = new HashMap(2);

    /* JADX INFO: renamed from: c */
    private static boolean f186781c = false;

    /* JADX INFO: renamed from: a */
    public static Context m204390a() {
        return f186780b;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized lsl m204391b(String str) {
        Map<String, q6e> map;
        map = f186779a;
        if (!map.containsKey(str)) {
            throw new RuntimeException("please call DNSManager#init first");
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m204392c(Context context, zrl zrlVar) {
        f186780b = context;
        m204393d(context, zrlVar);
        q6e q6eVar = new q6e();
        f186779a.put(zrlVar.getAppId(), q6eVar);
        q6eVar.m175556o(zrlVar);
    }

    /* JADX INFO: renamed from: d */
    private static void m204393d(Context context, zrl zrlVar) {
        if (f186781c) {
            return;
        }
        eq80.m121904c(qk90.m176942a(context));
        j4k.m143428a(zrlVar);
        f186781c = true;
    }
}
