package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.PicksHelper;
import com.p1.mobile.putong.core.data.PicksCardGuideConfig;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class lyc0 extends ogl0 {
    /* JADX INFO: renamed from: c0 */
    public static boolean m19082c0() {
        String strM19090k0 = m19090k0();
        if (TextUtils.equals(strM19090k0, "both")) {
            return true;
        }
        if (TextUtils.isEmpty(strM19090k0)) {
            return false;
        }
        return TextUtils.equals(strM19090k0, CoreModule.f1534c.f3628e0.m21490p9().gender.toString());
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m19083d0() {
        String strM19091l0 = m19091l0();
        if (TextUtils.equals(strM19091l0, "both")) {
            return true;
        }
        if (TextUtils.equals(strM19091l0, "svip")) {
            return !xma.m27379e4();
        }
        if (TextUtils.equals(strM19091l0, CameraSticker.CATEGORY_DEFAULT_FILTER)) {
            return xma.m27379e4();
        }
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public static int m19084e0() {
        PicksCardGuideConfig picksCardGuideConfigM19085f0 = m19085f0();
        if (NullChecker.a(picksCardGuideConfigM19085f0)) {
            return Math.max(0, picksCardGuideConfigM19085f0.insertPicksCardCreateDays);
        }
        return 0;
    }

    /* JADX INFO: renamed from: f0 */
    public static PicksCardGuideConfig m19085f0() {
        String strF = RemoteConfig.x().F("picksCardGuideConfig");
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        try {
            return (PicksCardGuideConfig) PicksCardGuideConfig.JSON_ADAPTER.parse(strF);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static int m19086g0() {
        PicksCardGuideConfig picksCardGuideConfigM19085f0 = m19085f0();
        if (NullChecker.a(picksCardGuideConfigM19085f0)) {
            return Math.max(0, picksCardGuideConfigM19085f0.newUserCreateDays);
        }
        return 1;
    }

    /* JADX INFO: renamed from: h0 */
    public static int m19087h0() {
        PicksCardGuideConfig picksCardGuideConfigM19085f0 = m19085f0();
        if (NullChecker.a(picksCardGuideConfigM19085f0)) {
            return Math.max(0, picksCardGuideConfigM19085f0.newUserSwipeCardNum);
        }
        return 30;
    }

    /* JADX INFO: renamed from: i0 */
    public static int m19088i0() {
        PicksCardGuideConfig picksCardGuideConfigM19085f0 = m19085f0();
        if (NullChecker.a(picksCardGuideConfigM19085f0)) {
            return Math.max(0, picksCardGuideConfigM19085f0.oldUserSwipeCardNum);
        }
        return 14;
    }

    /* JADX INFO: renamed from: j0 */
    public static int m19089j0() {
        return CoreModule.f1534c.f3628e0.m21457h8(((long) m19086g0()) * 24) ? m19087h0() : m19088i0();
    }

    /* JADX INFO: renamed from: k0 */
    public static String m19090k0() {
        PicksCardGuideConfig picksCardGuideConfigM19085f0 = m19085f0();
        return NullChecker.a(picksCardGuideConfigM19085f0) ? picksCardGuideConfigM19085f0.targetGender : "both";
    }

    /* JADX INFO: renamed from: l0 */
    public static String m19091l0() {
        PicksCardGuideConfig picksCardGuideConfigM19085f0 = m19085f0();
        return NullChecker.a(picksCardGuideConfigM19085f0) ? picksCardGuideConfigM19085f0.targetIdentity : "both";
    }

    /* JADX INFO: renamed from: m0 */
    public static int m19092m0() {
        try {
            return RemoteConfig.x().y("business_entrance_picks_guided_counter_limit");
        } catch (Exception unused) {
            return 2147483646;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m19093n0() {
        int iM19084e0 = m19084e0();
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (NullChecker.a(userM21490p9)) {
            return PicksHelper.m10184e((long) userM21490p9.createdTime, iM19084e0);
        }
        return false;
    }
}
