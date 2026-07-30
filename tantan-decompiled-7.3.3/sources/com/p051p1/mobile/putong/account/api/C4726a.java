package com.p051p1.mobile.putong.account.api;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AppsFlyerLib;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p051p1.mobile.account_core.reponse_data.Data;
import com.p051p1.mobile.account_core.reponse_data.H5Token;
import com.p051p1.mobile.account_core.reponse_data.RiskVerification;
import com.p051p1.mobile.account_core.reponse_data.Token;
import com.p051p1.mobile.account_core.request_data.RequestData;
import com.p051p1.mobile.account_facebook.data.FacebookSignupData;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.api.C4726a;
import com.p051p1.mobile.putong.account.api.C4727b;
import com.p051p1.mobile.putong.account.data.AccountCommonData;
import com.p051p1.mobile.putong.account.data.AccountTestFactor;
import com.p051p1.mobile.putong.account.data.AccountTestGroup;
import com.p051p1.mobile.putong.account.data.CaptchaData;
import com.p051p1.mobile.putong.account.data.MatchCounterEnvelope;
import com.p051p1.mobile.putong.account.data.RegisterNameEnvelope;
import com.p051p1.mobile.putong.account.data.ThirdPartyData;
import com.p051p1.mobile.putong.account.p055ui.account.PhoneVerificationAct;
import com.p051p1.mobile.putong.account.p055ui.account.SignInAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.TokenSigninParam;
import com.p051p1.mobile.putong.account.p055ui.welcome.WelcomeAct;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.data.AccountErrorResponse;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.ConfirmCodeResponse;
import com.p051p1.mobile.putong.data.DownloadDataCheck;
import com.p051p1.mobile.putong.data.EmailVerifyData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.FBPage;
import com.p051p1.mobile.putong.data.FBSignupData;
import com.p051p1.mobile.putong.data.FacebookEnvelope;
import com.p051p1.mobile.putong.data.FacebookInfoIdWithName;
import com.p051p1.mobile.putong.data.FacebookUserInfo;
import com.p051p1.mobile.putong.data.ForgetPasswordData;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.OMSResourceType;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.Physical;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.RememberUserInfo;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.SignupStage;
import com.p051p1.mobile.putong.data.StepSignupStage;
import com.p051p1.mobile.putong.data.Studies;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyDataV2;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.VerifyResult;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.schedulers.Schedulers;
import p153l.C16074bp;
import p153l.C16330cp;
import p153l.C17313gu;
import p153l.C19457pw;
import p153l.C19682qw;
import p153l.C20291td;
import p153l.InterfaceC17076fu;
import p153l.awi0;
import p153l.byd0;
import p153l.cpi;
import p153l.fo0;
import p153l.gsp0;
import p153l.gxd0;
import p153l.i4g0;
import p153l.ike;
import p153l.jxd0;
import p153l.jyb;
import p153l.l51;
import p153l.l9c;
import p153l.mxd0;
import p153l.nsb0;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.qi20;
import p153l.r8f0;
import p153l.rfj0;
import p153l.rrq;
import p153l.si20;
import p153l.tcn;
import p153l.ti20;
import p153l.tu2;
import p153l.uqb0;
import p153l.uxj0;
import p153l.v3q0;
import p153l.w24;
import p153l.wiw;
import p153l.wyd0;
import p153l.x1d0;
import p153l.x20;
import p153l.x95;
import p153l.xi5;
import p153l.y20;
import p153l.z1d0;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.api.a */
/* JADX INFO: loaded from: classes9.dex */
public class C4726a extends C4727b {

    /* JADX INFO: renamed from: p */
    public static boolean f17043p = false;

    /* JADX INFO: renamed from: q */
    public static final char[] f17044q = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: g */
    public C17313gu f17045g = new C17313gu();

    /* JADX INFO: renamed from: h */
    public SignUpData f17046h = new SignUpData();

    /* JADX INFO: renamed from: i */
    public wyd0 f17047i = new wyd0("pref_key_last_signup_source", "");

    /* JADX INFO: renamed from: j */
    public byd0 f17048j = new byd0("pref_key_total_match_count", 17545527673L);

    /* JADX INFO: renamed from: k */
    public byd0 f17049k = new byd0("pref_key_cur_signin_timestamp", 0L);

    /* JADX INFO: renamed from: l */
    public gxd0 f17050l = TantanApp.f17901e;

    /* JADX INFO: renamed from: m */
    public jxd0 f17051m = new jxd0("is_show_migrate_guide", Boolean.FALSE);

    /* JADX INFO: renamed from: n */
    public boolean f17052n = false;

    /* JADX INFO: renamed from: o */
    public String f17053o = null;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.api.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17054a;

