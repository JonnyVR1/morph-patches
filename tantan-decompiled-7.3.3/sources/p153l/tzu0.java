package p153l;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzdyq;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class tzu0 implements s6u0, x9u0, o8u0 {

    /* JADX INFO: renamed from: a */
    public final j0v0 f176810a;

    /* JADX INFO: renamed from: b */
    public final String f176811b;

    /* JADX INFO: renamed from: c */
    public final String f176812c;

    /* JADX INFO: renamed from: f */
    public b6u0 f176815f;

    /* JADX INFO: renamed from: g */
    public zze f176816g;

    /* JADX INFO: renamed from: k */
    public JSONObject f176820k;

    /* JADX INFO: renamed from: l */
    public boolean f176821l;

    /* JADX INFO: renamed from: m */
    public boolean f176822m;

    /* JADX INFO: renamed from: n */
    public boolean f176823n;

    /* JADX INFO: renamed from: h */
    public String f176817h = "";

    /* JADX INFO: renamed from: i */
    public String f176818i = "";

    /* JADX INFO: renamed from: j */
    public String f176819j = "";

    /* JADX INFO: renamed from: d */
    public int f176813d = 0;

    /* JADX INFO: renamed from: e */
    public zzdyq f176814e = zzdyq.AD_REQUESTED;

    public tzu0(j0v0 j0v0Var, o7w0 o7w0Var, String str) {
        this.f176810a = j0v0Var;
        this.f176812c = str;
        this.f176811b = o7w0Var.f145320f;
    }

    /* JADX INFO: renamed from: f */
    public static JSONObject m193736f(zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : m193736f(zzeVar2));
        return jSONObject;
    }

    @Override // p153l.x9u0
    /* JADX INFO: renamed from: A */
    public final void mo107082A(b7w0 b7w0Var) {
        if (this.f176810a.m143051p()) {
            if (!b7w0Var.f75343b.f68853a.isEmpty()) {
                this.f176813d = ((q6w0) b7w0Var.f75343b.f68853a.get(0)).f155875b;
            }
            if (!TextUtils.isEmpty(b7w0Var.f75343b.f68854b.f172377k)) {
                this.f176817h = b7w0Var.f75343b.f68854b.f172377k;
            }
            if (!TextUtils.isEmpty(b7w0Var.f75343b.f68854b.f172378l)) {
                this.f176818i = b7w0Var.f75343b.f68854b.f172378l;
            }
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168328h9)).booleanValue()) {
                if (!this.f176810a.m143053r()) {
                    this.f176823n = true;
                    return;
                }
                if (!TextUtils.isEmpty(b7w0Var.f75343b.f68854b.f172379m)) {
                    this.f176819j = b7w0Var.f75343b.f68854b.f172379m;
                }
                if (b7w0Var.f75343b.f68854b.f172380n.length() > 0) {
                    this.f176820k = b7w0Var.f75343b.f68854b.f172380n;
                }
                j0v0 j0v0Var = this.f176810a;
                JSONObject jSONObject = this.f176820k;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f176819j)) {
                    length += this.f176819j.length();
                }
                j0v0Var.m143045j(length);
            }
        }
    }

    @Override // p153l.o8u0
    /* JADX INFO: renamed from: R */
    public final void mo157517R(kzt0 kzt0Var) {
        if (this.f176810a.m143051p()) {
            this.f176815f = kzt0Var.m152228d();
            this.f176814e = zzdyq.AD_LOADED;
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168380l9)).booleanValue()) {
                this.f176810a.m143041f(this.f176811b, this);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m193737a() {
        return this.f176812c;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m193738b() throws JSONException {
        JSONObject jSONObjectM193742g;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f176814e);
        jSONObject.put("format", q6w0.m175619a(this.f176813d));
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168380l9)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f176821l);
            if (this.f176821l) {
                jSONObject.put("shown", this.f176822m);
            }
        }
        b6u0 b6u0Var = this.f176815f;
        if (b6u0Var != null) {
            jSONObjectM193742g = m193742g(b6u0Var);
        } else {
            zze zzeVar = this.f176816g;
            JSONObject jSONObjectM193742g2 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                b6u0 b6u0Var2 = (b6u0) iBinder;
                jSONObjectM193742g2 = m193742g(b6u0Var2);
                if (b6u0Var2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(m193736f(this.f176816g));
                    jSONObjectM193742g2.put("errors", jSONArray);
                }
            }
            jSONObjectM193742g = jSONObjectM193742g2;
        }
        jSONObject.put("responseInfo", jSONObjectM193742g);
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public final void m193739c() {
        this.f176821l = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m193740d() {
        this.f176822m = true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m193741e() {
        return this.f176814e != zzdyq.AD_REQUESTED;
    }

    /* JADX INFO: renamed from: g */
    public final JSONObject m193742g(b6u0 b6u0Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", b6u0Var.zzg());
        jSONObject.put("responseSecsSinceEpoch", b6u0Var.zzc());
        jSONObject.put("responseId", b6u0Var.zzi());
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168289e9)).booleanValue()) {
            String strZzd = b6u0Var.zzd();
            if (!TextUtils.isEmpty(strZzd)) {
                dct0.m115293b("Bidding data: ".concat(String.valueOf(strZzd)));
                jSONObject.put("biddingData", new JSONObject(strZzd));
            }
        }
        if (!TextUtils.isEmpty(this.f176817h)) {
            jSONObject.put("adRequestUrl", this.f176817h);
        }
        if (!TextUtils.isEmpty(this.f176818i)) {
            jSONObject.put("postBody", this.f176818i);
        }
        if (!TextUtils.isEmpty(this.f176819j)) {
            jSONObject.put("adResponseBody", this.f176819j);
        }
        Object obj = this.f176820k;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168328h9)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f176823n);
        }
        JSONArray jSONArray = new JSONArray();
        for (zzu zzuVar : b6u0Var.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzuVar.zza);
            jSONObject2.put("latencyMillis", zzuVar.zzb);
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168302f9)).booleanValue()) {
                jSONObject2.put("credentials", k6s0.m148569b().m167055j(zzuVar.zzd));
            }
            zze zzeVar = zzuVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : m193736f(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // p153l.s6u0
    /* JADX INFO: renamed from: u */
    public final void mo103145u(zze zzeVar) {
        if (this.f176810a.m143051p()) {
            this.f176814e = zzdyq.AD_LOAD_FAILED;
            this.f176816g = zzeVar;
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168380l9)).booleanValue()) {
                this.f176810a.m143041f(this.f176811b, this);
            }
        }
    }

    @Override // p153l.x9u0
    /* JADX INFO: renamed from: x */
    public final void mo107088x(zzbze zzbzeVar) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168380l9)).booleanValue() || !this.f176810a.m143051p()) {
            return;
        }
        this.f176810a.m143041f(this.f176811b, this);
    }
}
