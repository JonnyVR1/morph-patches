package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public class fq80 {
    /* JADX INFO: renamed from: a */
    public static String m126738a(Context context, String str, String str2) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("beatles_monitor", 0);
        return TextUtils.isEmpty(str2) ? sharedPreferences.getString(str, "") : sharedPreferences.getString(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m126739b(Context context, String str, String str2) {
        context.getSharedPreferences("beatles_monitor", 0).edit().putString(str, str2).apply();
    }
}
