package p149l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.p050ui.accountnew.SignUpDetailsNewAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.SignUpProfileImageAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.intlsignup.SignUpIntlEthnicityLanguageAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.intlsignup.intlfirendpurpose.SignUpIntlFriendPurposeAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.EmailLoginOptAct;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.SignupStage;
import com.p046p1.mobile.putong.data.StepSignupStage;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.splash.SplashProxyAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.hp */
/* JADX INFO: loaded from: classes9.dex */
public class C17367hp {

    /* JADX INFO: renamed from: a */
    public static final StepSignupStage[] f108878a = {StepSignupStage.get("gender-saved"), StepSignupStage.get("birth-saved"), StepSignupStage.get("name-saved"), StepSignupStage.get(StepSignupStage.picture_saved)};

    /* JADX INFO: renamed from: b */
    public static List<StepSignupStage> f108879b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static int m132317a() {
        HashSet<String> hashSet = eje.m116824h().f91714b.get();
        if (hashSet.size() == 0) {
            return 0;
        }
        ArrayList arrayListM200303Q = vwb.m200303Q(hashSet, new r5f0());
        int i = 0;
        for (StepSignupStage stepSignupStage : f108878a) {
            if (arrayListM200303Q.contains(stepSignupStage)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static StepSignupStage m132318b(List<StepSignupStage> list) {
        if (vwb.m200296J(list)) {
            return m132319c().get(0);
        }
        for (StepSignupStage stepSignupStage : m132319c()) {
            if (!list.contains(stepSignupStage)) {
                return stepSignupStage;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static List<StepSignupStage> m132319c() {
        if (!vwb.m200296J(f108879b)) {
            if (zmi0.f203723b.get().booleanValue() && !f108879b.contains(StepSignupStage.get(StepSignupStage.google_email_saved))) {
                f108879b.add(0, StepSignupStage.get(StepSignupStage.google_email_saved));
            }
            return f108879b;
        }
        if (zmi0.f203723b.get().booleanValue()) {
            f108879b.add(StepSignupStage.get(StepSignupStage.google_email_saved));
        }
        f108879b.add(StepSignupStage.get("gender-saved"));
        f108879b.add(StepSignupStage.get("birth-saved"));
        f108879b.add(StepSignupStage.get("name-saved"));
        f108879b.add(StepSignupStage.get(StepSignupStage.intlFriendPurpose_saved));
        if (IntlCountryCodeController.m28114j()) {
            f108879b.add(StepSignupStage.get(StepSignupStage.ethnicity_saved));
            f108879b.add(StepSignupStage.get(StepSignupStage.language_saved));
        }
        f108879b.add(StepSignupStage.get(StepSignupStage.picture_saved));
        return f108879b;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m132320d(User user) {
        return !(NullChecker.m81303a(user) && NullChecker.m81303a(user.settings) && !(TextUtils.isEmpty(user.settings.phoneNumber.number) && TextUtils.isEmpty(user.settings.linkedPhoneNumber.number)));
    }

    /* JADX INFO: renamed from: e */
    public static Intent m132321e(Act act) {
        return m132322f(act, eje.m116824h().f91713a.get());
    }

    /* JADX INFO: renamed from: f */
    public static Intent m132322f(Act act, String str) {
        return m132323g(act, vwb.m200303Q(eje.m116824h().f91714b.get(), new r5f0()), SignupStage.get(str));
    }

    /* JADX INFO: renamed from: g */
    public static Intent m132323g(Act act, List<StepSignupStage> list, SignupStage signupStage) {
        if (!NullChecker.m81305c(signupStage, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            eje.m116824h().m116834m();
            return SplashProxyAct.m80105l(act);
        }
        if (TEnum.equals(signupStage, "finished")) {
            return AccountModule.m28132H().newMainActClearStack(act, false, true);
        }
        if (TEnum.equals(signupStage, "unknown_")) {
            eje.m116824h().m116834m();
            return SplashProxyAct.m80105l(act);
        }
        StepSignupStage stepSignupStageM132325i = m132325i(list);
        if (!NullChecker.m81303a(stepSignupStageM132325i)) {
            eje.m116824h().m116834m();
            return SplashProxyAct.m80105l(act);
        }
        if (TEnum.equals(stepSignupStageM132325i, StepSignupStage.picture_saved)) {
            return SignUpProfileImageAct.m28502V1(act);
        }
        if (TEnum.equals(stepSignupStageM132325i, StepSignupStage.google_email_saved)) {
            return EmailLoginOptAct.m28662Y1(act, VerifyReason.get(VerifyReason.bind_email), "google_login_verify_email");
        }
        if (TEnum.equals(stepSignupStageM132325i, StepSignupStage.intlFriendPurpose_saved)) {
            return SignUpIntlFriendPurposeAct.INSTANCE.m28594a(act);
        }
        if (TEnum.equals(stepSignupStageM132325i, StepSignupStage.ethnicity_saved)) {
            return SignUpIntlEthnicityLanguageAct.INSTANCE.m28588a(act, false);
        }
        return TEnum.equals(stepSignupStageM132325i, StepSignupStage.language_saved) ? SignUpIntlEthnicityLanguageAct.INSTANCE.m28588a(act, true) : SignUpDetailsNewAct.m28496Z1(act);
    }

    /* JADX INFO: renamed from: h */
    public static StepSignupStage m132324h() {
        return m132325i(vwb.m200303Q(eje.m116824h().f91714b.get(), new r5f0()));
    }

    /* JADX INFO: renamed from: i */
    public static StepSignupStage m132325i(List<StepSignupStage> list) {
        return m132318b(list);
    }

    /* JADX INFO: renamed from: j */
    public static int m132326j(long j, List<String> list) {
        if (!NullChecker.m81303a(list) || list.size() <= 1) {
            return 0;
        }
        return ((int) ((j * ((long) list.size())) / 1000)) + 3;
    }

    /* JADX INFO: renamed from: k */
    public static Intent m132327k(Context context, SignUpData signUpData) {
        StepSignupStage stepSignupStageM132324h = m132324h();
        if (TEnum.equals(stepSignupStageM132324h, StepSignupStage.intlFriendPurpose_saved)) {
            return SignUpIntlFriendPurposeAct.INSTANCE.m28594a(context);
        }
        if (TEnum.equals(stepSignupStageM132324h, StepSignupStage.google_email_saved)) {
            return EmailLoginOptAct.m28662Y1(context, VerifyReason.get(VerifyReason.bind_email), "google_login_verify_email");
        }
        if (TEnum.equals(stepSignupStageM132324h, StepSignupStage.ethnicity_saved)) {
            return SignUpIntlEthnicityLanguageAct.INSTANCE.m28589b(context, false, signUpData);
        }
        return TEnum.equals(stepSignupStageM132324h, StepSignupStage.language_saved) ? SignUpIntlEthnicityLanguageAct.INSTANCE.m28589b(context, true, signUpData) : SignUpProfileImageAct.m28503X1(context, signUpData);
    }
}
