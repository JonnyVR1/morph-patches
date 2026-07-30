package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallAnnouncement;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.MultiCallEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/v5d0;", "Ll/ho2;", "D", "Ll/zi2;", "Ll/q5d0;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "T3", "()Ll/q5d0;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class v5d0<D extends ho2> extends zi2<D, q5d0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5d0(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: O3 */
    public static Boolean m197106O3(v5d0 v5d0Var, BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement) {
        q5d0 q5d0Var = (q5d0) v5d0Var.viewModel;
        return Boolean.valueOf(q5d0Var != null ? q5d0Var.isShowing() : false);
    }

    /* JADX INFO: renamed from: P3 */
    public static Boolean m197107P3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R3 */
    public static void m197108R3(v5d0 v5d0Var, Boolean bool) {
        v5d0Var.m218910L3();
        v5d0Var.mo168244N3();
        r610.INSTANCE.m178022f0(v5d0Var);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m197109S3(v5d0 v5d0Var, BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement) {
        q5d0 q5d0Var = (q5d0) v5d0Var.viewModel;
        bLiveMultiCallAnnouncement.getClass();
        q5d0Var.m173000w(bLiveMultiCallAnnouncement);
    }

    @Override // p149l.zi2
    @NotNull
    /* JADX INFO: renamed from: T3, reason: merged with bridge method [inline-methods] */
    public q5d0 mo75679K3() {
        return new q5d0();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        r610.INSTANCE.m178022f0(this);
        duringCreated((C22306c) m206028F2().MultiCallEvent.showAnnouncementDlg().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.r5d0
            @Override // p149l.e30
            public final void call(Object obj) {
                v5d0.m197108R3(this.f157803a, (Boolean) obj);
            }
        }));
        LiveEventBus liveEventBusM206028F2 = m206028F2();
        liveEventBusM206028F2.getClass();
        C22306c<BLiveMultiCallAnnouncement> c22306cM172460g = liveEventBusM206028F2.new MultiCallEvent().announcementData().m172460g();
        final Function1 function1 = new Function1() { // from class: l.s5d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v5d0.m197106O3(this.f162543a, (BLiveMultiCallAnnouncement) obj);
            }
        };
        duringCreated(c22306cM172460g.filter(new w9j() { // from class: l.t5d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return v5d0.m197107P3(function1, obj);
            }
        })).subscribe(ffw.m121197h(new e30() { // from class: l.u5d0
            @Override // p149l.e30
            public final void call(Object obj) {
                v5d0.m197109S3(this.f174696a, (BLiveMultiCallAnnouncement) obj);
            }
        }));
    }
}
