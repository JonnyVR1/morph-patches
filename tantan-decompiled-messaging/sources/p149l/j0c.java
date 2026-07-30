package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class j0c {

    /* JADX INFO: renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f115655b;

    /* JADX INFO: renamed from: a */
    private static final Map<String, c5e> f115654a = new HashMap(2);

    /* JADX INFO: renamed from: c */
    private static boolean f115656c = false;

    /* JADX INFO: renamed from: a */
    public static Context m139157a() {
        return f115655b;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized ypl m139158b(String str) {
        Map<String, c5e> map;
        map = f115654a;
        if (!map.containsKey(str)) {
            throw new RuntimeException("please call DNSManager#init first");
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m139159c(Context context, mpl mplVar) {
        f115655b = context;
        m139160d(context, mplVar);
        c5e c5eVar = new c5e();
        f115654a.put(mplVar.getAppId(), c5eVar);
        c5eVar.m105308o(mplVar);
    }

    /* JADX INFO: renamed from: d */
    private static void m139160d(Context context, mpl mplVar) {
        if (f115656c) {
            return;
        }
        zh80.m218775c(mc90.m153989a(context));
        r1k.m177465a(mplVar);
        f115656c = true;
    }
}
