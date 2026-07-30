package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.FreeTrialConfig;
import com.p046p1.mobile.putong.core.data.FreeTrialInfo;
import com.p046p1.mobile.putong.core.data.FreeTrialOperateResult;
import com.p046p1.mobile.putong.core.data.FreeTrialRecords;
import com.p046p1.mobile.putong.core.data.VisitorSortType;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.SuperlikeReason;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class wr8 extends ax6 {

    /* JADX INFO: renamed from: R */
    public final uqd0 f187770R;

    /* JADX INFO: renamed from: S */
    public final tpd0 f187771S;

    /* JADX INFO: renamed from: T */
    public int f187772T;

    /* JADX INFO: renamed from: U */
    public boolean f187773U;

    /* JADX INFO: renamed from: V */
    public Map<String, FreeTrialConfig> f187774V;

    /* JADX INFO: renamed from: W */
    public C22392a<Map<String, FreeTrialRecords>> f187775W;

    public wr8(C4732c c4732c) {
        super(c4732c);
        this.f187770R = new uqd0("current_free_trial_status_" + CoreModule.m29931H().userId(), "");
        this.f187771S = new tpd0("free_trial_num_" + CoreModule.m29931H().userId(), 0);
        this.f187772T = 0;
        this.f187774V = new HashMap();
        this.f187775W = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ FreeTrialRecords m205146b3(FreeTrialRecords freeTrialRecords) {
        return freeTrialRecords;
    }

    /* JADX INFO: renamed from: j3 */
    public C22306c<FreeTrialOperateResult> m205154j3(String str, Boolean bool) {
        uqd0 uqd0Var = this.f187770R;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(bool.booleanValue() ? "opening" : "closed");
        uqd0Var.put(sb.toString());
        m205166v3(0);
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            jSONObject.put("operate", bool.booleanValue() ? "open" : "close");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return this.f72126Q.scheduled("core_change_free_trial_info", -1, new v9j() { // from class: l.nr8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f140164a.m205162r3(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public final void m205155k3(Map<String, FreeTrialRecords> map) {
        String str = this.f187770R.get();
        FreeTrialRecords freeTrialRecords = (FreeTrialRecords) vwb.m200346r(map.values(), new w9j() { // from class: l.vr8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("opening".equals(((FreeTrialRecords) obj).status));
            }
        });
        if (NullChecker.m81303a(freeTrialRecords)) {
            if (m205157m3(freeTrialRecords.name, freeTrialRecords.status)) {
                return;
            }
            this.f187770R.put(freeTrialRecords.name + "_" + freeTrialRecords.status);
            m205166v3(0);
            return;
        }
        if (!map.containsKey(VisitorSortType.realUser)) {
            m205156l3(VisitorSortType.realUser, str);
            return;
        }
        if (m205160p3() && !map.containsKey(SuperlikeReason.popular)) {
            m205156l3(SuperlikeReason.popular, str);
            return;
        }
        if (!m205160p3() && !map.containsKey("online")) {
            m205156l3("online", str);
        } else {
            if (map.containsKey("haveRead")) {
                return;
            }
            m205156l3("haveRead", str);
        }
    }

    /* JADX INFO: renamed from: l3 */
    public final void m205156l3(String str, String str2) {
        if (str.equals(str2)) {
            return;
        }
        this.f187770R.put(str);
        m205166v3(0);
    }

    /* JADX INFO: renamed from: m3 */
    public boolean m205157m3(String str, String str2) {
        return this.f187770R.get().equals(str + "_" + str2);
    }

    /* JADX INFO: renamed from: n3 */
    public FreeTrialConfig m205158n3(String str) {
        return this.f187774V.get(str);
    }

    /* JADX INFO: renamed from: o3 */
    public int m205159o3() {
        return this.f187771S.get().intValue();
    }

    /* JADX INFO: renamed from: p3 */
    public boolean m205160p3() {
        if (CoreModule.f17545c.f19639e0.m169520na().isFemale()) {
            return CoreModule.f17545c.f19691v1.f187772T >= 7;
        }
        return CoreModule.f17545c.f19691v1.f187772T >= 8;
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ FreeTrialOperateResult m205161q3(Envelope envelope) {
        m205165u3();
        return ((CoreData) envelope.getModuleData(CoreData.class)).freeTrialOperateResult;
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ C22306c m205162r3(final JSONObject jSONObject) {
        return ia20.m135117a(new v9j() { // from class: l.or8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31228N()).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.pr8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f150860a.m205161q3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ roj0 m205163s3(Envelope envelope) {
        FreeTrialInfo freeTrialInfo = ((CoreData) envelope.getModuleData(CoreData.class)).freeTrialInfo;
        if (NullChecker.m81303a(freeTrialInfo)) {
            this.f187772T = freeTrialInfo.popLevel;
            this.f187773U = freeTrialInfo.allowTrial;
            this.f187774V = freeTrialInfo.config;
            HashMap mapM200319d = vwb.m200319d(freeTrialInfo.records, new w9j() { // from class: l.tr8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FreeTrialRecords) obj).name;
                }
            }, new w9j() { // from class: l.ur8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return wr8.m205146b3((FreeTrialRecords) obj);
                }
            });
            m205155k3(mapM200319d);
            this.f187775W.m132487l(mapM200319d);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ C22306c m205164t3() {
        return ia20.m135117a(new v9j() { // from class: l.rr8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31228N()).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.sr8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f166052a.m205163s3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public void m205165u3() {
        this.f72126Q.scheduled("core_refresh_free_trial_info", 0, new v9j() { // from class: l.qr8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f155971a.m205164t3();
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public void m205166v3(int i) {
        this.f187771S.put(Integer.valueOf(i));
    }
}
