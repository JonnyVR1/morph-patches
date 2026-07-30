package p149l;

import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.hume.readapk.HumeSDK;
import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p046p1.mobile.account_core.reponse_data.Data;
import com.p046p1.mobile.account_core.reponse_data.Token;
import com.p046p1.mobile.account_core.request_data.SignupData;
import com.p046p1.mobile.account_core.request_data.ThirdPartyAccount;
import com.p046p1.mobile.account_phone.data.PhoneSigninType;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.account.api.C4575a;
import com.p046p1.mobile.putong.account.api.C4576b;
import com.p046p1.mobile.putong.account.data.EmailActiveData;
import com.p046p1.mobile.putong.account.data.EmailBindPhoneData;
import com.p046p1.mobile.putong.account.data.EmailRequestData;
import com.p046p1.mobile.putong.account.data.EmailSendCaptchaData;
import com.p046p1.mobile.putong.account.data.EmailSignupEarlyUIDData;
import com.p046p1.mobile.putong.account.data.EmailVerifyCaptchaData;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.VerifyDataV2;
import com.p046p1.mobile.putong.data.VerifyReason;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class dte extends C4576b {

    /* JADX INFO: renamed from: g */
    public boolean f87833g = false;

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m113544g(EmailVerifyCaptchaData emailVerifyCaptchaData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || TextUtils.isEmpty(data.action)) {
            C20975ww.m205790a("EmailAccountApi/email/code/verify", emailVerifyCaptchaData);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Pair m113545h(AccountEnvelop accountEnvelop) {
        String str;
        String str2 = accountEnvelop.data.action;
        Map<String, String> map = accountEnvelop.extra;
        if (map != null) {
            String str3 = map.get("tttAction");
            if (TextUtils.equals(str3, VerifyReason.signin) || TextUtils.equals(str3, VerifyReason.signup) || TextUtils.equals(str3, "pending") || TextUtils.equals(str3, VerifyReason.ttt_signup)) {
                str2 = str3;
            }
            str = accountEnvelop.extra.get("tttToken");
        } else {
            str = "";
        }
        return new Pair(str2, str);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m113549l(EmailSignupEarlyUIDData emailSignupEarlyUIDData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("EmailAccountApi/ttt-signup", emailSignupEarlyUIDData);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m113551n(EmailSendCaptchaData emailSendCaptchaData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.meta == null) {
            C20975ww.m205790a("EmailAccountApi/email/code/send", emailSendCaptchaData);
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m113552o(EmailBindPhoneData emailBindPhoneData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("EmailAccountApi/change-email", emailBindPhoneData);
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m113553p(EmailActiveData emailActiveData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("EmailAccountApi/email/activate", emailActiveData);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m113554q(EmailSignupEarlyUIDData emailSignupEarlyUIDData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("EmailAccountApi/email/stage/signup", emailSignupEarlyUIDData);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m113556s(EmailRequestData emailRequestData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("EmailAccountApi/email/signin", emailRequestData);
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m113557t(EmailBindPhoneData emailBindPhoneData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("EmailAccountApi/bind-email", emailBindPhoneData);
        }
    }

    /* JADX INFO: renamed from: A */
    public C22306c<Boolean> m113560A(final EmailSendCaptchaData emailSendCaptchaData) {
        return x14.m206656b().m206659d("/email/code/send", emailSendCaptchaData.toJson()).doOnNext(new e30() { // from class: l.nse
            @Override // p149l.e30
            public final void call(Object obj) {
                dte.m113551n(emailSendCaptchaData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.use
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).meta.code == 200000);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public C22306c<Token> m113561B(SignInData signInData, boolean z) {
        if (z) {
            EmailActiveData emailActiveData = new EmailActiveData();
            emailActiveData.setPassword(signInData.password);
            Integer num = signInData.code;
            if (num != null) {
                emailActiveData.code = num.intValue();
            }
            if (TextUtils.isEmpty(signInData.password)) {
                emailActiveData.activateType = PhoneSigninType.confirmation_code;
            } else {
                emailActiveData.activateType = PhoneSigninType.password;
            }
            emailActiveData.email = signInData.username;
            emailActiveData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
            C4575a.m28210S0(emailActiveData, false);
            return m113566w(emailActiveData);
        }
        EmailRequestData emailRequestData = new EmailRequestData();
        emailRequestData.setPassword(signInData.password);
        if (TextUtils.isEmpty(signInData.password)) {
            emailRequestData.signinType = PhoneSigninType.confirmation_code;
        } else {
            emailRequestData.signinType = PhoneSigninType.password;
        }
        Integer num2 = signInData.code;
        if (num2 != null) {
            emailRequestData.code = num2.intValue();
        }
        emailRequestData.email = signInData.username;
        emailRequestData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        if (!TextUtils.isEmpty(signInData.captchaToken)) {
            emailRequestData.addExtraData("captchaToken", signInData.captchaToken);
        }
        if (!TextUtils.isEmpty(signInData.captchaValue)) {
            emailRequestData.addExtraData("captchaValue", signInData.captchaValue);
        }
        C4575a.m28210S0(emailRequestData, true);
        return m113563D(emailRequestData);
    }

    /* JADX INFO: renamed from: C */
    public C22306c<Token> m113562C(SignUpData signUpData) {
        final EmailSignupEarlyUIDData emailSignupEarlyUIDData = new EmailSignupEarlyUIDData();
        emailSignupEarlyUIDData.code = signUpData.code;
        emailSignupEarlyUIDData.email = signUpData.email;
        if (!TextUtils.isEmpty(signUpData.thirdPartyId)) {
            ThirdPartyAccount thirdPartyAccount = new ThirdPartyAccount();
            thirdPartyAccount.f14811id = signUpData.thirdPartyId;
            thirdPartyAccount.token = signUpData.thirdPartyToken;
            emailSignupEarlyUIDData.thirdPartyAccount = thirdPartyAccount;
        }
        emailSignupEarlyUIDData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        m113569z(emailSignupEarlyUIDData, 0, true, false);
        return x14.m206656b().m206659d("/email/stage/signup", emailSignupEarlyUIDData.toJson()).doOnNext(new e30() { // from class: l.qse
            @Override // p149l.e30
            public final void call(Object obj) {
                dte.m113554q(emailSignupEarlyUIDData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.rse
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public C22306c<Token> m113563D(final EmailRequestData emailRequestData) {
        return x14.m206656b().m206659d("/email/signin", emailRequestData.toJson()).doOnNext(new e30() { // from class: l.xse
            @Override // p149l.e30
            public final void call(Object obj) {
                dte.m113556s(emailRequestData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.yse
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public C22306c<Token> m113564E(SignUpData signUpData) {
        final EmailSignupEarlyUIDData emailSignupEarlyUIDData = new EmailSignupEarlyUIDData();
        emailSignupEarlyUIDData.code = signUpData.code;
        emailSignupEarlyUIDData.email = signUpData.email;
        if (!TextUtils.isEmpty(signUpData.thirdPartyId)) {
            ThirdPartyAccount thirdPartyAccount = new ThirdPartyAccount();
            thirdPartyAccount.f14811id = signUpData.thirdPartyId;
            thirdPartyAccount.token = signUpData.thirdPartyToken;
            emailSignupEarlyUIDData.thirdPartyAccount = thirdPartyAccount;
        }
        emailSignupEarlyUIDData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        m113569z(emailSignupEarlyUIDData, 0, true, false);
        return x14.m206656b().m206659d("/ttt-signup", emailSignupEarlyUIDData.toJson()).doOnNext(new e30() { // from class: l.bte
            @Override // p149l.e30
            public final void call(Object obj) {
                dte.m113549l(emailSignupEarlyUIDData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.cte
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public C22306c<Pair<String, String>> m113565F(final EmailVerifyCaptchaData emailVerifyCaptchaData) {
        return x14.m206656b().m206659d("/email/code/verify", emailVerifyCaptchaData.toJson()).doOnNext(new e30() { // from class: l.sse
            @Override // p149l.e30
            public final void call(Object obj) {
                dte.m113544g(emailVerifyCaptchaData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.tse
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return dte.m113545h((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final C22306c<Token> m113566w(final EmailActiveData emailActiveData) {
        return x14.m206656b().m206659d("/email/activate", emailActiveData.toJson()).doOnNext(new e30() { // from class: l.vse
            @Override // p149l.e30
            public final void call(Object obj) {
                dte.m113553p(emailActiveData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.wse
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public C22306c<Token> m113567x(VerifyDataV2 verifyDataV2) {
        final EmailBindPhoneData emailBindPhoneData = new EmailBindPhoneData();
        emailBindPhoneData.code = verifyDataV2.code;
        emailBindPhoneData.email = verifyDataV2.email;
        return x14.m206656b().m206659d("/email/bind", emailBindPhoneData.toJson()).doOnNext(new e30() { // from class: l.zse
            @Override // p149l.e30
            public final void call(Object obj) {
                dte.m113557t(emailBindPhoneData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.ate
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public C22306c<Token> m113568y(VerifyDataV2 verifyDataV2) {
        final EmailBindPhoneData emailBindPhoneData = new EmailBindPhoneData();
        emailBindPhoneData.code = verifyDataV2.code;
        emailBindPhoneData.email = verifyDataV2.email;
        emailBindPhoneData.signinType = PhoneSigninType.confirmation_code;
        emailBindPhoneData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        return x14.m206656b().m206659d("/email/change", emailBindPhoneData.toJson()).doOnNext(new e30() { // from class: l.ose
            @Override // p149l.e30
            public final void call(Object obj) {
                dte.m113552o(emailBindPhoneData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.pse
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m113569z(SignupData signupData, int i, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                String strM144035g = k0f0.m144032f().m144035g();
                String strM180915K3 = rup0.m180915K3();
                if (!TextUtils.isEmpty(strM144035g)) {
                    jSONObject.put("mmuid", strM144035g);
                }
                if (!TextUtils.isEmpty(strM180915K3)) {
                    jSONObject.put("inviteCode", strM180915K3);
                }
            }
            jSONObject.put("browserUA", bjp0.getDefaultUserAgent(App.f15369e));
            jSONObject.put("deviceModelRaw", Build.MODEL);
            if (i > 0) {
                jSONObject.put("pictureDelaySeconds", "" + i);
            }
            if (z2 && ruk.m180873g() && ruk.m180872c().m180879h()) {
                jSONObject.put("adReferrer", ruk.m180872c().m180876d());
                jSONObject.put("adClickTime", ruk.m180872c().m180874a());
                jSONObject.put("adInstallTime", ruk.m180872c().m180875b());
                jSONObject.put("track", ruk.m180872c().m180877e());
            }
            if (!TextUtils.isEmpty(mr4.f135329a) && mr4.f135329a.toLowerCase().startsWith("douyin")) {
                jSONObject.put("toutiao_channel", HumeSDK.getChannel(App.f15369e));
            }
            signupData.addExtraData("extra", jSONObject.toString());
        } catch (JSONException unused) {
        }
    }
}
