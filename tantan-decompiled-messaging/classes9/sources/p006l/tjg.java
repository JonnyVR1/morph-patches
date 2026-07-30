package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.FateRadar;
import com.p1.mobile.putong.core.data.FateRadarGreeting;
import com.p1.mobile.putong.core.data.FateRadarSearchConditions;
import com.p1.mobile.putong.core.data.FateRadarSwitchStatus;
import com.p1.mobile.putong.core.data.GreetingItem;
import com.p1.mobile.putong.data.Envelope;
import java.util.HashSet;
import l.hpd0;
import l.roj0;
import l.utc0;
import l.v9j;
import l.w9j;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class tjg extends ax6 {

    /* JADX INFO: renamed from: R */
    public hpd0 f22139R;

    /* JADX INFO: renamed from: S */
    public b<Boolean> f22140S;

    /* JADX INFO: renamed from: T */
    public b<roj0> f22141T;

    /* JADX INFO: renamed from: U */
    public HashSet<String> f22142U;

    /* JADX INFO: renamed from: V */
    public boolean f22143V;

    public tjg(C0158c c0158c) {
        super(c0158c);
        this.f22139R = new hpd0("had_show_fate_radar_bubble" + CoreModule.m1850H().userId(), Boolean.FALSE);
        this.f22140S = b.b();
        this.f22141T = b.b();
        this.f22142U = new HashSet<>();
        this.f22143V = false;
    }

    /* JADX INFO: renamed from: D3 */
    public static /* synthetic */ c m24705D3(boolean z, final String str) {
        final FateRadar fateRadar = new FateRadar();
        FateRadarSwitchStatus fateRadarSwitchStatusNew_ = FateRadarSwitchStatus.new_();
        fateRadar.switchSetting = fateRadarSwitchStatusNew_;
        fateRadarSwitchStatusNew_.status = z;
        return ia20.m16571e(new v9j() { // from class: l.xig
            public final Object call() {
                return C0154a.f3483P.auth().q(str).l(utc0.create(Network.JSON, fateRadar.toJson())).b();
            }
        }).map(new w9j() { // from class: l.yig
            public final Object call(Object obj) {
                return Boolean.valueOf(((Envelope) obj).meta.code == 200);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ c m24707b3(FateRadarGreeting fateRadarGreeting, final String str) {
        final FateRadar fateRadar = new FateRadar();
        fateRadar.greetings = fateRadarGreeting;
        return ia20.m16571e(new v9j() { // from class: l.vig
            public final Object call() {
                return C0154a.f3483P.auth().q(str).l(utc0.create(Network.JSON, fateRadar.toJson())).b();
            }
        }).map(new w9j() { // from class: l.wig
            public final Object call(Object obj) {
                return Boolean.valueOf(((Envelope) obj).meta.code == 200);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ c m24712g3(FateRadarSearchConditions fateRadarSearchConditions, final String str) {
        final FateRadar fateRadar = new FateRadar();
        fateRadar.searchConditions = fateRadarSearchConditions;
        return ia20.m16571e(new v9j() { // from class: l.tig
            public final Object call() {
                return C0154a.f3483P.auth().q(str).l(utc0.create(Network.JSON, fateRadar.toJson())).b();
            }
        }).map(new w9j() { // from class: l.uig
            public final Object call(Object obj) {
                return Boolean.valueOf(((Envelope) obj).meta.code == 200);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: y3 */
    public static /* synthetic */ c m24730y3(GreetingItem greetingItem, final String str) {
        greetingItem.toJson();
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", greetingItem.value);
            jSONObject.put("category", greetingItem.category);
        } catch (JSONException unused) {
        }
        return ia20.m16571e(new v9j() { // from class: l.jjg
            public final Object call() {
                return C0154a.f3483P.auth().q(str).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.kjg
            public final Object call(Object obj) {
                return Boolean.valueOf(((Envelope) obj).meta.code == 200);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ c m24731z3(int i, final String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", i);
        } catch (JSONException unused) {
        }
        return ia20.m16571e(new v9j() { // from class: l.rig
            public final Object call() {
                return C0154a.f3483P.auth().q(str).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.sig
            public final Object call(Object obj) {
                return Boolean.valueOf(((Envelope) obj).meta.code == 200);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: E3 */
    public c<Boolean> m24732E3(final int i) {
        if (i == 0) {
            return c.just(Boolean.FALSE);
        }
        final String strM3296w2 = C0154a.m3296w2("/me/fate-radar/greeting?method=delete");
        return this.f8580Q.scheduled(strM3296w2 + i, -1, new v9j() { // from class: l.qjg
            public final Object call() {
                return tjg.m24731z3(i, strM3296w2);
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public c<FateRadar> m24733F3() {
        final String strM3296w2 = C0154a.m3296w2("/me/fate-radar/ai-greeting");
        return this.f8580Q.scheduled(strM3296w2 + "get", 0, new v9j() { // from class: l.cjg
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.ejg
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).f().b();
                    }
                }).map(new w9j() { // from class: l.fjg
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).fateRadar;
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public c<FateRadar> m24734G3() {
        final String strM3296w2 = C0154a.m3296w2("/me/fate-radar/settings?item=all");
        return this.f8580Q.scheduled("/me/fate-radar/settings?item=all", 0, new v9j() { // from class: l.pig
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.ljg
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).f().b();
                    }
                }).map(new w9j() { // from class: l.mjg
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).fateRadar;
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public c<FateRadar> m24735H3() {
        final String strM3296w2 = C0154a.m3296w2("/me/fate-radar/settings?item=switch");
        return this.f8580Q.scheduled("/me/fate-radar/settings?item=switch", 0, new v9j() { // from class: l.pjg
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.zig
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).f().b();
                    }
                }).map(new w9j() { // from class: l.bjg
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).fateRadar;
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public c<Boolean> m24736I3() {
        final String strM3296w2 = C0154a.m3296w2("/me/fate-radar/ai-greeting");
        return this.f8580Q.scheduled(strM3296w2 + "init", -1, new v9j() { // from class: l.ajg
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.njg
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).l(utc0.create(Network.JSON, "")).b();
                    }
                }).map(new w9j() { // from class: l.ojg
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Envelope) obj).meta.code == 200);
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public c<Boolean> m24737J3(final GreetingItem greetingItem) {
        if (greetingItem == null) {
            return c.just(Boolean.FALSE);
        }
        final String strM3296w2 = C0154a.m3296w2("/me/fate-radar/greeting");
        return this.f8580Q.scheduled(strM3296w2, -1, new v9j() { // from class: l.gjg
            public final Object call() {
                return tjg.m24730y3(greetingItem, strM3296w2);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public c<Boolean> m24738K3(final FateRadarSearchConditions fateRadarSearchConditions) {
        final String strM3296w2 = C0154a.m3296w2("/me/fate-radar/settings?method=patch");
        return this.f8580Q.scheduled("updateFilterConditions", -1, new v9j() { // from class: l.sjg
            public final Object call() {
                return tjg.m24712g3(fateRadarSearchConditions, strM3296w2);
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public c<Boolean> m24739L3(final GreetingItem greetingItem) {
        if (greetingItem == null) {
            return c.just(Boolean.FALSE);
        }
        final String strM3296w2 = C0154a.m3296w2("/me/fate-radar/greeting?method=patch");
        return this.f8580Q.scheduled(strM3296w2, -1, new v9j() { // from class: l.djg
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.hjg
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).l(utc0.create(Network.JSON, greetingItem.toJson())).b();
                    }
                }).map(new w9j() { // from class: l.ijg
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Envelope) obj).meta.code == 200);
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public c<Boolean> m24740M3(final FateRadarGreeting fateRadarGreeting) {
        final String strM3296w2 = C0154a.m3296w2("/me/fate-radar/settings?method=patch");
        return this.f8580Q.scheduled("updateGreetings", -1, new v9j() { // from class: l.rjg
            public final Object call() {
                return tjg.m24707b3(fateRadarGreeting, strM3296w2);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public c<Boolean> m24741N3(final boolean z) {
        final String strM3296w2 = C0154a.m3296w2("/me/fate-radar/settings?method=patch");
        return this.f8580Q.scheduled("updateSwitchSetting", -1, new v9j() { // from class: l.qig
            public final Object call() {
                return tjg.m24705D3(z, strM3296w2);
            }
        });
    }
}
