package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: classes9.dex */
public class rm50 {
    /* JADX INFO: renamed from: a */
    public static boolean m182040a() {
        CoreModule.f18264c.f20381e0.m116593na();
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static int m182041b() {
        try {
            return RemoteConfig.m80481x().m80518y("femaleOverheatProtectionLimit");
        } catch (Exception unused) {
            return 7;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Double m182042c() {
        return Double.valueOf(1.946275622E12d);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m182043d() {
        return !"_control".equals(ABManager.m30348i0("REV_quickchatoptimize_time_limited"));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m182044e() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("REV_VoiceBroadcast"));
    }

    /* JADX INFO: renamed from: f */
    public static String m182045f() {
        try {
            return RemoteConfig.m80481x().m80485F("voicequickchat_valid_timelimit");
        } catch (Exception unused) {
            return "";
        }
    }
}
