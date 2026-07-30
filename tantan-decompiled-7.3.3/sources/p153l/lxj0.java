package p153l;

import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p051p1.mobile.account_core.reponse_data.Data;
import com.p051p1.mobile.account_core.reponse_data.Token;
import com.p051p1.mobile.account_unicom.data.UnicomSignupData;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes8.dex */
public class lxj0 extends cn5 {
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m156202y(UnicomSignupData unicomSignupData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("UnicomService/oneclick/signup", unicomSignupData);
        }
    }

    /* JADX INFO: renamed from: A */
    public C22421c<Token> m156204A(final UnicomSignupData unicomSignupData) {
        return w24.m204501b().m204504d("/oneclick/signup", unicomSignupData.toJson()).doOnNext(new y20() { // from class: l.jxj0
            @Override // p153l.y20
            public final void call(Object obj) {
                lxj0.m156202y(unicomSignupData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.kxj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }
}
