package com.p000p1.mobile.putong.core.p004ui.settings.personaldetails;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.settings.PersonalDetailsAct;
import com.p000p1.mobile.putong.core.p004ui.settings.personaldetails.PersonalDetailsPresenter;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.ProfileEditInfo;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.BloodType;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Physical;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.cwf0;
import l.e30;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.roj0;
import l.s7m;
import l.tw6;
import l.v9j;
import l.vwb;
import l.w9j;
import l.yij0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.ll60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PersonalDetailsPresenter extends jq2<ll60> {

    /* JADX INFO: renamed from: a */
    public cwf0 f6112a;

    /* JADX INFO: renamed from: b */
    public boolean f6113b;

    /* JADX INFO: renamed from: c */
    public String f6114c;

    /* JADX INFO: renamed from: d */
    public User f6115d;

    /* JADX INFO: renamed from: e */
    public User f6116e;

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
        this.f6112a = null;
    }

    /* JADX INFO: renamed from: D0 */
    private void m9045D0() {
        if (NullChecker.a(this.f6115d)) {
            User user = new User();
            Settings settings = new Settings();
            user.settings = settings;
            User user2 = this.f6116e;
            user.gender = user2.gender;
            user.name = user2.name;
            settings.birthdate = user2.settings.birthdate;
            if (!vwb.J(user2.profile.extensions.physical.bloodType)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((BloodType) this.f6116e.profile.extensions.physical.bloodType.get(0));
                Profile profile = new Profile();
                user.profile = profile;
                profile.extensions = new Extensions();
                user.profile.extensions.physical = new Physical();
                user.profile.extensions.physical.bloodType = arrayList;
            }
            User userSubtract = user.subtract(this.f6115d);
            if (NullChecker.a(userSubtract)) {
                act().progress(act().getString(R$string.f1831J5), true);
                duringCreated(CoreModule.f1534c.f3628e0.m21510u9(userSubtract)).subscribe(mkd0.H(new e30() { // from class: l.sk60
                    public final void call(Object obj) {
                        this.f21389a.m9068y0((roj0) obj);
                    }
                }, new e30() { // from class: l.tk60
                    public final void call(Object obj) {
                        this.f22147a.m9069z0((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m9054m0(Boolean bool) {
    }

    /* JADX INFO: renamed from: q0 */
    private void m9056q0() {
        this.f6113b = true;
        if (TextUtils.equals(this.f6114c, "alert") && NullChecker.a(CoreModule.f1534c.f3628e0.m21490p9().settings)) {
            boolean zM21469k8 = CoreModule.f1534c.f3628e0.m21469k8();
            s7m s7mVar = ((jq2) this).viewModel;
            if (zM21469k8) {
                ((ll60) s7mVar).m18884N();
            } else {
                CoreDlg.I1(((ll60) s7mVar).act(), new v9j() { // from class: l.ok60
                    public final Object call() {
                        return CoreModule.f1534c.f3628e0.m21490p9().settings.birthdate;
                    }
                }, new e30() { // from class: l.pk60
                    public final void call(Object obj) {
                        this.f19164a.m9066s0((Double) obj);
                    }
                }, new e30() { // from class: l.qk60
                    public final void call(Object obj) {
                        PersonalDetailsPresenter.m9054m0((Boolean) obj);
                    }
                });
                zvf0.x("e_edit_basic_info_calendar", "p_edit_basic_info_view");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m9057t0(Bundle bundle) {
        ((ll60) ((jq2) this).viewModel).m18888r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m9058u0(c cVar) {
        if (cVar == c.f) {
            this.f6112a.i();
            return;
        }
        if (cVar == c.i) {
            this.f6112a.l();
            if (this.f6113b) {
                return;
            }
            m9056q0();
            return;
        }
        if (cVar == c.j) {
            this.f6112a.k();
        } else if (cVar == c.m) {
            this.f6112a.j();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m9059A0(double d) {
        zvf0.r("e_edit_basic_info_save_button", "p_edit_basic_info_view");
        this.f6116e.settings.birthdate = Double.valueOf(d);
        m9045D0();
    }

    /* JADX INFO: renamed from: C0 */
    public void m9060C0(BloodType bloodType) {
        this.f6116e.profile.extensions.physical.bloodType.add(0, bloodType);
        m9045D0();
    }

    /* JADX INFO: renamed from: E0 */
    public void m9061E0(String str) {
        zvf0.r("e_edit_basic_info_save_button", "p_edit_basic_info_view");
        this.f6116e.name = str;
        m9045D0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m9062a0() {
        creates(new e30() { // from class: l.kk60
            public final void call(Object obj) {
                this.f15861a.m9057t0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.lk60
            public final void call(Object obj) {
                this.f16480a.m9058u0((c) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.mk60
            public final Object call() {
                return CoreModule.f1534c.f3652m0.m3048j9().switchMap(new w9j() { // from class: l.rk60
                    public final Object call(Object obj) {
                        return CoreModule.f1534c.f3628e0.m21486o9();
                    }
                });
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.nk60
            public final void call(Object obj) {
                this.f17715a.m9067x0((User) obj);
            }
        }));
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: o0 */
    public double m9063o0() {
        return this.f6116e.settings.birthdate.doubleValue();
    }

    /* JADX INFO: renamed from: p0 */
    public String m9064p0() {
        return this.f6116e.name;
    }

    /* JADX INFO: renamed from: r0 */
    public void m9065r0(String str) {
        this.f6114c = str;
        this.f6112a = new cwf0("p_edit_basic_info_view", PersonalDetailsAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("came_from", str);
            this.f6112a.o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m9066s0(Double d) {
        zvf0.r("e_edit_basic_info_save_button", "p_edit_basic_info_view");
        if (NullChecker.a(this.f6116e) && NullChecker.a(this.f6116e.settings)) {
            this.f6116e.settings.birthdate = d;
            m9045D0();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m9067x0(User user) {
        ((ll60) ((jq2) this).viewModel).m18883L();
        this.f6115d = user;
        User user2 = this.f6116e;
        if (user2 == null) {
            User userClone = user.clone();
            this.f6116e = userClone;
            ((ll60) ((jq2) this).viewModel).m18885O(userClone);
        } else if (NullChecker.a(user2.settings) && NullChecker.a(this.f6115d.settings)) {
            Settings settings = this.f6116e.settings;
            Settings settings2 = this.f6115d.settings;
            settings.phoneNumber = settings2.phoneNumber;
            settings.settingGroups = settings2.settingGroups;
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m9068y0(roj0 roj0Var) {
        act().progressDismiss();
        ((ll60) ((jq2) this).viewModel).m18885O(this.f6116e);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m9069z0(Throwable th) {
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
                yij0.D(th);
            }
        } else if (tw6.d(((ProfileEditInfoException) th).getEditInfo(), act().pageId())) {
            lsi0.w(R$string.f2398c0);
        } else {
            osi0.f(R$string.f1863K7);
        }
    }
}
