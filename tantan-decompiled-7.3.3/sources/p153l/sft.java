package p153l;

/* JADX INFO: loaded from: classes9.dex */
public class sft {
    /* JADX INFO: renamed from: a */
    public static String m185663a(boolean z, boolean z2) {
        if (z) {
            return "guide";
        }
        return z2 ? "follow_living" : "without_click";
    }

    /* JADX INFO: renamed from: b */
    public static String m185664b(boolean z, boolean z2) {
        return (!z && z2) ? "red_dot_figure" : "red_dot_normal";
    }

    /* JADX INFO: renamed from: c */
    public static String m185665c(String str) {
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
    public static void m185666d(String str) {
        i4g0.m138520r("e_bubble_live_followed_hide", str);
    }

    /* JADX INFO: renamed from: e */
    public static void m185667e(String str, boolean z) {
        boolean zMo68415Ok = uqb0.f180396b0.f170326c.mo68415Ok();
        i4g0.m138523u("e_red_dot_bubble_live", str, jyb.m147494Y("tooltips_type_ui", m185664b(zMo68415Ok, z)), jyb.m147494Y("tooltips_trigger_reason", m185663a(zMo68415Ok, z)), jyb.m147494Y("red_dot_relation_child", ""), jyb.m147494Y("red_dot_state", "on"));
    }

    /* JADX INFO: renamed from: f */
    public static void m185668f(String str, boolean z) {
        boolean zMo68415Ok = uqb0.f180396b0.f170326c.mo68415Ok();
        i4g0.m138492A("e_red_dot_bubble_live", str, jyb.m147494Y("tooltips_type_ui", m185664b(zMo68415Ok, z)), jyb.m147494Y("tooltips_trigger_reason", m185663a(zMo68415Ok, z)), jyb.m147494Y("red_dot_relation_child", ""), jyb.m147494Y("red_dot_state", "on"));
    }

    /* JADX INFO: renamed from: g */
    public static void m185669g(String str, String str2, String str3) {
        String strM185665c = m185665c(str3);
        pf60 pf60Var = new pf60("tooltips_type", "red_dot");
        pf60 pf60Var2 = new pf60("tooltips_type_ui", str);
        if (!"red_dot_figure".equals(str)) {
            str2 = "NA";
        }
        i4g0.m138523u("e_audio_red_dot_voice_chat", strM185665c, pf60Var, pf60Var2, new pf60("red_dot_num", str2), new pf60("tooltips_trigger_reason", "red_dot_word".equals(str) ? "audio_party" : "follow_anchor_start_audio"));
    }

    /* JADX INFO: renamed from: h */
    public static void m185670h(String str, String str2, String str3) {
        String strM185665c = m185665c(str3);
        pf60 pf60Var = new pf60("tooltips_type", "red_dot");
        pf60 pf60Var2 = new pf60("tooltips_type_ui", str);
        if (!"red_dot_figure".equals(str)) {
            str2 = "NA";
        }
        i4g0.m138492A("e_audio_red_dot_voice_chat", strM185665c, pf60Var, pf60Var2, new pf60("red_dot_num", str2), new pf60("tooltips_trigger_reason", "red_dot_word".equals(str) ? "audio_party" : "follow_anchor_start_audio"));
    }
}
