package p153l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class aq8 {

    /* JADX INFO: renamed from: a */
    public static ArrayList<String> f72792a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f72793b = false;

    /* JADX INFO: renamed from: c */
    @SuppressLint({"SV_USE_DUP_ID"})
    public static byd0 f72794c = new byd0("lost_location_notify_dlg", 0L);

    /* JADX INFO: renamed from: l.aq8$a */
    public class C15768a implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            aq8.m99438w();
            return aq8.f72792a;
        }

        @Override // p153l.m1l0
        public String key() {
            return "ab_groups";
        }
    }

    /* JADX INFO: renamed from: l.aq8$a0 */
    public class C15769a0 implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Integer.valueOf(CoreModule.f18264c.f20364Y0.f161179u);
        }

        @Override // p153l.m1l0
        public String key() {
            return "swipe_verify_day_continue_right";
        }
    }

    /* JADX INFO: renamed from: l.aq8$b */
    public class C15770b implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Boolean.valueOf(aq8.m99434s());
        }

        @Override // p153l.m1l0
        public String key() {
            return "need_avatar_verification";
        }
    }

    /* JADX INFO: renamed from: l.aq8$b0 */
    public class C15771b0 implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Integer.valueOf(CoreModule.f18264c.f20364Y0.f161180v);
        }

        @Override // p153l.m1l0
        public String key() {
            return "swipe_verify_day_continue_left";
        }
    }

    /* JADX INFO: renamed from: l.aq8$c */
    public class C15772c implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Boolean.valueOf(aq8.m99435t());
        }

        @Override // p153l.m1l0
        public String key() {
            return "need_pic_verification";
        }
    }

    /* JADX INFO: renamed from: l.aq8$c0 */
    public class C15773c0 implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Boolean.valueOf(CoreModule.f18264c.f20364Y0.m179742a());
        }

        @Override // p153l.m1l0
        public String key() {
            return "match_success";
        }
    }

    /* JADX INFO: renamed from: l.aq8$d */
    public class C15774d implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Integer.valueOf(CoreModule.f18264c.f20364Y0.f161178t);
        }

        @Override // p153l.m1l0
        public String key() {
            return "swipe_session_continue_right_nomatch";
        }
    }

    /* JADX INFO: renamed from: l.aq8$d0 */
    public class C15775d0 implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
            return verificationCenterM32615k4 == null ? StudentVerificationStatus.get("unknown_").name() : verificationCenterM32615k4.picVerificationInfo.status.name();
        }

        @Override // p153l.m1l0
        public String key() {
            return "pic_verification_status";
        }
    }

    /* JADX INFO: renamed from: l.aq8$e */
    public class C15776e implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Boolean.valueOf(aq8.m99436u());
        }

        @Override // p153l.m1l0
        public String key() {
            return "privilege_see";
        }
    }

    /* JADX INFO: renamed from: l.aq8$e0 */
    public class C15777e0 implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return CoreModule.f18264c.f20294B0.f20490V.get();
        }

        @Override // p153l.m1l0
        public String key() {
            return "pic_verification_fail_show_enable";
        }
    }

    /* JADX INFO: renamed from: l.aq8$f */
    public class C15778f implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Integer.valueOf(aq8.m99432q());
        }

        @Override // p153l.m1l0
        public String key() {
            return "verify_show_count";
        }
    }

    /* JADX INFO: renamed from: l.aq8$f0 */
    public class C15779f0 implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return CoreModule.f18264c.f20294B0.f20489U.get();
        }

        @Override // p153l.m1l0
        public String key() {
            return "pic_verification_success_show_enable";
        }
    }

    /* JADX INFO: renamed from: l.aq8$g */
    public class C15780g implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Integer.valueOf(CoreModule.f18264c.f20364Y0.f161172n);
        }

        @Override // p153l.m1l0
        public String key() {
            return "swipe_session_right";
        }
    }

    /* JADX INFO: renamed from: l.aq8$h */
    public class C15781h implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Boolean.valueOf(PermissionHelper.m81064b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"));
        }

        @Override // p153l.m1l0
        public String key() {
            return "has_local_permission";
        }
    }

    /* JADX INFO: renamed from: l.aq8$i */
    public class C15782i implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Integer.valueOf(CoreModule.f18264c.f20364Y0.f161170l);
        }

        @Override // p153l.m1l0
        public String key() {
            return "swipe_session_count";
        }
    }

    /* JADX INFO: renamed from: l.aq8$j */
    public class C15783j implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Boolean.valueOf(NotificationCheckerCommon.m80403a() == NotificationCheckerCommon.State.opened);
        }

        @Override // p153l.m1l0
        public String key() {
            return "has_notify_permission";
        }
    }

    /* JADX INFO: renamed from: l.aq8$k */
    public class C15784k implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return CoreModule.f18264c.f20381e0.m116600p9() == null ? "" : CoreModule.f18264c.f20381e0.m116600p9().gender.name();
        }

        @Override // p153l.m1l0
        public String key() {
            return "gender";
        }
    }

    /* JADX INFO: renamed from: l.aq8$l */
    public class C15785l implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            return Boolean.valueOf(NullChecker.m82486a(userM116600p9) && !jyb.m147479J(userM116600p9.status) && userM116600p9.status.contains(UserStatus.get("hidden")));
        }

        @Override // p153l.m1l0
        public String key() {
            return "user_hidden";
        }
    }

    /* JADX INFO: renamed from: l.aq8$m */
    public class C15786m implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Boolean.valueOf(CoreModule.f18264c.f20364Y0.f161169k);
        }

        @Override // p153l.m1l0
        public String key() {
            return "is_thin_profile";
        }
    }

    /* JADX INFO: renamed from: l.aq8$n */
    public class C15787n implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Boolean.valueOf(tzi0.m193670h(pzi0.m174454o(), aq8.f72794c.get().longValue(), 4));
        }

        @Override // p153l.m1l0
        public String key() {
            return "allow_location_prompt_in_3_days";
        }
    }

    /* JADX INFO: renamed from: l.aq8$o */
    public class C15788o implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Boolean.TRUE;
        }

        @Override // p153l.m1l0
        public String key() {
            return "is_international";
        }
    }

    /* JADX INFO: renamed from: l.aq8$p */
    public class C15789p implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Boolean.valueOf(CoreBusinessModule.f18258i);
        }

        @Override // p153l.m1l0
        public String key() {
            return "is_yesterday_active";
        }
    }

    /* JADX INFO: renamed from: l.aq8$q */
    public class C15790q implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Integer.valueOf(NullChecker.m82486a(CoreModule.f18264c.f20429u0.m31479t5()) ? CoreModule.f18264c.f20429u0.m31479t5().f20012b : 0);
        }

        @Override // p153l.m1l0
        public String key() {
            return "see_list_count";
        }
    }

    /* JADX INFO: renamed from: l.aq8$r */
    public class C15791r implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Integer.valueOf(aq8.m99431p());
        }

        @Override // p153l.m1l0
        public String key() {
            return "profile_photos_count";
        }
    }

    /* JADX INFO: renamed from: l.aq8$s */
    public class C15792s implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Integer.valueOf(aq8.m99430o());
        }

        @Override // p153l.m1l0
        public String key() {
            return "profile_interests_count";
        }
    }

    /* JADX INFO: renamed from: l.aq8$t */
    public class C15793t implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return Boolean.valueOf(aq8.m99433r());
        }

        @Override // p153l.m1l0
        public String key() {
            return "has_new_match_today";
        }
    }

    /* JADX INFO: renamed from: l.aq8$u */
    public class C15794u implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return aq8.m99429n();
        }

        @Override // p153l.m1l0
        public String key() {
            return "profile_complete_items";
        }
    }

    /* JADX INFO: renamed from: l.aq8$v */
    public class C15795v implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return CoreModule.f18264c.f20364Y0.f161160b.get();
        }

        @Override // p153l.m1l0
        public String key() {
            return "swipe_total_count";
        }
    }

    /* JADX INFO: renamed from: l.aq8$w */
    public class C15796w implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return aq8.m99428m();
        }

        @Override // p153l.m1l0
        public String key() {
            return "id_verification_status";
        }
    }

    /* JADX INFO: renamed from: l.aq8$x */
    public class C15797x implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return CoreModule.f18264c.f20294B0.f20486R.get();
        }

        @Override // p153l.m1l0
        public String key() {
            return "id_verification_success_show_enable";
        }
    }

    /* JADX INFO: renamed from: l.aq8$y */
    public class C15798y implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return CoreModule.f18264c.f20294B0.f20487S.get();
        }

        @Override // p153l.m1l0
        public String key() {
            return "id_verification_fail_show_enable";
        }
    }

    /* JADX INFO: renamed from: l.aq8$z */
    public class C15799z implements m1l0 {
        @Override // p153l.m1l0
        /* JADX INFO: renamed from: a */
        public Object mo99439a() {
            return CoreModule.f18264c.f20364Y0.f161161c.get();
        }

        @Override // p153l.m1l0
        public String key() {
            return "swipe_day_count";
        }
    }

    /* JADX INFO: renamed from: m */
    public static String m99428m() {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && NullChecker.m82486a(verificationCenterM32615k4.idCard)) {
            return verificationCenterM32615k4.idCard.status.toString();
        }
        return CoreModule.f18264c.f20381e0.m116600p9().isIdCardVerified() ? "verified" : "unknown_";
    }

    /* JADX INFO: renamed from: n */
    public static List<String> m99429n() {
        ArrayList arrayList = new ArrayList();
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            if (!jyb.m147479J(userM116600p9.profile.extensions.basic.hobby)) {
                arrayList.add("profile_hobby");
            }
            if (!jyb.m147479J(userM116600p9.profile.extensions.basic.together)) {
                arrayList.add("profile_look_for_someone");
            }
            if (!jyb.m147479J(userM116600p9.profile.extensions.basic.recent)) {
                arrayList.add("profile_recent_location");
            }
            if (!TextUtils.isEmpty(userM116600p9.description)) {
                arrayList.add("profile_about_me");
            }
            if (!TextUtils.isEmpty(userM116600p9.profile.hometown)) {
                arrayList.add("profile_come_from");
            }
            if (!TextUtils.isEmpty(userM116600p9.profile.work.industry)) {
                arrayList.add("profile_industry");
            }
            if (!TextUtils.isEmpty(userM116600p9.profile.work.department)) {
                arrayList.add("profile_job_field");
            }
            if (!TextUtils.isEmpty(userM116600p9.profile.work.company)) {
                arrayList.add("profile_company");
            }
            if (!TextUtils.isEmpty(userM116600p9.profile.studies.school)) {
                arrayList.add("profile_school");
            }
            if (!TextUtils.isEmpty(userM116600p9.profile.studies.major)) {
                arrayList.add("profile_major");
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static int m99430o() {
        Profile profile;
        List<Tag> list;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null || (profile = userM116600p9.profile) == null || (list = profile.tags) == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: p */
    public static int m99431p() {
        List<Media> list;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null || (list = userM116600p9.pictures) == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: q */
    public static int m99432q() {
        return pk50.m172568j().m172574f().m181652P(OmsDialog.p_verification_merge_popup.getIdentifier()).totalShownCount;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m99433r() {
        return f72793b;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m99434s() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null) {
            return false;
        }
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (!userM116600p9.isIdCardVerified()) {
            if (!NullChecker.m82486a(verificationCenterM32615k4) || !NullChecker.m82486a(verificationCenterM32615k4.idCard)) {
                return true;
            }
            if (!TEnum.equals(verificationCenterM32615k4.idCard.status, "pending") && !TEnum.equals(verificationCenterM32615k4.idCard.status, "verified")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m99435t() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null) {
            return false;
        }
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (!userM116600p9.isPicVerificationVerified()) {
            if (!NullChecker.m82486a(verificationCenterM32615k4) || !NullChecker.m82486a(verificationCenterM32615k4.picVerificationInfo)) {
                return true;
            }
            if (!TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending") && !TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m99436u() {
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        return counterM32487o3 != null && counterM32487o3.likersLimit.remaining > 0;
    }

    /* JADX INFO: renamed from: v */
    public static void m99437v() {
        f72792a = null;
        uqb0.f180403i0.m218286e(new C15784k(), new C15795v(), new C15799z(), new C15769a0(), new C15771b0(), new C15773c0(), new C15775d0(), new C15777e0(), new C15779f0(), new C15768a(), new C15770b(), new C15772c(), new C15774d(), new C15776e(), new C15778f(), new C15780g(), new C15781h(), new C15782i(), new C15783j(), new C15785l(), new C15786m(), new C15787n(), new C15788o(), new C15789p(), new C15790q(), new C15791r(), new C15792s(), new C15793t(), new C15794u(), new C15796w(), new C15797x(), new C15798y());
    }

    /* JADX INFO: renamed from: w */
    public static void m99438w() {
        if (f72792a == null) {
            f72792a = new ArrayList<>();
            Set<String> setM30343g = ABManager.m30343g();
            if (NullChecker.m82486a(setM30343g)) {
                for (String str : setM30343g) {
                    if (str != null) {
                        f72792a.add(str + ":" + ABManager.m30348i0(str));
                    }
                }
            }
        }
    }
}
