package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.task.Task;
import com.p051p1.mobile.putong.data.ResourceDirection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class tu3 {

    /* JADX INFO: renamed from: a */
    final CleverTapInstanceConfig f176133a;

    /* JADX INFO: renamed from: b */
    String f176134b;

    /* JADX INFO: renamed from: d */
    final xe2 f176136d;

    /* JADX INFO: renamed from: e */
    final ch2 f176137e;

    /* JADX INFO: renamed from: f */
    ski f176138f;

    /* JADX INFO: renamed from: c */
    boolean f176135c = false;

    /* JADX INFO: renamed from: g */
    private final Map<String, Boolean> f176139g = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l.tu3$a */
    public class CallableC20399a implements Callable<Void> {
        public CallableC20399a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                tu3.this.f176136d.mo186393a();
                return null;
            } catch (Exception e) {
                tu3.this.m192711i().verbose(tu3.this.m192712k(), e.getLocalizedMessage());
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: l.tu3$b */
    public class C20400b implements vo50<Boolean> {
        public C20400b() {
        }

        @Override // p153l.vo50
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            tu3.this.f176135c = bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: l.tu3$c */
    public class CallableC20401c implements Callable<Boolean> {
        public CallableC20401c() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            Boolean bool;
            synchronized (this) {
                try {
                    tu3.this.m192711i().verbose(tu3.this.m192712k(), "Feature flags init is called");
                    String strM192717h = tu3.this.m192717h();
                    try {
                        tu3.this.f176139g.clear();
                        String strM186452b = tu3.this.f176138f.m186452b(strM192717h);
                        if (TextUtils.isEmpty(strM186452b)) {
                            tu3.this.m192711i().verbose(tu3.this.m192712k(), "Feature flags file is empty-" + strM192717h);
                        } else {
                            JSONArray jSONArray = new JSONObject(strM186452b).getJSONArray(Constants.KEY_KV);
                            if (jSONArray != null && jSONArray.length() > 0) {
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                                    if (jSONObject != null) {
                                        String string = jSONObject.getString("n");
                                        String string2 = jSONObject.getString(ResourceDirection.f39656v);
                                        if (!TextUtils.isEmpty(string)) {
                                            tu3.this.f176139g.put(string, Boolean.valueOf(Boolean.parseBoolean(string2)));
                                        }
                                    }
                                }
                            }
                            tu3.this.m192711i().verbose(tu3.this.m192712k(), "Feature flags initialized from file " + strM192717h + " with configs  " + tu3.this.f176139g);
                        }
                        bool = Boolean.TRUE;
                    } catch (Exception e) {
                        tu3.this.m192711i().verbose(tu3.this.m192712k(), "UnArchiveData failed file- " + strM192717h, e);
                        return Boolean.FALSE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bool;
        }
    }

    /* JADX INFO: renamed from: l.tu3$d */
    public class CallableC20402d implements Callable<Void> {
        public CallableC20402d() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                if (tu3.this.f176137e.mo96514h() == null) {
                    return null;
                }
                tu3.this.f176137e.mo96514h().m202773a();
                return null;
            } catch (Exception e) {
                tu3.this.m192711i().verbose(tu3.this.m192712k(), e.getLocalizedMessage());
                return null;
            }
        }
    }

    @Deprecated
    public tu3(String str, CleverTapInstanceConfig cleverTapInstanceConfig, ch2 ch2Var, xe2 xe2Var, ski skiVar) {
        this.f176134b = str;
        this.f176133a = cleverTapInstanceConfig;
        this.f176137e = ch2Var;
        this.f176136d = xe2Var;
        this.f176138f = skiVar;
        m192719l();
    }

    /* JADX INFO: renamed from: d */
    private synchronized void m192710d(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f176138f.m186453c(m192715f(), m192716g(), jSONObject);
                m192711i().verbose(m192712k(), "Feature flags saved into file-[" + m192717h() + Constants.AES_SUFFIX + this.f176139g);
            } catch (Exception e) {
                m192711i().verbose(m192712k(), "ArchiveData failed", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public Logger m192711i() {
        return this.f176133a.getLogger();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public String m192712k() {
        return this.f176133a.getAccountId() + "[Feature Flag]";
    }

    /* JADX INFO: renamed from: n */
    private void m192713n() {
        if (this.f176137e.mo96514h() != null) {
            ru3.m183186c(this.f176133a).m187989c().m7000g("notifyFeatureFlagUpdate", new CallableC20402d());
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public void m192714e() {
        ru3.m183186c(this.f176133a).m187989c().m7000g("fetchFeatureFlags", new CallableC20399a());
    }

    /* JADX INFO: renamed from: f */
    public String m192715f() {
        return "Feature_Flag_" + this.f176133a.getAccountId() + "_" + this.f176134b;
    }

    /* JADX INFO: renamed from: g */
    public String m192716g() {
        return "ff_cache.json";
    }

    /* JADX INFO: renamed from: h */
    public String m192717h() {
        return m192715f() + "/" + m192716g();
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public String m192718j() {
        return this.f176134b;
    }

    /* JADX INFO: renamed from: l */
    public void m192719l() {
        if (TextUtils.isEmpty(this.f176134b)) {
            return;
        }
        Task taskM187987a = ru3.m183186c(this.f176133a).m187987a();
        taskM187987a.m6999f(new C20400b());
        taskM187987a.m7000g("initFeatureFlags", new CallableC20401c());
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public boolean m192720m() {
        return this.f176135c;
    }

    @Deprecated
    /* JADX INFO: renamed from: o */
    public void m192721o(String str) {
        this.f176134b = str;
        m192719l();
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public void m192722p(String str) {
        if (this.f176135c) {
            return;
        }
        this.f176134b = str;
        m192719l();
    }

    @Deprecated
    /* JADX INFO: renamed from: q */
    public synchronized void m192723q(JSONObject jSONObject) throws JSONException {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(Constants.KEY_KV);
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    this.f176139g.put(jSONObject2.getString("n"), Boolean.valueOf(jSONObject2.getBoolean(ResourceDirection.f39656v)));
                } catch (JSONException e) {
                    m192711i().verbose(m192712k(), "Error parsing Feature Flag array " + e.getLocalizedMessage());
                }
            }
            m192711i().verbose(m192712k(), "Updating feature flags..." + this.f176139g);
            m192710d(jSONObject);
            m192713n();
        } catch (Throwable th) {
            throw th;
        }
    }
}
