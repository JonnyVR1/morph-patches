package p006l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p000p1.mobile.putong.core.CoreModule;
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
import l.aj2;
import l.b9l;
import l.d30;
import l.d90;
import l.e0e;
import l.e30;
import l.e51;
import l.j760;
import l.lqa;
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
public class lq20 extends aj2<wq20> {

    /* JADX INFO: renamed from: c */
    public Act f16555c;

    /* JADX INFO: renamed from: d */
    public BottomSheetDialog f16556d;

    /* JADX INFO: renamed from: e */
    public User f16557e;

    /* JADX INFO: renamed from: f */
    public Settings f16558f;

    /* JADX INFO: renamed from: g */
    public mjj f16559g;

    /* JADX INFO: renamed from: h */
    public boolean f16560h;

    /* JADX INFO: renamed from: i */
    public xe20 f16561i;

    /* JADX INFO: renamed from: j */
    public ff20 f16562j;

    /* JADX INFO: renamed from: k */
    public u640 f16563k;

    /* JADX INFO: renamed from: l */
    public y640 f16564l;

    /* JADX INFO: renamed from: m */
    public AdvancedSettings f16565m;

    /* JADX INFO: renamed from: n */
    public AdvancedSettings f16566n;

    /* JADX INFO: renamed from: o */
    public String f16567o;

    /* JADX INFO: renamed from: p */
    public d30 f16568p;

    /* JADX INFO: renamed from: q */
    public boolean f16569q;

