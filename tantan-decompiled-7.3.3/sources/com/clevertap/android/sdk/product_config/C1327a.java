package com.clevertap.android.sdk.product_config;

import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.tencent.connect.common.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.ru3;
import p153l.ski;
import p153l.sw3;
import p153l.vo50;
import p153l.wg3;

/* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.a */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C1327a {

    /* JADX INFO: renamed from: a */
    private final CleverTapInstanceConfig f5483a;

    /* JADX INFO: renamed from: b */
    private String f5484b;

    /* JADX INFO: renamed from: c */
    private final ski f5485c;

    /* JADX INFO: renamed from: d */
    private final Map<String, String> f5486d = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.a$a */
    public class a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ski f5487a;

        public a(ski skiVar) {
            this.f5487a = skiVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (this) {
                try {
                    String strM6961f = C1327a.this.m6961f();
                    this.f5487a.m186451a(strM6961f);
                    C1327a.this.f5483a.getLogger().verbose(C1328b.m6975a(C1327a.this.f5483a), "Deleted settings file" + strM6961f);
                } catch (Exception e) {
                    C1327a.this.f5483a.getLogger().verbose(C1328b.m6975a(C1327a.this.f5483a), "Error while resetting settings", e);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.a$b */
    public class b implements Callable<Boolean> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            try {
                HashMap map = new HashMap(C1327a.this.f5486d);
                map.remove("fetch_min_interval_seconds");
                C1327a.this.f5485c.m186453c(C1327a.this.m6960e(), "config_settings.json", new JSONObject(map));
                return Boolean.TRUE;
            } catch (Exception e) {
                C1327a.this.f5483a.getLogger().verbose(C1328b.m6975a(C1327a.this.f5483a), "UpdateConfigToFile failed", e);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.a$c */
    public class c implements vo50<Boolean> {
        public c() {
        }

        @Override // p153l.vo50
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            C1327a c1327a = C1327a.this;
            if (!zBooleanValue) {
                c1327a.f5483a.getLogger().verbose(C1328b.m6975a(C1327a.this.f5483a), "Product Config settings: writing Failed");
                return;
            }
            c1327a.f5483a.getLogger().verbose(C1328b.m6975a(C1327a.this.f5483a), "Product Config settings: writing Success " + C1327a.this.f5486d);
        }
    }

    @Deprecated
    public C1327a(String str, CleverTapInstanceConfig cleverTapInstanceConfig, ski skiVar) {
        this.f5484b = str;
        this.f5483a = cleverTapInstanceConfig;
        this.f5485c = skiVar;
        m6965l();
    }

    /* JADX INFO: renamed from: j */
    private synchronized int m6953j() {
        int i;
        String str = this.f5486d.get("rc_n");
        i = 5;
        try {
            if (!TextUtils.isEmpty(str)) {
                i = (int) Double.parseDouble(str);
            }
        } catch (Exception e) {
            this.f5483a.getLogger().verbose(C1328b.m6975a(this.f5483a), "GetNoOfCallsInAllowedWindow failed", e);
        }
        return i;
    }

    /* JADX INFO: renamed from: k */
    private synchronized int m6954k() {
        int i;
        String str = this.f5486d.get("rc_w");
        i = 60;
        try {
            if (!TextUtils.isEmpty(str)) {
                i = (int) Double.parseDouble(str);
            }
        } catch (Exception e) {
            this.f5483a.getLogger().verbose(C1328b.m6975a(this.f5483a), "GetWindowIntervalInMinutes failed", e);
        }
        return i;
    }

    /* JADX INFO: renamed from: s */
    private synchronized void m6955s(int i) {
        long jM6953j = m6953j();
        if (i > 0 && jM6953j != i) {
            this.f5486d.put("rc_n", String.valueOf(i));
            m6958v();
        }
    }

    /* JADX INFO: renamed from: t */
    private void m6956t(String str, int i) {
        str.getClass();
        if (str.equals("rc_n")) {
            m6955s(i);
        } else if (str.equals("rc_w")) {
            m6957u(i);
        }
    }

    /* JADX INFO: renamed from: u */
    private synchronized void m6957u(int i) {
        int iM6954k = m6954k();
        if (i > 0 && iM6954k != i) {
            this.f5486d.put("rc_w", String.valueOf(i));
            m6958v();
        }
    }

    /* JADX INFO: renamed from: v */
    private synchronized void m6958v() {
        ru3.m183186c(this.f5483a).m187987a().m6999f(new c()).m7000g("ProductConfigSettings#updateConfigToFile", new b());
    }

    /* JADX INFO: renamed from: d */
    public void m6959d(ski skiVar) {
        if (skiVar != null) {
            ru3.m183186c(this.f5483a).m187987a().m7000g("ProductConfigSettings#eraseStoredSettingsFile", new a(skiVar));
        } else {
            wg3.m206174a("FileUtils can't be null");
        }
    }

    /* JADX INFO: renamed from: e */
    public String m6960e() {
        return "Product_Config_" + this.f5483a.getAccountId() + "_" + this.f5484b;
    }

    /* JADX INFO: renamed from: f */
    public String m6961f() {
        return m6960e() + "/config_settings.json";
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public String m6962g() {
        return this.f5484b;
    }

    /* JADX INFO: renamed from: h */
    public JSONObject m6963h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            this.f5483a.getLogger().verbose(C1328b.m6975a(this.f5483a), "LoadSettings failed", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized long m6964i() {
        long j;
        String str = this.f5486d.get(Constants.f58037TS);
        j = 0;
        try {
            if (!TextUtils.isEmpty(str)) {
                j = (long) Double.parseDouble(str);
            }
        } catch (Exception e) {
            this.f5483a.getLogger().verbose(C1328b.m6975a(this.f5483a), "GetLastFetchTimeStampInMillis failed", e);
        }
        return j;
    }

    /* JADX INFO: renamed from: l */
    public void m6965l() {
        this.f5486d.put("rc_n", String.valueOf(5));
        this.f5486d.put("rc_w", String.valueOf(60));
        this.f5486d.put(Constants.f58037TS, String.valueOf(0));
        this.f5486d.put("fetch_min_interval_seconds", String.valueOf(sw3.f170915a));
        this.f5483a.getLogger().verbose(C1328b.m6975a(this.f5483a), "Settings loaded with default values: " + this.f5486d);
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m6966m(ski skiVar) {
        if (skiVar == null) {
            throw new IllegalArgumentException("fileutils can't be null");
        }
        try {
            m6967n(m6963h(skiVar.m186452b(m6961f())));
        } catch (Exception e) {
            this.f5483a.getLogger().verbose(C1328b.m6975a(this.f5483a), "LoadSettings failed while reading file", e);
        }
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m6967n(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next)) {
                    try {
                        String strValueOf = String.valueOf(jSONObject.get(next));
                        if (!TextUtils.isEmpty(strValueOf)) {
                            this.f5486d.put(next, strValueOf);
                        }
                    } catch (Exception e) {
                        this.f5483a.getLogger().verbose(C1328b.m6975a(this.f5483a), "Failed loading setting for key " + next, e);
                    }
                }
            }
            this.f5483a.getLogger().verbose(C1328b.m6975a(this.f5483a), "LoadSettings completed with settings: " + this.f5486d);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m6968o(ski skiVar) {
        m6965l();
        m6959d(skiVar);
    }

    /* JADX INFO: renamed from: p */
    public void m6969p(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    if (!TextUtils.isEmpty(next)) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof Number) {
                            int iDoubleValue = (int) ((Number) obj).doubleValue();
                            if ("rc_n".equalsIgnoreCase(next) || "rc_w".equalsIgnoreCase(next)) {
                                m6956t(next, iDoubleValue);
                            }
                        }
                    }
                } catch (Exception e) {
                    this.f5483a.getLogger().verbose(C1328b.m6975a(this.f5483a), "Product Config setARPValue failed", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m6970q(String str) {
        this.f5484b = str;
    }

    /* JADX INFO: renamed from: r */
    public synchronized void m6971r(long j) {
        long jM6964i = m6964i();
        if (j >= 0 && jM6964i != j) {
            this.f5486d.put(Constants.f58037TS, String.valueOf(j));
            m6958v();
        }
    }
}
