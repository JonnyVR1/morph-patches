package p149l;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: classes8.dex */
public class rw0 {

    /* JADX INFO: renamed from: a */
    public static boolean f161293a;

    /* JADX INFO: renamed from: a */
    public static boolean m181367a() {
        return RemoteConfig.m79298x().m79330s("boot_up_suggest_merge_flag");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m181368b() {
        return TextUtils.equals(ABManager.m29350i0("android_app_launch"), AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m181369c() {
        return f161293a;
    }

    /* JADX INFO: renamed from: d */
    public static void m181370d(boolean z) {
        f161293a = z;
    }
}
