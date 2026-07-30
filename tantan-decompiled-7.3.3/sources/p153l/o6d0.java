package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PicksCardGuideConfig;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.PicksHelper;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class o6d0 extends spl0 {
    /* JADX INFO: renamed from: c0 */
    public static boolean m166213c0() {
        String strM166221k0 = m166221k0();
        if (TextUtils.equals(strM166221k0, "both")) {
            return true;
        }
        if (TextUtils.isEmpty(strM166221k0)) {
            return false;
        }
        return TextUtils.equals(strM166221k0, CoreModule.f18264c.f20381e0.m116600p9().gender.toString());
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m166214d0() {
        String strM166222l0 = m166222l0();
        if (TextUtils.equals(strM166222l0, "both")) {
            return true;
        }
        if (TextUtils.equals(strM166222l0, "svip")) {
            return !joa.m146386f4();
        }
        if (TextUtils.equals(strM166222l0, "default")) {
            return joa.m146386f4();
        }
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public static int m166215e0() {
        PicksCardGuideConfig picksCardGuideConfigM166216f0 = m166216f0();
        if (NullChecker.m82486a(picksCardGuideConfigM166216f0)) {
            return Math.max(0, picksCardGuideConfigM166216f0.insertPicksCardCreateDays);
        }
        return 0;
    }

    /* JADX INFO: renamed from: f0 */
    public static PicksCardGuideConfig m166216f0() {
        String strM80485F = RemoteConfig.m80481x().m80485F("picksCardGuideConfig");
        if (TextUtils.isEmpty(strM80485F)) {
            return null;
        }
        try {
            return PicksCardGuideConfig.JSON_ADAPTER.parse(strM80485F);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static int m166217g0() {
        PicksCardGuideConfig picksCardGuideConfigM166216f0 = m166216f0();
        if (NullChecker.m82486a(picksCardGuideConfigM166216f0)) {
            return Math.max(0, picksCardGuideConfigM166216f0.newUserCreateDays);
        }
        return 1;
    }

    /* JADX INFO: renamed from: h0 */
    public static int m166218h0() {
        PicksCardGuideConfig picksCardGuideConfigM166216f0 = m166216f0();
        if (NullChecker.m82486a(picksCardGuideConfigM166216f0)) {
            return Math.max(0, picksCardGuideConfigM166216f0.newUserSwipeCardNum);
        }
        return 30;
    }

    /* JADX INFO: renamed from: i0 */
    public static int m166219i0() {
        PicksCardGuideConfig picksCardGuideConfigM166216f0 = m166216f0();
        if (NullChecker.m82486a(picksCardGuideConfigM166216f0)) {
            return Math.max(0, picksCardGuideConfigM166216f0.oldUserSwipeCardNum);
        }
        return 14;
    }

    /* JADX INFO: renamed from: j0 */
    public static int m166220j0() {
        return CoreModule.f18264c.f20381e0.m116567h8(((long) m166217g0()) * 24) ? m166218h0() : m166219i0();
    }

    /* JADX INFO: renamed from: k0 */
    public static String m166221k0() {
        PicksCardGuideConfig picksCardGuideConfigM166216f0 = m166216f0();
        return NullChecker.m82486a(picksCardGuideConfigM166216f0) ? picksCardGuideConfigM166216f0.targetGender : "both";
    }

    /* JADX INFO: renamed from: l0 */
    public static String m166222l0() {
        PicksCardGuideConfig picksCardGuideConfigM166216f0 = m166216f0();
        return NullChecker.m82486a(picksCardGuideConfigM166216f0) ? picksCardGuideConfigM166216f0.targetIdentity : "both";
    }

    /* JADX INFO: renamed from: m0 */
    public static int m166223m0() {
        try {
            return RemoteConfig.m80481x().m80518y("business_entrance_picks_guided_counter_limit");
        } catch (Exception unused) {
            return 2147483646;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m166224n0() {
        int iM166215e0 = m166215e0();
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            return PicksHelper.m57908e((long) userM116600p9.createdTime, iM166215e0);
        }
        return false;
    }
}
