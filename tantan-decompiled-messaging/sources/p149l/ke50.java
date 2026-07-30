package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: classes9.dex */
public class ke50 {
    /* JADX INFO: renamed from: a */
    public static boolean m145714a() {
        CoreModule.f17545c.f19639e0.m169520na();
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static int m145715b() {
        try {
            return RemoteConfig.m79298x().m79335y("femaleOverheatProtectionLimit");
        } catch (Exception unused) {
            return 7;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Double m145716c() {
        return Double.valueOf(1.946275622E12d);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m145717d() {
        return !"_control".equals(ABManager.m29350i0("REV_quickchatoptimize_time_limited"));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m145718e() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("REV_VoiceBroadcast"));
    }

    /* JADX INFO: renamed from: f */
    public static String m145719f() {
        try {
            return RemoteConfig.m79298x().m79302F("voicequickchat_valid_timelimit");
        } catch (Exception unused) {
            return "";
        }
    }
}
