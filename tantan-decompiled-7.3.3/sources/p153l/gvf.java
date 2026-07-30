package p153l;

import com.p051p1.mobile.account_core.reponse_data.Token;
import com.p051p1.mobile.account_facebook.data.FacebookActiveData;
import com.p051p1.mobile.account_facebook.data.FacebookSigninData;
import com.p051p1.mobile.account_facebook.data.FacebookSignupData;
import com.p051p1.mobile.account_facebook.data.FacebookVerifyData;
import com.p051p1.mobile.putong.account.api.C4726a;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignUpData;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class gvf {

    /* JADX INFO: renamed from: a */
    public owf f106624a = new owf();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ uxj0 m132542a(Boolean bool) {
        if (bool.booleanValue()) {
            throw new TantanException.Client.AccountService(TantanException.Client.AccountService.THIRD_PARTY_USER_EXIST, "THIRD_PARTY_USER_EXIST");
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: b */
    public C22421c<Token> m132543b(SignInData signInData, boolean z) {
        if (z) {
            FacebookActiveData facebookActiveData = new FacebookActiveData();
            facebookActiveData.thirdPartyId = signInData.thirdPartyId;
            facebookActiveData.thirdPartyToken = signInData.thirdPartyToken;
            C4726a.m29209S0(facebookActiveData, false);
            return this.f106624a.m169560G(facebookActiveData);
        }
        FacebookSigninData facebookSigninData = new FacebookSigninData();
        facebookSigninData.thirdPartyId = signInData.thirdPartyId;
        facebookSigninData.thirdPartyToken = signInData.thirdPartyToken;
        facebookSigninData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        C4726a.m29209S0(facebookSigninData, false);
        return this.f106624a.m169561H(facebookSigninData);
    }

    /* JADX INFO: renamed from: c */
    public C22421c<Token> m132544c(SignUpData signUpData) {
        FacebookSignupData facebookSignupData = new FacebookSignupData();
        facebookSignupData.thirdPartyId = signUpData.thirdPartyId;
        facebookSignupData.thirdPartyToken = signUpData.thirdPartyToken;
        facebookSignupData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        return this.f106624a.m169562I(facebookSignupData);
    }

    /* JADX INFO: renamed from: d */
    public C22421c<uxj0> m132545d(String str, String str2) {
        FacebookVerifyData facebookVerifyData = new FacebookVerifyData();
        facebookVerifyData.thirdPartyId = str;
        facebookVerifyData.thirdPartyToken = str2;
        return this.f106624a.m169563J(facebookVerifyData).map(new qcj() { // from class: l.fvf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gvf.m132542a((Boolean) obj);
            }
        });
    }
}
