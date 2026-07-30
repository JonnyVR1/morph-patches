package p009l;

import com.p1.mobile.putong.core.CoreModule;
import l.j760;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class rtl {
    /* JADX INFO: renamed from: a */
    public static String m21794a() {
        return CoreModule.c.p0.k3() ? "ultraPremium" : "premium";
    }

    /* JADX INFO: renamed from: b */
    public static void m21795b(String str) {
        zvf0.u("e_intl_meet_avatar_click", str, new j760[]{vwb.Y("avatar_click_from", "like_i_sent_feed"), vwb.Y("subtype", "premium")});
    }

    /* JADX INFO: renamed from: c */
    public static void m21796c(String str, String str2) {
        zvf0.u("e_intl_instantmatch_btn", str, new j760[]{vwb.Y("subtype", "ultraPremium"), vwb.Y("meet_sourse", str2)});
    }

    /* JADX INFO: renamed from: d */
    public static void m21797d(String str) {
        zvf0.u("e_intl_meet_like_i_sent_unlock_btn_click", str, new j760[]{vwb.Y("subtype", m21794a())});
    }

    /* JADX INFO: renamed from: e */
    public static void m21798e(String str) {
        zvf0.u("e_intl_instantmatch_btn", str, new j760[]{vwb.Y("subtype", "ultraPremium")});
    }

    /* JADX INFO: renamed from: f */
    public static void m21799f(String str) {
        zvf0.u("e_intl_i_like_photo", str, new j760[]{vwb.Y("subtype", "premium")});
    }

    /* JADX INFO: renamed from: g */
    public static void m21800g(String str) {
        zvf0.u("e_intl_like_sent_premium_button", str, new j760[]{vwb.Y("subtype", m21794a())});
    }

    /* JADX INFO: renamed from: h */
    public static void m21801h(String str) {
        zvf0.u("e_superlikeButton", str, new j760[]{vwb.Y("subtype", m21794a())});
    }

    /* JADX INFO: renamed from: i */
    public static void m21802i(String str, String str2) {
        zvf0.u("e_superlikeButton", str, new j760[]{vwb.Y("subtype", m21794a()), vwb.Y("meet_sourse", str2)});
    }

    /* JADX INFO: renamed from: j */
    public static void m21803j(String str) {
        zvf0.u("e_intl_meet_avatar_click", str, new j760[]{vwb.Y("avatar_click_from", "visitor_feed")});
    }

    /* JADX INFO: renamed from: k */
    public static void m21804k(String str, String str2) {
        zvf0.u("e_intl_instantmatch_btn", str, new j760[]{vwb.Y("subtype", "ultraPremium"), vwb.Y("meet_sourse", "visitors"), vwb.Y("other_user_id", str2)});
    }

    /* JADX INFO: renamed from: l */
    public static void m21805l(String str) {
        zvf0.u("e_intl_meet_avatar_click", str, new j760[]{vwb.Y("avatar_click_from", "visitor_picks")});
    }

    /* JADX INFO: renamed from: m */
    public static void m21806m(String str, String str2) {
        zvf0.u("e_superlikeButton", str, new j760[]{vwb.Y("subtype", "ultraPremium"), vwb.Y("meet_sourse", "visitors"), vwb.Y("other_user_id", str2)});
    }
}
