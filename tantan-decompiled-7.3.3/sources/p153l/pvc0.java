package p153l;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes10.dex */
public class pvc0 {
    /* JADX INFO: renamed from: a */
    public static boolean m173940a(String str, String str2) {
        try {
            return str.matches(str2);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }
}
