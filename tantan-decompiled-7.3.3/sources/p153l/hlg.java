package p153l;

import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.FateRadar;
import com.p051p1.mobile.putong.core.data.FateRadarGreeting;
import com.p051p1.mobile.putong.core.data.FateRadarSearchConditions;
import com.p051p1.mobile.putong.core.data.FateRadarSwitchStatus;
import com.p051p1.mobile.putong.core.data.GreetingItem;
import com.p051p1.mobile.putong.data.Envelope;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class hlg extends dy6 {

    /* JADX INFO: renamed from: R */
    public jxd0 f110501R;

    /* JADX INFO: renamed from: S */
    public C22508b<Boolean> f110502S;

    /* JADX INFO: renamed from: T */
    public C22508b<uxj0> f110503T;

    /* JADX INFO: renamed from: U */
    public HashSet<String> f110504U;

    /* JADX INFO: renamed from: V */
    public boolean f110505V;

    public hlg(C4883c c4883c) {
        super(c4883c);
        this.f110501R = new jxd0("had_show_fate_radar_bubble" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.f110502S = C22508b.m222767b();
        this.f110503T = C22508b.m222767b();
        this.f110504U = new HashSet<>();
        this.f110505V = false;
    }

    /* JADX INFO: renamed from: D3 */
    public static /* synthetic */ C22421c m135702D3(boolean z, final String str) {
        final FateRadar fateRadar = new FateRadar();
        FateRadarSwitchStatus fateRadarSwitchStatusNew_ = FateRadarSwitchStatus.new_();
        fateRadar.switchSetting = fateRadarSwitchStatusNew_;
        fateRadarSwitchStatusNew_.status = z;
        return qi20.m176658e(new pcj() { // from class: l.lkg
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, fateRadar.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.mkg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Envelope) obj).meta.code == 200);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ C22421c m135704b3(FateRadarGreeting fateRadarGreeting, final String str) {
        final FateRadar fateRadar = new FateRadar();
        fateRadar.greetings = fateRadarGreeting;
        return qi20.m176658e(new pcj() { // from class: l.jkg
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, fateRadar.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.kkg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Envelope) obj).meta.code == 200);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ C22421c m135709g3(FateRadarSearchConditions fateRadarSearchConditions, final String str) {
        final FateRadar fateRadar = new FateRadar();
        fateRadar.searchConditions = fateRadarSearchConditions;
        return qi20.m176658e(new pcj() { // from class: l.hkg
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, fateRadar.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.ikg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Envelope) obj).meta.code == 200);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: y3 */
    public static /* synthetic */ C22421c m135727y3(GreetingItem greetingItem, final String str) {
        greetingItem.toJson();
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", greetingItem.value);
            jSONObject.put("category", greetingItem.category);
        } catch (JSONException unused) {
        }
        return qi20.m176658e(new pcj() { // from class: l.xkg
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.ykg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Envelope) obj).meta.code == 200);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ C22421c m135728z3(int i, final String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", i);
        } catch (JSONException unused) {
        }
        return qi20.m176658e(new pcj() { // from class: l.fkg
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.gkg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Envelope) obj).meta.code == 200);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: E3 */
    public C22421c<Boolean> m135729E3(final int i) {
        if (i == 0) {
            return C22421c.just(Boolean.FALSE);
        }
        final String strM32369w2 = C4879a.m32369w2("/me/fate-radar/greeting?method=delete");
        return this.f91137Q.scheduled(strM32369w2 + i, -1, new pcj() { // from class: l.elg
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return hlg.m135728z3(i, strM32369w2);
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public C22421c<FateRadar> m135730F3() {
        final String strM32369w2 = C4879a.m32369w2("/me/fate-radar/ai-greeting");
        return this.f91137Q.scheduled(strM32369w2 + "get", 0, new pcj() { // from class: l.qkg
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.skg
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.tkg
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).fateRadar;
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public C22421c<FateRadar> m135731G3() {
        final String strM32369w2 = C4879a.m32369w2("/me/fate-radar/settings?item=all");
        return this.f91137Q.scheduled("/me/fate-radar/settings?item=all", 0, new pcj() { // from class: l.dkg
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.zkg
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.alg
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).fateRadar;
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public C22421c<FateRadar> m135732H3() {
        final String strM32369w2 = C4879a.m32369w2("/me/fate-radar/settings?item=switch");
        return this.f91137Q.scheduled("/me/fate-radar/settings?item=switch", 0, new pcj() { // from class: l.dlg
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.nkg
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.pkg
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).fateRadar;
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public C22421c<Boolean> m135733I3() {
        final String strM32369w2 = C4879a.m32369w2("/me/fate-radar/ai-greeting");
        return this.f91137Q.scheduled(strM32369w2 + "init", -1, new pcj() { // from class: l.okg
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.blg
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, "")).m209028b();
                    }
                }).map(new qcj() { // from class: l.clg
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Envelope) obj).meta.code == 200);
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public C22421c<Boolean> m135734J3(final GreetingItem greetingItem) {
        if (greetingItem == null) {
            return C22421c.just(Boolean.FALSE);
        }
        final String strM32369w2 = C4879a.m32369w2("/me/fate-radar/greeting");
        return this.f91137Q.scheduled(strM32369w2, -1, new pcj() { // from class: l.ukg
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return hlg.m135727y3(greetingItem, strM32369w2);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public C22421c<Boolean> m135735K3(final FateRadarSearchConditions fateRadarSearchConditions) {
        final String strM32369w2 = C4879a.m32369w2("/me/fate-radar/settings?method=patch");
        return this.f91137Q.scheduled("updateFilterConditions", -1, new pcj() { // from class: l.glg
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return hlg.m135709g3(fateRadarSearchConditions, strM32369w2);
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public C22421c<Boolean> m135736L3(final GreetingItem greetingItem) {
        if (greetingItem == null) {
            return C22421c.just(Boolean.FALSE);
        }
        final String strM32369w2 = C4879a.m32369w2("/me/fate-radar/greeting?method=patch");
        return this.f91137Q.scheduled(strM32369w2, -1, new pcj() { // from class: l.rkg
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.vkg
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, greetingItem.toJson())).m209028b();
                    }
                }).map(new qcj() { // from class: l.wkg
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Envelope) obj).meta.code == 200);
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public C22421c<Boolean> m135737M3(final FateRadarGreeting fateRadarGreeting) {
        final String strM32369w2 = C4879a.m32369w2("/me/fate-radar/settings?method=patch");
        return this.f91137Q.scheduled("updateGreetings", -1, new pcj() { // from class: l.flg
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return hlg.m135704b3(fateRadarGreeting, strM32369w2);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public C22421c<Boolean> m135738N3(final boolean z) {
        final String strM32369w2 = C4879a.m32369w2("/me/fate-radar/settings?method=patch");
        return this.f91137Q.scheduled("updateSwitchSetting", -1, new pcj() { // from class: l.ekg
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return hlg.m135702D3(z, strM32369w2);
            }
        });
    }
}
