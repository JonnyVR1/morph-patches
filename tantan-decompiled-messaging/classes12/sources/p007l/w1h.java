package p007l;

import com.p1.mobile.android.app.Dialog;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.ic50;
import l.j760;
import l.sm80;
import l.vwb;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class w1h {

    /* JADX INFO: renamed from: a */
    public static String f14361a = "post_button";

    /* JADX INFO: renamed from: b */
    public static String f14362b = "vote_button";

    /* JADX INFO: renamed from: c */
    public static String f14363c = "comment_button";

    /* JADX INFO: renamed from: d */
    public static cwf0 f14364d = new cwf0("p_binding_phone_number_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: a */
    public static void m15670a() {
        f14364d.k();
        f14364d.j();
    }

    /* JADX INFO: renamed from: b */
    public static void m15671b(String str, String str2, String str3) {
        f14364d.o(ic50.j().f().U("p_binding_phone_number_popup_view", m15672c(vwb.Y("skipable", str), vwb.Y("number_type", str2), vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "alert_special"), vwb.Y("tooltips_trigger_module", "privacy_settings"), vwb.Y("tooltips_trigger_page", "swipe_page"), vwb.Y("tooltips_trigger_reason", str3))));
        f14364d.i();
        f14364d.l();
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m15672c(j760... j760VarArr) {
        JSONObject jSONObject = null;
        if (NullChecker.a(j760VarArr) && j760VarArr.length > 0) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    for (j760 j760Var : j760VarArr) {
                        jSONObject2.put((String) j760Var.a, j760Var.b);
                    }
                    return jSONObject2;
                } catch (JSONException e) {
                    e = e;
                    jSONObject = jSONObject2;
                    CrashHelper.c(e);
                    sm80.b(e);
                    return jSONObject;
                }
            } catch (JSONException e2) {
                e = e2;
            }
        }
        return jSONObject;
    }
}
