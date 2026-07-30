package com.p046p1.mobile.putong.core.p053ui.settings;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.PaymentApi;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.AdvancedSettings;
import com.p046p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RankLevel;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.p053ui.account.NewAccountSecureAct;
import com.p046p1.mobile.putong.core.p053ui.account.SwitchAccountAct;
import com.p046p1.mobile.putong.core.p053ui.account.SwitchAccountV2Act;
import com.p046p1.mobile.putong.core.p053ui.campus.StudentInfoAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.settings.C8848a;
import com.p046p1.mobile.putong.core.p053ui.settings.datastorage.DataAndStorageAct;
import com.p046p1.mobile.putong.core.p053ui.settings.privacy.PrivacySettingAct;
import com.p046p1.mobile.putong.core.p053ui.settings.privacyandpremisson.PrivacyAndPremissonAct;
import com.p046p1.mobile.putong.core.p053ui.vip.VipLocationHistoryAct;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.LookingFor;
import com.p046p1.mobile.putong.data.SearchPriority;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.SettingsIntent;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserPrivacySettings;
import com.p046p1.mobile.putong.data.UserSearchSettings;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.location.Location;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Marker;
import p133rx.C22306c;
import p133rx.Notification;
import p147v.CoverGuideView;
import p147v.VFrame;
import p149l.aqo;
import p149l.b43;
import p149l.bzv;
import p149l.d30;
import p149l.d90;
import p149l.e01;
import p149l.e30;
import p149l.ene0;
import p149l.f30;
import p149l.hpd0;
import p149l.i0g0;
import p149l.j760;
import p149l.jq2;
import p149l.lsi0;
import p149l.mb90;
import p149l.mcr;
import p149l.mjj;
import p149l.mkd0;
import p149l.o6j0;
import p149l.p420;
import p149l.qib0;
import p149l.qqh0;
import p149l.roj0;
import p149l.u59;
import p149l.ukf0;
import p149l.upa;
import p149l.uqd0;
import p149l.v9j;
import p149l.vwb;
import p149l.w85;
import p149l.w9j;
import p149l.wvv;
import p149l.x1f0;
import p149l.x2c0;
import p149l.xma;
import p149l.yaf0;
import p149l.yij0;
import p149l.zrj0;
import p149l.zvf0;
import p149l.zz6;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.a */
/* JADX INFO: loaded from: classes9.dex */
public class C8848a extends jq2<C8849b> {

    /* JADX INFO: renamed from: y */
    public static uqd0 f35870y = new uqd0(RankLevel.city, "");

    /* JADX INFO: renamed from: a */
    public User f35871a;

    /* JADX INFO: renamed from: b */
    public Settings f35872b;

    /* JADX INFO: renamed from: c */
    public AdvancedSettings f35873c;

    /* JADX INFO: renamed from: d */
    public AdvancedSettings f35874d;

    /* JADX INFO: renamed from: e */
    public PrivacyMembershipSetting f35875e;

    /* JADX INFO: renamed from: f */
    public mjj f35876f;

    /* JADX INFO: renamed from: g */
    public CoverGuideView f35877g;

    /* JADX INFO: renamed from: h */
    public hpd0 f35878h;

    /* JADX INFO: renamed from: i */
    public hpd0 f35879i;

    /* JADX INFO: renamed from: j */
    public final hpd0 f35880j;

    /* JADX INFO: renamed from: k */
    public Map<String, String> f35881k;

    /* JADX INFO: renamed from: l */
    public Map<String, String> f35882l;

    /* JADX INFO: renamed from: m */
    public String[] f35883m;

    /* JADX INFO: renamed from: n */
    public boolean f35884n;

    /* JADX INFO: renamed from: o */
    public boolean f35885o;

    /* JADX INFO: renamed from: p */
    public boolean f35886p;

    /* JADX INFO: renamed from: q */
    public UserPrivacySettings f35887q;

    /* JADX INFO: renamed from: r */
    public boolean f35888r;

    /* JADX INFO: renamed from: s */
    public int f35889s;

    /* JADX INFO: renamed from: t */
    public boolean f35890t;

    /* JADX INFO: renamed from: u */
    public String f35891u;

    /* JADX INFO: renamed from: v */
    public int f35892v;

    /* JADX INFO: renamed from: w */
    public int f35893w;

