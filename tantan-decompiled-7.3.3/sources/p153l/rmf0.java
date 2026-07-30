package p153l;

import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.core.data.UserId;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;

/* JADX INFO: loaded from: classes9.dex */
public class rmf0 {

    /* JADX INFO: renamed from: a */
    public l4g0 f163864a = new l4g0("p_sys_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: b */
    public l4g0 f163865b = new l4g0("p_prompt_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: c */
    public l4g0 f163866c = new l4g0("p_second_prompt_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: a */
    public void m182065a(boolean z) {
        i4g0.m138495D("e_album_auth_success", "", jyb.m147494Y(UserId.TYPE, AccountModule.m29130F().userId()), jyb.m147494Y("user_auth", z ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: b */
    public void m182066b(String str) {
        i4g0.m138523u("e_prompt_album_auth_popup_open_button", "p_prompt_album_auth_popup_view", jyb.m147494Y("auth_source", str));
        this.f163865b.m152776k();
        this.f163865b.m152775j();
    }

    /* JADX INFO: renamed from: c */
    public void m182067c(String str) {
        i4g0.m138523u("e_prompt_album_auth_popup_close_button", "p_prompt_album_auth_popup_view", jyb.m147494Y("auth_source", str));
        this.f163865b.m152776k();
        this.f163865b.m152775j();
    }

    /* JADX INFO: renamed from: d */
    public void m182068d(String str) {
        this.f163865b.m152781p(jyb.m147494Y("auth_source", str), jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "system_alert"), jyb.m147494Y("tooltips_trigger_module", "null"), jyb.m147494Y("tooltips_trigger_page", "media_page"), jyb.m147494Y("tooltips_trigger_reason", "no_permission_photo"));
        this.f163865b.m152774i();
        this.f163865b.m152777l();
    }

    /* JADX INFO: renamed from: e */
    public void m182069e(String str) {
        i4g0.m138523u("e_second_prompt_album_auth_popup_open_button", "p_second_prompt_album_auth_popup_view", jyb.m147494Y("auth_source", str));
        this.f163866c.m152776k();
        this.f163866c.m152775j();
    }

    /* JADX INFO: renamed from: f */
    public void m182070f(String str) {
        i4g0.m138523u("e_second_prompt_album_auth_popup_close_button", "p_second_prompt_album_auth_popup_view", jyb.m147494Y("auth_source", str));
        this.f163866c.m152776k();
        this.f163866c.m152775j();
    }

    /* JADX INFO: renamed from: g */
    public void m182071g(String str) {
        this.f163866c.m152781p(jyb.m147494Y("auth_source", str), jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "system_alert"), jyb.m147494Y("tooltips_trigger_module", "null"), jyb.m147494Y("tooltips_trigger_page", "media_page"), jyb.m147494Y("tooltips_trigger_reason", "no_permission_storage"));
        this.f163866c.m152774i();
        this.f163866c.m152777l();
    }

    /* JADX INFO: renamed from: h */
    public void m182072h(String str) {
        i4g0.m138523u("e_sys_album_auth_popup_allowed_button", "p_sys_album_auth_popup_view", jyb.m147494Y("auth_source", str));
        this.f163864a.m152776k();
        this.f163864a.m152775j();
        m182065a(true);
    }

    /* JADX INFO: renamed from: i */
    public void m182073i(String str, boolean z) {
        i4g0.m138523u("e_sys_album_auth_popup_denied_button", "p_sys_album_auth_popup_view", jyb.m147494Y("auth_source", str), jyb.m147494Y("no_longer_ask", z ? "on" : BLiveOperationTitleShowType.off));
        this.f163864a.m152776k();
        this.f163864a.m152775j();
    }

    /* JADX INFO: renamed from: j */
    public void m182074j(String str) {
        this.f163864a.m152781p(jyb.m147494Y("auth_source", str), jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "system_alert"), jyb.m147494Y("tooltips_trigger_module", "null"), jyb.m147494Y("tooltips_trigger_page", "media_page"), jyb.m147494Y("tooltips_trigger_reason", "no_permission_photo"));
        this.f163864a.m152774i();
        this.f163864a.m152777l();
    }
}
