package p007l;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import l.rdc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class rbr {

    /* JADX INFO: renamed from: a */
    private static Context f4063a;

    /* JADX INFO: renamed from: a */
    private static boolean m10553a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                System.load((context.getApplicationInfo().dataDir + "/lib") + File.separator + "lib" + str + ".so");
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m10554b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            System.loadLibrary(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m10555c(Context context, String str) {
        if (m10554b(str) || m10553a(context, str)) {
            return;
        }
        rdc0.a(context, str);
    }

    /* JADX INFO: renamed from: d */
    public static void m10556d(String str) {
        try {
            f4063a = ((Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null)).getApplicationContext();
        } catch (Exception unused) {
        }
        m10555c(f4063a, str);
    }
}
