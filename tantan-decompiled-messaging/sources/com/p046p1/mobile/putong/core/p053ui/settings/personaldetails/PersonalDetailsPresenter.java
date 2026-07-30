package com.p046p1.mobile.putong.core.p053ui.settings.personaldetails;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ProfileEditInfo;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.settings.PersonalDetailsAct;
import com.p046p1.mobile.putong.core.p053ui.settings.personaldetails.PersonalDetailsPresenter;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Physical;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.cwf0;
import p149l.e30;
import p149l.jq2;
import p149l.ll60;
import p149l.lsi0;
import p149l.mcr;
import p149l.mkd0;
import p149l.osi0;
import p149l.roj0;
import p149l.tw6;
import p149l.v9j;
import p149l.vwb;
import p149l.yij0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class PersonalDetailsPresenter extends jq2<ll60> {

    /* JADX INFO: renamed from: a */
    public cwf0 f36331a;

    /* JADX INFO: renamed from: b */
    public boolean f36332b;

    /* JADX INFO: renamed from: c */
    public String f36333c;

    /* JADX INFO: renamed from: d */
    public User f36334d;

    /* JADX INFO: renamed from: e */
    public User f36335e;

    public static class ProfileEditInfoException extends RuntimeException {
        private ProfileEditInfo editInfo;

        public ProfileEditInfoException(ProfileEditInfo profileEditInfo) {
            this.editInfo = profileEditInfo;
        }

        public ProfileEditInfo getEditInfo() {
            return this.editInfo;
        }
    }

    public PersonalDetailsPresenter(mcr mcrVar) {
        super(mcrVar);
        this.f36331a = null;
    }

    /* JADX INFO: renamed from: D0 */
    private void m55649D0() {
        if (NullChecker.m81303a(this.f36334d)) {
            User user = new User();
            Settings settings = new Settings();
            user.settings = settings;
            User user2 = this.f36335e;
            user.gender = user2.gender;
            user.name = user2.name;
            settings.birthdate = user2.settings.birthdate;
            if (!vwb.m200296J(user2.profile.extensions.physical.bloodType)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f36335e.profile.extensions.physical.bloodType.get(0));
                Profile profile = new Profile();
                user.profile = profile;
                profile.extensions = new Extensions();
                user.profile.extensions.physical = new Physical();
                user.profile.extensions.physical.bloodType = arrayList;
            }
            User userSubtract = user.subtract(this.f36334d);
            if (NullChecker.m81303a(userSubtract)) {
                act().progress(act().getString(R$string.f17842J5), true);
                duringCreated(CoreModule.f17545c.f19639e0.m169547u9(userSubtract)).subscribe(mkd0.m154956H(new e30() { // from class: l.sk60
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f164936a.m55671y0((roj0) obj);
                    }
                }, new e30() { // from class: l.tk60
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f170818a.m55672z0((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m55658m0(Boolean bool) {
    }

    /* JADX INFO: renamed from: q0 */
    private void m55660q0() {
        this.f36332b = true;
        if (TextUtils.equals(this.f36333c, "alert") && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9().settings)) {
            boolean zM169506k8 = CoreModule.f17545c.f19639e0.m169506k8();
            V v2 = this.viewModel;
            if (zM169506k8) {
                ((ll60) v2).m150440N();
            } else {
                CoreDlg.m44993I1(((ll60) v2).getAct(), new v9j() { // from class: l.ok60
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return CoreModule.f17545c.f19639e0.m169527p9().settings.birthdate;
                    }
                }, new e30() { // from class: l.pk60
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f149942a.m55669s0((Double) obj);
                    }
                }, new e30() { // from class: l.qk60
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        PersonalDetailsPresenter.m55658m0((Boolean) obj);
                    }
                });
                zvf0.m220402x("e_edit_basic_info_calendar", "p_edit_basic_info_view");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m55661t0(Bundle bundle) {
        ((ll60) this.viewModel).m150443r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m55662u0(C4319c c4319c) {
        if (c4319c == C4319c.f15545f) {
            this.f36331a.m109033i();
            return;
        }
        if (c4319c == C4319c.f15548i) {
            this.f36331a.m109036l();
            if (this.f36332b) {
                return;
            }
            m55660q0();
            return;
        }
        if (c4319c == C4319c.f15549j) {
            this.f36331a.m109035k();
        } else if (c4319c == C4319c.f15552m) {
            this.f36331a.m109034j();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m55663A0(double d) {
        zvf0.m220396r("e_edit_basic_info_save_button", "p_edit_basic_info_view");
        this.f36335e.settings.birthdate = Double.valueOf(d);
        m55649D0();
    }

    /* JADX INFO: renamed from: C0 */
    public void m55664C0(BloodType bloodType) {
        this.f36335e.profile.extensions.physical.bloodType.add(0, bloodType);
        m55649D0();
    }

    /* JADX INFO: renamed from: E0 */
    public void m55665E0(String str) {
        zvf0.m220396r("e_edit_basic_info_save_button", "p_edit_basic_info_view");
        this.f36335e.name = str;
        m55649D0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.kk60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123534a.m55661t0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.lk60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128449a.m55662u0((C4319c) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.mk60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f17545c.f19663m0.m31118j9().switchMap(new w9j() { // from class: l.rk60
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreModule.f17545c.f19639e0.m169523o9();
                    }
                });
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.nk60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139377a.m55670x0((User) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: o0 */
    public double m55666o0() {
        return this.f36335e.settings.birthdate.doubleValue();
    }

    /* JADX INFO: renamed from: p0 */
    public String m55667p0() {
        return this.f36335e.name;
    }

    /* JADX INFO: renamed from: r0 */
    public void m55668r0(String str) {
        this.f36333c = str;
        this.f36331a = new cwf0("p_edit_basic_info_view", PersonalDetailsAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("came_from", str);
            this.f36331a.m109039o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m55669s0(Double d) {
        zvf0.m220396r("e_edit_basic_info_save_button", "p_edit_basic_info_view");
        if (NullChecker.m81303a(this.f36335e) && NullChecker.m81303a(this.f36335e.settings)) {
            this.f36335e.settings.birthdate = d;
            m55649D0();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m55670x0(User user) {
        ((ll60) this.viewModel).m150439L();
        this.f36334d = user;
        User user2 = this.f36335e;
        if (user2 == null) {
            User userMo223809clone = user.mo223809clone();
            this.f36335e = userMo223809clone;
            ((ll60) this.viewModel).m150441O(userMo223809clone);
        } else if (NullChecker.m81303a(user2.settings) && NullChecker.m81303a(this.f36334d.settings)) {
            Settings settings = this.f36335e.settings;
            Settings settings2 = this.f36334d.settings;
            settings.phoneNumber = settings2.phoneNumber;
            settings.settingGroups = settings2.settingGroups;
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m55671y0(roj0 roj0Var) {
        act().progressDismiss();
        ((ll60) this.viewModel).m150441O(this.f36335e);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m55672z0(Throwable th) {
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
                yij0.m214926D(th);
            }
        } else if (tw6.m190849d(((ProfileEditInfoException) th).getEditInfo(), act().pageId())) {
            lsi0.m151593w(R$string.f18409c0);
        } else {
            osi0.m165782f(R$string.f17874K7);
        }
    }
}
