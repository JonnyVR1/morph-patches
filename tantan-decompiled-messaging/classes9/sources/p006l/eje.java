package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.data.AdsMaterialRouter;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.SignInGrantType;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.SignupStage;
import com.p1.mobile.putong.data.StepSignupStage;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l.e51;
import l.jo0;
import l.mkd0;
import l.roj0;
import l.tan;
import l.uqd0;
import l.vqd0;
import l.vwb;
import l.w9j;
import rx.Notification;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class eje {

    /* JADX INFO: renamed from: d */
    public static eje f11184d;

    /* JADX INFO: renamed from: a */
    public uqd0 f11185a = new uqd0("user_sign_up_stage", "");

    /* JADX INFO: renamed from: b */
    public vqd0 f11186b = new vqd0("user_sign_up_finished_stages", new HashSet());

    /* JADX INFO: renamed from: c */
    public uqd0 f11187c = new uqd0("user_setting_config", "");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ roj0 m14569a(Runnable runnable, roj0 roj0Var) {
        e51.G(runnable);
        return roj0Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ SignUpData m14570b(SignUpData signUpData, Notification notification) {
        if (notification.k()) {
            signUpData.firebaseId = (String) notification.f();
        }
        return signUpData;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ c m14571c(boolean z, SignUpData signUpData, boolean z2, roj0 roj0Var) {
        if (!z) {
            return z2 ? AccountModule.f26c.m213Y0().map(new w9j() { // from class: l.dje
                public final Object call(Object obj) {
                    return roj0.a;
                }
            }) : c.just(roj0.a);
        }
        tan.d();
        SignUpData signUpDataM220c1 = AccountModule.f26c.m220c1();
        String string = NullChecker.a(signUpDataM220c1.gender) ? signUpDataM220c1.gender.toString() : "unknown_";
        qib0.m22159e1("af_complete_registration", new Object[0]);
        qib0.m22159e1("af_complete_registration_" + string, new Object[0]);
        qib0.m22159e1("signup_" + string, new Object[0]);
        if (signUpData.signUpType == AccountTempApi.SignUpType.facebook) {
            qib0.m22159e1("signup_" + string + "_fb", new Object[0]);
        } else {
            qib0.m22159e1("signup_" + string + "_hp", new Object[0]);
        }
        return qib0.m22162g0(true);
    }

    /* JADX INFO: renamed from: h */
    public static eje m14574h() {
        if (f11184d == null) {
            synchronized (eje.class) {
                try {
                    if (f11184d == null) {
                        f11184d = new eje();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11184d;
    }

    /* JADX INFO: renamed from: l */
    public static void m14575l() {
        f11184d = null;
    }

    /* JADX INFO: renamed from: q */
    public static c<roj0> m14576q(SignUpData signUpData, Runnable runnable) {
        return m14578s(signUpData, runnable, false, false, null);
    }

    /* JADX INFO: renamed from: r */
    public static c<roj0> m14577r(SignUpData signUpData, Runnable runnable, boolean z) {
        return m14578s(signUpData, runnable, false, z, null);
    }

    /* JADX INFO: renamed from: s */
    public static c<roj0> m14578s(final SignUpData signUpData, final Runnable runnable, final boolean z, final boolean z2, final SignInGrantType signInGrantType) {
        return AccountModule.f26c.now((z ? gmi.m15894c().materialize().take(1).map(new w9j() { // from class: l.zie
            public final Object call(Object obj) {
                return eje.m14570b(signUpData, (Notification) obj);
            }
        }) : c.just(signUpData)).flatMap(new w9j() { // from class: l.aje
            public final Object call(Object obj) {
                SignUpData signUpData2 = (SignUpData) obj;
                return AccountModule.f26c.m210W1(signUpData2, signInGrantType).map(new w9j() { // from class: l.bje
                    public final Object call(Object obj2) {
                        return eje.m14569a(runnable, (roj0) obj2);
                    }
                }).compose(mkd0.Q()).flatMap(new w9j() { // from class: l.cje
                    public final Object call(Object obj2) {
                        return eje.m14571c(z, signUpData2, z, (roj0) obj2);
                    }
                }).observeOn(jo0.a());
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public void m14579f(SignupStage signupStage, StepSignupStage... stepSignupStageArr) {
        this.f11185a.put(signupStage.toString());
        if (vwb.K(stepSignupStageArr)) {
            return;
        }
        HashSet hashSet = (HashSet) m14574h().f11186b.get();
        for (StepSignupStage stepSignupStage : stepSignupStageArr) {
            hashSet.add(stepSignupStage.toString());
        }
        this.f11186b.put(hashSet);
    }

    /* JADX INFO: renamed from: g */
    public void m14580g() {
        String str = (String) this.f11185a.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SignupStage signupStage = SignupStage.get(str);
        if (TEnum.equals(signupStage, "verified") || TEnum.equals(signupStage, "finished") || TEnum.equals(signupStage, "unknown_") || !vwb.J((Collection) this.f11186b.get())) {
            return;
        }
        if ("base-info-saved".equals(str)) {
            this.f11186b.put(new HashSet(vwb.f0(new String[]{"birth-saved", "gender-saved", "name-saved"})));
        } else if ("gender-saved".equals(str)) {
            this.f11186b.put(new HashSet(vwb.f0(new String[]{"gender-saved"})));
        } else if ("birth-saved".equals(str)) {
            this.f11186b.put(new HashSet(vwb.f0(new String[]{"birth-saved", "gender-saved"})));
        }
        this.f11185a.put("verified");
    }

    /* JADX INFO: renamed from: i */
    public boolean m14581i() {
        AuthData authData = (AuthData) AccountModule.f26c.m207V0().b();
        return (NullChecker.a(authData) && TEnum.equals(authData.signupStage, "verified")) || "verified".equals((String) this.f11185a.get());
    }

    /* JADX INFO: renamed from: j */
    public boolean m14582j(List<StepSignupStage> list) {
        return !vwb.J(list) && list.contains(StepSignupStage.get("name-saved")) && list.contains(StepSignupStage.get("gender-saved")) && list.contains(StepSignupStage.get("birth-saved"));
    }

    /* JADX INFO: renamed from: k */
    public boolean m14583k() {
        AuthData authData = (AuthData) AccountModule.f26c.m207V0().b();
        HashSet hashSet = (HashSet) m14574h().f11186b.get();
        if (!NullChecker.a(authData) || vwb.J(authData.finishedStages) || authData.finishedStages.contains(StepSignupStage.get("picture-saved"))) {
            return (vwb.J(hashSet) || hashSet.contains("picture-saved")) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public void m14584m() {
        this.f11185a.clear();
        this.f11186b.put(new HashSet());
    }

    /* JADX INFO: renamed from: n */
    public void m14585n(AuthData authData) {
        this.f11185a.put(authData.signupStage.toString());
        HashSet hashSet = new HashSet();
        if (!vwb.J(authData.finishedStages)) {
            Iterator it = authData.finishedStages.iterator();
            while (it.hasNext()) {
                hashSet.add(((StepSignupStage) it.next()).toString());
            }
        }
        this.f11186b.put(hashSet);
    }

    /* JADX INFO: renamed from: o */
    public void m14586o(User user) {
        if (!TEnum.equals(user.signupStage, "unknown_") && !TEnum.equals(user.signupStage, "finished")) {
            user.signupStage = SignupStage.get("verified");
        }
        this.f11185a.put(user.signupStage.toString());
        HashSet hashSet = new HashSet();
        if (!vwb.J(user.finishedStages)) {
            Iterator it = user.finishedStages.iterator();
            while (it.hasNext()) {
                hashSet.add(((StepSignupStage) it.next()).toString());
            }
        }
        if (!vwb.J(user.profile.extensions.basic.intlFriendPurposeV2)) {
            hashSet.add("intlFriendPurpose-saved");
        }
        if (IntlCountryCodeController.m9j()) {
            if (!vwb.J(user.profile.extensions.basic.ethnicity)) {
                hashSet.add("ethnicity-saved");
            }
            if (!vwb.J(user.profile.extensions.basic.language)) {
                hashSet.add("language-saved");
            }
        }
        if (!hashSet.isEmpty() || !TextUtils.isEmpty(user.settings.email) || ((Boolean) zmi0.f28828d.get()).booleanValue()) {
            hashSet.add("google-email-saved");
        }
        this.f11186b.put(hashSet);
        m14587p(user);
    }

    /* JADX INFO: renamed from: p */
    public void m14587p(User user) {
        Settings settings;
        List list;
        SettingGroups settingGroups;
        AdsMaterialRouter adsMaterialRouter;
        if (user == null || (settings = user.settings) == null || (list = settings.settingGroups) == null || list.isEmpty() || (settingGroups = (SettingGroups) list.get(0)) == null || (adsMaterialRouter = settingGroups.adsMaterialRouter) == null) {
            return;
        }
        this.f11187c.put(adsMaterialRouter.mode);
    }
}
