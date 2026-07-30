package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class yho {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m215974a(boolean z, String str) {
        String strM204490e = w20.m204490e();
        if (TextUtils.isEmpty(strM204490e)) {
            return;
        }
        if (z) {
            i4g0.m138526x("e_intl_see_filter_click", strM204490e);
        } else {
            i4g0.m138523u("e_intl_see_filter_click", strM204490e, jyb.m147494Y("filter_label", str));
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m215975b(String str, boolean z, String str2, String str3) {
        String strM204490e = w20.m204490e();
        if (TextUtils.isEmpty(strM204490e)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(jyb.m147494Y("other_user_id", str));
        arrayList.add(jyb.m147494Y("is_privileged", Boolean.valueOf(z)));
        if (str2 != null) {
            arrayList.add(jyb.m147494Y("see_user_tag_type", str2));
        }
        if (str3 != null) {
            arrayList.add(jyb.m147494Y("see_user_down_tag_type", str3));
        }
        i4g0.m138523u("e_intl_meet_see_users", strM204490e, (pf60[]) arrayList.toArray(new pf60[0]));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m215976c(boolean z, boolean z2) {
        String strM204490e = w20.m204490e();
        if (TextUtils.isEmpty(strM204490e)) {
            return;
        }
        if (z) {
            i4g0.m138492A("e_boost_button", strM204490e, jyb.m147494Y("is_privileged", Boolean.valueOf(z2)));
        } else {
            i4g0.m138523u("e_boost_button", strM204490e, jyb.m147494Y("is_privileged", Boolean.valueOf(z2)));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m215977d(final boolean z, final boolean z2) {
        l51.m152888H(App.f16088e, new Runnable() { // from class: l.vho
            @Override // java.lang.Runnable
            public final void run() {
                yho.m215976c(z, z2);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: e */
    public static void m215978e(final boolean z, final String str) {
        l51.m152888H(App.f16088e, new Runnable() { // from class: l.who
            @Override // java.lang.Runnable
            public final void run() {
                yho.m215974a(z, str);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: f */
    public static void m215979f() {
        i4g0.m138526x("e_intl_meet_see_ad", "p_intl_meet_view");
    }

    /* JADX INFO: renamed from: g */
    public static void m215980g(String str) {
        i4g0.m138523u("e_intl_meet_avatar_click", "p_intl_meet_view", jyb.m147494Y("avatar_click_from", str));
    }

    /* JADX INFO: renamed from: h */
    public static void m215981h() {
        i4g0.m138492A("e_bubble_boost_see_page_guide", "p_see_who_likes_me_view", jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "bubble"), jyb.m147494Y("tooltips_type_ui", "bubble_basic_double_edge"), jyb.m147494Y("tooltips_trigger_module", "boost_button"), jyb.m147494Y("tooltips_trigger_page", "see_page"), jyb.m147494Y("tooltips_trigger_reason", "guide"));
    }

    /* JADX INFO: renamed from: i */
    public static void m215982i(String str) {
        sfj0.m185596c("e_intl_plm_turbo_button", str, new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: j */
    public static void m215983j(String str) {
        sfj0.m185601h("e_intl_plm_turbo_button", str, new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: k */
    public static void m215984k(String str, String str2) {
        String strM204490e = w20.m204490e();
        if (TextUtils.isEmpty(strM204490e)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(jyb.m147494Y("see_user_tag_type", str));
        }
        if (str2 != null) {
            arrayList.add(jyb.m147494Y("see_user_down_tag_type", str2));
        }
        if (arrayList.isEmpty()) {
            i4g0.m138520r("e_intl_plm_card", strM204490e);
        } else {
            i4g0.m138523u("e_intl_plm_card", strM204490e, (pf60[]) arrayList.toArray(new pf60[0]));
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m215985l(String str, String str2) {
        String strM204490e = w20.m204490e();
        if (TextUtils.isEmpty(strM204490e)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(jyb.m147494Y("see_user_tag_type", str));
        }
        if (str2 != null) {
            arrayList.add(jyb.m147494Y("see_user_down_tag_type", str2));
        }
        if (arrayList.isEmpty()) {
            i4g0.m138525w("e_intl_plm_card", strM204490e, new pf60[0]);
        } else {
            i4g0.m138525w("e_intl_plm_card", strM204490e, (pf60[]) arrayList.toArray(new pf60[0]));
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m215986m() {
        i4g0.m138492A("e_intl_meet_null_toast", "p_intl_meet_view", jyb.m147494Y("null_view", "see_view"));
    }

    /* JADX INFO: renamed from: n */
    public static void m215987n() {
        i4g0.m138526x("e_intl_plm_native_ads", "p_intl_plm");
    }

    /* JADX INFO: renamed from: o */
    public static void m215988o() {
        i4g0.m138495D("e_intl_meet_view_swipe_bottom", "p_intl_meet_view", jyb.m147494Y("tab_view", "see"));
    }

    /* JADX INFO: renamed from: p */
    public static void m215989p(final String str, final boolean z, final String str2, final String str3) {
        l51.m152888H(App.f16088e, new Runnable() { // from class: l.xho
            @Override // java.lang.Runnable
            public final void run() {
                yho.m215975b(str, z, str2, str3);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: q */
    public static void m215990q() {
        i4g0.m138520r("e_intl_meet_see_unlock_btn", "p_intl_meet_view");
    }

    /* JADX INFO: renamed from: r */
    public static void m215991r(String str, boolean z, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(jyb.m147494Y("other_user_id", str));
        arrayList.add(jyb.m147494Y("direction", z ? "right" : BLiveGiftBubblePopupTitlePosition.left));
        if (str2 != null) {
            arrayList.add(jyb.m147494Y("see_user_tag_type", str2));
        }
        if (str3 != null) {
            arrayList.add(jyb.m147494Y("see_user_down_tag_type", str3));
        }
        i4g0.m138525w("e_intl_meet_see_users", "p_intl_meet_view", (pf60[]) arrayList.toArray(new pf60[0]));
    }
}
