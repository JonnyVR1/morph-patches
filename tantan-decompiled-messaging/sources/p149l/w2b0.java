package p149l;

import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes11.dex */
public class w2b0 {
    /* JADX INFO: renamed from: a */
    public static boolean m201087a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return false;
        }
        CrashHelper.m81297d(new Exception("showFrom is empty"), 500);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static String m201088b(String str) {
        return m201087a(str) ? "" : str.replaceAll("\\[@@\\]\\d*", "");
    }

    /* JADX INFO: renamed from: c */
    public static String m201089c(String str, int i) {
        return str + "[@@]" + i;
    }
}
