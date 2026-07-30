package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AdvancedSettings;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserSearchSettings;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class eqo extends ij2<iqo> {

    /* JADX INFO: renamed from: c */
    public Act f95356c;

    /* JADX INFO: renamed from: d */
    public BottomSheetDialog f95357d;

    /* JADX INFO: renamed from: e */
    public User f95358e;

    /* JADX INFO: renamed from: f */
    public Settings f95359f;

    /* JADX INFO: renamed from: g */
    public fmj f95360g;

    /* JADX INFO: renamed from: h */
    public AdvancedSettings f95361h;

    /* JADX INFO: renamed from: i */
    public AdvancedSettings f95362i;

    /* JADX WARN: Multi-variable type inference failed */
    public eqo(Act act, s1e s1eVar) {
        super(s1eVar);
        this.f95356c = act;
        this.f95357d = (BottomSheetDialog) s1eVar;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m121954B(Throwable th) {
        CoreModule.f18264c.f20405m0.m32168z5(false);
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: H */
    private void m121955H() {
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).map(new qcj() { // from class: l.bqo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).getLatitudeAndLongitude();
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.cqo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83107a.m121981J((DoublePair) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9().filter(new qcj() { // from class: l.dqo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(DoublePair.new_().equals(((User) obj).getLatitudeAndLongitude()));
            }
        }).switchMap(new qcj() { // from class: l.jpo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uqb0.f180370E.m80047p().filter(new qcj() { // from class: l.spo
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(CoreModule.m30929H().signedIn_());
                    }
                });
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.kpo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127902a.m121983L((Location) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C22421c m121958e(AdvancedSettings advancedSettings, uxj0 uxj0Var) {
        return NullChecker.m82486a(advancedSettings) ? CoreModule.f18264c.f20306F0.m118452o3(advancedSettings, true) : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m121962k(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m121964m(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m121966o(NetworkInfo networkInfo) {
        CoreModule.f18264c.f20306F0.m118454q3();
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m121970u(Throwable th) {
        CoreModule.f18264c.f20405m0.m32168z5(false);
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: D */
    public void m121976D() {
        this.f95357d.dismiss();
    }

    /* JADX INFO: renamed from: E */
    public AdvancedSettings m121977E() {
        AdvancedSettings advancedSettings = this.f95362i;
        if (advancedSettings == null || this.f95361h == null) {
            return null;
        }
        ((iqo) this.f115168a).m141696q(advancedSettings);
        return this.f95362i.subtract(this.f95361h);
    }

    /* JADX INFO: renamed from: F */
    public SettingGroups m121978F() {
        if (!NullChecker.m82486a(this.f95358e) || !NullChecker.m82486a(this.f95359f) || !CoreModule.m30929H().signedIn_()) {
            return null;
        }
        SettingGroups settingGroups = new SettingGroups();
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        settingGroups.search = userSearchSettings;
        userSearchSettings.lookingForGender = this.f95359f.getLookingFor();
        settingGroups.search.ageAllowedMinimum = this.f95359f.getSearchAgeAllowedMinimum();
        settingGroups.search.ageAllowedMaximum = this.f95359f.getSearchAgeAllowedMaximum();
        settingGroups.search.minAge = this.f95359f.getSearchMinAge();
        settingGroups.search.maxAge = this.f95359f.getSearchMaxAge();
        settingGroups.search.radius = this.f95359f.getSearchRadius();
        settingGroups.search.radiusAllowedMinimum = this.f95359f.getRadiusAllowedMinimum();
        settingGroups.search.radiusAllowedMaximum = this.f95359f.getRadiusAllowedMaximum();
        settingGroups.search.priorities = this.f95359f.getSearchPriority();
        settingGroups.search.autoAdjustRadius = this.f95359f.autoAdjustSuggestRadius();
        return settingGroups.subtract(this.f95358e.settings.getSettingGroup());
    }

    /* JADX INFO: renamed from: G */
    public void m121979G() {
        this.f95360g = fmj.m126236c(this.f95356c, false);
        CoreModule.f18264c.f20306F0.m118454q3();
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: renamed from: I */
    public void m121980I() {
        m121979G();
        this.f95356c.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.ipo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116293a.m121985N((C4470c) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.m32121j9().switchMap(new qcj() { // from class: l.tpo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20381e0.m116596o9();
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.wpo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190326a.m121986O((User) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20306F0.m118456s3().switchMap(new qcj() { // from class: l.xpo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20306F0.m118445h3();
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.ypo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201077a.m121987P((AdvancedSettings) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).distinctUntilChanged().filter(new qcj() { // from class: l.zpo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.aqo
            @Override // p153l.y20
            public final void call(Object obj) {
                eqo.m121966o((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m121981J(DoublePair doublePair) {
        boolean zEquals = DoublePair.new_().equals(doublePair);
        V v2 = this.f115168a;
        if (zEquals) {
            ((iqo) v2).m141690e(m140179b().string(R$string.f28739m3), TextUtils.isEmpty(z90.m219037a().m219039b()) ? m140179b().string(R$string.f28733l3) : z90.m219037a().m219039b());
        } else {
            ((iqo) v2).m141690e(m140179b().string(R$string.f28745n3), TextUtils.isEmpty(z90.m219037a().m219039b()) ? m140179b().string(R$string.f28733l3) : z90.m219037a().m219039b());
            this.f95360g.m126239e(this.f95356c, doublePair.first, doublePair.second, new y20() { // from class: l.qpo
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f158890a.m121984M((z80) obj);
                }
            }, new y20() { // from class: l.rpo
                @Override // p153l.y20
                public final void call(Object obj) {
                    App.f16087d.m21432k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m121982K(z80 z80Var) {
        z90.m219037a().m219040d(z80Var.mo143670b());
        ((iqo) this.f115168a).m141698u(TextUtils.isEmpty(z80Var.mo143670b()) ? m140179b().string(R$string.f28733l3) : z80Var.mo143670b());
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m121983L(Location location) {
        DoublePair doublePairNew_ = DoublePair.new_();
        doublePairNew_.first = location.m80014u();
        doublePairNew_.second = location.m80016x();
        if (DoublePair.new_().equals(CoreModule.f18264c.f20381e0.m116600p9().getLatitudeAndLongitude())) {
            this.f95360g.m126239e(this.f95356c, doublePairNew_.first, doublePairNew_.second, new y20() { // from class: l.upo
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f180301a.m121982K((z80) obj);
                }
            }, new y20() { // from class: l.vpo
                @Override // p153l.y20
                public final void call(Object obj) {
                    App.f16087d.m21432k((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m121984M(z80 z80Var) {
        z90.m219037a().m219040d(z80Var.mo143670b());
        ((iqo) this.f115168a).m141698u(TextUtils.isEmpty(z80Var.mo143670b()) ? m140179b().string(R$string.f28733l3) : z80Var.mo143670b());
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m121985N(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            ((iqo) this.f115168a).m141697s(uqb0.f180370E.m80048q() == null);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m121986O(User user) {
        this.f95358e = user;
        Settings settings = this.f95359f;
        if (settings == null) {
            Settings settingsMo225055clone = user.settings.mo225055clone();
            this.f95359f = settingsMo225055clone;
            ((iqo) this.f115168a).m141694k(settingsMo225055clone);
            m121955H();
            return;
        }
        Settings settings2 = user.settings;
        settings.birthdate = settings2.birthdate;
        settings.phoneNumber = settings2.phoneNumber;
        settings.getSettingGroup().privacy.hideContacts = user.settings.hideContacts();
        this.f95359f.getSettingGroup().privacy.hideMutualContacts = user.settings.hideMutualContacts();
        this.f95359f.getSettingGroup().push.previewMessage = user.settings.previewPushMessage();
        this.f95359f.getSettingGroup().push.showMomentLikes = user.settings.showMomentLikes();
        this.f95359f.getSettingGroup().privacy.hideSchool = user.settings.hideSchoolNameNoDefaults();
        this.f95359f.getSettingGroup().search.priorities = new ArrayList();
        this.f95359f.settingGroups.get(0).search.priorities.addAll(user.settings.getSearchPriority());
        if (uqb0.f180396b0.f170324a.mo29171rq(user.settings.getSettingGroup())) {
            this.f95359f.getSettingGroup().gender = user.settings.getSettingGroup().gender.mo225055clone();
            this.f95359f.getSettingGroup().search.lookingForGender = user.settings.getLookingFor();
            ((iqo) this.f115168a).m141692i(this.f95359f);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m121987P(AdvancedSettings advancedSettings) {
        if (NullChecker.m82486a(advancedSettings)) {
            this.f95361h = advancedSettings;
            AdvancedSettings advancedSettingsMo225055clone = advancedSettings.mo225055clone();
            this.f95362i = advancedSettingsMo225055clone;
            ((iqo) this.f115168a).m141693j(advancedSettingsMo225055clone);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m121988Q() {
        this.f95357d.dismiss();
        m121989R();
    }

    /* JADX INFO: renamed from: R */
    public void m121989R() {
        if (NullChecker.m82486a(this.f95358e) && NullChecker.m82486a(this.f95359f) && CoreModule.m30929H().signedIn_()) {
            SettingGroups settingGroupsM121978F = m121978F();
            final AdvancedSettings advancedSettingsM121977E = m121977E();
            if (NullChecker.m82486a(settingGroupsM121978F)) {
                CoreModule.f18264c.f20405m0.m32127l8(settingGroupsM121978F, NullChecker.m82486a(advancedSettingsM121977E)).switchMap(new qcj() { // from class: l.lpo
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return eqo.m121958e(advancedSettingsM121977E, (uxj0) obj);
                    }
                }).subscribe(psd0.m173597H(new y20() { // from class: l.mpo
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        eqo.m121964m((uxj0) obj);
                    }
                }, new y20() { // from class: l.npo
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        eqo.m121970u((Throwable) obj);
                    }
                }));
            } else if (NullChecker.m82486a(advancedSettingsM121977E)) {
                CoreModule.f18264c.f20306F0.m118452o3(advancedSettingsM121977E, false).subscribe(psd0.m173597H(new y20() { // from class: l.opo
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        eqo.m121962k((uxj0) obj);
                    }
                }, new y20() { // from class: l.ppo
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        eqo.m121954B((Throwable) obj);
                    }
                }));
            }
        }
    }
}
