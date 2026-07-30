package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.LikeMindedData;
import com.p051p1.mobile.putong.core.data.LikeMindedEnvelope;
import com.p051p1.mobile.putong.core.data.LikeMindedRequestParams;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Ll/ze9;", "Ll/dy6;", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/LikeMindedRequestParams;", "data", "Lkotlin/Function1;", "Lcom/p1/mobile/putong/core/data/LikeMindedEnvelope;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, LovePlanetStage.result, "", "callback", "g3", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/LikeMindedRequestParams;Lkotlin/jvm/functions/Function1;)V", "Lrx/c;", "h3", "(Lcom/p1/mobile/putong/core/data/LikeMindedRequestParams;)Lrx/c;", "Lrx/subjects/b;", "", "R", "Lrx/subjects/b;", "f3", "()Lrx/subjects/b;", "likeMindedSubject", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ze9 extends dy6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final C22508b<Long> likeMindedSubject;

    public ze9() {
        C22508b<Long> c22508bM222767b = C22508b.m222767b();
        c22508bM222767b.getClass();
        this.likeMindedSubject = c22508bM222767b;
    }

    /* JADX INFO: renamed from: a3 */
    public static void m219405a3(Throwable th) {
    }

    /* JADX INFO: renamed from: c3 */
    public static C22421c m219407c3(final LikeMindedRequestParams likeMindedRequestParams) {
        return qi20.m176656c(new pcj() { // from class: l.ye9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return ze9.m219410i3(likeMindedRequestParams);
            }
        }, LikeMindedEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: d3 */
    public static void m219408d3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e3 */
    public static Unit m219409e3(ze9 ze9Var, Function1 function1, LikeMindedEnvelope likeMindedEnvelope) {
        LikeMindedData likeMindedData = likeMindedEnvelope.data;
        if (likeMindedData.active) {
            ze9Var.likeMindedSubject.m137019l(Long.valueOf(likeMindedData.remain));
        } else {
            ze9Var.likeMindedSubject.m137019l(0L);
        }
        function1.invoke(likeMindedEnvelope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i3 */
    public static final x1d0 m219410i3(LikeMindedRequestParams likeMindedRequestParams) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32184B0()).m209038l(z1d0.create(Network.JSON, likeMindedRequestParams.toJson())).m209028b();
    }

    @NotNull
    /* JADX INFO: renamed from: f3 */
    public final C22508b<Long> m219411f3() {
        return this.likeMindedSubject;
    }

    /* JADX INFO: renamed from: g3 */
    public final void m219412g3(@NotNull Act act, @NotNull LikeMindedRequestParams data, @NotNull final Function1<? super LikeMindedEnvelope, Unit> callback) {
        C22421c c22421cObserveOn;
        act.getClass();
        data.getClass();
        callback.getClass();
        C22421c c22421cDuringCreated = act.duringCreated(CoreModule.f18264c.f20442y1.m219413h3(data));
        if (c22421cDuringCreated == null || (c22421cObserveOn = c22421cDuringCreated.observeOn(fo0.m126432a())) == null) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: l.ue9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ze9.m219409e3(this.f178640a, callback, (LikeMindedEnvelope) obj);
            }
        };
        c22421cObserveOn.subscribe(new y20() { // from class: l.ve9
            @Override // p153l.y20
            public final void call(Object obj) {
                ze9.m219408d3(function1, obj);
            }
        }, new y20() { // from class: l.we9
            @Override // p153l.y20
            public final void call(Object obj) {
                ze9.m219405a3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public final C22421c<LikeMindedEnvelope> m219413h3(final LikeMindedRequestParams data) {
        C22421c<LikeMindedEnvelope> c22421cScheduled = CoreModule.f18264c.scheduled("like-minded-query", 0, new pcj() { // from class: l.xe9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return ze9.m219407c3(data);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }
}
