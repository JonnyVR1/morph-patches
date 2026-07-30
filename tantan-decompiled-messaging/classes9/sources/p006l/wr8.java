package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.FreeTrialConfig;
import com.p1.mobile.putong.core.data.FreeTrialInfo;
import com.p1.mobile.putong.core.data.FreeTrialOperateResult;
import com.p1.mobile.putong.core.data.FreeTrialRecords;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import l.roj0;
import l.tpd0;
import l.uqd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wr8 extends ax6 {

    /* JADX INFO: renamed from: R */
    public final uqd0 f25326R;

    /* JADX INFO: renamed from: S */
    public final tpd0 f25327S;

    /* JADX INFO: renamed from: T */
    public int f25328T;

    /* JADX INFO: renamed from: U */
    public boolean f25329U;

    /* JADX INFO: renamed from: V */
    public Map<String, FreeTrialConfig> f25330V;

    /* JADX INFO: renamed from: W */
    public a<Map<String, FreeTrialRecords>> f25331W;

    public wr8(C0158c c0158c) {
        super(c0158c);
        this.f25326R = new uqd0("current_free_trial_status_" + CoreModule.m1850H().userId(), "");
        this.f25327S = new tpd0("free_trial_num_" + CoreModule.m1850H().userId(), 0);
        this.f25328T = 0;
        this.f25330V = new HashMap();
        this.f25331W = a.b();
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ FreeTrialRecords m26662b3(FreeTrialRecords freeTrialRecords) {
        return freeTrialRecords;
    }

    /* JADX INFO: renamed from: j3 */
    public c<FreeTrialOperateResult> m26670j3(String str, Boolean bool) {
        uqd0 uqd0Var = this.f25326R;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(bool.booleanValue() ? "opening" : "closed");
        uqd0Var.put(sb.toString());
        m26682v3(0);
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("operate", bool.booleanValue() ? "open" : "close");
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return this.f8580Q.scheduled("core_change_free_trial_info", -1, new v9j() { // from class: l.nr8
            public final Object call() {
                return this.f17817a.m26678r3(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public final void m26671k3(Map<String, FreeTrialRecords> map) {
        String str = (String) this.f25326R.get();
        FreeTrialRecords freeTrialRecords = (FreeTrialRecords) vwb.r(map.values(), new w9j() { // from class: l.vr8
            public final Object call(Object obj) {
                return Boolean.valueOf("opening".equals(((FreeTrialRecords) obj).status));
            }
        });
        if (NullChecker.a(freeTrialRecords)) {
            if (m26673m3(freeTrialRecords.name, freeTrialRecords.status)) {
                return;
            }
            this.f25326R.put(freeTrialRecords.name + "_" + freeTrialRecords.status);
            m26682v3(0);
            return;
        }
        if (!map.containsKey("realUser")) {
            m26672l3("realUser", str);
            return;
        }
        if (m26676p3() && !map.containsKey("popular")) {
            m26672l3("popular", str);
            return;
        }
        if (!m26676p3() && !map.containsKey("online")) {
            m26672l3("online", str);
        } else {
            if (map.containsKey("haveRead")) {
                return;
            }
            m26672l3("haveRead", str);
        }
    }

    /* JADX INFO: renamed from: l3 */
    public final void m26672l3(String str, String str2) {
        if (str.equals(str2)) {
            return;
        }
        this.f25326R.put(str);
        m26682v3(0);
    }

    /* JADX INFO: renamed from: m3 */
    public boolean m26673m3(String str, String str2) {
        return ((String) this.f25326R.get()).equals(str + "_" + str2);
    }

    /* JADX INFO: renamed from: n3 */
    public FreeTrialConfig m26674n3(String str) {
        return this.f25330V.get(str);
    }

    /* JADX INFO: renamed from: o3 */
    public int m26675o3() {
        return ((Integer) this.f25327S.get()).intValue();
    }

    /* JADX INFO: renamed from: p3 */
    public boolean m26676p3() {
        if (CoreModule.f1534c.f3628e0.m21483na().isFemale()) {
            return CoreModule.f1534c.f3680v1.f25328T >= 7;
        }
        return CoreModule.f1534c.f3680v1.f25328T >= 8;
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ FreeTrialOperateResult m26677q3(Envelope envelope) {
        m26681u3();
        return envelope.getModuleData(CoreData.class).freeTrialOperateResult;
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ c m26678r3(final JSONObject jSONObject) {
        return ia20.m16567a(new v9j() { // from class: l.or8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3158N()).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.pr8
            public final Object call(Object obj) {
                return this.f19270a.m26677q3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ roj0 m26679s3(Envelope envelope) {
        FreeTrialInfo freeTrialInfo = envelope.getModuleData(CoreData.class).freeTrialInfo;
        if (NullChecker.a(freeTrialInfo)) {
            this.f25328T = freeTrialInfo.popLevel;
            this.f25329U = freeTrialInfo.allowTrial;
            this.f25330V = freeTrialInfo.config;
            HashMap mapD = vwb.d(freeTrialInfo.records, new w9j() { // from class: l.tr8
                public final Object call(Object obj) {
                    return ((FreeTrialRecords) obj).name;
                }
            }, new w9j() { // from class: l.ur8
                public final Object call(Object obj) {
                    return wr8.m26662b3((FreeTrialRecords) obj);
                }
            });
            m26671k3(mapD);
            this.f25331W.onNext(mapD);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ c m26680t3() {
        return ia20.m16567a(new v9j() { // from class: l.rr8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3158N()).f().b();
            }
        }).map(new w9j() { // from class: l.sr8
            public final Object call(Object obj) {
                return this.f21603a.m26679s3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public void m26681u3() {
        this.f8580Q.scheduled("core_refresh_free_trial_info", 0, new v9j() { // from class: l.qr8
            public final Object call() {
                return this.f19985a.m26680t3();
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public void m26682v3(int i) {
        this.f25327S.put(Integer.valueOf(i));
    }
}
