package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import com.google.android.gms.internal.ads.zzgad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class mkv0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("this")
    public final Map f137332a = new HashMap();

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public final Map f137333b = new HashMap();

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public final Map f137334c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Map f137335d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final Map f137336e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final Executor f137337f;

    /* JADX INFO: renamed from: g */
    public JSONObject f137338g;

    public mkv0(Executor executor) {
        this.f137337f = executor;
    }

    /* JADX INFO: renamed from: o */
    public static final Bundle m158824o(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized Map m158825a(String str, String str2) {
        HashMap map;
        try {
            Map mapM158826b = m158826b(str, str2);
            zzgad zzgadVarM158831h = m158831h(str2);
            map = new HashMap();
            for (Map.Entry entry : ((zzgad) mapM158826b).entrySet()) {
                String str3 = (String) entry.getKey();
                if (zzgadVarM158831h.containsKey(str3)) {
                    qkv0 qkv0Var = (qkv0) zzgadVarM158831h.get(str3);
                    List list = (List) entry.getValue();
                    map.put(str3, new qkv0(str3, qkv0Var.f158176b, qkv0Var.f158177c, qkv0Var.f158178d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            etw0 etw0VarZze = zzgadVarM158831h.entrySet().iterator();
            while (etw0VarZze.hasNext()) {
                Map.Entry entry2 = (Map.Entry) etw0VarZze.next();
                String str4 = (String) entry2.getKey();
                if (!map.containsKey(str4) && ((qkv0) entry2.getValue()).f158178d) {
                    map.put(str4, (qkv0) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Map m158826b(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(bxy0.m106933q().m120264i().zzh().m214925c()) && (map = (Map) this.f137334c.get(str)) != null) {
                List<okv0> list = (List) map.get(str2);
                if (list == null) {
                    String strM169407a = ouu0.m169407a(this.f137338g, str2, str);
                    if (((Boolean) jas0.m144075c().m176505a(sgs0.f168459ra)).booleanValue()) {
                        strM169407a = strM169407a.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strM169407a);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (okv0 okv0Var : list) {
                        String str3 = okv0Var.f147788a;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(okv0Var.f147790c);
                    }
                    return zzgad.zzc(map2);
                }
            }
            return zzgad.zzd();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Map m158827c() {
        if (TextUtils.isEmpty(bxy0.m106933q().m120264i().zzh().m214925c())) {
            return zzgad.zzd();
        }
        return zzgad.zzc(this.f137333b);
    }

    /* JADX INFO: renamed from: e */
    public final void m158828e() {
        bxy0.m106933q().m120264i().mo131906p(new Runnable() { // from class: l.gkv0
            @Override // java.lang.Runnable
            public final void run() {
                this.f104774a.m158829f();
            }
        });
        this.f137337f.execute(new fkv0(this));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m158829f() {
        this.f137337f.execute(new fkv0(this));
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m158830g(String str) {
        if (!TextUtils.isEmpty(str) && !this.f137332a.containsKey(str)) {
            this.f137332a.put(str, new okv0(str, "", new Bundle()));
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized zzgad m158831h(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(bxy0.m106933q().m120264i().zzh().m214925c())) {
                boolean zMatches = Pattern.matches((String) jas0.m144075c().m176505a(sgs0.f168182W2), str);
                boolean zMatches2 = Pattern.matches((String) jas0.m144075c().m176505a(sgs0.f168194X2), str);
                if (zMatches) {
                    map = new HashMap(this.f137336e);
                } else if (zMatches2) {
                    map = new HashMap(this.f137335d);
                }
                return zzgad.zzc(map);
            }
            return zzgad.zzd();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized List m158832i(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleM158824o = m158824o(jSONObject.optJSONObject("data"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i, "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str2 = (String) arrayList2.get(i2);
                        m158830g(str2);
                        if (((okv0) this.f137332a.get(str2)) != null) {
                            arrayList.add(new okv0(str2, str, bundleM158824o));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m158833j() {
        this.f137333b.clear();
        this.f137332a.clear();
        this.f137336e.clear();
        this.f137335d.clear();
        m158836m();
        m158837n();
        m158834k();
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m158834k() {
        JSONObject jSONObjectM214928f;
        try {
            if (!((Boolean) njs0.f142338b.m149974e()).booleanValue()) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168061M1)).booleanValue() && (jSONObjectM214928f = bxy0.m106933q().m120264i().zzh().m214928f()) != null) {
                    try {
                        JSONArray jSONArray = jSONObjectM214928f.getJSONArray("adapter_settings");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String strOptString = jSONObject.optString("adapter_class_name");
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("permission_set");
                            if (!TextUtils.isEmpty(strOptString)) {
                                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                                    boolean zOptBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                    boolean zOptBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                    boolean zOptBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                    String strOptString2 = jSONObject2.optString("platform");
                                    qkv0 qkv0Var = new qkv0(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                    if (strOptString2.equals("ADMOB")) {
                                        this.f137335d.put(strOptString, qkv0Var);
                                    } else if (strOptString2.equals("AD_MANAGER")) {
                                        this.f137336e.put(strOptString, qkv0Var);
                                    }
                                }
                            }
                        }
                    } catch (JSONException e) {
                        d2v0.m113738l("Malformed config loading JSON.", e);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m158835l(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = (Map) this.f137334c.get(str);
            if (map == null) {
                map = new HashMap();
            }
            this.f137334c.put(str, map);
            List arrayList = (List) map.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.addAll(list);
            map.put(str2, arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m158836m() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObjectM214928f = bxy0.m106933q().m120264i().zzh().m214928f();
            if (jSONObjectM214928f != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectM214928f.optJSONArray("ad_unit_id_settings");
                    this.f137338g = jSONObjectM214928f.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i);
                            String lowerCase = ((Boolean) jas0.m144075c().m176505a(sgs0.f168459ra)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                            String strOptString = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                    arrayList.addAll(m158832i(jSONArrayOptJSONArray.getJSONObject(i2), strOptString));
                                }
                            }
                            m158835l(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e) {
                    d2v0.m113738l("Malformed config loading JSON.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m158837n() {
        JSONObject jSONObjectM214928f;
        if (!((Boolean) njs0.f142343g.m149974e()).booleanValue()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168049L1)).booleanValue() && (jSONObjectM214928f = bxy0.m106933q().m120264i().zzh().m214928f()) != null) {
                try {
                    JSONArray jSONArray = jSONObjectM214928f.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        Bundle bundleM158824o = m158824o(jSONObject.optJSONObject("data"));
                        String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.f137333b.put(strOptString, new qkv0(strOptString, zOptBoolean2, zOptBoolean, true, bundleM158824o));
                        }
                    }
                } catch (JSONException e) {
                    d2v0.m113738l("Malformed config loading JSON.", e);
                }
            }
        }
    }
}
