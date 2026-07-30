package p149l;

import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p046p1.mobile.account_core.reponse_data.Data;
import com.p046p1.mobile.account_core.reponse_data.Token;
import com.p046p1.mobile.account_mobile.data.MobileSignupData;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes8.dex */
public class y500 extends zl5 {
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m212953y(MobileSignupData mobileSignupData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("MobileService/oneclick/signup", mobileSignupData);
        }
    }

    /* JADX INFO: renamed from: A */
    public C22306c<Token> m212955A(final MobileSignupData mobileSignupData) {
        return x14.m206656b().m206659d("/oneclick/signup", mobileSignupData.toJson()).doOnNext(new e30() { // from class: l.w500
            @Override // p149l.e30
            public final void call(Object obj) {
                y500.m212953y(mobileSignupData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.x500
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }
}
