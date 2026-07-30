package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.account_core.reponse_data.Token;
import com.p046p1.mobile.account_core.request_data.Gender;
import com.p046p1.mobile.account_core.request_data.OperatorType;
import com.p046p1.mobile.account_core.request_data.ThirdPartyAccount;
import com.p046p1.mobile.account_cosmos.data.CosmosActiveData;
import com.p046p1.mobile.account_cosmos.data.CosmosBindPhoneData;
import com.p046p1.mobile.account_cosmos.data.CosmosSignInData;
import com.p046p1.mobile.account_cosmos.data.CosmosSignupEarlyUIDData;
import com.p046p1.mobile.account_mobile.data.MobileSignupData;
import com.p046p1.mobile.account_unicom.data.UnicomSignupData;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.api.C4575a;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.UserSource;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class bh50 {

    /* JADX INFO: renamed from: l.bh50$a */
    public static /* synthetic */ class C15859a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f75557a;

        static {
            int[] iArr = new int[ChinaMobileController.MobileType.values().length];
            f75557a = iArr;
            try {
                iArr[ChinaMobileController.MobileType.mobile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75557a[ChinaMobileController.MobileType.unicom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75557a[ChinaMobileController.MobileType.telecom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public C22306c<Token> m101758b(String str, String str2, String str3, SignInGrantType signInGrantType) {
        CosmosBindPhoneData cosmosBindPhoneData = new CosmosBindPhoneData();
        cosmosBindPhoneData.providerToken = str;
        cosmosBindPhoneData.accessCode = str2;
        cosmosBindPhoneData.operatorType = m101759c();
        return ChinaMobileController.m29593b().m29597a().m98246H(cosmosBindPhoneData);
    }

    /* JADX INFO: renamed from: c */
    public OperatorType m101759c() {
        int i = C15859a.f75557a[ChinaMobileController.m29596e().ordinal()];
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
    public C22306c<Token> m101761e(SignInData signInData, boolean z) {
        if (z) {
            CosmosActiveData cosmosActiveData = new CosmosActiveData();
            cosmosActiveData.operatorType = m101759c();
            cosmosActiveData.accessCode = signInData.thirdPartyAccessCode;
            cosmosActiveData.providerToken = signInData.thirdPartyToken;
            C4575a.m28210S0(cosmosActiveData, false);
            return ChinaMobileController.m29593b().m29597a().m98245G(cosmosActiveData);
        }
        CosmosSignInData cosmosSignInData = new CosmosSignInData();
        cosmosSignInData.operatorType = m101759c();
        cosmosSignInData.accessCode = signInData.thirdPartyAccessCode;
        cosmosSignInData.providerToken = signInData.thirdPartyToken;
        cosmosSignInData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        C4575a.m28210S0(cosmosSignInData, true);
        return ChinaMobileController.m29593b().m29597a().m98247I(cosmosSignInData);
    }

    /* JADX INFO: renamed from: f */
    public C22306c<Token> m101762f(final SignUpData signUpData) {
        return AccountModule.f16038d.m200256Q(signUpData).flatMap(new w9j() { // from class: l.ah50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f69553a.m101760d(signUpData, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public C22306c<Token> m101763g(SignUpData signUpData, SignInGrantType signInGrantType) {
        CosmosSignupEarlyUIDData cosmosSignupEarlyUIDData = new CosmosSignupEarlyUIDData();
        cosmosSignupEarlyUIDData.operatorType = m101759c();
        cosmosSignupEarlyUIDData.providerToken = signUpData.thirdPartyToken;
        cosmosSignupEarlyUIDData.accessCode = signUpData.thirdPartyAccessCode;
        if (!TextUtils.isEmpty(signUpData.thirdPartyId)) {
            ThirdPartyAccount thirdPartyAccount = new ThirdPartyAccount();
            thirdPartyAccount.f14811id = signUpData.thirdPartyId;
            thirdPartyAccount.token = signUpData.thirdPartyToken;
            cosmosSignupEarlyUIDData.thirdPartyAccount = thirdPartyAccount;
        }
        cosmosSignupEarlyUIDData.providerUserId = signUpData.thirdPartyId;
        cosmosSignupEarlyUIDData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        AccountModule.f16038d.m200240A(cosmosSignupEarlyUIDData, 0, true);
        return ChinaMobileController.m29593b().m29597a().m98248J(cosmosSignupEarlyUIDData);
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final C22306c<Token> m101760d(SignUpData signUpData, Pair<String, Long> pair) {
        if (signUpData.signUpType != AccountTempApi.SignUpType.chinaMobile) {
            UnicomSignupData unicomSignupData = new UnicomSignupData();
            unicomSignupData.providerToken = signUpData.thirdPartyToken;
            unicomSignupData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
            unicomSignupData.name = signUpData.name;
            unicomSignupData.birthdate = C17890jy.m143836n0(signUpData.birthdate.doubleValue());
            unicomSignupData.gender = TEnum.equals(signUpData.gender, "female") ? Gender.female : Gender.male;
            unicomSignupData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
            unicomSignupData.pictureUrl = (String) pair.first;
            unicomSignupData.setPassword(signUpData.password);
            if (TextUtils.isEmpty(signUpData.password)) {
                unicomSignupData.signupType = UserSource.no_password;
            }
            unicomSignupData.appsflyerId = signUpData.appsFlyerUID;
            AccountModule.f16038d.m200240A(unicomSignupData, C17367hp.m132326j(((Long) pair.second).longValue(), signUpData.newProfilePath), true);
            return ChinaMobileController.m29593b().m29599g().m137347A(unicomSignupData);
        }
        MobileSignupData mobileSignupData = new MobileSignupData();
        mobileSignupData.operatorType = m101759c();
        mobileSignupData.providerToken = signUpData.thirdPartyToken;
        mobileSignupData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        mobileSignupData.name = signUpData.name;
        mobileSignupData.birthdate = C17890jy.m143836n0(signUpData.birthdate.doubleValue());
        mobileSignupData.gender = TEnum.equals(signUpData.gender, "female") ? Gender.female : Gender.male;
        mobileSignupData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        mobileSignupData.pictureUrl = (String) pair.first;
        mobileSignupData.setPassword(signUpData.password);
        if (TextUtils.isEmpty(signUpData.password)) {
            mobileSignupData.signupType = UserSource.no_password;
        }
        mobileSignupData.appsflyerId = signUpData.appsFlyerUID;
        AccountModule.f16038d.m200240A(mobileSignupData, C17367hp.m132326j(((Long) pair.second).longValue(), signUpData.newProfilePath), true);
        return ChinaMobileController.m29593b().m29598f().m212955A(mobileSignupData);
    }
}
