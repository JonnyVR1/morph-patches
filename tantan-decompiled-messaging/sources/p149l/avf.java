package p149l;

import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p046p1.mobile.account_core.reponse_data.Data;
import com.p046p1.mobile.account_core.reponse_data.Token;
import com.p046p1.mobile.account_facebook.data.FacebookActiveData;
import com.p046p1.mobile.account_facebook.data.FacebookSigninData;
import com.p046p1.mobile.account_facebook.data.FacebookSignupData;
import com.p046p1.mobile.account_facebook.data.FacebookVerifyData;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes8.dex */
public class avf extends zl5 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m99164A(FacebookSigninData facebookSigninData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("FacebookService/thirdparty/signin", facebookSigninData);
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m99167D(FacebookVerifyData facebookVerifyData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.data == null) {
            C20975ww.m205790a("FacebookService/thirdparty/verify", facebookVerifyData);
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m99168E(FacebookActiveData facebookActiveData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("FacebookService/thirdparty/activate", facebookActiveData);
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m99169F(FacebookSignupData facebookSignupData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("FacebookService/thirdparty/stage/signup", facebookSignupData);
        }
    }

    /* JADX INFO: renamed from: G */
    public C22306c<Token> m99172G(final FacebookActiveData facebookActiveData) {
        return x14.m206656b().m206659d("/thirdparty/activate", facebookActiveData.toJson()).doOnNext(new e30() { // from class: l.yuf
            @Override // p149l.e30
            public final void call(Object obj) {
                avf.m99168E(facebookActiveData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.zuf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public C22306c<Token> m99173H(final FacebookSigninData facebookSigninData) {
        return x14.m206656b().m206659d("/thirdparty/signin", facebookSigninData.toJson()).doOnNext(new e30() { // from class: l.wuf
            @Override // p149l.e30
            public final void call(Object obj) {
                avf.m99164A(facebookSigninData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.xuf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public C22306c<Token> m99174I(final FacebookSignupData facebookSignupData) {
        return x14.m206656b().m206659d("/thirdparty/stage/signup", facebookSignupData.toJson()).doOnNext(new e30() { // from class: l.uuf
            @Override // p149l.e30
            public final void call(Object obj) {
                avf.m99169F(facebookSignupData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.vuf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public C22306c<Boolean> m99175J(final FacebookVerifyData facebookVerifyData) {
        return x14.m206656b().m206659d("/thirdparty/verify", facebookVerifyData.toJson()).doOnNext(new e30() { // from class: l.suf
            @Override // p149l.e30
            public final void call(Object obj) {
                avf.m99167D(facebookVerifyData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.tuf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).data.existed);
            }
        });
    }
}
