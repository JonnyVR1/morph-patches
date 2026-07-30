package p006l;

import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.api.C0001a;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p1.mobile.account_core.reponse_data.Token;
import com.p1.mobile.account_core.request_data.Gender;
import com.p1.mobile.account_core.request_data.OperatorType;
import com.p1.mobile.account_core.request_data.SignupData;
import com.p1.mobile.account_core.request_data.ThirdPartyAccount;
import com.p1.mobile.account_cosmos.data.CosmosActiveData;
import com.p1.mobile.account_cosmos.data.CosmosBindPhoneData;
import com.p1.mobile.account_cosmos.data.CosmosSignInData;
import com.p1.mobile.account_cosmos.data.CosmosSignupEarlyUIDData;
import com.p1.mobile.account_mobile.data.MobileSignupData;
import com.p1.mobile.account_unicom.data.UnicomSignupData;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.SignInGrantType;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class bh50 {

    /* JADX INFO: renamed from: l.bh50$a */
    public static /* synthetic */ class C0555a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8877a;

        static {
            int[] iArr = new int[ChinaMobileController.MobileType.values().length];
            f8877a = iArr;
            try {
                iArr[ChinaMobileController.MobileType.mobile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8877a[ChinaMobileController.MobileType.unicom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8877a[ChinaMobileController.MobileType.telecom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public c<Token> m12624b(String str, String str2, String str3, SignInGrantType signInGrantType) {
        CosmosBindPhoneData cosmosBindPhoneData = new CosmosBindPhoneData();
        cosmosBindPhoneData.providerToken = str;
        cosmosBindPhoneData.accessCode = str2;
        cosmosBindPhoneData.operatorType = m12625c();
        return ChinaMobileController.m1499b().m1503a().H(cosmosBindPhoneData);
    }

    /* JADX INFO: renamed from: c */
    public OperatorType m12625c() {
        int i = C0555a.f8877a[ChinaMobileController.m1502e().ordinal()];
        if (i == 1) {
            return OperatorType.china_mobile;
        }
        if (i == 2) {
            return OperatorType.china_unicom;
        }
        if (i != 3) {
            return null;
        }
        return OperatorType.china_telecom;
    }

    /* JADX INFO: renamed from: e */
    public c<Token> m12627e(SignInData signInData, boolean z) {
        if (z) {
            CosmosActiveData cosmosActiveData = new CosmosActiveData();
            cosmosActiveData.operatorType = m12625c();
            cosmosActiveData.accessCode = signInData.thirdPartyAccessCode;
            cosmosActiveData.providerToken = signInData.thirdPartyToken;
            C0001a.m105S0(cosmosActiveData, false);
            return ChinaMobileController.m1499b().m1503a().G(cosmosActiveData);
        }
        CosmosSignInData cosmosSignInData = new CosmosSignInData();
        cosmosSignInData.operatorType = m12625c();
        cosmosSignInData.accessCode = signInData.thirdPartyAccessCode;
        cosmosSignInData.providerToken = signInData.thirdPartyToken;
        cosmosSignInData.addExtraData("device", pk8.m21562M().toJson());
        C0001a.m105S0(cosmosSignInData, true);
        return ChinaMobileController.m1499b().m1503a().I(cosmosSignInData);
    }

    /* JADX INFO: renamed from: f */
    public c<Token> m12628f(final SignUpData signUpData) {
        return AccountModule.f27d.m25937Q(signUpData).flatMap(new w9j() { // from class: l.ah50
            public final Object call(Object obj) {
                return this.f8257a.m12626d(signUpData, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public c<Token> m12629g(SignUpData signUpData, SignInGrantType signInGrantType) {
        SignupData cosmosSignupEarlyUIDData = new CosmosSignupEarlyUIDData();
        ((CosmosSignupEarlyUIDData) cosmosSignupEarlyUIDData).operatorType = m12625c();
        ((CosmosSignupEarlyUIDData) cosmosSignupEarlyUIDData).providerToken = signUpData.thirdPartyToken;
        ((CosmosSignupEarlyUIDData) cosmosSignupEarlyUIDData).accessCode = signUpData.thirdPartyAccessCode;
        if (!TextUtils.isEmpty(signUpData.thirdPartyId)) {
            ThirdPartyAccount thirdPartyAccount = new ThirdPartyAccount();
            thirdPartyAccount.id = signUpData.thirdPartyId;
            thirdPartyAccount.token = signUpData.thirdPartyToken;
            ((CosmosSignupEarlyUIDData) cosmosSignupEarlyUIDData).thirdPartyAccount = thirdPartyAccount;
        }
        ((CosmosSignupEarlyUIDData) cosmosSignupEarlyUIDData).providerUserId = signUpData.thirdPartyId;
        cosmosSignupEarlyUIDData.addExtraData("device", pk8.m21562M().toJson());
        AccountModule.f27d.m25921A(cosmosSignupEarlyUIDData, 0, true);
        return ChinaMobileController.m1499b().m1503a().J(cosmosSignupEarlyUIDData);
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final c<Token> m12626d(SignUpData signUpData, Pair<String, Long> pair) {
        if (signUpData.signUpType != AccountTempApi.SignUpType.chinaMobile) {
            SignupData unicomSignupData = new UnicomSignupData();
            ((UnicomSignupData) unicomSignupData).providerToken = signUpData.thirdPartyToken;
            unicomSignupData.addExtraData("device", pk8.m21562M().toJson());
            unicomSignupData.name = signUpData.name;
            unicomSignupData.birthdate = C0907jy.m17844n0(signUpData.birthdate.doubleValue());
            unicomSignupData.gender = TEnum.equals(signUpData.gender, "female") ? Gender.female : Gender.male;
            unicomSignupData.addExtraData("device", pk8.m21562M().toJson());
            unicomSignupData.pictureUrl = (String) pair.first;
            unicomSignupData.setPassword(signUpData.password);
            if (TextUtils.isEmpty(signUpData.password)) {
                ((UnicomSignupData) unicomSignupData).signupType = "no-password";
            }
            unicomSignupData.appsflyerId = signUpData.appsFlyerUID;
            AccountModule.f27d.m25921A(unicomSignupData, C0811hp.m16310j(((Long) pair.second).longValue(), signUpData.newProfilePath), true);
            return ChinaMobileController.m1499b().m1505g().A(unicomSignupData);
        }
        SignupData mobileSignupData = new MobileSignupData();
        ((MobileSignupData) mobileSignupData).operatorType = m12625c();
        ((MobileSignupData) mobileSignupData).providerToken = signUpData.thirdPartyToken;
        mobileSignupData.addExtraData("device", pk8.m21562M().toJson());
        mobileSignupData.name = signUpData.name;
        mobileSignupData.birthdate = C0907jy.m17844n0(signUpData.birthdate.doubleValue());
        mobileSignupData.gender = TEnum.equals(signUpData.gender, "female") ? Gender.female : Gender.male;
        mobileSignupData.addExtraData("device", pk8.m21562M().toJson());
        mobileSignupData.pictureUrl = (String) pair.first;
        mobileSignupData.setPassword(signUpData.password);
        if (TextUtils.isEmpty(signUpData.password)) {
            ((MobileSignupData) mobileSignupData).signupType = "no-password";
        }
        mobileSignupData.appsflyerId = signUpData.appsFlyerUID;
        AccountModule.f27d.m25921A(mobileSignupData, C0811hp.m16310j(((Long) pair.second).longValue(), signUpData.newProfilePath), true);
        return ChinaMobileController.m1499b().m1504f().A(mobileSignupData);
    }
}
