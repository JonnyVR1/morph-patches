package p153l;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: classes8.dex */
public class yw0 {

    /* JADX INFO: renamed from: a */
    public static boolean f201775a;

    /* JADX INFO: renamed from: a */
    public static boolean m217558a() {
        return RemoteConfig.m80481x().m80513s("boot_up_suggest_merge_flag");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m217559b() {
        return TextUtils.equals(ABManager.m30348i0("android_app_launch"), AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m217560c() {
        return f201775a;
    }

    /* JADX INFO: renamed from: d */
    public static void m217561d(boolean z) {
        f201775a = z;
    }
}
