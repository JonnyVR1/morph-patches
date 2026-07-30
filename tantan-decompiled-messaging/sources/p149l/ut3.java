package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.task.Task;
import com.p046p1.mobile.putong.data.ResourceDirection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ut3 {

    /* JADX INFO: renamed from: a */
    final CleverTapInstanceConfig f178224a;

    /* JADX INFO: renamed from: b */
    String f178225b;

    /* JADX INFO: renamed from: d */
    final pe2 f178227d;

    /* JADX INFO: renamed from: e */
    final vg2 f178228e;

    /* JADX INFO: renamed from: f */
    vhi f178229f;

    /* JADX INFO: renamed from: c */
    boolean f178226c = false;

    /* JADX INFO: renamed from: g */
    private final Map<String, Boolean> f178230g = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l.ut3$a */
    public class CallableC20505a implements Callable<Void> {
        public CallableC20505a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                ut3.this.f178227d.mo168499a();
                return null;
            } catch (Exception e) {
                ut3.this.m195282i().verbose(ut3.this.m195283k(), e.getLocalizedMessage());
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: l.ut3$b */
    public class C20506b implements pg50<Boolean> {
        public C20506b() {
        }

        @Override // p149l.pg50
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            ut3.this.f178226c = bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: l.ut3$c */
    public class CallableC20507c implements Callable<Boolean> {
        public CallableC20507c() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            Boolean bool;
            synchronized (this) {
                try {
                    ut3.this.m195282i().verbose(ut3.this.m195283k(), "Feature flags init is called");
                    String strM195288h = ut3.this.m195288h();
                    try {
                        ut3.this.f178230g.clear();
                        String strM198461b = ut3.this.f178229f.m198461b(strM195288h);
                        if (TextUtils.isEmpty(strM198461b)) {
                            ut3.this.m195282i().verbose(ut3.this.m195283k(), "Feature flags file is empty-" + strM195288h);
                        } else {
                            JSONArray jSONArray = new JSONObject(strM198461b).getJSONArray(Constants.KEY_KV);
                            if (jSONArray != null && jSONArray.length() > 0) {
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                                    if (jSONObject != null) {
                                        String string = jSONObject.getString("n");
                                        String string2 = jSONObject.getString(ResourceDirection.f38808v);
                                        if (!TextUtils.isEmpty(string)) {
                                            ut3.this.f178230g.put(string, Boolean.valueOf(Boolean.parseBoolean(string2)));
                                        }
                                    }
                                }
                            }
                            ut3.this.m195282i().verbose(ut3.this.m195283k(), "Feature flags initialized from file " + strM195288h + " with configs  " + ut3.this.f178230g);
                        }
                        bool = Boolean.TRUE;
                    } catch (Exception e) {
                        ut3.this.m195282i().verbose(ut3.this.m195283k(), "UnArchiveData failed file- " + strM195288h, e);
                        return Boolean.FALSE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bool;
        }
    }

    /* JADX INFO: renamed from: l.ut3$d */
    public class CallableC20508d implements Callable<Void> {
        public CallableC20508d() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                if (ut3.this.f178228e.mo100734h() == null) {
                    return null;
                }
                ut3.this.f178228e.mo100734h().m205531a();
                return null;
            } catch (Exception e) {
                ut3.this.m195282i().verbose(ut3.this.m195283k(), e.getLocalizedMessage());
                return null;
            }
        }
    }

    @Deprecated
    public ut3(String str, CleverTapInstanceConfig cleverTapInstanceConfig, vg2 vg2Var, pe2 pe2Var, vhi vhiVar) {
        this.f178225b = str;
        this.f178224a = cleverTapInstanceConfig;
        this.f178228e = vg2Var;
        this.f178227d = pe2Var;
        this.f178229f = vhiVar;
        m195290l();
    }

    /* JADX INFO: renamed from: d */
    private synchronized void m195281d(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f178229f.m198462c(m195286f(), m195287g(), jSONObject);
                m195282i().verbose(m195283k(), "Feature flags saved into file-[" + m195288h() + Constants.AES_SUFFIX + this.f178230g);
            } catch (Exception e) {
                m195282i().verbose(m195283k(), "ArchiveData failed", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public Logger m195282i() {
        return this.f178224a.getLogger();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public String m195283k() {
        return this.f178224a.getAccountId() + "[Feature Flag]";
    }

    /* JADX INFO: renamed from: n */
    private void m195284n() {
        if (this.f178228e.mo100734h() != null) {
            st3.m185849c(this.f178224a).m190591c().m6946g("notifyFeatureFlagUpdate", new CallableC20508d());
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public void m195285e() {
        st3.m185849c(this.f178224a).m190591c().m6946g("fetchFeatureFlags", new CallableC20505a());
    }

    /* JADX INFO: renamed from: f */
    public String m195286f() {
        return "Feature_Flag_" + this.f178224a.getAccountId() + "_" + this.f178225b;
    }

    /* JADX INFO: renamed from: g */
    public String m195287g() {
        return "ff_cache.json";
    }

    /* JADX INFO: renamed from: h */
    public String m195288h() {
        return m195286f() + "/" + m195287g();
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public String m195289j() {
        return this.f178225b;
    }

    /* JADX INFO: renamed from: l */
    public void m195290l() {
        if (TextUtils.isEmpty(this.f178225b)) {
            return;
        }
        Task taskM190589a = st3.m185849c(this.f178224a).m190589a();
        taskM190589a.m6945f(new C20506b());
        taskM190589a.m6946g("initFeatureFlags", new CallableC20507c());
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public boolean m195291m() {
        return this.f178226c;
    }

    @Deprecated
    /* JADX INFO: renamed from: o */
    public void m195292o(String str) {
        this.f178225b = str;
        m195290l();
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public void m195293p(String str) {
        if (this.f178226c) {
            return;
        }
        this.f178225b = str;
        m195290l();
    }

    @Deprecated
    /* JADX INFO: renamed from: q */
    public synchronized void m195294q(JSONObject jSONObject) throws JSONException {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(Constants.KEY_KV);
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    this.f178230g.put(jSONObject2.getString("n"), Boolean.valueOf(jSONObject2.getBoolean(ResourceDirection.f38808v)));
                } catch (JSONException e) {
                    m195282i().verbose(m195283k(), "Error parsing Feature Flag array " + e.getLocalizedMessage());
                }
            }
            m195282i().verbose(m195283k(), "Updating feature flags..." + this.f178230g);
            m195281d(jSONObject);
            m195284n();
        } catch (Throwable th) {
            throw th;
        }
    }
}
