package p153l;

import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes10.dex */
public class abb0 {
    /* JADX INFO: renamed from: a */
    public static boolean m96734a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return false;
        }
        CrashHelper.m82480d(new Exception("showFrom is empty"), 500);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static String m96735b(String str) {
        return m96734a(str) ? "" : str.replaceAll("\\[@@\\]\\d*", "");
    }

    /* JADX INFO: renamed from: c */
    public static String m96736c(String str, int i) {
        return str + "[@@]" + i;
    }
}
