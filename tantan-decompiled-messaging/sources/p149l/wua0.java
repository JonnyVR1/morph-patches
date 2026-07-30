package p149l;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes10.dex */
public class wua0 {
    /* JADX INFO: renamed from: a */
    public static void m205597a(Object obj, String str) {
        try {
            int length = obj.toString().toCharArray().length;
            if (length > 260000) {
                CrashHelper.m81296c(new Throwable("from:" + str + " size:" + length + " toString:" + obj.toString()));
            }
        } catch (Throwable th) {
            CrashHelper.m81297d(new Throwable("from:" + str + " toString too large", th), 10);
        }
    }
}
