package p007l;

import com.p003p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p003p1.mobile.account_core.reponse_data.Data;
import com.p003p1.mobile.account_core.reponse_data.Token;
import com.p003p1.mobile.account_google.data.GoogleActiveData;
import com.p003p1.mobile.account_google.data.GoogleSigninData;
import com.p003p1.mobile.account_google.data.GoogleVerifyData;
import l.e30;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class n4k extends zl5 {
    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m9943C(GoogleActiveData googleActiveData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("googleService/thirdparty/activate", googleActiveData);
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ AccountEnvelop m9944D(AccountEnvelop accountEnvelop) {
        return accountEnvelop;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m9945y(GoogleVerifyData googleVerifyData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.data == null) {
            C0760ww.m11389a("googleService/thirdparty/verify", googleVerifyData);
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m9946z(GoogleSigninData googleSigninData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("googleService/thirdparty/signin", googleSigninData);
        }
    }

    /* JADX INFO: renamed from: E */
    public c<Token> m9947E(final GoogleActiveData googleActiveData) {
        return x14.m11391b().m11394d("/thirdparty/activate", googleActiveData.toJson()).doOnNext(new e30() { // from class: l.j4k
            public final void call(Object obj) {
                n4k.m9943C(googleActiveData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.k4k
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public c<AccountEnvelop> m9948F(final GoogleSigninData googleSigninData) {
        return x14.m11391b().m11394d("/thirdparty/signin", googleSigninData.toJson()).doOnNext(new e30() { // from class: l.l4k
            public final void call(Object obj) {
                n4k.m9946z(googleSigninData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.m4k
            public final Object call(Object obj) {
                return n4k.m9944D((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public c<Boolean> m9949G(final GoogleVerifyData googleVerifyData) {
        return x14.m11391b().m11394d("/thirdparty/verify", googleVerifyData.toJson()).doOnNext(new e30() { // from class: l.h4k
            public final void call(Object obj) {
                n4k.m9945y(googleVerifyData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.i4k
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).data.existed);
            }
        });
    }
}
