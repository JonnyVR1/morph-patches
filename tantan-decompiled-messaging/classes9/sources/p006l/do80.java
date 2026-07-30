package p006l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.settings.MomentMutedAct;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserMomentSettings;
import com.p1.mobile.putong.data.UserPrivacySettings;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.juk;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.w9j;
import l.xh0;
import l.zvf0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class do80 extends jq2<so80> {

    /* JADX INFO: renamed from: e */
    public static final String f10490e;

    /* JADX INFO: renamed from: f */
    public static boolean f10491f;

    /* JADX INFO: renamed from: a */
    public User f10492a;

    /* JADX INFO: renamed from: b */
    public Settings f10493b;

    /* JADX INFO: renamed from: c */
    public SettingGroups f10494c;

    /* JADX INFO: renamed from: d */
    public PrivacyMembershipSetting f10495d;

    static {
        f10490e = (juk.e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/information/rec-proto/index.html");
        f10491f = false;
    }

    public do80(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m14107G0(Bundle bundle) {
        ((so80) ((jq2) this).viewModel).m23986R(act().getIntent().getStringExtra("from"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m14108I0(Boolean bool) {
        ((so80) ((jq2) this).viewModel).m24000w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m14109J0(User user) {
        this.f10492a = user;
        if (this.f10493b == null) {
            this.f10493b = user.settings.clone();
        }
        ((so80) ((jq2) this).viewModel).m23993Z(user, this.f10493b);
    }

    /* JADX INFO: renamed from: g1 */
    private void m14113g1() {
        m14115h1(false);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m14114h0(Throwable th) {
    }

    /* JADX INFO: renamed from: h1 */
    private void m14115h1(boolean z) {
        if (NullChecker.a(this.f10492a) && NullChecker.a(this.f10493b) && CoreModule.m1850H().signedIn_() && !this.f10493b.equals(this.f10492a.settings)) {
            SettingGroups settingGroups = new SettingGroups();
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            settingGroups.privacy = userPrivacySettings;
            userPrivacySettings.hideContacts = this.f10493b.hideContacts();
            settingGroups.privacy.hideMutualContacts = this.f10493b.hideMutualContacts();
            settingGroups.privacy.personalizeSuggest = this.f10493b.personalizeSuggest();
            settingGroups.privacy.adsSuggest = Boolean.valueOf(this.f10493b.personalizeAdsSuggest());
            settingGroups.privacy.heartbeatDisable = this.f10493b.heartbeatDisable();
            if (((so80) ((jq2) this).viewModel).m23978B()) {
                settingGroups.privacy.hideSchool = this.f10493b.hideSchoolNameNoDefaults();
            }
            settingGroups.privacy.onlineReminder = this.f10493b.getOnlineReminder();
            settingGroups.privacy.unrepliedReminder = this.f10493b.unrepliedReminder();
            if (CoreModule.m1853N().Vg()) {
                UserMomentSettings userMomentSettingsNew_ = UserMomentSettings.new_();
                userMomentSettingsNew_.autoLike = this.f10493b.hideAutoLike();
                settingGroups.moment = userMomentSettingsNew_;
            }
            settingGroups.privacy.hidePublicMoments = this.f10493b.hidePublicMoment();
            settingGroups.live = this.f10493b.getSettingGroup().live;
            settingGroups.privacy.aiPictureEnable = this.f10493b.getAiPictureEnable();
            settingGroups.privacy.verifiedUserMsg = this.f10493b.justReceiveVeriUserMsg();
            if (settingGroups.marriage == null) {
                settingGroups.marriage = this.f10493b.getSettingGroup().marriage;
            }
            settingGroups.marriage.closeMode = this.f10493b.getSettingGroup().marriage.closeMode;
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f10492a.settings.getSettingGroup());
            if (NullChecker.a(settingGroupsSubtract)) {
                ((so80) ((jq2) this).viewModel).m23991W(act().getString(R$string.f1831J5), true);
                m14156f1(settingGroupsSubtract);
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m14124q0(Throwable th) {
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ Boolean m14125r0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m14130y0(View view) {
    }

    /* JADX INFO: renamed from: A0 */
    public void m14131A0(boolean z) {
        this.f10493b.getSettingGroup().privacy.hidePublicMoments = Boolean.valueOf(z);
        m14113g1();
    }

    /* JADX INFO: renamed from: C0 */
    public void m14132C0(boolean z) {
        this.f10493b.getSettingGroup().privacy.hideSchool = Boolean.valueOf(z);
        m14113g1();
    }

    /* JADX INFO: renamed from: D0 */
    public void m14133D0(boolean z) {
        this.f10494c.privacy.hideVIP = Boolean.valueOf(z);
        m14157i1();
        if (NullChecker.a(this.f10495d)) {
            this.f10495d.hideIcon = Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m14134E0() {
        if (this.f10492a == null) {
            return false;
        }
        try {
            String strF = RemoteConfig.x().F("moment_auto_like");
            if (!TextUtils.isEmpty(strF)) {
                JSONObject jSONObject = new JSONObject(strF);
                return this.f10492a.isFemale() ? jSONObject.optBoolean("autoLikeFemale") : jSONObject.optBoolean("autoLikeMale");
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: F0 */
    public void m14135F0() {
        act().startActivity(WebViewAct.Z1(act(), " ", f10490e));
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m14136H0(SettingGroups settingGroups) {
        ((so80) ((jq2) this).viewModel).m23992Y(settingGroups);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m14137L0(c cVar) {
        if (cVar == c.i && this.f10492a == null) {
            ((so80) ((jq2) this).viewModel).m23988T();
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m14138N0(View view) {
        this.f10493b.getSettingGroup().marriage.closeMode = true;
        m14113g1();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m14139O0() {
        this.f10493b.getSettingGroup().privacy.hideMutualContacts = Boolean.valueOf(!((so80) ((jq2) this).viewModel).m23997d0());
        m14113g1();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m14140P0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        ((so80) ((jq2) this).viewModel).m24003z(false);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m14141Q0(SettingGroups settingGroups) {
        zvf0.u("e_vip_badge_show_switch_button", "p_privacy_and_permission_settings_view", new j760[]{vwb.Y("switch", Integer.valueOf(settingGroups.privacy.hideVIP.booleanValue() ? 1 : 0))});
        CoreModule.f1534c.f3628e0.m21417W9(CoreModule.m1850H().userId());
        ((so80) ((jq2) this).viewModel).m23992Y(settingGroups);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m14142R0(Throwable th) {
        ((so80) ((jq2) this).viewModel).m23987S(th);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m14143S0(roj0 roj0Var) {
        ((so80) ((jq2) this).viewModel).m23990V();
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m14144U0(Throwable th) {
        ((so80) ((jq2) this).viewModel).m23989U(th);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m14145V0() {
        this.f10493b.getSettingGroup().privacy.hideContacts = Boolean.valueOf(((so80) ((jq2) this).viewModel).m23996c0());
        m14113g1();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m14146W0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        ((so80) ((jq2) this).viewModel).m24002y(false);
    }

    /* JADX INFO: renamed from: X0 */
    public void m14147X0(boolean z) {
        if (NullChecker.a(this.f10493b)) {
            if (z) {
                new xh0.a(act()).g(false).j("关闭想结婚模式后你将不再被推荐，可能会错失缘分，确认要关闭吗？").r("再想想").o(new View.OnClickListener() { // from class: l.sn80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        do80.m14130y0(view);
                    }
                }).f("确认关闭").c(new View.OnClickListener() { // from class: l.tn80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f22188a.m14138N0(view);
                    }
                }).a().g();
            } else {
                this.f10493b.getSettingGroup().marriage.closeMode = false;
                m14113g1();
            }
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m14148Y0(boolean z) {
        this.f10493b.getSettingGroup().privacy.aiPictureEnable = z ? "true" : "false";
        m14113g1();
    }

    /* JADX INFO: renamed from: Z */
    public void m14149Z() {
        super.Z();
    }

    /* JADX INFO: renamed from: a0 */
    public void m14150a0() {
        super.a0();
        creates(new e30() { // from class: l.kn80
            public final void call(Object obj) {
                this.f15912a.m14107G0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f1534c.f3628e0.m21366J7()).subscribe(mkd0.H(new e30() { // from class: l.un80
            public final void call(Object obj) {
                this.f23664a.m14136H0((SettingGroups) obj);
            }
        }, new e30() { // from class: l.vn80
            public final void call(Object obj) {
                do80.m14114h0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.m1855Q().ao(CoreModule.m1850H().userId())).filter(new w9j() { // from class: l.wn80
            public final Object call(Object obj) {
                return do80.m14125r0((Boolean) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.xn80
            public final void call(Object obj) {
                this.f27617a.m14108I0((Boolean) obj);
            }
        }, new e30() { // from class: l.yn80
            public final void call(Object obj) {
                do80.m14124q0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3652m0.m3048j9().switchMap(new w9j() { // from class: l.zn80
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3628e0.m21486o9();
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.ao80
            public final void call(Object obj) {
                this.f8410a.m14109J0((User) obj);
            }
        }));
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.bo80
            public final void call(Object obj) {
                this.f9010a.m14137L0((c) obj);
            }
        }));
        this.f10494c = (SettingGroups) CoreModule.f1534c.f3628e0.f18865R.get();
    }

    /* JADX INFO: renamed from: a1 */
    public void m14151a1(boolean z) {
        zvf0.u("e_chat_to_verified_switch", "p_privacy_and_permission_settings_view", new j760[]{vwb.Y("after_status", z ? "on" : "off")});
        this.f10493b.getSettingGroup().privacy.verifiedUserMsg = Boolean.valueOf(z);
        m14113g1();
    }

    /* JADX INFO: renamed from: b1 */
    public void m14152b1(boolean z) {
        CoreModule.f1534c.f3547D0.f4118T.put(Boolean.valueOf(!z));
        zvf0.u("e_quickchat_broadcast_switch", "p_privacy_and_permission_settings_view", new j760[]{vwb.Y("qb_switch_status", z ? "on" : "off")});
    }

    /* JADX INFO: renamed from: c1 */
    public void m14153c1() {
        act().startActivity(new Intent((Context) act(), (Class<?>) MomentMutedAct.class));
    }

    /* JADX INFO: renamed from: d1 */
    public void m14154d1(boolean z) {
        if (!z) {
            PermissionHelper.c().r(new String[]{"android.permission.READ_CONTACTS"}).w(false).u(false).m(new d30() { // from class: l.on80
                public final void call() {
                    this.f18290a.m14139O0();
                }
            }, new e30() { // from class: l.pn80
                public final void call(Object obj) {
                    this.f19214a.m14140P0((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).i(act());
            return;
        }
        this.f10493b.getSettingGroup().privacy.hideMutualContacts = Boolean.valueOf(!((so80) ((jq2) this).viewModel).m23997d0());
        m14113g1();
    }

    /* JADX INFO: renamed from: e1 */
    public void m14155e1(UserPrivacySettings userPrivacySettings) {
        duringCreated(CoreModule.f1534c.f3628e0.m21526y9(userPrivacySettings)).subscribe(mkd0.H(new e30() { // from class: l.mn80
            public final void call(Object obj) {
                this.f17123a.m14141Q0((SettingGroups) obj);
            }
        }, new e30() { // from class: l.nn80
            public final void call(Object obj) {
                this.f17751a.m14142R0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f1 */
    public void m14156f1(SettingGroups settingGroups) {
        CoreModule.f1534c.f3652m0.m3051k8(settingGroups).subscribe(mkd0.H(new e30() { // from class: l.qn80
            public final void call(Object obj) {
                this.f19922a.m14143S0((roj0) obj);
            }
        }, new e30() { // from class: l.rn80
            public final void call(Object obj) {
                this.f20640a.m14144U0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i1 */
    public void m14157i1() {
        ((so80) ((jq2) this).viewModel).m23991W(act().getString(R$string.f1831J5), true);
        m14155e1(this.f10494c.privacy);
    }

    /* JADX INFO: renamed from: j1 */
    public void m14158j1(boolean z) {
        this.f10493b.getSettingGroup().privacy.heartbeatDisable = Boolean.valueOf(z);
        m14113g1();
        zvf0.u("e_heartsignal_control", "p_privacy_and_permission_settings_view", new j760[]{vwb.Y("switch_type", z ? "close" : "open")});
    }

    /* JADX INFO: renamed from: k1 */
    public void m14159k1(boolean z) {
        if (!z) {
            PermissionHelper.c().r(new String[]{"android.permission.READ_CONTACTS"}).w(false).u(false).m(new d30() { // from class: l.co80
                public final void call() {
                    this.f9764a.m14145V0();
                }
            }, new e30() { // from class: l.ln80
                public final void call(Object obj) {
                    this.f16527a.m14146W0((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).i(act());
            return;
        }
        this.f10493b.getSettingGroup().privacy.hideContacts = Boolean.valueOf(((so80) ((jq2) this).viewModel).m23996c0());
        m14113g1();
    }

    /* JADX INFO: renamed from: l1 */
    public void m14160l1() {
        if (NullChecker.a(this.f10493b) && NullChecker.a(this.f10493b.getSettingGroup()) && NullChecker.a(this.f10493b.getSettingGroup().privacy) && NullChecker.a(this.f10493b.getSettingGroup().privacy.onlineReminder)) {
            this.f10493b.getSettingGroup().privacy.onlineReminder = Boolean.valueOf(!this.f10493b.getSettingGroup().privacy.onlineReminder.booleanValue());
            m14113g1();
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m14161m1(boolean z) {
        this.f10493b.getSettingGroup().privacy.adsSuggest = Boolean.valueOf(z);
        m14113g1();
        zvf0.u("e_personalized_ad_button", "p_privacy_and_permission_settings_view", new j760[]{vwb.Y("after_status", z ? "on" : "off")});
    }

    /* JADX INFO: renamed from: n1 */
    public void m14162n1(boolean z) {
        f10491f = true;
        this.f10493b.getSettingGroup().privacy.personalizeSuggest = Boolean.valueOf(z);
        m14113g1();
        zvf0.u("e_personalized_recommend_button", "p_privacy_and_permission_settings_view", new j760[]{vwb.Y("change", z ? "off2on" : "on2off")});
    }

    /* JADX INFO: renamed from: o1 */
    public void m14163o1(boolean z) {
        this.f10493b.getSettingGroup().privacy.unrepliedReminder = Boolean.valueOf(z);
        m14113g1();
    }

    /* JADX INFO: renamed from: z0 */
    public void m14164z0(boolean z) {
        this.f10493b.getSettingGroup().moment.autoLike = Boolean.valueOf(z);
        m14113g1();
    }

    public void destroy() {
    }
}
