package p153l;

import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p051p1.mobile.account_core.reponse_data.Data;
import com.p051p1.mobile.account_core.reponse_data.Token;
import com.p051p1.mobile.account_mobile.data.MobileSignupData;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes8.dex */
public class ie00 extends cn5 {
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m139582y(MobileSignupData mobileSignupData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("MobileService/oneclick/signup", mobileSignupData);
        }
    }

    /* JADX INFO: renamed from: A */
    public C22421c<Token> m139584A(final MobileSignupData mobileSignupData) {
        return w24.m204501b().m204504d("/oneclick/signup", mobileSignupData.toJson()).doOnNext(new y20() { // from class: l.ge00
            @Override // p153l.y20
            public final void call(Object obj) {
                ie00.m139582y(mobileSignupData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.he00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }
}
