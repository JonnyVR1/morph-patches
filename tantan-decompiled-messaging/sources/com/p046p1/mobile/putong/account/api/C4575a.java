package com.p046p1.mobile.putong.account.api;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AppsFlyerLib;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p046p1.mobile.account_core.reponse_data.Data;
import com.p046p1.mobile.account_core.reponse_data.H5Token;
import com.p046p1.mobile.account_core.reponse_data.RiskVerification;
import com.p046p1.mobile.account_core.reponse_data.Token;
import com.p046p1.mobile.account_core.request_data.RequestData;
import com.p046p1.mobile.account_facebook.data.FacebookSignupData;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.api.C4575a;
import com.p046p1.mobile.putong.account.api.C4576b;
import com.p046p1.mobile.putong.account.data.AccountCommonData;
import com.p046p1.mobile.putong.account.data.AccountTestFactor;
import com.p046p1.mobile.putong.account.data.AccountTestGroup;
import com.p046p1.mobile.putong.account.data.CaptchaData;
import com.p046p1.mobile.putong.account.data.MatchCounterEnvelope;
import com.p046p1.mobile.putong.account.data.RegisterNameEnvelope;
import com.p046p1.mobile.putong.account.data.ThirdPartyData;
import com.p046p1.mobile.putong.account.p050ui.account.PhoneVerificationAct;
import com.p046p1.mobile.putong.account.p050ui.account.SignInAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.TokenSigninParam;
import com.p046p1.mobile.putong.account.p050ui.welcome.WelcomeAct;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.data.AccountErrorResponse;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.ConfirmCodeResponse;
import com.p046p1.mobile.putong.data.DownloadDataCheck;
import com.p046p1.mobile.putong.data.EmailVerifyData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.FBPage;
import com.p046p1.mobile.putong.data.FBSignupData;
import com.p046p1.mobile.putong.data.FacebookEnvelope;
import com.p046p1.mobile.putong.data.FacebookInfoIdWithName;
import com.p046p1.mobile.putong.data.FacebookUserInfo;
import com.p046p1.mobile.putong.data.ForgetPasswordData;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.OMSResourceType;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.Physical;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.RememberUserInfo;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.SignupStage;
import com.p046p1.mobile.putong.data.StepSignupStage;
import com.p046p1.mobile.putong.data.Studies;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyDataV2;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.VerifyResult;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
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
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.schedulers.Schedulers;
import p149l.C17133gp;
import p149l.C17367hp;
import p149l.C18559mu;
import p149l.C20742vw;
import p149l.C20975ww;
import p149l.C21368yd;
import p149l.InterfaceC18318lu;
import p149l.bjp0;
import p149l.d30;
import p149l.du2;
import p149l.e30;
import p149l.e51;
import p149l.eje;
import p149l.epd0;
import p149l.f8c;
import p149l.gmi;
import p149l.hpd0;
import p149l.ia20;
import p149l.j760;
import p149l.jkb0;
import p149l.jo0;
import p149l.k0f0;
import p149l.ka20;
import p149l.kpd0;
import p149l.la20;
import p149l.mkd0;
import p149l.mqi0;
import p149l.n6j0;
import p149l.qib0;
import p149l.roj0;
import p149l.rpq;
import p149l.rup0;
import p149l.stc0;
import p149l.tan;
import p149l.uqd0;
import p149l.utc0;
import p149l.v9j;
import p149l.vwb;
import p149l.w85;
import p149l.w9j;
import p149l.x14;
import p149l.xgw;
import p149l.xh5;
import p149l.zmi0;
import p149l.zpd0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.api.a */
/* JADX INFO: loaded from: classes9.dex */
public class C4575a extends C4576b {

    /* JADX INFO: renamed from: p */
    public static boolean f16324p = false;

    /* JADX INFO: renamed from: q */
    public static final char[] f16325q = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: g */
    public C18559mu f16326g = new C18559mu();

    /* JADX INFO: renamed from: h */
    public SignUpData f16327h = new SignUpData();

    /* JADX INFO: renamed from: i */
    public uqd0 f16328i = new uqd0("pref_key_last_signup_source", "");

    /* JADX INFO: renamed from: j */
    public zpd0 f16329j = new zpd0("pref_key_total_match_count", 17545527673L);

    /* JADX INFO: renamed from: k */
    public zpd0 f16330k = new zpd0("pref_key_cur_signin_timestamp", 0L);

    /* JADX INFO: renamed from: l */
    public epd0 f16331l = TantanApp.f17182e;

    /* JADX INFO: renamed from: m */
    public hpd0 f16332m = new hpd0("is_show_migrate_guide", Boolean.FALSE);

    /* JADX INFO: renamed from: n */
    public boolean f16333n = false;

    /* JADX INFO: renamed from: o */
    public String f16334o = null;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.api.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16335a;

