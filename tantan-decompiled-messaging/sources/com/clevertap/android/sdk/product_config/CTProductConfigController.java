package com.clevertap.android.sdk.product_config;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.ResourceDirection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.pe2;
import p149l.pg50;
import p149l.qs9;
import p149l.st3;
import p149l.vg2;
import p149l.vhi;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class CTProductConfigController {

    /* JADX INFO: renamed from: d */
    final vhi f5432d;

    /* JADX INFO: renamed from: e */
    private final CleverTapInstanceConfig f5433e;

    /* JADX INFO: renamed from: f */
    private final Context f5434f;

    /* JADX INFO: renamed from: h */
    private final pe2 f5436h;

    /* JADX INFO: renamed from: i */
    private final vg2 f5437i;

    /* JADX INFO: renamed from: j */
    private final qs9 f5438j;

    /* JADX INFO: renamed from: k */
    @Deprecated
    private final C1304a f5439k;

    /* JADX INFO: renamed from: a */
    @Deprecated
    final Map<String, String> f5429a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: b */
    @Deprecated
    final Map<String, String> f5430b = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: c */
    AtomicBoolean f5431c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    private final AtomicBoolean f5435g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l */
    private final Map<String, String> f5440l = Collections.synchronizedMap(new HashMap());

    public enum PROCESSING_STATE {
        INIT,
        FETCHED,
        ACTIVATED
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.CTProductConfigController$a */
    public class CallableC1299a implements Callable<Void> {
        public CallableC1299a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (this) {
                try {
                    try {
                        HashMap map = new HashMap();
                        boolean zIsEmpty = CTProductConfigController.this.f5440l.isEmpty();
                        CTProductConfigController cTProductConfigController = CTProductConfigController.this;
                        if (zIsEmpty) {
                            map = cTProductConfigController.m6874k(cTProductConfigController.m6881h());
                        } else {
                            map.putAll(cTProductConfigController.f5440l);
                            CTProductConfigController.this.f5440l.clear();
                        }
                        CTProductConfigController.this.f5429a.clear();
                        if (!CTProductConfigController.this.f5430b.isEmpty()) {
                            CTProductConfigController cTProductConfigController2 = CTProductConfigController.this;
                            cTProductConfigController2.f5429a.putAll(cTProductConfigController2.f5430b);
                        }
                        CTProductConfigController.this.f5429a.putAll(map);
                        CTProductConfigController.this.f5433e.getLogger().verbose(C1305b.m6921a(CTProductConfigController.this.f5433e), "Activated successfully with configs: " + CTProductConfigController.this.f5429a);
                    } catch (Exception e) {
                        CTProductConfigController.this.f5433e.getLogger().verbose(C1305b.m6921a(CTProductConfigController.this.f5433e), "Activate failed", e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.CTProductConfigController$b */
    public class C1300b implements pg50<Void> {
        public C1300b() {
        }

        @Override // p149l.pg50
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r1) {
            CTProductConfigController.this.m6879u(PROCESSING_STATE.ACTIVATED);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.CTProductConfigController$c */
    public class CallableC1301c implements Callable<Void> {
        public CallableC1301c() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            CTProductConfigController.this.f5433e.getLogger().verbose(C1305b.m6921a(CTProductConfigController.this.f5433e), "Product Config: fetch Success");
            CTProductConfigController.this.m6879u(PROCESSING_STATE.FETCHED);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.CTProductConfigController$d */
    public class CallableC1302d implements Callable<Boolean> {
        public CallableC1302d() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            Boolean bool;
            synchronized (this) {
                try {
                    try {
                        if (!CTProductConfigController.this.f5430b.isEmpty()) {
                            CTProductConfigController cTProductConfigController = CTProductConfigController.this;
                            cTProductConfigController.f5429a.putAll(cTProductConfigController.f5430b);
                        }
                        CTProductConfigController cTProductConfigController2 = CTProductConfigController.this;
                        HashMap mapM6874k = cTProductConfigController2.m6874k(cTProductConfigController2.m6881h());
                        if (!mapM6874k.isEmpty()) {
                            CTProductConfigController.this.f5440l.putAll(mapM6874k);
                        }
                        CTProductConfigController.this.f5433e.getLogger().verbose(C1305b.m6921a(CTProductConfigController.this.f5433e), "Loaded configs ready to be applied: " + CTProductConfigController.this.f5440l);
                        CTProductConfigController.this.f5439k.m6912m(CTProductConfigController.this.f5432d);
                        CTProductConfigController.this.f5431c.set(true);
                        bool = Boolean.TRUE;
                    } catch (Exception e) {
                        CTProductConfigController.this.f5433e.getLogger().verbose(C1305b.m6921a(CTProductConfigController.this.f5433e), "InitAsync failed", e);
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
    public class C1303e implements pg50<Boolean> {
        public C1303e() {
        }

        @Override // p149l.pg50
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            CTProductConfigController.this.m6879u(PROCESSING_STATE.INIT);
        }
    }

    @Deprecated
    public CTProductConfigController(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, pe2 pe2Var, qs9 qs9Var, vg2 vg2Var, C1304a c1304a, vhi vhiVar) {
        this.f5434f = context;
        this.f5433e = cleverTapInstanceConfig;
        this.f5438j = qs9Var;
        this.f5437i = vg2Var;
        this.f5436h = pe2Var;
        this.f5439k = c1304a;
        this.f5432d = vhiVar;
        m6884l();
    }

    /* JADX INFO: renamed from: g */
    private HashMap<String, String> m6873g(JSONObject jSONObject) {
        HashMap<String, String> map = new HashMap<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(Constants.KEY_KV);
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                        if (jSONObject2 != null) {
                            String string = jSONObject2.getString("n");
                            String string2 = jSONObject2.getString(ResourceDirection.f38808v);
                            if (!TextUtils.isEmpty(string)) {
                                map.put(string, string2);
                            }
                        }
                    } catch (Exception e) {
                        this.f5433e.getLogger().verbose(C1305b.m6921a(this.f5433e), "ConvertServerJsonToMap failed", e);
                    }
                }
            }
            return map;
        } catch (JSONException e2) {
            this.f5433e.getLogger().verbose(C1305b.m6921a(this.f5433e), "ConvertServerJsonToMap failed", e2);
            return map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public HashMap<String, String> m6874k(String str) throws Throwable {
        HashMap<String, String> map = new HashMap<>();
        try {
            String strM198461b = this.f5432d.m198461b(str);
            this.f5433e.getLogger().verbose(C1305b.m6921a(this.f5433e), "GetStoredValues reading file success:[ " + str + "]--[Content]" + strM198461b);
            if (!TextUtils.isEmpty(strM198461b)) {
                try {
                    JSONObject jSONObject = new JSONObject(strM198461b);
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
                                this.f5433e.getLogger().verbose(C1305b.m6921a(this.f5433e), "GetStoredValues failed for key " + next + " while parsing json", e);
                            }
                        }
                    }
                } catch (Exception e2) {
                    this.f5433e.getLogger().verbose(C1305b.m6921a(this.f5433e), "GetStoredValues failed due to malformed json", e2);
                }
            }
            return map;
        } catch (Exception e3) {
            this.f5433e.getLogger().verbose(C1305b.m6921a(this.f5433e), "GetStoredValues reading file failed", e3);
            return map;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m6875n() {
        if (this.f5437i.mo100740n() != null) {
            this.f5437i.mo100740n().m200154a();
        }
    }

    /* JADX INFO: renamed from: q */
    private void m6876q() {
        if (this.f5437i.mo100740n() != null) {
            this.f5437i.mo100740n().m200155b();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m6877r() {
        if (this.f5437i.mo100740n() != null) {
            this.f5433e.getLogger().verbose(this.f5433e.getAccountId(), "Product Config initialized");
            this.f5437i.mo100740n().m200156c();
        }
    }

    /* JADX INFO: renamed from: s */
    private synchronized void m6878s(JSONObject jSONObject) {
        Integer num;
        HashMap<String, String> mapM6873g = m6873g(jSONObject);
        this.f5440l.clear();
        this.f5440l.putAll(mapM6873g);
        this.f5433e.getLogger().verbose(C1305b.m6921a(this.f5433e), "Product Config: Fetched response:" + jSONObject);
        try {
            num = (Integer) jSONObject.get(com.tencent.connect.common.Constants.f57189TS);
        } catch (Exception e) {
            this.f5433e.getLogger().verbose(C1305b.m6921a(this.f5433e), "ParseFetchedResponse failed", e);
            num = null;
        }
        if (num != null) {
            this.f5439k.m6917r(((long) num.intValue()) * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m6879u(PROCESSING_STATE processing_state) {
        if (processing_state != null) {
            int iOrdinal = processing_state.ordinal();
            if (iOrdinal == 0) {
                m6877r();
            } else if (iOrdinal == 1) {
                m6876q();
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                m6875n();
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public void m6880f() {
        if (TextUtils.isEmpty(this.f5439k.m6908g())) {
            return;
        }
        st3.m185849c(this.f5433e).m190589a().m6945f(new C1300b()).m6946g("activateProductConfigs", new CallableC1299a());
    }

    /* JADX INFO: renamed from: h */
    public String m6881h() {
        return m6882i() + "/activated.json";
    }

    /* JADX INFO: renamed from: i */
    public String m6882i() {
        return "Product_Config_" + this.f5433e.getAccountId() + "_" + this.f5439k.m6908g();
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public C1304a m6883j() {
        return this.f5439k;
    }

    /* JADX INFO: renamed from: l */
    public void m6884l() {
        if (TextUtils.isEmpty(this.f5439k.m6908g())) {
            return;
        }
        st3.m185849c(this.f5433e).m190589a().m6945f(new C1303e()).m6946g("ProductConfig#initAsync", new CallableC1302d());
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public boolean m6885m() {
        return this.f5431c.get();
    }

    @Deprecated
    /* JADX INFO: renamed from: o */
    public void m6886o() {
        this.f5435g.compareAndSet(true, false);
        this.f5433e.getLogger().verbose(C1305b.m6921a(this.f5433e), "Fetch Failed");
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public void m6887p(JSONObject jSONObject) {
        if (TextUtils.isEmpty(this.f5439k.m6908g())) {
            return;
        }
        synchronized (this) {
            if (jSONObject != null) {
                try {
                    m6878s(jSONObject);
                    this.f5432d.m198462c(m6882i(), "activated.json", new JSONObject(this.f5440l));
                    this.f5433e.getLogger().verbose(C1305b.m6921a(this.f5433e), "Fetch file-[" + m6881h() + "] write success: " + this.f5440l);
                    st3.m185849c(this.f5433e).m190591c().m6946g("sendPCFetchSuccessCallback", new CallableC1301c());
                    if (this.f5435g.getAndSet(false)) {
                        m6880f();
                    }
                } catch (Exception e) {
                    this.f5433e.getLogger().verbose(C1305b.m6921a(this.f5433e), "Product Config: fetch Failed", e);
                    m6879u(PROCESSING_STATE.FETCHED);
                    this.f5435g.compareAndSet(true, false);
                }
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public void m6888t() {
        this.f5439k.m6914o(this.f5432d);
    }

    @Deprecated
    /* JADX INFO: renamed from: v */
    public void m6889v(JSONObject jSONObject) {
        this.f5439k.m6915p(jSONObject);
    }

    @Deprecated
    /* JADX INFO: renamed from: w */
    public void m6890w(String str) {
        if (m6885m() || TextUtils.isEmpty(str)) {
            return;
        }
        this.f5439k.m6916q(str);
        m6884l();
    }
}
