package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.LikeMindedData;
import com.p046p1.mobile.putong.core.data.LikeMindedEnvelope;
import com.p046p1.mobile.putong.core.data.LikeMindedRequestParams;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m87232d2 = {"Ll/qd9;", "Ll/ax6;", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/LikeMindedRequestParams;", "data", "Lkotlin/Function1;", "Lcom/p1/mobile/putong/core/data/LikeMindedEnvelope;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, LovePlanetStage.result, "", "callback", "g3", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/LikeMindedRequestParams;Lkotlin/jvm/functions/Function1;)V", "Lrx/c;", "h3", "(Lcom/p1/mobile/putong/core/data/LikeMindedRequestParams;)Lrx/c;", "Lrx/subjects/b;", "", "R", "Lrx/subjects/b;", "f3", "()Lrx/subjects/b;", "likeMindedSubject", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class qd9 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final C22393b<Long> likeMindedSubject;

    public qd9() {
        C22393b<Long> c22393bM221521b = C22393b.m221521b();
        c22393bM221521b.getClass();
        this.likeMindedSubject = c22393bM221521b;
    }

    /* JADX INFO: renamed from: a3 */
    public static void m174000a3(Throwable th) {
    }

    /* JADX INFO: renamed from: c3 */
    public static C22306c m174002c3(final LikeMindedRequestParams likeMindedRequestParams) {
        return ia20.m135119c(new v9j() { // from class: l.pd9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qd9.m174005i3(likeMindedRequestParams);
            }
        }, LikeMindedEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: d3 */
    public static void m174003d3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e3 */
    public static Unit m174004e3(qd9 qd9Var, Function1 function1, LikeMindedEnvelope likeMindedEnvelope) {
        LikeMindedData likeMindedData = likeMindedEnvelope.data;
        if (likeMindedData.active) {
            qd9Var.likeMindedSubject.m132487l(Long.valueOf(likeMindedData.remain));
        } else {
            qd9Var.likeMindedSubject.m132487l(0L);
        }
        function1.invoke(likeMindedEnvelope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i3 */
    public static final stc0 m174005i3(LikeMindedRequestParams likeMindedRequestParams) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31181B0()).m185893l(utc0.create(Network.JSON, likeMindedRequestParams.toJson())).m185883b();
    }

    @NotNull
    /* JADX INFO: renamed from: f3 */
    public final C22393b<Long> m174006f3() {
        return this.likeMindedSubject;
    }

    /* JADX INFO: renamed from: g3 */
    public final void m174007g3(@NotNull Act act, @NotNull LikeMindedRequestParams data, @NotNull final Function1<? super LikeMindedEnvelope, Unit> callback) {
        C22306c c22306cObserveOn;
        act.getClass();
        data.getClass();
        callback.getClass();
        C22306c c22306cDuringCreated = act.duringCreated(CoreModule.f17545c.f19700y1.m174008h3(data));
        if (c22306cDuringCreated == null || (c22306cObserveOn = c22306cDuringCreated.observeOn(jo0.m142408a())) == null) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: l.ld9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qd9.m174004e3(this.f127528a, callback, (LikeMindedEnvelope) obj);
            }
        };
        c22306cObserveOn.subscribe(new e30() { // from class: l.md9
            @Override // p149l.e30
            public final void call(Object obj) {
                qd9.m174003d3(function1, obj);
            }
        }, new e30() { // from class: l.nd9
            @Override // p149l.e30
            public final void call(Object obj) {
                qd9.m174000a3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public final C22306c<LikeMindedEnvelope> m174008h3(final LikeMindedRequestParams data) {
        C22306c<LikeMindedEnvelope> c22306cScheduled = CoreModule.f17545c.scheduled("like-minded-query", 0, new v9j() { // from class: l.od9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qd9.m174002c3(data);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }
}
