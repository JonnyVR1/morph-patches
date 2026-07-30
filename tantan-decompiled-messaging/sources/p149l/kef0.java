package p149l;

import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.core.data.UserId;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;

/* JADX INFO: loaded from: classes9.dex */
public class kef0 {

    /* JADX INFO: renamed from: a */
    public cwf0 f122700a = new cwf0("p_sys_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: b */
    public cwf0 f122701b = new cwf0("p_prompt_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: c */
    public cwf0 f122702c = new cwf0("p_second_prompt_album_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: a */
    public void m145772a(boolean z) {
        zvf0.m220371D("e_album_auth_success", "", vwb.m200311Y(UserId.TYPE, AccountModule.m28131F().userId()), vwb.m200311Y("user_auth", z ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: b */
    public void m145773b(String str) {
        zvf0.m220399u("e_prompt_album_auth_popup_open_button", "p_prompt_album_auth_popup_view", vwb.m200311Y("auth_source", str));
        this.f122701b.m109035k();
        this.f122701b.m109034j();
    }

    /* JADX INFO: renamed from: c */
    public void m145774c(String str) {
        zvf0.m220399u("e_prompt_album_auth_popup_close_button", "p_prompt_album_auth_popup_view", vwb.m200311Y("auth_source", str));
        this.f122701b.m109035k();
        this.f122701b.m109034j();
    }

    /* JADX INFO: renamed from: d */
    public void m145775d(String str) {
        this.f122701b.m109040p(vwb.m200311Y("auth_source", str), vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "system_alert"), vwb.m200311Y("tooltips_trigger_module", "null"), vwb.m200311Y("tooltips_trigger_page", "media_page"), vwb.m200311Y("tooltips_trigger_reason", "no_permission_photo"));
        this.f122701b.m109033i();
        this.f122701b.m109036l();
    }

    /* JADX INFO: renamed from: e */
    public void m145776e(String str) {
        zvf0.m220399u("e_second_prompt_album_auth_popup_open_button", "p_second_prompt_album_auth_popup_view", vwb.m200311Y("auth_source", str));
        this.f122702c.m109035k();
        this.f122702c.m109034j();
    }

    /* JADX INFO: renamed from: f */
    public void m145777f(String str) {
        zvf0.m220399u("e_second_prompt_album_auth_popup_close_button", "p_second_prompt_album_auth_popup_view", vwb.m200311Y("auth_source", str));
        this.f122702c.m109035k();
        this.f122702c.m109034j();
    }

    /* JADX INFO: renamed from: g */
    public void m145778g(String str) {
        this.f122702c.m109040p(vwb.m200311Y("auth_source", str), vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "system_alert"), vwb.m200311Y("tooltips_trigger_module", "null"), vwb.m200311Y("tooltips_trigger_page", "media_page"), vwb.m200311Y("tooltips_trigger_reason", "no_permission_storage"));
        this.f122702c.m109033i();
        this.f122702c.m109036l();
    }

    /* JADX INFO: renamed from: h */
    public void m145779h(String str) {
        zvf0.m220399u("e_sys_album_auth_popup_allowed_button", "p_sys_album_auth_popup_view", vwb.m200311Y("auth_source", str));
        this.f122700a.m109035k();
        this.f122700a.m109034j();
        m145772a(true);
    }

    /* JADX INFO: renamed from: i */
    public void m145780i(String str, boolean z) {
        zvf0.m220399u("e_sys_album_auth_popup_denied_button", "p_sys_album_auth_popup_view", vwb.m200311Y("auth_source", str), vwb.m200311Y("no_longer_ask", z ? "on" : BLiveOperationTitleShowType.off));
        this.f122700a.m109035k();
        this.f122700a.m109034j();
    }

    /* JADX INFO: renamed from: j */
    public void m145781j(String str) {
        this.f122700a.m109040p(vwb.m200311Y("auth_source", str), vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "system_alert"), vwb.m200311Y("tooltips_trigger_module", "null"), vwb.m200311Y("tooltips_trigger_page", "media_page"), vwb.m200311Y("tooltips_trigger_reason", "no_permission_photo"));
        this.f122700a.m109033i();
        this.f122700a.m109036l();
    }
}
