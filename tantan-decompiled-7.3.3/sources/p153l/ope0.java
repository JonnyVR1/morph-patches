package p153l;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.app.AuthTask;
import com.alipay.sdk.app.PayTask;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.api.api.PaymentApi;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.RedPacket;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.live.base.data.BLivePkCategory;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes4.dex */
public class ope0 extends ar2<upe0> {

    /* JADX INFO: renamed from: a */
    public String f148455a;

    public ope0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m168651f0(Dialog dialog) {
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m168656k0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m168661t0(Bundle bundle) {
        this.f148455a = act().getIntent().getStringExtra(FirebaseAnalytics.Param.GROUP_ID);
        ((upe0) this.viewModel).m197082r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m168662u0(ChatGroup chatGroup) {
        ((upe0) this.viewModel).m197085w(chatGroup.memberCount);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m168663A0(PaymentApi.PaymentResultStatus paymentResultStatus) {
        if (PaymentApi.PaymentResultStatus.succeed.equals(paymentResultStatus)) {
            act().progressDismiss();
            act().m68056e2();
        } else if (PaymentApi.PaymentResultStatus.failed.equals(paymentResultStatus)) {
            act().progressDismiss();
            o1j0.m165634h(R$string.f21713g0);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m168664C0(Throwable th) {
        act().progressDismiss();
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).subCode;
            if (4000406 == i) {
                ((upe0) this.viewModel).m197087y();
                return;
            } else if (4000409 == i) {
                o1j0.m165636j("单日最多可发送20000元");
                return;
            }
        }
        o1j0.m165634h(R$string.f21713g0);
    }

    /* JADX INFO: renamed from: D0 */
    public void m168665D0(boolean z, String str, String str2) {
        duringCreated(CoreModule.f18264c.f20379d1.m35893w3(this.f148455a, z ? BLivePkCategory.random : "average", str, Integer.parseInt(str2))).observeOn(Schedulers.m222739io()).flatMap(new qcj() { // from class: l.hpe0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f111020a.m168672z0((RedPacket) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.ipe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116272a.m168663A0((PaymentApi.PaymentResultStatus) obj);
            }
        }, new y20() { // from class: l.jpe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122089a.m168664C0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.dpe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90046a.m168661t0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20387g0.m32911o6(act().getIntent().getStringExtra(FirebaseAnalytics.Param.GROUP_ID))).subscribe(psd0.m173597H(new y20() { // from class: l.fpe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100126a.m168662u0((ChatGroup) obj);
            }
        }, new y20() { // from class: l.gpe0
            @Override // p153l.y20
            public final void call(Object obj) {
                ope0.m168656k0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public void m168666p0() {
        duringCreated(CoreModule.f18264c.f20312H0.m155448k4(new AuthTask(act()))).subscribe(psd0.m173597H(new y20() { // from class: l.npe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143098a.m168669s0((pf60) obj);
            }
        }, new y20() { // from class: l.epe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95239a.m168668r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public String m168667q0() {
        return this.f148455a;
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m168668r0(Throwable th) {
        ((upe0) this.viewModel).m197077i(th);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m168669s0(pf60 pf60Var) {
        ((upe0) this.viewModel).m197078j(pf60Var);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m168670x0() {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m168671y0() {
        final Dialog dialogProgress = act().progress(act().getString(R$string.f21517I2), true);
        l51.m152888H(((upe0) this.viewModel).getAct(), new Runnable() { // from class: l.mpe0
            @Override // java.lang.Runnable
            public final void run() {
                ope0.m168651f0(dialogProgress);
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ C22421c m168672z0(RedPacket redPacket) {
        if (redPacket == null) {
            return C22421c.just(PaymentApi.PaymentResultStatus.failed);
        }
        l51.m152887G(new Runnable() { // from class: l.kpe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f127884a.m168670x0();
            }
        });
        if (!TextUtils.equals((CharSequence) new PayTask(act()).payV2(redPacket.paySign, true).get("resultStatus"), "9000")) {
            return C22421c.just(PaymentApi.PaymentResultStatus.failed);
        }
        l51.m152887G(new Runnable() { // from class: l.lpe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f133044a.m168671y0();
            }
        });
        return duringCreated(CoreModule.f18264c.f20379d1.m35889s3(redPacket.f21231id));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
