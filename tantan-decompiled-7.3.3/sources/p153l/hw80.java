package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p051p1.mobile.putong.core.p058ui.settings.MomentMutedAct;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserMomentSettings;
import com.p051p1.mobile.putong.data.UserPrivacySettings;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class hw80 extends ar2<ww80> {

    /* JADX INFO: renamed from: e */
    public static final String f111873e;

    /* JADX INFO: renamed from: f */
    public static boolean f111874f;

    /* JADX INFO: renamed from: a */
    public User f111875a;

    /* JADX INFO: renamed from: b */
    public Settings f111876b;

    /* JADX INFO: renamed from: c */
    public SettingGroups f111877c;

    /* JADX INFO: renamed from: d */
    public PrivacyMembershipSetting f111878d;

    static {
        f111873e = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/information/rec-proto/index.html");
        f111874f = false;
    }

    public hw80(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m137413G0(Bundle bundle) {
        ((ww80) this.viewModel).m208189R(act().getIntent().getStringExtra("from"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m137414I0(Boolean bool) {
        ((ww80) this.viewModel).m208202w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m137415J0(User user) {
        this.f111875a = user;
        if (this.f111876b == null) {
            this.f111876b = user.settings.mo225055clone();
        }
        ((ww80) this.viewModel).m208196Z(user, this.f111876b);
    }

    /* JADX INFO: renamed from: g1 */
    private void m137419g1() {
        m137421h1(false);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m137420h0(Throwable th) {
    }

    /* JADX INFO: renamed from: h1 */
    private void m137421h1(boolean z) {
        if (NullChecker.m82486a(this.f111875a) && NullChecker.m82486a(this.f111876b) && CoreModule.m30929H().signedIn_() && !this.f111876b.equals(this.f111875a.settings)) {
            SettingGroups settingGroups = new SettingGroups();
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            settingGroups.privacy = userPrivacySettings;
            userPrivacySettings.hideContacts = this.f111876b.hideContacts();
            settingGroups.privacy.hideMutualContacts = this.f111876b.hideMutualContacts();
            settingGroups.privacy.personalizeSuggest = this.f111876b.personalizeSuggest();
            settingGroups.privacy.adsSuggest = Boolean.valueOf(this.f111876b.personalizeAdsSuggest());
            settingGroups.privacy.heartbeatDisable = this.f111876b.heartbeatDisable();
            if (((ww80) this.viewModel).m208182B()) {
                settingGroups.privacy.hideSchool = this.f111876b.hideSchoolNameNoDefaults();
            }
            settingGroups.privacy.onlineReminder = this.f111876b.getOnlineReminder();
            settingGroups.privacy.unrepliedReminder = this.f111876b.unrepliedReminder();
            if (CoreModule.m30932N().mo61512Vg()) {
                UserMomentSettings userMomentSettingsNew_ = UserMomentSettings.new_();
                userMomentSettingsNew_.autoLike = this.f111876b.hideAutoLike();
                settingGroups.moment = userMomentSettingsNew_;
            }
            settingGroups.privacy.hidePublicMoments = this.f111876b.hidePublicMoment();
            settingGroups.live = this.f111876b.getSettingGroup().live;
            settingGroups.privacy.aiPictureEnable = this.f111876b.getAiPictureEnable();
            settingGroups.privacy.verifiedUserMsg = this.f111876b.justReceiveVeriUserMsg();
            if (settingGroups.marriage == null) {
                settingGroups.marriage = this.f111876b.getSettingGroup().marriage;
            }
            settingGroups.marriage.closeMode = this.f111876b.getSettingGroup().marriage.closeMode;
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f111875a.settings.getSettingGroup());
            if (NullChecker.m82486a(settingGroupsSubtract)) {
                ((ww80) this.viewModel).m208194W(act().getString(R$string.f18632L5), true);
                m137460f1(settingGroupsSubtract);
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m137430q0(Throwable th) {
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ Boolean m137431r0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m137436y0(View view) {
    }

    /* JADX INFO: renamed from: A0 */
    public void m137437A0(boolean z) {
        this.f111876b.getSettingGroup().privacy.hidePublicMoments = Boolean.valueOf(z);
        m137419g1();
    }

    /* JADX INFO: renamed from: C0 */
    public void m137438C0(boolean z) {
        this.f111876b.getSettingGroup().privacy.hideSchool = Boolean.valueOf(z);
        m137419g1();
    }

    /* JADX INFO: renamed from: D0 */
    public void m137439D0(boolean z) {
        this.f111877c.privacy.hideVIP = Boolean.valueOf(z);
        m137461i1();
        if (NullChecker.m82486a(this.f111878d)) {
            this.f111878d.hideIcon = Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m137440E0() {
        if (this.f111875a == null) {
            return false;
        }
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_auto_like");
            if (!TextUtils.isEmpty(strM80485F)) {
                JSONObject jSONObject = new JSONObject(strM80485F);
                return this.f111875a.isFemale() ? jSONObject.optBoolean("autoLikeFemale") : jSONObject.optBoolean("autoLikeMale");
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: F0 */
    public void m137441F0() {
        act().startActivity(WebViewAct.m81347a2(act(), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, f111873e));
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m137442H0(SettingGroups settingGroups) {
        ((ww80) this.viewModel).m208195Y(settingGroups);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m137443L0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i && this.f111875a == null) {
            ((ww80) this.viewModel).m208191T();
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m137444N0(View view) {
        this.f111876b.getSettingGroup().marriage.closeMode = true;
        m137419g1();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m137445O0() {
        this.f111876b.getSettingGroup().privacy.hideMutualContacts = Boolean.valueOf(!((ww80) this.viewModel).m208200d0());
        m137419g1();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m137446P0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        ((ww80) this.viewModel).m208205z(false);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m137447Q0(SettingGroups settingGroups) {
        i4g0.m138523u("e_vip_badge_show_switch_button", "p_privacy_and_permission_settings_view", jyb.m147494Y("switch", Integer.valueOf(settingGroups.privacy.hideVIP.booleanValue() ? 1 : 0)));
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
        ((ww80) this.viewModel).m208195Y(settingGroups);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m137448R0(Throwable th) {
        ((ww80) this.viewModel).m208190S(th);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m137449S0(uxj0 uxj0Var) {
        ((ww80) this.viewModel).m208193V();
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m137450U0(Throwable th) {
        ((ww80) this.viewModel).m208192U(th);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m137451V0() {
        this.f111876b.getSettingGroup().privacy.hideContacts = Boolean.valueOf(((ww80) this.viewModel).m208199c0());
        m137419g1();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m137452W0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        ((ww80) this.viewModel).m208204y(false);
    }

    /* JADX INFO: renamed from: X0 */
    public void m137453X0(boolean z) {
        if (NullChecker.m82486a(this.f111876b)) {
            if (z) {
                new th0.C20312a(act()).m191148g(false).m191151j("关闭想结婚模式后你将不再被推荐，可能会错失缘分，确认要关闭吗？").m191159r("再想想").m191156o(new View.OnClickListener() { // from class: l.wv80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        hw80.m137436y0(view);
                    }
                }).m191147f("确认关闭").m191144c(new View.OnClickListener() { // from class: l.xv80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f196360a.m137444N0(view);
                    }
                }).m191142a().m191141g();
            } else {
                this.f111876b.getSettingGroup().marriage.closeMode = false;
                m137419g1();
            }
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m137454Y0(boolean z) {
        this.f111876b.getSettingGroup().privacy.aiPictureEnable = z ? "true" : "false";
        m137419g1();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.ov80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149239a.m137413G0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20381e0.m116476J7()).subscribe(psd0.m173597H(new y20() { // from class: l.yv80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201686a.m137442H0((SettingGroups) obj);
            }
        }, new y20() { // from class: l.zv80
            @Override // p153l.y20
            public final void call(Object obj) {
                hw80.m137420h0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.m30934Q().mo68440ao(CoreModule.m30929H().userId())).filter(new qcj() { // from class: l.aw80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return hw80.m137431r0((Boolean) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.bw80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78687a.m137414I0((Boolean) obj);
            }
        }, new y20() { // from class: l.cw80
            @Override // p153l.y20
            public final void call(Object obj) {
                hw80.m137430q0((Throwable) obj);
            }
        }));
        duringCreated((C22421c) CoreModule.f18264c.f20405m0.m32121j9().switchMap(new qcj() { // from class: l.dw80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20381e0.m116596o9();
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.ew80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96097a.m137415J0((User) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.fw80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101138a.m137443L0((C4470c) obj);
            }
        }));
        this.f111877c = CoreModule.f18264c.f20381e0.f89110R.get();
    }

    /* JADX INFO: renamed from: a1 */
    public void m137455a1(boolean z) {
        i4g0.m138523u("e_chat_to_verified_switch", "p_privacy_and_permission_settings_view", jyb.m147494Y("after_status", z ? "on" : BLiveOperationTitleShowType.off));
        this.f111876b.getSettingGroup().privacy.verifiedUserMsg = Boolean.valueOf(z);
        m137419g1();
    }

    /* JADX INFO: renamed from: b1 */
    public void m137456b1(boolean z) {
        CoreModule.f18264c.f20300D0.f20871T.put(Boolean.valueOf(!z));
        i4g0.m138523u("e_quickchat_broadcast_switch", "p_privacy_and_permission_settings_view", jyb.m147494Y("qb_switch_status", z ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: c1 */
    public void m137457c1() {
        act().startActivity(new Intent(act(), (Class<?>) MomentMutedAct.class));
    }

    /* JADX INFO: renamed from: d1 */
    public void m137458d1(boolean z) {
        if (!z) {
            PermissionHelper.m81065c().m81083r("android.permission.READ_CONTACTS").m81088w(false).m81086u(false).m81078m(new x20() { // from class: l.sv80
                @Override // p153l.x20
                public final void call() {
                    this.f170815a.m137445O0();
                }
            }, new y20() { // from class: l.tv80
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f176246a.m137446P0((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m81074i(act());
            return;
        }
        this.f111876b.getSettingGroup().privacy.hideMutualContacts = Boolean.valueOf(!((ww80) this.viewModel).m208200d0());
        m137419g1();
    }

    /* JADX INFO: renamed from: e1 */
    public void m137459e1(UserPrivacySettings userPrivacySettings) {
        duringCreated(CoreModule.f18264c.f20381e0.m116636y9(userPrivacySettings)).subscribe(psd0.m173597H(new y20() { // from class: l.qv80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159726a.m137447Q0((SettingGroups) obj);
            }
        }, new y20() { // from class: l.rv80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164989a.m137448R0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f1 */
    public void m137460f1(SettingGroups settingGroups) {
        CoreModule.f18264c.f20405m0.m32124k8(settingGroups).subscribe(psd0.m173597H(new y20() { // from class: l.uv80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181130a.m137449S0((uxj0) obj);
            }
        }, new y20() { // from class: l.vv80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185909a.m137450U0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i1 */
    public void m137461i1() {
        ((ww80) this.viewModel).m208194W(act().getString(R$string.f18632L5), true);
        m137459e1(this.f111877c.privacy);
    }

    /* JADX INFO: renamed from: j1 */
    public void m137462j1(boolean z) {
        this.f111876b.getSettingGroup().privacy.heartbeatDisable = Boolean.valueOf(z);
        m137419g1();
        i4g0.m138523u("e_heartsignal_control", "p_privacy_and_permission_settings_view", jyb.m147494Y("switch_type", z ? "close" : "open"));
    }

    /* JADX INFO: renamed from: k1 */
    public void m137463k1(boolean z) {
        if (!z) {
            PermissionHelper.m81065c().m81083r("android.permission.READ_CONTACTS").m81088w(false).m81086u(false).m81078m(new x20() { // from class: l.gw80
                @Override // p153l.x20
                public final void call() {
                    this.f106738a.m137451V0();
                }
            }, new y20() { // from class: l.pv80
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f154279a.m137452W0((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m81074i(act());
            return;
        }
        this.f111876b.getSettingGroup().privacy.hideContacts = Boolean.valueOf(((ww80) this.viewModel).m208199c0());
        m137419g1();
    }

    /* JADX INFO: renamed from: l1 */
    public void m137464l1() {
        if (NullChecker.m82486a(this.f111876b) && NullChecker.m82486a(this.f111876b.getSettingGroup()) && NullChecker.m82486a(this.f111876b.getSettingGroup().privacy) && NullChecker.m82486a(this.f111876b.getSettingGroup().privacy.onlineReminder)) {
            this.f111876b.getSettingGroup().privacy.onlineReminder = Boolean.valueOf(!this.f111876b.getSettingGroup().privacy.onlineReminder.booleanValue());
            m137419g1();
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m137465m1(boolean z) {
        this.f111876b.getSettingGroup().privacy.adsSuggest = Boolean.valueOf(z);
        m137419g1();
        i4g0.m138523u("e_personalized_ad_button", "p_privacy_and_permission_settings_view", jyb.m147494Y("after_status", z ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: n1 */
    public void m137466n1(boolean z) {
        f111874f = true;
        this.f111876b.getSettingGroup().privacy.personalizeSuggest = Boolean.valueOf(z);
        m137419g1();
        i4g0.m138523u("e_personalized_recommend_button", "p_privacy_and_permission_settings_view", jyb.m147494Y("change", z ? "off2on" : "on2off"));
    }

    /* JADX INFO: renamed from: o1 */
    public void m137467o1(boolean z) {
        this.f111876b.getSettingGroup().privacy.unrepliedReminder = Boolean.valueOf(z);
        m137419g1();
    }

    /* JADX INFO: renamed from: z0 */
    public void m137468z0(boolean z) {
        this.f111876b.getSettingGroup().moment.autoLike = Boolean.valueOf(z);
        m137419g1();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
