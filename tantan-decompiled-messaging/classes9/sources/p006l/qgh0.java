package p006l;

import com.p000p1.mobile.putong.account.AccountModule;
import com.p1.mobile.android.app.Dialog;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.j760;
import l.sm80;
import l.vwb;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qgh0 {

    /* JADX INFO: renamed from: a */
    public cwf0 f19738a = new cwf0("p_sys_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: b */
    public cwf0 f19739b = new cwf0("p_prompt_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: c */
    public cwf0 f19740c = new cwf0("p_second_prompt_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: a */
    public void m22032a(boolean z) {
        zvf0.D("e_album_auth_success", "", new j760[]{vwb.Y("userid", AccountModule.m26F().userId()), vwb.Y("user_auth", z ? "on" : "off")});
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m22033b(j760... j760VarArr) {
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

    /* JADX INFO: renamed from: c */
    public void m22034c(String str) {
        zvf0.u("e_prompt_album_auth_popup_open_button", "p_prompt_album_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        this.f19739b.k();
        this.f19739b.j();
    }

    /* JADX INFO: renamed from: d */
    public void m22035d(String str) {
        zvf0.u("e_prompt_album_auth_popup_close_button", "p_prompt_album_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        this.f19739b.k();
        this.f19739b.j();
    }

    /* JADX INFO: renamed from: e */
    public void m22036e(String str) {
        this.f19739b.o(m22033b(vwb.Y("auth_source", str), vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "system_alert"), vwb.Y("tooltips_trigger_module", "null"), vwb.Y("tooltips_trigger_page", "media_page"), vwb.Y("tooltips_trigger_reason", "no_permission_photo")));
        this.f19739b.i();
        this.f19739b.l();
    }

    /* JADX INFO: renamed from: f */
    public void m22037f(String str) {
        zvf0.u("e_second_prompt_album_auth_popup_open_button", "p_second_prompt_album_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        this.f19740c.k();
        this.f19740c.j();
    }

    /* JADX INFO: renamed from: g */
    public void m22038g(String str) {
        zvf0.u("e_second_prompt_album_auth_popup_close_button", "p_second_prompt_album_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        this.f19740c.k();
        this.f19740c.j();
    }

    /* JADX INFO: renamed from: h */
    public void m22039h(String str) {
        this.f19740c.o(m22033b(vwb.Y("auth_source", str), vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "system_alert"), vwb.Y("tooltips_trigger_module", "null"), vwb.Y("tooltips_trigger_page", "media_page"), vwb.Y("tooltips_trigger_reason", "no_permission_storage")));
        this.f19740c.i();
        this.f19740c.l();
    }

    /* JADX INFO: renamed from: i */
    public void m22040i(String str) {
        zvf0.u("e_sys_album_auth_popup_allowed_button", "p_sys_album_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        this.f19738a.k();
        this.f19738a.j();
        m22032a(true);
    }

    /* JADX INFO: renamed from: j */
    public void m22041j(String str, boolean z) {
        zvf0.u("e_sys_album_auth_popup_denied_button", "p_sys_album_auth_popup_view", new j760[]{vwb.Y("auth_source", str), vwb.Y("no_longer_ask", z ? "on" : "off")});
        this.f19738a.k();
        this.f19738a.j();
        m22032a(false);
    }

    /* JADX INFO: renamed from: k */
    public void m22042k(String str) {
        this.f19738a.o(m22033b(vwb.Y("auth_source", str), vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "system_alert"), vwb.Y("tooltips_trigger_module", "null"), vwb.Y("tooltips_trigger_page", "media_page"), vwb.Y("tooltips_trigger_reason", "no_permission_photo")));
        this.f19738a.i();
        this.f19738a.l();
    }
}
