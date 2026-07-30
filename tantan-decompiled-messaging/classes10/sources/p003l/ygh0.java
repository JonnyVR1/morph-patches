package p003l;

import android.os.Build;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.MessageType;
import com.p000p1.mobile.putong.core.data.PaymentPlatform;
import com.p000p1.mobile.putong.core.data.UserId;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import l.cwf0;
import l.ic50;
import l.j760;
import l.l3f;
import l.sm80;
import l.u4e;
import l.vwb;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ygh0 {

    /* JADX INFO: renamed from: a */
    public static String f9032a = "signup";

    /* JADX INFO: renamed from: b */
    public static String f9033b = "profile";

    /* JADX INFO: renamed from: c */
    public static String f9034c = "message";

    /* JADX INFO: renamed from: d */
    public static String f9035d = "moments";

    /* JADX INFO: renamed from: e */
    public static String f9036e = "student_certification";

    /* JADX INFO: renamed from: f */
    public static String f9037f = "feedback";

    /* JADX INFO: renamed from: g */
    public static String f9038g = "fake";

    /* JADX INFO: renamed from: h */
    public static String f9039h = "home";

    /* JADX INFO: renamed from: i */
    public static cwf0 f9040i = new cwf0("p_sys_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: j */
    public static cwf0 f9041j = new cwf0("p_prompt_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: k */
    public static cwf0 f9042k = new cwf0("p_second_prompt_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: l */
    public static cwf0 f9043l = new cwf0("p_sys_location_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: m */
    public static cwf0 f9044m = new cwf0("p_privacy_setting_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: n */
    public static cwf0 f9045n = new cwf0("p_sys_address_book_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: o */
    public static cwf0 f9046o = new cwf0("p_prompt_address_book_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: p */
    public static cwf0 f9047p = new cwf0("p_second_prompt_address_book_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: q */
    public static cwf0 f9048q = new cwf0("p_prompt_notification_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: r */
    public static cwf0 f9049r = new cwf0("p_sys_phone_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: s */
    public static cwf0 f9050s = new cwf0("p_prompt_phone_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: t */
    public static cwf0 f9051t = new cwf0("p_second_prompt_phone_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: u */
    public static cwf0 f9052u = new cwf0("p_first_like_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: v */
    public static cwf0 f9053v = new cwf0("p_first_dislike_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: w */
    public static cwf0 f9054w = new cwf0("p_fake_alert_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: x */
    public static cwf0 f9055x = new cwf0("p_fake_submit_new_image_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: y */
    public static cwf0 f9056y = new cwf0("p_forbidden_good_to_fake_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: z */
    public static cwf0 f9057z = new cwf0("p_binding_phone_number_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: A */
    public static cwf0 f9031A = new cwf0("p_fake_avatar_star", Dialog.class.getName());

    /* JADX INFO: renamed from: A */
    public static void m11177A() {
        zvf0.r("e_first_like_popup_confirm_button", "p_first_like_popup_view");
        f9052u.k();
        f9052u.j();
    }

    /* JADX INFO: renamed from: B */
    public static void m11178B() {
        zvf0.r("e_first_like_popup_cancel_button", "p_first_like_popup_view");
        f9052u.k();
        f9052u.j();
    }

    /* JADX INFO: renamed from: C */
    public static void m11179C() {
        f9052u.o(m11227m(vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "alert_self_definition_basic"), vwb.Y("tooltips_trigger_module", "card"), vwb.Y("tooltips_trigger_page", "swipe_page"), vwb.Y("tooltips_trigger_reason", "swipe")));
        f9052u.i();
        f9052u.l();
    }

    /* JADX INFO: renamed from: D */
    public static void m11180D() {
        zvf0.r("e_forbidden_good_to_fake_popup_keep_button", "p_forbidden_good_to_fake_popup_view");
        f9056y.k();
        f9056y.j();
    }

    /* JADX INFO: renamed from: E */
    public static void m11181E() {
        f9056y.o(u4e.b("passive", "alert", "alert_self_definition_basic", "null", "swipe_page", MessageType.exchange_picture));
        f9056y.i();
        f9056y.l();
    }

    /* JADX INFO: renamed from: F */
    public static void m11182F() {
        zvf0.r("e_forbidden_good_to_fake_popup_upload_button", "p_forbidden_good_to_fake_popup_view");
        f9056y.k();
        f9056y.j();
    }

    /* JADX INFO: renamed from: G */
    public static void m11183G() {
        zvf0.D("e_forbidden_good_to_fake_upload_newavatar_success", "", new j760[]{vwb.Y(UserId.TYPE, ((DbObject) CoreModule.c.e0.p9()).id)});
    }

    /* JADX INFO: renamed from: H */
    public static void m11184H(boolean z) {
        String str;
        j760 j760VarY = vwb.Y(UserId.TYPE, CoreModule.H().userId());
        if (z) {
            str = (Build.VERSION.SDK_INT < 29 || PermissionHelper.b(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"})) ? "on" : "wheninuse";
        } else {
            str = "off";
        }
        zvf0.D("e_location_auth_success", "", new j760[]{j760VarY, vwb.Y("user_auth", str)});
    }

    /* JADX INFO: renamed from: I */
    public static void m11185I() {
        zvf0.r("e_prompt_notification_auth_popup_open_button", "p_prompt_notification_auth_popup_view");
        f9048q.k();
        f9048q.j();
        m11186J(true);
    }

    /* JADX INFO: renamed from: J */
    public static void m11186J(boolean z) {
        zvf0.D("e_notification_auth_success", "", new j760[]{vwb.Y(UserId.TYPE, CoreModule.H().userId()), vwb.Y("user_auth", z ? "on" : "off")});
    }

    /* JADX INFO: renamed from: K */
    public static void m11187K() {
        zvf0.r("e_chat_prompt_notification_auth_banner_open_button", "p_chat_view");
    }

    /* JADX INFO: renamed from: L */
    public static void m11188L() {
        zvf0.x("e_chat_prompt_notification_auth_banner_open_button", "p_chat_view");
    }

    /* JADX INFO: renamed from: M */
    public static void m11189M() {
        zvf0.r("e_prompt_notification_auth_popup_close_button", "p_prompt_notification_auth_popup_view");
        f9048q.k();
        f9048q.j();
    }

    /* JADX INFO: renamed from: N */
    public static void m11190N() {
        f9048q.o(ic50.j().f().U(OmsDialog.p_prompt_notification_auth_popup_view.getIdentifier(), u4e.b("passive", "alert", "alert_self_definition_basic", "null", "anywhere", "no_permission_notice")));
        f9048q.i();
        f9048q.l();
    }

    /* JADX INFO: renamed from: O */
    public static void m11191O() {
        String str;
        String str2 = CoreModule.c.e0.p9().settings.phoneNumber.number;
        if (TEnum.equals(CoreModule.c.e0.p9().source, PaymentPlatform.wechat)) {
            str = TextUtils.isEmpty(str2) ? "only_wechat" : "phone_number_wechat";
        } else {
            str = "only_phone_number";
        }
        j760 j760VarY = vwb.Y(UserId.TYPE, ((DbObject) CoreModule.c.e0.p9()).id);
        j760 j760VarY2 = vwb.Y("phone_number_type", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        zvf0.D("e_phone_number_success", "", new j760[]{j760VarY, j760VarY2, vwb.Y("phone_num", str2)});
    }

    /* JADX INFO: renamed from: P */
    public static void m11192P(boolean z) {
        f9044m.o(m11227m(vwb.Y("get_phone_number", z ? "on" : "off")));
        f9044m.i();
        f9044m.l();
    }

    /* JADX INFO: renamed from: Q */
    public static void m11193Q(boolean z, boolean z2, boolean z3) {
        zvf0.u("e_privacy_setting_popup_start_button", "p_privacy_setting_popup_view", new j760[]{vwb.Y("block_contacts", z ? "on" : "off"), vwb.Y("common_contacts", z2 ? "on" : "off"), vwb.Y("binding_phone_number", z3 ? "on" : "off")});
        f9044m.k();
        f9044m.j();
    }

    /* JADX INFO: renamed from: R */
    public static void m11194R(String str) {
        zvf0.u("e_prompt_address_book_auth_popup_open_button", "p_prompt_address_book_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        f9046o.k();
        f9046o.j();
    }

    /* JADX INFO: renamed from: S */
    public static void m11195S(String str) {
        zvf0.u("e_prompt_address_book_auth_popup_close_button", "p_prompt_address_book_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        f9046o.k();
        f9046o.j();
    }

    /* JADX INFO: renamed from: T */
    public static void m11196T(String str) {
        f9046o.o(m11227m(vwb.Y("auth_source", str), vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "system_alert"), vwb.Y("tooltips_trigger_module", "null"), vwb.Y("tooltips_trigger_page", "logon_page"), vwb.Y("tooltips_trigger_reason", "no_permission_mail_list")));
        f9046o.i();
        f9046o.l();
    }

    /* JADX INFO: renamed from: U */
    public static void m11197U(String str) {
        zvf0.u("e_prompt_album_auth_popup_open_button", "p_prompt_album_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        f9041j.k();
        f9041j.j();
    }

    /* JADX INFO: renamed from: V */
    public static void m11198V(String str) {
        zvf0.u("e_prompt_album_auth_popup_close_button", "p_prompt_album_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        f9041j.k();
        f9041j.j();
    }

    /* JADX INFO: renamed from: W */
    public static void m11199W(String str) {
        f9041j.o(m11227m(vwb.Y("auth_source", str), vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "system_alert"), vwb.Y("tooltips_trigger_module", "null"), vwb.Y("tooltips_trigger_page", "media_page"), vwb.Y("tooltips_trigger_reason", "no_permission_photo")));
        f9041j.i();
        f9041j.l();
    }

    /* JADX INFO: renamed from: X */
    public static void m11200X(String str) {
        zvf0.u("e_second_prompt_address_book_auth_popup_open_button", "p_second_prompt_address_book_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        f9047p.k();
        f9047p.j();
    }

    /* JADX INFO: renamed from: Y */
    public static void m11201Y(String str) {
        zvf0.u("e_second_prompt_address_book_auth_popup_close_button", "p_second_prompt_address_book_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        f9047p.k();
        f9047p.j();
    }

    /* JADX INFO: renamed from: Z */
    public static void m11202Z(String str) {
        f9047p.o(m11227m(vwb.Y("auth_source", str), vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "system_alert"), vwb.Y("tooltips_trigger_module", "null"), vwb.Y("tooltips_trigger_page", "logon_page"), vwb.Y("tooltips_trigger_reason", "no_permission_mail_list")));
        f9047p.i();
        f9047p.l();
    }

    /* JADX INFO: renamed from: a */
    public static void m11203a(boolean z) {
        zvf0.D("e_address_book_auth_success", "", new j760[]{vwb.Y(UserId.TYPE, CoreModule.H().userId()), vwb.Y("user_auth", z ? "on" : "off")});
    }

    /* JADX INFO: renamed from: a0 */
    public static void m11204a0(String str) {
        zvf0.u("e_second_prompt_album_auth_popup_open_button", "p_second_prompt_album_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        f9042k.k();
        f9042k.j();
    }

    /* JADX INFO: renamed from: b */
    public static void m11205b(boolean z) {
        zvf0.D("e_album_auth_success", "", new j760[]{vwb.Y(UserId.TYPE, CoreModule.H().userId()), vwb.Y("user_auth", z ? "on" : "off")});
    }

    /* JADX INFO: renamed from: b0 */
    public static void m11206b0(String str) {
        zvf0.u("e_second_prompt_album_auth_popup_close_button", "p_second_prompt_album_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        f9042k.k();
        f9042k.j();
    }

    /* JADX INFO: renamed from: c */
    public static void m11207c(String str) {
        zvf0.u("e_binding_phone_number_popup_binding_button", "p_binding_phone_number_popup_view", new j760[]{vwb.Y("skipable", str)});
    }

    /* JADX INFO: renamed from: c0 */
    public static void m11208c0(String str) {
        f9042k.o(m11227m(vwb.Y("auth_source", str), vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "system_alert"), vwb.Y("tooltips_trigger_module", "null"), vwb.Y("tooltips_trigger_page", "media_page"), vwb.Y("tooltips_trigger_reason", "no_permission_storage")));
        f9042k.i();
        f9042k.l();
    }

    /* JADX INFO: renamed from: d */
    public static void m11209d(String str) {
        zvf0.u("e_binding_phone_number_popup_other_number_button", "p_binding_phone_number_popup_view", new j760[]{vwb.Y("skipable", str), vwb.Y("number_type", "one_click")});
    }

    /* JADX INFO: renamed from: d0 */
    public static void m11210d0(String str, JSONObject jSONObject) {
        l3f l3fVar = new l3f();
        l3fVar.s = str;
        l3fVar.d = EventNameEnum.SYS_CHECK;
        if (NullChecker.a(jSONObject)) {
            l3fVar.w = jSONObject;
        }
        zvf0.m(l3fVar);
    }

    /* JADX INFO: renamed from: e */
    public static void m11211e() {
        zvf0.u("e_binding_phone_number_popup_close_button", "p_binding_phone_number_popup_view", new j760[]{vwb.Y("skipable", "on")});
    }

    /* JADX INFO: renamed from: e0 */
    public static void m11212e0() {
        zvf0.r("e_suggest_users_home_page_location_button", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: f */
    public static void m11213f() {
        if (NullChecker.a(f9057z)) {
            f9057z.k();
            f9057z.j();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m11214f0(String str) {
        zvf0.u("e_sys_address_book_auth_popup_allowed_button", "p_sys_address_book_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        f9045n.k();
        f9045n.j();
        m11203a(true);
    }

    /* JADX INFO: renamed from: g */
    public static void m11215g(String str, String str2) {
        f9057z.o(ic50.j().f().U("p_binding_phone_number_popup_view", m11227m(vwb.Y("skipable", str), vwb.Y("number_type", str2), vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "alert_special"), vwb.Y("tooltips_trigger_module", "privacy_settings"), vwb.Y("tooltips_trigger_page", "swipe_page"), vwb.Y("tooltips_trigger_reason", "unbound_phone_number"))));
        f9057z.i();
        f9057z.l();
    }

    /* JADX INFO: renamed from: g0 */
    public static void m11216g0(String str, boolean z) {
        zvf0.u("e_sys_address_book_auth_popup_denied_button", "p_sys_address_book_auth_popup_view", new j760[]{vwb.Y("auth_source", str), vwb.Y("no_longer_ask", z ? "on" : "off")});
        f9045n.k();
        f9045n.j();
    }

    /* JADX INFO: renamed from: h */
    public static void m11217h(String str) {
        zvf0.u("e_binding_phone_number_popup_verification_code_button", "p_binding_phone_number_popup_view", new j760[]{vwb.Y("skipable", str)});
    }

    /* JADX INFO: renamed from: h0 */
    public static void m11218h0(String str) {
        f9045n.o(m11227m(vwb.Y("auth_source", str), vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "system_alert"), vwb.Y("tooltips_trigger_module", "null"), vwb.Y("tooltips_trigger_page", "logon_page"), vwb.Y("tooltips_trigger_reason", "no_permission_mail_list")));
        f9045n.i();
        f9045n.l();
    }

    /* JADX INFO: renamed from: i */
    public static void m11219i(boolean z) {
        m11210d0("e_binding_phone_number_popup_binding_phone_number_success_failed", m11227m(vwb.Y("skipable", z ? "off" : "on"), vwb.Y(UserId.TYPE, ((DbObject) CoreModule.c.e0.p9()).id)));
    }

    /* JADX INFO: renamed from: i0 */
    public static void m11220i0(String str) {
        zvf0.u("e_sys_album_auth_popup_allowed_button", "p_sys_album_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        f9040i.k();
        f9040i.j();
        m11205b(true);
    }

    /* JADX INFO: renamed from: j */
    public static void m11221j(boolean z, String str) {
        zvf0.D("e_binding_phone_number_popup_binding_phone_number_success", "", new j760[]{vwb.Y(UserId.TYPE, ((DbObject) CoreModule.c.e0.p9()).id), vwb.Y("skipable", z ? "off" : "on"), vwb.Y("phone_num", str)});
        m11191O();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m11222j0(String str, boolean z) {
        zvf0.u("e_sys_album_auth_popup_denied_button", "p_sys_album_auth_popup_view", new j760[]{vwb.Y("auth_source", str), vwb.Y("no_longer_ask", z ? "on" : "off")});
        f9040i.k();
        f9040i.j();
    }

    /* JADX INFO: renamed from: k */
    public static void m11223k() {
        zvf0.D("e_binding_phone_number_popup_signout_success", "", new j760[]{vwb.Y(UserId.TYPE, ((DbObject) CoreModule.c.e0.p9()).id)});
    }

    /* JADX INFO: renamed from: k0 */
    public static void m11224k0(String str) {
        f9040i.o(m11227m(vwb.Y("auth_source", str), vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "system_alert"), vwb.Y("tooltips_trigger_module", "null"), vwb.Y("tooltips_trigger_page", "media_page"), vwb.Y("tooltips_trigger_reason", "no_permission_photo")));
        f9040i.i();
        f9040i.l();
    }

    /* JADX INFO: renamed from: l */
    public static void m11225l() {
        zvf0.D("e_block_contacts_page_binding_phone_number_success", "", new j760[]{vwb.Y(UserId.TYPE, ((DbObject) CoreModule.c.e0.p9()).id), vwb.Y("phone_num", CoreModule.c.e0.p9().settings.phoneNumber.number)});
    }

    /* JADX INFO: renamed from: l0 */
    public static void m11226l0(String str) {
        zvf0.u("e_sys_location_auth_popup_allowed_button", "p_sys_location_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        f9043l.k();
        f9043l.j();
        m11184H(true);
    }

    /* JADX INFO: renamed from: m */
    public static JSONObject m11227m(j760... j760VarArr) {
        JSONObject jSONObject = null;
        if (NullChecker.a(j760VarArr) && j760VarArr.length > 0) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    for (j760 j760Var : j760VarArr) {
                        jSONObject2.put((String) j760Var.a, j760Var.b);
                    }
                    return jSONObject2;
                } catch (JSONException e) {
                    e = e;
                    jSONObject = jSONObject2;
                    CrashHelper.c(e);
                    sm80.b(e);
                    return jSONObject;
                }
            } catch (JSONException e2) {
                e = e2;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: m0 */
    public static void m11228m0(String str, String str2) {
        zvf0.u("e_sys_location_auth_popup_denied_button", "p_sys_location_auth_popup_view", new j760[]{vwb.Y("auth_source", str), vwb.Y("no_longer_ask", str2)});
        f9043l.k();
        f9043l.j();
    }

    /* JADX INFO: renamed from: n */
    public static void m11229n() {
        zvf0.r("e_fake_alert_popup_replace_button", "p_fake_alert_popup_view");
    }

    /* JADX INFO: renamed from: n0 */
    public static void m11230n0(String str) {
        f9043l.o(m11227m(vwb.Y("auth_source", str), vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "alert_self_definition_basic"), vwb.Y("tooltips_trigger_module", "null"), vwb.Y("tooltips_trigger_page", "logon_page"), vwb.Y("tooltips_trigger_reason", "get_location_permission")));
        f9043l.i();
        f9043l.l();
    }

    /* JADX INFO: renamed from: o */
    public static void m11231o() {
        f9054w.k();
        f9054w.j();
    }

    /* JADX INFO: renamed from: p */
    public static void m11232p(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "swipe_page";
        }
        JSONObject jSONObjectB = u4e.b("passive", "alert", "alert_self_definition_basic", "card", str, "swipe");
        try {
            if (CoreModule.c.e0.W7()) {
                jSONObjectB.put("fake_status", "gender");
            } else if (CoreModule.c.e0.k8()) {
                jSONObjectB.put("fake_status", "age");
            } else if (CoreModule.c.e0.Z7()) {
                jSONObjectB.put("fake_status", "unreal");
            } else if (CoreModule.c.e0.Y7()) {
                jSONObjectB.put("fake_status", "violation");
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
            e.printStackTrace();
        }
        f9054w.o(jSONObjectB);
        f9054w.i();
        f9054w.l();
    }

    /* JADX INFO: renamed from: q */
    public static void m11233q() {
        f9055x.k();
        f9055x.j();
    }

    /* JADX INFO: renamed from: r */
    public static void m11234r() {
        zvf0.r("e_fake_submit_new_image_popup_known_button", "p_fake_submit_new_image_popup_view");
    }

    /* JADX INFO: renamed from: s */
    public static void m11235s() {
        f9055x.o(u4e.b("passive", "alert", "alert_self_definition_basic", "null", "swipe_page", MessageType.exchange_picture));
        f9055x.i();
        f9055x.l();
    }

    /* JADX INFO: renamed from: t */
    public static void m11236t() {
        f9031A.k();
        f9031A.j();
    }

    /* JADX INFO: renamed from: u */
    public static void m11237u(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appeal_times", i);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        f9031A.o(jSONObject);
        f9031A.i();
        f9031A.l();
    }

    /* JADX INFO: renamed from: v */
    public static void m11238v() {
        m11239w("");
    }

    /* JADX INFO: renamed from: w */
    public static void m11239w(String str) {
        zvf0.D("e_fake_upload_newavatar_success", str, new j760[]{vwb.Y(UserId.TYPE, ((DbObject) CoreModule.c.e0.p9()).id)});
    }

    /* JADX INFO: renamed from: x */
    public static void m11240x() {
        zvf0.r("e_first_dislike_popup_confirm_button", "p_first_dislike_popup_view");
        f9053v.k();
        f9053v.j();
    }

    /* JADX INFO: renamed from: y */
    public static void m11241y() {
        zvf0.r("e_first_dislike_popup_cancel_button", "p_first_dislike_popup_view");
        f9053v.k();
        f9053v.j();
    }

    /* JADX INFO: renamed from: z */
    public static void m11242z() {
        f9053v.o(m11227m(vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "alert_self_definition_basic"), vwb.Y("tooltips_trigger_module", "card"), vwb.Y("tooltips_trigger_page", "swipe_page"), vwb.Y("tooltips_trigger_reason", "swipe")));
        f9053v.i();
        f9053v.l();
    }
}
