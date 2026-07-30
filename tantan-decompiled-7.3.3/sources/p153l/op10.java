package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallSummary;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/op10;", "Ll/oo2;", "D", "Ll/hj2;", "Ll/hp10;", "Ll/dum;", "infoPackage", "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "V3", "()Ll/hp10;", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", BLiveActivity.TYPE_MULTI_CALL, "W3", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)V", "k", "Ll/dum;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class op10<D extends oo2> extends hj2<D, hp10> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final dum<D> infoPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op10(@NotNull dum<D> dumVar) {
        super(dumVar);
        dumVar.getClass();
        this.infoPackage = dumVar;
    }

    /* JADX INFO: renamed from: R3 */
    public static Boolean m168611R3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m168612S3(op10 op10Var, BLiveMultiCall bLiveMultiCall) {
        bLiveMultiCall.getClass();
        op10Var.m168619W3(bLiveMultiCall);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: T3 */
    public static Boolean m168613T3(op10 op10Var, BLiveMultiCall bLiveMultiCall) {
        return Boolean.valueOf((Intrinsics.m88377d(op10Var.m213810E2().mo183435j().liveMode, "friends") && op10Var.m213810E2().mo118373p()) ? false : true);
    }

    /* JADX INFO: renamed from: X3 */
    public static final Boolean m168615X3(op10 op10Var, BLiveMultiCallSummary bLiveMultiCallSummary) {
        return Boolean.valueOf(!op10Var.m213809D2());
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Boolean m168616Y3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final void m168617Z3(op10 op10Var, BLiveMultiCallSummary bLiveMultiCallSummary) {
        op10Var.m135319L3();
        hp10 hp10Var = (hp10) op10Var.viewModel;
        bLiveMultiCallSummary.getClass();
        hp10Var.mo136466v(bLiveMultiCallSummary);
        op10Var.mo135321N3();
    }

    @Override // p153l.hj2
    @NotNull
    /* JADX INFO: renamed from: V3, reason: merged with bridge method [inline-methods] */
    public hp10 mo76862K3() {
        Act act = this.infoPackage.f90815a;
        act.getClass();
        return new hp10(act);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m168619W3(BLiveMultiCall multiCall) {
        m213811F2().MultiCallEvent.showAudienceApplyIcon().mo199274m(Boolean.TRUE);
        if (multiCall != null) {
            C22421c<BLiveMultiCallSummary> c22421cM72747r6 = LivingNormalApiProvider.m72747r6(multiCall.f45248id);
            final Function1 function1 = new Function1() { // from class: l.lp10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return op10.m168615X3(this.f132995a, (BLiveMultiCallSummary) obj);
                }
            };
            c22421cM72747r6.filter(new qcj() { // from class: l.mp10
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return op10.m168616Y3(function1, obj);
                }
            }).subscribe(dhw.m115829h(new y20() { // from class: l.np10
                @Override // p153l.y20
                public final void call(Object obj) {
                    op10.m168617Z3(this.f143067a, (BLiveMultiCallSummary) obj);
                }
            }));
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        C22421c<T> c22421cDuringCreated = duringCreated((C22421c) m213811F2().MultiCallEvent.hangUpSelfCall().m199270g());
        final Function1 function1 = new Function1() { // from class: l.ip10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return op10.m168613T3(this.f116249a, (BLiveMultiCall) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.jp10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return op10.m168611R3(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.kp10
            @Override // p153l.y20
            public final void call(Object obj) {
                op10.m168612S3(this.f127824a, (BLiveMultiCall) obj);
            }
        }));
    }
}
