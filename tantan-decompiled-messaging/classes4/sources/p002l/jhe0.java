package p002l;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.app.AuthTask;
import com.alipay.sdk.app.PayTask;
import com.p1.mobile.putong.api.api.PaymentApi;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.RedPacket;
import com.p1.mobile.putong.core.message.R;
import l.e30;
import l.e51;
import l.j760;
import l.jo0;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.w9j;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jhe0 extends jq2<phe0> {

    /* JADX INFO: renamed from: a */
    public String f13773a;

    public jhe0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m15916f0(Dialog dialog) {
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m15921k0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m15926t0(Bundle bundle) {
        this.f13773a = act().getIntent().getStringExtra("group_id");
        ((phe0) ((jq2) this).viewModel).m20308r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m15927u0(ChatGroup chatGroup) {
        ((phe0) ((jq2) this).viewModel).m20311w(chatGroup.memberCount);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m15928A0(PaymentApi.PaymentResultStatus paymentResultStatus) {
        if (PaymentApi.PaymentResultStatus.succeed.equals(paymentResultStatus)) {
            act().progressDismiss();
            act().finish();
        } else if (PaymentApi.PaymentResultStatus.failed.equals(paymentResultStatus)) {
            act().progressDismiss();
            lsi0.h(R.string.g0);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m15929C0(Throwable th) {
        act().progressDismiss();
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).subCode;
            if (4000406 == i) {
                ((phe0) ((jq2) this).viewModel).m20313y();
                return;
            } else if (4000409 == i) {
                lsi0.j("单日最多可发送20000元");
                return;
            }
        }
        lsi0.h(R.string.g0);
    }

    /* JADX INFO: renamed from: D0 */
    public void m15930D0(boolean z, String str, String str2) {
        duringCreated(CoreModule.c.d1.w3(this.f13773a, z ? "random" : "average", str, Integer.parseInt(str2))).observeOn(Schedulers.io()).flatMap(new w9j() { // from class: l.che0
            public final Object call(Object obj) {
                return this.f8673a.m15938z0((RedPacket) obj);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.dhe0
            public final void call(Object obj) {
                this.f9276a.m15928A0((PaymentApi.PaymentResultStatus) obj);
            }
        }, new e30() { // from class: l.ehe0
            public final void call(Object obj) {
                this.f9793a.m15929C0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m15931a0() {
        creates(new e30() { // from class: l.yge0
            public final void call(Object obj) {
                this.f22875a.m15926t0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.g0.o6(act().getIntent().getStringExtra("group_id"))).subscribe(mkd0.H(new e30() { // from class: l.ahe0
            public final void call(Object obj) {
                this.f7617a.m15927u0((ChatGroup) obj);
            }
        }, new e30() { // from class: l.bhe0
            public final void call(Object obj) {
                jhe0.m15921k0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public void m15932p0() {
        duringCreated(CoreModule.c.H0.k4(new AuthTask(act()))).subscribe(mkd0.H(new e30() { // from class: l.ihe0
            public final void call(Object obj) {
                this.f13246a.m15935s0((j760) obj);
            }
        }, new e30() { // from class: l.zge0
            public final void call(Object obj) {
                this.f23400a.m15934r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public String m15933q0() {
        return this.f13773a;
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m15934r0(Throwable th) {
        ((phe0) ((jq2) this).viewModel).m20302i(th);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m15935s0(j760 j760Var) {
        ((phe0) ((jq2) this).viewModel).m20304j(j760Var);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m15936x0() {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m15937y0() {
        final Dialog dialogProgress = act().progress(act().getString(R.string.I2), true);
        e51.H(((phe0) ((jq2) this).viewModel).act(), new Runnable() { // from class: l.hhe0
            @Override // java.lang.Runnable
            public final void run() {
                jhe0.m15916f0(dialogProgress);
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ c m15938z0(RedPacket redPacket) {
        if (redPacket == null) {
            return c.just(PaymentApi.PaymentResultStatus.failed);
        }
        e51.G(new Runnable() { // from class: l.fhe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10354a.m15936x0();
            }
        });
        if (!TextUtils.equals((CharSequence) new PayTask(act()).payV2(redPacket.paySign, true).get("resultStatus"), "9000")) {
            return c.just(PaymentApi.PaymentResultStatus.failed);
        }
        e51.G(new Runnable() { // from class: l.ghe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11439a.m15937y0();
            }
        });
        return duringCreated(CoreModule.c.d1.s3(redPacket.id));
    }

    public void destroy() {
    }
}
