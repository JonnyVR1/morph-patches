package p149l;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public class rbr {

    /* JADX INFO: renamed from: a */
    private static Context f158676a;

    /* JADX INFO: renamed from: a */
    private static boolean m178688a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                System.load((context.getApplicationInfo().dataDir + "/lib") + File.separator + ShareConstants.SO_PATH + str + ".so");
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m178689b(String str) {
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
    private static void m178690c(Context context, String str) {
        if (m178689b(str) || m178688a(context, str)) {
            return;
        }
        rdc0.m178959a(context, str);
    }

    /* JADX INFO: renamed from: d */
    public static void m178691d(String str) {
        try {
            f158676a = ((Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null)).getApplicationContext();
        } catch (Exception unused) {
        }
        m178690c(f158676a, str);
    }
}
