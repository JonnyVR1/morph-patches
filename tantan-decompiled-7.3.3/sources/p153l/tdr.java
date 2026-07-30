package p153l;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public class tdr {

    /* JADX INFO: renamed from: a */
    private static Context f173380a;

    /* JADX INFO: renamed from: a */
    private static boolean m190637a(Context context, String str) {
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
    private static boolean m190638b(String str) {
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
    private static void m190639c(Context context, String str) {
        if (m190638b(str) || m190637a(context, str)) {
            return;
        }
        ylc0.m216566a(context, str);
    }

    /* JADX INFO: renamed from: d */
    public static void m190640d(String str) {
        try {
            f173380a = ((Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null)).getApplicationContext();
        } catch (Exception unused) {
        }
        m190639c(f173380a, str);
    }
}
