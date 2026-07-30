package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.HideAndSeekBannerEnv;
import com.p1.mobile.putong.core.data.HideAndSeekHoldEnv;
import com.p1.mobile.putong.core.data.HideAndSeekInfoEnv;
import com.p1.mobile.putong.core.data.HideAndSeekOperateEnv;
import com.p1.mobile.putong.core.data.HideAndSeekPushEnv;
import l.utc0;
import l.v9j;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class s19 extends ax6 {
    public s19(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: k3 */
    public c<HideAndSeekBannerEnv> m23478k3() {
        return this.f8580Q.scheduled("get_banner_status", 0, new v9j() { // from class: l.j19
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.n19
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/operate-game/banner")).f().b();
                    }
                }, HideAndSeekBannerEnv.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public c<HideAndSeekHoldEnv> m23479l3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("targetId", str);
        } catch (JSONException unused) {
        }
        return this.f8580Q.scheduled("game_hold", -1, new v9j() { // from class: l.o19
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.r19
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/operate-game/hold")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                }, HideAndSeekHoldEnv.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public c<HideAndSeekInfoEnv> m23480m3() {
        return this.f8580Q.scheduled("get_game_info", 0, new v9j() { // from class: l.m19
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.q19
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/operate-game/info")).f().b();
                    }
                }, HideAndSeekInfoEnv.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public c<HideAndSeekPushEnv> m23481n3(String str, String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lg", str);
            jSONObject.put("la", str2);
        } catch (JSONException unused) {
        }
        return this.f8580Q.scheduled("game_push", -1, new v9j() { // from class: l.i19
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.l19
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/operate-game/push")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                }, HideAndSeekPushEnv.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public c<HideAndSeekOperateEnv> m23482o3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("operate", str);
        } catch (JSONException unused) {
        }
        return this.f8580Q.scheduled("game_update", -1, new v9j() { // from class: l.k19
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.p19
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/operate-game/update")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                }, HideAndSeekOperateEnv.JSON_ADAPTER);
            }
        });
    }
}
