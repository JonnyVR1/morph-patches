package p149l;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class ked0 {
    /* JADX INFO: renamed from: a */
    public static boolean m145761a() {
        try {
            String[] strArr = {"/su", "/su/bin/su", "/sbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/data/local/su", "/system/xbin/su", "/system/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/system/bin/cufsdosck", "/system/xbin/cufsdosck", "/system/bin/cufsmgr", "/system/xbin/cufsmgr", "/system/bin/cufaevdd", "/system/xbin/cufaevdd", "/system/bin/conbb", "/system/xbin/conbb"};
            for (int i = 0; i < 18; i++) {
                if (new File(strArr[i]).exists()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
