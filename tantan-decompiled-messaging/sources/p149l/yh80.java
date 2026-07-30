package p149l;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes7.dex */
public class yh80 {

    /* JADX INFO: renamed from: a */
    private static SharedPreferences f198282a;

    /* JADX INFO: renamed from: a */
    private static void m214789a() {
        if (f198282a == null) {
            f198282a = ivc0.f115118g.getSharedPreferences("mm_media_sdk", 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m214790b(String str, int i) {
        m214789a();
        return f198282a.getInt(str, i);
    }

    /* JADX INFO: renamed from: c */
    public static long m214791c(String str, long j) {
        m214789a();
        return f198282a.getLong(str, j);
    }

    /* JADX INFO: renamed from: d */
    public static String m214792d(String str, String str2) {
        m214789a();
        return f198282a.getString(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m214793e(String str, int i) {
        try {
            m214789a();
            SharedPreferences.Editor editorEdit = f198282a.edit();
            editorEdit.putInt(str, i);
            return editorEdit.commit();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m214794f(String str, long j) {
        try {
            m214789a();
            SharedPreferences.Editor editorEdit = f198282a.edit();
            editorEdit.putLong(str, j);
            return editorEdit.commit();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m214795g(String str, String str2) {
        try {
            m214789a();
            SharedPreferences.Editor editorEdit = f198282a.edit();
            editorEdit.putString(str, str2);
            return editorEdit.commit();
        } catch (Throwable unused) {
            return false;
        }
    }
}
