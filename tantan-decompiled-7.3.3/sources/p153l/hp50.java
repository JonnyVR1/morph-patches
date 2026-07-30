package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.account_core.reponse_data.Token;
import com.p051p1.mobile.account_core.request_data.Gender;
import com.p051p1.mobile.account_core.request_data.OperatorType;
import com.p051p1.mobile.account_core.request_data.ThirdPartyAccount;
import com.p051p1.mobile.account_cosmos.data.CosmosActiveData;
import com.p051p1.mobile.account_cosmos.data.CosmosBindPhoneData;
import com.p051p1.mobile.account_cosmos.data.CosmosSignInData;
import com.p051p1.mobile.account_cosmos.data.CosmosSignupEarlyUIDData;
import com.p051p1.mobile.account_mobile.data.MobileSignupData;
import com.p051p1.mobile.account_unicom.data.UnicomSignupData;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.api.C4726a;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.UserSource;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class hp50 {

    /* JADX INFO: renamed from: l.hp50$a */
    public static /* synthetic */ class C17529a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f110982a;

        static {
            int[] iArr = new int[ChinaMobileController.MobileType.values().length];
            f110982a = iArr;
            try {
                iArr[ChinaMobileController.MobileType.mobile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f110982a[ChinaMobileController.MobileType.unicom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f110982a[ChinaMobileController.MobileType.telecom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public C22421c<Token> m136470b(String str, String str2, String str3, SignInGrantType signInGrantType) {
        CosmosBindPhoneData cosmosBindPhoneData = new CosmosBindPhoneData();
        cosmosBindPhoneData.providerToken = str;
        cosmosBindPhoneData.accessCode = str2;
        cosmosBindPhoneData.operatorType = m136471c();
        return ChinaMobileController.m30591b().m30595a().m168869H(cosmosBindPhoneData);
    }

    /* JADX INFO: renamed from: c */
    public OperatorType m136471c() {
        int i = C17529a.f110982a[ChinaMobileController.m30594e().ordinal()];
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
    public C22421c<Token> m136473e(SignInData signInData, boolean z) {
        if (z) {
            CosmosActiveData cosmosActiveData = new CosmosActiveData();
            cosmosActiveData.operatorType = m136471c();
            cosmosActiveData.accessCode = signInData.thirdPartyAccessCode;
            cosmosActiveData.providerToken = signInData.thirdPartyToken;
            C4726a.m29209S0(cosmosActiveData, false);
            return ChinaMobileController.m30591b().m30595a().m168868G(cosmosActiveData);
        }
        CosmosSignInData cosmosSignInData = new CosmosSignInData();
        cosmosSignInData.operatorType = m136471c();
        cosmosSignInData.accessCode = signInData.thirdPartyAccessCode;
        cosmosSignInData.providerToken = signInData.thirdPartyToken;
        cosmosSignInData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        C4726a.m29209S0(cosmosSignInData, true);
        return ChinaMobileController.m30591b().m30595a().m168870I(cosmosSignInData);
    }

    /* JADX INFO: renamed from: f */
    public C22421c<Token> m136474f(final SignUpData signUpData) {
        return AccountModule.f16757d.m174026Q(signUpData).flatMap(new qcj() { // from class: l.gp50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f105433a.m136472d(signUpData, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public C22421c<Token> m136475g(SignUpData signUpData, SignInGrantType signInGrantType) {
        CosmosSignupEarlyUIDData cosmosSignupEarlyUIDData = new CosmosSignupEarlyUIDData();
        cosmosSignupEarlyUIDData.operatorType = m136471c();
        cosmosSignupEarlyUIDData.providerToken = signUpData.thirdPartyToken;
        cosmosSignupEarlyUIDData.accessCode = signUpData.thirdPartyAccessCode;
        if (!TextUtils.isEmpty(signUpData.thirdPartyId)) {
            ThirdPartyAccount thirdPartyAccount = new ThirdPartyAccount();
            thirdPartyAccount.f15530id = signUpData.thirdPartyId;
            thirdPartyAccount.token = signUpData.thirdPartyToken;
            cosmosSignupEarlyUIDData.thirdPartyAccount = thirdPartyAccount;
        }
        cosmosSignupEarlyUIDData.providerUserId = signUpData.thirdPartyId;
        cosmosSignupEarlyUIDData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        AccountModule.f16757d.m174010A(cosmosSignupEarlyUIDData, 0, true);
        return ChinaMobileController.m30591b().m30595a().m168871J(cosmosSignupEarlyUIDData);
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final C22421c<Token> m136472d(SignUpData signUpData, Pair<String, Long> pair) {
        if (signUpData.signUpType != AccountTempApi.SignUpType.chinaMobile) {
            UnicomSignupData unicomSignupData = new UnicomSignupData();
            unicomSignupData.providerToken = signUpData.thirdPartyToken;
            unicomSignupData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
            unicomSignupData.name = signUpData.name;
            unicomSignupData.birthdate = C16649dy.m118579n0(signUpData.birthdate.doubleValue());
            unicomSignupData.gender = TEnum.equals(signUpData.gender, "female") ? Gender.female : Gender.male;
            unicomSignupData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
            unicomSignupData.pictureUrl = (String) pair.first;
            unicomSignupData.setPassword(signUpData.password);
            if (TextUtils.isEmpty(signUpData.password)) {
                unicomSignupData.signupType = UserSource.no_password;
            }
            unicomSignupData.appsflyerId = signUpData.appsFlyerUID;
            AccountModule.f16757d.m174010A(unicomSignupData, C16330cp.m111724j(((Long) pair.second).longValue(), signUpData.newProfilePath), true);
            return ChinaMobileController.m30591b().m30597g().m156204A(unicomSignupData);
        }
        MobileSignupData mobileSignupData = new MobileSignupData();
        mobileSignupData.operatorType = m136471c();
        mobileSignupData.providerToken = signUpData.thirdPartyToken;
        mobileSignupData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        mobileSignupData.name = signUpData.name;
        mobileSignupData.birthdate = C16649dy.m118579n0(signUpData.birthdate.doubleValue());
        mobileSignupData.gender = TEnum.equals(signUpData.gender, "female") ? Gender.female : Gender.male;
        mobileSignupData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        mobileSignupData.pictureUrl = (String) pair.first;
        mobileSignupData.setPassword(signUpData.password);
        if (TextUtils.isEmpty(signUpData.password)) {
            mobileSignupData.signupType = UserSource.no_password;
        }
        mobileSignupData.appsflyerId = signUpData.appsFlyerUID;
        AccountModule.f16757d.m174010A(mobileSignupData, C16330cp.m111724j(((Long) pair.second).longValue(), signUpData.newProfilePath), true);
        return ChinaMobileController.m30591b().m30596f().m139584A(mobileSignupData);
    }
}
