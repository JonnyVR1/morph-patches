package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveActivity;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallSummary;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/eh10;", "Ll/ho2;", "D", "Ll/zi2;", "Ll/xg10;", "Ll/bsm;", "infoPackage", "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "V3", "()Ll/xg10;", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", BLiveActivity.TYPE_MULTI_CALL, "W3", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)V", "k", "Ll/bsm;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class eh10<D extends ho2> extends zi2<D, xg10> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final bsm<D> infoPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh10(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        this.infoPackage = bsmVar;
    }

    /* JADX INFO: renamed from: R3 */
    public static Boolean m116420R3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m116421S3(eh10 eh10Var, BLiveMultiCall bLiveMultiCall) {
        bLiveMultiCall.getClass();
        eh10Var.m116428W3(bLiveMultiCall);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: T3 */
    public static Boolean m116422T3(eh10 eh10Var, BLiveMultiCall bLiveMultiCall) {
        return Boolean.valueOf((Intrinsics.m87488d(eh10Var.m206027E2().mo149813j().liveMode, "friends") && eh10Var.m206027E2().mo97490p()) ? false : true);
    }

    /* JADX INFO: renamed from: X3 */
    public static final Boolean m116424X3(eh10 eh10Var, BLiveMultiCallSummary bLiveMultiCallSummary) {
        return Boolean.valueOf(!eh10Var.m206026D2());
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Boolean m116425Y3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final void m116426Z3(eh10 eh10Var, BLiveMultiCallSummary bLiveMultiCallSummary) {
        eh10Var.m218910L3();
        xg10 xg10Var = (xg10) eh10Var.viewModel;
        bLiveMultiCallSummary.getClass();
        xg10Var.mo207142v(bLiveMultiCallSummary);
        eh10Var.mo168244N3();
    }

    @Override // p149l.zi2
    @NotNull
    /* JADX INFO: renamed from: V3, reason: merged with bridge method [inline-methods] */
    public xg10 mo75679K3() {
        Act act = this.infoPackage.f77095a;
        act.getClass();
        return new xg10(act);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m116428W3(BLiveMultiCall multiCall) {
        m206028F2().MultiCallEvent.showAudienceApplyIcon().mo172464m(Boolean.TRUE);
        if (multiCall != null) {
            C22306c<BLiveMultiCallSummary> c22306cM71564r6 = LivingNormalApiProvider.m71564r6(multiCall.f44400id);
            final Function1 function1 = new Function1() { // from class: l.bh10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return eh10.m116424X3(this.f75547a, (BLiveMultiCallSummary) obj);
                }
            };
            c22306cM71564r6.filter(new w9j() { // from class: l.ch10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return eh10.m116425Y3(function1, obj);
                }
            }).subscribe(ffw.m121197h(new e30() { // from class: l.dh10
                @Override // p149l.e30
                public final void call(Object obj) {
                    eh10.m116426Z3(this.f86226a, (BLiveMultiCallSummary) obj);
                }
            }));
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        C22306c<T> c22306cDuringCreated = duringCreated((C22306c) m206028F2().MultiCallEvent.hangUpSelfCall().m172460g());
        final Function1 function1 = new Function1() { // from class: l.yg10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eh10.m116422T3(this.f198111a, (BLiveMultiCall) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.zg10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eh10.m116420R3(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.ah10
            @Override // p149l.e30
            public final void call(Object obj) {
                eh10.m116421S3(this.f69540a, (BLiveMultiCall) obj);
            }
        }));
    }
}
