package p149l;

import android.annotation.SuppressLint;
import android.os.Build;

/* JADX INFO: loaded from: classes13.dex */
public class blj0 {
    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: a */
    public static Class<?> m102542a() {
        try {
            return Build.VERSION.SDK_INT >= 26 ? Class.forName("com.android.internal.os.RuntimeInit$KillApplicationHandler") : Class.forName("com.android.internal.os.RuntimeInit$UncaughtHandler");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m102543b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Class<?> clsM102542a;
        return (uncaughtExceptionHandler == null || (clsM102542a = m102542a()) == null || !clsM102542a.isInstance(uncaughtExceptionHandler)) ? false : true;
    }
}
