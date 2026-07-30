package p149l;

import android.content.Context;
import android.os.Build;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: classes11.dex */
public class ooi0 {
    /* JADX INFO: renamed from: a */
    public static void m165272a(Context context) {
        boolean zM113531a = dt3.m113531a(context);
        boolean z = !zM113531a;
        du2.m113670a("Matrix", "Running on 32bit VM:" + z);
        if (!zM113531a) {
            int i = Build.VERSION.SDK_INT;
            z = (i == 24 || i == 25) ? false : true;
        }
        if (z) {
            RemoteConfig.m79298x().m79330s("thread_stack_control");
        }
    }
}
