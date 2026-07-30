package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AdvancedSettings;
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
public class lq20 extends aj2<wq20> {

    /* JADX INFO: renamed from: c */
    public Act f129275c;

    /* JADX INFO: renamed from: d */
    public BottomSheetDialog f129276d;

    /* JADX INFO: renamed from: e */
    public User f129277e;

    /* JADX INFO: renamed from: f */
    public Settings f129278f;

    /* JADX INFO: renamed from: g */
    public mjj f129279g;

    /* JADX INFO: renamed from: h */
    public boolean f129280h;

    /* JADX INFO: renamed from: i */
    public xe20 f129281i;

    /* JADX INFO: renamed from: j */
    public ff20 f129282j;

    /* JADX INFO: renamed from: k */
    public u640 f129283k;

    /* JADX INFO: renamed from: l */
    public y640 f129284l;

    /* JADX INFO: renamed from: m */
    public AdvancedSettings f129285m;

    /* JADX INFO: renamed from: n */
    public AdvancedSettings f129286n;

    /* JADX INFO: renamed from: o */
    public String f129287o;

    /* JADX INFO: renamed from: p */
    public d30 f129288p;

    /* JADX INFO: renamed from: q */
    public boolean f129289q;

    /* JADX WARN: Multi-variable type inference failed */
    public lq20(Act act, e0e e0eVar) {
        super(e0eVar);
        this.f129280h = true;
        this.f129287o = "user_click";
        this.f129275c = act;
        this.f129276d = (BottomSheetDialog) e0eVar;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m150907E(Throwable th) {
        CoreModule.f17545c.f19663m0.m31165z5(false);
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: R */
    private void m150912R() {
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).map(new w9j() { // from class: l.lp20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).getLatitudeAndLongitude();
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.mp20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135005a.m150945U((DoublePair) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9().filter(new w9j() { // from class: l.np20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(DoublePair.new_().equals(((User) obj).getLatitudeAndLongitude()));
            }
        }).switchMap(new w9j() { // from class: l.op20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qib0.f154687E.m78864p().filter(new w9j() { // from class: l.cq20
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(CoreModule.m29931H().signedIn_());
                    }
                });
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.pp20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150613a.m150947W((Location) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m150913Y(User user) {
        this.f129277e = user;
        Settings settings = this.f129278f;
        if (settings == null) {
            Settings settingsMo223809clone = user.settings.mo223809clone();
            this.f129278f = settingsMo223809clone;
            ((wq20) this.f70081a).m204986A(settingsMo223809clone);
            if (CoreModule.m29935P().m94656g().mo35084xj()) {
                this.f129284l.m213089u(this.f129278f);
            }
            m150912R();
        } else {
            Settings settings2 = user.settings;
            settings.birthdate = settings2.birthdate;
            settings.phoneNumber = settings2.phoneNumber;
            settings.getSettingGroup().privacy.hideContacts = user.settings.hideContacts();
            this.f129278f.getSettingGroup().privacy.hideMutualContacts = user.settings.hideMutualContacts();
            this.f129278f.getSettingGroup().push.previewMessage = user.settings.previewPushMessage();
            this.f129278f.getSettingGroup().push.showMomentLikes = user.settings.showMomentLikes();
            this.f129278f.getSettingGroup().privacy.hideSchool = user.settings.hideSchoolNameNoDefaults();
            this.f129278f.getSettingGroup().search.priorities = new ArrayList();
            this.f129278f.settingGroups.get(0).search.priorities.addAll(user.settings.getSearchPriority());
        }
        this.f129281i.m208494C0(this.f129278f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m150914Z(AdvancedSettings advancedSettings) {
        if (NullChecker.m81303a(advancedSettings)) {
            this.f129285m = advancedSettings;
            AdvancedSettings advancedSettingsMo223809clone = advancedSettings.mo223809clone();
            this.f129286n = advancedSettingsMo223809clone;
            ((wq20) this.f70081a).m205004z(advancedSettingsMo223809clone);
            this.f129281i.m208499r0(this.f129286n);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m150916d(Throwable th) {
        CoreModule.f17545c.f19663m0.m31165z5(false);
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m150921k(NetworkInfo networkInfo) {
        CoreModule.f17545c.f19564F0.m99250q3();
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m150923m(Throwable th) {
        CoreModule.f17545c.f19663m0.m31165z5(false);
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: J */
    public final void m150935J(AdvancedSettings advancedSettings) {
        m150953e0(advancedSettings);
        m150954f0(advancedSettings);
        m150939N(advancedSettings);
    }

    /* JADX INFO: renamed from: K */
    public AdvancedSettings m150936K() {
        AdvancedSettings advancedSettings = this.f129286n;
        if (advancedSettings == null || this.f129285m == null) {
            return null;
        }
        ((wq20) this.f70081a).m204993N(advancedSettings);
        this.f129282j.m121099z(this.f129286n);
        return this.f129286n.subtract(this.f129285m);
    }

    /* JADX INFO: renamed from: L */
    public SettingGroups m150937L() {
        if (!NullChecker.m81303a(this.f129277e) || !NullChecker.m81303a(this.f129278f) || !CoreModule.m29931H().signedIn_()) {
            return null;
        }
        SettingGroups settingGroups = new SettingGroups();
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        settingGroups.search = userSearchSettings;
        userSearchSettings.lookingForGender = this.f129278f.getLookingFor();
        settingGroups.search.ageAllowedMinimum = this.f129278f.getSearchAgeAllowedMinimum();
        settingGroups.search.ageAllowedMaximum = this.f129278f.getSearchAgeAllowedMaximum();
        settingGroups.search.minAge = this.f129278f.getSearchMinAge();
        settingGroups.search.maxAge = this.f129278f.getSearchMaxAge();
        settingGroups.search.radius = this.f129278f.getSearchRadius();
        settingGroups.search.radiusAllowedMinimum = this.f129278f.getRadiusAllowedMinimum();
        settingGroups.search.radiusAllowedMaximum = this.f129278f.getRadiusAllowedMaximum();
        settingGroups.search.priorities = this.f129278f.getSearchPriority();
        settingGroups.search.autoAdjustRadius = this.f129278f.autoAdjustSuggestRadius();
        if (CoreModule.m29935P().m94651a().mo33406Sk()) {
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            settingGroups.privacy = userPrivacySettings;
            userPrivacySettings.hideContacts = this.f129278f.hideContacts();
        }
        return settingGroups.subtract(this.f129277e.settings.getSettingGroup());
    }

    /* JADX INFO: renamed from: M */
    public String m150938M() {
        return this.f129287o;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m150939N(AdvancedSettings advancedSettings) {
        boolean z = false;
        if (NullChecker.m81303a(advancedSettings)) {
            if (NullChecker.m81303a(advancedSettings.popular)) {
                advancedSettings.popular = this.f129285m.popular;
                z = true;
            }
            if (NullChecker.m81303a(advancedSettings.online)) {
                advancedSettings.online = this.f129285m.online;
                z = true;
            }
            if (NullChecker.m81303a(advancedSettings.newUser)) {
                advancedSettings.newUser = this.f129285m.newUser;
                z = true;
            }
            if (NullChecker.m81303a(advancedSettings.zodiacs)) {
                advancedSettings.zodiacs = this.f129285m.zodiacs;
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m150940O(AdvancedSettings advancedSettings) {
        return NullChecker.m81303a(advancedSettings) && CoreModule.f17545c.f19639e0.m169527p9().isPicVerificationVerified() && NullChecker.m81303a(advancedSettings.realFace) && !advancedSettings.realFace.equals(this.f129285m.realFace);
    }

    /* JADX INFO: renamed from: P */
    public final boolean m150941P(AdvancedSettings advancedSettings) {
        return NullChecker.m81303a(advancedSettings) && TEnum.equals(this.f129278f.verification.studies.status, "verified") && NullChecker.m81303a(advancedSettings.student) && !advancedSettings.student.equals(this.f129285m.student);
    }

    /* JADX INFO: renamed from: Q */
    public void m150942Q() {
        this.f129279g = mjj.m154842c(this.f129275c, false);
        u640 u640Var = new u640(this.f129275c);
        this.f129283k = u640Var;
        y640 y640Var = new y640(this.f129275c);
        this.f129284l = y640Var;
        u640Var.mo51532C(y640Var);
        this.f129284l.mo21065i1(this.f129283k);
        this.f129284l.mo137127v(((wq20) this.f70081a).m205002x());
        this.f129284l.m213075E("p_advanced_filter_page");
        xe20 xe20Var = new xe20(this.f129275c);
        this.f129281i = xe20Var;
        ff20 ff20Var = new ff20(this.f129275c);
        this.f129282j = ff20Var;
        xe20Var.mo51532C(ff20Var);
        this.f129282j.mo21065i1(this.f129281i);
        this.f129282j.m121093s(((wq20) this.f70081a).m205001w());
        this.f129282j.m121083F("p_advanced_filter_page");
        ((wq20) this.f70081a).m204994O(this.f129284l.f196509a);
        CoreModule.f17545c.f19564F0.m99250q3();
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    /* JADX INFO: renamed from: S */
    public void m150943S() {
        m150942Q();
        duringCreated(CoreModule.f17545c.f19663m0.m31118j9().switchMap(new w9j() { // from class: l.jp20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19639e0.m169523o9();
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.up20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177569a.m150913Y((User) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19564F0.m99252s3().switchMap(new w9j() { // from class: l.dq20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19564F0.m99241h3();
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.eq20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92752a.m150914Z((AdvancedSettings) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).distinctUntilChanged().filter(new w9j() { // from class: l.fq20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.gq20
            @Override // p149l.e30
            public final void call(Object obj) {
                lq20.m150921k((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9().map(new w9j() { // from class: l.hq20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).age;
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.iq20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114370a.m150949a0((Integer) obj);
            }
        }));
        if (lqa.m150968f()) {
            duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).map(new w9j() { // from class: l.jq20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((User) obj).profile.extensions.basic.ideal;
                }
            }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.kq20
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f124220a.m150948X((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m150944T(d90 d90Var) {
        da0.m110520a().m110523d(d90Var.mo110405b());
        ((wq20) this.f70081a).m204997S(TextUtils.isEmpty(d90Var.mo110405b()) ? m96966b().string(R$string.f27885l3) : d90Var.mo110405b());
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m150945U(DoublePair doublePair) {
        boolean zEquals = DoublePair.new_().equals(doublePair);
        V v2 = this.f70081a;
        if (zEquals) {
            ((wq20) v2).m204999s(m96966b().string(R$string.f27891m3), TextUtils.isEmpty(da0.m110520a().m110522b()) ? m96966b().string(R$string.f27885l3) : da0.m110520a().m110522b());
        } else {
            ((wq20) v2).m204999s(m96966b().string(R$string.f27897n3), TextUtils.isEmpty(da0.m110520a().m110522b()) ? m96966b().string(R$string.f27885l3) : da0.m110520a().m110522b());
            this.f129279g.m154844e(this.f129275c, doublePair.first, doublePair.second, new e30() { // from class: l.aq20
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f71124a.m150944T((d90) obj);
                }
            }, new e30() { // from class: l.bq20
                @Override // p149l.e30
                public final void call(Object obj) {
                    App.f15368d.m20433k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m150946V(d90 d90Var) {
        da0.m110520a().m110523d(d90Var.mo110405b());
        ((wq20) this.f70081a).m204997S(TextUtils.isEmpty(d90Var.mo110405b()) ? m96966b().string(R$string.f27885l3) : d90Var.mo110405b());
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m150947W(Location location) {
        DoublePair doublePairNew_ = DoublePair.new_();
        doublePairNew_.first = location.m78831u();
        doublePairNew_.second = location.m78833x();
        if (DoublePair.new_().equals(CoreModule.f17545c.f19639e0.m169527p9().getLatitudeAndLongitude())) {
            this.f129279g.m154844e(this.f129275c, doublePairNew_.first, doublePairNew_.second, new e30() { // from class: l.yp20
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f199385a.m150946V((d90) obj);
                }
            }, new e30() { // from class: l.zp20
                @Override // p149l.e30
                public final void call(Object obj) {
                    App.f15368d.m20433k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m150948X(List list) {
        ((wq20) this.f70081a).m204991L(true);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m150949a0(Integer num) {
        if (!this.f129280h) {
            Settings settings = this.f129278f;
            if (settings == null) {
                return;
            } else {
                ((wq20) this.f70081a).m204987B(settings);
            }
        }
        this.f129280h = false;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m150950b0() {
        yki0.m215127b().m215132d();
        String strM215131c = yki0.m215127b().m215131c();
        OMSThemeInfo oMSThemeInfoM215130a = yki0.m215127b().m215130a();
        if (!NullChecker.m81303a(oMSThemeInfoM215130a) || TextUtils.isEmpty(strM215131c)) {
            return;
        }
        m96966b().startActivity(CoreModule.f17557o.m195057d().mo33883md(this.f129275c, null, strM215131c, true, false, false));
        zvf0.m220371D("e_switch_h5", "p_suggest_users_home_view", vwb.m200311Y("answer_complete_ornot", oMSThemeInfoM215130a.questionnaireFinished ? "yes" : "no"));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ C22306c m150951c0(AdvancedSettings advancedSettings, roj0 roj0Var) {
        if (NullChecker.m81303a(advancedSettings)) {
            if (CoreModule.f17545c.f19639e0.m169527p9().isVIP() || xma.m210097y3()) {
                return CoreModule.f17545c.f19564F0.m99248o3(advancedSettings, true);
            }
            if (m150941P(advancedSettings) || m150940O(advancedSettings)) {
                m150935J(advancedSettings);
                return CoreModule.f17545c.f19564F0.m99248o3(advancedSettings, true);
            }
        }
        return C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m150952d0() {
        return CoreModule.f17545c.f19639e0.m169527p9().isVIP();
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m150953e0(AdvancedSettings advancedSettings) {
        if (advancedSettings == null || CoreModule.f17545c.f19639e0.m169527p9().isPicVerificationVerified() || !NullChecker.m81303a(advancedSettings.realFace) || advancedSettings.realFace.equals(this.f129285m.realFace)) {
            return false;
        }
        advancedSettings.realFace = this.f129285m.realFace;
        return true;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m150954f0(AdvancedSettings advancedSettings) {
        if (advancedSettings == null || TEnum.equals(this.f129278f.verification.studies.status, "verified") || !NullChecker.m81303a(advancedSettings.student) || advancedSettings.student.equals(this.f129285m.student)) {
            return false;
        }
        advancedSettings.student = this.f129285m.student;
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    public void m150955g0() {
        this.f129276d.dismiss();
        m150956h0();
        zvf0.m220396r("e_advanced_filter_save", "p_advanced_filter_page");
        if (CoreModule.f17557o.m195057d().mo33749Rq(this.f129275c) && this.f129289q) {
            e51.m114743H(this.f129275c, new Runnable() { // from class: l.kp20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f124095a.m150950b0();
                }
            }, 500L);
        }
        d30 d30Var = this.f129288p;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX INFO: renamed from: h0 */
    public void m150956h0() {
        boolean z;
        boolean z2 = true;
        if (!lqa.m150968f()) {
            z = false;
        } else if (vwb.m200296J(((wq20) this.f70081a).f187616e.getOriginIdealTag())) {
            if (pj90.m169806s(CoreModule.f17545c.f19639e0.m169527p9())) {
                CoreModule.f17545c.f19663m0.m31097e8();
                z = true;
            } else {
                z = false;
            }
        } else if (pj90.m169806s(CoreModule.f17545c.f19639e0.m169527p9()) && vwb.m200335l(((wq20) this.f70081a).f187616e.getOriginIdealTag(), CoreModule.f17545c.f19639e0.m169527p9().profile.extensions.basic.ideal, new kn20())) {
            z = false;
        } else {
            z = true;
        }
        if (NullChecker.m81303a(this.f129277e) && NullChecker.m81303a(this.f129278f) && CoreModule.m29931H().signedIn_()) {
            SettingGroups settingGroupsM150937L = m150937L();
            if (NullChecker.m81303a(settingGroupsM150937L) || m150959k0()) {
                final AdvancedSettings advancedSettingsM150936K = m150936K();
                if ((!CoreModule.f17545c.f19639e0.m169527p9().isVIP() || advancedSettingsM150936K == null) && ((!xma.m210097y3() || advancedSettingsM150936K == null) && !m150941P(advancedSettingsM150936K) && !m150940O(advancedSettingsM150936K))) {
                    z2 = false;
                }
                CoreModule.f17545c.f19663m0.m31124l8(settingGroupsM150937L, z2).switchMap(new w9j() { // from class: l.qp20
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f155665a.m150951c0(advancedSettingsM150936K, (roj0) obj);
                    }
                }).subscribe(mkd0.m154956H(new e30() { // from class: l.rp20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        b9l.m100816a(Settings.TYPE);
                    }
                }, new e30() { // from class: l.sp20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        lq20.m150923m((Throwable) obj);
                    }
                }));
                return;
            }
            AdvancedSettings advancedSettingsM150936K2 = m150936K();
            if (!NullChecker.m81303a(advancedSettingsM150936K2)) {
                if (z) {
                    CoreModule.f17545c.f19663m0.m31019L5();
                }
            } else if (!xma.m210071e4() || xma.m210097y3()) {
                CoreModule.f17545c.f19564F0.m99248o3(advancedSettingsM150936K2, false).subscribe(mkd0.m154956H(new e30() { // from class: l.tp20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        b9l.m100816a(Settings.TYPE);
                    }
                }, new e30() { // from class: l.vp20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        lq20.m150916d((Throwable) obj);
                    }
                }));
            } else if (m150941P(advancedSettingsM150936K2) || m150940O(advancedSettingsM150936K2)) {
                m150935J(advancedSettingsM150936K2);
                CoreModule.f17545c.f19564F0.m99248o3(advancedSettingsM150936K2, false).subscribe(mkd0.m154956H(new e30() { // from class: l.wp20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        b9l.m100816a(Settings.TYPE);
                    }
                }, new e30() { // from class: l.xp20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        lq20.m150907E((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m150957i0(d30 d30Var) {
        this.f129288p = d30Var;
    }

    /* JADX INFO: renamed from: j0 */
    public void m150958j0(String str) {
        this.f129287o = str;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m150959k0() {
        if (NullChecker.m81303a(yki0.m215127b().m215130a()) && ((wq20) this.f70081a).m205003y() != CoreModule.f17545c.f19702z0.f106529V.get().booleanValue()) {
            OMSThemeInfo oMSThemeInfoM215130a = yki0.m215127b().m215130a();
            boolean zM205003y = ((wq20) this.f70081a).m205003y();
            if (oMSThemeInfoM215130a.questionnaireFinished) {
                CoreModule.f17545c.f19702z0.f106529V.put(Boolean.valueOf(zM205003y));
                yki0.m215127b().m215139l(zM205003y);
                return true;
            }
            if (zM205003y) {
                this.f129289q = true;
            }
        }
        return false;
    }
}
