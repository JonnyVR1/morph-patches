package p153l;

import android.content.Context;
import android.os.Build;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: classes10.dex */
public class qxi0 {
    /* JADX INFO: renamed from: a */
    public static void m178602a(Context context) {
        boolean zM112649a = cu3.m112649a(context);
        boolean z = !zM112649a;
        tu2.m192703a("Matrix", "Running on 32bit VM:" + z);
        if (!zM112649a) {
            int i = Build.VERSION.SDK_INT;
            z = (i == 24 || i == 25) ? false : true;
        }
        if (z) {
            RemoteConfig.m80481x().m80513s("thread_stack_control");
        }
    }
}
