package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class oa3 {
    /* JADX INFO: renamed from: a */
    public static bkj0<String, String, String> m166819a(boolean z) {
        return z ? bkj0.m104818a("e_bubble_boost_start_see_page_tips", "p_see_who_likes_me_view", "see_page") : bkj0.m104818a("e_bubble_boost_start_main_page_tips", "p_suggest_users_home_view", "swipe_page");
    }

    /* JADX INFO: renamed from: b */
    public static void m166820b(Act act, Class<?> cls) {
        if (NullChecker.m82486a(act) && NullChecker.m82486a(App.f16087d) && NullChecker.m82486a(cls)) {
            if (act.isFinishing() || act.lifecycle_() == C4470c.f16271m || act.lifecycle_() == C4470c.f16273o) {
                CrashHelper.m82479c(new Exception("error show superBoostDialog activity is " + act.getClass().getName() + " isfinished lifecycle_ is" + act.lifecycle_().f16276c + " isFinishing = " + act.isFinishing() + " proxy name is " + cls.getName()));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m166821c(Act act) {
        yho.m215977d(false, !CoreModule.m30933P().m143405a().mo34576qt());
    }

    /* JADX INFO: renamed from: d */
    public static void m166822d(boolean z) {
        if (z) {
            sfj0.m185596c("e_boost_button", "p_see_who_likes_me_view", sfj0.C20032a.m185616i("is_privileged", !CoreModule.m30933P().m143405a().mo34576qt()));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m166823e(boolean z) {
        bkj0<String, String, String> bkj0VarM166819a = m166819a(z);
        i4g0.m138523u(bkj0VarM166819a.f77081a, bkj0VarM166819a.f77082b, jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "bubble"), jyb.m147494Y("tooltips_type_ui", "bubble_basic_double_edge"), jyb.m147494Y("tooltips_trigger_module", "boost_button"), jyb.m147494Y("tooltips_trigger_page", bkj0VarM166819a.f77083c), jyb.m147494Y("tooltips_trigger_reason", "tips"));
    }

    /* JADX INFO: renamed from: f */
    public static void m166824f(boolean z) {
        bkj0<String, String, String> bkj0VarM166819a = m166819a(z);
        i4g0.m138492A(bkj0VarM166819a.f77081a, bkj0VarM166819a.f77082b, jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "bubble"), jyb.m147494Y("tooltips_type_ui", "bubble_basic_double_edge"), jyb.m147494Y("tooltips_trigger_module", "boost_button"), jyb.m147494Y("tooltips_trigger_page", bkj0VarM166819a.f77083c), jyb.m147494Y("tooltips_trigger_reason", "tips"));
    }
}
