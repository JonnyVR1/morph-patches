package p153l;

import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p051p1.mobile.account_core.reponse_data.Data;
import com.p051p1.mobile.account_core.reponse_data.Token;
import com.p051p1.mobile.account_cosmos.data.CosmosActiveData;
import com.p051p1.mobile.account_cosmos.data.CosmosBindPhoneData;
import com.p051p1.mobile.account_cosmos.data.CosmosSignInData;
import com.p051p1.mobile.account_cosmos.data.CosmosSignupEarlyUIDData;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes8.dex */
public class orb extends cn5 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m168860A(CosmosSignInData cosmosSignInData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("CosmosService/oneclick/signin", cosmosSignInData);
        }
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m168861B(CosmosBindPhoneData cosmosBindPhoneData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("CosmosService/oneclick/bind-phone", cosmosBindPhoneData);
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m168862C(CosmosActiveData cosmosActiveData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("CosmosService/oneclick/activate", cosmosActiveData);
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m168863D(CosmosSignupEarlyUIDData cosmosSignupEarlyUIDData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("CosmosService/oneclick/stage/signup", cosmosSignupEarlyUIDData);
        }
    }

    /* JADX INFO: renamed from: G */
    public C22421c<Token> m168868G(final CosmosActiveData cosmosActiveData) {
        return w24.m204501b().m204504d("/oneclick/activate", cosmosActiveData.toJson()).doOnNext(new y20() { // from class: l.irb
            @Override // p153l.y20
            public final void call(Object obj) {
                orb.m168862C(cosmosActiveData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.jrb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public C22421c<Token> m168869H(final CosmosBindPhoneData cosmosBindPhoneData) {
        return w24.m204501b().m204504d("/oneclick/bind-phone", cosmosBindPhoneData.toJson()).doOnNext(new y20() { // from class: l.grb
            @Override // p153l.y20
            public final void call(Object obj) {
                orb.m168861B(cosmosBindPhoneData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.hrb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public C22421c<Token> m168870I(final CosmosSignInData cosmosSignInData) {
        return w24.m204501b().m204504d("/oneclick/signin", cosmosSignInData.toJson()).doOnNext(new y20() { // from class: l.krb
            @Override // p153l.y20
            public final void call(Object obj) {
                orb.m168860A(cosmosSignInData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.lrb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public C22421c<Token> m168871J(final CosmosSignupEarlyUIDData cosmosSignupEarlyUIDData) {
        return w24.m204501b().m204504d("/oneclick/stage/signup", cosmosSignupEarlyUIDData.toJson()).doOnNext(new y20() { // from class: l.mrb
            @Override // p153l.y20
            public final void call(Object obj) {
                orb.m168863D(cosmosSignupEarlyUIDData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.nrb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }
}
