package p149l;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes8.dex */
public class yve0 {
    /* JADX INFO: renamed from: a */
    public static String m216204a(String str, String str2) {
        try {
            return hgw.m130927a().getSharedPreferences(str, 0).getString(str2, null);
        } catch (Exception e) {
            mjw.m154917a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m216205b(String str, String str2, String str3) {
        try {
            SharedPreferences.Editor editorEdit = hgw.m130927a().getSharedPreferences(str, 0).edit();
            editorEdit.putString(str2, str3);
            return editorEdit.commit();
        } catch (Exception e) {
            mjw.m154917a(e);
            return false;
        }
    }
}
