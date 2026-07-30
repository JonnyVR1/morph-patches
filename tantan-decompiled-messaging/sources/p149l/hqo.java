package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.PaymentApi;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class hqo {

    /* JADX INFO: renamed from: a */
    public final Act f109073a;

    /* JADX INFO: renamed from: b */
    public final PurchaseType f109074b;

    /* JADX INFO: renamed from: c */
    public ue50 f109075c;

    /* JADX INFO: renamed from: d */
    public c4g0 f109076d;

    /* JADX INFO: renamed from: e */
    public Object f109077e;

    /* JADX INFO: renamed from: f */
    public e30<Integer> f109078f;

    /* JADX INFO: renamed from: g */
    public boolean f109079g;

    public hqo(Act act, PurchaseType purchaseType) {
        this.f109073a = act;
        this.f109074b = purchaseType;
    }

    /* JADX INFO: renamed from: l */
    public final void m132471l() {
        u9p.INSTANCE.m192609j();
        if (NullChecker.m81303a(this.f109078f)) {
            this.f109078f.call(0);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m132472m() {
        if (this.f109079g) {
            u9p.INSTANCE.m192609j();
        } else {
            m132471l();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m132473n() {
        this.f109075c.mo46562b();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m132474o() {
        this.f109075c.mo46562b();
    }

    /* JADX INFO: renamed from: p */
    public void m132475p(aqo aqoVar, boolean z, String str) {
        m132476q(aqoVar, z, str, null);
    }

    /* JADX INFO: renamed from: q */
    public void m132476q(aqo aqoVar, boolean z, String str, String str2) {
        if (aqoVar == null) {
            m132472m();
            lsi0.m151593w(R$string.f27331V9);
            return;
        }
        C17373a c17373a = new C17373a();
        if (TextUtils.isEmpty(str)) {
            m132472m();
            return;
        }
        this.f109073a.progress(R$string.f27301T1);
        if (z) {
            this.f109076d = aqoVar.mo123063b(str, str2, new d30() { // from class: l.cqo
                @Override // p149l.d30
                public final void call() {
                    this.f82099a.m132474o();
                }
            }).subscribe((z3g0<? super PaymentApi.PaymentResultStatus>) c17373a);
        } else {
            this.f109076d = aqoVar.mo123064c(str, new d30() { // from class: l.bqo
                @Override // p149l.d30
                public final void call() {
                    this.f76795a.m132473n();
                }
            }).subscribe((z3g0<? super PaymentApi.PaymentResultStatus>) c17373a);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m132477r(boolean z) {
        this.f109079g = z;
    }

    /* JADX INFO: renamed from: s */
    public void m132478s(e30<Integer> e30Var) {
        this.f109078f = e30Var;
    }

    /* JADX INFO: renamed from: t */
    public void m132479t(ue50 ue50Var) {
        this.f109075c = ue50Var;
    }

    /* JADX INFO: renamed from: u */
    public void m132480u(Object obj) {
        this.f109077e = obj;
    }

    /* JADX INFO: renamed from: l.hqo$a */
    public class C17373a extends z3g0<PaymentApi.PaymentResultStatus> {
        public C17373a() {
        }

        /* JADX INFO: renamed from: o */
        private void m132485o() {
            if (NullChecker.m81303a(hqo.this.f109076d) && !hqo.this.f109076d.isUnsubscribed()) {
                hqo.this.f109076d.unsubscribe();
            }
            hqo.this.f109076d = null;
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m132486k() {
            hqo.this.f109073a.progress(R$string.f27480i7);
        }

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ void m132488m(Throwable th) {
            hqo.this.f109073a.progressDismiss();
            if (NullChecker.m81303a(hqo.this.f109075c)) {
                hqo.this.f109075c.mo30845a();
            }
            CoreModule.m29935P().m94651a().mo33498fg(hqo.this.f109073a);
        }

        @Override // p149l.m250
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public void onNext(PaymentApi.PaymentResultStatus paymentResultStatus) {
            m132485o();
            hqo.this.f109073a.progressDismiss();
            qib0.f154705T.retryRestore.put(Boolean.FALSE);
            boolean z = hqo.this.f109074b == PurchaseType.TYPE_ULTRA_PREMIUM;
            if (paymentResultStatus == PaymentApi.PaymentResultStatus.succeed) {
                ah60.m96368C(hqo.this.f109074b);
                if (NullChecker.m81303a(hqo.this.f109075c)) {
                    hqo.this.f109075c.mo30846c();
                }
                ah60.m96369D(hqo.this.f109074b, hqo.this.f109077e);
                if (hqo.this.f109074b == PurchaseType.TYPE_INTL_DIAMOND) {
                    CoreModule.f17545c.f19573I0.m140260N3();
                }
                if (u9p.INSTANCE.m192615r()) {
                    u9p.m192603l(hqo.this.f109073a, u9p.payFromSalvageAction, z);
                }
                hqo.this.m132471l();
                return;
            }
            PaymentApi.PaymentResultStatus paymentResultStatus2 = PaymentApi.PaymentResultStatus.failed;
            if (paymentResultStatus == paymentResultStatus2 || paymentResultStatus == PaymentApi.PaymentResultStatus.userCancel) {
                if (hqo.this.f109079g) {
                    u9p.INSTANCE.m192609j();
                    if (paymentResultStatus == paymentResultStatus2) {
                        lsi0.m151593w(R$string.f27331V9);
                    }
                } else {
                    hqo.this.m132471l();
                    lsi0.m151593w(R$string.f27331V9);
                }
                qib0.m174815e1("purchase_failed", new Object[0]);
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            m132485o();
            hqo.this.m132472m();
            hqo.this.f109073a.progressDismiss();
            qib0.m174815e1("purchase_failed", new Object[0]);
            o6j0.m162864h("e_get_privilege_failed_retry", "p_get_privilege_failed", new o6j0.C18854a[0]);
            hqo.this.f109073a.post(new Runnable() { // from class: l.dqo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f87461a.m132486k();
                }
            });
            aqo aqoVarM98316h = aqo.m98316h(hqo.this.f109073a, hqo.this.f109073a instanceof PutongAct ? ((PutongAct) hqo.this.f109073a).iap().m148933i() : null);
            if (NullChecker.m81303a(aqoVarM98316h)) {
                hqo.this.f109073a.duringCreated(aqoVarM98316h.mo123062a()).doOnNext(new e30() { // from class: l.eqo
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
                    }
                }).subscribe(mkd0.m154956H(new e30() { // from class: l.fqo
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f98828a.m132487l((PaymentApi.PaymentResultStatus) obj);
                    }
                }, new e30() { // from class: l.gqo
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f103966a.m132488m((Throwable) obj);
                    }
                }));
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
        }
    }
}
