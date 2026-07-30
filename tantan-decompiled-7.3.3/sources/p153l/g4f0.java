package p153l;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes7.dex */
public class g4f0 {
    /* JADX INFO: renamed from: a */
    public static String m128875a(Context context, String str, String str2) {
        try {
            return context.getSharedPreferences(str, 0).getString(str2, null);
        } catch (Exception e) {
            jmw.m146177b(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m128876b(String str, String str2) {
        try {
            return eiw.m120945a().getSharedPreferences(str, 0).getString(str2, null);
        } catch (Exception e) {
            jmw.m146177b(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m128877c(String str, String str2, String str3) {
        try {
            SharedPreferences.Editor editorEdit = eiw.m120945a().getSharedPreferences(str, 0).edit();
            editorEdit.putString(str2, str3);
            return editorEdit.commit();
        } catch (Exception e) {
            jmw.m146177b(e);
            return false;
        }
    }
}
