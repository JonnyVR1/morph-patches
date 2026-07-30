package p153l;

import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p051p1.mobile.account_core.reponse_data.Data;
import com.p051p1.mobile.account_core.reponse_data.ThirdpartyToken;
import com.p051p1.mobile.account_core.reponse_data.Token;
import com.p051p1.mobile.account_core.reponse_data.User;
import com.p051p1.mobile.account_thirdparty.data.ThirdPartyActiveData;
import com.p051p1.mobile.account_thirdparty.data.ThirdPartyInfoData;
import com.p051p1.mobile.account_thirdparty.data.ThirdPartyRequestTokenData;
import com.p051p1.mobile.account_thirdparty.data.ThirdPartySigninData;
import com.p051p1.mobile.account_thirdparty.data.ThirdPartySignupData;
import com.p051p1.mobile.account_thirdparty.data.ThirdPartySignupEarlyUIDData;
import com.p051p1.mobile.account_thirdparty.data.ThirdPartyVerifyData;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes8.dex */
public class qwi0 extends cn5 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m178478A(ThirdPartySignupEarlyUIDData thirdPartySignupEarlyUIDData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("ThirdPartyService/thirdparty/stage/signup", thirdPartySignupEarlyUIDData);
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m178480C(ThirdPartySignupData thirdPartySignupData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("ThirdPartyService/thirdparty/signup", thirdPartySignupData);
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m178481D(ThirdPartyActiveData thirdPartyActiveData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("ThirdPartyService/thirdparty/activate", thirdPartyActiveData);
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ AccountEnvelop m178482E(AccountEnvelop accountEnvelop) {
        return accountEnvelop;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m178484G(ThirdPartySigninData thirdPartySigninData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("ThirdPartyService/thirdparty/signin", thirdPartySigninData);
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m178485H(ThirdPartyRequestTokenData thirdPartyRequestTokenData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.thirdpartyToken == null) {
            C19682qw.m178399a("ThirdPartyService/thirdparty/token", thirdPartyRequestTokenData);
        }
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m178486I(ThirdPartyVerifyData thirdPartyVerifyData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.data == null) {
            C19682qw.m178399a("ThirdPartyService/thirdparty/verify", thirdPartyVerifyData);
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ AccountEnvelop m178487J(AccountEnvelop accountEnvelop) {
        return accountEnvelop;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ AccountEnvelop m178488K(AccountEnvelop accountEnvelop) {
        return accountEnvelop;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m178491z(ThirdPartyInfoData thirdPartyInfoData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.user == null) {
            C19682qw.m178399a("ThirdPartyService/thirdparty/info", thirdPartyInfoData);
        }
    }

    /* JADX INFO: renamed from: M */
    public C22421c<Token> m178492M(final ThirdPartyActiveData thirdPartyActiveData) {
        return w24.m204501b().m204504d("/thirdparty/activate", thirdPartyActiveData.toJson()).doOnNext(new y20() { // from class: l.kwi0
            @Override // p153l.y20
            public final void call(Object obj) {
                qwi0.m178481D(thirdPartyActiveData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.lwi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public C22421c<ThirdpartyToken> m178493N(String str) {
        final ThirdPartyRequestTokenData thirdPartyRequestTokenData = new ThirdPartyRequestTokenData();
        thirdPartyRequestTokenData.thirdPartyCode = str;
        return w24.m204501b().m204504d("/thirdparty/token", thirdPartyRequestTokenData.toJson()).doOnNext(new y20() { // from class: l.dwi0
            @Override // p153l.y20
            public final void call(Object obj) {
                qwi0.m178485H(thirdPartyRequestTokenData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.ewi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.thirdpartyToken;
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public C22421c<User> m178494O(final ThirdPartyInfoData thirdPartyInfoData) {
        return w24.m204501b().m204504d("/thirdparty/info", thirdPartyInfoData.toJson()).doOnNext(new y20() { // from class: l.mwi0
            @Override // p153l.y20
            public final void call(Object obj) {
                qwi0.m178491z(thirdPartyInfoData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.nwi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.user;
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public C22421c<AccountEnvelop> m178495P(final ThirdPartySigninData thirdPartySigninData) {
        return w24.m204501b().m204504d("/thirdparty/signin", thirdPartySigninData.toJson()).doOnNext(new y20() { // from class: l.cwi0
            @Override // p153l.y20
            public final void call(Object obj) {
                qwi0.m178484G(thirdPartySigninData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.hwi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return qwi0.m178482E((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public C22421c<AccountEnvelop> m178496Q(final ThirdPartySignupData thirdPartySignupData) {
        return w24.m204501b().m204504d("/thirdparty/signup", thirdPartySignupData.toJson()).doOnNext(new y20() { // from class: l.owi0
            @Override // p153l.y20
            public final void call(Object obj) {
                qwi0.m178480C(thirdPartySignupData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.pwi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return qwi0.m178487J((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public C22421c<AccountEnvelop> m178497R(final ThirdPartySignupEarlyUIDData thirdPartySignupEarlyUIDData) {
        return w24.m204501b().m204504d("/thirdparty/stage/signup", thirdPartySignupEarlyUIDData.toJson()).doOnNext(new y20() { // from class: l.fwi0
            @Override // p153l.y20
            public final void call(Object obj) {
                qwi0.m178478A(thirdPartySignupEarlyUIDData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.gwi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return qwi0.m178488K((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public C22421c<Boolean> m178498S(final ThirdPartyVerifyData thirdPartyVerifyData) {
        return w24.m204501b().m204504d("/thirdparty/verify", thirdPartyVerifyData.toJson()).doOnNext(new y20() { // from class: l.iwi0
            @Override // p153l.y20
            public final void call(Object obj) {
                qwi0.m178486I(thirdPartyVerifyData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.jwi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).data.existed);
            }
        });
    }
}
