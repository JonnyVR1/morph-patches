package p006l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.p002ui.accountnew.SignUpDetailsNewAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.SignUpProfileImageAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.intlsignup.SignUpIntlEthnicityLanguageAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.intlsignup.intlfirendpurpose.SignUpIntlFriendPurposeAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.EmailLoginOptAct;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.SignupStage;
import com.p1.mobile.putong.data.StepSignupStage;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.splash.SplashProxyAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import l.vwb;

/* JADX INFO: renamed from: l.hp */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0811hp {

    /* JADX INFO: renamed from: a */
    public static final StepSignupStage[] f13992a = {StepSignupStage.get("gender-saved"), StepSignupStage.get("birth-saved"), StepSignupStage.get("name-saved"), StepSignupStage.get("picture-saved")};

    /* JADX INFO: renamed from: b */
    public static List<StepSignupStage> f13993b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static int m16301a() {
        HashSet hashSet = (HashSet) eje.m14574h().f11186b.get();
        if (hashSet.size() == 0) {
            return 0;
        }
        ArrayList arrayListQ = vwb.Q(hashSet, new r5f0());
        int i = 0;
        for (StepSignupStage stepSignupStage : f13992a) {
            if (arrayListQ.contains(stepSignupStage)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static StepSignupStage m16302b(List<StepSignupStage> list) {
        if (vwb.J(list)) {
            return m16303c().get(0);
        }
        for (StepSignupStage stepSignupStage : m16303c()) {
            if (!list.contains(stepSignupStage)) {
                return stepSignupStage;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static List<StepSignupStage> m16303c() {
        if (!vwb.J(f13993b)) {
            if (((Boolean) zmi0.f28826b.get()).booleanValue() && !f13993b.contains(StepSignupStage.get("google-email-saved"))) {
                f13993b.add(0, StepSignupStage.get("google-email-saved"));
            }
            return f13993b;
        }
        if (((Boolean) zmi0.f28826b.get()).booleanValue()) {
            f13993b.add(StepSignupStage.get("google-email-saved"));
        }
        f13993b.add(StepSignupStage.get("gender-saved"));
        f13993b.add(StepSignupStage.get("birth-saved"));
        f13993b.add(StepSignupStage.get("name-saved"));
        f13993b.add(StepSignupStage.get("intlFriendPurpose-saved"));
        if (IntlCountryCodeController.m9j()) {
            f13993b.add(StepSignupStage.get("ethnicity-saved"));
            f13993b.add(StepSignupStage.get("language-saved"));
        }
        f13993b.add(StepSignupStage.get("picture-saved"));
        return f13993b;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m16304d(User user) {
        return !(NullChecker.a(user) && NullChecker.a(user.settings) && !(TextUtils.isEmpty(user.settings.phoneNumber.number) && TextUtils.isEmpty(user.settings.linkedPhoneNumber.number)));
    }

    /* JADX INFO: renamed from: e */
    public static Intent m16305e(Act act) {
        return m16306f(act, (String) eje.m14574h().f11185a.get());
    }

    /* JADX INFO: renamed from: f */
    public static Intent m16306f(Act act, String str) {
        return m16307g(act, vwb.Q((Collection) eje.m14574h().f11186b.get(), new r5f0()), SignupStage.get(str));
    }

    /* JADX INFO: renamed from: g */
    public static Intent m16307g(Act act, List<StepSignupStage> list, SignupStage signupStage) {
        if (!NullChecker.c(signupStage, "account", CrashHelper.ReportLevel.p9)) {
            eje.m14574h().m14584m();
            return SplashProxyAct.l(act);
        }
        if (TEnum.equals(signupStage, "finished")) {
            return AccountModule.m27H().newMainActClearStack(act, false, true);
        }
        if (TEnum.equals(signupStage, "unknown_")) {
            eje.m14574h().m14584m();
            return SplashProxyAct.l(act);
        }
        StepSignupStage stepSignupStageM16309i = m16309i(list);
        if (!NullChecker.a(stepSignupStageM16309i)) {
            eje.m14574h().m14584m();
            return SplashProxyAct.l(act);
        }
        if (TEnum.equals(stepSignupStageM16309i, "picture-saved")) {
            return SignUpProfileImageAct.m398V1(act);
        }
        if (TEnum.equals(stepSignupStageM16309i, "google-email-saved")) {
            return EmailLoginOptAct.m561Y1(act, VerifyReason.get("bind-email"), "google_login_verify_email");
        }
        if (TEnum.equals(stepSignupStageM16309i, "intlFriendPurpose-saved")) {
            return SignUpIntlFriendPurposeAct.INSTANCE.m491a(act);
        }
        if (TEnum.equals(stepSignupStageM16309i, "ethnicity-saved")) {
            return SignUpIntlEthnicityLanguageAct.INSTANCE.m485a(act, false);
        }
        return TEnum.equals(stepSignupStageM16309i, "language-saved") ? SignUpIntlEthnicityLanguageAct.INSTANCE.m485a(act, true) : SignUpDetailsNewAct.m392Z1(act);
    }

    /* JADX INFO: renamed from: h */
    public static StepSignupStage m16308h() {
        return m16309i(vwb.Q((HashSet) eje.m14574h().f11186b.get(), new r5f0()));
    }

    /* JADX INFO: renamed from: i */
    public static StepSignupStage m16309i(List<StepSignupStage> list) {
        return m16302b(list);
    }

    /* JADX INFO: renamed from: j */
    public static int m16310j(long j, List<String> list) {
        if (!NullChecker.a(list) || list.size() <= 1) {
            return 0;
        }
        return ((int) ((j * ((long) list.size())) / 1000)) + 3;
    }

    /* JADX INFO: renamed from: k */
    public static Intent m16311k(Context context, SignUpData signUpData) {
        StepSignupStage stepSignupStageM16308h = m16308h();
        if (TEnum.equals(stepSignupStageM16308h, "intlFriendPurpose-saved")) {
            return SignUpIntlFriendPurposeAct.INSTANCE.m491a(context);
        }
        if (TEnum.equals(stepSignupStageM16308h, "google-email-saved")) {
            return EmailLoginOptAct.m561Y1(context, VerifyReason.get("bind-email"), "google_login_verify_email");
        }
        if (TEnum.equals(stepSignupStageM16308h, "ethnicity-saved")) {
            return SignUpIntlEthnicityLanguageAct.INSTANCE.m486b(context, false, signUpData);
        }
        return TEnum.equals(stepSignupStageM16308h, "language-saved") ? SignUpIntlEthnicityLanguageAct.INSTANCE.m486b(context, true, signUpData) : SignUpProfileImageAct.m399X1(context, signUpData);
    }
}
