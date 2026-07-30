package p149l;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.settings.subscriptions.SubscriptionsAct;
import com.p046p1.mobile.putong.data.Contract;
import com.p046p1.mobile.putong.data.ContractEnvelope;
import com.p046p1.mobile.putong.data.Meta;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class w4g0 extends jq2<z4g0> {

    /* JADX INFO: renamed from: a */
    public SubscriptionsAct f184560a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC16030c f184561b;

    /* JADX INFO: renamed from: c */
    public ArrayList<Contract> f184562c;

    public w4g0(@NonNull SubscriptionsAct subscriptionsAct, InterfaceC16030c interfaceC16030c) {
        super(subscriptionsAct);
        this.f184560a = subscriptionsAct;
        this.f184561b = interfaceC16030c;
        b5g0.m100335b(true);
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m201493q0(ArrayList arrayList) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m201495s0(Bundle bundle) {
        ((z4g0) this.viewModel).m217082r();
        ((z4g0) this.viewModel).m217079e();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m201496A0(Contract contract) {
        m201503I0(contract.f38735id);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m201497C0(Throwable th) {
        this.f184560a.progressDismiss();
        lsi0.m151565C(R$string.f18813p4);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m201498D0() {
        duringCreated(ugc0.m193536c()).subscribe(mkd0.m154950B());
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m201499E0(ContractEnvelope contractEnvelope) {
        this.f184560a.progressDismiss();
        e51.m114743H(App.f15369e, new Runnable() { // from class: l.l4g0
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19591O0.m30075C3();
            }
        }, 1000L);
        Meta meta = contractEnvelope.meta;
        if (meta.code == 200 && meta.subCode == 70001 && !vwb.m200298L(meta.message)) {
            lsi0.m151595y(contractEnvelope.meta.message);
        } else {
            lsi0.m151593w(R$string.f18653k);
        }
        CoreModule.f17545c.f19555C0.m210112u4();
        e51.m114743H(App.f15369e, new Runnable() { // from class: l.m4g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f131296a.m201498D0();
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: F0 */
    public void m201500F0(final Contract contract, final d30 d30Var) {
        this.f184560a.dialog().m20504F(this.f184561b.mo104710d(contract)).m20542l0(R$string.f18740mo, new Runnable() { // from class: l.v4g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f179929a.m201506x0(d30Var, contract);
            }
        }).m20546o0(this.f184560a.color(w0c0.f183802R1)).m20554s0(R$string.f18709lo).m20497B0(new DialogInterface.OnShowListener() { // from class: l.j4g0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f116188a.m201507y0(contract, dialogInterface);
            }
        }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.k4g0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f121092a.m201508z0(contract, dialogInterface);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: G0 */
    public void m201501G0() {
        boolean zM210047L3 = xma.m210047L3();
        SubscriptionsAct subscriptionsAct = this.f184560a;
        if (zM210047L3) {
            C8764c.m53502w0(subscriptionsAct, "p_settings,auto");
        } else {
            C8764c.m53400I1(subscriptionsAct, "p_settings,auto");
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m201502H0(final Contract contract) {
        m201500F0(contract, new d30() { // from class: l.s4g0
            @Override // p149l.d30
            public final void call() {
                this.f162394a.m201496A0(contract);
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public final void m201503I0(String str) {
        this.f184560a.progress(R$string.f17842J5);
        duringCreated(qib0.f154705T.m29581Q(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.t4g0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167723a.m201499E0((ContractEnvelope) obj);
            }
        }, new e30() { // from class: l.u4g0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174597a.m201497C0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        qib0.f154705T.m29584T();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.i4g0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111449a.m201495s0((Bundle) obj);
            }
        });
        duringCreated(ah60.m96367B()).subscribe(mkd0.m154955G(new e30() { // from class: l.n4g0
            @Override // p149l.e30
            public final void call(Object obj) {
                qib0.f154705T.m29584T();
            }
        }));
        duringCreated(new v9j() { // from class: l.o4g0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154705T.m29583S();
            }
        }).filter(new w9j() { // from class: l.p4g0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f147171a.m201504t0((ArrayList) obj);
            }
        }).doOnNext(new e30() { // from class: l.q4g0
            @Override // p149l.e30
            public final void call(Object obj) {
                w4g0.m201493q0((ArrayList) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.r4g0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157671a.m201505u0((ArrayList) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
        this.f184560a = null;
        b5g0.m100335b(false);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Boolean m201504t0(ArrayList arrayList) {
        return Boolean.valueOf(!arrayList.equals(this.f184562c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m201505u0(ArrayList arrayList) {
        this.f184562c = new ArrayList<>(arrayList);
        boolean zM200296J = vwb.m200296J(arrayList);
        InterfaceC16030c interfaceC16030c = this.f184561b;
        if (zM200296J) {
            arrayList = interfaceC16030c.mo104711e();
            this.f184561b.m104707a("e_auto_renew_subscriptions_option", this.f184560a.pageId(), j760.m140076a("auto_renew_subscriptions_option_type", "subscribe"));
        } else {
            interfaceC16030c.m104707a("e_auto_renew_subscriptions_option", this.f184560a.pageId(), j760.m140076a("auto_renew_subscriptions_option_type", "cancel"));
        }
        ((z4g0) this.viewModel).m217081j(arrayList);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m201506x0(d30 d30Var, Contract contract) {
        d30Var.call();
        if (src0.m185656r().m185658A(contract)) {
            this.f184561b.m104709c("e_auto_renew_subscriptions_cancel_yes", "p_auto_renew_subscriptions_cancel_popup", new j760[0]);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m201507y0(Contract contract, DialogInterface dialogInterface) {
        if (src0.m185656r().m185658A(contract)) {
            this.f184561b.m104707a("e_auto_renew_subscriptions_cancel_yes", "p_auto_renew_subscriptions_cancel_popup", new j760[0]);
            this.f184561b.m104707a("e_auto_renew_subscriptions_cancel_no", "p_auto_renew_subscriptions_cancel_popup", new j760[0]);
            this.f184561b.m104712f("p_auto_renew_subscriptions_cancel_popup", this.f184560a.getClass().getName());
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m201508z0(Contract contract, DialogInterface dialogInterface) {
        if (src0.m185656r().m185658A(contract)) {
            this.f184561b.m104709c("e_auto_renew_subscriptions_cancel_no", "p_auto_renew_subscriptions_cancel_popup", new j760[0]);
            this.f184561b.m104708b("p_auto_renew_subscriptions_cancel_popup", this.f184560a.getClass().getName());
        }
    }
}
