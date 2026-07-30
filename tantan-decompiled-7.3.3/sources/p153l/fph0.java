package p153l;

import android.os.Build;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.UserId;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.SeeTextDynamicParam;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class fph0 {

    /* JADX INFO: renamed from: a */
    public static String f100168a = "signup";

    /* JADX INFO: renamed from: b */
    public static String f100169b = "profile";

    /* JADX INFO: renamed from: c */
    public static String f100170c = "message";

    /* JADX INFO: renamed from: d */
    public static String f100171d = "moments";

    /* JADX INFO: renamed from: e */
    public static String f100172e = "student_certification";

    /* JADX INFO: renamed from: f */
    public static String f100173f = "feedback";

    /* JADX INFO: renamed from: g */
    public static String f100174g = "fake";

    /* JADX INFO: renamed from: h */
    public static String f100175h = "home";

    /* JADX INFO: renamed from: i */
    public static l4g0 f100176i = new l4g0("p_sys_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: j */
    public static l4g0 f100177j = new l4g0("p_prompt_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: k */
    public static l4g0 f100178k = new l4g0("p_second_prompt_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: l */
    public static l4g0 f100179l = new l4g0("p_sys_location_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: m */
    public static l4g0 f100180m = new l4g0("p_privacy_setting_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: n */
    public static l4g0 f100181n = new l4g0("p_sys_address_book_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: o */
    public static l4g0 f100182o = new l4g0("p_prompt_address_book_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: p */
    public static l4g0 f100183p = new l4g0("p_second_prompt_address_book_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: q */
    public static l4g0 f100184q = new l4g0("p_prompt_notification_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: r */
    public static l4g0 f100185r = new l4g0("p_sys_phone_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: s */
    public static l4g0 f100186s = new l4g0("p_prompt_phone_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: t */
    public static l4g0 f100187t = new l4g0("p_second_prompt_phone_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: u */
    public static l4g0 f100188u = new l4g0("p_first_like_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: v */
    public static l4g0 f100189v = new l4g0("p_first_dislike_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: w */
    public static l4g0 f100190w = new l4g0("p_fake_alert_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: x */
    public static l4g0 f100191x = new l4g0("p_fake_submit_new_image_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: y */
    public static l4g0 f100192y = new l4g0("p_forbidden_good_to_fake_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: z */
    public static l4g0 f100193z = new l4g0("p_binding_phone_number_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: A */
    public static l4g0 f100167A = new l4g0("p_fake_avatar_star", Dialog.class.getName());

    /* JADX INFO: renamed from: A */
    public static void m126630A() {
        i4g0.m138520r("e_first_like_popup_confirm_button", "p_first_like_popup_view");
        f100188u.m152776k();
        f100188u.m152775j();
    }

    /* JADX INFO: renamed from: B */
    public static void m126631B() {
        i4g0.m138520r("e_first_like_popup_cancel_button", "p_first_like_popup_view");
        f100188u.m152776k();
        f100188u.m152775j();
    }

    /* JADX INFO: renamed from: C */
    public static void m126632C() {
        f100188u.m152780o(m126680m(jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "alert_self_definition_basic"), jyb.m147494Y("tooltips_trigger_module", "card"), jyb.m147494Y("tooltips_trigger_page", "swipe_page"), jyb.m147494Y("tooltips_trigger_reason", "swipe")));
        f100188u.m152774i();
        f100188u.m152777l();
    }

    /* JADX INFO: renamed from: D */
    public static void m126633D() {
        i4g0.m138520r("e_forbidden_good_to_fake_popup_keep_button", "p_forbidden_good_to_fake_popup_view");
        f100192y.m152776k();
        f100192y.m152775j();
    }

    /* JADX INFO: renamed from: E */
    public static void m126634E() {
        f100192y.m152780o(i6e.m138810b("passive", "alert", "alert_self_definition_basic", "null", "swipe_page", MessageType.exchange_picture));
        f100192y.m152774i();
        f100192y.m152777l();
    }

    /* JADX INFO: renamed from: F */
    public static void m126635F() {
        i4g0.m138520r("e_forbidden_good_to_fake_popup_upload_button", "p_forbidden_good_to_fake_popup_view");
        f100192y.m152776k();
        f100192y.m152775j();
    }

    /* JADX INFO: renamed from: G */
    public static void m126636G() {
        i4g0.m138495D("e_forbidden_good_to_fake_upload_newavatar_success", "", jyb.m147494Y(UserId.TYPE, CoreModule.f18264c.f20381e0.m116600p9().f56859id));
    }

    /* JADX INFO: renamed from: H */
    public static void m126637H(boolean z) {
        String str;
        pf60 pf60VarM147494Y = jyb.m147494Y(UserId.TYPE, CoreModule.m30929H().userId());
        if (z) {
            str = (Build.VERSION.SDK_INT < 29 || PermissionHelper.m81064b("android.permission.ACCESS_BACKGROUND_LOCATION")) ? "on" : "wheninuse";
        } else {
            str = BLiveOperationTitleShowType.off;
        }
        i4g0.m138495D("e_location_auth_success", "", pf60VarM147494Y, jyb.m147494Y("user_auth", str));
    }

    /* JADX INFO: renamed from: I */
    public static void m126638I() {
        i4g0.m138520r("e_prompt_notification_auth_popup_open_button", "p_prompt_notification_auth_popup_view");
        f100184q.m152776k();
        f100184q.m152775j();
        m126639J(true);
    }

    /* JADX INFO: renamed from: J */
    public static void m126639J(boolean z) {
        i4g0.m138495D("e_notification_auth_success", "", jyb.m147494Y(UserId.TYPE, CoreModule.m30929H().userId()), jyb.m147494Y("user_auth", z ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: K */
    public static void m126640K() {
        i4g0.m138520r("e_chat_prompt_notification_auth_banner_open_button", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: L */
    public static void m126641L() {
        i4g0.m138526x("e_chat_prompt_notification_auth_banner_open_button", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: M */
    public static void m126642M() {
        i4g0.m138520r("e_prompt_notification_auth_popup_close_button", "p_prompt_notification_auth_popup_view");
        f100184q.m152776k();
        f100184q.m152775j();
    }

    /* JADX INFO: renamed from: N */
    public static void m126643N() {
        f100184q.m152780o(pk50.m172568j().m172574f().m181657U(OmsDialog.p_prompt_notification_auth_popup_view.getIdentifier(), i6e.m138810b("passive", "alert", "alert_self_definition_basic", "null", "anywhere", "no_permission_notice")));
        f100184q.m152774i();
        f100184q.m152777l();
    }

    /* JADX INFO: renamed from: O */
    public static void m126644O() {
        String str;
        String str2 = CoreModule.f18264c.f20381e0.m116600p9().settings.phoneNumber.number;
        if (TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().source, "wechat")) {
            str = TextUtils.isEmpty(str2) ? "only_wechat" : "phone_number_wechat";
        } else {
            str = "only_phone_number";
        }
        pf60 pf60VarM147494Y = jyb.m147494Y(UserId.TYPE, CoreModule.f18264c.f20381e0.m116600p9().f56859id);
        pf60 pf60VarM147494Y2 = jyb.m147494Y("phone_number_type", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        i4g0.m138495D("e_phone_number_success", "", pf60VarM147494Y, pf60VarM147494Y2, jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, str2));
    }

    /* JADX INFO: renamed from: P */
    public static void m126645P(boolean z) {
        f100180m.m152780o(m126680m(jyb.m147494Y("get_phone_number", z ? "on" : BLiveOperationTitleShowType.off)));
        f100180m.m152774i();
        f100180m.m152777l();
    }

    /* JADX INFO: renamed from: Q */
    public static void m126646Q(boolean z, boolean z2, boolean z3) {
        String str = BLiveOperationTitleShowType.off;
        pf60 pf60VarM147494Y = jyb.m147494Y("block_contacts", z ? "on" : BLiveOperationTitleShowType.off);
        pf60 pf60VarM147494Y2 = jyb.m147494Y("common_contacts", z2 ? "on" : BLiveOperationTitleShowType.off);
        if (z3) {
            str = "on";
        }
        i4g0.m138523u("e_privacy_setting_popup_start_button", "p_privacy_setting_popup_view", pf60VarM147494Y, pf60VarM147494Y2, jyb.m147494Y("binding_phone_number", str));
        f100180m.m152776k();
        f100180m.m152775j();
    }

    /* JADX INFO: renamed from: R */
    public static void m126647R(String str) {
        i4g0.m138523u("e_prompt_address_book_auth_popup_open_button", "p_prompt_address_book_auth_popup_view", jyb.m147494Y("auth_source", str));
        f100182o.m152776k();
        f100182o.m152775j();
    }

    /* JADX INFO: renamed from: S */
    public static void m126648S(String str) {
        i4g0.m138523u("e_prompt_address_book_auth_popup_close_button", "p_prompt_address_book_auth_popup_view", jyb.m147494Y("auth_source", str));
        f100182o.m152776k();
        f100182o.m152775j();
    }

    /* JADX INFO: renamed from: T */
    public static void m126649T(String str) {
        f100182o.m152780o(m126680m(jyb.m147494Y("auth_source", str), jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "system_alert"), jyb.m147494Y("tooltips_trigger_module", "null"), jyb.m147494Y("tooltips_trigger_page", "logon_page"), jyb.m147494Y("tooltips_trigger_reason", "no_permission_mail_list")));
        f100182o.m152774i();
        f100182o.m152777l();
    }

    /* JADX INFO: renamed from: U */
    public static void m126650U(String str) {
        i4g0.m138523u("e_prompt_album_auth_popup_open_button", "p_prompt_album_auth_popup_view", jyb.m147494Y("auth_source", str));
        f100177j.m152776k();
        f100177j.m152775j();
    }

    /* JADX INFO: renamed from: V */
    public static void m126651V(String str) {
        i4g0.m138523u("e_prompt_album_auth_popup_close_button", "p_prompt_album_auth_popup_view", jyb.m147494Y("auth_source", str));
        f100177j.m152776k();
        f100177j.m152775j();
    }

    /* JADX INFO: renamed from: W */
    public static void m126652W(String str) {
        f100177j.m152780o(m126680m(jyb.m147494Y("auth_source", str), jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "system_alert"), jyb.m147494Y("tooltips_trigger_module", "null"), jyb.m147494Y("tooltips_trigger_page", "media_page"), jyb.m147494Y("tooltips_trigger_reason", "no_permission_photo")));
        f100177j.m152774i();
        f100177j.m152777l();
    }

    /* JADX INFO: renamed from: X */
    public static void m126653X(String str) {
        i4g0.m138523u("e_second_prompt_address_book_auth_popup_open_button", "p_second_prompt_address_book_auth_popup_view", jyb.m147494Y("auth_source", str));
        f100183p.m152776k();
        f100183p.m152775j();
    }

    /* JADX INFO: renamed from: Y */
    public static void m126654Y(String str) {
        i4g0.m138523u("e_second_prompt_address_book_auth_popup_close_button", "p_second_prompt_address_book_auth_popup_view", jyb.m147494Y("auth_source", str));
        f100183p.m152776k();
        f100183p.m152775j();
    }

    /* JADX INFO: renamed from: Z */
    public static void m126655Z(String str) {
        f100183p.m152780o(m126680m(jyb.m147494Y("auth_source", str), jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "system_alert"), jyb.m147494Y("tooltips_trigger_module", "null"), jyb.m147494Y("tooltips_trigger_page", "logon_page"), jyb.m147494Y("tooltips_trigger_reason", "no_permission_mail_list")));
        f100183p.m152774i();
        f100183p.m152777l();
    }

    /* JADX INFO: renamed from: a */
    public static void m126656a(boolean z) {
        i4g0.m138495D("e_address_book_auth_success", "", jyb.m147494Y(UserId.TYPE, CoreModule.m30929H().userId()), jyb.m147494Y("user_auth", z ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: a0 */
    public static void m126657a0(String str) {
        i4g0.m138523u("e_second_prompt_album_auth_popup_open_button", "p_second_prompt_album_auth_popup_view", jyb.m147494Y("auth_source", str));
        f100178k.m152776k();
        f100178k.m152775j();
    }

    /* JADX INFO: renamed from: b */
    public static void m126658b(boolean z) {
        i4g0.m138495D("e_album_auth_success", "", jyb.m147494Y(UserId.TYPE, CoreModule.m30929H().userId()), jyb.m147494Y("user_auth", z ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: b0 */
    public static void m126659b0(String str) {
        i4g0.m138523u("e_second_prompt_album_auth_popup_close_button", "p_second_prompt_album_auth_popup_view", jyb.m147494Y("auth_source", str));
        f100178k.m152776k();
        f100178k.m152775j();
    }

    /* JADX INFO: renamed from: c */
    public static void m126660c(String str) {
        i4g0.m138523u("e_binding_phone_number_popup_binding_button", "p_binding_phone_number_popup_view", jyb.m147494Y("skipable", str));
    }

    /* JADX INFO: renamed from: c0 */
    public static void m126661c0(String str) {
        f100178k.m152780o(m126680m(jyb.m147494Y("auth_source", str), jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "system_alert"), jyb.m147494Y("tooltips_trigger_module", "null"), jyb.m147494Y("tooltips_trigger_page", "media_page"), jyb.m147494Y("tooltips_trigger_reason", "no_permission_storage")));
        f100178k.m152774i();
        f100178k.m152777l();
    }

    /* JADX INFO: renamed from: d */
    public static void m126662d(String str) {
        i4g0.m138523u("e_binding_phone_number_popup_other_number_button", "p_binding_phone_number_popup_view", jyb.m147494Y("skipable", str), jyb.m147494Y("number_type", "one_click"));
    }

    /* JADX INFO: renamed from: d0 */
    public static void m126663d0(String str, JSONObject jSONObject) {
        q4f q4fVar = new q4f();
        q4fVar.f155581s = str;
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        if (NullChecker.m82486a(jSONObject)) {
            q4fVar.f155585w = jSONObject;
        }
        i4g0.m138515m(q4fVar);
    }

    /* JADX INFO: renamed from: e */
    public static void m126664e() {
        i4g0.m138523u("e_binding_phone_number_popup_close_button", "p_binding_phone_number_popup_view", jyb.m147494Y("skipable", "on"));
    }

    /* JADX INFO: renamed from: e0 */
    public static void m126665e0() {
        i4g0.m138520r("e_suggest_users_home_page_location_button", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: f */
    public static void m126666f() {
        if (NullChecker.m82486a(f100193z)) {
            f100193z.m152776k();
            f100193z.m152775j();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m126667f0(String str) {
        i4g0.m138523u("e_sys_address_book_auth_popup_allowed_button", "p_sys_address_book_auth_popup_view", jyb.m147494Y("auth_source", str));
        f100181n.m152776k();
        f100181n.m152775j();
        m126656a(true);
    }

    /* JADX INFO: renamed from: g */
    public static void m126668g(String str, String str2) {
        f100193z.m152780o(pk50.m172568j().m172574f().m181657U("p_binding_phone_number_popup_view", m126680m(jyb.m147494Y("skipable", str), jyb.m147494Y("number_type", str2), jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "alert_special"), jyb.m147494Y("tooltips_trigger_module", "privacy_settings"), jyb.m147494Y("tooltips_trigger_page", "swipe_page"), jyb.m147494Y("tooltips_trigger_reason", "unbound_phone_number"))));
        f100193z.m152774i();
        f100193z.m152777l();
    }

    /* JADX INFO: renamed from: g0 */
    public static void m126669g0(String str, boolean z) {
        i4g0.m138523u("e_sys_address_book_auth_popup_denied_button", "p_sys_address_book_auth_popup_view", jyb.m147494Y("auth_source", str), jyb.m147494Y("no_longer_ask", z ? "on" : BLiveOperationTitleShowType.off));
        f100181n.m152776k();
        f100181n.m152775j();
    }

    /* JADX INFO: renamed from: h */
    public static void m126670h(String str) {
        i4g0.m138523u("e_binding_phone_number_popup_verification_code_button", "p_binding_phone_number_popup_view", jyb.m147494Y("skipable", str));
    }

    /* JADX INFO: renamed from: h0 */
    public static void m126671h0(String str) {
        f100181n.m152780o(m126680m(jyb.m147494Y("auth_source", str), jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "system_alert"), jyb.m147494Y("tooltips_trigger_module", "null"), jyb.m147494Y("tooltips_trigger_page", "logon_page"), jyb.m147494Y("tooltips_trigger_reason", "no_permission_mail_list")));
        f100181n.m152774i();
        f100181n.m152777l();
    }

    /* JADX INFO: renamed from: i */
    public static void m126672i(boolean z) {
        m126663d0("e_binding_phone_number_popup_binding_phone_number_success_failed", m126680m(jyb.m147494Y("skipable", z ? BLiveOperationTitleShowType.off : "on"), jyb.m147494Y(UserId.TYPE, CoreModule.f18264c.f20381e0.m116600p9().f56859id)));
    }

    /* JADX INFO: renamed from: i0 */
    public static void m126673i0(String str) {
        i4g0.m138523u("e_sys_album_auth_popup_allowed_button", "p_sys_album_auth_popup_view", jyb.m147494Y("auth_source", str));
        f100176i.m152776k();
        f100176i.m152775j();
        m126658b(true);
    }

    /* JADX INFO: renamed from: j */
    public static void m126674j(boolean z, String str) {
        i4g0.m138495D("e_binding_phone_number_popup_binding_phone_number_success", "", jyb.m147494Y(UserId.TYPE, CoreModule.f18264c.f20381e0.m116600p9().f56859id), jyb.m147494Y("skipable", z ? BLiveOperationTitleShowType.off : "on"), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, str));
        m126644O();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m126675j0(String str, boolean z) {
        i4g0.m138523u("e_sys_album_auth_popup_denied_button", "p_sys_album_auth_popup_view", jyb.m147494Y("auth_source", str), jyb.m147494Y("no_longer_ask", z ? "on" : BLiveOperationTitleShowType.off));
        f100176i.m152776k();
        f100176i.m152775j();
    }

    /* JADX INFO: renamed from: k */
    public static void m126676k() {
        i4g0.m138495D("e_binding_phone_number_popup_signout_success", "", jyb.m147494Y(UserId.TYPE, CoreModule.f18264c.f20381e0.m116600p9().f56859id));
    }

    /* JADX INFO: renamed from: k0 */
    public static void m126677k0(String str) {
        f100176i.m152780o(m126680m(jyb.m147494Y("auth_source", str), jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "system_alert"), jyb.m147494Y("tooltips_trigger_module", "null"), jyb.m147494Y("tooltips_trigger_page", "media_page"), jyb.m147494Y("tooltips_trigger_reason", "no_permission_photo")));
        f100176i.m152774i();
        f100176i.m152777l();
    }

    /* JADX INFO: renamed from: l */
    public static void m126678l() {
        i4g0.m138495D("e_block_contacts_page_binding_phone_number_success", "", jyb.m147494Y(UserId.TYPE, CoreModule.f18264c.f20381e0.m116600p9().f56859id), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, CoreModule.f18264c.f20381e0.m116600p9().settings.phoneNumber.number));
    }

    /* JADX INFO: renamed from: l0 */
    public static void m126679l0(String str) {
        i4g0.m138523u("e_sys_location_auth_popup_allowed_button", "p_sys_location_auth_popup_view", jyb.m147494Y("auth_source", str));
        f100179l.m152776k();
        f100179l.m152775j();
        m126637H(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static JSONObject m126680m(pf60... pf60VarArr) {
        JSONObject jSONObject = null;
        if (NullChecker.m82486a(pf60VarArr) && pf60VarArr.length > 0) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    for (pf60 pf60Var : pf60VarArr) {
                        jSONObject2.put((String) pf60Var.f152156a, pf60Var.f152157b);
                    }
                    return jSONObject2;
                } catch (JSONException e) {
                    e = e;
                    jSONObject = jSONObject2;
                    CrashHelper.m82479c(e);
                    wu80.m207938b(e);
                    return jSONObject;
                }
            } catch (JSONException e2) {
                e = e2;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: m0 */
    public static void m126681m0(String str, String str2) {
        i4g0.m138523u("e_sys_location_auth_popup_denied_button", "p_sys_location_auth_popup_view", jyb.m147494Y("auth_source", str), jyb.m147494Y("no_longer_ask", str2));
        f100179l.m152776k();
        f100179l.m152775j();
    }

    /* JADX INFO: renamed from: n */
    public static void m126682n() {
        i4g0.m138520r("e_fake_alert_popup_replace_button", "p_fake_alert_popup_view");
    }

    /* JADX INFO: renamed from: n0 */
    public static void m126683n0(String str) {
        f100179l.m152780o(m126680m(jyb.m147494Y("auth_source", str), jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "alert_self_definition_basic"), jyb.m147494Y("tooltips_trigger_module", "null"), jyb.m147494Y("tooltips_trigger_page", "logon_page"), jyb.m147494Y("tooltips_trigger_reason", "get_location_permission")));
        f100179l.m152774i();
        f100179l.m152777l();
    }

    /* JADX INFO: renamed from: o */
    public static void m126684o() {
        f100190w.m152776k();
        f100190w.m152775j();
    }

    /* JADX INFO: renamed from: p */
    public static void m126685p(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "swipe_page";
        }
        JSONObject jSONObjectM138810b = i6e.m138810b("passive", "alert", "alert_self_definition_basic", "card", str, "swipe");
        try {
            if (CoreModule.f18264c.f20381e0.m116525W7()) {
                jSONObjectM138810b.put("fake_status", "gender");
            } else if (CoreModule.f18264c.f20381e0.m116579k8()) {
                jSONObjectM138810b.put("fake_status", SeeTextDynamicParam.age);
            } else if (CoreModule.f18264c.f20381e0.m116537Z7()) {
                jSONObjectM138810b.put("fake_status", "unreal");
            } else if (CoreModule.f18264c.f20381e0.m116533Y7()) {
                jSONObjectM138810b.put("fake_status", UserStatus.violation);
            }
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
        f100190w.m152780o(jSONObjectM138810b);
        f100190w.m152774i();
        f100190w.m152777l();
    }

    /* JADX INFO: renamed from: q */
    public static void m126686q() {
        f100191x.m152776k();
        f100191x.m152775j();
    }

    /* JADX INFO: renamed from: r */
    public static void m126687r() {
        i4g0.m138520r("e_fake_submit_new_image_popup_known_button", "p_fake_submit_new_image_popup_view");
    }

    /* JADX INFO: renamed from: s */
    public static void m126688s() {
        f100191x.m152780o(i6e.m138810b("passive", "alert", "alert_self_definition_basic", "null", "swipe_page", MessageType.exchange_picture));
        f100191x.m152774i();
        f100191x.m152777l();
    }

    /* JADX INFO: renamed from: t */
    public static void m126689t() {
        f100167A.m152776k();
        f100167A.m152775j();
    }

    /* JADX INFO: renamed from: u */
    public static void m126690u(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appeal_times", i);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        f100167A.m152780o(jSONObject);
        f100167A.m152774i();
        f100167A.m152777l();
    }

    /* JADX INFO: renamed from: v */
    public static void m126691v() {
        m126692w("");
    }

    /* JADX INFO: renamed from: w */
    public static void m126692w(String str) {
        i4g0.m138495D("e_fake_upload_newavatar_success", str, jyb.m147494Y(UserId.TYPE, CoreModule.f18264c.f20381e0.m116600p9().f56859id));
    }

    /* JADX INFO: renamed from: x */
    public static void m126693x() {
        i4g0.m138520r("e_first_dislike_popup_confirm_button", "p_first_dislike_popup_view");
        f100189v.m152776k();
        f100189v.m152775j();
    }

    /* JADX INFO: renamed from: y */
    public static void m126694y() {
        i4g0.m138520r("e_first_dislike_popup_cancel_button", "p_first_dislike_popup_view");
        f100189v.m152776k();
        f100189v.m152775j();
    }

    /* JADX INFO: renamed from: z */
    public static void m126695z() {
        f100189v.m152780o(m126680m(jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "alert_self_definition_basic"), jyb.m147494Y("tooltips_trigger_module", "card"), jyb.m147494Y("tooltips_trigger_page", "swipe_page"), jyb.m147494Y("tooltips_trigger_reason", "swipe")));
        f100189v.m152774i();
        f100189v.m152777l();
    }
}
