package p149l;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes11.dex */
public class knc0 {
    /* JADX INFO: renamed from: a */
    public static boolean m146561a(String str, String str2) {
        try {
            return str.matches(str2);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }
}
