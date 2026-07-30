package p153l;

import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p051p1.mobile.account_core.reponse_data.Data;
import com.p051p1.mobile.account_core.reponse_data.H5Token;
import com.p051p1.mobile.account_core.request_data.ApplyData;
import com.p051p1.mobile.account_core.request_data.DeactivatedData;
import com.p051p1.mobile.account_core.request_data.DeleteAccountData;
import com.p051p1.mobile.account_core.request_data.H5Data;
import com.p051p1.mobile.account_core.request_data.ReportData;
import com.p051p1.mobile.account_core.request_data.SignupEarlyUIDData;
import com.p051p1.mobile.account_core.request_data.StatusData;
import com.p051p1.mobile.account_core.request_data.VerifyPasswordData;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes8.dex */
public class cn5 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m111428b(SignupEarlyUIDData signupEarlyUIDData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.meta == null) {
            C19682qw.m178399a("CommonService//stage/signup/info", signupEarlyUIDData);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m111429c(String str, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null) {
            C19682qw.m178400b("CommonService/inactivate-account/reason", str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m111431e(VerifyPasswordData verifyPasswordData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.meta == null) {
            C19682qw.m178399a("CommonService/verify-password", verifyPasswordData);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m111432f(H5Data h5Data, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.h5Token == null) {
            C19682qw.m178399a("CommonService/oauth2/h5-token", h5Data);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m111433g(ReportData reportData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.meta == null) {
            C19682qw.m178399a("CommonService/event/report", reportData);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m111434h(StatusData statusData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null) {
            C19682qw.m178399a("CommonService/service/status", statusData);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m111435i(AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.lastApply == null) {
            C19682qw.m178400b("CommonService/download-data?clientId", "get");
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m111437k(DeleteAccountData deleteAccountData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null) {
            C19682qw.m178399a("CommonService/delete-account", deleteAccountData);
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m111439m(ApplyData applyData, AccountEnvelop accountEnvelop) {
        if (accountEnvelop == null || accountEnvelop.meta == null) {
            C19682qw.m178399a("CommonService/download-data/apply", applyData);
        }
    }

    /* JADX INFO: renamed from: p */
    public C22421c<Boolean> m111442p(final ApplyData applyData) {
        return w24.m204501b().m204504d("/download-data/apply", applyData.toJson()).doOnNext(new y20() { // from class: l.mm5
            @Override // p153l.y20
            public final void call(Object obj) {
                cn5.m111439m(applyData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.sm5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).meta.code == 200000);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public C22421c<AccountEnvelop> m111443q(final String str) {
        DeactivatedData deactivatedData = new DeactivatedData();
        deactivatedData.reason = str;
        return w24.m204501b().m204504d("/inactivate-account", deactivatedData.toJson()).doOnNext(new y20() { // from class: l.rm5
            @Override // p153l.y20
            public final void call(Object obj) {
                cn5.m111429c(str, (AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public C22421c<AccountEnvelop> m111444r(final DeleteAccountData deleteAccountData) {
        return w24.m204501b().m204504d("/delete-account", deleteAccountData.toJson()).doOnNext(new y20() { // from class: l.qm5
            @Override // p153l.y20
            public final void call(Object obj) {
                cn5.m111437k(deleteAccountData, (AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public C22421c<H5Token> m111445s() {
        final H5Data h5Data = new H5Data();
        return w24.m204501b().m204504d("/oauth2/h5-token", h5Data.toJson()).doOnNext(new y20() { // from class: l.vm5
            @Override // p153l.y20
            public final void call(Object obj) {
                cn5.m111432f(h5Data, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.wm5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.h5Token;
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public C22421c<Long> m111446t() {
        return w24.m204501b().m204502a("/download-data?clientId=" + C20407tv.f176233b).doOnNext(new y20() { // from class: l.tm5
            @Override // p153l.y20
            public final void call(Object obj) {
                cn5.m111435i((AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.um5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Long.valueOf(((AccountEnvelop) obj).data.lastApply.time);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public C22421c<Boolean> m111447u(final ReportData reportData) {
        return w24.m204501b().m204504d("/event/report", reportData.toJson()).doOnNext(new y20() { // from class: l.xm5
            @Override // p153l.y20
            public final void call(Object obj) {
                cn5.m111433g(reportData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.ym5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).meta.code == 200000);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public C22421c<Boolean> m111448v(final SignupEarlyUIDData signupEarlyUIDData) {
        return w24.m204501b().m204504d("/stage/signup/info", signupEarlyUIDData.toJson()).doOnNext(new y20() { // from class: l.om5
            @Override // p153l.y20
            public final void call(Object obj) {
                cn5.m111428b(signupEarlyUIDData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.pm5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).meta.code == 200000);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public C22421c<AccountEnvelop> m111449w(final StatusData statusData) {
        return w24.m204501b().m204504d("/service/status", statusData.toJson()).doOnNext(new y20() { // from class: l.zm5
            @Override // p153l.y20
            public final void call(Object obj) {
                cn5.m111434h(statusData, (AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public C22421c<Boolean> m111450x(final VerifyPasswordData verifyPasswordData) {
        return w24.m204501b().m204504d("/verify-password", verifyPasswordData.toJson()).doOnNext(new y20() { // from class: l.an5
            @Override // p153l.y20
            public final void call(Object obj) {
                cn5.m111431e(verifyPasswordData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.nm5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountEnvelop) obj).meta.code == 200000);
            }
        });
    }
}
