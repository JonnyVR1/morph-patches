package p153l;

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
public final class j0v0 implements q2v0, rzu0 {

    /* JADX INFO: renamed from: a */
    public final r0v0 f117871a;

    /* JADX INFO: renamed from: b */
    public final r2v0 f117872b;

    /* JADX INFO: renamed from: c */
    public final szu0 f117873c;

    /* JADX INFO: renamed from: d */
    public final a0v0 f117874d;

    /* JADX INFO: renamed from: e */
    public final qzu0 f117875e;

    /* JADX INFO: renamed from: f */
    public final d1v0 f117876f;

    /* JADX INFO: renamed from: g */
    public final String f117877g;

    /* JADX INFO: renamed from: h */
    public final String f117878h;

    /* JADX INFO: renamed from: m */
    public JSONObject f117883m;

    /* JADX INFO: renamed from: p */
    public boolean f117886p;

    /* JADX INFO: renamed from: q */
    public int f117887q;

    /* JADX INFO: renamed from: r */
    public boolean f117888r;

    /* JADX INFO: renamed from: i */
    public final Map f117879i = new HashMap();

    /* JADX INFO: renamed from: j */
    public final Map f117880j = new HashMap();

    /* JADX INFO: renamed from: k */
    public final Map f117881k = new HashMap();

    /* JADX INFO: renamed from: l */
    public String f117882l = WeJson.EMPTY_MAP;

    /* JADX INFO: renamed from: n */
    public long f117884n = Long.MAX_VALUE;

    /* JADX INFO: renamed from: o */
    public zzdyz f117885o = zzdyz.NONE;

    /* JADX INFO: renamed from: s */
    public zzdzc f117889s = zzdzc.UNKNOWN;

    /* JADX INFO: renamed from: t */
    public long f117890t = 0;

    public j0v0(r0v0 r0v0Var, r2v0 r2v0Var, szu0 szu0Var, Context context, zzcei zzceiVar, a0v0 a0v0Var, d1v0 d1v0Var, String str) {
        this.f117871a = r0v0Var;
        this.f117872b = r2v0Var;
        this.f117873c = szu0Var;
        this.f117875e = new qzu0(context);
        this.f117877g = zzceiVar.zza;
        this.f117878h = str;
        this.f117874d = a0v0Var;
        this.f117876f = d1v0Var;
        bxy0.m106937u().m114538g(this);
    }

