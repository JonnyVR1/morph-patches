package p153l;

import android.text.TextUtils;
import com.appsflyer.AFInAppEventType;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.data.AdsMaterialRouter;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.SignupStage;
import com.p051p1.mobile.putong.data.StepSignupStage;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;
import p137rx.Notification;

/* JADX INFO: loaded from: classes9.dex */
public class ike {

    /* JADX INFO: renamed from: d */
    public static ike f115354d;

    /* JADX INFO: renamed from: a */
    public wyd0 f115355a = new wyd0("user_sign_up_stage", "");

    /* JADX INFO: renamed from: b */
    public xyd0 f115356b = new xyd0("user_sign_up_finished_stages", new HashSet());

    /* JADX INFO: renamed from: c */
    public wyd0 f115357c = new wyd0("user_setting_config", "");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ uxj0 m140271a(Runnable runnable, uxj0 uxj0Var) {
        l51.m152887G(runnable);
        return uxj0Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ SignUpData m140272b(SignUpData signUpData, Notification notification) {
        if (notification.m222546k()) {
            signUpData.firebaseId = (String) notification.m222541f();
        }
        return signUpData;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C22421c m140273c(boolean z, SignUpData signUpData, boolean z2, uxj0 uxj0Var) {
        if (!z) {
            return z2 ? AccountModule.f16756c.m29317Y0().map(new qcj() { // from class: l.hke
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return uxj0.f181467a;
                }
            }) : C22421c.just(uxj0.f181467a);
        }
        tcn.m190487d();
        SignUpData signUpDataM29324c1 = AccountModule.f16756c.m29324c1();
        String string = NullChecker.m82486a(signUpDataM29324c1.gender) ? signUpDataM29324c1.gender.toString() : "unknown_";
        uqb0.m197269e1(AFInAppEventType.COMPLETE_REGISTRATION, new Object[0]);
        uqb0.m197269e1("af_complete_registration_" + string, new Object[0]);
        uqb0.m197269e1("signup_" + string, new Object[0]);
        if (signUpData.signUpType == AccountTempApi.SignUpType.facebook) {
            uqb0.m197269e1("signup_" + string + "_fb", new Object[0]);
        } else {
            uqb0.m197269e1("signup_" + string + "_hp", new Object[0]);
        }
        return uqb0.m197272g0(true);
    }

    /* JADX INFO: renamed from: h */
    public static ike m140276h() {
        if (f115354d == null) {
            synchronized (ike.class) {
                try {
                    if (f115354d == null) {
                        f115354d = new ike();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f115354d;
    }

    /* JADX INFO: renamed from: l */
    public static void m140277l() {
        f115354d = null;
    }

    /* JADX INFO: renamed from: q */
    public static C22421c<uxj0> m140278q(SignUpData signUpData, Runnable runnable) {
        return m140280s(signUpData, runnable, false, false, null);
    }

    /* JADX INFO: renamed from: r */
    public static C22421c<uxj0> m140279r(SignUpData signUpData, Runnable runnable, boolean z) {
        return m140280s(signUpData, runnable, false, z, null);
    }

    /* JADX INFO: renamed from: s */
    public static C22421c<uxj0> m140280s(final SignUpData signUpData, final Runnable runnable, final boolean z, final boolean z2, final SignInGrantType signInGrantType) {
        return AccountModule.f16756c.now((z ? cpi.m111764c().materialize().take(1).map(new qcj() { // from class: l.dke
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ike.m140272b(signUpData, (Notification) obj);
            }
        }) : C22421c.just(signUpData)).flatMap(new qcj() { // from class: l.eke
            @Override // p153l.qcj
            public final Object call(Object obj) {
                SignUpData signUpData2 = (SignUpData) obj;
                return AccountModule.f16756c.m29314W1(signUpData2, signInGrantType).map(new qcj() { // from class: l.fke
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return ike.m140271a(runnable, (uxj0) obj2);
                    }
                }).compose(psd0.m173606Q()).flatMap(new qcj() { // from class: l.gke
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return ike.m140273c(z, signUpData2, z, (uxj0) obj2);
                    }
                }).observeOn(fo0.m126432a());
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public void m140281f(SignupStage signupStage, StepSignupStage... stepSignupStageArr) {
        this.f115355a.put(signupStage.toString());
        if (jyb.m147480K(stepSignupStageArr)) {
            return;
        }
        HashSet<String> hashSet = m140276h().f115356b.get();
        for (StepSignupStage stepSignupStage : stepSignupStageArr) {
            hashSet.add(stepSignupStage.toString());
        }
        this.f115356b.put(hashSet);
    }

    /* JADX INFO: renamed from: g */
    public void m140282g() {
        String str = this.f115355a.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SignupStage signupStage = SignupStage.get(str);
        if (TEnum.equals(signupStage, "verified") || TEnum.equals(signupStage, "finished") || TEnum.equals(signupStage, "unknown_") || !jyb.m147479J(this.f115356b.get())) {
            return;
        }
        if (SignupStage.base_info_saved.equals(str)) {
            this.f115356b.put(new HashSet(jyb.m147507f0("birth-saved", "gender-saved", "name-saved")));
        } else if ("gender-saved".equals(str)) {
            this.f115356b.put(new HashSet(jyb.m147507f0("gender-saved")));
        } else if ("birth-saved".equals(str)) {
            this.f115356b.put(new HashSet(jyb.m147507f0("birth-saved", "gender-saved")));
        }
        this.f115355a.put("verified");
    }

    /* JADX INFO: renamed from: i */
    public boolean m140283i() {
        AuthData authDataMo107143b = AccountModule.f16756c.m29311V0().mo107143b();
        return (NullChecker.m82486a(authDataMo107143b) && TEnum.equals(authDataMo107143b.signupStage, "verified")) || "verified".equals(this.f115355a.get());
    }

    /* JADX INFO: renamed from: j */
    public boolean m140284j(List<StepSignupStage> list) {
        return !jyb.m147479J(list) && list.contains(StepSignupStage.get("name-saved")) && list.contains(StepSignupStage.get("gender-saved")) && list.contains(StepSignupStage.get("birth-saved"));
    }

    /* JADX INFO: renamed from: k */
    public boolean m140285k() {
        AuthData authDataMo107143b = AccountModule.f16756c.m29311V0().mo107143b();
        HashSet<String> hashSet = m140276h().f115356b.get();
        if (!NullChecker.m82486a(authDataMo107143b) || jyb.m147479J(authDataMo107143b.finishedStages) || authDataMo107143b.finishedStages.contains(StepSignupStage.get(StepSignupStage.picture_saved))) {
            return (jyb.m147479J(hashSet) || hashSet.contains(StepSignupStage.picture_saved)) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public void m140286m() {
        this.f115355a.clear();
        this.f115356b.put(new HashSet());
    }

    /* JADX INFO: renamed from: n */
    public void m140287n(AuthData authData) {
        this.f115355a.put(authData.signupStage.toString());
        HashSet hashSet = new HashSet();
        if (!jyb.m147479J(authData.finishedStages)) {
            Iterator<StepSignupStage> it = authData.finishedStages.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().toString());
            }
        }
        this.f115356b.put(hashSet);
    }

    /* JADX INFO: renamed from: o */
    public void m140288o(User user) {
        if (!TEnum.equals(user.signupStage, "unknown_") && !TEnum.equals(user.signupStage, "finished")) {
            user.signupStage = SignupStage.get("verified");
        }
        this.f115355a.put(user.signupStage.toString());
        HashSet hashSet = new HashSet();
        if (!jyb.m147479J(user.finishedStages)) {
            Iterator<StepSignupStage> it = user.finishedStages.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().toString());
            }
        }
        if (!jyb.m147479J(user.profile.extensions.basic.intlFriendPurposeV2)) {
            hashSet.add(StepSignupStage.intlFriendPurpose_saved);
        }
        if (IntlCountryCodeController.m29113j()) {
            if (!jyb.m147479J(user.profile.extensions.basic.ethnicity)) {
                hashSet.add(StepSignupStage.ethnicity_saved);
            }
            if (!jyb.m147479J(user.profile.extensions.basic.language)) {
                hashSet.add(StepSignupStage.language_saved);
            }
        }
        if (!hashSet.isEmpty() || !TextUtils.isEmpty(user.settings.email) || awi0.f73760d.get().booleanValue()) {
            hashSet.add(StepSignupStage.google_email_saved);
        }
        this.f115356b.put(hashSet);
        m140289p(user);
    }

    /* JADX INFO: renamed from: p */
    public void m140289p(User user) {
        Settings settings;
        List<SettingGroups> list;
        SettingGroups settingGroups;
        AdsMaterialRouter adsMaterialRouter;
        if (user == null || (settings = user.settings) == null || (list = settings.settingGroups) == null || list.isEmpty() || (settingGroups = list.get(0)) == null || (adsMaterialRouter = settingGroups.adsMaterialRouter) == null) {
            return;
        }
        this.f115357c.put(adsMaterialRouter.mode);
    }
}
