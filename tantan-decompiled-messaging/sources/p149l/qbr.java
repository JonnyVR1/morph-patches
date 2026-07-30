package p149l;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class qbr {

    /* JADX INFO: renamed from: a */
    private static Context f153693a;

    /* JADX INFO: renamed from: a */
    private static boolean m173840a(Context context, String str) {
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
    private static boolean m173841b(String str) {
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
    private static void m173842c(Context context, String str) {
        if (m173841b(str) || m173840a(context, str)) {
            return;
        }
        rdc0.m178959a(context, str);
    }

    /* JADX INFO: renamed from: d */
    public static void m173843d(String str) {
        try {
            f153693a = ((Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null)).getApplicationContext();
        } catch (Exception unused) {
        }
        m173842c(f153693a, str);
    }
}
