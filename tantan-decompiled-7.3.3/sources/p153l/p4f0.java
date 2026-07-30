package p153l;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes7.dex */
public class p4f0 {
    /* JADX INFO: renamed from: a */
    private static SharedPreferences m170562a(Context context) {
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("MediaConfigPreferences", 0);
    }

    /* JADX INFO: renamed from: b */
    public static String m170563b(Context context, String str, String str2) {
        return m170562a(context) != null ? m170562a(context).getString(str, str2) : str2;
    }

    /* JADX INFO: renamed from: c */
    public static void m170564c(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit;
        if (m170562a(context) == null || (editorEdit = m170562a(context).edit()) == null) {
            return;
        }
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }
}
