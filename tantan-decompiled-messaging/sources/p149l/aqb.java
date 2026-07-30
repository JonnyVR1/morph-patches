package p149l;

import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p046p1.mobile.account_core.reponse_data.Data;
import com.p046p1.mobile.account_core.reponse_data.Token;
import com.p046p1.mobile.account_cosmos.data.CosmosActiveData;
import com.p046p1.mobile.account_cosmos.data.CosmosBindPhoneData;
import com.p046p1.mobile.account_cosmos.data.CosmosSignInData;
import com.p046p1.mobile.account_cosmos.data.CosmosSignupEarlyUIDData;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes8.dex */
public class aqb extends zl5 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m98237A(CosmosSignInData cosmosSignInData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("CosmosService/oneclick/signin", cosmosSignInData);
        }
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m98238B(CosmosBindPhoneData cosmosBindPhoneData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("CosmosService/oneclick/bind-phone", cosmosBindPhoneData);
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m98239C(CosmosActiveData cosmosActiveData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("CosmosService/oneclick/activate", cosmosActiveData);
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m98240D(CosmosSignupEarlyUIDData cosmosSignupEarlyUIDData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("CosmosService/oneclick/stage/signup", cosmosSignupEarlyUIDData);
        }
    }

    /* JADX INFO: renamed from: G */
    public C22306c<Token> m98245G(final CosmosActiveData cosmosActiveData) {
        return x14.m206656b().m206659d("/oneclick/activate", cosmosActiveData.toJson()).doOnNext(new e30() { // from class: l.upb
            @Override // p149l.e30
            public final void call(Object obj) {
                aqb.m98239C(cosmosActiveData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.vpb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public C22306c<Token> m98246H(final CosmosBindPhoneData cosmosBindPhoneData) {
        return x14.m206656b().m206659d("/oneclick/bind-phone", cosmosBindPhoneData.toJson()).doOnNext(new e30() { // from class: l.spb
            @Override // p149l.e30
            public final void call(Object obj) {
                aqb.m98238B(cosmosBindPhoneData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.tpb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public C22306c<Token> m98247I(final CosmosSignInData cosmosSignInData) {
        return x14.m206656b().m206659d("/oneclick/signin", cosmosSignInData.toJson()).doOnNext(new e30() { // from class: l.wpb
            @Override // p149l.e30
            public final void call(Object obj) {
                aqb.m98237A(cosmosSignInData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.xpb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public C22306c<Token> m98248J(final CosmosSignupEarlyUIDData cosmosSignupEarlyUIDData) {
        return x14.m206656b().m206659d("/oneclick/stage/signup", cosmosSignupEarlyUIDData.toJson()).doOnNext(new e30() { // from class: l.ypb
            @Override // p149l.e30
            public final void call(Object obj) {
                aqb.m98240D(cosmosSignupEarlyUIDData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.zpb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }
}
