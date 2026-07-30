package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveDailyPayment;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.consumealert.ConsumeAlertDialog;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.ConsumeAlertEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\nR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Ll/v06;", "Ll/y8s;", "Ll/oo2;", "Ll/ute0;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", "Z3", "()V", p7f.GPS_DIRECTION_TRUE, "", "isOpen", "", "count", "a4", "(ZI)V", "Y3", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "j", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "consumeAlertMenuDialog", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class v06 extends y8s<oo2, ute0> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public DialogC12774a consumeAlertMenuDialog;

    public v06(@Nullable dum<? extends oo2> dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static Unit m198882S3(v06 v06Var, vxj0 vxj0Var) {
        v06Var.m198889Y3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static Unit m198883T3(v06 v06Var, vxj0 vxj0Var) {
        if (v06Var.viewModel == 0) {
            v06Var.mo52715C(new ute0(yec0.f199243s5, v06Var.f196919f, v06Var));
        }
        v06Var.m198888Z3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static void m198884U3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m198885V3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static void m198886W3(boolean z, BLiveEnvelope bLiveEnvelope) {
        if (z && bLiveEnvelope.meta.code == 200) {
            o1j0.m165651y(n3d0.m161280d(R$string.f47407A2));
        }
        ((civ) zrv.m221194l(htd0.f111524f)).m109978v("");
    }

    /* JADX INFO: renamed from: X3 */
    public static void m198887X3(v06 v06Var, BLiveDailyPayment bLiveDailyPayment) {
        ute0 ute0Var = (ute0) v06Var.viewModel;
        bLiveDailyPayment.getClass();
        ute0Var.m198025r0(bLiveDailyPayment);
    }

    /* JADX INFO: renamed from: Z3 */
    private final void m198888Z3() {
        duringCreated(aiv.m98140u0(zrv.f205799a.m207631D0())).subscribe(dhw.m115829h(new y20() { // from class: l.u06
            @Override // p153l.y20
            public final void call(Object obj) {
                v06.m198887X3(this.f176849a, (BLiveDailyPayment) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        LiveEventBus liveEventBusM213811F2 = m213811F2();
        liveEventBusM213811F2.getClass();
        C22421c<T> c22421cDuringCreated = duringCreated(liveEventBusM213811F2.new ConsumeAlertEvent().showSetConsumeAlertDialog().m199270g());
        final Function1 function1 = new Function1() { // from class: l.p06
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v06.m198883T3(this.f150010a, (vxj0) obj);
            }
        };
        c22421cDuringCreated.subscribe(new y20() { // from class: l.q06
            @Override // p153l.y20
            public final void call(Object obj) {
                v06.m198885V3(function1, obj);
            }
        });
        LiveEventBus liveEventBusM213811F3 = m213811F2();
        liveEventBusM213811F3.getClass();
        C22421c<T> c22421cDuringCreated2 = duringCreated(liveEventBusM213811F3.new ConsumeAlertEvent().showConsumeAlertDialog().m199270g());
        final Function1 function2 = new Function1() { // from class: l.r06
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v06.m198882S3(this.f160586a, (vxj0) obj);
            }
        };
        c22421cDuringCreated2.subscribe(new y20() { // from class: l.s06
            @Override // p153l.y20
            public final void call(Object obj) {
                v06.m198884U3(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m198889Y3() {
        DialogC12774a dialogC12774a = this.consumeAlertMenuDialog;
        if (dialogC12774a != null) {
            dialogC12774a.getClass();
            if (dialogC12774a.isShowing()) {
                return;
            }
        }
        View viewInflate = act().inflater().inflate(yec0.f199160m0, (ViewGroup) null);
        viewInflate.getClass();
        ConsumeAlertDialog consumeAlertDialog = (ConsumeAlertDialog) viewInflate;
        this.consumeAlertMenuDialog = new DialogC12774a(act(), consumeAlertDialog);
        String strM109964h = ((civ) zrv.m221194l(htd0.f111524f)).m109964h();
        if (TextUtils.isEmpty(strM109964h) || !TextUtils.equals(pzi0.m174459t(), strM109964h)) {
            DialogC12774a dialogC12774a2 = this.consumeAlertMenuDialog;
            dialogC12774a2.getClass();
            consumeAlertDialog.m74677k0(dialogC12774a2);
            DialogC12774a dialogC12774a3 = this.consumeAlertMenuDialog;
            dialogC12774a3.getClass();
            dialogC12774a3.show();
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m198890a4(final boolean isOpen, int count) {
        duringCreated(aiv.m98135s1(zrv.f205799a.m207631D0(), isOpen, count)).subscribe(dhw.m115829h(new y20() { // from class: l.t06
            @Override // p153l.y20
            public final void call(Object obj) {
                v06.m198886W3(isOpen, (BLiveEnvelope) obj);
            }
        }));
    }
}
