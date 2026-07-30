package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p046p1.mobile.account_core.reponse_data.Data;
import com.p046p1.mobile.account_core.reponse_data.ThirdPartyEmailVerify;
import com.p046p1.mobile.account_core.reponse_data.ThirdpartyToken;
import com.p046p1.mobile.account_core.reponse_data.Token;
import com.p046p1.mobile.account_core.reponse_data.User;
import com.p046p1.mobile.account_core.request_data.Gender;
import com.p046p1.mobile.account_thirdparty.data.ThirdPartyActiveData;
import com.p046p1.mobile.account_thirdparty.data.ThirdPartyInfoData;
import com.p046p1.mobile.account_thirdparty.data.ThirdPartySigninData;
import com.p046p1.mobile.account_thirdparty.data.ThirdPartySignupData;
import com.p046p1.mobile.account_thirdparty.data.ThirdPartySignupEarlyUIDData;
import com.p046p1.mobile.account_thirdparty.data.ThirdPartyVerifyData;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.api.C4575a;
import com.p046p1.mobile.putong.account.data.ThirdPartVetify;
import com.p046p1.mobile.putong.account.data.WeChatToken;
import com.p046p1.mobile.putong.account.data.WeChatUserInfo;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class zmi0 {

    /* JADX INFO: renamed from: b */
    public static hpd0 f203723b;

    /* JADX INFO: renamed from: c */
    public static hpd0 f203724c;

    /* JADX INFO: renamed from: d */
    public static hpd0 f203725d;

    /* JADX INFO: renamed from: a */
    public pni0 f203726a = new pni0();

    /* JADX INFO: renamed from: l.zmi0$a */
    public class C21729a implements w9j<AccountEnvelop, Token> {
        public C21729a() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Token call(AccountEnvelop accountEnvelop) {
            zmi0.m219338k(accountEnvelop.data);
            return accountEnvelop.data.token;
        }
    }

    /* JADX INFO: renamed from: l.zmi0$b */
    public class C21730b implements w9j<AccountEnvelop, Token> {
        public C21730b() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Token call(AccountEnvelop accountEnvelop) {
            zmi0.m219338k(accountEnvelop.data);
            return accountEnvelop.data.token;
        }
    }

    /* JADX INFO: renamed from: l.zmi0$c */
    public class C21731c implements w9j<AccountEnvelop, Token> {
        public C21731c() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Token call(AccountEnvelop accountEnvelop) {
            zmi0.m219338k(accountEnvelop.data);
            return accountEnvelop.data.token;
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f203723b = new hpd0("third_show_email_verify", bool);
        f203724c = new hpd0("third_email_verify_skip_enabled", bool);
        f203725d = new hpd0("third_email_verify_skip_finish", bool);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ThirdPartVetify m219334a(Boolean bool) {
        if (bool.booleanValue()) {
            throw new TantanException.Client.AccountService(TantanException.Client.AccountService.THIRD_PARTY_USER_EXIST, "THIRD_PARTY_USER_EXIST");
        }
        ThirdPartVetify thirdPartVetifyNew_ = ThirdPartVetify.new_();
        thirdPartVetifyNew_.code = 200;
        return thirdPartVetifyNew_;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ WeChatUserInfo m219335b(User user) {
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
    public static /* synthetic */ WeChatToken m219336c(ThirdpartyToken thirdpartyToken) {
        WeChatToken weChatTokenNew_ = WeChatToken.new_();
        weChatTokenNew_.thirdpartyAccessToken = thirdpartyToken.value;
        weChatTokenNew_.thirdpartyRefreshToken = thirdpartyToken.refreshToken;
        weChatTokenNew_.thirdpartyExpiresIn = thirdpartyToken.expiresIn;
        weChatTokenNew_.thirdpartyId = thirdpartyToken.f14810id;
        weChatTokenNew_.thirdpartyScope = thirdpartyToken.scope;
        return weChatTokenNew_;
    }

    /* JADX INFO: renamed from: k */
    public static void m219338k(Data data) {
        ThirdPartyEmailVerify thirdPartyEmailVerify;
        if (data != null && (thirdPartyEmailVerify = data.thirdpartyEmailVerify) != null) {
            f203723b.put(Boolean.valueOf(thirdPartyEmailVerify.needEmailVerify));
            f203724c.put(Boolean.valueOf(data.thirdpartyEmailVerify.emailVerifySkipEnabled));
            return;
        }
        hpd0 hpd0Var = f203723b;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        f203724c.put(bool);
        f203725d.put(bool);
    }

    /* JADX INFO: renamed from: e */
    public C22306c<WeChatToken> m219339e(String str) {
        return this.f203726a.m170432N(str).map(new w9j() { // from class: l.wmi0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zmi0.m219336c((ThirdpartyToken) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public C22306c<WeChatUserInfo> m219340f(String str, String str2) {
        ThirdPartyInfoData thirdPartyInfoData = new ThirdPartyInfoData();
        thirdPartyInfoData.thirdPartyId = str;
        thirdPartyInfoData.thirdPartyToken = str2;
        return this.f203726a.m170433O(thirdPartyInfoData).map(new w9j() { // from class: l.ymi0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zmi0.m219335b((User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C22306c m219341g(SignUpData signUpData, Pair pair) {
        ThirdPartySignupData thirdPartySignupData = new ThirdPartySignupData();
        thirdPartySignupData.name = signUpData.name;
        thirdPartySignupData.birthdate = mqi0.f135252d.format(signUpData.birthdate);
        thirdPartySignupData.gender = TEnum.equals(signUpData.gender, "female") ? Gender.female : Gender.male;
        thirdPartySignupData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        thirdPartySignupData.pictureUrl = (String) pair.first;
        thirdPartySignupData.appsflyerId = signUpData.appsFlyerUID;
        thirdPartySignupData.thirdPartyId = signUpData.thirdPartyId;
        thirdPartySignupData.thirdPartyToken = signUpData.thirdPartyToken;
        thirdPartySignupData.thirdPartyUnionId = signUpData.thirdPartyUnionid;
        AccountModule.f16038d.m200240A(thirdPartySignupData, C17367hp.m132326j(((Long) pair.second).longValue(), signUpData.newProfilePath), true);
        return this.f203726a.m170435Q(thirdPartySignupData).map(new C21729a());
    }

    /* JADX INFO: renamed from: h */
    public C22306c<Token> m219342h(SignInData signInData, boolean z, boolean z2) {
        if (z) {
            ThirdPartyActiveData thirdPartyActiveData = new ThirdPartyActiveData();
            thirdPartyActiveData.thirdPartyId = signInData.thirdPartyId;
            thirdPartyActiveData.thirdPartyToken = signInData.thirdPartyToken;
            if (z2) {
                thirdPartyActiveData.thirdPartyType = "qq";
            }
            C4575a.m28210S0(thirdPartyActiveData, false);
            return this.f203726a.m170431M(thirdPartyActiveData);
        }
        ThirdPartySigninData thirdPartySigninData = new ThirdPartySigninData();
        thirdPartySigninData.thirdPartyId = signInData.thirdPartyId;
        thirdPartySigninData.thirdPartyToken = signInData.thirdPartyToken;
        if (z2) {
            thirdPartySigninData.thirdPartyType = "qq";
        }
        C4575a.m28210S0(thirdPartySigninData, true);
        thirdPartySigninData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        return this.f203726a.m170434P(thirdPartySigninData).map(new C21730b());
    }

    /* JADX INFO: renamed from: i */
    public C22306c<Token> m219343i(final SignUpData signUpData) {
        return AccountModule.f16038d.m200256Q(signUpData).flatMap(new w9j() { // from class: l.xmi0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f193561a.m219341g(signUpData, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public C22306c<Token> m219344j(SignUpData signUpData, boolean z) {
        ThirdPartySignupEarlyUIDData thirdPartySignupEarlyUIDData = new ThirdPartySignupEarlyUIDData();
        thirdPartySignupEarlyUIDData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        thirdPartySignupEarlyUIDData.thirdPartyId = signUpData.thirdPartyId;
        thirdPartySignupEarlyUIDData.thirdPartyToken = signUpData.thirdPartyToken;
        thirdPartySignupEarlyUIDData.thirdPartyUnionId = signUpData.thirdPartyUnionid;
        if (z) {
            thirdPartySignupEarlyUIDData.thirdPartyType = "qq";
        }
        AccountTempApi.SignUpType signUpType = signUpData.signUpType;
        if (signUpType == AccountTempApi.SignUpType.facebook) {
            thirdPartySignupEarlyUIDData.thirdPartyType = signUpType.toString();
        }
        AccountTempApi.SignUpType signUpType2 = signUpData.signUpType;
        AccountTempApi.SignUpType signUpType3 = AccountTempApi.SignUpType.google;
        if (signUpType2 == signUpType3) {
            thirdPartySignupEarlyUIDData.thirdPartyType = signUpType2.toString();
        }
        if (signUpData.signUpType != signUpType3 || TextUtils.isEmpty(signUpData.email)) {
            AccountModule.f16038d.m200240A(thirdPartySignupEarlyUIDData, 0, true);
        } else {
            AccountModule.f16038d.m200241B(thirdPartySignupEarlyUIDData, 0, true, signUpData.email);
        }
        return this.f203726a.m170436R(thirdPartySignupEarlyUIDData).map(new C21731c());
    }

    /* JADX INFO: renamed from: l */
    public C22306c<ThirdPartVetify> m219345l(String str, String str2, boolean z) {
        ThirdPartyVerifyData thirdPartyVerifyData = new ThirdPartyVerifyData();
        thirdPartyVerifyData.thirdPartyId = str;
        thirdPartyVerifyData.thirdPartyToken = str2;
        if (z) {
            thirdPartyVerifyData.thirdPartyType = "qq";
        }
        return this.f203726a.m170437S(thirdPartyVerifyData).map(new w9j() { // from class: l.vmi0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zmi0.m219334a((Boolean) obj);
            }
        });
    }
}
