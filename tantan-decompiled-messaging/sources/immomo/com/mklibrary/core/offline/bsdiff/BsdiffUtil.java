package immomo.com.mklibrary.core.offline.bsdiff;

import com.immomo.mmutil.log.Log4Android;
import p149l.rdc0;
import p149l.shw;

/* JADX INFO: loaded from: classes2.dex */
public class BsdiffUtil {
    static {
        try {
            System.loadLibrary("bsdiff");
        } catch (Throwable th) {
            try {
                rdc0.m178959a(shw.m184283c(), "bsdiff");
            } catch (Exception unused) {
                Log4Android.m18417f().m18422e(th);
            }
        }
    }

    public static native int apply_patch(String str, String str2, String str3);
}
