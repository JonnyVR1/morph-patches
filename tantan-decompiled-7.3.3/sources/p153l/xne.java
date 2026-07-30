package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserPrivacySettings;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class xne extends dy90 {
    public xne(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX INFO: renamed from: A0 */
    private void m212147A0() {
        final boolean z;
        if (mo53983O().mo52258P1() && mo53983O().mo52302m0()) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (NullChecker.m82486a(userM116600p9.settings) && NullChecker.m82487b(userM116600p9.settings.verification) && NullChecker.m82487b(userM116600p9.settings.verification.studies) && TEnum.equals(userM116600p9.settings.verification.studies.status, "pending")) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        m121843N(this.f91195z, new x20() { // from class: l.pne
            @Override // p153l.x20
            public final void call() {
                this.f153296a.m212165C0();
            }
        }, true);
        m121843N(this.f91173B, new x20() { // from class: l.sne
            @Override // p153l.x20
            public final void call() {
                this.f169675a.m212169G0(z);
            }
        }, true);
        m121843N(this.f91174C, new x20() { // from class: l.tne
            @Override // p153l.x20
            public final void call() {
                this.f175246a.m212170H0();
            }
        }, true);
        m121843N(this.f91175D, new x20() { // from class: l.une
            @Override // p153l.x20
            public final void call() {
                this.f179720a.m212171I0();
            }
        }, true);
        m121843N(this.f91178G, new x20() { // from class: l.vne
            @Override // p153l.x20
            public final void call() {
                this.f184874a.m212172J0(z);
            }
        }, true);
        m121843N(this.f91172A, new x20() { // from class: l.wne
            @Override // p153l.x20
            public final void call() {
                this.f189896a.m212173K0(z);
            }
        }, true);
        m121843N(this.f91180I, new x20() { // from class: l.ine
            @Override // p153l.x20
            public final void call() {
                this.f115920a.m212174L0();
            }
        }, true);
        m121843N(this.f91182K, new x20() { // from class: l.jne
            @Override // p153l.x20
            public final void call() {
                this.f121832a.m212175M0();
            }
        }, true);
        if (IntlCountryCodeController.m29113j()) {
            m121843N(this.f91192w, new x20() { // from class: l.kne
                @Override // p153l.x20
                public final void call() {
                    this.f127575a.m212176N0();
                }
            }, true);
            m121843N(this.f91193x, new x20() { // from class: l.lne
                @Override // p153l.x20
                public final void call() {
                    this.f132768a.m212166D0();
                }
            }, true);
        }
        m121843N(this.f91176E, new x20() { // from class: l.qne
            @Override // p153l.x20
            public final void call() {
                this.f158478a.m212167E0();
            }
        }, true);
        m121843N(this.f91177F, new x20() { // from class: l.rne
            @Override // p153l.x20
            public final void call() {
                this.f164015a.m212168F0();
            }
        }, true);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m212164B0(VText vText) {
        m121832C(m118652Z().getColor(c9c0.f80362O1), vText);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m212165C0() {
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.SCHOOL);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m212166D0() {
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.LANGUAGE);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m212167E0() {
        sfj0.m185596c("e_intl_edit_profile_view_degree", "p_edit_profile_view", new sfj0.C20032a[0]);
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.QUALIFICATION);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m212168F0() {
        sfj0.m185596c("e_intl_edit_profile_view_school", "p_edit_profile_view", new sfj0.C20032a[0]);
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.SCHOOL_NEW);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m212169G0(boolean z) {
        if (!z) {
            o1j0.m165651y("审核中，请稍后操作。");
        } else {
            sfj0.m185596c("e_edit_profile_my_info", "p_edit_profile_view", sfj0.C20032a.m185615h("edit_profile_my_info_name", "industry"));
            LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.INDUSTRY);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m212170H0() {
        if (mo53983O().m189086i2().profile.studies.active) {
            sfj0.m185596c("e_edit_profile_my_info", "p_edit_profile_view", sfj0.C20032a.m185615h("edit_profile_my_info_name", "department"));
            LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.MAJOR);
        } else {
            sfj0.m185596c("e_edit_profile_my_info", "p_edit_profile_view", sfj0.C20032a.m185615h("edit_profile_my_info_name", "job"));
            LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.DEPARTMENT);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m212171I0() {
        sfj0.m185596c("e_edit_profile_my_info", "p_edit_profile_view", sfj0.C20032a.m185615h("edit_profile_my_info_name", ProfileLikeCategoryType.company));
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.COMPANY);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m212172J0(boolean z) {
        if (!z) {
            o1j0.m165651y("审核中，请稍后操作。");
        } else if (mo53983O().m189086i2().profile.studies.verified) {
            sfj0.m185596c("e_edit_profile_my_info", "p_edit_profile_view", sfj0.C20032a.m185615h("edit_profile_my_info_name", "school"));
            LoopFragmentFactory.m52646G(mo53983O().mo52249J1());
        } else {
            sfj0.m185596c("e_edit_profile_my_info", "p_edit_profile_view", sfj0.C20032a.m185615h("edit_profile_my_info_name", "school"));
            LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.SCHOOL);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m212173K0(boolean z) {
        if (!z) {
            o1j0.m165651y("审核中，请稍后操作。");
        } else {
            sfj0.m185596c("e_edit_profile_my_info", "p_edit_profile_view", sfj0.C20032a.m185615h("edit_profile_my_info_name", "school"));
            LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.SCHOOL);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m212174L0() {
        sfj0.m185596c("e_edit_profile_my_info", "p_edit_profile_view", sfj0.C20032a.m185615h("edit_profile_my_info_name", ProfileLikeCategoryType.hometown));
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.HOMETOWN);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m212175M0() {
        sfj0.m185596c("e_edit_profile_my_info", "p_edit_profile_view", sfj0.C20032a.m185615h("edit_profile_my_info_name", ProfileLikeCategoryType.hangouts));
        LoopFragmentFactory.m52644E(LoopInputType.HANGOUTS, mo53983O().mo52249J1(), mo53983O().m189086i2(), 500);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m212176N0() {
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.ETHNICITY);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m212177O0(uxj0 uxj0Var) {
        mo53983O().act().progressDismiss();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m212178P0() {
        mo53983O().m53521tc();
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m212179Q0(Throwable th) {
        mo53983O().m189086i2().settings.getSettingGroup().privacy.hideSchool = mo53983O().mo52252K2().settings.hideSchoolNameNoDefaults();
        if (NullChecker.m82486a(mo53983O().act())) {
            mo53983O().act().progressDismiss();
            mo53983O().act().dialog().m21499D(R$string.f18586Jl).m21555t0(R$string.f18776Q, new Runnable() { // from class: l.nne
                @Override // java.lang.Runnable
                public final void run() {
                    this.f142781a.m212178P0();
                }
            }).m21540k0(R$string.f19138c).m21567z0();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m212180R0() {
        SettingGroups settingGroups = new SettingGroups();
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        settingGroups.privacy = userPrivacySettings;
        userPrivacySettings.hideSchool = mo53983O().m189086i2().settings.hideSchoolNameNoDefaults();
        if (settingGroups.privacy.hideSchool != mo53983O().mo52252K2().settings.hideSchoolNameNoDefaults()) {
            mo53983O().act().progress(R$string.f18632L5);
            CoreModule.f18264c.f20381e0.m116454D9(settingGroups).subscribe(psd0.m173597H(new y20() { // from class: l.hne
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f110731a.m212177O0((uxj0) obj);
                }
            }, new y20() { // from class: l.one
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f148081a.m212179Q0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.dy90, p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        if (mo53983O().mo52302m0()) {
            mo212181z0();
            m212147A0();
        }
    }

    @Override // p153l.dy90, p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return mo53983O().mo52302m0();
    }

    @Override // p153l.dy90, p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        m118657e0(mo53983O().m189086i2());
    }

    /* JADX INFO: renamed from: z0 */
    public void mo212181z0() {
        jyb.m147537z(jyb.m147507f0(this.f91192w, this.f91193x, this.f91173B, this.f91175D, this.f91178G, this.f91180I, this.f91174C, this.f91182K, this.f91172A, this.f91195z, this.f91181J, this.f91179H, this.f91184M, this.f91185N, this.f91186O, this.f91187P, this.f91177F, this.f91176E, this.f91188Q), new y20() { // from class: l.mne
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137695a.m212164B0((VText) obj);
            }
        });
    }
}
