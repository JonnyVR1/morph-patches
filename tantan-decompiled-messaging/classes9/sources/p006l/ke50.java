package p006l;

import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ke50 {
    /* JADX INFO: renamed from: a */
    public static boolean m18101a() {
        CoreModule.f1534c.f3628e0.m21483na();
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static int m18102b() {
        try {
            return RemoteConfig.x().y("femaleOverheatProtectionLimit");
        } catch (Exception unused) {
            return 7;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Double m18103c() {
        return Double.valueOf(1.946275622E12d);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m18104d() {
        return !"_control".equals(ABManager.m1256i0("REV_quickchatoptimize_time_limited"));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m18105e() {
        return "exp".equals(ABManager.m1256i0("REV_VoiceBroadcast"));
    }

    /* JADX INFO: renamed from: f */
    public static String m18106f() {
        try {
            return RemoteConfig.x().F("voicequickchat_valid_timelimit");
        } catch (Exception unused) {
            return "";
        }
    }
}
