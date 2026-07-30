package p153l;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class eq80 {

    /* JADX INFO: renamed from: a */
    private static volatile SharedPreferences f95314a;

    /* JADX INFO: renamed from: b */
    private static volatile String f95315b;

    /* JADX INFO: renamed from: a */
    private static void m121902a() {
        if (f95314a == null && !TextUtils.isEmpty(f95315b)) {
            try {
                f95314a = w1c.m204390a().getSharedPreferences("dns_" + f95315b, 0);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m121903b(String str, String str2) {
        m121902a();
        try {
            return f95314a.getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m121904c(String str) {
        f95315b = str;
        m121902a();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m121905d(String str, String str2) {
        m121902a();
        try {
            SharedPreferences.Editor editorEdit = f95314a.edit();
            editorEdit.putString(str, str2);
            return editorEdit.commit();
        } catch (Throwable unused) {
            return false;
        }
    }
}
