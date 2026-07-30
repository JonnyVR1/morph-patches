package p149l;

import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p046p1.mobile.account_core.reponse_data.Data;
import com.p046p1.mobile.account_core.reponse_data.Token;
import com.p046p1.mobile.account_unicom.data.UnicomSignupData;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes8.dex */
public class ioj0 extends zl5 {
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m137345y(UnicomSignupData unicomSignupData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("UnicomService/oneclick/signup", unicomSignupData);
        }
    }

    /* JADX INFO: renamed from: A */
    public C22306c<Token> m137347A(final UnicomSignupData unicomSignupData) {
        return x14.m206656b().m206659d("/oneclick/signup", unicomSignupData.toJson()).doOnNext(new e30() { // from class: l.goj0
            @Override // p149l.e30
            public final void call(Object obj) {
                ioj0.m137345y(unicomSignupData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.hoj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }
}
