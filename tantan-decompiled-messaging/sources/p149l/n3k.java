package p149l;

import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p046p1.mobile.account_core.reponse_data.Token;
import com.p046p1.mobile.account_google.data.GoogleActiveData;
import com.p046p1.mobile.account_google.data.GoogleSigninData;
import com.p046p1.mobile.account_google.data.GoogleVerifyData;
import com.p046p1.mobile.putong.account.api.C4575a;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.SignInData;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class n3k {

    /* JADX INFO: renamed from: a */
    public n4k f136998a = new n4k();

    /* JADX INFO: renamed from: l.n3k$a */
    public class C18618a implements w9j<AccountEnvelop, Token> {
        public C18618a() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Token call(AccountEnvelop accountEnvelop) {
            zmi0.m219338k(accountEnvelop.data);
            return accountEnvelop.data.token;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ roj0 m157760a(Boolean bool) {
        if (bool.booleanValue()) {
            throw new TantanException.Client.AccountService(TantanException.Client.AccountService.THIRD_PARTY_USER_EXIST, "THIRD_PARTY_USER_EXIST");
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: b */
    public C22306c<Token> m157761b(SignInData signInData, boolean z) {
        if (z) {
            GoogleActiveData googleActiveData = new GoogleActiveData();
            googleActiveData.thirdPartyId = signInData.thirdPartyId;
            googleActiveData.thirdPartyToken = signInData.thirdPartyToken;
            C4575a.m28210S0(googleActiveData, false);
            return this.f136998a.m157880E(googleActiveData);
        }
        GoogleSigninData googleSigninData = new GoogleSigninData();
        googleSigninData.thirdPartyId = signInData.thirdPartyId;
        googleSigninData.thirdPartyToken = signInData.thirdPartyToken;
        googleSigninData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        C4575a.m28212T0(googleSigninData, false, signInData.thirdEmail);
        return this.f136998a.m157881F(googleSigninData).map(new C18618a());
    }

    /* JADX INFO: renamed from: c */
    public C22306c<roj0> m157762c(String str, String str2) {
        GoogleVerifyData googleVerifyData = new GoogleVerifyData();
        googleVerifyData.thirdPartyId = str;
        googleVerifyData.thirdPartyToken = str2;
        return this.f136998a.m157882G(googleVerifyData).map(new w9j() { // from class: l.m3k
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return n3k.m157760a((Boolean) obj);
            }
        });
    }
}
