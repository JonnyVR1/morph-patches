package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AdvancedSettings;
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
public class vy20 extends ij2<gz20> {

    /* JADX INFO: renamed from: c */
    public Act f186318c;

    /* JADX INFO: renamed from: d */
    public BottomSheetDialog f186319d;

    /* JADX INFO: renamed from: e */
    public User f186320e;

    /* JADX INFO: renamed from: f */
    public Settings f186321f;

    /* JADX INFO: renamed from: g */
    public fmj f186322g;

    /* JADX INFO: renamed from: h */
    public boolean f186323h;

    /* JADX INFO: renamed from: i */
    public hn20 f186324i;

    /* JADX INFO: renamed from: j */
    public pn20 f186325j;

    /* JADX INFO: renamed from: k */
    public if40 f186326k;

    /* JADX INFO: renamed from: l */
    public mf40 f186327l;

    /* JADX INFO: renamed from: m */
    public AdvancedSettings f186328m;

    /* JADX INFO: renamed from: n */
    public AdvancedSettings f186329n;

    /* JADX INFO: renamed from: o */
    public String f186330o;

    /* JADX INFO: renamed from: p */
    public x20 f186331p;

    /* JADX INFO: renamed from: q */
    public boolean f186332q;

    /* JADX WARN: Multi-variable type inference failed */
    public vy20(Act act, s1e s1eVar) {
        super(s1eVar);
        this.f186323h = true;
        this.f186330o = "user_click";
        this.f186318c = act;
        this.f186319d = (BottomSheetDialog) s1eVar;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m203896E(Throwable th) {
        CoreModule.f18264c.f20405m0.m32168z5(false);
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: R */
    private void m203901R() {
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).map(new qcj() { // from class: l.vx20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).getLatitudeAndLongitude();
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.wx20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191358a.m203934U((DoublePair) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9().filter(new qcj() { // from class: l.xx20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(DoublePair.new_().equals(((User) obj).getLatitudeAndLongitude()));
            }
        }).switchMap(new qcj() { // from class: l.yx20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uqb0.f180370E.m80047p().filter(new qcj() { // from class: l.my20
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(CoreModule.m30929H().signedIn_());
                    }
                });
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.zx20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206425a.m203936W((Location) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m203902Y(User user) {
        this.f186320e = user;
        Settings settings = this.f186321f;
        if (settings == null) {
            Settings settingsMo225055clone = user.settings.mo225055clone();
            this.f186321f = settingsMo225055clone;
            ((gz20) this.f115168a).m133058A(settingsMo225055clone);
            if (CoreModule.m30933P().m143410g().mo36087xj()) {
                this.f186327l.m158128u(this.f186321f);
            }
            m203901R();
        } else {
            Settings settings2 = user.settings;
            settings.birthdate = settings2.birthdate;
            settings.phoneNumber = settings2.phoneNumber;
            settings.getSettingGroup().privacy.hideContacts = user.settings.hideContacts();
            this.f186321f.getSettingGroup().privacy.hideMutualContacts = user.settings.hideMutualContacts();
            this.f186321f.getSettingGroup().push.previewMessage = user.settings.previewPushMessage();
            this.f186321f.getSettingGroup().push.showMomentLikes = user.settings.showMomentLikes();
            this.f186321f.getSettingGroup().privacy.hideSchool = user.settings.hideSchoolNameNoDefaults();
            this.f186321f.getSettingGroup().search.priorities = new ArrayList();
            this.f186321f.settingGroups.get(0).search.priorities.addAll(user.settings.getSearchPriority());
        }
        this.f186324i.m136031C0(this.f186321f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m203903Z(AdvancedSettings advancedSettings) {
        if (NullChecker.m82486a(advancedSettings)) {
            this.f186328m = advancedSettings;
            AdvancedSettings advancedSettingsMo225055clone = advancedSettings.mo225055clone();
            this.f186329n = advancedSettingsMo225055clone;
            ((gz20) this.f115168a).m133078z(advancedSettingsMo225055clone);
            this.f186324i.m136036r0(this.f186329n);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m203905d(Throwable th) {
        CoreModule.f18264c.f20405m0.m32168z5(false);
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m203910k(NetworkInfo networkInfo) {
        CoreModule.f18264c.f20306F0.m118454q3();
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m203912m(Throwable th) {
        CoreModule.f18264c.f20405m0.m32168z5(false);
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: J */
    public final void m203924J(AdvancedSettings advancedSettings) {
        m203942e0(advancedSettings);
        m203943f0(advancedSettings);
        m203928N(advancedSettings);
    }

    /* JADX INFO: renamed from: K */
    public AdvancedSettings m203925K() {
        AdvancedSettings advancedSettings = this.f186329n;
        if (advancedSettings == null || this.f186328m == null) {
            return null;
        }
        ((gz20) this.f115168a).m133065N(advancedSettings);
        this.f186325j.m173029z(this.f186329n);
        return this.f186329n.subtract(this.f186328m);
    }

    /* JADX INFO: renamed from: L */
    public SettingGroups m203926L() {
        if (!NullChecker.m82486a(this.f186320e) || !NullChecker.m82486a(this.f186321f) || !CoreModule.m30929H().signedIn_()) {
            return null;
        }
        SettingGroups settingGroups = new SettingGroups();
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        settingGroups.search = userSearchSettings;
        userSearchSettings.lookingForGender = this.f186321f.getLookingFor();
        settingGroups.search.ageAllowedMinimum = this.f186321f.getSearchAgeAllowedMinimum();
        settingGroups.search.ageAllowedMaximum = this.f186321f.getSearchAgeAllowedMaximum();
        settingGroups.search.minAge = this.f186321f.getSearchMinAge();
        settingGroups.search.maxAge = this.f186321f.getSearchMaxAge();
        settingGroups.search.radius = this.f186321f.getSearchRadius();
        settingGroups.search.radiusAllowedMinimum = this.f186321f.getRadiusAllowedMinimum();
        settingGroups.search.radiusAllowedMaximum = this.f186321f.getRadiusAllowedMaximum();
        settingGroups.search.priorities = this.f186321f.getSearchPriority();
        settingGroups.search.autoAdjustRadius = this.f186321f.autoAdjustSuggestRadius();
        if (CoreModule.m30933P().m143405a().mo34409Sk()) {
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            settingGroups.privacy = userPrivacySettings;
            userPrivacySettings.hideContacts = this.f186321f.hideContacts();
        }
        return settingGroups.subtract(this.f186320e.settings.getSettingGroup());
    }

    /* JADX INFO: renamed from: M */
    public String m203927M() {
        return this.f186330o;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m203928N(AdvancedSettings advancedSettings) {
        boolean z = false;
        if (NullChecker.m82486a(advancedSettings)) {
            if (NullChecker.m82486a(advancedSettings.popular)) {
                advancedSettings.popular = this.f186328m.popular;
                z = true;
            }
            if (NullChecker.m82486a(advancedSettings.online)) {
                advancedSettings.online = this.f186328m.online;
                z = true;
            }
            if (NullChecker.m82486a(advancedSettings.newUser)) {
                advancedSettings.newUser = this.f186328m.newUser;
                z = true;
            }
            if (NullChecker.m82486a(advancedSettings.zodiacs)) {
                advancedSettings.zodiacs = this.f186328m.zodiacs;
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m203929O(AdvancedSettings advancedSettings) {
        return NullChecker.m82486a(advancedSettings) && CoreModule.f18264c.f20381e0.m116600p9().isPicVerificationVerified() && NullChecker.m82486a(advancedSettings.realFace) && !advancedSettings.realFace.equals(this.f186328m.realFace);
    }

    /* JADX INFO: renamed from: P */
    public final boolean m203930P(AdvancedSettings advancedSettings) {
        return NullChecker.m82486a(advancedSettings) && TEnum.equals(this.f186321f.verification.studies.status, "verified") && NullChecker.m82486a(advancedSettings.student) && !advancedSettings.student.equals(this.f186328m.student);
    }

    /* JADX INFO: renamed from: Q */
    public void m203931Q() {
        this.f186322g = fmj.m126236c(this.f186318c, false);
        if40 if40Var = new if40(this.f186318c);
        this.f186326k = if40Var;
        mf40 mf40Var = new mf40(this.f186318c);
        this.f186327l = mf40Var;
        if40Var.mo52715C(mf40Var);
        this.f186327l.mo22064i1(this.f186326k);
        this.f186327l.mo158129v(((gz20) this.f115168a).m133076x());
        this.f186327l.m158113E("p_advanced_filter_page");
        hn20 hn20Var = new hn20(this.f186318c);
        this.f186324i = hn20Var;
        pn20 pn20Var = new pn20(this.f186318c);
        this.f186325j = pn20Var;
        hn20Var.mo52715C(pn20Var);
        this.f186325j.mo22064i1(this.f186324i);
        this.f186325j.m173023s(((gz20) this.f115168a).m133075w());
        this.f186325j.m173013F("p_advanced_filter_page");
        ((gz20) this.f115168a).m133066O(this.f186327l.f136592a);
        CoreModule.f18264c.f20306F0.m118454q3();
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: renamed from: S */
    public void m203932S() {
        m203931Q();
        duringCreated(CoreModule.f18264c.f20405m0.m32121j9().switchMap(new qcj() { // from class: l.tx20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20381e0.m116596o9();
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.ey20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96391a.m203902Y((User) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20306F0.m118456s3().switchMap(new qcj() { // from class: l.ny20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20306F0.m118445h3();
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.oy20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149734a.m203903Z((AdvancedSettings) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).distinctUntilChanged().filter(new qcj() { // from class: l.py20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.qy20
            @Override // p153l.y20
            public final void call(Object obj) {
                vy20.m203910k((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9().map(new qcj() { // from class: l.ry20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).age;
            }
        }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.sy20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171208a.m203938a0((Integer) obj);
            }
        }));
        if (xra.m212787f()) {
            duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).map(new qcj() { // from class: l.ty20
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((User) obj).profile.extensions.basic.ideal;
                }
            }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.uy20
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f181533a.m203937X((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m203933T(z80 z80Var) {
        z90.m219037a().m219040d(z80Var.mo143670b());
        ((gz20) this.f115168a).m133069S(TextUtils.isEmpty(z80Var.mo143670b()) ? m140179b().string(R$string.f28733l3) : z80Var.mo143670b());
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m203934U(DoublePair doublePair) {
        boolean zEquals = DoublePair.new_().equals(doublePair);
        V v2 = this.f115168a;
        if (zEquals) {
            ((gz20) v2).m133073s(m140179b().string(R$string.f28739m3), TextUtils.isEmpty(z90.m219037a().m219039b()) ? m140179b().string(R$string.f28733l3) : z90.m219037a().m219039b());
        } else {
            ((gz20) v2).m133073s(m140179b().string(R$string.f28745n3), TextUtils.isEmpty(z90.m219037a().m219039b()) ? m140179b().string(R$string.f28733l3) : z90.m219037a().m219039b());
            this.f186322g.m126239e(this.f186318c, doublePair.first, doublePair.second, new y20() { // from class: l.ky20
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f129262a.m203933T((z80) obj);
                }
            }, new y20() { // from class: l.ly20
                @Override // p153l.y20
                public final void call(Object obj) {
                    App.f16087d.m21432k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m203935V(z80 z80Var) {
        z90.m219037a().m219040d(z80Var.mo143670b());
        ((gz20) this.f115168a).m133069S(TextUtils.isEmpty(z80Var.mo143670b()) ? m140179b().string(R$string.f28733l3) : z80Var.mo143670b());
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m203936W(Location location) {
        DoublePair doublePairNew_ = DoublePair.new_();
        doublePairNew_.first = location.m80014u();
        doublePairNew_.second = location.m80016x();
        if (DoublePair.new_().equals(CoreModule.f18264c.f20381e0.m116600p9().getLatitudeAndLongitude())) {
            this.f186322g.m126239e(this.f186318c, doublePairNew_.first, doublePairNew_.second, new y20() { // from class: l.iy20
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f117496a.m203935V((z80) obj);
                }
            }, new y20() { // from class: l.jy20
                @Override // p153l.y20
                public final void call(Object obj) {
                    App.f16087d.m21432k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m203937X(List list) {
        ((gz20) this.f115168a).m133063L(true);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m203938a0(Integer num) {
        if (!this.f186323h) {
            Settings settings = this.f186321f;
            if (settings == null) {
                return;
            } else {
                ((gz20) this.f115168a).m133059B(settings);
            }
        }
        this.f186323h = false;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m203939b0() {
        yti0.m217322b().m217327d();
        String strM217326c = yti0.m217322b().m217326c();
        OMSThemeInfo oMSThemeInfoM217325a = yti0.m217322b().m217325a();
        if (!NullChecker.m82486a(oMSThemeInfoM217325a) || TextUtils.isEmpty(strM217326c)) {
            return;
        }
        m140179b().startActivity(CoreModule.f18276o.m132214d().mo34886md(this.f186318c, null, strM217326c, true, false, false));
        i4g0.m138495D("e_switch_h5", "p_suggest_users_home_view", jyb.m147494Y("answer_complete_ornot", oMSThemeInfoM217325a.questionnaireFinished ? "yes" : "no"));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ C22421c m203940c0(AdvancedSettings advancedSettings, uxj0 uxj0Var) {
        if (NullChecker.m82486a(advancedSettings)) {
            if (CoreModule.f18264c.f20381e0.m116600p9().isVIP() || joa.m146412z3()) {
                return CoreModule.f18264c.f20306F0.m118452o3(advancedSettings, true);
            }
            if (m203930P(advancedSettings) || m203929O(advancedSettings)) {
                m203924J(advancedSettings);
                return CoreModule.f18264c.f20306F0.m118452o3(advancedSettings, true);
            }
        }
        return C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m203941d0() {
        return CoreModule.f18264c.f20381e0.m116600p9().isVIP();
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m203942e0(AdvancedSettings advancedSettings) {
        if (advancedSettings == null || CoreModule.f18264c.f20381e0.m116600p9().isPicVerificationVerified() || !NullChecker.m82486a(advancedSettings.realFace) || advancedSettings.realFace.equals(this.f186328m.realFace)) {
            return false;
        }
        advancedSettings.realFace = this.f186328m.realFace;
        return true;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m203943f0(AdvancedSettings advancedSettings) {
        if (advancedSettings == null || TEnum.equals(this.f186321f.verification.studies.status, "verified") || !NullChecker.m82486a(advancedSettings.student) || advancedSettings.student.equals(this.f186328m.student)) {
            return false;
        }
        advancedSettings.student = this.f186328m.student;
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    public void m203944g0() {
        this.f186319d.dismiss();
        m203945h0();
        i4g0.m138520r("e_advanced_filter_save", "p_advanced_filter_page");
        if (CoreModule.f18276o.m132214d().mo34752Rq(this.f186318c) && this.f186332q) {
            l51.m152888H(this.f186318c, new Runnable() { // from class: l.ux20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f181335a.m203939b0();
                }
            }, 500L);
        }
        x20 x20Var = this.f186331p;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX INFO: renamed from: h0 */
    public void m203945h0() {
        boolean z;
        boolean z2 = true;
        if (!xra.m212787f()) {
            z = false;
        } else if (jyb.m147479J(((gz20) this.f115168a).f107142e.getOriginIdealTag())) {
            if (tr90.m192431s(CoreModule.f18264c.f20381e0.m116600p9())) {
                CoreModule.f18264c.f20405m0.m32100e8();
                z = true;
            } else {
                z = false;
            }
        } else if (tr90.m192431s(CoreModule.f18264c.f20381e0.m116600p9()) && jyb.m147518l(((gz20) this.f115168a).f107142e.getOriginIdealTag(), CoreModule.f18264c.f20381e0.m116600p9().profile.extensions.basic.ideal, new uv20())) {
            z = false;
        } else {
            z = true;
        }
        if (NullChecker.m82486a(this.f186320e) && NullChecker.m82486a(this.f186321f) && CoreModule.m30929H().signedIn_()) {
            SettingGroups settingGroupsM203926L = m203926L();
            if (NullChecker.m82486a(settingGroupsM203926L) || m203948k0()) {
                final AdvancedSettings advancedSettingsM203925K = m203925K();
                if ((!CoreModule.f18264c.f20381e0.m116600p9().isVIP() || advancedSettingsM203925K == null) && ((!joa.m146412z3() || advancedSettingsM203925K == null) && !m203930P(advancedSettingsM203925K) && !m203929O(advancedSettingsM203925K))) {
                    z2 = false;
                }
                CoreModule.f18264c.f20405m0.m32127l8(settingGroupsM203926L, z2).switchMap(new qcj() { // from class: l.ay20
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f73936a.m203940c0(advancedSettingsM203925K, (uxj0) obj);
                    }
                }).subscribe(psd0.m173597H(new y20() { // from class: l.by20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        rbl.m180757a(Settings.TYPE);
                    }
                }, new y20() { // from class: l.cy20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        vy20.m203912m((Throwable) obj);
                    }
                }));
                return;
            }
            AdvancedSettings advancedSettingsM203925K2 = m203925K();
            if (!NullChecker.m82486a(advancedSettingsM203925K2)) {
                if (z) {
                    CoreModule.f18264c.f20405m0.m32022L5();
                }
            } else if (!joa.m146386f4() || joa.m146412z3()) {
                CoreModule.f18264c.f20306F0.m118452o3(advancedSettingsM203925K2, false).subscribe(psd0.m173597H(new y20() { // from class: l.dy20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        rbl.m180757a(Settings.TYPE);
                    }
                }, new y20() { // from class: l.fy20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        vy20.m203905d((Throwable) obj);
                    }
                }));
            } else if (m203930P(advancedSettingsM203925K2) || m203929O(advancedSettingsM203925K2)) {
                m203924J(advancedSettingsM203925K2);
                CoreModule.f18264c.f20306F0.m118452o3(advancedSettingsM203925K2, false).subscribe(psd0.m173597H(new y20() { // from class: l.gy20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        rbl.m180757a(Settings.TYPE);
                    }
                }, new y20() { // from class: l.hy20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        vy20.m203896E((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m203946i0(x20 x20Var) {
        this.f186331p = x20Var;
    }

    /* JADX INFO: renamed from: j0 */
    public void m203947j0(String str) {
        this.f186330o = str;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m203948k0() {
        if (NullChecker.m82486a(yti0.m217322b().m217325a()) && ((gz20) this.f115168a).m133077y() != CoreModule.f18264c.f20444z0.f178194V.get().booleanValue()) {
            OMSThemeInfo oMSThemeInfoM217325a = yti0.m217322b().m217325a();
            boolean zM133077y = ((gz20) this.f115168a).m133077y();
            if (oMSThemeInfoM217325a.questionnaireFinished) {
                CoreModule.f18264c.f20444z0.f178194V.put(Boolean.valueOf(zM133077y));
                yti0.m217322b().m217334l(zM133077y);
                return true;
            }
            if (zM133077y) {
                this.f186332q = true;
            }
        }
        return false;
    }
}
