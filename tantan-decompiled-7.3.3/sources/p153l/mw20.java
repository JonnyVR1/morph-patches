package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AdvancedSettings;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.C9049a;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.OMSThemeInfo;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserPrivacySettings;
import com.p051p1.mobile.putong.data.UserSearchSettings;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class mw20 extends ar2<ww20> {

    /* JADX INFO: renamed from: a */
    public Act f138995a;

    /* JADX INFO: renamed from: b */
    public User f138996b;

    /* JADX INFO: renamed from: c */
    public Settings f138997c;

    /* JADX INFO: renamed from: d */
    public fmj f138998d;

    /* JADX INFO: renamed from: e */
    public boolean f138999e;

    /* JADX INFO: renamed from: f */
    public hn20 f139000f;

    /* JADX INFO: renamed from: g */
    public pj40 f139001g;

    /* JADX INFO: renamed from: h */
    public if40 f139002h;

    /* JADX INFO: renamed from: i */
    public C9049a f139003i;

    /* JADX INFO: renamed from: j */
    public AdvancedSettings f139004j;

    /* JADX INFO: renamed from: k */
    public AdvancedSettings f139005k;

    /* JADX INFO: renamed from: l */
    public String f139006l;

    /* JADX INFO: renamed from: m */
    public x20 f139007m;

    /* JADX INFO: renamed from: n */
    public boolean f139008n;

    public mw20(Act act, ner nerVar) {
        super(nerVar);
        this.f138999e = true;
        this.f139006l = "user_click";
        this.f138995a = act;
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m160363E0(Throwable th) {
        CoreModule.f18264c.f20405m0.m32168z5(false);
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m160364F0(Throwable th) {
        CoreModule.f18264c.f20405m0.m32168z5(false);
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: J0 */
    private void m160368J0(AdvancedSettings advancedSettings) {
        m160388i1(advancedSettings);
        m160390j1(advancedSettings);
        m160369P0(advancedSettings);
    }

    /* JADX INFO: renamed from: P0 */
    private boolean m160369P0(AdvancedSettings advancedSettings) {
        boolean z = false;
        if (NullChecker.m82486a(advancedSettings)) {
            if (NullChecker.m82486a(advancedSettings.popular)) {
                advancedSettings.popular = this.f139004j.popular;
                z = true;
            }
            if (NullChecker.m82486a(advancedSettings.online)) {
                advancedSettings.online = this.f139004j.online;
                z = true;
            }
            if (NullChecker.m82486a(advancedSettings.newUser)) {
                advancedSettings.newUser = this.f139004j.newUser;
                z = true;
            }
            if (NullChecker.m82486a(advancedSettings.zodiacs)) {
                advancedSettings.zodiacs = this.f139004j.zodiacs;
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: Q0 */
    private boolean m160370Q0(AdvancedSettings advancedSettings) {
        return NullChecker.m82486a(advancedSettings) && CoreModule.f18264c.f20381e0.m116600p9().isPicVerificationVerified() && NullChecker.m82486a(advancedSettings.realFace) && !advancedSettings.realFace.equals(this.f139004j.realFace);
    }

    /* JADX INFO: renamed from: R0 */
    private boolean m160371R0(AdvancedSettings advancedSettings) {
        return NullChecker.m82486a(advancedSettings) && TEnum.equals(this.f138997c.verification.studies.status, "verified") && NullChecker.m82486a(advancedSettings.student) && !advancedSettings.student.equals(this.f139004j.student);
    }

    /* JADX INFO: renamed from: U0 */
    private void m160372U0() {
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).map(new qcj() { // from class: l.tv20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).getLatitudeAndLongitude();
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.vv20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185885a.m160374X0((DoublePair) obj);
            }
        }));
        duringCreated((C22421c) CoreModule.f18264c.f20381e0.m116596o9().filter(new qcj() { // from class: l.wv20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(DoublePair.new_().equals(((User) obj).getLatitudeAndLongitude()));
            }
        }).switchMap(new qcj() { // from class: l.xv20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uqb0.f180370E.m80047p().filter(new qcj() { // from class: l.zv20
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(CoreModule.m30929H().signedIn_());
                    }
                });
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.yv20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201675a.m160376a1((Location) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m160373W0(z80 z80Var) {
        z90.m219037a().m219040d(z80Var.mo143670b());
        ((ww20) this.viewModel).m208140P(TextUtils.isEmpty(z80Var.mo143670b()) ? act().string(R$string.f28733l3) : z80Var.mo143670b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m160374X0(DoublePair doublePair) {
        boolean zEquals = DoublePair.new_().equals(doublePair);
        V v2 = this.viewModel;
        if (zEquals) {
            ((ww20) v2).m208142p(act().string(R$string.f28739m3), TextUtils.isEmpty(z90.m219037a().m219039b()) ? act().string(R$string.f28733l3) : z90.m219037a().m219039b());
        } else {
            ((ww20) v2).m208142p(act().string(R$string.f28745n3), TextUtils.isEmpty(z90.m219037a().m219039b()) ? act().string(R$string.f28733l3) : z90.m219037a().m219039b());
            this.f138998d.m126239e(this.f138995a, doublePair.first, doublePair.second, new y20() { // from class: l.aw20
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f73683a.m160373W0((z80) obj);
                }
            }, new y20() { // from class: l.bw20
                @Override // p153l.y20
                public final void call(Object obj) {
                    App.f16087d.m21432k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ void m160375Y0(z80 z80Var) {
        z90.m219037a().m219040d(z80Var.mo143670b());
        ((ww20) this.viewModel).m208140P(TextUtils.isEmpty(z80Var.mo143670b()) ? act().string(R$string.f28733l3) : z80Var.mo143670b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public /* synthetic */ void m160376a1(Location location) {
        DoublePair doublePairNew_ = DoublePair.new_();
        doublePairNew_.first = location.m80014u();
        doublePairNew_.second = location.m80016x();
        if (DoublePair.new_().equals(CoreModule.f18264c.f20381e0.m116600p9().getLatitudeAndLongitude())) {
            this.f138998d.m126239e(this.f138995a, doublePairNew_.first, doublePairNew_.second, new y20() { // from class: l.cw20
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f84089a.m160375Y0((z80) obj);
                }
            }, new y20() { // from class: l.dw20
                @Override // p153l.y20
                public final void call(Object obj) {
                    App.f16087d.m21432k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public /* synthetic */ void m160377b1(List list) {
        ((ww20) this.viewModel).m208133I(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public /* synthetic */ void m160378c1(User user) {
        this.f138996b = user;
        Settings settings = this.f138997c;
        if (settings == null) {
            Settings settingsMo225055clone = user.settings.mo225055clone();
            this.f138997c = settingsMo225055clone;
            ((ww20) this.viewModel).m208149y(settingsMo225055clone);
            if (CoreModule.m30933P().m143410g().mo36087xj()) {
                this.f139003i.m158128u(this.f138997c);
            }
            m160372U0();
        } else {
            Settings settings2 = user.settings;
            settings.birthdate = settings2.birthdate;
            settings.phoneNumber = settings2.phoneNumber;
            settings.getSettingGroup().privacy.hideContacts = user.settings.hideContacts();
            this.f138997c.getSettingGroup().privacy.hideMutualContacts = user.settings.hideMutualContacts();
            this.f138997c.getSettingGroup().push.previewMessage = user.settings.previewPushMessage();
            this.f138997c.getSettingGroup().push.showMomentLikes = user.settings.showMomentLikes();
            this.f138997c.getSettingGroup().privacy.hideSchool = user.settings.hideSchoolNameNoDefaults();
            this.f138997c.getSettingGroup().search.priorities = new ArrayList();
            this.f138997c.settingGroups.get(0).search.priorities.addAll(user.settings.getSearchPriority());
        }
        this.f139000f.m136031C0(this.f138997c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public /* synthetic */ void m160379d1(AdvancedSettings advancedSettings) {
        if (NullChecker.m82486a(advancedSettings)) {
            this.f139004j = advancedSettings;
            AdvancedSettings advancedSettingsMo225055clone = advancedSettings.mo225055clone();
            this.f139005k = advancedSettingsMo225055clone;
            ((ww20) this.viewModel).m208148x(advancedSettingsMo225055clone);
            this.f139000f.m136036r0(this.f139005k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public /* synthetic */ void m160381e1(Integer num) {
        if (!this.f138999e) {
            Settings settings = this.f138997c;
            if (settings == null) {
                return;
            } else {
                ((ww20) this.viewModel).m208150z(settings);
            }
        }
        this.f138999e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public /* synthetic */ void m160383f1() {
        yti0.m217322b().m217327d();
        String strM217326c = yti0.m217322b().m217326c();
        OMSThemeInfo oMSThemeInfoM217325a = yti0.m217322b().m217325a();
        if (!NullChecker.m82486a(oMSThemeInfoM217325a) || TextUtils.isEmpty(strM217326c)) {
            return;
        }
        act().startActivity(CoreModule.f18276o.m132214d().mo34886md(this.f138995a, null, strM217326c, true, false, false));
        i4g0.m138495D("e_switch_h5", "p_suggest_users_home_view", jyb.m147494Y("answer_complete_ornot", oMSThemeInfoM217325a.questionnaireFinished ? "yes" : "no"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public /* synthetic */ C22421c m160385g1(AdvancedSettings advancedSettings, uxj0 uxj0Var) {
        if (NullChecker.m82486a(advancedSettings)) {
            if (CoreModule.f18264c.f20381e0.m116600p9().isVIP() || joa.m146412z3()) {
                return CoreModule.f18264c.f20306F0.m118452o3(advancedSettings, true);
            }
            if (m160371R0(advancedSettings) || m160370Q0(advancedSettings)) {
                m160368J0(advancedSettings);
                return CoreModule.f18264c.f20306F0.m118452o3(advancedSettings, true);
            }
        }
        return C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: i1 */
    private boolean m160388i1(AdvancedSettings advancedSettings) {
        if (advancedSettings == null || CoreModule.f18264c.f20381e0.m116600p9().isPicVerificationVerified() || !NullChecker.m82486a(advancedSettings.realFace) || advancedSettings.realFace.equals(this.f139004j.realFace)) {
            return false;
        }
        advancedSettings.realFace = this.f139004j.realFace;
        return true;
    }

    /* JADX INFO: renamed from: j1 */
    private boolean m160390j1(AdvancedSettings advancedSettings) {
        if (advancedSettings == null || TEnum.equals(this.f138997c.verification.studies.status, "verified") || !NullChecker.m82486a(advancedSettings.student) || advancedSettings.student.equals(this.f139004j.student)) {
            return false;
        }
        advancedSettings.student = this.f139004j.student;
        return true;
    }

    /* JADX INFO: renamed from: o1 */
    private boolean m160396o1() {
        if (NullChecker.m82486a(yti0.m217322b().m217325a()) && ((ww20) this.viewModel).m208147w() != CoreModule.f18264c.f20444z0.f178194V.get().booleanValue()) {
            OMSThemeInfo oMSThemeInfoM217325a = yti0.m217322b().m217325a();
            boolean zM208147w = ((ww20) this.viewModel).m208147w();
            if (oMSThemeInfoM217325a.questionnaireFinished) {
                CoreModule.f18264c.f20444z0.f178194V.put(Boolean.valueOf(zM208147w));
                yti0.m217322b().m217334l(zM208147w);
                return true;
            }
            if (zM208147w) {
                this.f139008n = true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m160397p0(NetworkInfo networkInfo) {
        CoreModule.f18264c.f20306F0.m118454q3();
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m160402u0(Throwable th) {
        CoreModule.f18264c.f20405m0.m32168z5(false);
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: L0 */
    public AdvancedSettings m160406L0() {
        AdvancedSettings advancedSettings = this.f139005k;
        if (advancedSettings == null || this.f139004j == null) {
            return null;
        }
        ((ww20) this.viewModel).m208135K(advancedSettings);
        this.f139001g.m173029z(this.f139005k);
        return this.f139005k.subtract(this.f139004j);
    }

    /* JADX INFO: renamed from: N0 */
    public SettingGroups m160407N0() {
        if (!NullChecker.m82486a(this.f138996b) || !NullChecker.m82486a(this.f138997c) || !CoreModule.m30929H().signedIn_()) {
            return null;
        }
        SettingGroups settingGroups = new SettingGroups();
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        settingGroups.search = userSearchSettings;
        userSearchSettings.lookingForGender = this.f138997c.getLookingFor();
        settingGroups.search.ageAllowedMinimum = this.f138997c.getSearchAgeAllowedMinimum();
        settingGroups.search.ageAllowedMaximum = this.f138997c.getSearchAgeAllowedMaximum();
        settingGroups.search.minAge = this.f138997c.getSearchMinAge();
        settingGroups.search.maxAge = this.f138997c.getSearchMaxAge();
        settingGroups.search.radius = this.f138997c.getSearchRadius();
        settingGroups.search.radiusAllowedMinimum = this.f138997c.getRadiusAllowedMinimum();
        settingGroups.search.radiusAllowedMaximum = this.f138997c.getRadiusAllowedMaximum();
        settingGroups.search.priorities = this.f138997c.getSearchPriority();
        settingGroups.search.autoAdjustRadius = this.f138997c.autoAdjustSuggestRadius();
        if (CoreModule.m30933P().m143405a().mo34409Sk()) {
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            settingGroups.privacy = userPrivacySettings;
            userPrivacySettings.hideContacts = this.f138997c.hideContacts();
        }
        return settingGroups.subtract(this.f138996b.settings.getSettingGroup());
    }

    /* JADX INFO: renamed from: O0 */
    public String m160408O0() {
        return this.f139006l;
    }

    /* JADX INFO: renamed from: S0 */
    public void m160409S0() {
        this.f138998d = fmj.m126236c(this.f138995a, false);
        if40 if40Var = new if40(this.f138995a);
        this.f139002h = if40Var;
        C9049a c9049a = new C9049a(this.f138995a);
        this.f139003i = c9049a;
        if40Var.mo52715C(c9049a);
        this.f139003i.mo22064i1(this.f139002h);
        this.f139003i.mo158129v(((ww20) this.viewModel).m208146v());
        this.f139003i.m158113E("p_advanced_filter_page");
        hn20 hn20Var = new hn20(this.f138995a);
        this.f139000f = hn20Var;
        pj40 pj40Var = new pj40(this.f138995a);
        this.f139001g = pj40Var;
        hn20Var.mo52715C(pj40Var);
        this.f139001g.mo22064i1(this.f139000f);
        this.f139001g.m173023s(((ww20) this.viewModel).m208145u());
        this.f139001g.m173013F("p_advanced_filter_page");
        ((ww20) this.viewModel).m208136L(this.f139003i.f37103n);
        CoreModule.f18264c.f20306F0.m118454q3();
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: renamed from: V0 */
    public void m160410V0() {
        m160409S0();
        duringCreated((C22421c) CoreModule.f18264c.f20405m0.m32121j9().switchMap(new qcj() { // from class: l.lw20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20381e0.m116596o9();
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.kv20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128940a.m160378c1((User) obj);
            }
        }));
        duringCreated((C22421c) CoreModule.f18264c.f20306F0.m118456s3().switchMap(new qcj() { // from class: l.lv20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20306F0.m118445h3();
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.mv20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138868a.m160379d1((AdvancedSettings) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).distinctUntilChanged().filter(new qcj() { // from class: l.nv20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ov20
            @Override // p153l.y20
            public final void call(Object obj) {
                mw20.m160397p0((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9().map(new qcj() { // from class: l.pv20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).age;
            }
        }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.qv20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159688a.m160381e1((Integer) obj);
            }
        }));
        if (xra.m212787f()) {
            duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).map(new qcj() { // from class: l.rv20
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((User) obj).profile.extensions.basic.ideal;
                }
            }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.sv20
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f170790a.m160377b1((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m160411h1() {
        return CoreModule.f18264c.f20381e0.m116600p9().isVIP();
    }

    /* JADX INFO: renamed from: k1 */
    public void m160412k1() {
        m160413l1();
        i4g0.m138520r("e_advanced_filter_save", "p_advanced_filter_page");
        if (CoreModule.f18276o.m132214d().mo34752Rq(this.f138995a) && this.f139008n) {
            l51.m152888H(this.f138995a, new Runnable() { // from class: l.jv20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f122762a.m160383f1();
                }
            }, 500L);
        }
        x20 x20Var = this.f139007m;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX INFO: renamed from: l1 */
    public void m160413l1() {
        boolean z;
        boolean z2 = true;
        if (!xra.m212787f()) {
            z = false;
        } else if (jyb.m147479J(((ww20) this.viewModel).f191138f.getOriginIdealTag())) {
            if (tr90.m192431s(CoreModule.f18264c.f20381e0.m116600p9())) {
                CoreModule.f18264c.f20405m0.m32100e8();
                z = true;
            } else {
                z = false;
            }
        } else if (tr90.m192431s(CoreModule.f18264c.f20381e0.m116600p9()) && jyb.m147518l(((ww20) this.viewModel).f191138f.getOriginIdealTag(), CoreModule.f18264c.f20381e0.m116600p9().profile.extensions.basic.ideal, new uv20())) {
            z = false;
        } else {
            z = true;
        }
        if (NullChecker.m82486a(this.f138996b) && NullChecker.m82486a(this.f138997c) && CoreModule.m30929H().signedIn_()) {
            SettingGroups settingGroupsM160407N0 = m160407N0();
            if (NullChecker.m82486a(settingGroupsM160407N0) || m160396o1()) {
                final AdvancedSettings advancedSettingsM160406L0 = m160406L0();
                if ((!CoreModule.f18264c.f20381e0.m116600p9().isVIP() || advancedSettingsM160406L0 == null) && ((!joa.m146412z3() || advancedSettingsM160406L0 == null) && !m160371R0(advancedSettingsM160406L0) && !m160370Q0(advancedSettingsM160406L0))) {
                    z2 = false;
                }
                CoreModule.f18264c.f20405m0.m32127l8(settingGroupsM160407N0, z2).switchMap(new qcj() { // from class: l.ew20
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f96069a.m160385g1(advancedSettingsM160406L0, (uxj0) obj);
                    }
                }).subscribe(psd0.m173597H(new y20() { // from class: l.fw20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        rbl.m180757a(Settings.TYPE);
                    }
                }, new y20() { // from class: l.gw20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        mw20.m160363E0((Throwable) obj);
                    }
                }));
                return;
            }
            AdvancedSettings advancedSettingsM160406L1 = m160406L0();
            if (!NullChecker.m82486a(advancedSettingsM160406L1)) {
                if (z) {
                    CoreModule.f18264c.f20405m0.m32022L5();
                }
            } else if (!joa.m146386f4() || joa.m146412z3()) {
                CoreModule.f18264c.f20306F0.m118452o3(advancedSettingsM160406L1, false).subscribe(psd0.m173597H(new y20() { // from class: l.hw20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        rbl.m180757a(Settings.TYPE);
                    }
                }, new y20() { // from class: l.iw20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        mw20.m160364F0((Throwable) obj);
                    }
                }));
            } else if (m160371R0(advancedSettingsM160406L1) || m160370Q0(advancedSettingsM160406L1)) {
                m160368J0(advancedSettingsM160406L1);
                CoreModule.f18264c.f20306F0.m118452o3(advancedSettingsM160406L1, false).subscribe(psd0.m173597H(new y20() { // from class: l.jw20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        rbl.m180757a(Settings.TYPE);
                    }
                }, new y20() { // from class: l.kw20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        mw20.m160402u0((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m160414m1(x20 x20Var) {
        this.f139007m = x20Var;
    }

    /* JADX INFO: renamed from: n1 */
    public void m160415n1(String str) {
        this.f139006l = str;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
