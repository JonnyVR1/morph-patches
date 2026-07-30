package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AdvancedSettings;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.C8886a;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.OMSThemeInfo;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserPrivacySettings;
import com.p046p1.mobile.putong.data.UserSearchSettings;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class co20 extends jq2<mo20> {

    /* JADX INFO: renamed from: a */
    public Act f81732a;

    /* JADX INFO: renamed from: b */
    public User f81733b;

    /* JADX INFO: renamed from: c */
    public Settings f81734c;

    /* JADX INFO: renamed from: d */
    public mjj f81735d;

    /* JADX INFO: renamed from: e */
    public boolean f81736e;

    /* JADX INFO: renamed from: f */
    public xe20 f81737f;

    /* JADX INFO: renamed from: g */
    public bb40 f81738g;

    /* JADX INFO: renamed from: h */
    public u640 f81739h;

    /* JADX INFO: renamed from: i */
    public C8886a f81740i;

    /* JADX INFO: renamed from: j */
    public AdvancedSettings f81741j;

    /* JADX INFO: renamed from: k */
    public AdvancedSettings f81742k;

    /* JADX INFO: renamed from: l */
    public String f81743l;

    /* JADX INFO: renamed from: m */
    public d30 f81744m;

    /* JADX INFO: renamed from: n */
    public boolean f81745n;

    public co20(Act act, mcr mcrVar) {
        super(mcrVar);
        this.f81736e = true;
        this.f81743l = "user_click";
        this.f81732a = act;
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m107876E0(Throwable th) {
        CoreModule.f17545c.f19663m0.m31165z5(false);
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m107877F0(Throwable th) {
        CoreModule.f17545c.f19663m0.m31165z5(false);
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: J0 */
    private void m107881J0(AdvancedSettings advancedSettings) {
        m107901i1(advancedSettings);
        m107903j1(advancedSettings);
        m107882P0(advancedSettings);
    }

    /* JADX INFO: renamed from: P0 */
    private boolean m107882P0(AdvancedSettings advancedSettings) {
        boolean z = false;
        if (NullChecker.m81303a(advancedSettings)) {
            if (NullChecker.m81303a(advancedSettings.popular)) {
                advancedSettings.popular = this.f81741j.popular;
                z = true;
            }
            if (NullChecker.m81303a(advancedSettings.online)) {
                advancedSettings.online = this.f81741j.online;
                z = true;
            }
            if (NullChecker.m81303a(advancedSettings.newUser)) {
                advancedSettings.newUser = this.f81741j.newUser;
                z = true;
            }
            if (NullChecker.m81303a(advancedSettings.zodiacs)) {
                advancedSettings.zodiacs = this.f81741j.zodiacs;
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: Q0 */
    private boolean m107883Q0(AdvancedSettings advancedSettings) {
        return NullChecker.m81303a(advancedSettings) && CoreModule.f17545c.f19639e0.m169527p9().isPicVerificationVerified() && NullChecker.m81303a(advancedSettings.realFace) && !advancedSettings.realFace.equals(this.f81741j.realFace);
    }

    /* JADX INFO: renamed from: R0 */
    private boolean m107884R0(AdvancedSettings advancedSettings) {
        return NullChecker.m81303a(advancedSettings) && TEnum.equals(this.f81734c.verification.studies.status, "verified") && NullChecker.m81303a(advancedSettings.student) && !advancedSettings.student.equals(this.f81741j.student);
    }

    /* JADX INFO: renamed from: U0 */
    private void m107885U0() {
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).map(new w9j() { // from class: l.jn20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).getLatitudeAndLongitude();
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.ln20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128956a.m107887X0((DoublePair) obj);
            }
        }));
        duringCreated((C22306c) CoreModule.f17545c.f19639e0.m169523o9().filter(new w9j() { // from class: l.mn20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(DoublePair.new_().equals(((User) obj).getLatitudeAndLongitude()));
            }
        }).switchMap(new w9j() { // from class: l.nn20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qib0.f154687E.m78864p().filter(new w9j() { // from class: l.pn20
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(CoreModule.m29931H().signedIn_());
                    }
                });
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.on20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144739a.m107889a1((Location) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m107886W0(d90 d90Var) {
        da0.m110520a().m110523d(d90Var.mo110405b());
        ((mo20) this.viewModel).m155610P(TextUtils.isEmpty(d90Var.mo110405b()) ? act().string(R$string.f27885l3) : d90Var.mo110405b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m107887X0(DoublePair doublePair) {
        boolean zEquals = DoublePair.new_().equals(doublePair);
        V v2 = this.viewModel;
        if (zEquals) {
            ((mo20) v2).m155612p(act().string(R$string.f27891m3), TextUtils.isEmpty(da0.m110520a().m110522b()) ? act().string(R$string.f27885l3) : da0.m110520a().m110522b());
        } else {
            ((mo20) v2).m155612p(act().string(R$string.f27897n3), TextUtils.isEmpty(da0.m110520a().m110522b()) ? act().string(R$string.f27885l3) : da0.m110520a().m110522b());
            this.f81735d.m154844e(this.f81732a, doublePair.first, doublePair.second, new e30() { // from class: l.qn20
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f155376a.m107886W0((d90) obj);
                }
            }, new e30() { // from class: l.rn20
                @Override // p149l.e30
                public final void call(Object obj) {
                    App.f15368d.m20433k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ void m107888Y0(d90 d90Var) {
        da0.m110520a().m110523d(d90Var.mo110405b());
        ((mo20) this.viewModel).m155610P(TextUtils.isEmpty(d90Var.mo110405b()) ? act().string(R$string.f27885l3) : d90Var.mo110405b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public /* synthetic */ void m107889a1(Location location) {
        DoublePair doublePairNew_ = DoublePair.new_();
        doublePairNew_.first = location.m78831u();
        doublePairNew_.second = location.m78833x();
        if (DoublePair.new_().equals(CoreModule.f17545c.f19639e0.m169527p9().getLatitudeAndLongitude())) {
            this.f81735d.m154844e(this.f81732a, doublePairNew_.first, doublePairNew_.second, new e30() { // from class: l.sn20
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f165407a.m107888Y0((d90) obj);
                }
            }, new e30() { // from class: l.tn20
                @Override // p149l.e30
                public final void call(Object obj) {
                    App.f15368d.m20433k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public /* synthetic */ void m107890b1(List list) {
        ((mo20) this.viewModel).m155603I(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public /* synthetic */ void m107891c1(User user) {
        this.f81733b = user;
        Settings settings = this.f81734c;
        if (settings == null) {
            Settings settingsMo223809clone = user.settings.mo223809clone();
            this.f81734c = settingsMo223809clone;
            ((mo20) this.viewModel).m155619y(settingsMo223809clone);
            if (CoreModule.m29935P().m94656g().mo35084xj()) {
                this.f81740i.m213089u(this.f81734c);
            }
            m107885U0();
        } else {
            Settings settings2 = user.settings;
            settings.birthdate = settings2.birthdate;
            settings.phoneNumber = settings2.phoneNumber;
            settings.getSettingGroup().privacy.hideContacts = user.settings.hideContacts();
            this.f81734c.getSettingGroup().privacy.hideMutualContacts = user.settings.hideMutualContacts();
            this.f81734c.getSettingGroup().push.previewMessage = user.settings.previewPushMessage();
            this.f81734c.getSettingGroup().push.showMomentLikes = user.settings.showMomentLikes();
            this.f81734c.getSettingGroup().privacy.hideSchool = user.settings.hideSchoolNameNoDefaults();
            this.f81734c.getSettingGroup().search.priorities = new ArrayList();
            this.f81734c.settingGroups.get(0).search.priorities.addAll(user.settings.getSearchPriority());
        }
        this.f81737f.m208494C0(this.f81734c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public /* synthetic */ void m107892d1(AdvancedSettings advancedSettings) {
        if (NullChecker.m81303a(advancedSettings)) {
            this.f81741j = advancedSettings;
            AdvancedSettings advancedSettingsMo223809clone = advancedSettings.mo223809clone();
            this.f81742k = advancedSettingsMo223809clone;
            ((mo20) this.viewModel).m155618x(advancedSettingsMo223809clone);
            this.f81737f.m208499r0(this.f81742k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public /* synthetic */ void m107894e1(Integer num) {
        if (!this.f81736e) {
            Settings settings = this.f81734c;
            if (settings == null) {
                return;
            } else {
                ((mo20) this.viewModel).m155620z(settings);
            }
        }
        this.f81736e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public /* synthetic */ void m107896f1() {
        yki0.m215127b().m215132d();
        String strM215131c = yki0.m215127b().m215131c();
        OMSThemeInfo oMSThemeInfoM215130a = yki0.m215127b().m215130a();
        if (!NullChecker.m81303a(oMSThemeInfoM215130a) || TextUtils.isEmpty(strM215131c)) {
            return;
        }
        act().startActivity(CoreModule.f17557o.m195057d().mo33883md(this.f81732a, null, strM215131c, true, false, false));
        zvf0.m220371D("e_switch_h5", "p_suggest_users_home_view", vwb.m200311Y("answer_complete_ornot", oMSThemeInfoM215130a.questionnaireFinished ? "yes" : "no"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public /* synthetic */ C22306c m107898g1(AdvancedSettings advancedSettings, roj0 roj0Var) {
        if (NullChecker.m81303a(advancedSettings)) {
            if (CoreModule.f17545c.f19639e0.m169527p9().isVIP() || xma.m210097y3()) {
                return CoreModule.f17545c.f19564F0.m99248o3(advancedSettings, true);
            }
            if (m107884R0(advancedSettings) || m107883Q0(advancedSettings)) {
                m107881J0(advancedSettings);
                return CoreModule.f17545c.f19564F0.m99248o3(advancedSettings, true);
            }
        }
        return C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: i1 */
    private boolean m107901i1(AdvancedSettings advancedSettings) {
        if (advancedSettings == null || CoreModule.f17545c.f19639e0.m169527p9().isPicVerificationVerified() || !NullChecker.m81303a(advancedSettings.realFace) || advancedSettings.realFace.equals(this.f81741j.realFace)) {
            return false;
        }
        advancedSettings.realFace = this.f81741j.realFace;
        return true;
    }

    /* JADX INFO: renamed from: j1 */
    private boolean m107903j1(AdvancedSettings advancedSettings) {
        if (advancedSettings == null || TEnum.equals(this.f81734c.verification.studies.status, "verified") || !NullChecker.m81303a(advancedSettings.student) || advancedSettings.student.equals(this.f81741j.student)) {
            return false;
        }
        advancedSettings.student = this.f81741j.student;
        return true;
    }

    /* JADX INFO: renamed from: o1 */
    private boolean m107909o1() {
        if (NullChecker.m81303a(yki0.m215127b().m215130a()) && ((mo20) this.viewModel).m155617w() != CoreModule.f17545c.f19702z0.f106529V.get().booleanValue()) {
            OMSThemeInfo oMSThemeInfoM215130a = yki0.m215127b().m215130a();
            boolean zM155617w = ((mo20) this.viewModel).m155617w();
            if (oMSThemeInfoM215130a.questionnaireFinished) {
                CoreModule.f17545c.f19702z0.f106529V.put(Boolean.valueOf(zM155617w));
                yki0.m215127b().m215139l(zM155617w);
                return true;
            }
            if (zM155617w) {
                this.f81745n = true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m107910p0(NetworkInfo networkInfo) {
        CoreModule.f17545c.f19564F0.m99250q3();
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m107915u0(Throwable th) {
        CoreModule.f17545c.f19663m0.m31165z5(false);
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: L0 */
    public AdvancedSettings m107919L0() {
        AdvancedSettings advancedSettings = this.f81742k;
        if (advancedSettings == null || this.f81741j == null) {
            return null;
        }
        ((mo20) this.viewModel).m155605K(advancedSettings);
        this.f81738g.m121099z(this.f81742k);
        return this.f81742k.subtract(this.f81741j);
    }

    /* JADX INFO: renamed from: N0 */
    public SettingGroups m107920N0() {
        if (!NullChecker.m81303a(this.f81733b) || !NullChecker.m81303a(this.f81734c) || !CoreModule.m29931H().signedIn_()) {
            return null;
        }
        SettingGroups settingGroups = new SettingGroups();
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        settingGroups.search = userSearchSettings;
        userSearchSettings.lookingForGender = this.f81734c.getLookingFor();
        settingGroups.search.ageAllowedMinimum = this.f81734c.getSearchAgeAllowedMinimum();
        settingGroups.search.ageAllowedMaximum = this.f81734c.getSearchAgeAllowedMaximum();
        settingGroups.search.minAge = this.f81734c.getSearchMinAge();
        settingGroups.search.maxAge = this.f81734c.getSearchMaxAge();
        settingGroups.search.radius = this.f81734c.getSearchRadius();
        settingGroups.search.radiusAllowedMinimum = this.f81734c.getRadiusAllowedMinimum();
        settingGroups.search.radiusAllowedMaximum = this.f81734c.getRadiusAllowedMaximum();
        settingGroups.search.priorities = this.f81734c.getSearchPriority();
        settingGroups.search.autoAdjustRadius = this.f81734c.autoAdjustSuggestRadius();
        if (CoreModule.m29935P().m94651a().mo33406Sk()) {
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            settingGroups.privacy = userPrivacySettings;
            userPrivacySettings.hideContacts = this.f81734c.hideContacts();
        }
        return settingGroups.subtract(this.f81733b.settings.getSettingGroup());
    }

    /* JADX INFO: renamed from: O0 */
    public String m107921O0() {
        return this.f81743l;
    }

    /* JADX INFO: renamed from: S0 */
    public void m107922S0() {
        this.f81735d = mjj.m154842c(this.f81732a, false);
        u640 u640Var = new u640(this.f81732a);
        this.f81739h = u640Var;
        C8886a c8886a = new C8886a(this.f81732a);
        this.f81740i = c8886a;
        u640Var.mo51532C(c8886a);
        this.f81740i.mo21065i1(this.f81739h);
        this.f81740i.mo137127v(((mo20) this.viewModel).m155616v());
        this.f81740i.m213075E("p_advanced_filter_page");
        xe20 xe20Var = new xe20(this.f81732a);
        this.f81737f = xe20Var;
        bb40 bb40Var = new bb40(this.f81732a);
        this.f81738g = bb40Var;
        xe20Var.mo51532C(bb40Var);
        this.f81738g.mo21065i1(this.f81737f);
        this.f81738g.m121093s(((mo20) this.viewModel).m155615u());
        this.f81738g.m121083F("p_advanced_filter_page");
        ((mo20) this.viewModel).m155606L(this.f81740i.f36255n);
        CoreModule.f17545c.f19564F0.m99250q3();
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    /* JADX INFO: renamed from: V0 */
    public void m107923V0() {
        m107922S0();
        duringCreated((C22306c) CoreModule.f17545c.f19663m0.m31118j9().switchMap(new w9j() { // from class: l.bo20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19639e0.m169523o9();
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.an20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70701a.m107891c1((User) obj);
            }
        }));
        duringCreated((C22306c) CoreModule.f17545c.f19564F0.m99252s3().switchMap(new w9j() { // from class: l.bn20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19564F0.m99241h3();
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.cn20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81639a.m107892d1((AdvancedSettings) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).distinctUntilChanged().filter(new w9j() { // from class: l.dn20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.en20
            @Override // p149l.e30
            public final void call(Object obj) {
                co20.m107910p0((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9().map(new w9j() { // from class: l.fn20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).age;
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.gn20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103570a.m107894e1((Integer) obj);
            }
        }));
        if (lqa.m150968f()) {
            duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).map(new w9j() { // from class: l.hn20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((User) obj).profile.extensions.basic.ideal;
                }
            }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.in20
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f113988a.m107890b1((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m107924h1() {
        return CoreModule.f17545c.f19639e0.m169527p9().isVIP();
    }

    /* JADX INFO: renamed from: k1 */
    public void m107925k1() {
        m107926l1();
        zvf0.m220396r("e_advanced_filter_save", "p_advanced_filter_page");
        if (CoreModule.f17557o.m195057d().mo33749Rq(this.f81732a) && this.f81745n) {
            e51.m114743H(this.f81732a, new Runnable() { // from class: l.zm20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f203689a.m107896f1();
                }
            }, 500L);
        }
        d30 d30Var = this.f81744m;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX INFO: renamed from: l1 */
    public void m107926l1() {
        boolean z;
        boolean z2 = true;
        if (!lqa.m150968f()) {
            z = false;
        } else if (vwb.m200296J(((mo20) this.viewModel).f134828f.getOriginIdealTag())) {
            if (pj90.m169806s(CoreModule.f17545c.f19639e0.m169527p9())) {
                CoreModule.f17545c.f19663m0.m31097e8();
                z = true;
            } else {
                z = false;
            }
        } else if (pj90.m169806s(CoreModule.f17545c.f19639e0.m169527p9()) && vwb.m200335l(((mo20) this.viewModel).f134828f.getOriginIdealTag(), CoreModule.f17545c.f19639e0.m169527p9().profile.extensions.basic.ideal, new kn20())) {
            z = false;
        } else {
            z = true;
        }
        if (NullChecker.m81303a(this.f81733b) && NullChecker.m81303a(this.f81734c) && CoreModule.m29931H().signedIn_()) {
            SettingGroups settingGroupsM107920N0 = m107920N0();
            if (NullChecker.m81303a(settingGroupsM107920N0) || m107909o1()) {
                final AdvancedSettings advancedSettingsM107919L0 = m107919L0();
                if ((!CoreModule.f17545c.f19639e0.m169527p9().isVIP() || advancedSettingsM107919L0 == null) && ((!xma.m210097y3() || advancedSettingsM107919L0 == null) && !m107884R0(advancedSettingsM107919L0) && !m107883Q0(advancedSettingsM107919L0))) {
                    z2 = false;
                }
                CoreModule.f17545c.f19663m0.m31124l8(settingGroupsM107920N0, z2).switchMap(new w9j() { // from class: l.un20
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f177331a.m107898g1(advancedSettingsM107919L0, (roj0) obj);
                    }
                }).subscribe(mkd0.m154956H(new e30() { // from class: l.vn20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        b9l.m100816a(Settings.TYPE);
                    }
                }, new e30() { // from class: l.wn20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        co20.m107876E0((Throwable) obj);
                    }
                }));
                return;
            }
            AdvancedSettings advancedSettingsM107919L1 = m107919L0();
            if (!NullChecker.m81303a(advancedSettingsM107919L1)) {
                if (z) {
                    CoreModule.f17545c.f19663m0.m31019L5();
                }
            } else if (!xma.m210071e4() || xma.m210097y3()) {
                CoreModule.f17545c.f19564F0.m99248o3(advancedSettingsM107919L1, false).subscribe(mkd0.m154956H(new e30() { // from class: l.xn20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        b9l.m100816a(Settings.TYPE);
                    }
                }, new e30() { // from class: l.yn20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        co20.m107877F0((Throwable) obj);
                    }
                }));
            } else if (m107884R0(advancedSettingsM107919L1) || m107883Q0(advancedSettingsM107919L1)) {
                m107881J0(advancedSettingsM107919L1);
                CoreModule.f17545c.f19564F0.m99248o3(advancedSettingsM107919L1, false).subscribe(mkd0.m154956H(new e30() { // from class: l.zn20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        b9l.m100816a(Settings.TYPE);
                    }
                }, new e30() { // from class: l.ao20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        co20.m107915u0((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m107927m1(d30 d30Var) {
        this.f81744m = d30Var;
    }

    /* JADX INFO: renamed from: n1 */
    public void m107928n1(String str) {
        this.f81743l = str;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
