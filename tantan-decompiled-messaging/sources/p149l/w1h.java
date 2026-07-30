package p149l;

import com.p046p1.mobile.android.app.Dialog;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class w1h {

    /* JADX INFO: renamed from: a */
    public static String f184003a = "post_button";

    /* JADX INFO: renamed from: b */
    public static String f184004b = "vote_button";

    /* JADX INFO: renamed from: c */
    public static String f184005c = "comment_button";

    /* JADX INFO: renamed from: d */
    public static cwf0 f184006d = new cwf0("p_binding_phone_number_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: a */
    public static void m200929a() {
        f184006d.m109035k();
        f184006d.m109034j();
    }

    /* JADX INFO: renamed from: b */
    public static void m200930b(String str, String str2, String str3) {
        f184006d.m109039o(ic50.m135327j().m135333f().m145234U("p_binding_phone_number_popup_view", m200931c(vwb.m200311Y("skipable", str), vwb.m200311Y("number_type", str2), vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "alert_special"), vwb.m200311Y("tooltips_trigger_module", "privacy_settings"), vwb.m200311Y("tooltips_trigger_page", "swipe_page"), vwb.m200311Y("tooltips_trigger_reason", str3))));
        f184006d.m109033i();
        f184006d.m109036l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static JSONObject m200931c(j760... j760VarArr) {
        JSONObject jSONObject = null;
        if (NullChecker.m81303a(j760VarArr) && j760VarArr.length > 0) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    for (j760 j760Var : j760VarArr) {
                        jSONObject2.put((String) j760Var.f116564a, j760Var.f116565b);
                    }
                    return jSONObject2;
                } catch (JSONException e) {
                    e = e;
                    jSONObject = jSONObject2;
                    CrashHelper.m81296c(e);
                    sm80.m184942b(e);
                    return jSONObject;
                }
            } catch (JSONException e2) {
                e = e2;
            }
        }
        return jSONObject;
    }
}
