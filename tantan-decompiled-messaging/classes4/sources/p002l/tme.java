package p002l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserPrivacySettings;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.roj0;
import l.vwb;
import l.w0c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tme extends zp90 {
    public tme(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX INFO: renamed from: A0 */
    private void m23018A0() {
        final boolean z;
        if (mo3351O().mo1523P1() && mo3351O().mo1570m0()) {
            User userP9 = CoreModule.c.e0.p9();
            if (NullChecker.a(userP9.settings) && NullChecker.b(userP9.settings.verification) && NullChecker.b(userP9.settings.verification.studies) && TEnum.equals(userP9.settings.verification.studies.status, "pending")) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        m9649N(this.f23560z, new d30() { // from class: l.lme
            public final void call() {
                this.f14954a.m23036C0();
            }
        }, true);
        m9649N(this.f23538B, new d30() { // from class: l.ome
            public final void call() {
                this.f16718a.m23040G0(z);
            }
        }, true);
        m9649N(this.f23539C, new d30() { // from class: l.pme
            public final void call() {
                this.f17537a.m23041H0();
            }
        }, true);
        m9649N(this.f23540D, new d30() { // from class: l.qme
            public final void call() {
                this.f18094a.m23042I0();
            }
        }, true);
        m9649N(this.f23543G, new d30() { // from class: l.rme
            public final void call() {
                this.f18608a.m23043J0(z);
            }
        }, true);
        m9649N(this.f23537A, new d30() { // from class: l.sme
            public final void call() {
                this.f19124a.m23044K0(z);
            }
        }, true);
        m9649N(this.f23545I, new d30() { // from class: l.eme
            public final void call() {
                this.f9872a.m23045L0();
            }
        }, true);
        m9649N(this.f23547K, new d30() { // from class: l.fme
            public final void call() {
                this.f10487a.m23046M0();
            }
        }, true);
        if (IntlCountryCodeController.j()) {
            m9649N(this.f23557w, new d30() { // from class: l.gme
                public final void call() {
                    this.f11531a.m23047N0();
                }
            }, true);
            m9649N(this.f23558x, new d30() { // from class: l.hme
                public final void call() {
                    this.f12113a.m23037D0();
                }
            }, true);
        }
        m9649N(this.f23541E, new d30() { // from class: l.mme
            public final void call() {
                this.f15476a.m23038E0();
            }
        }, true);
        m9649N(this.f23542F, new d30() { // from class: l.nme
            public final void call() {
                this.f16106a.m23039F0();
            }
        }, true);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m23035B0(VText vText) {
        m9638C(m27493Z().getColor(w0c0.N1), vText);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m23036C0() {
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.SCHOOL);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m23037D0() {
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.LANGUAGE);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m23038E0() {
        o6j0.c("e_intl_edit_profile_view_degree", "p_edit_profile_view", new o6j0.a[0]);
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.QUALIFICATION);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m23039F0() {
        o6j0.c("e_intl_edit_profile_view_school", "p_edit_profile_view", new o6j0.a[0]);
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.SCHOOL_NEW);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m23040G0(boolean z) {
        if (!z) {
            lsi0.y("审核中，请稍后操作。");
        } else {
            o6j0.c("e_edit_profile_my_info", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("edit_profile_my_info_name", "industry")});
            LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.INDUSTRY);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m23041H0() {
        if (mo3351O().m9268i2().profile.studies.active) {
            o6j0.c("e_edit_profile_my_info", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("edit_profile_my_info_name", "department")});
            LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.MAJOR);
        } else {
            o6j0.c("e_edit_profile_my_info", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("edit_profile_my_info_name", "job")});
            LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.DEPARTMENT);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m23042I0() {
        o6j0.c("e_edit_profile_my_info", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("edit_profile_my_info_name", "company")});
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.COMPANY);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m23043J0(boolean z) {
        if (!z) {
            lsi0.y("审核中，请稍后操作。");
        } else if (mo3351O().m9268i2().profile.studies.verified) {
            o6j0.c("e_edit_profile_my_info", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("edit_profile_my_info_name", "school")});
            LoopFragmentFactory.m1945G(mo3351O().mo1514J1());
        } else {
            o6j0.c("e_edit_profile_my_info", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("edit_profile_my_info_name", "school")});
            LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.SCHOOL);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m23044K0(boolean z) {
        if (!z) {
            lsi0.y("审核中，请稍后操作。");
        } else {
            o6j0.c("e_edit_profile_my_info", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("edit_profile_my_info_name", "school")});
            LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.SCHOOL);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m23045L0() {
        o6j0.c("e_edit_profile_my_info", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("edit_profile_my_info_name", "hometown")});
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.HOMETOWN);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m23046M0() {
        o6j0.c("e_edit_profile_my_info", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("edit_profile_my_info_name", "hangouts")});
        LoopFragmentFactory.m1943E(LoopInputType.HANGOUTS, mo3351O().mo1514J1(), mo3351O().m9268i2(), 500);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m23047N0() {
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.ETHNICITY);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m23048O0(roj0 roj0Var) {
        mo3351O().act().progressDismiss();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m23049P0() {
        mo3351O().m2871tc();
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m23050Q0(Throwable th) {
        mo3351O().m9268i2().settings.getSettingGroup().privacy.hideSchool = mo3351O().mo1517K2().settings.hideSchoolNameNoDefaults();
        if (NullChecker.a(mo3351O().act())) {
            mo3351O().act().progressDismiss();
            mo3351O().act().dialog().D(R.string.nl).t0(R.string.Q, new Runnable() { // from class: l.jme
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13871a.m23049P0();
                }
            }).k0(R.string.c).z0();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m23051R0() {
        SettingGroups settingGroups = new SettingGroups();
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        settingGroups.privacy = userPrivacySettings;
        userPrivacySettings.hideSchool = mo3351O().m9268i2().settings.hideSchoolNameNoDefaults();
        if (settingGroups.privacy.hideSchool != mo3351O().mo1517K2().settings.hideSchoolNameNoDefaults()) {
            mo3351O().act().progress(R.string.J5);
            CoreModule.c.e0.D9(settingGroups).subscribe(mkd0.H(new e30() { // from class: l.dme
                public final void call(Object obj) {
                    this.f9335a.m23048O0((roj0) obj);
                }
            }, new e30() { // from class: l.kme
                public final void call(Object obj) {
                    this.f14421a.m23050Q0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p002l.zp90, p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        if (mo3351O().mo1570m0()) {
            mo23052z0();
            m23018A0();
        }
    }

    @Override // p002l.zp90, p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return mo3351O().mo1570m0();
    }

    @Override // p002l.zp90, p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        m27498e0(mo3351O().m9268i2());
    }

    /* JADX INFO: renamed from: z0 */
    public void mo23052z0() {
        vwb.z(vwb.f0(new VText[]{this.f23557w, this.f23558x, this.f23538B, this.f23540D, this.f23543G, this.f23545I, this.f23539C, this.f23547K, this.f23537A, this.f23560z, this.f23546J, this.f23544H, this.f23549M, this.f23550N, this.f23551O, this.f23552P, this.f23542F, this.f23541E, this.f23553Q}), new e30() { // from class: l.ime
            public final void call(Object obj) {
                this.f13305a.m23035B0((VText) obj);
            }
        });
    }
}
