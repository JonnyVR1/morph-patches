package p003l;

import com.p1.mobile.putong.core.CoreModule;
import l.mqi0;
import l.tpd0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xjc0 {

    /* JADX INFO: renamed from: a */
    public static String f8495a = "marry_model_red_dot";

    /* JADX INFO: renamed from: b */
    public static String f8496b = "tab_identify_red_dot";

    /* JADX INFO: renamed from: c */
    public static String f8497c = "slide_view_red_dot";

    /* JADX INFO: renamed from: d */
    public static String f8498d = "slide_feedback_red_dot";

    /* JADX INFO: renamed from: e */
    public static String f8499e = "tab_pic_verification_red_dot";

    /* JADX INFO: renamed from: f */
    public static String f8500f = "tab_pic_verification_red_dot_only_verification";

    /* JADX INFO: renamed from: g */
    public static String f8501g = "tab_pic_verification_red_dot_swipe_limit";

    /* JADX INFO: renamed from: a */
    public static void m10866a(String str) {
        m10869d(str).clear();
        m10867b(str).clear();
    }

    /* JADX INFO: renamed from: b */
    public static tpd0 m10867b(String str) {
        return new tpd0("red_dot_opt_mv_count_" + CoreModule.H().userId() + "_" + str, 0);
    }

    /* JADX INFO: renamed from: c */
    public static int m10868c(String str) {
        if (mqi0.D(((Long) m10869d(str).get()).longValue())) {
            return ((Integer) m10867b(str).get()).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static zpd0 m10869d(String str) {
        return new zpd0("red_dot_opt_mv_time_" + CoreModule.H().userId() + "_" + str, 0L);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m10870e(String str) {
        return true;
    }
}
