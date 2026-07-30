package p006l;

import com.p000p1.mobile.putong.account.api.C0001a;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.account_core.reponse_data.Token;
import com.p1.mobile.account_core.request_data.ThirdPartySigninBaseData;
import com.p1.mobile.account_core.request_data.ThirdPartySignupBaseData;
import com.p1.mobile.account_facebook.data.FacebookActiveData;
import com.p1.mobile.account_facebook.data.FacebookSigninData;
import com.p1.mobile.account_facebook.data.FacebookSignupData;
import com.p1.mobile.account_facebook.data.FacebookVerifyData;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.SignUpData;
import com.tantanapp.common.network.ApiExcep;
import l.avf;
import l.roj0;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class stf {

    /* JADX INFO: renamed from: a */
    public avf f21650a = new avf();

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.tantanapp.common.network.ApiExcep$Client$BadRequest */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ roj0 m24193a(Boolean bool) throws ApiExcep.Client.BadRequest {
        if (bool.booleanValue()) {
            throw new TantanException.Client.AccountService(TantanException.Client.AccountService.THIRD_PARTY_USER_EXIST, "THIRD_PARTY_USER_EXIST");
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: b */
    public c<Token> m24194b(SignInData signInData, boolean z) {
        if (z) {
            FacebookActiveData facebookActiveData = new FacebookActiveData();
            facebookActiveData.thirdPartyId = signInData.thirdPartyId;
            facebookActiveData.thirdPartyToken = signInData.thirdPartyToken;
            C0001a.m105S0(facebookActiveData, false);
            return this.f21650a.G(facebookActiveData);
        }
        FacebookSigninData facebookSigninData = new FacebookSigninData();
        ((ThirdPartySigninBaseData) facebookSigninData).thirdPartyId = signInData.thirdPartyId;
        ((ThirdPartySigninBaseData) facebookSigninData).thirdPartyToken = signInData.thirdPartyToken;
        facebookSigninData.addExtraData("device", pk8.m21562M().toJson());
        C0001a.m105S0(facebookSigninData, false);
        return this.f21650a.H(facebookSigninData);
    }

    /* JADX INFO: renamed from: c */
    public c<Token> m24195c(SignUpData signUpData) {
        FacebookSignupData facebookSignupData = new FacebookSignupData();
        ((ThirdPartySignupBaseData) facebookSignupData).thirdPartyId = signUpData.thirdPartyId;
        ((ThirdPartySignupBaseData) facebookSignupData).thirdPartyToken = signUpData.thirdPartyToken;
        facebookSignupData.addExtraData("device", pk8.m21562M().toJson());
        return this.f21650a.I(facebookSignupData);
    }

    /* JADX INFO: renamed from: d */
    public c<roj0> m24196d(String str, String str2) {
        FacebookVerifyData facebookVerifyData = new FacebookVerifyData();
        facebookVerifyData.thirdPartyId = str;
        facebookVerifyData.thirdPartyToken = str2;
        return this.f21650a.J(facebookVerifyData).map(new w9j() { // from class: l.rtf
            public final Object call(Object obj) {
                return stf.m24193a((Boolean) obj);
            }
        });
    }
}
