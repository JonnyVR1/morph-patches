package p149l;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.hume.readapk.HumeSDK;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.hdata.android.MDevice;
import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p046p1.mobile.account_core.reponse_data.Data;
import com.p046p1.mobile.account_core.reponse_data.H5Token;
import com.p046p1.mobile.account_core.reponse_data.RiskVerification;
import com.p046p1.mobile.account_core.reponse_data.ThirdPartyStatus;
import com.p046p1.mobile.account_core.reponse_data.Token;
import com.p046p1.mobile.account_core.request_data.ApplyData;
import com.p046p1.mobile.account_core.request_data.Gender;
import com.p046p1.mobile.account_core.request_data.ReportData;
import com.p046p1.mobile.account_core.request_data.SignupData;
import com.p046p1.mobile.account_core.request_data.SignupEarlyUIDData;
import com.p046p1.mobile.account_core.request_data.StatusData;
import com.p046p1.mobile.account_core.request_data.ThirdPartyAccount;
import com.p046p1.mobile.account_phone.data.CaptchaAction;
import com.p046p1.mobile.account_phone.data.PhoneActiveData;
import com.p046p1.mobile.account_phone.data.PhoneBindPhoneData;
import com.p046p1.mobile.account_phone.data.PhoneChangePhoneData;
import com.p046p1.mobile.account_phone.data.PhoneData;
import com.p046p1.mobile.account_phone.data.PhoneResetPasswordData;
import com.p046p1.mobile.account_phone.data.PhoneSendCaptchaData;
import com.p046p1.mobile.account_phone.data.PhoneSigninData;
import com.p046p1.mobile.account_phone.data.PhoneSigninType;
import com.p046p1.mobile.account_phone.data.PhoneSignupData;
import com.p046p1.mobile.account_phone.data.PhoneSignupEarlyUIDData;
import com.p046p1.mobile.account_phone.data.PhoneVerifyCaptchaData;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.api.C4575a;
import com.p046p1.mobile.putong.account.data.AccountTestGroup;
import com.p046p1.mobile.putong.account.data.EmailCaptchaAction;
import com.p046p1.mobile.putong.account.data.EmailSendCaptchaData;
import com.p046p1.mobile.putong.account.data.EmailVerifyCaptchaData;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.TokenSigninParam;
import com.p046p1.mobile.putong.account.sdk.IntlSignupData;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.AccountErrorResponse;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.data.Captcha;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.DownloadDataCheck;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.ForgetPasswordData;
import com.p046p1.mobile.putong.data.IntlGender;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.ProfileExtensionBasic;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.SignupStage;
import com.p046p1.mobile.putong.data.StepSignupStage;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.data.UserSource;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyDataV2;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.tenum.TEnum;
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
import p133rx.C22306c;

/* JADX INFO: renamed from: l.vw */
/* JADX INFO: loaded from: classes9.dex */
public class C20742vw {

    /* JADX INFO: renamed from: a */
    public bh50 f183283a = new bh50();

    /* JADX INFO: renamed from: b */
    public stf f183284b = new stf();

    /* JADX INFO: renamed from: c */
    public zmi0 f183285c = new zmi0();

    /* JADX INFO: renamed from: d */
    public cdj0 f183286d = new cdj0();

    /* JADX INFO: renamed from: e */
    public n3k f183287e = new n3k();

    /* JADX INFO: renamed from: f */
    public dte f183288f = new dte();

