package p149l;

import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class sdt {
    /* JADX INFO: renamed from: a */
    public static String m183551a(boolean z, int i) {
        return (!z && i > 0) ? "red_dot_figure" : "red_dot_normal";
    }

    /* JADX INFO: renamed from: b */
    public static void m183552b(String str, int i, int i2, int i3, int i4) {
        Object objValueOf;
        boolean zMo67232Ok = qib0.f154713b0.f139232c.mo67232Ok();
        JSONObject jSONObject = new JSONObject();
        if (i2 > 0) {
            try {
                objValueOf = Integer.valueOf(i2);
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
        } else {
            objValueOf = "NA";
        }
        jSONObject.put("audio_red_dot_num ", objValueOf);
        jSONObject.put("live_red_dot_num ", i3 > 0 ? Integer.valueOf(i3) : "NA");
        jSONObject.put("video_room_red_dot_num ", i4 > 0 ? Integer.valueOf(i4) : "NA");
        zvf0.m220399u("e_red_dot_entertainment_icon", str, vwb.m200311Y("red_dot_relation_child", zMo67232Ok ? null : "e_red_dot_bubble_live"), vwb.m200311Y("tooltips_type", "red_dot"), vwb.m200311Y("tooltips_type_ui", m183551a(zMo67232Ok, i)), vwb.m200311Y("tooltips_trigger_module", zMo67232Ok ? "live_icon" : "bubble_live_followed"), vwb.m200311Y("tooltips_trigger_page", zMo67232Ok ? "swipe_page" : "live_explore"), vwb.m200311Y("red_dot_state", "on"), vwb.m200311Y("red_dot_num", i > 0 ? Integer.valueOf(i) : "NA"), vwb.m200311Y("tooltips_trigger_reason", jSONObject.toString()));
    }

    /* JADX INFO: renamed from: c */
    public static void m183553c(String str, int i, int i2, int i3, int i4) {
        Object objValueOf;
        boolean zMo67232Ok = qib0.f154713b0.f139232c.mo67232Ok();
        JSONObject jSONObject = new JSONObject();
        if (i2 > 0) {
            try {
                objValueOf = Integer.valueOf(i2);
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
        } else {
            objValueOf = "NA";
        }
        jSONObject.put("audio_red_dot_num ", objValueOf);
        jSONObject.put("live_red_dot_num ", i3 > 0 ? Integer.valueOf(i3) : "NA");
        jSONObject.put("video_room_red_dot_num ", i4 > 0 ? Integer.valueOf(i4) : "NA");
        zvf0.m220368A("e_red_dot_entertainment_icon", str, vwb.m200311Y("red_dot_relation_child", zMo67232Ok ? null : "e_red_dot_bubble_live"), vwb.m200311Y("tooltips_type", "red_dot"), vwb.m200311Y("tooltips_type_ui", m183551a(zMo67232Ok, i)), vwb.m200311Y("tooltips_trigger_module", zMo67232Ok ? "live_icon" : "bubble_live_followed"), vwb.m200311Y("tooltips_trigger_page", zMo67232Ok ? "swipe_page" : "live_explore"), vwb.m200311Y("red_dot_state", "on"), vwb.m200311Y("red_dot_num", i > 0 ? Integer.valueOf(i) : "NA"), vwb.m200311Y("tooltips_trigger_reason", jSONObject.toString()));
    }
}
