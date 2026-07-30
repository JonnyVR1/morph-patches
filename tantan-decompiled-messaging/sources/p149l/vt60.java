package p149l;

import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p046p1.mobile.account_core.reponse_data.Data;
import com.p046p1.mobile.account_core.reponse_data.Token;
import com.p046p1.mobile.account_phone.data.PhoneActiveData;
import com.p046p1.mobile.account_phone.data.PhoneBindPhoneData;
import com.p046p1.mobile.account_phone.data.PhoneChangePhoneData;
import com.p046p1.mobile.account_phone.data.PhoneData;
import com.p046p1.mobile.account_phone.data.PhoneResetPasswordData;
import com.p046p1.mobile.account_phone.data.PhoneSignupData;
import com.p046p1.mobile.account_phone.data.PhoneSignupEarlyUIDData;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes8.dex */
public class vt60 extends zl5 {
    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m199921B(PhoneActiveData phoneActiveData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("PhoneService/phone/activate", phoneActiveData);
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m199922C(PhoneChangePhoneData phoneChangePhoneData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("PhoneService/change-phone", phoneChangePhoneData);
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m199924E(PhoneData phoneData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.data == null) {
            C20975ww.m205790a("PhoneService/phone/verify", phoneData);
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m199925F(PhoneSignupEarlyUIDData phoneSignupEarlyUIDData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("PhoneService/phone/stage/signup", phoneSignupEarlyUIDData);
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m199929J(PhoneBindPhoneData phoneBindPhoneData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("PhoneService/bind-phone", phoneBindPhoneData);
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m199931L(PhoneSignupData phoneSignupData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("PhoneService/phone/signup", phoneSignupData);
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m199933z(PhoneResetPasswordData phoneResetPasswordData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("PhoneService/reset-password", phoneResetPasswordData);
        }
    }

    /* JADX INFO: renamed from: M */
    public C22306c<Token> m199934M(final PhoneActiveData phoneActiveData) {
        return x14.m206656b().m206659d("/phone/activate", phoneActiveData.toJson()).doOnNext(new e30() { // from class: l.tt60
            @Override // p149l.e30
            public final void call(Object obj) {
                vt60.m199921B(phoneActiveData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.ut60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public C22306c<Token> m199935N(final PhoneBindPhoneData phoneBindPhoneData) {
        return x14.m206656b().m206659d("/bind-phone", phoneBindPhoneData.toJson()).doOnNext(new e30() { // from class: l.ht60
            @Override // p149l.e30
            public final void call(Object obj) {
                vt60.m199929J(phoneBindPhoneData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.mt60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public C22306c<Token> m199936O(final PhoneChangePhoneData phoneChangePhoneData) {
        return x14.m206656b().m206659d("/change-phone", phoneChangePhoneData.toJson()).doOnNext(new e30() { // from class: l.nt60
            @Override // p149l.e30
            public final void call(Object obj) {
                vt60.m199922C(phoneChangePhoneData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.ot60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public C22306c<Token> m199937P(final PhoneResetPasswordData phoneResetPasswordData) {
        return x14.m206656b().m206659d("/reset-password", phoneResetPasswordData.toJson()).doOnNext(new e30() { // from class: l.rt60
            @Override // p149l.e30
            public final void call(Object obj) {
                vt60.m199933z(phoneResetPasswordData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.st60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public C22306c<Token> m199938Q(final PhoneSignupData phoneSignupData) {
        return x14.m206656b().m206659d("/phone/signup", phoneSignupData.toJson()).doOnNext(new e30() { // from class: l.it60
            @Override // p149l.e30
            public final void call(Object obj) {
                vt60.m199931L(phoneSignupData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.jt60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public C22306c<Token> m199939R(final PhoneSignupEarlyUIDData phoneSignupEarlyUIDData) {
        return x14.m206656b().m206659d("/phone/stage/signup", phoneSignupEarlyUIDData.toJson()).doOnNext(new e30() { // from class: l.kt60
            @Override // p149l.e30
            public final void call(Object obj) {
                vt60.m199925F(phoneSignupEarlyUIDData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.lt60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public C22306c<Boolean> m199940S(final PhoneData phoneData) {
        return x14.m206656b().m206659d("/phone/verify", phoneData.toJson()).doOnNext(new e30() { // from class: l.pt60
            @Override // p149l.e30
            public final void call(Object obj) {
                vt60.m199924E(phoneData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.qt60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).data.existed);
            }
        });
    }
}