    /* JADX INFO: renamed from: g */
    public z0i0 f183289g = new z0i0();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ AccountTestGroup m200223b(AccountEnvelop accountEnvelop) {
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
    public static /* synthetic */ DownloadDataCheck m200227f(Long l2) {
        DownloadDataCheck downloadDataCheckNew_ = DownloadDataCheck.new_();
        downloadDataCheckNew_.last_apply_time = l2.longValue();
        return downloadDataCheckNew_;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ roj0 m200229h(VerifyDataV2 verifyDataV2, Pair pair) {
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
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C22306c m200230i(VerifyData verifyData, Throwable th) {
        return (TEnum.equals(verifyData.action, VerifyReason.bind_mobile) && (th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) ? C22306c.error(new TantanException.Client.AccountService(TantanException.Client.AccountService.BIND_PHONE_ALREADY_REGISTERED, th.getMessage())) : C22306c.error(th);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ AccountErrorResponse m200231j(Boolean bool) {
        if (bool.booleanValue()) {
            throw new TantanException.Client.AccountService(40011, "");
        }
        return AccountErrorResponse.new_();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m200233l(PhoneSigninData phoneSigninData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("AccountSdkApi/phone/signin", phoneSigninData);
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
            qib0.f154719h0 = LiveRegionTag.get(str);
            new uqd0("live_region_tag_" + (!TextUtils.isEmpty(accountEnvelop.data.token.userId) ? accountEnvelop.data.token.userId : ""), "").put(str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ C22306c m200235n(VerifyData verifyData, Throwable th) {
        return (TEnum.equals(verifyData.action, VerifyReason.bind_mobile) && (th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) ? C22306c.error(new TantanException.Client.AccountService(TantanException.Client.AccountService.BIND_PHONE_ALREADY_REGISTERED, th.getMessage())) : C22306c.error(th);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ roj0 m200239r(VerifyData verifyData, kotlin.Pair pair) {
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
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: A */
    public void m200240A(SignupData signupData, int i, boolean z) {
        m200241B(signupData, i, z, "");
    }

    /* JADX INFO: renamed from: B */
    public void m200241B(SignupData signupData, int i, boolean z, String str) {
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
            if (ruk.m180873g() && ruk.m180872c().m180879h()) {
                jSONObject.put("adReferrer", ruk.m180872c().m180876d());
                jSONObject.put("adClickTime", ruk.m180872c().m180874a());
                jSONObject.put("adInstallTime", ruk.m180872c().m180875b());
                jSONObject.put("track", ruk.m180872c().m180877e());
            }
            if (!TextUtils.isEmpty(mr4.f135329a) && mr4.f135329a.toLowerCase().startsWith("douyin")) {
                jSONObject.put("toutiao_channel", HumeSDK.getChannel(App.f15369e));
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("thirdPartyEmail", str);
            }
            signupData.addExtraData("extra", jSONObject.toString());
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: C */
    public C22306c<H5Token> m200242C() {
        return this.f183286d.m219240s();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ C22306c m200243D(SignUpData signUpData, Pair pair) {
        PhoneSignupData phoneSignupData = new PhoneSignupData();
        if (!NullChecker.m81303a(signUpData.birthdate)) {
            CrashHelper.m81296c(new RuntimeException("BirthDateNullException please ignore, class = " + getClass().getName() + ", phoneNumber = " + signUpData.phoneNumber));
        }
        phoneSignupData.name = signUpData.name;
        phoneSignupData.birthdate = C17890jy.m143836n0(signUpData.birthdate.doubleValue());
        phoneSignupData.gender = TEnum.equals(signUpData.gender, "female") ? Gender.female : Gender.male;
        phoneSignupData.code = signUpData.code;
        phoneSignupData.countryCode = signUpData.countryCode;
        phoneSignupData.mobileNumber = signUpData.phoneNumber;
        phoneSignupData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
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
        m200240A(phoneSignupData, C17367hp.m132326j(((Long) pair.second).longValue(), signUpData.newProfilePath), true);
        return this.f183286d.m199938Q(phoneSignupData);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C22306c m200244E(SignUpData signUpData, Pair pair) {
        IntlGender intlGender;
        Pair pair2 = (Pair) pair.first;
        if (((Boolean) pair.second).booleanValue()) {
            throw new TantanException.Client.AccountService(TantanException.Client.AccountService.ERROR_ACCOUNT_PICTURE_VERIFY, "");
        }
        boolean zM137017j = ilo.INSTANCE.m137017j();
        SignupEarlyUIDData intlSignupData = zM137017j ? new IntlSignupData() : new SignupEarlyUIDData();
        intlSignupData.stage = "verified";
        AccountTempApi.SignUpType signUpType = signUpData.signUpType;
        if (signUpType == AccountTempApi.SignUpType.nameInfoSaved) {
            intlSignupData.currentStages = vwb.m200299M("name-saved");
        } else if (signUpType == AccountTempApi.SignUpType.genderInfoSave) {
            intlSignupData.currentStages = vwb.m200299M("gender-saved");
        } else if (signUpType == AccountTempApi.SignUpType.birthInfoSaved) {
            intlSignupData.currentStages = vwb.m200299M("birth-saved");
        } else if (signUpType == AccountTempApi.SignUpType.media) {
            intlSignupData.stage = "finished";
            intlSignupData.currentStages = vwb.m200299M(StepSignupStage.picture_saved);
        } else if (signUpType == AccountTempApi.SignUpType.basic) {
            ArrayList arrayListM200324f0 = vwb.m200324f0("name-saved", "birth-saved", "gender-saved");
            if (zM137017j) {
                arrayListM200324f0.add(StepSignupStage.new_gender_saved);
            }
            intlSignupData.currentStages = arrayListM200324f0;
        } else {
            AccountTempApi.SignUpType signUpType2 = AccountTempApi.SignUpType.intlFriendPurposeSaved;
            if (signUpType == signUpType2 || signUpType == AccountTempApi.SignUpType.ethnicitySaved || signUpType == AccountTempApi.SignUpType.languageSaved) {
                intlSignupData.currentStages = vwb.m200299M(StepSignupStage.extensions_saved);
                Extensions extensions = new Extensions();
                extensions.basic = new ProfileExtensionBasic();
                if (!vwb.m200296J(signUpData.intlFriendPurpose) && signUpData.signUpType == signUpType2) {
                    extensions.basic.intlFriendPurpose = signUpData.intlFriendPurpose;
                } else if (!vwb.m200296J(signUpData.ethnicity) && signUpData.signUpType == AccountTempApi.SignUpType.ethnicitySaved) {
                    extensions.basic.ethnicity = signUpData.ethnicity;
                } else if (!vwb.m200296J(signUpData.language) && signUpData.signUpType == AccountTempApi.SignUpType.languageSaved) {
                    extensions.basic.language = signUpData.language;
                }
                intlSignupData.addExtraData(Extensions.TYPE, extensions.toJson());
            }
        }
        intlSignupData.name = signUpData.name;
        if (NullChecker.m81303a(signUpData.birthdate)) {
            Network network = qib0.f154693H;
            long jElapsedRealtime = network.lastElapsedRealtime > 0 ? network.lastServerTime + (SystemClock.elapsedRealtime() - qib0.f154693H.lastElapsedRealtime) : System.currentTimeMillis();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
            String str = simpleDateFormat.format(Long.valueOf(jElapsedRealtime));
            if (jElapsedRealtime != 0) {
                str = simpleDateFormat.format(signUpData.birthdate);
            }
            intlSignupData.birthdate = str;
        }
        com.p046p1.mobile.putong.data.Gender gender = signUpData.gender;
        if (gender != null || signUpData.newGender != null) {
            if (!zM137017j || (intlGender = signUpData.newGender) == null) {
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
        intlSignupData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        if (!TextUtils.isEmpty(signUpData.verifyType)) {
            intlSignupData.addExtraData("verifyType", signUpData.verifyType);
        }
        if (!TextUtils.isEmpty(signUpData.password)) {
            intlSignupData.setPassword(signUpData.password);
        }
        if (!TextUtils.isEmpty((CharSequence) pair2.first)) {
            Object obj = pair2.first;
            intlSignupData.pictureUrl = (String) obj;
            intlSignupData.hasFace = gtf.m127928b((String) obj);
        }
        if (!TextUtils.isEmpty(signUpData.appsFlyerUID)) {
            intlSignupData.appsflyerId = signUpData.appsFlyerUID;
        }
        if (!TextUtils.isEmpty(signUpData.firebaseId)) {
            intlSignupData.addExtraData("firebaseId", signUpData.firebaseId);
        }
        if (!TextUtils.isEmpty(dyd.m114056b())) {
            intlSignupData.advertisingId = dyd.m114056b();
        }
        m200240A(intlSignupData, C17367hp.m132326j(((Long) pair2.second).longValue(), signUpData.newProfilePath), true);
        return this.f183286d.m219243v(intlSignupData);
    }

    /* JADX INFO: renamed from: F */
    public C22306c<roj0> m200245F(String str) {
        ReportData reportData = new ReportData();
        reportData.name = str;
        return this.f183286d.m219242u(reportData).map(new w9j() { // from class: l.ow
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public C22306c<Token> m200246G(ForgetPasswordData forgetPasswordData) {
        PhoneResetPasswordData phoneResetPasswordData = new PhoneResetPasswordData();
        phoneResetPasswordData.code = forgetPasswordData.code;
        phoneResetPasswordData.setPassword(forgetPasswordData.new_);
        phoneResetPasswordData.countryCode = forgetPasswordData.countryCode;
        phoneResetPasswordData.mobileNumber = forgetPasswordData.mobileNumber;
        return this.f183286d.m199937P(phoneResetPasswordData);
    }

    /* JADX INFO: renamed from: H */
    public C22306c<RiskVerification> m200247H(final VerifyData verifyData) {
        String str;
        String mMuidV3;
        Objects.toString(verifyData.action);
        PhoneSendCaptchaData phoneSendCaptchaData = new PhoneSendCaptchaData();
        phoneSendCaptchaData.action = m200262u(verifyData.action);
        phoneSendCaptchaData.countryCode = verifyData.countryCode;
        phoneSendCaptchaData.mobileNumber = verifyData.mobileNumber;
        phoneSendCaptchaData.language = verifyData.language;
        int i = verifyData.codeLength;
        if (i != 4) {
            phoneSendCaptchaData.codeLength = i;
        }
        if (NullChecker.m81303a(verifyData.captcha)) {
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
        String strM144035g = k0f0.m144032f().m144035g();
        if (C17133gp.m127321l()) {
            str = MDevice.getmmuid(AccountModule.f16035a, k200.m144241b());
            mMuidV3 = MDevice.getMMuidV3(AccountModule.f16035a);
        } else {
            str = "";
            mMuidV3 = str;
        }
        if (TextUtils.isEmpty(strM144035g)) {
            phoneSendCaptchaData.mmuid = "";
        } else {
            phoneSendCaptchaData.mmuid = strM144035g;
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
        return this.f183286d.m106248j0(phoneSendCaptchaData).onErrorResumeNext(new w9j() { // from class: l.rw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C20742vw.m200230i(verifyData, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public C22306c<roj0> m200248I(final VerifyData verifyData) {
        String str;
        String mMuidV3;
        EmailSendCaptchaData emailSendCaptchaData = new EmailSendCaptchaData();
        emailSendCaptchaData.action = m200264w(verifyData.action);
        emailSendCaptchaData.email = verifyData.email;
        emailSendCaptchaData.language = verifyData.language;
        int i = verifyData.codeLength;
        if (i != 4) {
            emailSendCaptchaData.codeLength = i;
        }
        if (NullChecker.m81303a(verifyData.captcha)) {
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
        String strM144035g = k0f0.m144032f().m144035g();
        if (C17133gp.m127321l()) {
            str = MDevice.getmmuid(AccountModule.f16035a, k200.m144241b());
            mMuidV3 = MDevice.getMMuidV3(AccountModule.f16035a);
        } else {
            str = "";
            mMuidV3 = str;
        }
        if (TextUtils.isEmpty(strM144035g)) {
            emailSendCaptchaData.mmuid = "";
        } else {
            emailSendCaptchaData.mmuid = strM144035g;
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
        return this.f183288f.m113560A(emailSendCaptchaData).onErrorResumeNext(new w9j() { // from class: l.pw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C20742vw.m200235n(verifyData, (Throwable) obj);
            }
        }).map(new w9j() { // from class: l.qw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public C22306c<Token> m200249J(final SignUpData signUpData) {
        return m200256Q(signUpData).flatMap(new w9j() { // from class: l.uw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f178579a.m200243D(signUpData, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public C22306c<Boolean> m200250K(final SignUpData signUpData) {
        return m200256Q(signUpData).doOnError(new e30() { // from class: l.hw
            @Override // p149l.e30
            public final void call(Object obj) {
                xvf0.m211281c("e_signup_upload_picture_fail", new Object[0]);
            }
        }).flatMap(new w9j() { // from class: l.iw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.just(new Pair((Pair) obj, Boolean.FALSE));
            }
        }).flatMap(new w9j() { // from class: l.jw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f120005a.m200244E(signUpData, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public C22306c<Token> m200251L(SignUpData signUpData) {
        PhoneSignupEarlyUIDData phoneSignupEarlyUIDData = new PhoneSignupEarlyUIDData();
        phoneSignupEarlyUIDData.code = signUpData.code;
        phoneSignupEarlyUIDData.countryCode = signUpData.countryCode;
        phoneSignupEarlyUIDData.mobileNumber = signUpData.phoneNumber;
        if (!TextUtils.isEmpty(signUpData.thirdPartyId)) {
            ThirdPartyAccount thirdPartyAccount = new ThirdPartyAccount();
            thirdPartyAccount.f14811id = signUpData.thirdPartyId;
            thirdPartyAccount.token = signUpData.thirdPartyToken;
            phoneSignupEarlyUIDData.thirdPartyAccount = thirdPartyAccount;
        }
        phoneSignupEarlyUIDData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        if (!TextUtils.isEmpty(signUpData.verifyType)) {
            phoneSignupEarlyUIDData.addExtraData("verifyType", signUpData.verifyType);
        }
        m200240A(phoneSignupEarlyUIDData, 0, true);
        return this.f183286d.m199939R(phoneSignupEarlyUIDData);
    }

    /* JADX INFO: renamed from: M */
    public C22306c<Token> m200252M(SignUpData signUpData) {
        if (!TextUtils.isEmpty(signUpData.email)) {
            return this.f183288f.m113564E(signUpData);
        }
        PhoneSignupEarlyUIDData phoneSignupEarlyUIDData = new PhoneSignupEarlyUIDData();
        phoneSignupEarlyUIDData.code = signUpData.code;
        phoneSignupEarlyUIDData.countryCode = signUpData.countryCode;
        phoneSignupEarlyUIDData.mobileNumber = signUpData.phoneNumber;
        if (!TextUtils.isEmpty(signUpData.thirdPartyId)) {
            ThirdPartyAccount thirdPartyAccount = new ThirdPartyAccount();
            thirdPartyAccount.f14811id = signUpData.thirdPartyId;
            thirdPartyAccount.token = signUpData.thirdPartyToken;
            phoneSignupEarlyUIDData.thirdPartyAccount = thirdPartyAccount;
        }
        phoneSignupEarlyUIDData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        if (!TextUtils.isEmpty(signUpData.verifyType)) {
            phoneSignupEarlyUIDData.addExtraData("verifyType", signUpData.verifyType);
        }
        m200240A(phoneSignupEarlyUIDData, 0, true);
        return this.f183286d.m106249k0(phoneSignupEarlyUIDData, "up_link_sms".equals(signUpData.verifyType));
    }

    /* JADX INFO: renamed from: N */
    public C22306c<Token> m200253N(SignInData signInData, boolean z) {
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
                thirdPartyAccount.f14811id = signInData.thirdPartyId;
                thirdPartyAccount.token = signInData.thirdPartyToken;
                thirdPartyAccount.type = signInData.grantType.toString();
                phoneActiveData.thirdPartyAccount = thirdPartyAccount;
            }
            phoneActiveData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
            C4575a.m28210S0(phoneActiveData, false);
            return this.f183286d.m199934M(phoneActiveData);
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
            thirdPartyAccount2.f14811id = signInData.thirdPartyId;
            thirdPartyAccount2.token = signInData.thirdPartyToken;
            thirdPartyAccount2.type = signInData.grantType.toString();
            phoneSigninData.thirdPartyAccount = thirdPartyAccount2;
        }
        phoneSigninData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        if (!TextUtils.isEmpty(signInData.captchaToken)) {
            phoneSigninData.addExtraData("captchaToken", signInData.captchaToken);
        }
        if (!TextUtils.isEmpty(signInData.captchaValue)) {
            phoneSigninData.addExtraData("captchaValue", signInData.captchaValue);
        }
        C4575a.m28210S0(phoneSigninData, true);
        if (!TextUtils.isEmpty(signInData.verifyType)) {
            phoneSigninData.addExtraData("signinType", signInData.verifyType);
        }
        return ("up_link_sms".equals(signInData.verifyType) ? x14.m206656b().m206660e("/phone/signin", phoneSigninData.toJson(), 70L) : x14.m206656b().m206659d("/phone/signin", phoneSigninData.toJson())).doOnNext(new e30() { // from class: l.ew
            @Override // p149l.e30
            public final void call(Object obj) {
                C20742vw.m200233l(phoneSigninData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.fw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public C22306c<AccountTestGroup> m200254O(String str, String str2) {
        StatusData statusData = new StatusData();
        statusData.channel = str;
        statusData.mcc = str2;
        return this.f183286d.m219244w(statusData).map(new w9j() { // from class: l.sw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C20742vw.m200223b((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public C22306c<Token> m200255P(TokenSigninParam tokenSigninParam) {
        return this.f183286d.m106250l0(tokenSigninParam);
    }

    /* JADX INFO: renamed from: Q */
    public C22306c<Pair<String, Long>> m200256Q(SignUpData signUpData) {
        if (TextUtils.isEmpty(signUpData.profilePath)) {
            return C22306c.just(Pair.create("", 0L));
        }
        ArrayList arrayList = new ArrayList();
        Picture picture = new Picture();
        picture.url = rhi.m179355B(signUpData.profilePath);
        picture.mediaType = signUpData.profileMineType;
        picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        arrayList.add(picture);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        return ya5.m213795K(arrayList, "profile", null, UploadSource.get("login")).filter(new w9j() { // from class: l.kw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((List) obj).size() > 0);
            }
        }).map(new w9j() { // from class: l.lw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Pair.create(((Media) ((List) obj).get(0)).url, Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public C22306c<roj0> m200257R(final VerifyData verifyData) {
        Objects.toString(verifyData.action);
        PhoneVerifyCaptchaData phoneVerifyCaptchaData = new PhoneVerifyCaptchaData();
        phoneVerifyCaptchaData.code = verifyData.code;
        phoneVerifyCaptchaData.countryCode = verifyData.countryCode;
        phoneVerifyCaptchaData.mobileNumber = verifyData.mobileNumber;
        phoneVerifyCaptchaData.action = m200262u(verifyData.action);
        if (!TextUtils.isEmpty(verifyData.verifyType)) {
            phoneVerifyCaptchaData.addExtraData("verifyType", verifyData.verifyType);
        }
        return this.f183286d.m106251m0(phoneVerifyCaptchaData, "up_link_sms".equals(verifyData.verifyType)).map(new w9j() { // from class: l.nw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C20742vw.m200239r(verifyData, (kotlin.Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public C22306c<roj0> m200258S(final VerifyDataV2 verifyDataV2) {
        EmailVerifyCaptchaData emailVerifyCaptchaData = new EmailVerifyCaptchaData();
        emailVerifyCaptchaData.code = verifyDataV2.code;
        emailVerifyCaptchaData.email = verifyDataV2.email;
        emailVerifyCaptchaData.action = m200262u(verifyDataV2.action);
        return this.f183288f.m113565F(emailVerifyCaptchaData).map(new w9j() { // from class: l.gw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C20742vw.m200229h(verifyDataV2, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public C22306c<AccountErrorResponse> m200259T(VerifyData verifyData) {
        PhoneData phoneData = new PhoneData();
        phoneData.countryCode = verifyData.countryCode;
        phoneData.mobileNumber = verifyData.mobileNumber;
        return this.f183286d.m199940S(phoneData).map(new w9j() { // from class: l.tw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C20742vw.m200231j((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public C22306c<Token> m200260s(VerifyData verifyData) {
        PhoneBindPhoneData phoneBindPhoneData = new PhoneBindPhoneData();
        phoneBindPhoneData.code = verifyData.code;
        phoneBindPhoneData.countryCode = verifyData.countryCode;
        phoneBindPhoneData.mobileNumber = verifyData.mobileNumber;
        phoneBindPhoneData.forceLogin = verifyData.forceLogin;
        return this.f183286d.m199935N(phoneBindPhoneData);
    }

    /* JADX INFO: renamed from: t */
    public C22306c<Token> m200261t(VerifyData verifyData) {
        PhoneChangePhoneData phoneChangePhoneData = new PhoneChangePhoneData();
        phoneChangePhoneData.code = verifyData.code;
        phoneChangePhoneData.countryCode = verifyData.countryCode;
        phoneChangePhoneData.mobileNumber = verifyData.mobileNumber;
        phoneChangePhoneData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        return this.f183286d.m199936O(phoneChangePhoneData);
    }

    /* JADX INFO: renamed from: u */
    public final CaptchaAction m200262u(VerifyReason verifyReason) {
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
    public AuthData m200263v(Token token) {
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
    public final EmailCaptchaAction m200264w(VerifyReason verifyReason) {
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
    public AuthData m200265x(H5Token h5Token) {
        AuthData authDataNew_ = AuthData.new_();
        authDataNew_.accessToken = h5Token.access_token;
        authDataNew_.expiresIn = h5Token.expires_in;
        authDataNew_.userId = h5Token.user_id;
        authDataNew_.tokenType = h5Token.token_type;
        return authDataNew_;
    }

    /* JADX INFO: renamed from: y */
    public C22306c<DownloadDataCheck> m200266y() {
        return this.f183286d.m219241t().map(new w9j() { // from class: l.mw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C20742vw.m200227f((Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public C22306c<AccountErrorResponse> m200267z(String str, String str2) {
        ApplyData applyData = new ApplyData();
        applyData.email = str;
        applyData.mcc = str2;
        return this.f183286d.m219237p(applyData).map(new w9j() { // from class: l.dw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return AccountErrorResponse.new_();
            }
        });
    }
}
