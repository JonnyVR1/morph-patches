package p003l;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wua0 {
    /* JADX INFO: renamed from: a */
    public static void m10547a(Object obj, String str) {
        try {
            int length = obj.toString().toCharArray().length;
            if (length > 260000) {
                CrashHelper.c(new Throwable("from:" + str + " size:" + length + " toString:" + obj.toString()));
            }
        } catch (Throwable th) {
            CrashHelper.d(new Throwable("from:" + str + " toString too large", th), 10);
        }
    }
}
