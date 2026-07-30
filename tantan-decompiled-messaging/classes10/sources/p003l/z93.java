package p003l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.vwb;
import l.xaj0;
import l.yfo;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z93 {
    /* JADX INFO: renamed from: a */
    public static xaj0<String, String, String> m11373a(boolean z) {
        return z ? xaj0.a("e_bubble_boost_start_see_page_tips", "p_see_who_likes_me_view", "see_page") : xaj0.a("e_bubble_boost_start_main_page_tips", "p_suggest_users_home_view", "swipe_page");
    }

    /* JADX INFO: renamed from: b */
    public static void m11374b(Act act, Class<?> cls) {
        if (NullChecker.a(act) && NullChecker.a(App.d) && NullChecker.a(cls)) {
            if (act.isFinishing() || act.lifecycle_() == c.m || act.lifecycle_() == c.o) {
                CrashHelper.c(new Exception("error show superBoostDialog activity is " + act.getClass().getName() + " isfinished lifecycle_ is" + act.lifecycle_().c + " isFinishing = " + act.isFinishing() + " proxy name is " + cls.getName()));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m11375c(Act act) {
        yfo.d(false, !CoreModule.P().a().qt());
    }

    /* JADX INFO: renamed from: d */
    public static void m11376d(boolean z) {
        if (z) {
            o6j0.m8403c("e_boost_button", "p_see_who_likes_me_view", o6j0.C3390a.m8423i("is_privileged", !CoreModule.P().a().qt()));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m11377e(boolean z) {
        xaj0<String, String, String> xaj0VarM11373a = m11373a(z);
        zvf0.u((String) xaj0VarM11373a.a, (String) xaj0VarM11373a.b, new j760[]{vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "bubble"), vwb.Y("tooltips_type_ui", "bubble_basic_double_edge"), vwb.Y("tooltips_trigger_module", "boost_button"), vwb.Y("tooltips_trigger_page", (String) xaj0VarM11373a.c), vwb.Y("tooltips_trigger_reason", "tips")});
    }

    /* JADX INFO: renamed from: f */
    public static void m11378f(boolean z) {
        xaj0<String, String, String> xaj0VarM11373a = m11373a(z);
        zvf0.A((String) xaj0VarM11373a.a, (String) xaj0VarM11373a.b, new j760[]{vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "bubble"), vwb.Y("tooltips_type_ui", "bubble_basic_double_edge"), vwb.Y("tooltips_trigger_module", "boost_button"), vwb.Y("tooltips_trigger_page", (String) xaj0VarM11373a.c), vwb.Y("tooltips_trigger_reason", "tips")});
    }
}
