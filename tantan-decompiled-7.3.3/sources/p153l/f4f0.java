package p153l;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes8.dex */
public class f4f0 {
    /* JADX INFO: renamed from: a */
    public static String m123987a(String str, String str2) {
        try {
            return fiw.m125761a().getSharedPreferences(str, 0).getString(str2, null);
        } catch (Exception e) {
            lmw.m154891a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m123988b(String str, String str2, String str3) {
        try {
            SharedPreferences.Editor editorEdit = fiw.m125761a().getSharedPreferences(str, 0).edit();
            editorEdit.putString(str2, str3);
            return editorEdit.commit();
        } catch (Exception e) {
            lmw.m154891a(e);
            return false;
        }
    }
}
