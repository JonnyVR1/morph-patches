package p009l;

import com.tantanapp.common.utils.CrashHelper;
import l.j760;
import l.qib0;
import l.vwb;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sdt {
    /* JADX INFO: renamed from: a */
    public static String m22106a(boolean z, int i) {
        return (!z && i > 0) ? "red_dot_figure" : "red_dot_normal";
    }

    /* JADX INFO: renamed from: b */
    public static void m22107b(String str, int i, int i2, int i3, int i4) {
        Object objValueOf;
        boolean zM9022Ok = qib0.b0.c.m9022Ok();
        JSONObject jSONObject = new JSONObject();
        if (i2 > 0) {
            try {
                objValueOf = Integer.valueOf(i2);
            } catch (JSONException e) {
                CrashHelper.c(e);
            }
        } else {
            objValueOf = "NA";
        }
        jSONObject.put("audio_red_dot_num ", objValueOf);
        jSONObject.put("live_red_dot_num ", i3 > 0 ? Integer.valueOf(i3) : "NA");
        jSONObject.put("video_room_red_dot_num ", i4 > 0 ? Integer.valueOf(i4) : "NA");
        zvf0.u("e_red_dot_entertainment_icon", str, new j760[]{vwb.Y("red_dot_relation_child", zM9022Ok ? null : "e_red_dot_bubble_live"), vwb.Y("tooltips_type", "red_dot"), vwb.Y("tooltips_type_ui", m22106a(zM9022Ok, i)), vwb.Y("tooltips_trigger_module", zM9022Ok ? "live_icon" : "bubble_live_followed"), vwb.Y("tooltips_trigger_page", zM9022Ok ? "swipe_page" : "live_explore"), vwb.Y("red_dot_state", "on"), vwb.Y("red_dot_num", i > 0 ? Integer.valueOf(i) : "NA"), vwb.Y("tooltips_trigger_reason", jSONObject.toString())});
    }

    /* JADX INFO: renamed from: c */
    public static void m22108c(String str, int i, int i2, int i3, int i4) {
        Object objValueOf;
        boolean zM9022Ok = qib0.b0.c.m9022Ok();
        JSONObject jSONObject = new JSONObject();
        if (i2 > 0) {
            try {
                objValueOf = Integer.valueOf(i2);
            } catch (JSONException e) {
                CrashHelper.c(e);
            }
        } else {
            objValueOf = "NA";
        }
        jSONObject.put("audio_red_dot_num ", objValueOf);
        jSONObject.put("live_red_dot_num ", i3 > 0 ? Integer.valueOf(i3) : "NA");
        jSONObject.put("video_room_red_dot_num ", i4 > 0 ? Integer.valueOf(i4) : "NA");
        zvf0.A("e_red_dot_entertainment_icon", str, new j760[]{vwb.Y("red_dot_relation_child", zM9022Ok ? null : "e_red_dot_bubble_live"), vwb.Y("tooltips_type", "red_dot"), vwb.Y("tooltips_type_ui", m22106a(zM9022Ok, i)), vwb.Y("tooltips_trigger_module", zM9022Ok ? "live_icon" : "bubble_live_followed"), vwb.Y("tooltips_trigger_page", zM9022Ok ? "swipe_page" : "live_explore"), vwb.Y("red_dot_state", "on"), vwb.Y("red_dot_num", i > 0 ? Integer.valueOf(i) : "NA"), vwb.Y("tooltips_trigger_reason", jSONObject.toString())});
    }
}
