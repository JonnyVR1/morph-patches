package tech.sud.runtime.component.p021c;

import android.os.Build;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1201b {

    /* JADX INFO: renamed from: a */
    private static a f11188a = null;

    /* JADX INFO: renamed from: b */
    private static boolean f11189b = false;

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.b$a */
    public enum a {
        huawei,
        xiaomi,
        vivo,
        oppo,
        samsung,
        smartisan,
        unknown
    }

    /* JADX INFO: renamed from: a */
    public static a m10089a() {
        a aVar = f11188a;
        if (aVar != null) {
            return aVar;
        }
        f11188a = a.unknown;
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        if (lowerCase.contains("huawei")) {
            f11188a = a.huawei;
        } else if (lowerCase.contains("xiaomi")) {
            f11188a = a.xiaomi;
        } else if (lowerCase.contains("vivo")) {
            f11189b = true;
            f11188a = a.vivo;
        } else if (lowerCase.contains("oppo")) {
            f11189b = true;
            f11188a = a.oppo;
        } else if (lowerCase.contains("samsung")) {
            f11188a = a.samsung;
        } else if (lowerCase.contains("smartisan")) {
            f11188a = a.smartisan;
        }
        return f11188a;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10090b() {
        return f11188a == a.smartisan;
    }
}
