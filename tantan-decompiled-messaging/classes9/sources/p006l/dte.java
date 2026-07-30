package p006l;

import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.hume.readapk.HumeSDK;
import com.p000p1.mobile.putong.account.api.C0001a;
import com.p000p1.mobile.putong.account.api.C0002b;
import com.p000p1.mobile.putong.account.data.EmailActiveData;
import com.p000p1.mobile.putong.account.data.EmailBindPhoneData;
import com.p000p1.mobile.putong.account.data.EmailRequestData;
import com.p000p1.mobile.putong.account.data.EmailSendCaptchaData;
import com.p000p1.mobile.putong.account.data.EmailSignupEarlyUIDData;
import com.p000p1.mobile.putong.account.data.EmailVerifyCaptchaData;
import com.p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p1.mobile.account_core.reponse_data.Data;
import com.p1.mobile.account_core.reponse_data.Token;
import com.p1.mobile.account_core.request_data.SignupData;
import com.p1.mobile.account_core.request_data.ThirdPartyAccount;
import com.p1.mobile.account_phone.data.PhoneSigninType;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.VerifyDataV2;
import java.util.Map;
import l.e30;
import l.w9j;
import l.ww;
import l.x14;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class dte extends C0002b {

    /* JADX INFO: renamed from: g */
    public boolean f10561g = false;

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m14220g(EmailVerifyCaptchaData emailVerifyCaptchaData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || TextUtils.isEmpty(data.action)) {
            ww.a("EmailAccountApi/email/code/verify", emailVerifyCaptchaData);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Pair m14221h(AccountEnvelop accountEnvelop) {
        String str;
        String str2 = accountEnvelop.data.action;
        Map map = accountEnvelop.extra;
        if (map != null) {
            String str3 = (String) map.get("tttAction");
            if (TextUtils.equals(str3, "signin") || TextUtils.equals(str3, "signup") || TextUtils.equals(str3, "pending") || TextUtils.equals(str3, "ttt-signup")) {
                str2 = str3;
            }
            str = (String) accountEnvelop.extra.get("tttToken");
        } else {
            str = "";
        }
        return new Pair(str2, str);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m14225l(EmailSignupEarlyUIDData emailSignupEarlyUIDData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            ww.a("EmailAccountApi/ttt-signup", emailSignupEarlyUIDData);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m14227n(EmailSendCaptchaData emailSendCaptchaData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.meta == null) {
            ww.a("EmailAccountApi/email/code/send", emailSendCaptchaData);
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m14228o(EmailBindPhoneData emailBindPhoneData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            ww.a("EmailAccountApi/change-email", emailBindPhoneData);
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m14229p(EmailActiveData emailActiveData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            ww.a("EmailAccountApi/email/activate", emailActiveData);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m14230q(EmailSignupEarlyUIDData emailSignupEarlyUIDData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            ww.a("EmailAccountApi/email/stage/signup", emailSignupEarlyUIDData);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m14232s(EmailRequestData emailRequestData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            ww.a("EmailAccountApi/email/signin", emailRequestData);
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m14233t(EmailBindPhoneData emailBindPhoneData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            ww.a("EmailAccountApi/bind-email", emailBindPhoneData);
        }
    }

    /* JADX INFO: renamed from: A */
    public c<Boolean> m14236A(final EmailSendCaptchaData emailSendCaptchaData) {
        return x14.b().d("/email/code/send", emailSendCaptchaData.toJson()).doOnNext(new e30() { // from class: l.nse
            public final void call(Object obj) {
                dte.m14227n(emailSendCaptchaData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.use
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).meta.code == 200000);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public c<Token> m14237B(SignInData signInData, boolean z) {
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
            emailActiveData.addExtraData("device", pk8.m21562M().toJson());
            C0001a.m105S0(emailActiveData, false);
            return m14242w(emailActiveData);
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
        emailRequestData.addExtraData("device", pk8.m21562M().toJson());
        if (!TextUtils.isEmpty(signInData.captchaToken)) {
            emailRequestData.addExtraData("captchaToken", signInData.captchaToken);
        }
        if (!TextUtils.isEmpty(signInData.captchaValue)) {
            emailRequestData.addExtraData("captchaValue", signInData.captchaValue);
        }
        C0001a.m105S0(emailRequestData, true);
        return m14239D(emailRequestData);
    }

    /* JADX INFO: renamed from: C */
    public c<Token> m14238C(SignUpData signUpData) {
        final EmailSignupEarlyUIDData emailSignupEarlyUIDData = new EmailSignupEarlyUIDData();
        emailSignupEarlyUIDData.code = signUpData.code;
        emailSignupEarlyUIDData.email = signUpData.email;
        if (!TextUtils.isEmpty(signUpData.thirdPartyId)) {
            ThirdPartyAccount thirdPartyAccount = new ThirdPartyAccount();
            thirdPartyAccount.id = signUpData.thirdPartyId;
            thirdPartyAccount.token = signUpData.thirdPartyToken;
            emailSignupEarlyUIDData.thirdPartyAccount = thirdPartyAccount;
        }
        emailSignupEarlyUIDData.addExtraData("device", pk8.m21562M().toJson());
        m14245z(emailSignupEarlyUIDData, 0, true, false);
        return x14.b().d("/email/stage/signup", emailSignupEarlyUIDData.toJson()).doOnNext(new e30() { // from class: l.qse
            public final void call(Object obj) {
                dte.m14230q(emailSignupEarlyUIDData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.rse
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public c<Token> m14239D(final EmailRequestData emailRequestData) {
        return x14.b().d("/email/signin", emailRequestData.toJson()).doOnNext(new e30() { // from class: l.xse
            public final void call(Object obj) {
                dte.m14232s(emailRequestData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.yse
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public c<Token> m14240E(SignUpData signUpData) {
        final EmailSignupEarlyUIDData emailSignupEarlyUIDData = new EmailSignupEarlyUIDData();
        emailSignupEarlyUIDData.code = signUpData.code;
        emailSignupEarlyUIDData.email = signUpData.email;
        if (!TextUtils.isEmpty(signUpData.thirdPartyId)) {
            ThirdPartyAccount thirdPartyAccount = new ThirdPartyAccount();
            thirdPartyAccount.id = signUpData.thirdPartyId;
            thirdPartyAccount.token = signUpData.thirdPartyToken;
            emailSignupEarlyUIDData.thirdPartyAccount = thirdPartyAccount;
        }
        emailSignupEarlyUIDData.addExtraData("device", pk8.m21562M().toJson());
        m14245z(emailSignupEarlyUIDData, 0, true, false);
        return x14.b().d("/ttt-signup", emailSignupEarlyUIDData.toJson()).doOnNext(new e30() { // from class: l.bte
            public final void call(Object obj) {
                dte.m14225l(emailSignupEarlyUIDData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.cte
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public c<Pair<String, String>> m14241F(final EmailVerifyCaptchaData emailVerifyCaptchaData) {
        return x14.b().d("/email/code/verify", emailVerifyCaptchaData.toJson()).doOnNext(new e30() { // from class: l.sse
            public final void call(Object obj) {
                dte.m14220g(emailVerifyCaptchaData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.tse
            public final Object call(Object obj) {
                return dte.m14221h((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final c<Token> m14242w(final EmailActiveData emailActiveData) {
        return x14.b().d("/email/activate", emailActiveData.toJson()).doOnNext(new e30() { // from class: l.vse
            public final void call(Object obj) {
                dte.m14229p(emailActiveData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.wse
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public c<Token> m14243x(VerifyDataV2 verifyDataV2) {
        final EmailBindPhoneData emailBindPhoneData = new EmailBindPhoneData();
        emailBindPhoneData.code = verifyDataV2.code;
        emailBindPhoneData.email = verifyDataV2.email;
        return x14.b().d("/email/bind", emailBindPhoneData.toJson()).doOnNext(new e30() { // from class: l.zse
            public final void call(Object obj) {
                dte.m14233t(emailBindPhoneData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.ate
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public c<Token> m14244y(VerifyDataV2 verifyDataV2) {
        final EmailBindPhoneData emailBindPhoneData = new EmailBindPhoneData();
        emailBindPhoneData.code = verifyDataV2.code;
        emailBindPhoneData.email = verifyDataV2.email;
        emailBindPhoneData.signinType = PhoneSigninType.confirmation_code;
        emailBindPhoneData.addExtraData("device", pk8.m21562M().toJson());
        return x14.b().d("/email/change", emailBindPhoneData.toJson()).doOnNext(new e30() { // from class: l.ose
            public final void call(Object obj) {
                dte.m14228o(emailBindPhoneData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.pse
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m14245z(SignupData signupData, int i, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                String strM17885g = k0f0.m17882f().m17885g();
                String strM22991K3 = rup0.m22991K3();
                if (!TextUtils.isEmpty(strM17885g)) {
                    jSONObject.put("mmuid", strM17885g);
                }
                if (!TextUtils.isEmpty(strM22991K3)) {
                    jSONObject.put("inviteCode", strM22991K3);
                }
            }
            jSONObject.put("browserUA", bjp0.getDefaultUserAgent(App.e));
            jSONObject.put("deviceModelRaw", Build.MODEL);
            if (i > 0) {
                jSONObject.put("pictureDelaySeconds", "" + i);
            }
            if (z2 && ruk.m22952g() && ruk.m22951c().m22958h()) {
                jSONObject.put("adReferrer", ruk.m22951c().m22955d());
                jSONObject.put("adClickTime", ruk.m22951c().m22953a());
                jSONObject.put("adInstallTime", ruk.m22951c().m22954b());
                jSONObject.put("track", ruk.m22951c().m22956e());
            }
            if (!TextUtils.isEmpty(mr4.f17192a) && mr4.f17192a.toLowerCase().startsWith("douyin")) {
                jSONObject.put("toutiao_channel", HumeSDK.getChannel(App.e));
            }
            signupData.addExtraData("extra", jSONObject.toString());
        } catch (JSONException unused) {
        }
    }
}
