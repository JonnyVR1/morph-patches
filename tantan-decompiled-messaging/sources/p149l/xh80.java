package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes7.dex */
public class xh80 {
    /* JADX INFO: renamed from: a */
    public static SharedPreferences m208776a(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    /* JADX INFO: renamed from: b */
    public static SharedPreferences.Editor m208777b(Context context) {
        return m208776a(context).edit();
    }

    /* JADX INFO: renamed from: c */
    public static int m208778c(Context context) {
        return m208776a(context).getInt("gpu_benmark_level", 0);
    }
}
