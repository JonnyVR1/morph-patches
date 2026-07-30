package p009l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.oms.OmsDialog;
import com.p000p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import l.gsk0;
import l.qib0;
import l.qqi0;
import l.vwb;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vo8 {

    /* JADX INFO: renamed from: a */
    public static ArrayList<String> f21705a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f21706b = false;

    /* JADX INFO: renamed from: c */
    @SuppressLint({"SV_USE_DUP_ID"})
    public static zpd0 f21707c = new zpd0("lost_location_notify_dlg", 0L);

    /* JADX INFO: renamed from: l.vo8$a */
    public class C1241a implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23515a() {
            vo8.m23514w();
            return vo8.f21705a;
        }

        public String key() {
            return "ab_groups";
        }
    }

    /* JADX INFO: renamed from: l.vo8$a0 */
    public class C1242a0 implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23516a() {
            return Integer.valueOf(CoreModule.c.Y0.u);
        }

        public String key() {
            return "swipe_verify_day_continue_right";
        }
    }

    /* JADX INFO: renamed from: l.vo8$b */
    public class C1243b implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23517a() {
            return Boolean.valueOf(vo8.m23510s());
        }

        public String key() {
            return "need_avatar_verification";
        }
    }

    /* JADX INFO: renamed from: l.vo8$b0 */
    public class C1244b0 implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23518a() {
            return Integer.valueOf(CoreModule.c.Y0.v);
        }

        public String key() {
            return "swipe_verify_day_continue_left";
        }
    }

    /* JADX INFO: renamed from: l.vo8$c */
    public class C1245c implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23519a() {
            return Boolean.valueOf(vo8.m23511t());
        }

        public String key() {
            return "need_pic_verification";
        }
    }

    /* JADX INFO: renamed from: l.vo8$c0 */
    public class C1246c0 implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23520a() {
            return Boolean.valueOf(CoreModule.c.Y0.a());
        }

        public String key() {
            return "match_success";
        }
    }

    /* JADX INFO: renamed from: l.vo8$d */
    public class C1247d implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23521a() {
            return Integer.valueOf(CoreModule.c.Y0.t);
        }

        public String key() {
            return "swipe_session_continue_right_nomatch";
        }
    }

    /* JADX INFO: renamed from: l.vo8$d0 */
    public class C1248d0 implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23522a() {
            VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
            return verificationCenterK4 == null ? StudentVerificationStatus.get("unknown_").name() : verificationCenterK4.picVerificationInfo.status.name();
        }

        public String key() {
            return "pic_verification_status";
        }
    }

    /* JADX INFO: renamed from: l.vo8$e */
    public class C1249e implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23523a() {
            return Boolean.valueOf(vo8.m23512u());
        }

        public String key() {
            return "privilege_see";
        }
    }

    /* JADX INFO: renamed from: l.vo8$e0 */
    public class C1250e0 implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23524a() {
            return CoreModule.c.B0.V.get();
        }

        public String key() {
            return "pic_verification_fail_show_enable";
        }
    }

    /* JADX INFO: renamed from: l.vo8$f */
    public class C1251f implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23525a() {
            return Integer.valueOf(vo8.m23508q());
        }

        public String key() {
            return "verify_show_count";
        }
    }

    /* JADX INFO: renamed from: l.vo8$f0 */
    public class C1252f0 implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23526a() {
            return CoreModule.c.B0.U.get();
        }

        public String key() {
            return "pic_verification_success_show_enable";
        }
    }

    /* JADX INFO: renamed from: l.vo8$g */
    public class C1253g implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23527a() {
            return Integer.valueOf(CoreModule.c.Y0.n);
        }

        public String key() {
            return "swipe_session_right";
        }
    }

    /* JADX INFO: renamed from: l.vo8$h */
    public class C1254h implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23528a() {
            return Boolean.valueOf(PermissionHelper.m10210b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"));
        }

        public String key() {
            return "has_local_permission";
        }
    }

    /* JADX INFO: renamed from: l.vo8$i */
    public class C1255i implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23529a() {
            return Integer.valueOf(CoreModule.c.Y0.l);
        }

        public String key() {
            return "swipe_session_count";
        }
    }

    /* JADX INFO: renamed from: l.vo8$j */
    public class C1256j implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23530a() {
            return Boolean.valueOf(NotificationCheckerCommon.m9539a() == NotificationCheckerCommon.State.opened);
        }

        public String key() {
            return "has_notify_permission";
        }
    }

    /* JADX INFO: renamed from: l.vo8$k */
    public class C1257k implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23531a() {
            return CoreModule.c.e0.p9() == null ? "" : CoreModule.c.e0.p9().gender.name();
        }

        public String key() {
            return "gender";
        }
    }

    /* JADX INFO: renamed from: l.vo8$l */
    public class C1258l implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23532a() {
            User userP9 = CoreModule.c.e0.p9();
            return Boolean.valueOf(NullChecker.a(userP9) && !vwb.J(userP9.status) && userP9.status.contains(UserStatus.get("hidden")));
        }

        public String key() {
            return "user_hidden";
        }
    }

    /* JADX INFO: renamed from: l.vo8$m */
    public class C1259m implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23533a() {
            return Boolean.valueOf(CoreModule.c.Y0.k);
        }

        public String key() {
            return "is_thin_profile";
        }
    }

    /* JADX INFO: renamed from: l.vo8$n */
    public class C1260n implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23534a() {
            return Boolean.valueOf(qqi0.h(mqi0.m18550o(), ((Long) vo8.f21707c.get()).longValue(), 4));
        }

        public String key() {
            return "allow_location_prompt_in_3_days";
        }
    }

    /* JADX INFO: renamed from: l.vo8$o */
    public class C1261o implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23535a() {
            return Boolean.TRUE;
        }

        public String key() {
            return "is_international";
        }
    }

    /* JADX INFO: renamed from: l.vo8$p */
    public class C1262p implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23536a() {
            return Boolean.valueOf(CoreBusinessModule.i);
        }

        public String key() {
            return "is_yesterday_active";
        }
    }

    /* JADX INFO: renamed from: l.vo8$q */
    public class C1263q implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23537a() {
            return Integer.valueOf(NullChecker.a(CoreModule.c.u0.r5()) ? CoreModule.c.u0.r5().b : 0);
        }

        public String key() {
            return "see_list_count";
        }
    }

    /* JADX INFO: renamed from: l.vo8$r */
    public class C1264r implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23538a() {
            return Integer.valueOf(vo8.m23507p());
        }

        public String key() {
            return "profile_photos_count";
        }
    }

    /* JADX INFO: renamed from: l.vo8$s */
    public class C1265s implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23539a() {
            return Integer.valueOf(vo8.m23506o());
        }

        public String key() {
            return "profile_interests_count";
        }
    }

    /* JADX INFO: renamed from: l.vo8$t */
    public class C1266t implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23540a() {
            return Boolean.valueOf(vo8.m23509r());
        }

        public String key() {
            return "has_new_match_today";
        }
    }

    /* JADX INFO: renamed from: l.vo8$u */
    public class C1267u implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23541a() {
            return vo8.m23505n();
        }

        public String key() {
            return "profile_complete_items";
        }
    }

    /* JADX INFO: renamed from: l.vo8$v */
    public class C1268v implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23542a() {
            return CoreModule.c.Y0.b.get();
        }

        public String key() {
            return "swipe_total_count";
        }
    }

    /* JADX INFO: renamed from: l.vo8$w */
    public class C1269w implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23543a() {
            return vo8.m23504m();
        }

        public String key() {
            return "id_verification_status";
        }
    }

    /* JADX INFO: renamed from: l.vo8$x */
    public class C1270x implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23544a() {
            return CoreModule.c.B0.R.get();
        }

        public String key() {
            return "id_verification_success_show_enable";
        }
    }

    /* JADX INFO: renamed from: l.vo8$y */
    public class C1271y implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23545a() {
            return CoreModule.c.B0.S.get();
        }

        public String key() {
            return "id_verification_fail_show_enable";
        }
    }

    /* JADX INFO: renamed from: l.vo8$z */
    public class C1272z implements gsk0 {
        /* JADX INFO: renamed from: a */
        public Object m23546a() {
            return CoreModule.c.Y0.c.get();
        }

        public String key() {
            return "swipe_day_count";
        }
    }

    /* JADX INFO: renamed from: m */
    public static String m23504m() {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4) && NullChecker.a(verificationCenterK4.idCard)) {
            return verificationCenterK4.idCard.status.toString();
        }
        return CoreModule.c.e0.p9().isIdCardVerified() ? "verified" : "unknown_";
    }

    /* JADX INFO: renamed from: n */
    public static List<String> m23505n() {
        ArrayList arrayList = new ArrayList();
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            if (!vwb.J(userP9.profile.extensions.basic.hobby)) {
                arrayList.add("profile_hobby");
            }
            if (!vwb.J(userP9.profile.extensions.basic.together)) {
                arrayList.add("profile_look_for_someone");
            }
            if (!vwb.J(userP9.profile.extensions.basic.recent)) {
                arrayList.add("profile_recent_location");
            }
            if (!TextUtils.isEmpty(userP9.description)) {
                arrayList.add("profile_about_me");
            }
            if (!TextUtils.isEmpty(userP9.profile.hometown)) {
                arrayList.add("profile_come_from");
            }
            if (!TextUtils.isEmpty(userP9.profile.work.industry)) {
                arrayList.add("profile_industry");
            }
            if (!TextUtils.isEmpty(userP9.profile.work.department)) {
                arrayList.add("profile_job_field");
            }
            if (!TextUtils.isEmpty(userP9.profile.work.company)) {
                arrayList.add("profile_company");
            }
            if (!TextUtils.isEmpty(userP9.profile.studies.school)) {
                arrayList.add("profile_school");
            }
            if (!TextUtils.isEmpty(userP9.profile.studies.major)) {
                arrayList.add("profile_major");
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static int m23506o() {
        Profile profile;
        List list;
        User userP9 = CoreModule.c.e0.p9();
        if (userP9 == null || (profile = userP9.profile) == null || (list = profile.tags) == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: p */
    public static int m23507p() {
        List list;
        User userP9 = CoreModule.c.e0.p9();
        if (userP9 == null || (list = userP9.pictures) == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: q */
    public static int m23508q() {
        return ic50.m16316j().m16322f().m17395P(OmsDialog.p_verification_merge_popup.getIdentifier()).totalShownCount;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m23509r() {
        return f21706b;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m23510s() {
        User userP9 = CoreModule.c.e0.p9();
        if (userP9 == null) {
            return false;
        }
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (!userP9.isIdCardVerified()) {
            if (!NullChecker.a(verificationCenterK4) || !NullChecker.a(verificationCenterK4.idCard)) {
                return true;
            }
            if (!TEnum.equals(verificationCenterK4.idCard.status, "pending") && !TEnum.equals(verificationCenterK4.idCard.status, "verified")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m23511t() {
        User userP9 = CoreModule.c.e0.p9();
        if (userP9 == null) {
            return false;
        }
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (!userP9.isPicVerificationVerified()) {
            if (!NullChecker.a(verificationCenterK4) || !NullChecker.a(verificationCenterK4.picVerificationInfo)) {
                return true;
            }
            if (!TEnum.equals(verificationCenterK4.picVerificationInfo.status, "pending") && !TEnum.equals(verificationCenterK4.picVerificationInfo.status, "verified")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m23512u() {
        Counter counterO3 = CoreModule.c.o3();
        return counterO3 != null && counterO3.likersLimit.remaining > 0;
    }

    /* JADX INFO: renamed from: v */
    public static void m23513v() {
        f21705a = null;
        qib0.i0.e(new gsk0[]{new C1257k(), new C1268v(), new C1272z(), new C1242a0(), new C1244b0(), new C1246c0(), new C1248d0(), new C1250e0(), new C1252f0(), new C1241a(), new C1243b(), new C1245c(), new C1247d(), new C1249e(), new C1251f(), new C1253g(), new C1254h(), new C1255i(), new C1256j(), new C1258l(), new C1259m(), new C1260n(), new C1261o(), new C1262p(), new C1263q(), new C1264r(), new C1265s(), new C1266t(), new C1267u(), new C1269w(), new C1270x(), new C1271y()});
    }

    /* JADX INFO: renamed from: w */
    public static void m23514w() {
        if (f21705a == null) {
            f21705a = new ArrayList<>();
            Set<String> setG = ABManager.g();
            if (NullChecker.a(setG)) {
                for (String str : setG) {
                    if (str != null) {
                        f21705a.add(str + ":" + ABManager.i0(str));
                    }
                }
            }
        }
    }
}
