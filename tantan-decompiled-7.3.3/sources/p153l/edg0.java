package p153l;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.settings.subscriptions.SubscriptionsAct;
import com.p051p1.mobile.putong.data.Contract;
import com.p051p1.mobile.putong.data.ContractEnvelope;
import com.p051p1.mobile.putong.data.Meta;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class edg0 extends ar2<hdg0> {

    /* JADX INFO: renamed from: a */
    public SubscriptionsAct f93510a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC16147c f93511b;

    /* JADX INFO: renamed from: c */
    public ArrayList<Contract> f93512c;

    public edg0(@NonNull SubscriptionsAct subscriptionsAct, InterfaceC16147c interfaceC16147c) {
        super(subscriptionsAct);
        this.f93510a = subscriptionsAct;
        this.f93511b = interfaceC16147c;
        jdg0.m144427b(true);
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m120436q0(ArrayList arrayList) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m120438s0(Bundle bundle) {
        ((hdg0) this.viewModel).m134595r();
        ((hdg0) this.viewModel).m134592e();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m120439A0(Contract contract) {
        m120446I0(contract.f39583id);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m120440C0(Throwable th) {
        this.f93510a.progressDismiss();
        o1j0.m165621C(R$string.f19605r4);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m120441D0() {
        duringCreated(bpc0.m105791c()).subscribe(psd0.m173591B());
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m120442E0(ContractEnvelope contractEnvelope) {
        this.f93510a.progressDismiss();
        l51.m152888H(App.f16088e, new Runnable() { // from class: l.tcg0
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20333O0.m31073C3();
            }
        }, 1000L);
        Meta meta = contractEnvelope.meta;
        if (meta.code == 200 && meta.subCode == 70001 && !jyb.m147481L(meta.message)) {
            o1j0.m165651y(contractEnvelope.meta.message);
        } else {
            o1j0.m165649w(R$string.f19383k);
        }
        CoreModule.f18264c.f20297C0.m146425v4();
        l51.m152888H(App.f16088e, new Runnable() { // from class: l.ucg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f178433a.m120441D0();
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: F0 */
    public void m120443F0(final Contract contract, final x20 x20Var) {
        this.f93510a.dialog().m21503F(this.f93511b.mo107277d(contract)).m21541l0(R$string.f18558Io, new Runnable() { // from class: l.ddg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f87934a.m120449x0(x20Var, contract);
            }
        }).m21545o0(this.f93510a.color(c9c0.f80374S1)).m21553s0(R$string.f18527Ho).m21496B0(new DialogInterface.OnShowListener() { // from class: l.rcg0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f162205a.m120450y0(contract, dialogInterface);
            }
        }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.scg0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f167252a.m120451z0(contract, dialogInterface);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: G0 */
    public void m120444G0() {
        boolean zM146361M3 = joa.m146361M3();
        SubscriptionsAct subscriptionsAct = this.f93510a;
        if (zM146361M3) {
            C8927c.m54685w0(subscriptionsAct, "p_settings,auto");
        } else {
            C8927c.m54583I1(subscriptionsAct, "p_settings,auto");
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m120445H0(final Contract contract) {
        m120443F0(contract, new x20() { // from class: l.adg0
            @Override // p153l.x20
            public final void call() {
                this.f70687a.m120439A0(contract);
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public final void m120446I0(String str) {
        this.f93510a.progress(R$string.f18632L5);
        duringCreated(uqb0.f180388T.m30579Q(str)).subscribe(psd0.m173597H(new y20() { // from class: l.bdg0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76265a.m120442E0((ContractEnvelope) obj);
            }
        }, new y20() { // from class: l.cdg0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81222a.m120440C0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        uqb0.f180388T.m30582T();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.qcg0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156599a.m120438s0((Bundle) obj);
            }
        });
        duringCreated(fp60.m126540B()).subscribe(psd0.m173596G(new y20() { // from class: l.vcg0
            @Override // p153l.y20
            public final void call(Object obj) {
                uqb0.f180388T.m30582T();
            }
        }));
        duringCreated(new pcj() { // from class: l.wcg0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180388T.m30581S();
            }
        }).filter(new qcj() { // from class: l.xcg0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f193310a.m120447t0((ArrayList) obj);
            }
        }).doOnNext(new y20() { // from class: l.ycg0
            @Override // p153l.y20
            public final void call(Object obj) {
                edg0.m120436q0((ArrayList) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.zcg0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203759a.m120448u0((ArrayList) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
        this.f93510a = null;
        jdg0.m144427b(false);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Boolean m120447t0(ArrayList arrayList) {
        return Boolean.valueOf(!arrayList.equals(this.f93512c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m120448u0(ArrayList arrayList) {
        this.f93512c = new ArrayList<>(arrayList);
        boolean zM147479J = jyb.m147479J(arrayList);
        InterfaceC16147c interfaceC16147c = this.f93511b;
        if (zM147479J) {
            arrayList = interfaceC16147c.mo107278e();
            this.f93511b.m107274a("e_auto_renew_subscriptions_option", this.f93510a.pageId(), pf60.m172085a("auto_renew_subscriptions_option_type", "subscribe"));
        } else {
            interfaceC16147c.m107274a("e_auto_renew_subscriptions_option", this.f93510a.pageId(), pf60.m172085a("auto_renew_subscriptions_option_type", "cancel"));
        }
        ((hdg0) this.viewModel).m134594j(arrayList);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m120449x0(x20 x20Var, Contract contract) {
        x20Var.call();
        if (xzc0.m213720r().m213722A(contract)) {
            this.f93511b.m107276c("e_auto_renew_subscriptions_cancel_yes", "p_auto_renew_subscriptions_cancel_popup", new pf60[0]);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m120450y0(Contract contract, DialogInterface dialogInterface) {
        if (xzc0.m213720r().m213722A(contract)) {
            this.f93511b.m107274a("e_auto_renew_subscriptions_cancel_yes", "p_auto_renew_subscriptions_cancel_popup", new pf60[0]);
            this.f93511b.m107274a("e_auto_renew_subscriptions_cancel_no", "p_auto_renew_subscriptions_cancel_popup", new pf60[0]);
            this.f93511b.m107279f("p_auto_renew_subscriptions_cancel_popup", this.f93510a.getClass().getName());
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m120451z0(Contract contract, DialogInterface dialogInterface) {
        if (xzc0.m213720r().m213722A(contract)) {
            this.f93511b.m107276c("e_auto_renew_subscriptions_cancel_no", "p_auto_renew_subscriptions_cancel_popup", new pf60[0]);
            this.f93511b.m107275b("p_auto_renew_subscriptions_cancel_popup", this.f93510a.getClass().getName());
        }
    }
}
