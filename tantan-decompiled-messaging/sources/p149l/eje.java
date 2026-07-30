package p149l;

import android.text.TextUtils;
import com.appsflyer.AFInAppEventType;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.data.AdsMaterialRouter;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.SignupStage;
import com.p046p1.mobile.putong.data.StepSignupStage;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;
import p133rx.Notification;

/* JADX INFO: loaded from: classes9.dex */
public class eje {

    /* JADX INFO: renamed from: d */
    public static eje f91712d;

    /* JADX INFO: renamed from: a */
    public uqd0 f91713a = new uqd0("user_sign_up_stage", "");

    /* JADX INFO: renamed from: b */
    public vqd0 f91714b = new vqd0("user_sign_up_finished_stages", new HashSet());

    /* JADX INFO: renamed from: c */
    public uqd0 f91715c = new uqd0("user_setting_config", "");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ roj0 m116819a(Runnable runnable, roj0 roj0Var) {
        e51.m114742G(runnable);
        return roj0Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ SignUpData m116820b(SignUpData signUpData, Notification notification) {
        if (notification.m221300k()) {
            signUpData.firebaseId = (String) notification.m221295f();
        }
        return signUpData;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C22306c m116821c(boolean z, SignUpData signUpData, boolean z2, roj0 roj0Var) {
        if (!z) {
            return z2 ? AccountModule.f16037c.m28318Y0().map(new w9j() { // from class: l.dje
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return roj0.f160388a;
                }
            }) : C22306c.just(roj0.f160388a);
        }
        tan.m187743d();
        SignUpData signUpDataM28325c1 = AccountModule.f16037c.m28325c1();
        String string = NullChecker.m81303a(signUpDataM28325c1.gender) ? signUpDataM28325c1.gender.toString() : "unknown_";
        qib0.m174815e1(AFInAppEventType.COMPLETE_REGISTRATION, new Object[0]);
        qib0.m174815e1("af_complete_registration_" + string, new Object[0]);
        qib0.m174815e1("signup_" + string, new Object[0]);
        if (signUpData.signUpType == AccountTempApi.SignUpType.facebook) {
            qib0.m174815e1("signup_" + string + "_fb", new Object[0]);
        } else {
            qib0.m174815e1("signup_" + string + "_hp", new Object[0]);
        }
        return qib0.m174818g0(true);
    }

    /* JADX INFO: renamed from: h */
    public static eje m116824h() {
        if (f91712d == null) {
            synchronized (eje.class) {
                try {
                    if (f91712d == null) {
                        f91712d = new eje();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f91712d;
    }

    /* JADX INFO: renamed from: l */
    public static void m116825l() {
        f91712d = null;
    }

    /* JADX INFO: renamed from: q */
    public static C22306c<roj0> m116826q(SignUpData signUpData, Runnable runnable) {
        return m116828s(signUpData, runnable, false, false, null);
    }

    /* JADX INFO: renamed from: r */
    public static C22306c<roj0> m116827r(SignUpData signUpData, Runnable runnable, boolean z) {
        return m116828s(signUpData, runnable, false, z, null);
    }

    /* JADX INFO: renamed from: s */
    public static C22306c<roj0> m116828s(final SignUpData signUpData, final Runnable runnable, final boolean z, final boolean z2, final SignInGrantType signInGrantType) {
        return AccountModule.f16037c.now((z ? gmi.m126981c().materialize().take(1).map(new w9j() { // from class: l.zie
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eje.m116820b(signUpData, (Notification) obj);
            }
        }) : C22306c.just(signUpData)).flatMap(new w9j() { // from class: l.aje
            @Override // p149l.w9j
            public final Object call(Object obj) {
                SignUpData signUpData2 = (SignUpData) obj;
                return AccountModule.f16037c.m28315W1(signUpData2, signInGrantType).map(new w9j() { // from class: l.bje
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return eje.m116819a(runnable, (roj0) obj2);
                    }
                }).compose(mkd0.m154965Q()).flatMap(new w9j() { // from class: l.cje
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return eje.m116821c(z, signUpData2, z, (roj0) obj2);
                    }
                }).observeOn(jo0.m142408a());
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public void m116829f(SignupStage signupStage, StepSignupStage... stepSignupStageArr) {
        this.f91713a.put(signupStage.toString());
        if (vwb.m200297K(stepSignupStageArr)) {
            return;
        }
        HashSet<String> hashSet = m116824h().f91714b.get();
        for (StepSignupStage stepSignupStage : stepSignupStageArr) {
            hashSet.add(stepSignupStage.toString());
        }
        this.f91714b.put(hashSet);
    }

    /* JADX INFO: renamed from: g */
    public void m116830g() {
        String str = this.f91713a.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SignupStage signupStage = SignupStage.get(str);
        if (TEnum.equals(signupStage, "verified") || TEnum.equals(signupStage, "finished") || TEnum.equals(signupStage, "unknown_") || !vwb.m200296J(this.f91714b.get())) {
            return;
        }
        if (SignupStage.base_info_saved.equals(str)) {
            this.f91714b.put(new HashSet(vwb.m200324f0("birth-saved", "gender-saved", "name-saved")));
        } else if ("gender-saved".equals(str)) {
            this.f91714b.put(new HashSet(vwb.m200324f0("gender-saved")));
        } else if ("birth-saved".equals(str)) {
            this.f91714b.put(new HashSet(vwb.m200324f0("birth-saved", "gender-saved")));
        }
        this.f91713a.put("verified");
    }

    /* JADX INFO: renamed from: i */
    public boolean m116831i() {
        AuthData authDataMo108248b = AccountModule.f16037c.m28312V0().mo108248b();
        return (NullChecker.m81303a(authDataMo108248b) && TEnum.equals(authDataMo108248b.signupStage, "verified")) || "verified".equals(this.f91713a.get());
    }

    /* JADX INFO: renamed from: j */
    public boolean m116832j(List<StepSignupStage> list) {
        return !vwb.m200296J(list) && list.contains(StepSignupStage.get("name-saved")) && list.contains(StepSignupStage.get("gender-saved")) && list.contains(StepSignupStage.get("birth-saved"));
    }

    /* JADX INFO: renamed from: k */
    public boolean m116833k() {
        AuthData authDataMo108248b = AccountModule.f16037c.m28312V0().mo108248b();
        HashSet<String> hashSet = m116824h().f91714b.get();
        if (!NullChecker.m81303a(authDataMo108248b) || vwb.m200296J(authDataMo108248b.finishedStages) || authDataMo108248b.finishedStages.contains(StepSignupStage.get(StepSignupStage.picture_saved))) {
            return (vwb.m200296J(hashSet) || hashSet.contains(StepSignupStage.picture_saved)) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public void m116834m() {
        this.f91713a.clear();
        this.f91714b.put(new HashSet());
    }

    /* JADX INFO: renamed from: n */
    public void m116835n(AuthData authData) {
        this.f91713a.put(authData.signupStage.toString());
        HashSet hashSet = new HashSet();
        if (!vwb.m200296J(authData.finishedStages)) {
            Iterator<StepSignupStage> it = authData.finishedStages.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().toString());
            }
        }
        this.f91714b.put(hashSet);
    }

    /* JADX INFO: renamed from: o */
    public void m116836o(User user) {
        if (!TEnum.equals(user.signupStage, "unknown_") && !TEnum.equals(user.signupStage, "finished")) {
            user.signupStage = SignupStage.get("verified");
        }
        this.f91713a.put(user.signupStage.toString());
        HashSet hashSet = new HashSet();
        if (!vwb.m200296J(user.finishedStages)) {
            Iterator<StepSignupStage> it = user.finishedStages.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().toString());
            }
        }
        if (!vwb.m200296J(user.profile.extensions.basic.intlFriendPurposeV2)) {
            hashSet.add(StepSignupStage.intlFriendPurpose_saved);
        }
        if (IntlCountryCodeController.m28114j()) {
            if (!vwb.m200296J(user.profile.extensions.basic.ethnicity)) {
                hashSet.add(StepSignupStage.ethnicity_saved);
            }
            if (!vwb.m200296J(user.profile.extensions.basic.language)) {
                hashSet.add(StepSignupStage.language_saved);
            }
        }
        if (!hashSet.isEmpty() || !TextUtils.isEmpty(user.settings.email) || zmi0.f203725d.get().booleanValue()) {
            hashSet.add(StepSignupStage.google_email_saved);
        }
        this.f91714b.put(hashSet);
        m116837p(user);
    }

    /* JADX INFO: renamed from: p */
    public void m116837p(User user) {
        Settings settings;
        List<SettingGroups> list;
        SettingGroups settingGroups;
        AdsMaterialRouter adsMaterialRouter;
        if (user == null || (settings = user.settings) == null || (list = settings.settingGroups) == null || list.isEmpty() || (settingGroups = list.get(0)) == null || (adsMaterialRouter = settingGroups.adsMaterialRouter) == null) {
            return;
        }
        this.f91715c.put(adsMaterialRouter.mode);
    }
}
