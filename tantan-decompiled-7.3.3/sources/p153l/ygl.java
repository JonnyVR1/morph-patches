package p153l;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class ygl {
    /* JADX INFO: renamed from: a */
    public static Object m215846a() {
        return Build.VERSION.SDK_INT < 26 ? puc0.m173844m("android.app.ActivityManagerNative").m173850b("getDefault").m173855h() : puc0.m173842k(ActivityManager.class).m173850b("getService").m173855h();
    }

    /* JADX INFO: renamed from: b */
    public static Object m215847b() {
        return puc0.m173844m("android.app.ActivityThread").m173850b("currentActivityThread").m173855h();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static Handler m215848c() {
        Handler handler;
        Exception e;
        try {
            handler = (Handler) puc0.m173843l(m215847b()).m173850b("getHandler").m173855h();
            if (handler != null) {
                return handler;
            }
            try {
                return (Handler) puc0.m173843l(m215847b()).m173853e("mH").m173855h();
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return handler;
            }
        } catch (Exception e3) {
            handler = null;
            e = e3;
        }
    }
}
