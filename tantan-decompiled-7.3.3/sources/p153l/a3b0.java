package p153l;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes12.dex */
public class a3b0 {
    /* JADX INFO: renamed from: a */
    public static void m95791a(Object obj, String str) {
        try {
            int length = obj.toString().toCharArray().length;
            if (length > 260000) {
                CrashHelper.m82479c(new Throwable("from:" + str + " size:" + length + " toString:" + obj.toString()));
            }
        } catch (Throwable th) {
            CrashHelper.m82480d(new Throwable("from:" + str + " toString too large", th), 10);
        }
    }
}
