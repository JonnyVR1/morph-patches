package p009l;

import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class u4e {
    /* JADX INFO: renamed from: a */
    public static void m22744a(JSONObject jSONObject, String str, String str2, String str3, String str4, String str5, String str6) throws JSONException {
        jSONObject.put("tooltips_trigger_mode", str);
        jSONObject.put("tooltips_type", str2);
        jSONObject.put("tooltips_type_ui", str3);
        jSONObject.put("tooltips_trigger_module", str4);
        jSONObject.put("tooltips_trigger_page", str5);
        jSONObject.put("tooltips_trigger_reason", str6);
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m22745b(String str, String str2, String str3, String str4, String str5, String str6) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", str);
            jSONObject.put("tooltips_type", str2);
            jSONObject.put("tooltips_type_ui", str3);
            jSONObject.put("tooltips_trigger_module", str4);
            jSONObject.put("tooltips_trigger_page", str5);
            jSONObject.put("tooltips_trigger_reason", str6);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.c(e);
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Map<String, Object> m22746c(String str, String str2, String str3, String str4, String str5) {
        HashMap map = new HashMap();
        map.put("tooltips_type", str);
        map.put("tooltips_type_ui", str2);
        map.put("tooltips_trigger_module", str3);
        map.put("tooltips_trigger_page", str4);
        map.put("tooltips_trigger_reason", str5);
        map.put("red_dot_state", "on");
        return map;
    }

    /* JADX INFO: renamed from: d */
    public static Map<String, Object> m22747d() {
        HashMap map = new HashMap();
        map.put("red_dot_state", "off");
        return map;
    }
}
