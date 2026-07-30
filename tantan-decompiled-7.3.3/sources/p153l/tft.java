package p153l;

import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class tft {
    /* JADX INFO: renamed from: a */
    public static String m190983a(boolean z, int i) {
        return (!z && i > 0) ? "red_dot_figure" : "red_dot_normal";
    }

    /* JADX INFO: renamed from: b */
    public static void m190984b(String str, int i, int i2, int i3, int i4) {
        Object objValueOf;
        boolean zMo68415Ok = uqb0.f180396b0.f170326c.mo68415Ok();
        JSONObject jSONObject = new JSONObject();
        if (i2 > 0) {
            try {
                objValueOf = Integer.valueOf(i2);
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
        } else {
            objValueOf = "NA";
        }
        jSONObject.put("audio_red_dot_num ", objValueOf);
        jSONObject.put("live_red_dot_num ", i3 > 0 ? Integer.valueOf(i3) : "NA");
        jSONObject.put("video_room_red_dot_num ", i4 > 0 ? Integer.valueOf(i4) : "NA");
        i4g0.m138523u("e_red_dot_entertainment_icon", str, jyb.m147494Y("red_dot_relation_child", zMo68415Ok ? null : "e_red_dot_bubble_live"), jyb.m147494Y("tooltips_type", "red_dot"), jyb.m147494Y("tooltips_type_ui", m190983a(zMo68415Ok, i)), jyb.m147494Y("tooltips_trigger_module", zMo68415Ok ? "live_icon" : "bubble_live_followed"), jyb.m147494Y("tooltips_trigger_page", zMo68415Ok ? "swipe_page" : "live_explore"), jyb.m147494Y("red_dot_state", "on"), jyb.m147494Y("red_dot_num", i > 0 ? Integer.valueOf(i) : "NA"), jyb.m147494Y("tooltips_trigger_reason", jSONObject.toString()));
    }

    /* JADX INFO: renamed from: c */
    public static void m190985c(String str, int i, int i2, int i3, int i4) {
        Object objValueOf;
        boolean zMo68415Ok = uqb0.f180396b0.f170326c.mo68415Ok();
        JSONObject jSONObject = new JSONObject();
        if (i2 > 0) {
            try {
                objValueOf = Integer.valueOf(i2);
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
        } else {
            objValueOf = "NA";
        }
        jSONObject.put("audio_red_dot_num ", objValueOf);
        jSONObject.put("live_red_dot_num ", i3 > 0 ? Integer.valueOf(i3) : "NA");
        jSONObject.put("video_room_red_dot_num ", i4 > 0 ? Integer.valueOf(i4) : "NA");
        i4g0.m138492A("e_red_dot_entertainment_icon", str, jyb.m147494Y("red_dot_relation_child", zMo68415Ok ? null : "e_red_dot_bubble_live"), jyb.m147494Y("tooltips_type", "red_dot"), jyb.m147494Y("tooltips_type_ui", m190983a(zMo68415Ok, i)), jyb.m147494Y("tooltips_trigger_module", zMo68415Ok ? "live_icon" : "bubble_live_followed"), jyb.m147494Y("tooltips_trigger_page", zMo68415Ok ? "swipe_page" : "live_explore"), jyb.m147494Y("red_dot_state", "on"), jyb.m147494Y("red_dot_num", i > 0 ? Integer.valueOf(i) : "NA"), jyb.m147494Y("tooltips_trigger_reason", jSONObject.toString()));
    }
}
