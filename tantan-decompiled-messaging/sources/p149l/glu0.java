package p149l;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class glu0 {

    /* JADX INFO: renamed from: a */
    public final Map f103400a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public JSONObject f103401b;

    /* JADX INFO: renamed from: c */
    public final Executor f103402c;

    /* JADX INFO: renamed from: d */
    public boolean f103403d;

    /* JADX INFO: renamed from: e */
    public JSONObject f103404e;

    public glu0(Executor executor) {
        this.f103402c = executor;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m126917a() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132088U3)).booleanValue()) {
            return this.f103401b;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m126918b(String str, String str2) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132076T3)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f103403d) {
            m126922f();
        }
        Map map = (Map) this.f103400a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String strM137055a = ilu0.m137055a(this.f103404e, str, str2);
        if (strM137055a != null) {
            return (JSONObject) map.get(strM137055a);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m126919c() {
        vny0.m199079q().m212279i().mo96957p(new Runnable() { // from class: l.dlu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f86879a.m126921e();
            }
        });
        this.f103402c.execute(new Runnable() { // from class: l.elu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f92144a.m126922f();
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m126921e() {
        this.f103402c.execute(new Runnable() { // from class: l.flu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f98223a.m126920d();
            }
        });
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void m126922f() {
        JSONObject jSONObjectM182047f;
        Map map;
        try {
            this.f103403d = true;
            s1t0 s1t0VarZzh = vny0.m199079q().m212279i().zzh();
            if (s1t0VarZzh != null && (jSONObjectM182047f = s1t0VarZzh.m182047f()) != null) {
                this.f103401b = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132088U3)).booleanValue() ? jSONObjectM182047f.optJSONObject("common_settings") : null;
                this.f103404e = jSONObjectM182047f.optJSONObject("ad_unit_patterns");
                JSONArray jSONArrayOptJSONArray = jSONObjectM182047f.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                            String strOptString2 = jSONObjectOptJSONObject.optString("format");
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                            if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                                if (this.f103400a.containsKey(strOptString2)) {
                                    map = (Map) this.f103400a.get(strOptString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f103400a.put(strOptString2, concurrentHashMap);
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
