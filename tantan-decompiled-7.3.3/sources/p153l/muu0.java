package p153l;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class muu0 {

    /* JADX INFO: renamed from: a */
    public final Map f138844a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public JSONObject f138845b;

    /* JADX INFO: renamed from: c */
    public final Executor f138846c;

    /* JADX INFO: renamed from: d */
    public boolean f138847d;

    /* JADX INFO: renamed from: e */
    public JSONObject f138848e;

    public muu0(Executor executor) {
        this.f138846c = executor;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m160244a() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168159U3)).booleanValue()) {
            return this.f138845b;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m160245b(String str, String str2) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168147T3)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f138847d) {
            m160249f();
        }
        Map map = (Map) this.f138844a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String strM169407a = ouu0.m169407a(this.f138848e, str, str2);
        if (strM169407a != null) {
            return (JSONObject) map.get(strM169407a);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m160246c() {
        bxy0.m106933q().m120264i().mo131906p(new Runnable() { // from class: l.juu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f122743a.m160248e();
            }
        });
        this.f138846c.execute(new Runnable() { // from class: l.kuu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f128924a.m160249f();
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m160248e() {
        this.f138846c.execute(new Runnable() { // from class: l.luu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f133658a.m160247d();
            }
        });
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void m160249f() {
        JSONObject jSONObjectM214928f;
        Map map;
        try {
            this.f138847d = true;
            yat0 yat0VarZzh = bxy0.m106933q().m120264i().zzh();
            if (yat0VarZzh != null && (jSONObjectM214928f = yat0VarZzh.m214928f()) != null) {
                this.f138845b = ((Boolean) jas0.m144075c().m176505a(sgs0.f168159U3)).booleanValue() ? jSONObjectM214928f.optJSONObject("common_settings") : null;
                this.f138848e = jSONObjectM214928f.optJSONObject("ad_unit_patterns");
                JSONArray jSONArrayOptJSONArray = jSONObjectM214928f.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                            String strOptString2 = jSONObjectOptJSONObject.optString("format");
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                            if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                                if (this.f138844a.containsKey(strOptString2)) {
                                    map = (Map) this.f138844a.get(strOptString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f138844a.put(strOptString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(strOptString, jSONObjectOptJSONObject2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
