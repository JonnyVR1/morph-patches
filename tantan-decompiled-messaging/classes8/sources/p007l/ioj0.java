package p007l;

import com.p003p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p003p1.mobile.account_core.reponse_data.Data;
import com.p003p1.mobile.account_core.reponse_data.Token;
import com.p003p1.mobile.account_unicom.data.UnicomSignupData;
import l.e30;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ioj0 extends zl5 {
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m9419y(UnicomSignupData unicomSignupData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("UnicomService/oneclick/signup", unicomSignupData);
        }
    }

    /* JADX INFO: renamed from: A */
    public c<Token> m9421A(final UnicomSignupData unicomSignupData) {
        return x14.m11391b().m11394d("/oneclick/signup", unicomSignupData.toJson()).doOnNext(new e30() { // from class: l.goj0
            public final void call(Object obj) {
                ioj0.m9419y(unicomSignupData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.hoj0
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }
}
