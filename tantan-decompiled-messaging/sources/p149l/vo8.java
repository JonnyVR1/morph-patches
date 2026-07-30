package p149l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class vo8 {

    /* JADX INFO: renamed from: a */
    public static ArrayList<String> f182371a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f182372b = false;

    /* JADX INFO: renamed from: c */
    @SuppressLint({"SV_USE_DUP_ID"})
    public static zpd0 f182373c = new zpd0("lost_location_notify_dlg", 0L);

    /* JADX INFO: renamed from: l.vo8$a */
    public class C20677a implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            vo8.m199157w();
            return vo8.f182371a;
        }

        @Override // p149l.gsk0
        public String key() {
            return "ab_groups";
        }
    }

    /* JADX INFO: renamed from: l.vo8$a0 */
    public class C20678a0 implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Integer.valueOf(CoreModule.f17545c.f19622Y0.f94276u);
        }

        @Override // p149l.gsk0
        public String key() {
            return "swipe_verify_day_continue_right";
        }
    }

    /* JADX INFO: renamed from: l.vo8$b */
    public class C20679b implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Boolean.valueOf(vo8.m199153s());
        }

        @Override // p149l.gsk0
        public String key() {
            return "need_avatar_verification";
        }
    }

    /* JADX INFO: renamed from: l.vo8$b0 */
    public class C20680b0 implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Integer.valueOf(CoreModule.f17545c.f19622Y0.f94277v);
        }

        @Override // p149l.gsk0
        public String key() {
            return "swipe_verify_day_continue_left";
        }
    }

    /* JADX INFO: renamed from: l.vo8$c */
    public class C20681c implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Boolean.valueOf(vo8.m199154t());
        }

        @Override // p149l.gsk0
        public String key() {
            return "need_pic_verification";
        }
    }

    /* JADX INFO: renamed from: l.vo8$c0 */
    public class C20682c0 implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Boolean.valueOf(CoreModule.f17545c.f19622Y0.m119251a());
        }

        @Override // p149l.gsk0
        public String key() {
            return "match_success";
        }
    }

    /* JADX INFO: renamed from: l.vo8$d */
    public class C20683d implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Integer.valueOf(CoreModule.f17545c.f19622Y0.f94275t);
        }

        @Override // p149l.gsk0
        public String key() {
            return "swipe_session_continue_right_nomatch";
        }
    }

    /* JADX INFO: renamed from: l.vo8$d0 */
    public class C20684d0 implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
            return verificationCenterM31612k4 == null ? StudentVerificationStatus.get("unknown_").name() : verificationCenterM31612k4.picVerificationInfo.status.name();
        }

        @Override // p149l.gsk0
        public String key() {
            return "pic_verification_status";
        }
    }

    /* JADX INFO: renamed from: l.vo8$e */
    public class C20685e implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Boolean.valueOf(vo8.m199155u());
        }

        @Override // p149l.gsk0
        public String key() {
            return "privilege_see";
        }
    }

    /* JADX INFO: renamed from: l.vo8$e0 */
    public class C20686e0 implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return CoreModule.f17545c.f19552B0.f19748V.get();
        }

        @Override // p149l.gsk0
        public String key() {
            return "pic_verification_fail_show_enable";
        }
    }

    /* JADX INFO: renamed from: l.vo8$f */
    public class C20687f implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Integer.valueOf(vo8.m199151q());
        }

        @Override // p149l.gsk0
        public String key() {
            return "verify_show_count";
        }
    }

    /* JADX INFO: renamed from: l.vo8$f0 */
    public class C20688f0 implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return CoreModule.f17545c.f19552B0.f19747U.get();
        }

        @Override // p149l.gsk0
        public String key() {
            return "pic_verification_success_show_enable";
        }
    }

    /* JADX INFO: renamed from: l.vo8$g */
    public class C20689g implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Integer.valueOf(CoreModule.f17545c.f19622Y0.f94269n);
        }

        @Override // p149l.gsk0
        public String key() {
            return "swipe_session_right";
        }
    }

    /* JADX INFO: renamed from: l.vo8$h */
    public class C20690h implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Boolean.valueOf(PermissionHelper.m79881b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"));
        }

        @Override // p149l.gsk0
        public String key() {
            return "has_local_permission";
        }
    }

    /* JADX INFO: renamed from: l.vo8$i */
    public class C20691i implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Integer.valueOf(CoreModule.f17545c.f19622Y0.f94267l);
        }

        @Override // p149l.gsk0
        public String key() {
            return "swipe_session_count";
        }
    }

    /* JADX INFO: renamed from: l.vo8$j */
    public class C20692j implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Boolean.valueOf(NotificationCheckerCommon.m79220a() == NotificationCheckerCommon.State.opened);
        }

        @Override // p149l.gsk0
        public String key() {
            return "has_notify_permission";
        }
    }

    /* JADX INFO: renamed from: l.vo8$k */
    public class C20693k implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return CoreModule.f17545c.f19639e0.m169527p9() == null ? "" : CoreModule.f17545c.f19639e0.m169527p9().gender.name();
        }

        @Override // p149l.gsk0
        public String key() {
            return "gender";
        }
    }

    /* JADX INFO: renamed from: l.vo8$l */
    public class C20694l implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            return Boolean.valueOf(NullChecker.m81303a(userM169527p9) && !vwb.m200296J(userM169527p9.status) && userM169527p9.status.contains(UserStatus.get("hidden")));
        }

        @Override // p149l.gsk0
        public String key() {
            return "user_hidden";
        }
    }

    /* JADX INFO: renamed from: l.vo8$m */
    public class C20695m implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Boolean.valueOf(CoreModule.f17545c.f19622Y0.f94266k);
        }

        @Override // p149l.gsk0
        public String key() {
            return "is_thin_profile";
        }
    }

    /* JADX INFO: renamed from: l.vo8$n */
    public class C20696n implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Boolean.valueOf(qqi0.m175940h(mqi0.m155944o(), vo8.f182373c.get().longValue(), 4));
        }

        @Override // p149l.gsk0
        public String key() {
            return "allow_location_prompt_in_3_days";
        }
    }

    /* JADX INFO: renamed from: l.vo8$o */
    public class C20697o implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Boolean.TRUE;
        }

        @Override // p149l.gsk0
        public String key() {
            return "is_international";
        }
    }

    /* JADX INFO: renamed from: l.vo8$p */
    public class C20698p implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Boolean.valueOf(CoreBusinessModule.f17539i);
        }

        @Override // p149l.gsk0
        public String key() {
            return "is_yesterday_active";
        }
    }

    /* JADX INFO: renamed from: l.vo8$q */
    public class C20699q implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Integer.valueOf(NullChecker.m81303a(CoreModule.f17545c.f19687u0.m30471r5()) ? CoreModule.f17545c.f19687u0.m30471r5().f19270b : 0);
        }

        @Override // p149l.gsk0
        public String key() {
            return "see_list_count";
        }
    }

    /* JADX INFO: renamed from: l.vo8$r */
    public class C20700r implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Integer.valueOf(vo8.m199150p());
        }

        @Override // p149l.gsk0
        public String key() {
            return "profile_photos_count";
        }
    }

    /* JADX INFO: renamed from: l.vo8$s */
    public class C20701s implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Integer.valueOf(vo8.m199149o());
        }

        @Override // p149l.gsk0
        public String key() {
            return "profile_interests_count";
        }
    }

    /* JADX INFO: renamed from: l.vo8$t */
    public class C20702t implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return Boolean.valueOf(vo8.m199152r());
        }

        @Override // p149l.gsk0
        public String key() {
            return "has_new_match_today";
        }
    }

    /* JADX INFO: renamed from: l.vo8$u */
    public class C20703u implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return vo8.m199148n();
        }

        @Override // p149l.gsk0
        public String key() {
            return "profile_complete_items";
        }
    }

    /* JADX INFO: renamed from: l.vo8$v */
    public class C20704v implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return CoreModule.f17545c.f19622Y0.f94257b.get();
        }

        @Override // p149l.gsk0
        public String key() {
            return "swipe_total_count";
        }
    }

    /* JADX INFO: renamed from: l.vo8$w */
    public class C20705w implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return vo8.m199147m();
        }

        @Override // p149l.gsk0
        public String key() {
            return "id_verification_status";
        }
    }

    /* JADX INFO: renamed from: l.vo8$x */
    public class C20706x implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return CoreModule.f17545c.f19552B0.f19744R.get();
        }

        @Override // p149l.gsk0
        public String key() {
            return "id_verification_success_show_enable";
        }
    }

    /* JADX INFO: renamed from: l.vo8$y */
    public class C20707y implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return CoreModule.f17545c.f19552B0.f19745S.get();
        }

        @Override // p149l.gsk0
        public String key() {
            return "id_verification_fail_show_enable";
        }
    }

    /* JADX INFO: renamed from: l.vo8$z */
    public class C20708z implements gsk0 {
        @Override // p149l.gsk0
        /* JADX INFO: renamed from: a */
        public Object mo127805a() {
            return CoreModule.f17545c.f19622Y0.f94258c.get();
        }

        @Override // p149l.gsk0
        public String key() {
            return "swipe_day_count";
        }
    }

    /* JADX INFO: renamed from: m */
    public static String m199147m() {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && NullChecker.m81303a(verificationCenterM31612k4.idCard)) {
            return verificationCenterM31612k4.idCard.status.toString();
        }
        return CoreModule.f17545c.f19639e0.m169527p9().isIdCardVerified() ? "verified" : "unknown_";
    }

    /* JADX INFO: renamed from: n */
    public static List<String> m199148n() {
        ArrayList arrayList = new ArrayList();
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            if (!vwb.m200296J(userM169527p9.profile.extensions.basic.hobby)) {
                arrayList.add("profile_hobby");
            }
            if (!vwb.m200296J(userM169527p9.profile.extensions.basic.together)) {
                arrayList.add("profile_look_for_someone");
            }
            if (!vwb.m200296J(userM169527p9.profile.extensions.basic.recent)) {
                arrayList.add("profile_recent_location");
            }
            if (!TextUtils.isEmpty(userM169527p9.description)) {
                arrayList.add("profile_about_me");
            }
            if (!TextUtils.isEmpty(userM169527p9.profile.hometown)) {
                arrayList.add("profile_come_from");
            }
            if (!TextUtils.isEmpty(userM169527p9.profile.work.industry)) {
                arrayList.add("profile_industry");
            }
            if (!TextUtils.isEmpty(userM169527p9.profile.work.department)) {
                arrayList.add("profile_job_field");
            }
            if (!TextUtils.isEmpty(userM169527p9.profile.work.company)) {
                arrayList.add("profile_company");
            }
            if (!TextUtils.isEmpty(userM169527p9.profile.studies.school)) {
                arrayList.add("profile_school");
            }
            if (!TextUtils.isEmpty(userM169527p9.profile.studies.major)) {
                arrayList.add("profile_major");
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static int m199149o() {
        Profile profile;
        List<Tag> list;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 == null || (profile = userM169527p9.profile) == null || (list = profile.tags) == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: p */
    public static int m199150p() {
        List<Media> list;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 == null || (list = userM169527p9.pictures) == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: q */
    public static int m199151q() {
        return ic50.m135327j().m135333f().m145229P(OmsDialog.p_verification_merge_popup.getIdentifier()).totalShownCount;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m199152r() {
        return f182372b;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m199153s() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 == null) {
            return false;
        }
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (!userM169527p9.isIdCardVerified()) {
            if (!NullChecker.m81303a(verificationCenterM31612k4) || !NullChecker.m81303a(verificationCenterM31612k4.idCard)) {
                return true;
            }
            if (!TEnum.equals(verificationCenterM31612k4.idCard.status, "pending") && !TEnum.equals(verificationCenterM31612k4.idCard.status, "verified")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m199154t() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 == null) {
            return false;
        }
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (!userM169527p9.isPicVerificationVerified()) {
            if (!NullChecker.m81303a(verificationCenterM31612k4) || !NullChecker.m81303a(verificationCenterM31612k4.picVerificationInfo)) {
                return true;
            }
            if (!TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending") && !TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m199155u() {
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        return counterM31484o3 != null && counterM31484o3.likersLimit.remaining > 0;
    }

    /* JADX INFO: renamed from: v */
    public static void m199156v() {
        f182371a = null;
        qib0.f154720i0.m196497e(new C20693k(), new C20704v(), new C20708z(), new C20678a0(), new C20680b0(), new C20682c0(), new C20684d0(), new C20686e0(), new C20688f0(), new C20677a(), new C20679b(), new C20681c(), new C20683d(), new C20685e(), new C20687f(), new C20689g(), new C20690h(), new C20691i(), new C20692j(), new C20694l(), new C20695m(), new C20696n(), new C20697o(), new C20698p(), new C20699q(), new C20700r(), new C20701s(), new C20702t(), new C20703u(), new C20705w(), new C20706x(), new C20707y());
    }

    /* JADX INFO: renamed from: w */
    public static void m199157w() {
        if (f182371a == null) {
            f182371a = new ArrayList<>();
            Set<String> setM29345g = ABManager.m29345g();
            if (NullChecker.m81303a(setM29345g)) {
                for (String str : setM29345g) {
                    if (str != null) {
                        f182371a.add(str + ":" + ABManager.m29350i0(str));
                    }
                }
            }
        }
    }
}
