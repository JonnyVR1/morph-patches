package p149l;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class iel {
    /* JADX INFO: renamed from: a */
    public static Object m135708a() {
        return Build.VERSION.SDK_INT < 26 ? kmc0.m146495m("android.app.ActivityManagerNative").m146501b("getDefault").m146506h() : kmc0.m146493k(ActivityManager.class).m146501b("getService").m146506h();
    }

    /* JADX INFO: renamed from: b */
    public static Object m135709b() {
        return kmc0.m146495m("android.app.ActivityThread").m146501b("currentActivityThread").m146506h();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static Handler m135710c() {
        Handler handler;
        Exception e;
        try {
            handler = (Handler) kmc0.m146494l(m135709b()).m146501b("getHandler").m146506h();
            if (handler != null) {
                return handler;
            }
            try {
                return (Handler) kmc0.m146494l(m135709b()).m146504e("mH").m146506h();
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
