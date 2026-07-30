package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserPrivacySettings;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class tme extends zp90 {
    public tme(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX INFO: renamed from: A0 */
    private void m189653A0() {
        final boolean z;
        if (mo52800O().mo51075P1() && mo52800O().mo51119m0()) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (NullChecker.m81303a(userM169527p9.settings) && NullChecker.m81304b(userM169527p9.settings.verification) && NullChecker.m81304b(userM169527p9.settings.verification.studies) && TEnum.equals(userM169527p9.settings.verification.studies.status, "pending")) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        m96418N(this.f204239z, new d30() { // from class: l.lme
            @Override // p149l.d30
            public final void call() {
                this.f128783a.m189671C0();
            }
        }, true);
        m96418N(this.f204217B, new d30() { // from class: l.ome
            @Override // p149l.d30
            public final void call() {
                this.f144613a.m189675G0(z);
            }
        }, true);
        m96418N(this.f204218C, new d30() { // from class: l.pme
            @Override // p149l.d30
            public final void call() {
                this.f150206a.m189676H0();
            }
        }, true);
        m96418N(this.f204219D, new d30() { // from class: l.qme
            @Override // p149l.d30
            public final void call() {
                this.f155310a.m189677I0();
            }
        }, true);
        m96418N(this.f204222G, new d30() { // from class: l.rme
            @Override // p149l.d30
            public final void call() {
                this.f160088a.m189678J0(z);
            }
        }, true);
        m96418N(this.f204216A, new d30() { // from class: l.sme
            @Override // p149l.d30
            public final void call() {
                this.f165338a.m189679K0(z);
            }
        }, true);
        m96418N(this.f204224I, new d30() { // from class: l.eme
            @Override // p149l.d30
            public final void call() {
                this.f92198a.m189680L0();
            }
        }, true);
        m96418N(this.f204226K, new d30() { // from class: l.fme
            @Override // p149l.d30
            public final void call() {
                this.f98290a.m189681M0();
            }
        }, true);
        if (IntlCountryCodeController.m28114j()) {
            m96418N(this.f204236w, new d30() { // from class: l.gme
                @Override // p149l.d30
                public final void call() {
                    this.f103455a.m189682N0();
                }
            }, true);
            m96418N(this.f204237x, new d30() { // from class: l.hme
                @Override // p149l.d30
                public final void call() {
                    this.f108414a.m189672D0();
                }
            }, true);
        }
        m96418N(this.f204220E, new d30() { // from class: l.mme
            @Override // p149l.d30
            public final void call() {
                this.f134618a.m189673E0();
            }
        }, true);
        m96418N(this.f204221F, new d30() { // from class: l.nme
            @Override // p149l.d30
            public final void call() {
                this.f139625a.m189674F0();
            }
        }, true);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m189670B0(VText vText) {
        m96407C(m219662Z().getColor(w0c0.f183790N1), vText);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m189671C0() {
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.SCHOOL);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m189672D0() {
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.LANGUAGE);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m189673E0() {
        o6j0.m162859c("e_intl_edit_profile_view_degree", "p_edit_profile_view", new o6j0.C18854a[0]);
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.QUALIFICATION);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m189674F0() {
        o6j0.m162859c("e_intl_edit_profile_view_school", "p_edit_profile_view", new o6j0.C18854a[0]);
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.SCHOOL_NEW);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m189675G0(boolean z) {
        if (!z) {
            lsi0.m151595y("审核中，请稍后操作。");
        } else {
            o6j0.m162859c("e_edit_profile_my_info", "p_edit_profile_view", o6j0.C18854a.m162878h("edit_profile_my_info_name", "industry"));
            LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.INDUSTRY);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m189676H0() {
        if (mo52800O().m94569i2().profile.studies.active) {
            o6j0.m162859c("e_edit_profile_my_info", "p_edit_profile_view", o6j0.C18854a.m162878h("edit_profile_my_info_name", "department"));
            LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.MAJOR);
        } else {
            o6j0.m162859c("e_edit_profile_my_info", "p_edit_profile_view", o6j0.C18854a.m162878h("edit_profile_my_info_name", "job"));
            LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.DEPARTMENT);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m189677I0() {
        o6j0.m162859c("e_edit_profile_my_info", "p_edit_profile_view", o6j0.C18854a.m162878h("edit_profile_my_info_name", ProfileLikeCategoryType.company));
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.COMPANY);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m189678J0(boolean z) {
        if (!z) {
            lsi0.m151595y("审核中，请稍后操作。");
        } else if (mo52800O().m94569i2().profile.studies.verified) {
            o6j0.m162859c("e_edit_profile_my_info", "p_edit_profile_view", o6j0.C18854a.m162878h("edit_profile_my_info_name", "school"));
            LoopFragmentFactory.m51463G(mo52800O().mo51066J1());
        } else {
            o6j0.m162859c("e_edit_profile_my_info", "p_edit_profile_view", o6j0.C18854a.m162878h("edit_profile_my_info_name", "school"));
            LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.SCHOOL);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m189679K0(boolean z) {
        if (!z) {
            lsi0.m151595y("审核中，请稍后操作。");
        } else {
            o6j0.m162859c("e_edit_profile_my_info", "p_edit_profile_view", o6j0.C18854a.m162878h("edit_profile_my_info_name", "school"));
            LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.SCHOOL);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m189680L0() {
        o6j0.m162859c("e_edit_profile_my_info", "p_edit_profile_view", o6j0.C18854a.m162878h("edit_profile_my_info_name", ProfileLikeCategoryType.hometown));
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.HOMETOWN);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m189681M0() {
        o6j0.m162859c("e_edit_profile_my_info", "p_edit_profile_view", o6j0.C18854a.m162878h("edit_profile_my_info_name", ProfileLikeCategoryType.hangouts));
        LoopFragmentFactory.m51461E(LoopInputType.HANGOUTS, mo52800O().mo51066J1(), mo52800O().m94569i2(), 500);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m189682N0() {
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.ETHNICITY);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m189683O0(roj0 roj0Var) {
        mo52800O().act().progressDismiss();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m189684P0() {
        mo52800O().m52338tc();
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m189685Q0(Throwable th) {
        mo52800O().m94569i2().settings.getSettingGroup().privacy.hideSchool = mo52800O().mo51069K2().settings.hideSchoolNameNoDefaults();
        if (NullChecker.m81303a(mo52800O().act())) {
            mo52800O().act().progressDismiss();
            mo52800O().act().dialog().m20500D(R$string.f18768nl).m20556t0(R$string.f18046Q, new Runnable() { // from class: l.jme
                @Override // java.lang.Runnable
                public final void run() {
                    this.f118627a.m189684P0();
                }
            }).m20541k0(R$string.f18408c).m20568z0();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m189686R0() {
        SettingGroups settingGroups = new SettingGroups();
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        settingGroups.privacy = userPrivacySettings;
        userPrivacySettings.hideSchool = mo52800O().m94569i2().settings.hideSchoolNameNoDefaults();
        if (settingGroups.privacy.hideSchool != mo52800O().mo51069K2().settings.hideSchoolNameNoDefaults()) {
            mo52800O().act().progress(R$string.f17842J5);
            CoreModule.f17545c.f19639e0.m169381D9(settingGroups).subscribe(mkd0.m154956H(new e30() { // from class: l.dme
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f86927a.m189683O0((roj0) obj);
                }
            }, new e30() { // from class: l.kme
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f123785a.m189685Q0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.zp90, p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        if (mo52800O().mo51119m0()) {
            mo189687z0();
            m189653A0();
        }
    }

    @Override // p149l.zp90, p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return mo52800O().mo51119m0();
    }

    @Override // p149l.zp90, p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        m219667e0(mo52800O().m94569i2());
    }

    /* JADX INFO: renamed from: z0 */
    public void mo189687z0() {
        vwb.m200354z(vwb.m200324f0(this.f204236w, this.f204237x, this.f204217B, this.f204219D, this.f204222G, this.f204224I, this.f204218C, this.f204226K, this.f204216A, this.f204239z, this.f204225J, this.f204223H, this.f204228M, this.f204229N, this.f204230O, this.f204231P, this.f204221F, this.f204220E, this.f204232Q), new e30() { // from class: l.ime
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113912a.m189670B0((VText) obj);
            }
        });
    }
}
