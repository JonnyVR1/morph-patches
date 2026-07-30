package p153l;

import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes12.dex */
public class esc0 {

    /* JADX INFO: renamed from: a */
    public static String f95585a = "marry_model_red_dot";

    /* JADX INFO: renamed from: b */
    public static String f95586b = "tab_identify_red_dot";

    /* JADX INFO: renamed from: c */
    public static String f95587c = "slide_view_red_dot";

    /* JADX INFO: renamed from: d */
    public static String f95588d = "slide_feedback_red_dot";

    /* JADX INFO: renamed from: e */
    public static String f95589e = "tab_pic_verification_red_dot";

    /* JADX INFO: renamed from: f */
    public static String f95590f = "tab_pic_verification_red_dot_only_verification";

    /* JADX INFO: renamed from: g */
    public static String f95591g = "tab_pic_verification_red_dot_swipe_limit";

    /* JADX INFO: renamed from: a */
    public static void m122314a(String str) {
        m122317d(str).clear();
        m122315b(str).clear();
    }

    /* JADX INFO: renamed from: b */
    public static vxd0 m122315b(String str) {
        return new vxd0("red_dot_opt_mv_count_" + CoreModule.m30929H().userId() + "_" + str, 0);
    }

    /* JADX INFO: renamed from: c */
    public static int m122316c(String str) {
        if (pzi0.m174439D(m122317d(str).get().longValue())) {
            return m122315b(str).get().intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static byd0 m122317d(String str) {
        return new byd0("red_dot_opt_mv_time_" + CoreModule.m30929H().userId() + "_" + str, 0L);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m122318e(String str) {
        return true;
    }
}
