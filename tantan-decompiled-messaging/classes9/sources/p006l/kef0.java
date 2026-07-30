package p006l;

import com.p000p1.mobile.putong.account.AccountModule;
import com.p1.mobile.android.app.Dialog;
import l.cwf0;
import l.j760;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class kef0 {

    /* JADX INFO: renamed from: a */
    public cwf0 f15787a = new cwf0("p_sys_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: b */
    public cwf0 f15788b = new cwf0("p_prompt_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: c */
    public cwf0 f15789c = new cwf0("p_second_prompt_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: a */
    public void m18107a(boolean z) {
        zvf0.D("e_album_auth_success", "", new j760[]{vwb.Y("userid", AccountModule.m26F().userId()), vwb.Y("user_auth", z ? "on" : "off")});
    }

    /* JADX INFO: renamed from: b */
    public void m18108b(String str) {
        zvf0.u("e_prompt_album_auth_popup_open_button", "p_prompt_album_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        this.f15788b.k();
        this.f15788b.j();
    }

    /* JADX INFO: renamed from: c */
    public void m18109c(String str) {
        zvf0.u("e_prompt_album_auth_popup_close_button", "p_prompt_album_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        this.f15788b.k();
        this.f15788b.j();
    }

    /* JADX INFO: renamed from: d */
    public void m18110d(String str) {
        this.f15788b.p(new j760[]{vwb.Y("auth_source", str), vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "system_alert"), vwb.Y("tooltips_trigger_module", "null"), vwb.Y("tooltips_trigger_page", "media_page"), vwb.Y("tooltips_trigger_reason", "no_permission_photo")});
        this.f15788b.i();
        this.f15788b.l();
    }

    /* JADX INFO: renamed from: e */
    public void m18111e(String str) {
        zvf0.u("e_second_prompt_album_auth_popup_open_button", "p_second_prompt_album_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        this.f15789c.k();
        this.f15789c.j();
    }

    /* JADX INFO: renamed from: f */
    public void m18112f(String str) {
        zvf0.u("e_second_prompt_album_auth_popup_close_button", "p_second_prompt_album_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        this.f15789c.k();
        this.f15789c.j();
    }

    /* JADX INFO: renamed from: g */
    public void m18113g(String str) {
        this.f15789c.p(new j760[]{vwb.Y("auth_source", str), vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "system_alert"), vwb.Y("tooltips_trigger_module", "null"), vwb.Y("tooltips_trigger_page", "media_page"), vwb.Y("tooltips_trigger_reason", "no_permission_storage")});
        this.f15789c.i();
        this.f15789c.l();
    }

    /* JADX INFO: renamed from: h */
    public void m18114h(String str) {
        zvf0.u("e_sys_album_auth_popup_allowed_button", "p_sys_album_auth_popup_view", new j760[]{vwb.Y("auth_source", str)});
        this.f15787a.k();
        this.f15787a.j();
        m18107a(true);
    }

    /* JADX INFO: renamed from: i */
    public void m18115i(String str, boolean z) {
        zvf0.u("e_sys_album_auth_popup_denied_button", "p_sys_album_auth_popup_view", new j760[]{vwb.Y("auth_source", str), vwb.Y("no_longer_ask", z ? "on" : "off")});
        this.f15787a.k();
        this.f15787a.j();
    }

    /* JADX INFO: renamed from: j */
    public void m18116j(String str) {
        this.f15787a.p(new j760[]{vwb.Y("auth_source", str), vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "system_alert"), vwb.Y("tooltips_trigger_module", "null"), vwb.Y("tooltips_trigger_page", "media_page"), vwb.Y("tooltips_trigger_reason", "no_permission_photo")});
        this.f15787a.i();
        this.f15787a.l();
    }
}
