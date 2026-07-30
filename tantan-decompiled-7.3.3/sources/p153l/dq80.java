package p153l;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes7.dex */
public class dq80 {

    /* JADX INFO: renamed from: a */
    private static SharedPreferences f90179a;

    /* JADX INFO: renamed from: a */
    private static void m117491a() {
        if (f90179a == null) {
            f90179a = l3d0.f129865g.getSharedPreferences("mm_media_sdk", 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m117492b(String str, int i) {
        m117491a();
        return f90179a.getInt(str, i);
    }

    /* JADX INFO: renamed from: c */
    public static long m117493c(String str, long j) {
        m117491a();
        return f90179a.getLong(str, j);
    }

    /* JADX INFO: renamed from: d */
    public static String m117494d(String str, String str2) {
        m117491a();
        return f90179a.getString(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m117495e(String str, int i) {
        try {
            m117491a();
            SharedPreferences.Editor editorEdit = f90179a.edit();
            editorEdit.putInt(str, i);
            return editorEdit.commit();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m117496f(String str, long j) {
        try {
            m117491a();
            SharedPreferences.Editor editorEdit = f90179a.edit();
            editorEdit.putLong(str, j);
            return editorEdit.commit();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m117497g(String str, String str2) {
        try {
            m117491a();
            SharedPreferences.Editor editorEdit = f90179a.edit();
            editorEdit.putString(str, str2);
            return editorEdit.commit();
        } catch (Throwable unused) {
            return false;
        }
    }
}
