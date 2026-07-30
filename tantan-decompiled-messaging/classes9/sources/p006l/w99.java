package p006l;

import com.google.gson.JsonObject;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p1.mobile.putong.core.data.IntlThirdQuickLoginEnvelope;
import kotlin.Metadata;
import l.stc0;
import l.utc0;
import l.v9j;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll/w99;", "Ll/ax6;", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/IntlThirdQuickLoginEnvelope;", "c3", "()Lrx/c;", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w99 extends ax6 {
    /* JADX INFO: renamed from: b3 */
    public static c m26262b3() {
        return ia20.m16569c(new v9j() { // from class: l.v99
            public final Object call() {
                return w99.m26263d3();
            }
        }, IntlThirdQuickLoginEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: d3 */
    public static final stc0 m26263d3() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("clientID", "100032");
        return C0154a.f3483P.auth().q(C0154a.m3270q0()).l(utc0.create(Network.JSON, jsonObject.toString())).b();
    }

    @NotNull
    /* JADX INFO: renamed from: c3 */
    public final c<IntlThirdQuickLoginEnvelope> m26264c3() {
        c<IntlThirdQuickLoginEnvelope> cVarScheduled = CoreModule.f1534c.scheduled("third-quick-login", 0, new v9j() { // from class: l.u99
            public final Object call() {
                return w99.m26262b3();
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }
}
