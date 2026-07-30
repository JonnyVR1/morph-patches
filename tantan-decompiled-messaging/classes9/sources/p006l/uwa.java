package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.LikeMindedEnvelope;
import com.p1.mobile.putong.core.data.LikeMindedRequestParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.e30;
import l.jo0;
import l.mkd0;
import l.stc0;
import l.utc0;
import l.v9j;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ@\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ll/uwa;", "Ll/ax6;", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/LikeMindedRequestParams;", "data", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/LikeMindedEnvelope;", "f3", "(Lcom/p1/mobile/putong/core/data/LikeMindedRequestParams;)Lrx/c;", "Lcom/p1/mobile/android/app/Act;", "act", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "result", "", "callback", "e3", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/LikeMindedRequestParams;Lkotlin/jvm/functions/Function1;)V", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class uwa extends ax6 {
    /* JADX INFO: renamed from: a3 */
    public static c m25569a3(final LikeMindedRequestParams likeMindedRequestParams) {
        return ia20.m16569c(new v9j() { // from class: l.twa
            public final Object call() {
                return uwa.m25574g3(likeMindedRequestParams);
            }
        }, LikeMindedEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: c3 */
    public static void m25571c3(Throwable th) {
    }

    /* JADX INFO: renamed from: d3 */
    public static void m25572d3(Function1 function1, LikeMindedEnvelope likeMindedEnvelope) {
        likeMindedEnvelope.getClass();
        function1.invoke(likeMindedEnvelope);
    }

    /* JADX INFO: renamed from: f3 */
    private final c<LikeMindedEnvelope> m25573f3(final LikeMindedRequestParams data) {
        c<LikeMindedEnvelope> cVarScheduled = CoreModule.f1534c.scheduled("similar-interests-query", 0, new v9j() { // from class: l.swa
            public final Object call() {
                return uwa.m25569a3(data);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public static final stc0 m25574g3(LikeMindedRequestParams likeMindedRequestParams) {
        return C0154a.f3483P.auth().q(C0154a.m3220d2()).l(utc0.create(Network.JSON, likeMindedRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: e3 */
    public final void m25575e3(@NotNull Act act, @NotNull LikeMindedRequestParams data, @NotNull final Function1<? super LikeMindedEnvelope, Unit> callback) {
        c cVarObserveOn;
        act.getClass();
        data.getClass();
        callback.getClass();
        c cVarDuringCreated = act.duringCreated(CoreModule.f1534c.f3542B1.m25573f3(data));
        if (cVarDuringCreated == null || (cVarObserveOn = cVarDuringCreated.observeOn(jo0.a())) == null) {
            return;
        }
        cVarObserveOn.subscribe(mkd0.H(new e30() { // from class: l.qwa
            public final void call(Object obj) {
                uwa.m25572d3(callback, (LikeMindedEnvelope) obj);
            }
        }, new e30() { // from class: l.rwa
            public final void call(Object obj) {
                uwa.m25571c3((Throwable) obj);
            }
        }));
    }
}
