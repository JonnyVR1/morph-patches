package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class z93 {
    /* JADX INFO: renamed from: a */
    public static xaj0<String, String, String> m217658a(boolean z) {
        return z ? xaj0.m207578a("e_bubble_boost_start_see_page_tips", "p_see_who_likes_me_view", "see_page") : xaj0.m207578a("e_bubble_boost_start_main_page_tips", "p_suggest_users_home_view", "swipe_page");
    }

    /* JADX INFO: renamed from: b */
    public static void m217659b(Act act, Class<?> cls) {
        if (NullChecker.m81303a(act) && NullChecker.m81303a(App.f15368d) && NullChecker.m81303a(cls)) {
            if (act.isFinishing() || act.lifecycle_() == C4319c.f15552m || act.lifecycle_() == C4319c.f15554o) {
                CrashHelper.m81296c(new Exception("error show superBoostDialog activity is " + act.getClass().getName() + " isfinished lifecycle_ is" + act.lifecycle_().f15557c + " isFinishing = " + act.isFinishing() + " proxy name is " + cls.getName()));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m217660c(Act act) {
        yfo.m214565d(false, !CoreModule.m29935P().m94651a().mo33573qt());
    }

    /* JADX INFO: renamed from: d */
    public static void m217661d(boolean z) {
        if (z) {
            o6j0.m162859c("e_boost_button", "p_see_who_likes_me_view", o6j0.C18854a.m162879i("is_privileged", !CoreModule.m29935P().m94651a().mo33573qt()));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m217662e(boolean z) {
        xaj0<String, String, String> xaj0VarM217658a = m217658a(z);
        zvf0.m220399u(xaj0VarM217658a.f191751a, xaj0VarM217658a.f191752b, vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "bubble"), vwb.m200311Y("tooltips_type_ui", "bubble_basic_double_edge"), vwb.m200311Y("tooltips_trigger_module", "boost_button"), vwb.m200311Y("tooltips_trigger_page", xaj0VarM217658a.f191753c), vwb.m200311Y("tooltips_trigger_reason", "tips"));
    }

    /* JADX INFO: renamed from: f */
    public static void m217663f(boolean z) {
        xaj0<String, String, String> xaj0VarM217658a = m217658a(z);
        zvf0.m220368A(xaj0VarM217658a.f191751a, xaj0VarM217658a.f191752b, vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "bubble"), vwb.m200311Y("tooltips_type_ui", "bubble_basic_double_edge"), vwb.m200311Y("tooltips_trigger_module", "boost_button"), vwb.m200311Y("tooltips_trigger_page", xaj0VarM217658a.f191753c), vwb.m200311Y("tooltips_trigger_reason", "tips"));
    }
}
