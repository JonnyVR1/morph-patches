package p149l;

import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.core.data.UserId;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class qgh0 {

    /* JADX INFO: renamed from: a */
    public cwf0 f154336a = new cwf0("p_sys_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: b */
    public cwf0 f154337b = new cwf0("p_prompt_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: c */
    public cwf0 f154338c = new cwf0("p_second_prompt_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: a */
    public void m174413a(boolean z) {
        zvf0.m220371D("e_album_auth_success", "", vwb.m200311Y(UserId.TYPE, AccountModule.m28131F().userId()), vwb.m200311Y("user_auth", z ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public JSONObject m174414b(j760... j760VarArr) {
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

    /* JADX INFO: renamed from: c */
    public void m174415c(String str) {
        zvf0.m220399u("e_prompt_album_auth_popup_open_button", "p_prompt_album_auth_popup_view", vwb.m200311Y("auth_source", str));
        this.f154337b.m109035k();
        this.f154337b.m109034j();
    }

    /* JADX INFO: renamed from: d */
    public void m174416d(String str) {
        zvf0.m220399u("e_prompt_album_auth_popup_close_button", "p_prompt_album_auth_popup_view", vwb.m200311Y("auth_source", str));
        this.f154337b.m109035k();
        this.f154337b.m109034j();
    }

    /* JADX INFO: renamed from: e */
    public void m174417e(String str) {
        this.f154337b.m109039o(m174414b(vwb.m200311Y("auth_source", str), vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "system_alert"), vwb.m200311Y("tooltips_trigger_module", "null"), vwb.m200311Y("tooltips_trigger_page", "media_page"), vwb.m200311Y("tooltips_trigger_reason", "no_permission_photo")));
        this.f154337b.m109033i();
        this.f154337b.m109036l();
    }

    /* JADX INFO: renamed from: f */
    public void m174418f(String str) {
        zvf0.m220399u("e_second_prompt_album_auth_popup_open_button", "p_second_prompt_album_auth_popup_view", vwb.m200311Y("auth_source", str));
        this.f154338c.m109035k();
        this.f154338c.m109034j();
    }

    /* JADX INFO: renamed from: g */
    public void m174419g(String str) {
        zvf0.m220399u("e_second_prompt_album_auth_popup_close_button", "p_second_prompt_album_auth_popup_view", vwb.m200311Y("auth_source", str));
        this.f154338c.m109035k();
        this.f154338c.m109034j();
    }

    /* JADX INFO: renamed from: h */
    public void m174420h(String str) {
        this.f154338c.m109039o(m174414b(vwb.m200311Y("auth_source", str), vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "system_alert"), vwb.m200311Y("tooltips_trigger_module", "null"), vwb.m200311Y("tooltips_trigger_page", "media_page"), vwb.m200311Y("tooltips_trigger_reason", "no_permission_storage")));
        this.f154338c.m109033i();
        this.f154338c.m109036l();
    }

    /* JADX INFO: renamed from: i */
    public void m174421i(String str) {
        zvf0.m220399u("e_sys_album_auth_popup_allowed_button", "p_sys_album_auth_popup_view", vwb.m200311Y("auth_source", str));
        this.f154336a.m109035k();
        this.f154336a.m109034j();
        m174413a(true);
    }

    /* JADX INFO: renamed from: j */
    public void m174422j(String str, boolean z) {
        zvf0.m220399u("e_sys_album_auth_popup_denied_button", "p_sys_album_auth_popup_view", vwb.m200311Y("auth_source", str), vwb.m200311Y("no_longer_ask", z ? "on" : BLiveOperationTitleShowType.off));
        this.f154336a.m109035k();
        this.f154336a.m109034j();
        m174413a(false);
    }

    /* JADX INFO: renamed from: k */
    public void m174423k(String str) {
        this.f154336a.m109039o(m174414b(vwb.m200311Y("auth_source", str), vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "system_alert"), vwb.m200311Y("tooltips_trigger_module", "null"), vwb.m200311Y("tooltips_trigger_page", "media_page"), vwb.m200311Y("tooltips_trigger_reason", "no_permission_photo")));
        this.f154336a.m109033i();
        this.f154336a.m109036l();
    }
}
