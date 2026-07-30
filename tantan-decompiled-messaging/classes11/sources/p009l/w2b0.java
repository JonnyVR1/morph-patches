package p009l;

import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class w2b0 {
    /* JADX INFO: renamed from: a */
    public static boolean m23780a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return false;
        }
        CrashHelper.d(new Exception("showFrom is empty"), 500);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static String m23781b(String str) {
        return m23780a(str) ? "" : str.replaceAll("\\[@@\\]\\d*", "");
    }

    /* JADX INFO: renamed from: c */
    public static String m23782c(String str, int i) {
        return str + "[@@]" + i;
    }
}
