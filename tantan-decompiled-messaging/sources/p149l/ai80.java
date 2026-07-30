package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes13.dex */
public class ai80 {
    /* JADX INFO: renamed from: a */
    public static String m96792a(Context context, String str, String str2) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("beatles_monitor", 0);
        return TextUtils.isEmpty(str2) ? sharedPreferences.getString(str, "") : sharedPreferences.getString(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m96793b(Context context, String str, String str2) {
        context.getSharedPreferences("beatles_monitor", 0).edit().putString(str, str2).apply();
    }
}
