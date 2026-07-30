package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.PaymentApi;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class hso {

    /* JADX INFO: renamed from: a */
    public final Act f111457a;

    /* JADX INFO: renamed from: b */
    public final PurchaseType f111458b;

    /* JADX INFO: renamed from: c */
    public bn50 f111459c;

    /* JADX INFO: renamed from: d */
    public kcg0 f111460d;

    /* JADX INFO: renamed from: e */
    public Object f111461e;

    /* JADX INFO: renamed from: f */
    public y20<Integer> f111462f;

    /* JADX INFO: renamed from: g */
    public boolean f111463g;

    public hso(Act act, PurchaseType purchaseType) {
        this.f111457a = act;
        this.f111458b = purchaseType;
    }

    /* JADX INFO: renamed from: l */
    public final void m137003l() {
        ubp.INSTANCE.m195277j();
        if (NullChecker.m82486a(this.f111462f)) {
            this.f111462f.call(0);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m137004m() {
        if (this.f111463g) {
            ubp.INSTANCE.m195277j();
        } else {
            m137003l();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m137005n() {
        this.f111459c.mo47745b();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m137006o() {
        this.f111459c.mo47745b();
    }

    /* JADX INFO: renamed from: p */
    public void m137007p(aso asoVar, boolean z, String str) {
        m137008q(asoVar, z, str, null);
    }

    /* JADX INFO: renamed from: q */
    public void m137008q(aso asoVar, boolean z, String str, String str2) {
        if (asoVar == null) {
            m137004m();
            o1j0.m165649w(R$string.f28179V9);
            return;
        }
        C17572a c17572a = new C17572a();
        if (TextUtils.isEmpty(str)) {
            m137004m();
            return;
        }
        this.f111457a.progress(R$string.f28149T1);
        if (z) {
            this.f111460d = asoVar.mo192811b(str, str2, new x20() { // from class: l.cso
                @Override // p153l.x20
                public final void call() {
                    this.f83470a.m137006o();
                }
            }).subscribe((gcg0<? super PaymentApi.PaymentResultStatus>) c17572a);
        } else {
            this.f111460d = asoVar.mo192812c(str, new x20() { // from class: l.bso
                @Override // p153l.x20
                public final void call() {
                    this.f78181a.m137005n();
                }
            }).subscribe((gcg0<? super PaymentApi.PaymentResultStatus>) c17572a);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m137009r(boolean z) {
        this.f111463g = z;
    }

    /* JADX INFO: renamed from: s */
    public void m137010s(y20<Integer> y20Var) {
        this.f111462f = y20Var;
    }

    /* JADX INFO: renamed from: t */
    public void m137011t(bn50 bn50Var) {
        this.f111459c = bn50Var;
    }

    /* JADX INFO: renamed from: u */
    public void m137012u(Object obj) {
        this.f111461e = obj;
    }

    /* JADX INFO: renamed from: l.hso$a */
    public class C17572a extends gcg0<PaymentApi.PaymentResultStatus> {
        public C17572a() {
        }

        /* JADX INFO: renamed from: o */
        private void m137017o() {
            if (NullChecker.m82486a(hso.this.f111460d) && !hso.this.f111460d.isUnsubscribed()) {
                hso.this.f111460d.unsubscribe();
            }
            hso.this.f111460d = null;
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m137018k() {
            hso.this.f111457a.progress(R$string.f28328i7);
        }

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ void m137020m(Throwable th) {
            hso.this.f111457a.progressDismiss();
            if (NullChecker.m82486a(hso.this.f111459c)) {
                hso.this.f111459c.mo31848a();
            }
            CoreModule.m30933P().m143405a().mo34501fg(hso.this.f111457a);
        }

        @Override // p153l.bb50
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public void onNext(PaymentApi.PaymentResultStatus paymentResultStatus) {
            m137017o();
            hso.this.f111457a.progressDismiss();
            uqb0.f180388T.retryRestore.put(Boolean.FALSE);
            boolean z = hso.this.f111458b == PurchaseType.TYPE_ULTRA_PREMIUM;
            if (paymentResultStatus == PaymentApi.PaymentResultStatus.succeed) {
                fp60.m126541C(hso.this.f111458b);
                if (NullChecker.m82486a(hso.this.f111459c)) {
                    hso.this.f111459c.mo31849c();
                }
                fp60.m126542D(hso.this.f111458b, hso.this.f111461e);
                if (hso.this.f111458b == PurchaseType.TYPE_INTL_DIAMOND) {
                    CoreModule.f18264c.f20315I0.m144057N3();
                }
                if (ubp.INSTANCE.m195283r()) {
                    ubp.m195271l(hso.this.f111457a, ubp.payFromSalvageAction, z);
                }
                hso.this.m137003l();
                return;
            }
            PaymentApi.PaymentResultStatus paymentResultStatus2 = PaymentApi.PaymentResultStatus.failed;
            if (paymentResultStatus == paymentResultStatus2 || paymentResultStatus == PaymentApi.PaymentResultStatus.userCancel) {
                if (hso.this.f111463g) {
                    ubp.INSTANCE.m195277j();
                    if (paymentResultStatus == paymentResultStatus2) {
                        o1j0.m165649w(R$string.f28179V9);
                    }
                } else {
                    hso.this.m137003l();
                    o1j0.m165649w(R$string.f28179V9);
                }
                uqb0.m197269e1("purchase_failed", new Object[0]);
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            m137017o();
            hso.this.m137004m();
            hso.this.f111457a.progressDismiss();
            uqb0.m197269e1("purchase_failed", new Object[0]);
            sfj0.m185601h("e_get_privilege_failed_retry", "p_get_privilege_failed", new sfj0.C20032a[0]);
            hso.this.f111457a.post(new Runnable() { // from class: l.dso
                @Override // java.lang.Runnable
                public final void run() {
                    this.f90500a.m137018k();
                }
            });
            aso asoVarM99953h = aso.m99953h(hso.this.f111457a, hso.this.f111457a instanceof PutongAct ? ((PutongAct) hso.this.f111457a).iap().m103295i() : null);
            if (NullChecker.m82486a(asoVarM99953h)) {
                hso.this.f111457a.duringCreated(asoVarM99953h.mo192810a()).doOnNext(new y20() { // from class: l.eso
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
                    }
                }).subscribe(psd0.m173597H(new y20() { // from class: l.fso
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f100667a.m137019l((PaymentApi.PaymentResultStatus) obj);
                    }
                }, new y20() { // from class: l.gso
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f106319a.m137020m((Throwable) obj);
                    }
                }));
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
        }
    }
}
