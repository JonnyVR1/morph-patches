package p007l;

import com.p003p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p003p1.mobile.account_core.reponse_data.Data;
import com.p003p1.mobile.account_core.reponse_data.Token;
import com.p003p1.mobile.account_mobile.data.MobileSignupData;
import l.e30;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class y500 extends zl5 {
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m11878y(MobileSignupData mobileSignupData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("MobileService/oneclick/signup", mobileSignupData);
        }
    }

    /* JADX INFO: renamed from: A */
    public c<Token> m11880A(final MobileSignupData mobileSignupData) {
        return x14.m11391b().m11394d("/oneclick/signup", mobileSignupData.toJson()).doOnNext(new e30() { // from class: l.w500
            public final void call(Object obj) {
                y500.m11878y(mobileSignupData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.x500
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }
}
