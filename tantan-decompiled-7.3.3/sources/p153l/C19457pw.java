package p153l;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.hume.readapk.HumeSDK;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.hdata.android.MDevice;
import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p051p1.mobile.account_core.reponse_data.Data;
import com.p051p1.mobile.account_core.reponse_data.H5Token;
import com.p051p1.mobile.account_core.reponse_data.RiskVerification;
import com.p051p1.mobile.account_core.reponse_data.ThirdPartyStatus;
import com.p051p1.mobile.account_core.reponse_data.Token;
import com.p051p1.mobile.account_core.request_data.ApplyData;
import com.p051p1.mobile.account_core.request_data.Gender;
import com.p051p1.mobile.account_core.request_data.ReportData;
import com.p051p1.mobile.account_core.request_data.SignupData;
import com.p051p1.mobile.account_core.request_data.SignupEarlyUIDData;
import com.p051p1.mobile.account_core.request_data.StatusData;
import com.p051p1.mobile.account_core.request_data.ThirdPartyAccount;
import com.p051p1.mobile.account_phone.data.CaptchaAction;
import com.p051p1.mobile.account_phone.data.PhoneActiveData;
import com.p051p1.mobile.account_phone.data.PhoneBindPhoneData;
import com.p051p1.mobile.account_phone.data.PhoneChangePhoneData;
import com.p051p1.mobile.account_phone.data.PhoneData;
import com.p051p1.mobile.account_phone.data.PhoneResetPasswordData;
import com.p051p1.mobile.account_phone.data.PhoneSendCaptchaData;
import com.p051p1.mobile.account_phone.data.PhoneSigninData;
import com.p051p1.mobile.account_phone.data.PhoneSigninType;
import com.p051p1.mobile.account_phone.data.PhoneSignupData;
import com.p051p1.mobile.account_phone.data.PhoneSignupEarlyUIDData;
import com.p051p1.mobile.account_phone.data.PhoneVerifyCaptchaData;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.api.C4726a;
import com.p051p1.mobile.putong.account.data.AccountTestGroup;
import com.p051p1.mobile.putong.account.data.EmailCaptchaAction;
import com.p051p1.mobile.putong.account.data.EmailSendCaptchaData;
import com.p051p1.mobile.putong.account.data.EmailVerifyCaptchaData;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.TokenSigninParam;
import com.p051p1.mobile.putong.account.sdk.IntlSignupData;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.AccountErrorResponse;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.data.Captcha;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.DownloadDataCheck;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.ForgetPasswordData;
import com.p051p1.mobile.putong.data.IntlGender;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.ProfileExtensionBasic;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.SignupStage;
import com.p051p1.mobile.putong.data.StepSignupStage;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.data.UserSource;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyDataV2;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: renamed from: l.pw */
/* JADX INFO: loaded from: classes9.dex */
public class C19457pw {

    /* JADX INFO: renamed from: a */
    public hp50 f154351a = new hp50();

    /* JADX INFO: renamed from: b */
    public gvf f154352b = new gvf();

    /* JADX INFO: renamed from: c */
    public awi0 f154353c = new awi0();

    /* JADX INFO: renamed from: d */
    public gmj0 f154354d = new gmj0();

    /* JADX INFO: renamed from: e */
    public f6k f154355e = new f6k();

    /* JADX INFO: renamed from: f */
    public hue f154356f = new hue();

