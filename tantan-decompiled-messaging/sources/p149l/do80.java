package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p046p1.mobile.putong.core.p053ui.settings.MomentMutedAct;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserMomentSettings;
import com.p046p1.mobile.putong.data.UserPrivacySettings;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class do80 extends jq2<so80> {

    /* JADX INFO: renamed from: e */
    public static final String f87148e;

    /* JADX INFO: renamed from: f */
    public static boolean f87149f;

    /* JADX INFO: renamed from: a */
    public User f87150a;

    /* JADX INFO: renamed from: b */
    public Settings f87151b;

    /* JADX INFO: renamed from: c */
    public SettingGroups f87152c;

    /* JADX INFO: renamed from: d */
    public PrivacyMembershipSetting f87153d;

    static {
        f87148e = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/information/rec-proto/index.html");
        f87149f = false;
    }

    public do80(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m112744G0(Bundle bundle) {
        ((so80) this.viewModel).m185273R(act().getIntent().getStringExtra("from"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m112745I0(Boolean bool) {
        ((so80) this.viewModel).m185286w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m112746J0(User user) {
        this.f87150a = user;
        if (this.f87151b == null) {
            this.f87151b = user.settings.mo223809clone();
        }
        ((so80) this.viewModel).m185280Z(user, this.f87151b);
    }

    /* JADX INFO: renamed from: g1 */
    private void m112750g1() {
        m112752h1(false);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m112751h0(Throwable th) {
    }

    /* JADX INFO: renamed from: h1 */
    private void m112752h1(boolean z) {
        if (NullChecker.m81303a(this.f87150a) && NullChecker.m81303a(this.f87151b) && CoreModule.m29931H().signedIn_() && !this.f87151b.equals(this.f87150a.settings)) {
            SettingGroups settingGroups = new SettingGroups();
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            settingGroups.privacy = userPrivacySettings;
            userPrivacySettings.hideContacts = this.f87151b.hideContacts();
            settingGroups.privacy.hideMutualContacts = this.f87151b.hideMutualContacts();
            settingGroups.privacy.personalizeSuggest = this.f87151b.personalizeSuggest();
            settingGroups.privacy.adsSuggest = Boolean.valueOf(this.f87151b.personalizeAdsSuggest());
            settingGroups.privacy.heartbeatDisable = this.f87151b.heartbeatDisable();
            if (((so80) this.viewModel).m185266B()) {
                settingGroups.privacy.hideSchool = this.f87151b.hideSchoolNameNoDefaults();
            }
            settingGroups.privacy.onlineReminder = this.f87151b.getOnlineReminder();
            settingGroups.privacy.unrepliedReminder = this.f87151b.unrepliedReminder();
            if (CoreModule.m29934N().mo60328Vg()) {
                UserMomentSettings userMomentSettingsNew_ = UserMomentSettings.new_();
                userMomentSettingsNew_.autoLike = this.f87151b.hideAutoLike();
                settingGroups.moment = userMomentSettingsNew_;
            }
            settingGroups.privacy.hidePublicMoments = this.f87151b.hidePublicMoment();
            settingGroups.live = this.f87151b.getSettingGroup().live;
            settingGroups.privacy.aiPictureEnable = this.f87151b.getAiPictureEnable();
            settingGroups.privacy.verifiedUserMsg = this.f87151b.justReceiveVeriUserMsg();
            if (settingGroups.marriage == null) {
                settingGroups.marriage = this.f87151b.getSettingGroup().marriage;
            }
            settingGroups.marriage.closeMode = this.f87151b.getSettingGroup().marriage.closeMode;
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f87150a.settings.getSettingGroup());
            if (NullChecker.m81303a(settingGroupsSubtract)) {
                ((so80) this.viewModel).m185278W(act().getString(R$string.f17842J5), true);
                m112791f1(settingGroupsSubtract);
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m112761q0(Throwable th) {
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ Boolean m112762r0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m112767y0(View view) {
    }

    /* JADX INFO: renamed from: A0 */
    public void m112768A0(boolean z) {
        this.f87151b.getSettingGroup().privacy.hidePublicMoments = Boolean.valueOf(z);
        m112750g1();
    }

    /* JADX INFO: renamed from: C0 */
    public void m112769C0(boolean z) {
        this.f87151b.getSettingGroup().privacy.hideSchool = Boolean.valueOf(z);
        m112750g1();
    }

    /* JADX INFO: renamed from: D0 */
    public void m112770D0(boolean z) {
        this.f87152c.privacy.hideVIP = Boolean.valueOf(z);
        m112792i1();
        if (NullChecker.m81303a(this.f87153d)) {
            this.f87153d.hideIcon = Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m112771E0() {
        if (this.f87150a == null) {
            return false;
        }
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_auto_like");
            if (!TextUtils.isEmpty(strM79302F)) {
                JSONObject jSONObject = new JSONObject(strM79302F);
                return this.f87150a.isFemale() ? jSONObject.optBoolean("autoLikeFemale") : jSONObject.optBoolean("autoLikeMale");
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: F0 */
    public void m112772F0() {
        act().startActivity(WebViewAct.m80164Z1(act(), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, f87148e));
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m112773H0(SettingGroups settingGroups) {
        ((so80) this.viewModel).m185279Y(settingGroups);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m112774L0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i && this.f87150a == null) {
            ((so80) this.viewModel).m185275T();
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m112775N0(View view) {
        this.f87151b.getSettingGroup().marriage.closeMode = true;
        m112750g1();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m112776O0() {
        this.f87151b.getSettingGroup().privacy.hideMutualContacts = Boolean.valueOf(!((so80) this.viewModel).m185284d0());
        m112750g1();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m112777P0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        ((so80) this.viewModel).m185289z(false);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m112778Q0(SettingGroups settingGroups) {
        zvf0.m220399u("e_vip_badge_show_switch_button", "p_privacy_and_permission_settings_view", vwb.m200311Y("switch", Integer.valueOf(settingGroups.privacy.hideVIP.booleanValue() ? 1 : 0)));
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
        ((so80) this.viewModel).m185279Y(settingGroups);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m112779R0(Throwable th) {
        ((so80) this.viewModel).m185274S(th);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m112780S0(roj0 roj0Var) {
        ((so80) this.viewModel).m185277V();
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m112781U0(Throwable th) {
        ((so80) this.viewModel).m185276U(th);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m112782V0() {
        this.f87151b.getSettingGroup().privacy.hideContacts = Boolean.valueOf(((so80) this.viewModel).m185283c0());
        m112750g1();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m112783W0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        ((so80) this.viewModel).m185288y(false);
    }

    /* JADX INFO: renamed from: X0 */
    public void m112784X0(boolean z) {
        if (NullChecker.m81303a(this.f87151b)) {
            if (z) {
                new xh0.C21150a(act()).m208728g(false).m208731j("关闭想结婚模式后你将不再被推荐，可能会错失缘分，确认要关闭吗？").m208739r("再想想").m208736o(new View.OnClickListener() { // from class: l.sn80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        do80.m112767y0(view);
                    }
                }).m208727f("确认关闭").m208724c(new View.OnClickListener() { // from class: l.tn80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f171214a.m112775N0(view);
                    }
                }).m208722a().m208721g();
            } else {
                this.f87151b.getSettingGroup().marriage.closeMode = false;
                m112750g1();
            }
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m112785Y0(boolean z) {
        this.f87151b.getSettingGroup().privacy.aiPictureEnable = z ? "true" : "false";
        m112750g1();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.kn80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123865a.m112744G0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19639e0.m169403J7()).subscribe(mkd0.m154956H(new e30() { // from class: l.un80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177342a.m112773H0((SettingGroups) obj);
            }
        }, new e30() { // from class: l.vn80
            @Override // p149l.e30
            public final void call(Object obj) {
                do80.m112751h0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.m29936Q().mo67257ao(CoreModule.m29931H().userId())).filter(new w9j() { // from class: l.wn80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return do80.m112762r0((Boolean) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.xn80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193645a.m112745I0((Boolean) obj);
            }
        }, new e30() { // from class: l.yn80
            @Override // p149l.e30
            public final void call(Object obj) {
                do80.m112761q0((Throwable) obj);
            }
        }));
        duringCreated((C22306c) CoreModule.f17545c.f19663m0.m31118j9().switchMap(new w9j() { // from class: l.zn80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19639e0.m169523o9();
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.ao80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70796a.m112746J0((User) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.bo80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76486a.m112774L0((C4319c) obj);
            }
        }));
        this.f87152c = CoreModule.f17545c.f19639e0.f149253R.get();
    }

    /* JADX INFO: renamed from: a1 */
    public void m112786a1(boolean z) {
        zvf0.m220399u("e_chat_to_verified_switch", "p_privacy_and_permission_settings_view", vwb.m200311Y("after_status", z ? "on" : BLiveOperationTitleShowType.off));
        this.f87151b.getSettingGroup().privacy.verifiedUserMsg = Boolean.valueOf(z);
        m112750g1();
    }

    /* JADX INFO: renamed from: b1 */
    public void m112787b1(boolean z) {
        CoreModule.f17545c.f19558D0.f20129T.put(Boolean.valueOf(!z));
        zvf0.m220399u("e_quickchat_broadcast_switch", "p_privacy_and_permission_settings_view", vwb.m200311Y("qb_switch_status", z ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: c1 */
    public void m112788c1() {
        act().startActivity(new Intent(act(), (Class<?>) MomentMutedAct.class));
    }

    /* JADX INFO: renamed from: d1 */
    public void m112789d1(boolean z) {
        if (!z) {
            PermissionHelper.m79882c().m79900r("android.permission.READ_CONTACTS").m79905w(false).m79903u(false).m79895m(new d30() { // from class: l.on80
                @Override // p149l.d30
                public final void call() {
                    this.f144750a.m112776O0();
                }
            }, new e30() { // from class: l.pn80
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f150373a.m112777P0((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m79891i(act());
            return;
        }
        this.f87151b.getSettingGroup().privacy.hideMutualContacts = Boolean.valueOf(!((so80) this.viewModel).m185284d0());
        m112750g1();
    }

    /* JADX INFO: renamed from: e1 */
    public void m112790e1(UserPrivacySettings userPrivacySettings) {
        duringCreated(CoreModule.f17545c.f19639e0.m169563y9(userPrivacySettings)).subscribe(mkd0.m154956H(new e30() { // from class: l.mn80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134744a.m112778Q0((SettingGroups) obj);
            }
        }, new e30() { // from class: l.nn80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139702a.m112779R0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f1 */
    public void m112791f1(SettingGroups settingGroups) {
        CoreModule.f17545c.f19663m0.m31121k8(settingGroups).subscribe(mkd0.m154956H(new e30() { // from class: l.qn80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155404a.m112780S0((roj0) obj);
            }
        }, new e30() { // from class: l.rn80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160250a.m112781U0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i1 */
    public void m112792i1() {
        ((so80) this.viewModel).m185278W(act().getString(R$string.f17842J5), true);
        m112790e1(this.f87152c.privacy);
    }

    /* JADX INFO: renamed from: j1 */
    public void m112793j1(boolean z) {
        this.f87151b.getSettingGroup().privacy.heartbeatDisable = Boolean.valueOf(z);
        m112750g1();
        zvf0.m220399u("e_heartsignal_control", "p_privacy_and_permission_settings_view", vwb.m200311Y("switch_type", z ? "close" : "open"));
    }

    /* JADX INFO: renamed from: k1 */
    public void m112794k1(boolean z) {
        if (!z) {
            PermissionHelper.m79882c().m79900r("android.permission.READ_CONTACTS").m79905w(false).m79903u(false).m79895m(new d30() { // from class: l.co80
                @Override // p149l.d30
                public final void call() {
                    this.f81755a.m112782V0();
                }
            }, new e30() { // from class: l.ln80
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f128972a.m112783W0((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m79891i(act());
            return;
        }
        this.f87151b.getSettingGroup().privacy.hideContacts = Boolean.valueOf(((so80) this.viewModel).m185283c0());
        m112750g1();
    }

    /* JADX INFO: renamed from: l1 */
    public void m112795l1() {
        if (NullChecker.m81303a(this.f87151b) && NullChecker.m81303a(this.f87151b.getSettingGroup()) && NullChecker.m81303a(this.f87151b.getSettingGroup().privacy) && NullChecker.m81303a(this.f87151b.getSettingGroup().privacy.onlineReminder)) {
            this.f87151b.getSettingGroup().privacy.onlineReminder = Boolean.valueOf(!this.f87151b.getSettingGroup().privacy.onlineReminder.booleanValue());
            m112750g1();
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m112796m1(boolean z) {
        this.f87151b.getSettingGroup().privacy.adsSuggest = Boolean.valueOf(z);
        m112750g1();
        zvf0.m220399u("e_personalized_ad_button", "p_privacy_and_permission_settings_view", vwb.m200311Y("after_status", z ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: n1 */
    public void m112797n1(boolean z) {
        f87149f = true;
        this.f87151b.getSettingGroup().privacy.personalizeSuggest = Boolean.valueOf(z);
        m112750g1();
        zvf0.m220399u("e_personalized_recommend_button", "p_privacy_and_permission_settings_view", vwb.m200311Y("change", z ? "off2on" : "on2off"));
    }

    /* JADX INFO: renamed from: o1 */
    public void m112798o1(boolean z) {
        this.f87151b.getSettingGroup().privacy.unrepliedReminder = Boolean.valueOf(z);
        m112750g1();
    }

    /* JADX INFO: renamed from: z0 */
    public void m112799z0(boolean z) {
        this.f87151b.getSettingGroup().moment.autoLike = Boolean.valueOf(z);
        m112750g1();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
