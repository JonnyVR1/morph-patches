package p006l;

import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.api.C0001a;
import com.p000p1.mobile.putong.account.data.ThirdPartVetify;
import com.p000p1.mobile.putong.account.data.WeChatToken;
import com.p000p1.mobile.putong.account.data.WeChatUserInfo;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p1.mobile.account_core.reponse_data.Data;
import com.p1.mobile.account_core.reponse_data.ThirdPartyEmailVerify;
import com.p1.mobile.account_core.reponse_data.ThirdpartyToken;
import com.p1.mobile.account_core.reponse_data.Token;
import com.p1.mobile.account_core.reponse_data.User;
import com.p1.mobile.account_core.request_data.Gender;
import com.p1.mobile.account_core.request_data.SignupData;
import com.p1.mobile.account_core.request_data.ThirdPartySigninBaseData;
import com.p1.mobile.account_core.request_data.ThirdPartySignupBaseData;
import com.p1.mobile.account_thirdparty.data.ThirdPartyActiveData;
import com.p1.mobile.account_thirdparty.data.ThirdPartyInfoData;
import com.p1.mobile.account_thirdparty.data.ThirdPartySigninData;
import com.p1.mobile.account_thirdparty.data.ThirdPartySignupData;
import com.p1.mobile.account_thirdparty.data.ThirdPartySignupEarlyUIDData;
import com.p1.mobile.account_thirdparty.data.ThirdPartyVerifyData;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.network.ApiExcep;
import l.hpd0;
import l.mqi0;
import l.pni0;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zmi0 {

    /* JADX INFO: renamed from: b */
    public static hpd0 f28826b;

    /* JADX INFO: renamed from: c */
    public static hpd0 f28827c;

    /* JADX INFO: renamed from: d */
    public static hpd0 f28828d;

    /* JADX INFO: renamed from: a */
    public pni0 f28829a = new pni0();

    /* JADX INFO: renamed from: l.zmi0$a */
    public class C1526a implements w9j<AccountEnvelop, Token> {
        public C1526a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Token call(AccountEnvelop accountEnvelop) {
            zmi0.m28732k(accountEnvelop.data);
            return accountEnvelop.data.token;
        }
    }

    /* JADX INFO: renamed from: l.zmi0$b */
    public class C1527b implements w9j<AccountEnvelop, Token> {
        public C1527b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Token call(AccountEnvelop accountEnvelop) {
            zmi0.m28732k(accountEnvelop.data);
            return accountEnvelop.data.token;
        }
    }

    /* JADX INFO: renamed from: l.zmi0$c */
    public class C1528c implements w9j<AccountEnvelop, Token> {
        public C1528c() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Token call(AccountEnvelop accountEnvelop) {
            zmi0.m28732k(accountEnvelop.data);
            return accountEnvelop.data.token;
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f28826b = new hpd0("third_show_email_verify", bool);
        f28827c = new hpd0("third_email_verify_skip_enabled", bool);
        f28828d = new hpd0("third_email_verify_skip_finish", bool);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.tantanapp.common.network.ApiExcep$Client$BadRequest */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ThirdPartVetify m28728a(Boolean bool) throws ApiExcep.Client.BadRequest {
        if (bool.booleanValue()) {
            throw new TantanException.Client.AccountService(TantanException.Client.AccountService.THIRD_PARTY_USER_EXIST, "THIRD_PARTY_USER_EXIST");
        }
        ThirdPartVetify thirdPartVetifyNew_ = ThirdPartVetify.new_();
        thirdPartVetifyNew_.code = 200;
        return thirdPartVetifyNew_;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ WeChatUserInfo m28729b(User user) {
        WeChatUserInfo weChatUserInfoNew_ = WeChatUserInfo.new_();
        weChatUserInfoNew_.nickname = user.name;
        weChatUserInfoNew_.unionid = user.unionId;
        if ("male".equals(user.gender)) {
            weChatUserInfoNew_.sex = 1;
            return weChatUserInfoNew_;
        }
        if ("female".equals(user.gender)) {
            weChatUserInfoNew_.sex = 2;
            return weChatUserInfoNew_;
        }
        weChatUserInfoNew_.sex = 0;
        return weChatUserInfoNew_;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ WeChatToken m28730c(ThirdpartyToken thirdpartyToken) {
        WeChatToken weChatTokenNew_ = WeChatToken.new_();
        weChatTokenNew_.thirdpartyAccessToken = thirdpartyToken.value;
        weChatTokenNew_.thirdpartyRefreshToken = thirdpartyToken.refreshToken;
        weChatTokenNew_.thirdpartyExpiresIn = thirdpartyToken.expiresIn;
        weChatTokenNew_.thirdpartyId = thirdpartyToken.id;
        weChatTokenNew_.thirdpartyScope = thirdpartyToken.scope;
        return weChatTokenNew_;
    }

    /* JADX INFO: renamed from: k */
    public static void m28732k(Data data) {
        ThirdPartyEmailVerify thirdPartyEmailVerify;
        if (data != null && (thirdPartyEmailVerify = data.thirdpartyEmailVerify) != null) {
            f28826b.put(Boolean.valueOf(thirdPartyEmailVerify.needEmailVerify));
            f28827c.put(Boolean.valueOf(data.thirdpartyEmailVerify.emailVerifySkipEnabled));
            return;
        }
        hpd0 hpd0Var = f28826b;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        f28827c.put(bool);
        f28828d.put(bool);
    }

    /* JADX INFO: renamed from: e */
    public c<WeChatToken> m28733e(String str) {
        return this.f28829a.N(str).map(new w9j() { // from class: l.wmi0
            public final Object call(Object obj) {
                return zmi0.m28730c((ThirdpartyToken) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public c<WeChatUserInfo> m28734f(String str, String str2) {
        ThirdPartyInfoData thirdPartyInfoData = new ThirdPartyInfoData();
        thirdPartyInfoData.thirdPartyId = str;
        thirdPartyInfoData.thirdPartyToken = str2;
        return this.f28829a.O(thirdPartyInfoData).map(new w9j() { // from class: l.ymi0
            public final Object call(Object obj) {
                return zmi0.m28729b((User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ c m28735g(SignUpData signUpData, Pair pair) {
        SignupData thirdPartySignupData = new ThirdPartySignupData();
        thirdPartySignupData.name = signUpData.name;
        thirdPartySignupData.birthdate = mqi0.d.format(signUpData.birthdate);
        thirdPartySignupData.gender = TEnum.equals(signUpData.gender, "female") ? Gender.female : Gender.male;
        thirdPartySignupData.addExtraData("device", pk8.m21562M().toJson());
        thirdPartySignupData.pictureUrl = (String) pair.first;
        thirdPartySignupData.appsflyerId = signUpData.appsFlyerUID;
        ((ThirdPartySignupBaseData) thirdPartySignupData).thirdPartyId = signUpData.thirdPartyId;
        ((ThirdPartySignupBaseData) thirdPartySignupData).thirdPartyToken = signUpData.thirdPartyToken;
        ((ThirdPartySignupBaseData) thirdPartySignupData).thirdPartyUnionId = signUpData.thirdPartyUnionid;
        AccountModule.f27d.m25921A(thirdPartySignupData, C0811hp.m16310j(((Long) pair.second).longValue(), signUpData.newProfilePath), true);
        return this.f28829a.Q(thirdPartySignupData).map(new C1526a());
    }

    /* JADX INFO: renamed from: h */
    public c<Token> m28736h(SignInData signInData, boolean z, boolean z2) {
        if (z) {
            ThirdPartyActiveData thirdPartyActiveData = new ThirdPartyActiveData();
            thirdPartyActiveData.thirdPartyId = signInData.thirdPartyId;
            thirdPartyActiveData.thirdPartyToken = signInData.thirdPartyToken;
            if (z2) {
                thirdPartyActiveData.thirdPartyType = "qq";
            }
            C0001a.m105S0(thirdPartyActiveData, false);
            return this.f28829a.M(thirdPartyActiveData);
        }
        ThirdPartySigninData thirdPartySigninData = new ThirdPartySigninData();
        ((ThirdPartySigninBaseData) thirdPartySigninData).thirdPartyId = signInData.thirdPartyId;
        ((ThirdPartySigninBaseData) thirdPartySigninData).thirdPartyToken = signInData.thirdPartyToken;
        if (z2) {
            thirdPartySigninData.thirdPartyType = "qq";
        }
        C0001a.m105S0(thirdPartySigninData, true);
        thirdPartySigninData.addExtraData("device", pk8.m21562M().toJson());
        return this.f28829a.P(thirdPartySigninData).map(new C1527b());
    }

    /* JADX INFO: renamed from: i */
    public c<Token> m28737i(final SignUpData signUpData) {
        return AccountModule.f27d.m25937Q(signUpData).flatMap(new w9j() { // from class: l.xmi0
            public final Object call(Object obj) {
                return this.f27612a.m28735g(signUpData, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public c<Token> m28738j(SignUpData signUpData, boolean z) {
        SignupData thirdPartySignupEarlyUIDData = new ThirdPartySignupEarlyUIDData();
        thirdPartySignupEarlyUIDData.addExtraData("device", pk8.m21562M().toJson());
        ((ThirdPartySignupBaseData) thirdPartySignupEarlyUIDData).thirdPartyId = signUpData.thirdPartyId;
        ((ThirdPartySignupBaseData) thirdPartySignupEarlyUIDData).thirdPartyToken = signUpData.thirdPartyToken;
        ((ThirdPartySignupBaseData) thirdPartySignupEarlyUIDData).thirdPartyUnionId = signUpData.thirdPartyUnionid;
        if (z) {
            ((ThirdPartySignupEarlyUIDData) thirdPartySignupEarlyUIDData).thirdPartyType = "qq";
        }
        AccountTempApi.SignUpType signUpType = signUpData.signUpType;
        if (signUpType == AccountTempApi.SignUpType.facebook) {
            ((ThirdPartySignupEarlyUIDData) thirdPartySignupEarlyUIDData).thirdPartyType = signUpType.toString();
        }
        AccountTempApi.SignUpType signUpType2 = signUpData.signUpType;
        AccountTempApi.SignUpType signUpType3 = AccountTempApi.SignUpType.google;
        if (signUpType2 == signUpType3) {
            ((ThirdPartySignupEarlyUIDData) thirdPartySignupEarlyUIDData).thirdPartyType = signUpType2.toString();
        }
        if (signUpData.signUpType != signUpType3 || TextUtils.isEmpty(signUpData.email)) {
            AccountModule.f27d.m25921A(thirdPartySignupEarlyUIDData, 0, true);
        } else {
            AccountModule.f27d.m25922B(thirdPartySignupEarlyUIDData, 0, true, signUpData.email);
        }
        return this.f28829a.R(thirdPartySignupEarlyUIDData).map(new C1528c());
    }

    /* JADX INFO: renamed from: l */
    public c<ThirdPartVetify> m28739l(String str, String str2, boolean z) {
        ThirdPartyVerifyData thirdPartyVerifyData = new ThirdPartyVerifyData();
        thirdPartyVerifyData.thirdPartyId = str;
        thirdPartyVerifyData.thirdPartyToken = str2;
        if (z) {
            thirdPartyVerifyData.thirdPartyType = "qq";
        }
        return this.f28829a.S(thirdPartyVerifyData).map(new w9j() { // from class: l.vmi0
            public final Object call(Object obj) {
                return zmi0.m28728a((Boolean) obj);
            }
        });
    }
}
