package p153l;

import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p051p1.mobile.account_core.reponse_data.Data;
import com.p051p1.mobile.account_core.reponse_data.Token;
import com.p051p1.mobile.account_phone.data.PhoneActiveData;
import com.p051p1.mobile.account_phone.data.PhoneBindPhoneData;
import com.p051p1.mobile.account_phone.data.PhoneChangePhoneData;
import com.p051p1.mobile.account_phone.data.PhoneData;
import com.p051p1.mobile.account_phone.data.PhoneResetPasswordData;
import com.p051p1.mobile.account_phone.data.PhoneSignupData;
import com.p051p1.mobile.account_phone.data.PhoneSignupEarlyUIDData;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes8.dex */
public class b270 extends cn5 {
    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m102120B(PhoneActiveData phoneActiveData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("PhoneService/phone/activate", phoneActiveData);
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m102121C(PhoneChangePhoneData phoneChangePhoneData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("PhoneService/change-phone", phoneChangePhoneData);
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m102123E(PhoneData phoneData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.data == null) {
            C19682qw.m178399a("PhoneService/phone/verify", phoneData);
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m102124F(PhoneSignupEarlyUIDData phoneSignupEarlyUIDData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("PhoneService/phone/stage/signup", phoneSignupEarlyUIDData);
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m102128J(PhoneBindPhoneData phoneBindPhoneData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("PhoneService/bind-phone", phoneBindPhoneData);
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m102130L(PhoneSignupData phoneSignupData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("PhoneService/phone/signup", phoneSignupData);
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m102132z(PhoneResetPasswordData phoneResetPasswordData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("PhoneService/reset-password", phoneResetPasswordData);
        }
    }

    /* JADX INFO: renamed from: M */
    public C22421c<Token> m102133M(final PhoneActiveData phoneActiveData) {
        return w24.m204501b().m204504d("/phone/activate", phoneActiveData.toJson()).doOnNext(new y20() { // from class: l.z170
            @Override // p153l.y20
            public final void call(Object obj) {
                b270.m102120B(phoneActiveData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.a270
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public C22421c<Token> m102134N(final PhoneBindPhoneData phoneBindPhoneData) {
        return w24.m204501b().m204504d("/bind-phone", phoneBindPhoneData.toJson()).doOnNext(new y20() { // from class: l.n170
            @Override // p153l.y20
            public final void call(Object obj) {
                b270.m102128J(phoneBindPhoneData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.s170
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public C22421c<Token> m102135O(final PhoneChangePhoneData phoneChangePhoneData) {
        return w24.m204501b().m204504d("/change-phone", phoneChangePhoneData.toJson()).doOnNext(new y20() { // from class: l.t170
            @Override // p153l.y20
            public final void call(Object obj) {
                b270.m102121C(phoneChangePhoneData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.u170
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public C22421c<Token> m102136P(final PhoneResetPasswordData phoneResetPasswordData) {
        return w24.m204501b().m204504d("/reset-password", phoneResetPasswordData.toJson()).doOnNext(new y20() { // from class: l.x170
            @Override // p153l.y20
            public final void call(Object obj) {
                b270.m102132z(phoneResetPasswordData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.y170
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public C22421c<Token> m102137Q(final PhoneSignupData phoneSignupData) {
        return w24.m204501b().m204504d("/phone/signup", phoneSignupData.toJson()).doOnNext(new y20() { // from class: l.o170
            @Override // p153l.y20
            public final void call(Object obj) {
                b270.m102130L(phoneSignupData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.p170
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public C22421c<Token> m102138R(final PhoneSignupEarlyUIDData phoneSignupEarlyUIDData) {
        return w24.m204501b().m204504d("/phone/stage/signup", phoneSignupEarlyUIDData.toJson()).doOnNext(new y20() { // from class: l.q170
            @Override // p153l.y20
            public final void call(Object obj) {
                b270.m102124F(phoneSignupEarlyUIDData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.r170
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public C22421c<Boolean> m102139S(final PhoneData phoneData) {
        return w24.m204501b().m204504d("/phone/verify", phoneData.toJson()).doOnNext(new y20() { // from class: l.v170
            @Override // p153l.y20
            public final void call(Object obj) {
                b270.m102123E(phoneData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.w170
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).data.existed);
            }
        });
    }
}
