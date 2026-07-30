package p009l;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class knc0 {
    /* JADX INFO: renamed from: a */
    public static boolean m17553a(String str, String str2) {
        try {
            return str.matches(str2);
        } catch (Exception e) {
            CrashHelper.c(e);
            return false;
        }
    }
}
