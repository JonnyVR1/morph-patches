package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: classes11.dex */
public final class rtl {
    /* JADX INFO: renamed from: a */
    public static String m180788a() {
        return CoreModule.f17545c.f19672p0.m173363k3() ? SummarizedPrivilegesId.ultraPremium : "premium";
    }

    /* JADX INFO: renamed from: b */
    public static void m180789b(String str) {
        zvf0.m220399u("e_intl_meet_avatar_click", str, vwb.m200311Y("avatar_click_from", "like_i_sent_feed"), vwb.m200311Y("subtype", "premium"));
    }

    /* JADX INFO: renamed from: c */
    public static void m180790c(String str, String str2) {
        zvf0.m220399u("e_intl_instantmatch_btn", str, vwb.m200311Y("subtype", SummarizedPrivilegesId.ultraPremium), vwb.m200311Y("meet_sourse", str2));
    }

    /* JADX INFO: renamed from: d */
    public static void m180791d(String str) {
        zvf0.m220399u("e_intl_meet_like_i_sent_unlock_btn_click", str, vwb.m200311Y("subtype", m180788a()));
    }

    /* JADX INFO: renamed from: e */
    public static void m180792e(String str) {
        zvf0.m220399u("e_intl_instantmatch_btn", str, vwb.m200311Y("subtype", SummarizedPrivilegesId.ultraPremium));
    }

    /* JADX INFO: renamed from: f */
    public static void m180793f(String str) {
        zvf0.m220399u("e_intl_i_like_photo", str, vwb.m200311Y("subtype", "premium"));
    }

    /* JADX INFO: renamed from: g */
    public static void m180794g(String str) {
        zvf0.m220399u("e_intl_like_sent_premium_button", str, vwb.m200311Y("subtype", m180788a()));
    }

    /* JADX INFO: renamed from: h */
    public static void m180795h(String str) {
        zvf0.m220399u(MatchScData.ModuleId.mid_e_superlikeButton, str, vwb.m200311Y("subtype", m180788a()));
    }

    /* JADX INFO: renamed from: i */
    public static void m180796i(String str, String str2) {
        zvf0.m220399u(MatchScData.ModuleId.mid_e_superlikeButton, str, vwb.m200311Y("subtype", m180788a()), vwb.m200311Y("meet_sourse", str2));
    }

    /* JADX INFO: renamed from: j */
    public static void m180797j(String str) {
        zvf0.m220399u("e_intl_meet_avatar_click", str, vwb.m200311Y("avatar_click_from", "visitor_feed"));
    }

    /* JADX INFO: renamed from: k */
    public static void m180798k(String str, String str2) {
        zvf0.m220399u("e_intl_instantmatch_btn", str, vwb.m200311Y("subtype", SummarizedPrivilegesId.ultraPremium), vwb.m200311Y("meet_sourse", SchemeKey.visitors), vwb.m200311Y("other_user_id", str2));
    }

    /* JADX INFO: renamed from: l */
    public static void m180799l(String str) {
        zvf0.m220399u("e_intl_meet_avatar_click", str, vwb.m200311Y("avatar_click_from", "visitor_picks"));
    }

    /* JADX INFO: renamed from: m */
    public static void m180800m(String str, String str2) {
        zvf0.m220399u(MatchScData.ModuleId.mid_e_superlikeButton, str, vwb.m200311Y("subtype", SummarizedPrivilegesId.ultraPremium), vwb.m200311Y("meet_sourse", SchemeKey.visitors), vwb.m200311Y("other_user_id", str2));
    }
}
