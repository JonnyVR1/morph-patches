package p149l;

/* JADX INFO: loaded from: classes13.dex */
public class rdt {
    /* JADX INFO: renamed from: a */
    public static String m179006a(boolean z, boolean z2) {
        if (z) {
            return "guide";
        }
        return z2 ? "follow_living" : "without_click";
    }

    /* JADX INFO: renamed from: b */
    public static String m179007b(boolean z, boolean z2) {
        return (!z && z2) ? "red_dot_figure" : "red_dot_normal";
    }

    /* JADX INFO: renamed from: c */
    public static String m179008c(String str) {
        str.getClass();
        switch (str) {
            case "voice-live":
                return "p_audio_explore_recommend";
            case "square-suggested":
                return "p_live_recommend";
            case "square-intlFollowing":
                return "p_live_follow";
            case "square-nearby":
                return "p_live_nearby";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m179009d(String str) {
        zvf0.m220396r("e_bubble_live_followed_hide", str);
    }

    /* JADX INFO: renamed from: e */
    public static void m179010e(String str, boolean z) {
        boolean zMo67232Ok = qib0.f154713b0.f139232c.mo67232Ok();
        zvf0.m220399u("e_red_dot_bubble_live", str, vwb.m200311Y("tooltips_type_ui", m179007b(zMo67232Ok, z)), vwb.m200311Y("tooltips_trigger_reason", m179006a(zMo67232Ok, z)), vwb.m200311Y("red_dot_relation_child", ""), vwb.m200311Y("red_dot_state", "on"));
    }

    /* JADX INFO: renamed from: f */
    public static void m179011f(String str, boolean z) {
        boolean zMo67232Ok = qib0.f154713b0.f139232c.mo67232Ok();
        zvf0.m220368A("e_red_dot_bubble_live", str, vwb.m200311Y("tooltips_type_ui", m179007b(zMo67232Ok, z)), vwb.m200311Y("tooltips_trigger_reason", m179006a(zMo67232Ok, z)), vwb.m200311Y("red_dot_relation_child", ""), vwb.m200311Y("red_dot_state", "on"));
    }

    /* JADX INFO: renamed from: g */
    public static void m179012g(String str, String str2, String str3) {
        String strM179008c = m179008c(str3);
        j760 j760Var = new j760("tooltips_type", "red_dot");
        j760 j760Var2 = new j760("tooltips_type_ui", str);
        if (!"red_dot_figure".equals(str)) {
            str2 = "NA";
        }
        zvf0.m220399u("e_audio_red_dot_voice_chat", strM179008c, j760Var, j760Var2, new j760("red_dot_num", str2), new j760("tooltips_trigger_reason", "red_dot_word".equals(str) ? "audio_party" : "follow_anchor_start_audio"));
    }

    /* JADX INFO: renamed from: h */
    public static void m179013h(String str, String str2, String str3) {
        String strM179008c = m179008c(str3);
        j760 j760Var = new j760("tooltips_type", "red_dot");
        j760 j760Var2 = new j760("tooltips_type_ui", str);
        if (!"red_dot_figure".equals(str)) {
            str2 = "NA";
        }
        zvf0.m220368A("e_audio_red_dot_voice_chat", strM179008c, j760Var, j760Var2, new j760("red_dot_num", str2), new j760("tooltips_trigger_reason", "red_dot_word".equals(str) ? "audio_party" : "follow_anchor_start_audio"));
    }
}