    public lq20(Act act, e0e e0eVar) {
        super(e0eVar);
        this.f16560h = true;
        this.f16567o = "user_click";
        this.f16555c = act;
        this.f16556d = (BottomSheetDialog) e0eVar;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m18904E(Throwable th) {
        CoreModule.f1534c.f3652m0.m3095z5(false);
        yij0.D(th);
    }

    /* JADX INFO: renamed from: R */
    private void m18909R() {
        duringCreated(CoreModule.f1534c.f3628e0.m21486o9()).map(new w9j() { // from class: l.lp20
            public final Object call(Object obj) {
                return ((User) obj).getLatitudeAndLongitude();
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.mp20
            public final void call(Object obj) {
                this.f17173a.m18942U((DoublePair) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3628e0.m21486o9().filter(new w9j() { // from class: l.np20
            public final Object call(Object obj) {
                return Boolean.valueOf(DoublePair.new_().equals(((User) obj).getLatitudeAndLongitude()));
            }
        }).switchMap(new w9j() { // from class: l.op20
            public final Object call(Object obj) {
                return qib0.f19778E.p().filter(new w9j() { // from class: l.cq20
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(CoreModule.m1850H().signedIn_());
                    }
                });
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.pp20
            public final void call(Object obj) {
                this.f19249a.m18944W((Location) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m18910Y(User user) {
        this.f16557e = user;
        Settings settings = this.f16558f;
        if (settings == null) {
            Settings settingsClone = user.settings.clone();
            this.f16558f = settingsClone;
            ((wq20) ((aj2) this).a).m26610A(settingsClone);
            if (CoreModule.m1854P().m11711g().m7021xj()) {
                this.f16564l.m28112u(this.f16558f);
            }
            m18909R();
        } else {
            Settings settings2 = user.settings;
            settings.birthdate = settings2.birthdate;
            settings.phoneNumber = settings2.phoneNumber;
            settings.getSettingGroup().privacy.hideContacts = user.settings.hideContacts();
            this.f16558f.getSettingGroup().privacy.hideMutualContacts = user.settings.hideMutualContacts();
            this.f16558f.getSettingGroup().push.previewMessage = user.settings.previewPushMessage();
            this.f16558f.getSettingGroup().push.showMomentLikes = user.settings.showMomentLikes();
            this.f16558f.getSettingGroup().privacy.hideSchool = user.settings.hideSchoolNameNoDefaults();
            this.f16558f.getSettingGroup().search.priorities = new ArrayList();
            ((SettingGroups) this.f16558f.settingGroups.get(0)).search.priorities.addAll(user.settings.getSearchPriority());
        }
        this.f16561i.m27215C0(this.f16558f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m18911Z(AdvancedSettings advancedSettings) {
        if (NullChecker.a(advancedSettings)) {
            this.f16565m = advancedSettings;
            AdvancedSettings advancedSettingsClone = advancedSettings.clone();
            this.f16566n = advancedSettingsClone;
            ((wq20) ((aj2) this).a).m26630z(advancedSettingsClone);
            this.f16561i.m27220r0(this.f16566n);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m18913d(Throwable th) {
        CoreModule.f1534c.f3652m0.m3095z5(false);
        yij0.D(th);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m18918k(NetworkInfo networkInfo) {
        CoreModule.f1534c.f3553F0.m12317q3();
        CoreModule.f1534c.f3544C0.m27420u4();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m18920m(Throwable th) {
        CoreModule.f1534c.f3652m0.m3095z5(false);
        yij0.D(th);
    }

    /* JADX INFO: renamed from: J */
    public final void m18932J(AdvancedSettings advancedSettings) {
        m18950e0(advancedSettings);
        m18951f0(advancedSettings);
        m18936N(advancedSettings);
    }

    /* JADX INFO: renamed from: K */
    public AdvancedSettings m18933K() {
        AdvancedSettings advancedSettings = this.f16566n;
        if (advancedSettings == null || this.f16565m == null) {
            return null;
        }
        ((wq20) ((aj2) this).a).m26618N(advancedSettings);
        this.f16562j.m15347z(this.f16566n);
        return this.f16566n.subtract(this.f16565m);
    }

    /* JADX INFO: renamed from: L */
    public SettingGroups m18934L() {
        if (!NullChecker.a(this.f16557e) || !NullChecker.a(this.f16558f) || !CoreModule.m1850H().signedIn_()) {
            return null;
        }
        SettingGroups settingGroups = new SettingGroups();
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        settingGroups.search = userSearchSettings;
        userSearchSettings.lookingForGender = this.f16558f.getLookingFor();
        settingGroups.search.ageAllowedMinimum = this.f16558f.getSearchAgeAllowedMinimum();
        settingGroups.search.ageAllowedMaximum = this.f16558f.getSearchAgeAllowedMaximum();
        settingGroups.search.minAge = this.f16558f.getSearchMinAge();
        settingGroups.search.maxAge = this.f16558f.getSearchMaxAge();
        settingGroups.search.radius = this.f16558f.getSearchRadius();
        settingGroups.search.radiusAllowedMinimum = this.f16558f.getRadiusAllowedMinimum();
        settingGroups.search.radiusAllowedMaximum = this.f16558f.getRadiusAllowedMaximum();
        settingGroups.search.priorities = this.f16558f.getSearchPriority();
        settingGroups.search.autoAdjustRadius = this.f16558f.autoAdjustSuggestRadius();
        if (CoreModule.m1854P().m11706a().m5343Sk()) {
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            settingGroups.privacy = userPrivacySettings;
            userPrivacySettings.hideContacts = this.f16558f.hideContacts();
        }
        return settingGroups.subtract(this.f16557e.settings.getSettingGroup());
    }

    /* JADX INFO: renamed from: M */
    public String m18935M() {
        return this.f16567o;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m18936N(AdvancedSettings advancedSettings) {
        boolean z = false;
        if (NullChecker.a(advancedSettings)) {
            if (NullChecker.a(advancedSettings.popular)) {
                advancedSettings.popular = this.f16565m.popular;
                z = true;
            }
            if (NullChecker.a(advancedSettings.online)) {
                advancedSettings.online = this.f16565m.online;
                z = true;
            }
            if (NullChecker.a(advancedSettings.newUser)) {
                advancedSettings.newUser = this.f16565m.newUser;
                z = true;
            }
            if (NullChecker.a(advancedSettings.zodiacs)) {
                advancedSettings.zodiacs = this.f16565m.zodiacs;
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m18937O(AdvancedSettings advancedSettings) {
        return NullChecker.a(advancedSettings) && CoreModule.f1534c.f3628e0.m21490p9().isPicVerificationVerified() && NullChecker.a(advancedSettings.realFace) && !advancedSettings.realFace.equals(this.f16565m.realFace);
    }

    /* JADX INFO: renamed from: P */
    public final boolean m18938P(AdvancedSettings advancedSettings) {
        return NullChecker.a(advancedSettings) && TEnum.equals(this.f16558f.verification.studies.status, "verified") && NullChecker.a(advancedSettings.student) && !advancedSettings.student.equals(this.f16565m.student);
    }

    /* JADX INFO: renamed from: Q */
    public void m18939Q() {
        this.f16559g = mjj.c(this.f16555c, false);
        u640 u640Var = new u640(this.f16555c);
        this.f16563k = u640Var;
        y640 y640Var = new y640(this.f16555c);
        this.f16564l = y640Var;
        u640Var.C(y640Var);
        this.f16564l.m28103i1(this.f16563k);
        this.f16564l.mo16747v(((wq20) ((aj2) this).a).m26628x());
        this.f16564l.m28097E("p_advanced_filter_page");
        xe20 xe20Var = new xe20(this.f16555c);
        this.f16561i = xe20Var;
        ff20 ff20Var = new ff20(this.f16555c);
        this.f16562j = ff20Var;
        xe20Var.C(ff20Var);
        this.f16562j.m15334i1(this.f16561i);
        this.f16562j.m15341s(((wq20) ((aj2) this).a).m26627w());
        this.f16562j.m15330F("p_advanced_filter_page");
        ((wq20) ((aj2) this).a).m26619O(this.f16564l.f28043a);
        CoreModule.f1534c.f3553F0.m12317q3();
        CoreModule.f1534c.f3544C0.m27420u4();
    }

    /* JADX INFO: renamed from: S */
    public void m18940S() {
        m18939Q();
        duringCreated(CoreModule.f1534c.f3652m0.m3048j9().switchMap(new w9j() { // from class: l.jp20
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3628e0.m21486o9();
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.up20
            public final void call(Object obj) {
                this.f23690a.m18910Y((User) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3553F0.m12319s3().switchMap(new w9j() { // from class: l.dq20
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3553F0.m12308h3();
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.eq20
            public final void call(Object obj) {
                this.f11394a.m18911Z((AdvancedSettings) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m()).skip(1).distinctUntilChanged().filter(new w9j() { // from class: l.fq20
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.gq20
            public final void call(Object obj) {
                lq20.m18918k((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3628e0.m21486o9().map(new w9j() { // from class: l.hq20
            public final Object call(Object obj) {
                return ((User) obj).age;
            }
        }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.iq20
            public final void call(Object obj) {
                this.f14628a.m18946a0((Integer) obj);
            }
        }));
        if (lqa.f()) {
            duringCreated(CoreModule.f1534c.f3628e0.m21486o9()).map(new w9j() { // from class: l.jq20
                public final Object call(Object obj) {
                    return ((User) obj).profile.extensions.basic.ideal;
                }
            }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.kq20
                public final void call(Object obj) {
                    this.f15959a.m18945X((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m18941T(d90 d90Var) {
        da0.m13862a().m13865d(d90Var.b());
        ((wq20) ((aj2) this).a).m26622S(TextUtils.isEmpty(d90Var.b()) ? b().string(R.string.l3) : d90Var.b());
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m18942U(DoublePair doublePair) {
        boolean zEquals = DoublePair.new_().equals(doublePair);
        s7m s7mVar = ((aj2) this).a;
        if (zEquals) {
            ((wq20) s7mVar).m26625s(b().string(R.string.m3), TextUtils.isEmpty(da0.m13862a().m13864b()) ? b().string(R.string.l3) : da0.m13862a().m13864b());
        } else {
            ((wq20) s7mVar).m26625s(b().string(R.string.n3), TextUtils.isEmpty(da0.m13862a().m13864b()) ? b().string(R.string.l3) : da0.m13862a().m13864b());
            this.f16559g.e(this.f16555c, doublePair.first, doublePair.second, new e30() { // from class: l.aq20
                public final void call(Object obj) {
                    this.f8439a.m18941T((d90) obj);
                }
            }, new e30() { // from class: l.bq20
                public final void call(Object obj) {
                    App.d.k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m18943V(d90 d90Var) {
        da0.m13862a().m13865d(d90Var.b());
        ((wq20) ((aj2) this).a).m26622S(TextUtils.isEmpty(d90Var.b()) ? b().string(R.string.l3) : d90Var.b());
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m18944W(Location location) {
        DoublePair doublePairNew_ = DoublePair.new_();
        doublePairNew_.first = location.u();
        doublePairNew_.second = location.x();
        if (DoublePair.new_().equals(CoreModule.f1534c.f3628e0.m21490p9().getLatitudeAndLongitude())) {
            this.f16559g.e(this.f16555c, doublePairNew_.first, doublePairNew_.second, new e30() { // from class: l.yp20
                public final void call(Object obj) {
                    this.f28331a.m18943V((d90) obj);
                }
            }, new e30() { // from class: l.zp20
                public final void call(Object obj) {
                    App.d.k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m18945X(List list) {
        ((wq20) ((aj2) this).a).m26616L(true);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m18946a0(Integer num) {
        if (!this.f16560h) {
            Settings settings = this.f16558f;
            if (settings == null) {
                return;
            } else {
                ((wq20) ((aj2) this).a).m26611B(settings);
            }
        }
        this.f16560h = false;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m18947b0() {
        yki0.b().d();
        String strC = yki0.b().c();
        OMSThemeInfo oMSThemeInfoA = yki0.b().a();
        if (!NullChecker.a(oMSThemeInfoA) || TextUtils.isEmpty(strC)) {
            return;
        }
        b().startActivity(CoreModule.f1546o.m25559d().m5820md(this.f16555c, null, strC, true, false, false));
        zvf0.D("e_switch_h5", "p_suggest_users_home_view", new j760[]{vwb.Y("answer_complete_ornot", oMSThemeInfoA.questionnaireFinished ? "yes" : "no")});
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ c m18948c0(AdvancedSettings advancedSettings, roj0 roj0Var) {
        if (NullChecker.a(advancedSettings)) {
            if (CoreModule.f1534c.f3628e0.m21490p9().isVIP() || xma.m27405y3()) {
                return CoreModule.f1534c.f3553F0.m12315o3(advancedSettings, true);
            }
            if (m18938P(advancedSettings) || m18937O(advancedSettings)) {
                m18932J(advancedSettings);
                return CoreModule.f1534c.f3553F0.m12315o3(advancedSettings, true);
            }
        }
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m18949d0() {
        return CoreModule.f1534c.f3628e0.m21490p9().isVIP();
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m18950e0(AdvancedSettings advancedSettings) {
        if (advancedSettings == null || CoreModule.f1534c.f3628e0.m21490p9().isPicVerificationVerified() || !NullChecker.a(advancedSettings.realFace) || advancedSettings.realFace.equals(this.f16565m.realFace)) {
            return false;
        }
        advancedSettings.realFace = this.f16565m.realFace;
        return true;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m18951f0(AdvancedSettings advancedSettings) {
        if (advancedSettings == null || TEnum.equals(this.f16558f.verification.studies.status, "verified") || !NullChecker.a(advancedSettings.student) || advancedSettings.student.equals(this.f16565m.student)) {
            return false;
        }
        advancedSettings.student = this.f16565m.student;
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    public void m18952g0() {
        this.f16556d.dismiss();
        m18953h0();
        zvf0.r("e_advanced_filter_save", "p_advanced_filter_page");
        if (CoreModule.f1546o.m25559d().m5686Rq(this.f16555c) && this.f16569q) {
            e51.H(this.f16555c, new Runnable() { // from class: l.kp20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15929a.m18947b0();
                }
            }, 500L);
        }
        d30 d30Var = this.f16568p;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX INFO: renamed from: h0 */
    public void m18953h0() {
        boolean z;
        boolean z2 = true;
        if (!lqa.f()) {
            z = false;
        } else if (vwb.J(((wq20) ((aj2) this).a).f25290e.getOriginIdealTag())) {
            if (pj90.s(CoreModule.f1534c.f3628e0.m21490p9())) {
                CoreModule.f1534c.f3652m0.m3027e8();
                z = true;
            } else {
                z = false;
            }
        } else if (pj90.s(CoreModule.f1534c.f3628e0.m21490p9()) && vwb.l(((wq20) ((aj2) this).a).f25290e.getOriginIdealTag(), CoreModule.f1534c.f3628e0.m21490p9().profile.extensions.basic.ideal, new kn20())) {
            z = false;
        } else {
            z = true;
        }
        if (NullChecker.a(this.f16557e) && NullChecker.a(this.f16558f) && CoreModule.m1850H().signedIn_()) {
            SettingGroups settingGroupsM18934L = m18934L();
            if (NullChecker.a(settingGroupsM18934L) || m18956k0()) {
                final AdvancedSettings advancedSettingsM18933K = m18933K();
                if ((!CoreModule.f1534c.f3628e0.m21490p9().isVIP() || advancedSettingsM18933K == null) && ((!xma.m27405y3() || advancedSettingsM18933K == null) && !m18938P(advancedSettingsM18933K) && !m18937O(advancedSettingsM18933K))) {
                    z2 = false;
                }
                CoreModule.f1534c.f3652m0.m3054l8(settingGroupsM18934L, z2).switchMap(new w9j() { // from class: l.qp20
                    public final Object call(Object obj) {
                        return this.f19956a.m18948c0(advancedSettingsM18933K, (roj0) obj);
                    }
                }).subscribe(mkd0.H(new e30() { // from class: l.rp20
                    public final void call(Object obj) {
                        b9l.a("settings");
                    }
                }, new e30() { // from class: l.sp20
                    public final void call(Object obj) {
                        lq20.m18920m((Throwable) obj);
                    }
                }));
                return;
            }
            AdvancedSettings advancedSettingsM18933K2 = m18933K();
            if (!NullChecker.a(advancedSettingsM18933K2)) {
                if (z) {
                    CoreModule.f1534c.f3652m0.m2949L5();
                }
            } else if (!xma.m27379e4() || xma.m27405y3()) {
                CoreModule.f1534c.f3553F0.m12315o3(advancedSettingsM18933K2, false).subscribe(mkd0.H(new e30() { // from class: l.tp20
                    public final void call(Object obj) {
                        b9l.a("settings");
                    }
                }, new e30() { // from class: l.vp20
                    public final void call(Object obj) {
                        lq20.m18913d((Throwable) obj);
                    }
                }));
            } else if (m18938P(advancedSettingsM18933K2) || m18937O(advancedSettingsM18933K2)) {
                m18932J(advancedSettingsM18933K2);
                CoreModule.f1534c.f3553F0.m12315o3(advancedSettingsM18933K2, false).subscribe(mkd0.H(new e30() { // from class: l.wp20
                    public final void call(Object obj) {
                        b9l.a("settings");
                    }
                }, new e30() { // from class: l.xp20
                    public final void call(Object obj) {
                        lq20.m18904E((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m18954i0(d30 d30Var) {
        this.f16568p = d30Var;
    }

    /* JADX INFO: renamed from: j0 */
    public void m18955j0(String str) {
        this.f16567o = str;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m18956k0() {
        if (NullChecker.a(yki0.b().a()) && ((wq20) ((aj2) this).a).m26629y() != ((Boolean) CoreModule.f1534c.f3691z0.f13754V.get()).booleanValue()) {
            OMSThemeInfo oMSThemeInfoA = yki0.b().a();
            boolean zM26629y = ((wq20) ((aj2) this).a).m26629y();
            if (oMSThemeInfoA.questionnaireFinished) {
                CoreModule.f1534c.f3691z0.f13754V.put(Boolean.valueOf(zM26629y));
                yki0.b().l(zM26629y);
                return true;
            }
            if (zM26629y) {
                this.f16569q = true;
            }
        }
        return false;
    }
}
