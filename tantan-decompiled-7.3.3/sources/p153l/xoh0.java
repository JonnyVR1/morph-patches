package p153l;

import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.core.data.UserId;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class xoh0 {

    /* JADX INFO: renamed from: a */
    public l4g0 f195575a = new l4g0("p_sys_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: b */
    public l4g0 f195576b = new l4g0("p_prompt_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: c */
    public l4g0 f195577c = new l4g0("p_second_prompt_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: a */
    public void m212466a(boolean z) {
        i4g0.m138495D("e_album_auth_success", "", jyb.m147494Y(UserId.TYPE, AccountModule.m29130F().userId()), jyb.m147494Y("user_auth", z ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public JSONObject m212467b(pf60... pf60VarArr) {
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

    /* JADX INFO: renamed from: c */
    public void m212468c(String str) {
        i4g0.m138523u("e_prompt_album_auth_popup_open_button", "p_prompt_album_auth_popup_view", jyb.m147494Y("auth_source", str));
        this.f195576b.m152776k();
        this.f195576b.m152775j();
    }

    /* JADX INFO: renamed from: d */
    public void m212469d(String str) {
        i4g0.m138523u("e_prompt_album_auth_popup_close_button", "p_prompt_album_auth_popup_view", jyb.m147494Y("auth_source", str));
        this.f195576b.m152776k();
        this.f195576b.m152775j();
    }

    /* JADX INFO: renamed from: e */
    public void m212470e(String str) {
        this.f195576b.m152780o(m212467b(jyb.m147494Y("auth_source", str), jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "system_alert"), jyb.m147494Y("tooltips_trigger_module", "null"), jyb.m147494Y("tooltips_trigger_page", "media_page"), jyb.m147494Y("tooltips_trigger_reason", "no_permission_photo")));
        this.f195576b.m152774i();
        this.f195576b.m152777l();
    }

    /* JADX INFO: renamed from: f */
    public void m212471f(String str) {
        i4g0.m138523u("e_second_prompt_album_auth_popup_open_button", "p_second_prompt_album_auth_popup_view", jyb.m147494Y("auth_source", str));
        this.f195577c.m152776k();
        this.f195577c.m152775j();
    }

    /* JADX INFO: renamed from: g */
    public void m212472g(String str) {
        i4g0.m138523u("e_second_prompt_album_auth_popup_close_button", "p_second_prompt_album_auth_popup_view", jyb.m147494Y("auth_source", str));
        this.f195577c.m152776k();
        this.f195577c.m152775j();
    }

    /* JADX INFO: renamed from: h */
    public void m212473h(String str) {
        this.f195577c.m152780o(m212467b(jyb.m147494Y("auth_source", str), jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "system_alert"), jyb.m147494Y("tooltips_trigger_module", "null"), jyb.m147494Y("tooltips_trigger_page", "media_page"), jyb.m147494Y("tooltips_trigger_reason", "no_permission_storage")));
        this.f195577c.m152774i();
        this.f195577c.m152777l();
    }

    /* JADX INFO: renamed from: i */
    public void m212474i(String str) {
        i4g0.m138523u("e_sys_album_auth_popup_allowed_button", "p_sys_album_auth_popup_view", jyb.m147494Y("auth_source", str));
        this.f195575a.m152776k();
        this.f195575a.m152775j();
        m212466a(true);
    }

    /* JADX INFO: renamed from: j */
    public void m212475j(String str, boolean z) {
        i4g0.m138523u("e_sys_album_auth_popup_denied_button", "p_sys_album_auth_popup_view", jyb.m147494Y("auth_source", str), jyb.m147494Y("no_longer_ask", z ? "on" : BLiveOperationTitleShowType.off));
        this.f195575a.m152776k();
        this.f195575a.m152775j();
        m212466a(false);
    }

    /* JADX INFO: renamed from: k */
    public void m212476k(String str) {
        this.f195575a.m152780o(m212467b(jyb.m147494Y("auth_source", str), jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "system_alert"), jyb.m147494Y("tooltips_trigger_module", "null"), jyb.m147494Y("tooltips_trigger_page", "media_page"), jyb.m147494Y("tooltips_trigger_reason", "no_permission_photo")));
        this.f195575a.m152774i();
        this.f195575a.m152777l();
    }
}
