package p153l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.p055ui.accountnew.SignUpDetailsNewAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.SignUpProfileImageAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.intlsignup.SignUpIntlEthnicityLanguageAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.intlsignup.intlfirendpurpose.SignUpIntlFriendPurposeAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.EmailLoginOptAct;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.SignupStage;
import com.p051p1.mobile.putong.data.StepSignupStage;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.cp */
/* JADX INFO: loaded from: classes9.dex */
public class C16330cp {

    /* JADX INFO: renamed from: a */
    public static final StepSignupStage[] f82946a = {StepSignupStage.get("gender-saved"), StepSignupStage.get("birth-saved"), StepSignupStage.get("name-saved"), StepSignupStage.get(StepSignupStage.picture_saved)};

    /* JADX INFO: renamed from: b */
    public static List<StepSignupStage> f82947b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static int m111715a() {
        HashSet<String> hashSet = ike.m140276h().f115356b.get();
        if (hashSet.size() == 0) {
            return 0;
        }
        ArrayList arrayListM147486Q = jyb.m147486Q(hashSet, new ydf0());
        int i = 0;
        for (StepSignupStage stepSignupStage : f82946a) {
            if (arrayListM147486Q.contains(stepSignupStage)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static StepSignupStage m111716b(List<StepSignupStage> list) {
        if (jyb.m147479J(list)) {
            return m111717c().get(0);
        }
        for (StepSignupStage stepSignupStage : m111717c()) {
            if (!list.contains(stepSignupStage)) {
                return stepSignupStage;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static List<StepSignupStage> m111717c() {
        if (!jyb.m147479J(f82947b)) {
            if (awi0.f73758b.get().booleanValue() && !f82947b.contains(StepSignupStage.get(StepSignupStage.google_email_saved))) {
                f82947b.add(0, StepSignupStage.get(StepSignupStage.google_email_saved));
            }
            return f82947b;
        }
        if (awi0.f73758b.get().booleanValue()) {
            f82947b.add(StepSignupStage.get(StepSignupStage.google_email_saved));
        }
        f82947b.add(StepSignupStage.get("gender-saved"));
        f82947b.add(StepSignupStage.get("birth-saved"));
        f82947b.add(StepSignupStage.get("name-saved"));
        f82947b.add(StepSignupStage.get(StepSignupStage.intlFriendPurpose_saved));
        if (IntlCountryCodeController.m29113j()) {
            f82947b.add(StepSignupStage.get(StepSignupStage.ethnicity_saved));
            f82947b.add(StepSignupStage.get(StepSignupStage.language_saved));
        }
        f82947b.add(StepSignupStage.get(StepSignupStage.picture_saved));
        return f82947b;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m111718d(User user) {
        return !(NullChecker.m82486a(user) && NullChecker.m82486a(user.settings) && !(TextUtils.isEmpty(user.settings.phoneNumber.number) && TextUtils.isEmpty(user.settings.linkedPhoneNumber.number)));
    }

    /* JADX INFO: renamed from: e */
    public static Intent m111719e(Act act) {
        return m111720f(act, ike.m140276h().f115355a.get());
    }

    /* JADX INFO: renamed from: f */
    public static Intent m111720f(Act act, String str) {
        return m111721g(act, jyb.m147486Q(ike.m140276h().f115356b.get(), new ydf0()), SignupStage.get(str));
    }

    /* JADX INFO: renamed from: g */
    public static Intent m111721g(Act act, List<StepSignupStage> list, SignupStage signupStage) {
        if (!NullChecker.m82488c(signupStage, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            ike.m140276h().m140286m();
            return SplashProxyAct.m81288l(act);
        }
        if (TEnum.equals(signupStage, "finished")) {
            return AccountModule.m29131H().newMainActClearStack(act, false, true);
        }
        if (TEnum.equals(signupStage, "unknown_")) {
            ike.m140276h().m140286m();
            return SplashProxyAct.m81288l(act);
        }
        StepSignupStage stepSignupStageM111723i = m111723i(list);
        if (!NullChecker.m82486a(stepSignupStageM111723i)) {
            ike.m140276h().m140286m();
            return SplashProxyAct.m81288l(act);
        }
        if (TEnum.equals(stepSignupStageM111723i, StepSignupStage.picture_saved)) {
            return SignUpProfileImageAct.m29501X1(act);
        }
        if (TEnum.equals(stepSignupStageM111723i, StepSignupStage.google_email_saved)) {
            return EmailLoginOptAct.m29661Z1(act, VerifyReason.get(VerifyReason.bind_email), "google_login_verify_email");
        }
        if (TEnum.equals(stepSignupStageM111723i, StepSignupStage.intlFriendPurpose_saved)) {
            return SignUpIntlFriendPurposeAct.INSTANCE.m29593a(act);
        }
        if (TEnum.equals(stepSignupStageM111723i, StepSignupStage.ethnicity_saved)) {
            return SignUpIntlEthnicityLanguageAct.INSTANCE.m29587a(act, false);
        }
        return TEnum.equals(stepSignupStageM111723i, StepSignupStage.language_saved) ? SignUpIntlEthnicityLanguageAct.INSTANCE.m29587a(act, true) : SignUpDetailsNewAct.m29495a2(act);
    }

    /* JADX INFO: renamed from: h */
    public static StepSignupStage m111722h() {
        return m111723i(jyb.m147486Q(ike.m140276h().f115356b.get(), new ydf0()));
    }

    /* JADX INFO: renamed from: i */
    public static StepSignupStage m111723i(List<StepSignupStage> list) {
        return m111716b(list);
    }

    /* JADX INFO: renamed from: j */
    public static int m111724j(long j, List<String> list) {
        if (!NullChecker.m82486a(list) || list.size() <= 1) {
            return 0;
        }
        return ((int) ((j * ((long) list.size())) / 1000)) + 3;
    }

    /* JADX INFO: renamed from: k */
    public static Intent m111725k(Context context, SignUpData signUpData) {
        StepSignupStage stepSignupStageM111722h = m111722h();
        if (TEnum.equals(stepSignupStageM111722h, StepSignupStage.intlFriendPurpose_saved)) {
            return SignUpIntlFriendPurposeAct.INSTANCE.m29593a(context);
        }
        if (TEnum.equals(stepSignupStageM111722h, StepSignupStage.google_email_saved)) {
            return EmailLoginOptAct.m29661Z1(context, VerifyReason.get(VerifyReason.bind_email), "google_login_verify_email");
        }
        if (TEnum.equals(stepSignupStageM111722h, StepSignupStage.ethnicity_saved)) {
            return SignUpIntlEthnicityLanguageAct.INSTANCE.m29588b(context, false, signUpData);
        }
        return TEnum.equals(stepSignupStageM111722h, StepSignupStage.language_saved) ? SignUpIntlEthnicityLanguageAct.INSTANCE.m29588b(context, true, signUpData) : SignUpProfileImageAct.m29502Y1(context, signUpData);
    }
}
