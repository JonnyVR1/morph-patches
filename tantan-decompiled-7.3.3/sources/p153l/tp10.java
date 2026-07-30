package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.MultiCallEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Ll/tp10;", "Ll/oo2;", "D", "Ll/qct;", "Ll/dum;", BaseSei.INFO, "Ll/td10;", "coreModule", "<init>", "(Ll/dum;Ll/td10;)V", "", "count", "", "N3", "(I)V", Constants.KEY_T, "()V", RXScreenCaptureService.KEY_INDEX, "Ll/td10;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class tp10<D extends oo2> extends qct<D> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final td10<D> coreModule;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp10(@NotNull dum<D> dumVar, @NotNull td10<D> td10Var) {
        super(dumVar);
        dumVar.getClass();
        td10Var.getClass();
        this.coreModule = td10Var;
    }

    /* JADX INFO: renamed from: J3 */
    public static Integer m192111J3(tp10 tp10Var, me10 me10Var) {
        return Integer.valueOf(tp10Var.coreModule.m190584b4().m153852t());
    }

    /* JADX INFO: renamed from: K3 */
    public static void m192112K3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L3 */
    public static Unit m192113L3(tp10 tp10Var, Integer num) {
        num.getClass();
        tp10Var.m192115N3(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static void m192114M3(tp10 tp10Var, int i) {
        String strM191715a = tm10.m191715a(i);
        tp10Var.coreModule.m190584b4().m153841D(strM191715a);
        tp10Var.m192115N3(new tm10(strM191715a).f174877a);
    }

    /* JADX INFO: renamed from: N3 */
    private final void m192115N3(int count) {
        m213810E2().mo118373p();
        this.coreModule.m190584b4().m153840C(count);
        m213811F2().MultiCallEvent.deputyCountChange().mo199273j(Integer.valueOf(count));
        this.coreModule.m190602t4();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        LiveEventBus liveEventBusM213811F2 = m213811F2();
        liveEventBusM213811F2.getClass();
        C22421c c22421cDistinctUntilChanged = duringCreated((C22421c) liveEventBusM213811F2.new MultiCallEvent().switchDeputyCount().m199270g()).distinctUntilChanged();
        final Function1 function1 = new Function1() { // from class: l.pp10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return tp10.m192113L3(this.f153478a, (Integer) obj);
            }
        };
        c22421cDistinctUntilChanged.subscribe(new y20() { // from class: l.qp10
            @Override // p153l.y20
            public final void call(Object obj) {
                tp10.m192112K3(function1, obj);
            }
        });
        duringCreated((C22421c) m213811F2().PlayerEvent.onReceiveMultiCallMode().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.rp10
            @Override // p153l.y20
            public final void call(Object obj) {
                tp10.m192114M3(this.f164297a, ((Integer) obj).intValue());
            }
        }));
        m138860d3(me10.class, new qcj() { // from class: l.sp10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return tp10.m192111J3(this.f169997a, (me10) obj);
            }
        });
    }
}
