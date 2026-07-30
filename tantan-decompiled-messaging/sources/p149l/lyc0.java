package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PicksCardGuideConfig;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.PicksHelper;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class lyc0 extends ogl0 {
    /* JADX INFO: renamed from: c0 */
    public static boolean m152233c0() {
        String strM152241k0 = m152241k0();
        if (TextUtils.equals(strM152241k0, "both")) {
            return true;
        }
        if (TextUtils.isEmpty(strM152241k0)) {
            return false;
        }
        return TextUtils.equals(strM152241k0, CoreModule.f17545c.f19639e0.m169527p9().gender.toString());
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m152234d0() {
        String strM152242l0 = m152242l0();
        if (TextUtils.equals(strM152242l0, "both")) {
            return true;
        }
        if (TextUtils.equals(strM152242l0, "svip")) {
            return !xma.m210071e4();
        }
        if (TextUtils.equals(strM152242l0, "default")) {
            return xma.m210071e4();
        }
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public static int m152235e0() {
        PicksCardGuideConfig picksCardGuideConfigM152236f0 = m152236f0();
        if (NullChecker.m81303a(picksCardGuideConfigM152236f0)) {
            return Math.max(0, picksCardGuideConfigM152236f0.insertPicksCardCreateDays);
        }
        return 0;
    }

    /* JADX INFO: renamed from: f0 */
    public static PicksCardGuideConfig m152236f0() {
        String strM79302F = RemoteConfig.m79298x().m79302F("picksCardGuideConfig");
        if (TextUtils.isEmpty(strM79302F)) {
            return null;
        }
        try {
            return PicksCardGuideConfig.JSON_ADAPTER.parse(strM79302F);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static int m152237g0() {
        PicksCardGuideConfig picksCardGuideConfigM152236f0 = m152236f0();
        if (NullChecker.m81303a(picksCardGuideConfigM152236f0)) {
            return Math.max(0, picksCardGuideConfigM152236f0.newUserCreateDays);
        }
        return 1;
    }

    /* JADX INFO: renamed from: h0 */
    public static int m152238h0() {
        PicksCardGuideConfig picksCardGuideConfigM152236f0 = m152236f0();
        if (NullChecker.m81303a(picksCardGuideConfigM152236f0)) {
            return Math.max(0, picksCardGuideConfigM152236f0.newUserSwipeCardNum);
        }
        return 30;
    }

    /* JADX INFO: renamed from: i0 */
    public static int m152239i0() {
        PicksCardGuideConfig picksCardGuideConfigM152236f0 = m152236f0();
        if (NullChecker.m81303a(picksCardGuideConfigM152236f0)) {
            return Math.max(0, picksCardGuideConfigM152236f0.oldUserSwipeCardNum);
        }
        return 14;
    }

    /* JADX INFO: renamed from: j0 */
    public static int m152240j0() {
        return CoreModule.f17545c.f19639e0.m169494h8(((long) m152237g0()) * 24) ? m152238h0() : m152239i0();
    }

    /* JADX INFO: renamed from: k0 */
    public static String m152241k0() {
        PicksCardGuideConfig picksCardGuideConfigM152236f0 = m152236f0();
        return NullChecker.m81303a(picksCardGuideConfigM152236f0) ? picksCardGuideConfigM152236f0.targetGender : "both";
    }

    /* JADX INFO: renamed from: l0 */
    public static String m152242l0() {
        PicksCardGuideConfig picksCardGuideConfigM152236f0 = m152236f0();
        return NullChecker.m81303a(picksCardGuideConfigM152236f0) ? picksCardGuideConfigM152236f0.targetIdentity : "both";
    }

    /* JADX INFO: renamed from: m0 */
    public static int m152243m0() {
        try {
            return RemoteConfig.m79298x().m79335y("business_entrance_picks_guided_counter_limit");
        } catch (Exception unused) {
            return 2147483646;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m152244n0() {
        int iM152235e0 = m152235e0();
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            return PicksHelper.m56725e((long) userM169527p9.createdTime, iM152235e0);
        }
        return false;
    }
}
