package p153l;

import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.hume.readapk.HumeSDK;
import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p051p1.mobile.account_core.reponse_data.Data;
import com.p051p1.mobile.account_core.reponse_data.Token;
import com.p051p1.mobile.account_core.request_data.SignupData;
import com.p051p1.mobile.account_core.request_data.ThirdPartyAccount;
import com.p051p1.mobile.account_phone.data.PhoneSigninType;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.account.api.C4726a;
import com.p051p1.mobile.putong.account.api.C4727b;
import com.p051p1.mobile.putong.account.data.EmailActiveData;
import com.p051p1.mobile.putong.account.data.EmailBindPhoneData;
import com.p051p1.mobile.putong.account.data.EmailRequestData;
import com.p051p1.mobile.putong.account.data.EmailSendCaptchaData;
import com.p051p1.mobile.putong.account.data.EmailSignupEarlyUIDData;
import com.p051p1.mobile.putong.account.data.EmailVerifyCaptchaData;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.VerifyDataV2;
import com.p051p1.mobile.putong.data.VerifyReason;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class hue extends C4727b {

    /* JADX INFO: renamed from: g */
    public boolean f111637g = false;

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m137143g(EmailVerifyCaptchaData emailVerifyCaptchaData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || TextUtils.isEmpty(data.action)) {
            C19682qw.m178399a("EmailAccountApi/email/code/verify", emailVerifyCaptchaData);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Pair m137144h(AccountEnvelop accountEnvelop) {
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
    public static /* synthetic */ void m137148l(EmailSignupEarlyUIDData emailSignupEarlyUIDData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("EmailAccountApi/ttt-signup", emailSignupEarlyUIDData);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m137150n(EmailSendCaptchaData emailSendCaptchaData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.meta == null) {
            C19682qw.m178399a("EmailAccountApi/email/code/send", emailSendCaptchaData);
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m137151o(EmailBindPhoneData emailBindPhoneData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("EmailAccountApi/change-email", emailBindPhoneData);
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m137152p(EmailActiveData emailActiveData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("EmailAccountApi/email/activate", emailActiveData);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m137153q(EmailSignupEarlyUIDData emailSignupEarlyUIDData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("EmailAccountApi/email/stage/signup", emailSignupEarlyUIDData);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m137155s(EmailRequestData emailRequestData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("EmailAccountApi/email/signin", emailRequestData);
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m137156t(EmailBindPhoneData emailBindPhoneData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("EmailAccountApi/bind-email", emailBindPhoneData);
        }
    }

    /* JADX INFO: renamed from: A */
    public C22421c<Boolean> m137159A(final EmailSendCaptchaData emailSendCaptchaData) {
        return w24.m204501b().m204504d("/email/code/send", emailSendCaptchaData.toJson()).doOnNext(new y20() { // from class: l.rte
            @Override // p153l.y20
            public final void call(Object obj) {
                hue.m137150n(emailSendCaptchaData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.yte
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).meta.code == 200000);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public C22421c<Token> m137160B(SignInData signInData, boolean z) {
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
            emailActiveData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
            C4726a.m29209S0(emailActiveData, false);
            return m137165w(emailActiveData);
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
        emailRequestData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        if (!TextUtils.isEmpty(signInData.captchaToken)) {
            emailRequestData.addExtraData("captchaToken", signInData.captchaToken);
        }
        if (!TextUtils.isEmpty(signInData.captchaValue)) {
            emailRequestData.addExtraData("captchaValue", signInData.captchaValue);
        }
        C4726a.m29209S0(emailRequestData, true);
        return m137162D(emailRequestData);
    }

    /* JADX INFO: renamed from: C */
    public C22421c<Token> m137161C(SignUpData signUpData) {
        final EmailSignupEarlyUIDData emailSignupEarlyUIDData = new EmailSignupEarlyUIDData();
        emailSignupEarlyUIDData.code = signUpData.code;
        emailSignupEarlyUIDData.email = signUpData.email;
        if (!TextUtils.isEmpty(signUpData.thirdPartyId)) {
            ThirdPartyAccount thirdPartyAccount = new ThirdPartyAccount();
            thirdPartyAccount.f15530id = signUpData.thirdPartyId;
            thirdPartyAccount.token = signUpData.thirdPartyToken;
            emailSignupEarlyUIDData.thirdPartyAccount = thirdPartyAccount;
        }
        emailSignupEarlyUIDData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        m137168z(emailSignupEarlyUIDData, 0, true, false);
        return w24.m204501b().m204504d("/email/stage/signup", emailSignupEarlyUIDData.toJson()).doOnNext(new y20() { // from class: l.ute
            @Override // p153l.y20
            public final void call(Object obj) {
                hue.m137153q(emailSignupEarlyUIDData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.vte
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public C22421c<Token> m137162D(final EmailRequestData emailRequestData) {
        return w24.m204501b().m204504d("/email/signin", emailRequestData.toJson()).doOnNext(new y20() { // from class: l.bue
            @Override // p153l.y20
            public final void call(Object obj) {
                hue.m137155s(emailRequestData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.cue
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public C22421c<Token> m137163E(SignUpData signUpData) {
        final EmailSignupEarlyUIDData emailSignupEarlyUIDData = new EmailSignupEarlyUIDData();
        emailSignupEarlyUIDData.code = signUpData.code;
        emailSignupEarlyUIDData.email = signUpData.email;
        if (!TextUtils.isEmpty(signUpData.thirdPartyId)) {
            ThirdPartyAccount thirdPartyAccount = new ThirdPartyAccount();
            thirdPartyAccount.f15530id = signUpData.thirdPartyId;
            thirdPartyAccount.token = signUpData.thirdPartyToken;
            emailSignupEarlyUIDData.thirdPartyAccount = thirdPartyAccount;
        }
        emailSignupEarlyUIDData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        m137168z(emailSignupEarlyUIDData, 0, true, false);
        return w24.m204501b().m204504d("/ttt-signup", emailSignupEarlyUIDData.toJson()).doOnNext(new y20() { // from class: l.fue
            @Override // p153l.y20
            public final void call(Object obj) {
                hue.m137148l(emailSignupEarlyUIDData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.gue
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public C22421c<Pair<String, String>> m137164F(final EmailVerifyCaptchaData emailVerifyCaptchaData) {
        return w24.m204501b().m204504d("/email/code/verify", emailVerifyCaptchaData.toJson()).doOnNext(new y20() { // from class: l.wte
            @Override // p153l.y20
            public final void call(Object obj) {
                hue.m137143g(emailVerifyCaptchaData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.xte
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return hue.m137144h((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final C22421c<Token> m137165w(final EmailActiveData emailActiveData) {
        return w24.m204501b().m204504d("/email/activate", emailActiveData.toJson()).doOnNext(new y20() { // from class: l.zte
            @Override // p153l.y20
            public final void call(Object obj) {
                hue.m137152p(emailActiveData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.aue
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public C22421c<Token> m137166x(VerifyDataV2 verifyDataV2) {
        final EmailBindPhoneData emailBindPhoneData = new EmailBindPhoneData();
        emailBindPhoneData.code = verifyDataV2.code;
        emailBindPhoneData.email = verifyDataV2.email;
        return w24.m204501b().m204504d("/email/bind", emailBindPhoneData.toJson()).doOnNext(new y20() { // from class: l.due
            @Override // p153l.y20
            public final void call(Object obj) {
                hue.m137156t(emailBindPhoneData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.eue
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public C22421c<Token> m137167y(VerifyDataV2 verifyDataV2) {
        final EmailBindPhoneData emailBindPhoneData = new EmailBindPhoneData();
        emailBindPhoneData.code = verifyDataV2.code;
        emailBindPhoneData.email = verifyDataV2.email;
        emailBindPhoneData.signinType = PhoneSigninType.confirmation_code;
        emailBindPhoneData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        return w24.m204501b().m204504d("/email/change", emailBindPhoneData.toJson()).doOnNext(new y20() { // from class: l.ste
            @Override // p153l.y20
            public final void call(Object obj) {
                hue.m137151o(emailBindPhoneData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.tte
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m137168z(SignupData signupData, int i, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                String strM180190g = r8f0.m180187f().m180190g();
                String strM199325K3 = v3q0.m199325K3();
                if (!TextUtils.isEmpty(strM180190g)) {
                    jSONObject.put("mmuid", strM180190g);
                }
                if (!TextUtils.isEmpty(strM199325K3)) {
                    jSONObject.put("inviteCode", strM199325K3);
                }
            }
            jSONObject.put("browserUA", gsp0.getDefaultUserAgent(App.f16088e));
            jSONObject.put("deviceModelRaw", Build.MODEL);
            if (i > 0) {
                jSONObject.put("pictureDelaySeconds", "" + i);
            }
            if (z2 && hxk.m137623g() && hxk.m137622c().m137629h()) {
                jSONObject.put("adReferrer", hxk.m137622c().m137626d());
                jSONObject.put("adClickTime", hxk.m137622c().m137624a());
                jSONObject.put("adInstallTime", hxk.m137622c().m137625b());
                jSONObject.put("track", hxk.m137622c().m137627e());
            }
            if (!TextUtils.isEmpty(ls4.f133389a) && ls4.f133389a.toLowerCase().startsWith("douyin")) {
                jSONObject.put("toutiao_channel", HumeSDK.getChannel(App.f16088e));
            }
            signupData.addExtraData("extra", jSONObject.toString());
        } catch (JSONException unused) {
        }
    }
}
