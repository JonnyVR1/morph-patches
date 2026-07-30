package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class yfo {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m214562a(boolean z, String str) {
        String strM104963e = c30.m104963e();
        if (TextUtils.isEmpty(strM104963e)) {
            return;
        }
        if (z) {
            zvf0.m220402x("e_intl_see_filter_click", strM104963e);
        } else {
            zvf0.m220399u("e_intl_see_filter_click", strM104963e, vwb.m200311Y("filter_label", str));
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m214563b(String str, boolean z, String str2, String str3) {
        String strM104963e = c30.m104963e();
        if (TextUtils.isEmpty(strM104963e)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(vwb.m200311Y("other_user_id", str));
        arrayList.add(vwb.m200311Y("is_privileged", Boolean.valueOf(z)));
        if (str2 != null) {
            arrayList.add(vwb.m200311Y("see_user_tag_type", str2));
        }
        if (str3 != null) {
            arrayList.add(vwb.m200311Y("see_user_down_tag_type", str3));
        }
        zvf0.m220399u("e_intl_meet_see_users", strM104963e, (j760[]) arrayList.toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m214564c(boolean z, boolean z2) {
        String strM104963e = c30.m104963e();
        if (TextUtils.isEmpty(strM104963e)) {
            return;
        }
        if (z) {
            zvf0.m220368A("e_boost_button", strM104963e, vwb.m200311Y("is_privileged", Boolean.valueOf(z2)));
        } else {
            zvf0.m220399u("e_boost_button", strM104963e, vwb.m200311Y("is_privileged", Boolean.valueOf(z2)));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m214565d(final boolean z, final boolean z2) {
        e51.m114743H(App.f15369e, new Runnable() { // from class: l.vfo
            @Override // java.lang.Runnable
            public final void run() {
                yfo.m214564c(z, z2);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: e */
    public static void m214566e(final boolean z, final String str) {
        e51.m114743H(App.f15369e, new Runnable() { // from class: l.wfo
            @Override // java.lang.Runnable
            public final void run() {
                yfo.m214562a(z, str);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: f */
    public static void m214567f() {
        zvf0.m220402x("e_intl_meet_see_ad", "p_intl_meet_view");
    }

    /* JADX INFO: renamed from: g */
    public static void m214568g(String str) {
        zvf0.m220399u("e_intl_meet_avatar_click", "p_intl_meet_view", vwb.m200311Y("avatar_click_from", str));
    }

    /* JADX INFO: renamed from: h */
    public static void m214569h() {
        zvf0.m220368A("e_bubble_boost_see_page_guide", "p_see_who_likes_me_view", vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "bubble"), vwb.m200311Y("tooltips_type_ui", "bubble_basic_double_edge"), vwb.m200311Y("tooltips_trigger_module", "boost_button"), vwb.m200311Y("tooltips_trigger_page", "see_page"), vwb.m200311Y("tooltips_trigger_reason", "guide"));
    }

    /* JADX INFO: renamed from: i */
    public static void m214570i(String str) {
        o6j0.m162859c("e_intl_plm_turbo_button", str, new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: j */
    public static void m214571j(String str) {
        o6j0.m162864h("e_intl_plm_turbo_button", str, new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: k */
    public static void m214572k(String str, String str2) {
        String strM104963e = c30.m104963e();
        if (TextUtils.isEmpty(strM104963e)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(vwb.m200311Y("see_user_tag_type", str));
        }
        if (str2 != null) {
            arrayList.add(vwb.m200311Y("see_user_down_tag_type", str2));
        }
        if (arrayList.isEmpty()) {
            zvf0.m220396r("e_intl_plm_card", strM104963e);
        } else {
            zvf0.m220399u("e_intl_plm_card", strM104963e, (j760[]) arrayList.toArray(new j760[0]));
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m214573l(String str, String str2) {
        String strM104963e = c30.m104963e();
        if (TextUtils.isEmpty(strM104963e)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(vwb.m200311Y("see_user_tag_type", str));
        }
        if (str2 != null) {
            arrayList.add(vwb.m200311Y("see_user_down_tag_type", str2));
        }
        if (arrayList.isEmpty()) {
            zvf0.m220401w("e_intl_plm_card", strM104963e, new j760[0]);
        } else {
            zvf0.m220401w("e_intl_plm_card", strM104963e, (j760[]) arrayList.toArray(new j760[0]));
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m214574m() {
        zvf0.m220368A("e_intl_meet_null_toast", "p_intl_meet_view", vwb.m200311Y("null_view", "see_view"));
    }

    /* JADX INFO: renamed from: n */
    public static void m214575n() {
        zvf0.m220402x("e_intl_plm_native_ads", "p_intl_plm");
    }

    /* JADX INFO: renamed from: o */
    public static void m214576o() {
        zvf0.m220371D("e_intl_meet_view_swipe_bottom", "p_intl_meet_view", vwb.m200311Y("tab_view", "see"));
    }

    /* JADX INFO: renamed from: p */
    public static void m214577p(final String str, final boolean z, final String str2, final String str3) {
        e51.m114743H(App.f15369e, new Runnable() { // from class: l.xfo
            @Override // java.lang.Runnable
            public final void run() {
                yfo.m214563b(str, z, str2, str3);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: q */
    public static void m214578q() {
        zvf0.m220396r("e_intl_meet_see_unlock_btn", "p_intl_meet_view");
    }

    /* JADX INFO: renamed from: r */
    public static void m214579r(String str, boolean z, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(vwb.m200311Y("other_user_id", str));
        arrayList.add(vwb.m200311Y("direction", z ? "right" : BLiveGiftBubblePopupTitlePosition.left));
        if (str2 != null) {
            arrayList.add(vwb.m200311Y("see_user_tag_type", str2));
        }
        if (str3 != null) {
            arrayList.add(vwb.m200311Y("see_user_down_tag_type", str3));
        }
        zvf0.m220401w("e_intl_meet_see_users", "p_intl_meet_view", (j760[]) arrayList.toArray(new j760[0]));
    }
}
