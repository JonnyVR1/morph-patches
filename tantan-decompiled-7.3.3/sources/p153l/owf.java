package p153l;

import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p051p1.mobile.account_core.reponse_data.Data;
import com.p051p1.mobile.account_core.reponse_data.Token;
import com.p051p1.mobile.account_facebook.data.FacebookActiveData;
import com.p051p1.mobile.account_facebook.data.FacebookSigninData;
import com.p051p1.mobile.account_facebook.data.FacebookSignupData;
import com.p051p1.mobile.account_facebook.data.FacebookVerifyData;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes8.dex */
public class owf extends cn5 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m169552A(FacebookSigninData facebookSigninData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("FacebookService/thirdparty/signin", facebookSigninData);
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m169555D(FacebookVerifyData facebookVerifyData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.data == null) {
            C19682qw.m178399a("FacebookService/thirdparty/verify", facebookVerifyData);
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m169556E(FacebookActiveData facebookActiveData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("FacebookService/thirdparty/activate", facebookActiveData);
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m169557F(FacebookSignupData facebookSignupData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("FacebookService/thirdparty/stage/signup", facebookSignupData);
        }
    }

    /* JADX INFO: renamed from: G */
    public C22421c<Token> m169560G(final FacebookActiveData facebookActiveData) {
        return w24.m204501b().m204504d("/thirdparty/activate", facebookActiveData.toJson()).doOnNext(new y20() { // from class: l.mwf
            @Override // p153l.y20
            public final void call(Object obj) {
                owf.m169556E(facebookActiveData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.nwf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public C22421c<Token> m169561H(final FacebookSigninData facebookSigninData) {
        return w24.m204501b().m204504d("/thirdparty/signin", facebookSigninData.toJson()).doOnNext(new y20() { // from class: l.kwf
            @Override // p153l.y20
            public final void call(Object obj) {
                owf.m169552A(facebookSigninData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.lwf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public C22421c<Token> m169562I(final FacebookSignupData facebookSignupData) {
        return w24.m204501b().m204504d("/thirdparty/stage/signup", facebookSignupData.toJson()).doOnNext(new y20() { // from class: l.iwf
            @Override // p153l.y20
            public final void call(Object obj) {
                owf.m169557F(facebookSignupData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.jwf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public C22421c<Boolean> m169563J(final FacebookVerifyData facebookVerifyData) {
        return w24.m204501b().m204504d("/thirdparty/verify", facebookVerifyData.toJson()).doOnNext(new y20() { // from class: l.gwf
            @Override // p153l.y20
            public final void call(Object obj) {
                owf.m169555D(facebookVerifyData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.hwf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).data.existed);
            }
        });
    }
}
