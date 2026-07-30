package p149l;

import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes10.dex */
public class xjc0 {

    /* JADX INFO: renamed from: a */
    public static String f193198a = "marry_model_red_dot";

    /* JADX INFO: renamed from: b */
    public static String f193199b = "tab_identify_red_dot";

    /* JADX INFO: renamed from: c */
    public static String f193200c = "slide_view_red_dot";

    /* JADX INFO: renamed from: d */
    public static String f193201d = "slide_feedback_red_dot";

    /* JADX INFO: renamed from: e */
    public static String f193202e = "tab_pic_verification_red_dot";

    /* JADX INFO: renamed from: f */
    public static String f193203f = "tab_pic_verification_red_dot_only_verification";

    /* JADX INFO: renamed from: g */
    public static String f193204g = "tab_pic_verification_red_dot_swipe_limit";

    /* JADX INFO: renamed from: a */
    public static void m209686a(String str) {
        m209689d(str).clear();
        m209687b(str).clear();
    }

    /* JADX INFO: renamed from: b */
    public static tpd0 m209687b(String str) {
        return new tpd0("red_dot_opt_mv_count_" + CoreModule.m29931H().userId() + "_" + str, 0);
    }

    /* JADX INFO: renamed from: c */
    public static int m209688c(String str) {
        if (mqi0.m155929D(m209689d(str).get().longValue())) {
            return m209687b(str).get().intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static zpd0 m209689d(String str) {
        return new zpd0("red_dot_opt_mv_time_" + CoreModule.m29931H().userId() + "_" + str, 0L);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m209690e(String str) {
        return true;
    }
}
