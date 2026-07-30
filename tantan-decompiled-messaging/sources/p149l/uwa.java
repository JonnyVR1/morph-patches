package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.LikeMindedEnvelope;
import com.p046p1.mobile.putong.core.data.LikeMindedRequestParams;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ@\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/uwa;", "Ll/ax6;", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/LikeMindedRequestParams;", "data", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/LikeMindedEnvelope;", "f3", "(Lcom/p1/mobile/putong/core/data/LikeMindedRequestParams;)Lrx/c;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, LovePlanetStage.result, "", "callback", "e3", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/LikeMindedRequestParams;Lkotlin/jvm/functions/Function1;)V", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class uwa extends ax6 {
    /* JADX INFO: renamed from: a3 */
    public static C22306c m196116a3(final LikeMindedRequestParams likeMindedRequestParams) {
        return ia20.m135119c(new v9j() { // from class: l.twa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return uwa.m196121g3(likeMindedRequestParams);
            }
        }, LikeMindedEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: c3 */
    public static void m196118c3(Throwable th) {
    }

    /* JADX INFO: renamed from: d3 */
    public static void m196119d3(Function1 function1, LikeMindedEnvelope likeMindedEnvelope) {
        likeMindedEnvelope.getClass();
        function1.invoke(likeMindedEnvelope);
    }

    /* JADX INFO: renamed from: f3 */
    private final C22306c<LikeMindedEnvelope> m196120f3(final LikeMindedRequestParams data) {
        C22306c<LikeMindedEnvelope> c22306cScheduled = CoreModule.f17545c.scheduled("similar-interests-query", 0, new v9j() { // from class: l.swa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return uwa.m196116a3(data);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public static final stc0 m196121g3(LikeMindedRequestParams likeMindedRequestParams) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31290d2()).m185893l(utc0.create(Network.JSON, likeMindedRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: e3 */
    public final void m196122e3(@NotNull Act act, @NotNull LikeMindedRequestParams data, @NotNull final Function1<? super LikeMindedEnvelope, Unit> callback) {
        C22306c c22306cObserveOn;
        act.getClass();
        data.getClass();
        callback.getClass();
        C22306c c22306cDuringCreated = act.duringCreated(CoreModule.f17545c.f19553B1.m196120f3(data));
        if (c22306cDuringCreated == null || (c22306cObserveOn = c22306cDuringCreated.observeOn(jo0.m142408a())) == null) {
            return;
        }
        c22306cObserveOn.subscribe(mkd0.m154956H(new e30() { // from class: l.qwa
            @Override // p149l.e30
            public final void call(Object obj) {
                uwa.m196119d3(callback, (LikeMindedEnvelope) obj);
            }
        }, new e30() { // from class: l.rwa
            @Override // p149l.e30
            public final void call(Object obj) {
                uwa.m196118c3((Throwable) obj);
            }
        }));
    }
}
