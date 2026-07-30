package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveDailyPayment;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.consumealert.ConsumeAlertDialog;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.ConsumeAlertEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\nR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Ll/qz5;", "Ll/x6s;", "Ll/ho2;", "Ll/ple0;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", "Z3", "()V", j6f.GPS_DIRECTION_TRUE, "", "isOpen", "", "count", "a4", "(ZI)V", "Y3", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "j", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "consumeAlertMenuDialog", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class qz5 extends x6s<ho2, ple0> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public DialogC12611a consumeAlertMenuDialog;

    public qz5(@Nullable bsm<? extends ho2> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static Unit m177113S3(qz5 qz5Var, soj0 soj0Var) {
        qz5Var.m177120Y3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static Unit m177114T3(qz5 qz5Var, soj0 soj0Var) {
        if (qz5Var.viewModel == 0) {
            qz5Var.mo51532C(new ple0(t6c0.f168511s5, qz5Var.f188513f, qz5Var));
        }
        qz5Var.m177119Z3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static void m177115U3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m177116V3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static void m177117W3(boolean z, BLiveEnvelope bLiveEnvelope) {
        if (z && bLiveEnvelope.meta.code == 200) {
            lsi0.m151595y(kvc0.m147355d(R$string.f46559A2));
        }
        ((bgv) ypv.m215673l(fld0.f98151f)).m101742v("");
    }

    /* JADX INFO: renamed from: X3 */
    public static void m177118X3(qz5 qz5Var, BLiveDailyPayment bLiveDailyPayment) {
        ple0 ple0Var = (ple0) qz5Var.viewModel;
        bLiveDailyPayment.getClass();
        ple0Var.m170161r0(bLiveDailyPayment);
    }

    /* JADX INFO: renamed from: Z3 */
    private final void m177119Z3() {
        duringCreated(zfv.m218606u0(ypv.f199493a.m199309D0())).subscribe(ffw.m121197h(new e30() { // from class: l.pz5
            @Override // p149l.e30
            public final void call(Object obj) {
                qz5.m177118X3(this.f151916a, (BLiveDailyPayment) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        LiveEventBus liveEventBusM206028F2 = m206028F2();
        liveEventBusM206028F2.getClass();
        C22306c<T> c22306cDuringCreated = duringCreated(liveEventBusM206028F2.new ConsumeAlertEvent().showSetConsumeAlertDialog().m172460g());
        final Function1 function1 = new Function1() { // from class: l.kz5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qz5.m177114T3(this.f125357a, (soj0) obj);
            }
        };
        c22306cDuringCreated.subscribe(new e30() { // from class: l.lz5
            @Override // p149l.e30
            public final void call(Object obj) {
                qz5.m177116V3(function1, obj);
            }
        });
        LiveEventBus liveEventBusM206028F3 = m206028F2();
        liveEventBusM206028F3.getClass();
        C22306c<T> c22306cDuringCreated2 = duringCreated(liveEventBusM206028F3.new ConsumeAlertEvent().showConsumeAlertDialog().m172460g());
        final Function1 function2 = new Function1() { // from class: l.mz5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qz5.m177113S3(this.f136349a, (soj0) obj);
            }
        };
        c22306cDuringCreated2.subscribe(new e30() { // from class: l.nz5
            @Override // p149l.e30
            public final void call(Object obj) {
                qz5.m177115U3(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m177120Y3() {
        DialogC12611a dialogC12611a = this.consumeAlertMenuDialog;
        if (dialogC12611a != null) {
            dialogC12611a.getClass();
            if (dialogC12611a.isShowing()) {
                return;
            }
        }
        View viewInflate = act().inflater().inflate(t6c0.f168428m0, (ViewGroup) null);
        viewInflate.getClass();
        ConsumeAlertDialog consumeAlertDialog = (ConsumeAlertDialog) viewInflate;
        this.consumeAlertMenuDialog = new DialogC12611a(act(), consumeAlertDialog);
        String strM101728h = ((bgv) ypv.m215673l(fld0.f98151f)).m101728h();
        if (TextUtils.isEmpty(strM101728h) || !TextUtils.equals(mqi0.m155949t(), strM101728h)) {
            DialogC12611a dialogC12611a2 = this.consumeAlertMenuDialog;
            dialogC12611a2.getClass();
            consumeAlertDialog.m73494k0(dialogC12611a2);
            DialogC12611a dialogC12611a3 = this.consumeAlertMenuDialog;
            dialogC12611a3.getClass();
            dialogC12611a3.show();
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m177121a4(final boolean isOpen, int count) {
        duringCreated(zfv.m218601s1(ypv.f199493a.m199309D0(), isOpen, count)).subscribe(ffw.m121197h(new e30() { // from class: l.oz5
            @Override // p149l.e30
            public final void call(Object obj) {
                qz5.m177117W3(isOpen, (BLiveEnvelope) obj);
            }
        }));
    }
}
