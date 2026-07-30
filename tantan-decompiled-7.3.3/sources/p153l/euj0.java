package p153l;

import android.annotation.SuppressLint;
import android.os.Build;

/* JADX INFO: loaded from: classes11.dex */
public class euj0 {
    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: a */
    public static Class<?> m122573a() {
        try {
            return Build.VERSION.SDK_INT >= 26 ? Class.forName("com.android.internal.os.RuntimeInit$KillApplicationHandler") : Class.forName("com.android.internal.os.RuntimeInit$UncaughtHandler");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m122574b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Class<?> clsM122573a;
        return (uncaughtExceptionHandler == null || (clsM122573a = m122573a()) == null || !clsM122573a.isInstance(uncaughtExceptionHandler)) ? false : true;
    }
}
