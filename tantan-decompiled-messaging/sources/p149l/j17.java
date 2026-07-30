package p149l;

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.BoostPeakTime;
import com.p046p1.mobile.putong.core.data.BoostQuery;
import com.p046p1.mobile.putong.core.data.BoostQueryData;
import com.p046p1.mobile.putong.core.data.BoostStatus;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class j17 extends ax6 {

    /* JADX INFO: renamed from: R */
    public boolean f115740R;

    /* JADX INFO: renamed from: S */
    public boolean f115741S;

    /* JADX INFO: renamed from: T */
    public final C22392a<Optional<BoostStatus>> f115742T;

    /* JADX INFO: renamed from: U */
    public final zpd0 f115743U;

    /* JADX INFO: renamed from: V */
    public final hpd0 f115744V;

    /* JADX INFO: renamed from: W */
    public hpd0 f115745W;

    /* JADX INFO: renamed from: X */
    public hpd0 f115746X;

    /* JADX INFO: renamed from: Y */
    public final hpd0 f115747Y;

    /* JADX INFO: renamed from: Z */
    public final hpd0 f115748Z;

    /* JADX INFO: renamed from: a0 */
    public hpd0 f115749a0;

    /* JADX INFO: renamed from: b0 */
    public final tpd0 f115750b0;

    /* JADX INFO: renamed from: c0 */
    public final tpd0 f115751c0;

    /* JADX INFO: renamed from: d0 */
    public final tpd0 f115752d0;

    /* JADX INFO: renamed from: e0 */
    public final hpd0 f115753e0;

    /* JADX INFO: renamed from: f0 */
    public final zpd0 f115754f0;

    /* JADX INFO: renamed from: g0 */
    public final zpd0 f115755g0;

    /* JADX INFO: renamed from: h0 */
    public final zpd0 f115756h0;

    /* JADX INFO: renamed from: i0 */
    public final tpd0 f115757i0;

    /* JADX INFO: renamed from: j0 */
    public final hpd0 f115758j0;

    /* JADX INFO: renamed from: k0 */
    public final zpd0 f115759k0;

    /* JADX INFO: renamed from: l0 */
    public final uqd0 f115760l0;

    /* JADX INFO: renamed from: m0 */
    public final hpd0 f115761m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f115762n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f115763o0;

    /* JADX INFO: renamed from: p0 */
    public volatile int f115764p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f115765q0;

    /* JADX INFO: renamed from: r0 */
    public volatile int f115766r0;

    public j17(C4732c c4732c) {
        super(c4732c);
        this.f115742T = C22392a.m221513c(Optional.absent());
        this.f115743U = new zpd0("tantan_coin_boost_bubble_shown_time_" + CoreModule.m29931H().userId(), 0L);
        String str = "is_in_super_boost" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f115744V = new hpd0(str, bool);
        this.f115745W = new hpd0("need_show_boosted_dialog" + CoreModule.m29931H().userId(), bool);
        this.f115746X = new hpd0("boost_has_been_used_" + CoreModule.m29931H().userId(), bool);
        this.f115747Y = new hpd0("boost_confirm_dialog_shown_" + CoreModule.m29931H().userId(), bool);
        this.f115748Z = new hpd0("given_user_once_boost_" + CoreModule.m29931H().userId(), bool);
        this.f115749a0 = new hpd0("is_allow_show_boost_entrance_" + CoreModule.m29931H().userId(), Boolean.TRUE);
        this.f115750b0 = new tpd0("guide_use_boost_times_in_today_" + CoreModule.m29931H().userId(), 0);
        this.f115751c0 = new tpd0("guide_boosting_times_in_today_" + CoreModule.m29931H().userId(), 0);
        this.f115752d0 = new tpd0("guide_buy_boost_times_in_today_" + CoreModule.m29931H().userId(), 0);
        this.f115753e0 = new hpd0("force_like_" + CoreModule.m29931H().userId(), bool);
        this.f115754f0 = new zpd0("boost_guide" + CoreModule.m29931H().userId(), 0L);
        this.f115755g0 = new zpd0("last_o_dimond_request_boost_" + CoreModule.m29931H().userId(), 0L);
        this.f115756h0 = new zpd0("last_ultra_premium_request_boost_" + CoreModule.m29931H().userId(), 0L);
        this.f115757i0 = new tpd0("boost_guide_close" + CoreModule.m29931H().userId(), 1000);
        this.f115758j0 = new hpd0("showed_boost_guide" + CoreModule.m29931H().userId(), bool);
        this.f115759k0 = new zpd0("last_finished_boost_id" + CoreModule.m29931H().userId(), 0L);
        this.f115760l0 = new uqd0("last_boosting_id" + CoreModule.m29931H().userId(), "");
        this.f115761m0 = new hpd0("showed_first_trial_4_new_user" + CoreModule.m29931H().userId(), bool);
        this.f115762n0 = false;
        this.f115763o0 = false;
        this.f115764p0 = 0;
        this.f115765q0 = false;
        this.f115766r0 = 0;
    }

    /* JADX INFO: renamed from: B3 */
    public static int m139229B3() {
        return CoreModule.m29932K().mo30835xf() ? CoreModule.f17545c.f19573I0.m140275z3() : CoreModule.f17545c.f19570H0.m210380u4();
    }

    /* JADX INFO: renamed from: D3 */
    public static int m139230D3() {
        return CoreModule.m29932K().mo30835xf() ? CoreModule.f17545c.f19573I0.m140258L3() : CoreModule.f17545c.f19570H0.m210348Z4();
    }

    /* JADX INFO: renamed from: E3 */
    public static int m139231E3() {
        return CoreModule.m29932K().mo30835xf() ? CoreModule.f17545c.f19573I0.m140266T3() : CoreModule.f17545c.f19570H0.m210389y5();
    }

    /* JADX INFO: renamed from: I3 */
    public static boolean m139232I3() {
        return CoreModule.f17545c.f19576J0.m139283w3() - C4728a.f19494P.guessedCurrentServerTime() > 0 && CoreModule.f17545c.f19576J0.m139254F3();
    }

    /* JADX INFO: renamed from: u3 */
    public static String m139250u3() {
        return CoreModule.m29932K().mo30835xf() ? CoreModule.f17545c.f19573I0.m140274y3() : CoreModule.f17545c.f19570H0.m210378t4();
    }

    /* JADX INFO: renamed from: z3 */
    public static int m139251z3() {
        return CoreModule.m29932K().mo30835xf() ? CoreModule.f17545c.f19573I0.m140268s3() : CoreModule.f17545c.f19570H0.m210364m4();
    }

    /* JADX INFO: renamed from: A3 */
    public final String m139252A3(boolean z) {
        return (z && CoreModule.m29932K().mo30835xf()) ? "diamond" : xob.m210300i4(z);
    }

    /* JADX INFO: renamed from: C3 */
    public int m139253C3() {
        return this.f115764p0;
    }

    /* JADX INFO: renamed from: F3 */
    public boolean m139254F3() {
        return this.f115742T.m221515e().isPresent() && this.f115742T.m221515e().get().active;
    }

    /* JADX INFO: renamed from: G3 */
    public boolean m139255G3() {
        return this.f115744V.get().booleanValue();
    }

    /* JADX INFO: renamed from: H3 */
    public boolean m139256H3() {
        return this.f115740R;
    }

    /* JADX INFO: renamed from: J3 */
    public boolean m139257J3() {
        return this.f115766r0 == 0;
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ roj0 m139258K3(BoostQuery boostQuery) {
        BoostQueryData boostQueryData = boostQuery.data;
        this.f115764p0 = boostQueryData.likeCount;
        this.f115766r0 = boostQueryData.allCount;
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ C22306c m139259L3() {
        return ia20.m135119c(new v9j() { // from class: l.u07
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31311j(CoreModule.m29931H().userId())).m185887f().m185883b();
            }
        }, BoostQuery.JSON_ADAPTER).map(new w9j() { // from class: l.v07
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f179072a.m139258K3((BoostQuery) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ roj0 m139260M3(Envelope envelope) {
        BoostStatus boostStatus = (BoostStatus) vwb.m200336l0(((CoreData) envelope.getModuleData(CoreData.class)).boostStatus);
        this.f115742T.m132487l(Optional.fromNullable(boostStatus));
        m139272Y3(boostStatus);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ C22306c m139261N3() {
        return ia20.m135117a(new v9j() { // from class: l.b17
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31222L1()).m185883b();
            }
        }).map(new w9j() { // from class: l.c17
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f78230a.m139260M3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ stc0 m139262O3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31315k(CoreModule.m29931H().userId(), m139282v3(), String.valueOf(qib0.f154717f0))).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ C22306c m139263P3() {
        return ia20.m135123g(new v9j() { // from class: l.z07
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f200939a.m139262O3();
            }
        }, true);
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ roj0 m139264Q3(Envelope envelope) {
        this.f72126Q.m31491v3(envelope.counters);
        BoostStatus boostStatus = (BoostStatus) vwb.m200336l0(((CoreData) envelope.getModuleData(CoreData.class)).boostStatus);
        m139271X3();
        m139270W3();
        this.f115762n0 = false;
        this.f115753e0.put(Boolean.FALSE);
        if (boostStatus != null) {
            this.f115742T.m132487l(Optional.m15413of(boostStatus));
        }
        m139272Y3(boostStatus);
        boolean zMo30835xf = CoreModule.m29932K().mo30835xf();
        C4732c c4732c = this.f72126Q;
        if (zMo30835xf) {
            c4732c.f19573I0.m140262P3();
        } else {
            c4732c.f19570H0.m210363l5(envelope);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ C22306c m139265R3(final String str, C22306c.d dVar) {
        return ia20.m135121e(new v9j() { // from class: l.w07
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31222L1()).m185892k(utc0.create(Network.JSON, str)).m185883b();
            }
        }).compose(dVar).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.x07
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f188934a.m139264Q3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ roj0 m139266S3(String str, Envelope envelope) {
        if (TextUtils.equals(str, "oDiamond")) {
            this.f115755g0.put(Long.valueOf(mqi0.m155944o()));
        }
        if (TextUtils.equals(str, SummarizedPrivilegesId.ultraPremium)) {
            this.f115756h0.put(Long.valueOf(mqi0.m155944o()));
        }
        this.f72126Q.m31491v3(envelope.counters);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ C22306c m139267T3(final String str, final String str2) {
        return ia20.m135117a(new v9j() { // from class: l.e17
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31222L1()).m185892k(utc0.create(Network.JSON, str)).m185883b();
            }
        }).map(new w9j() { // from class: l.f17
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f94047a.m139266S3(str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public final String m139268U3() {
        return "{\"active\": true, \"consumeType\": \"" + m139252A3(false) + "\", \"coinSign\":\"\",\"business\":\"\", \"giftVer\":" + (CoreModule.m29935P().m94651a().mo33575rc() ? "false" : "true") + " }";
    }

    /* JADX INFO: renamed from: V3 */
    public C22306c<roj0> m139269V3() {
        return this.f72126Q.scheduled("query_boost_status_new", 0, new v9j() { // from class: l.s07
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f161748a.m139261N3();
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public void m139270W3() {
        if (xma.m210040C3()) {
            return;
        }
        this.f72126Q.scheduled("user-boost_start", -1, new v9j() { // from class: l.y07
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f195279a.m139263P3();
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public void m139271X3() {
        this.f115764p0 = 0;
        this.f115766r0 = 0;
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m139272Y3(BoostStatus boostStatus) {
        if (NullChecker.m81303a(boostStatus) && boostStatus.active) {
            this.f115760l0.put(boostStatus.boostRecordID + "::" + ((long) boostStatus.endTime));
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public void m139273Z3(boolean z) {
        this.f115744V.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: a4 */
    public void m139274a4(boolean z) {
        this.f115740R = z;
    }

    /* JADX INFO: renamed from: b4 */
    public C22306c<roj0> m139275b4(boolean z, String str, Privilege privilege, String str2, boolean z2, boolean z3) {
        final C22306c.d dVarM181751e;
        final String strM139268U3;
        this.f115741S = false;
        boolean z4 = privilege == Privilege.minBoost;
        if (CoreModule.m29932K().mo30835xf()) {
            dVarM181751e = h0i0.m128955e(CoreModule.f17545c.f19573I0.m140265S3(m139252A3(z), z4 ? SummarizedPrivilegesId.get(SummarizedPrivilegesId.minBoost) : SummarizedPrivilegesId.get("boost")));
        } else {
            dVarM181751e = rzh0.m181751e(CoreModule.f17545c.f19570H0.m210377s5(m139252A3(z), z4 ? SummarizedPrivilegesId.get(SummarizedPrivilegesId.minBoost) : SummarizedPrivilegesId.get("boost")));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Active.TYPE, true);
            jSONObject.put("consumeType", m139252A3(z));
            if (TextUtils.equals("diamond", m139252A3(z))) {
                jSONObject.put("diamondSign", str);
            } else {
                jSONObject.put("coinSign", str);
            }
            if (z4) {
                jSONObject.put("business", "intlMinBoost");
            } else if (!vwb.m200298L(str2)) {
                jSONObject.put("business", str2);
            }
            if (!z4) {
                jSONObject.put("freeUse", z2);
            }
            strM139268U3 = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            strM139268U3 = WeJson.EMPTY_MAP;
        }
        if (z3) {
            strM139268U3 = m139268U3();
        }
        return this.f72126Q.scheduled("patch_boost_status_new", -1, new v9j() { // from class: l.t07
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f167111a.m139265R3(strM139268U3, dVarM181751e);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public void m139276c4(final String str) {
        final String str2 = "{\"active\": true, \"consumeType\": \"" + m139252A3(false) + "\", \"business\":\"" + str + "\"}";
        this.f72126Q.scheduled("patch_boost_status_new_silently", -1, new v9j() { // from class: l.a17
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f67099a.m139267T3(str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public void m139277d4() {
        hpd0 hpd0Var = this.f115745W;
        Boolean bool = Boolean.TRUE;
        hpd0Var.put(bool);
        this.f115746X.put(bool);
        this.f115741S = false;
        if (this.f115742T.m221515e().isPresent()) {
            BoostStatus boostStatusMo223809clone = this.f115742T.m221515e().get().mo223809clone();
            boostStatusMo223809clone.active = false;
            this.f115759k0.put(Long.valueOf(boostStatusMo223809clone.boostRecordID));
            this.f115760l0.clear();
            this.f115742T.m132487l(Optional.m15413of(boostStatusMo223809clone));
        }
        if (CoreModule.m29935P().m94651a().mo158345a2() || CoreModule.m29935P().m94651a().mo36049Lg()) {
            CoreModule.f17545c.f19576J0.m139269V3();
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m139278e4(boolean z) {
        this.f115747Y.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: r3 */
    public C22306c<Boolean> m139279r3() {
        return this.f72126Q.scheduled("boost_peak_time", 0, new v9j() { // from class: l.d17
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.g17
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31307i(CoreModule.m29931H().userId())).m185887f().m185883b();
                    }
                }, BoostPeakTime.JSON_ADAPTER).map(new w9j() { // from class: l.h17
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((BoostPeakTime) obj).data);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public C22306c<roj0> m139280s3() {
        return this.f72126Q.scheduled("user-boost_query", 0, new v9j() { // from class: l.i17
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f110424a.m139259L3();
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public C22306c<Optional<BoostStatus>> m139281t3() {
        return this.f115742T.asObservable();
    }

    /* JADX INFO: renamed from: v3 */
    public int m139282v3() {
        if (this.f115742T.m221515e().isPresent()) {
            return this.f115742T.m221515e().get().duration;
        }
        return 0;
    }

    /* JADX INFO: renamed from: w3 */
    public long m139283w3() {
        if (this.f115742T.m221515e().isPresent()) {
            return (long) this.f115742T.m221515e().get().endTime;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: x3 */
    public boolean m139284x3() {
        return this.f115747Y.get().booleanValue();
    }

    /* JADX INFO: renamed from: y3 */
    public int m139285y3() {
        return this.f115766r0;
    }
}
