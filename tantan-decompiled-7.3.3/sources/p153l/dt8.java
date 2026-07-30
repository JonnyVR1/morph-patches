package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.FreeTrialConfig;
import com.p051p1.mobile.putong.core.data.FreeTrialInfo;
import com.p051p1.mobile.putong.core.data.FreeTrialOperateResult;
import com.p051p1.mobile.putong.core.data.FreeTrialRecords;
import com.p051p1.mobile.putong.core.data.VisitorSortType;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.SuperlikeReason;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class dt8 extends dy6 {

    /* JADX INFO: renamed from: R */
    public final wyd0 f90544R;

    /* JADX INFO: renamed from: S */
    public final vxd0 f90545S;

    /* JADX INFO: renamed from: T */
    public int f90546T;

    /* JADX INFO: renamed from: U */
    public boolean f90547U;

    /* JADX INFO: renamed from: V */
    public Map<String, FreeTrialConfig> f90548V;

    /* JADX INFO: renamed from: W */
    public C22507a<Map<String, FreeTrialRecords>> f90549W;

    public dt8(C4883c c4883c) {
        super(c4883c);
        this.f90544R = new wyd0("current_free_trial_status_" + CoreModule.m30929H().userId(), "");
        this.f90545S = new vxd0("free_trial_num_" + CoreModule.m30929H().userId(), 0);
        this.f90546T = 0;
        this.f90548V = new HashMap();
        this.f90549W = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ FreeTrialRecords m117802b3(FreeTrialRecords freeTrialRecords) {
        return freeTrialRecords;
    }

    /* JADX INFO: renamed from: j3 */
    public C22421c<FreeTrialOperateResult> m117810j3(String str, Boolean bool) {
        wyd0 wyd0Var = this.f90544R;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(bool.booleanValue() ? "opening" : "closed");
        wyd0Var.put(sb.toString());
        m117822v3(0);
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            jSONObject.put("operate", bool.booleanValue() ? "open" : "close");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return this.f91137Q.scheduled("core_change_free_trial_info", -1, new pcj() { // from class: l.us8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f180734a.m117818r3(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public final void m117811k3(Map<String, FreeTrialRecords> map) {
        String str = this.f90544R.get();
        FreeTrialRecords freeTrialRecords = (FreeTrialRecords) jyb.m147529r(map.values(), new qcj() { // from class: l.ct8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("opening".equals(((FreeTrialRecords) obj).status));
            }
        });
        if (NullChecker.m82486a(freeTrialRecords)) {
            if (m117813m3(freeTrialRecords.name, freeTrialRecords.status)) {
                return;
            }
            this.f90544R.put(freeTrialRecords.name + "_" + freeTrialRecords.status);
            m117822v3(0);
            return;
        }
        if (!map.containsKey(VisitorSortType.realUser)) {
            m117812l3(VisitorSortType.realUser, str);
            return;
        }
        if (m117816p3() && !map.containsKey(SuperlikeReason.popular)) {
            m117812l3(SuperlikeReason.popular, str);
            return;
        }
        if (!m117816p3() && !map.containsKey("online")) {
            m117812l3("online", str);
        } else {
            if (map.containsKey("haveRead")) {
                return;
            }
            m117812l3("haveRead", str);
        }
    }

    /* JADX INFO: renamed from: l3 */
    public final void m117812l3(String str, String str2) {
        if (str.equals(str2)) {
            return;
        }
        this.f90544R.put(str);
        m117822v3(0);
    }

    /* JADX INFO: renamed from: m3 */
    public boolean m117813m3(String str, String str2) {
        return this.f90544R.get().equals(str + "_" + str2);
    }

    /* JADX INFO: renamed from: n3 */
    public FreeTrialConfig m117814n3(String str) {
        return this.f90548V.get(str);
    }

    /* JADX INFO: renamed from: o3 */
    public int m117815o3() {
        return this.f90545S.get().intValue();
    }

    /* JADX INFO: renamed from: p3 */
    public boolean m117816p3() {
        if (CoreModule.f18264c.f20381e0.m116593na().isFemale()) {
            return CoreModule.f18264c.f20433v1.f90546T >= 7;
        }
        return CoreModule.f18264c.f20433v1.f90546T >= 8;
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ FreeTrialOperateResult m117817q3(Envelope envelope) {
        m117821u3();
        return ((CoreData) envelope.getModuleData(CoreData.class)).freeTrialOperateResult;
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ C22421c m117818r3(final JSONObject jSONObject) {
        return qi20.m176654a(new pcj() { // from class: l.vs8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32231N()).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.ws8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f190601a.m117817q3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ uxj0 m117819s3(Envelope envelope) {
        FreeTrialInfo freeTrialInfo = ((CoreData) envelope.getModuleData(CoreData.class)).freeTrialInfo;
        if (NullChecker.m82486a(freeTrialInfo)) {
            this.f90546T = freeTrialInfo.popLevel;
            this.f90547U = freeTrialInfo.allowTrial;
            this.f90548V = freeTrialInfo.config;
            HashMap mapM147502d = jyb.m147502d(freeTrialInfo.records, new qcj() { // from class: l.at8
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((FreeTrialRecords) obj).name;
                }
            }, new qcj() { // from class: l.bt8
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return dt8.m117802b3((FreeTrialRecords) obj);
                }
            });
            m117811k3(mapM147502d);
            this.f90549W.m137019l(mapM147502d);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ C22421c m117820t3() {
        return qi20.m176654a(new pcj() { // from class: l.ys8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32231N()).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.zs8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f205852a.m117819s3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public void m117821u3() {
        this.f91137Q.scheduled("core_refresh_free_trial_info", 0, new pcj() { // from class: l.xs8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f196066a.m117820t3();
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public void m117822v3(int i) {
        this.f90545S.put(Integer.valueOf(i));
    }
}
