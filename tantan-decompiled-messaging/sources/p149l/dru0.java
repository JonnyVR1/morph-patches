package p149l;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdyz;
import com.google.android.gms.internal.ads.zzdzc;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.util.security.Constraint;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class dru0 implements ktu0, lqu0 {

    /* JADX INFO: renamed from: a */
    public final lru0 f87676a;

    /* JADX INFO: renamed from: b */
    public final ltu0 f87677b;

    /* JADX INFO: renamed from: c */
    public final mqu0 f87678c;

    /* JADX INFO: renamed from: d */
    public final uqu0 f87679d;

    /* JADX INFO: renamed from: e */
    public final kqu0 f87680e;

    /* JADX INFO: renamed from: f */
    public final xru0 f87681f;

    /* JADX INFO: renamed from: g */
    public final String f87682g;

    /* JADX INFO: renamed from: h */
    public final String f87683h;

    /* JADX INFO: renamed from: m */
    public JSONObject f87688m;

    /* JADX INFO: renamed from: p */
    public boolean f87691p;

    /* JADX INFO: renamed from: q */
    public int f87692q;

    /* JADX INFO: renamed from: r */
    public boolean f87693r;

    /* JADX INFO: renamed from: i */
    public final Map f87684i = new HashMap();

    /* JADX INFO: renamed from: j */
    public final Map f87685j = new HashMap();

    /* JADX INFO: renamed from: k */
    public final Map f87686k = new HashMap();

    /* JADX INFO: renamed from: l */
    public String f87687l = WeJson.EMPTY_MAP;

    /* JADX INFO: renamed from: n */
    public long f87689n = Long.MAX_VALUE;

    /* JADX INFO: renamed from: o */
    public zzdyz f87690o = zzdyz.NONE;

    /* JADX INFO: renamed from: s */
    public zzdzc f87694s = zzdzc.UNKNOWN;

    /* JADX INFO: renamed from: t */
    public long f87695t = 0;

    public dru0(lru0 lru0Var, ltu0 ltu0Var, mqu0 mqu0Var, Context context, zzcei zzceiVar, uqu0 uqu0Var, xru0 xru0Var, String str) {
        this.f87676a = lru0Var;
        this.f87677b = ltu0Var;
        this.f87678c = mqu0Var;
        this.f87680e = new kqu0(context);
        this.f87682g = zzceiVar.zza;
        this.f87683h = str;
        this.f87679d = uqu0Var;
        this.f87681f = xru0Var;
        vny0.m199083u().m211394g(this);
    }

    /* JADX INFO: renamed from: a */
    public final zzdyz m113339a() {
        return this.f87690o;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized gnr m113340b(String str) {
        n3t0 n3t0Var;
        try {
            n3t0Var = new n3t0();
            if (this.f87685j.containsKey(str)) {
                n3t0Var.m157774b((nqu0) this.f87685j.get(str));
            } else {
                if (!this.f87686k.containsKey(str)) {
                    this.f87686k.put(str, new ArrayList());
                }
                ((List) this.f87686k.get(str)).add(n3t0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return n3t0Var;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized String m113341c() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132009N8)).booleanValue() && m113354p()) {
            if (this.f87689n < vny0.m199064b().currentTimeMillis() / 1000) {
                this.f87687l = WeJson.EMPTY_MAP;
                this.f87689n = Long.MAX_VALUE;
                return "";
            }
            if (!this.f87687l.equals(WeJson.EMPTY_MAP)) {
                return this.f87687l;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: d */
    public final synchronized String m113342d() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.f87691p);
            jSONObject.put("gesture", this.f87690o);
            if (this.f87689n > vny0.m199064b().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.f87687l);
                jSONObject.put("networkExtrasExpirationSecs", this.f87689n);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized JSONObject m113343e() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                if (!TextUtils.isEmpty(this.f87683h)) {
                    jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.f87683h);
                }
                jSONObject.put("internalSdkVersion", this.f87682g);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.f87679d.m195014a());
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132335n9)).booleanValue()) {
                    String strM212282n = vny0.m199079q().m212282n();
                    if (!TextUtils.isEmpty(strM212282n)) {
                        jSONObject.put("plugin", strM212282n);
                    }
                }
                if (this.f87689n < vny0.m199064b().currentTimeMillis() / 1000) {
                    this.f87687l = WeJson.EMPTY_MAP;
                }
                jSONObject.put("networkExtras", this.f87687l);
                jSONObject.put("adSlots", m113357s());
                jSONObject.put("appInfo", this.f87680e.m146958a());
                String strM182044c = vny0.m199079q().m212279i().zzh().m182044c();
                if (!TextUtils.isEmpty(strM182044c)) {
                    jSONObject.put("cld", new JSONObject(strM182044c));
                }
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132205d9)).booleanValue() && (jSONObject2 = this.f87688m) != null) {
                    x2t0.m206864b("Server data: " + jSONObject2.toString());
                    jSONObject.put("serverData", this.f87688m);
                }
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132192c9)).booleanValue()) {
                    jSONObject.put("openAction", this.f87694s);
                    jSONObject.put("gesture", this.f87690o);
                }
                jSONObject.put("isGamRegisteredTestDevice", vny0.m199083u().m211399l());
                vny0.m199080r();
                exr0.m118703b();
                jSONObject.put("isSimulator", i2t0.m134090t());
            } catch (JSONException e) {
                vny0.m199079q().m212289v(e, "Inspector.toJson");
                x2t0.m206870h("Ad inspector encountered an error", e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m113344f(String str, nqu0 nqu0Var) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132009N8)).booleanValue() && m113354p()) {
            if (this.f87692q >= ((Integer) d1s0.m109677c().m144697a(m7s0.f132033P8)).intValue()) {
                x2t0.m206869g("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.f87684i.containsKey(str)) {
                this.f87684i.put(str, new ArrayList());
            }
            this.f87692q++;
            ((List) this.f87684i.get(str)).add(nqu0Var);
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132309l9)).booleanValue()) {
                String strM160696a = nqu0Var.m160696a();
                this.f87685j.put(strM160696a, nqu0Var);
                if (this.f87686k.containsKey(strM160696a)) {
                    List list = (List) this.f87686k.get(strM160696a);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((n3t0) it.next()).m157774b(nqu0Var);
                    }
                    list.clear();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m113345g() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132009N8)).booleanValue()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132192c9)).booleanValue() && vny0.m199079q().m212279i().mo96949h()) {
                m113358t();
                return;
            }
            String strZzo = vny0.m199079q().m212279i().zzo();
            if (TextUtils.isEmpty(strZzo)) {
                return;
            }
            try {
                if (new JSONObject(strZzo).optBoolean("isTestMode", false)) {
                    m113358t();
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m113346h(ewt0 ewt0Var, zzdzc zzdzcVar) {
        if (!m113354p()) {
            try {
                ewt0Var.mo103601o5(pzv0.m172256d(18, null, null));
                return;
            } catch (RemoteException unused) {
                x2t0.m206869g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132009N8)).booleanValue()) {
            this.f87694s = zzdzcVar;
            this.f87676a.m151509e(ewt0Var, new ohs0(this), new hhs0(this.f87681f));
            return;
        } else {
            try {
                ewt0Var.mo103601o5(pzv0.m172256d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                x2t0.m206869g("Ad inspector had an internal error.");
                return;
            }
        }
        throw th;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m113347i(String str, long j) {
        this.f87687l = str;
        this.f87689n = j;
        m113359u();
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m113348j(long j) {
        this.f87695t += j;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0011  */
    /* JADX INFO: renamed from: k */
    public final void m113349k(boolean z) {
        if (this.f87693r) {
            if (z) {
                if (!this.f87691p) {
                    m113363y();
                    return;
                }
            }
        } else if (z) {
            m113358t();
            if (!this.f87691p) {
                m113363y();
                return;
            }
        }
        if (m113354p()) {
            return;
        }
        m113362x();
    }

    /* JADX INFO: renamed from: l */
    public final void m113350l(zzdyz zzdyzVar) {
        m113360v(zzdyzVar, true);
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m113351m(JSONObject jSONObject) {
        this.f87688m = jSONObject;
    }

    /* JADX INFO: renamed from: n */
    public final void m113352n(boolean z) {
        if (!this.f87693r && z) {
            m113358t();
        }
        m113361w(z, true);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m113353o() {
        return this.f87688m != null;
    }

    /* JADX INFO: renamed from: p */
    public final synchronized boolean m113354p() {
        boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132192c9)).booleanValue();
        boolean z = this.f87691p;
        if (zBooleanValue) {
            return z || vny0.m199083u().m211399l();
        }
        return z;
    }

    /* JADX INFO: renamed from: q */
    public final synchronized boolean m113355q() {
        return this.f87691p;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m113356r() {
        return this.f87695t < ((Long) d1s0.m109677c().m144697a(m7s0.f132270i9)).longValue();
    }

    /* JADX INFO: renamed from: s */
    public final synchronized JSONObject m113357s() throws JSONException {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f87684i.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (nqu0 nqu0Var : (List) entry.getValue()) {
                    if (nqu0Var.m160700e()) {
                        jSONArray.put(nqu0Var.m160697b());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: t */
    public final void m113358t() {
        this.f87693r = true;
        this.f87679d.m195015c();
        this.f87676a.m151507c(this);
        this.f87677b.m151722d(this);
        this.f87678c.m155997d(this);
        this.f87681f.m210716r8(this);
        m113364z(vny0.m199079q().m212279i().zzo());
    }

    /* JADX INFO: renamed from: u */
    public final void m113359u() {
        vny0.m199079q().m212279i().mo96954m(m113342d());
    }

    /* JADX INFO: renamed from: v */
    public final synchronized void m113360v(zzdyz zzdyzVar, boolean z) {
        try {
            if (this.f87690o != zzdyzVar) {
                if (m113354p()) {
                    m113362x();
                }
                this.f87690o = zzdyzVar;
                if (m113354p()) {
                    m113363y();
                }
                if (z) {
                    m113359u();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0033 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /* JADX INFO: renamed from: w */
    public final synchronized void m113361w(boolean z, boolean z2) {
        try {
            if (this.f87691p != z) {
                this.f87691p = z;
                if (z) {
                    if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132192c9)).booleanValue() || !vny0.m199083u().m211399l()) {
                        m113363y();
                    } else if (!m113354p()) {
                        m113362x();
                    }
                } else if (!m113354p()) {
                    m113362x();
                }
                if (z2) {
                    m113359u();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: x */
    public final synchronized void m113362x() {
        zzdyz zzdyzVar = zzdyz.NONE;
        int iOrdinal = this.f87690o.ordinal();
        if (iOrdinal == 1) {
            this.f87677b.m151720b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f87678c.m155995b();
        }
    }

    /* JADX INFO: renamed from: y */
    public final synchronized void m113363y() {
        zzdyz zzdyzVar = zzdyz.NONE;
        int iOrdinal = this.f87690o.ordinal();
        if (iOrdinal == 1) {
            this.f87677b.m151721c();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f87678c.m155996c();
        }
    }

    /* JADX INFO: renamed from: z */
    public final synchronized void m113364z(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            m113361w(jSONObject.optBoolean("isTestMode", false), false);
            m113360v((zzdyz) Enum.valueOf(zzdyz.class, jSONObject.optString("gesture", Constraint.NONE)), false);
            this.f87687l = jSONObject.optString("networkExtras", WeJson.EMPTY_MAP);
            this.f87689n = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }
}
