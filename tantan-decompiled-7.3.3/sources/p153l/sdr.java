package p153l;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class sdr {

    /* JADX INFO: renamed from: a */
    private static Context f167456a;

    /* JADX INFO: renamed from: a */
    private static boolean m185499a(Context context, String str) {
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
    private static boolean m185500b(String str) {
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
    private static void m185501c(Context context, String str) {
        if (m185500b(str) || m185499a(context, str)) {
            return;
        }
        ylc0.m216566a(context, str);
    }

    /* JADX INFO: renamed from: d */
    public static void m185502d(String str) {
        try {
            f167456a = ((Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null)).getApplicationContext();
        } catch (Exception unused) {
        }
        m185501c(f167456a, str);
    }
}
