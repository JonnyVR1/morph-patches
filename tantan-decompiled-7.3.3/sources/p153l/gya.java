package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.LikeMindedEnvelope;
import com.p051p1.mobile.putong.core.data.LikeMindedRequestParams;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ@\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/gya;", "Ll/dy6;", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/LikeMindedRequestParams;", "data", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/LikeMindedEnvelope;", "f3", "(Lcom/p1/mobile/putong/core/data/LikeMindedRequestParams;)Lrx/c;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, LovePlanetStage.result, "", "callback", "e3", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/LikeMindedRequestParams;Lkotlin/jvm/functions/Function1;)V", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gya extends dy6 {
    /* JADX INFO: renamed from: a3 */
    public static C22421c m132940a3(final LikeMindedRequestParams likeMindedRequestParams) {
        return qi20.m176656c(new pcj() { // from class: l.fya
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return gya.m132945g3(likeMindedRequestParams);
            }
        }, LikeMindedEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: c3 */
    public static void m132942c3(Throwable th) {
    }

    /* JADX INFO: renamed from: d3 */
    public static void m132943d3(Function1 function1, LikeMindedEnvelope likeMindedEnvelope) {
        likeMindedEnvelope.getClass();
        function1.invoke(likeMindedEnvelope);
    }

    /* JADX INFO: renamed from: f3 */
    private final C22421c<LikeMindedEnvelope> m132944f3(final LikeMindedRequestParams data) {
        C22421c<LikeMindedEnvelope> c22421cScheduled = CoreModule.f18264c.scheduled("similar-interests-query", 0, new pcj() { // from class: l.eya
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return gya.m132940a3(data);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public static final x1d0 m132945g3(LikeMindedRequestParams likeMindedRequestParams) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32293d2()).m209038l(z1d0.create(Network.JSON, likeMindedRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: e3 */
    public final void m132946e3(@NotNull Act act, @NotNull LikeMindedRequestParams data, @NotNull final Function1<? super LikeMindedEnvelope, Unit> callback) {
        C22421c c22421cObserveOn;
        act.getClass();
        data.getClass();
        callback.getClass();
        C22421c c22421cDuringCreated = act.duringCreated(CoreModule.f18264c.f20295B1.m132944f3(data));
        if (c22421cDuringCreated == null || (c22421cObserveOn = c22421cDuringCreated.observeOn(fo0.m126432a())) == null) {
            return;
        }
        c22421cObserveOn.subscribe(psd0.m173597H(new y20() { // from class: l.cya
            @Override // p153l.y20
            public final void call(Object obj) {
                gya.m132943d3(callback, (LikeMindedEnvelope) obj);
            }
        }, new y20() { // from class: l.dya
            @Override // p153l.y20
            public final void call(Object obj) {
                gya.m132942c3((Throwable) obj);
            }
        }));
    }
}
