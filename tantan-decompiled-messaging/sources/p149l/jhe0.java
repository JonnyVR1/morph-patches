package p149l;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.app.AuthTask;
import com.alipay.sdk.app.PayTask;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.api.api.PaymentApi;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.RedPacket;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.live.base.data.BLivePkCategory;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes4.dex */
public class jhe0 extends jq2<phe0> {

    /* JADX INFO: renamed from: a */
    public String f117937a;

    public jhe0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m141501f0(Dialog dialog) {
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m141506k0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m141511t0(Bundle bundle) {
        this.f117937a = act().getIntent().getStringExtra(FirebaseAnalytics.Param.GROUP_ID);
        ((phe0) this.viewModel).m168957r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m141512u0(ChatGroup chatGroup) {
        ((phe0) this.viewModel).m168960w(chatGroup.memberCount);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m141513A0(PaymentApi.PaymentResultStatus paymentResultStatus) {
        if (PaymentApi.PaymentResultStatus.succeed.equals(paymentResultStatus)) {
            act().progressDismiss();
            act().m66873d2();
        } else if (PaymentApi.PaymentResultStatus.failed.equals(paymentResultStatus)) {
            act().progressDismiss();
            lsi0.m151578h(R$string.f20971g0);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m141514C0(Throwable th) {
        act().progressDismiss();
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).subCode;
            if (4000406 == i) {
                ((phe0) this.viewModel).m168962y();
                return;
            } else if (4000409 == i) {
                lsi0.m151580j("单日最多可发送20000元");
                return;
            }
        }
        lsi0.m151578h(R$string.f20971g0);
    }

    /* JADX INFO: renamed from: D0 */
    public void m141515D0(boolean z, String str, String str2) {
        duringCreated(CoreModule.f17545c.f19637d1.m34890w3(this.f117937a, z ? BLivePkCategory.random : "average", str, Integer.parseInt(str2))).observeOn(Schedulers.m221493io()).flatMap(new w9j() { // from class: l.che0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f80865a.m141522z0((RedPacket) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.dhe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86281a.m141513A0((PaymentApi.PaymentResultStatus) obj);
            }
        }, new e30() { // from class: l.ehe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91321a.m141514C0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.yge0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198161a.m141511t0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19645g0.m31908o6(act().getIntent().getStringExtra(FirebaseAnalytics.Param.GROUP_ID))).subscribe(mkd0.m154956H(new e30() { // from class: l.ahe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69595a.m141512u0((ChatGroup) obj);
            }
        }, new e30() { // from class: l.bhe0
            @Override // p149l.e30
            public final void call(Object obj) {
                jhe0.m141506k0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public void m141516p0() {
        duringCreated(CoreModule.f17545c.f19570H0.m210360k4(new AuthTask(act()))).subscribe(mkd0.m154956H(new e30() { // from class: l.ihe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113248a.m141519s0((j760) obj);
            }
        }, new e30() { // from class: l.zge0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203041a.m141518r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public String m141517q0() {
        return this.f117937a;
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m141518r0(Throwable th) {
        ((phe0) this.viewModel).m168952i(th);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m141519s0(j760 j760Var) {
        ((phe0) this.viewModel).m168953j(j760Var);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m141520x0() {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m141521y0() {
        final Dialog dialogProgress = act().progress(act().getString(R$string.f20775I2), true);
        e51.m114743H(((phe0) this.viewModel).getAct(), new Runnable() { // from class: l.hhe0
            @Override // java.lang.Runnable
            public final void run() {
                jhe0.m141501f0(dialogProgress);
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ C22306c m141522z0(RedPacket redPacket) {
        if (redPacket == null) {
            return C22306c.just(PaymentApi.PaymentResultStatus.failed);
        }
        e51.m114742G(new Runnable() { // from class: l.fhe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f97501a.m141520x0();
            }
        });
        if (!TextUtils.equals((CharSequence) new PayTask(act()).payV2(redPacket.paySign, true).get("resultStatus"), "9000")) {
            return C22306c.just(PaymentApi.PaymentResultStatus.failed);
        }
        e51.m114742G(new Runnable() { // from class: l.ghe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f102655a.m141521y0();
            }
        });
        return duringCreated(CoreModule.f17545c.f19637d1.m34886s3(redPacket.f20489id));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
