package p149l;

import android.content.Context;
import android.preference.PreferenceManager;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ovq0 {
    /* JADX INFO: renamed from: b */
    public static void m166205b(Context context, String str, boolean z) {
        m166204a(context);
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(str, z).commit();
    }

    /* JADX INFO: renamed from: c */
    public static void m166206c(Map<String, String> map, String str, String str2) {
        if (map == null || str == null || str2 == null) {
            return;
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m166207d(Context context, String str, boolean z) {
        m166204a(context);
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, z);
    }

    /* JADX INFO: renamed from: a */
    public static void m166204a(Context context) {
    }
}
