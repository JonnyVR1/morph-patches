package com.clevertap.android.sdk.product_config;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.ResourceDirection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.bu9;
import p153l.ch2;
import p153l.ru3;
import p153l.ski;
import p153l.vo50;
import p153l.xe2;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class CTProductConfigController {

    /* JADX INFO: renamed from: d */
    final ski f5469d;

    /* JADX INFO: renamed from: e */
    private final CleverTapInstanceConfig f5470e;

    /* JADX INFO: renamed from: f */
    private final Context f5471f;

    /* JADX INFO: renamed from: h */
    private final xe2 f5473h;

    /* JADX INFO: renamed from: i */
    private final ch2 f5474i;

    /* JADX INFO: renamed from: j */
    private final bu9 f5475j;

    /* JADX INFO: renamed from: k */
    @Deprecated
    private final C1327a f5476k;

    /* JADX INFO: renamed from: a */
    @Deprecated
    final Map<String, String> f5466a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: b */
    @Deprecated
    final Map<String, String> f5467b = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: c */
    AtomicBoolean f5468c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    private final AtomicBoolean f5472g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l */
    private final Map<String, String> f5477l = Collections.synchronizedMap(new HashMap());

    public enum PROCESSING_STATE {
        INIT,
        FETCHED,
        ACTIVATED
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.CTProductConfigController$a */
    public class CallableC1322a implements Callable<Void> {
        public CallableC1322a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (this) {
                try {
                    try {
                        HashMap map = new HashMap();
                        boolean zIsEmpty = CTProductConfigController.this.f5477l.isEmpty();
                        CTProductConfigController cTProductConfigController = CTProductConfigController.this;
                        if (zIsEmpty) {
                            map = cTProductConfigController.m6928k(cTProductConfigController.m6935h());
                        } else {
                            map.putAll(cTProductConfigController.f5477l);
                            CTProductConfigController.this.f5477l.clear();
                        }
                        CTProductConfigController.this.f5466a.clear();
                        if (!CTProductConfigController.this.f5467b.isEmpty()) {
                            CTProductConfigController cTProductConfigController2 = CTProductConfigController.this;
                            cTProductConfigController2.f5466a.putAll(cTProductConfigController2.f5467b);
                        }
                        CTProductConfigController.this.f5466a.putAll(map);
                        CTProductConfigController.this.f5470e.getLogger().verbose(C1328b.m6975a(CTProductConfigController.this.f5470e), "Activated successfully with configs: " + CTProductConfigController.this.f5466a);
                    } catch (Exception e) {
                        CTProductConfigController.this.f5470e.getLogger().verbose(C1328b.m6975a(CTProductConfigController.this.f5470e), "Activate failed", e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.CTProductConfigController$b */
    public class C1323b implements vo50<Void> {
        public C1323b() {
        }

        @Override // p153l.vo50
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r1) {
            CTProductConfigController.this.m6933u(PROCESSING_STATE.ACTIVATED);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.CTProductConfigController$c */
    public class CallableC1324c implements Callable<Void> {
        public CallableC1324c() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            CTProductConfigController.this.f5470e.getLogger().verbose(C1328b.m6975a(CTProductConfigController.this.f5470e), "Product Config: fetch Success");
            CTProductConfigController.this.m6933u(PROCESSING_STATE.FETCHED);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.CTProductConfigController$d */
    public class CallableC1325d implements Callable<Boolean> {
        public CallableC1325d() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            Boolean bool;
            synchronized (this) {
                try {
                    try {
                        if (!CTProductConfigController.this.f5467b.isEmpty()) {
                            CTProductConfigController cTProductConfigController = CTProductConfigController.this;
                            cTProductConfigController.f5466a.putAll(cTProductConfigController.f5467b);
                        }
                        CTProductConfigController cTProductConfigController2 = CTProductConfigController.this;
                        HashMap mapM6928k = cTProductConfigController2.m6928k(cTProductConfigController2.m6935h());
                        if (!mapM6928k.isEmpty()) {
                            CTProductConfigController.this.f5477l.putAll(mapM6928k);
                        }
                        CTProductConfigController.this.f5470e.getLogger().verbose(C1328b.m6975a(CTProductConfigController.this.f5470e), "Loaded configs ready to be applied: " + CTProductConfigController.this.f5477l);
                        CTProductConfigController.this.f5476k.m6966m(CTProductConfigController.this.f5469d);
                        CTProductConfigController.this.f5468c.set(true);
                        bool = Boolean.TRUE;
                    } catch (Exception e) {
                        CTProductConfigController.this.f5470e.getLogger().verbose(C1328b.m6975a(CTProductConfigController.this.f5470e), "InitAsync failed", e);
                        return Boolean.FALSE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bool;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.CTProductConfigController$e */
    public class C1326e implements vo50<Boolean> {
        public C1326e() {
        }

        @Override // p153l.vo50
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            CTProductConfigController.this.m6933u(PROCESSING_STATE.INIT);
        }
    }

    @Deprecated
    public CTProductConfigController(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, xe2 xe2Var, bu9 bu9Var, ch2 ch2Var, C1327a c1327a, ski skiVar) {
        this.f5471f = context;
        this.f5470e = cleverTapInstanceConfig;
        this.f5475j = bu9Var;
        this.f5474i = ch2Var;
        this.f5473h = xe2Var;
        this.f5476k = c1327a;
        this.f5469d = skiVar;
        m6938l();
    }

    /* JADX INFO: renamed from: g */
    private HashMap<String, String> m6927g(JSONObject jSONObject) {
        HashMap<String, String> map = new HashMap<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(Constants.KEY_KV);
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                        if (jSONObject2 != null) {
                            String string = jSONObject2.getString("n");
                            String string2 = jSONObject2.getString(ResourceDirection.f39656v);
                            if (!TextUtils.isEmpty(string)) {
                                map.put(string, string2);
                            }
                        }
                    } catch (Exception e) {
                        this.f5470e.getLogger().verbose(C1328b.m6975a(this.f5470e), "ConvertServerJsonToMap failed", e);
                    }
                }
            }
            return map;
        } catch (JSONException e2) {
            this.f5470e.getLogger().verbose(C1328b.m6975a(this.f5470e), "ConvertServerJsonToMap failed", e2);
            return map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public HashMap<String, String> m6928k(String str) throws Throwable {
        HashMap<String, String> map = new HashMap<>();
        try {
            String strM186452b = this.f5469d.m186452b(str);
            this.f5470e.getLogger().verbose(C1328b.m6975a(this.f5470e), "GetStoredValues reading file success:[ " + str + "]--[Content]" + strM186452b);
            if (!TextUtils.isEmpty(strM186452b)) {
                try {
                    JSONObject jSONObject = new JSONObject(strM186452b);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!TextUtils.isEmpty(next)) {
                            try {
                                String strValueOf = String.valueOf(jSONObject.get(next));
                                if (!TextUtils.isEmpty(strValueOf)) {
                                    map.put(next, strValueOf);
                                }
                            } catch (Exception e) {
                                this.f5470e.getLogger().verbose(C1328b.m6975a(this.f5470e), "GetStoredValues failed for key " + next + " while parsing json", e);
                            }
                        }
                    }
                } catch (Exception e2) {
                    this.f5470e.getLogger().verbose(C1328b.m6975a(this.f5470e), "GetStoredValues failed due to malformed json", e2);
                }
            }
            return map;
        } catch (Exception e3) {
            this.f5470e.getLogger().verbose(C1328b.m6975a(this.f5470e), "GetStoredValues reading file failed", e3);
            return map;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m6929n() {
        if (this.f5474i.mo96520n() != null) {
            this.f5474i.mo96520n().m198335a();
        }
    }

    /* JADX INFO: renamed from: q */
    private void m6930q() {
        if (this.f5474i.mo96520n() != null) {
            this.f5474i.mo96520n().m198336b();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m6931r() {
        if (this.f5474i.mo96520n() != null) {
            this.f5470e.getLogger().verbose(this.f5470e.getAccountId(), "Product Config initialized");
            this.f5474i.mo96520n().m198337c();
        }
    }

    /* JADX INFO: renamed from: s */
    private synchronized void m6932s(JSONObject jSONObject) {
        Integer num;
        HashMap<String, String> mapM6927g = m6927g(jSONObject);
        this.f5477l.clear();
        this.f5477l.putAll(mapM6927g);
        this.f5470e.getLogger().verbose(C1328b.m6975a(this.f5470e), "Product Config: Fetched response:" + jSONObject);
        try {
            num = (Integer) jSONObject.get(com.tencent.connect.common.Constants.f58037TS);
        } catch (Exception e) {
            this.f5470e.getLogger().verbose(C1328b.m6975a(this.f5470e), "ParseFetchedResponse failed", e);
            num = null;
        }
        if (num != null) {
            this.f5476k.m6971r(((long) num.intValue()) * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m6933u(PROCESSING_STATE processing_state) {
        if (processing_state != null) {
            int iOrdinal = processing_state.ordinal();
            if (iOrdinal == 0) {
                m6931r();
            } else if (iOrdinal == 1) {
                m6930q();
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                m6929n();
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public void m6934f() {
        if (TextUtils.isEmpty(this.f5476k.m6962g())) {
            return;
        }
        ru3.m183186c(this.f5470e).m187987a().m6999f(new C1323b()).m7000g("activateProductConfigs", new CallableC1322a());
    }

    /* JADX INFO: renamed from: h */
    public String m6935h() {
        return m6936i() + "/activated.json";
    }

    /* JADX INFO: renamed from: i */
    public String m6936i() {
        return "Product_Config_" + this.f5470e.getAccountId() + "_" + this.f5476k.m6962g();
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public C1327a m6937j() {
        return this.f5476k;
    }

    /* JADX INFO: renamed from: l */
    public void m6938l() {
        if (TextUtils.isEmpty(this.f5476k.m6962g())) {
            return;
        }
        ru3.m183186c(this.f5470e).m187987a().m6999f(new C1326e()).m7000g("ProductConfig#initAsync", new CallableC1325d());
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public boolean m6939m() {
        return this.f5468c.get();
    }

    @Deprecated
    /* JADX INFO: renamed from: o */
    public void m6940o() {
        this.f5472g.compareAndSet(true, false);
        this.f5470e.getLogger().verbose(C1328b.m6975a(this.f5470e), "Fetch Failed");
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public void m6941p(JSONObject jSONObject) {
        if (TextUtils.isEmpty(this.f5476k.m6962g())) {
            return;
        }
        synchronized (this) {
            if (jSONObject != null) {
                try {
                    m6932s(jSONObject);
                    this.f5469d.m186453c(m6936i(), "activated.json", new JSONObject(this.f5477l));
                    this.f5470e.getLogger().verbose(C1328b.m6975a(this.f5470e), "Fetch file-[" + m6935h() + "] write success: " + this.f5477l);
                    ru3.m183186c(this.f5470e).m187989c().m7000g("sendPCFetchSuccessCallback", new CallableC1324c());
                    if (this.f5472g.getAndSet(false)) {
                        m6934f();
                    }
                } catch (Exception e) {
                    this.f5470e.getLogger().verbose(C1328b.m6975a(this.f5470e), "Product Config: fetch Failed", e);
                    m6933u(PROCESSING_STATE.FETCHED);
                    this.f5472g.compareAndSet(true, false);
                }
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public void m6942t() {
        this.f5476k.m6968o(this.f5469d);
    }

    @Deprecated
    /* JADX INFO: renamed from: v */
    public void m6943v(JSONObject jSONObject) {
        this.f5476k.m6969p(jSONObject);
    }

    @Deprecated
    /* JADX INFO: renamed from: w */
    public void m6944w(String str) {
        if (m6939m() || TextUtils.isEmpty(str)) {
            return;
        }
        this.f5476k.m6970q(str);
        m6938l();
    }
}
