package p002l;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.consumealert.ConsumeAlertDialog;
import com.p1.mobile.putong.live.base.data.BLiveDailyPayment;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantan.live.eventbus.LiveEventBus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.bgv;
import l.bwr;
import l.e30;
import l.ffw;
import l.fld0;
import l.kvc0;
import l.lsi0;
import l.mqi0;
import l.soj0;
import l.ypv;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\nR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ll/qz5;", "Ll/x6s;", "Ll/ho2;", "Ll/ple0;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "", "Z3", "()V", "T", "", "isOpen", "", "count", "a4", "(ZI)V", "Y3", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "j", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "consumeAlertMenuDialog", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class qz5 extends x6s<ho2, ple0> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public C0200a consumeAlertMenuDialog;

    public qz5(@Nullable bsm<? extends ho2> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static Unit m21625S3(qz5 qz5Var, soj0 soj0Var) {
        qz5Var.m21633Y3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static Unit m21626T3(qz5 qz5Var, soj0 soj0Var) {
        if (((bwr) qz5Var).viewModel == null) {
            qz5Var.C(new ple0(t6c0.f20007s5, qz5Var.f22037f, qz5Var));
        }
        qz5Var.m21631Z3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static void m21627U3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m21628V3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static void m21629W3(boolean z, BLiveEnvelope bLiveEnvelope) {
        if (z && bLiveEnvelope.meta.code == 200) {
            lsi0.y(kvc0.d(R$string.f2601A2));
        }
        ((bgv) ypv.l(fld0.f)).v("");
    }

    /* JADX INFO: renamed from: X3 */
    public static void m21630X3(qz5 qz5Var, BLiveDailyPayment bLiveDailyPayment) {
        ple0 ple0Var = (ple0) ((bwr) qz5Var).viewModel;
        bLiveDailyPayment.getClass();
        ple0Var.m20466r0(bLiveDailyPayment);
    }

    /* JADX INFO: renamed from: Z3 */
    private final void m21631Z3() {
        duringCreated(zfv.m27309u0(ypv.a.D0())).subscribe(ffw.h(new e30() { // from class: l.pz5
            public final void call(Object obj) {
                qz5.m21630X3(this.f17726a, (BLiveDailyPayment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m21632T() {
        super.T();
        LiveEventBus liveEventBusM25548F2 = m25548F2();
        liveEventBusM25548F2.getClass();
        c cVarDuringCreated = duringCreated((c) new LiveEventBus.ConsumeAlertEvent(liveEventBusM25548F2).showSetConsumeAlertDialog().g());
        final Function1 function1 = new Function1() { // from class: l.kz5
            public final Object invoke(Object obj) {
                return qz5.m21626T3(this.f14598a, (soj0) obj);
            }
        };
        cVarDuringCreated.subscribe(new e30() { // from class: l.lz5
            public final void call(Object obj) {
                qz5.m21628V3(function1, obj);
            }
        });
        LiveEventBus liveEventBusM25548F3 = m25548F2();
        liveEventBusM25548F3.getClass();
        c cVarDuringCreated2 = duringCreated((c) new LiveEventBus.ConsumeAlertEvent(liveEventBusM25548F3).showConsumeAlertDialog().g());
        final Function1 function2 = new Function1() { // from class: l.mz5
            public final Object invoke(Object obj) {
                return qz5.m21625S3(this.f15749a, (soj0) obj);
            }
        };
        cVarDuringCreated2.subscribe(new e30() { // from class: l.nz5
            public final void call(Object obj) {
                qz5.m21627U3(function2, obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, com.p1.mobile.putong.live.livingroom.increment.gift.consumealert.ConsumeAlertDialog] */
    /* JADX INFO: renamed from: Y3 */
    public final void m21633Y3() {
        a aVar = this.consumeAlertMenuDialog;
        if (aVar != null) {
            aVar.getClass();
            if (aVar.isShowing()) {
                return;
            }
        }
        Object objInflate = act().inflater().inflate(t6c0.f19924m0, (ViewGroup) null);
        objInflate.getClass();
        ?? r0 = (ConsumeAlertDialog) objInflate;
        this.consumeAlertMenuDialog = new C0200a(act(), r0);
        String strH = ((bgv) ypv.l(fld0.f)).h();
        if (TextUtils.isEmpty(strH) || !TextUtils.equals(mqi0.t(), strH)) {
            C0200a c0200a = this.consumeAlertMenuDialog;
            c0200a.getClass();
            r0.m7036k0(c0200a);
            C0200a c0200a2 = this.consumeAlertMenuDialog;
            c0200a2.getClass();
            c0200a2.show();
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m21634a4(final boolean isOpen, int count) {
        duringCreated(zfv.m27304s1(ypv.a.D0(), isOpen, count)).subscribe(ffw.h(new e30() { // from class: l.oz5
            public final void call(Object obj) {
                qz5.m21629W3(isOpen, (BLiveEnvelope) obj);
            }
        }));
    }
}
