package p153l;

import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.SpotLightForceMatchEnvelope;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/v99;", "Ll/dy6;", "<init>", "()V", "", "otherId", "meId", "bizType", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/SpotLightForceMatchEnvelope;", "c3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class v99 extends dy6 {
    /* JADX INFO: renamed from: a3 */
    public static C22421c m200403a3(final JSONObject jSONObject) {
        return qi20.m176656c(new pcj() { // from class: l.u99
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return v99.m200405d3(jSONObject);
            }
        }, SpotLightForceMatchEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: d3 */
    public static final x1d0 m200405d3(JSONObject jSONObject) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32301f2()).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    @Nullable
    /* JADX INFO: renamed from: c3 */
    public final C22421c<SpotLightForceMatchEnvelope> m200406c3(@NotNull String otherId, @NotNull String meId, @NotNull String bizType) {
        otherId.getClass();
        meId.getClass();
        bizType.getClass();
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("me", meId);
            jSONObject.put("other", otherId);
            jSONObject.put("bizType", bizType);
            jSONObject.put("meLanguage", q8g0.m175820y());
        } catch (JSONException unused) {
        }
        return CoreModule.f18264c.scheduled("intlPartnerForceLike", -1, new pcj() { // from class: l.t99
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return v99.m200403a3(jSONObject);
            }
        });
    }
}
