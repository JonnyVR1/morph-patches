package com.p051p1.mobile.putong.core.p058ui.settings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.view.View;
import com.facebook.AccessToken;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.PaymentApi;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.AdvancedSettings;
import com.p051p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RankLevel;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.p058ui.account.NewAccountSecureAct;
import com.p051p1.mobile.putong.core.p058ui.account.SwitchAccountAct;
import com.p051p1.mobile.putong.core.p058ui.account.SwitchAccountV2Act;
import com.p051p1.mobile.putong.core.p058ui.campus.StudentInfoAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.settings.C9011a;
import com.p051p1.mobile.putong.core.p058ui.settings.datastorage.DataAndStorageAct;
import com.p051p1.mobile.putong.core.p058ui.settings.privacy.PrivacySettingAct;
import com.p051p1.mobile.putong.core.p058ui.settings.privacyandpremisson.PrivacyAndPremissonAct;
import com.p051p1.mobile.putong.core.p058ui.vip.VipLocationHistoryAct;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.LookingFor;
import com.p051p1.mobile.putong.data.SearchPriority;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.SettingsIntent;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserPrivacySettings;
import com.p051p1.mobile.putong.data.UserSearchSettings;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.location.Location;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Marker;
import p137rx.C22421c;
import p137rx.Notification;
import p151v.CoverGuideView;
import p151v.VFrame;
import p153l.ar2;
import p153l.aso;
import p153l.bsj0;
import p153l.c17;
import p153l.d1k0;
import p153l.d79;
import p153l.dbc0;
import p153l.dtf0;
import p153l.eaf0;
import p153l.fjf0;
import p153l.fmj;
import p153l.gra;
import p153l.i4g0;
import p153l.joa;
import p153l.jxd0;
import p153l.jyb;
import p153l.l01;
import p153l.lve0;
import p153l.ner;
import p153l.o1j0;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.q8g0;
import p153l.qcj;
import p153l.qj90;
import p153l.r43;
import p153l.sfj0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.wyd0;
import p153l.x20;
import p153l.x95;
import p153l.xc20;
import p153l.xxv;
import p153l.y20;
import p153l.yyh0;
import p153l.z0w;
import p153l.z20;
import p153l.z80;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.a */
/* JADX INFO: loaded from: classes12.dex */
public class C9011a extends ar2<C9012b> {

    /* JADX INFO: renamed from: y */
    public static wyd0 f36718y = new wyd0(RankLevel.city, "");

    /* JADX INFO: renamed from: a */
    public User f36719a;

    /* JADX INFO: renamed from: b */
    public Settings f36720b;

    /* JADX INFO: renamed from: c */
    public AdvancedSettings f36721c;

    /* JADX INFO: renamed from: d */
    public AdvancedSettings f36722d;

    /* JADX INFO: renamed from: e */
    public PrivacyMembershipSetting f36723e;

    /* JADX INFO: renamed from: f */
    public fmj f36724f;

    /* JADX INFO: renamed from: g */
    public CoverGuideView f36725g;

    /* JADX INFO: renamed from: h */
    public jxd0 f36726h;

    /* JADX INFO: renamed from: i */
    public jxd0 f36727i;

    /* JADX INFO: renamed from: j */
    public final jxd0 f36728j;

    /* JADX INFO: renamed from: k */
    public Map<String, String> f36729k;

    /* JADX INFO: renamed from: l */
    public Map<String, String> f36730l;

    /* JADX INFO: renamed from: m */
    public String[] f36731m;

    /* JADX INFO: renamed from: n */
    public boolean f36732n;

    /* JADX INFO: renamed from: o */
    public boolean f36733o;

    /* JADX INFO: renamed from: p */
    public boolean f36734p;

    /* JADX INFO: renamed from: q */
    public UserPrivacySettings f36735q;

    /* JADX INFO: renamed from: r */
    public boolean f36736r;

    /* JADX INFO: renamed from: s */
    public int f36737s;

    /* JADX INFO: renamed from: t */
    public boolean f36738t;

    /* JADX INFO: renamed from: u */
    public String f36739u;

    /* JADX INFO: renamed from: v */
    public int f36740v;

    /* JADX INFO: renamed from: w */
    public int f36741w;

