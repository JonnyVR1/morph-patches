package p149l;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes7.dex */
public class iwe0 {
    /* JADX INFO: renamed from: a */
    private static SharedPreferences m138731a(Context context) {
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("MediaConfigPreferences", 0);
    }

    /* JADX INFO: renamed from: b */
    public static String m138732b(Context context, String str, String str2) {
        return m138731a(context) != null ? m138731a(context).getString(str, str2) : str2;
    }

    /* JADX INFO: renamed from: c */
    public static void m138733c(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit;
        if (m138731a(context) == null || (editorEdit = m138731a(context).edit()) == null) {
            return;
        }
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }
}
