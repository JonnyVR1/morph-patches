package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: classes3.dex */
public final class fwl {
    /* JADX INFO: renamed from: a */
    public static String m127795a() {
        return CoreModule.f18264c.f20414p0.m219066k3() ? SummarizedPrivilegesId.ultraPremium : "premium";
    }

    /* JADX INFO: renamed from: b */
    public static void m127796b(String str) {
        i4g0.m138523u("e_intl_meet_avatar_click", str, jyb.m147494Y("avatar_click_from", "like_i_sent_feed"), jyb.m147494Y("subtype", "premium"));
    }

    /* JADX INFO: renamed from: c */
    public static void m127797c(String str, String str2) {
        i4g0.m138523u("e_intl_instantmatch_btn", str, jyb.m147494Y("subtype", SummarizedPrivilegesId.ultraPremium), jyb.m147494Y("meet_sourse", str2));
    }

    /* JADX INFO: renamed from: d */
    public static void m127798d(String str) {
        i4g0.m138523u("e_intl_meet_like_i_sent_unlock_btn_click", str, jyb.m147494Y("subtype", m127795a()));
    }

    /* JADX INFO: renamed from: e */
    public static void m127799e(String str) {
        i4g0.m138523u("e_intl_instantmatch_btn", str, jyb.m147494Y("subtype", SummarizedPrivilegesId.ultraPremium));
    }

    /* JADX INFO: renamed from: f */
    public static void m127800f(String str) {
        i4g0.m138523u("e_intl_i_like_photo", str, jyb.m147494Y("subtype", "premium"));
    }

    /* JADX INFO: renamed from: g */
    public static void m127801g(String str) {
        i4g0.m138523u("e_intl_like_sent_premium_button", str, jyb.m147494Y("subtype", m127795a()));
    }

    /* JADX INFO: renamed from: h */
    public static void m127802h(String str) {
        i4g0.m138523u(MatchScData.ModuleId.mid_e_superlikeButton, str, jyb.m147494Y("subtype", m127795a()));
    }

    /* JADX INFO: renamed from: i */
    public static void m127803i(String str, String str2) {
        i4g0.m138523u(MatchScData.ModuleId.mid_e_superlikeButton, str, jyb.m147494Y("subtype", m127795a()), jyb.m147494Y("meet_sourse", str2));
    }

    /* JADX INFO: renamed from: j */
    public static void m127804j(String str) {
        i4g0.m138523u("e_intl_meet_avatar_click", str, jyb.m147494Y("avatar_click_from", "visitor_feed"));
    }

    /* JADX INFO: renamed from: k */
    public static void m127805k(String str, String str2) {
        i4g0.m138523u("e_intl_instantmatch_btn", str, jyb.m147494Y("subtype", SummarizedPrivilegesId.ultraPremium), jyb.m147494Y("meet_sourse", SchemeKey.visitors), jyb.m147494Y("other_user_id", str2));
    }

    /* JADX INFO: renamed from: l */
    public static void m127806l(String str) {
        i4g0.m138523u("e_intl_meet_avatar_click", str, jyb.m147494Y("avatar_click_from", "visitor_picks"));
    }

    /* JADX INFO: renamed from: m */
    public static void m127807m(String str, String str2) {
        i4g0.m138523u(MatchScData.ModuleId.mid_e_superlikeButton, str, jyb.m147494Y("subtype", SummarizedPrivilegesId.ultraPremium), jyb.m147494Y("meet_sourse", SchemeKey.visitors), jyb.m147494Y("other_user_id", str2));
    }
}
