package p007l;

import android.text.TextUtils;
import com.p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class rw0 {

    /* JADX INFO: renamed from: a */
    public static boolean f4095a;

    /* JADX INFO: renamed from: a */
    public static boolean m10606a() {
        return RemoteConfig.x().s("boot_up_suggest_merge_flag");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10607b() {
        return TextUtils.equals(ABManager.i0("android_app_launch"), "exp");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m10608c() {
        return f4095a;
    }

    /* JADX INFO: renamed from: d */
    public static void m10609d(boolean z) {
        f4095a = z;
    }
}
