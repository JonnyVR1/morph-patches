package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p051p1.mobile.account_core.reponse_data.Data;
import com.p051p1.mobile.account_core.reponse_data.ThirdPartyEmailVerify;
import com.p051p1.mobile.account_core.reponse_data.ThirdpartyToken;
import com.p051p1.mobile.account_core.reponse_data.Token;
import com.p051p1.mobile.account_core.reponse_data.User;
import com.p051p1.mobile.account_core.request_data.Gender;
import com.p051p1.mobile.account_thirdparty.data.ThirdPartyActiveData;
import com.p051p1.mobile.account_thirdparty.data.ThirdPartyInfoData;
import com.p051p1.mobile.account_thirdparty.data.ThirdPartySigninData;
import com.p051p1.mobile.account_thirdparty.data.ThirdPartySignupData;
import com.p051p1.mobile.account_thirdparty.data.ThirdPartySignupEarlyUIDData;
import com.p051p1.mobile.account_thirdparty.data.ThirdPartyVerifyData;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.api.C4726a;
import com.p051p1.mobile.putong.account.data.ThirdPartVetify;
import com.p051p1.mobile.putong.account.data.WeChatToken;
import com.p051p1.mobile.putong.account.data.WeChatUserInfo;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class awi0 {

    /* JADX INFO: renamed from: b */
    public static jxd0 f73758b;

    /* JADX INFO: renamed from: c */
    public static jxd0 f73759c;

    /* JADX INFO: renamed from: d */
    public static jxd0 f73760d;

    /* JADX INFO: renamed from: a */
    public qwi0 f73761a = new qwi0();

    /* JADX INFO: renamed from: l.awi0$a */
    public class C15849a implements qcj<AccountEnvelop, Token> {
        public C15849a() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Token call(AccountEnvelop accountEnvelop) {
            awi0.m100656k(accountEnvelop.data);
            return accountEnvelop.data.token;
        }
    }

    /* JADX INFO: renamed from: l.awi0$b */
    public class C15850b implements qcj<AccountEnvelop, Token> {
        public C15850b() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Token call(AccountEnvelop accountEnvelop) {
            awi0.m100656k(accountEnvelop.data);
            return accountEnvelop.data.token;
        }
    }

    /* JADX INFO: renamed from: l.awi0$c */
    public class C15851c implements qcj<AccountEnvelop, Token> {
        public C15851c() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Token call(AccountEnvelop accountEnvelop) {
            awi0.m100656k(accountEnvelop.data);
            return accountEnvelop.data.token;
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f73758b = new jxd0("third_show_email_verify", bool);
        f73759c = new jxd0("third_email_verify_skip_enabled", bool);
        f73760d = new jxd0("third_email_verify_skip_finish", bool);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ThirdPartVetify m100652a(Boolean bool) {
        if (bool.booleanValue()) {
            throw new TantanException.Client.AccountService(TantanException.Client.AccountService.THIRD_PARTY_USER_EXIST, "THIRD_PARTY_USER_EXIST");
        }
        ThirdPartVetify thirdPartVetifyNew_ = ThirdPartVetify.new_();
        thirdPartVetifyNew_.code = 200;
        return thirdPartVetifyNew_;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ WeChatUserInfo m100653b(User user) {
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
    public static /* synthetic */ WeChatToken m100654c(ThirdpartyToken thirdpartyToken) {
        WeChatToken weChatTokenNew_ = WeChatToken.new_();
        weChatTokenNew_.thirdpartyAccessToken = thirdpartyToken.value;
        weChatTokenNew_.thirdpartyRefreshToken = thirdpartyToken.refreshToken;
        weChatTokenNew_.thirdpartyExpiresIn = thirdpartyToken.expiresIn;
        weChatTokenNew_.thirdpartyId = thirdpartyToken.f15529id;
        weChatTokenNew_.thirdpartyScope = thirdpartyToken.scope;
        return weChatTokenNew_;
    }

    /* JADX INFO: renamed from: k */
    public static void m100656k(Data data) {
        ThirdPartyEmailVerify thirdPartyEmailVerify;
        if (data != null && (thirdPartyEmailVerify = data.thirdpartyEmailVerify) != null) {
            f73758b.put(Boolean.valueOf(thirdPartyEmailVerify.needEmailVerify));
            f73759c.put(Boolean.valueOf(data.thirdpartyEmailVerify.emailVerifySkipEnabled));
            return;
        }
        jxd0 jxd0Var = f73758b;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        f73759c.put(bool);
        f73760d.put(bool);
    }

    /* JADX INFO: renamed from: e */
    public C22421c<WeChatToken> m100657e(String str) {
        return this.f73761a.m178493N(str).map(new qcj() { // from class: l.xvi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return awi0.m100654c((ThirdpartyToken) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public C22421c<WeChatUserInfo> m100658f(String str, String str2) {
        ThirdPartyInfoData thirdPartyInfoData = new ThirdPartyInfoData();
        thirdPartyInfoData.thirdPartyId = str;
        thirdPartyInfoData.thirdPartyToken = str2;
        return this.f73761a.m178494O(thirdPartyInfoData).map(new qcj() { // from class: l.zvi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return awi0.m100653b((User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C22421c m100659g(SignUpData signUpData, Pair pair) {
        ThirdPartySignupData thirdPartySignupData = new ThirdPartySignupData();
        thirdPartySignupData.name = signUpData.name;
        thirdPartySignupData.birthdate = pzi0.f154857d.format(signUpData.birthdate);
        thirdPartySignupData.gender = TEnum.equals(signUpData.gender, "female") ? Gender.female : Gender.male;
        thirdPartySignupData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        thirdPartySignupData.pictureUrl = (String) pair.first;
        thirdPartySignupData.appsflyerId = signUpData.appsFlyerUID;
        thirdPartySignupData.thirdPartyId = signUpData.thirdPartyId;
        thirdPartySignupData.thirdPartyToken = signUpData.thirdPartyToken;
        thirdPartySignupData.thirdPartyUnionId = signUpData.thirdPartyUnionid;
        AccountModule.f16757d.m174010A(thirdPartySignupData, C16330cp.m111724j(((Long) pair.second).longValue(), signUpData.newProfilePath), true);
        return this.f73761a.m178496Q(thirdPartySignupData).map(new C15849a());
    }

    /* JADX INFO: renamed from: h */
    public C22421c<Token> m100660h(SignInData signInData, boolean z, boolean z2) {
        if (z) {
            ThirdPartyActiveData thirdPartyActiveData = new ThirdPartyActiveData();
            thirdPartyActiveData.thirdPartyId = signInData.thirdPartyId;
            thirdPartyActiveData.thirdPartyToken = signInData.thirdPartyToken;
            if (z2) {
                thirdPartyActiveData.thirdPartyType = "qq";
            }
            C4726a.m29209S0(thirdPartyActiveData, false);
            return this.f73761a.m178492M(thirdPartyActiveData);
        }
        ThirdPartySigninData thirdPartySigninData = new ThirdPartySigninData();
        thirdPartySigninData.thirdPartyId = signInData.thirdPartyId;
        thirdPartySigninData.thirdPartyToken = signInData.thirdPartyToken;
        if (z2) {
            thirdPartySigninData.thirdPartyType = "qq";
        }
        C4726a.m29209S0(thirdPartySigninData, true);
        thirdPartySigninData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        return this.f73761a.m178495P(thirdPartySigninData).map(new C15850b());
    }

    /* JADX INFO: renamed from: i */
    public C22421c<Token> m100661i(final SignUpData signUpData) {
        return AccountModule.f16757d.m174026Q(signUpData).flatMap(new qcj() { // from class: l.yvi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f201724a.m100659g(signUpData, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public C22421c<Token> m100662j(SignUpData signUpData, boolean z) {
        ThirdPartySignupEarlyUIDData thirdPartySignupEarlyUIDData = new ThirdPartySignupEarlyUIDData();
        thirdPartySignupEarlyUIDData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
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
            AccountModule.f16757d.m174010A(thirdPartySignupEarlyUIDData, 0, true);
        } else {
            AccountModule.f16757d.m174011B(thirdPartySignupEarlyUIDData, 0, true, signUpData.email);
        }
        return this.f73761a.m178497R(thirdPartySignupEarlyUIDData).map(new C15851c());
    }

    /* JADX INFO: renamed from: l */
    public C22421c<ThirdPartVetify> m100663l(String str, String str2, boolean z) {
        ThirdPartyVerifyData thirdPartyVerifyData = new ThirdPartyVerifyData();
        thirdPartyVerifyData.thirdPartyId = str;
        thirdPartyVerifyData.thirdPartyToken = str2;
        if (z) {
            thirdPartyVerifyData.thirdPartyType = "qq";
        }
        return this.f73761a.m178498S(thirdPartyVerifyData).map(new qcj() { // from class: l.wvi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return awi0.m100652a((Boolean) obj);
            }
        });
    }
}
