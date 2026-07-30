package p153l;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class udr {

    /* JADX INFO: renamed from: a */
    private static Context f178585a;

    /* JADX INFO: renamed from: a */
    private static boolean m195557a(Context context, String str) {
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
    private static boolean m195558b(String str) {
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
    private static void m195559c(Context context, String str) {
        if (m195558b(str) || m195557a(context, str)) {
            return;
        }
        ylc0.m216566a(context, str);
    }

    /* JADX INFO: renamed from: d */
    public static void m195560d(String str) {
        try {
            f178585a = ((Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null)).getApplicationContext();
        } catch (Exception unused) {
        }
        m195559c(f178585a, str);
    }
}
