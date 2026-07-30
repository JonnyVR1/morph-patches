package p149l;

import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p046p1.mobile.account_core.reponse_data.Data;
import com.p046p1.mobile.account_core.reponse_data.Token;
import com.p046p1.mobile.account_google.data.GoogleActiveData;
import com.p046p1.mobile.account_google.data.GoogleSigninData;
import com.p046p1.mobile.account_google.data.GoogleVerifyData;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes8.dex */
public class n4k extends zl5 {
    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m157876C(GoogleActiveData googleActiveData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("googleService/thirdparty/activate", googleActiveData);
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ AccountEnvelop m157877D(AccountEnvelop accountEnvelop) {
        return accountEnvelop;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m157878y(GoogleVerifyData googleVerifyData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.data == null) {
            C20975ww.m205790a("googleService/thirdparty/verify", googleVerifyData);
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m157879z(GoogleSigninData googleSigninData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("googleService/thirdparty/signin", googleSigninData);
        }
    }

    /* JADX INFO: renamed from: E */
    public C22306c<Token> m157880E(final GoogleActiveData googleActiveData) {
        return x14.m206656b().m206659d("/thirdparty/activate", googleActiveData.toJson()).doOnNext(new e30() { // from class: l.j4k
            @Override // p149l.e30
            public final void call(Object obj) {
                n4k.m157876C(googleActiveData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.k4k
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public C22306c<AccountEnvelop> m157881F(final GoogleSigninData googleSigninData) {
        return x14.m206656b().m206659d("/thirdparty/signin", googleSigninData.toJson()).doOnNext(new e30() { // from class: l.l4k
            @Override // p149l.e30
            public final void call(Object obj) {
                n4k.m157879z(googleSigninData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.m4k
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return n4k.m157877D((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public C22306c<Boolean> m157882G(final GoogleVerifyData googleVerifyData) {
        return x14.m206656b().m206659d("/thirdparty/verify", googleVerifyData.toJson()).doOnNext(new e30() { // from class: l.h4k
            @Override // p149l.e30
            public final void call(Object obj) {
                n4k.m157878y(googleVerifyData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.i4k
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).data.existed);
            }
        });
    }
}
