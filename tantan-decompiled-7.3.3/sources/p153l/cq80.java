package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes7.dex */
public class cq80 {
    /* JADX INFO: renamed from: a */
    public static SharedPreferences m111883a(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    /* JADX INFO: renamed from: b */
    public static SharedPreferences.Editor m111884b(Context context) {
        return m111883a(context).edit();
    }

    /* JADX INFO: renamed from: c */
    public static int m111885c(Context context) {
        return m111883a(context).getInt("gpu_benmark_level", 0);
    }
}
