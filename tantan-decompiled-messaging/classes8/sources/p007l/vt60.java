package p007l;

import com.p003p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p003p1.mobile.account_core.reponse_data.Data;
import com.p003p1.mobile.account_core.reponse_data.Token;
import com.p003p1.mobile.account_phone.data.PhoneActiveData;
import com.p003p1.mobile.account_phone.data.PhoneBindPhoneData;
import com.p003p1.mobile.account_phone.data.PhoneChangePhoneData;
import com.p003p1.mobile.account_phone.data.PhoneData;
import com.p003p1.mobile.account_phone.data.PhoneResetPasswordData;
import com.p003p1.mobile.account_phone.data.PhoneSignupData;
import com.p003p1.mobile.account_phone.data.PhoneSignupEarlyUIDData;
import l.e30;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class vt60 extends zl5 {
    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m11278B(PhoneActiveData phoneActiveData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("PhoneService/phone/activate", phoneActiveData);
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m11279C(PhoneChangePhoneData phoneChangePhoneData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("PhoneService/change-phone", phoneChangePhoneData);
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m11281E(PhoneData phoneData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.data == null) {
            C0760ww.m11389a("PhoneService/phone/verify", phoneData);
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m11282F(PhoneSignupEarlyUIDData phoneSignupEarlyUIDData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("PhoneService/phone/stage/signup", phoneSignupEarlyUIDData);
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m11286J(PhoneBindPhoneData phoneBindPhoneData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("PhoneService/bind-phone", phoneBindPhoneData);
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m11288L(PhoneSignupData phoneSignupData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("PhoneService/phone/signup", phoneSignupData);
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m11290z(PhoneResetPasswordData phoneResetPasswordData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C0760ww.m11389a("PhoneService/reset-password", phoneResetPasswordData);
        }
    }

    /* JADX INFO: renamed from: M */
    public c<Token> m11291M(final PhoneActiveData phoneActiveData) {
        return x14.m11391b().m11394d("/phone/activate", phoneActiveData.toJson()).doOnNext(new e30() { // from class: l.tt60
            public final void call(Object obj) {
                vt60.m11278B(phoneActiveData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.ut60
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public c<Token> m11292N(final PhoneBindPhoneData phoneBindPhoneData) {
        return x14.m11391b().m11394d("/bind-phone", phoneBindPhoneData.toJson()).doOnNext(new e30() { // from class: l.ht60
            public final void call(Object obj) {
                vt60.m11286J(phoneBindPhoneData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.mt60
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public c<Token> m11293O(final PhoneChangePhoneData phoneChangePhoneData) {
        return x14.m11391b().m11394d("/change-phone", phoneChangePhoneData.toJson()).doOnNext(new e30() { // from class: l.nt60
            public final void call(Object obj) {
                vt60.m11279C(phoneChangePhoneData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.ot60
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public c<Token> m11294P(final PhoneResetPasswordData phoneResetPasswordData) {
        return x14.m11391b().m11394d("/reset-password", phoneResetPasswordData.toJson()).doOnNext(new e30() { // from class: l.rt60
            public final void call(Object obj) {
                vt60.m11290z(phoneResetPasswordData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.st60
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public c<Token> m11295Q(final PhoneSignupData phoneSignupData) {
        return x14.m11391b().m11394d("/phone/signup", phoneSignupData.toJson()).doOnNext(new e30() { // from class: l.it60
            public final void call(Object obj) {
                vt60.m11288L(phoneSignupData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.jt60
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public c<Token> m11296R(final PhoneSignupEarlyUIDData phoneSignupEarlyUIDData) {
        return x14.m11391b().m11394d("/phone/stage/signup", phoneSignupEarlyUIDData.toJson()).doOnNext(new e30() { // from class: l.kt60
            public final void call(Object obj) {
                vt60.m11282F(phoneSignupEarlyUIDData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.lt60
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public c<Boolean> m11297S(final PhoneData phoneData) {
        return x14.m11391b().m11394d("/phone/verify", phoneData.toJson()).doOnNext(new e30() { // from class: l.pt60
            public final void call(Object obj) {
                vt60.m11281E(phoneData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.qt60
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).data.existed);
            }
        });
    }
}