    /* JADX INFO: renamed from: x */
    public Runnable f36742x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.a$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C9011a.this.f36720b == null) {
                return;
            }
            sfj0.m185600g("e_edit_age_filter", "p_settings_view", sfj0.C20032a.m185613f("filter_min_age", C9011a.this.f36720b.getSearchMinAge().intValue()), sfj0.C20032a.m185613f("filter_max_age", C9011a.this.f36720b.getSearchMaxAge().intValue()));
        }
    }

    public C9011a(ner nerVar) {
        super(nerVar);
        Boolean bool = Boolean.FALSE;
        this.f36726h = new jxd0("prioritized_recommend_guideview_shown", bool);
        this.f36727i = new jxd0("tantan_verification_tip_show", bool);
        this.f36728j = new jxd0("hasJumpToNotificationPage" + CoreModule.m30929H().userId(), bool);
        this.f36732n = false;
        this.f36733o = true;
        this.f36734p = false;
        this.f36742x = new a();
    }

    /* JADX INFO: renamed from: B1 */
    public static /* synthetic */ void m56230B1(Notification notification) {
        if (NullChecker.m82486a(AccessToken.m7462d())) {
            z0w.m218186m().m218213u();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m56258e0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public /* synthetic */ void m56270j2(Bundle bundle) {
        l01 l01Var = new l01();
        this.f36729k = l01Var;
        l01Var.put("male", act().getResources().getString(R$string.f18341Bo));
        this.f36729k.put("female", act().getResources().getString(R$string.f18310Ao));
        this.f36729k.put("both", act().getResources().getString(R$string.f19873zo));
        l01 l01Var2 = new l01();
        this.f36730l = l01Var2;
        l01Var2.put("male", act().getResources().getString(R$string.f18732Of));
        this.f36730l.put("female", act().getResources().getString(R$string.f18852Sf));
        this.f36730l.put("nonbinary", act().getResources().getString(R$string.f18762Pf));
        this.f36730l.put("both", act().getResources().getString(R$string.f18732Of) + " & " + act().getResources().getString(R$string.f18852Sf));
        this.f36731m = new String[]{act().getResources().getString(R$string.f18341Bo), act().getResources().getString(R$string.f18310Ao), act().getResources().getString(R$string.f19873zo)};
        this.f36724f = fmj.m126236c(this, false);
        ((C9012b) this.viewModel).m56524r();
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m56271k0(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.isCannotModify() && !TextUtils.isEmpty(tantanForbidden.message)) {
                return;
            }
        }
        bsj0.m106246D(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m56273k2() {
        if (this.f36736r) {
            return;
        }
        i4g0.m138493B("e_setting_finish_no_location", "", new pf60[0]);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m56274l0(uxj0 uxj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public /* synthetic */ Boolean m56282o2(User user) {
        this.f36735q.hideVIP = Boolean.valueOf(user.membership.hideVIP);
        this.f36735q.hideActivityTime = Boolean.valueOf(user.membership.hideActivityTime);
        return Boolean.valueOf(user.isVIP() && user.membership.hideActivityTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public /* synthetic */ void m56287q2(Boolean bool) {
        if (bool.booleanValue()) {
            ((C9012b) this.viewModel).m56519o1(false);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ String m56290s0(User user) {
        return user.settings.phoneNumber.number + user.settings.linkedPhoneNumber.number;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public /* synthetic */ void m56294t2(Boolean bool) {
        ((C9012b) this.viewModel).m56506h1(bool.booleanValue());
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m56295u0(DoublePair doublePair, Throwable th) {
        Boolean bool = Boolean.FALSE;
        i4g0.m138493B("e_setting_location_to_address", "", jyb.m147494Y("is_success", bool), jyb.m147494Y("has_city", bool), jyb.m147494Y("location_latitude", Double.valueOf(doublePair.first)), jyb.m147494Y("location_longitude", Double.valueOf(doublePair.second)));
        App.f16087d.m21432k(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m56297u2(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            this.f36732n = true;
            if (this.f36719a == null) {
                ((C9012b) this.viewModel).m56532u1(true);
            }
            ((C9012b) this.viewModel).m56536w1(xxv.m213594u() || xxv.m213593t());
            m56343Q3();
            if (gra.m131555D2()) {
                ((C9012b) this.viewModel).m56498d1();
                return;
            }
            return;
        }
        if (c4470c == C4470c.f16268j) {
            i4g0.m138493B("e_setting_page_location_info", "", jyb.m147494Y("is_location_success", Boolean.valueOf(uqb0.f180370E.m80048q() != null)));
            m56317F3();
        } else if (c4470c == C4470c.f16270l && NullChecker.m82486a(this.f36725g) && this.f36725g.m224138d()) {
            this.f36725g.m224137c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m56299v2(User user) {
        this.f36719a = user;
        if (((C9012b) this.viewModel).f36832c.getVisibility() == 4) {
            ((C9012b) this.viewModel).m56532u1(false);
        }
        Settings settings = this.f36720b;
        if (settings == null) {
            this.f36720b = user.settings.mo225055clone();
            if (yyh0.INSTANCE.m217993i() && !TextUtils.isEmpty(this.f36739u)) {
                this.f36720b.getSettingGroup().search.radius = Integer.valueOf(this.f36737s);
                this.f36720b.getSettingGroup().search.autoAdjustRadius = Boolean.valueOf(this.f36738t);
                this.f36720b.getSettingGroup().search.lookingForGender = LookingFor.get(this.f36739u);
                this.f36720b.getSettingGroup().search.maxAge = Integer.valueOf(this.f36741w);
                this.f36720b.getSettingGroup().search.minAge = Integer.valueOf(this.f36740v);
            }
            m56314E3();
            ((C9012b) this.viewModel).m56510k0();
            return;
        }
        Settings settings2 = user.settings;
        settings.birthdate = settings2.birthdate;
        settings.phoneNumber = settings2.phoneNumber;
        settings.getSettingGroup().privacy.hideContacts = user.settings.hideContacts();
        this.f36720b.getSettingGroup().privacy.hideMutualContacts = user.settings.hideMutualContacts();
        this.f36720b.getSettingGroup().push.previewMessage = user.settings.previewPushMessage();
        this.f36720b.getSettingGroup().push.showMomentLikes = user.settings.showMomentLikes();
        Settings settings3 = this.f36720b;
        settings3.verification = user.settings.verification;
        settings3.getSettingGroup().search.priorities = new ArrayList();
        this.f36720b.getSettingGroup().search.priorities.addAll(user.settings.getSearchPriority());
        m56314E3();
        this.f36720b.getSettingGroup().search.radius = user.settings.getSearchRadius();
        this.f36720b.getSettingGroup().search.invisibleRadius = user.settings.getSettingGroup().search.invisibleRadius;
        ((C9012b) this.viewModel).m56510k0();
        if (uqb0.f180396b0.f170324a.mo29171rq(user.settings.getSettingGroup())) {
            this.f36720b.getSettingGroup().gender = user.settings.getSettingGroup().gender.mo225055clone();
            this.f36720b.getSettingGroup().search.lookingForGender = user.settings.getLookingFor();
            m56361X1(this.f36720b.getSettingGroup());
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m56300x0(Throwable th) {
        CoreModule.f18264c.f20405m0.m32168z5(false);
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m56305A2(View view) {
        m56310C3(new Runnable() { // from class: l.fye0
            @Override // java.lang.Runnable
            public final void run() {
                this.f101369a.m56410z2();
            }
        }, "hide_svip");
    }

    /* JADX INFO: renamed from: A3 */
    public Runnable m56306A3() {
        return new Runnable() { // from class: l.pxe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f154566a.m56362X2();
            }
        };
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m56307B2() {
        ((C9012b) this.viewModel).m56489Y();
    }

    /* JADX INFO: renamed from: B3 */
    public void m56308B3(VFrame vFrame) {
        StudentVerificationStatus studentVerificationStatus = this.f36720b.verification.studies.status;
        if (!TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus, "pending")) {
                o1j0.m165651y(act().getString(R$string.f19533op));
                return;
            } else {
                ((C9012b) this.viewModel).m56541z1();
                return;
            }
        }
        if (bsj0.m106262T(vFrame)) {
            i4g0.m138520r("e_student_verification_firstly_on", "p_settings_view");
            if (this.f36720b.getSearchPriority().contains(SearchPriority.get("student"))) {
                return;
            }
            this.f36720b.getSearchPriority().add(SearchPriority.get("student"));
            return;
        }
        i4g0.m138520r("e_student_verification_firstly_off", "p_settings_view");
        if (this.f36720b.getSearchPriority().contains(SearchPriority.get("student"))) {
            this.f36720b.getSearchPriority().remove(SearchPriority.get("student"));
        }
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m56309C2() {
        if (!NullChecker.m82486a(this.f36723e) || this.f36723e.frozenActivity.booleanValue()) {
            ((C9012b) this.viewModel).m56489Y();
        } else {
            act().dialog().m21499D(R$string.f18528Hp).m21540k0(R$string.f18466Fp).m21555t0(R$string.f18497Gp, new Runnable() { // from class: l.gye0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f107045a.m56307B2();
                }
            }).m21567z0();
        }
    }

    /* JADX INFO: renamed from: C3 */
    public final void m56310C3(Runnable runnable, String str) {
        boolean zIsConnected = Network.isConnected(CoreModule.f18263b);
        i4g0.m138523u("e_privacy", ((C9012b) this.viewModel).m56494a1(), jyb.m147494Y("privacy_type", str));
        if (zIsConnected && NullChecker.m82486a(this.f36723e) && joa.m146361M3()) {
            i4g0.m138524v("e_privacy", ((C9012b) this.viewModel).m56494a1(), jyb.m147494Y("privacy_type", str));
            if (NullChecker.m82486a(runnable)) {
                runnable.run();
                return;
            }
            return;
        }
        if (zIsConnected && NullChecker.m82486a(this.f36723e)) {
            C8927c.m54659n1(act(), "p_settings,privacy", Privilege.privacy_membership);
        } else {
            o1j0.m165640n(R$string.f19605r4);
        }
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m56311D2(View view) {
        m56310C3(new Runnable() { // from class: l.wxe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f191486a.m56309C2();
            }
        }, "freeze_activetime");
    }

    /* JADX INFO: renamed from: D3 */
    public void m56312D3() {
        if (eaf0.f92780b.get().booleanValue()) {
            return;
        }
        ((C9012b) this.viewModel).m56500e1(true, dbc0.f87592xu);
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m56313E2() {
        if (NullChecker.m82486a(this.f36723e) && !this.f36723e.hideAge.booleanValue()) {
            o1j0.m165651y(act().getString(R$string.f18559Ip));
        }
        ((C9012b) this.viewModel).m56491Z();
    }

    /* JADX INFO: renamed from: E3 */
    public final void m56314E3() {
        UserSearchSettings userSearchSettings = this.f36720b.getSettingGroup().search;
        int iIntValue = this.f36720b.getSearchAgeAllowedMinimum().intValue();
        int iIntValue2 = User.AGE_MIN_GOOGLEPLAY;
        if (iIntValue >= iIntValue2) {
            iIntValue2 = this.f36720b.getSearchAgeAllowedMinimum().intValue();
        }
        userSearchSettings.ageAllowedMinimum = Integer.valueOf(iIntValue2);
        UserSearchSettings userSearchSettings2 = this.f36720b.getSettingGroup().search;
        int iIntValue3 = this.f36720b.getSearchMinAge().intValue();
        int iIntValue4 = User.AGE_MIN_GOOGLEPLAY;
        if (iIntValue3 >= iIntValue4) {
            iIntValue4 = this.f36720b.getSearchMinAge().intValue();
        }
        userSearchSettings2.minAge = Integer.valueOf(iIntValue4);
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m56315F1() {
        return this.f36720b.autoAdjustSuggestRadius().booleanValue();
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ void m56316F2(View view) {
        m56310C3(new Runnable() { // from class: l.xxe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f196632a.m56313E2();
            }
        }, "hide_age");
    }

    /* JADX INFO: renamed from: F3 */
    public void m56317F3() {
        if (NullChecker.m82486a(this.f36719a) && NullChecker.m82486a(this.f36720b) && CoreModule.m30929H().signedIn_() && m56368a3()) {
            SettingGroups settingGroups = new SettingGroups();
            UserSearchSettings userSearchSettings = new UserSearchSettings();
            settingGroups.search = userSearchSettings;
            userSearchSettings.lookingForGender = this.f36720b.getLookingFor();
            settingGroups.search.ageAllowedMinimum = this.f36720b.getSearchAgeAllowedMinimum();
            settingGroups.search.ageAllowedMaximum = this.f36720b.getSearchAgeAllowedMaximum();
            settingGroups.search.minAge = this.f36720b.getSearchMinAge();
            settingGroups.search.maxAge = this.f36720b.getSearchMaxAge();
            settingGroups.search.radius = this.f36720b.getSearchRadius();
            settingGroups.search.radiusAllowedMinimum = this.f36720b.getRadiusAllowedMinimum();
            settingGroups.search.radiusAllowedMaximum = this.f36720b.getRadiusAllowedMaximum();
            settingGroups.search.priorities = this.f36720b.getSearchPriority();
            settingGroups.search.autoAdjustRadius = this.f36720b.autoAdjustSuggestRadius();
            if (uqb0.f180396b0.f170324a.mo29171rq(this.f36719a.settings.getSettingGroup())) {
                settingGroups.gender = this.f36720b.getSettingGroup().gender;
            }
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f36719a.settings.getSettingGroup());
            if (NullChecker.m82486a(settingGroupsSubtract)) {
                CoreModule.f18264c.f20405m0.m32124k8(settingGroupsSubtract).subscribe(psd0.m173597H(new y20() { // from class: l.lwe0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        HomeStatisticsHelper.m37695F(Settings.TYPE);
                    }
                }, new y20() { // from class: l.mwe0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C9011a.m56271k0((Throwable) obj);
                    }
                }));
            }
            if (d79.m114661T()) {
                AdvancedSettings advancedSettingsM56336O1 = m56336O1();
                if (NullChecker.m82486a(advancedSettingsM56336O1)) {
                    CoreModule.f18264c.f20306F0.m118452o3(advancedSettingsM56336O1, false).subscribe(psd0.m173597H(new y20() { // from class: l.nwe0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            HomeStatisticsHelper.m37695F(Settings.TYPE);
                        }
                    }, new y20() { // from class: l.owe0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            C9011a.m56300x0((Throwable) obj);
                        }
                    }));
                }
            }
        }
    }

    /* JADX INFO: renamed from: H1 */
    public void m56318H1() {
        if (this.f36734p) {
            ((C9012b) this.viewModel).m56509j1();
        }
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m56319H2() {
        if (NullChecker.m82486a(this.f36723e) && !this.f36723e.hideLocation.booleanValue()) {
            o1j0.m165651y(act().getString(R$string.f18621Kp));
        }
        ((C9012b) this.viewModel).m56493a0();
    }

    /* JADX INFO: renamed from: H3 */
    public final void m56320H3() {
        if (NullChecker.m82486a(this.f36723e) && joa.m146361M3()) {
            duringCreated(CoreModule.f18264c.f20303E0.m141076R3(this.f36723e)).subscribe(psd0.m173597H(new y20() { // from class: l.iye0
                @Override // p153l.y20
                public final void call(Object obj) {
                    C9011a.m56274l0((uxj0) obj);
                }
            }, new y20() { // from class: l.jye0
                @Override // p153l.y20
                public final void call(Object obj) {
                    bsj0.m106246D((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I1 */
    public String m56321I1() {
        return this.f36729k.get(this.f36720b.getLookingFor().toString());
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ void m56322I2(View view) {
        m56310C3(new Runnable() { // from class: l.vxe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f186257a.m56319H2();
            }
        }, "hide_location");
    }

    /* JADX INFO: renamed from: I3 */
    public int m56323I3() {
        double dM175779K = q8g0.m175779K(this.f36720b.getSearchRadius().intValue());
        if (dM175779K >= 59.0d && this.f36720b.getSearchRadius().intValue() < this.f36720b.getRadiusAllowedMaximum().intValue()) {
            return 59;
        }
        if (this.f36720b.getSearchRadius().intValue() >= this.f36720b.getRadiusAllowedMaximum().intValue()) {
            return 60;
        }
        return (int) dM175779K;
    }

    /* JADX INFO: renamed from: J1 */
    public int m56324J1() {
        return (this.f36720b.getRadiusAllowedMaximum().intValue() - this.f36720b.getRadiusAllowedMinimum().intValue()) / 1000;
    }

    /* JADX INFO: renamed from: J2 */
    public final /* synthetic */ void m56325J2() {
        ((C9012b) this.viewModel).m56495b0();
    }

    /* JADX INFO: renamed from: J3 */
    public int m56326J3() {
        return (this.f36720b.getSearchRadius().intValue() - this.f36720b.getRadiusAllowedMinimum().intValue()) / 1000;
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m56327K2(View view) {
        m56310C3(new Runnable() { // from class: l.txe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f176545a.m56325J2();
            }
        }, "show_to_mylikes_only");
    }

    /* JADX INFO: renamed from: K3 */
    public View.OnClickListener m56328K3() {
        return new View.OnClickListener() { // from class: l.mxe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139227a.m56364Y2(view);
            }
        };
    }

    /* JADX INFO: renamed from: L1 */
    public void m56329L1(boolean z) {
        this.f36723e.frozenActivity = Boolean.valueOf(z);
        m56320H3();
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m56330L2(View view) {
        act().startActivity(VipLocationHistoryAct.m57459X1(act(), "from_setting"));
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m56331M2(PaymentApi.PaymentResultStatus paymentResultStatus) {
        act().progressDismiss();
        if (paymentResultStatus == PaymentApi.PaymentResultStatus.succeed) {
            o1j0.m165649w(R$string.f18401Dm);
        } else {
            o1j0.m165634h(R$string.f19667t4);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public void m56332M3(boolean z) {
        if (this.f36720b == null) {
            return;
        }
        sfj0.m185596c("e_edit_increase_distance", "p_settings_view", sfj0.C20032a.m185612e().m185617d("increase_distance_open").m185623o(z));
        this.f36720b.getSettingGroup().search.autoAdjustRadius = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: N1 */
    public Dialog.InterfaceC4462g m56333N1(final int i) {
        return new Dialog.InterfaceC4462g() { // from class: l.hye0
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i2, CharSequence charSequence) {
                this.f112109a.m56375e2(i, dialog, view, i2, charSequence);
            }
        };
    }

    /* JADX INFO: renamed from: N2 */
    public final /* synthetic */ void m56334N2(Throwable th) {
        act().progressDismiss();
        o1j0.m165634h(R$string.f19667t4);
    }

    /* JADX INFO: renamed from: N3 */
    public void m56335N3(List<String> list, int i) {
        this.f36720b.intent = SettingsIntent.get(list.get(i));
    }

    /* JADX INFO: renamed from: O1 */
    public AdvancedSettings m56336O1() {
        AdvancedSettings advancedSettings = this.f36722d;
        if (advancedSettings == null || this.f36721c == null) {
            return null;
        }
        ((C9012b) this.viewModel).m56513l1(advancedSettings);
        return this.f36722d.subtract(this.f36721c);
    }

    /* JADX INFO: renamed from: O3 */
    public void m56337O3() {
        if (NullChecker.m82486a(this.f36720b) && uqb0.f180396b0.f170324a.mo29171rq(this.f36720b.getSettingGroup())) {
            m56340P3();
        } else {
            ((C9012b) this.viewModel).m56504g1(m56321I1());
        }
    }

    /* JADX INFO: renamed from: P1 */
    public int m56338P1() {
        return this.f36720b.getSearchAgeAllowedMaximum().intValue();
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ void m56339P2(View view) {
        aso asoVarM99953h = aso.m99953h(act(), act() instanceof PutongAct ? ((PutongAct) act()).iap().m103295i() : null);
        act().progress(R$string.f18632L5);
        asoVarM99953h.mo192810a().doOnNext(new y20() { // from class: l.cye0
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.dye0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91198a.m56331M2((PaymentApi.PaymentResultStatus) obj);
            }
        }, new y20() { // from class: l.eye0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96423a.m56334N2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P3 */
    public final void m56340P3() {
        List<LookingFor> list = this.f36720b.getSettingGroup().gender.lookingForGenders;
        if (list.size() > 2) {
            ((C9012b) this.viewModel).m56504g1(act().getResources().getString(R$string.f18882Tf));
            return;
        }
        if (list.size() <= 0) {
            ((C9012b) this.viewModel).m56504g1(this.f36730l.get(this.f36720b.getLookingFor().toString()));
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (LookingFor lookingFor : list) {
            if (!sb.toString().isEmpty()) {
                sb.append(" & ");
            }
            sb.append(this.f36730l.get(lookingFor.toString()));
        }
        ((C9012b) this.viewModel).m56504g1(sb.toString());
    }

    /* JADX INFO: renamed from: Q1 */
    public int m56341Q1() {
        return this.f36720b.getSearchAgeAllowedMinimum().intValue();
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m56342Q2(View view) {
        act().startActivity(new Intent(act(), (Class<?>) AboutTantanAct.class));
    }

    /* JADX INFO: renamed from: Q3 */
    public void m56343Q3() {
        if (qj90.m176830b(PurchaseType.TYPE_ROAMING_PKG) && CoreModule.f18264c.f20396j0.f20029Z.get().booleanValue() && !CoreModule.f18264c.f20396j0.f20030a0.get().booleanValue()) {
            ((C9012b) this.viewModel).m56534v1();
        }
    }

    /* JADX INFO: renamed from: R1 */
    public int m56344R1() {
        return this.f36720b.getSearchMaxAge().intValue();
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m56345R2(View view) {
        act().startActivity(IntlPersonalDetailsAct.INSTANCE.m56186a(act(), "setting"));
    }

    /* JADX INFO: renamed from: R3 */
    public void m56346R3(boolean z) {
        this.f36723e.showMeToMyLike = Boolean.valueOf(z);
        m56320H3();
    }

    /* JADX INFO: renamed from: S1 */
    public int m56347S1() {
        return (!"ko".equals(Locale.getDefault().getLanguage()) || this.f36720b.getSearchMinAge().intValue() > 20) ? this.f36720b.getSearchMinAge().intValue() : this.f36720b.getSearchAgeAllowedMinimum().intValue();
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m56348S2(View view) {
        act().startActivity(CoreModule.m30934Q().mo68403Gr(act(), null));
    }

    /* JADX INFO: renamed from: S3 */
    public void m56349S3(boolean z) {
        act().progress(R$string.f18632L5);
        if (z) {
            User userMe_ = CoreModule.m30930K().me_();
            if (userMe_ == null) {
                o1j0.m165634h(com.p051p1.mobile.putong.common.R$string.f18024B);
                uqb0.m197263b1(null, false, AccountTempApi.InactiveType.None, false).subscribe(psd0.m173595F());
                CrashHelper.m82479c(new Exception("catch datebase query null NullPointerException"));
                return;
            }
            uqb0.f180380L.f17865d.m217964p(userMe_.m61308fp().url, CoreModule.m30929H().getAuthData().mo107143b(), userMe_.name);
        } else {
            uqb0.f180380L.f17865d.m123194i();
        }
        x95.INSTANCE.m209793m("Log out", null);
        i4g0.m138520r("e_sign_out_botton", ((C9012b) this.viewModel).m56494a1());
        uqb0.m197259Z0(true, false).materialize().first().subscribe(psd0.m173597H(new y20() { // from class: l.vwe0
            @Override // p153l.y20
            public final void call(Object obj) {
                C9011a.m56230B1((Notification) obj);
            }
        }, new y20() { // from class: l.wwe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191264a.m56366Z2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T1 */
    public String m56350T1() {
        int iIntValue;
        int iIntValue2 = this.f36720b.getSearchMinAge().intValue();
        int iIntValue3 = this.f36720b.getSearchMaxAge().intValue();
        int i = iIntValue3 - 1;
        if (!"ko".equals(Locale.getDefault().getLanguage())) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f36720b.getSearchMinAge());
            sb.append(" - ");
            sb.append(this.f36720b.getSearchMaxAge());
            sb.append(this.f36720b.getSearchMaxAge().equals(this.f36720b.getSearchAgeAllowedMaximum()) ? Marker.ANY_NON_NULL_MARKER : "");
            return sb.toString();
        }
        int iIntValue4 = 20;
        if (iIntValue2 < 20) {
            iIntValue = 20;
        } else {
            iIntValue = iIntValue2 >= i ? this.f36720b.getSearchMinAge().intValue() : iIntValue2 + 1;
        }
        if (iIntValue3 >= 20) {
            iIntValue4 = iIntValue3 >= i ? this.f36720b.getSearchMaxAge().intValue() : iIntValue3 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iIntValue);
        sb2.append(" - ");
        sb2.append(iIntValue4);
        sb2.append(this.f36720b.getSearchMaxAge().equals(this.f36720b.getSearchAgeAllowedMaximum()) ? Marker.ANY_NON_NULL_MARKER : "");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m56351T2(View view) {
        act().startActivity(new Intent(act(), (Class<?>) NewAccountSecureAct.class));
    }

    /* JADX INFO: renamed from: T3 */
    public void m56352T3(int i, int i2, x20 x20Var) {
        if (i < this.f36720b.getSearchAgeAllowedMinimum().intValue() || i2 < this.f36720b.getSearchAgeAllowedMinimum().intValue() || i > this.f36720b.getSearchAgeAllowedMaximum().intValue() || i2 > this.f36720b.getSearchAgeAllowedMaximum().intValue()) {
            return;
        }
        this.f36720b.getSettingGroup().search.minAge = Integer.valueOf(i);
        this.f36720b.getSettingGroup().search.maxAge = Integer.valueOf(i2);
        x20Var.call();
        act().removeCallbacks(this.f36742x);
        act().postDelayed(this.f36742x, 1000L);
    }

    /* JADX INFO: renamed from: U1 */
    public int m56353U1(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (TEnum.equals(this.f36720b.intent, list.get(i))) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m56354U2(View view) {
        int i;
        view.requestFocus();
        if (NullChecker.m82486a(this.f36720b) && uqb0.f180396b0.f170324a.mo29171rq(this.f36720b.getSettingGroup())) {
            ((C9012b) this.viewModel).m56528s1(this.f36720b.getSettingGroup());
            return;
        }
        if (TEnum.equals(this.f36720b.getLookingFor(), "male")) {
            i = 0;
        } else {
            i = TEnum.equals(this.f36720b.getLookingFor(), "female") ? 1 : 2;
        }
        sfj0.m185596c("e_edit_gender_filter", "p_settings_view", new sfj0.C20032a[0]);
        ((C9012b) this.viewModel).m56526r1(i);
    }

    /* JADX INFO: renamed from: U3 */
    public void m56355U3(y20<String> y20Var) {
        String strConcat;
        Integer num = 0;
        if (IntlCountryCodeController.m29109f()) {
            String str = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + act().getString(R$string.f19403kj);
            double dM175779K = q8g0.m175779K(this.f36720b.getSearchRadius().intValue());
            if (dM175779K >= 59.0d && this.f36720b.getSearchRadius().intValue() < this.f36720b.getRadiusAllowedMaximum().intValue()) {
                strConcat = "59".concat(str);
            } else if (this.f36720b.getSearchRadius().intValue() >= this.f36720b.getRadiusAllowedMaximum().intValue()) {
                strConcat = "60" + str + Marker.ANY_NON_NULL_MARKER;
            } else if (this.f36720b.getSearchRadius().intValue() <= this.f36720b.getRadiusAllowedMinimum().intValue()) {
                strConcat = "<1 " + act().getString(R$string.f19434lj);
            } else {
                strConcat = c17.f79338h.format(dM175779K) + str;
            }
        } else {
            int iIntValue = this.f36720b.getSearchRadius().intValue() / 1000;
            String string = act().getString(R$string.f19649sh);
            Integer radiusAllowedMaximum = this.f36720b.getRadiusAllowedMaximum();
            Integer radiusAllowedMinimum = this.f36720b.getRadiusAllowedMinimum();
            if (radiusAllowedMaximum == null) {
                radiusAllowedMaximum = num;
            }
            num = radiusAllowedMinimum != null ? radiusAllowedMinimum : 0;
            if (iIntValue >= radiusAllowedMaximum.intValue() / 1000) {
                strConcat = (radiusAllowedMaximum.intValue() / 1000) + string + Marker.ANY_NON_NULL_MARKER;
            } else if (iIntValue <= num.intValue() / 1000) {
                strConcat = "<" + (num.intValue() / 1000) + string;
            } else {
                strConcat = Integer.toString(iIntValue) + string;
            }
        }
        y20Var.call(strConcat);
    }

    /* JADX INFO: renamed from: V1 */
    public String m56356V1() {
        SettingsIntent settingsIntent = this.f36720b.intent;
        if (settingsIntent == null) {
            return null;
        }
        String string = settingsIntent.toString();
        string.getClass();
        int i = 0;
        switch (string) {
            case "friend":
                i = R$string.f19347io;
                break;
            case "relationship":
                i = R$string.f19377jo;
                break;
            case "date":
                i = R$string.f19286go;
                break;
            case "fate":
                i = R$string.f19317ho;
                break;
        }
        return act().string(i);
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m56357V2(View view) {
        act().startActivity(new Intent(act(), (Class<?>) DataAndStorageAct.class));
    }

    /* JADX INFO: renamed from: V3 */
    public void m56358V3(int i) {
        if (!IntlCountryCodeController.m29109f()) {
            this.f36720b.getSettingGroup().search.radius = Integer.valueOf(this.f36720b.getRadiusAllowedMinimum().intValue() + Math.min(this.f36720b.getRadiusAllowedMaximum().intValue() - this.f36720b.getRadiusAllowedMinimum().intValue(), Math.max(0, i * 1000)));
            return;
        }
        Settings settings = this.f36720b;
        if (i == 60) {
            settings.getSettingGroup().search.radius = this.f36720b.getRadiusAllowedMaximum();
        } else {
            settings.getSettingGroup().search.radius = Integer.valueOf(this.f36720b.getRadiusAllowedMinimum().intValue() + Math.min(this.f36720b.getRadiusAllowedMaximum().intValue() - this.f36720b.getRadiusAllowedMinimum().intValue(), (int) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, q8g0.m175780L(i))));
        }
    }

    /* JADX INFO: renamed from: W1 */
    public SpannableString m56359W1() {
        SpannableString spannableString = new SpannableString(act().getString(R$string.f18529Hq, "7.3.3"));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        return spannableString;
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m56360W2(View view) {
        d1k0.m113613x(act());
    }

    /* JADX INFO: renamed from: X1 */
    public void m56361X1(SettingGroups settingGroups) {
        this.f36720b.getSettingGroup().gender.lookingForGenders = settingGroups.gender.lookingForGenders;
        this.f36720b.getSettingGroup().gender.notShowCis = settingGroups.gender.notShowCis;
        m56340P3();
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m56362X2() {
        i4g0.m138520r("e_school_identify_makeSure_guide_click", "p_school_identify_makeSure_guide");
        act().startActivity(StudentInfoAct.m45668X1(act(), "Chanel8.SchoolIdentifyPage.Shown", false));
    }

    /* JADX INFO: renamed from: Y1 */
    public void m56363Y1(boolean z) {
        this.f36723e.hideAge = Boolean.valueOf(z);
        m56320H3();
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m56364Y2(View view) {
        ((C9012b) this.viewModel).m56474B1();
        new dtf0(act()).m117853a();
        eaf0.f92780b.put(Boolean.TRUE);
        ((C9012b) this.viewModel).m56523q1(Boolean.FALSE);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f36734p = ((C9012b) this.viewModel).m56503g0();
        this.f36737s = ((C9012b) this.viewModel).m56505h0();
        this.f36738t = ((C9012b) this.viewModel).m56496c0();
        this.f36739u = ((C9012b) this.viewModel).m56497d0();
        this.f36740v = ((C9012b) this.viewModel).m56501f0();
        this.f36741w = ((C9012b) this.viewModel).m56499e0();
        this.f36735q = UserPrivacySettings.new_();
    }

    /* JADX INFO: renamed from: Z1 */
    public void m56365Z1(boolean z) {
        this.f36723e.hideLocation = Boolean.valueOf(z);
        m56320H3();
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m56366Z2(Throwable th) {
        act().progressDismiss();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.yve0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201704a.m56270j2((Bundle) obj);
            }
        }, new x20() { // from class: l.awe0
            @Override // p153l.x20
            public final void call() {
                this.f73726a.m56273k2();
            }
        });
        duringCreated(new pcj() { // from class: l.cwe0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return d1k0.f84698f;
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.dwe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91015a.m56294t2((Boolean) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.ewe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96152a.m56297u2((C4470c) obj);
            }
        }));
        duringCreated((C22421c) CoreModule.f18264c.f20405m0.m32121j9().switchMap(new qcj() { // from class: l.fwe0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20381e0.m116596o9();
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.gwe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106835a.m56299v2((User) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).filter(new qcj() { // from class: l.hwe0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(TEnum.equals(user.source, "wechat") || TEnum.equals(user.source, "qq"));
            }
        }).map(new qcj() { // from class: l.iwe0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C9011a.m56290s0((User) obj);
            }
        }).distinctUntilChanged().filter(new qcj() { // from class: l.kwe0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.jwe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122915a.m56387l2((String) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9().map(new qcj() { // from class: l.uwe0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).age;
            }
        }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.fxe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101258a.m56389m2((Integer) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.f89214e0.obs()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.qxe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160036a.m56391n2((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).map(new qcj() { // from class: l.bye0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f79012a.m56282o2((User) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.kye0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129306a.m56394p2((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20369a0.f170922U.obs()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.lye0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134053a.m56287q2((Boolean) obj);
            }
        }));
        CoreModule.f18264c.f20381e0.m116557ea();
        xc20.m210108t(act());
        if (d79.m114661T()) {
            duringCreated((C22421c) CoreModule.f18264c.f20306F0.m118456s3().switchMap(new qcj() { // from class: l.mye0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20306F0.m118445h3();
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.nye0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f144304a.m56397r2((AdvancedSettings) obj);
                }
            }));
            CoreModule.f18264c.f20306F0.m118454q3();
        }
        duringCreated(CoreModule.m30934Q().mo68440ao(CoreModule.m30929H().userId())).subscribe(psd0.m173597H(new y20() { // from class: l.zve0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206212a.m56399s2((Boolean) obj);
            }
        }, new y20() { // from class: l.bwe0
            @Override // p153l.y20
            public final void call(Object obj) {
                C9011a.m56258e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a2 */
    public void m56367a2(boolean z) {
        this.f36723e.hideIcon = Boolean.valueOf(z);
        m56320H3();
    }

    /* JADX INFO: renamed from: a3 */
    public final boolean m56368a3() {
        if (!NullChecker.m82486a(Act.foreground_())) {
            return true;
        }
        Activity activity = Act.foreground_().f16062a.get();
        return ((activity instanceof SwitchAccountAct) || (activity instanceof SwitchAccountV2Act) || CoreModule.m30929H().getSignOutJumpAct().isInstance(activity)) ? false : true;
    }

    /* JADX INFO: renamed from: b2 */
    public void m56369b2() {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        if ((TEnum.equals(userM116593na.source, "wechat") || TEnum.equals(userM116593na.source, "qq")) && TextUtils.isEmpty(userM116593na.settings.phoneNumber.number)) {
            TextUtils.isEmpty(userM116593na.settings.linkedPhoneNumber.number);
        }
        ((C9012b) this.viewModel).m56521p1(act().getString(R$string.f18360Cc));
        ((C9012b) this.viewModel).m56519o1(TextUtils.isEmpty(userM116593na.settings.phoneNumber.number) && !CoreModule.f18264c.f20369a0.f170922U.get().booleanValue());
        if (r43.m179739b()) {
            ((C9012b) this.viewModel).m56511k1(act().getString(R$string.f18980Wn));
        } else if (TEnum.equals(userM116593na.source, "facebook")) {
            ((C9012b) this.viewModel).m56511k1(act().getString(R$string.f18920Un));
        }
    }

    /* JADX INFO: renamed from: b3 */
    public boolean m56370b3() {
        if (!NullChecker.m82486a(this.f36725g) || !this.f36725g.m224138d()) {
            return false;
        }
        this.f36725g.m224137c();
        return true;
    }

    /* JADX INFO: renamed from: c2 */
    public void m56371c2() {
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).map(new qcj() { // from class: l.axe0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).getLatitudeAndLongitude();
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.bxe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78865a.m56379g2((DoublePair) obj);
            }
        }));
        duringCreated((C22421c) CoreModule.f18264c.f20381e0.m116596o9().filter(new qcj() { // from class: l.cxe0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(DoublePair.new_().equals(((User) obj).getLatitudeAndLongitude()));
            }
        }).switchMap(new qcj() { // from class: l.dxe0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uqb0.f180370E.m80047p().filter(new qcj() { // from class: l.aye0
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(CoreModule.m30929H().signedIn_());
                    }
                });
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.exe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96285a.m56383i2((Location) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c3 */
    public void m56372c3(final boolean z) {
        duringCreated(CoreModule.f18264c.f20381e0.m116471Ha(!z)).subscribe(psd0.m173597H(new y20() { // from class: l.uxe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181446a.m56404w2(z, (uxj0) obj);
            }
        }, new fjf0()));
    }

    /* JADX INFO: renamed from: d2 */
    public void m56373d2(z20<Boolean, Boolean> z20Var) {
        Boolean bool = Boolean.FALSE;
        z20Var.call(bool, bool);
    }

    /* JADX INFO: renamed from: d3 */
    public void m56374d3() {
        act().startActivity(new Intent(act(), (Class<?>) ChatAndNotifiAct.class));
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m56375e2(int i, Dialog dialog, View view, int i2, CharSequence charSequence) {
        if (i != i2) {
            if (i2 == 0) {
                this.f36720b.getSettingGroup().search.lookingForGender = LookingFor.get("male");
                ((C9012b) this.viewModel).m56504g1(this.f36729k.get("male"));
                return;
            }
            Settings settings = this.f36720b;
            if (i2 == 1) {
                settings.getSettingGroup().search.lookingForGender = LookingFor.get("female");
                ((C9012b) this.viewModel).m56504g1(this.f36729k.get("female"));
            } else {
                settings.getSettingGroup().search.lookingForGender = LookingFor.get("both");
                ((C9012b) this.viewModel).m56504g1(this.f36729k.get("both"));
            }
        }
    }

    /* JADX INFO: renamed from: e3 */
    public void m56376e3() {
        act().startActivity(new Intent(act(), (Class<?>) ChatInputSettingAct.class));
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m56377f2(z80 z80Var) {
        f36718y.put(z80Var.mo143670b());
        ((C9012b) this.viewModel).m56515m1(TextUtils.isEmpty(z80Var.mo143670b()) ? act().string(R$string.f19439lo) : z80Var.mo143670b());
    }

    /* JADX INFO: renamed from: f3 */
    public void m56378f3(boolean z) {
        if (!CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
            ((C9012b) this.viewModel).m56539y1();
            return;
        }
        this.f36735q.hideActivityTime = Boolean.valueOf(z);
        act().progress(R$string.f18632L5);
        duringCreated(CoreModule.f18264c.f20381e0.m116636y9(this.f36735q)).subscribe(psd0.m173597H(new y20() { // from class: l.swe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170939a.m56406x2((SettingGroups) obj);
            }
        }, new y20() { // from class: l.twe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176393a.m56408y2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m56379g2(DoublePair doublePair) {
        if (TextUtils.isEmpty(f36718y.get()) && NullChecker.m82486a(this.f36719a) && NullChecker.m82486a(this.f36719a.location) && !TextUtils.isEmpty(this.f36719a.location.region.city)) {
            f36718y.put(this.f36719a.location.region.city);
        }
        boolean zEquals = DoublePair.new_().equals(doublePair);
        V v2 = this.viewModel;
        if (zEquals) {
            ((C9012b) v2).m56517n1(act().string(R$string.f19470mo));
            ((C9012b) this.viewModel).m56515m1(TextUtils.isEmpty(f36718y.get()) ? act().string(R$string.f19439lo) : f36718y.get());
        } else {
            ((C9012b) v2).m56517n1(act().string(R$string.f19501no));
            ((C9012b) this.viewModel).m56515m1(TextUtils.isEmpty(f36718y.get()) ? act().string(R$string.f19439lo) : f36718y.get());
            this.f36724f.m126239e(this, doublePair.first, doublePair.second, new y20() { // from class: l.rxe0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f165333a.m56377f2((z80) obj);
                }
            }, new y20() { // from class: l.sxe0
                @Override // p153l.y20
                public final void call(Object obj) {
                    App.f16087d.m21432k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g3 */
    public View.OnClickListener m56380g3() {
        return new View.OnClickListener() { // from class: l.kxe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129187a.m56305A2(view);
            }
        };
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m56381h2(DoublePair doublePair, z80 z80Var) {
        f36718y.put(z80Var.mo143670b());
        ((C9012b) this.viewModel).m56515m1(TextUtils.isEmpty(z80Var.mo143670b()) ? act().string(R$string.f19439lo) : z80Var.mo143670b());
        if (TextUtils.isEmpty(z80Var.mo143670b())) {
            i4g0.m138493B("e_setting_location_to_address", "", jyb.m147494Y("is_success", Boolean.TRUE), jyb.m147494Y("has_city", Boolean.FALSE), jyb.m147494Y("location_latitude", Double.valueOf(doublePair.first)), jyb.m147494Y("location_longitude", Double.valueOf(doublePair.second)));
        } else {
            Boolean bool = Boolean.TRUE;
            i4g0.m138493B("e_setting_location_to_address", "", jyb.m147494Y("is_success", bool), jyb.m147494Y("has_city", bool), jyb.m147494Y("location_latitude", Double.valueOf(doublePair.first)), jyb.m147494Y("location_longitude", Double.valueOf(doublePair.second)));
        }
    }

    /* JADX INFO: renamed from: h3 */
    public View.OnClickListener m56382h3() {
        return new View.OnClickListener() { // from class: l.nxe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144116a.m56311D2(view);
            }
        };
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m56383i2(Location location) {
        this.f36736r = true;
        i4g0.m138493B("e_setting_get_user_location_success", "", new pf60[0]);
        final DoublePair doublePairNew_ = DoublePair.new_();
        doublePairNew_.first = location.m80014u();
        doublePairNew_.second = location.m80016x();
        if (DoublePair.new_().equals(CoreModule.f18264c.f20381e0.m116600p9().getLatitudeAndLongitude())) {
            this.f36724f.m126239e(this, doublePairNew_.first, doublePairNew_.second, new y20() { // from class: l.yxe0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f201963a.m56381h2(doublePairNew_, (z80) obj);
                }
            }, new y20() { // from class: l.zxe0
                @Override // p153l.y20
                public final void call(Object obj) {
                    C9011a.m56295u0(doublePairNew_, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i3 */
    public View.OnClickListener m56384i3() {
        return new View.OnClickListener() { // from class: l.ixe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117395a.m56316F2(view);
            }
        };
    }

    /* JADX INFO: renamed from: j3 */
    public View.OnClickListener m56385j3() {
        return new View.OnClickListener() { // from class: l.qwe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159885a.m56322I2(view);
            }
        };
    }

    /* JADX INFO: renamed from: k3 */
    public View.OnClickListener m56386k3() {
        return new View.OnClickListener() { // from class: l.ywe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201824a.m56327K2(view);
            }
        };
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m56387l2(String str) {
        ((C9012b) this.viewModel).m56519o1(false);
        ((C9012b) this.viewModel).m56521p1(act().getString(R$string.f18360Cc));
    }

    /* JADX INFO: renamed from: l3 */
    public View.OnClickListener m56388l3() {
        return new View.OnClickListener() { // from class: l.rwe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165131a.m56330L2(view);
            }
        };
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m56389m2(Integer num) {
        if (!this.f36733o) {
            ((C9012b) this.viewModel).m56516n0();
        }
        this.f36733o = false;
    }

    /* JADX INFO: renamed from: m3 */
    public void m56390m3() {
        act().startActivity(PrivacySettingAct.m56856Z1(act(), "setting"));
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m56391n2(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        ((C9012b) this.viewModel).m56519o1(false);
    }

    /* JADX INFO: renamed from: n3 */
    public void m56392n3() {
        act().startActivity(new Intent(act(), (Class<?>) PushMsgSettingAct.class));
    }

    /* JADX INFO: renamed from: o3 */
    public void m56393o3() {
        act().startActivity(PrivacyAndPremissonAct.m56859Z1(act(), "other_setting"));
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m56394p2(Boolean bool) {
        ((C9012b) this.viewModel).m56502f1(bool.booleanValue());
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: p3 */
    public void m56395p3() {
        act().startActivity(new Intent(act(), (Class<?>) PrivacyAndPremissonAct.class));
    }

    /* JADX INFO: renamed from: q3 */
    public View.OnClickListener m56396q3() {
        return new View.OnClickListener() { // from class: l.lxe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133922a.m56339P2(view);
            }
        };
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m56397r2(AdvancedSettings advancedSettings) {
        if (NullChecker.m82486a(advancedSettings)) {
            this.f36721c = advancedSettings;
            AdvancedSettings advancedSettingsMo225055clone = advancedSettings.mo225055clone();
            this.f36722d = advancedSettingsMo225055clone;
            ((C9012b) this.viewModel).m56514m0(advancedSettingsMo225055clone);
        }
    }

    /* JADX INFO: renamed from: r3 */
    public View.OnClickListener m56398r3() {
        return new View.OnClickListener() { // from class: l.oxe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f149646a.m56342Q2(view);
            }
        };
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m56399s2(Boolean bool) {
        ((C9012b) this.viewModel).m56479F1(bool.booleanValue());
    }

    /* JADX INFO: renamed from: s3 */
    public View.OnClickListener m56400s3() {
        return new View.OnClickListener() { // from class: l.jxe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123022a.m56345R2(view);
            }
        };
    }

    /* JADX INFO: renamed from: t3 */
    public void m56401t3() {
        act().startActivity(WebViewAct.m81347a2(act(), "设置屏蔽词", lve0.m155993a("set_page")));
    }

    /* JADX INFO: renamed from: u3 */
    public View.OnClickListener m56402u3() {
        return new View.OnClickListener() { // from class: l.gxe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106938a.m56348S2(view);
            }
        };
    }

    /* JADX INFO: renamed from: v3 */
    public View.OnClickListener m56403v3() {
        return new View.OnClickListener() { // from class: l.xwe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196491a.m56351T2(view);
            }
        };
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m56404w2(boolean z, uxj0 uxj0Var) {
        CoreModule.f18264c.f20381e0.m116600p9().setBlackDiamondTag(!z);
        ((C9012b) this.viewModel).m56472A1();
    }

    /* JADX INFO: renamed from: w3 */
    public View.OnClickListener m56405w3() {
        return new View.OnClickListener() { // from class: l.hxe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111996a.m56354U2(view);
            }
        };
    }

    /* JADX INFO: renamed from: x2 */
    public final /* synthetic */ void m56406x2(SettingGroups settingGroups) {
        act().progressDismiss();
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
        sfj0.m185607n("e_hide_active_time_status", "p_settings_view", sfj0.C20032a.m185615h("hide_time_status", settingGroups.privacy.hideActivityTime.booleanValue() ? "open" : "close"));
        ((C9012b) this.viewModel).m56502f1(settingGroups.privacy.hideActivityTime.booleanValue());
    }

    /* JADX INFO: renamed from: x3 */
    public void m56407x3() {
        Settings settings = this.f36720b;
        if (settings == null) {
            return;
        }
        sfj0.m185600g("e_edit_distance_filter", "p_settings_view", sfj0.C20032a.m185613f("max_distance", settings.getSearchRadius().intValue() / 1000));
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m56408y2(Throwable th) {
        act().progressDismiss();
        ((C9012b) this.viewModel).m56492Z0(th);
    }

    /* JADX INFO: renamed from: y3 */
    public View.OnClickListener m56409y3() {
        return new View.OnClickListener() { // from class: l.pwe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154398a.m56357V2(view);
            }
        };
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m56410z2() {
        if (NullChecker.m82486a(this.f36723e) && !this.f36723e.hideIcon.booleanValue()) {
            o1j0.m165651y(act().getString(R$string.f18590Jp));
        }
        ((C9012b) this.viewModel).m56487X();
    }

    /* JADX INFO: renamed from: z3 */
    public View.OnClickListener m56411z3() {
        return new View.OnClickListener() { // from class: l.zwe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f206343a.m56360W2(view);
            }
        };
    }
}