    /* JADX INFO: renamed from: g */
    public h9i0 f154357g = new h9i0();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ AccountTestGroup m173993b(AccountEnvelop accountEnvelop) {
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
    public static /* synthetic */ DownloadDataCheck m173997f(Long l2) {
        DownloadDataCheck downloadDataCheckNew_ = DownloadDataCheck.new_();
        downloadDataCheckNew_.last_apply_time = l2.longValue();
        return downloadDataCheckNew_;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ uxj0 m173999h(VerifyDataV2 verifyDataV2, Pair pair) {
        String str = (String) pair.first;
        if (TextUtils.isEmpty(str)) {
            throw new TantanException.Client.AccountService(TantanException.Client.AccountService.INVALID_SMS_CODE, "");
        }
        str.getClass();
        switch (str) {
            case "signin":
                verifyDataV2.action = VerifyReason.get(VerifyReason.signin);
                break;
            case "signup":
                verifyDataV2.action = VerifyReason.get(VerifyReason.signup);
                break;
            case "pending":
                verifyDataV2.action = VerifyReason.get("pending");
                verifyDataV2.ttt_signin_token = (String) pair.second;
                break;
            case "ttt-signup":
                verifyDataV2.action = VerifyReason.get(VerifyReason.ttt_signup);
                break;
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C22421c m174000i(VerifyData verifyData, Throwable th) {
        return (TEnum.equals(verifyData.action, VerifyReason.bind_mobile) && (th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) ? C22421c.error(new TantanException.Client.AccountService(TantanException.Client.AccountService.BIND_PHONE_ALREADY_REGISTERED, th.getMessage())) : C22421c.error(th);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ AccountErrorResponse m174001j(Boolean bool) {
        if (bool.booleanValue()) {
            throw new TantanException.Client.AccountService(40011, "");
        }
        return AccountErrorResponse.new_();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m174003l(PhoneSigninData phoneSigninData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("AccountSdkApi/phone/signin", phoneSigninData);
        }
        Map<String, String> map = accountEnvelop.extra;
        if (map == null || !map.containsKey("regionTag")) {
            return;
        }
        String str = accountEnvelop.extra.get("regionTag");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            uqb0.f180402h0 = LiveRegionTag.get(str);
            new wyd0("live_region_tag_" + (!TextUtils.isEmpty(accountEnvelop.data.token.userId) ? accountEnvelop.data.token.userId : ""), "").put(str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ C22421c m174005n(VerifyData verifyData, Throwable th) {
        return (TEnum.equals(verifyData.action, VerifyReason.bind_mobile) && (th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) ? C22421c.error(new TantanException.Client.AccountService(TantanException.Client.AccountService.BIND_PHONE_ALREADY_REGISTERED, th.getMessage())) : C22421c.error(th);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ uxj0 m174009r(VerifyData verifyData, kotlin.Pair pair) {
        String str = (String) pair.getFirst();
        if (TextUtils.isEmpty(str)) {
            throw new TantanException.Client.AccountService(TantanException.Client.AccountService.INVALID_SMS_CODE, "");
        }
        str.getClass();
        switch (str) {
            case "signin":
                verifyData.action = VerifyReason.get(VerifyReason.signin);
                break;
            case "signup":
                verifyData.action = VerifyReason.get(VerifyReason.signup);
                break;
            case "pending":
                verifyData.action = VerifyReason.get("pending");
                verifyData.ttt_signin_token = (String) pair.getSecond();
                break;
            case "ttt-signup":
                verifyData.action = VerifyReason.get(VerifyReason.ttt_signup);
                break;
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: A */
    public void m174010A(SignupData signupData, int i, boolean z) {
        m174011B(signupData, i, z, "");
    }

    /* JADX INFO: renamed from: B */
    public void m174011B(SignupData signupData, int i, boolean z, String str) {
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
            if (hxk.m137623g() && hxk.m137622c().m137629h()) {
                jSONObject.put("adReferrer", hxk.m137622c().m137626d());
                jSONObject.put("adClickTime", hxk.m137622c().m137624a());
                jSONObject.put("adInstallTime", hxk.m137622c().m137625b());
                jSONObject.put("track", hxk.m137622c().m137627e());
            }
            if (!TextUtils.isEmpty(ls4.f133389a) && ls4.f133389a.toLowerCase().startsWith("douyin")) {
                jSONObject.put("toutiao_channel", HumeSDK.getChannel(App.f16088e));
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("thirdPartyEmail", str);
            }
            signupData.addExtraData("extra", jSONObject.toString());
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: C */
    public C22421c<H5Token> m174012C() {
        return this.f154354d.m111445s();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ C22421c m174013D(SignUpData signUpData, Pair pair) {
        PhoneSignupData phoneSignupData = new PhoneSignupData();
        if (!NullChecker.m82486a(signUpData.birthdate)) {
            CrashHelper.m82479c(new RuntimeException("BirthDateNullException please ignore, class = " + getClass().getName() + ", phoneNumber = " + signUpData.phoneNumber));
        }
        phoneSignupData.name = signUpData.name;
        phoneSignupData.birthdate = C16649dy.m118579n0(signUpData.birthdate.doubleValue());
        phoneSignupData.gender = TEnum.equals(signUpData.gender, "female") ? Gender.female : Gender.male;
        phoneSignupData.code = signUpData.code;
        phoneSignupData.countryCode = signUpData.countryCode;
        phoneSignupData.mobileNumber = signUpData.phoneNumber;
        phoneSignupData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        if (!TextUtils.isEmpty(signUpData.verifyType)) {
            phoneSignupData.addExtraData("verifyType", signUpData.verifyType);
        }
        phoneSignupData.pictureUrl = (String) pair.first;
        phoneSignupData.setPassword(signUpData.password);
        phoneSignupData.appsflyerId = signUpData.appsFlyerUID;
        if (!TextUtils.isEmpty(signUpData.firebaseId)) {
            phoneSignupData.addExtraData("firebaseId", signUpData.firebaseId);
        }
        if (TextUtils.isEmpty(signUpData.password)) {
            phoneSignupData.signupType = UserSource.no_password;
        }
        m174010A(phoneSignupData, C16330cp.m111724j(((Long) pair.second).longValue(), signUpData.newProfilePath), true);
        return this.f154354d.m102137Q(phoneSignupData);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C22421c m174014E(SignUpData signUpData, Pair pair) {
        IntlGender intlGender;
        Pair pair2 = (Pair) pair.first;
        if (((Boolean) pair.second).booleanValue()) {
            throw new TantanException.Client.AccountService(TantanException.Client.AccountService.ERROR_ACCOUNT_PICTURE_VERIFY, "");
        }
        boolean zM141164j = ino.INSTANCE.m141164j();
        SignupEarlyUIDData intlSignupData = zM141164j ? new IntlSignupData() : new SignupEarlyUIDData();
        intlSignupData.stage = "verified";
        AccountTempApi.SignUpType signUpType = signUpData.signUpType;
        if (signUpType == AccountTempApi.SignUpType.nameInfoSaved) {
            intlSignupData.currentStages = jyb.m147482M("name-saved");
        } else if (signUpType == AccountTempApi.SignUpType.genderInfoSave) {
            intlSignupData.currentStages = jyb.m147482M("gender-saved");
        } else if (signUpType == AccountTempApi.SignUpType.birthInfoSaved) {
            intlSignupData.currentStages = jyb.m147482M("birth-saved");
        } else if (signUpType == AccountTempApi.SignUpType.media) {
            intlSignupData.stage = "finished";
            intlSignupData.currentStages = jyb.m147482M(StepSignupStage.picture_saved);
        } else if (signUpType == AccountTempApi.SignUpType.basic) {
            ArrayList arrayListM147507f0 = jyb.m147507f0("name-saved", "birth-saved", "gender-saved");
            if (zM141164j) {
                arrayListM147507f0.add(StepSignupStage.new_gender_saved);
            }
            intlSignupData.currentStages = arrayListM147507f0;
        } else {
            AccountTempApi.SignUpType signUpType2 = AccountTempApi.SignUpType.intlFriendPurposeSaved;
            if (signUpType == signUpType2 || signUpType == AccountTempApi.SignUpType.ethnicitySaved || signUpType == AccountTempApi.SignUpType.languageSaved) {
                intlSignupData.currentStages = jyb.m147482M(StepSignupStage.extensions_saved);
                Extensions extensions = new Extensions();
                extensions.basic = new ProfileExtensionBasic();
                if (!jyb.m147479J(signUpData.intlFriendPurpose) && signUpData.signUpType == signUpType2) {
                    extensions.basic.intlFriendPurpose = signUpData.intlFriendPurpose;
                } else if (!jyb.m147479J(signUpData.ethnicity) && signUpData.signUpType == AccountTempApi.SignUpType.ethnicitySaved) {
                    extensions.basic.ethnicity = signUpData.ethnicity;
                } else if (!jyb.m147479J(signUpData.language) && signUpData.signUpType == AccountTempApi.SignUpType.languageSaved) {
                    extensions.basic.language = signUpData.language;
                }
                intlSignupData.addExtraData(Extensions.TYPE, extensions.toJson());
            }
        }
        intlSignupData.name = signUpData.name;
        if (NullChecker.m82486a(signUpData.birthdate)) {
            Network network = uqb0.f180376H;
            long jElapsedRealtime = network.lastElapsedRealtime > 0 ? network.lastServerTime + (SystemClock.elapsedRealtime() - uqb0.f180376H.lastElapsedRealtime) : System.currentTimeMillis();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
            String str = simpleDateFormat.format(Long.valueOf(jElapsedRealtime));
            if (jElapsedRealtime != 0) {
                str = simpleDateFormat.format(signUpData.birthdate);
            }
            intlSignupData.birthdate = str;
        }
        com.p051p1.mobile.putong.data.Gender gender = signUpData.gender;
        if (gender != null || signUpData.newGender != null) {
            if (!zM141164j || (intlGender = signUpData.newGender) == null) {
                intlSignupData.gender = TEnum.equals(gender, "female") ? Gender.female : Gender.male;
            } else {
                IntlSignupData intlSignupData2 = (IntlSignupData) intlSignupData;
                intlSignupData2.newGender = intlGender.toString();
                intlSignupData2.gender = Gender.male;
                String str2 = signUpData.subGenderOption;
                if (str2 != null) {
                    intlSignupData2.subGender = str2;
                }
                intlSignupData2.showOnProfile = signUpData.profileShowGender;
            }
        }
        intlSignupData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        if (!TextUtils.isEmpty(signUpData.verifyType)) {
            intlSignupData.addExtraData("verifyType", signUpData.verifyType);
        }
        if (!TextUtils.isEmpty(signUpData.password)) {
            intlSignupData.setPassword(signUpData.password);
        }
        if (!TextUtils.isEmpty((CharSequence) pair2.first)) {
            Object obj = pair2.first;
            intlSignupData.pictureUrl = (String) obj;
            intlSignupData.hasFace = uuf.m198197b((String) obj);
        }
        if (!TextUtils.isEmpty(signUpData.appsFlyerUID)) {
            intlSignupData.appsflyerId = signUpData.appsFlyerUID;
        }
        if (!TextUtils.isEmpty(signUpData.firebaseId)) {
            intlSignupData.addExtraData("firebaseId", signUpData.firebaseId);
        }
        if (!TextUtils.isEmpty(qzd.m178769b())) {
            intlSignupData.advertisingId = qzd.m178769b();
        }
        m174010A(intlSignupData, C16330cp.m111724j(((Long) pair2.second).longValue(), signUpData.newProfilePath), true);
        return this.f154354d.m111448v(intlSignupData);
    }

    /* JADX INFO: renamed from: F */
    public C22421c<uxj0> m174015F(String str) {
        ReportData reportData = new ReportData();
        reportData.name = str;
        return this.f154354d.m111447u(reportData).map(new qcj() { // from class: l.iw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public C22421c<Token> m174016G(ForgetPasswordData forgetPasswordData) {
        PhoneResetPasswordData phoneResetPasswordData = new PhoneResetPasswordData();
        phoneResetPasswordData.code = forgetPasswordData.code;
        phoneResetPasswordData.setPassword(forgetPasswordData.new_);
        phoneResetPasswordData.countryCode = forgetPasswordData.countryCode;
        phoneResetPasswordData.mobileNumber = forgetPasswordData.mobileNumber;
        return this.f154354d.m102136P(phoneResetPasswordData);
    }

    /* JADX INFO: renamed from: H */
    public C22421c<RiskVerification> m174017H(final VerifyData verifyData) {
        String str;
        String mMuidV3;
        Objects.toString(verifyData.action);
        PhoneSendCaptchaData phoneSendCaptchaData = new PhoneSendCaptchaData();
        phoneSendCaptchaData.action = m174032u(verifyData.action);
        phoneSendCaptchaData.countryCode = verifyData.countryCode;
        phoneSendCaptchaData.mobileNumber = verifyData.mobileNumber;
        phoneSendCaptchaData.language = verifyData.language;
        int i = verifyData.codeLength;
        if (i != 4) {
            phoneSendCaptchaData.codeLength = i;
        }
        if (NullChecker.m82486a(verifyData.captcha)) {
            og4 og4Var = new og4();
            Captcha captcha = verifyData.captcha;
            og4Var.captchaID = captcha.captchaID;
            og4Var.captchaOutput = captcha.captchaOutput;
            og4Var.genTime = captcha.genTime;
            og4Var.lotNumber = captcha.lotNumber;
            og4Var.passToken = captcha.passToken;
            captcha.localExpired = true;
            phoneSendCaptchaData.captcha = og4Var;
        }
        String strM180190g = r8f0.m180187f().m180190g();
        if (C16074bp.m105757l()) {
            str = MDevice.getmmuid(AccountModule.f16754a, hb00.m134333b());
            mMuidV3 = MDevice.getMMuidV3(AccountModule.f16754a);
        } else {
            str = "";
            mMuidV3 = str;
        }
        if (TextUtils.isEmpty(strM180190g)) {
            phoneSendCaptchaData.mmuid = "";
        } else {
            phoneSendCaptchaData.mmuid = strM180190g;
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
        return this.f154354d.m130795j0(phoneSendCaptchaData).onErrorResumeNext(new qcj() { // from class: l.lw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C19457pw.m174000i(verifyData, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public C22421c<uxj0> m174018I(final VerifyData verifyData) {
        String str;
        String mMuidV3;
        EmailSendCaptchaData emailSendCaptchaData = new EmailSendCaptchaData();
        emailSendCaptchaData.action = m174034w(verifyData.action);
        emailSendCaptchaData.email = verifyData.email;
        emailSendCaptchaData.language = verifyData.language;
        int i = verifyData.codeLength;
        if (i != 4) {
            emailSendCaptchaData.codeLength = i;
        }
        if (NullChecker.m82486a(verifyData.captcha)) {
            og4 og4Var = new og4();
            Captcha captcha = verifyData.captcha;
            og4Var.captchaID = captcha.captchaID;
            og4Var.captchaOutput = captcha.captchaOutput;
            og4Var.genTime = captcha.genTime;
            og4Var.lotNumber = captcha.lotNumber;
            og4Var.passToken = captcha.passToken;
            captcha.localExpired = true;
            emailSendCaptchaData.captcha = og4Var;
        }
        String strM180190g = r8f0.m180187f().m180190g();
        if (C16074bp.m105757l()) {
            str = MDevice.getmmuid(AccountModule.f16754a, hb00.m134333b());
            mMuidV3 = MDevice.getMMuidV3(AccountModule.f16754a);
        } else {
            str = "";
            mMuidV3 = str;
        }
        if (TextUtils.isEmpty(strM180190g)) {
            emailSendCaptchaData.mmuid = "";
        } else {
            emailSendCaptchaData.mmuid = strM180190g;
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
        return this.f154356f.m137159A(emailSendCaptchaData).onErrorResumeNext(new qcj() { // from class: l.jw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C19457pw.m174005n(verifyData, (Throwable) obj);
            }
        }).map(new qcj() { // from class: l.kw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public C22421c<Token> m174019J(final SignUpData signUpData) {
        return m174026Q(signUpData).flatMap(new qcj() { // from class: l.ow
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f149412a.m174013D(signUpData, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public C22421c<Boolean> m174020K(final SignUpData signUpData) {
        return m174026Q(signUpData).doOnError(new y20() { // from class: l.bw
            @Override // p153l.y20
            public final void call(Object obj) {
                g4g0.m128880c("e_signup_upload_picture_fail", new Object[0]);
            }
        }).flatMap(new qcj() { // from class: l.cw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.just(new Pair((Pair) obj, Boolean.FALSE));
            }
        }).flatMap(new qcj() { // from class: l.dw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f90987a.m174014E(signUpData, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public C22421c<Token> m174021L(SignUpData signUpData) {
        PhoneSignupEarlyUIDData phoneSignupEarlyUIDData = new PhoneSignupEarlyUIDData();
        phoneSignupEarlyUIDData.code = signUpData.code;
        phoneSignupEarlyUIDData.countryCode = signUpData.countryCode;
        phoneSignupEarlyUIDData.mobileNumber = signUpData.phoneNumber;
        if (!TextUtils.isEmpty(signUpData.thirdPartyId)) {
            ThirdPartyAccount thirdPartyAccount = new ThirdPartyAccount();
            thirdPartyAccount.f15530id = signUpData.thirdPartyId;
            thirdPartyAccount.token = signUpData.thirdPartyToken;
            phoneSignupEarlyUIDData.thirdPartyAccount = thirdPartyAccount;
        }
        phoneSignupEarlyUIDData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        if (!TextUtils.isEmpty(signUpData.verifyType)) {
            phoneSignupEarlyUIDData.addExtraData("verifyType", signUpData.verifyType);
        }
        m174010A(phoneSignupEarlyUIDData, 0, true);
        return this.f154354d.m102138R(phoneSignupEarlyUIDData);
    }

    /* JADX INFO: renamed from: M */
    public C22421c<Token> m174022M(SignUpData signUpData) {
        if (!TextUtils.isEmpty(signUpData.email)) {
            return this.f154356f.m137163E(signUpData);
        }
        PhoneSignupEarlyUIDData phoneSignupEarlyUIDData = new PhoneSignupEarlyUIDData();
        phoneSignupEarlyUIDData.code = signUpData.code;
        phoneSignupEarlyUIDData.countryCode = signUpData.countryCode;
        phoneSignupEarlyUIDData.mobileNumber = signUpData.phoneNumber;
        if (!TextUtils.isEmpty(signUpData.thirdPartyId)) {
            ThirdPartyAccount thirdPartyAccount = new ThirdPartyAccount();
            thirdPartyAccount.f15530id = signUpData.thirdPartyId;
            thirdPartyAccount.token = signUpData.thirdPartyToken;
            phoneSignupEarlyUIDData.thirdPartyAccount = thirdPartyAccount;
        }
        phoneSignupEarlyUIDData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        if (!TextUtils.isEmpty(signUpData.verifyType)) {
            phoneSignupEarlyUIDData.addExtraData("verifyType", signUpData.verifyType);
        }
        m174010A(phoneSignupEarlyUIDData, 0, true);
        return this.f154354d.m130796k0(phoneSignupEarlyUIDData, "up_link_sms".equals(signUpData.verifyType));
    }

    /* JADX INFO: renamed from: N */
    public C22421c<Token> m174023N(SignInData signInData, boolean z) {
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
            phoneActiveData.countryCode = Integer.parseInt(signInData.username.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)[0]);
            phoneActiveData.mobileNumber = signInData.username.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)[1];
            if (!TextUtils.isEmpty(signInData.thirdPartyId)) {
                ThirdPartyAccount thirdPartyAccount = new ThirdPartyAccount();
                thirdPartyAccount.f15530id = signInData.thirdPartyId;
                thirdPartyAccount.token = signInData.thirdPartyToken;
                thirdPartyAccount.type = signInData.grantType.toString();
                phoneActiveData.thirdPartyAccount = thirdPartyAccount;
            }
            phoneActiveData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
            C4726a.m29209S0(phoneActiveData, false);
            return this.f154354d.m102133M(phoneActiveData);
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
            phoneSigninData.countryCode = Integer.parseInt(signInData.username.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)[0]);
            phoneSigninData.mobileNumber = signInData.username.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)[1];
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(signInData.thirdPartyId)) {
            ThirdPartyAccount thirdPartyAccount2 = new ThirdPartyAccount();
            thirdPartyAccount2.f15530id = signInData.thirdPartyId;
            thirdPartyAccount2.token = signInData.thirdPartyToken;
            thirdPartyAccount2.type = signInData.grantType.toString();
            phoneSigninData.thirdPartyAccount = thirdPartyAccount2;
        }
        phoneSigninData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        if (!TextUtils.isEmpty(signInData.captchaToken)) {
            phoneSigninData.addExtraData("captchaToken", signInData.captchaToken);
        }
        if (!TextUtils.isEmpty(signInData.captchaValue)) {
            phoneSigninData.addExtraData("captchaValue", signInData.captchaValue);
        }
        C4726a.m29209S0(phoneSigninData, true);
        if (!TextUtils.isEmpty(signInData.verifyType)) {
            phoneSigninData.addExtraData("signinType", signInData.verifyType);
        }
        return ("up_link_sms".equals(signInData.verifyType) ? w24.m204501b().m204505e("/phone/signin", phoneSigninData.toJson(), 70L) : w24.m204501b().m204504d("/phone/signin", phoneSigninData.toJson())).doOnNext(new y20() { // from class: l.yv
            @Override // p153l.y20
            public final void call(Object obj) {
                C19457pw.m174003l(phoneSigninData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.zv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public C22421c<AccountTestGroup> m174024O(String str, String str2) {
        StatusData statusData = new StatusData();
        statusData.channel = str;
        statusData.mcc = str2;
        return this.f154354d.m111449w(statusData).map(new qcj() { // from class: l.mw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C19457pw.m173993b((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public C22421c<Token> m174025P(TokenSigninParam tokenSigninParam) {
        return this.f154354d.m130797l0(tokenSigninParam);
    }

    /* JADX INFO: renamed from: Q */
    public C22421c<Pair<String, Long>> m174026Q(SignUpData signUpData) {
        if (TextUtils.isEmpty(signUpData.profilePath)) {
            return C22421c.just(Pair.create("", 0L));
        }
        ArrayList arrayList = new ArrayList();
        Picture picture = new Picture();
        picture.url = oki.m168011B(signUpData.profilePath);
        picture.mediaType = signUpData.profileMineType;
        picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        arrayList.add(picture);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        return yb5.m214982K(arrayList, "profile", null, UploadSource.get("login")).filter(new qcj() { // from class: l.ew
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((List) obj).size() > 0);
            }
        }).map(new qcj() { // from class: l.fw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Pair.create(((Media) ((List) obj).get(0)).url, Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public C22421c<uxj0> m174027R(final VerifyData verifyData) {
        Objects.toString(verifyData.action);
        PhoneVerifyCaptchaData phoneVerifyCaptchaData = new PhoneVerifyCaptchaData();
        phoneVerifyCaptchaData.code = verifyData.code;
        phoneVerifyCaptchaData.countryCode = verifyData.countryCode;
        phoneVerifyCaptchaData.mobileNumber = verifyData.mobileNumber;
        phoneVerifyCaptchaData.action = m174032u(verifyData.action);
        if (!TextUtils.isEmpty(verifyData.verifyType)) {
            phoneVerifyCaptchaData.addExtraData("verifyType", verifyData.verifyType);
        }
        return this.f154354d.m130798m0(phoneVerifyCaptchaData, "up_link_sms".equals(verifyData.verifyType)).map(new qcj() { // from class: l.hw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C19457pw.m174009r(verifyData, (kotlin.Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public C22421c<uxj0> m174028S(final VerifyDataV2 verifyDataV2) {
        EmailVerifyCaptchaData emailVerifyCaptchaData = new EmailVerifyCaptchaData();
        emailVerifyCaptchaData.code = verifyDataV2.code;
        emailVerifyCaptchaData.email = verifyDataV2.email;
        emailVerifyCaptchaData.action = m174032u(verifyDataV2.action);
        return this.f154356f.m137164F(emailVerifyCaptchaData).map(new qcj() { // from class: l.aw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C19457pw.m173999h(verifyDataV2, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public C22421c<AccountErrorResponse> m174029T(VerifyData verifyData) {
        PhoneData phoneData = new PhoneData();
        phoneData.countryCode = verifyData.countryCode;
        phoneData.mobileNumber = verifyData.mobileNumber;
        return this.f154354d.m102139S(phoneData).map(new qcj() { // from class: l.nw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C19457pw.m174001j((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public C22421c<Token> m174030s(VerifyData verifyData) {
        PhoneBindPhoneData phoneBindPhoneData = new PhoneBindPhoneData();
        phoneBindPhoneData.code = verifyData.code;
        phoneBindPhoneData.countryCode = verifyData.countryCode;
        phoneBindPhoneData.mobileNumber = verifyData.mobileNumber;
        phoneBindPhoneData.forceLogin = verifyData.forceLogin;
        return this.f154354d.m102134N(phoneBindPhoneData);
    }

    /* JADX INFO: renamed from: t */
    public C22421c<Token> m174031t(VerifyData verifyData) {
        PhoneChangePhoneData phoneChangePhoneData = new PhoneChangePhoneData();
        phoneChangePhoneData.code = verifyData.code;
        phoneChangePhoneData.countryCode = verifyData.countryCode;
        phoneChangePhoneData.mobileNumber = verifyData.mobileNumber;
        phoneChangePhoneData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        return this.f154354d.m102135O(phoneChangePhoneData);
    }

    /* JADX INFO: renamed from: u */
    public final CaptchaAction m174032u(VerifyReason verifyReason) {
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
    public AuthData m174033v(Token token) {
        AuthData authDataNew_ = AuthData.new_();
        authDataNew_.accessToken = token.value;
        authDataNew_.expiresIn = token.expiresIn;
        authDataNew_.userId = token.userId;
        Map<String, String> map = token.extra;
        if (map != null) {
            String str = map.get("stage");
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
            String str2 = token.extra.get("finished_stages");
            if (!TextUtils.isEmpty(str2)) {
                for (String str3 : str2.split(Constants.SEPARATOR_COMMA)) {
                    authDataNew_.finishedStages.add(StepSignupStage.get(str3));
                }
            }
        }
        return authDataNew_;
    }

    /* JADX INFO: renamed from: w */
    public final EmailCaptchaAction m174034w(VerifyReason verifyReason) {
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
    public AuthData m174035x(H5Token h5Token) {
        AuthData authDataNew_ = AuthData.new_();
        authDataNew_.accessToken = h5Token.access_token;
        authDataNew_.expiresIn = h5Token.expires_in;
        authDataNew_.userId = h5Token.user_id;
        authDataNew_.tokenType = h5Token.token_type;
        return authDataNew_;
    }

    /* JADX INFO: renamed from: y */
    public C22421c<DownloadDataCheck> m174036y() {
        return this.f154354d.m111446t().map(new qcj() { // from class: l.gw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C19457pw.m173997f((Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public C22421c<AccountErrorResponse> m174037z(String str, String str2) {
        ApplyData applyData = new ApplyData();
        applyData.email = str;
        applyData.mcc = str2;
        return this.f154354d.m111442p(applyData).map(new qcj() { // from class: l.xv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return AccountErrorResponse.new_();
            }
        });
    }
}
