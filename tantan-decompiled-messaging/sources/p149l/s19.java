package p149l;

import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.HideAndSeekBannerEnv;
import com.p046p1.mobile.putong.core.data.HideAndSeekHoldEnv;
import com.p046p1.mobile.putong.core.data.HideAndSeekInfoEnv;
import com.p046p1.mobile.putong.core.data.HideAndSeekOperateEnv;
import com.p046p1.mobile.putong.core.data.HideAndSeekPushEnv;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class s19 extends ax6 {
    public s19(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: k3 */
    public C22306c<HideAndSeekBannerEnv> m181930k3() {
        return this.f72126Q.scheduled("get_banner_status", 0, new v9j() { // from class: l.j19
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.n19
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/operate-game/banner")).m185887f().m185883b();
                    }
                }, HideAndSeekBannerEnv.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public C22306c<HideAndSeekHoldEnv> m181931l3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("targetId", str);
        } catch (JSONException unused) {
        }
        return this.f72126Q.scheduled("game_hold", -1, new v9j() { // from class: l.o19
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.r19
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/operate-game/hold")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                }, HideAndSeekHoldEnv.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public C22306c<HideAndSeekInfoEnv> m181932m3() {
        return this.f72126Q.scheduled("get_game_info", 0, new v9j() { // from class: l.m19
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.q19
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/operate-game/info")).m185887f().m185883b();
                    }
                }, HideAndSeekInfoEnv.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public C22306c<HideAndSeekPushEnv> m181933n3(String str, String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lg", str);
            jSONObject.put("la", str2);
        } catch (JSONException unused) {
        }
        return this.f72126Q.scheduled("game_push", -1, new v9j() { // from class: l.i19
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.l19
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/operate-game/push")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                }, HideAndSeekPushEnv.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public C22306c<HideAndSeekOperateEnv> m181934o3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("operate", str);
        } catch (JSONException unused) {
        }
        return this.f72126Q.scheduled("game_update", -1, new v9j() { // from class: l.k19
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.p19
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/operate-game/update")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                }, HideAndSeekOperateEnv.JSON_ADAPTER);
            }
        });
    }
}
