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
import p149l.ig3;
import p149l.pg50;
import p149l.st3;
import p149l.tv3;
import p149l.vhi;

/* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.a */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C1304a {

    /* JADX INFO: renamed from: a */
    private final CleverTapInstanceConfig f5446a;

    /* JADX INFO: renamed from: b */
    private String f5447b;

    /* JADX INFO: renamed from: c */
    private final vhi f5448c;

    /* JADX INFO: renamed from: d */
    private final Map<String, String> f5449d = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.a$a */
    public class a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ vhi f5450a;

        public a(vhi vhiVar) {
            this.f5450a = vhiVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (this) {
                try {
                    String strM6907f = C1304a.this.m6907f();
                    this.f5450a.m198460a(strM6907f);
                    C1304a.this.f5446a.getLogger().verbose(C1305b.m6921a(C1304a.this.f5446a), "Deleted settings file" + strM6907f);
                } catch (Exception e) {
                    C1304a.this.f5446a.getLogger().verbose(C1305b.m6921a(C1304a.this.f5446a), "Error while resetting settings", e);
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
                HashMap map = new HashMap(C1304a.this.f5449d);
                map.remove("fetch_min_interval_seconds");
                C1304a.this.f5448c.m198462c(C1304a.this.m6906e(), "config_settings.json", new JSONObject(map));
                return Boolean.TRUE;
            } catch (Exception e) {
                C1304a.this.f5446a.getLogger().verbose(C1305b.m6921a(C1304a.this.f5446a), "UpdateConfigToFile failed", e);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.a$c */
    public class c implements pg50<Boolean> {
        public c() {
        }

        @Override // p149l.pg50
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            C1304a c1304a = C1304a.this;
            if (!zBooleanValue) {
                c1304a.f5446a.getLogger().verbose(C1305b.m6921a(C1304a.this.f5446a), "Product Config settings: writing Failed");
                return;
            }
            c1304a.f5446a.getLogger().verbose(C1305b.m6921a(C1304a.this.f5446a), "Product Config settings: writing Success " + C1304a.this.f5449d);
        }
    }

    @Deprecated
    public C1304a(String str, CleverTapInstanceConfig cleverTapInstanceConfig, vhi vhiVar) {
        this.f5447b = str;
        this.f5446a = cleverTapInstanceConfig;
        this.f5448c = vhiVar;
        m6911l();
    }

    /* JADX INFO: renamed from: j */
    private synchronized int m6899j() {
        int i;
        String str = this.f5449d.get("rc_n");
        i = 5;
        try {
            if (!TextUtils.isEmpty(str)) {
                i = (int) Double.parseDouble(str);
            }
        } catch (Exception e) {
            this.f5446a.getLogger().verbose(C1305b.m6921a(this.f5446a), "GetNoOfCallsInAllowedWindow failed", e);
        }
        return i;
    }

    /* JADX INFO: renamed from: k */
    private synchronized int m6900k() {
        int i;
        String str = this.f5449d.get("rc_w");
        i = 60;
        try {
            if (!TextUtils.isEmpty(str)) {
                i = (int) Double.parseDouble(str);
            }
        } catch (Exception e) {
            this.f5446a.getLogger().verbose(C1305b.m6921a(this.f5446a), "GetWindowIntervalInMinutes failed", e);
        }
        return i;
    }

    /* JADX INFO: renamed from: s */
    private synchronized void m6901s(int i) {
        long jM6899j = m6899j();
        if (i > 0 && jM6899j != i) {
            this.f5449d.put("rc_n", String.valueOf(i));
            m6904v();
        }
    }

    /* JADX INFO: renamed from: t */
    private void m6902t(String str, int i) {
        str.getClass();
        if (str.equals("rc_n")) {
            m6901s(i);
        } else if (str.equals("rc_w")) {
            m6903u(i);
        }
    }

    /* JADX INFO: renamed from: u */
    private synchronized void m6903u(int i) {
        int iM6900k = m6900k();
        if (i > 0 && iM6900k != i) {
            this.f5449d.put("rc_w", String.valueOf(i));
            m6904v();
        }
    }

    /* JADX INFO: renamed from: v */
    private synchronized void m6904v() {
        st3.m185849c(this.f5446a).m190589a().m6945f(new c()).m6946g("ProductConfigSettings#updateConfigToFile", new b());
    }

    /* JADX INFO: renamed from: d */
    public void m6905d(vhi vhiVar) {
        if (vhiVar != null) {
            st3.m185849c(this.f5446a).m190589a().m6946g("ProductConfigSettings#eraseStoredSettingsFile", new a(vhiVar));
        } else {
            ig3.m135964a("FileUtils can't be null");
        }
    }

    /* JADX INFO: renamed from: e */
    public String m6906e() {
        return "Product_Config_" + this.f5446a.getAccountId() + "_" + this.f5447b;
    }

    /* JADX INFO: renamed from: f */
    public String m6907f() {
        return m6906e() + "/config_settings.json";
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public String m6908g() {
        return this.f5447b;
    }

    /* JADX INFO: renamed from: h */
    public JSONObject m6909h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            this.f5446a.getLogger().verbose(C1305b.m6921a(this.f5446a), "LoadSettings failed", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized long m6910i() {
        long j;
        String str = this.f5449d.get(Constants.f57189TS);
        j = 0;
        try {
            if (!TextUtils.isEmpty(str)) {
                j = (long) Double.parseDouble(str);
            }
        } catch (Exception e) {
            this.f5446a.getLogger().verbose(C1305b.m6921a(this.f5446a), "GetLastFetchTimeStampInMillis failed", e);
        }
        return j;
    }

    /* JADX INFO: renamed from: l */
    public void m6911l() {
        this.f5449d.put("rc_n", String.valueOf(5));
        this.f5449d.put("rc_w", String.valueOf(60));
        this.f5449d.put(Constants.f57189TS, String.valueOf(0));
        this.f5449d.put("fetch_min_interval_seconds", String.valueOf(tv3.f172246a));
        this.f5446a.getLogger().verbose(C1305b.m6921a(this.f5446a), "Settings loaded with default values: " + this.f5449d);
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m6912m(vhi vhiVar) {
        if (vhiVar == null) {
            throw new IllegalArgumentException("fileutils can't be null");
        }
        try {
            m6913n(m6909h(vhiVar.m198461b(m6907f())));
        } catch (Exception e) {
            this.f5446a.getLogger().verbose(C1305b.m6921a(this.f5446a), "LoadSettings failed while reading file", e);
        }
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m6913n(JSONObject jSONObject) {
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
                            this.f5449d.put(next, strValueOf);
                        }
                    } catch (Exception e) {
                        this.f5446a.getLogger().verbose(C1305b.m6921a(this.f5446a), "Failed loading setting for key " + next, e);
                    }
                }
            }
            this.f5446a.getLogger().verbose(C1305b.m6921a(this.f5446a), "LoadSettings completed with settings: " + this.f5449d);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m6914o(vhi vhiVar) {
        m6911l();
        m6905d(vhiVar);
    }

    /* JADX INFO: renamed from: p */
    public void m6915p(JSONObject jSONObject) {
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
                                m6902t(next, iDoubleValue);
                            }
                        }
                    }
                } catch (Exception e) {
                    this.f5446a.getLogger().verbose(C1305b.m6921a(this.f5446a), "Product Config setARPValue failed", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m6916q(String str) {
        this.f5447b = str;
    }

    /* JADX INFO: renamed from: r */
    public synchronized void m6917r(long j) {
        long jM6910i = m6910i();
        if (j >= 0 && jM6910i != j) {
            this.f5449d.put(Constants.f57189TS, String.valueOf(j));
            m6904v();
        }
    }
}
