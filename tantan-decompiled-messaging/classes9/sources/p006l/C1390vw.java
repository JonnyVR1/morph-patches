package p006l;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.hume.readapk.HumeSDK;
import com.immomo.hdata.android.MDevice;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.api.C0001a;
import com.p000p1.mobile.putong.account.data.AccountTestGroup;
import com.p000p1.mobile.putong.account.data.EmailCaptchaAction;
import com.p000p1.mobile.putong.account.data.EmailSendCaptchaData;
import com.p000p1.mobile.putong.account.data.EmailVerifyCaptchaData;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.TokenSigninParam;
import com.p000p1.mobile.putong.account.sdk.IntlSignupData;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p1.mobile.account_core.reponse_data.Data;
import com.p1.mobile.account_core.reponse_data.ExtraData;
import com.p1.mobile.account_core.reponse_data.H5Token;
import com.p1.mobile.account_core.reponse_data.RiskVerification;
import com.p1.mobile.account_core.reponse_data.ThirdPartyStatus;
import com.p1.mobile.account_core.reponse_data.Token;
import com.p1.mobile.account_core.request_data.ApplyData;
import com.p1.mobile.account_core.request_data.Gender;
import com.p1.mobile.account_core.request_data.ReportData;
import com.p1.mobile.account_core.request_data.SignupData;
import com.p1.mobile.account_core.request_data.SignupEarlyUIDData;
import com.p1.mobile.account_core.request_data.StatusData;
import com.p1.mobile.account_core.request_data.ThirdPartyAccount;
import com.p1.mobile.account_phone.data.CaptchaAction;
import com.p1.mobile.account_phone.data.PhoneActiveData;
import com.p1.mobile.account_phone.data.PhoneBindPhoneData;
import com.p1.mobile.account_phone.data.PhoneChangePhoneData;
import com.p1.mobile.account_phone.data.PhoneData;
import com.p1.mobile.account_phone.data.PhoneResetPasswordData;
import com.p1.mobile.account_phone.data.PhoneSendCaptchaData;
import com.p1.mobile.account_phone.data.PhoneSigninData;
import com.p1.mobile.account_phone.data.PhoneSigninType;
import com.p1.mobile.account_phone.data.PhoneSignupData;
import com.p1.mobile.account_phone.data.PhoneSignupEarlyUIDData;
import com.p1.mobile.account_phone.data.PhoneVerifyCaptchaData;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.AccountErrorResponse;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.Captcha;
import com.p1.mobile.putong.data.DownloadDataCheck;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.ForgetPasswordData;
import com.p1.mobile.putong.data.IntlGender;
import com.p1.mobile.putong.data.LiveRegionTag;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.ProfileExtensionBasic;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.SignupStage;
import com.p1.mobile.putong.data.StepSignupStage;
import com.p1.mobile.putong.data.UploadSource;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyDataV2;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import l.dyd;
import l.e30;
import l.gtf;
import l.pf4;
import l.rhi;
import l.roj0;
import l.uqd0;
import l.vwb;
import l.w9j;
import l.ww;
import l.x14;
import l.xvf0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: renamed from: l.vw */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1390vw {

    /* JADX INFO: renamed from: a */
    public bh50 f24489a = new bh50();

    /* JADX INFO: renamed from: b */
    public stf f24490b = new stf();

    /* JADX INFO: renamed from: c */
    public zmi0 f24491c = new zmi0();

    /* JADX INFO: renamed from: d */
    public cdj0 f24492d = new cdj0();

    /* JADX INFO: renamed from: e */
    public n3k f24493e = new n3k();

    /* JADX INFO: renamed from: f */
    public dte f24494f = new dte();

    /* JADX INFO: renamed from: g */
    public z0i0 f24495g = new z0i0();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ AccountTestGroup m25904b(AccountEnvelop accountEnvelop) {
        ThirdPartyStatus thirdPartyStatus;
        AccountTestGroup accountTestGroupNew_ = AccountTestGroup.new_();
        Data data = accountEnvelop.data;
        if (data != null && (thirdPartyStatus = data.thirdPartyStatus) != null) {
            accountTestGroupNew_.facebookEntry = thirdPartyStatus.facebook;
            accountTestGroupNew_.googleEntry = thirdPartyStatus.google_ttt;
        }
        return accountTestGroupNew_;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ DownloadDataCheck m25908f(Long l2) {
        DownloadDataCheck downloadDataCheckNew_ = DownloadDataCheck.new_();
        downloadDataCheckNew_.last_apply_time = l2.longValue();
        return downloadDataCheckNew_;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.tantanapp.common.network.ApiExcep$Client$BadRequest */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ roj0 m25910h(VerifyDataV2 verifyDataV2, Pair pair) throws ApiExcep.Client.BadRequest {
        String str = (String) pair.first;
        if (TextUtils.isEmpty(str)) {
            throw new TantanException.Client.AccountService(TantanException.Client.AccountService.INVALID_SMS_CODE, "");
        }
        str.getClass();
        switch (str) {
            case "signin":
                verifyDataV2.action = VerifyReason.get("signin");
                break;
            case "signup":
                verifyDataV2.action = VerifyReason.get("signup");
                break;
            case "pending":
                verifyDataV2.action = VerifyReason.get("pending");
                verifyDataV2.ttt_signin_token = (String) pair.second;
                break;
            case "ttt-signup":
                verifyDataV2.action = VerifyReason.get("ttt-signup");
                break;
        }
        return roj0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ c m25911i(VerifyData verifyData, Throwable th) {
        return (TEnum.equals(verifyData.action, "bind_mobile") && (th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) ? c.error(new TantanException.Client.AccountService(TantanException.Client.AccountService.BIND_PHONE_ALREADY_REGISTERED, th.getMessage())) : c.error(th);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.tantanapp.common.network.ApiExcep$Client$BadRequest */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ AccountErrorResponse m25912j(Boolean bool) throws ApiExcep.Client.BadRequest {
        if (bool.booleanValue()) {
            throw new TantanException.Client.AccountService(40011, "");
        }
        return AccountErrorResponse.new_();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m25914l(PhoneSigninData phoneSigninData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            ww.a("AccountSdkApi/phone/signin", phoneSigninData);
        }
        Map map = accountEnvelop.extra;
        if (map == null || !map.containsKey("regionTag")) {
            return;
        }
        String str = (String) accountEnvelop.extra.get("regionTag");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            qib0.f19810h0 = LiveRegionTag.get(str);
            new uqd0("live_region_tag_" + (!TextUtils.isEmpty(accountEnvelop.data.token.userId) ? accountEnvelop.data.token.userId : ""), "").put(str);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ c m25916n(VerifyData verifyData, Throwable th) {
        return (TEnum.equals(verifyData.action, "bind_mobile") && (th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) ? c.error(new TantanException.Client.AccountService(TantanException.Client.AccountService.BIND_PHONE_ALREADY_REGISTERED, th.getMessage())) : c.error(th);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.tantanapp.common.network.ApiExcep$Client$BadRequest */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ roj0 m25920r(VerifyData verifyData, kotlin.Pair pair) throws ApiExcep.Client.BadRequest {
        String str = (String) pair.getFirst();
        if (TextUtils.isEmpty(str)) {
            throw new TantanException.Client.AccountService(TantanException.Client.AccountService.INVALID_SMS_CODE, "");
        }
        str.getClass();
        switch (str) {
            case "signin":
                verifyData.action = VerifyReason.get("signin");
                break;
            case "signup":
                verifyData.action = VerifyReason.get("signup");
                break;
            case "pending":
                verifyData.action = VerifyReason.get("pending");
                verifyData.ttt_signin_token = (String) pair.getSecond();
                break;
            case "ttt-signup":
                verifyData.action = VerifyReason.get("ttt-signup");
                break;
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: A */
    public void m25921A(SignupData signupData, int i, boolean z) {
        m25922B(signupData, i, z, "");
    }

    /* JADX INFO: renamed from: B */
    public void m25922B(SignupData signupData, int i, boolean z, String str) {
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
            if (ruk.m22952g() && ruk.m22951c().m22958h()) {
                jSONObject.put("adReferrer", ruk.m22951c().m22955d());
                jSONObject.put("adClickTime", ruk.m22951c().m22953a());
                jSONObject.put("adInstallTime", ruk.m22951c().m22954b());
                jSONObject.put("track", ruk.m22951c().m22956e());
            }
            if (!TextUtils.isEmpty(mr4.f17192a) && mr4.f17192a.toLowerCase().startsWith("douyin")) {
                jSONObject.put("toutiao_channel", HumeSDK.getChannel(App.e));
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("thirdPartyEmail", str);
            }
            signupData.addExtraData("extra", jSONObject.toString());
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: C */
    public c<H5Token> m25923C() {
        return this.f24492d.s();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ c m25924D(SignUpData signUpData, Pair pair) {
        PhoneSignupData phoneSignupData = new PhoneSignupData();
        if (!NullChecker.a(signUpData.birthdate)) {
            CrashHelper.c(new RuntimeException("BirthDateNullException please ignore, class = " + getClass().getName() + ", phoneNumber = " + signUpData.phoneNumber));
        }
        ((SignupData) phoneSignupData).name = signUpData.name;
        ((SignupData) phoneSignupData).birthdate = C0907jy.m17844n0(signUpData.birthdate.doubleValue());
        ((SignupData) phoneSignupData).gender = TEnum.equals(signUpData.gender, "female") ? Gender.female : Gender.male;
        phoneSignupData.code = signUpData.code;
        phoneSignupData.countryCode = signUpData.countryCode;
        phoneSignupData.mobileNumber = signUpData.phoneNumber;
        phoneSignupData.addExtraData("device", pk8.m21562M().toJson());
        if (!TextUtils.isEmpty(signUpData.verifyType)) {
            phoneSignupData.addExtraData("verifyType", signUpData.verifyType);
        }
        ((SignupData) phoneSignupData).pictureUrl = (String) pair.first;
        phoneSignupData.setPassword(signUpData.password);
        ((SignupData) phoneSignupData).appsflyerId = signUpData.appsFlyerUID;
        if (!TextUtils.isEmpty(signUpData.firebaseId)) {
            phoneSignupData.addExtraData("firebaseId", signUpData.firebaseId);
        }
        if (TextUtils.isEmpty(signUpData.password)) {
            phoneSignupData.signupType = "no-password";
        }
        m25921A(phoneSignupData, C0811hp.m16310j(((Long) pair.second).longValue(), signUpData.newProfilePath), true);
        return this.f24492d.Q(phoneSignupData);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.tantanapp.common.network.ApiExcep$Client$BadRequest */
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ c m25925E(SignUpData signUpData, Pair pair) throws ApiExcep.Client.BadRequest {
        IntlGender intlGender;
        Pair pair2 = (Pair) pair.first;
        if (((Boolean) pair.second).booleanValue()) {
            throw new TantanException.Client.AccountService(TantanException.Client.AccountService.ERROR_ACCOUNT_PICTURE_VERIFY, "");
        }
        boolean zM16739j = ilo.INSTANCE.m16739j();
        SignupEarlyUIDData intlSignupData = zM16739j ? new IntlSignupData() : new SignupEarlyUIDData();
        intlSignupData.stage = "verified";
        AccountTempApi.SignUpType signUpType = signUpData.signUpType;
        if (signUpType == AccountTempApi.SignUpType.nameInfoSaved) {
            intlSignupData.currentStages = vwb.M("name-saved");
        } else if (signUpType == AccountTempApi.SignUpType.genderInfoSave) {
            intlSignupData.currentStages = vwb.M("gender-saved");
        } else if (signUpType == AccountTempApi.SignUpType.birthInfoSaved) {
            intlSignupData.currentStages = vwb.M("birth-saved");
        } else if (signUpType == AccountTempApi.SignUpType.media) {
            intlSignupData.stage = "finished";
            intlSignupData.currentStages = vwb.M("picture-saved");
        } else if (signUpType == AccountTempApi.SignUpType.basic) {
            ArrayList arrayListF0 = vwb.f0(new String[]{"name-saved", "birth-saved", "gender-saved"});
            if (zM16739j) {
                arrayListF0.add("new-gender-saved");
            }
            intlSignupData.currentStages = arrayListF0;
        } else {
            AccountTempApi.SignUpType signUpType2 = AccountTempApi.SignUpType.intlFriendPurposeSaved;
            if (signUpType == signUpType2 || signUpType == AccountTempApi.SignUpType.ethnicitySaved || signUpType == AccountTempApi.SignUpType.languageSaved) {
                intlSignupData.currentStages = vwb.M("extensions-saved");
                Extensions extensions = new Extensions();
                extensions.basic = new ProfileExtensionBasic();
                if (!vwb.J(signUpData.intlFriendPurpose) && signUpData.signUpType == signUpType2) {
                    extensions.basic.intlFriendPurpose = signUpData.intlFriendPurpose;
                } else if (!vwb.J(signUpData.ethnicity) && signUpData.signUpType == AccountTempApi.SignUpType.ethnicitySaved) {
                    extensions.basic.ethnicity = signUpData.ethnicity;
                } else if (!vwb.J(signUpData.language) && signUpData.signUpType == AccountTempApi.SignUpType.languageSaved) {
                    extensions.basic.language = signUpData.language;
                }
                intlSignupData.addExtraData("extensions", extensions.toJson());
            }
        }
        ((SignupData) intlSignupData).name = signUpData.name;
        if (NullChecker.a(signUpData.birthdate)) {
            Network network = qib0.f19784H;
            long jElapsedRealtime = network.lastElapsedRealtime > 0 ? network.lastServerTime + (SystemClock.elapsedRealtime() - qib0.f19784H.lastElapsedRealtime) : System.currentTimeMillis();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
            String str = simpleDateFormat.format(Long.valueOf(jElapsedRealtime));
            if (jElapsedRealtime != 0) {
                str = simpleDateFormat.format(signUpData.birthdate);
            }
            ((SignupData) intlSignupData).birthdate = str;
        }
        com.p1.mobile.putong.data.Gender gender = signUpData.gender;
        if (gender != null || signUpData.newGender != null) {
            if (!zM16739j || (intlGender = signUpData.newGender) == null) {
                ((SignupData) intlSignupData).gender = TEnum.equals(gender, "female") ? Gender.female : Gender.male;
            } else {
                IntlSignupData intlSignupData2 = (IntlSignupData) intlSignupData;
                intlSignupData2.newGender = intlGender.toString();
                ((SignupData) intlSignupData2).gender = Gender.male;
                String str2 = signUpData.subGenderOption;
                if (str2 != null) {
                    intlSignupData2.subGender = str2;
                }
                intlSignupData2.showOnProfile = signUpData.profileShowGender;
            }
        }
        intlSignupData.addExtraData("device", pk8.m21562M().toJson());
        if (!TextUtils.isEmpty(signUpData.verifyType)) {
            intlSignupData.addExtraData("verifyType", signUpData.verifyType);
        }
        if (!TextUtils.isEmpty(signUpData.password)) {
            intlSignupData.setPassword(signUpData.password);
        }
        if (!TextUtils.isEmpty((CharSequence) pair2.first)) {
            Object obj = pair2.first;
            ((SignupData) intlSignupData).pictureUrl = (String) obj;
            ((SignupData) intlSignupData).hasFace = gtf.b((String) obj);
        }
        if (!TextUtils.isEmpty(signUpData.appsFlyerUID)) {
            ((SignupData) intlSignupData).appsflyerId = signUpData.appsFlyerUID;
        }
        if (!TextUtils.isEmpty(signUpData.firebaseId)) {
            intlSignupData.addExtraData("firebaseId", signUpData.firebaseId);
        }
        if (!TextUtils.isEmpty(dyd.b())) {
            ((SignupData) intlSignupData).advertisingId = dyd.b();
        }
        m25921A(intlSignupData, C0811hp.m16310j(((Long) pair2.second).longValue(), signUpData.newProfilePath), true);
        return this.f24492d.v(intlSignupData);
    }

    /* JADX INFO: renamed from: F */
    public c<roj0> m25926F(String str) {
        ReportData reportData = new ReportData();
        reportData.name = str;
        return this.f24492d.u(reportData).map(new w9j() { // from class: l.ow
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public c<Token> m25927G(ForgetPasswordData forgetPasswordData) {
        PhoneResetPasswordData phoneResetPasswordData = new PhoneResetPasswordData();
        phoneResetPasswordData.code = forgetPasswordData.code;
        phoneResetPasswordData.setPassword(forgetPasswordData.new_);
        ((PhoneData) phoneResetPasswordData).countryCode = forgetPasswordData.countryCode;
        ((PhoneData) phoneResetPasswordData).mobileNumber = forgetPasswordData.mobileNumber;
        return this.f24492d.P(phoneResetPasswordData);
    }

    /* JADX INFO: renamed from: H */
    public c<RiskVerification> m25928H(final VerifyData verifyData) {
        String str;
        String mMuidV3;
        Objects.toString(verifyData.action);
        PhoneSendCaptchaData phoneSendCaptchaData = new PhoneSendCaptchaData();
        phoneSendCaptchaData.action = m25943u(verifyData.action);
        ((PhoneData) phoneSendCaptchaData).countryCode = verifyData.countryCode;
        ((PhoneData) phoneSendCaptchaData).mobileNumber = verifyData.mobileNumber;
        phoneSendCaptchaData.language = verifyData.language;
        int i = verifyData.codeLength;
        if (i != 4) {
            phoneSendCaptchaData.codeLength = i;
        }
        if (NullChecker.a(verifyData.captcha)) {
            pf4 pf4Var = new pf4();
            Captcha captcha = verifyData.captcha;
            pf4Var.captchaID = captcha.captchaID;
            pf4Var.captchaOutput = captcha.captchaOutput;
            pf4Var.genTime = captcha.genTime;
            pf4Var.lotNumber = captcha.lotNumber;
            pf4Var.passToken = captcha.passToken;
            captcha.localExpired = true;
            phoneSendCaptchaData.captcha = pf4Var;
        }
        String strM17885g = k0f0.m17882f().m17885g();
        if (C0775gp.m15905l()) {
            str = MDevice.getmmuid(AccountModule.f24a, k200.m17914b());
            mMuidV3 = MDevice.getMMuidV3(AccountModule.f24a);
        } else {
            str = "";
            mMuidV3 = str;
        }
        if (TextUtils.isEmpty(strM17885g)) {
            phoneSendCaptchaData.mmuid = "";
        } else {
            phoneSendCaptchaData.mmuid = strM17885g;
        }
        if (TextUtils.isEmpty(str)) {
            phoneSendCaptchaData.mmuidv2 = "";
        } else {
            phoneSendCaptchaData.mmuidv2 = str;
        }
        if (TextUtils.isEmpty(mMuidV3)) {
            phoneSendCaptchaData.mmuidv3 = "";
        } else {
            phoneSendCaptchaData.mmuidv3 = mMuidV3;
        }
        phoneSendCaptchaData.captchaToken = verifyData.captchaToken;
        phoneSendCaptchaData.captchaValue = verifyData.captchaValue;
        return this.f24492d.m13356j0(phoneSendCaptchaData).onErrorResumeNext(new w9j() { // from class: l.rw
            public final Object call(Object obj) {
                return C1390vw.m25911i(verifyData, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public c<roj0> m25929I(final VerifyData verifyData) {
        String str;
        String mMuidV3;
        EmailSendCaptchaData emailSendCaptchaData = new EmailSendCaptchaData();
        emailSendCaptchaData.action = m25945w(verifyData.action);
        emailSendCaptchaData.email = verifyData.email;
        emailSendCaptchaData.language = verifyData.language;
        int i = verifyData.codeLength;
        if (i != 4) {
            emailSendCaptchaData.codeLength = i;
        }
        if (NullChecker.a(verifyData.captcha)) {
            pf4 pf4Var = new pf4();
            Captcha captcha = verifyData.captcha;
            pf4Var.captchaID = captcha.captchaID;
            pf4Var.captchaOutput = captcha.captchaOutput;
            pf4Var.genTime = captcha.genTime;
            pf4Var.lotNumber = captcha.lotNumber;
            pf4Var.passToken = captcha.passToken;
            captcha.localExpired = true;
            emailSendCaptchaData.captcha = pf4Var;
        }
        String strM17885g = k0f0.m17882f().m17885g();
        if (C0775gp.m15905l()) {
            str = MDevice.getmmuid(AccountModule.f24a, k200.m17914b());
            mMuidV3 = MDevice.getMMuidV3(AccountModule.f24a);
        } else {
            str = "";
            mMuidV3 = str;
        }
        if (TextUtils.isEmpty(strM17885g)) {
            emailSendCaptchaData.mmuid = "";
        } else {
            emailSendCaptchaData.mmuid = strM17885g;
        }
        if (TextUtils.isEmpty(str)) {
            emailSendCaptchaData.mmuidv2 = "";
        } else {
            emailSendCaptchaData.mmuidv2 = str;
        }
        if (TextUtils.isEmpty(mMuidV3)) {
            emailSendCaptchaData.mmuidv3 = "";
        } else {
            emailSendCaptchaData.mmuidv3 = mMuidV3;
        }
        emailSendCaptchaData.captchaToken = verifyData.captchaToken;
        emailSendCaptchaData.captchaValue = verifyData.captchaValue;
        return this.f24494f.m14236A(emailSendCaptchaData).onErrorResumeNext(new w9j() { // from class: l.pw
            public final Object call(Object obj) {
                return C1390vw.m25916n(verifyData, (Throwable) obj);
            }
        }).map(new w9j() { // from class: l.qw
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public c<Token> m25930J(final SignUpData signUpData) {
        return m25937Q(signUpData).flatMap(new w9j() { // from class: l.uw
            public final Object call(Object obj) {
                return this.f23773a.m25924D(signUpData, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public c<Boolean> m25931K(final SignUpData signUpData) {
        return m25937Q(signUpData).doOnError(new e30() { // from class: l.hw
            public final void call(Object obj) {
                xvf0.c("e_signup_upload_picture_fail", new Object[0]);
            }
        }).flatMap(new w9j() { // from class: l.iw
            public final Object call(Object obj) {
                return c.just(new Pair((Pair) obj, Boolean.FALSE));
            }
        }).flatMap(new w9j() { // from class: l.jw
            public final Object call(Object obj) {
                return this.f15456a.m25925E(signUpData, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public c<Token> m25932L(SignUpData signUpData) {
        PhoneSignupEarlyUIDData phoneSignupEarlyUIDData = new PhoneSignupEarlyUIDData();
        phoneSignupEarlyUIDData.code = signUpData.code;
        phoneSignupEarlyUIDData.countryCode = signUpData.countryCode;
        phoneSignupEarlyUIDData.mobileNumber = signUpData.phoneNumber;
        if (!TextUtils.isEmpty(signUpData.thirdPartyId)) {
            ThirdPartyAccount thirdPartyAccount = new ThirdPartyAccount();
            thirdPartyAccount.id = signUpData.thirdPartyId;
            thirdPartyAccount.token = signUpData.thirdPartyToken;
            phoneSignupEarlyUIDData.thirdPartyAccount = thirdPartyAccount;
        }
        phoneSignupEarlyUIDData.addExtraData("device", pk8.m21562M().toJson());
        if (!TextUtils.isEmpty(signUpData.verifyType)) {
            phoneSignupEarlyUIDData.addExtraData("verifyType", signUpData.verifyType);
        }
        m25921A(phoneSignupEarlyUIDData, 0, true);
        return this.f24492d.R(phoneSignupEarlyUIDData);
    }

    /* JADX INFO: renamed from: M */
    public c<Token> m25933M(SignUpData signUpData) {
        if (!TextUtils.isEmpty(signUpData.email)) {
            return this.f24494f.m14240E(signUpData);
        }
        PhoneSignupEarlyUIDData phoneSignupEarlyUIDData = new PhoneSignupEarlyUIDData();
        phoneSignupEarlyUIDData.code = signUpData.code;
        phoneSignupEarlyUIDData.countryCode = signUpData.countryCode;
        phoneSignupEarlyUIDData.mobileNumber = signUpData.phoneNumber;
        if (!TextUtils.isEmpty(signUpData.thirdPartyId)) {
            ThirdPartyAccount thirdPartyAccount = new ThirdPartyAccount();
            thirdPartyAccount.id = signUpData.thirdPartyId;
            thirdPartyAccount.token = signUpData.thirdPartyToken;
            phoneSignupEarlyUIDData.thirdPartyAccount = thirdPartyAccount;
        }
        phoneSignupEarlyUIDData.addExtraData("device", pk8.m21562M().toJson());
        if (!TextUtils.isEmpty(signUpData.verifyType)) {
            phoneSignupEarlyUIDData.addExtraData("verifyType", signUpData.verifyType);
        }
        m25921A(phoneSignupEarlyUIDData, 0, true);
        return this.f24492d.m13357k0(phoneSignupEarlyUIDData, "up_link_sms".equals(signUpData.verifyType));
    }

    /* JADX INFO: renamed from: N */
    public c<Token> m25934N(SignInData signInData, boolean z) {
        if (z) {
            PhoneActiveData phoneActiveData = new PhoneActiveData();
            Integer num = signInData.code;
            if (num != null) {
                phoneActiveData.code = num.intValue();
            }
            phoneActiveData.setPassword(signInData.password);
            if (TextUtils.isEmpty(signInData.password)) {
                phoneActiveData.activateType = PhoneSigninType.confirmation_code;
            } else {
                phoneActiveData.activateType = PhoneSigninType.password;
            }
            ((PhoneData) phoneActiveData).countryCode = Integer.parseInt(signInData.username.split(" ")[0]);
            ((PhoneData) phoneActiveData).mobileNumber = signInData.username.split(" ")[1];
            if (!TextUtils.isEmpty(signInData.thirdPartyId)) {
                ThirdPartyAccount thirdPartyAccount = new ThirdPartyAccount();
                thirdPartyAccount.id = signInData.thirdPartyId;
                thirdPartyAccount.token = signInData.thirdPartyToken;
                thirdPartyAccount.type = signInData.grantType.toString();
                phoneActiveData.thirdPartyAccount = thirdPartyAccount;
            }
            phoneActiveData.addExtraData("device", pk8.m21562M().toJson());
            C0001a.m105S0(phoneActiveData, false);
            return this.f24492d.M(phoneActiveData);
        }
        final PhoneSigninData phoneSigninData = new PhoneSigninData();
        Integer num2 = signInData.code;
        if (num2 != null) {
            phoneSigninData.code = num2.intValue();
        }
        phoneSigninData.setPassword(signInData.password);
        if (TextUtils.isEmpty(signInData.password)) {
            phoneSigninData.signinType = PhoneSigninType.confirmation_code;
        } else {
            phoneSigninData.signinType = PhoneSigninType.password;
        }
        try {
            ((PhoneData) phoneSigninData).countryCode = Integer.parseInt(signInData.username.split(" ")[0]);
            ((PhoneData) phoneSigninData).mobileNumber = signInData.username.split(" ")[1];
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(signInData.thirdPartyId)) {
            ThirdPartyAccount thirdPartyAccount2 = new ThirdPartyAccount();
            thirdPartyAccount2.id = signInData.thirdPartyId;
            thirdPartyAccount2.token = signInData.thirdPartyToken;
            thirdPartyAccount2.type = signInData.grantType.toString();
            phoneSigninData.thirdPartyAccount = thirdPartyAccount2;
        }
        phoneSigninData.addExtraData("device", pk8.m21562M().toJson());
        if (!TextUtils.isEmpty(signInData.captchaToken)) {
            phoneSigninData.addExtraData("captchaToken", signInData.captchaToken);
        }
        if (!TextUtils.isEmpty(signInData.captchaValue)) {
            phoneSigninData.addExtraData("captchaValue", signInData.captchaValue);
        }
        C0001a.m105S0(phoneSigninData, true);
        if (!TextUtils.isEmpty(signInData.verifyType)) {
            phoneSigninData.addExtraData("signinType", signInData.verifyType);
        }
        return ("up_link_sms".equals(signInData.verifyType) ? x14.b().e("/phone/signin", phoneSigninData.toJson(), 70L) : x14.b().d("/phone/signin", phoneSigninData.toJson())).doOnNext(new e30() { // from class: l.ew
            public final void call(Object obj) {
                C1390vw.m25914l(phoneSigninData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.fw
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public c<AccountTestGroup> m25935O(String str, String str2) {
        StatusData statusData = new StatusData();
        statusData.channel = str;
        statusData.mcc = str2;
        return this.f24492d.w(statusData).map(new w9j() { // from class: l.sw
            public final Object call(Object obj) {
                return C1390vw.m25904b((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public c<Token> m25936P(TokenSigninParam tokenSigninParam) {
        return this.f24492d.m13358l0(tokenSigninParam);
    }

    /* JADX INFO: renamed from: Q */
    public c<Pair<String, Long>> m25937Q(SignUpData signUpData) {
        if (TextUtils.isEmpty(signUpData.profilePath)) {
            return c.just(Pair.create("", 0L));
        }
        ArrayList arrayList = new ArrayList();
        Picture picture = new Picture();
        ((Media) picture).url = rhi.B(signUpData.profilePath);
        ((Media) picture).mediaType = signUpData.profileMineType;
        ((Media) picture).status = MediaLocalStatus.get("preprocessed");
        arrayList.add(picture);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        return ya5.m28129K(arrayList, "profile", null, UploadSource.get("login")).filter(new w9j() { // from class: l.kw
            public final Object call(Object obj) {
                return Boolean.valueOf(((List) obj).size() > 0);
            }
        }).map(new w9j() { // from class: l.lw
            public final Object call(Object obj) {
                return Pair.create(((Media) ((List) obj).get(0)).url, Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public c<roj0> m25938R(final VerifyData verifyData) {
        Objects.toString(verifyData.action);
        PhoneVerifyCaptchaData phoneVerifyCaptchaData = new PhoneVerifyCaptchaData();
        phoneVerifyCaptchaData.code = verifyData.code;
        ((PhoneData) phoneVerifyCaptchaData).countryCode = verifyData.countryCode;
        ((PhoneData) phoneVerifyCaptchaData).mobileNumber = verifyData.mobileNumber;
        phoneVerifyCaptchaData.action = m25943u(verifyData.action);
        if (!TextUtils.isEmpty(verifyData.verifyType)) {
            phoneVerifyCaptchaData.addExtraData("verifyType", verifyData.verifyType);
        }
        return this.f24492d.m13359m0(phoneVerifyCaptchaData, "up_link_sms".equals(verifyData.verifyType)).map(new w9j() { // from class: l.nw
            public final Object call(Object obj) {
                return C1390vw.m25920r(verifyData, (kotlin.Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public c<roj0> m25939S(final VerifyDataV2 verifyDataV2) {
        EmailVerifyCaptchaData emailVerifyCaptchaData = new EmailVerifyCaptchaData();
        emailVerifyCaptchaData.code = verifyDataV2.code;
        emailVerifyCaptchaData.email = verifyDataV2.email;
        emailVerifyCaptchaData.action = m25943u(verifyDataV2.action);
        return this.f24494f.m14241F(emailVerifyCaptchaData).map(new w9j() { // from class: l.gw
            public final Object call(Object obj) {
                return C1390vw.m25910h(verifyDataV2, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public c<AccountErrorResponse> m25940T(VerifyData verifyData) {
        PhoneData phoneData = new PhoneData();
        phoneData.countryCode = verifyData.countryCode;
        phoneData.mobileNumber = verifyData.mobileNumber;
        return this.f24492d.S(phoneData).map(new w9j() { // from class: l.tw
            public final Object call(Object obj) {
                return C1390vw.m25912j((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public c<Token> m25941s(VerifyData verifyData) {
        PhoneBindPhoneData phoneBindPhoneData = new PhoneBindPhoneData();
        phoneBindPhoneData.code = verifyData.code;
        ((PhoneData) phoneBindPhoneData).countryCode = verifyData.countryCode;
        ((PhoneData) phoneBindPhoneData).mobileNumber = verifyData.mobileNumber;
        phoneBindPhoneData.forceLogin = verifyData.forceLogin;
        return this.f24492d.N(phoneBindPhoneData);
    }

    /* JADX INFO: renamed from: t */
    public c<Token> m25942t(VerifyData verifyData) {
        PhoneChangePhoneData phoneChangePhoneData = new PhoneChangePhoneData();
        phoneChangePhoneData.code = verifyData.code;
        ((PhoneData) phoneChangePhoneData).countryCode = verifyData.countryCode;
        ((PhoneData) phoneChangePhoneData).mobileNumber = verifyData.mobileNumber;
        phoneChangePhoneData.addExtraData("device", pk8.m21562M().toJson());
        return this.f24492d.O(phoneChangePhoneData);
    }

    /* JADX INFO: renamed from: u */
    public final CaptchaAction m25943u(VerifyReason verifyReason) {
        String string = verifyReason.toString();
        string.getClass();
        switch (string) {
            case "forgot-password":
                return CaptchaAction.forgot_password;
            case "change-phone":
                return CaptchaAction.change_phone;
            case "signin":
                return CaptchaAction.signin;
            case "signup":
                return CaptchaAction.signup;
            case "signup_signin":
            case "fix_verify_code_hack":
                return CaptchaAction.signup_signin;
            case "bind_mobile":
                return CaptchaAction.bind_phone;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: v */
    public AuthData m25944v(Token token) {
        AuthData authDataNew_ = AuthData.new_();
        authDataNew_.accessToken = token.value;
        authDataNew_.expiresIn = token.expiresIn;
        authDataNew_.userId = token.userId;
        Map map = ((ExtraData) token).extra;
        if (map != null) {
            String str = (String) map.get("stage");
            if (!TextUtils.isEmpty(str)) {
                str.getClass();
                switch (str) {
                    case "verified":
                    case "name-saved":
                    case "gender-saved":
                    case "base-info-saved":
                    case "birth-saved":
                        authDataNew_.signupStage = SignupStage.get("verified");
                        break;
                    case "finished":
                        authDataNew_.signupStage = SignupStage.get("finished");
                        break;
                    default:
                        authDataNew_.signupStage = SignupStage.get("unknown_");
                        break;
                }
            }
            String str2 = (String) ((ExtraData) token).extra.get("finished_stages");
            if (!TextUtils.isEmpty(str2)) {
                for (String str3 : str2.split(",")) {
                    authDataNew_.finishedStages.add(StepSignupStage.get(str3));
                }
            }
        }
        return authDataNew_;
    }

    /* JADX INFO: renamed from: w */
    public final EmailCaptchaAction m25945w(VerifyReason verifyReason) {
        String string = verifyReason.toString();
        string.getClass();
        switch (string) {
            case "forgot-password":
                return EmailCaptchaAction.forgot_password;
            case "change-email":
                return EmailCaptchaAction.change_email;
            case "change-phone":
                return EmailCaptchaAction.change_phone;
            case "signin":
                return EmailCaptchaAction.signin;
            case "signup":
                return EmailCaptchaAction.signup;
            case "signup_signin":
            case "fix_verify_code_hack":
                return EmailCaptchaAction.signup_signin;
            case "bind_mobile":
                return EmailCaptchaAction.bind_phone;
            case "bind-email":
                return EmailCaptchaAction.bind_email;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: x */
    public AuthData m25946x(H5Token h5Token) {
        AuthData authDataNew_ = AuthData.new_();
        authDataNew_.accessToken = h5Token.access_token;
        authDataNew_.expiresIn = h5Token.expires_in;
        authDataNew_.userId = h5Token.user_id;
        authDataNew_.tokenType = h5Token.token_type;
        return authDataNew_;
    }

    /* JADX INFO: renamed from: y */
    public c<DownloadDataCheck> m25947y() {
        return this.f24492d.t().map(new w9j() { // from class: l.mw
            public final Object call(Object obj) {
                return C1390vw.m25908f((Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public c<AccountErrorResponse> m25948z(String str, String str2) {
        ApplyData applyData = new ApplyData();
        applyData.email = str;
        applyData.mcc = str2;
        return this.f24492d.p(applyData).map(new w9j() { // from class: l.dw
            public final Object call(Object obj) {
                return AccountErrorResponse.new_();
            }
        });
    }
}
