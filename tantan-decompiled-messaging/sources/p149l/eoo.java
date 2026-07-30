package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AdvancedSettings;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserSearchSettings;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class eoo extends aj2<ioo> {

    /* JADX INFO: renamed from: c */
    public Act f92478c;

    /* JADX INFO: renamed from: d */
    public BottomSheetDialog f92479d;

    /* JADX INFO: renamed from: e */
    public User f92480e;

    /* JADX INFO: renamed from: f */
    public Settings f92481f;

    /* JADX INFO: renamed from: g */
    public mjj f92482g;

    /* JADX INFO: renamed from: h */
    public AdvancedSettings f92483h;

    /* JADX INFO: renamed from: i */
    public AdvancedSettings f92484i;

    /* JADX WARN: Multi-variable type inference failed */
    public eoo(Act act, e0e e0eVar) {
        super(e0eVar);
        this.f92478c = act;
        this.f92479d = (BottomSheetDialog) e0eVar;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m117420B(Throwable th) {
        CoreModule.f17545c.f19663m0.m31165z5(false);
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: H */
    private void m117421H() {
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).map(new w9j() { // from class: l.boo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).getLatitudeAndLongitude();
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.coo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81852a.m117447J((DoublePair) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9().filter(new w9j() { // from class: l.doo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(DoublePair.new_().equals(((User) obj).getLatitudeAndLongitude()));
            }
        }).switchMap(new w9j() { // from class: l.jno
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qib0.f154687E.m78864p().filter(new w9j() { // from class: l.sno
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(CoreModule.m29931H().signedIn_());
                    }
                });
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.kno
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123900a.m117449L((Location) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C22306c m117424e(AdvancedSettings advancedSettings, roj0 roj0Var) {
        return NullChecker.m81303a(advancedSettings) ? CoreModule.f17545c.f19564F0.m99248o3(advancedSettings, true) : C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m117428k(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m117430m(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m117432o(NetworkInfo networkInfo) {
        CoreModule.f17545c.f19564F0.m99250q3();
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m117436u(Throwable th) {
        CoreModule.f17545c.f19663m0.m31165z5(false);
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: D */
    public void m117442D() {
        this.f92479d.dismiss();
    }

    /* JADX INFO: renamed from: E */
    public AdvancedSettings m117443E() {
        AdvancedSettings advancedSettings = this.f92484i;
        if (advancedSettings == null || this.f92483h == null) {
            return null;
        }
        ((ioo) this.f70081a).m137362q(advancedSettings);
        return this.f92484i.subtract(this.f92483h);
    }

    /* JADX INFO: renamed from: F */
    public SettingGroups m117444F() {
        if (!NullChecker.m81303a(this.f92480e) || !NullChecker.m81303a(this.f92481f) || !CoreModule.m29931H().signedIn_()) {
            return null;
        }
        SettingGroups settingGroups = new SettingGroups();
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        settingGroups.search = userSearchSettings;
        userSearchSettings.lookingForGender = this.f92481f.getLookingFor();
        settingGroups.search.ageAllowedMinimum = this.f92481f.getSearchAgeAllowedMinimum();
        settingGroups.search.ageAllowedMaximum = this.f92481f.getSearchAgeAllowedMaximum();
        settingGroups.search.minAge = this.f92481f.getSearchMinAge();
        settingGroups.search.maxAge = this.f92481f.getSearchMaxAge();
        settingGroups.search.radius = this.f92481f.getSearchRadius();
        settingGroups.search.radiusAllowedMinimum = this.f92481f.getRadiusAllowedMinimum();
        settingGroups.search.radiusAllowedMaximum = this.f92481f.getRadiusAllowedMaximum();
        settingGroups.search.priorities = this.f92481f.getSearchPriority();
        settingGroups.search.autoAdjustRadius = this.f92481f.autoAdjustSuggestRadius();
        return settingGroups.subtract(this.f92480e.settings.getSettingGroup());
    }

    /* JADX INFO: renamed from: G */
    public void m117445G() {
        this.f92482g = mjj.m154842c(this.f92478c, false);
        CoreModule.f17545c.f19564F0.m99250q3();
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    /* JADX INFO: renamed from: I */
    public void m117446I() {
        m117445G();
        this.f92478c.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.ino
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114027a.m117451N((C4319c) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.m31118j9().switchMap(new w9j() { // from class: l.tno
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19639e0.m169523o9();
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.wno
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187319a.m117452O((User) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19564F0.m99252s3().switchMap(new w9j() { // from class: l.xno
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19564F0.m99241h3();
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.yno
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199192a.m117453P((AdvancedSettings) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).distinctUntilChanged().filter(new w9j() { // from class: l.zno
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.aoo
            @Override // p149l.e30
            public final void call(Object obj) {
                eoo.m117432o((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m117447J(DoublePair doublePair) {
        boolean zEquals = DoublePair.new_().equals(doublePair);
        V v2 = this.f70081a;
        if (zEquals) {
            ((ioo) v2).m137356e(m96966b().string(R$string.f27891m3), TextUtils.isEmpty(da0.m110520a().m110522b()) ? m96966b().string(R$string.f27885l3) : da0.m110520a().m110522b());
        } else {
            ((ioo) v2).m137356e(m96966b().string(R$string.f27897n3), TextUtils.isEmpty(da0.m110520a().m110522b()) ? m96966b().string(R$string.f27885l3) : da0.m110520a().m110522b());
            this.f92482g.m154844e(this.f92478c, doublePair.first, doublePair.second, new e30() { // from class: l.qno
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f155485a.m117450M((d90) obj);
                }
            }, new e30() { // from class: l.rno
                @Override // p149l.e30
                public final void call(Object obj) {
                    App.f15368d.m20433k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m117448K(d90 d90Var) {
        da0.m110520a().m110523d(d90Var.mo110405b());
        ((ioo) this.f70081a).m137364u(TextUtils.isEmpty(d90Var.mo110405b()) ? m96966b().string(R$string.f27885l3) : d90Var.mo110405b());
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m117449L(Location location) {
        DoublePair doublePairNew_ = DoublePair.new_();
        doublePairNew_.first = location.m78831u();
        doublePairNew_.second = location.m78833x();
        if (DoublePair.new_().equals(CoreModule.f17545c.f19639e0.m169527p9().getLatitudeAndLongitude())) {
            this.f92482g.m154844e(this.f92478c, doublePairNew_.first, doublePairNew_.second, new e30() { // from class: l.uno
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f177405a.m117448K((d90) obj);
                }
            }, new e30() { // from class: l.vno
                @Override // p149l.e30
                public final void call(Object obj) {
                    App.f15368d.m20433k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m117450M(d90 d90Var) {
        da0.m110520a().m110523d(d90Var.mo110405b());
        ((ioo) this.f70081a).m137364u(TextUtils.isEmpty(d90Var.mo110405b()) ? m96966b().string(R$string.f27885l3) : d90Var.mo110405b());
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m117451N(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            ((ioo) this.f70081a).m137363s(qib0.f154687E.m78865q() == null);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m117452O(User user) {
        this.f92480e = user;
        Settings settings = this.f92481f;
        if (settings == null) {
            Settings settingsMo223809clone = user.settings.mo223809clone();
            this.f92481f = settingsMo223809clone;
            ((ioo) this.f70081a).m137360k(settingsMo223809clone);
            m117421H();
            return;
        }
        Settings settings2 = user.settings;
        settings.birthdate = settings2.birthdate;
        settings.phoneNumber = settings2.phoneNumber;
        settings.getSettingGroup().privacy.hideContacts = user.settings.hideContacts();
        this.f92481f.getSettingGroup().privacy.hideMutualContacts = user.settings.hideMutualContacts();
        this.f92481f.getSettingGroup().push.previewMessage = user.settings.previewPushMessage();
        this.f92481f.getSettingGroup().push.showMomentLikes = user.settings.showMomentLikes();
        this.f92481f.getSettingGroup().privacy.hideSchool = user.settings.hideSchoolNameNoDefaults();
        this.f92481f.getSettingGroup().search.priorities = new ArrayList();
        this.f92481f.settingGroups.get(0).search.priorities.addAll(user.settings.getSearchPriority());
        if (qib0.f154713b0.f139230a.mo28172rq(user.settings.getSettingGroup())) {
            this.f92481f.getSettingGroup().gender = user.settings.getSettingGroup().gender.mo223809clone();
            this.f92481f.getSettingGroup().search.lookingForGender = user.settings.getLookingFor();
            ((ioo) this.f70081a).m137358i(this.f92481f);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m117453P(AdvancedSettings advancedSettings) {
        if (NullChecker.m81303a(advancedSettings)) {
            this.f92483h = advancedSettings;
            AdvancedSettings advancedSettingsMo223809clone = advancedSettings.mo223809clone();
            this.f92484i = advancedSettingsMo223809clone;
            ((ioo) this.f70081a).m137359j(advancedSettingsMo223809clone);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m117454Q() {
        this.f92479d.dismiss();
        m117455R();
    }

    /* JADX INFO: renamed from: R */
    public void m117455R() {
        if (NullChecker.m81303a(this.f92480e) && NullChecker.m81303a(this.f92481f) && CoreModule.m29931H().signedIn_()) {
            SettingGroups settingGroupsM117444F = m117444F();
            final AdvancedSettings advancedSettingsM117443E = m117443E();
            if (NullChecker.m81303a(settingGroupsM117444F)) {
                CoreModule.f17545c.f19663m0.m31124l8(settingGroupsM117444F, NullChecker.m81303a(advancedSettingsM117443E)).switchMap(new w9j() { // from class: l.lno
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return eoo.m117424e(advancedSettingsM117443E, (roj0) obj);
                    }
                }).subscribe(mkd0.m154956H(new e30() { // from class: l.mno
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        eoo.m117430m((roj0) obj);
                    }
                }, new e30() { // from class: l.nno
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        eoo.m117436u((Throwable) obj);
                    }
                }));
            } else if (NullChecker.m81303a(advancedSettingsM117443E)) {
                CoreModule.f17545c.f19564F0.m99248o3(advancedSettingsM117443E, false).subscribe(mkd0.m154956H(new e30() { // from class: l.ono
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        eoo.m117428k((roj0) obj);
                    }
                }, new e30() { // from class: l.pno
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        eoo.m117420B((Throwable) obj);
                    }
                }));
            }
        }
    }
}
