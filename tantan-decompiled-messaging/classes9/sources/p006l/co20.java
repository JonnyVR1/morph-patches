package p006l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.C0322a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.data.AdvancedSettings;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.OMSThemeInfo;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserPrivacySettings;
import com.p1.mobile.putong.data.UserSearchSettings;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.b9l;
import l.d30;
import l.d90;
import l.e30;
import l.e51;
import l.j760;
import l.jq2;
import l.lqa;
import l.mcr;
import l.mjj;
import l.mkd0;
import l.pj90;
import l.roj0;
import l.s7m;
import l.vwb;
import l.w9j;
import l.yij0;
import l.yki0;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class co20 extends jq2<mo20> {

    /* JADX INFO: renamed from: a */
    public Act f9750a;

    /* JADX INFO: renamed from: b */
    public User f9751b;

    /* JADX INFO: renamed from: c */
    public Settings f9752c;

    /* JADX INFO: renamed from: d */
    public mjj f9753d;

    /* JADX INFO: renamed from: e */
    public boolean f9754e;

    /* JADX INFO: renamed from: f */
    public xe20 f9755f;

    /* JADX INFO: renamed from: g */
    public bb40 f9756g;

    /* JADX INFO: renamed from: h */
    public u640 f9757h;

    /* JADX INFO: renamed from: i */
    public C0322a f9758i;

    /* JADX INFO: renamed from: j */
    public AdvancedSettings f9759j;

    /* JADX INFO: renamed from: k */
    public AdvancedSettings f9760k;

    /* JADX INFO: renamed from: l */
    public String f9761l;

    /* JADX INFO: renamed from: m */
    public d30 f9762m;

    /* JADX INFO: renamed from: n */
    public boolean f9763n;

    public co20(Act act, mcr mcrVar) {
        super(mcrVar);
        this.f9754e = true;
        this.f9761l = "user_click";
        this.f9750a = act;
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m13555E0(Throwable th) {
        CoreModule.f1534c.f3652m0.m3095z5(false);
        yij0.D(th);
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m13556F0(Throwable th) {
        CoreModule.f1534c.f3652m0.m3095z5(false);
        yij0.D(th);
    }

    /* JADX INFO: renamed from: J0 */
    private void m13560J0(AdvancedSettings advancedSettings) {
        m13580i1(advancedSettings);
        m13582j1(advancedSettings);
        m13561P0(advancedSettings);
    }

    /* JADX INFO: renamed from: P0 */
    private boolean m13561P0(AdvancedSettings advancedSettings) {
        boolean z = false;
        if (NullChecker.a(advancedSettings)) {
            if (NullChecker.a(advancedSettings.popular)) {
                advancedSettings.popular = this.f9759j.popular;
                z = true;
            }
            if (NullChecker.a(advancedSettings.online)) {
                advancedSettings.online = this.f9759j.online;
                z = true;
            }
            if (NullChecker.a(advancedSettings.newUser)) {
                advancedSettings.newUser = this.f9759j.newUser;
                z = true;
            }
            if (NullChecker.a(advancedSettings.zodiacs)) {
                advancedSettings.zodiacs = this.f9759j.zodiacs;
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: Q0 */
    private boolean m13562Q0(AdvancedSettings advancedSettings) {
        return NullChecker.a(advancedSettings) && CoreModule.f1534c.f3628e0.m21490p9().isPicVerificationVerified() && NullChecker.a(advancedSettings.realFace) && !advancedSettings.realFace.equals(this.f9759j.realFace);
    }

    /* JADX INFO: renamed from: R0 */
    private boolean m13563R0(AdvancedSettings advancedSettings) {
        return NullChecker.a(advancedSettings) && TEnum.equals(this.f9752c.verification.studies.status, "verified") && NullChecker.a(advancedSettings.student) && !advancedSettings.student.equals(this.f9759j.student);
    }

    /* JADX INFO: renamed from: U0 */
    private void m13564U0() {
        duringCreated(CoreModule.f1534c.f3628e0.m21486o9()).map(new w9j() { // from class: l.jn20
            public final Object call(Object obj) {
                return ((User) obj).getLatitudeAndLongitude();
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.ln20
            public final void call(Object obj) {
                this.f16526a.m13566X0((DoublePair) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3628e0.m21486o9().filter(new w9j() { // from class: l.mn20
            public final Object call(Object obj) {
                return Boolean.valueOf(DoublePair.new_().equals(((User) obj).getLatitudeAndLongitude()));
            }
        }).switchMap(new w9j() { // from class: l.nn20
            public final Object call(Object obj) {
                return qib0.f19778E.p().filter(new w9j() { // from class: l.pn20
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(CoreModule.m1850H().signedIn_());
                    }
                });
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.on20
            public final void call(Object obj) {
                this.f18289a.m13568a1((Location) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m13565W0(d90 d90Var) {
        da0.m13862a().m13865d(d90Var.b());
        ((mo20) ((jq2) this).viewModel).m19464P(TextUtils.isEmpty(d90Var.b()) ? act().string(R.string.l3) : d90Var.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m13566X0(DoublePair doublePair) {
        boolean zEquals = DoublePair.new_().equals(doublePair);
        s7m s7mVar = ((jq2) this).viewModel;
        if (zEquals) {
            ((mo20) s7mVar).m19467p(act().string(R.string.m3), TextUtils.isEmpty(da0.m13862a().m13864b()) ? act().string(R.string.l3) : da0.m13862a().m13864b());
        } else {
            ((mo20) s7mVar).m19467p(act().string(R.string.n3), TextUtils.isEmpty(da0.m13862a().m13864b()) ? act().string(R.string.l3) : da0.m13862a().m13864b());
            this.f9753d.e(this.f9750a, doublePair.first, doublePair.second, new e30() { // from class: l.qn20
                public final void call(Object obj) {
                    this.f19921a.m13565W0((d90) obj);
                }
            }, new e30() { // from class: l.rn20
                public final void call(Object obj) {
                    App.d.k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ void m13567Y0(d90 d90Var) {
        da0.m13862a().m13865d(d90Var.b());
        ((mo20) ((jq2) this).viewModel).m19464P(TextUtils.isEmpty(d90Var.b()) ? act().string(R.string.l3) : d90Var.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public /* synthetic */ void m13568a1(Location location) {
        DoublePair doublePairNew_ = DoublePair.new_();
        doublePairNew_.first = location.u();
        doublePairNew_.second = location.x();
        if (DoublePair.new_().equals(CoreModule.f1534c.f3628e0.m21490p9().getLatitudeAndLongitude())) {
            this.f9753d.e(this.f9750a, doublePairNew_.first, doublePairNew_.second, new e30() { // from class: l.sn20
                public final void call(Object obj) {
                    this.f21434a.m13567Y0((d90) obj);
                }
            }, new e30() { // from class: l.tn20
                public final void call(Object obj) {
                    App.d.k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public /* synthetic */ void m13569b1(List list) {
        ((mo20) ((jq2) this).viewModel).m19457I(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public /* synthetic */ void m13570c1(User user) {
        this.f9751b = user;
        Settings settings = this.f9752c;
        if (settings == null) {
            Settings settingsClone = user.settings.clone();
            this.f9752c = settingsClone;
            ((mo20) ((jq2) this).viewModel).m19474y(settingsClone);
            if (CoreModule.m1854P().m11711g().m7021xj()) {
                this.f9758i.m28112u(this.f9752c);
            }
            m13564U0();
        } else {
            Settings settings2 = user.settings;
            settings.birthdate = settings2.birthdate;
            settings.phoneNumber = settings2.phoneNumber;
            settings.getSettingGroup().privacy.hideContacts = user.settings.hideContacts();
            this.f9752c.getSettingGroup().privacy.hideMutualContacts = user.settings.hideMutualContacts();
            this.f9752c.getSettingGroup().push.previewMessage = user.settings.previewPushMessage();
            this.f9752c.getSettingGroup().push.showMomentLikes = user.settings.showMomentLikes();
            this.f9752c.getSettingGroup().privacy.hideSchool = user.settings.hideSchoolNameNoDefaults();
            this.f9752c.getSettingGroup().search.priorities = new ArrayList();
            ((SettingGroups) this.f9752c.settingGroups.get(0)).search.priorities.addAll(user.settings.getSearchPriority());
        }
        this.f9755f.m27215C0(this.f9752c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public /* synthetic */ void m13571d1(AdvancedSettings advancedSettings) {
        if (NullChecker.a(advancedSettings)) {
            this.f9759j = advancedSettings;
            AdvancedSettings advancedSettingsClone = advancedSettings.clone();
            this.f9760k = advancedSettingsClone;
            ((mo20) ((jq2) this).viewModel).m19473x(advancedSettingsClone);
            this.f9755f.m27220r0(this.f9760k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public /* synthetic */ void m13573e1(Integer num) {
        if (!this.f9754e) {
            Settings settings = this.f9752c;
            if (settings == null) {
                return;
            } else {
                ((mo20) ((jq2) this).viewModel).m19475z(settings);
            }
        }
        this.f9754e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public /* synthetic */ void m13575f1() {
        yki0.b().d();
        String strC = yki0.b().c();
        OMSThemeInfo oMSThemeInfoA = yki0.b().a();
        if (!NullChecker.a(oMSThemeInfoA) || TextUtils.isEmpty(strC)) {
            return;
        }
        act().startActivity(CoreModule.f1546o.m25559d().m5820md(this.f9750a, null, strC, true, false, false));
        zvf0.D("e_switch_h5", "p_suggest_users_home_view", new j760[]{vwb.Y("answer_complete_ornot", oMSThemeInfoA.questionnaireFinished ? "yes" : "no")});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public /* synthetic */ c m13577g1(AdvancedSettings advancedSettings, roj0 roj0Var) {
        if (NullChecker.a(advancedSettings)) {
            if (CoreModule.f1534c.f3628e0.m21490p9().isVIP() || xma.m27405y3()) {
                return CoreModule.f1534c.f3553F0.m12315o3(advancedSettings, true);
            }
            if (m13563R0(advancedSettings) || m13562Q0(advancedSettings)) {
                m13560J0(advancedSettings);
                return CoreModule.f1534c.f3553F0.m12315o3(advancedSettings, true);
            }
        }
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: i1 */
    private boolean m13580i1(AdvancedSettings advancedSettings) {
        if (advancedSettings == null || CoreModule.f1534c.f3628e0.m21490p9().isPicVerificationVerified() || !NullChecker.a(advancedSettings.realFace) || advancedSettings.realFace.equals(this.f9759j.realFace)) {
            return false;
        }
        advancedSettings.realFace = this.f9759j.realFace;
        return true;
    }

    /* JADX INFO: renamed from: j1 */
    private boolean m13582j1(AdvancedSettings advancedSettings) {
        if (advancedSettings == null || TEnum.equals(this.f9752c.verification.studies.status, "verified") || !NullChecker.a(advancedSettings.student) || advancedSettings.student.equals(this.f9759j.student)) {
            return false;
        }
        advancedSettings.student = this.f9759j.student;
        return true;
    }

    /* JADX INFO: renamed from: o1 */
    private boolean m13588o1() {
        if (NullChecker.a(yki0.b().a()) && ((mo20) ((jq2) this).viewModel).m19472w() != ((Boolean) CoreModule.f1534c.f3691z0.f13754V.get()).booleanValue()) {
            OMSThemeInfo oMSThemeInfoA = yki0.b().a();
            boolean zM19472w = ((mo20) ((jq2) this).viewModel).m19472w();
            if (oMSThemeInfoA.questionnaireFinished) {
                CoreModule.f1534c.f3691z0.f13754V.put(Boolean.valueOf(zM19472w));
                yki0.b().l(zM19472w);
                return true;
            }
            if (zM19472w) {
                this.f9763n = true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m13589p0(NetworkInfo networkInfo) {
        CoreModule.f1534c.f3553F0.m12317q3();
        CoreModule.f1534c.f3544C0.m27420u4();
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m13594u0(Throwable th) {
        CoreModule.f1534c.f3652m0.m3095z5(false);
        yij0.D(th);
    }

    /* JADX INFO: renamed from: L0 */
    public AdvancedSettings m13598L0() {
        AdvancedSettings advancedSettings = this.f9760k;
        if (advancedSettings == null || this.f9759j == null) {
            return null;
        }
        ((mo20) ((jq2) this).viewModel).m19459K(advancedSettings);
        this.f9756g.m15347z(this.f9760k);
        return this.f9760k.subtract(this.f9759j);
    }

    /* JADX INFO: renamed from: N0 */
    public SettingGroups m13599N0() {
        if (!NullChecker.a(this.f9751b) || !NullChecker.a(this.f9752c) || !CoreModule.m1850H().signedIn_()) {
            return null;
        }
        SettingGroups settingGroups = new SettingGroups();
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        settingGroups.search = userSearchSettings;
        userSearchSettings.lookingForGender = this.f9752c.getLookingFor();
        settingGroups.search.ageAllowedMinimum = this.f9752c.getSearchAgeAllowedMinimum();
        settingGroups.search.ageAllowedMaximum = this.f9752c.getSearchAgeAllowedMaximum();
        settingGroups.search.minAge = this.f9752c.getSearchMinAge();
        settingGroups.search.maxAge = this.f9752c.getSearchMaxAge();
        settingGroups.search.radius = this.f9752c.getSearchRadius();
        settingGroups.search.radiusAllowedMinimum = this.f9752c.getRadiusAllowedMinimum();
        settingGroups.search.radiusAllowedMaximum = this.f9752c.getRadiusAllowedMaximum();
        settingGroups.search.priorities = this.f9752c.getSearchPriority();
        settingGroups.search.autoAdjustRadius = this.f9752c.autoAdjustSuggestRadius();
        if (CoreModule.m1854P().m11706a().m5343Sk()) {
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            settingGroups.privacy = userPrivacySettings;
            userPrivacySettings.hideContacts = this.f9752c.hideContacts();
        }
        return settingGroups.subtract(this.f9751b.settings.getSettingGroup());
    }

    /* JADX INFO: renamed from: O0 */
    public String m13600O0() {
        return this.f9761l;
    }

    /* JADX INFO: renamed from: S0 */
    public void m13601S0() {
        this.f9753d = mjj.c(this.f9750a, false);
        u640 u640Var = new u640(this.f9750a);
        this.f9757h = u640Var;
        C0322a c0322a = new C0322a(this.f9750a);
        this.f9758i = c0322a;
        u640Var.C(c0322a);
        this.f9758i.m28103i1(this.f9757h);
        this.f9758i.mo16747v(((mo20) ((jq2) this).viewModel).m19471v());
        this.f9758i.m28097E("p_advanced_filter_page");
        xe20 xe20Var = new xe20(this.f9750a);
        this.f9755f = xe20Var;
        bb40 bb40Var = new bb40(this.f9750a);
        this.f9756g = bb40Var;
        xe20Var.C(bb40Var);
        this.f9756g.m15334i1(this.f9755f);
        this.f9756g.m15341s(((mo20) ((jq2) this).viewModel).m19470u());
        this.f9756g.m15330F("p_advanced_filter_page");
        ((mo20) ((jq2) this).viewModel).m19460L(this.f9758i.f6036n);
        CoreModule.f1534c.f3553F0.m12317q3();
        CoreModule.f1534c.f3544C0.m27420u4();
    }

    /* JADX INFO: renamed from: V0 */
    public void m13602V0() {
        m13601S0();
        duringCreated(CoreModule.f1534c.f3652m0.m3048j9().switchMap(new w9j() { // from class: l.bo20
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3628e0.m21486o9();
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.an20
            public final void call(Object obj) {
                this.f8402a.m13570c1((User) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3553F0.m12319s3().switchMap(new w9j() { // from class: l.bn20
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3553F0.m12308h3();
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.cn20
            public final void call(Object obj) {
                this.f9739a.m13571d1((AdvancedSettings) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m()).skip(1).distinctUntilChanged().filter(new w9j() { // from class: l.dn20
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.en20
            public final void call(Object obj) {
                co20.m13589p0((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3628e0.m21486o9().map(new w9j() { // from class: l.fn20
            public final Object call(Object obj) {
                return ((User) obj).age;
            }
        }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.gn20
            public final void call(Object obj) {
                this.f13402a.m13573e1((Integer) obj);
            }
        }));
        if (lqa.f()) {
            duringCreated(CoreModule.f1534c.f3628e0.m21486o9()).map(new w9j() { // from class: l.hn20
                public final Object call(Object obj) {
                    return ((User) obj).profile.extensions.basic.ideal;
                }
            }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.in20
                public final void call(Object obj) {
                    this.f14570a.m13569b1((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m13603h1() {
        return CoreModule.f1534c.f3628e0.m21490p9().isVIP();
    }

    /* JADX INFO: renamed from: k1 */
    public void m13604k1() {
        m13605l1();
        zvf0.r("e_advanced_filter_save", "p_advanced_filter_page");
        if (CoreModule.f1546o.m25559d().m5686Rq(this.f9750a) && this.f9763n) {
            e51.H(this.f9750a, new Runnable() { // from class: l.zm20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28821a.m13575f1();
                }
            }, 500L);
        }
        d30 d30Var = this.f9762m;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX INFO: renamed from: l1 */
    public void m13605l1() {
        boolean z;
        boolean z2 = true;
        if (!lqa.f()) {
            z = false;
        } else if (vwb.J(((mo20) ((jq2) this).viewModel).f17135f.getOriginIdealTag())) {
            if (pj90.s(CoreModule.f1534c.f3628e0.m21490p9())) {
                CoreModule.f1534c.f3652m0.m3027e8();
                z = true;
            } else {
                z = false;
            }
        } else if (pj90.s(CoreModule.f1534c.f3628e0.m21490p9()) && vwb.l(((mo20) ((jq2) this).viewModel).f17135f.getOriginIdealTag(), CoreModule.f1534c.f3628e0.m21490p9().profile.extensions.basic.ideal, new kn20())) {
            z = false;
        } else {
            z = true;
        }
        if (NullChecker.a(this.f9751b) && NullChecker.a(this.f9752c) && CoreModule.m1850H().signedIn_()) {
            SettingGroups settingGroupsM13599N0 = m13599N0();
            if (NullChecker.a(settingGroupsM13599N0) || m13588o1()) {
                final AdvancedSettings advancedSettingsM13598L0 = m13598L0();
                if ((!CoreModule.f1534c.f3628e0.m21490p9().isVIP() || advancedSettingsM13598L0 == null) && ((!xma.m27405y3() || advancedSettingsM13598L0 == null) && !m13563R0(advancedSettingsM13598L0) && !m13562Q0(advancedSettingsM13598L0))) {
                    z2 = false;
                }
                CoreModule.f1534c.f3652m0.m3054l8(settingGroupsM13599N0, z2).switchMap(new w9j() { // from class: l.un20
                    public final Object call(Object obj) {
                        return this.f23662a.m13577g1(advancedSettingsM13598L0, (roj0) obj);
                    }
                }).subscribe(mkd0.H(new e30() { // from class: l.vn20
                    public final void call(Object obj) {
                        b9l.a("settings");
                    }
                }, new e30() { // from class: l.wn20
                    public final void call(Object obj) {
                        co20.m13555E0((Throwable) obj);
                    }
                }));
                return;
            }
            AdvancedSettings advancedSettingsM13598L1 = m13598L0();
            if (!NullChecker.a(advancedSettingsM13598L1)) {
                if (z) {
                    CoreModule.f1534c.f3652m0.m2949L5();
                }
            } else if (!xma.m27379e4() || xma.m27405y3()) {
                CoreModule.f1534c.f3553F0.m12315o3(advancedSettingsM13598L1, false).subscribe(mkd0.H(new e30() { // from class: l.xn20
                    public final void call(Object obj) {
                        b9l.a("settings");
                    }
                }, new e30() { // from class: l.yn20
                    public final void call(Object obj) {
                        co20.m13556F0((Throwable) obj);
                    }
                }));
            } else if (m13563R0(advancedSettingsM13598L1) || m13562Q0(advancedSettingsM13598L1)) {
                m13560J0(advancedSettingsM13598L1);
                CoreModule.f1534c.f3553F0.m12315o3(advancedSettingsM13598L1, false).subscribe(mkd0.H(new e30() { // from class: l.zn20
                    public final void call(Object obj) {
                        b9l.a("settings");
                    }
                }, new e30() { // from class: l.ao20
                    public final void call(Object obj) {
                        co20.m13594u0((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m13606m1(d30 d30Var) {
        this.f9762m = d30Var;
    }

    /* JADX INFO: renamed from: n1 */
    public void m13607n1(String str) {
        this.f9761l = str;
    }

    public void destroy() {
    }
}
