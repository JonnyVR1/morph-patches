package p007l;

import com.p003p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p003p1.mobile.account_core.reponse_data.Data;
import com.p003p1.mobile.account_core.reponse_data.ThirdpartyToken;
import com.p003p1.mobile.account_core.reponse_data.Token;
import com.p003p1.mobile.account_core.reponse_data.User;
import com.p003p1.mobile.account_thirdparty.data.ThirdPartyActiveData;
import com.p003p1.mobile.account_thirdparty.data.ThirdPartyInfoData;
import com.p003p1.mobile.account_thirdparty.data.ThirdPartyRequestTokenData;
import com.p003p1.mobile.account_thirdparty.data.ThirdPartySigninData;
import com.p003p1.mobile.account_thirdparty.data.ThirdPartySignupData;
import com.p003p1.mobile.account_thirdparty.data.ThirdPartySignupEarlyUIDData;
import com.p003p1.mobile.account_thirdparty.data.ThirdPartyVerifyData;
import l.e30;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class pni0 extends zl5 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m10270A(ThirdPartySignupEarlyUIDData thirdPartySignupEarlyUIDData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("ThirdPartyService/thirdparty/stage/signup", thirdPartySignupEarlyUIDData);
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m10272C(ThirdPartySignupData thirdPartySignupData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("ThirdPartyService/thirdparty/signup", thirdPartySignupData);
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m10273D(ThirdPartyActiveData thirdPartyActiveData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("ThirdPartyService/thirdparty/activate", thirdPartyActiveData);
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ AccountEnvelop m10274E(AccountEnvelop accountEnvelop) {
        return accountEnvelop;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m10276G(ThirdPartySigninData thirdPartySigninData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("ThirdPartyService/thirdparty/signin", thirdPartySigninData);
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m10277H(ThirdPartyRequestTokenData thirdPartyRequestTokenData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.thirdpartyToken == null) {
            C0760ww.m11389a("ThirdPartyService/thirdparty/token", thirdPartyRequestTokenData);
        }
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m10278I(ThirdPartyVerifyData thirdPartyVerifyData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.data == null) {
            C0760ww.m11389a("ThirdPartyService/thirdparty/verify", thirdPartyVerifyData);
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ AccountEnvelop m10279J(AccountEnvelop accountEnvelop) {
        return accountEnvelop;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ AccountEnvelop m10280K(AccountEnvelop accountEnvelop) {
        return accountEnvelop;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m10283z(ThirdPartyInfoData thirdPartyInfoData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.user == null) {
            C0760ww.m11389a("ThirdPartyService/thirdparty/info", thirdPartyInfoData);
        }
    }

    /* JADX INFO: renamed from: M */
    public c<Token> m10284M(final ThirdPartyActiveData thirdPartyActiveData) {
        return x14.m11391b().m11394d("/thirdparty/activate", thirdPartyActiveData.toJson()).doOnNext(new e30() { // from class: l.jni0
            public final void call(Object obj) {
                pni0.m10273D(thirdPartyActiveData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.kni0
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public c<ThirdpartyToken> m10285N(String str) {
        final ThirdPartyRequestTokenData thirdPartyRequestTokenData = new ThirdPartyRequestTokenData();
        thirdPartyRequestTokenData.thirdPartyCode = str;
        return x14.m11391b().m11394d("/thirdparty/token", thirdPartyRequestTokenData.toJson()).doOnNext(new e30() { // from class: l.cni0
            public final void call(Object obj) {
                pni0.m10277H(thirdPartyRequestTokenData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.dni0
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.thirdpartyToken;
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public c<User> m10286O(final ThirdPartyInfoData thirdPartyInfoData) {
        return x14.m11391b().m11394d("/thirdparty/info", thirdPartyInfoData.toJson()).doOnNext(new e30() { // from class: l.lni0
            public final void call(Object obj) {
                pni0.m10283z(thirdPartyInfoData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.mni0
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.user;
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public c<AccountEnvelop> m10287P(final ThirdPartySigninData thirdPartySigninData) {
        return x14.m11391b().m11394d("/thirdparty/signin", thirdPartySigninData.toJson()).doOnNext(new e30() { // from class: l.bni0
            public final void call(Object obj) {
                pni0.m10276G(thirdPartySigninData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.gni0
            public final Object call(Object obj) {
                return pni0.m10274E((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public c<AccountEnvelop> m10288Q(final ThirdPartySignupData thirdPartySignupData) {
        return x14.m11391b().m11394d("/thirdparty/signup", thirdPartySignupData.toJson()).doOnNext(new e30() { // from class: l.nni0
            public final void call(Object obj) {
                pni0.m10272C(thirdPartySignupData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.oni0
            public final Object call(Object obj) {
                return pni0.m10279J((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public c<AccountEnvelop> m10289R(final ThirdPartySignupEarlyUIDData thirdPartySignupEarlyUIDData) {
        return x14.m11391b().m11394d("/thirdparty/stage/signup", thirdPartySignupEarlyUIDData.toJson()).doOnNext(new e30() { // from class: l.eni0
            public final void call(Object obj) {
                pni0.m10270A(thirdPartySignupEarlyUIDData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.fni0
            public final Object call(Object obj) {
                return pni0.m10280K((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public c<Boolean> m10290S(final ThirdPartyVerifyData thirdPartyVerifyData) {
        return x14.m11391b().m11394d("/thirdparty/verify", thirdPartyVerifyData.toJson()).doOnNext(new e30() { // from class: l.hni0
            public final void call(Object obj) {
                pni0.m10278I(thirdPartyVerifyData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.ini0
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).data.existed);
            }
        });
    }
}
