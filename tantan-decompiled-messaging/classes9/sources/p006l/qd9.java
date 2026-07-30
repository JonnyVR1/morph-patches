package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.LikeMindedData;
import com.p1.mobile.putong.core.data.LikeMindedEnvelope;
import com.p1.mobile.putong.core.data.LikeMindedRequestParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.e30;
import l.jo0;
import l.stc0;
import l.utc0;
import l.v9j;
import org.jetbrains.annotations.NotNull;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Ll/qd9;", "Ll/ax6;", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/LikeMindedRequestParams;", "data", "Lkotlin/Function1;", "Lcom/p1/mobile/putong/core/data/LikeMindedEnvelope;", "Lkotlin/ParameterName;", "name", "result", "", "callback", "g3", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/LikeMindedRequestParams;Lkotlin/jvm/functions/Function1;)V", "Lrx/c;", "h3", "(Lcom/p1/mobile/putong/core/data/LikeMindedRequestParams;)Lrx/c;", "Lrx/subjects/b;", "", "R", "Lrx/subjects/b;", "f3", "()Lrx/subjects/b;", "likeMindedSubject", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class qd9 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final b<Long> likeMindedSubject;

    public qd9() {
        b<Long> bVarB = b.b();
        bVarB.getClass();
        this.likeMindedSubject = bVarB;
    }

    /* JADX INFO: renamed from: a3 */
    public static void m22003a3(Throwable th) {
    }

    /* JADX INFO: renamed from: c3 */
    public static c m22005c3(final LikeMindedRequestParams likeMindedRequestParams) {
        return ia20.m16569c(new v9j() { // from class: l.pd9
            public final Object call() {
                return qd9.m22008i3(likeMindedRequestParams);
            }
        }, LikeMindedEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: d3 */
    public static void m22006d3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e3 */
    public static Unit m22007e3(qd9 qd9Var, Function1 function1, LikeMindedEnvelope likeMindedEnvelope) {
        LikeMindedData likeMindedData = likeMindedEnvelope.data;
        if (likeMindedData.active) {
            qd9Var.likeMindedSubject.onNext(Long.valueOf(likeMindedData.remain));
        } else {
            qd9Var.likeMindedSubject.onNext(0L);
        }
        function1.invoke(likeMindedEnvelope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i3 */
    public static final stc0 m22008i3(LikeMindedRequestParams likeMindedRequestParams) {
        return C0154a.f3483P.auth().q(C0154a.m3111B0()).l(utc0.create(Network.JSON, likeMindedRequestParams.toJson())).b();
    }

    @NotNull
    /* JADX INFO: renamed from: f3 */
    public final b<Long> m22009f3() {
        return this.likeMindedSubject;
    }

    /* JADX INFO: renamed from: g3 */
    public final void m22010g3(@NotNull Act act, @NotNull LikeMindedRequestParams data, @NotNull final Function1<? super LikeMindedEnvelope, Unit> callback) {
        c cVarObserveOn;
        act.getClass();
        data.getClass();
        callback.getClass();
        c cVarDuringCreated = act.duringCreated(CoreModule.f1534c.f3689y1.m22011h3(data));
        if (cVarDuringCreated == null || (cVarObserveOn = cVarDuringCreated.observeOn(jo0.a())) == null) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: l.ld9
            public final Object invoke(Object obj) {
                return qd9.m22007e3(this.f16335a, callback, (LikeMindedEnvelope) obj);
            }
        };
        cVarObserveOn.subscribe(new e30() { // from class: l.md9
            public final void call(Object obj) {
                qd9.m22006d3(function1, obj);
            }
        }, new e30() { // from class: l.nd9
            public final void call(Object obj) {
                qd9.m22003a3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public final c<LikeMindedEnvelope> m22011h3(final LikeMindedRequestParams data) {
        c<LikeMindedEnvelope> cVarScheduled = CoreModule.f1534c.scheduled("like-minded-query", 0, new v9j() { // from class: l.od9
            public final Object call() {
                return qd9.m22005c3(data);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }
}
