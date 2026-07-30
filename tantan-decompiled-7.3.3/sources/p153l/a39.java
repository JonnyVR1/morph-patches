package p153l;

import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.HideAndSeekBannerEnv;
import com.p051p1.mobile.putong.core.data.HideAndSeekHoldEnv;
import com.p051p1.mobile.putong.core.data.HideAndSeekInfoEnv;
import com.p051p1.mobile.putong.core.data.HideAndSeekOperateEnv;
import com.p051p1.mobile.putong.core.data.HideAndSeekPushEnv;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class a39 extends dy6 {
    public a39(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: k3 */
    public C22421c<HideAndSeekBannerEnv> m95786k3() {
        return this.f91137Q.scheduled("get_banner_status", 0, new pcj() { // from class: l.r29
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.v29
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/operate-game/banner")).m209032f().m209028b();
                    }
                }, HideAndSeekBannerEnv.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public C22421c<HideAndSeekHoldEnv> m95787l3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("targetId", str);
        } catch (JSONException unused) {
        }
        return this.f91137Q.scheduled("game_hold", -1, new pcj() { // from class: l.w29
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.z29
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/operate-game/hold")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                }, HideAndSeekHoldEnv.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public C22421c<HideAndSeekInfoEnv> m95788m3() {
        return this.f91137Q.scheduled("get_game_info", 0, new pcj() { // from class: l.u29
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.y29
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/operate-game/info")).m209032f().m209028b();
                    }
                }, HideAndSeekInfoEnv.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public C22421c<HideAndSeekPushEnv> m95789n3(String str, String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lg", str);
            jSONObject.put("la", str2);
        } catch (JSONException unused) {
        }
        return this.f91137Q.scheduled("game_push", -1, new pcj() { // from class: l.q29
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.t29
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/operate-game/push")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                }, HideAndSeekPushEnv.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public C22421c<HideAndSeekOperateEnv> m95790o3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("operate", str);
        } catch (JSONException unused) {
        }
        return this.f91137Q.scheduled("game_update", -1, new pcj() { // from class: l.s29
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.x29
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/operate-game/update")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                }, HideAndSeekOperateEnv.JSON_ADAPTER);
            }
        });
    }
}
