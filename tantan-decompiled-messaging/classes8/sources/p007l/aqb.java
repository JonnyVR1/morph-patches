package p007l;

import com.p003p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p003p1.mobile.account_core.reponse_data.Data;
import com.p003p1.mobile.account_core.reponse_data.Token;
import com.p003p1.mobile.account_cosmos.data.CosmosActiveData;
import com.p003p1.mobile.account_cosmos.data.CosmosBindPhoneData;
import com.p003p1.mobile.account_cosmos.data.CosmosSignInData;
import com.p003p1.mobile.account_cosmos.data.CosmosSignupEarlyUIDData;
import l.e30;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class aqb extends zl5 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m8570A(CosmosSignInData cosmosSignInData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("CosmosService/oneclick/signin", cosmosSignInData);
        }
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m8571B(CosmosBindPhoneData cosmosBindPhoneData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("CosmosService/oneclick/bind-phone", cosmosBindPhoneData);
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m8572C(CosmosActiveData cosmosActiveData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("CosmosService/oneclick/activate", cosmosActiveData);
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m8573D(CosmosSignupEarlyUIDData cosmosSignupEarlyUIDData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("CosmosService/oneclick/stage/signup", cosmosSignupEarlyUIDData);
        }
    }

    /* JADX INFO: renamed from: G */
    public c<Token> m8578G(final CosmosActiveData cosmosActiveData) {
        return x14.m11391b().m11394d("/oneclick/activate", cosmosActiveData.toJson()).doOnNext(new e30() { // from class: l.upb
            public final void call(Object obj) {
                aqb.m8572C(cosmosActiveData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.vpb
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public c<Token> m8579H(final CosmosBindPhoneData cosmosBindPhoneData) {
        return x14.m11391b().m11394d("/oneclick/bind-phone", cosmosBindPhoneData.toJson()).doOnNext(new e30() { // from class: l.spb
            public final void call(Object obj) {
                aqb.m8571B(cosmosBindPhoneData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.tpb
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public c<Token> m8580I(final CosmosSignInData cosmosSignInData) {
        return x14.m11391b().m11394d("/oneclick/signin", cosmosSignInData.toJson()).doOnNext(new e30() { // from class: l.wpb
            public final void call(Object obj) {
                aqb.m8570A(cosmosSignInData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.xpb
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public c<Token> m8581J(final CosmosSignupEarlyUIDData cosmosSignupEarlyUIDData) {
        return x14.m11391b().m11394d("/oneclick/stage/signup", cosmosSignupEarlyUIDData.toJson()).doOnNext(new e30() { // from class: l.ypb
            public final void call(Object obj) {
                aqb.m8573D(cosmosSignupEarlyUIDData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.zpb
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }
}