        static {
            int[] iArr = new int[AccountTempApi.SignUpType.values().length];
            f17054a = iArr;
            try {
                iArr[AccountTempApi.SignUpType.phone.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17054a[AccountTempApi.SignUpType.wechat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17054a[AccountTempApi.SignUpType.qq.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17054a[AccountTempApi.SignUpType.chinaMobile.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17054a[AccountTempApi.SignUpType.chinaUnicom.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17054a[AccountTempApi.SignUpType.facebook.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17054a[AccountTempApi.SignUpType.google.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17054a[AccountTempApi.SignUpType.basic.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17054a[AccountTempApi.SignUpType.nameInfoSaved.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17054a[AccountTempApi.SignUpType.genderInfoSave.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f17054a[AccountTempApi.SignUpType.birthInfoSaved.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f17054a[AccountTempApi.SignUpType.media.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f17054a[AccountTempApi.SignUpType.intlFriendPurposeSaved.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f17054a[AccountTempApi.SignUpType.ethnicitySaved.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f17054a[AccountTempApi.SignUpType.languageSaved.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ uxj0 m29188B0(Runnable runnable, uxj0 uxj0Var) {
        l51.m152887G(runnable);
        tcn.m190487d();
        return uxj0Var;
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ RiskVerification m29190C0(VerifyDataV2 verifyDataV2) {
        return new RiskVerification();
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ uxj0 m29198I(uxj0 uxj0Var) {
        return uxj0Var;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ uxj0 m29203N(SignUpData signUpData, uxj0 uxj0Var) {
        if (IntlCountryCodeController.m29115l() && TEnum.equals(signUpData.gender, "male")) {
            User user = new User();
            Profile profile = new Profile();
            user.profile = profile;
            profile.studies = new Studies();
            Studies studies = user.profile.studies;
            studies.qualification = signUpData.qualificationType;
            studies.school = signUpData.school;
            uqb0.f180380L.f17867f.put(user.toJson());
        }
        if (signUpData.bloodType != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(signUpData.bloodType);
            User user2 = new User();
            Profile profile2 = new Profile();
            user2.profile = profile2;
            profile2.extensions = new Extensions();
            user2.profile.extensions.physical = new Physical();
            user2.profile.extensions.physical.bloodType = arrayList;
            uqb0.f180380L.f17868g.put(user2.toJson());
        }
        return uxj0Var;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m29204O() {
        if (uqb0.f180397c0.signedIn_()) {
            uqb0.m197257Y0(false, WelcomeAct.class, true, false, false);
        } else {
            Application application = App.f16088e;
            application.startActivity(WelcomeAct.m30224F2(application, true));
        }
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ SignUpData m29206Q(FacebookEnvelope facebookEnvelope) {
        FacebookUserInfo facebookUserInfo = facebookEnvelope.data.user;
        SignUpData signUpData = new SignUpData();
        signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(App.f16088e);
        signUpData.name = facebookUserInfo.name;
        if (TextUtils.equals(facebookUserInfo.gender, "male")) {
            signUpData.gender = Gender.get("male");
        } else if (TextUtils.equals(facebookUserInfo.gender, "female")) {
            signUpData.gender = Gender.get("female");
        } else {
            signUpData.gender = null;
        }
        if (!TextUtils.isEmpty(facebookUserInfo.birthdate)) {
            try {
                signUpData.birthdate = Double.valueOf(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(facebookUserInfo.birthdate).getTime());
            } catch (ParseException e) {
                CrashHelper.m82479c(e);
            }
        }
        FBSignupData fBSignupData = new FBSignupData();
        FBPage fBPageNew_ = FBPage.new_();
        FacebookInfoIdWithName facebookInfoIdWithName = facebookUserInfo.hometown;
        fBPageNew_.f39600id = facebookInfoIdWithName.f39603id;
        fBPageNew_.name = facebookInfoIdWithName.name;
        fBSignupData.hometown = fBPageNew_;
        FBPage fBPageNew_2 = FBPage.new_();
        FacebookInfoIdWithName facebookInfoIdWithName2 = facebookUserInfo.location;
        fBPageNew_2.f39600id = facebookInfoIdWithName2.f39603id;
        fBPageNew_2.name = facebookInfoIdWithName2.name;
        fBSignupData.location = fBPageNew_2;
        signUpData.fbSignupData = fBSignupData;
        signUpData.profileMineType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        signUpData.signUpType = AccountTempApi.SignUpType.facebook;
        signUpData.profilePath = facebookUserInfo.picture.data.url;
        return signUpData;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m29207R(JSONObject jSONObject, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178400b("AccountApi/thirdparty-unbind", jSONObject.toString());
        }
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m29208S(JSONObject jSONObject, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178400b("AccountApi/thirdparty-bind", jSONObject.toString());
        }
    }

    /* JADX INFO: renamed from: S0 */
    public static void m29209S0(RequestData requestData, boolean z) {
        m29211T0(requestData, z, "");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: JSONException -> 0x003f, TRY_LEAVE, TryCatch #0 {JSONException -> 0x003f, blocks: (B:4:0x0007, B:6:0x0019, B:7:0x001e, B:9:0x0024, B:10:0x0029, B:12:0x003a), top: B:16:0x0007 }] */
    /* JADX INFO: renamed from: T0 */
    public static void m29211T0(RequestData requestData, boolean z, String str) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                String strM180190g = r8f0.m180187f().m180190g();
                String strM199325K3 = v3q0.m199325K3();
                if (!TextUtils.isEmpty(strM180190g)) {
                    jSONObject.put("mmuid", strM180190g);
                }
                if (!TextUtils.isEmpty(strM199325K3)) {
                    jSONObject.put("inviteCode", strM199325K3);
                }
                jSONObject.put("browserUA", gsp0.getDefaultUserAgent(App.f16088e));
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("thirdPartyEmail", str);
                }
            } catch (JSONException unused) {
            }
        } else {
            jSONObject.put("browserUA", gsp0.getDefaultUserAgent(App.f16088e));
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("thirdPartyEmail", str);
            }
        }
        requestData.addExtraData("extra", jSONObject.toString());
    }

    /* JADX INFO: renamed from: U0 */
    public static C22421c<uxj0> m29213U0(ForgetPasswordData forgetPasswordData, final Runnable runnable) {
        return uqb0.f180377I.now(AccountModule.f16756c.m29309T1(forgetPasswordData).compose(psd0.m173606Q()).flatMap(new qcj() { // from class: l.df
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4726a.m29259v0(runnable, (uxj0) obj);
            }
        }).flatMap(new qcj() { // from class: l.ef
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4726a.m29239m((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z1 */
    public static void m29219Z1() {
        f17043p = false;
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ uxj0 m29223d0(Runnable runnable, uxj0 uxj0Var) {
        l51.m152887G(runnable);
        return uxj0Var;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ uxj0 m29226g(uxj0 uxj0Var) {
        return uxj0Var;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C22421c m29228h(User user) {
        f17043p = C16330cp.m111718d(user);
        return C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ uxj0 m29230i(StepSignupStage stepSignupStage, Envelope envelope) {
        if (NullChecker.m82486a(stepSignupStage)) {
            ike.m140276h().m140281f(SignupStage.get("verified"), stepSignupStage);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: i1 */
    public static boolean m29232i1() {
        return f17043p;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ C22421c m29239m(User user) {
        if (TEnum.equals(user.signupStage, "finished")) {
            uqb0.m197270f0();
        }
        return C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ x1d0 m29243o(VerifyData verifyData, boolean z) {
        String strM29370a;
        x1d0.C21228a c21228aBasic;
        if (TEnum.equals(verifyData.action, VerifyReason.signup_signin)) {
            strM29370a = C4727b.m29370a("/confirmation-code/verify");
            c21228aBasic = uqb0.f180376H.basic();
        } else if (TEnum.equals(verifyData.action, VerifyReason.change_phone)) {
            strM29370a = C4727b.m29370a("/change-phone");
            c21228aBasic = uqb0.f180376H.auth();
        } else if (TEnum.equals(verifyData.action, VerifyReason.bind_mobile)) {
            strM29370a = C4727b.m29370a("/bind-phone".concat(z ? "&forceLogin=true" : ""));
            c21228aBasic = uqb0.f180376H.auth();
        } else {
            if (TEnum.equals(verifyData.action, VerifyReason.ban_appeal)) {
                return uqb0.f180376H.auth().m209043q(C4727b.m29372c("/confirmation-code/verify")).m209038l(z1d0.create(Network.JSON, VerifyDataV2.v1ConvertV2(verifyData).toJson())).m209028b();
            }
            strM29370a = C4727b.m29370a("/verify-confirmation-code");
            c21228aBasic = uqb0.f180376H.basic();
        }
        return c21228aBasic.m209043q(strM29370a).m209038l(z1d0.create(Network.JSON, verifyData.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ uxj0 m29247q(VerifyData verifyData, VerifyResult verifyResult) {
        if (VerifyReason.signup.equals(verifyResult.action)) {
            verifyData.action = VerifyReason.get(VerifyReason.signup);
        }
        if (VerifyReason.signin.equals(verifyResult.action)) {
            verifyData.action = VerifyReason.get(VerifyReason.signin);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ x1d0 m29248q0(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            jSONObject.put("clientId", "100032");
        } catch (Exception unused) {
        }
        return uqb0.f180376H.auth().m209043q(C4727b.m29371b("/event/report")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: q2 */
    public static C22421c<uxj0> m29249q2(final SignUpData signUpData, final Runnable runnable) {
        return uqb0.f180377I.now(cpi.m111764c().materialize().take(1).map(new qcj() { // from class: l.ff
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4726a.m29257u0(signUpData, (Notification) obj);
            }
        }).flatMap(new qcj() { // from class: l.pf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return AccountModule.f16756c.m29312V1((SignUpData) obj).map(new qcj() { // from class: l.gd
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return C4726a.m29226g((uxj0) obj2);
                    }
                }).compose(psd0.m173606Q()).map(new qcj() { // from class: l.hd
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return C4726a.m29188B0(runnable, (uxj0) obj2);
                    }
                }).flatMap(new qcj() { // from class: l.id
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return uqb0.m197272g0(true);
                    }
                }).map(new qcj() { // from class: l.jd
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return C4726a.m29203N(signUpData, (uxj0) obj2);
                    }
                }).observeOn(fo0.m126432a());
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ SignUpData m29257u0(SignUpData signUpData, Notification notification) {
        if (notification.m222546k()) {
            signUpData.firebaseId = (String) notification.m222541f();
        }
        return signUpData;
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ C22421c m29259v0(Runnable runnable, uxj0 uxj0Var) {
        l51.m152887G(runnable);
        return AccountModule.f16756c.m29317Y0();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ C22421c m29260w(final User user) {
        ike.m140276h().m140288o(user);
        if (user.finishedStages.contains(StepSignupStage.get("gender-saved"))) {
            AccountModule.f16756c.m29331f2(user.gender);
        }
        if (user.finishedStages.contains(StepSignupStage.get("birth-saved")) && NullChecker.m82488c(user.settings, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            AccountModule.f16756c.m29329e2(user.settings.birthdate.doubleValue());
            tcn.m190488e(user);
        }
        if (!TEnum.equals(user.signupStage, "finished") && !TEnum.equals(user.signupStage, "unknown_") && NullChecker.m82488c(user.settings, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            C4726a c4726a = AccountModule.f16756c;
            PhoneNumber phoneNumber = user.settings.phoneNumber;
            c4726a.m29333g2(phoneNumber.number, phoneNumber.countryCode);
        }
        x95.INSTANCE.m209792k(user.publicId);
        return TEnum.equals(user.signupStage, "finished") ? uqb0.m197272g0(true).map(new qcj() { // from class: l.ae
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4726a.m29261w0(user, (uxj0) obj);
            }
        }).observeOn(Schedulers.m222739io()) : C22421c.just(user);
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ User m29261w0(User user, uxj0 uxj0Var) {
        return user;
    }

    /* JADX INFO: renamed from: A1 */
    public final /* synthetic */ uxj0 m29268A1(SignUpData signUpData, Boolean bool) {
        m29321a2(signUpData);
        x95.INSTANCE.m209792k(null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: A2 */
    public C22421c<uxj0> m29269A2(final VerifyData verifyData) {
        final boolean z;
        if (TEnum.equals(verifyData.action, VerifyReason.bind_mobile_force_login)) {
            verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
            z = true;
        } else {
            z = false;
        }
        if (TEnum.equals(verifyData.action, VerifyReason.ban_appeal)) {
            return m29283G2(new pcj() { // from class: l.je
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return C4726a.m29243o(verifyData, z);
                }
            }, verifyData);
        }
        if (!TEnum.equals(verifyData.action, VerifyReason.bind_mobile)) {
            return TEnum.equals(verifyData.action, VerifyReason.change_phone) ? AccountModule.f16757d.m174031t(verifyData).map(new qcj() { // from class: l.yd
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f198560a.m29285H1(verifyData, (Token) obj);
                }
            }).compose(psd0.m173592C()) : AccountModule.f16757d.m174027R(verifyData).compose(C4727b.m29375f());
        }
        verifyData.forceLogin = z;
        return AccountModule.f16757d.m174030s(verifyData).map(new qcj() { // from class: l.nd
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f141415a.m29282G1(verifyData, (Token) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ uxj0 m29270B1(SignUpData signUpData, Token token) {
        if (!TextUtils.isEmpty(token.value)) {
            this.f17050l.m123197l(AccountModule.f16757d.m174033v(token));
            rfj0.m181216d("e_early_signup_success", "", rfj0.C19825a.m181221f("signup_source", m29319Z0(signUpData)), rfj0.C19825a.m181221f(Oauth2AccessToken.KEY_PHONE_NUM, TextUtils.isEmpty(signUpData.phoneNumber) ? "" : signUpData.phoneNumber), rfj0.C19825a.m181221f("user_id", token.userId));
        }
        m29321a2(signUpData);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: B2 */
    public C22421c<uxj0> m29271B2(VerifyData verifyData) {
        return AccountModule.f16757d.m174030s(verifyData).map(new qcj() { // from class: l.of
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f147027a.m29288I1((Token) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ C22421c m29272C1(uxj0 uxj0Var) {
        ike.m140276h().m140287n(this.f17050l.mo107143b());
        if (C16074bp.m105751f() && TEnum.equals(this.f17050l.mo107143b().signupStage, "verified")) {
            return m29317Y0().flatMap(new qcj() { // from class: l.me
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C4726a.m29228h((User) obj);
                }
            });
        }
        if (TEnum.equals(this.f17050l.mo107143b().signupStage, "finished") || TEnum.equals(this.f17050l.mo107143b().signupStage, "unknown_")) {
            return uqb0.m197270f0();
        }
        if (TEnum.equals(this.f17050l.mo107143b().signupStage, "verified") && !this.f17050l.mo107143b().finishedStages.contains(StepSignupStage.get(StepSignupStage.picture_saved))) {
            return m29317Y0().flatMap(new qcj() { // from class: l.ne
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C22421c.just(uxj0.f181467a);
                }
            });
        }
        uqb0.f180385Q.m152541U();
        return C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: C2 */
    public C22421c<uxj0> m29273C2(ThirdPartyData thirdPartyData) {
        return AccountModule.f16757d.f154352b.m132545d(thirdPartyData.thirdPartyId, thirdPartyData.thirdPartyToken);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ uxj0 m29274D1(AccountEnvelop accountEnvelop) {
        this.f17050l.m123197l(AccountModule.f16757d.m174033v(accountEnvelop.data.token));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: D2 */
    public C22421c<uxj0> m29275D2(ThirdPartyData thirdPartyData) {
        return AccountModule.f16757d.f154355e.m124279c(thirdPartyData.thirdPartyId, thirdPartyData.thirdPartyToken);
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ uxj0 m29276E1(Token token) {
        if (!TextUtils.isEmpty(token.value)) {
            this.f17050l.m123197l(AccountModule.f16757d.m174033v(token));
        }
        ike.m140276h().m140287n(this.f17050l.mo107143b());
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: E2 */
    public C22421c<AccountErrorResponse> m29277E2(VerifyData verifyData) {
        return AccountModule.f16757d.m174029T(verifyData).compose(C4727b.m29375f());
    }

    /* JADX INFO: renamed from: F0 */
    public C22421c<AuthData> m29278F0() {
        return AccountModule.f16757d.m174012C().compose(C4727b.m29375f()).map(new qcj() { // from class: l.rc
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return AccountModule.f16757d.m174035x((H5Token) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ uxj0 m29279F1(AccountEnvelop accountEnvelop) {
        this.f17050l.m123197l(AccountModule.f16757d.m174033v(accountEnvelop.data.token));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: F2 */
    public C22421c<ConfirmCodeResponse> m29280F2(final VerifyData verifyData) {
        final pcj pcjVar = new pcj() { // from class: l.oe
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.basic().m209043q(C4727b.m29370a("/confirmation-code/verify")).m209038l(z1d0.create(Network.JSON, verifyData.toJson())).m209028b();
            }
        };
        return scheduled("verifyNumberFixHack", 0, new pcj() { // from class: l.pe
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new si20(pcjVar, ConfirmCodeResponse.JSON_ADAPTER).compose(C4727b.m29375f());
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public String m29281G0() {
        return this.f17050l.mo107143b() == null ? "" : this.f17050l.mo107143b().accessToken;
    }

    /* JADX INFO: renamed from: G1 */
    public final /* synthetic */ uxj0 m29282G1(VerifyData verifyData, Token token) {
        this.f17050l.m123197l(AccountModule.f16757d.m174033v(token));
        m29367y2(verifyData);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: G2 */
    public final C22421c<uxj0> m29283G2(final pcj<x1d0> pcjVar, final VerifyData verifyData) {
        if (TEnum.equals(verifyData.action, VerifyReason.change_phone) || TEnum.equals(verifyData.action, VerifyReason.bind_mobile) || TEnum.equals(verifyData.action, VerifyReason.bind_mobile_oneclick)) {
            return scheduled("verifyPhone", -1, new pcj() { // from class: l.wc
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f188303a.m29295L1(pcjVar, verifyData);
                }
            });
        }
        return TEnum.equals(verifyData.action, VerifyReason.signup_signin) ? scheduled(VerifyReason.signup_signin, -1, new pcj() { // from class: l.xc
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new si20(pcjVar, VerifyResult.JSON_ADAPTER).map(new qcj() { // from class: l.ad
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4726a.m29247q(verifyData, (VerifyResult) obj);
                    }
                }).compose(C4727b.m29375f());
            }
        }) : now(new si20(pcjVar, JsonAdapter.UNIT_ADAPTER).compose(C4727b.m29375f()));
    }

    /* JADX INFO: renamed from: H0 */
    public C22421c<uxj0> m29284H0(String str, String str2) {
        rrq.m182815b().m182819e(AccountCommonData.JSON_ADAPTER, null);
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientID", "100032");
            jSONObject.put("type", "chars");
            jSONObject.put("token", str);
            jSONObject.put("value", str2);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return uqb0.f180377I.now("captcha_verify", qi20.m176656c(new pcj() { // from class: l.lf
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.basic().m209043q(C4727b.m29371b("/captcha/verify")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }, Envelope.JSON_ADAPTER).map(new qcj() { // from class: l.mf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }));
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ uxj0 m29285H1(VerifyData verifyData, Token token) {
        this.f17050l.m123197l(AccountModule.f16757d.m174033v(token));
        m29367y2(verifyData);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: H2 */
    public C22421c<uxj0> m29286H2() {
        return now("void_request", new si20(new pcj() { // from class: l.ed
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.basic().m209027a("Client-State", OMSResourceType.background).m209043q(C4727b.m29372c("/void")).m209032f().m209028b();
            }
        }, AccountTestGroup.JSON_ADAPTER).compose(C4727b.m29375f()).map(new qcj() { // from class: l.fd
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }), false);
    }

    /* JADX INFO: renamed from: I0 */
    public C22421c<DownloadDataCheck> m29287I0() {
        return AccountModule.f16757d.m174036y().compose(C4727b.m29375f());
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ uxj0 m29288I1(Token token) {
        this.f17050l.m123197l(AccountModule.f16757d.m174033v(token));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: I2 */
    public wyd0 m29289I2() {
        return new wyd0("wechat_nickname_saved_" + AccountModule.f16756c.m29369z2(), "", false);
    }

    /* JADX INFO: renamed from: J0 */
    public void m29290J0() {
        l51.m152893M(new Runnable() { // from class: l.cd
            @Override // java.lang.Runnable
            public final void run() {
                C4726a.m29204O();
            }
        });
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ uxj0 m29291J1(AuthData authData) {
        if (authData == null) {
            CrashHelper.m82479c(new Exception("auth == null in AccountApi on line 542"));
        }
        this.f17050l.m123197l(authData);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: K0 */
    public C22421c<AccountErrorResponse> m29292K0(EmailVerifyData emailVerifyData) {
        C19457pw c19457pw = AccountModule.f16757d;
        String str = emailVerifyData.email;
        String str2 = "";
        if (uqb0.f180400f0 != 0) {
            str2 = uqb0.f180400f0 + "";
        }
        return c19457pw.m174037z(str, str2).compose(C4727b.m29375f());
    }

    /* JADX INFO: renamed from: K1 */
    public final /* synthetic */ void m29293K1(VerifyData verifyData, uxj0 uxj0Var) {
        if (TEnum.equals(verifyData.action, VerifyReason.change_phone) || TEnum.equals(verifyData.action, VerifyReason.bind_mobile)) {
            m29367y2(verifyData);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public C22421c<uxj0> m29294L0(final AccountTempApi.SignUpType signUpType) {
        return AccountModule.f16756c.m29317Y0().flatMap(new qcj() { // from class: l.af
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f70835a.m29339k1(signUpType, (User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ C22421c m29295L1(pcj pcjVar, final VerifyData verifyData) {
        return new si20(pcjVar, AuthData.JSON_ADAPTER).map(new qcj() { // from class: l.vd
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f183503a.m29291J1((AuthData) obj);
            }
        }).doOnNext(new y20() { // from class: l.wd
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188519a.m29293K1(verifyData, (uxj0) obj);
            }
        }).compose(C4727b.m29375f());
    }

    /* JADX INFO: renamed from: M0 */
    public C22421c<uxj0> m29296M0(final VerifyDataV2 verifyDataV2) {
        if (TEnum.equals(verifyDataV2.action, VerifyReason.bind_email)) {
            return AccountModule.f16757d.f154356f.m137166x(verifyDataV2).map(new qcj() { // from class: l.bf
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f76426a.m29341l1(verifyDataV2, (Token) obj);
                }
            }).compose(psd0.m173592C());
        }
        return TEnum.equals(verifyDataV2.action, VerifyReason.change_email) ? AccountModule.f16757d.f154356f.m137167y(verifyDataV2).map(new qcj() { // from class: l.cf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f81443a.m29343m1(verifyDataV2, (Token) obj);
            }
        }).compose(psd0.m173592C()) : AccountModule.f16757d.m174028S(verifyDataV2).compose(C4727b.m29375f());
    }

    /* JADX INFO: renamed from: M1 */
    public InterfaceC17076fu m29297M1() {
        return this.f17045g.m132260a();
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m29298N0(SignUpData signUpData) {
        AccountTempApi.SignUpType signUpType = signUpData.signUpType;
        return signUpType == AccountTempApi.SignUpType.basic || signUpType == AccountTempApi.SignUpType.nameInfoSaved || signUpType == AccountTempApi.SignUpType.genderInfoSave || signUpType == AccountTempApi.SignUpType.birthInfoSaved || signUpType == AccountTempApi.SignUpType.intlFriendPurposeSaved || signUpType == AccountTempApi.SignUpType.ethnicitySaved || signUpType == AccountTempApi.SignUpType.languageSaved;
    }

    /* JADX INFO: renamed from: N1 */
    public wyd0 m29299N1() {
        return new wyd0("more_gender_saved_" + AccountModule.f16756c.m29369z2(), "", false);
    }

    /* JADX INFO: renamed from: O0 */
    public mxd0 m29300O0() {
        return new mxd0("facebook_birthdate_saved_" + AccountModule.f16756c.m29369z2(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, false);
    }

    /* JADX INFO: renamed from: O1 */
    public jxd0 m29301O1() {
        return new jxd0("more_gender_show_profile_saved_" + AccountModule.f16756c.m29369z2(), Boolean.FALSE, false);
    }

    /* JADX INFO: renamed from: P0 */
    public wyd0 m29302P0() {
        return new wyd0("facebook_gender_saved_" + AccountModule.f16756c.m29369z2(), "", false);
    }

    /* JADX INFO: renamed from: P1 */
    public C22421c<uxj0> m29303P1(String str, String str2, String str3, SignInGrantType signInGrantType) {
        final VerifyData verifyData = new VerifyData();
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile_oneclick);
        verifyData.mobileNumber = "";
        return AccountModule.f16757d.f154351a.m136470b(str, str2, str3, signInGrantType).map(new qcj() { // from class: l.ue
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f178619a.m29360v1(verifyData, (Token) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: Q0 */
    public wyd0 m29304Q0() {
        return new wyd0("facebook_nickname_saved_" + AccountModule.f16756c.m29369z2(), "", false);
    }

    /* JADX INFO: renamed from: Q1 */
    public C22421c<uxj0> m29305Q1(String str, String str2, String str3, SignInGrantType signInGrantType) {
        VerifyData verifyData = new VerifyData();
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile_oneclick);
        verifyData.mobileNumber = "";
        return AccountModule.f16757d.f154351a.m136470b(str, str2, str3, signInGrantType).map(new qcj() { // from class: l.nf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f141703a.m29362w1((Token) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: R0 */
    public wyd0 m29306R0() {
        return new wyd0("facebook_profile_saved_" + AccountModule.f16756c.m29369z2(), "", false);
    }

    /* JADX INFO: renamed from: R1 */
    public Intent m29307R1(Context context, VerifyReason verifyReason) {
        return PhoneVerificationAct.m29384Z1(context, verifyReason);
    }

    /* JADX INFO: renamed from: S1 */
    public Intent m29308S1(Context context, VerifyReason verifyReason, String str) {
        return PhoneVerificationAct.m29386b2(context, verifyReason, str);
    }

    /* JADX INFO: renamed from: T1 */
    public C22421c<uxj0> m29309T1(ForgetPasswordData forgetPasswordData) {
        return AccountModule.f16757d.m174016G(forgetPasswordData).map(new qcj() { // from class: l.xd
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f193507a.m29364x1((Token) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U1 */
    public C22421c<uxj0> m29310U1(final SignInData signInData, RememberUserInfo rememberUserInfo, boolean z) {
        C22421c<Token> c22421cM134073c;
        if (TEnum.equals(signInData.grantType, "unknown_")) {
            RememberUserInfo rememberUserInfoMo107143b = uqb0.f180380L.f17865d.mo107143b();
            if (rememberUserInfoMo107143b != null || rememberUserInfo == null) {
                rememberUserInfo = rememberUserInfoMo107143b;
            }
            if (!NullChecker.m82486a(rememberUserInfo)) {
                return C22421c.error(new IllegalStateException("No remembered login found"));
            }
            this.f17050l.m123197l(rememberUserInfo.auth);
            return C22421c.just(uxj0.f181467a);
        }
        awi0.m100656k(null);
        if (TEnum.equals(signInData.grantType, SignInGrantType.cosmos)) {
            c22421cM134073c = AccountModule.f16757d.f154351a.m136473e(signInData, z);
        } else if (TEnum.equals(signInData.grantType, "wechat")) {
            c22421cM134073c = AccountModule.f16757d.f154353c.m100660h(signInData, z, false);
        } else if (TEnum.equals(signInData.grantType, "qq")) {
            c22421cM134073c = AccountModule.f16757d.f154353c.m100660h(signInData, z, true);
        } else if (TEnum.equals(signInData.grantType, "facebook")) {
            c22421cM134073c = AccountModule.f16757d.f154352b.m132543b(signInData, z);
        } else if (TEnum.equals(signInData.grantType, "google")) {
            c22421cM134073c = AccountModule.f16757d.f154355e.m124278b(signInData, z);
        } else if (TEnum.equals(signInData.grantType, "email")) {
            c22421cM134073c = AccountModule.f16757d.f154356f.m137160B(signInData, z);
        } else {
            c22421cM134073c = TEnum.equals(signInData.grantType, SignInGrantType.tantan_token) ? AccountModule.f16757d.f154357g.m134073c(signInData) : AccountModule.f16757d.m174023N(signInData, z);
        }
        return c22421cM134073c.map(new qcj() { // from class: l.zd
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f203846a.m29366y1(signInData, (Token) obj);
            }
        }).compose(psd0.m173606Q());
    }

    /* JADX INFO: renamed from: V0 */
    public gxd0 m29311V0() {
        return this.f17050l;
    }

    /* JADX INFO: renamed from: V1 */
    public C22421c<uxj0> m29312V1(final SignUpData signUpData) {
        C22421c<Token> c22421cM132544c;
        rrq.m182815b().m182819e(CommonData.JSON_ADAPTER, null);
        awi0.m100656k(null);
        AccountTempApi.SignUpType signUpType = signUpData.signUpType;
        if (signUpType == AccountTempApi.SignUpType.cosmos) {
            c22421cM132544c = AccountModule.f16757d.f154351a.m136474f(signUpData);
        } else if (signUpType == AccountTempApi.SignUpType.wechat) {
            c22421cM132544c = AccountModule.f16757d.f154353c.m100661i(signUpData);
        } else {
            c22421cM132544c = signUpType == AccountTempApi.SignUpType.facebook ? AccountModule.f16757d.f154352b.m132544c(signUpData) : AccountModule.f16757d.m174019J(signUpData);
        }
        return c22421cM132544c.map(new qcj() { // from class: l.he
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f109055a.m29368z1(signUpData, (Token) obj);
            }
        }).compose(psd0.m173606Q());
    }

    /* JADX INFO: renamed from: W0 */
    public C22421c<CaptchaData> m29313W0() {
        rrq.m182815b().m182819e(AccountCommonData.JSON_ADAPTER, null);
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientID", "100032");
            jSONObject.put("type", "chars");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return uqb0.f180377I.now("get_captcha", qi20.m176656c(new pcj() { // from class: l.ie
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.basic().m209043q(C4727b.m29371b("/captcha/generate")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }, Envelope.JSON_ADAPTER).doOnNext(new y20() { // from class: l.ke
            @Override // p153l.y20
            public final void call(Object obj) {
                NullChecker.m82488c(((Envelope) obj).getModuleData(AccountCommonData.class), SchemeKey.account, CrashHelper.ReportLevel.p9);
            }
        }).map(new qcj() { // from class: l.le
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountCommonData) ((Envelope) obj).getModuleData(AccountCommonData.class)).captchaData;
            }
        }));
    }

    /* JADX INFO: renamed from: W1 */
    public C22421c<uxj0> m29314W1(final SignUpData signUpData, SignInGrantType signInGrantType) {
        C22421c<Token> c22421cM174022M;
        awi0.m100656k(null);
        AccountTempApi.SignUpType signUpType = signUpData.signUpType;
        if (signUpType == AccountTempApi.SignUpType.cosmos) {
            c22421cM174022M = AccountModule.f16757d.f154351a.m136475g(signUpData, signInGrantType);
        } else if (signUpType == AccountTempApi.SignUpType.wechat) {
            c22421cM174022M = AccountModule.f16757d.f154353c.m100662j(signUpData, false);
        } else if (signUpType == AccountTempApi.SignUpType.qq) {
            c22421cM174022M = AccountModule.f16757d.f154353c.m100662j(signUpData, true);
        } else if (signUpType == AccountTempApi.SignUpType.facebook || signUpType == AccountTempApi.SignUpType.google) {
            c22421cM174022M = AccountModule.f16757d.f154353c.m100662j(signUpData, false);
        } else if (signUpType == AccountTempApi.SignUpType.email && !TextUtils.equals(signUpData.action, VerifyReason.ttt_signup)) {
            c22421cM174022M = AccountModule.f16757d.f154356f.m137161C(signUpData);
        } else {
            if (m29298N0(signUpData) || signUpData.signUpType == AccountTempApi.SignUpType.media) {
                return AccountModule.f16757d.m174020K(signUpData).map(new qcj() { // from class: l.gf
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f103866a.m29268A1(signUpData, (Boolean) obj);
                    }
                });
            }
            c22421cM174022M = TextUtils.equals(signUpData.action, VerifyReason.ttt_signup) ? AccountModule.f16757d.m174022M(signUpData) : AccountModule.f16757d.m174021L(signUpData);
        }
        return c22421cM174022M.map(new qcj() { // from class: l.hf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f109210a.m29270B1(signUpData, (Token) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X0 */
    public C22421c<MatchCounterEnvelope> m29315X0() {
        return scheduled("get_match_counter", 0, new pcj() { // from class: l.yc
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.qd
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return uqb0.f180376H.basic().m209043q(C4727b.m29373d("/total-counters")).m209032f().m209028b();
                    }
                }, MatchCounterEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: X1 */
    public void m29316X1(String str) {
        AccountModule.f16757d.m174015F(str).compose(C4727b.m29375f());
    }

    /* JADX INFO: renamed from: Y0 */
    public C22421c<User> m29317Y0() {
        rrq.m182815b().m182819e(CommonData.JSON_ADAPTER, null);
        return scheduled("users/" + m29369z2(), 0, new pcj() { // from class: l.rf
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f162754a.m29349p1();
            }
        });
    }

    /* JADX INFO: renamed from: Y1 */
    public C22421c<SignUpData> m29318Y1(String str, String str2) {
        final FacebookSignupData facebookSignupData = new FacebookSignupData();
        facebookSignupData.thirdPartyToken = str2;
        facebookSignupData.thirdPartyId = str;
        return scheduled("facebook_userinfo", 0, new pcj() { // from class: l.ee
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.we
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return uqb0.f180376H.basic().m209043q(C4727b.m29371b("/thirdparty/info")).m209038l(z1d0.create(Network.JSON, facebookSignupData.toJson())).m209028b();
                    }
                }, FacebookEnvelope.JSON_ADAPTER);
            }
        }).map(new qcj() { // from class: l.fe
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4726a.m29206Q((FacebookEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z0 */
    public String m29319Z0(SignUpData signUpData) {
        AccountTempApi.SignUpType signUpType = signUpData.signUpType;
        if (signUpType == AccountTempApi.SignUpType.wechat) {
            return "wechat";
        }
        if (signUpType == AccountTempApi.SignUpType.qq) {
            return "qq";
        }
        if (signUpType == AccountTempApi.SignUpType.nopassword || signUpType == AccountTempApi.SignUpType.phone) {
            return "phone_code";
        }
        if (signUpType == AccountTempApi.SignUpType.facebook) {
            return "facebook";
        }
        return signUpType == AccountTempApi.SignUpType.cosmos ? "phone_oneclick" : "";
    }

    /* JADX INFO: renamed from: a1 */
    public C22421c<RegisterNameEnvelope> m29320a1() {
        return scheduled("get_register_name", 0, new pcj() { // from class: l.se
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.jf
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return uqb0.f180376H.authBeforeSignUp().m209043q(C4727b.m29372c("/profile/names")).m209032f().m209028b();
                    }
                }, RegisterNameEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: a2 */
    public final void m29321a2(SignUpData signUpData) {
        switch (a.f17054a[signUpData.signUpType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                ike.m140276h().m140281f(SignupStage.get("verified"), new StepSignupStage[0]);
                break;
            case 8:
                ike.m140276h().m140281f(SignupStage.get("verified"), StepSignupStage.get("birth-saved"), StepSignupStage.get("name-saved"), StepSignupStage.get("gender-saved"));
                break;
            case 9:
                ike.m140276h().m140281f(SignupStage.get("verified"), StepSignupStage.get("name-saved"));
                break;
            case 10:
                ike.m140276h().m140281f(SignupStage.get("verified"), StepSignupStage.get("gender-saved"));
                break;
            case 11:
                ike.m140276h().m140281f(SignupStage.get("verified"), StepSignupStage.get("birth-saved"));
                break;
            case 12:
                pf60 pf60VarM147494Y = jyb.m147494Y("signup_source", m29326d1());
                String str = this.f17046h.phoneNumber;
                if (str == null) {
                    str = "";
                }
                i4g0.m138495D("e_signup_success", "", pf60VarM147494Y, jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, str));
                ike.m140276h().m140281f(SignupStage.get("finished"), StepSignupStage.get(StepSignupStage.picture_saved));
                break;
            case 13:
                ike.m140276h().m140281f(SignupStage.get("verified"), StepSignupStage.get(StepSignupStage.intlFriendPurpose_saved));
                break;
            case 14:
                ike.m140276h().m140281f(SignupStage.get("verified"), StepSignupStage.get(StepSignupStage.ethnicity_saved));
                break;
            case 15:
                ike.m140276h().m140281f(SignupStage.get("verified"), StepSignupStage.get(StepSignupStage.language_saved));
                break;
        }
    }

    /* JADX INFO: renamed from: b1 */
    public C22421c<Envelope> m29322b1(final String str) {
        return scheduled("sign_in_report", -1, new pcj() { // from class: l.be
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.ze
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4726a.m29248q0(str);
                    }
                }, Envelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: b2 */
    public C22421c<RiskVerification> m29323b2(final VerifyData verifyData) {
        Objects.toString(verifyData.action);
        return !TEnum.equals(verifyData.action, VerifyReason.ban_appeal) ? AccountModule.f16757d.m174017H(verifyData).compose(C4727b.m29375f()) : now(new si20(new pcj() { // from class: l.uc
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(C4727b.m29372c("/confirmation-code/send")).m209038l(z1d0.create(Network.JSON, VerifyDataV2.v1ConvertV2(verifyData).toJson())).m209028b();
            }
        }, VerifyDataV2.JSON_ADAPTER).compose(C4727b.m29375f())).map(new qcj() { // from class: l.vc
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4726a.m29190C0((VerifyDataV2) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c1 */
    public SignUpData m29324c1() {
        return this.f17046h;
    }

    /* JADX INFO: renamed from: c2 */
    public void m29325c2(int i) {
        this.f17046h.age = i;
    }

    /* JADX INFO: renamed from: d1 */
    public String m29326d1() {
        String strM29328e1 = m29328e1(this.f17046h);
        return TextUtils.isEmpty(strM29328e1) ? this.f17047i.get() : strM29328e1;
    }

    /* JADX INFO: renamed from: d2 */
    public void m29327d2(AuthData authData) {
        this.f17050l.m123197l(authData);
    }

    /* JADX INFO: renamed from: e1 */
    public String m29328e1(SignUpData signUpData) {
        String str;
        AccountTempApi.SignUpType signUpType = signUpData.signUpType;
        if (signUpType == AccountTempApi.SignUpType.wechat) {
            str = "wechat";
        } else if (signUpType == AccountTempApi.SignUpType.qq) {
            str = "qq";
        } else if (signUpType == AccountTempApi.SignUpType.nopassword || signUpType == AccountTempApi.SignUpType.phone) {
            str = "phone_code";
        } else if (signUpType == AccountTempApi.SignUpType.facebook) {
            str = "facebook";
        } else if (signUpType == AccountTempApi.SignUpType.cosmos) {
            str = "phone_oneclick";
        } else {
            str = signUpType == AccountTempApi.SignUpType.email ? "mail" : "";
        }
        if (!TextUtils.isEmpty(str)) {
            this.f17047i.put(str);
        }
        return str;
    }

    /* JADX INFO: renamed from: e2 */
    public void m29329e2(double d) {
        this.f17046h.birthdate = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: f1 */
    public C22421c<User> m29330f1() {
        return scheduled("users/" + m29369z2(), 0, new pcj() { // from class: l.ge
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f103757a.m29354s1();
            }
        });
    }

    /* JADX INFO: renamed from: f2 */
    public void m29331f2(Gender gender) {
        this.f17046h.gender = gender;
    }

    /* JADX INFO: renamed from: g1 */
    public void m29332g1() {
        this.f17050l.m142510c().subscribe(psd0.m173597H(new y20() { // from class: l.xe
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193655a.m29356t1((AuthData) obj);
            }
        }, new y20() { // from class: l.ye
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198639a.m29358u1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g2 */
    public void m29333g2(String str, int i) {
        SignUpData signUpData = this.f17046h;
        signUpData.phoneNumber = str;
        signUpData.countryCode = i;
    }

    /* JADX INFO: renamed from: h1 */
    public C22421c<uxj0> m29334h1(Profile profile, final StepSignupStage stepSignupStage) {
        final JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject(profile.toJson());
            jSONObject2.remove("onlyShowAboutMeInside");
            jSONObject.put("profile", jSONObject2);
        } catch (JSONException unused) {
        }
        return scheduled("intl_patch_profile", -1, new pcj() { // from class: l.qf
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.bd
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return uqb0.f180376H.auth().m209043q(xi5.m211118t("/me?method=patch")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                }).map(new qcj() { // from class: l.dd
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4726a.m29230i(stepSignupStage, (Envelope) obj);
                    }
                }).observeOn(fo0.m126432a());
            }
        });
    }

    /* JADX INFO: renamed from: h2 */
    public void m29335h2(String str) {
        this.f17046h.appsFlyerUID = str;
    }

    /* JADX INFO: renamed from: i2 */
    public void m29336i2(SignUpData signUpData) {
        this.f17046h = signUpData;
    }

    /* JADX INFO: renamed from: j1 */
    public boolean m29337j1() {
        return pzi0.m174439D(this.f17049k.get().longValue());
    }

    /* JADX INFO: renamed from: j2 */
    public void m29338j2(String str) {
        this.f17046h.name = str;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ C22421c m29339k1(AccountTempApi.SignUpType signUpType, User user) {
        if (TEnum.equals(user.signupStage, "finished") || TEnum.equals(user.signupStage, "unknown_")) {
            ike.m140276h().f115355a.put(user.signupStage.toString());
            return C22421c.just(uxj0.f181467a);
        }
        SignUpData signUpData = new SignUpData();
        signUpData.signUpType = signUpType;
        SignUpData signUpData2 = this.f17046h;
        signUpData.name = signUpData2.name;
        signUpData.birthdate = signUpData2.birthdate;
        signUpData.gender = signUpData2.gender;
        return ike.m140279r(signUpData, null, false);
    }

    /* JADX INFO: renamed from: k2 */
    public void m29340k2(String str, String str2) {
        SignUpData signUpData = this.f17046h;
        signUpData.profilePath = str;
        signUpData.profileMineType = str2;
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ uxj0 m29341l1(VerifyDataV2 verifyDataV2, Token token) {
        this.f17050l.m123197l(AccountModule.f16757d.m174033v(token));
        m29365x2(verifyDataV2);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: l2 */
    public void m29342l2(String str, String str2) {
        SignUpData signUpData = this.f17046h;
        signUpData.thirdPartyToken = str;
        signUpData.thirdPartyId = str2;
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ uxj0 m29343m1(VerifyDataV2 verifyDataV2, Token token) {
        this.f17050l.m123197l(AccountModule.f16757d.m174033v(token));
        m29365x2(verifyDataV2);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: m2 */
    public void m29344m2(AccountTempApi.SignUpType signUpType) {
        this.f17046h.signUpType = signUpType;
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ x1d0 m29345n1() {
        return uqb0.f180376H.authBeforeSignUp().m209043q(xi5.m211119u(m29369z2())).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: n2 */
    public C22421c<uxj0> m29346n2(SignInData signInData, RememberUserInfo rememberUserInfo, boolean z, final Runnable runnable) {
        return now(m29310U1(signInData, rememberUserInfo, z).compose(psd0.m173606Q()).map(new qcj() { // from class: l.kd
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4726a.m29198I((uxj0) obj);
            }
        }).map(new qcj() { // from class: l.ld
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4726a.m29223d0(runnable, (uxj0) obj);
            }
        }).flatMap(new qcj() { // from class: l.md
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f135852a.m29272C1((uxj0) obj);
            }
        }).observeOn(fo0.m126432a()));
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ User m29347o1(Envelope envelope) {
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        if (!NullChecker.m82488c(commonData, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            return null;
        }
        List<User> list = commonData.users;
        if (jyb.m147479J(list)) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (TextUtils.equals(list.get(i).f56859id, m29369z2())) {
                return list.get(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o2 */
    public C22421c<uxj0> m29348o2(SignInData signInData, boolean z, Runnable runnable) {
        return m29346n2(signInData, null, z, runnable);
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ C22421c m29349p1() {
        return new ti20(new pcj() { // from class: l.rd
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f162270a.m29345n1();
            }
        }).map(new qcj() { // from class: l.sd
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f167364a.m29347o1((Envelope) obj);
            }
        }).filter(new C20291td()).flatMap(new qcj() { // from class: l.ud
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4726a.m29260w((User) obj);
            }
        }).compose(C4727b.m29375f());
    }

    /* JADX INFO: renamed from: p2 */
    public void m29350p2() {
        wiw.m206611l();
        this.f17050l.m123194i();
        tu2.m192703a("[api]", "signout clear data");
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ x1d0 m29351q1() {
        return uqb0.f180376H.authBeforeSignUp().m209043q(xi5.m211119u(m29369z2())).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ User m29352r1(Envelope envelope) {
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        if (!NullChecker.m82488c(commonData, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            return null;
        }
        List<User> list = commonData.users;
        if (jyb.m147479J(list)) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (TextUtils.equals(list.get(i).f56859id, m29369z2())) {
                return list.get(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r2 */
    public void m29353r2(Context context, Intent intent) {
        intent.setClass(context, SignInAct.class);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ C22421c m29354s1() {
        return qi20.m176658e(new pcj() { // from class: l.qe
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f156778a.m29351q1();
            }
        }).map(new qcj() { // from class: l.re
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f162367a.m29352r1((Envelope) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: s2 */
    public C22421c<uxj0> m29355s2() {
        return uqb0.f180377I.now("submit_jump_status", qi20.m176656c(new pcj() { // from class: l.ce
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.authBeforeSignUp().m209043q(C4727b.m29372c("/users/me/skip-info")).m209038l(z1d0.create(Network.JSON, "")).m209028b();
            }
        }, Envelope.JSON_ADAPTER).map(new qcj() { // from class: l.de
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }));
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m29356t1(AuthData authData) {
        if (authData == null) {
            this.f17053o = null;
            this.f17049k.put(0L);
            nsb0.m164590x();
        } else {
            this.f17053o = authData.userId;
            if (this.f17049k.get().longValue() == 0) {
                this.f17049k.put(Long.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
            }
            if (!uqb0.f180397c0.signedIn_()) {
                ABManager.m30362y(2);
            }
            i4g0.m138499H(Oauth2AccessToken.KEY_UID, authData.userId);
        }
    }

    /* JADX INFO: renamed from: t2 */
    public C22421c<AccountTestGroup> m29357t2(AccountTestFactor accountTestFactor) {
        C19457pw c19457pw = AccountModule.f16757d;
        String str = accountTestFactor.channel;
        String str2 = "";
        if (uqb0.f180400f0 != 0) {
            str2 = uqb0.f180400f0 + "";
        }
        return c19457pw.m174024O(str, str2).compose(C4727b.m29375f());
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m29358u1(Throwable th) {
        this.f17053o = null;
        this.f17049k.put(0L);
        nsb0.m164590x();
    }

    /* JADX INFO: renamed from: u2 */
    public C22421c<uxj0> m29359u2(String str, String str2, String str3, String str4) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientId", "100032");
            jSONObject.put("thirdPartyId", str2);
            jSONObject.put("thirdPartyToken", str3);
            jSONObject.put("thirdPartyType", str);
            if (!TextUtils.isEmpty(str4)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("thirdPartyEmail", str4);
                jSONObject.put("extra", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return w24.m204501b().m204504d("/thirdparty/bind", jSONObject.toString()).doOnNext(new y20() { // from class: l.sc
            @Override // p153l.y20
            public final void call(Object obj) {
                C4726a.m29208S(jSONObject, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.tc
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f173005a.m29274D1((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ uxj0 m29360v1(VerifyData verifyData, Token token) {
        this.f17050l.m123197l(AccountModule.f16757d.m174033v(token));
        m29367y2(verifyData);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: v2 */
    public C22421c<uxj0> m29361v2(SignUpData signUpData, TokenSigninParam tokenSigninParam) {
        return AccountModule.f16757d.m174025P(tokenSigninParam).map(new qcj() { // from class: l.od
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f146753a.m29276E1((Token) obj);
            }
        }).flatMap(new qcj() { // from class: l.pd
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uqb0.m197270f0();
            }
        });
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ uxj0 m29362w1(Token token) {
        this.f17050l.m123197l(AccountModule.f16757d.m174033v(token));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: w2 */
    public C22421c<uxj0> m29363w2(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientId", "100032");
            jSONObject.put("type", str);
        } catch (JSONException unused) {
        }
        return w24.m204501b().m204504d("/account/unbind", jSONObject.toString()).doOnNext(new y20() { // from class: l.te
            @Override // p153l.y20
            public final void call(Object obj) {
                C4726a.m29207R(jSONObject, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.ve
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f183693a.m29279F1((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ uxj0 m29364x1(Token token) {
        this.f17050l.m123197l(AccountModule.f16757d.m174033v(token));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: x2 */
    public final void m29365x2(VerifyDataV2 verifyDataV2) {
        User userQueryMe = AccountModule.m29131H().queryMe();
        if (NullChecker.m82488c(userQueryMe, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            final User userMo225055clone = userQueryMe.mo225055clone();
            userMo225055clone.settings.email = verifyDataV2.email;
            l9c.m153394o().m153397B(new x20() { // from class: l.kf
                @Override // p153l.x20
                public final void call() {
                    uqb0.f180405k0.f184355d.upsert(userMo225055clone);
                }
            });
        }
        AccountModule.m29131H().refreshUser(this.f17053o);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025 A[PHI: r1
      0x0025: PHI (r1v9 java.lang.String) = (r1v1 java.lang.String), (r1v2 java.lang.String), (r1v4 java.lang.String), (r1v6 java.lang.String) binds: [B:6:0x0023, B:9:0x002f, B:15:0x0047, B:24:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ uxj0 m29366y1(SignInData signInData, Token token) {
        String str;
        this.f17050l.m123197l(AccountModule.f16757d.m174033v(token));
        if (TEnum.equals(signInData.grantType, SignInGrantType.cosmos)) {
            str = "phone_oneclick";
        } else {
            String str2 = "wechat";
            if (TEnum.equals(signInData.grantType, "wechat")) {
                str = str2;
            } else {
                str2 = "qq";
                if (TEnum.equals(signInData.grantType, "qq")) {
                    str = str2;
                } else if (TEnum.equals(signInData.grantType, SignInGrantType.confirmation_code)) {
                    str = "phone_code";
                } else {
                    str2 = "facebook";
                    if (TEnum.equals(signInData.grantType, "facebook")) {
                        str = str2;
                    } else if (TEnum.equals(signInData.grantType, SignInGrantType.password)) {
                        str = signInData.isSmartlock ? "smartlock" : "phone_password";
                    } else {
                        str2 = "google";
                        if (TEnum.equals(signInData.grantType, "google")) {
                            str = str2;
                        } else if (TEnum.equals(signInData.grantType, SignInGrantType.tantan_token)) {
                            str = "old_tantan";
                        } else {
                            str = TEnum.equals(signInData.grantType, "email") ? "mail" : "";
                        }
                    }
                }
            }
        }
        if (NullChecker.m82486a(this.f17050l.mo107143b())) {
            ike.m140276h().m140287n(this.f17050l.mo107143b());
        }
        if (TEnum.equals(this.f17050l.mo107143b().signupStage, "finished")) {
            i4g0.m138495D("e_signin_success", "", jyb.m147494Y("signin_type", str), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, signInData.username));
        }
        uqb0.m197269e1(VerifyReason.signin, new Object[0]);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: y2 */
    public final void m29367y2(VerifyData verifyData) {
        User userQueryMe = AccountModule.m29131H().queryMe();
        if (NullChecker.m82488c(userQueryMe, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            final User userMo225055clone = userQueryMe.mo225055clone();
            PhoneNumber phoneNumber = userMo225055clone.settings.phoneNumber;
            phoneNumber.number = verifyData.mobileNumber;
            phoneNumber.countryCode = verifyData.countryCode;
            l9c.m153394o().m153397B(new x20() { // from class: l.zc
                @Override // p153l.x20
                public final void call() {
                    uqb0.f180405k0.f184355d.upsert(userMo225055clone);
                }
            });
        }
        AccountModule.m29131H().refreshUser(this.f17053o);
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ uxj0 m29368z1(SignUpData signUpData, Token token) {
        this.f17050l.m123197l(AccountModule.f16757d.m174033v(token));
        pf60 pf60VarM147494Y = jyb.m147494Y("signup_source", m29328e1(signUpData));
        String str = this.f17046h.phoneNumber;
        if (str == null) {
            str = "";
        }
        i4g0.m138495D("e_signup_success", "", pf60VarM147494Y, jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, str));
        uqb0.m197269e1(AFInAppEventType.COMPLETE_REGISTRATION, new Object[0]);
        StringBuilder sb = new StringBuilder("af_complete_registration_");
        sb.append(NullChecker.m82486a(this.f17046h.gender) ? this.f17046h.gender.toString() : "unknown_");
        uqb0.m197269e1(sb.toString(), new Object[0]);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: z2 */
    public String m29369z2() {
        if (NullChecker.m82486a(this.f17053o)) {
            return this.f17053o;
        }
        return m29311V0().mo107143b() == null ? "" : m29311V0().mo107143b().userId;
    }
}
