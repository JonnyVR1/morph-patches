package p153l;

import android.os.Build;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class jmd0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f121665a = {"/system/app/Superuser.apk", "/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};

    /* JADX INFO: renamed from: a */
    public static boolean m146149a() {
        for (String str : f121665a) {
            try {
                if (new File(str).exists()) {
                    return true;
                }
            } catch (RuntimeException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m146150b() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m146151c() {
        return m146150b() || m146149a();
    }
}