    /* JADX INFO: renamed from: a */
    public final zzdyz m143036a() {
        return this.f117885o;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized hpr m143037b(String str) {
        tct0 tct0Var;
        try {
            tct0Var = new tct0();
            if (this.f117880j.containsKey(str)) {
                tct0Var.m190494b((tzu0) this.f117880j.get(str));
            } else {
                if (!this.f117881k.containsKey(str)) {
                    this.f117881k.put(str, new ArrayList());
                }
                ((List) this.f117881k.get(str)).add(tct0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return tct0Var;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized String m143038c() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168080N8)).booleanValue() && m143051p()) {
            if (this.f117884n < bxy0.m106918b().currentTimeMillis() / 1000) {
                this.f117882l = WeJson.EMPTY_MAP;
                this.f117884n = Long.MAX_VALUE;
                return "";
            }
            if (!this.f117882l.equals(WeJson.EMPTY_MAP)) {
                return this.f117882l;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: d */
    public final synchronized String m143039d() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.f117886p);
            jSONObject.put("gesture", this.f117885o);
            if (this.f117884n > bxy0.m106918b().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.f117882l);
                jSONObject.put("networkExtrasExpirationSecs", this.f117884n);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized JSONObject m143040e() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                if (!TextUtils.isEmpty(this.f117878h)) {
                    jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.f117878h);
                }
                jSONObject.put("internalSdkVersion", this.f117877g);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.f117874d.m95426a());
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168406n9)).booleanValue()) {
                    String strM120267n = bxy0.m106933q().m120267n();
                    if (!TextUtils.isEmpty(strM120267n)) {
                        jSONObject.put("plugin", strM120267n);
                    }
                }
                if (this.f117884n < bxy0.m106918b().currentTimeMillis() / 1000) {
                    this.f117882l = WeJson.EMPTY_MAP;
                }
                jSONObject.put("networkExtras", this.f117882l);
                jSONObject.put("adSlots", m143054s());
                jSONObject.put("appInfo", this.f117875e.m178828a());
                String strM214925c = bxy0.m106933q().m120264i().zzh().m214925c();
                if (!TextUtils.isEmpty(strM214925c)) {
                    jSONObject.put("cld", new JSONObject(strM214925c));
                }
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168276d9)).booleanValue() && (jSONObject2 = this.f117883m) != null) {
                    dct0.m115293b("Server data: " + jSONObject2.toString());
                    jSONObject.put("serverData", this.f117883m);
                }
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168263c9)).booleanValue()) {
                    jSONObject.put("openAction", this.f117889s);
                    jSONObject.put("gesture", this.f117885o);
                }
                jSONObject.put("isGamRegisteredTestDevice", bxy0.m106937u().m114543l());
                bxy0.m106934r();
                k6s0.m148569b();
                jSONObject.put("isSimulator", obt0.m167043t());
            } catch (JSONException e) {
                bxy0.m106933q().m120274v(e, "Inspector.toJson");
                dct0.m115299h("Ad inspector encountered an error", e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m143041f(String str, tzu0 tzu0Var) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168080N8)).booleanValue() && m143051p()) {
            if (this.f117887q >= ((Integer) jas0.m144075c().m176505a(sgs0.f168104P8)).intValue()) {
                dct0.m115298g("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.f117879i.containsKey(str)) {
                this.f117879i.put(str, new ArrayList());
            }
            this.f117887q++;
            ((List) this.f117879i.get(str)).add(tzu0Var);
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168380l9)).booleanValue()) {
                String strM193737a = tzu0Var.m193737a();
                this.f117880j.put(strM193737a, tzu0Var);
                if (this.f117881k.containsKey(strM193737a)) {
                    List list = (List) this.f117881k.get(strM193737a);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((tct0) it.next()).m190494b(tzu0Var);
                    }
                    list.clear();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m143042g() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168080N8)).booleanValue()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168263c9)).booleanValue() && bxy0.m106933q().m120264i().mo131898h()) {
                m143055t();
                return;
            }
            String strZzo = bxy0.m106933q().m120264i().zzo();
            if (TextUtils.isEmpty(strZzo)) {
                return;
            }
            try {
                if (new JSONObject(strZzo).optBoolean("isTestMode", false)) {
                    m143055t();
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m143043h(k5u0 k5u0Var, zzdzc zzdzcVar) {
        if (!m143051p()) {
            try {
                k5u0Var.mo113733o5(v8w0.m200327d(18, null, null));
                return;
            } catch (RemoteException unused) {
                dct0.m115298g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168080N8)).booleanValue()) {
            this.f117889s = zzdzcVar;
            this.f117871a.m179267e(k5u0Var, new uqs0(this), new nqs0(this.f117876f));
            return;
        } else {
            try {
                k5u0Var.mo113733o5(v8w0.m200327d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                dct0.m115298g("Ad inspector had an internal error.");
                return;
            }
        }
        throw th;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m143044i(String str, long j) {
        this.f117882l = str;
        this.f117884n = j;
        m143056u();
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m143045j(long j) {
        this.f117890t += j;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0011  */
    /* JADX INFO: renamed from: k */
    public final void m143046k(boolean z) {
        if (this.f117888r) {
            if (z) {
                if (!this.f117886p) {
                    m143060y();
                    return;
                }
            }
        } else if (z) {
            m143055t();
            if (!this.f117886p) {
                m143060y();
                return;
            }
        }
        if (m143051p()) {
            return;
        }
        m143059x();
    }

    /* JADX INFO: renamed from: l */
    public final void m143047l(zzdyz zzdyzVar) {
        m143057v(zzdyzVar, true);
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m143048m(JSONObject jSONObject) {
        this.f117883m = jSONObject;
    }

    /* JADX INFO: renamed from: n */
    public final void m143049n(boolean z) {
        if (!this.f117888r && z) {
            m143055t();
        }
        m143058w(z, true);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m143050o() {
        return this.f117883m != null;
    }

    /* JADX INFO: renamed from: p */
    public final synchronized boolean m143051p() {
        boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168263c9)).booleanValue();
        boolean z = this.f117886p;
        if (zBooleanValue) {
            return z || bxy0.m106937u().m114543l();
        }
        return z;
    }

    /* JADX INFO: renamed from: q */
    public final synchronized boolean m143052q() {
        return this.f117886p;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m143053r() {
        return this.f117890t < ((Long) jas0.m144075c().m176505a(sgs0.f168341i9)).longValue();
    }

    /* JADX INFO: renamed from: s */
    public final synchronized JSONObject m143054s() throws JSONException {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f117879i.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (tzu0 tzu0Var : (List) entry.getValue()) {
                    if (tzu0Var.m193741e()) {
                        jSONArray.put(tzu0Var.m193738b());
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
    public final void m143055t() {
        this.f117888r = true;
        this.f117874d.m95427c();
        this.f117871a.m179265c(this);
        this.f117872b.m179570d(this);
        this.f117873c.m188682d(this);
        this.f117876f.m113640r8(this);
        m143061z(bxy0.m106933q().m120264i().zzo());
    }

    /* JADX INFO: renamed from: u */
    public final void m143056u() {
        bxy0.m106933q().m120264i().mo131903m(m143039d());
    }

    /* JADX INFO: renamed from: v */
    public final synchronized void m143057v(zzdyz zzdyzVar, boolean z) {
        try {
            if (this.f117885o != zzdyzVar) {
                if (m143051p()) {
                    m143059x();
                }
                this.f117885o = zzdyzVar;
                if (m143051p()) {
                    m143060y();
                }
                if (z) {
                    m143056u();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0033 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /* JADX INFO: renamed from: w */
    public final synchronized void m143058w(boolean z, boolean z2) {
        try {
            if (this.f117886p != z) {
                this.f117886p = z;
                if (z) {
                    if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168263c9)).booleanValue() || !bxy0.m106937u().m114543l()) {
                        m143060y();
                    } else if (!m143051p()) {
                        m143059x();
                    }
                } else if (!m143051p()) {
                    m143059x();
                }
                if (z2) {
                    m143056u();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: x */
    public final synchronized void m143059x() {
        zzdyz zzdyzVar = zzdyz.NONE;
        int iOrdinal = this.f117885o.ordinal();
        if (iOrdinal == 1) {
            this.f117872b.m179568b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f117873c.m188680b();
        }
    }

    /* JADX INFO: renamed from: y */
    public final synchronized void m143060y() {
        zzdyz zzdyzVar = zzdyz.NONE;
        int iOrdinal = this.f117885o.ordinal();
        if (iOrdinal == 1) {
            this.f117872b.m179569c();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f117873c.m188681c();
        }
    }

    /* JADX INFO: renamed from: z */
    public final synchronized void m143061z(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            m143058w(jSONObject.optBoolean("isTestMode", false), false);
            m143057v((zzdyz) Enum.valueOf(zzdyz.class, jSONObject.optString("gesture", Constraint.NONE)), false);
            this.f117882l = jSONObject.optString("networkExtras", WeJson.EMPTY_MAP);
            this.f117884n = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }
}
