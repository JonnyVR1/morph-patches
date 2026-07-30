package p007l;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class yve0 {
    /* JADX INFO: renamed from: a */
    public static String m11959a(String str, String str2) {
        try {
            return hgw.m9333a().getSharedPreferences(str, 0).getString(str2, null);
        } catch (Exception e) {
            mjw.m9867a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11960b(String str, String str2, String str3) {
        try {
            SharedPreferences.Editor editorEdit = hgw.m9333a().getSharedPreferences(str, 0).edit();
            editorEdit.putString(str2, str3);
            return editorEdit.commit();
        } catch (Exception e) {
            mjw.m9867a(e);
            return false;
        }
    }
}
