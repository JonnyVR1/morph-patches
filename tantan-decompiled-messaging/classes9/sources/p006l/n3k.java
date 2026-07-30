package p006l;

import com.p000p1.mobile.putong.account.api.C0001a;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p1.mobile.account_core.reponse_data.Token;
import com.p1.mobile.account_core.request_data.ThirdPartySigninBaseData;
import com.p1.mobile.account_google.data.GoogleActiveData;
import com.p1.mobile.account_google.data.GoogleSigninData;
import com.p1.mobile.account_google.data.GoogleVerifyData;
import com.p1.mobile.putong.data.SignInData;
import com.tantanapp.common.network.ApiExcep;
import l.n4k;
import l.roj0;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class n3k {

    /* JADX INFO: renamed from: a */
    public n4k f17464a = new n4k();

    /* JADX INFO: renamed from: l.n3k$a */
    public class C1039a implements w9j<AccountEnvelop, Token> {
        public C1039a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Token call(AccountEnvelop accountEnvelop) {
            zmi0.m28732k(accountEnvelop.data);
            return accountEnvelop.data.token;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.tantanapp.common.network.ApiExcep$Client$BadRequest */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ roj0 m19643a(Boolean bool) throws ApiExcep.Client.BadRequest {
        if (bool.booleanValue()) {
            throw new TantanException.Client.AccountService(TantanException.Client.AccountService.THIRD_PARTY_USER_EXIST, "THIRD_PARTY_USER_EXIST");
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: b */
    public c<Token> m19644b(SignInData signInData, boolean z) {
        if (z) {
            GoogleActiveData googleActiveData = new GoogleActiveData();
            googleActiveData.thirdPartyId = signInData.thirdPartyId;
            googleActiveData.thirdPartyToken = signInData.thirdPartyToken;
            C0001a.m105S0(googleActiveData, false);
            return this.f17464a.E(googleActiveData);
        }
        GoogleSigninData googleSigninData = new GoogleSigninData();
        ((ThirdPartySigninBaseData) googleSigninData).thirdPartyId = signInData.thirdPartyId;
        ((ThirdPartySigninBaseData) googleSigninData).thirdPartyToken = signInData.thirdPartyToken;
        googleSigninData.addExtraData("device", pk8.m21562M().toJson());
        C0001a.m107T0(googleSigninData, false, signInData.thirdEmail);
        return this.f17464a.F(googleSigninData).map(new C1039a());
    }

    /* JADX INFO: renamed from: c */
    public c<roj0> m19645c(String str, String str2) {
        GoogleVerifyData googleVerifyData = new GoogleVerifyData();
        googleVerifyData.thirdPartyId = str;
        googleVerifyData.thirdPartyToken = str2;
        return this.f17464a.G(googleVerifyData).map(new w9j() { // from class: l.m3k
            public final Object call(Object obj) {
                return n3k.m19643a((Boolean) obj);
            }
        });
    }
}
