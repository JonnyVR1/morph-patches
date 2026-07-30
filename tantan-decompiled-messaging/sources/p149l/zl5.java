package p149l;

import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p046p1.mobile.account_core.reponse_data.Data;
import com.p046p1.mobile.account_core.reponse_data.H5Token;
import com.p046p1.mobile.account_core.request_data.ApplyData;
import com.p046p1.mobile.account_core.request_data.DeactivatedData;
import com.p046p1.mobile.account_core.request_data.DeleteAccountData;
import com.p046p1.mobile.account_core.request_data.H5Data;
import com.p046p1.mobile.account_core.request_data.ReportData;
import com.p046p1.mobile.account_core.request_data.SignupEarlyUIDData;
import com.p046p1.mobile.account_core.request_data.StatusData;
import com.p046p1.mobile.account_core.request_data.VerifyPasswordData;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes8.dex */
public class zl5 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m219223b(SignupEarlyUIDData signupEarlyUIDData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.meta == null) {
            C20975ww.m205790a("CommonService//stage/signup/info", signupEarlyUIDData);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m219224c(String str, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null) {
            C20975ww.m205791b("CommonService/inactivate-account/reason", str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m219226e(VerifyPasswordData verifyPasswordData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.meta == null) {
            C20975ww.m205790a("CommonService/verify-password", verifyPasswordData);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m219227f(H5Data h5Data, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.h5Token == null) {
            C20975ww.m205790a("CommonService/oauth2/h5-token", h5Data);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m219228g(ReportData reportData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.meta == null) {
            C20975ww.m205790a("CommonService/event/report", reportData);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m219229h(StatusData statusData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null) {
            C20975ww.m205790a("CommonService/service/status", statusData);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m219230i(AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.lastApply == null) {
            C20975ww.m205791b("CommonService/download-data?clientId", "get");
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m219232k(DeleteAccountData deleteAccountData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null) {
            C20975ww.m205790a("CommonService/delete-account", deleteAccountData);
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m219234m(ApplyData applyData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.meta == null) {
            C20975ww.m205790a("CommonService/download-data/apply", applyData);
        }
    }

    /* JADX INFO: renamed from: p */
    public C22306c<Boolean> m219237p(final ApplyData applyData) {
        return x14.m206656b().m206659d("/download-data/apply", applyData.toJson()).doOnNext(new e30() { // from class: l.jl5
            @Override // p149l.e30
            public final void call(Object obj) {
                zl5.m219234m(applyData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.pl5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).meta.code == 200000);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public C22306c<AccountEnvelop> m219238q(final String str) {
        DeactivatedData deactivatedData = new DeactivatedData();
        deactivatedData.reason = str;
        return x14.m206656b().m206659d("/inactivate-account", deactivatedData.toJson()).doOnNext(new e30() { // from class: l.ol5
            @Override // p149l.e30
            public final void call(Object obj) {
                zl5.m219224c(str, (AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public C22306c<AccountEnvelop> m219239r(final DeleteAccountData deleteAccountData) {
        return x14.m206656b().m206659d("/delete-account", deleteAccountData.toJson()).doOnNext(new e30() { // from class: l.nl5
            @Override // p149l.e30
            public final void call(Object obj) {
                zl5.m219232k(deleteAccountData, (AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public C22306c<H5Token> m219240s() {
        final H5Data h5Data = new H5Data();
        return x14.m206656b().m206659d("/oauth2/h5-token", h5Data.toJson()).doOnNext(new e30() { // from class: l.sl5
            @Override // p149l.e30
            public final void call(Object obj) {
                zl5.m219227f(h5Data, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.tl5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.h5Token;
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public C22306c<Long> m219241t() {
        return x14.m206656b().m206657a("/download-data?clientId=" + C21777zv.f204926b).doOnNext(new e30() { // from class: l.ql5
            @Override // p149l.e30
            public final void call(Object obj) {
                zl5.m219230i((AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.rl5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Long.valueOf(((AccountEnvelop) obj).data.lastApply.time);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public C22306c<Boolean> m219242u(final ReportData reportData) {
        return x14.m206656b().m206659d("/event/report", reportData.toJson()).doOnNext(new e30() { // from class: l.ul5
            @Override // p149l.e30
            public final void call(Object obj) {
                zl5.m219228g(reportData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.vl5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).meta.code == 200000);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public C22306c<Boolean> m219243v(final SignupEarlyUIDData signupEarlyUIDData) {
        return x14.m206656b().m206659d("/stage/signup/info", signupEarlyUIDData.toJson()).doOnNext(new e30() { // from class: l.ll5
            @Override // p149l.e30
            public final void call(Object obj) {
                zl5.m219223b(signupEarlyUIDData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.ml5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).meta.code == 200000);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public C22306c<AccountEnvelop> m219244w(final StatusData statusData) {
        return x14.m206656b().m206659d("/service/status", statusData.toJson()).doOnNext(new e30() { // from class: l.wl5
            @Override // p149l.e30
            public final void call(Object obj) {
                zl5.m219229h(statusData, (AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public C22306c<Boolean> m219245x(final VerifyPasswordData verifyPasswordData) {
        return x14.m206656b().m206659d("/verify-password", verifyPasswordData.toJson()).doOnNext(new e30() { // from class: l.xl5
            @Override // p149l.e30
            public final void call(Object obj) {
                zl5.m219226e(verifyPasswordData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.kl5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).meta.code == 200000);
            }
        });
    }
}
