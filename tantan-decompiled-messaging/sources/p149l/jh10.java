package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.MultiCallEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Ll/jh10;", "Ll/ho2;", "D", "Ll/pat;", "Ll/bsm;", BaseSei.INFO, "Ll/j510;", "coreModule", "<init>", "(Ll/bsm;Ll/j510;)V", "", "count", "", "N3", "(I)V", Constants.KEY_T, "()V", RXScreenCaptureService.KEY_INDEX, "Ll/j510;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class jh10<D extends ho2> extends pat<D> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final j510<D> coreModule;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh10(@NotNull bsm<D> bsmVar, @NotNull j510<D> j510Var) {
        super(bsmVar);
        bsmVar.getClass();
        j510Var.getClass();
        this.coreModule = j510Var;
    }

    /* JADX INFO: renamed from: J3 */
    public static Integer m141359J3(jh10 jh10Var, c610 c610Var) {
        return Integer.valueOf(jh10Var.coreModule.m139800b4().m100374t());
    }

    /* JADX INFO: renamed from: K3 */
    public static void m141360K3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L3 */
    public static Unit m141361L3(jh10 jh10Var, Integer num) {
        num.getClass();
        jh10Var.m141363N3(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static void m141362M3(jh10 jh10Var, int i) {
        String strM141092a = je10.m141092a(i);
        jh10Var.coreModule.m139800b4().m100363D(strM141092a);
        jh10Var.m141363N3(new je10(strM141092a).f117456a);
    }

    /* JADX INFO: renamed from: N3 */
    private final void m141363N3(int count) {
        m206027E2().mo97490p();
        this.coreModule.m139800b4().m100362C(count);
        m206028F2().MultiCallEvent.deputyCountChange().mo172463j(Integer.valueOf(count));
        this.coreModule.m139818t4();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        LiveEventBus liveEventBusM206028F2 = m206028F2();
        liveEventBusM206028F2.getClass();
        C22306c c22306cDistinctUntilChanged = duringCreated((C22306c) liveEventBusM206028F2.new MultiCallEvent().switchDeputyCount().m172460g()).distinctUntilChanged();
        final Function1 function1 = new Function1() { // from class: l.fh10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return jh10.m141361L3(this.f97468a, (Integer) obj);
            }
        };
        c22306cDistinctUntilChanged.subscribe(new e30() { // from class: l.gh10
            @Override // p149l.e30
            public final void call(Object obj) {
                jh10.m141360K3(function1, obj);
            }
        });
        duringCreated((C22306c) m206028F2().PlayerEvent.onReceiveMultiCallMode().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.hh10
            @Override // p149l.e30
            public final void call(Object obj) {
                jh10.m141362M3(this.f107676a, ((Integer) obj).intValue());
            }
        }));
        m129301d3(c610.class, new w9j() { // from class: l.ih10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return jh10.m141359J3(this.f113199a, (c610) obj);
            }
        });
    }
}
