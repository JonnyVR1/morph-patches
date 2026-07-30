package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p1.mobile.putong.core.data.SpotLightForceMatchEnvelope;
import kotlin.Metadata;
import l.i0g0;
import l.stc0;
import l.utc0;
import l.v9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ll/m89;", "Ll/ax6;", "<init>", "()V", "", "otherId", "meId", "bizType", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/SpotLightForceMatchEnvelope;", "c3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m89 extends ax6 {
    /* JADX INFO: renamed from: a3 */
    public static c m19165a3(final JSONObject jSONObject) {
        return ia20.m16569c(new v9j() { // from class: l.l89
            public final Object call() {
                return m89.m19167d3(jSONObject);
            }
        }, SpotLightForceMatchEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: d3 */
    public static final stc0 m19167d3(JSONObject jSONObject) {
        return C0154a.f3483P.auth().q(C0154a.m3228f2()).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    @Nullable
    /* JADX INFO: renamed from: c3 */
    public final c<SpotLightForceMatchEnvelope> m19168c3(@NotNull String otherId, @NotNull String meId, @NotNull String bizType) {
        otherId.getClass();
        meId.getClass();
        bizType.getClass();
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("me", meId);
            jSONObject.put("other", otherId);
            jSONObject.put("bizType", bizType);
            jSONObject.put("meLanguage", i0g0.y());
        } catch (JSONException unused) {
        }
        return CoreModule.f1534c.scheduled("intlPartnerForceLike", -1, new v9j() { // from class: l.k89
            public final Object call() {
                return m89.m19165a3(jSONObject);
            }
        });
    }
}
