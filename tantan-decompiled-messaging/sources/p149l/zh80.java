package p149l;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class zh80 {

    /* JADX INFO: renamed from: a */
    private static volatile SharedPreferences f203143a;

    /* JADX INFO: renamed from: b */
    private static volatile String f203144b;

    /* JADX INFO: renamed from: a */
    private static void m218773a() {
        if (f203143a == null && !TextUtils.isEmpty(f203144b)) {
            try {
                f203143a = j0c.m139157a().getSharedPreferences("dns_" + f203144b, 0);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m218774b(String str, String str2) {
        m218773a();
        try {
            return f203143a.getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m218775c(String str) {
        f203144b = str;
        m218773a();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m218776d(String str, String str2) {
        m218773a();
        try {
            SharedPreferences.Editor editorEdit = f203143a.edit();
            editorEdit.putString(str, str2);
            return editorEdit.commit();
        } catch (Throwable unused) {
            return false;
        }
    }
}
