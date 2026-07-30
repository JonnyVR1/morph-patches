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
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserSearchSettings;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.aj2;
import l.d90;
import l.e0e;
import l.e30;
import l.mjj;
import l.mkd0;
import l.roj0;
import l.s7m;
import l.w9j;
import l.yij0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class eoo extends aj2<ioo> {

    /* JADX INFO: renamed from: c */
    public Act f11305c;

    /* JADX INFO: renamed from: d */
    public BottomSheetDialog f11306d;

    /* JADX INFO: renamed from: e */
    public User f11307e;

    /* JADX INFO: renamed from: f */
    public Settings f11308f;

    /* JADX INFO: renamed from: g */
    public mjj f11309g;

    /* JADX INFO: renamed from: h */
    public AdvancedSettings f11310h;

    /* JADX INFO: renamed from: i */
    public AdvancedSettings f11311i;

    public eoo(Act act, e0e e0eVar) {
        super(e0eVar);
        this.f11305c = act;
        this.f11306d = (BottomSheetDialog) e0eVar;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14712B(Throwable th) {
        CoreModule.f1534c.f3652m0.m3095z5(false);
        yij0.D(th);
    }

    /* JADX INFO: renamed from: H */
    private void m14713H() {
        duringCreated(CoreModule.f1534c.f3628e0.m21486o9()).map(new w9j() { // from class: l.boo
            public final Object call(Object obj) {
                return ((User) obj).getLatitudeAndLongitude();
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.coo
            public final void call(Object obj) {
                this.f9770a.m14739J((DoublePair) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3628e0.m21486o9().filter(new w9j() { // from class: l.doo
            public final Object call(Object obj) {
                return Boolean.valueOf(DoublePair.new_().equals(((User) obj).getLatitudeAndLongitude()));
            }
        }).switchMap(new w9j() { // from class: l.jno
            public final Object call(Object obj) {
                return qib0.f19778E.p().filter(new w9j() { // from class: l.sno
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(CoreModule.m1850H().signedIn_());
                    }
                });
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.kno
            public final void call(Object obj) {
                this.f15918a.m14741L((Location) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ c m14716e(AdvancedSettings advancedSettings, roj0 roj0Var) {
        return NullChecker.a(advancedSettings) ? CoreModule.f1534c.f3553F0.m12315o3(advancedSettings, true) : c.just(roj0.a);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m14720k(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m14722m(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m14724o(NetworkInfo networkInfo) {
        CoreModule.f1534c.f3553F0.m12317q3();
        CoreModule.f1534c.f3544C0.m27420u4();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m14728u(Throwable th) {
        CoreModule.f1534c.f3652m0.m3095z5(false);
        yij0.D(th);
    }

    /* JADX INFO: renamed from: D */
    public void m14734D() {
        this.f11306d.dismiss();
    }

    /* JADX INFO: renamed from: E */
    public AdvancedSettings m14735E() {
        AdvancedSettings advancedSettings = this.f11311i;
        if (advancedSettings == null || this.f11310h == null) {
            return null;
        }
        ((ioo) ((aj2) this).a).m16766q(advancedSettings);
        return this.f11311i.subtract(this.f11310h);
    }

    /* JADX INFO: renamed from: F */
    public SettingGroups m14736F() {
        if (!NullChecker.a(this.f11307e) || !NullChecker.a(this.f11308f) || !CoreModule.m1850H().signedIn_()) {
            return null;
        }
        SettingGroups settingGroups = new SettingGroups();
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        settingGroups.search = userSearchSettings;
        userSearchSettings.lookingForGender = this.f11308f.getLookingFor();
        settingGroups.search.ageAllowedMinimum = this.f11308f.getSearchAgeAllowedMinimum();
        settingGroups.search.ageAllowedMaximum = this.f11308f.getSearchAgeAllowedMaximum();
        settingGroups.search.minAge = this.f11308f.getSearchMinAge();
        settingGroups.search.maxAge = this.f11308f.getSearchMaxAge();
        settingGroups.search.radius = this.f11308f.getSearchRadius();
        settingGroups.search.radiusAllowedMinimum = this.f11308f.getRadiusAllowedMinimum();
        settingGroups.search.radiusAllowedMaximum = this.f11308f.getRadiusAllowedMaximum();
        settingGroups.search.priorities = this.f11308f.getSearchPriority();
        settingGroups.search.autoAdjustRadius = this.f11308f.autoAdjustSuggestRadius();
        return settingGroups.subtract(this.f11307e.settings.getSettingGroup());
    }

    /* JADX INFO: renamed from: G */
    public void m14737G() {
        this.f11309g = mjj.c(this.f11305c, false);
        CoreModule.f1534c.f3553F0.m12317q3();
        CoreModule.f1534c.f3544C0.m27420u4();
    }

    /* JADX INFO: renamed from: I */
    public void m14738I() {
        m14737G();
        this.f11305c.lifecycle().subscribe(mkd0.G(new e30() { // from class: l.ino
            public final void call(Object obj) {
                this.f14583a.m14743N((com.p1.mobile.android.app.c) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3652m0.m3048j9().switchMap(new w9j() { // from class: l.tno
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3628e0.m21486o9();
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.wno
            public final void call(Object obj) {
                this.f25258a.m14744O((User) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3553F0.m12319s3().switchMap(new w9j() { // from class: l.xno
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3553F0.m12308h3();
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.yno
            public final void call(Object obj) {
                this.f28311a.m14745P((AdvancedSettings) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m()).skip(1).distinctUntilChanged().filter(new w9j() { // from class: l.zno
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.aoo
            public final void call(Object obj) {
                eoo.m14724o((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m14739J(DoublePair doublePair) {
        boolean zEquals = DoublePair.new_().equals(doublePair);
        s7m s7mVar = ((aj2) this).a;
        if (zEquals) {
            ((ioo) s7mVar).m16759e(b().string(R.string.m3), TextUtils.isEmpty(da0.m13862a().m13864b()) ? b().string(R.string.l3) : da0.m13862a().m13864b());
        } else {
            ((ioo) s7mVar).m16759e(b().string(R.string.n3), TextUtils.isEmpty(da0.m13862a().m13864b()) ? b().string(R.string.l3) : da0.m13862a().m13864b());
            this.f11309g.e(this.f11305c, doublePair.first, doublePair.second, new e30() { // from class: l.qno
                public final void call(Object obj) {
                    this.f19946a.m14742M((d90) obj);
                }
            }, new e30() { // from class: l.rno
                public final void call(Object obj) {
                    App.d.k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m14740K(d90 d90Var) {
        da0.m13862a().m13865d(d90Var.b());
        ((ioo) ((aj2) this).a).m16768u(TextUtils.isEmpty(d90Var.b()) ? b().string(R.string.l3) : d90Var.b());
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m14741L(Location location) {
        DoublePair doublePairNew_ = DoublePair.new_();
        doublePairNew_.first = location.u();
        doublePairNew_.second = location.x();
        if (DoublePair.new_().equals(CoreModule.f1534c.f3628e0.m21490p9().getLatitudeAndLongitude())) {
            this.f11309g.e(this.f11305c, doublePairNew_.first, doublePairNew_.second, new e30() { // from class: l.uno
                public final void call(Object obj) {
                    this.f23674a.m14740K((d90) obj);
                }
            }, new e30() { // from class: l.vno
                public final void call(Object obj) {
                    App.d.k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m14742M(d90 d90Var) {
        da0.m13862a().m13865d(d90Var.b());
        ((ioo) ((aj2) this).a).m16768u(TextUtils.isEmpty(d90Var.b()) ? b().string(R.string.l3) : d90Var.b());
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m14743N(com.p1.mobile.android.app.c cVar) {
        if (cVar == com.p1.mobile.android.app.c.i) {
            ((ioo) ((aj2) this).a).m16767s(qib0.f19778E.q() == null);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m14744O(User user) {
        this.f11307e = user;
        Settings settings = this.f11308f;
        if (settings == null) {
            Settings settingsClone = user.settings.clone();
            this.f11308f = settingsClone;
            ((ioo) ((aj2) this).a).m16764k(settingsClone);
            m14713H();
            return;
        }
        Settings settings2 = user.settings;
        settings.birthdate = settings2.birthdate;
        settings.phoneNumber = settings2.phoneNumber;
        settings.getSettingGroup().privacy.hideContacts = user.settings.hideContacts();
        this.f11308f.getSettingGroup().privacy.hideMutualContacts = user.settings.hideMutualContacts();
        this.f11308f.getSettingGroup().push.previewMessage = user.settings.previewPushMessage();
        this.f11308f.getSettingGroup().push.showMomentLikes = user.settings.showMomentLikes();
        this.f11308f.getSettingGroup().privacy.hideSchool = user.settings.hideSchoolNameNoDefaults();
        this.f11308f.getSettingGroup().search.priorities = new ArrayList();
        ((SettingGroups) this.f11308f.settingGroups.get(0)).search.priorities.addAll(user.settings.getSearchPriority());
        if (qib0.f19804b0.f17706a.mo67rq(user.settings.getSettingGroup())) {
            this.f11308f.getSettingGroup().gender = user.settings.getSettingGroup().gender.clone();
            this.f11308f.getSettingGroup().search.lookingForGender = user.settings.getLookingFor();
            ((ioo) ((aj2) this).a).m16761i(this.f11308f);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m14745P(AdvancedSettings advancedSettings) {
        if (NullChecker.a(advancedSettings)) {
            this.f11310h = advancedSettings;
            AdvancedSettings advancedSettingsClone = advancedSettings.clone();
            this.f11311i = advancedSettingsClone;
            ((ioo) ((aj2) this).a).m16763j(advancedSettingsClone);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m14746Q() {
        this.f11306d.dismiss();
        m14747R();
    }

    /* JADX INFO: renamed from: R */
    public void m14747R() {
        if (NullChecker.a(this.f11307e) && NullChecker.a(this.f11308f) && CoreModule.m1850H().signedIn_()) {
            SettingGroups settingGroupsM14736F = m14736F();
            final AdvancedSettings advancedSettingsM14735E = m14735E();
            if (NullChecker.a(settingGroupsM14736F)) {
                CoreModule.f1534c.f3652m0.m3054l8(settingGroupsM14736F, NullChecker.a(advancedSettingsM14735E)).switchMap(new w9j() { // from class: l.lno
                    public final Object call(Object obj) {
                        return eoo.m14716e(advancedSettingsM14735E, (roj0) obj);
                    }
                }).subscribe(mkd0.H(new e30() { // from class: l.mno
                    public final void call(Object obj) {
                        eoo.m14722m((roj0) obj);
                    }
                }, new e30() { // from class: l.nno
                    public final void call(Object obj) {
                        eoo.m14728u((Throwable) obj);
                    }
                }));
            } else if (NullChecker.a(advancedSettingsM14735E)) {
                CoreModule.f1534c.f3553F0.m12315o3(advancedSettingsM14735E, false).subscribe(mkd0.H(new e30() { // from class: l.ono
                    public final void call(Object obj) {
                        eoo.m14720k((roj0) obj);
                    }
                }, new e30() { // from class: l.pno
                    public final void call(Object obj) {
                        eoo.m14712B((Throwable) obj);
                    }
                }));
            }
        }
    }
}
