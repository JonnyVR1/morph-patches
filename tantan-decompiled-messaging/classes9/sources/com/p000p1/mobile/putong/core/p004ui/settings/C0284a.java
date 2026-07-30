package com.p000p1.mobile.putong.core.p004ui.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.view.View;
import com.facebook.AccessToken;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.api.api.PaymentApi;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.account.SwitchAccountV2Act;
import com.p000p1.mobile.putong.core.p004ui.settings.C0284a;
import com.p000p1.mobile.putong.core.p004ui.settings.datastorage.DataAndStorageAct;
import com.p000p1.mobile.putong.core.p004ui.settings.privacy.PrivacySettingAct;
import com.p000p1.mobile.putong.core.p004ui.settings.privacyandpremisson.PrivacyAndPremissonAct;
import com.p000p1.mobile.putong.core.p004ui.vip.VipLocationHistoryAct;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.AdvancedSettings;
import com.p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.core.ui.account.NewAccountSecureAct;
import com.p1.mobile.putong.core.ui.account.SwitchAccountAct;
import com.p1.mobile.putong.core.ui.campus.StudentInfoAct;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.LookingFor;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.SearchPriority;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.SettingsIntent;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserPrivacySettings;
import com.p1.mobile.putong.data.UserSearchSettings;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live_api.api.serviceprovider.api.LiveSettingArgs;
import com.p1.mobile.putong.location.Location;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l.aqo;
import l.bzv;
import l.d30;
import l.d90;
import l.e01;
import l.e30;
import l.ene0;
import l.f30;
import l.hpd0;
import l.i0g0;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mb90;
import l.mcr;
import l.mjj;
import l.mkd0;
import l.o6j0;
import l.qqh0;
import l.roj0;
import l.s7m;
import l.ukf0;
import l.uqd0;
import l.v9j;
import l.vwb;
import l.w85;
import l.w9j;
import l.wvv;
import l.x1f0;
import l.yij0;
import l.zrj0;
import l.zvf0;
import l.zz6;
import p006l.b43;
import p006l.p420;
import p006l.qib0;
import p006l.u59;
import p006l.upa;
import p006l.x2c0;
import p006l.xma;
import p006l.yaf0;
import rx.Notification;
import v.CoverGuideView;
import v.VFrame;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0284a extends jq2<C0285b> {

    /* JADX INFO: renamed from: y */
    public static uqd0 f5651y = new uqd0("city", "");

    /* JADX INFO: renamed from: a */
    public User f5652a;

    /* JADX INFO: renamed from: b */
    public Settings f5653b;

    /* JADX INFO: renamed from: c */
    public AdvancedSettings f5654c;

    /* JADX INFO: renamed from: d */
    public AdvancedSettings f5655d;

    /* JADX INFO: renamed from: e */
    public PrivacyMembershipSetting f5656e;

    /* JADX INFO: renamed from: f */
    public mjj f5657f;

    /* JADX INFO: renamed from: g */
    public CoverGuideView f5658g;

    /* JADX INFO: renamed from: h */
    public hpd0 f5659h;

    /* JADX INFO: renamed from: i */
    public hpd0 f5660i;

    /* JADX INFO: renamed from: j */
    public final hpd0 f5661j;

    /* JADX INFO: renamed from: k */
    public Map<String, String> f5662k;

    /* JADX INFO: renamed from: l */
    public Map<String, String> f5663l;

    /* JADX INFO: renamed from: m */
    public String[] f5664m;

    /* JADX INFO: renamed from: n */
    public boolean f5665n;

    /* JADX INFO: renamed from: o */
    public boolean f5666o;

    /* JADX INFO: renamed from: p */
    public boolean f5667p;

    /* JADX INFO: renamed from: q */
    public UserPrivacySettings f5668q;

    /* JADX INFO: renamed from: r */
    public boolean f5669r;

    /* JADX INFO: renamed from: s */
    public int f5670s;

    /* JADX INFO: renamed from: t */
    public boolean f5671t;

    /* JADX INFO: renamed from: u */
    public String f5672u;

    /* JADX INFO: renamed from: v */
    public int f5673v;

    /* JADX INFO: renamed from: w */
    public int f5674w;

    /* JADX INFO: renamed from: x */
    public Runnable f5675x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.a$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0284a.this.f5653b == null) {
                return;
            }
            o6j0.g("e_edit_age_filter", "p_settings_view", new o6j0.a[]{o6j0.a.f("filter_min_age", C0284a.this.f5653b.getSearchMinAge().intValue()), o6j0.a.f("filter_max_age", C0284a.this.f5653b.getSearchMaxAge().intValue())});
        }
    }

    public C0284a(mcr mcrVar) {
        super(mcrVar);
        Boolean bool = Boolean.FALSE;
        this.f5659h = new hpd0("prioritized_recommend_guideview_shown", bool);
        this.f5660i = new hpd0("tantan_verification_tip_show", bool);
        this.f5661j = new hpd0("hasJumpToNotificationPage" + CoreModule.m1850H().userId(), bool);
        this.f5665n = false;
        this.f5666o = true;
        this.f5667p = false;
        this.f5675x = new a();
    }

    /* JADX INFO: renamed from: B1 */
    public static /* synthetic */ void m8414B1(Notification notification) {
        if (NullChecker.a(AccessToken.d())) {
            bzv.m().u();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m8442e0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public /* synthetic */ void m8454j2(Bundle bundle) {
        e01 e01Var = new e01();
        this.f5662k = e01Var;
        e01Var.put("male", act().getResources().getString(R$string.f2514fo));
        this.f5662k.put("female", act().getResources().getString(R$string.f2483eo));
        this.f5662k.put("both", act().getResources().getString(R$string.f2422co));
        e01 e01Var2 = new e01();
        this.f5663l = e01Var2;
        e01Var2.put("male", act().getResources().getString(R$string.f3023wf));
        this.f5663l.put("female", act().getResources().getString(R$string.f1571Af));
        this.f5663l.put("nonbinary", act().getResources().getString(R$string.f3053xf));
        this.f5663l.put("both", act().getResources().getString(R$string.f3023wf) + " & " + act().getResources().getString(R$string.f1571Af));
        this.f5664m = new String[]{act().getResources().getString(R$string.f2514fo), act().getResources().getString(R$string.f2483eo), act().getResources().getString(R$string.f2422co)};
        this.f5657f = mjj.c(this, false);
        ((C0285b) ((jq2) this).viewModel).m8713r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m8455k0(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.isCannotModify() && !TextUtils.isEmpty(tantanForbidden.message)) {
                return;
            }
        }
        yij0.D(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m8457k2() {
        if (this.f5669r) {
            return;
        }
        zvf0.B("e_setting_finish_no_location", "", new j760[0]);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m8458l0(roj0 roj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public /* synthetic */ Boolean m8466o2(User user) {
        this.f5668q.hideVIP = Boolean.valueOf(user.membership.hideVIP);
        this.f5668q.hideActivityTime = Boolean.valueOf(user.membership.hideActivityTime);
        return Boolean.valueOf(user.isVIP() && user.membership.hideActivityTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public /* synthetic */ void m8471q2(Boolean bool) {
        if (bool.booleanValue()) {
            ((C0285b) ((jq2) this).viewModel).m8708o1(false);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ String m8474s0(User user) {
        return user.settings.phoneNumber.number + user.settings.linkedPhoneNumber.number;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public /* synthetic */ void m8478t2(Boolean bool) {
        ((C0285b) ((jq2) this).viewModel).m8694h1(bool.booleanValue());
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m8479u0(DoublePair doublePair, Throwable th) {
        Boolean bool = Boolean.FALSE;
        zvf0.B("e_setting_location_to_address", "", new j760[]{vwb.Y("is_success", bool), vwb.Y("has_city", bool), vwb.Y("location_latitude", Double.valueOf(doublePair.first)), vwb.Y("location_longitude", Double.valueOf(doublePair.second))});
        App.d.k(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m8481u2(c cVar) {
        if (cVar == c.i) {
            this.f5665n = true;
            if (this.f5652a == null) {
                ((C0285b) ((jq2) this).viewModel).m8721u1(true);
            }
            ((C0285b) ((jq2) this).viewModel).m8725w1(wvv.u() || wvv.t());
            m8527Q3();
            if (upa.m25322D2()) {
                ((C0285b) ((jq2) this).viewModel).m8686d1();
                return;
            }
            return;
        }
        if (cVar == c.j) {
            zvf0.B("e_setting_page_location_info", "", new j760[]{vwb.Y("is_location_success", Boolean.valueOf(qib0.f19778E.q() != null))});
            m8501F3();
        } else if (cVar == c.l && NullChecker.a(this.f5658g) && this.f5658g.d()) {
            this.f5658g.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m8483v2(User user) {
        this.f5652a = user;
        if (((C0285b) ((jq2) this).viewModel).f5765c.getVisibility() == 4) {
            ((C0285b) ((jq2) this).viewModel).m8721u1(false);
        }
        Settings settings = this.f5653b;
        if (settings == null) {
            this.f5653b = user.settings.clone();
            if (qqh0.INSTANCE.i() && !TextUtils.isEmpty(this.f5672u)) {
                this.f5653b.getSettingGroup().search.radius = Integer.valueOf(this.f5670s);
                this.f5653b.getSettingGroup().search.autoAdjustRadius = Boolean.valueOf(this.f5671t);
                this.f5653b.getSettingGroup().search.lookingForGender = LookingFor.get(this.f5672u);
                this.f5653b.getSettingGroup().search.maxAge = Integer.valueOf(this.f5674w);
                this.f5653b.getSettingGroup().search.minAge = Integer.valueOf(this.f5673v);
            }
            m8498E3();
            ((C0285b) ((jq2) this).viewModel).m8699k0();
            return;
        }
        Settings settings2 = user.settings;
        settings.birthdate = settings2.birthdate;
        settings.phoneNumber = settings2.phoneNumber;
        settings.getSettingGroup().privacy.hideContacts = user.settings.hideContacts();
        this.f5653b.getSettingGroup().privacy.hideMutualContacts = user.settings.hideMutualContacts();
        this.f5653b.getSettingGroup().push.previewMessage = user.settings.previewPushMessage();
        this.f5653b.getSettingGroup().push.showMomentLikes = user.settings.showMomentLikes();
        Settings settings3 = this.f5653b;
        settings3.verification = user.settings.verification;
        settings3.getSettingGroup().search.priorities = new ArrayList();
        this.f5653b.getSettingGroup().search.priorities.addAll(user.settings.getSearchPriority());
        m8498E3();
        this.f5653b.getSettingGroup().search.radius = user.settings.getSearchRadius();
        this.f5653b.getSettingGroup().search.invisibleRadius = user.settings.getSettingGroup().search.invisibleRadius;
        ((C0285b) ((jq2) this).viewModel).m8699k0();
        if (qib0.f19804b0.f17706a.mo67rq(user.settings.getSettingGroup())) {
            this.f5653b.getSettingGroup().gender = user.settings.getSettingGroup().gender.clone();
            this.f5653b.getSettingGroup().search.lookingForGender = user.settings.getLookingFor();
            m8545X1(this.f5653b.getSettingGroup());
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m8484x0(Throwable th) {
        CoreModule.f1534c.f3652m0.m3095z5(false);
        yij0.D(th);
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m8489A2(View view) {
        m8494C3(new Runnable() { // from class: l.ype0
            @Override // java.lang.Runnable
            public final void run() {
                this.f28338a.m8596z2();
            }
        }, "hide_svip");
    }

    /* JADX INFO: renamed from: A3 */
    public Runnable m8490A3() {
        return new Runnable() { // from class: l.ipe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14626a.m8546X2();
            }
        };
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m8491B2() {
        ((C0285b) ((jq2) this).viewModel).m8676Y();
    }

    /* JADX INFO: renamed from: B3 */
    public void m8492B3(VFrame vFrame) {
        StudentVerificationStatus studentVerificationStatus = this.f5653b.verification.studies.status;
        if (!TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus, "pending")) {
                lsi0.y(act().getString(R$string.f2120So));
                return;
            } else {
                ((C0285b) ((jq2) this).viewModel).m8730z1();
                return;
            }
        }
        if (yij0.T(vFrame)) {
            zvf0.r("e_student_verification_firstly_on", "p_settings_view");
            if (this.f5653b.getSearchPriority().contains(SearchPriority.get("student"))) {
                return;
            }
            this.f5653b.getSearchPriority().add(SearchPriority.get("student"));
            return;
        }
        zvf0.r("e_student_verification_firstly_off", "p_settings_view");
        if (this.f5653b.getSearchPriority().contains(SearchPriority.get("student"))) {
            this.f5653b.getSearchPriority().remove(SearchPriority.get("student"));
        }
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m8493C2() {
        if (!NullChecker.a(this.f5656e) || this.f5656e.frozenActivity.booleanValue()) {
            ((C0285b) ((jq2) this).viewModel).m8676Y();
        } else {
            act().dialog().D(R$string.f2699lp).k0(R$string.f2637jp).t0(R$string.f2668kp, new Runnable() { // from class: l.zpe0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28904a.m8491B2();
                }
            }).z0();
        }
    }

    /* JADX INFO: renamed from: C3 */
    public final void m8494C3(Runnable runnable, String str) {
        boolean zIsConnected = Network.isConnected(CoreModule.f1533b);
        zvf0.u("e_privacy", ((C0285b) ((jq2) this).viewModel).m8682a1(), new j760[]{vwb.Y("privacy_type", str)});
        if (zIsConnected && NullChecker.a(this.f5656e) && xma.m27355L3()) {
            zvf0.v("e_privacy", ((C0285b) ((jq2) this).viewModel).m8682a1(), new j760[]{vwb.Y("privacy_type", str)});
            if (NullChecker.a(runnable)) {
                runnable.run();
                return;
            }
            return;
        }
        if (zIsConnected && NullChecker.a(this.f5656e)) {
            com.p1.mobile.putong.core.ui.purchase.c.n1(act(), "p_settings,privacy", Privilege.privacy_membership);
        } else {
            lsi0.n(R$string.f2802p4);
        }
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m8495D2(View view) {
        m8494C3(new Runnable() { // from class: l.ppe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19259a.m8493C2();
            }
        }, "freeze_activetime");
    }

    /* JADX INFO: renamed from: D3 */
    public void m8496D3() {
        if (((Boolean) x1f0.b.get()).booleanValue()) {
            return;
        }
        ((C0285b) ((jq2) this).viewModel).m8688e1(true, x2c0.f26004Jt);
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m8497E2() {
        if (NullChecker.a(this.f5656e) && !this.f5656e.hideAge.booleanValue()) {
            lsi0.y(act().getString(R$string.f2730mp));
        }
        ((C0285b) ((jq2) this).viewModel).m8678Z();
    }

    /* JADX INFO: renamed from: E3 */
    public final void m8498E3() {
        UserSearchSettings userSearchSettings = this.f5653b.getSettingGroup().search;
        int iIntValue = this.f5653b.getSearchAgeAllowedMinimum().intValue();
        int iIntValue2 = User.AGE_MIN_GOOGLEPLAY;
        if (iIntValue >= iIntValue2) {
            iIntValue2 = this.f5653b.getSearchAgeAllowedMinimum().intValue();
        }
        userSearchSettings.ageAllowedMinimum = Integer.valueOf(iIntValue2);
        UserSearchSettings userSearchSettings2 = this.f5653b.getSettingGroup().search;
        int iIntValue3 = this.f5653b.getSearchMinAge().intValue();
        int iIntValue4 = User.AGE_MIN_GOOGLEPLAY;
        if (iIntValue3 >= iIntValue4) {
            iIntValue4 = this.f5653b.getSearchMinAge().intValue();
        }
        userSearchSettings2.minAge = Integer.valueOf(iIntValue4);
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m8499F1() {
        return this.f5653b.autoAdjustSuggestRadius().booleanValue();
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ void m8500F2(View view) {
        m8494C3(new Runnable() { // from class: l.qpe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19967a.m8497E2();
            }
        }, "hide_age");
    }

    /* JADX INFO: renamed from: F3 */
    public void m8501F3() {
        if (NullChecker.a(this.f5652a) && NullChecker.a(this.f5653b) && CoreModule.m1850H().signedIn_() && m8554a3()) {
            SettingGroups settingGroups = new SettingGroups();
            UserSearchSettings userSearchSettings = new UserSearchSettings();
            settingGroups.search = userSearchSettings;
            userSearchSettings.lookingForGender = this.f5653b.getLookingFor();
            settingGroups.search.ageAllowedMinimum = this.f5653b.getSearchAgeAllowedMinimum();
            settingGroups.search.ageAllowedMaximum = this.f5653b.getSearchAgeAllowedMaximum();
            settingGroups.search.minAge = this.f5653b.getSearchMinAge();
            settingGroups.search.maxAge = this.f5653b.getSearchMaxAge();
            settingGroups.search.radius = this.f5653b.getSearchRadius();
            settingGroups.search.radiusAllowedMinimum = this.f5653b.getRadiusAllowedMinimum();
            settingGroups.search.radiusAllowedMaximum = this.f5653b.getRadiusAllowedMaximum();
            settingGroups.search.priorities = this.f5653b.getSearchPriority();
            settingGroups.search.autoAdjustRadius = this.f5653b.autoAdjustSuggestRadius();
            if (qib0.f19804b0.f17706a.mo67rq(this.f5652a.settings.getSettingGroup())) {
                settingGroups.gender = this.f5653b.getSettingGroup().gender;
            }
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f5652a.settings.getSettingGroup());
            if (NullChecker.a(settingGroupsSubtract)) {
                CoreModule.f1534c.f3652m0.m3051k8(settingGroupsSubtract).subscribe(mkd0.H(new e30() { // from class: l.eoe0
                    public final void call(Object obj) {
                        HomeStatisticsHelper.F("settings");
                    }
                }, new e30() { // from class: l.foe0
                    public final void call(Object obj) {
                        C0284a.m8455k0((Throwable) obj);
                    }
                }));
            }
            if (u59.m24981S()) {
                AdvancedSettings advancedSettingsM8520O1 = m8520O1();
                if (NullChecker.a(advancedSettingsM8520O1)) {
                    CoreModule.f1534c.f3553F0.m12315o3(advancedSettingsM8520O1, false).subscribe(mkd0.H(new e30() { // from class: l.goe0
                        public final void call(Object obj) {
                            HomeStatisticsHelper.F("settings");
                        }
                    }, new e30() { // from class: l.hoe0
                        public final void call(Object obj) {
                            C0284a.m8484x0((Throwable) obj);
                        }
                    }));
                }
            }
        }
    }

    /* JADX INFO: renamed from: H1 */
    public void m8502H1() {
        if (this.f5667p) {
            ((C0285b) ((jq2) this).viewModel).m8698j1();
        }
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m8503H2() {
        if (NullChecker.a(this.f5656e) && !this.f5656e.hideLocation.booleanValue()) {
            lsi0.y(act().getString(R$string.f2792op));
        }
        ((C0285b) ((jq2) this).viewModel).m8681a0();
    }

    /* JADX INFO: renamed from: H3 */
    public final void m8504H3() {
        if (NullChecker.a(this.f5656e) && xma.m27355L3()) {
            duringCreated(CoreModule.f1534c.f3550E0.m26480R3(this.f5656e)).subscribe(mkd0.H(new e30() { // from class: l.bqe0
                public final void call(Object obj) {
                    C0284a.m8458l0((roj0) obj);
                }
            }, new e30() { // from class: l.cqe0
                public final void call(Object obj) {
                    yij0.D((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I1 */
    public String m8505I1() {
        return this.f5662k.get(this.f5653b.getLookingFor().toString());
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ void m8506I2(View view) {
        m8494C3(new Runnable() { // from class: l.ope0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18318a.m8503H2();
            }
        }, "hide_location");
    }

    /* JADX INFO: renamed from: I3 */
    public int m8507I3() {
        double dK = i0g0.K(this.f5653b.getSearchRadius().intValue());
        if (dK >= 59.0d && this.f5653b.getSearchRadius().intValue() < this.f5653b.getRadiusAllowedMaximum().intValue()) {
            return 59;
        }
        if (this.f5653b.getSearchRadius().intValue() >= this.f5653b.getRadiusAllowedMaximum().intValue()) {
            return 60;
        }
        return (int) dK;
    }

    /* JADX INFO: renamed from: J1 */
    public int m8508J1() {
        return (this.f5653b.getRadiusAllowedMaximum().intValue() - this.f5653b.getRadiusAllowedMinimum().intValue()) / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
    }

    /* JADX INFO: renamed from: J2 */
    public final /* synthetic */ void m8509J2() {
        ((C0285b) ((jq2) this).viewModel).m8683b0();
    }

    /* JADX INFO: renamed from: J3 */
    public int m8510J3() {
        return (this.f5653b.getSearchRadius().intValue() - this.f5653b.getRadiusAllowedMinimum().intValue()) / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m8511K2(View view) {
        m8494C3(new Runnable() { // from class: l.mpe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17178a.m8509J2();
            }
        }, "show_to_mylikes_only");
    }

    /* JADX INFO: renamed from: K3 */
    public View.OnClickListener m8512K3() {
        return new View.OnClickListener() { // from class: l.fpe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12837a.m8548Y2(view);
            }
        };
    }

    /* JADX INFO: renamed from: L1 */
    public void m8513L1(boolean z) {
        this.f5656e.frozenActivity = Boolean.valueOf(z);
        m8504H3();
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m8514L2(View view) {
        act().startActivity(VipLocationHistoryAct.m9710V1(act(), "from_setting"));
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m8515M2(PaymentApi.PaymentResultStatus paymentResultStatus) {
        act().progressDismiss();
        if (paymentResultStatus == PaymentApi.PaymentResultStatus.succeed) {
            lsi0.w(R$string.f2574hm);
        } else {
            lsi0.h(R$string.f2862r4);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public void m8516M3(boolean z) {
        if (this.f5653b == null) {
            return;
        }
        o6j0.c("e_edit_increase_distance", "p_settings_view", new o6j0.a[]{o6j0.a.e().d("increase_distance_open").o(z)});
        this.f5653b.getSettingGroup().search.autoAdjustRadius = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: N1 */
    public Dialog.g m8517N1(final int i) {
        return new Dialog.g() { // from class: l.aqe0
            /* JADX INFO: renamed from: a */
            public final void m12182a(Dialog dialog, View view, int i2, CharSequence charSequence) {
                this.f8444a.m8561e2(i, dialog, view, i2, charSequence);
            }
        };
    }

    /* JADX INFO: renamed from: N2 */
    public final /* synthetic */ void m8518N2(Throwable th) {
        act().progressDismiss();
        lsi0.h(R$string.f2862r4);
    }

    /* JADX INFO: renamed from: N3 */
    public void m8519N3(List<String> list, int i) {
        this.f5653b.intent = SettingsIntent.get(list.get(i));
    }

    /* JADX INFO: renamed from: O1 */
    public AdvancedSettings m8520O1() {
        AdvancedSettings advancedSettings = this.f5655d;
        if (advancedSettings == null || this.f5654c == null) {
            return null;
        }
        ((C0285b) ((jq2) this).viewModel).m8702l1(advancedSettings);
        return this.f5655d.subtract(this.f5654c);
    }

    /* JADX INFO: renamed from: O3 */
    public void m8521O3() {
        if (NullChecker.a(this.f5653b) && qib0.f19804b0.f17706a.mo67rq(this.f5653b.getSettingGroup())) {
            m8524P3();
        } else {
            ((C0285b) ((jq2) this).viewModel).m8692g1(m8505I1());
        }
    }

    /* JADX INFO: renamed from: P1 */
    public int m8522P1() {
        return this.f5653b.getSearchAgeAllowedMaximum().intValue();
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ void m8523P2(View view) {
        aqo aqoVarH = aqo.h(act(), act() instanceof PutongAct ? ((PutongAct) act()).iap().i() : null);
        act().progress(R$string.f1831J5);
        aqoVarH.a().doOnNext(new e30() { // from class: l.vpe0
            public final void call(Object obj) {
                CoreModule.f1534c.f3628e0.m21417W9(CoreModule.m1850H().userId());
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.wpe0
            public final void call(Object obj) {
                this.f25280a.m8515M2((PaymentApi.PaymentResultStatus) obj);
            }
        }, new e30() { // from class: l.xpe0
            public final void call(Object obj) {
                this.f27674a.m8518N2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P3 */
    public final void m8524P3() {
        List<LookingFor> list = this.f5653b.getSettingGroup().gender.lookingForGenders;
        if (list.size() > 2) {
            ((C0285b) ((jq2) this).viewModel).m8692g1(act().getResources().getString(R$string.f1601Bf));
            return;
        }
        if (list.size() <= 0) {
            ((C0285b) ((jq2) this).viewModel).m8692g1(this.f5663l.get(this.f5653b.getLookingFor().toString()));
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (LookingFor lookingFor : list) {
            if (!sb.toString().isEmpty()) {
                sb.append(" & ");
            }
            sb.append(this.f5663l.get(lookingFor.toString()));
        }
        ((C0285b) ((jq2) this).viewModel).m8692g1(sb.toString());
    }

    /* JADX INFO: renamed from: Q1 */
    public int m8525Q1() {
        return this.f5653b.getSearchAgeAllowedMinimum().intValue();
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m8526Q2(View view) {
        act().startActivity(new Intent((Context) act(), (Class<?>) AboutTantanAct.class));
    }

    /* JADX INFO: renamed from: Q3 */
    public void m8527Q3() {
        if (mb90.b(PurchaseType.TYPE_ROAMING_PKG) && ((Boolean) CoreModule.f1534c.f3643j0.f3276Z.get()).booleanValue() && !((Boolean) CoreModule.f1534c.f3643j0.f3277a0.get()).booleanValue()) {
            ((C0285b) ((jq2) this).viewModel).m8723v1();
        }
    }

    /* JADX INFO: renamed from: R1 */
    public int m8528R1() {
        return this.f5653b.getSearchMaxAge().intValue();
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m8529R2(View view) {
        act().startActivity(IntlPersonalDetailsAct.INSTANCE.m8369a(act(), "setting"));
    }

    /* JADX INFO: renamed from: R3 */
    public void m8530R3(boolean z) {
        this.f5656e.showMeToMyLike = Boolean.valueOf(z);
        m8504H3();
    }

    /* JADX INFO: renamed from: S1 */
    public int m8531S1() {
        return (!"ko".equals(Locale.getDefault().getLanguage()) || this.f5653b.getSearchMinAge().intValue() > 20) ? this.f5653b.getSearchMinAge().intValue() : this.f5653b.getSearchAgeAllowedMinimum().intValue();
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m8532S2(View view) {
        act().startActivity(CoreModule.m1855Q().Gr(act(), (LiveSettingArgs) null));
    }

    /* JADX INFO: renamed from: S3 */
    public void m8533S3(boolean z) {
        act().progress(R$string.f1831J5);
        if (z) {
            User userMe_ = CoreModule.m1851K().me_();
            if (userMe_ == null) {
                lsi0.h(com.p000p1.mobile.putong.common.R$string.f1294B);
                qib0.m22153b1(null, false, AccountTempApi.InactiveType.None, false).subscribe(mkd0.F());
                CrashHelper.c(new Exception("catch datebase query null NullPointerException"));
                return;
            }
            qib0.f19788L.f1135d.p(((Media) userMe_.fp()).url, (AuthData) CoreModule.m1850H().getAuthData().b(), userMe_.name);
        } else {
            qib0.f19788L.f1135d.i();
        }
        w85.INSTANCE.m("Log out", (Map) null);
        zvf0.r("e_sign_out_botton", ((C0285b) ((jq2) this).viewModel).m8682a1());
        qib0.m22149Z0(true, false).materialize().first().subscribe(mkd0.H(new e30() { // from class: l.ooe0
            public final void call(Object obj) {
                C0284a.m8414B1((Notification) obj);
            }
        }, new e30() { // from class: l.poe0
            public final void call(Object obj) {
                this.f19237a.m8551Z2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T1 */
    public String m8534T1() {
        int iIntValue;
        int iIntValue2 = this.f5653b.getSearchMinAge().intValue();
        int iIntValue3 = this.f5653b.getSearchMaxAge().intValue();
        int i = iIntValue3 - 1;
        if (!"ko".equals(Locale.getDefault().getLanguage())) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5653b.getSearchMinAge());
            sb.append(" - ");
            sb.append(this.f5653b.getSearchMaxAge());
            sb.append(this.f5653b.getSearchMaxAge().equals(this.f5653b.getSearchAgeAllowedMaximum()) ? "+" : "");
            return sb.toString();
        }
        int iIntValue4 = 20;
        if (iIntValue2 < 20) {
            iIntValue = 20;
        } else {
            iIntValue = iIntValue2 >= i ? this.f5653b.getSearchMinAge().intValue() : iIntValue2 + 1;
        }
        if (iIntValue3 >= 20) {
            iIntValue4 = iIntValue3 >= i ? this.f5653b.getSearchMaxAge().intValue() : iIntValue3 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iIntValue);
        sb2.append(" - ");
        sb2.append(iIntValue4);
        sb2.append(this.f5653b.getSearchMaxAge().equals(this.f5653b.getSearchAgeAllowedMaximum()) ? "+" : "");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m8535T2(View view) {
        act().startActivity(new Intent((Context) act(), (Class<?>) NewAccountSecureAct.class));
    }

    /* JADX INFO: renamed from: T3 */
    public void m8536T3(int i, int i2, d30 d30Var) {
        if (i < this.f5653b.getSearchAgeAllowedMinimum().intValue() || i2 < this.f5653b.getSearchAgeAllowedMinimum().intValue() || i > this.f5653b.getSearchAgeAllowedMaximum().intValue() || i2 > this.f5653b.getSearchAgeAllowedMaximum().intValue()) {
            return;
        }
        this.f5653b.getSettingGroup().search.minAge = Integer.valueOf(i);
        this.f5653b.getSettingGroup().search.maxAge = Integer.valueOf(i2);
        d30Var.call();
        act().removeCallbacks(this.f5675x);
        act().postDelayed(this.f5675x, 1000L);
    }

    /* JADX INFO: renamed from: U1 */
    public int m8537U1(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (TEnum.equals(this.f5653b.intent, list.get(i))) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m8538U2(View view) {
        int i;
        view.requestFocus();
        if (NullChecker.a(this.f5653b) && qib0.f19804b0.f17706a.mo67rq(this.f5653b.getSettingGroup())) {
            ((C0285b) ((jq2) this).viewModel).m8717s1(this.f5653b.getSettingGroup());
            return;
        }
        if (TEnum.equals(this.f5653b.getLookingFor(), "male")) {
            i = 0;
        } else {
            i = TEnum.equals(this.f5653b.getLookingFor(), "female") ? 1 : 2;
        }
        o6j0.c("e_edit_gender_filter", "p_settings_view", new o6j0.a[0]);
        ((C0285b) ((jq2) this).viewModel).m8715r1(i);
    }

    /* JADX INFO: renamed from: U3 */
    public void m8539U3(e30<String> e30Var) {
        String strConcat;
        Integer num = 0;
        if (IntlCountryCodeController.m5f()) {
            String str = " " + act().getString(R$string.f1994Oi);
            double dK = i0g0.K(this.f5653b.getSearchRadius().intValue());
            if (dK >= 59.0d && this.f5653b.getSearchRadius().intValue() < this.f5653b.getRadiusAllowedMaximum().intValue()) {
                strConcat = "59".concat(str);
            } else if (this.f5653b.getSearchRadius().intValue() >= this.f5653b.getRadiusAllowedMaximum().intValue()) {
                strConcat = "60" + str + "+";
            } else if (this.f5653b.getSearchRadius().intValue() <= this.f5653b.getRadiusAllowedMinimum().intValue()) {
                strConcat = "<1 " + act().getString(R$string.f2024Pi);
            } else {
                strConcat = zz6.h.format(dK) + str;
            }
        } else {
            int iIntValue = this.f5653b.getSearchRadius().intValue() / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
            String string = act().getString(R$string.f2262Xg);
            Integer radiusAllowedMaximum = this.f5653b.getRadiusAllowedMaximum();
            Integer radiusAllowedMinimum = this.f5653b.getRadiusAllowedMinimum();
            if (radiusAllowedMaximum == null) {
                radiusAllowedMaximum = num;
            }
            num = radiusAllowedMinimum != null ? radiusAllowedMinimum : 0;
            if (iIntValue >= radiusAllowedMaximum.intValue() / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) {
                strConcat = (radiusAllowedMaximum.intValue() / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) + string + "+";
            } else if (iIntValue <= num.intValue() / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) {
                strConcat = "<" + (num.intValue() / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) + string;
            } else {
                strConcat = Integer.toString(iIntValue) + string;
            }
        }
        e30Var.call(strConcat);
    }

    /* JADX INFO: renamed from: V1 */
    public String m8540V1() {
        SettingsIntent settingsIntent = this.f5653b.intent;
        if (settingsIntent == null) {
            return null;
        }
        String string = settingsIntent.toString();
        string.getClass();
        int i = 0;
        switch (string) {
            case "friend":
                i = R$string.f1909Ln;
                break;
            case "relationship":
                i = R$string.f1939Mn;
                break;
            case "date":
                i = R$string.f1849Jn;
                break;
            case "fate":
                i = R$string.f1879Kn;
                break;
        }
        return act().string(i);
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m8541V2(View view) {
        act().startActivity(new Intent((Context) act(), (Class<?>) DataAndStorageAct.class));
    }

    /* JADX INFO: renamed from: V3 */
    public void m8542V3(int i) {
        if (!IntlCountryCodeController.m5f()) {
            this.f5653b.getSettingGroup().search.radius = Integer.valueOf(this.f5653b.getRadiusAllowedMinimum().intValue() + Math.min(this.f5653b.getRadiusAllowedMaximum().intValue() - this.f5653b.getRadiusAllowedMinimum().intValue(), Math.max(0, i * AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO)));
            return;
        }
        Settings settings = this.f5653b;
        if (i == 60) {
            settings.getSettingGroup().search.radius = this.f5653b.getRadiusAllowedMaximum();
        } else {
            settings.getSettingGroup().search.radius = Integer.valueOf(this.f5653b.getRadiusAllowedMinimum().intValue() + Math.min(this.f5653b.getRadiusAllowedMaximum().intValue() - this.f5653b.getRadiusAllowedMinimum().intValue(), (int) Math.max(0.0d, i0g0.L(i))));
        }
    }

    /* JADX INFO: renamed from: W1 */
    public SpannableString m8543W1() {
        SpannableString spannableString = new SpannableString(act().getString(R$string.f2731mq, "7.2.7"));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        return spannableString;
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m8544W2(View view) {
        zrj0.x(act());
    }

    /* JADX INFO: renamed from: X1 */
    public void m8545X1(SettingGroups settingGroups) {
        this.f5653b.getSettingGroup().gender.lookingForGenders = settingGroups.gender.lookingForGenders;
        this.f5653b.getSettingGroup().gender.notShowCis = settingGroups.gender.notShowCis;
        m8524P3();
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m8546X2() {
        zvf0.r("e_school_identify_makeSure_guide_click", "p_school_identify_makeSure_guide");
        act().startActivity(StudentInfoAct.V1(act(), "Chanel8.SchoolIdentifyPage.Shown", false));
    }

    /* JADX INFO: renamed from: Y1 */
    public void m8547Y1(boolean z) {
        this.f5656e.hideAge = Boolean.valueOf(z);
        m8504H3();
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m8548Y2(View view) {
        ((C0285b) ((jq2) this).viewModel).m8660B1();
        new ukf0(act()).a();
        x1f0.b.put(Boolean.TRUE);
        ((C0285b) ((jq2) this).viewModel).m8712q1(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Z */
    public void m8549Z() {
        super.Z();
        this.f5667p = ((C0285b) ((jq2) this).viewModel).m8691g0();
        this.f5670s = ((C0285b) ((jq2) this).viewModel).m8693h0();
        this.f5671t = ((C0285b) ((jq2) this).viewModel).m8684c0();
        this.f5672u = ((C0285b) ((jq2) this).viewModel).m8685d0();
        this.f5673v = ((C0285b) ((jq2) this).viewModel).m8689f0();
        this.f5674w = ((C0285b) ((jq2) this).viewModel).m8687e0();
        this.f5668q = UserPrivacySettings.new_();
    }

    /* JADX INFO: renamed from: Z1 */
    public void m8550Z1(boolean z) {
        this.f5656e.hideLocation = Boolean.valueOf(z);
        m8504H3();
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m8551Z2(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: a0 */
    public void m8552a0() {
        creates(new e30() { // from class: l.rne0
            public final void call(Object obj) {
                this.f20642a.m8454j2((Bundle) obj);
            }
        }, new d30() { // from class: l.tne0
            public final void call() {
                this.f22192a.m8457k2();
            }
        });
        duringCreated(new v9j() { // from class: l.vne0
            public final Object call() {
                return zrj0.f;
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.wne0
            public final void call(Object obj) {
                this.f25253a.m8478t2((Boolean) obj);
            }
        }));
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.xne0
            public final void call(Object obj) {
                this.f27621a.m8481u2((c) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3652m0.m3048j9().switchMap(new w9j() { // from class: l.yne0
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3628e0.m21486o9();
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.zne0
            public final void call(Object obj) {
                this.f28853a.m8483v2((User) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3628e0.m21486o9()).filter(new w9j() { // from class: l.aoe0
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(TEnum.equals(user.source, "wechat") || TEnum.equals(user.source, "qq"));
            }
        }).map(new w9j() { // from class: l.boe0
            public final Object call(Object obj) {
                return C0284a.m8474s0((User) obj);
            }
        }).distinctUntilChanged().filter(new w9j() { // from class: l.doe0
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.coe0
            public final void call(Object obj) {
                this.f9768a.m8573l2((String) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3628e0.m21486o9().map(new w9j() { // from class: l.noe0
            public final Object call(Object obj) {
                return ((User) obj).age;
            }
        }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.yoe0
            public final void call(Object obj) {
                this.f28325a.m8575m2((Integer) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3628e0.f18969e0.obs()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.jpe0
            public final void call(Object obj) {
                this.f15319a.m8577n2((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3628e0.m21486o9()).map(new w9j() { // from class: l.upe0
            public final Object call(Object obj) {
                return this.f23697a.m8466o2((User) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.dqe0
            public final void call(Object obj) {
                this.f10527a.m8580p2((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3616a0.f19369U.obs()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.eqe0
            public final void call(Object obj) {
                this.f11400a.m8471q2((Boolean) obj);
            }
        }));
        CoreModule.f1534c.f3628e0.m21447ea();
        p420.m21036t(act());
        if (u59.m24981S()) {
            duringCreated(CoreModule.f1534c.f3553F0.m12319s3().switchMap(new w9j() { // from class: l.fqe0
                public final Object call(Object obj) {
                    return CoreModule.f1534c.f3553F0.m12308h3();
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.gqe0
                public final void call(Object obj) {
                    this.f13441a.m8583r2((AdvancedSettings) obj);
                }
            }));
            CoreModule.f1534c.f3553F0.m12317q3();
        }
        duringCreated(CoreModule.m1855Q().ao(CoreModule.m1850H().userId())).subscribe(mkd0.H(new e30() { // from class: l.sne0
            public final void call(Object obj) {
                this.f21440a.m8585s2((Boolean) obj);
            }
        }, new e30() { // from class: l.une0
            public final void call(Object obj) {
                C0284a.m8442e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a2 */
    public void m8553a2(boolean z) {
        this.f5656e.hideIcon = Boolean.valueOf(z);
        m8504H3();
    }

    /* JADX INFO: renamed from: a3 */
    public final boolean m8554a3() {
        if (!NullChecker.a(Act.foreground_())) {
            return true;
        }
        Activity activity = (Activity) Act.foreground_().a.get();
        return ((activity instanceof SwitchAccountAct) || (activity instanceof SwitchAccountV2Act) || CoreModule.m1850H().getSignOutJumpAct().isInstance(activity)) ? false : true;
    }

    /* JADX INFO: renamed from: b2 */
    public void m8555b2() {
        User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
        if ((TEnum.equals(userM21483na.source, "wechat") || TEnum.equals(userM21483na.source, "qq")) && TextUtils.isEmpty(userM21483na.settings.phoneNumber.number)) {
            TextUtils.isEmpty(userM21483na.settings.linkedPhoneNumber.number);
        }
        ((C0285b) ((jq2) this).viewModel).m8710p1(act().getString(R$string.f2748nc));
        ((C0285b) ((jq2) this).viewModel).m8708o1(TextUtils.isEmpty(userM21483na.settings.phoneNumber.number) && !((Boolean) CoreModule.f1534c.f3616a0.f19369U.get()).booleanValue());
        if (b43.m12519b()) {
            ((C0285b) ((jq2) this).viewModel).m8700k1(act().getString(R$string.f1579An));
        } else if (TEnum.equals(userM21483na.source, "facebook")) {
            ((C0285b) ((jq2) this).viewModel).m8700k1(act().getString(R$string.f3091yn));
        }
    }

    /* JADX INFO: renamed from: b3 */
    public boolean m8556b3() {
        if (!NullChecker.a(this.f5658g) || !this.f5658g.d()) {
            return false;
        }
        this.f5658g.c();
        return true;
    }

    /* JADX INFO: renamed from: c2 */
    public void m8557c2() {
        duringCreated(CoreModule.f1534c.f3628e0.m21486o9()).map(new w9j() { // from class: l.toe0
            public final Object call(Object obj) {
                return ((User) obj).getLatitudeAndLongitude();
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.uoe0
            public final void call(Object obj) {
                this.f23688a.m8565g2((DoublePair) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3628e0.m21486o9().filter(new w9j() { // from class: l.voe0
            public final Object call(Object obj) {
                return Boolean.valueOf(DoublePair.new_().equals(((User) obj).getLatitudeAndLongitude()));
            }
        }).switchMap(new w9j() { // from class: l.woe0
            public final Object call(Object obj) {
                return qib0.f19778E.p().filter(new w9j() { // from class: l.tpe0
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(CoreModule.m1850H().signedIn_());
                    }
                });
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.xoe0
            public final void call(Object obj) {
                this.f27665a.m8569i2((Location) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c3 */
    public void m8558c3(final boolean z) {
        duringCreated(CoreModule.f1534c.f3628e0.m21361Ha(!z)).subscribe(mkd0.H(new e30() { // from class: l.npe0
            public final void call(Object obj) {
                this.f17797a.m8590w2(z, (roj0) obj);
            }
        }, new yaf0()));
    }

    /* JADX INFO: renamed from: d2 */
    public void m8559d2(f30<Boolean, Boolean> f30Var) {
        Boolean bool = Boolean.FALSE;
        f30Var.call(bool, bool);
    }

    /* JADX INFO: renamed from: d3 */
    public void m8560d3() {
        act().startActivity(new Intent((Context) act(), (Class<?>) ChatAndNotifiAct.class));
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m8561e2(int i, Dialog dialog, View view, int i2, CharSequence charSequence) {
        if (i != i2) {
            if (i2 == 0) {
                this.f5653b.getSettingGroup().search.lookingForGender = LookingFor.get("male");
                ((C0285b) ((jq2) this).viewModel).m8692g1(this.f5662k.get("male"));
                return;
            }
            Settings settings = this.f5653b;
            if (i2 == 1) {
                settings.getSettingGroup().search.lookingForGender = LookingFor.get("female");
                ((C0285b) ((jq2) this).viewModel).m8692g1(this.f5662k.get("female"));
            } else {
                settings.getSettingGroup().search.lookingForGender = LookingFor.get("both");
                ((C0285b) ((jq2) this).viewModel).m8692g1(this.f5662k.get("both"));
            }
        }
    }

    /* JADX INFO: renamed from: e3 */
    public void m8562e3() {
        act().startActivity(new Intent((Context) act(), (Class<?>) ChatInputSettingAct.class));
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m8563f2(d90 d90Var) {
        f5651y.put(d90Var.b());
        ((C0285b) ((jq2) this).viewModel).m8704m1(TextUtils.isEmpty(d90Var.b()) ? act().string(R$string.f1999On) : d90Var.b());
    }

    /* JADX INFO: renamed from: f3 */
    public void m8564f3(boolean z) {
        if (!CoreModule.f1534c.f3628e0.m21490p9().isVIP()) {
            ((C0285b) ((jq2) this).viewModel).m8728y1();
            return;
        }
        this.f5668q.hideActivityTime = Boolean.valueOf(z);
        act().progress(R$string.f1831J5);
        duringCreated(CoreModule.f1534c.f3628e0.m21526y9(this.f5668q)).subscribe(mkd0.H(new e30() { // from class: l.loe0
            public final void call(Object obj) {
                this.f16539a.m8592x2((SettingGroups) obj);
            }
        }, new e30() { // from class: l.moe0
            public final void call(Object obj) {
                this.f17154a.m8594y2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m8565g2(DoublePair doublePair) {
        if (TextUtils.isEmpty((CharSequence) f5651y.get()) && NullChecker.a(this.f5652a) && NullChecker.a(this.f5652a.location) && !TextUtils.isEmpty(this.f5652a.location.region.city)) {
            f5651y.put(this.f5652a.location.region.city);
        }
        boolean zEquals = DoublePair.new_().equals(doublePair);
        s7m s7mVar = ((jq2) this).viewModel;
        if (zEquals) {
            ((C0285b) s7mVar).m8706n1(act().string(R$string.f2029Pn));
            ((C0285b) ((jq2) this).viewModel).m8704m1(TextUtils.isEmpty((CharSequence) f5651y.get()) ? act().string(R$string.f1999On) : (String) f5651y.get());
        } else {
            ((C0285b) s7mVar).m8706n1(act().string(R$string.f2059Qn));
            ((C0285b) ((jq2) this).viewModel).m8704m1(TextUtils.isEmpty((CharSequence) f5651y.get()) ? act().string(R$string.f1999On) : (String) f5651y.get());
            this.f5657f.e(this, doublePair.first, doublePair.second, new e30() { // from class: l.kpe0
                public final void call(Object obj) {
                    this.f15954a.m8563f2((d90) obj);
                }
            }, new e30() { // from class: l.lpe0
                public final void call(Object obj) {
                    App.d.k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g3 */
    public View.OnClickListener m8566g3() {
        return new View.OnClickListener() { // from class: l.dpe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10512a.m8489A2(view);
            }
        };
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m8567h2(DoublePair doublePair, d90 d90Var) {
        f5651y.put(d90Var.b());
        ((C0285b) ((jq2) this).viewModel).m8704m1(TextUtils.isEmpty(d90Var.b()) ? act().string(R$string.f1999On) : d90Var.b());
        if (TextUtils.isEmpty(d90Var.b())) {
            zvf0.B("e_setting_location_to_address", "", new j760[]{vwb.Y("is_success", Boolean.TRUE), vwb.Y("has_city", Boolean.FALSE), vwb.Y("location_latitude", Double.valueOf(doublePair.first)), vwb.Y("location_longitude", Double.valueOf(doublePair.second))});
        } else {
            Boolean bool = Boolean.TRUE;
            zvf0.B("e_setting_location_to_address", "", new j760[]{vwb.Y("is_success", bool), vwb.Y("has_city", bool), vwb.Y("location_latitude", Double.valueOf(doublePair.first)), vwb.Y("location_longitude", Double.valueOf(doublePair.second))});
        }
    }

    /* JADX INFO: renamed from: h3 */
    public View.OnClickListener m8568h3() {
        return new View.OnClickListener() { // from class: l.gpe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13428a.m8495D2(view);
            }
        };
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m8569i2(Location location) {
        this.f5669r = true;
        zvf0.B("e_setting_get_user_location_success", "", new j760[0]);
        final DoublePair doublePairNew_ = DoublePair.new_();
        doublePairNew_.first = location.u();
        doublePairNew_.second = location.x();
        if (DoublePair.new_().equals(CoreModule.f1534c.f3628e0.m21490p9().getLatitudeAndLongitude())) {
            this.f5657f.e(this, doublePairNew_.first, doublePairNew_.second, new e30() { // from class: l.rpe0
                public final void call(Object obj) {
                    this.f20674a.m8567h2(doublePairNew_, (d90) obj);
                }
            }, new e30() { // from class: l.spe0
                public final void call(Object obj) {
                    C0284a.m8479u0(doublePairNew_, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i3 */
    public View.OnClickListener m8570i3() {
        return new View.OnClickListener() { // from class: l.bpe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9028a.m8500F2(view);
            }
        };
    }

    /* JADX INFO: renamed from: j3 */
    public View.OnClickListener m8571j3() {
        return new View.OnClickListener() { // from class: l.joe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15292a.m8506I2(view);
            }
        };
    }

    /* JADX INFO: renamed from: k3 */
    public View.OnClickListener m8572k3() {
        return new View.OnClickListener() { // from class: l.roe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20662a.m8511K2(view);
            }
        };
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m8573l2(String str) {
        ((C0285b) ((jq2) this).viewModel).m8708o1(false);
        ((C0285b) ((jq2) this).viewModel).m8710p1(act().getString(R$string.f2748nc));
    }

    /* JADX INFO: renamed from: l3 */
    public View.OnClickListener m8574l3() {
        return new View.OnClickListener() { // from class: l.koe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15926a.m8514L2(view);
            }
        };
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m8575m2(Integer num) {
        if (!this.f5666o) {
            ((C0285b) ((jq2) this).viewModel).m8705n0();
        }
        this.f5666o = false;
    }

    /* JADX INFO: renamed from: m3 */
    public void m8576m3() {
        act().startActivity(PrivacySettingAct.m9070Y1(act(), "setting"));
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m8577n2(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        ((C0285b) ((jq2) this).viewModel).m8708o1(false);
    }

    /* JADX INFO: renamed from: n3 */
    public void m8578n3() {
        act().startActivity(new Intent((Context) act(), (Class<?>) PushMsgSettingAct.class));
    }

    /* JADX INFO: renamed from: o3 */
    public void m8579o3() {
        act().startActivity(PrivacyAndPremissonAct.m9073Y1(act(), "other_setting"));
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m8580p2(Boolean bool) {
        ((C0285b) ((jq2) this).viewModel).m8690f1(bool.booleanValue());
        CoreModule.f1534c.f3628e0.m21417W9(CoreModule.m1850H().userId());
    }

    /* JADX INFO: renamed from: p3 */
    public void m8581p3() {
        act().startActivity(new Intent((Context) act(), (Class<?>) PrivacyAndPremissonAct.class));
    }

    /* JADX INFO: renamed from: q3 */
    public View.OnClickListener m8582q3() {
        return new View.OnClickListener() { // from class: l.epe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11388a.m8523P2(view);
            }
        };
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m8583r2(AdvancedSettings advancedSettings) {
        if (NullChecker.a(advancedSettings)) {
            this.f5654c = advancedSettings;
            AdvancedSettings advancedSettingsClone = advancedSettings.clone();
            this.f5655d = advancedSettingsClone;
            ((C0285b) ((jq2) this).viewModel).m8703m0(advancedSettingsClone);
        }
    }

    /* JADX INFO: renamed from: r3 */
    public View.OnClickListener m8584r3() {
        return new View.OnClickListener() { // from class: l.hpe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14008a.m8526Q2(view);
            }
        };
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m8585s2(Boolean bool) {
        ((C0285b) ((jq2) this).viewModel).m8666F1(bool.booleanValue());
    }

    /* JADX INFO: renamed from: s3 */
    public View.OnClickListener m8586s3() {
        return new View.OnClickListener() { // from class: l.cpe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9782a.m8529R2(view);
            }
        };
    }

    /* JADX INFO: renamed from: t3 */
    public void m8587t3() {
        act().startActivity(WebViewAct.Z1(act(), "设置屏蔽词", ene0.a("set_page")));
    }

    /* JADX INFO: renamed from: u3 */
    public View.OnClickListener m8588u3() {
        return new View.OnClickListener() { // from class: l.zoe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28865a.m8532S2(view);
            }
        };
    }

    /* JADX INFO: renamed from: v3 */
    public View.OnClickListener m8589v3() {
        return new View.OnClickListener() { // from class: l.qoe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19954a.m8535T2(view);
            }
        };
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m8590w2(boolean z, roj0 roj0Var) {
        CoreModule.f1534c.f3628e0.m21490p9().setBlackDiamondTag(!z);
        ((C0285b) ((jq2) this).viewModel).m8658A1();
    }

    /* JADX INFO: renamed from: w3 */
    public View.OnClickListener m8591w3() {
        return new View.OnClickListener() { // from class: l.ape0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8437a.m8538U2(view);
            }
        };
    }

    /* JADX INFO: renamed from: x2 */
    public final /* synthetic */ void m8592x2(SettingGroups settingGroups) {
        act().progressDismiss();
        CoreModule.f1534c.f3628e0.m21417W9(CoreModule.m1850H().userId());
        o6j0.n("e_hide_active_time_status", "p_settings_view", new o6j0.a[]{o6j0.a.h("hide_time_status", settingGroups.privacy.hideActivityTime.booleanValue() ? "open" : "close")});
        ((C0285b) ((jq2) this).viewModel).m8690f1(settingGroups.privacy.hideActivityTime.booleanValue());
    }

    /* JADX INFO: renamed from: x3 */
    public void m8593x3() {
        Settings settings = this.f5653b;
        if (settings == null) {
            return;
        }
        o6j0.g("e_edit_distance_filter", "p_settings_view", new o6j0.a[]{o6j0.a.f("max_distance", settings.getSearchRadius().intValue() / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO)});
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m8594y2(Throwable th) {
        act().progressDismiss();
        ((C0285b) ((jq2) this).viewModel).m8679Z0(th);
    }

    /* JADX INFO: renamed from: y3 */
    public View.OnClickListener m8595y3() {
        return new View.OnClickListener() { // from class: l.ioe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14591a.m8541V2(view);
            }
        };
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m8596z2() {
        if (NullChecker.a(this.f5656e) && !this.f5656e.hideIcon.booleanValue()) {
            lsi0.y(act().getString(R$string.f2761np));
        }
        ((C0285b) ((jq2) this).viewModel).m8674X();
    }

    /* JADX INFO: renamed from: z3 */
    public View.OnClickListener m8597z3() {
        return new View.OnClickListener() { // from class: l.soe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21553a.m8544W2(view);
            }
        };
    }
}
