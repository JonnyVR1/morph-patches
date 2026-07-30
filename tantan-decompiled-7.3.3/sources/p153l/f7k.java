package p153l;

import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p051p1.mobile.account_core.reponse_data.Data;
import com.p051p1.mobile.account_core.reponse_data.Token;
import com.p051p1.mobile.account_google.data.GoogleActiveData;
import com.p051p1.mobile.account_google.data.GoogleSigninData;
import com.p051p1.mobile.account_google.data.GoogleVerifyData;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes8.dex */
public class f7k extends cn5 {
    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m124468C(GoogleActiveData googleActiveData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("googleService/thirdparty/activate", googleActiveData);
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ AccountEnvelop m124469D(AccountEnvelop accountEnvelop) {
        return accountEnvelop;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m124470y(GoogleVerifyData googleVerifyData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.data == null) {
            C19682qw.m178399a("googleService/thirdparty/verify", googleVerifyData);
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m124471z(GoogleSigninData googleSigninData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("googleService/thirdparty/signin", googleSigninData);
        }
    }

    /* JADX INFO: renamed from: E */
    public C22421c<Token> m124472E(final GoogleActiveData googleActiveData) {
        return w24.m204501b().m204504d("/thirdparty/activate", googleActiveData.toJson()).doOnNext(new y20() { // from class: l.b7k
            @Override // p153l.y20
            public final void call(Object obj) {
                f7k.m124468C(googleActiveData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.c7k
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public C22421c<AccountEnvelop> m124473F(final GoogleSigninData googleSigninData) {
        return w24.m204501b().m204504d("/thirdparty/signin", googleSigninData.toJson()).doOnNext(new y20() { // from class: l.d7k
            @Override // p153l.y20
            public final void call(Object obj) {
                f7k.m124471z(googleSigninData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.e7k
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return f7k.m124469D((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public C22421c<Boolean> m124474G(final GoogleVerifyData googleVerifyData) {
        return w24.m204501b().m204504d("/thirdparty/verify", googleVerifyData.toJson()).doOnNext(new y20() { // from class: l.z6k
            @Override // p153l.y20
            public final void call(Object obj) {
                f7k.m124470y(googleVerifyData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.a7k
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).data.existed);
            }
        });
    }
}
