package com.p000p1.mobile.putong.account.api;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.api.C0001a;
import com.p000p1.mobile.putong.account.api.C0002b;
import com.p000p1.mobile.putong.account.data.AccountCommonData;
import com.p000p1.mobile.putong.account.data.AccountTestFactor;
import com.p000p1.mobile.putong.account.data.AccountTestGroup;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.account.data.CaptchaData;
import com.p000p1.mobile.putong.account.data.MatchCounterEnvelope;
import com.p000p1.mobile.putong.account.data.RegisterNameEnvelope;
import com.p000p1.mobile.putong.account.data.ThirdPartyData;
import com.p000p1.mobile.putong.account.p002ui.account.PhoneVerificationAct;
import com.p000p1.mobile.putong.account.p002ui.account.SignInAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.TokenSigninParam;
import com.p000p1.mobile.putong.account.p002ui.welcome.WelcomeAct;
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.app.TantanApp;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p1.mobile.account_core.reponse_data.Data;
import com.p1.mobile.account_core.reponse_data.H5Token;
import com.p1.mobile.account_core.reponse_data.RiskVerification;
import com.p1.mobile.account_core.reponse_data.Token;
import com.p1.mobile.account_core.request_data.RequestData;
import com.p1.mobile.account_core.request_data.ThirdPartySignupBaseData;
import com.p1.mobile.account_facebook.data.FacebookSignupData;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.AccountErrorResponse;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.ConfirmCodeResponse;
import com.p1.mobile.putong.data.DownloadDataCheck;
import com.p1.mobile.putong.data.EmailVerifyData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.FBPage;
import com.p1.mobile.putong.data.FBSignupData;
import com.p1.mobile.putong.data.FacebookEnvelope;
import com.p1.mobile.putong.data.FacebookInfoIdWithName;
import com.p1.mobile.putong.data.FacebookUserInfo;
import com.p1.mobile.putong.data.ForgetPasswordData;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.Physical;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.RememberUserInfo;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.SignInGrantType;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.SignupStage;
import com.p1.mobile.putong.data.StepSignupStage;
import com.p1.mobile.putong.data.Studies;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyDataV2;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.data.VerifyResult;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import l.d30;
import l.du2;
import l.e30;
import l.e51;
import l.epd0;
import l.f8c;
import l.hpd0;
import l.j760;
import l.jo0;
import l.kpd0;
import l.mkd0;
import l.mqi0;
import l.pp2;
import l.roj0;
import l.rpq;
import l.stc0;
import l.tan;
import l.uqd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w85;
import l.w9j;
import l.ww;
import l.x14;
import l.zpd0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.C0775gp;
import p006l.C0811hp;
import p006l.C1032mu;
import p006l.C1390vw;
import p006l.InterfaceC0993lu;
import p006l.bjp0;
import p006l.eje;
import p006l.gmi;
import p006l.ia20;
import p006l.jkb0;
import p006l.k0f0;
import p006l.ka20;
import p006l.la20;
import p006l.n6j0;
import p006l.qib0;
import p006l.rup0;
import p006l.xgw;
import p006l.xh5;
import p006l.zmi0;
import rx.Notification;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.api.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0001a extends C0002b {

    /* JADX INFO: renamed from: p */
    public static boolean f313p = false;

    /* JADX INFO: renamed from: q */
    public static final char[] f314q = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: g */
    public C1032mu f315g = new C1032mu();

    /* JADX INFO: renamed from: h */
    public SignUpData f316h = new SignUpData();

    /* JADX INFO: renamed from: i */
    public uqd0 f317i = new uqd0("pref_key_last_signup_source", "");

    /* JADX INFO: renamed from: j */
    public zpd0 f318j = new zpd0("pref_key_total_match_count", 17545527673L);

    /* JADX INFO: renamed from: k */
    public zpd0 f319k = new zpd0("pref_key_cur_signin_timestamp", 0L);

    /* JADX INFO: renamed from: l */
    public epd0 f320l = TantanApp.f1171e;

    /* JADX INFO: renamed from: m */
    public hpd0 f321m = new hpd0("is_show_migrate_guide", Boolean.FALSE);

    /* JADX INFO: renamed from: n */
    public boolean f322n = false;

    /* JADX INFO: renamed from: o */
    public String f323o = null;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.api.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f324a;

        static {
            int[] iArr = new int[AccountTempApi.SignUpType.values().length];
            f324a = iArr;
            try {
                iArr[AccountTempApi.SignUpType.phone.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f324a[AccountTempApi.SignUpType.wechat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f324a[AccountTempApi.SignUpType.qq.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f324a[AccountTempApi.SignUpType.chinaMobile.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f324a[AccountTempApi.SignUpType.chinaUnicom.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f324a[AccountTempApi.SignUpType.facebook.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f324a[AccountTempApi.SignUpType.google.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f324a[AccountTempApi.SignUpType.basic.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f324a[AccountTempApi.SignUpType.nameInfoSaved.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f324a[AccountTempApi.SignUpType.genderInfoSave.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f324a[AccountTempApi.SignUpType.birthInfoSaved.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f324a[AccountTempApi.SignUpType.media.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f324a[AccountTempApi.SignUpType.intlFriendPurposeSaved.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f324a[AccountTempApi.SignUpType.ethnicitySaved.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f324a[AccountTempApi.SignUpType.languageSaved.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ roj0 m84B0(Runnable runnable, roj0 roj0Var) {
        e51.G(runnable);
        tan.d();
        return roj0Var;
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ RiskVerification m86C0(VerifyDataV2 verifyDataV2) {
        return new RiskVerification();
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ roj0 m94I(roj0 roj0Var) {
        return roj0Var;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ roj0 m99N(SignUpData signUpData, roj0 roj0Var) {
        if (IntlCountryCodeController.m11l() && TEnum.equals(signUpData.gender, "male")) {
            User user = new User();
            Profile profile = new Profile();
            user.profile = profile;
            profile.studies = new Studies();
            Studies studies = user.profile.studies;
            studies.qualification = signUpData.qualificationType;
            studies.school = signUpData.school;
            qib0.f19788L.f1137f.put(user.toJson());
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
            qib0.f19788L.f1138g.put(user2.toJson());
        }
        return roj0Var;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m100O() {
        if (qib0.f19805c0.signedIn_()) {
            qib0.m22147Y0(false, WelcomeAct.class, true, false, false);
        } else {
            Application application = App.e;
            application.startActivity(WelcomeAct.m1131E2(application, true));
        }
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ SignUpData m102Q(FacebookEnvelope facebookEnvelope) {
        FacebookUserInfo facebookUserInfo = facebookEnvelope.data.user;
        SignUpData signUpData = new SignUpData();
        signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(App.e);
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
                CrashHelper.c(e);
            }
        }
        FBSignupData fBSignupData = new FBSignupData();
        FBPage fBPageNew_ = FBPage.new_();
        FacebookInfoIdWithName facebookInfoIdWithName = facebookUserInfo.hometown;
        fBPageNew_.id = facebookInfoIdWithName.id;
        fBPageNew_.name = facebookInfoIdWithName.name;
        fBSignupData.hometown = fBPageNew_;
        FBPage fBPageNew_2 = FBPage.new_();
        FacebookInfoIdWithName facebookInfoIdWithName2 = facebookUserInfo.location;
        fBPageNew_2.id = facebookInfoIdWithName2.id;
        fBPageNew_2.name = facebookInfoIdWithName2.name;
        fBSignupData.location = fBPageNew_2;
        signUpData.fbSignupData = fBSignupData;
        signUpData.profileMineType = "image/jpeg";
        signUpData.signUpType = AccountTempApi.SignUpType.facebook;
        signUpData.profilePath = facebookUserInfo.picture.data.url;
        return signUpData;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m103R(JSONObject jSONObject, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            ww.b("AccountApi/thirdparty-unbind", jSONObject.toString());
        }
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m104S(JSONObject jSONObject, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            ww.b("AccountApi/thirdparty-bind", jSONObject.toString());
        }
    }

    /* JADX INFO: renamed from: S0 */
    public static void m105S0(RequestData requestData, boolean z) {
        m107T0(requestData, z, "");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: JSONException -> 0x003f, TRY_LEAVE, TryCatch #0 {JSONException -> 0x003f, blocks: (B:4:0x0007, B:6:0x0019, B:7:0x001e, B:9:0x0024, B:10:0x0029, B:12:0x003a), top: B:16:0x0007 }] */
    /* JADX INFO: renamed from: T0 */
    public static void m107T0(RequestData requestData, boolean z, String str) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                String strM17885g = k0f0.m17882f().m17885g();
                String strM22991K3 = rup0.m22991K3();
                if (!TextUtils.isEmpty(strM17885g)) {
                    jSONObject.put("mmuid", strM17885g);
                }
                if (!TextUtils.isEmpty(strM22991K3)) {
                    jSONObject.put("inviteCode", strM22991K3);
                }
                jSONObject.put("browserUA", bjp0.getDefaultUserAgent(App.e));
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("thirdPartyEmail", str);
                }
            } catch (JSONException unused) {
            }
        } else {
            jSONObject.put("browserUA", bjp0.getDefaultUserAgent(App.e));
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("thirdPartyEmail", str);
            }
        }
        requestData.addExtraData("extra", jSONObject.toString());
    }

    /* JADX INFO: renamed from: U0 */
    public static c<roj0> m109U0(ForgetPasswordData forgetPasswordData, final Runnable runnable) {
        return qib0.f19785I.now(AccountModule.f26c.m205T1(forgetPasswordData).compose(mkd0.Q()).flatMap(new w9j() { // from class: l.jf
            public final Object call(Object obj) {
                return C0001a.m155v0(runnable, (roj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.kf
            public final Object call(Object obj) {
                return C0001a.m135m((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z1 */
    public static void m115Z1() {
        f313p = false;
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ roj0 m119d0(Runnable runnable, roj0 roj0Var) {
        e51.G(runnable);
        return roj0Var;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ roj0 m122g(roj0 roj0Var) {
        return roj0Var;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ c m124h(User user) {
        f313p = C0811hp.m16304d(user);
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ roj0 m126i(StepSignupStage stepSignupStage, Envelope envelope) {
        if (NullChecker.a(stepSignupStage)) {
            eje.m14574h().m14579f(SignupStage.get("verified"), stepSignupStage);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: i1 */
    public static boolean m128i1() {
        return f313p;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ c m135m(User user) {
        if (TEnum.equals(user.signupStage, "finished")) {
            qib0.m22160f0();
        }
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ stc0 m139o(VerifyData verifyData, boolean z) {
        String strM266a;
        stc0.a aVarBasic;
        if (TEnum.equals(verifyData.action, "signup_signin")) {
            strM266a = C0002b.m266a("/confirmation-code/verify");
            aVarBasic = qib0.f19784H.basic();
        } else if (TEnum.equals(verifyData.action, "change-phone")) {
            strM266a = C0002b.m266a("/change-phone");
            aVarBasic = qib0.f19784H.auth();
        } else if (TEnum.equals(verifyData.action, "bind_mobile")) {
            strM266a = C0002b.m266a("/bind-phone".concat(z ? "&forceLogin=true" : ""));
            aVarBasic = qib0.f19784H.auth();
        } else {
            if (TEnum.equals(verifyData.action, "ban-appeal")) {
                return qib0.f19784H.auth().q(C0002b.m268c("/confirmation-code/verify")).l(utc0.create(Network.JSON, VerifyDataV2.v1ConvertV2(verifyData).toJson())).b();
            }
            strM266a = C0002b.m266a("/verify-confirmation-code");
            aVarBasic = qib0.f19784H.basic();
        }
        return aVarBasic.q(strM266a).l(utc0.create(Network.JSON, verifyData.toJson())).b();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ roj0 m143q(VerifyData verifyData, VerifyResult verifyResult) {
        if ("signup".equals(verifyResult.action)) {
            verifyData.action = VerifyReason.get("signup");
        }
        if ("signin".equals(verifyResult.action)) {
            verifyData.action = VerifyReason.get("signin");
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ stc0 m144q0(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("clientId", "100032");
        } catch (Exception unused) {
        }
        return qib0.f19784H.auth().q(C0002b.m267b("/event/report")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: q2 */
    public static c<roj0> m145q2(final SignUpData signUpData, final Runnable runnable) {
        return qib0.f19785I.now(gmi.m15894c().materialize().take(1).map(new w9j() { // from class: l.lf
            public final Object call(Object obj) {
                return C0001a.m153u0(signUpData, (Notification) obj);
            }
        }).flatMap(new w9j() { // from class: l.uf
            public final Object call(Object obj) {
                return AccountModule.f26c.m208V1((SignUpData) obj).map(new w9j() { // from class: l.ld
                    public final Object call(Object obj2) {
                        return C0001a.m122g((roj0) obj2);
                    }
                }).compose(mkd0.Q()).map(new w9j() { // from class: l.md
                    public final Object call(Object obj2) {
                        return C0001a.m84B0(runnable, (roj0) obj2);
                    }
                }).flatMap(new w9j() { // from class: l.nd
                    public final Object call(Object obj2) {
                        return qib0.m22162g0(true);
                    }
                }).map(new w9j() { // from class: l.od
                    public final Object call(Object obj2) {
                        return C0001a.m99N(signUpData, (roj0) obj2);
                    }
                }).observeOn(jo0.a());
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ SignUpData m153u0(SignUpData signUpData, Notification notification) {
        if (notification.k()) {
            signUpData.firebaseId = (String) notification.f();
        }
        return signUpData;
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ c m155v0(Runnable runnable, roj0 roj0Var) {
        e51.G(runnable);
        return AccountModule.f26c.m213Y0();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ c m156w(final User user) {
        eje.m14574h().m14586o(user);
        if (user.finishedStages.contains(StepSignupStage.get("gender-saved"))) {
            AccountModule.f26c.m227f2(user.gender);
        }
        if (user.finishedStages.contains(StepSignupStage.get("birth-saved")) && NullChecker.c(user.settings, "account", CrashHelper.ReportLevel.p9)) {
            AccountModule.f26c.m225e2(user.settings.birthdate.doubleValue());
            tan.e(user);
        }
        if (!TEnum.equals(user.signupStage, "finished") && !TEnum.equals(user.signupStage, "unknown_") && NullChecker.c(user.settings, "account", CrashHelper.ReportLevel.p9)) {
            C0001a c0001a = AccountModule.f26c;
            PhoneNumber phoneNumber = user.settings.phoneNumber;
            c0001a.m229g2(phoneNumber.number, phoneNumber.countryCode);
        }
        w85.INSTANCE.k(user.publicId);
        return TEnum.equals(user.signupStage, "finished") ? qib0.m22162g0(true).map(new w9j() { // from class: l.fe
            public final Object call(Object obj) {
                return C0001a.m157w0(user, (roj0) obj);
            }
        }).observeOn(Schedulers.io()) : c.just(user);
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ User m157w0(User user, roj0 roj0Var) {
        return user;
    }

    /* JADX INFO: renamed from: A1 */
    public final /* synthetic */ roj0 m164A1(SignUpData signUpData, Boolean bool) {
        m217a2(signUpData);
        w85.INSTANCE.k((String) null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: A2 */
    public c<roj0> m165A2(final VerifyData verifyData) {
        final boolean z;
        if (TEnum.equals(verifyData.action, "bind_mobile_force_login")) {
            verifyData.action = VerifyReason.get("bind_mobile");
            z = true;
        } else {
            z = false;
        }
        if (TEnum.equals(verifyData.action, "ban-appeal")) {
            return m179G2(new v9j() { // from class: l.oe
                public final Object call() {
                    return C0001a.m139o(verifyData, z);
                }
            }, verifyData);
        }
        if (!TEnum.equals(verifyData.action, "bind_mobile")) {
            return TEnum.equals(verifyData.action, "change-phone") ? AccountModule.f27d.m25942t(verifyData).map(new w9j() { // from class: l.de
                public final Object call(Object obj) {
                    return this.f10300a.m181H1(verifyData, (Token) obj);
                }
            }).compose(mkd0.C()) : AccountModule.f27d.m25938R(verifyData).compose(C0002b.m271f());
        }
        verifyData.forceLogin = z;
        return AccountModule.f27d.m25941s(verifyData).map(new w9j() { // from class: l.sd
            public final Object call(Object obj) {
                return this.f21261a.m178G1(verifyData, (Token) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ roj0 m166B1(SignUpData signUpData, Token token) {
        if (!TextUtils.isEmpty(token.value)) {
            this.f320l.l(AccountModule.f27d.m25944v(token));
            n6j0.m19691d("e_early_signup_success", "", n6j0.C1041a.m19696f("signup_source", m215Z0(signUpData)), n6j0.C1041a.m19696f("phone_num", TextUtils.isEmpty(signUpData.phoneNumber) ? "" : signUpData.phoneNumber), n6j0.C1041a.m19696f("user_id", token.userId));
        }
        m217a2(signUpData);
        return roj0.a;
    }

    /* JADX INFO: renamed from: B2 */
    public c<roj0> m167B2(VerifyData verifyData) {
        return AccountModule.f27d.m25941s(verifyData).map(new w9j() { // from class: l.tf
            public final Object call(Object obj) {
                return this.f22076a.m184I1((Token) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ c m168C1(roj0 roj0Var) {
        eje.m14574h().m14585n((AuthData) this.f320l.b());
        if (C0775gp.m15899f() && TEnum.equals(((AuthData) this.f320l.b()).signupStage, "verified")) {
            return m213Y0().flatMap(new w9j() { // from class: l.re
                public final Object call(Object obj) {
                    return C0001a.m124h((User) obj);
                }
            });
        }
        if (TEnum.equals(((AuthData) this.f320l.b()).signupStage, "finished") || TEnum.equals(((AuthData) this.f320l.b()).signupStage, "unknown_")) {
            return qib0.m22160f0();
        }
        if (TEnum.equals(((AuthData) this.f320l.b()).signupStage, "verified") && !((AuthData) this.f320l.b()).finishedStages.contains(StepSignupStage.get("picture-saved"))) {
            return m213Y0().flatMap(new w9j() { // from class: l.se
                public final Object call(Object obj) {
                    return c.just(roj0.a);
                }
            });
        }
        qib0.f19793Q.m18519U();
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: C2 */
    public c<roj0> m169C2(ThirdPartyData thirdPartyData) {
        return AccountModule.f27d.f24490b.m24196d(thirdPartyData.thirdPartyId, thirdPartyData.thirdPartyToken);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ roj0 m170D1(AccountEnvelop accountEnvelop) {
        this.f320l.l(AccountModule.f27d.m25944v(accountEnvelop.data.token));
        return roj0.a;
    }

    /* JADX INFO: renamed from: D2 */
    public c<roj0> m171D2(ThirdPartyData thirdPartyData) {
        return AccountModule.f27d.f24493e.m19645c(thirdPartyData.thirdPartyId, thirdPartyData.thirdPartyToken);
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ roj0 m172E1(Token token) {
        if (!TextUtils.isEmpty(token.value)) {
            this.f320l.l(AccountModule.f27d.m25944v(token));
        }
        eje.m14574h().m14585n((AuthData) this.f320l.b());
        return roj0.a;
    }

    /* JADX INFO: renamed from: E2 */
    public c<AccountErrorResponse> m173E2(VerifyData verifyData) {
        return AccountModule.f27d.m25940T(verifyData).compose(C0002b.m271f());
    }

    /* JADX INFO: renamed from: F0 */
    public c<AuthData> m174F0() {
        return AccountModule.f27d.m25923C().compose(C0002b.m271f()).map(new w9j() { // from class: l.wc
            public final Object call(Object obj) {
                return AccountModule.f27d.m25946x((H5Token) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ roj0 m175F1(AccountEnvelop accountEnvelop) {
        this.f320l.l(AccountModule.f27d.m25944v(accountEnvelop.data.token));
        return roj0.a;
    }

    /* JADX INFO: renamed from: F2 */
    public c<ConfirmCodeResponse> m176F2(final VerifyData verifyData) {
        final v9j v9jVar = new v9j() { // from class: l.te
            public final Object call() {
                return qib0.f19784H.basic().q(C0002b.m266a("/confirmation-code/verify")).l(utc0.create(Network.JSON, verifyData.toJson())).b();
            }
        };
        return scheduled("verifyNumberFixHack", 0, new v9j() { // from class: l.ue
            public final Object call() {
                return new ka20(v9jVar, ConfirmCodeResponse.JSON_ADAPTER).compose(C0002b.m271f());
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public String m177G0() {
        return this.f320l.b() == null ? "" : ((AuthData) this.f320l.b()).accessToken;
    }

    /* JADX INFO: renamed from: G1 */
    public final /* synthetic */ roj0 m178G1(VerifyData verifyData, Token token) {
        this.f320l.l(AccountModule.f27d.m25944v(token));
        m263y2(verifyData);
        return roj0.a;
    }

    /* JADX INFO: renamed from: G2 */
    public final c<roj0> m179G2(final v9j<stc0> v9jVar, final VerifyData verifyData) {
        if (TEnum.equals(verifyData.action, "change-phone") || TEnum.equals(verifyData.action, "bind_mobile") || TEnum.equals(verifyData.action, "bind_mobile_oneclick")) {
            return scheduled("verifyPhone", -1, new v9j() { // from class: l.bd
                public final Object call() {
                    return this.f8818a.m191L1(v9jVar, verifyData);
                }
            });
        }
        return TEnum.equals(verifyData.action, "signup_signin") ? scheduled("signup_signin", -1, new v9j() { // from class: l.cd
            public final Object call() {
                return new ka20(v9jVar, VerifyResult.JSON_ADAPTER).map(new w9j() { // from class: l.fd
                    public final Object call(Object obj) {
                        return C0001a.m143q(verifyData, (VerifyResult) obj);
                    }
                }).compose(C0002b.m271f());
            }
        }) : now(new ka20(v9jVar, JsonAdapter.UNIT_ADAPTER).compose(C0002b.m271f()));
    }

    /* JADX INFO: renamed from: H0 */
    public c<roj0> m180H0(String str, String str2) {
        rpq.b().e(AccountCommonData.JSON_ADAPTER, (pp2) null);
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientID", "100032");
            jSONObject.put("type", "chars");
            jSONObject.put("token", str);
            jSONObject.put("value", str2);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return qib0.f19785I.now("captcha_verify", ia20.m16569c(new v9j() { // from class: l.qf
            public final Object call() {
                return qib0.f19784H.basic().q(C0002b.m267b("/captcha/verify")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }, Envelope.JSON_ADAPTER).map(new w9j() { // from class: l.rf
            public final Object call(Object obj) {
                return roj0.a;
            }
        }));
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ roj0 m181H1(VerifyData verifyData, Token token) {
        this.f320l.l(AccountModule.f27d.m25944v(token));
        m263y2(verifyData);
        return roj0.a;
    }

    /* JADX INFO: renamed from: H2 */
    public c<roj0> m182H2() {
        return now("void_request", new ka20(new v9j() { // from class: l.jd
            public final Object call() {
                return qib0.f19784H.basic().a("Client-State", "background").q(C0002b.m268c("/void")).f().b();
            }
        }, AccountTestGroup.JSON_ADAPTER).compose(C0002b.m271f()).map(new w9j() { // from class: l.kd
            public final Object call(Object obj) {
                return roj0.a;
            }
        }), false);
    }

    /* JADX INFO: renamed from: I0 */
    public c<DownloadDataCheck> m183I0() {
        return AccountModule.f27d.m25947y().compose(C0002b.m271f());
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ roj0 m184I1(Token token) {
        this.f320l.l(AccountModule.f27d.m25944v(token));
        return roj0.a;
    }

    /* JADX INFO: renamed from: I2 */
    public uqd0 m185I2() {
        return new uqd0("wechat_nickname_saved_" + AccountModule.f26c.m265z2(), "", false);
    }

    /* JADX INFO: renamed from: J0 */
    public void m186J0() {
        e51.M(new Runnable() { // from class: l.hd
            @Override // java.lang.Runnable
            public final void run() {
                C0001a.m100O();
            }
        });
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ roj0 m187J1(AuthData authData) {
        if (authData == null) {
            CrashHelper.c(new Exception("auth == null in AccountApi on line 542"));
        }
        this.f320l.l(authData);
        return roj0.a;
    }

    /* JADX INFO: renamed from: K0 */
    public c<AccountErrorResponse> m188K0(EmailVerifyData emailVerifyData) {
        C1390vw c1390vw = AccountModule.f27d;
        String str = emailVerifyData.email;
        String str2 = "";
        if (qib0.f19808f0 != 0) {
            str2 = qib0.f19808f0 + "";
        }
        return c1390vw.m25948z(str, str2).compose(C0002b.m271f());
    }

    /* JADX INFO: renamed from: K1 */
    public final /* synthetic */ void m189K1(VerifyData verifyData, roj0 roj0Var) {
        if (TEnum.equals(verifyData.action, "change-phone") || TEnum.equals(verifyData.action, "bind_mobile")) {
            m263y2(verifyData);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public c<roj0> m190L0(final AccountTempApi.SignUpType signUpType) {
        return AccountModule.f26c.m213Y0().flatMap(new w9j() { // from class: l.ff
            public final Object call(Object obj) {
                return this.f12680a.m235k1(signUpType, (User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ c m191L1(v9j v9jVar, final VerifyData verifyData) {
        return new ka20(v9jVar, AuthData.JSON_ADAPTER).map(new w9j() { // from class: l.ae
            public final Object call(Object obj) {
                return this.f8227a.m187J1((AuthData) obj);
            }
        }).doOnNext(new e30() { // from class: l.be
            public final void call(Object obj) {
                this.f8839a.m189K1(verifyData, (roj0) obj);
            }
        }).compose(C0002b.m271f());
    }

    /* JADX INFO: renamed from: M0 */
    public c<roj0> m192M0(final VerifyDataV2 verifyDataV2) {
        if (TEnum.equals(verifyDataV2.action, "bind-email")) {
            return AccountModule.f27d.f24494f.m14243x(verifyDataV2).map(new w9j() { // from class: l.gf
                public final Object call(Object obj) {
                    return this.f13285a.m237l1(verifyDataV2, (Token) obj);
                }
            }).compose(mkd0.C());
        }
        return TEnum.equals(verifyDataV2.action, "change-email") ? AccountModule.f27d.f24494f.m14244y(verifyDataV2).map(new w9j() { // from class: l.hf
            public final Object call(Object obj) {
                return this.f13855a.m239m1(verifyDataV2, (Token) obj);
            }
        }).compose(mkd0.C()) : AccountModule.f27d.m25939S(verifyDataV2).compose(C0002b.m271f());
    }

    /* JADX INFO: renamed from: M1 */
    public InterfaceC0993lu m193M1() {
        return this.f315g.m19507a();
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m194N0(SignUpData signUpData) {
        AccountTempApi.SignUpType signUpType = signUpData.signUpType;
        return signUpType == AccountTempApi.SignUpType.basic || signUpType == AccountTempApi.SignUpType.nameInfoSaved || signUpType == AccountTempApi.SignUpType.genderInfoSave || signUpType == AccountTempApi.SignUpType.birthInfoSaved || signUpType == AccountTempApi.SignUpType.intlFriendPurposeSaved || signUpType == AccountTempApi.SignUpType.ethnicitySaved || signUpType == AccountTempApi.SignUpType.languageSaved;
    }

    /* JADX INFO: renamed from: N1 */
    public uqd0 m195N1() {
        return new uqd0("more_gender_saved_" + AccountModule.f26c.m265z2(), "", false);
    }

    /* JADX INFO: renamed from: O0 */
    public kpd0 m196O0() {
        return new kpd0("facebook_birthdate_saved_" + AccountModule.f26c.m265z2(), 0.0d, false);
    }

    /* JADX INFO: renamed from: O1 */
    public hpd0 m197O1() {
        return new hpd0("more_gender_show_profile_saved_" + AccountModule.f26c.m265z2(), Boolean.FALSE, false);
    }

    /* JADX INFO: renamed from: P0 */
    public uqd0 m198P0() {
        return new uqd0("facebook_gender_saved_" + AccountModule.f26c.m265z2(), "", false);
    }

    /* JADX INFO: renamed from: P1 */
    public c<roj0> m199P1(String str, String str2, String str3, SignInGrantType signInGrantType) {
        final VerifyData verifyData = new VerifyData();
        verifyData.action = VerifyReason.get("bind_mobile_oneclick");
        verifyData.mobileNumber = "";
        return AccountModule.f27d.f24489a.m12624b(str, str2, str3, signInGrantType).map(new w9j() { // from class: l.ze
            public final Object call(Object obj) {
                return this.f28718a.m256v1(verifyData, (Token) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: Q0 */
    public uqd0 m200Q0() {
        return new uqd0("facebook_nickname_saved_" + AccountModule.f26c.m265z2(), "", false);
    }

    /* JADX INFO: renamed from: Q1 */
    public c<roj0> m201Q1(String str, String str2, String str3, SignInGrantType signInGrantType) {
        VerifyData verifyData = new VerifyData();
        verifyData.action = VerifyReason.get("bind_mobile_oneclick");
        verifyData.mobileNumber = "";
        return AccountModule.f27d.f24489a.m12624b(str, str2, str3, signInGrantType).map(new w9j() { // from class: l.sf
            public final Object call(Object obj) {
                return this.f21283a.m258w1((Token) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: R0 */
    public uqd0 m202R0() {
        return new uqd0("facebook_profile_saved_" + AccountModule.f26c.m265z2(), "", false);
    }

    /* JADX INFO: renamed from: R1 */
    public Intent m203R1(Context context, VerifyReason verifyReason) {
        return PhoneVerificationAct.m281Y1(context, verifyReason);
    }

    /* JADX INFO: renamed from: S1 */
    public Intent m204S1(Context context, VerifyReason verifyReason, String str) {
        return PhoneVerificationAct.m283a2(context, verifyReason, str);
    }

    /* JADX INFO: renamed from: T1 */
    public c<roj0> m205T1(ForgetPasswordData forgetPasswordData) {
        return AccountModule.f27d.m25927G(forgetPasswordData).map(new w9j() { // from class: l.ce
            public final Object call(Object obj) {
                return this.f9604a.m260x1((Token) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U1 */
    public c<roj0> m206U1(final SignInData signInData, RememberUserInfo rememberUserInfo, boolean z) {
        c<Token> cVarM28540c;
        if (TEnum.equals(signInData.grantType, "unknown_")) {
            RememberUserInfo rememberUserInfo2 = (RememberUserInfo) qib0.f19788L.f1135d.b();
            if (rememberUserInfo2 != null || rememberUserInfo == null) {
                rememberUserInfo = rememberUserInfo2;
            }
            if (!NullChecker.a(rememberUserInfo)) {
                return c.error(new IllegalStateException("No remembered login found"));
            }
            this.f320l.l(rememberUserInfo.auth);
            return c.just(roj0.a);
        }
        zmi0.m28732k(null);
        if (TEnum.equals(signInData.grantType, "cosmos")) {
            cVarM28540c = AccountModule.f27d.f24489a.m12627e(signInData, z);
        } else if (TEnum.equals(signInData.grantType, "wechat")) {
            cVarM28540c = AccountModule.f27d.f24491c.m28736h(signInData, z, false);
        } else if (TEnum.equals(signInData.grantType, "qq")) {
            cVarM28540c = AccountModule.f27d.f24491c.m28736h(signInData, z, true);
        } else if (TEnum.equals(signInData.grantType, "facebook")) {
            cVarM28540c = AccountModule.f27d.f24490b.m24194b(signInData, z);
        } else if (TEnum.equals(signInData.grantType, "google")) {
            cVarM28540c = AccountModule.f27d.f24493e.m19644b(signInData, z);
        } else if (TEnum.equals(signInData.grantType, "email")) {
            cVarM28540c = AccountModule.f27d.f24494f.m14237B(signInData, z);
        } else {
            cVarM28540c = TEnum.equals(signInData.grantType, "tantan-token") ? AccountModule.f27d.f24495g.m28540c(signInData) : AccountModule.f27d.m25934N(signInData, z);
        }
        return cVarM28540c.map(new w9j() { // from class: l.ee
            public final Object call(Object obj) {
                return this.f11094a.m262y1(signInData, (Token) obj);
            }
        }).compose(mkd0.Q());
    }

    /* JADX INFO: renamed from: V0 */
    public epd0 m207V0() {
        return this.f320l;
    }

    /* JADX INFO: renamed from: V1 */
    public c<roj0> m208V1(final SignUpData signUpData) {
        c<Token> cVarM24195c;
        rpq.b().e(CommonData.JSON_ADAPTER, (pp2) null);
        zmi0.m28732k(null);
        AccountTempApi.SignUpType signUpType = signUpData.signUpType;
        if (signUpType == AccountTempApi.SignUpType.cosmos) {
            cVarM24195c = AccountModule.f27d.f24489a.m12628f(signUpData);
        } else if (signUpType == AccountTempApi.SignUpType.wechat) {
            cVarM24195c = AccountModule.f27d.f24491c.m28737i(signUpData);
        } else {
            cVarM24195c = signUpType == AccountTempApi.SignUpType.facebook ? AccountModule.f27d.f24490b.m24195c(signUpData) : AccountModule.f27d.m25930J(signUpData);
        }
        return cVarM24195c.map(new w9j() { // from class: l.me
            public final Object call(Object obj) {
                return this.f16930a.m264z1(signUpData, (Token) obj);
            }
        }).compose(mkd0.Q());
    }

    /* JADX INFO: renamed from: W0 */
    public c<CaptchaData> m209W0() {
        rpq.b().e(AccountCommonData.JSON_ADAPTER, (pp2) null);
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientID", "100032");
            jSONObject.put("type", "chars");
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return qib0.f19785I.now("get_captcha", ia20.m16569c(new v9j() { // from class: l.ne
            public final Object call() {
                return qib0.f19784H.basic().q(C0002b.m267b("/captcha/generate")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }, Envelope.JSON_ADAPTER).doOnNext(new e30() { // from class: l.pe
            public final void call(Object obj) {
                NullChecker.c(((Envelope) obj).getModuleData(AccountCommonData.class), "account", CrashHelper.ReportLevel.p9);
            }
        }).map(new w9j() { // from class: l.qe
            public final Object call(Object obj) {
                return ((AccountCommonData) ((Envelope) obj).getModuleData(AccountCommonData.class)).captchaData;
            }
        }));
    }

    /* JADX INFO: renamed from: W1 */
    public c<roj0> m210W1(final SignUpData signUpData, SignInGrantType signInGrantType) {
        c<Token> cVarM25933M;
        zmi0.m28732k(null);
        AccountTempApi.SignUpType signUpType = signUpData.signUpType;
        if (signUpType == AccountTempApi.SignUpType.cosmos) {
            cVarM25933M = AccountModule.f27d.f24489a.m12629g(signUpData, signInGrantType);
        } else if (signUpType == AccountTempApi.SignUpType.wechat) {
            cVarM25933M = AccountModule.f27d.f24491c.m28738j(signUpData, false);
        } else if (signUpType == AccountTempApi.SignUpType.qq) {
            cVarM25933M = AccountModule.f27d.f24491c.m28738j(signUpData, true);
        } else if (signUpType == AccountTempApi.SignUpType.facebook || signUpType == AccountTempApi.SignUpType.google) {
            cVarM25933M = AccountModule.f27d.f24491c.m28738j(signUpData, false);
        } else if (signUpType == AccountTempApi.SignUpType.email && !TextUtils.equals(signUpData.action, "ttt-signup")) {
            cVarM25933M = AccountModule.f27d.f24494f.m14238C(signUpData);
        } else {
            if (m194N0(signUpData) || signUpData.signUpType == AccountTempApi.SignUpType.media) {
                return AccountModule.f27d.m25931K(signUpData).map(new w9j() { // from class: l.mf
                    public final Object call(Object obj) {
                        return this.f16945a.m164A1(signUpData, (Boolean) obj);
                    }
                });
            }
            cVarM25933M = TextUtils.equals(signUpData.action, "ttt-signup") ? AccountModule.f27d.m25933M(signUpData) : AccountModule.f27d.m25932L(signUpData);
        }
        return cVarM25933M.map(new w9j() { // from class: l.nf
            public final Object call(Object obj) {
                return this.f17636a.m166B1(signUpData, (Token) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X0 */
    public c<MatchCounterEnvelope> m211X0() {
        return scheduled("get_match_counter", 0, new v9j() { // from class: l.dd
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.vd
                    public final Object call() {
                        return qib0.f19784H.basic().q(C0002b.m269d("/total-counters")).f().b();
                    }
                }, MatchCounterEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: X1 */
    public void m212X1(String str) {
        AccountModule.f27d.m25926F(str).compose(C0002b.m271f());
    }

    /* JADX INFO: renamed from: Y0 */
    public c<User> m213Y0() {
        rpq.b().e(CommonData.JSON_ADAPTER, (pp2) null);
        return scheduled("users/" + m265z2(), 0, new v9j() { // from class: l.wf
            public final Object call() {
                return this.f25128a.m245p1();
            }
        });
    }

    /* JADX INFO: renamed from: Y1 */
    public c<SignUpData> m214Y1(String str, String str2) {
        final FacebookSignupData facebookSignupData = new FacebookSignupData();
        ((ThirdPartySignupBaseData) facebookSignupData).thirdPartyToken = str2;
        ((ThirdPartySignupBaseData) facebookSignupData).thirdPartyId = str;
        return scheduled("facebook_userinfo", 0, new v9j() { // from class: l.je
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.bf
                    public final Object call() {
                        return qib0.f19784H.basic().q(C0002b.m267b("/thirdparty/info")).l(utc0.create(Network.JSON, facebookSignupData.toJson())).b();
                    }
                }, FacebookEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.ke
            public final Object call(Object obj) {
                return C0001a.m102Q((FacebookEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z0 */
    public String m215Z0(SignUpData signUpData) {
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
    public c<RegisterNameEnvelope> m216a1() {
        return scheduled("get_register_name", 0, new v9j() { // from class: l.xe
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.of
                    public final Object call() {
                        return qib0.f19784H.authBeforeSignUp().q(C0002b.m268c("/profile/names")).f().b();
                    }
                }, RegisterNameEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: a2 */
    public final void m217a2(SignUpData signUpData) {
        switch (a.f324a[signUpData.signUpType.ordinal()]) {
            case 1:
            case 2:
            case CameraSticker.STATE_COMPLETE /* 3 */:
            case CameraSticker.STATE_ERROR /* 4 */:
            case 5:
            case 6:
            case 7:
                eje.m14574h().m14579f(SignupStage.get("verified"), new StepSignupStage[0]);
                break;
            case 8:
                eje.m14574h().m14579f(SignupStage.get("verified"), StepSignupStage.get("birth-saved"), StepSignupStage.get("name-saved"), StepSignupStage.get("gender-saved"));
                break;
            case 9:
                eje.m14574h().m14579f(SignupStage.get("verified"), StepSignupStage.get("name-saved"));
                break;
            case 10:
                eje.m14574h().m14579f(SignupStage.get("verified"), StepSignupStage.get("gender-saved"));
                break;
            case 11:
                eje.m14574h().m14579f(SignupStage.get("verified"), StepSignupStage.get("birth-saved"));
                break;
            case 12:
                j760 j760VarY = vwb.Y("signup_source", m222d1());
                String str = this.f316h.phoneNumber;
                if (str == null) {
                    str = "";
                }
                zvf0.D("e_signup_success", "", new j760[]{j760VarY, vwb.Y("phone_num", str)});
                eje.m14574h().m14579f(SignupStage.get("finished"), StepSignupStage.get("picture-saved"));
                break;
            case 13:
                eje.m14574h().m14579f(SignupStage.get("verified"), StepSignupStage.get("intlFriendPurpose-saved"));
                break;
            case 14:
                eje.m14574h().m14579f(SignupStage.get("verified"), StepSignupStage.get("ethnicity-saved"));
                break;
            case 15:
                eje.m14574h().m14579f(SignupStage.get("verified"), StepSignupStage.get("language-saved"));
                break;
        }
    }

    /* JADX INFO: renamed from: b1 */
    public c<Envelope> m218b1(final String str) {
        return scheduled("sign_in_report", -1, new v9j() { // from class: l.ge
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.ef
                    public final Object call() {
                        return C0001a.m144q0(str);
                    }
                }, Envelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: b2 */
    public c<RiskVerification> m219b2(final VerifyData verifyData) {
        Objects.toString(verifyData.action);
        return !TEnum.equals(verifyData.action, "ban-appeal") ? AccountModule.f27d.m25928H(verifyData).compose(C0002b.m271f()) : now(new ka20(new v9j() { // from class: l.zc
            public final Object call() {
                return qib0.f19784H.auth().q(C0002b.m268c("/confirmation-code/send")).l(utc0.create(Network.JSON, VerifyDataV2.v1ConvertV2(verifyData).toJson())).b();
            }
        }, VerifyDataV2.JSON_ADAPTER).compose(C0002b.m271f())).map(new w9j() { // from class: l.ad
            public final Object call(Object obj) {
                return C0001a.m86C0((VerifyDataV2) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c1 */
    public SignUpData m220c1() {
        return this.f316h;
    }

    /* JADX INFO: renamed from: c2 */
    public void m221c2(int i) {
        this.f316h.age = i;
    }

    /* JADX INFO: renamed from: d1 */
    public String m222d1() {
        String strM224e1 = m224e1(this.f316h);
        return TextUtils.isEmpty(strM224e1) ? (String) this.f317i.get() : strM224e1;
    }

    /* JADX INFO: renamed from: d2 */
    public void m223d2(AuthData authData) {
        this.f320l.l(authData);
    }

    /* JADX INFO: renamed from: e1 */
    public String m224e1(SignUpData signUpData) {
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
            this.f317i.put(str);
        }
        return str;
    }

    /* JADX INFO: renamed from: e2 */
    public void m225e2(double d) {
        this.f316h.birthdate = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: f1 */
    public c<User> m226f1() {
        return scheduled("users/" + m265z2(), 0, new v9j() { // from class: l.le
            public final Object call() {
                return this.f16350a.m250s1();
            }
        });
    }

    /* JADX INFO: renamed from: f2 */
    public void m227f2(Gender gender) {
        this.f316h.gender = gender;
    }

    /* JADX INFO: renamed from: g1 */
    public void m228g1() {
        this.f320l.c().subscribe(mkd0.H(new e30() { // from class: l.cf
            public final void call(Object obj) {
                this.f9615a.m252t1((AuthData) obj);
            }
        }, new e30() { // from class: l.df
            public final void call(Object obj) {
                this.f10362a.m254u1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g2 */
    public void m229g2(String str, int i) {
        SignUpData signUpData = this.f316h;
        signUpData.phoneNumber = str;
        signUpData.countryCode = i;
    }

    /* JADX INFO: renamed from: h1 */
    public c<roj0> m230h1(Profile profile, final StepSignupStage stepSignupStage) {
        final JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject(profile.toJson());
            jSONObject2.remove("onlyShowAboutMeInside");
            jSONObject.put("profile", jSONObject2);
        } catch (JSONException unused) {
        }
        return scheduled("intl_patch_profile", -1, new v9j() { // from class: l.vf
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.gd
                    public final Object call() {
                        return qib0.f19784H.auth().q(xh5.m27261t("/me?method=patch")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                }).map(new w9j() { // from class: l.id
                    public final Object call(Object obj) {
                        return C0001a.m126i(stepSignupStage, (Envelope) obj);
                    }
                }).observeOn(jo0.a());
            }
        });
    }

    /* JADX INFO: renamed from: h2 */
    public void m231h2(String str) {
        this.f316h.appsFlyerUID = str;
    }

    /* JADX INFO: renamed from: i2 */
    public void m232i2(SignUpData signUpData) {
        this.f316h = signUpData;
    }

    /* JADX INFO: renamed from: j1 */
    public boolean m233j1() {
        return mqi0.D(((Long) this.f319k.get()).longValue());
    }

    /* JADX INFO: renamed from: j2 */
    public void m234j2(String str) {
        this.f316h.name = str;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ c m235k1(AccountTempApi.SignUpType signUpType, User user) {
        if (TEnum.equals(user.signupStage, "finished") || TEnum.equals(user.signupStage, "unknown_")) {
            eje.m14574h().f11185a.put(user.signupStage.toString());
            return c.just(roj0.a);
        }
        SignUpData signUpData = new SignUpData();
        signUpData.signUpType = signUpType;
        SignUpData signUpData2 = this.f316h;
        signUpData.name = signUpData2.name;
        signUpData.birthdate = signUpData2.birthdate;
        signUpData.gender = signUpData2.gender;
        return eje.m14577r(signUpData, null, false);
    }

    /* JADX INFO: renamed from: k2 */
    public void m236k2(String str, String str2) {
        SignUpData signUpData = this.f316h;
        signUpData.profilePath = str;
        signUpData.profileMineType = str2;
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ roj0 m237l1(VerifyDataV2 verifyDataV2, Token token) {
        this.f320l.l(AccountModule.f27d.m25944v(token));
        m261x2(verifyDataV2);
        return roj0.a;
    }

    /* JADX INFO: renamed from: l2 */
    public void m238l2(String str, String str2) {
        SignUpData signUpData = this.f316h;
        signUpData.thirdPartyToken = str;
        signUpData.thirdPartyId = str2;
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ roj0 m239m1(VerifyDataV2 verifyDataV2, Token token) {
        this.f320l.l(AccountModule.f27d.m25944v(token));
        m261x2(verifyDataV2);
        return roj0.a;
    }

    /* JADX INFO: renamed from: m2 */
    public void m240m2(AccountTempApi.SignUpType signUpType) {
        this.f316h.signUpType = signUpType;
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ stc0 m241n1() {
        return qib0.f19784H.authBeforeSignUp().q(xh5.m27262u(m265z2())).f().b();
    }

    /* JADX INFO: renamed from: n2 */
    public c<roj0> m242n2(SignInData signInData, RememberUserInfo rememberUserInfo, boolean z, final Runnable runnable) {
        return now(m206U1(signInData, rememberUserInfo, z).compose(mkd0.Q()).map(new w9j() { // from class: l.pd
            public final Object call(Object obj) {
                return C0001a.m94I((roj0) obj);
            }
        }).map(new w9j() { // from class: l.qd
            public final Object call(Object obj) {
                return C0001a.m119d0(runnable, (roj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.rd
            public final Object call(Object obj) {
                return this.f20516a.m168C1((roj0) obj);
            }
        }).observeOn(jo0.a()));
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ User m243o1(Envelope envelope) {
        CommonData moduleData = envelope.getModuleData(CommonData.class);
        if (!NullChecker.c(moduleData, "account", CrashHelper.ReportLevel.p9)) {
            return null;
        }
        List list = moduleData.users;
        if (vwb.J(list)) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (TextUtils.equals(((DbObject) ((User) list.get(i))).id, m265z2())) {
                return (User) list.get(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o2 */
    public c<roj0> m244o2(SignInData signInData, boolean z, Runnable runnable) {
        return m242n2(signInData, null, z, runnable);
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ c m245p1() {
        return new la20(new v9j() { // from class: l.wd
            public final Object call() {
                return this.f25103a.m241n1();
            }
        }).map(new w9j() { // from class: l.xd
            public final Object call(Object obj) {
                return this.f27453a.m243o1((Envelope) obj);
            }
        }).filter(new w9j() { // from class: l.yd
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((User) obj));
            }
        }).flatMap(new w9j() { // from class: l.zd
            public final Object call(Object obj) {
                return C0001a.m156w((User) obj);
            }
        }).compose(C0002b.m271f());
    }

    /* JADX INFO: renamed from: p2 */
    public void m246p2() {
        xgw.m27236l();
        this.f320l.i();
        du2.a("[api]", "signout clear data");
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ stc0 m247q1() {
        return qib0.f19784H.authBeforeSignUp().q(xh5.m27262u(m265z2())).f().b();
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ User m248r1(Envelope envelope) {
        CommonData moduleData = envelope.getModuleData(CommonData.class);
        if (!NullChecker.c(moduleData, "account", CrashHelper.ReportLevel.p9)) {
            return null;
        }
        List list = moduleData.users;
        if (vwb.J(list)) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (TextUtils.equals(((DbObject) ((User) list.get(i))).id, m265z2())) {
                return (User) list.get(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r2 */
    public void m249r2(Context context, Intent intent) {
        intent.setClass(context, SignInAct.class);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ c m250s1() {
        return ia20.m16571e(new v9j() { // from class: l.ve
            public final Object call() {
                return this.f24283a.m247q1();
            }
        }).map(new w9j() { // from class: l.we
            public final Object call(Object obj) {
                return this.f25114a.m248r1((Envelope) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: s2 */
    public c<roj0> m251s2() {
        return qib0.f19785I.now("submit_jump_status", ia20.m16569c(new v9j() { // from class: l.he
            public final Object call() {
                return qib0.f19784H.authBeforeSignUp().q(C0002b.m268c("/users/me/skip-info")).l(utc0.create(Network.JSON, "")).b();
            }
        }, Envelope.JSON_ADAPTER).map(new w9j() { // from class: l.ie
            public final Object call(Object obj) {
                return roj0.a;
            }
        }));
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m252t1(AuthData authData) {
        if (authData == null) {
            this.f323o = null;
            this.f319k.put(0L);
            jkb0.m17515x();
        } else {
            this.f323o = authData.userId;
            if (((Long) this.f319k.get()).longValue() == 0) {
                this.f319k.put(Long.valueOf(qib0.f19784H.guessedCurrentServerTime()));
            }
            if (!qib0.f19805c0.signedIn_()) {
                ABManager.m1270y(2);
            }
            zvf0.H("uid", authData.userId);
        }
    }

    /* JADX INFO: renamed from: t2 */
    public c<AccountTestGroup> m253t2(AccountTestFactor accountTestFactor) {
        C1390vw c1390vw = AccountModule.f27d;
        String str = accountTestFactor.channel;
        String str2 = "";
        if (qib0.f19808f0 != 0) {
            str2 = qib0.f19808f0 + "";
        }
        return c1390vw.m25935O(str, str2).compose(C0002b.m271f());
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m254u1(Throwable th) {
        this.f323o = null;
        this.f319k.put(0L);
        jkb0.m17515x();
    }

    /* JADX INFO: renamed from: u2 */
    public c<roj0> m255u2(String str, String str2, String str3, String str4) {
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
        return x14.b().d("/thirdparty/bind", jSONObject.toString()).doOnNext(new e30() { // from class: l.xc
            public final void call(Object obj) {
                C0001a.m104S(jSONObject, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.yc
            public final Object call(Object obj) {
                return this.f28111a.m170D1((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ roj0 m256v1(VerifyData verifyData, Token token) {
        this.f320l.l(AccountModule.f27d.m25944v(token));
        m263y2(verifyData);
        return roj0.a;
    }

    /* JADX INFO: renamed from: v2 */
    public c<roj0> m257v2(SignUpData signUpData, TokenSigninParam tokenSigninParam) {
        return AccountModule.f27d.m25936P(tokenSigninParam).map(new w9j() { // from class: l.td
            public final Object call(Object obj) {
                return this.f22041a.m172E1((Token) obj);
            }
        }).flatMap(new w9j() { // from class: l.ud
            public final Object call(Object obj) {
                return qib0.m22160f0();
            }
        });
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ roj0 m258w1(Token token) {
        this.f320l.l(AccountModule.f27d.m25944v(token));
        return roj0.a;
    }

    /* JADX INFO: renamed from: w2 */
    public c<roj0> m259w2(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientId", "100032");
            jSONObject.put("type", str);
        } catch (JSONException unused) {
        }
        return x14.b().d("/account/unbind", jSONObject.toString()).doOnNext(new e30() { // from class: l.ye
            public final void call(Object obj) {
                C0001a.m103R(jSONObject, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.af
            public final Object call(Object obj) {
                return this.f8234a.m175F1((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ roj0 m260x1(Token token) {
        this.f320l.l(AccountModule.f27d.m25944v(token));
        return roj0.a;
    }

    /* JADX INFO: renamed from: x2 */
    public final void m261x2(VerifyDataV2 verifyDataV2) {
        User userQueryMe = AccountModule.m27H().queryMe();
        if (NullChecker.c(userQueryMe, "account", CrashHelper.ReportLevel.p9)) {
            final User userClone = userQueryMe.clone();
            userClone.settings.email = verifyDataV2.email;
            f8c.o().B(new d30() { // from class: l.pf
                public final void call() {
                    qib0.f19813k0.f23551d.upsert(userClone);
                }
            });
        }
        AccountModule.m27H().refreshUser(this.f323o);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025 A[PHI: r1
      0x0025: PHI (r1v9 java.lang.String) = (r1v1 java.lang.String), (r1v2 java.lang.String), (r1v4 java.lang.String), (r1v6 java.lang.String) binds: [B:6:0x0023, B:9:0x002f, B:15:0x0047, B:24:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ roj0 m262y1(SignInData signInData, Token token) {
        String str;
        this.f320l.l(AccountModule.f27d.m25944v(token));
        if (TEnum.equals(signInData.grantType, "cosmos")) {
            str = "phone_oneclick";
        } else {
            String str2 = "wechat";
            if (TEnum.equals(signInData.grantType, "wechat")) {
                str = str2;
            } else {
                str2 = "qq";
                if (TEnum.equals(signInData.grantType, "qq")) {
                    str = str2;
                } else if (TEnum.equals(signInData.grantType, "confirmation_code")) {
                    str = "phone_code";
                } else {
                    str2 = "facebook";
                    if (TEnum.equals(signInData.grantType, "facebook")) {
                        str = str2;
                    } else if (TEnum.equals(signInData.grantType, "password")) {
                        str = signInData.isSmartlock ? "smartlock" : "phone_password";
                    } else {
                        str2 = "google";
                        if (TEnum.equals(signInData.grantType, "google")) {
                            str = str2;
                        } else if (TEnum.equals(signInData.grantType, "tantan-token")) {
                            str = "old_tantan";
                        } else {
                            str = TEnum.equals(signInData.grantType, "email") ? "mail" : "";
                        }
                    }
                }
            }
        }
        if (NullChecker.a(this.f320l.b())) {
            eje.m14574h().m14585n((AuthData) this.f320l.b());
        }
        if (TEnum.equals(((AuthData) this.f320l.b()).signupStage, "finished")) {
            zvf0.D("e_signin_success", "", new j760[]{vwb.Y("signin_type", str), vwb.Y("phone_num", signInData.username)});
        }
        qib0.m22159e1("signin", new Object[0]);
        return roj0.a;
    }

    /* JADX INFO: renamed from: y2 */
    public final void m263y2(VerifyData verifyData) {
        User userQueryMe = AccountModule.m27H().queryMe();
        if (NullChecker.c(userQueryMe, "account", CrashHelper.ReportLevel.p9)) {
            final User userClone = userQueryMe.clone();
            PhoneNumber phoneNumber = userClone.settings.phoneNumber;
            phoneNumber.number = verifyData.mobileNumber;
            phoneNumber.countryCode = verifyData.countryCode;
            f8c.o().B(new d30() { // from class: l.ed
                public final void call() {
                    qib0.f19813k0.f23551d.upsert(userClone);
                }
            });
        }
        AccountModule.m27H().refreshUser(this.f323o);
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ roj0 m264z1(SignUpData signUpData, Token token) {
        this.f320l.l(AccountModule.f27d.m25944v(token));
        j760 j760VarY = vwb.Y("signup_source", m224e1(signUpData));
        String str = this.f316h.phoneNumber;
        if (str == null) {
            str = "";
        }
        zvf0.D("e_signup_success", "", new j760[]{j760VarY, vwb.Y("phone_num", str)});
        qib0.m22159e1("af_complete_registration", new Object[0]);
        StringBuilder sb = new StringBuilder("af_complete_registration_");
        sb.append(NullChecker.a(this.f316h.gender) ? this.f316h.gender.toString() : "unknown_");
        qib0.m22159e1(sb.toString(), new Object[0]);
        return roj0.a;
    }

    /* JADX INFO: renamed from: z2 */
    public String m265z2() {
        if (NullChecker.a(this.f323o)) {
            return this.f323o;
        }
        return m207V0().b() == null ? "" : ((AuthData) m207V0().b()).userId;
    }
}
