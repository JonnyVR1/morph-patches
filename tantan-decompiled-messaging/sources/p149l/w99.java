package p149l;

import com.google.gson.JsonObject;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.IntlThirdQuickLoginEnvelope;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"Ll/w99;", "Ll/ax6;", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/IntlThirdQuickLoginEnvelope;", "c3", "()Lrx/c;", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class w99 extends ax6 {
    /* JADX INFO: renamed from: b3 */
    public static C22306c m202271b3() {
        return ia20.m135119c(new v9j() { // from class: l.v99
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return w99.m202272d3();
            }
        }, IntlThirdQuickLoginEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: d3 */
    public static final stc0 m202272d3() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("clientID", "100032");
        return C4728a.f19494P.auth().m185898q(C4728a.m31340q0()).m185893l(utc0.create(Network.JSON, jsonObject.toString())).m185883b();
    }

    @NotNull
    /* JADX INFO: renamed from: c3 */
    public final C22306c<IntlThirdQuickLoginEnvelope> m202273c3() {
        C22306c<IntlThirdQuickLoginEnvelope> c22306cScheduled = CoreModule.f17545c.scheduled("third-quick-login", 0, new v9j() { // from class: l.u99
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return w99.m202271b3();
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }
}
