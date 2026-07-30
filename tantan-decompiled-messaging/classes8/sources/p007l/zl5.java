package p007l;

import com.p003p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p003p1.mobile.account_core.reponse_data.Data;
import com.p003p1.mobile.account_core.reponse_data.H5Token;
import com.p003p1.mobile.account_core.request_data.ApplyData;
import com.p003p1.mobile.account_core.request_data.DeactivatedData;
import com.p003p1.mobile.account_core.request_data.DeleteAccountData;
import com.p003p1.mobile.account_core.request_data.H5Data;
import com.p003p1.mobile.account_core.request_data.ReportData;
import com.p003p1.mobile.account_core.request_data.SignupEarlyUIDData;
import com.p003p1.mobile.account_core.request_data.StatusData;
import com.p003p1.mobile.account_core.request_data.VerifyPasswordData;
import l.e30;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class zl5 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m12010b(SignupEarlyUIDData signupEarlyUIDData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.meta == null) {
            C0760ww.m11389a("CommonService//stage/signup/info", signupEarlyUIDData);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m12011c(String str, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null) {
            C0760ww.m11390b("CommonService/inactivate-account/reason", str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m12013e(VerifyPasswordData verifyPasswordData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.meta == null) {
            C0760ww.m11389a("CommonService/verify-password", verifyPasswordData);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m12014f(H5Data h5Data, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.h5Token == null) {
            C0760ww.m11389a("CommonService/oauth2/h5-token", h5Data);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m12015g(ReportData reportData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.meta == null) {
            C0760ww.m11389a("CommonService/event/report", reportData);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m12016h(StatusData statusData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null) {
            C0760ww.m11389a("CommonService/service/status", statusData);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m12017i(AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.lastApply == null) {
            C0760ww.m11390b("CommonService/download-data?clientId", "get");
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m12019k(DeleteAccountData deleteAccountData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null) {
            C0760ww.m11389a("CommonService/delete-account", deleteAccountData);
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m12021m(ApplyData applyData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.meta == null) {
            C0760ww.m11389a("CommonService/download-data/apply", applyData);
        }
    }

    /* JADX INFO: renamed from: p */
    public c<Boolean> m12024p(final ApplyData applyData) {
        return x14.m11391b().m11394d("/download-data/apply", applyData.toJson()).doOnNext(new e30() { // from class: l.jl5
            public final void call(Object obj) {
                zl5.m12021m(applyData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.pl5
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).meta.code == 200000);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public c<AccountEnvelop> m12025q(final String str) {
        DeactivatedData deactivatedData = new DeactivatedData();
        deactivatedData.reason = str;
        return x14.m11391b().m11394d("/inactivate-account", deactivatedData.toJson()).doOnNext(new e30() { // from class: l.ol5
            public final void call(Object obj) {
                zl5.m12011c(str, (AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public c<AccountEnvelop> m12026r(final DeleteAccountData deleteAccountData) {
        return x14.m11391b().m11394d("/delete-account", deleteAccountData.toJson()).doOnNext(new e30() { // from class: l.nl5
            public final void call(Object obj) {
                zl5.m12019k(deleteAccountData, (AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public c<H5Token> m12027s() {
        final H5Data h5Data = new H5Data();
        return x14.m11391b().m11394d("/oauth2/h5-token", h5Data.toJson()).doOnNext(new e30() { // from class: l.sl5
            public final void call(Object obj) {
                zl5.m12014f(h5Data, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.tl5
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.h5Token;
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public c<Long> m12028t() {
        return x14.m11391b().m11392a("/download-data?clientId=" + C0811zv.f5544b).doOnNext(new e30() { // from class: l.ql5
            public final void call(Object obj) {
                zl5.m12017i((AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.rl5
            public final Object call(Object obj) {
                return Long.valueOf(((AccountEnvelop) obj).data.lastApply.time);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public c<Boolean> m12029u(final ReportData reportData) {
        return x14.m11391b().m11394d("/event/report", reportData.toJson()).doOnNext(new e30() { // from class: l.ul5
            public final void call(Object obj) {
                zl5.m12015g(reportData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.vl5
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).meta.code == 200000);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public c<Boolean> m12030v(final SignupEarlyUIDData signupEarlyUIDData) {
        return x14.m11391b().m11394d("/stage/signup/info", signupEarlyUIDData.toJson()).doOnNext(new e30() { // from class: l.ll5
            public final void call(Object obj) {
                zl5.m12010b(signupEarlyUIDData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.ml5
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).meta.code == 200000);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public c<AccountEnvelop> m12031w(final StatusData statusData) {
        return x14.m11391b().m11394d("/service/status", statusData.toJson()).doOnNext(new e30() { // from class: l.wl5
            public final void call(Object obj) {
                zl5.m12016h(statusData, (AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public c<Boolean> m12032x(final VerifyPasswordData verifyPasswordData) {
        return x14.m11391b().m11394d("/verify-password", verifyPasswordData.toJson()).doOnNext(new e30() { // from class: l.xl5
            public final void call(Object obj) {
                zl5.m12013e(verifyPasswordData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.kl5
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).meta.code == 200000);
            }
        });
    }
}
