package p007l;

import com.p003p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p003p1.mobile.account_core.reponse_data.Data;
import com.p003p1.mobile.account_core.reponse_data.Token;
import com.p003p1.mobile.account_facebook.data.FacebookActiveData;
import com.p003p1.mobile.account_facebook.data.FacebookSigninData;
import com.p003p1.mobile.account_facebook.data.FacebookSignupData;
import com.p003p1.mobile.account_facebook.data.FacebookVerifyData;
import l.e30;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class avf extends zl5 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m8600A(FacebookSigninData facebookSigninData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("FacebookService/thirdparty/signin", facebookSigninData);
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m8603D(FacebookVerifyData facebookVerifyData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.data == null) {
            C0760ww.m11389a("FacebookService/thirdparty/verify", facebookVerifyData);
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m8604E(FacebookActiveData facebookActiveData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("FacebookService/thirdparty/activate", facebookActiveData);
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m8605F(FacebookSignupData facebookSignupData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("FacebookService/thirdparty/stage/signup", facebookSignupData);
        }
    }

    /* JADX INFO: renamed from: G */
    public c<Token> m8608G(final FacebookActiveData facebookActiveData) {
        return x14.m11391b().m11394d("/thirdparty/activate", facebookActiveData.toJson()).doOnNext(new e30() { // from class: l.yuf
            public final void call(Object obj) {
                avf.m8604E(facebookActiveData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.zuf
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public c<Token> m8609H(final FacebookSigninData facebookSigninData) {
        return x14.m11391b().m11394d("/thirdparty/signin", facebookSigninData.toJson()).doOnNext(new e30() { // from class: l.wuf
            public final void call(Object obj) {
                avf.m8600A(facebookSigninData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.xuf
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public c<Token> m8610I(final FacebookSignupData facebookSignupData) {
        return x14.m11391b().m11394d("/thirdparty/stage/signup", facebookSignupData.toJson()).doOnNext(new e30() { // from class: l.uuf
            public final void call(Object obj) {
                avf.m8605F(facebookSignupData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.vuf
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public c<Boolean> m8611J(final FacebookVerifyData facebookVerifyData) {
        return x14.m11391b().m11394d("/thirdparty/verify", facebookVerifyData.toJson()).doOnNext(new e30() { // from class: l.suf
            public final void call(Object obj) {
                avf.m8603D(facebookVerifyData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.tuf
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).data.existed);
            }
        });
    }
}
