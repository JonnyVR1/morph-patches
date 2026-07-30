package p153l;

import com.google.gson.JsonObject;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.IntlThirdQuickLoginEnvelope;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"Ll/fb9;", "Ll/dy6;", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/IntlThirdQuickLoginEnvelope;", "c3", "()Lrx/c;", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class fb9 extends dy6 {
    /* JADX INFO: renamed from: b3 */
    public static C22421c m124886b3() {
        return qi20.m176656c(new pcj() { // from class: l.eb9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return fb9.m124887d3();
            }
        }, IntlThirdQuickLoginEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: d3 */
    public static final x1d0 m124887d3() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("clientID", "100032");
        return C4879a.f20236P.auth().m209043q(C4879a.m32343q0()).m209038l(z1d0.create(Network.JSON, jsonObject.toString())).m209028b();
    }

    @NotNull
    /* JADX INFO: renamed from: c3 */
    public final C22421c<IntlThirdQuickLoginEnvelope> m124888c3() {
        C22421c<IntlThirdQuickLoginEnvelope> c22421cScheduled = CoreModule.f18264c.scheduled("third-quick-login", 0, new pcj() { // from class: l.db9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return fb9.m124886b3();
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }
}