    /* JADX INFO: renamed from: x */
    public Runnable f35894x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.a$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C8848a.this.f35872b == null) {
                return;
            }
            o6j0.m162863g("e_edit_age_filter", "p_settings_view", o6j0.C18854a.m162876f("filter_min_age", C8848a.this.f35872b.getSearchMinAge().intValue()), o6j0.C18854a.m162876f("filter_max_age", C8848a.this.f35872b.getSearchMaxAge().intValue()));
        }
    }

    public C8848a(mcr mcrVar) {
        super(mcrVar);
        Boolean bool = Boolean.FALSE;
        this.f35878h = new hpd0("prioritized_recommend_guideview_shown", bool);
        this.f35879i = new hpd0("tantan_verification_tip_show", bool);
        this.f35880j = new hpd0("hasJumpToNotificationPage" + CoreModule.m29931H().userId(), bool);
        this.f35884n = false;
        this.f35885o = true;
        this.f35886p = false;
        this.f35894x = new a();
    }

    /* JADX INFO: renamed from: B1 */
    public static /* synthetic */ void m55047B1(Notification notification) {
        if (NullChecker.m81303a(AccessToken.m7408d())) {
            bzv.m104655m().m104682u();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m55075e0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public /* synthetic */ void m55087j2(Bundle bundle) {
        e01 e01Var = new e01();
        this.f35881k = e01Var;
        e01Var.put("male", act().getResources().getString(R$string.f18525fo));
        this.f35881k.put("female", act().getResources().getString(R$string.f18494eo));
        this.f35881k.put("both", act().getResources().getString(R$string.f18433co));
        e01 e01Var2 = new e01();
        this.f35882l = e01Var2;
        e01Var2.put("male", act().getResources().getString(R$string.f19034wf));
        this.f35882l.put("female", act().getResources().getString(R$string.f17582Af));
        this.f35882l.put("nonbinary", act().getResources().getString(R$string.f19064xf));
        this.f35882l.put("both", act().getResources().getString(R$string.f19034wf) + " & " + act().getResources().getString(R$string.f17582Af));
        this.f35883m = new String[]{act().getResources().getString(R$string.f18525fo), act().getResources().getString(R$string.f18494eo), act().getResources().getString(R$string.f18433co)};
        this.f35876f = mjj.m154842c(this, false);
        ((C8849b) this.viewModel).m55341r();
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m55088k0(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.isCannotModify() && !TextUtils.isEmpty(tantanForbidden.message)) {
                return;
            }
        }
        yij0.m214926D(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m55090k2() {
        if (this.f35888r) {
            return;
        }
        zvf0.m220369B("e_setting_finish_no_location", "", new j760[0]);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m55091l0(roj0 roj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public /* synthetic */ Boolean m55099o2(User user) {
        this.f35887q.hideVIP = Boolean.valueOf(user.membership.hideVIP);
        this.f35887q.hideActivityTime = Boolean.valueOf(user.membership.hideActivityTime);
        return Boolean.valueOf(user.isVIP() && user.membership.hideActivityTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public /* synthetic */ void m55104q2(Boolean bool) {
        if (bool.booleanValue()) {
            ((C8849b) this.viewModel).m55336o1(false);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ String m55107s0(User user) {
        return user.settings.phoneNumber.number + user.settings.linkedPhoneNumber.number;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public /* synthetic */ void m55111t2(Boolean bool) {
        ((C8849b) this.viewModel).m55323h1(bool.booleanValue());
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m55112u0(DoublePair doublePair, Throwable th) {
        Boolean bool = Boolean.FALSE;
        zvf0.m220369B("e_setting_location_to_address", "", vwb.m200311Y("is_success", bool), vwb.m200311Y("has_city", bool), vwb.m200311Y("location_latitude", Double.valueOf(doublePair.first)), vwb.m200311Y("location_longitude", Double.valueOf(doublePair.second)));
        App.f15368d.m20433k(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m55114u2(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            this.f35884n = true;
            if (this.f35871a == null) {
                ((C8849b) this.viewModel).m55349u1(true);
            }
            ((C8849b) this.viewModel).m55353w1(wvv.m205781u() || wvv.m205780t());
            m55160Q3();
            if (upa.m194624D2()) {
                ((C8849b) this.viewModel).m55315d1();
                return;
            }
            return;
        }
        if (c4319c == C4319c.f15549j) {
            zvf0.m220369B("e_setting_page_location_info", "", vwb.m200311Y("is_location_success", Boolean.valueOf(qib0.f154687E.m78865q() != null)));
            m55134F3();
        } else if (c4319c == C4319c.f15551l && NullChecker.m81303a(this.f35877g) && this.f35877g.m222892d()) {
            this.f35877g.m222891c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m55116v2(User user) {
        this.f35871a = user;
        if (((C8849b) this.viewModel).f35984c.getVisibility() == 4) {
            ((C8849b) this.viewModel).m55349u1(false);
        }
        Settings settings = this.f35872b;
        if (settings == null) {
            this.f35872b = user.settings.mo223809clone();
            if (qqh0.INSTANCE.m175930i() && !TextUtils.isEmpty(this.f35891u)) {
                this.f35872b.getSettingGroup().search.radius = Integer.valueOf(this.f35889s);
                this.f35872b.getSettingGroup().search.autoAdjustRadius = Boolean.valueOf(this.f35890t);
                this.f35872b.getSettingGroup().search.lookingForGender = LookingFor.get(this.f35891u);
                this.f35872b.getSettingGroup().search.maxAge = Integer.valueOf(this.f35893w);
                this.f35872b.getSettingGroup().search.minAge = Integer.valueOf(this.f35892v);
            }
            m55131E3();
            ((C8849b) this.viewModel).m55327k0();
            return;
        }
        Settings settings2 = user.settings;
        settings.birthdate = settings2.birthdate;
        settings.phoneNumber = settings2.phoneNumber;
        settings.getSettingGroup().privacy.hideContacts = user.settings.hideContacts();
        this.f35872b.getSettingGroup().privacy.hideMutualContacts = user.settings.hideMutualContacts();
        this.f35872b.getSettingGroup().push.previewMessage = user.settings.previewPushMessage();
        this.f35872b.getSettingGroup().push.showMomentLikes = user.settings.showMomentLikes();
        Settings settings3 = this.f35872b;
        settings3.verification = user.settings.verification;
        settings3.getSettingGroup().search.priorities = new ArrayList();
        this.f35872b.getSettingGroup().search.priorities.addAll(user.settings.getSearchPriority());
        m55131E3();
        this.f35872b.getSettingGroup().search.radius = user.settings.getSearchRadius();
        this.f35872b.getSettingGroup().search.invisibleRadius = user.settings.getSettingGroup().search.invisibleRadius;
        ((C8849b) this.viewModel).m55327k0();
        if (qib0.f154713b0.f139230a.mo28172rq(user.settings.getSettingGroup())) {
            this.f35872b.getSettingGroup().gender = user.settings.getSettingGroup().gender.mo223809clone();
            this.f35872b.getSettingGroup().search.lookingForGender = user.settings.getLookingFor();
            m55178X1(this.f35872b.getSettingGroup());
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m55117x0(Throwable th) {
        CoreModule.f17545c.f19663m0.m31165z5(false);
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m55122A2(View view) {
        m55127C3(new Runnable() { // from class: l.ype0
            @Override // java.lang.Runnable
            public final void run() {
                this.f199440a.m55227z2();
            }
        }, "hide_svip");
    }

    /* JADX INFO: renamed from: A3 */
    public Runnable m55123A3() {
        return new Runnable() { // from class: l.ipe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f114292a.m55179X2();
            }
        };
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m55124B2() {
        ((C8849b) this.viewModel).m55306Y();
    }

    /* JADX INFO: renamed from: B3 */
    public void m55125B3(VFrame vFrame) {
        StudentVerificationStatus studentVerificationStatus = this.f35872b.verification.studies.status;
        if (!TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus, "pending")) {
                lsi0.m151595y(act().getString(R$string.f18131So));
                return;
            } else {
                ((C8849b) this.viewModel).m55358z1();
                return;
            }
        }
        if (yij0.m214942T(vFrame)) {
            zvf0.m220396r("e_student_verification_firstly_on", "p_settings_view");
            if (this.f35872b.getSearchPriority().contains(SearchPriority.get("student"))) {
                return;
            }
            this.f35872b.getSearchPriority().add(SearchPriority.get("student"));
            return;
        }
        zvf0.m220396r("e_student_verification_firstly_off", "p_settings_view");
        if (this.f35872b.getSearchPriority().contains(SearchPriority.get("student"))) {
            this.f35872b.getSearchPriority().remove(SearchPriority.get("student"));
        }
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m55126C2() {
        if (!NullChecker.m81303a(this.f35875e) || this.f35875e.frozenActivity.booleanValue()) {
            ((C8849b) this.viewModel).m55306Y();
        } else {
            act().dialog().m20500D(R$string.f18710lp).m20541k0(R$string.f18648jp).m20556t0(R$string.f18679kp, new Runnable() { // from class: l.zpe0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f204245a.m55124B2();
                }
            }).m20568z0();
        }
    }

    /* JADX INFO: renamed from: C3 */
    public final void m55127C3(Runnable runnable, String str) {
        boolean zIsConnected = Network.isConnected(CoreModule.f17544b);
        zvf0.m220399u("e_privacy", ((C8849b) this.viewModel).m55311a1(), vwb.m200311Y("privacy_type", str));
        if (zIsConnected && NullChecker.m81303a(this.f35875e) && xma.m210047L3()) {
            zvf0.m220400v("e_privacy", ((C8849b) this.viewModel).m55311a1(), vwb.m200311Y("privacy_type", str));
            if (NullChecker.m81303a(runnable)) {
                runnable.run();
                return;
            }
            return;
        }
        if (zIsConnected && NullChecker.m81303a(this.f35875e)) {
            C8764c.m53476n1(act(), "p_settings,privacy", Privilege.privacy_membership);
        } else {
            lsi0.m151584n(R$string.f18813p4);
        }
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m55128D2(View view) {
        m55127C3(new Runnable() { // from class: l.ppe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f150641a.m55126C2();
            }
        }, "freeze_activetime");
    }

    /* JADX INFO: renamed from: D3 */
    public void m55129D3() {
        if (x1f0.f189070b.get().booleanValue()) {
            return;
        }
        ((C8849b) this.viewModel).m55317e1(true, x2c0.f189468Jt);
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m55130E2() {
        if (NullChecker.m81303a(this.f35875e) && !this.f35875e.hideAge.booleanValue()) {
            lsi0.m151595y(act().getString(R$string.f18741mp));
        }
        ((C8849b) this.viewModel).m55308Z();
    }

    /* JADX INFO: renamed from: E3 */
    public final void m55131E3() {
        UserSearchSettings userSearchSettings = this.f35872b.getSettingGroup().search;
        int iIntValue = this.f35872b.getSearchAgeAllowedMinimum().intValue();
        int iIntValue2 = User.AGE_MIN_GOOGLEPLAY;
        if (iIntValue >= iIntValue2) {
            iIntValue2 = this.f35872b.getSearchAgeAllowedMinimum().intValue();
        }
        userSearchSettings.ageAllowedMinimum = Integer.valueOf(iIntValue2);
        UserSearchSettings userSearchSettings2 = this.f35872b.getSettingGroup().search;
        int iIntValue3 = this.f35872b.getSearchMinAge().intValue();
        int iIntValue4 = User.AGE_MIN_GOOGLEPLAY;
        if (iIntValue3 >= iIntValue4) {
            iIntValue4 = this.f35872b.getSearchMinAge().intValue();
        }
        userSearchSettings2.minAge = Integer.valueOf(iIntValue4);
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m55132F1() {
        return this.f35872b.autoAdjustSuggestRadius().booleanValue();
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ void m55133F2(View view) {
        m55127C3(new Runnable() { // from class: l.qpe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f155746a.m55130E2();
            }
        }, "hide_age");
    }

    /* JADX INFO: renamed from: F3 */
    public void m55134F3() {
        if (NullChecker.m81303a(this.f35871a) && NullChecker.m81303a(this.f35872b) && CoreModule.m29931H().signedIn_() && m55185a3()) {
            SettingGroups settingGroups = new SettingGroups();
            UserSearchSettings userSearchSettings = new UserSearchSettings();
            settingGroups.search = userSearchSettings;
            userSearchSettings.lookingForGender = this.f35872b.getLookingFor();
            settingGroups.search.ageAllowedMinimum = this.f35872b.getSearchAgeAllowedMinimum();
            settingGroups.search.ageAllowedMaximum = this.f35872b.getSearchAgeAllowedMaximum();
            settingGroups.search.minAge = this.f35872b.getSearchMinAge();
            settingGroups.search.maxAge = this.f35872b.getSearchMaxAge();
            settingGroups.search.radius = this.f35872b.getSearchRadius();
            settingGroups.search.radiusAllowedMinimum = this.f35872b.getRadiusAllowedMinimum();
            settingGroups.search.radiusAllowedMaximum = this.f35872b.getRadiusAllowedMaximum();
            settingGroups.search.priorities = this.f35872b.getSearchPriority();
            settingGroups.search.autoAdjustRadius = this.f35872b.autoAdjustSuggestRadius();
            if (qib0.f154713b0.f139230a.mo28172rq(this.f35871a.settings.getSettingGroup())) {
                settingGroups.gender = this.f35872b.getSettingGroup().gender;
            }
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f35871a.settings.getSettingGroup());
            if (NullChecker.m81303a(settingGroupsSubtract)) {
                CoreModule.f17545c.f19663m0.m31121k8(settingGroupsSubtract).subscribe(mkd0.m154956H(new e30() { // from class: l.eoe0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        HomeStatisticsHelper.m36692F(Settings.TYPE);
                    }
                }, new e30() { // from class: l.foe0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C8848a.m55088k0((Throwable) obj);
                    }
                }));
            }
            if (u59.m191810S()) {
                AdvancedSettings advancedSettingsM55153O1 = m55153O1();
                if (NullChecker.m81303a(advancedSettingsM55153O1)) {
                    CoreModule.f17545c.f19564F0.m99248o3(advancedSettingsM55153O1, false).subscribe(mkd0.m154956H(new e30() { // from class: l.goe0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            HomeStatisticsHelper.m36692F(Settings.TYPE);
                        }
                    }, new e30() { // from class: l.hoe0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            C8848a.m55117x0((Throwable) obj);
                        }
                    }));
                }
            }
        }
    }

    /* JADX INFO: renamed from: H1 */
    public void m55135H1() {
        if (this.f35886p) {
            ((C8849b) this.viewModel).m55326j1();
        }
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m55136H2() {
        if (NullChecker.m81303a(this.f35875e) && !this.f35875e.hideLocation.booleanValue()) {
            lsi0.m151595y(act().getString(R$string.f18803op));
        }
        ((C8849b) this.viewModel).m55310a0();
    }

    /* JADX INFO: renamed from: H3 */
    public final void m55137H3() {
        if (NullChecker.m81303a(this.f35875e) && xma.m210047L3()) {
            duringCreated(CoreModule.f17545c.f19561E0.m203788R3(this.f35875e)).subscribe(mkd0.m154956H(new e30() { // from class: l.bqe0
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8848a.m55091l0((roj0) obj);
                }
            }, new e30() { // from class: l.cqe0
                @Override // p149l.e30
                public final void call(Object obj) {
                    yij0.m214926D((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I1 */
    public String m55138I1() {
        return this.f35881k.get(this.f35872b.getLookingFor().toString());
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ void m55139I2(View view) {
        m55127C3(new Runnable() { // from class: l.ope0
            @Override // java.lang.Runnable
            public final void run() {
                this.f144990a.m55136H2();
            }
        }, "hide_location");
    }

    /* JADX INFO: renamed from: I3 */
    public int m55140I3() {
        double dM133844K = i0g0.m133844K(this.f35872b.getSearchRadius().intValue());
        if (dM133844K >= 59.0d && this.f35872b.getSearchRadius().intValue() < this.f35872b.getRadiusAllowedMaximum().intValue()) {
            return 59;
        }
        if (this.f35872b.getSearchRadius().intValue() >= this.f35872b.getRadiusAllowedMaximum().intValue()) {
            return 60;
        }
        return (int) dM133844K;
    }

    /* JADX INFO: renamed from: J1 */
    public int m55141J1() {
        return (this.f35872b.getRadiusAllowedMaximum().intValue() - this.f35872b.getRadiusAllowedMinimum().intValue()) / 1000;
    }

    /* JADX INFO: renamed from: J2 */
    public final /* synthetic */ void m55142J2() {
        ((C8849b) this.viewModel).m55312b0();
    }

    /* JADX INFO: renamed from: J3 */
    public int m55143J3() {
        return (this.f35872b.getSearchRadius().intValue() - this.f35872b.getRadiusAllowedMinimum().intValue()) / 1000;
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m55144K2(View view) {
        m55127C3(new Runnable() { // from class: l.mpe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f135043a.m55142J2();
            }
        }, "show_to_mylikes_only");
    }

    /* JADX INFO: renamed from: K3 */
    public View.OnClickListener m55145K3() {
        return new View.OnClickListener() { // from class: l.fpe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98688a.m55181Y2(view);
            }
        };
    }

    /* JADX INFO: renamed from: L1 */
    public void m55146L1(boolean z) {
        this.f35875e.frozenActivity = Boolean.valueOf(z);
        m55137H3();
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m55147L2(View view) {
        act().startActivity(VipLocationHistoryAct.m56276V1(act(), "from_setting"));
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m55148M2(PaymentApi.PaymentResultStatus paymentResultStatus) {
        act().progressDismiss();
        if (paymentResultStatus == PaymentApi.PaymentResultStatus.succeed) {
            lsi0.m151593w(R$string.f18585hm);
        } else {
            lsi0.m151578h(R$string.f18873r4);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public void m55149M3(boolean z) {
        if (this.f35872b == null) {
            return;
        }
        o6j0.m162859c("e_edit_increase_distance", "p_settings_view", o6j0.C18854a.m162875e().m162880d("increase_distance_open").m162886o(z));
        this.f35872b.getSettingGroup().search.autoAdjustRadius = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: N1 */
    public Dialog.InterfaceC4311g m55150N1(final int i) {
        return new Dialog.InterfaceC4311g() { // from class: l.aqe0
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i2, CharSequence charSequence) {
                this.f71149a.m55192e2(i, dialog, view, i2, charSequence);
            }
        };
    }

    /* JADX INFO: renamed from: N2 */
    public final /* synthetic */ void m55151N2(Throwable th) {
        act().progressDismiss();
        lsi0.m151578h(R$string.f18873r4);
    }

    /* JADX INFO: renamed from: N3 */
    public void m55152N3(List<String> list, int i) {
        this.f35872b.intent = SettingsIntent.get(list.get(i));
    }

    /* JADX INFO: renamed from: O1 */
    public AdvancedSettings m55153O1() {
        AdvancedSettings advancedSettings = this.f35874d;
        if (advancedSettings == null || this.f35873c == null) {
            return null;
        }
        ((C8849b) this.viewModel).m55330l1(advancedSettings);
        return this.f35874d.subtract(this.f35873c);
    }

    /* JADX INFO: renamed from: O3 */
    public void m55154O3() {
        if (NullChecker.m81303a(this.f35872b) && qib0.f154713b0.f139230a.mo28172rq(this.f35872b.getSettingGroup())) {
            m55157P3();
        } else {
            ((C8849b) this.viewModel).m55321g1(m55138I1());
        }
    }

    /* JADX INFO: renamed from: P1 */
    public int m55155P1() {
        return this.f35872b.getSearchAgeAllowedMaximum().intValue();
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ void m55156P2(View view) {
        aqo aqoVarM98316h = aqo.m98316h(act(), act() instanceof PutongAct ? ((PutongAct) act()).iap().m148933i() : null);
        act().progress(R$string.f17842J5);
        aqoVarM98316h.mo123062a().doOnNext(new e30() { // from class: l.vpe0
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.wpe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187505a.m55148M2((PaymentApi.PaymentResultStatus) obj);
            }
        }, new e30() { // from class: l.xpe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193912a.m55151N2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P3 */
    public final void m55157P3() {
        List<LookingFor> list = this.f35872b.getSettingGroup().gender.lookingForGenders;
        if (list.size() > 2) {
            ((C8849b) this.viewModel).m55321g1(act().getResources().getString(R$string.f17612Bf));
            return;
        }
        if (list.size() <= 0) {
            ((C8849b) this.viewModel).m55321g1(this.f35882l.get(this.f35872b.getLookingFor().toString()));
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (LookingFor lookingFor : list) {
            if (!sb.toString().isEmpty()) {
                sb.append(" & ");
            }
            sb.append(this.f35882l.get(lookingFor.toString()));
        }
        ((C8849b) this.viewModel).m55321g1(sb.toString());
    }

    /* JADX INFO: renamed from: Q1 */
    public int m55158Q1() {
        return this.f35872b.getSearchAgeAllowedMinimum().intValue();
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m55159Q2(View view) {
        act().startActivity(new Intent(act(), (Class<?>) AboutTantanAct.class));
    }

    /* JADX INFO: renamed from: Q3 */
    public void m55160Q3() {
        if (mb90.m153866b(PurchaseType.TYPE_ROAMING_PKG) && CoreModule.f17545c.f19654j0.f19287Z.get().booleanValue() && !CoreModule.f17545c.f19654j0.f19288a0.get().booleanValue()) {
            ((C8849b) this.viewModel).m55351v1();
        }
    }

    /* JADX INFO: renamed from: R1 */
    public int m55161R1() {
        return this.f35872b.getSearchMaxAge().intValue();
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m55162R2(View view) {
        act().startActivity(IntlPersonalDetailsAct.INSTANCE.m55003a(act(), "setting"));
    }

    /* JADX INFO: renamed from: R3 */
    public void m55163R3(boolean z) {
        this.f35875e.showMeToMyLike = Boolean.valueOf(z);
        m55137H3();
    }

    /* JADX INFO: renamed from: S1 */
    public int m55164S1() {
        return (!"ko".equals(Locale.getDefault().getLanguage()) || this.f35872b.getSearchMinAge().intValue() > 20) ? this.f35872b.getSearchMinAge().intValue() : this.f35872b.getSearchAgeAllowedMinimum().intValue();
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m55165S2(View view) {
        act().startActivity(CoreModule.m29936Q().mo67220Gr(act(), null));
    }

    /* JADX INFO: renamed from: S3 */
    public void m55166S3(boolean z) {
        act().progress(R$string.f17842J5);
        if (z) {
            User userMe_ = CoreModule.m29932K().me_();
            if (userMe_ == null) {
                lsi0.m151578h(com.p046p1.mobile.putong.common.R$string.f17305B);
                qib0.m174809b1(null, false, AccountTempApi.InactiveType.None, false).subscribe(mkd0.m154954F());
                CrashHelper.m81296c(new Exception("catch datebase query null NullPointerException"));
                return;
            }
            qib0.f154697L.f17146d.m205063p(userMe_.m60124fp().url, CoreModule.m29931H().getAuthData().mo108248b(), userMe_.name);
        } else {
            qib0.f154697L.f17146d.m108250i();
        }
        w85.INSTANCE.m202145m("Log out", null);
        zvf0.m220396r("e_sign_out_botton", ((C8849b) this.viewModel).m55311a1());
        qib0.m174805Z0(true, false).materialize().first().subscribe(mkd0.m154956H(new e30() { // from class: l.ooe0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8848a.m55047B1((Notification) obj);
            }
        }, new e30() { // from class: l.poe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150500a.m55183Z2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T1 */
    public String m55167T1() {
        int iIntValue;
        int iIntValue2 = this.f35872b.getSearchMinAge().intValue();
        int iIntValue3 = this.f35872b.getSearchMaxAge().intValue();
        int i = iIntValue3 - 1;
        if (!"ko".equals(Locale.getDefault().getLanguage())) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f35872b.getSearchMinAge());
            sb.append(" - ");
            sb.append(this.f35872b.getSearchMaxAge());
            sb.append(this.f35872b.getSearchMaxAge().equals(this.f35872b.getSearchAgeAllowedMaximum()) ? Marker.ANY_NON_NULL_MARKER : "");
            return sb.toString();
        }
        int iIntValue4 = 20;
        if (iIntValue2 < 20) {
            iIntValue = 20;
        } else {
            iIntValue = iIntValue2 >= i ? this.f35872b.getSearchMinAge().intValue() : iIntValue2 + 1;
        }
        if (iIntValue3 >= 20) {
            iIntValue4 = iIntValue3 >= i ? this.f35872b.getSearchMaxAge().intValue() : iIntValue3 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iIntValue);
        sb2.append(" - ");
        sb2.append(iIntValue4);
        sb2.append(this.f35872b.getSearchMaxAge().equals(this.f35872b.getSearchAgeAllowedMaximum()) ? Marker.ANY_NON_NULL_MARKER : "");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m55168T2(View view) {
        act().startActivity(new Intent(act(), (Class<?>) NewAccountSecureAct.class));
    }

    /* JADX INFO: renamed from: T3 */
    public void m55169T3(int i, int i2, d30 d30Var) {
        if (i < this.f35872b.getSearchAgeAllowedMinimum().intValue() || i2 < this.f35872b.getSearchAgeAllowedMinimum().intValue() || i > this.f35872b.getSearchAgeAllowedMaximum().intValue() || i2 > this.f35872b.getSearchAgeAllowedMaximum().intValue()) {
            return;
        }
        this.f35872b.getSettingGroup().search.minAge = Integer.valueOf(i);
        this.f35872b.getSettingGroup().search.maxAge = Integer.valueOf(i2);
        d30Var.call();
        act().removeCallbacks(this.f35894x);
        act().postDelayed(this.f35894x, 1000L);
    }

    /* JADX INFO: renamed from: U1 */
    public int m55170U1(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (TEnum.equals(this.f35872b.intent, list.get(i))) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m55171U2(View view) {
        int i;
        view.requestFocus();
        if (NullChecker.m81303a(this.f35872b) && qib0.f154713b0.f139230a.mo28172rq(this.f35872b.getSettingGroup())) {
            ((C8849b) this.viewModel).m55345s1(this.f35872b.getSettingGroup());
            return;
        }
        if (TEnum.equals(this.f35872b.getLookingFor(), "male")) {
            i = 0;
        } else {
            i = TEnum.equals(this.f35872b.getLookingFor(), "female") ? 1 : 2;
        }
        o6j0.m162859c("e_edit_gender_filter", "p_settings_view", new o6j0.C18854a[0]);
        ((C8849b) this.viewModel).m55343r1(i);
    }

    /* JADX INFO: renamed from: U3 */
    public void m55172U3(e30<String> e30Var) {
        String strConcat;
        Integer num = 0;
        if (IntlCountryCodeController.m28110f()) {
            String str = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + act().getString(R$string.f18005Oi);
            double dM133844K = i0g0.m133844K(this.f35872b.getSearchRadius().intValue());
            if (dM133844K >= 59.0d && this.f35872b.getSearchRadius().intValue() < this.f35872b.getRadiusAllowedMaximum().intValue()) {
                strConcat = "59".concat(str);
            } else if (this.f35872b.getSearchRadius().intValue() >= this.f35872b.getRadiusAllowedMaximum().intValue()) {
                strConcat = "60" + str + Marker.ANY_NON_NULL_MARKER;
            } else if (this.f35872b.getSearchRadius().intValue() <= this.f35872b.getRadiusAllowedMinimum().intValue()) {
                strConcat = "<1 " + act().getString(R$string.f18035Pi);
            } else {
                strConcat = zz6.f205780h.format(dM133844K) + str;
            }
        } else {
            int iIntValue = this.f35872b.getSearchRadius().intValue() / 1000;
            String string = act().getString(R$string.f18273Xg);
            Integer radiusAllowedMaximum = this.f35872b.getRadiusAllowedMaximum();
            Integer radiusAllowedMinimum = this.f35872b.getRadiusAllowedMinimum();
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
        e30Var.call(strConcat);
    }

    /* JADX INFO: renamed from: V1 */
    public String m55173V1() {
        SettingsIntent settingsIntent = this.f35872b.intent;
        if (settingsIntent == null) {
            return null;
        }
        String string = settingsIntent.toString();
        string.getClass();
        int i = 0;
        switch (string) {
            case "friend":
                i = R$string.f17920Ln;
                break;
            case "relationship":
                i = R$string.f17950Mn;
                break;
            case "date":
                i = R$string.f17860Jn;
                break;
            case "fate":
                i = R$string.f17890Kn;
                break;
        }
        return act().string(i);
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m55174V2(View view) {
        act().startActivity(new Intent(act(), (Class<?>) DataAndStorageAct.class));
    }

    /* JADX INFO: renamed from: V3 */
    public void m55175V3(int i) {
        if (!IntlCountryCodeController.m28110f()) {
            this.f35872b.getSettingGroup().search.radius = Integer.valueOf(this.f35872b.getRadiusAllowedMinimum().intValue() + Math.min(this.f35872b.getRadiusAllowedMaximum().intValue() - this.f35872b.getRadiusAllowedMinimum().intValue(), Math.max(0, i * 1000)));
            return;
        }
        Settings settings = this.f35872b;
        if (i == 60) {
            settings.getSettingGroup().search.radius = this.f35872b.getRadiusAllowedMaximum();
        } else {
            settings.getSettingGroup().search.radius = Integer.valueOf(this.f35872b.getRadiusAllowedMinimum().intValue() + Math.min(this.f35872b.getRadiusAllowedMaximum().intValue() - this.f35872b.getRadiusAllowedMinimum().intValue(), (int) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, i0g0.m133845L(i))));
        }
    }

    /* JADX INFO: renamed from: W1 */
    public SpannableString m55176W1() {
        SpannableString spannableString = new SpannableString(act().getString(R$string.f18742mq, "7.2.7"));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        return spannableString;
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m55177W2(View view) {
        zrj0.m219975x(act());
    }

    /* JADX INFO: renamed from: X1 */
    public void m55178X1(SettingGroups settingGroups) {
        this.f35872b.getSettingGroup().gender.lookingForGenders = settingGroups.gender.lookingForGenders;
        this.f35872b.getSettingGroup().gender.notShowCis = settingGroups.gender.notShowCis;
        m55157P3();
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m55179X2() {
        zvf0.m220396r("e_school_identify_makeSure_guide_click", "p_school_identify_makeSure_guide");
        act().startActivity(StudentInfoAct.m44485V1(act(), "Chanel8.SchoolIdentifyPage.Shown", false));
    }

    /* JADX INFO: renamed from: Y1 */
    public void m55180Y1(boolean z) {
        this.f35875e.hideAge = Boolean.valueOf(z);
        m55137H3();
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m55181Y2(View view) {
        ((C8849b) this.viewModel).m55291B1();
        new ukf0(act()).m194154a();
        x1f0.f189070b.put(Boolean.TRUE);
        ((C8849b) this.viewModel).m55340q1(Boolean.FALSE);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f35886p = ((C8849b) this.viewModel).m55320g0();
        this.f35889s = ((C8849b) this.viewModel).m55322h0();
        this.f35890t = ((C8849b) this.viewModel).m55313c0();
        this.f35891u = ((C8849b) this.viewModel).m55314d0();
        this.f35892v = ((C8849b) this.viewModel).m55318f0();
        this.f35893w = ((C8849b) this.viewModel).m55316e0();
        this.f35887q = UserPrivacySettings.new_();
    }

    /* JADX INFO: renamed from: Z1 */
    public void m55182Z1(boolean z) {
        this.f35875e.hideLocation = Boolean.valueOf(z);
        m55137H3();
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m55183Z2(Throwable th) {
        act().progressDismiss();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.rne0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160264a.m55087j2((Bundle) obj);
            }
        }, new d30() { // from class: l.tne0
            @Override // p149l.d30
            public final void call() {
                this.f171226a.m55090k2();
            }
        });
        duringCreated(new v9j() { // from class: l.vne0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return zrj0.f204524f;
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.wne0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187292a.m55111t2((Boolean) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.xne0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193670a.m55114u2((C4319c) obj);
            }
        }));
        duringCreated((C22306c) CoreModule.f17545c.f19663m0.m31118j9().switchMap(new w9j() { // from class: l.yne0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19639e0.m169523o9();
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.zne0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203978a.m55116v2((User) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).filter(new w9j() { // from class: l.aoe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(TEnum.equals(user.source, "wechat") || TEnum.equals(user.source, "qq"));
            }
        }).map(new w9j() { // from class: l.boe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8848a.m55107s0((User) obj);
            }
        }).distinctUntilChanged().filter(new w9j() { // from class: l.doe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.coe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81835a.m55204l2((String) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9().map(new w9j() { // from class: l.noe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).age;
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.yoe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199289a.m55206m2((Integer) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.f149357e0.obs()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.jpe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119150a.m55208n2((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).map(new w9j() { // from class: l.upe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f177595a.m55099o2((User) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.dqe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87410a.m55211p2((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19627a0.f151420U.obs()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.eqe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92794a.m55104q2((Boolean) obj);
            }
        }));
        CoreModule.f17545c.f19639e0.m169484ea();
        p420.m167354t(act());
        if (u59.m191810S()) {
            duringCreated((C22306c) CoreModule.f17545c.f19564F0.m99252s3().switchMap(new w9j() { // from class: l.fqe0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19564F0.m99241h3();
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.gqe0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f103931a.m55214r2((AdvancedSettings) obj);
                }
            }));
            CoreModule.f17545c.f19564F0.m99250q3();
        }
        duringCreated(CoreModule.m29936Q().mo67257ao(CoreModule.m29931H().userId())).subscribe(mkd0.m154956H(new e30() { // from class: l.sne0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165436a.m55216s2((Boolean) obj);
            }
        }, new e30() { // from class: l.une0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8848a.m55075e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a2 */
    public void m55184a2(boolean z) {
        this.f35875e.hideIcon = Boolean.valueOf(z);
        m55137H3();
    }

    /* JADX INFO: renamed from: a3 */
    public final boolean m55185a3() {
        if (!NullChecker.m81303a(Act.foreground_())) {
            return true;
        }
        Activity activity = Act.foreground_().f15343a.get();
        return ((activity instanceof SwitchAccountAct) || (activity instanceof SwitchAccountV2Act) || CoreModule.m29931H().getSignOutJumpAct().isInstance(activity)) ? false : true;
    }

    /* JADX INFO: renamed from: b2 */
    public void m55186b2() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        if ((TEnum.equals(userM169520na.source, "wechat") || TEnum.equals(userM169520na.source, "qq")) && TextUtils.isEmpty(userM169520na.settings.phoneNumber.number)) {
            TextUtils.isEmpty(userM169520na.settings.linkedPhoneNumber.number);
        }
        ((C8849b) this.viewModel).m55338p1(act().getString(R$string.f18759nc));
        ((C8849b) this.viewModel).m55336o1(TextUtils.isEmpty(userM169520na.settings.phoneNumber.number) && !CoreModule.f17545c.f19627a0.f151420U.get().booleanValue());
        if (b43.m100168b()) {
            ((C8849b) this.viewModel).m55328k1(act().getString(R$string.f17590An));
        } else if (TEnum.equals(userM169520na.source, "facebook")) {
            ((C8849b) this.viewModel).m55328k1(act().getString(R$string.f19102yn));
        }
    }

    /* JADX INFO: renamed from: b3 */
    public boolean m55187b3() {
        if (!NullChecker.m81303a(this.f35877g) || !this.f35877g.m222892d()) {
            return false;
        }
        this.f35877g.m222891c();
        return true;
    }

    /* JADX INFO: renamed from: c2 */
    public void m55188c2() {
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).map(new w9j() { // from class: l.toe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).getLatitudeAndLongitude();
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.uoe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177505a.m55196g2((DoublePair) obj);
            }
        }));
        duringCreated((C22306c) CoreModule.f17545c.f19639e0.m169523o9().filter(new w9j() { // from class: l.voe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(DoublePair.new_().equals(((User) obj).getLatitudeAndLongitude()));
            }
        }).switchMap(new w9j() { // from class: l.woe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qib0.f154687E.m78864p().filter(new w9j() { // from class: l.tpe0
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(CoreModule.m29931H().signedIn_());
                    }
                });
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.xoe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193838a.m55200i2((Location) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c3 */
    public void m55189c3(final boolean z) {
        duringCreated(CoreModule.f17545c.f19639e0.m169398Ha(!z)).subscribe(mkd0.m154956H(new e30() { // from class: l.npe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139960a.m55221w2(z, (roj0) obj);
            }
        }, new yaf0()));
    }

    /* JADX INFO: renamed from: d2 */
    public void m55190d2(f30<Boolean, Boolean> f30Var) {
        Boolean bool = Boolean.FALSE;
        f30Var.call(bool, bool);
    }

    /* JADX INFO: renamed from: d3 */
    public void m55191d3() {
        act().startActivity(new Intent(act(), (Class<?>) ChatAndNotifiAct.class));
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m55192e2(int i, Dialog dialog, View view, int i2, CharSequence charSequence) {
        if (i != i2) {
            if (i2 == 0) {
                this.f35872b.getSettingGroup().search.lookingForGender = LookingFor.get("male");
                ((C8849b) this.viewModel).m55321g1(this.f35881k.get("male"));
                return;
            }
            Settings settings = this.f35872b;
            if (i2 == 1) {
                settings.getSettingGroup().search.lookingForGender = LookingFor.get("female");
                ((C8849b) this.viewModel).m55321g1(this.f35881k.get("female"));
            } else {
                settings.getSettingGroup().search.lookingForGender = LookingFor.get("both");
                ((C8849b) this.viewModel).m55321g1(this.f35881k.get("both"));
            }
        }
    }

    /* JADX INFO: renamed from: e3 */
    public void m55193e3() {
        act().startActivity(new Intent(act(), (Class<?>) ChatInputSettingAct.class));
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m55194f2(d90 d90Var) {
        f35870y.put(d90Var.mo110405b());
        ((C8849b) this.viewModel).m55332m1(TextUtils.isEmpty(d90Var.mo110405b()) ? act().string(R$string.f18010On) : d90Var.mo110405b());
    }

    /* JADX INFO: renamed from: f3 */
    public void m55195f3(boolean z) {
        if (!CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
            ((C8849b) this.viewModel).m55356y1();
            return;
        }
        this.f35887q.hideActivityTime = Boolean.valueOf(z);
        act().progress(R$string.f17842J5);
        duringCreated(CoreModule.f17545c.f19639e0.m169563y9(this.f35887q)).subscribe(mkd0.m154956H(new e30() { // from class: l.loe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129089a.m55223x2((SettingGroups) obj);
            }
        }, new e30() { // from class: l.moe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134889a.m55225y2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m55196g2(DoublePair doublePair) {
        if (TextUtils.isEmpty(f35870y.get()) && NullChecker.m81303a(this.f35871a) && NullChecker.m81303a(this.f35871a.location) && !TextUtils.isEmpty(this.f35871a.location.region.city)) {
            f35870y.put(this.f35871a.location.region.city);
        }
        boolean zEquals = DoublePair.new_().equals(doublePair);
        V v2 = this.viewModel;
        if (zEquals) {
            ((C8849b) v2).m55334n1(act().string(R$string.f18040Pn));
            ((C8849b) this.viewModel).m55332m1(TextUtils.isEmpty(f35870y.get()) ? act().string(R$string.f18010On) : f35870y.get());
        } else {
            ((C8849b) v2).m55334n1(act().string(R$string.f18070Qn));
            ((C8849b) this.viewModel).m55332m1(TextUtils.isEmpty(f35870y.get()) ? act().string(R$string.f18010On) : f35870y.get());
            this.f35876f.m154844e(this, doublePair.first, doublePair.second, new e30() { // from class: l.kpe0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f124134a.m55194f2((d90) obj);
                }
            }, new e30() { // from class: l.lpe0
                @Override // p149l.e30
                public final void call(Object obj) {
                    App.f15368d.m20433k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g3 */
    public View.OnClickListener m55197g3() {
        return new View.OnClickListener() { // from class: l.dpe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87266a.m55122A2(view);
            }
        };
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m55198h2(DoublePair doublePair, d90 d90Var) {
        f35870y.put(d90Var.mo110405b());
        ((C8849b) this.viewModel).m55332m1(TextUtils.isEmpty(d90Var.mo110405b()) ? act().string(R$string.f18010On) : d90Var.mo110405b());
        if (TextUtils.isEmpty(d90Var.mo110405b())) {
            zvf0.m220369B("e_setting_location_to_address", "", vwb.m200311Y("is_success", Boolean.TRUE), vwb.m200311Y("has_city", Boolean.FALSE), vwb.m200311Y("location_latitude", Double.valueOf(doublePair.first)), vwb.m200311Y("location_longitude", Double.valueOf(doublePair.second)));
        } else {
            Boolean bool = Boolean.TRUE;
            zvf0.m220369B("e_setting_location_to_address", "", vwb.m200311Y("is_success", bool), vwb.m200311Y("has_city", bool), vwb.m200311Y("location_latitude", Double.valueOf(doublePair.first)), vwb.m200311Y("location_longitude", Double.valueOf(doublePair.second)));
        }
    }

    /* JADX INFO: renamed from: h3 */
    public View.OnClickListener m55199h3() {
        return new View.OnClickListener() { // from class: l.gpe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103796a.m55128D2(view);
            }
        };
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m55200i2(Location location) {
        this.f35888r = true;
        zvf0.m220369B("e_setting_get_user_location_success", "", new j760[0]);
        final DoublePair doublePairNew_ = DoublePair.new_();
        doublePairNew_.first = location.m78831u();
        doublePairNew_.second = location.m78833x();
        if (DoublePair.new_().equals(CoreModule.f17545c.f19639e0.m169527p9().getLatitudeAndLongitude())) {
            this.f35876f.m154844e(this, doublePairNew_.first, doublePairNew_.second, new e30() { // from class: l.rpe0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f160498a.m55198h2(doublePairNew_, (d90) obj);
                }
            }, new e30() { // from class: l.spe0
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8848a.m55112u0(doublePairNew_, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i3 */
    public View.OnClickListener m55201i3() {
        return new View.OnClickListener() { // from class: l.bpe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76621a.m55133F2(view);
            }
        };
    }

    /* JADX INFO: renamed from: j3 */
    public View.OnClickListener m55202j3() {
        return new View.OnClickListener() { // from class: l.joe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118955a.m55139I2(view);
            }
        };
    }

    /* JADX INFO: renamed from: k3 */
    public View.OnClickListener m55203k3() {
        return new View.OnClickListener() { // from class: l.roe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160380a.m55144K2(view);
            }
        };
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m55204l2(String str) {
        ((C8849b) this.viewModel).m55336o1(false);
        ((C8849b) this.viewModel).m55338p1(act().getString(R$string.f18759nc));
    }

    /* JADX INFO: renamed from: l3 */
    public View.OnClickListener m55205l3() {
        return new View.OnClickListener() { // from class: l.koe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123996a.m55147L2(view);
            }
        };
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m55206m2(Integer num) {
        if (!this.f35885o) {
            ((C8849b) this.viewModel).m55333n0();
        }
        this.f35885o = false;
    }

    /* JADX INFO: renamed from: m3 */
    public void m55207m3() {
        act().startActivity(PrivacySettingAct.m55673Y1(act(), "setting"));
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m55208n2(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        ((C8849b) this.viewModel).m55336o1(false);
    }

    /* JADX INFO: renamed from: n3 */
    public void m55209n3() {
        act().startActivity(new Intent(act(), (Class<?>) PushMsgSettingAct.class));
    }

    /* JADX INFO: renamed from: o3 */
    public void m55210o3() {
        act().startActivity(PrivacyAndPremissonAct.m55676Y1(act(), "other_setting"));
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m55211p2(Boolean bool) {
        ((C8849b) this.viewModel).m55319f1(bool.booleanValue());
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: p3 */
    public void m55212p3() {
        act().startActivity(new Intent(act(), (Class<?>) PrivacyAndPremissonAct.class));
    }

    /* JADX INFO: renamed from: q3 */
    public View.OnClickListener m55213q3() {
        return new View.OnClickListener() { // from class: l.epe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92647a.m55156P2(view);
            }
        };
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m55214r2(AdvancedSettings advancedSettings) {
        if (NullChecker.m81303a(advancedSettings)) {
            this.f35873c = advancedSettings;
            AdvancedSettings advancedSettingsMo223809clone = advancedSettings.mo223809clone();
            this.f35874d = advancedSettingsMo223809clone;
            ((C8849b) this.viewModel).m55331m0(advancedSettingsMo223809clone);
        }
    }

    /* JADX INFO: renamed from: r3 */
    public View.OnClickListener m55215r3() {
        return new View.OnClickListener() { // from class: l.hpe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108914a.m55159Q2(view);
            }
        };
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m55216s2(Boolean bool) {
        ((C8849b) this.viewModel).m55296F1(bool.booleanValue());
    }

    /* JADX INFO: renamed from: s3 */
    public View.OnClickListener m55217s3() {
        return new View.OnClickListener() { // from class: l.cpe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81922a.m55162R2(view);
            }
        };
    }

    /* JADX INFO: renamed from: t3 */
    public void m55218t3() {
        act().startActivity(WebViewAct.m80164Z1(act(), "设置屏蔽词", ene0.m117266a("set_page")));
    }

    /* JADX INFO: renamed from: u3 */
    public View.OnClickListener m55219u3() {
        return new View.OnClickListener() { // from class: l.zoe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204103a.m55165S2(view);
            }
        };
    }

    /* JADX INFO: renamed from: v3 */
    public View.OnClickListener m55220v3() {
        return new View.OnClickListener() { // from class: l.qoe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155562a.m55168T2(view);
            }
        };
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m55221w2(boolean z, roj0 roj0Var) {
        CoreModule.f17545c.f19639e0.m169527p9().setBlackDiamondTag(!z);
        ((C8849b) this.viewModel).m55289A1();
    }

    /* JADX INFO: renamed from: w3 */
    public View.OnClickListener m55222w3() {
        return new View.OnClickListener() { // from class: l.ape0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71028a.m55171U2(view);
            }
        };
    }

    /* JADX INFO: renamed from: x2 */
    public final /* synthetic */ void m55223x2(SettingGroups settingGroups) {
        act().progressDismiss();
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
        o6j0.m162870n("e_hide_active_time_status", "p_settings_view", o6j0.C18854a.m162878h("hide_time_status", settingGroups.privacy.hideActivityTime.booleanValue() ? "open" : "close"));
        ((C8849b) this.viewModel).m55319f1(settingGroups.privacy.hideActivityTime.booleanValue());
    }

    /* JADX INFO: renamed from: x3 */
    public void m55224x3() {
        Settings settings = this.f35872b;
        if (settings == null) {
            return;
        }
        o6j0.m162863g("e_edit_distance_filter", "p_settings_view", o6j0.C18854a.m162876f("max_distance", settings.getSearchRadius().intValue() / 1000));
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m55225y2(Throwable th) {
        act().progressDismiss();
        ((C8849b) this.viewModel).m55309Z0(th);
    }

    /* JADX INFO: renamed from: y3 */
    public View.OnClickListener m55226y3() {
        return new View.OnClickListener() { // from class: l.ioe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114155a.m55174V2(view);
            }
        };
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m55227z2() {
        if (NullChecker.m81303a(this.f35875e) && !this.f35875e.hideIcon.booleanValue()) {
            lsi0.m151595y(act().getString(R$string.f18772np));
        }
        ((C8849b) this.viewModel).m55304X();
    }

    /* JADX INFO: renamed from: z3 */
    public View.OnClickListener m55228z3() {
        return new View.OnClickListener() { // from class: l.soe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165672a.m55177W2(view);
            }
        };
    }
}
