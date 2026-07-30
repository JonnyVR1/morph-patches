package p149l;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes7.dex */
public class zve0 {
    /* JADX INFO: renamed from: a */
    public static String m220363a(Context context, String str, String str2) {
        try {
            return context.getSharedPreferences(str, 0).getString(str2, null);
        } catch (Exception e) {
            kjw.m146279b(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m220364b(String str, String str2) {
        try {
            return ggw.m126041a().getSharedPreferences(str, 0).getString(str2, null);
        } catch (Exception e) {
            kjw.m146279b(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m220365c(String str, String str2, String str3) {
        try {
            SharedPreferences.Editor editorEdit = ggw.m126041a().getSharedPreferences(str, 0).edit();
            editorEdit.putString(str2, str3);
            return editorEdit.commit();
        } catch (Exception e) {
            kjw.m146279b(e);
            return false;
        }
    }
}
