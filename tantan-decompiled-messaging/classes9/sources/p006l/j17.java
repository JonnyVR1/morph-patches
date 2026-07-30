package p006l;

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.BoostPeakTime;
import com.p1.mobile.putong.core.data.BoostQuery;
import com.p1.mobile.putong.core.data.BoostQueryData;
import com.p1.mobile.putong.core.data.BoostStatus;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.h0i0;
import l.hpd0;
import l.jo0;
import l.mqi0;
import l.roj0;
import l.rzh0;
import l.stc0;
import l.tpd0;
import l.uqd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class j17 extends ax6 {

    /* JADX INFO: renamed from: R */
    public boolean f14923R;

    /* JADX INFO: renamed from: S */
    public boolean f14924S;

    /* JADX INFO: renamed from: T */
    public final a<Optional<BoostStatus>> f14925T;

    /* JADX INFO: renamed from: U */
    public final zpd0 f14926U;

    /* JADX INFO: renamed from: V */
    public final hpd0 f14927V;

    /* JADX INFO: renamed from: W */
    public hpd0 f14928W;

    /* JADX INFO: renamed from: X */
    public hpd0 f14929X;

    /* JADX INFO: renamed from: Y */
    public final hpd0 f14930Y;

    /* JADX INFO: renamed from: Z */
    public final hpd0 f14931Z;

    /* JADX INFO: renamed from: a0 */
    public hpd0 f14932a0;

    /* JADX INFO: renamed from: b0 */
    public final tpd0 f14933b0;

    /* JADX INFO: renamed from: c0 */
    public final tpd0 f14934c0;

    /* JADX INFO: renamed from: d0 */
    public final tpd0 f14935d0;

    /* JADX INFO: renamed from: e0 */
    public final hpd0 f14936e0;

    /* JADX INFO: renamed from: f0 */
    public final zpd0 f14937f0;

    /* JADX INFO: renamed from: g0 */
    public final zpd0 f14938g0;

    /* JADX INFO: renamed from: h0 */
    public final zpd0 f14939h0;

    /* JADX INFO: renamed from: i0 */
    public final tpd0 f14940i0;

    /* JADX INFO: renamed from: j0 */
    public final hpd0 f14941j0;

    /* JADX INFO: renamed from: k0 */
    public final zpd0 f14942k0;

    /* JADX INFO: renamed from: l0 */
    public final uqd0 f14943l0;

    /* JADX INFO: renamed from: m0 */
    public final hpd0 f14944m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f14945n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f14946o0;

    /* JADX INFO: renamed from: p0 */
    public volatile int f14947p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f14948q0;

    /* JADX INFO: renamed from: r0 */
    public volatile int f14949r0;

    public j17(C0158c c0158c) {
        super(c0158c);
        this.f14925T = a.c(Optional.absent());
        this.f14926U = new zpd0("tantan_coin_boost_bubble_shown_time_" + CoreModule.m1850H().userId(), 0L);
        String str = "is_in_super_boost" + CoreModule.m1850H().userId();
        Boolean bool = Boolean.FALSE;
        this.f14927V = new hpd0(str, bool);
        this.f14928W = new hpd0("need_show_boosted_dialog" + CoreModule.m1850H().userId(), bool);
        this.f14929X = new hpd0("boost_has_been_used_" + CoreModule.m1850H().userId(), bool);
        this.f14930Y = new hpd0("boost_confirm_dialog_shown_" + CoreModule.m1850H().userId(), bool);
        this.f14931Z = new hpd0("given_user_once_boost_" + CoreModule.m1850H().userId(), bool);
        this.f14932a0 = new hpd0("is_allow_show_boost_entrance_" + CoreModule.m1850H().userId(), Boolean.TRUE);
        this.f14933b0 = new tpd0("guide_use_boost_times_in_today_" + CoreModule.m1850H().userId(), 0);
        this.f14934c0 = new tpd0("guide_boosting_times_in_today_" + CoreModule.m1850H().userId(), 0);
        this.f14935d0 = new tpd0("guide_buy_boost_times_in_today_" + CoreModule.m1850H().userId(), 0);
        this.f14936e0 = new hpd0("force_like_" + CoreModule.m1850H().userId(), bool);
        this.f14937f0 = new zpd0("boost_guide" + CoreModule.m1850H().userId(), 0L);
        this.f14938g0 = new zpd0("last_o_dimond_request_boost_" + CoreModule.m1850H().userId(), 0L);
        this.f14939h0 = new zpd0("last_ultra_premium_request_boost_" + CoreModule.m1850H().userId(), 0L);
        this.f14940i0 = new tpd0("boost_guide_close" + CoreModule.m1850H().userId(), AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f14941j0 = new hpd0("showed_boost_guide" + CoreModule.m1850H().userId(), bool);
        this.f14942k0 = new zpd0("last_finished_boost_id" + CoreModule.m1850H().userId(), 0L);
        this.f14943l0 = new uqd0("last_boosting_id" + CoreModule.m1850H().userId(), "");
        this.f14944m0 = new hpd0("showed_first_trial_4_new_user" + CoreModule.m1850H().userId(), bool);
        this.f14945n0 = false;
        this.f14946o0 = false;
        this.f14947p0 = 0;
        this.f14948q0 = false;
        this.f14949r0 = 0;
    }

    /* JADX INFO: renamed from: B3 */
    public static int m17179B3() {
        return CoreModule.m1851K().xf() ? CoreModule.f1534c.f3562I0.m17391z3() : CoreModule.f1534c.f3559H0.m27555u4();
    }

    /* JADX INFO: renamed from: D3 */
    public static int m17180D3() {
        return CoreModule.m1851K().xf() ? CoreModule.f1534c.f3562I0.m17374L3() : CoreModule.f1534c.f3559H0.m27523Z4();
    }

    /* JADX INFO: renamed from: E3 */
    public static int m17181E3() {
        return CoreModule.m1851K().xf() ? CoreModule.f1534c.f3562I0.m17382T3() : CoreModule.f1534c.f3559H0.m27564y5();
    }

    /* JADX INFO: renamed from: I3 */
    public static boolean m17182I3() {
        return CoreModule.f1534c.f3565J0.m17233w3() - C0154a.f3483P.guessedCurrentServerTime() > 0 && CoreModule.f1534c.f3565J0.m17204F3();
    }

    /* JADX INFO: renamed from: u3 */
    public static String m17200u3() {
        return CoreModule.m1851K().xf() ? CoreModule.f1534c.f3562I0.m17390y3() : CoreModule.f1534c.f3559H0.m27553t4();
    }

    /* JADX INFO: renamed from: z3 */
    public static int m17201z3() {
        return CoreModule.m1851K().xf() ? CoreModule.f1534c.f3562I0.m17384s3() : CoreModule.f1534c.f3559H0.m27539m4();
    }

    /* JADX INFO: renamed from: A3 */
    public final String m17202A3(boolean z) {
        return (z && CoreModule.m1851K().xf()) ? "diamond" : xob.m27475i4(z);
    }

    /* JADX INFO: renamed from: C3 */
    public int m17203C3() {
        return this.f14947p0;
    }

    /* JADX INFO: renamed from: F3 */
    public boolean m17204F3() {
        return ((Optional) this.f14925T.e()).isPresent() && ((BoostStatus) ((Optional) this.f14925T.e()).get()).active;
    }

    /* JADX INFO: renamed from: G3 */
    public boolean m17205G3() {
        return ((Boolean) this.f14927V.get()).booleanValue();
    }

    /* JADX INFO: renamed from: H3 */
    public boolean m17206H3() {
        return this.f14923R;
    }

    /* JADX INFO: renamed from: J3 */
    public boolean m17207J3() {
        return this.f14949r0 == 0;
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ roj0 m17208K3(BoostQuery boostQuery) {
        BoostQueryData boostQueryData = boostQuery.data;
        this.f14947p0 = boostQueryData.likeCount;
        this.f14949r0 = boostQueryData.allCount;
        return roj0.a;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ c m17209L3() {
        return ia20.m16569c(new v9j() { // from class: l.u07
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3241j(CoreModule.m1850H().userId())).f().b();
            }
        }, BoostQuery.JSON_ADAPTER).map(new w9j() { // from class: l.v07
            public final Object call(Object obj) {
                return this.f23837a.m17208K3((BoostQuery) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ roj0 m17210M3(Envelope envelope) {
        BoostStatus boostStatus = (BoostStatus) vwb.l0(envelope.getModuleData(CoreData.class).boostStatus);
        this.f14925T.onNext(Optional.fromNullable(boostStatus));
        m17222Y3(boostStatus);
        return roj0.a;
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ c m17211N3() {
        return ia20.m16567a(new v9j() { // from class: l.b17
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3152L1()).b();
            }
        }).map(new w9j() { // from class: l.c17
            public final Object call(Object obj) {
                return this.f9272a.m17210M3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ stc0 m17212O3() {
        return C0154a.f3483P.auth().q(C0154a.m3245k(CoreModule.m1850H().userId(), m17232v3(), String.valueOf(qib0.f19808f0))).f().b();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ c m17213P3() {
        return ia20.m16573g(new v9j() { // from class: l.z07
            public final Object call() {
                return this.f28532a.m17212O3();
            }
        }, true);
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ roj0 m17214Q3(Envelope envelope) {
        this.f8580Q.m3421v3(envelope.counters);
        BoostStatus boostStatus = (BoostStatus) vwb.l0(envelope.getModuleData(CoreData.class).boostStatus);
        m17221X3();
        m17220W3();
        this.f14945n0 = false;
        this.f14936e0.put(Boolean.FALSE);
        if (boostStatus != null) {
            this.f14925T.onNext(Optional.of(boostStatus));
        }
        m17222Y3(boostStatus);
        boolean zXf = CoreModule.m1851K().xf();
        C0158c c0158c = this.f8580Q;
        if (zXf) {
            c0158c.f3562I0.m17378P3();
        } else {
            c0158c.f3559H0.m27538l5(envelope);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ c m17215R3(final String str, c.d dVar) {
        return ia20.m16571e(new v9j() { // from class: l.w07
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3152L1()).k(utc0.create(Network.JSON, str)).b();
            }
        }).compose(dVar).observeOn(jo0.a()).map(new w9j() { // from class: l.x07
            public final Object call(Object obj) {
                return this.f25641a.m17214Q3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ roj0 m17216S3(String str, Envelope envelope) {
        if (TextUtils.equals(str, "oDiamond")) {
            this.f14938g0.put(Long.valueOf(mqi0.o()));
        }
        if (TextUtils.equals(str, "ultraPremium")) {
            this.f14939h0.put(Long.valueOf(mqi0.o()));
        }
        this.f8580Q.m3421v3(envelope.counters);
        return roj0.a;
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ c m17217T3(final String str, final String str2) {
        return ia20.m16567a(new v9j() { // from class: l.e17
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3152L1()).k(utc0.create(Network.JSON, str)).b();
            }
        }).map(new w9j() { // from class: l.f17
            public final Object call(Object obj) {
                return this.f11558a.m17216S3(str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public final String m17218U3() {
        return "{\"active\": true, \"consumeType\": \"" + m17202A3(false) + "\", \"coinSign\":\"\",\"business\":\"\", \"giftVer\":" + (CoreModule.m1854P().m11706a().m5512rc() ? "false" : "true") + " }";
    }

    /* JADX INFO: renamed from: V3 */
    public c<roj0> m17219V3() {
        return this.f8580Q.scheduled("query_boost_status_new", 0, new v9j() { // from class: l.s07
            public final Object call() {
                return this.f20960a.m17211N3();
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public void m17220W3() {
        if (xma.m27348C3()) {
            return;
        }
        this.f8580Q.scheduled("user-boost_start", -1, new v9j() { // from class: l.y07
            public final Object call() {
                return this.f27832a.m17213P3();
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public void m17221X3() {
        this.f14947p0 = 0;
        this.f14949r0 = 0;
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m17222Y3(BoostStatus boostStatus) {
        if (NullChecker.a(boostStatus) && boostStatus.active) {
            this.f14943l0.put(boostStatus.boostRecordID + "::" + ((long) boostStatus.endTime));
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public void m17223Z3(boolean z) {
        this.f14927V.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: a4 */
    public void m17224a4(boolean z) {
        this.f14923R = z;
    }

    /* JADX INFO: renamed from: b4 */
    public c<roj0> m17225b4(boolean z, String str, Privilege privilege, String str2, boolean z2, boolean z3) {
        final c.d dVarE;
        final String strM17218U3;
        this.f14924S = false;
        boolean z4 = privilege == Privilege.minBoost;
        if (CoreModule.m1851K().xf()) {
            dVarE = h0i0.e(CoreModule.f1534c.f3562I0.m17381S3(m17202A3(z), z4 ? SummarizedPrivilegesId.get("minBoost") : SummarizedPrivilegesId.get("boost")));
        } else {
            dVarE = rzh0.e(CoreModule.f1534c.f3559H0.m27552s5(m17202A3(z), z4 ? SummarizedPrivilegesId.get("minBoost") : SummarizedPrivilegesId.get("boost")));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("active", true);
            jSONObject.put("consumeType", m17202A3(z));
            if (TextUtils.equals("diamond", m17202A3(z))) {
                jSONObject.put("diamondSign", str);
            } else {
                jSONObject.put("coinSign", str);
            }
            if (z4) {
                jSONObject.put("business", "intlMinBoost");
            } else if (!vwb.L(str2)) {
                jSONObject.put("business", str2);
            }
            if (!z4) {
                jSONObject.put("freeUse", z2);
            }
            strM17218U3 = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            strM17218U3 = "{}";
        }
        if (z3) {
            strM17218U3 = m17218U3();
        }
        return this.f8580Q.scheduled("patch_boost_status_new", -1, new v9j() { // from class: l.t07
            public final Object call() {
                return this.f21784a.m17215R3(strM17218U3, dVarE);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public void m17226c4(final String str) {
        final String str2 = "{\"active\": true, \"consumeType\": \"" + m17202A3(false) + "\", \"business\":\"" + str + "\"}";
        this.f8580Q.scheduled("patch_boost_status_new_silently", -1, new v9j() { // from class: l.a17
            public final Object call() {
                return this.f8044a.m17217T3(str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public void m17227d4() {
        hpd0 hpd0Var = this.f14928W;
        Boolean bool = Boolean.TRUE;
        hpd0Var.put(bool);
        this.f14929X.put(bool);
        this.f14924S = false;
        if (((Optional) this.f14925T.e()).isPresent()) {
            BoostStatus boostStatusClone = ((BoostStatus) ((Optional) this.f14925T.e()).get()).clone();
            boostStatusClone.active = false;
            this.f14942k0.put(Long.valueOf(boostStatusClone.boostRecordID));
            this.f14943l0.clear();
            this.f14925T.onNext(Optional.of(boostStatusClone));
        }
        if (CoreModule.m1854P().m11706a().m19853a2() || CoreModule.m1854P().m11706a().m19772Lg()) {
            CoreModule.f1534c.f3565J0.m17219V3();
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m17228e4(boolean z) {
        this.f14930Y.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: r3 */
    public c<Boolean> m17229r3() {
        return this.f8580Q.scheduled("boost_peak_time", 0, new v9j() { // from class: l.d17
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.g17
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3237i(CoreModule.m1850H().userId())).f().b();
                    }
                }, BoostPeakTime.JSON_ADAPTER).map(new w9j() { // from class: l.h17
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((BoostPeakTime) obj).data);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public c<roj0> m17230s3() {
        return this.f8580Q.scheduled("user-boost_query", 0, new v9j() { // from class: l.i17
            public final Object call() {
                return this.f14189a.m17209L3();
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public c<Optional<BoostStatus>> m17231t3() {
        return this.f14925T.asObservable();
    }

    /* JADX INFO: renamed from: v3 */
    public int m17232v3() {
        if (((Optional) this.f14925T.e()).isPresent()) {
            return ((BoostStatus) ((Optional) this.f14925T.e()).get()).duration;
        }
        return 0;
    }

    /* JADX INFO: renamed from: w3 */
    public long m17233w3() {
        if (((Optional) this.f14925T.e()).isPresent()) {
            return (long) ((BoostStatus) ((Optional) this.f14925T.e()).get()).endTime;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: x3 */
    public boolean m17234x3() {
        return ((Boolean) this.f14930Y.get()).booleanValue();
    }

    /* JADX INFO: renamed from: y3 */
    public int m17235y3() {
        return this.f14949r0;
    }
}