        static {
            int[] iArr = new int[AccountTempApi.SignUpType.values().length];
            f16335a = iArr;
            try {
                iArr[AccountTempApi.SignUpType.phone.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16335a[AccountTempApi.SignUpType.wechat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16335a[AccountTempApi.SignUpType.qq.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16335a[AccountTempApi.SignUpType.chinaMobile.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16335a[AccountTempApi.SignUpType.chinaUnicom.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16335a[AccountTempApi.SignUpType.facebook.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16335a[AccountTempApi.SignUpType.google.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16335a[AccountTempApi.SignUpType.basic.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16335a[AccountTempApi.SignUpType.nameInfoSaved.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16335a[AccountTempApi.SignUpType.genderInfoSave.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16335a[AccountTempApi.SignUpType.birthInfoSaved.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16335a[AccountTempApi.SignUpType.media.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16335a[AccountTempApi.SignUpType.intlFriendPurposeSaved.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16335a[AccountTempApi.SignUpType.ethnicitySaved.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16335a[AccountTempApi.SignUpType.languageSaved.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ roj0 m28189B0(Runnable runnable, roj0 roj0Var) {
        e51.m114742G(runnable);
        tan.m187743d();
        return roj0Var;
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ RiskVerification m28191C0(VerifyDataV2 verifyDataV2) {
        return new RiskVerification();
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ roj0 m28199I(roj0 roj0Var) {
        return roj0Var;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ roj0 m28204N(SignUpData signUpData, roj0 roj0Var) {
        if (IntlCountryCodeController.m28116l() && TEnum.equals(signUpData.gender, "male")) {
            User user = new User();
            Profile profile = new Profile();
            user.profile = profile;
            profile.studies = new Studies();
            Studies studies = user.profile.studies;
            studies.qualification = signUpData.qualificationType;
            studies.school = signUpData.school;
            qib0.f154697L.f17148f.put(user.toJson());
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
            qib0.f154697L.f17149g.put(user2.toJson());
        }
        return roj0Var;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m28205O() {
        if (qib0.f154714c0.signedIn_()) {
            qib0.m174803Y0(false, WelcomeAct.class, true, false, false);
        } else {
            Application application = App.f15369e;
            application.startActivity(WelcomeAct.m29225E2(application, true));
        }
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ SignUpData m28207Q(FacebookEnvelope facebookEnvelope) {
        FacebookUserInfo facebookUserInfo = facebookEnvelope.data.user;
        SignUpData signUpData = new SignUpData();
        signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(App.f15369e);
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
                CrashHelper.m81296c(e);
            }
        }
        FBSignupData fBSignupData = new FBSignupData();
        FBPage fBPageNew_ = FBPage.new_();
        FacebookInfoIdWithName facebookInfoIdWithName = facebookUserInfo.hometown;
        fBPageNew_.f38752id = facebookInfoIdWithName.f38755id;
        fBPageNew_.name = facebookInfoIdWithName.name;
        fBSignupData.hometown = fBPageNew_;
        FBPage fBPageNew_2 = FBPage.new_();
        FacebookInfoIdWithName facebookInfoIdWithName2 = facebookUserInfo.location;
        fBPageNew_2.f38752id = facebookInfoIdWithName2.f38755id;
        fBPageNew_2.name = facebookInfoIdWithName2.name;
        fBSignupData.location = fBPageNew_2;
        signUpData.fbSignupData = fBSignupData;
        signUpData.profileMineType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        signUpData.signUpType = AccountTempApi.SignUpType.facebook;
        signUpData.profilePath = facebookUserInfo.picture.data.url;
        return signUpData;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m28208R(JSONObject jSONObject, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205791b("AccountApi/thirdparty-unbind", jSONObject.toString());
        }
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m28209S(JSONObject jSONObject, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205791b("AccountApi/thirdparty-bind", jSONObject.toString());
        }
    }

    /* JADX INFO: renamed from: S0 */
    public static void m28210S0(RequestData requestData, boolean z) {
        m28212T0(requestData, z, "");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: JSONException -> 0x003f, TRY_LEAVE, TryCatch #0 {JSONException -> 0x003f, blocks: (B:4:0x0007, B:6:0x0019, B:7:0x001e, B:9:0x0024, B:10:0x0029, B:12:0x003a), top: B:16:0x0007 }] */
    /* JADX INFO: renamed from: T0 */
    public static void m28212T0(RequestData requestData, boolean z, String str) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                String strM144035g = k0f0.m144032f().m144035g();
                String strM180915K3 = rup0.m180915K3();
                if (!TextUtils.isEmpty(strM144035g)) {
                    jSONObject.put("mmuid", strM144035g);
                }
                if (!TextUtils.isEmpty(strM180915K3)) {
                    jSONObject.put("inviteCode", strM180915K3);
                }
                jSONObject.put("browserUA", bjp0.getDefaultUserAgent(App.f15369e));
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("thirdPartyEmail", str);
                }
            } catch (JSONException unused) {
            }
        } else {
            jSONObject.put("browserUA", bjp0.getDefaultUserAgent(App.f15369e));
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("thirdPartyEmail", str);
            }
        }
        requestData.addExtraData("extra", jSONObject.toString());
    }

    /* JADX INFO: renamed from: U0 */
    public static C22306c<roj0> m28214U0(ForgetPasswordData forgetPasswordData, final Runnable runnable) {
        return qib0.f154694I.now(AccountModule.f16037c.m28310T1(forgetPasswordData).compose(mkd0.m154965Q()).flatMap(new w9j() { // from class: l.jf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4575a.m28260v0(runnable, (roj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.kf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4575a.m28240m((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z1 */
    public static void m28220Z1() {
        f16324p = false;
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ roj0 m28224d0(Runnable runnable, roj0 roj0Var) {
        e51.m114742G(runnable);
        return roj0Var;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ roj0 m28227g(roj0 roj0Var) {
        return roj0Var;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C22306c m28229h(User user) {
        f16324p = C17367hp.m132320d(user);
        return C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ roj0 m28231i(StepSignupStage stepSignupStage, Envelope envelope) {
        if (NullChecker.m81303a(stepSignupStage)) {
            eje.m116824h().m116829f(SignupStage.get("verified"), stepSignupStage);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: i1 */
    public static boolean m28233i1() {
        return f16324p;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ C22306c m28240m(User user) {
        if (TEnum.equals(user.signupStage, "finished")) {
            qib0.m174816f0();
        }
        return C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ stc0 m28244o(VerifyData verifyData, boolean z) {
        String strM28371a;
        stc0.C20027a c20027aBasic;
        if (TEnum.equals(verifyData.action, VerifyReason.signup_signin)) {
            strM28371a = C4576b.m28371a("/confirmation-code/verify");
            c20027aBasic = qib0.f154693H.basic();
        } else if (TEnum.equals(verifyData.action, VerifyReason.change_phone)) {
            strM28371a = C4576b.m28371a("/change-phone");
            c20027aBasic = qib0.f154693H.auth();
        } else if (TEnum.equals(verifyData.action, VerifyReason.bind_mobile)) {
            strM28371a = C4576b.m28371a("/bind-phone".concat(z ? "&forceLogin=true" : ""));
            c20027aBasic = qib0.f154693H.auth();
        } else {
            if (TEnum.equals(verifyData.action, VerifyReason.ban_appeal)) {
                return qib0.f154693H.auth().m185898q(C4576b.m28373c("/confirmation-code/verify")).m185893l(utc0.create(Network.JSON, VerifyDataV2.v1ConvertV2(verifyData).toJson())).m185883b();
            }
            strM28371a = C4576b.m28371a("/verify-confirmation-code");
            c20027aBasic = qib0.f154693H.basic();
        }
        return c20027aBasic.m185898q(strM28371a).m185893l(utc0.create(Network.JSON, verifyData.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ roj0 m28248q(VerifyData verifyData, VerifyResult verifyResult) {
        if (VerifyReason.signup.equals(verifyResult.action)) {
            verifyData.action = VerifyReason.get(VerifyReason.signup);
        }
        if (VerifyReason.signin.equals(verifyResult.action)) {
            verifyData.action = VerifyReason.get(VerifyReason.signin);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ stc0 m28249q0(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            jSONObject.put("clientId", "100032");
        } catch (Exception unused) {
        }
        return qib0.f154693H.auth().m185898q(C4576b.m28372b("/event/report")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: q2 */
    public static C22306c<roj0> m28250q2(final SignUpData signUpData, final Runnable runnable) {
        return qib0.f154694I.now(gmi.m126981c().materialize().take(1).map(new w9j() { // from class: l.lf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4575a.m28258u0(signUpData, (Notification) obj);
            }
        }).flatMap(new w9j() { // from class: l.uf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return AccountModule.f16037c.m28313V1((SignUpData) obj).map(new w9j() { // from class: l.ld
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return C4575a.m28227g((roj0) obj2);
                    }
                }).compose(mkd0.m154965Q()).map(new w9j() { // from class: l.md
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return C4575a.m28189B0(runnable, (roj0) obj2);
                    }
                }).flatMap(new w9j() { // from class: l.nd
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return qib0.m174818g0(true);
                    }
                }).map(new w9j() { // from class: l.od
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return C4575a.m28204N(signUpData, (roj0) obj2);
                    }
                }).observeOn(jo0.m142408a());
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ SignUpData m28258u0(SignUpData signUpData, Notification notification) {
        if (notification.m221300k()) {
            signUpData.firebaseId = (String) notification.m221295f();
        }
        return signUpData;
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ C22306c m28260v0(Runnable runnable, roj0 roj0Var) {
        e51.m114742G(runnable);
        return AccountModule.f16037c.m28318Y0();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ C22306c m28261w(final User user) {
        eje.m116824h().m116836o(user);
        if (user.finishedStages.contains(StepSignupStage.get("gender-saved"))) {
            AccountModule.f16037c.m28332f2(user.gender);
        }
        if (user.finishedStages.contains(StepSignupStage.get("birth-saved")) && NullChecker.m81305c(user.settings, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            AccountModule.f16037c.m28330e2(user.settings.birthdate.doubleValue());
            tan.m187744e(user);
        }
        if (!TEnum.equals(user.signupStage, "finished") && !TEnum.equals(user.signupStage, "unknown_") && NullChecker.m81305c(user.settings, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            C4575a c4575a = AccountModule.f16037c;
            PhoneNumber phoneNumber = user.settings.phoneNumber;
            c4575a.m28334g2(phoneNumber.number, phoneNumber.countryCode);
        }
        w85.INSTANCE.m202144k(user.publicId);
        return TEnum.equals(user.signupStage, "finished") ? qib0.m174818g0(true).map(new w9j() { // from class: l.fe
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4575a.m28262w0(user, (roj0) obj);
            }
        }).observeOn(Schedulers.m221493io()) : C22306c.just(user);
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ User m28262w0(User user, roj0 roj0Var) {
        return user;
    }

    /* JADX INFO: renamed from: A1 */
    public final /* synthetic */ roj0 m28269A1(SignUpData signUpData, Boolean bool) {
        m28322a2(signUpData);
        w85.INSTANCE.m202144k(null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: A2 */
    public C22306c<roj0> m28270A2(final VerifyData verifyData) {
        final boolean z;
        if (TEnum.equals(verifyData.action, VerifyReason.bind_mobile_force_login)) {
            verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
            z = true;
        } else {
            z = false;
        }
        if (TEnum.equals(verifyData.action, VerifyReason.ban_appeal)) {
            return m28284G2(new v9j() { // from class: l.oe
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return C4575a.m28244o(verifyData, z);
                }
            }, verifyData);
        }
        if (!TEnum.equals(verifyData.action, VerifyReason.bind_mobile)) {
            return TEnum.equals(verifyData.action, VerifyReason.change_phone) ? AccountModule.f16038d.m200261t(verifyData).map(new w9j() { // from class: l.de
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f85689a.m28286H1(verifyData, (Token) obj);
                }
            }).compose(mkd0.m154951C()) : AccountModule.f16038d.m200257R(verifyData).compose(C4576b.m28376f());
        }
        verifyData.forceLogin = z;
        return AccountModule.f16038d.m200260s(verifyData).map(new w9j() { // from class: l.sd
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f163795a.m28283G1(verifyData, (Token) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ roj0 m28271B1(SignUpData signUpData, Token token) {
        if (!TextUtils.isEmpty(token.value)) {
            this.f16331l.m108253l(AccountModule.f16038d.m200263v(token));
            n6j0.m158050d("e_early_signup_success", "", n6j0.C18629a.m158055f("signup_source", m28320Z0(signUpData)), n6j0.C18629a.m158055f(Oauth2AccessToken.KEY_PHONE_NUM, TextUtils.isEmpty(signUpData.phoneNumber) ? "" : signUpData.phoneNumber), n6j0.C18629a.m158055f("user_id", token.userId));
        }
        m28322a2(signUpData);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: B2 */
    public C22306c<roj0> m28272B2(VerifyData verifyData) {
        return AccountModule.f16038d.m200260s(verifyData).map(new w9j() { // from class: l.tf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f169932a.m28289I1((Token) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ C22306c m28273C1(roj0 roj0Var) {
        eje.m116824h().m116835n(this.f16331l.mo108248b());
        if (C17133gp.m127315f() && TEnum.equals(this.f16331l.mo108248b().signupStage, "verified")) {
            return m28318Y0().flatMap(new w9j() { // from class: l.re
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C4575a.m28229h((User) obj);
                }
            });
        }
        if (TEnum.equals(this.f16331l.mo108248b().signupStage, "finished") || TEnum.equals(this.f16331l.mo108248b().signupStage, "unknown_")) {
            return qib0.m174816f0();
        }
        if (TEnum.equals(this.f16331l.mo108248b().signupStage, "verified") && !this.f16331l.mo108248b().finishedStages.contains(StepSignupStage.get(StepSignupStage.picture_saved))) {
            return m28318Y0().flatMap(new w9j() { // from class: l.se
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C22306c.just(roj0.f160388a);
                }
            });
        }
        qib0.f154702Q.m148247U();
        return C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: C2 */
    public C22306c<roj0> m28274C2(ThirdPartyData thirdPartyData) {
        return AccountModule.f16038d.f183284b.m185919d(thirdPartyData.thirdPartyId, thirdPartyData.thirdPartyToken);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ roj0 m28275D1(AccountEnvelop accountEnvelop) {
        this.f16331l.m108253l(AccountModule.f16038d.m200263v(accountEnvelop.data.token));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: D2 */
    public C22306c<roj0> m28276D2(ThirdPartyData thirdPartyData) {
        return AccountModule.f16038d.f183287e.m157762c(thirdPartyData.thirdPartyId, thirdPartyData.thirdPartyToken);
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ roj0 m28277E1(Token token) {
        if (!TextUtils.isEmpty(token.value)) {
            this.f16331l.m108253l(AccountModule.f16038d.m200263v(token));
        }
        eje.m116824h().m116835n(this.f16331l.mo108248b());
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: E2 */
    public C22306c<AccountErrorResponse> m28278E2(VerifyData verifyData) {
        return AccountModule.f16038d.m200259T(verifyData).compose(C4576b.m28376f());
    }

    /* JADX INFO: renamed from: F0 */
    public C22306c<AuthData> m28279F0() {
        return AccountModule.f16038d.m200242C().compose(C4576b.m28376f()).map(new w9j() { // from class: l.wc
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return AccountModule.f16038d.m200265x((H5Token) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ roj0 m28280F1(AccountEnvelop accountEnvelop) {
        this.f16331l.m108253l(AccountModule.f16038d.m200263v(accountEnvelop.data.token));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: F2 */
    public C22306c<ConfirmCodeResponse> m28281F2(final VerifyData verifyData) {
        final v9j v9jVar = new v9j() { // from class: l.te
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.basic().m185898q(C4576b.m28371a("/confirmation-code/verify")).m185893l(utc0.create(Network.JSON, verifyData.toJson())).m185883b();
            }
        };
        return scheduled("verifyNumberFixHack", 0, new v9j() { // from class: l.ue
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new ka20(v9jVar, ConfirmCodeResponse.JSON_ADAPTER).compose(C4576b.m28376f());
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public String m28282G0() {
        return this.f16331l.mo108248b() == null ? "" : this.f16331l.mo108248b().accessToken;
    }

    /* JADX INFO: renamed from: G1 */
    public final /* synthetic */ roj0 m28283G1(VerifyData verifyData, Token token) {
        this.f16331l.m108253l(AccountModule.f16038d.m200263v(token));
        m28368y2(verifyData);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: G2 */
    public final C22306c<roj0> m28284G2(final v9j<stc0> v9jVar, final VerifyData verifyData) {
        if (TEnum.equals(verifyData.action, VerifyReason.change_phone) || TEnum.equals(verifyData.action, VerifyReason.bind_mobile) || TEnum.equals(verifyData.action, VerifyReason.bind_mobile_oneclick)) {
            return scheduled("verifyPhone", -1, new v9j() { // from class: l.bd
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f74987a.m28296L1(v9jVar, verifyData);
                }
            });
        }
        return TEnum.equals(verifyData.action, VerifyReason.signup_signin) ? scheduled(VerifyReason.signup_signin, -1, new v9j() { // from class: l.cd
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new ka20(v9jVar, VerifyResult.JSON_ADAPTER).map(new w9j() { // from class: l.fd
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4575a.m28248q(verifyData, (VerifyResult) obj);
                    }
                }).compose(C4576b.m28376f());
            }
        }) : now(new ka20(v9jVar, JsonAdapter.UNIT_ADAPTER).compose(C4576b.m28376f()));
    }

    /* JADX INFO: renamed from: H0 */
    public C22306c<roj0> m28285H0(String str, String str2) {
        rpq.m180387b().m180391e(AccountCommonData.JSON_ADAPTER, null);
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientID", "100032");
            jSONObject.put("type", "chars");
            jSONObject.put("token", str);
            jSONObject.put("value", str2);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return qib0.f154694I.now("captcha_verify", ia20.m135119c(new v9j() { // from class: l.qf
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.basic().m185898q(C4576b.m28372b("/captcha/verify")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }, Envelope.JSON_ADAPTER).map(new w9j() { // from class: l.rf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }));
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ roj0 m28286H1(VerifyData verifyData, Token token) {
        this.f16331l.m108253l(AccountModule.f16038d.m200263v(token));
        m28368y2(verifyData);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: H2 */
    public C22306c<roj0> m28287H2() {
        return now("void_request", new ka20(new v9j() { // from class: l.jd
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.basic().m185882a("Client-State", OMSResourceType.background).m185898q(C4576b.m28373c("/void")).m185887f().m185883b();
            }
        }, AccountTestGroup.JSON_ADAPTER).compose(C4576b.m28376f()).map(new w9j() { // from class: l.kd
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }), false);
    }

    /* JADX INFO: renamed from: I0 */
    public C22306c<DownloadDataCheck> m28288I0() {
        return AccountModule.f16038d.m200266y().compose(C4576b.m28376f());
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ roj0 m28289I1(Token token) {
        this.f16331l.m108253l(AccountModule.f16038d.m200263v(token));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: I2 */
    public uqd0 m28290I2() {
        return new uqd0("wechat_nickname_saved_" + AccountModule.f16037c.m28370z2(), "", false);
    }

    /* JADX INFO: renamed from: J0 */
    public void m28291J0() {
        e51.m114748M(new Runnable() { // from class: l.hd
            @Override // java.lang.Runnable
            public final void run() {
                C4575a.m28205O();
            }
        });
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ roj0 m28292J1(AuthData authData) {
        if (authData == null) {
            CrashHelper.m81296c(new Exception("auth == null in AccountApi on line 542"));
        }
        this.f16331l.m108253l(authData);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: K0 */
    public C22306c<AccountErrorResponse> m28293K0(EmailVerifyData emailVerifyData) {
        C20742vw c20742vw = AccountModule.f16038d;
        String str = emailVerifyData.email;
        String str2 = "";
        if (qib0.f154717f0 != 0) {
            str2 = qib0.f154717f0 + "";
        }
        return c20742vw.m200267z(str, str2).compose(C4576b.m28376f());
    }

    /* JADX INFO: renamed from: K1 */
    public final /* synthetic */ void m28294K1(VerifyData verifyData, roj0 roj0Var) {
        if (TEnum.equals(verifyData.action, VerifyReason.change_phone) || TEnum.equals(verifyData.action, VerifyReason.bind_mobile)) {
            m28368y2(verifyData);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public C22306c<roj0> m28295L0(final AccountTempApi.SignUpType signUpType) {
        return AccountModule.f16037c.m28318Y0().flatMap(new w9j() { // from class: l.ff
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f97165a.m28340k1(signUpType, (User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ C22306c m28296L1(v9j v9jVar, final VerifyData verifyData) {
        return new ka20(v9jVar, AuthData.JSON_ADAPTER).map(new w9j() { // from class: l.ae
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f68978a.m28292J1((AuthData) obj);
            }
        }).doOnNext(new e30() { // from class: l.be
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75089a.m28294K1(verifyData, (roj0) obj);
            }
        }).compose(C4576b.m28376f());
    }

    /* JADX INFO: renamed from: M0 */
    public C22306c<roj0> m28297M0(final VerifyDataV2 verifyDataV2) {
        if (TEnum.equals(verifyDataV2.action, VerifyReason.bind_email)) {
            return AccountModule.f16038d.f183288f.m113567x(verifyDataV2).map(new w9j() { // from class: l.gf
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f102320a.m28342l1(verifyDataV2, (Token) obj);
                }
            }).compose(mkd0.m154951C());
        }
        return TEnum.equals(verifyDataV2.action, VerifyReason.change_email) ? AccountModule.f16038d.f183288f.m113568y(verifyDataV2).map(new w9j() { // from class: l.hf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f107421a.m28344m1(verifyDataV2, (Token) obj);
            }
        }).compose(mkd0.m154951C()) : AccountModule.f16038d.m200258S(verifyDataV2).compose(C4576b.m28376f());
    }

    /* JADX INFO: renamed from: M1 */
    public InterfaceC18318lu m28298M1() {
        return this.f16326g.m156366a();
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m28299N0(SignUpData signUpData) {
        AccountTempApi.SignUpType signUpType = signUpData.signUpType;
        return signUpType == AccountTempApi.SignUpType.basic || signUpType == AccountTempApi.SignUpType.nameInfoSaved || signUpType == AccountTempApi.SignUpType.genderInfoSave || signUpType == AccountTempApi.SignUpType.birthInfoSaved || signUpType == AccountTempApi.SignUpType.intlFriendPurposeSaved || signUpType == AccountTempApi.SignUpType.ethnicitySaved || signUpType == AccountTempApi.SignUpType.languageSaved;
    }

    /* JADX INFO: renamed from: N1 */
    public uqd0 m28300N1() {
        return new uqd0("more_gender_saved_" + AccountModule.f16037c.m28370z2(), "", false);
    }

    /* JADX INFO: renamed from: O0 */
    public kpd0 m28301O0() {
        return new kpd0("facebook_birthdate_saved_" + AccountModule.f16037c.m28370z2(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, false);
    }

    /* JADX INFO: renamed from: O1 */
    public hpd0 m28302O1() {
        return new hpd0("more_gender_show_profile_saved_" + AccountModule.f16037c.m28370z2(), Boolean.FALSE, false);
    }

    /* JADX INFO: renamed from: P0 */
    public uqd0 m28303P0() {
        return new uqd0("facebook_gender_saved_" + AccountModule.f16037c.m28370z2(), "", false);
    }

    /* JADX INFO: renamed from: P1 */
    public C22306c<roj0> m28304P1(String str, String str2, String str3, SignInGrantType signInGrantType) {
        final VerifyData verifyData = new VerifyData();
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile_oneclick);
        verifyData.mobileNumber = "";
        return AccountModule.f16038d.f183283a.m101758b(str, str2, str3, signInGrantType).map(new w9j() { // from class: l.ze
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f202754a.m28361v1(verifyData, (Token) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: Q0 */
    public uqd0 m28305Q0() {
        return new uqd0("facebook_nickname_saved_" + AccountModule.f16037c.m28370z2(), "", false);
    }

    /* JADX INFO: renamed from: Q1 */
    public C22306c<roj0> m28306Q1(String str, String str2, String str3, SignInGrantType signInGrantType) {
        VerifyData verifyData = new VerifyData();
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile_oneclick);
        verifyData.mobileNumber = "";
        return AccountModule.f16038d.f183283a.m101758b(str, str2, str3, signInGrantType).map(new w9j() { // from class: l.sf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f164186a.m28363w1((Token) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: R0 */
    public uqd0 m28307R0() {
        return new uqd0("facebook_profile_saved_" + AccountModule.f16037c.m28370z2(), "", false);
    }

    /* JADX INFO: renamed from: R1 */
    public Intent m28308R1(Context context, VerifyReason verifyReason) {
        return PhoneVerificationAct.m28385Y1(context, verifyReason);
    }

    /* JADX INFO: renamed from: S1 */
    public Intent m28309S1(Context context, VerifyReason verifyReason, String str) {
        return PhoneVerificationAct.m28387a2(context, verifyReason, str);
    }

    /* JADX INFO: renamed from: T1 */
    public C22306c<roj0> m28310T1(ForgetPasswordData forgetPasswordData) {
        return AccountModule.f16038d.m200246G(forgetPasswordData).map(new w9j() { // from class: l.ce
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f80424a.m28365x1((Token) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U1 */
    public C22306c<roj0> m28311U1(final SignInData signInData, RememberUserInfo rememberUserInfo, boolean z) {
        C22306c<Token> c22306cM216753c;
        if (TEnum.equals(signInData.grantType, "unknown_")) {
            RememberUserInfo rememberUserInfoMo108248b = qib0.f154697L.f17146d.mo108248b();
            if (rememberUserInfoMo108248b != null || rememberUserInfo == null) {
                rememberUserInfo = rememberUserInfoMo108248b;
            }
            if (!NullChecker.m81303a(rememberUserInfo)) {
                return C22306c.error(new IllegalStateException("No remembered login found"));
            }
            this.f16331l.m108253l(rememberUserInfo.auth);
            return C22306c.just(roj0.f160388a);
        }
        zmi0.m219338k(null);
        if (TEnum.equals(signInData.grantType, SignInGrantType.cosmos)) {
            c22306cM216753c = AccountModule.f16038d.f183283a.m101761e(signInData, z);
        } else if (TEnum.equals(signInData.grantType, "wechat")) {
            c22306cM216753c = AccountModule.f16038d.f183285c.m219342h(signInData, z, false);
        } else if (TEnum.equals(signInData.grantType, "qq")) {
            c22306cM216753c = AccountModule.f16038d.f183285c.m219342h(signInData, z, true);
        } else if (TEnum.equals(signInData.grantType, "facebook")) {
            c22306cM216753c = AccountModule.f16038d.f183284b.m185917b(signInData, z);
        } else if (TEnum.equals(signInData.grantType, "google")) {
            c22306cM216753c = AccountModule.f16038d.f183287e.m157761b(signInData, z);
        } else if (TEnum.equals(signInData.grantType, "email")) {
            c22306cM216753c = AccountModule.f16038d.f183288f.m113561B(signInData, z);
        } else {
            c22306cM216753c = TEnum.equals(signInData.grantType, SignInGrantType.tantan_token) ? AccountModule.f16038d.f183289g.m216753c(signInData) : AccountModule.f16038d.m200253N(signInData, z);
        }
        return c22306cM216753c.map(new w9j() { // from class: l.ee
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f90655a.m28367y1(signInData, (Token) obj);
            }
        }).compose(mkd0.m154965Q());
    }

    /* JADX INFO: renamed from: V0 */
    public epd0 m28312V0() {
        return this.f16331l;
    }

    /* JADX INFO: renamed from: V1 */
    public C22306c<roj0> m28313V1(final SignUpData signUpData) {
        C22306c<Token> c22306cM185918c;
        rpq.m180387b().m180391e(CommonData.JSON_ADAPTER, null);
        zmi0.m219338k(null);
        AccountTempApi.SignUpType signUpType = signUpData.signUpType;
        if (signUpType == AccountTempApi.SignUpType.cosmos) {
            c22306cM185918c = AccountModule.f16038d.f183283a.m101762f(signUpData);
        } else if (signUpType == AccountTempApi.SignUpType.wechat) {
            c22306cM185918c = AccountModule.f16038d.f183285c.m219343i(signUpData);
        } else {
            c22306cM185918c = signUpType == AccountTempApi.SignUpType.facebook ? AccountModule.f16038d.f183284b.m185918c(signUpData) : AccountModule.f16038d.m200249J(signUpData);
        }
        return c22306cM185918c.map(new w9j() { // from class: l.me
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f133331a.m28369z1(signUpData, (Token) obj);
            }
        }).compose(mkd0.m154965Q());
    }

    /* JADX INFO: renamed from: W0 */
    public C22306c<CaptchaData> m28314W0() {
        rpq.m180387b().m180391e(AccountCommonData.JSON_ADAPTER, null);
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientID", "100032");
            jSONObject.put("type", "chars");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return qib0.f154694I.now("get_captcha", ia20.m135119c(new v9j() { // from class: l.ne
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.basic().m185898q(C4576b.m28372b("/captcha/generate")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }, Envelope.JSON_ADAPTER).doOnNext(new e30() { // from class: l.pe
            @Override // p149l.e30
            public final void call(Object obj) {
                NullChecker.m81305c(((Envelope) obj).getModuleData(AccountCommonData.class), SchemeKey.account, CrashHelper.ReportLevel.p9);
            }
        }).map(new w9j() { // from class: l.qe
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountCommonData) ((Envelope) obj).getModuleData(AccountCommonData.class)).captchaData;
            }
        }));
    }

    /* JADX INFO: renamed from: W1 */
    public C22306c<roj0> m28315W1(final SignUpData signUpData, SignInGrantType signInGrantType) {
        C22306c<Token> c22306cM200252M;
        zmi0.m219338k(null);
        AccountTempApi.SignUpType signUpType = signUpData.signUpType;
        if (signUpType == AccountTempApi.SignUpType.cosmos) {
            c22306cM200252M = AccountModule.f16038d.f183283a.m101763g(signUpData, signInGrantType);
        } else if (signUpType == AccountTempApi.SignUpType.wechat) {
            c22306cM200252M = AccountModule.f16038d.f183285c.m219344j(signUpData, false);
        } else if (signUpType == AccountTempApi.SignUpType.qq) {
            c22306cM200252M = AccountModule.f16038d.f183285c.m219344j(signUpData, true);
        } else if (signUpType == AccountTempApi.SignUpType.facebook || signUpType == AccountTempApi.SignUpType.google) {
            c22306cM200252M = AccountModule.f16038d.f183285c.m219344j(signUpData, false);
        } else if (signUpType == AccountTempApi.SignUpType.email && !TextUtils.equals(signUpData.action, VerifyReason.ttt_signup)) {
            c22306cM200252M = AccountModule.f16038d.f183288f.m113562C(signUpData);
        } else {
            if (m28299N0(signUpData) || signUpData.signUpType == AccountTempApi.SignUpType.media) {
                return AccountModule.f16038d.m200250K(signUpData).map(new w9j() { // from class: l.mf
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f133548a.m28269A1(signUpData, (Boolean) obj);
                    }
                });
            }
            c22306cM200252M = TextUtils.equals(signUpData.action, VerifyReason.ttt_signup) ? AccountModule.f16038d.m200252M(signUpData) : AccountModule.f16038d.m200251L(signUpData);
        }
        return c22306cM200252M.map(new w9j() { // from class: l.nf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f138673a.m28271B1(signUpData, (Token) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X0 */
    public C22306c<MatchCounterEnvelope> m28316X0() {
        return scheduled("get_match_counter", 0, new v9j() { // from class: l.dd
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.vd
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return qib0.f154693H.basic().m185898q(C4576b.m28374d("/total-counters")).m185887f().m185883b();
                    }
                }, MatchCounterEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: X1 */
    public void m28317X1(String str) {
        AccountModule.f16038d.m200245F(str).compose(C4576b.m28376f());
    }

    /* JADX INFO: renamed from: Y0 */
    public C22306c<User> m28318Y0() {
        rpq.m180387b().m180391e(CommonData.JSON_ADAPTER, null);
        return scheduled("users/" + m28370z2(), 0, new v9j() { // from class: l.wf
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f185996a.m28350p1();
            }
        });
    }

    /* JADX INFO: renamed from: Y1 */
    public C22306c<SignUpData> m28319Y1(String str, String str2) {
        final FacebookSignupData facebookSignupData = new FacebookSignupData();
        facebookSignupData.thirdPartyToken = str2;
        facebookSignupData.thirdPartyId = str;
        return scheduled("facebook_userinfo", 0, new v9j() { // from class: l.je
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.bf
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return qib0.f154693H.basic().m185898q(C4576b.m28372b("/thirdparty/info")).m185893l(utc0.create(Network.JSON, facebookSignupData.toJson())).m185883b();
                    }
                }, FacebookEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.ke
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4575a.m28207Q((FacebookEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z0 */
    public String m28320Z0(SignUpData signUpData) {
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
    public C22306c<RegisterNameEnvelope> m28321a1() {
        return scheduled("get_register_name", 0, new v9j() { // from class: l.xe
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.of
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return qib0.f154693H.authBeforeSignUp().m185898q(C4576b.m28373c("/profile/names")).m185887f().m185883b();
                    }
                }, RegisterNameEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: a2 */
    public final void m28322a2(SignUpData signUpData) {
        switch (a.f16335a[signUpData.signUpType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                eje.m116824h().m116829f(SignupStage.get("verified"), new StepSignupStage[0]);
                break;
            case 8:
                eje.m116824h().m116829f(SignupStage.get("verified"), StepSignupStage.get("birth-saved"), StepSignupStage.get("name-saved"), StepSignupStage.get("gender-saved"));
                break;
            case 9:
                eje.m116824h().m116829f(SignupStage.get("verified"), StepSignupStage.get("name-saved"));
                break;
            case 10:
                eje.m116824h().m116829f(SignupStage.get("verified"), StepSignupStage.get("gender-saved"));
                break;
            case 11:
                eje.m116824h().m116829f(SignupStage.get("verified"), StepSignupStage.get("birth-saved"));
                break;
            case 12:
                j760 j760VarM200311Y = vwb.m200311Y("signup_source", m28327d1());
                String str = this.f16327h.phoneNumber;
                if (str == null) {
                    str = "";
                }
                zvf0.m220371D("e_signup_success", "", j760VarM200311Y, vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, str));
                eje.m116824h().m116829f(SignupStage.get("finished"), StepSignupStage.get(StepSignupStage.picture_saved));
                break;
            case 13:
                eje.m116824h().m116829f(SignupStage.get("verified"), StepSignupStage.get(StepSignupStage.intlFriendPurpose_saved));
                break;
            case 14:
                eje.m116824h().m116829f(SignupStage.get("verified"), StepSignupStage.get(StepSignupStage.ethnicity_saved));
                break;
            case 15:
                eje.m116824h().m116829f(SignupStage.get("verified"), StepSignupStage.get(StepSignupStage.language_saved));
                break;
        }
    }

    /* JADX INFO: renamed from: b1 */
    public C22306c<Envelope> m28323b1(final String str) {
        return scheduled("sign_in_report", -1, new v9j() { // from class: l.ge
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.ef
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4575a.m28249q0(str);
                    }
                }, Envelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: b2 */
    public C22306c<RiskVerification> m28324b2(final VerifyData verifyData) {
        Objects.toString(verifyData.action);
        return !TEnum.equals(verifyData.action, VerifyReason.ban_appeal) ? AccountModule.f16038d.m200247H(verifyData).compose(C4576b.m28376f()) : now(new ka20(new v9j() { // from class: l.zc
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(C4576b.m28373c("/confirmation-code/send")).m185893l(utc0.create(Network.JSON, VerifyDataV2.v1ConvertV2(verifyData).toJson())).m185883b();
            }
        }, VerifyDataV2.JSON_ADAPTER).compose(C4576b.m28376f())).map(new w9j() { // from class: l.ad
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4575a.m28191C0((VerifyDataV2) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c1 */
    public SignUpData m28325c1() {
        return this.f16327h;
    }

    /* JADX INFO: renamed from: c2 */
    public void m28326c2(int i) {
        this.f16327h.age = i;
    }

    /* JADX INFO: renamed from: d1 */
    public String m28327d1() {
        String strM28329e1 = m28329e1(this.f16327h);
        return TextUtils.isEmpty(strM28329e1) ? this.f16328i.get() : strM28329e1;
    }

    /* JADX INFO: renamed from: d2 */
    public void m28328d2(AuthData authData) {
        this.f16331l.m108253l(authData);
    }

    /* JADX INFO: renamed from: e1 */
    public String m28329e1(SignUpData signUpData) {
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
            this.f16328i.put(str);
        }
        return str;
    }

    /* JADX INFO: renamed from: e2 */
    public void m28330e2(double d) {
        this.f16327h.birthdate = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: f1 */
    public C22306c<User> m28331f1() {
        return scheduled("users/" + m28370z2(), 0, new v9j() { // from class: l.le
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f127627a.m28355s1();
            }
        });
    }

    /* JADX INFO: renamed from: f2 */
    public void m28332f2(Gender gender) {
        this.f16327h.gender = gender;
    }

    /* JADX INFO: renamed from: g1 */
    public void m28333g1() {
        this.f16331l.m127348c().subscribe(mkd0.m154956H(new e30() { // from class: l.cf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80517a.m28357t1((AuthData) obj);
            }
        }, new e30() { // from class: l.df
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85871a.m28359u1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g2 */
    public void m28334g2(String str, int i) {
        SignUpData signUpData = this.f16327h;
        signUpData.phoneNumber = str;
        signUpData.countryCode = i;
    }

    /* JADX INFO: renamed from: h1 */
    public C22306c<roj0> m28335h1(Profile profile, final StepSignupStage stepSignupStage) {
        final JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject(profile.toJson());
            jSONObject2.remove("onlyShowAboutMeInside");
            jSONObject.put("profile", jSONObject2);
        } catch (JSONException unused) {
        }
        return scheduled("intl_patch_profile", -1, new v9j() { // from class: l.vf
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.gd
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return qib0.f154693H.auth().m185898q(xh5.m208772t("/me?method=patch")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                }).map(new w9j() { // from class: l.id
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4575a.m28231i(stepSignupStage, (Envelope) obj);
                    }
                }).observeOn(jo0.m142408a());
            }
        });
    }

    /* JADX INFO: renamed from: h2 */
    public void m28336h2(String str) {
        this.f16327h.appsFlyerUID = str;
    }

    /* JADX INFO: renamed from: i2 */
    public void m28337i2(SignUpData signUpData) {
        this.f16327h = signUpData;
    }

    /* JADX INFO: renamed from: j1 */
    public boolean m28338j1() {
        return mqi0.m155929D(this.f16330k.get().longValue());
    }

    /* JADX INFO: renamed from: j2 */
    public void m28339j2(String str) {
        this.f16327h.name = str;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ C22306c m28340k1(AccountTempApi.SignUpType signUpType, User user) {
        if (TEnum.equals(user.signupStage, "finished") || TEnum.equals(user.signupStage, "unknown_")) {
            eje.m116824h().f91713a.put(user.signupStage.toString());
            return C22306c.just(roj0.f160388a);
        }
        SignUpData signUpData = new SignUpData();
        signUpData.signUpType = signUpType;
        SignUpData signUpData2 = this.f16327h;
        signUpData.name = signUpData2.name;
        signUpData.birthdate = signUpData2.birthdate;
        signUpData.gender = signUpData2.gender;
        return eje.m116827r(signUpData, null, false);
    }

    /* JADX INFO: renamed from: k2 */
    public void m28341k2(String str, String str2) {
        SignUpData signUpData = this.f16327h;
        signUpData.profilePath = str;
        signUpData.profileMineType = str2;
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ roj0 m28342l1(VerifyDataV2 verifyDataV2, Token token) {
        this.f16331l.m108253l(AccountModule.f16038d.m200263v(token));
        m28366x2(verifyDataV2);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: l2 */
    public void m28343l2(String str, String str2) {
        SignUpData signUpData = this.f16327h;
        signUpData.thirdPartyToken = str;
        signUpData.thirdPartyId = str2;
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ roj0 m28344m1(VerifyDataV2 verifyDataV2, Token token) {
        this.f16331l.m108253l(AccountModule.f16038d.m200263v(token));
        m28366x2(verifyDataV2);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: m2 */
    public void m28345m2(AccountTempApi.SignUpType signUpType) {
        this.f16327h.signUpType = signUpType;
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ stc0 m28346n1() {
        return qib0.f154693H.authBeforeSignUp().m185898q(xh5.m208773u(m28370z2())).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: n2 */
    public C22306c<roj0> m28347n2(SignInData signInData, RememberUserInfo rememberUserInfo, boolean z, final Runnable runnable) {
        return now(m28311U1(signInData, rememberUserInfo, z).compose(mkd0.m154965Q()).map(new w9j() { // from class: l.pd
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4575a.m28199I((roj0) obj);
            }
        }).map(new w9j() { // from class: l.qd
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4575a.m28224d0(runnable, (roj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.rd
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158846a.m28273C1((roj0) obj);
            }
        }).observeOn(jo0.m142408a()));
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ User m28348o1(Envelope envelope) {
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        if (!NullChecker.m81305c(commonData, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            return null;
        }
        List<User> list = commonData.users;
        if (vwb.m200296J(list)) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (TextUtils.equals(list.get(i).f56011id, m28370z2())) {
                return list.get(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o2 */
    public C22306c<roj0> m28349o2(SignInData signInData, boolean z, Runnable runnable) {
        return m28347n2(signInData, null, z, runnable);
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ C22306c m28350p1() {
        return new la20(new v9j() { // from class: l.wd
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f185746a.m28346n1();
            }
        }).map(new w9j() { // from class: l.xd
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f192287a.m28348o1((Envelope) obj);
            }
        }).filter(new C21368yd()).flatMap(new w9j() { // from class: l.zd
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4575a.m28261w((User) obj);
            }
        }).compose(C4576b.m28376f());
    }

    /* JADX INFO: renamed from: p2 */
    public void m28351p2() {
        xgw.m208710l();
        this.f16331l.m108250i();
        du2.m113670a("[api]", "signout clear data");
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ stc0 m28352q1() {
        return qib0.f154693H.authBeforeSignUp().m185898q(xh5.m208773u(m28370z2())).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ User m28353r1(Envelope envelope) {
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        if (!NullChecker.m81305c(commonData, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            return null;
        }
        List<User> list = commonData.users;
        if (vwb.m200296J(list)) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (TextUtils.equals(list.get(i).f56011id, m28370z2())) {
                return list.get(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r2 */
    public void m28354r2(Context context, Intent intent) {
        intent.setClass(context, SignInAct.class);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ C22306c m28355s1() {
        return ia20.m135121e(new v9j() { // from class: l.ve
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f181141a.m28352q1();
            }
        }).map(new w9j() { // from class: l.we
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f185898a.m28353r1((Envelope) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: s2 */
    public C22306c<roj0> m28356s2() {
        return qib0.f154694I.now("submit_jump_status", ia20.m135119c(new v9j() { // from class: l.he
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.authBeforeSignUp().m185898q(C4576b.m28373c("/users/me/skip-info")).m185893l(utc0.create(Network.JSON, "")).m185883b();
            }
        }, Envelope.JSON_ADAPTER).map(new w9j() { // from class: l.ie
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }));
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m28357t1(AuthData authData) {
        if (authData == null) {
            this.f16334o = null;
            this.f16330k.put(0L);
            jkb0.m141854x();
        } else {
            this.f16334o = authData.userId;
            if (this.f16330k.get().longValue() == 0) {
                this.f16330k.put(Long.valueOf(qib0.f154693H.guessedCurrentServerTime()));
            }
            if (!qib0.f154714c0.signedIn_()) {
                ABManager.m29364y(2);
            }
            zvf0.m220375H(Oauth2AccessToken.KEY_UID, authData.userId);
        }
    }

    /* JADX INFO: renamed from: t2 */
    public C22306c<AccountTestGroup> m28358t2(AccountTestFactor accountTestFactor) {
        C20742vw c20742vw = AccountModule.f16038d;
        String str = accountTestFactor.channel;
        String str2 = "";
        if (qib0.f154717f0 != 0) {
            str2 = qib0.f154717f0 + "";
        }
        return c20742vw.m200254O(str, str2).compose(C4576b.m28376f());
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m28359u1(Throwable th) {
        this.f16334o = null;
        this.f16330k.put(0L);
        jkb0.m141854x();
    }

    /* JADX INFO: renamed from: u2 */
    public C22306c<roj0> m28360u2(String str, String str2, String str3, String str4) {
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
        return x14.m206656b().m206659d("/thirdparty/bind", jSONObject.toString()).doOnNext(new e30() { // from class: l.xc
            @Override // p149l.e30
            public final void call(Object obj) {
                C4575a.m28209S(jSONObject, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.yc
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f197379a.m28275D1((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ roj0 m28361v1(VerifyData verifyData, Token token) {
        this.f16331l.m108253l(AccountModule.f16038d.m200263v(token));
        m28368y2(verifyData);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: v2 */
    public C22306c<roj0> m28362v2(SignUpData signUpData, TokenSigninParam tokenSigninParam) {
        return AccountModule.f16038d.m200255P(tokenSigninParam).map(new w9j() { // from class: l.td
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f169487a.m28277E1((Token) obj);
            }
        }).flatMap(new w9j() { // from class: l.ud
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qib0.m174816f0();
            }
        });
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ roj0 m28363w1(Token token) {
        this.f16331l.m108253l(AccountModule.f16038d.m200263v(token));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: w2 */
    public C22306c<roj0> m28364w2(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientId", "100032");
            jSONObject.put("type", str);
        } catch (JSONException unused) {
        }
        return x14.m206656b().m206659d("/account/unbind", jSONObject.toString()).doOnNext(new e30() { // from class: l.ye
            @Override // p149l.e30
            public final void call(Object obj) {
                C4575a.m28208R(jSONObject, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.af
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f69133a.m28280F1((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ roj0 m28365x1(Token token) {
        this.f16331l.m108253l(AccountModule.f16038d.m200263v(token));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: x2 */
    public final void m28366x2(VerifyDataV2 verifyDataV2) {
        User userQueryMe = AccountModule.m28132H().queryMe();
        if (NullChecker.m81305c(userQueryMe, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            final User userMo223809clone = userQueryMe.mo223809clone();
            userMo223809clone.settings.email = verifyDataV2.email;
            f8c.m119878o().m119881B(new d30() { // from class: l.pf
                @Override // p149l.d30
                public final void call() {
                    qib0.f154722k0.f176631d.upsert(userMo223809clone);
                }
            });
        }
        AccountModule.m28132H().refreshUser(this.f16334o);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025 A[PHI: r1
      0x0025: PHI (r1v9 java.lang.String) = (r1v1 java.lang.String), (r1v2 java.lang.String), (r1v4 java.lang.String), (r1v6 java.lang.String) binds: [B:6:0x0023, B:9:0x002f, B:15:0x0047, B:24:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ roj0 m28367y1(SignInData signInData, Token token) {
        String str;
        this.f16331l.m108253l(AccountModule.f16038d.m200263v(token));
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
        if (NullChecker.m81303a(this.f16331l.mo108248b())) {
            eje.m116824h().m116835n(this.f16331l.mo108248b());
        }
        if (TEnum.equals(this.f16331l.mo108248b().signupStage, "finished")) {
            zvf0.m220371D("e_signin_success", "", vwb.m200311Y("signin_type", str), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, signInData.username));
        }
        qib0.m174815e1(VerifyReason.signin, new Object[0]);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: y2 */
    public final void m28368y2(VerifyData verifyData) {
        User userQueryMe = AccountModule.m28132H().queryMe();
        if (NullChecker.m81305c(userQueryMe, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            final User userMo223809clone = userQueryMe.mo223809clone();
            PhoneNumber phoneNumber = userMo223809clone.settings.phoneNumber;
            phoneNumber.number = verifyData.mobileNumber;
            phoneNumber.countryCode = verifyData.countryCode;
            f8c.m119878o().m119881B(new d30() { // from class: l.ed
                @Override // p149l.d30
                public final void call() {
                    qib0.f154722k0.f176631d.upsert(userMo223809clone);
                }
            });
        }
        AccountModule.m28132H().refreshUser(this.f16334o);
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ roj0 m28369z1(SignUpData signUpData, Token token) {
        this.f16331l.m108253l(AccountModule.f16038d.m200263v(token));
        j760 j760VarM200311Y = vwb.m200311Y("signup_source", m28329e1(signUpData));
        String str = this.f16327h.phoneNumber;
        if (str == null) {
            str = "";
        }
        zvf0.m220371D("e_signup_success", "", j760VarM200311Y, vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, str));
        qib0.m174815e1(AFInAppEventType.COMPLETE_REGISTRATION, new Object[0]);
        StringBuilder sb = new StringBuilder("af_complete_registration_");
        sb.append(NullChecker.m81303a(this.f16327h.gender) ? this.f16327h.gender.toString() : "unknown_");
        qib0.m174815e1(sb.toString(), new Object[0]);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: z2 */
    public String m28370z2() {
        if (NullChecker.m81303a(this.f16334o)) {
            return this.f16334o;
        }
        return m28312V0().mo108248b() == null ? "" : m28312V0().mo108248b().userId;
    }
}
