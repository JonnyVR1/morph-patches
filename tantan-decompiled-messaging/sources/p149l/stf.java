package p149l;

import com.p046p1.mobile.account_core.reponse_data.Token;
import com.p046p1.mobile.account_facebook.data.FacebookActiveData;
import com.p046p1.mobile.account_facebook.data.FacebookSigninData;
import com.p046p1.mobile.account_facebook.data.FacebookSignupData;
import com.p046p1.mobile.account_facebook.data.FacebookVerifyData;
import com.p046p1.mobile.putong.account.api.C4575a;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignUpData;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class stf {

    /* JADX INFO: renamed from: a */
    public avf f166338a = new avf();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ roj0 m185916a(Boolean bool) {
        if (bool.booleanValue()) {
            throw new TantanException.Client.AccountService(TantanException.Client.AccountService.THIRD_PARTY_USER_EXIST, "THIRD_PARTY_USER_EXIST");
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: b */
    public C22306c<Token> m185917b(SignInData signInData, boolean z) {
        if (z) {
            FacebookActiveData facebookActiveData = new FacebookActiveData();
            facebookActiveData.thirdPartyId = signInData.thirdPartyId;
            facebookActiveData.thirdPartyToken = signInData.thirdPartyToken;
            C4575a.m28210S0(facebookActiveData, false);
            return this.f166338a.m99172G(facebookActiveData);
        }
        FacebookSigninData facebookSigninData = new FacebookSigninData();
        facebookSigninData.thirdPartyId = signInData.thirdPartyId;
        facebookSigninData.thirdPartyToken = signInData.thirdPartyToken;
        facebookSigninData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        C4575a.m28210S0(facebookSigninData, false);
        return this.f166338a.m99173H(facebookSigninData);
    }

    /* JADX INFO: renamed from: c */
    public C22306c<Token> m185918c(SignUpData signUpData) {
        FacebookSignupData facebookSignupData = new FacebookSignupData();
        facebookSignupData.thirdPartyId = signUpData.thirdPartyId;
        facebookSignupData.thirdPartyToken = signUpData.thirdPartyToken;
        facebookSignupData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        return this.f166338a.m99174I(facebookSignupData);
    }

    /* JADX INFO: renamed from: d */
    public C22306c<roj0> m185919d(String str, String str2) {
        FacebookVerifyData facebookVerifyData = new FacebookVerifyData();
        facebookVerifyData.thirdPartyId = str;
        facebookVerifyData.thirdPartyToken = str2;
        return this.f166338a.m99175J(facebookVerifyData).map(new w9j() { // from class: l.rtf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return stf.m185916a((Boolean) obj);
            }
        });
    }
}
