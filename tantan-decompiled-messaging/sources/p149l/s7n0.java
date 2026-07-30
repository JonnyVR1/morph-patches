package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R?\u0010\u001f\u001a&\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u000f0\u000f \u001a*\u0012\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m87232d2 = {"Ll/s7n0;", "Ll/nnn0;", "D", "Ll/zi2;", "Ll/j7n0;", "Ll/bsm;", "curInfo", "<init>", "(Ll/bsm;)V", "a4", "()Ll/j7n0;", "", Constants.KEY_T, "()V", "X3", "", RXScreenCaptureService.KEY_INDEX, "b4", "(I)V", FirebaseAnalytics.Param.INDEX, "c4", "k", "Ll/bsm;", "Y3", "()Ll/bsm;", "Lrx/subjects/b;", "kotlin.jvm.PlatformType", BLiveStormDanmakuGiftResourceType.f44444l, "Lkotlin/Lazy;", "Z3", "()Lrx/subjects/b;", "subject", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class s7n0<D extends nnn0> extends zi2<D, j7n0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final bsm<D> curInfo;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy subject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7n0(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        this.curInfo = bsmVar;
        this.subject = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.k7n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s7n0.m182498O3();
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public static C22393b m182498O3() {
        return C22393b.m221521b();
    }

    /* JADX INFO: renamed from: P3 */
    public static Boolean m182499P3(Integer num) {
        return Boolean.valueOf(num.intValue() > 500);
    }

    /* JADX INFO: renamed from: R3 */
    public static void m182500R3(s7n0 s7n0Var, Boolean bool) {
        j7n0 j7n0Var = (j7n0) s7n0Var.viewModel;
        bool.getClass();
        j7n0Var.m140109L(bool.booleanValue());
    }

    /* JADX INFO: renamed from: S3 */
    public static Integer m182501S3(Throwable th) {
        return 0;
    }

    /* JADX INFO: renamed from: T3 */
    public static Boolean m182502T3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m182503U3(s7n0 s7n0Var, Integer num) {
        num.getClass();
        s7n0Var.m182511c4(num.intValue());
    }

    /* JADX INFO: renamed from: V3 */
    public static Boolean m182504V3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static Boolean m182505W3(s7n0 s7n0Var, Integer num) {
        V v2 = s7n0Var.viewModel;
        return Boolean.valueOf(v2 != 0 && ((j7n0) v2).isShowing());
    }

    /* JADX INFO: renamed from: X3 */
    public final void m182506X3() {
        V v2 = this.viewModel;
        v2.getClass();
        ((j7n0) v2).mo71727j();
    }

    @NotNull
    /* JADX INFO: renamed from: Y3 */
    public final bsm<D> m182507Y3() {
        return this.curInfo;
    }

    /* JADX INFO: renamed from: Z3 */
    public final C22393b<Integer> m182508Z3() {
        return (C22393b) this.subject.getValue();
    }

    @Override // p149l.zi2
    @NotNull
    /* JADX INFO: renamed from: a4, reason: merged with bridge method [inline-methods] */
    public j7n0 mo75679K3() {
        return new j7n0();
    }

    /* JADX INFO: renamed from: b4 */
    public final void m182510b4(int i) {
        m182508Z3().onNext(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: c4 */
    public final void m182511c4(int index) {
        hfw.m130790a("[voice][call]", "showFunctionDialogBoard" + index);
        if (index < 0) {
            m182506X3();
            return;
        }
        m218910L3();
        mo168244N3();
        ((j7n0) this.viewModel).m140105E(index);
        w7n0.m202028e(this);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c) m206028F2().VoiceVirtualLiveEvent.showFunctionsDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.l7n0
            @Override // p149l.e30
            public final void call(Object obj) {
                s7n0.m182503U3(this.f126734a, (Integer) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(m182508Z3());
        final Function1 function1 = new Function1() { // from class: l.m7n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s7n0.m182505W3(this.f131835a, (Integer) obj);
            }
        };
        C22306c c22306cOnErrorReturn = c22306cDuringCreated.filter(new w9j() { // from class: l.n7n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return s7n0.m182502T3(function1, obj);
            }
        }).distinctUntilChanged().onErrorReturn(new w9j() { // from class: l.o7n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return s7n0.m182501S3((Throwable) obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.p7n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s7n0.m182499P3((Integer) obj);
            }
        };
        c22306cOnErrorReturn.map(new w9j() { // from class: l.q7n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return s7n0.m182504V3(function2, obj);
            }
        }).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.r7n0
            @Override // p149l.e30
            public final void call(Object obj) {
                s7n0.m182500R3(this.f158051a, (Boolean) obj);
            }
        }));
    }
}
