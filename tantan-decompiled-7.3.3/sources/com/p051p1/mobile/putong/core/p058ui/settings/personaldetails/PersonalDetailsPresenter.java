package com.p051p1.mobile.putong.core.p058ui.settings.personaldetails;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ProfileEditInfo;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.settings.PersonalDetailsAct;
import com.p051p1.mobile.putong.core.p058ui.settings.personaldetails.PersonalDetailsPresenter;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Physical;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.ar2;
import p153l.bsj0;
import p153l.i4g0;
import p153l.jyb;
import p153l.l4g0;
import p153l.ner;
import p153l.o1j0;
import p153l.pcj;
import p153l.psd0;
import p153l.r1j0;
import p153l.rt60;
import p153l.uxj0;
import p153l.wx6;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class PersonalDetailsPresenter extends ar2<rt60> {

    /* JADX INFO: renamed from: a */
    public l4g0 f37179a;

    /* JADX INFO: renamed from: b */
    public boolean f37180b;

    /* JADX INFO: renamed from: c */
    public String f37181c;

    /* JADX INFO: renamed from: d */
    public User f37182d;

    /* JADX INFO: renamed from: e */
    public User f37183e;

    public static class ProfileEditInfoException extends RuntimeException {
        private ProfileEditInfo editInfo;

        public ProfileEditInfoException(ProfileEditInfo profileEditInfo) {
            this.editInfo = profileEditInfo;
        }

        public ProfileEditInfo getEditInfo() {
            return this.editInfo;
        }
    }

    public PersonalDetailsPresenter(ner nerVar) {
        super(nerVar);
        this.f37179a = null;
    }

    /* JADX INFO: renamed from: D0 */
    private void m56832D0() {
        if (NullChecker.m82486a(this.f37182d)) {
            User user = new User();
            Settings settings = new Settings();
            user.settings = settings;
            User user2 = this.f37183e;
            user.gender = user2.gender;
            user.name = user2.name;
            settings.birthdate = user2.settings.birthdate;
            if (!jyb.m147479J(user2.profile.extensions.physical.bloodType)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f37183e.profile.extensions.physical.bloodType.get(0));
                Profile profile = new Profile();
                user.profile = profile;
                profile.extensions = new Extensions();
                user.profile.extensions.physical = new Physical();
                user.profile.extensions.physical.bloodType = arrayList;
            }
            User userSubtract = user.subtract(this.f37182d);
            if (NullChecker.m82486a(userSubtract)) {
                act().progress(act().getString(R$string.f18632L5), true);
                duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userSubtract)).subscribe(psd0.m173597H(new y20() { // from class: l.ys60
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f201373a.m56854y0((uxj0) obj);
                    }
                }, new y20() { // from class: l.zs60
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f205848a.m56855z0((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m56841m0(Boolean bool) {
    }

    /* JADX INFO: renamed from: q0 */
    private void m56843q0() {
        this.f37180b = true;
        if (TextUtils.equals(this.f37181c, "alert") && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9().settings)) {
            boolean zM116579k8 = CoreModule.f18264c.f20381e0.m116579k8();
            V v2 = this.viewModel;
            if (zM116579k8) {
                ((rt60) v2).m183093N();
            } else {
                CoreDlg.m46176I1(((rt60) v2).getAct(), new pcj() { // from class: l.us60
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return CoreModule.f18264c.f20381e0.m116600p9().settings.birthdate;
                    }
                }, new y20() { // from class: l.vs60
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f185567a.m56852s0((Double) obj);
                    }
                }, new y20() { // from class: l.ws60
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        PersonalDetailsPresenter.m56841m0((Boolean) obj);
                    }
                });
                i4g0.m138526x("e_edit_basic_info_calendar", "p_edit_basic_info_view");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m56844t0(Bundle bundle) {
        ((rt60) this.viewModel).m183096r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m56845u0(C4470c c4470c) {
        if (c4470c == C4470c.f16264f) {
            this.f37179a.m152774i();
            return;
        }
        if (c4470c == C4470c.f16267i) {
            this.f37179a.m152777l();
            if (this.f37180b) {
                return;
            }
            m56843q0();
            return;
        }
        if (c4470c == C4470c.f16268j) {
            this.f37179a.m152776k();
        } else if (c4470c == C4470c.f16271m) {
            this.f37179a.m152775j();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m56846A0(double d) {
        i4g0.m138520r("e_edit_basic_info_save_button", "p_edit_basic_info_view");
        this.f37183e.settings.birthdate = Double.valueOf(d);
        m56832D0();
    }

    /* JADX INFO: renamed from: C0 */
    public void m56847C0(BloodType bloodType) {
        this.f37183e.profile.extensions.physical.bloodType.add(0, bloodType);
        m56832D0();
    }

    /* JADX INFO: renamed from: E0 */
    public void m56848E0(String str) {
        i4g0.m138520r("e_edit_basic_info_save_button", "p_edit_basic_info_view");
        this.f37183e.name = str;
        m56832D0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.qs60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159249a.m56844t0((Bundle) obj);
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.rs60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164637a.m56845u0((C4470c) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.ss60
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f18264c.f20405m0.m32121j9().switchMap(new qcj() { // from class: l.xs60
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreModule.f18264c.f20381e0.m116596o9();
                    }
                });
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ts60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175964a.m56853x0((User) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: o0 */
    public double m56849o0() {
        return this.f37183e.settings.birthdate.doubleValue();
    }

    /* JADX INFO: renamed from: p0 */
    public String m56850p0() {
        return this.f37183e.name;
    }

    /* JADX INFO: renamed from: r0 */
    public void m56851r0(String str) {
        this.f37181c = str;
        this.f37179a = new l4g0("p_edit_basic_info_view", PersonalDetailsAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("came_from", str);
            this.f37179a.m152780o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m56852s0(Double d) {
        i4g0.m138520r("e_edit_basic_info_save_button", "p_edit_basic_info_view");
        if (NullChecker.m82486a(this.f37183e) && NullChecker.m82486a(this.f37183e.settings)) {
            this.f37183e.settings.birthdate = d;
            m56832D0();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m56853x0(User user) {
        ((rt60) this.viewModel).m183092L();
        this.f37182d = user;
        User user2 = this.f37183e;
        if (user2 == null) {
            User userMo225055clone = user.mo225055clone();
            this.f37183e = userMo225055clone;
            ((rt60) this.viewModel).m183094O(userMo225055clone);
        } else if (NullChecker.m82486a(user2.settings) && NullChecker.m82486a(this.f37182d.settings)) {
            Settings settings = this.f37183e.settings;
            Settings settings2 = this.f37182d.settings;
            settings.phoneNumber = settings2.phoneNumber;
            settings.settingGroups = settings2.settingGroups;
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m56854y0(uxj0 uxj0Var) {
        act().progressDismiss();
        ((rt60) this.viewModel).m183094O(this.f37183e);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m56855z0(Throwable th) {
        boolean z;
        act().progressDismiss();
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (!tantanForbidden.isCannotModify() || TextUtils.isEmpty(tantanForbidden.message)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        if (!(th instanceof ProfileEditInfoException)) {
            if (z) {
                bsj0.m106246D(th);
            }
        } else if (wx6.m208374d(((ProfileEditInfoException) th).getEditInfo(), act().pageId())) {
            o1j0.m165649w(R$string.f19139c0);
        } else {
            r1j0.m179419f(R$string.f18664M7);
        }
    }
}
