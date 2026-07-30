package p009l;

import android.content.Context;
import android.os.Build;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import l.du2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ooi0 {
    /* JADX INFO: renamed from: a */
    public static void m19975a(Context context) {
        boolean zM13469a = dt3.m13469a(context);
        boolean z = !zM13469a;
        du2.a("Matrix", "Running on 32bit VM:" + z);
        if (!zM13469a) {
            int i = Build.VERSION.SDK_INT;
            z = (i == 24 || i == 25) ? false : true;
        }
        if (z) {
            RemoteConfig.m9619x().m9651s("thread_stack_control");
        }
    }
}
