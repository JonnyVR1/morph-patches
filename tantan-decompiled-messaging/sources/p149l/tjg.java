package p149l;

import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.FateRadar;
import com.p046p1.mobile.putong.core.data.FateRadarGreeting;
import com.p046p1.mobile.putong.core.data.FateRadarSearchConditions;
import com.p046p1.mobile.putong.core.data.FateRadarSwitchStatus;
import com.p046p1.mobile.putong.core.data.GreetingItem;
import com.p046p1.mobile.putong.data.Envelope;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class tjg extends ax6 {

    /* JADX INFO: renamed from: R */
    public hpd0 f170715R;

    /* JADX INFO: renamed from: S */
    public C22393b<Boolean> f170716S;

    /* JADX INFO: renamed from: T */
    public C22393b<roj0> f170717T;

    /* JADX INFO: renamed from: U */
    public HashSet<String> f170718U;

    /* JADX INFO: renamed from: V */
    public boolean f170719V;

    public tjg(C4732c c4732c) {
        super(c4732c);
        this.f170715R = new hpd0("had_show_fate_radar_bubble" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.f170716S = C22393b.m221521b();
        this.f170717T = C22393b.m221521b();
        this.f170718U = new HashSet<>();
        this.f170719V = false;
    }

    /* JADX INFO: renamed from: D3 */
    public static /* synthetic */ C22306c m189295D3(boolean z, final String str) {
        final FateRadar fateRadar = new FateRadar();
        FateRadarSwitchStatus fateRadarSwitchStatusNew_ = FateRadarSwitchStatus.new_();
        fateRadar.switchSetting = fateRadarSwitchStatusNew_;
        fateRadarSwitchStatusNew_.status = z;
        return ia20.m135121e(new v9j() { // from class: l.xig
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185893l(utc0.create(Network.JSON, fateRadar.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.yig
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Envelope) obj).meta.code == 200);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ C22306c m189297b3(FateRadarGreeting fateRadarGreeting, final String str) {
        final FateRadar fateRadar = new FateRadar();
        fateRadar.greetings = fateRadarGreeting;
        return ia20.m135121e(new v9j() { // from class: l.vig
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185893l(utc0.create(Network.JSON, fateRadar.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.wig
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Envelope) obj).meta.code == 200);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ C22306c m189302g3(FateRadarSearchConditions fateRadarSearchConditions, final String str) {
        final FateRadar fateRadar = new FateRadar();
        fateRadar.searchConditions = fateRadarSearchConditions;
        return ia20.m135121e(new v9j() { // from class: l.tig
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185893l(utc0.create(Network.JSON, fateRadar.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.uig
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Envelope) obj).meta.code == 200);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: y3 */
    public static /* synthetic */ C22306c m189320y3(GreetingItem greetingItem, final String str) {
        greetingItem.toJson();
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", greetingItem.value);
            jSONObject.put("category", greetingItem.category);
        } catch (JSONException unused) {
        }
        return ia20.m135121e(new v9j() { // from class: l.jjg
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.kjg
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Envelope) obj).meta.code == 200);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ C22306c m189321z3(int i, final String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", i);
        } catch (JSONException unused) {
        }
        return ia20.m135121e(new v9j() { // from class: l.rig
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.sig
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Envelope) obj).meta.code == 200);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: E3 */
    public C22306c<Boolean> m189322E3(final int i) {
        if (i == 0) {
            return C22306c.just(Boolean.FALSE);
        }
        final String strM31366w2 = C4728a.m31366w2("/me/fate-radar/greeting?method=delete");
        return this.f72126Q.scheduled(strM31366w2 + i, -1, new v9j() { // from class: l.qjg
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return tjg.m189321z3(i, strM31366w2);
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public C22306c<FateRadar> m189323F3() {
        final String strM31366w2 = C4728a.m31366w2("/me/fate-radar/ai-greeting");
        return this.f72126Q.scheduled(strM31366w2 + "get", 0, new v9j() { // from class: l.cjg
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.ejg
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.fjg
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).fateRadar;
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public C22306c<FateRadar> m189324G3() {
        final String strM31366w2 = C4728a.m31366w2("/me/fate-radar/settings?item=all");
        return this.f72126Q.scheduled("/me/fate-radar/settings?item=all", 0, new v9j() { // from class: l.pig
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.ljg
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.mjg
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).fateRadar;
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public C22306c<FateRadar> m189325H3() {
        final String strM31366w2 = C4728a.m31366w2("/me/fate-radar/settings?item=switch");
        return this.f72126Q.scheduled("/me/fate-radar/settings?item=switch", 0, new v9j() { // from class: l.pjg
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.zig
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.bjg
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).fateRadar;
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public C22306c<Boolean> m189326I3() {
        final String strM31366w2 = C4728a.m31366w2("/me/fate-radar/ai-greeting");
        return this.f72126Q.scheduled(strM31366w2 + "init", -1, new v9j() { // from class: l.ajg
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.njg
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185893l(utc0.create(Network.JSON, "")).m185883b();
                    }
                }).map(new w9j() { // from class: l.ojg
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Envelope) obj).meta.code == 200);
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public C22306c<Boolean> m189327J3(final GreetingItem greetingItem) {
        if (greetingItem == null) {
            return C22306c.just(Boolean.FALSE);
        }
        final String strM31366w2 = C4728a.m31366w2("/me/fate-radar/greeting");
        return this.f72126Q.scheduled(strM31366w2, -1, new v9j() { // from class: l.gjg
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return tjg.m189320y3(greetingItem, strM31366w2);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public C22306c<Boolean> m189328K3(final FateRadarSearchConditions fateRadarSearchConditions) {
        final String strM31366w2 = C4728a.m31366w2("/me/fate-radar/settings?method=patch");
        return this.f72126Q.scheduled("updateFilterConditions", -1, new v9j() { // from class: l.sjg
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return tjg.m189302g3(fateRadarSearchConditions, strM31366w2);
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public C22306c<Boolean> m189329L3(final GreetingItem greetingItem) {
        if (greetingItem == null) {
            return C22306c.just(Boolean.FALSE);
        }
        final String strM31366w2 = C4728a.m31366w2("/me/fate-radar/greeting?method=patch");
        return this.f72126Q.scheduled(strM31366w2, -1, new v9j() { // from class: l.djg
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.hjg
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185893l(utc0.create(Network.JSON, greetingItem.toJson())).m185883b();
                    }
                }).map(new w9j() { // from class: l.ijg
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Envelope) obj).meta.code == 200);
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public C22306c<Boolean> m189330M3(final FateRadarGreeting fateRadarGreeting) {
        final String strM31366w2 = C4728a.m31366w2("/me/fate-radar/settings?method=patch");
        return this.f72126Q.scheduled("updateGreetings", -1, new v9j() { // from class: l.rjg
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return tjg.m189297b3(fateRadarGreeting, strM31366w2);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public C22306c<Boolean> m189331N3(final boolean z) {
        final String strM31366w2 = C4728a.m31366w2("/me/fate-radar/settings?method=patch");
        return this.f72126Q.scheduled("updateSwitchSetting", -1, new v9j() { // from class: l.qig
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return tjg.m189295D3(z, strM31366w2);
            }
        });
    }
}
