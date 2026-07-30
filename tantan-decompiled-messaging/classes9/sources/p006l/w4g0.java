package p006l;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.settings.subscriptions.SubscriptionsAct;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.Contract;
import com.p1.mobile.putong.data.ContractEnvelope;
import com.p1.mobile.putong.data.Meta;
import java.util.ArrayList;
import l.ah60;
import l.b5g0;
import l.d30;
import l.e30;
import l.e51;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mkd0;
import l.v9j;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class w4g0 extends jq2<z4g0> {

    /* JADX INFO: renamed from: a */
    public SubscriptionsAct f24975a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0584c f24976b;

    /* JADX INFO: renamed from: c */
    public ArrayList<Contract> f24977c;

    public w4g0(@NonNull SubscriptionsAct subscriptionsAct, InterfaceC0584c interfaceC0584c) {
        super(subscriptionsAct);
        this.f24975a = subscriptionsAct;
        this.f24976b = interfaceC0584c;
        b5g0.b(true);
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m26188q0(ArrayList arrayList) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m26190s0(Bundle bundle) {
        ((z4g0) ((jq2) this).viewModel).m28559r();
        ((z4g0) ((jq2) this).viewModel).m28555e();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m26191A0(Contract contract) {
        m26198I0(contract.id);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m26192C0(Throwable th) {
        this.f24975a.progressDismiss();
        lsi0.C(R$string.f2802p4);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m26193D0() {
        duringCreated(ugc0.m25207c()).subscribe(mkd0.B());
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m26194E0(ContractEnvelope contractEnvelope) {
        this.f24975a.progressDismiss();
        e51.H(App.e, new Runnable() { // from class: l.l4g0
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f1534c.f3580O0.m2003C3();
            }
        }, 1000L);
        Meta meta = contractEnvelope.meta;
        if (meta.code == 200 && meta.subCode == 70001 && !vwb.L(meta.message)) {
            lsi0.y(contractEnvelope.meta.message);
        } else {
            lsi0.w(R$string.f2642k);
        }
        CoreModule.f1534c.f3544C0.m27420u4();
        e51.H(App.e, new Runnable() { // from class: l.m4g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16795a.m26193D0();
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: F0 */
    public void m26195F0(final Contract contract, final d30 d30Var) {
        this.f24975a.dialog().F(this.f24976b.mo13050d(contract)).l0(R$string.f2729mo, new Runnable() { // from class: l.v4g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f24136a.m26203x0(d30Var, contract);
            }
        }).o0(this.f24975a.color(w0c0.f24642R1)).s0(R$string.f2698lo).B0(new DialogInterface.OnShowListener() { // from class: l.j4g0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f14993a.m26204y0(contract, dialogInterface);
            }
        }).V(new DialogInterface.OnDismissListener() { // from class: l.k4g0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f15612a.m26205z0(contract, dialogInterface);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: G0 */
    public void m26196G0() {
        boolean zM27355L3 = xma.m27355L3();
        SubscriptionsAct subscriptionsAct = this.f24975a;
        if (zM27355L3) {
            c.w0(subscriptionsAct, "p_settings,auto");
        } else {
            c.I1(subscriptionsAct, "p_settings,auto");
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m26197H0(final Contract contract) {
        m26195F0(contract, new d30() { // from class: l.s4g0
            public final void call() {
                this.f21103a.m26191A0(contract);
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public final void m26198I0(String str) {
        this.f24975a.progress(R$string.f1831J5);
        duringCreated(qib0.f19796T.m1487Q(str)).subscribe(mkd0.H(new e30() { // from class: l.t4g0
            public final void call(Object obj) {
                this.f21872a.m26194E0((ContractEnvelope) obj);
            }
        }, new e30() { // from class: l.u4g0
            public final void call(Object obj) {
                this.f23340a.m26192C0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public void m26199Z() {
        super.Z();
        qib0.f19796T.m1490T();
    }

    /* JADX INFO: renamed from: a0 */
    public void m26200a0() {
        creates(new e30() { // from class: l.i4g0
            public final void call(Object obj) {
                this.f14224a.m26190s0((Bundle) obj);
            }
        });
        duringCreated(ah60.B()).subscribe(mkd0.G(new e30() { // from class: l.n4g0
            public final void call(Object obj) {
                qib0.f19796T.m1490T();
            }
        }));
        duringCreated(new v9j() { // from class: l.o4g0
            public final Object call() {
                return qib0.f19796T.m1489S();
            }
        }).filter(new w9j() { // from class: l.p4g0
            public final Object call(Object obj) {
                return this.f18585a.m26201t0((ArrayList) obj);
            }
        }).doOnNext(new e30() { // from class: l.q4g0
            public final void call(Object obj) {
                w4g0.m26188q0((ArrayList) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.r4g0
            public final void call(Object obj) {
                this.f20310a.m26202u0((ArrayList) obj);
            }
        }));
    }

    public void destroy() {
        this.f24975a = null;
        b5g0.b(false);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Boolean m26201t0(ArrayList arrayList) {
        return Boolean.valueOf(!arrayList.equals(this.f24977c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m26202u0(ArrayList arrayList) {
        this.f24977c = new ArrayList<>(arrayList);
        boolean zJ = vwb.J(arrayList);
        InterfaceC0584c interfaceC0584c = this.f24976b;
        if (zJ) {
            arrayList = interfaceC0584c.mo13051e();
            this.f24976b.m13047a("e_auto_renew_subscriptions_option", this.f24975a.pageId(), j760.a("auto_renew_subscriptions_option_type", "subscribe"));
        } else {
            interfaceC0584c.m13047a("e_auto_renew_subscriptions_option", this.f24975a.pageId(), j760.a("auto_renew_subscriptions_option_type", "cancel"));
        }
        ((z4g0) ((jq2) this).viewModel).m28558j(arrayList);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m26203x0(d30 d30Var, Contract contract) {
        d30Var.call();
        if (src0.m24159r().m24161A(contract)) {
            this.f24976b.m13049c("e_auto_renew_subscriptions_cancel_yes", "p_auto_renew_subscriptions_cancel_popup", new j760[0]);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m26204y0(Contract contract, DialogInterface dialogInterface) {
        if (src0.m24159r().m24161A(contract)) {
            this.f24976b.m13047a("e_auto_renew_subscriptions_cancel_yes", "p_auto_renew_subscriptions_cancel_popup", new j760[0]);
            this.f24976b.m13047a("e_auto_renew_subscriptions_cancel_no", "p_auto_renew_subscriptions_cancel_popup", new j760[0]);
            this.f24976b.m13052f("p_auto_renew_subscriptions_cancel_popup", this.f24975a.getClass().getName());
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m26205z0(Contract contract, DialogInterface dialogInterface) {
        if (src0.m24159r().m24161A(contract)) {
            this.f24976b.m13049c("e_auto_renew_subscriptions_cancel_no", "p_auto_renew_subscriptions_cancel_popup", new j760[0]);
            this.f24976b.m13048b("p_auto_renew_subscriptions_cancel_popup", this.f24975a.getClass().getName());
        }
    }
}
