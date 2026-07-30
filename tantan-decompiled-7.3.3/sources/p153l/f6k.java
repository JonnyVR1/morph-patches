package p153l;

import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p051p1.mobile.account_core.reponse_data.Token;
import com.p051p1.mobile.account_google.data.GoogleActiveData;
import com.p051p1.mobile.account_google.data.GoogleSigninData;
import com.p051p1.mobile.account_google.data.GoogleVerifyData;
import com.p051p1.mobile.putong.account.api.C4726a;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.SignInData;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class f6k {

    /* JADX INFO: renamed from: a */
    public f7k f97409a = new f7k();

    /* JADX INFO: renamed from: l.f6k$a */
    public class C16912a implements qcj<AccountEnvelop, Token> {
        public C16912a() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Token call(AccountEnvelop accountEnvelop) {
            awi0.m100656k(accountEnvelop.data);
            return accountEnvelop.data.token;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ uxj0 m124277a(Boolean bool) {
        if (bool.booleanValue()) {
            throw new TantanException.Client.AccountService(TantanException.Client.AccountService.THIRD_PARTY_USER_EXIST, "THIRD_PARTY_USER_EXIST");
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: b */
    public C22421c<Token> m124278b(SignInData signInData, boolean z) {
        if (z) {
            GoogleActiveData googleActiveData = new GoogleActiveData();
            googleActiveData.thirdPartyId = signInData.thirdPartyId;
            googleActiveData.thirdPartyToken = signInData.thirdPartyToken;
            C4726a.m29209S0(googleActiveData, false);
            return this.f97409a.m124472E(googleActiveData);
        }
        GoogleSigninData googleSigninData = new GoogleSigninData();
        googleSigninData.thirdPartyId = signInData.thirdPartyId;
        googleSigninData.thirdPartyToken = signInData.thirdPartyToken;
        googleSigninData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        C4726a.m29211T0(googleSigninData, false, signInData.thirdEmail);
        return this.f97409a.m124473F(googleSigninData).map(new C16912a());
    }

    /* JADX INFO: renamed from: c */
    public C22421c<uxj0> m124279c(String str, String str2) {
        GoogleVerifyData googleVerifyData = new GoogleVerifyData();
        googleVerifyData.thirdPartyId = str;
        googleVerifyData.thirdPartyToken = str2;
        return this.f97409a.m124474G(googleVerifyData).map(new qcj() { // from class: l.e6k
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return f6k.m124277a((Boolean) obj);
            }
        });
    }
}
