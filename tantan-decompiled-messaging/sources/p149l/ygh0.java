package p149l;

import android.os.Build;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.UserId;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.SeeTextDynamicParam;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ygh0 {

    /* JADX INFO: renamed from: a */
    public static String f198166a = "signup";

    /* JADX INFO: renamed from: b */
    public static String f198167b = "profile";

    /* JADX INFO: renamed from: c */
    public static String f198168c = "message";

    /* JADX INFO: renamed from: d */
    public static String f198169d = "moments";

    /* JADX INFO: renamed from: e */
    public static String f198170e = "student_certification";

    /* JADX INFO: renamed from: f */
    public static String f198171f = "feedback";

    /* JADX INFO: renamed from: g */
    public static String f198172g = "fake";

    /* JADX INFO: renamed from: h */
    public static String f198173h = "home";

    /* JADX INFO: renamed from: i */
    public static cwf0 f198174i = new cwf0("p_sys_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: j */
    public static cwf0 f198175j = new cwf0("p_prompt_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: k */
    public static cwf0 f198176k = new cwf0("p_second_prompt_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: l */
    public static cwf0 f198177l = new cwf0("p_sys_location_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: m */
    public static cwf0 f198178m = new cwf0("p_privacy_setting_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: n */
    public static cwf0 f198179n = new cwf0("p_sys_address_book_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: o */
    public static cwf0 f198180o = new cwf0("p_prompt_address_book_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: p */
    public static cwf0 f198181p = new cwf0("p_second_prompt_address_book_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: q */
    public static cwf0 f198182q = new cwf0("p_prompt_notification_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: r */
    public static cwf0 f198183r = new cwf0("p_sys_phone_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: s */
    public static cwf0 f198184s = new cwf0("p_prompt_phone_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: t */
    public static cwf0 f198185t = new cwf0("p_second_prompt_phone_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: u */
    public static cwf0 f198186u = new cwf0("p_first_like_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: v */
    public static cwf0 f198187v = new cwf0("p_first_dislike_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: w */
    public static cwf0 f198188w = new cwf0("p_fake_alert_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: x */
    public static cwf0 f198189x = new cwf0("p_fake_submit_new_image_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: y */
    public static cwf0 f198190y = new cwf0("p_forbidden_good_to_fake_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: z */
    public static cwf0 f198191z = new cwf0("p_binding_phone_number_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: A */
    public static cwf0 f198165A = new cwf0("p_fake_avatar_star", Dialog.class.getName());

    /* JADX INFO: renamed from: A */
    public static void m214642A() {
        zvf0.m220396r("e_first_like_popup_confirm_button", "p_first_like_popup_view");
        f198186u.m109035k();
        f198186u.m109034j();
    }

    /* JADX INFO: renamed from: B */
    public static void m214643B() {
        zvf0.m220396r("e_first_like_popup_cancel_button", "p_first_like_popup_view");
        f198186u.m109035k();
        f198186u.m109034j();
    }

    /* JADX INFO: renamed from: C */
    public static void m214644C() {
        f198186u.m109039o(m214692m(vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "alert_self_definition_basic"), vwb.m200311Y("tooltips_trigger_module", "card"), vwb.m200311Y("tooltips_trigger_page", "swipe_page"), vwb.m200311Y("tooltips_trigger_reason", "swipe")));
        f198186u.m109033i();
        f198186u.m109036l();
    }

    /* JADX INFO: renamed from: D */
    public static void m214645D() {
        zvf0.m220396r("e_forbidden_good_to_fake_popup_keep_button", "p_forbidden_good_to_fake_popup_view");
        f198190y.m109035k();
        f198190y.m109034j();
    }

    /* JADX INFO: renamed from: E */
    public static void m214646E() {
        f198190y.m109039o(u4e.m191727b("passive", "alert", "alert_self_definition_basic", "null", "swipe_page", MessageType.exchange_picture));
        f198190y.m109033i();
        f198190y.m109036l();
    }

    /* JADX INFO: renamed from: F */
    public static void m214647F() {
        zvf0.m220396r("e_forbidden_good_to_fake_popup_upload_button", "p_forbidden_good_to_fake_popup_view");
        f198190y.m109035k();
        f198190y.m109034j();
    }

    /* JADX INFO: renamed from: G */
    public static void m214648G() {
        zvf0.m220371D("e_forbidden_good_to_fake_upload_newavatar_success", "", vwb.m200311Y(UserId.TYPE, CoreModule.f17545c.f19639e0.m169527p9().f56011id));
    }

    /* JADX INFO: renamed from: H */
    public static void m214649H(boolean z) {
        String str;
        j760 j760VarM200311Y = vwb.m200311Y(UserId.TYPE, CoreModule.m29931H().userId());
        if (z) {
            str = (Build.VERSION.SDK_INT < 29 || PermissionHelper.m79881b("android.permission.ACCESS_BACKGROUND_LOCATION")) ? "on" : "wheninuse";
        } else {
            str = BLiveOperationTitleShowType.off;
        }
        zvf0.m220371D("e_location_auth_success", "", j760VarM200311Y, vwb.m200311Y("user_auth", str));
    }

    /* JADX INFO: renamed from: I */
    public static void m214650I() {
        zvf0.m220396r("e_prompt_notification_auth_popup_open_button", "p_prompt_notification_auth_popup_view");
        f198182q.m109035k();
        f198182q.m109034j();
        m214651J(true);
    }

    /* JADX INFO: renamed from: J */
    public static void m214651J(boolean z) {
        zvf0.m220371D("e_notification_auth_success", "", vwb.m200311Y(UserId.TYPE, CoreModule.m29931H().userId()), vwb.m200311Y("user_auth", z ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: K */
    public static void m214652K() {
        zvf0.m220396r("e_chat_prompt_notification_auth_banner_open_button", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: L */
    public static void m214653L() {
        zvf0.m220402x("e_chat_prompt_notification_auth_banner_open_button", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: M */
    public static void m214654M() {
        zvf0.m220396r("e_prompt_notification_auth_popup_close_button", "p_prompt_notification_auth_popup_view");
        f198182q.m109035k();
        f198182q.m109034j();
    }

    /* JADX INFO: renamed from: N */
    public static void m214655N() {
        f198182q.m109039o(ic50.m135327j().m135333f().m145234U(OmsDialog.p_prompt_notification_auth_popup_view.getIdentifier(), u4e.m191727b("passive", "alert", "alert_self_definition_basic", "null", "anywhere", "no_permission_notice")));
        f198182q.m109033i();
        f198182q.m109036l();
    }

    /* JADX INFO: renamed from: O */
    public static void m214656O() {
        String str;
        String str2 = CoreModule.f17545c.f19639e0.m169527p9().settings.phoneNumber.number;
        if (TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().source, "wechat")) {
            str = TextUtils.isEmpty(str2) ? "only_wechat" : "phone_number_wechat";
        } else {
            str = "only_phone_number";
        }
        j760 j760VarM200311Y = vwb.m200311Y(UserId.TYPE, CoreModule.f17545c.f19639e0.m169527p9().f56011id);
        j760 j760VarM200311Y2 = vwb.m200311Y("phone_number_type", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        zvf0.m220371D("e_phone_number_success", "", j760VarM200311Y, j760VarM200311Y2, vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, str2));
    }

    /* JADX INFO: renamed from: P */
    public static void m214657P(boolean z) {
        f198178m.m109039o(m214692m(vwb.m200311Y("get_phone_number", z ? "on" : BLiveOperationTitleShowType.off)));
        f198178m.m109033i();
        f198178m.m109036l();
    }

    /* JADX INFO: renamed from: Q */
    public static void m214658Q(boolean z, boolean z2, boolean z3) {
        String str = BLiveOperationTitleShowType.off;
        j760 j760VarM200311Y = vwb.m200311Y("block_contacts", z ? "on" : BLiveOperationTitleShowType.off);
        j760 j760VarM200311Y2 = vwb.m200311Y("common_contacts", z2 ? "on" : BLiveOperationTitleShowType.off);
        if (z3) {
            str = "on";
        }
        zvf0.m220399u("e_privacy_setting_popup_start_button", "p_privacy_setting_popup_view", j760VarM200311Y, j760VarM200311Y2, vwb.m200311Y("binding_phone_number", str));
        f198178m.m109035k();
        f198178m.m109034j();
    }

    /* JADX INFO: renamed from: R */
    public static void m214659R(String str) {
        zvf0.m220399u("e_prompt_address_book_auth_popup_open_button", "p_prompt_address_book_auth_popup_view", vwb.m200311Y("auth_source", str));
        f198180o.m109035k();
        f198180o.m109034j();
    }

    /* JADX INFO: renamed from: S */
    public static void m214660S(String str) {
        zvf0.m220399u("e_prompt_address_book_auth_popup_close_button", "p_prompt_address_book_auth_popup_view", vwb.m200311Y("auth_source", str));
        f198180o.m109035k();
        f198180o.m109034j();
    }

    /* JADX INFO: renamed from: T */
    public static void m214661T(String str) {
        f198180o.m109039o(m214692m(vwb.m200311Y("auth_source", str), vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "system_alert"), vwb.m200311Y("tooltips_trigger_module", "null"), vwb.m200311Y("tooltips_trigger_page", "logon_page"), vwb.m200311Y("tooltips_trigger_reason", "no_permission_mail_list")));
        f198180o.m109033i();
        f198180o.m109036l();
    }

    /* JADX INFO: renamed from: U */
    public static void m214662U(String str) {
        zvf0.m220399u("e_prompt_album_auth_popup_open_button", "p_prompt_album_auth_popup_view", vwb.m200311Y("auth_source", str));
        f198175j.m109035k();
        f198175j.m109034j();
    }

    /* JADX INFO: renamed from: V */
    public static void m214663V(String str) {
        zvf0.m220399u("e_prompt_album_auth_popup_close_button", "p_prompt_album_auth_popup_view", vwb.m200311Y("auth_source", str));
        f198175j.m109035k();
        f198175j.m109034j();
    }

    /* JADX INFO: renamed from: W */
    public static void m214664W(String str) {
        f198175j.m109039o(m214692m(vwb.m200311Y("auth_source", str), vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "system_alert"), vwb.m200311Y("tooltips_trigger_module", "null"), vwb.m200311Y("tooltips_trigger_page", "media_page"), vwb.m200311Y("tooltips_trigger_reason", "no_permission_photo")));
        f198175j.m109033i();
        f198175j.m109036l();
    }

    /* JADX INFO: renamed from: X */
    public static void m214665X(String str) {
        zvf0.m220399u("e_second_prompt_address_book_auth_popup_open_button", "p_second_prompt_address_book_auth_popup_view", vwb.m200311Y("auth_source", str));
        f198181p.m109035k();
        f198181p.m109034j();
    }

    /* JADX INFO: renamed from: Y */
    public static void m214666Y(String str) {
        zvf0.m220399u("e_second_prompt_address_book_auth_popup_close_button", "p_second_prompt_address_book_auth_popup_view", vwb.m200311Y("auth_source", str));
        f198181p.m109035k();
        f198181p.m109034j();
    }

    /* JADX INFO: renamed from: Z */
    public static void m214667Z(String str) {
        f198181p.m109039o(m214692m(vwb.m200311Y("auth_source", str), vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "system_alert"), vwb.m200311Y("tooltips_trigger_module", "null"), vwb.m200311Y("tooltips_trigger_page", "logon_page"), vwb.m200311Y("tooltips_trigger_reason", "no_permission_mail_list")));
        f198181p.m109033i();
        f198181p.m109036l();
    }

    /* JADX INFO: renamed from: a */
    public static void m214668a(boolean z) {
        zvf0.m220371D("e_address_book_auth_success", "", vwb.m200311Y(UserId.TYPE, CoreModule.m29931H().userId()), vwb.m200311Y("user_auth", z ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: a0 */
    public static void m214669a0(String str) {
        zvf0.m220399u("e_second_prompt_album_auth_popup_open_button", "p_second_prompt_album_auth_popup_view", vwb.m200311Y("auth_source", str));
        f198176k.m109035k();
        f198176k.m109034j();
    }

    /* JADX INFO: renamed from: b */
    public static void m214670b(boolean z) {
        zvf0.m220371D("e_album_auth_success", "", vwb.m200311Y(UserId.TYPE, CoreModule.m29931H().userId()), vwb.m200311Y("user_auth", z ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: b0 */
    public static void m214671b0(String str) {
        zvf0.m220399u("e_second_prompt_album_auth_popup_close_button", "p_second_prompt_album_auth_popup_view", vwb.m200311Y("auth_source", str));
        f198176k.m109035k();
        f198176k.m109034j();
    }

    /* JADX INFO: renamed from: c */
    public static void m214672c(String str) {
        zvf0.m220399u("e_binding_phone_number_popup_binding_button", "p_binding_phone_number_popup_view", vwb.m200311Y("skipable", str));
    }

    /* JADX INFO: renamed from: c0 */
    public static void m214673c0(String str) {
        f198176k.m109039o(m214692m(vwb.m200311Y("auth_source", str), vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "system_alert"), vwb.m200311Y("tooltips_trigger_module", "null"), vwb.m200311Y("tooltips_trigger_page", "media_page"), vwb.m200311Y("tooltips_trigger_reason", "no_permission_storage")));
        f198176k.m109033i();
        f198176k.m109036l();
    }

    /* JADX INFO: renamed from: d */
    public static void m214674d(String str) {
        zvf0.m220399u("e_binding_phone_number_popup_other_number_button", "p_binding_phone_number_popup_view", vwb.m200311Y("skipable", str), vwb.m200311Y("number_type", "one_click"));
    }

    /* JADX INFO: renamed from: d0 */
    public static void m214675d0(String str, JSONObject jSONObject) {
        l3f l3fVar = new l3f();
        l3fVar.f125900s = str;
        l3fVar.f125885d = EventNameEnum.SYS_CHECK;
        if (NullChecker.m81303a(jSONObject)) {
            l3fVar.f125904w = jSONObject;
        }
        zvf0.m220391m(l3fVar);
    }

    /* JADX INFO: renamed from: e */
    public static void m214676e() {
        zvf0.m220399u("e_binding_phone_number_popup_close_button", "p_binding_phone_number_popup_view", vwb.m200311Y("skipable", "on"));
    }

    /* JADX INFO: renamed from: e0 */
    public static void m214677e0() {
        zvf0.m220396r("e_suggest_users_home_page_location_button", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: f */
    public static void m214678f() {
        if (NullChecker.m81303a(f198191z)) {
            f198191z.m109035k();
            f198191z.m109034j();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m214679f0(String str) {
        zvf0.m220399u("e_sys_address_book_auth_popup_allowed_button", "p_sys_address_book_auth_popup_view", vwb.m200311Y("auth_source", str));
        f198179n.m109035k();
        f198179n.m109034j();
        m214668a(true);
    }

    /* JADX INFO: renamed from: g */
    public static void m214680g(String str, String str2) {
        f198191z.m109039o(ic50.m135327j().m135333f().m145234U("p_binding_phone_number_popup_view", m214692m(vwb.m200311Y("skipable", str), vwb.m200311Y("number_type", str2), vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "alert_special"), vwb.m200311Y("tooltips_trigger_module", "privacy_settings"), vwb.m200311Y("tooltips_trigger_page", "swipe_page"), vwb.m200311Y("tooltips_trigger_reason", "unbound_phone_number"))));
        f198191z.m109033i();
        f198191z.m109036l();
    }

    /* JADX INFO: renamed from: g0 */
    public static void m214681g0(String str, boolean z) {
        zvf0.m220399u("e_sys_address_book_auth_popup_denied_button", "p_sys_address_book_auth_popup_view", vwb.m200311Y("auth_source", str), vwb.m200311Y("no_longer_ask", z ? "on" : BLiveOperationTitleShowType.off));
        f198179n.m109035k();
        f198179n.m109034j();
    }

    /* JADX INFO: renamed from: h */
    public static void m214682h(String str) {
        zvf0.m220399u("e_binding_phone_number_popup_verification_code_button", "p_binding_phone_number_popup_view", vwb.m200311Y("skipable", str));
    }

    /* JADX INFO: renamed from: h0 */
    public static void m214683h0(String str) {
        f198179n.m109039o(m214692m(vwb.m200311Y("auth_source", str), vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "system_alert"), vwb.m200311Y("tooltips_trigger_module", "null"), vwb.m200311Y("tooltips_trigger_page", "logon_page"), vwb.m200311Y("tooltips_trigger_reason", "no_permission_mail_list")));
        f198179n.m109033i();
        f198179n.m109036l();
    }

    /* JADX INFO: renamed from: i */
    public static void m214684i(boolean z) {
        m214675d0("e_binding_phone_number_popup_binding_phone_number_success_failed", m214692m(vwb.m200311Y("skipable", z ? BLiveOperationTitleShowType.off : "on"), vwb.m200311Y(UserId.TYPE, CoreModule.f17545c.f19639e0.m169527p9().f56011id)));
    }

    /* JADX INFO: renamed from: i0 */
    public static void m214685i0(String str) {
        zvf0.m220399u("e_sys_album_auth_popup_allowed_button", "p_sys_album_auth_popup_view", vwb.m200311Y("auth_source", str));
        f198174i.m109035k();
        f198174i.m109034j();
        m214670b(true);
    }

    /* JADX INFO: renamed from: j */
    public static void m214686j(boolean z, String str) {
        zvf0.m220371D("e_binding_phone_number_popup_binding_phone_number_success", "", vwb.m200311Y(UserId.TYPE, CoreModule.f17545c.f19639e0.m169527p9().f56011id), vwb.m200311Y("skipable", z ? BLiveOperationTitleShowType.off : "on"), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, str));
        m214656O();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m214687j0(String str, boolean z) {
        zvf0.m220399u("e_sys_album_auth_popup_denied_button", "p_sys_album_auth_popup_view", vwb.m200311Y("auth_source", str), vwb.m200311Y("no_longer_ask", z ? "on" : BLiveOperationTitleShowType.off));
        f198174i.m109035k();
        f198174i.m109034j();
    }

    /* JADX INFO: renamed from: k */
    public static void m214688k() {
        zvf0.m220371D("e_binding_phone_number_popup_signout_success", "", vwb.m200311Y(UserId.TYPE, CoreModule.f17545c.f19639e0.m169527p9().f56011id));
    }

    /* JADX INFO: renamed from: k0 */
    public static void m214689k0(String str) {
        f198174i.m109039o(m214692m(vwb.m200311Y("auth_source", str), vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "system_alert"), vwb.m200311Y("tooltips_trigger_module", "null"), vwb.m200311Y("tooltips_trigger_page", "media_page"), vwb.m200311Y("tooltips_trigger_reason", "no_permission_photo")));
        f198174i.m109033i();
        f198174i.m109036l();
    }

    /* JADX INFO: renamed from: l */
    public static void m214690l() {
        zvf0.m220371D("e_block_contacts_page_binding_phone_number_success", "", vwb.m200311Y(UserId.TYPE, CoreModule.f17545c.f19639e0.m169527p9().f56011id), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, CoreModule.f17545c.f19639e0.m169527p9().settings.phoneNumber.number));
    }

    /* JADX INFO: renamed from: l0 */
    public static void m214691l0(String str) {
        zvf0.m220399u("e_sys_location_auth_popup_allowed_button", "p_sys_location_auth_popup_view", vwb.m200311Y("auth_source", str));
        f198177l.m109035k();
        f198177l.m109034j();
        m214649H(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static JSONObject m214692m(j760... j760VarArr) {
        JSONObject jSONObject = null;
        if (NullChecker.m81303a(j760VarArr) && j760VarArr.length > 0) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    for (j760 j760Var : j760VarArr) {
                        jSONObject2.put((String) j760Var.f116564a, j760Var.f116565b);
                    }
                    return jSONObject2;
                } catch (JSONException e) {
                    e = e;
                    jSONObject = jSONObject2;
                    CrashHelper.m81296c(e);
                    sm80.m184942b(e);
                    return jSONObject;
                }
            } catch (JSONException e2) {
                e = e2;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: m0 */
    public static void m214693m0(String str, String str2) {
        zvf0.m220399u("e_sys_location_auth_popup_denied_button", "p_sys_location_auth_popup_view", vwb.m200311Y("auth_source", str), vwb.m200311Y("no_longer_ask", str2));
        f198177l.m109035k();
        f198177l.m109034j();
    }

    /* JADX INFO: renamed from: n */
    public static void m214694n() {
        zvf0.m220396r("e_fake_alert_popup_replace_button", "p_fake_alert_popup_view");
    }

    /* JADX INFO: renamed from: n0 */
    public static void m214695n0(String str) {
        f198177l.m109039o(m214692m(vwb.m200311Y("auth_source", str), vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "alert_self_definition_basic"), vwb.m200311Y("tooltips_trigger_module", "null"), vwb.m200311Y("tooltips_trigger_page", "logon_page"), vwb.m200311Y("tooltips_trigger_reason", "get_location_permission")));
        f198177l.m109033i();
        f198177l.m109036l();
    }

    /* JADX INFO: renamed from: o */
    public static void m214696o() {
        f198188w.m109035k();
        f198188w.m109034j();
    }

    /* JADX INFO: renamed from: p */
    public static void m214697p(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "swipe_page";
        }
        JSONObject jSONObjectM191727b = u4e.m191727b("passive", "alert", "alert_self_definition_basic", "card", str, "swipe");
        try {
            if (CoreModule.f17545c.f19639e0.m169452W7()) {
                jSONObjectM191727b.put("fake_status", "gender");
            } else if (CoreModule.f17545c.f19639e0.m169506k8()) {
                jSONObjectM191727b.put("fake_status", SeeTextDynamicParam.age);
            } else if (CoreModule.f17545c.f19639e0.m169464Z7()) {
                jSONObjectM191727b.put("fake_status", "unreal");
            } else if (CoreModule.f17545c.f19639e0.m169460Y7()) {
                jSONObjectM191727b.put("fake_status", UserStatus.violation);
            }
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
        f198188w.m109039o(jSONObjectM191727b);
        f198188w.m109033i();
        f198188w.m109036l();
    }

    /* JADX INFO: renamed from: q */
    public static void m214698q() {
        f198189x.m109035k();
        f198189x.m109034j();
    }

    /* JADX INFO: renamed from: r */
    public static void m214699r() {
        zvf0.m220396r("e_fake_submit_new_image_popup_known_button", "p_fake_submit_new_image_popup_view");
    }

    /* JADX INFO: renamed from: s */
    public static void m214700s() {
        f198189x.m109039o(u4e.m191727b("passive", "alert", "alert_self_definition_basic", "null", "swipe_page", MessageType.exchange_picture));
        f198189x.m109033i();
        f198189x.m109036l();
    }

    /* JADX INFO: renamed from: t */
    public static void m214701t() {
        f198165A.m109035k();
        f198165A.m109034j();
    }

    /* JADX INFO: renamed from: u */
    public static void m214702u(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appeal_times", i);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        f198165A.m109039o(jSONObject);
        f198165A.m109033i();
        f198165A.m109036l();
    }

    /* JADX INFO: renamed from: v */
    public static void m214703v() {
        m214704w("");
    }

    /* JADX INFO: renamed from: w */
    public static void m214704w(String str) {
        zvf0.m220371D("e_fake_upload_newavatar_success", str, vwb.m200311Y(UserId.TYPE, CoreModule.f17545c.f19639e0.m169527p9().f56011id));
    }

    /* JADX INFO: renamed from: x */
    public static void m214705x() {
        zvf0.m220396r("e_first_dislike_popup_confirm_button", "p_first_dislike_popup_view");
        f198187v.m109035k();
        f198187v.m109034j();
    }

    /* JADX INFO: renamed from: y */
    public static void m214706y() {
        zvf0.m220396r("e_first_dislike_popup_cancel_button", "p_first_dislike_popup_view");
        f198187v.m109035k();
        f198187v.m109034j();
    }

    /* JADX INFO: renamed from: z */
    public static void m214707z() {
        f198187v.m109039o(m214692m(vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "alert_self_definition_basic"), vwb.m200311Y("tooltips_trigger_module", "card"), vwb.m200311Y("tooltips_trigger_page", "swipe_page"), vwb.m200311Y("tooltips_trigger_reason", "swipe")));
        f198187v.m109033i();
        f198187v.m109036l();
    }
}
