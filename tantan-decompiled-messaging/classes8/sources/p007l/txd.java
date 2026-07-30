package p007l;

import android.os.Build;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class txd {
    /* JADX INFO: renamed from: a */
    public static boolean m11178a() {
        return m11182e();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11179b() {
        return "Xiaomi".equalsIgnoreCase(Build.BRAND) && "Redmi 4A".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m11180c() {
        return "Xiaomi".equalsIgnoreCase(Build.BRAND) && "MIX".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11181d() {
        return "OPPO".equals(Build.BRAND) && "PCCM00".equals(Build.MODEL);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m11182e() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.MODEL;
        return "GT-I9208".equalsIgnoreCase(str) || "GT-I9150".equalsIgnoreCase(str) || "GT-I9152".equalsIgnoreCase(str) || "GT-I9200".equalsIgnoreCase(str) || "GT-I9205".equalsIgnoreCase(str);
    }
}
