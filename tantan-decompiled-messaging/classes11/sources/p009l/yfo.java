package p009l;

import android.text.TextUtils;
import com.p1.mobile.android.app.App;
import java.util.ArrayList;
import l.c30;
import l.e51;
import l.j760;
import l.o6j0;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yfo {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m25349a(boolean z, String str) {
        String strE = c30.e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        if (z) {
            zvf0.x("e_intl_see_filter_click", strE);
        } else {
            zvf0.u("e_intl_see_filter_click", strE, new j760[]{vwb.Y("filter_label", str)});
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m25350b(String str, boolean z, String str2, String str3) {
        String strE = c30.e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(vwb.Y("other_user_id", str));
        arrayList.add(vwb.Y("is_privileged", Boolean.valueOf(z)));
        if (str2 != null) {
            arrayList.add(vwb.Y("see_user_tag_type", str2));
        }
        if (str3 != null) {
            arrayList.add(vwb.Y("see_user_down_tag_type", str3));
        }
        zvf0.u("e_intl_meet_see_users", strE, (j760[]) arrayList.toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m25351c(boolean z, boolean z2) {
        String strE = c30.e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        if (z) {
            zvf0.A("e_boost_button", strE, new j760[]{vwb.Y("is_privileged", Boolean.valueOf(z2))});
        } else {
            zvf0.u("e_boost_button", strE, new j760[]{vwb.Y("is_privileged", Boolean.valueOf(z2))});
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m25352d(final boolean z, final boolean z2) {
        e51.H(App.e, new Runnable() { // from class: l.vfo
            @Override // java.lang.Runnable
            public final void run() {
                yfo.m25351c(z, z2);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: e */
    public static void m25353e(final boolean z, final String str) {
        e51.H(App.e, new Runnable() { // from class: l.wfo
            @Override // java.lang.Runnable
            public final void run() {
                yfo.m25349a(z, str);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: f */
    public static void m25354f() {
        zvf0.x("e_intl_meet_see_ad", "p_intl_meet_view");
    }

    /* JADX INFO: renamed from: g */
    public static void m25355g(String str) {
        zvf0.u("e_intl_meet_avatar_click", "p_intl_meet_view", new j760[]{vwb.Y("avatar_click_from", str)});
    }

    /* JADX INFO: renamed from: h */
    public static void m25356h() {
        zvf0.A("e_bubble_boost_see_page_guide", "p_see_who_likes_me_view", new j760[]{vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "bubble"), vwb.Y("tooltips_type_ui", "bubble_basic_double_edge"), vwb.Y("tooltips_trigger_module", "boost_button"), vwb.Y("tooltips_trigger_page", "see_page"), vwb.Y("tooltips_trigger_reason", "guide")});
    }

    /* JADX INFO: renamed from: i */
    public static void m25357i(String str) {
        o6j0.c("e_intl_plm_turbo_button", str, new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: j */
    public static void m25358j(String str) {
        o6j0.h("e_intl_plm_turbo_button", str, new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: k */
    public static void m25359k(String str, String str2) {
        String strE = c30.e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(vwb.Y("see_user_tag_type", str));
        }
        if (str2 != null) {
            arrayList.add(vwb.Y("see_user_down_tag_type", str2));
        }
        if (arrayList.isEmpty()) {
            zvf0.r("e_intl_plm_card", strE);
        } else {
            zvf0.u("e_intl_plm_card", strE, (j760[]) arrayList.toArray(new j760[0]));
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m25360l(String str, String str2) {
        String strE = c30.e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(vwb.Y("see_user_tag_type", str));
        }
        if (str2 != null) {
            arrayList.add(vwb.Y("see_user_down_tag_type", str2));
        }
        if (arrayList.isEmpty()) {
            zvf0.w("e_intl_plm_card", strE, new j760[0]);
        } else {
            zvf0.w("e_intl_plm_card", strE, (j760[]) arrayList.toArray(new j760[0]));
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m25361m() {
        zvf0.A("e_intl_meet_null_toast", "p_intl_meet_view", new j760[]{vwb.Y("null_view", "see_view")});
    }

    /* JADX INFO: renamed from: n */
    public static void m25362n() {
        zvf0.x("e_intl_plm_native_ads", "p_intl_plm");
    }

    /* JADX INFO: renamed from: o */
    public static void m25363o() {
        zvf0.D("e_intl_meet_view_swipe_bottom", "p_intl_meet_view", new j760[]{vwb.Y("tab_view", "see")});
    }

    /* JADX INFO: renamed from: p */
    public static void m25364p(final String str, final boolean z, final String str2, final String str3) {
        e51.H(App.e, new Runnable() { // from class: l.xfo
            @Override // java.lang.Runnable
            public final void run() {
                yfo.m25350b(str, z, str2, str3);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: q */
    public static void m25365q() {
        zvf0.r("e_intl_meet_see_unlock_btn", "p_intl_meet_view");
    }

    /* JADX INFO: renamed from: r */
    public static void m25366r(String str, boolean z, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(vwb.Y("other_user_id", str));
        arrayList.add(vwb.Y("direction", z ? "right" : "left"));
        if (str2 != null) {
            arrayList.add(vwb.Y("see_user_tag_type", str2));
        }
        if (str3 != null) {
            arrayList.add(vwb.Y("see_user_down_tag_type", str3));
        }
        zvf0.w("e_intl_meet_see_users", "p_intl_meet_view", (j760[]) arrayList.toArray(new j760[0]));
    }
}
