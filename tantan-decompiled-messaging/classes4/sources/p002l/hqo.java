package p002l;

import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.PaymentApi;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.tantanapp.common.utils.NullChecker;
import l.ah60;
import l.aqo;
import l.c4g0;
import l.d30;
import l.e30;
import l.lsi0;
import l.mkd0;
import l.o6j0;
import l.qib0;
import l.u9p;
import l.ue50;
import l.z3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hqo {

    /* JADX INFO: renamed from: a */
    public final Act f12219a;

    /* JADX INFO: renamed from: b */
    public final PurchaseType f12220b;

    /* JADX INFO: renamed from: c */
    public ue50 f12221c;

    /* JADX INFO: renamed from: d */
    public c4g0 f12222d;

    /* JADX INFO: renamed from: e */
    public Object f12223e;

    /* JADX INFO: renamed from: f */
    public e30<Integer> f12224f;

    /* JADX INFO: renamed from: g */
    public boolean f12225g;

    public hqo(Act act, PurchaseType purchaseType) {
        this.f12219a = act;
        this.f12220b = purchaseType;
    }

    /* JADX INFO: renamed from: l */
    public final void m14689l() {
        u9p.INSTANCE.j();
        if (NullChecker.a(this.f12224f)) {
            this.f12224f.call(0);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m14690m() {
        if (this.f12225g) {
            u9p.INSTANCE.j();
        } else {
            m14689l();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m14691n() {
        this.f12221c.b();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m14692o() {
        this.f12221c.b();
    }

    /* JADX INFO: renamed from: p */
    public void m14693p(aqo aqoVar, boolean z, String str) {
        m14694q(aqoVar, z, str, null);
    }

    /* JADX INFO: renamed from: q */
    public void m14694q(aqo aqoVar, boolean z, String str, String str2) {
        if (aqoVar == null) {
            m14690m();
            lsi0.w(R.string.V9);
            return;
        }
        C0609a c0609a = new C0609a();
        if (TextUtils.isEmpty(str)) {
            m14690m();
            return;
        }
        this.f12219a.progress(R.string.T1);
        if (z) {
            this.f12222d = aqoVar.b(str, str2, new d30() { // from class: l.cqo
                public final void call() {
                    this.f8907a.m14692o();
                }
            }).subscribe(c0609a);
        } else {
            this.f12222d = aqoVar.c(str, new d30() { // from class: l.bqo
                public final void call() {
                    this.f8312a.m14691n();
                }
            }).subscribe(c0609a);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m14695r(boolean z) {
        this.f12225g = z;
    }

    /* JADX INFO: renamed from: s */
    public void m14696s(e30<Integer> e30Var) {
        this.f12224f = e30Var;
    }

    /* JADX INFO: renamed from: t */
    public void m14697t(ue50 ue50Var) {
        this.f12221c = ue50Var;
    }

    /* JADX INFO: renamed from: u */
    public void m14698u(Object obj) {
        this.f12223e = obj;
    }

    /* JADX INFO: renamed from: l.hqo$a */
    public class C0609a extends z3g0<PaymentApi.PaymentResultStatus> {
        public C0609a() {
        }

        /* JADX INFO: renamed from: o */
        private void m14703o() {
            if (NullChecker.a(hqo.this.f12222d) && !hqo.this.f12222d.isUnsubscribed()) {
                hqo.this.f12222d.unsubscribe();
            }
            hqo.this.f12222d = null;
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m14704k() {
            hqo.this.f12219a.progress(R.string.i7);
        }

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ void m14706m(Throwable th) {
            hqo.this.f12219a.progressDismiss();
            if (NullChecker.a(hqo.this.f12221c)) {
                hqo.this.f12221c.a();
            }
            CoreModule.P().a().fg(hqo.this.f12219a);
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public void onNext(PaymentApi.PaymentResultStatus paymentResultStatus) {
            m14703o();
            hqo.this.f12219a.progressDismiss();
            qib0.T.b.put(Boolean.FALSE);
            boolean z = hqo.this.f12220b == PurchaseType.TYPE_ULTRA_PREMIUM;
            if (paymentResultStatus == PaymentApi.PaymentResultStatus.succeed) {
                ah60.C(hqo.this.f12220b);
                if (NullChecker.a(hqo.this.f12221c)) {
                    hqo.this.f12221c.c();
                }
                ah60.D(hqo.this.f12220b, hqo.this.f12223e);
                if (hqo.this.f12220b == PurchaseType.TYPE_INTL_DIAMOND) {
                    CoreModule.c.I0.N3();
                }
                if (u9p.INSTANCE.r()) {
                    u9p.l(hqo.this.f12219a, u9p.a, z);
                }
                hqo.this.m14689l();
                return;
            }
            PaymentApi.PaymentResultStatus paymentResultStatus2 = PaymentApi.PaymentResultStatus.failed;
            if (paymentResultStatus == paymentResultStatus2 || paymentResultStatus == PaymentApi.PaymentResultStatus.userCancel) {
                if (hqo.this.f12225g) {
                    u9p.INSTANCE.j();
                    if (paymentResultStatus == paymentResultStatus2) {
                        lsi0.w(R.string.V9);
                    }
                } else {
                    hqo.this.m14689l();
                    lsi0.w(R.string.V9);
                }
                qib0.e1("purchase_failed", new Object[0]);
            }
        }

        public void onError(Throwable th) {
            m14703o();
            hqo.this.m14690m();
            hqo.this.f12219a.progressDismiss();
            qib0.e1("purchase_failed", new Object[0]);
            o6j0.h("e_get_privilege_failed_retry", "p_get_privilege_failed", new o6j0.a[0]);
            hqo.this.f12219a.post(new Runnable() { // from class: l.dqo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9401a.m14704k();
                }
            });
            aqo aqoVarH = aqo.h(hqo.this.f12219a, hqo.this.f12219a instanceof PutongAct ? hqo.this.f12219a.iap().i() : null);
            if (NullChecker.a(aqoVarH)) {
                hqo.this.f12219a.duringCreated(aqoVarH.a()).doOnNext(new e30() { // from class: l.eqo
                    public final void call(Object obj) {
                        CoreModule.c.e0.W9(CoreModule.H().userId());
                    }
                }).subscribe(mkd0.H(new e30() { // from class: l.fqo
                    public final void call(Object obj) {
                        this.f10599a.m14705l((PaymentApi.PaymentResultStatus) obj);
                    }
                }, new e30() { // from class: l.gqo
                    public final void call(Object obj) {
                        this.f11580a.m14706m((Throwable) obj);
                    }
                }));
            }
        }

        public void onCompleted() {
        }
    }
}
