package p153l;

import com.p051p1.mobile.android.app.Dialog;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class l3h {

    /* JADX INFO: renamed from: a */
    public static String f129875a = "post_button";

    /* JADX INFO: renamed from: b */
    public static String f129876b = "vote_button";

    /* JADX INFO: renamed from: c */
    public static String f129877c = "comment_button";

    /* JADX INFO: renamed from: d */
    public static l4g0 f129878d = new l4g0("p_binding_phone_number_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: a */
    public static void m152703a() {
        f129878d.m152776k();
        f129878d.m152775j();
    }

    /* JADX INFO: renamed from: b */
    public static void m152704b(String str, String str2, String str3) {
        f129878d.m152780o(pk50.m172568j().m172574f().m181657U("p_binding_phone_number_popup_view", m152705c(jyb.m147494Y("skipable", str), jyb.m147494Y("number_type", str2), jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "alert_special"), jyb.m147494Y("tooltips_trigger_module", "privacy_settings"), jyb.m147494Y("tooltips_trigger_page", "swipe_page"), jyb.m147494Y("tooltips_trigger_reason", str3))));
        f129878d.m152774i();
        f129878d.m152777l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static JSONObject m152705c(pf60... pf60VarArr) {
        JSONObject jSONObject = null;
        if (NullChecker.m82486a(pf60VarArr) && pf60VarArr.length > 0) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    for (pf60 pf60Var : pf60VarArr) {
                        jSONObject2.put((String) pf60Var.f152156a, pf60Var.f152157b);
                    }
                    return jSONObject2;
                } catch (JSONException e) {
                    e = e;
                    jSONObject = jSONObject2;
                    CrashHelper.m82479c(e);
                    wu80.m207938b(e);
                    return jSONObject;
                }
            } catch (JSONException e2) {
                e = e2;
            }
        }
        return jSONObject;
    }
}
