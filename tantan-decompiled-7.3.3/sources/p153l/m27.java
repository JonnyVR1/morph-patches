package p153l;

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.BoostPeakTime;
import com.p051p1.mobile.putong.core.data.BoostQuery;
import com.p051p1.mobile.putong.core.data.BoostQueryData;
import com.p051p1.mobile.putong.core.data.BoostStatus;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class m27 extends dy6 {

    /* JADX INFO: renamed from: R */
    public boolean f134502R;

    /* JADX INFO: renamed from: S */
    public boolean f134503S;

    /* JADX INFO: renamed from: T */
    public final C22507a<Optional<BoostStatus>> f134504T;

    /* JADX INFO: renamed from: U */
    public final byd0 f134505U;

    /* JADX INFO: renamed from: V */
    public final jxd0 f134506V;

    /* JADX INFO: renamed from: W */
    public jxd0 f134507W;

    /* JADX INFO: renamed from: X */
    public jxd0 f134508X;

    /* JADX INFO: renamed from: Y */
    public final jxd0 f134509Y;

    /* JADX INFO: renamed from: Z */
    public final jxd0 f134510Z;

    /* JADX INFO: renamed from: a0 */
    public jxd0 f134511a0;

    /* JADX INFO: renamed from: b0 */
    public final vxd0 f134512b0;

    /* JADX INFO: renamed from: c0 */
    public final vxd0 f134513c0;

    /* JADX INFO: renamed from: d0 */
    public final vxd0 f134514d0;

    /* JADX INFO: renamed from: e0 */
    public final jxd0 f134515e0;

    /* JADX INFO: renamed from: f0 */
    public final byd0 f134516f0;

    /* JADX INFO: renamed from: g0 */
    public final byd0 f134517g0;

    /* JADX INFO: renamed from: h0 */
    public final byd0 f134518h0;

    /* JADX INFO: renamed from: i0 */
    public final vxd0 f134519i0;

    /* JADX INFO: renamed from: j0 */
    public final jxd0 f134520j0;

    /* JADX INFO: renamed from: k0 */
    public final byd0 f134521k0;

    /* JADX INFO: renamed from: l0 */
    public final wyd0 f134522l0;

    /* JADX INFO: renamed from: m0 */
    public final jxd0 f134523m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f134524n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f134525o0;

    /* JADX INFO: renamed from: p0 */
    public volatile int f134526p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f134527q0;

    /* JADX INFO: renamed from: r0 */
    public volatile int f134528r0;

    public m27(C4883c c4883c) {
        super(c4883c);
        this.f134504T = C22507a.m222759c(Optional.absent());
        this.f134505U = new byd0("tantan_coin_boost_bubble_shown_time_" + CoreModule.m30929H().userId(), 0L);
        String str = "is_in_super_boost" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f134506V = new jxd0(str, bool);
        this.f134507W = new jxd0("need_show_boosted_dialog" + CoreModule.m30929H().userId(), bool);
        this.f134508X = new jxd0("boost_has_been_used_" + CoreModule.m30929H().userId(), bool);
        this.f134509Y = new jxd0("boost_confirm_dialog_shown_" + CoreModule.m30929H().userId(), bool);
        this.f134510Z = new jxd0("given_user_once_boost_" + CoreModule.m30929H().userId(), bool);
        this.f134511a0 = new jxd0("is_allow_show_boost_entrance_" + CoreModule.m30929H().userId(), Boolean.TRUE);
        this.f134512b0 = new vxd0("guide_use_boost_times_in_today_" + CoreModule.m30929H().userId(), 0);
        this.f134513c0 = new vxd0("guide_boosting_times_in_today_" + CoreModule.m30929H().userId(), 0);
        this.f134514d0 = new vxd0("guide_buy_boost_times_in_today_" + CoreModule.m30929H().userId(), 0);
        this.f134515e0 = new jxd0("force_like_" + CoreModule.m30929H().userId(), bool);
        this.f134516f0 = new byd0("boost_guide" + CoreModule.m30929H().userId(), 0L);
        this.f134517g0 = new byd0("last_o_dimond_request_boost_" + CoreModule.m30929H().userId(), 0L);
        this.f134518h0 = new byd0("last_ultra_premium_request_boost_" + CoreModule.m30929H().userId(), 0L);
        this.f134519i0 = new vxd0("boost_guide_close" + CoreModule.m30929H().userId(), 1000);
        this.f134520j0 = new jxd0("showed_boost_guide" + CoreModule.m30929H().userId(), bool);
        this.f134521k0 = new byd0("last_finished_boost_id" + CoreModule.m30929H().userId(), 0L);
        this.f134522l0 = new wyd0("last_boosting_id" + CoreModule.m30929H().userId(), "");
        this.f134523m0 = new jxd0("showed_first_trial_4_new_user" + CoreModule.m30929H().userId(), bool);
        this.f134524n0 = false;
        this.f134525o0 = false;
        this.f134526p0 = 0;
        this.f134527q0 = false;
        this.f134528r0 = 0;
    }

    /* JADX INFO: renamed from: B3 */
    public static int m156741B3() {
        return CoreModule.m30930K().mo31838xf() ? CoreModule.f18264c.f20315I0.m144072z3() : CoreModule.f18264c.f20312H0.m155468u4();
    }

    /* JADX INFO: renamed from: D3 */
    public static int m156742D3() {
        return CoreModule.m30930K().mo31838xf() ? CoreModule.f18264c.f20315I0.m144055L3() : CoreModule.f18264c.f20312H0.m155436Z4();
    }

    /* JADX INFO: renamed from: E3 */
    public static int m156743E3() {
        return CoreModule.m30930K().mo31838xf() ? CoreModule.f18264c.f20315I0.m144063T3() : CoreModule.f18264c.f20312H0.m155477y5();
    }

    /* JADX INFO: renamed from: I3 */
    public static boolean m156744I3() {
        return CoreModule.f18264c.f20318J0.m156795w3() - C4879a.f20236P.guessedCurrentServerTime() > 0 && CoreModule.f18264c.f20318J0.m156766F3();
    }

    /* JADX INFO: renamed from: u3 */
    public static String m156762u3() {
        return CoreModule.m30930K().mo31838xf() ? CoreModule.f18264c.f20315I0.m144071y3() : CoreModule.f18264c.f20312H0.m155466t4();
    }

    /* JADX INFO: renamed from: z3 */
    public static int m156763z3() {
        return CoreModule.m30930K().mo31838xf() ? CoreModule.f18264c.f20315I0.m144065s3() : CoreModule.f18264c.f20312H0.m155452m4();
    }

    /* JADX INFO: renamed from: A3 */
    public final String m156764A3(boolean z) {
        return (z && CoreModule.m30930K().mo31838xf()) ? "diamond" : lqb.m155388i4(z);
    }

    /* JADX INFO: renamed from: C3 */
    public int m156765C3() {
        return this.f134526p0;
    }

    /* JADX INFO: renamed from: F3 */
    public boolean m156766F3() {
        return this.f134504T.m222761e().isPresent() && this.f134504T.m222761e().get().active;
    }

    /* JADX INFO: renamed from: G3 */
    public boolean m156767G3() {
        return this.f134506V.get().booleanValue();
    }

    /* JADX INFO: renamed from: H3 */
    public boolean m156768H3() {
        return this.f134502R;
    }

    /* JADX INFO: renamed from: J3 */
    public boolean m156769J3() {
        return this.f134528r0 == 0;
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ uxj0 m156770K3(BoostQuery boostQuery) {
        BoostQueryData boostQueryData = boostQuery.data;
        this.f134526p0 = boostQueryData.likeCount;
        this.f134528r0 = boostQueryData.allCount;
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ C22421c m156771L3() {
        return qi20.m176656c(new pcj() { // from class: l.w17
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32314j(CoreModule.m30929H().userId())).m209032f().m209028b();
            }
        }, BoostQuery.JSON_ADAPTER).map(new qcj() { // from class: l.x17
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f192019a.m156770K3((BoostQuery) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ uxj0 m156772M3(Envelope envelope) {
        BoostStatus boostStatus = (BoostStatus) jyb.m147519l0(((CoreData) envelope.getModuleData(CoreData.class)).boostStatus);
        this.f134504T.m137019l(Optional.fromNullable(boostStatus));
        m156784Y3(boostStatus);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ C22421c m156773N3() {
        return qi20.m176654a(new pcj() { // from class: l.e27
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32225L1()).m209028b();
            }
        }).map(new qcj() { // from class: l.f27
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f96858a.m156772M3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ x1d0 m156774O3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32318k(CoreModule.m30929H().userId(), m156794v3(), String.valueOf(uqb0.f180400f0))).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ C22421c m156775P3() {
        return qi20.m176660g(new pcj() { // from class: l.c27
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f79452a.m156774O3();
            }
        }, true);
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ uxj0 m156776Q3(Envelope envelope) {
        this.f91137Q.m32494v3(envelope.counters);
        BoostStatus boostStatus = (BoostStatus) jyb.m147519l0(((CoreData) envelope.getModuleData(CoreData.class)).boostStatus);
        m156783X3();
        m156782W3();
        this.f134524n0 = false;
        this.f134515e0.put(Boolean.FALSE);
        if (boostStatus != null) {
            this.f134504T.m137019l(Optional.m15467of(boostStatus));
        }
        m156784Y3(boostStatus);
        boolean zMo31838xf = CoreModule.m30930K().mo31838xf();
        C4883c c4883c = this.f91137Q;
        if (zMo31838xf) {
            c4883c.f20315I0.m144059P3();
        } else {
            c4883c.f20312H0.m155451l5(envelope);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ C22421c m156777R3(final String str, C22421c.d dVar) {
        return qi20.m176658e(new pcj() { // from class: l.z17
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32225L1()).m209037k(z1d0.create(Network.JSON, str)).m209028b();
            }
        }).compose(dVar).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.a27
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f67937a.m156776Q3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ uxj0 m156778S3(String str, Envelope envelope) {
        if (TextUtils.equals(str, "oDiamond")) {
            this.f134517g0.put(Long.valueOf(pzi0.m174454o()));
        }
        if (TextUtils.equals(str, SummarizedPrivilegesId.ultraPremium)) {
            this.f134518h0.put(Long.valueOf(pzi0.m174454o()));
        }
        this.f91137Q.m32494v3(envelope.counters);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ C22421c m156779T3(final String str, final String str2) {
        return qi20.m176654a(new pcj() { // from class: l.h27
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32225L1()).m209037k(z1d0.create(Network.JSON, str)).m209028b();
            }
        }).map(new qcj() { // from class: l.i27
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f112585a.m156778S3(str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public final String m156780U3() {
        return "{\"active\": true, \"consumeType\": \"" + m156764A3(false) + "\", \"coinSign\":\"\",\"business\":\"\", \"giftVer\":" + (CoreModule.m30933P().m143405a().mo34578rc() ? "false" : "true") + " }";
    }

    /* JADX INFO: renamed from: V3 */
    public C22421c<uxj0> m156781V3() {
        return this.f91137Q.scheduled("query_boost_status_new", 0, new pcj() { // from class: l.v17
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f181935a.m156773N3();
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public void m156782W3() {
        if (joa.m146354D3()) {
            return;
        }
        this.f91137Q.scheduled("user-boost_start", -1, new pcj() { // from class: l.b27
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f74590a.m156775P3();
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public void m156783X3() {
        this.f134526p0 = 0;
        this.f134528r0 = 0;
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m156784Y3(BoostStatus boostStatus) {
        if (NullChecker.m82486a(boostStatus) && boostStatus.active) {
            this.f134522l0.put(boostStatus.boostRecordID + "::" + ((long) boostStatus.endTime));
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public void m156785Z3(boolean z) {
        this.f134506V.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: a4 */
    public void m156786a4(boolean z) {
        this.f134502R = z;
    }

    /* JADX INFO: renamed from: b4 */
    public C22421c<uxj0> m156787b4(boolean z, String str, Privilege privilege, String str2, boolean z2, boolean z3) {
        final C22421c.d dVarM218893e;
        final String strM156780U3;
        this.f134503S = false;
        boolean z4 = privilege == Privilege.minBoost;
        if (CoreModule.m30930K().mo31838xf()) {
            dVarM218893e = p8i0.m171245e(CoreModule.f18264c.f20315I0.m144062S3(m156764A3(z), z4 ? SummarizedPrivilegesId.get(SummarizedPrivilegesId.minBoost) : SummarizedPrivilegesId.get("boost")));
        } else {
            dVarM218893e = z7i0.m218893e(CoreModule.f18264c.f20312H0.m155465s5(m156764A3(z), z4 ? SummarizedPrivilegesId.get(SummarizedPrivilegesId.minBoost) : SummarizedPrivilegesId.get("boost")));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Active.TYPE, true);
            jSONObject.put("consumeType", m156764A3(z));
            if (TextUtils.equals("diamond", m156764A3(z))) {
                jSONObject.put("diamondSign", str);
            } else {
                jSONObject.put("coinSign", str);
            }
            if (z4) {
                jSONObject.put("business", "intlMinBoost");
            } else if (!jyb.m147481L(str2)) {
                jSONObject.put("business", str2);
            }
            if (!z4) {
                jSONObject.put("freeUse", z2);
            }
            strM156780U3 = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            strM156780U3 = WeJson.EMPTY_MAP;
        }
        if (z3) {
            strM156780U3 = m156780U3();
        }
        return this.f91137Q.scheduled("patch_boost_status_new", -1, new pcj() { // from class: l.y17
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f197080a.m156777R3(strM156780U3, dVarM218893e);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public void m156788c4(final String str) {
        final String str2 = "{\"active\": true, \"consumeType\": \"" + m156764A3(false) + "\", \"business\":\"" + str + "\"}";
        this.f91137Q.scheduled("patch_boost_status_new_silently", -1, new pcj() { // from class: l.d27
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f84756a.m156779T3(str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public void m156789d4() {
        jxd0 jxd0Var = this.f134507W;
        Boolean bool = Boolean.TRUE;
        jxd0Var.put(bool);
        this.f134508X.put(bool);
        this.f134503S = false;
        if (this.f134504T.m222761e().isPresent()) {
            BoostStatus boostStatusMo225055clone = this.f134504T.m222761e().get().mo225055clone();
            boostStatusMo225055clone.active = false;
            this.f134521k0.put(Long.valueOf(boostStatusMo225055clone.boostRecordID));
            this.f134522l0.clear();
            this.f134504T.m137019l(Optional.m15467of(boostStatusMo225055clone));
        }
        if (CoreModule.m30933P().m143405a().mo180437a2() || CoreModule.m30933P().m143405a().mo37052Lg()) {
            CoreModule.f18264c.f20318J0.m156781V3();
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m156790e4(boolean z) {
        this.f134509Y.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: r3 */
    public C22421c<Boolean> m156791r3() {
        return this.f91137Q.scheduled("boost_peak_time", 0, new pcj() { // from class: l.g27
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.j27
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32310i(CoreModule.m30929H().userId())).m209032f().m209028b();
                    }
                }, BoostPeakTime.JSON_ADAPTER).map(new qcj() { // from class: l.k27
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((BoostPeakTime) obj).data);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public C22421c<uxj0> m156792s3() {
        return this.f91137Q.scheduled("user-boost_query", 0, new pcj() { // from class: l.l27
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f129744a.m156771L3();
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public C22421c<Optional<BoostStatus>> m156793t3() {
        return this.f134504T.asObservable();
    }

    /* JADX INFO: renamed from: v3 */
    public int m156794v3() {
        if (this.f134504T.m222761e().isPresent()) {
            return this.f134504T.m222761e().get().duration;
        }
        return 0;
    }

    /* JADX INFO: renamed from: w3 */
    public long m156795w3() {
        if (this.f134504T.m222761e().isPresent()) {
            return (long) this.f134504T.m222761e().get().endTime;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: x3 */
    public boolean m156796x3() {
        return this.f134509Y.get().booleanValue();
    }

    /* JADX INFO: renamed from: y3 */
    public int m156797y3() {
        return this.f134528r0;
    }
}
