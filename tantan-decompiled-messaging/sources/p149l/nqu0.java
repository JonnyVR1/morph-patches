package p149l;

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
public final class nqu0 implements mxt0, r0u0, izt0 {

    /* JADX INFO: renamed from: a */
    public final dru0 f140101a;

    /* JADX INFO: renamed from: b */
    public final String f140102b;

    /* JADX INFO: renamed from: c */
    public final String f140103c;

    /* JADX INFO: renamed from: f */
    public vwt0 f140106f;

    /* JADX INFO: renamed from: g */
    public zze f140107g;

    /* JADX INFO: renamed from: k */
    public JSONObject f140111k;

    /* JADX INFO: renamed from: l */
    public boolean f140112l;

    /* JADX INFO: renamed from: m */
    public boolean f140113m;

    /* JADX INFO: renamed from: n */
    public boolean f140114n;

    /* JADX INFO: renamed from: h */
    public String f140108h = "";

    /* JADX INFO: renamed from: i */
    public String f140109i = "";

    /* JADX INFO: renamed from: j */
    public String f140110j = "";

    /* JADX INFO: renamed from: d */
    public int f140104d = 0;

    /* JADX INFO: renamed from: e */
    public zzdyq f140105e = zzdyq.AD_REQUESTED;

    public nqu0(dru0 dru0Var, iyv0 iyv0Var, String str) {
        this.f140101a = dru0Var;
        this.f140103c = str;
        this.f140102b = iyv0Var.f115496f;
    }

    /* JADX INFO: renamed from: f */
    public static JSONObject m160695f(zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : m160695f(zzeVar2));
        return jSONObject;
    }

    @Override // p149l.r0u0
    /* JADX INFO: renamed from: A */
    public final void mo97687A(vxv0 vxv0Var) {
        if (this.f140101a.m113354p()) {
            if (!vxv0Var.f183478b.f178772a.isEmpty()) {
                this.f140104d = ((kxv0) vxv0Var.f183478b.f178772a.get(0)).f125185b;
            }
            if (!TextUtils.isEmpty(vxv0Var.f183478b.f178773b.f141064k)) {
                this.f140108h = vxv0Var.f183478b.f178773b.f141064k;
            }
            if (!TextUtils.isEmpty(vxv0Var.f183478b.f178773b.f141065l)) {
                this.f140109i = vxv0Var.f183478b.f178773b.f141065l;
            }
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132257h9)).booleanValue()) {
                if (!this.f140101a.m113356r()) {
                    this.f140114n = true;
                    return;
                }
                if (!TextUtils.isEmpty(vxv0Var.f183478b.f178773b.f141066m)) {
                    this.f140110j = vxv0Var.f183478b.f178773b.f141066m;
                }
                if (vxv0Var.f183478b.f178773b.f141067n.length() > 0) {
                    this.f140111k = vxv0Var.f183478b.f178773b.f141067n;
                }
                dru0 dru0Var = this.f140101a;
                JSONObject jSONObject = this.f140111k;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f140110j)) {
                    length += this.f140110j.length();
                }
                dru0Var.m113348j(length);
            }
        }
    }

    @Override // p149l.izt0
    /* JADX INFO: renamed from: R */
    public final void mo128913R(eqt0 eqt0Var) {
        if (this.f140101a.m113354p()) {
            this.f140106f = eqt0Var.m117798d();
            this.f140105e = zzdyq.AD_LOADED;
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132309l9)).booleanValue()) {
                this.f140101a.m113344f(this.f140102b, this);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m160696a() {
        return this.f140103c;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m160697b() throws JSONException {
        JSONObject jSONObjectM160701g;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f140105e);
        jSONObject.put("format", kxv0.m147809a(this.f140104d));
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132309l9)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f140112l);
            if (this.f140112l) {
                jSONObject.put("shown", this.f140113m);
            }
        }
        vwt0 vwt0Var = this.f140106f;
        if (vwt0Var != null) {
            jSONObjectM160701g = m160701g(vwt0Var);
        } else {
            zze zzeVar = this.f140107g;
            JSONObject jSONObjectM160701g2 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                vwt0 vwt0Var2 = (vwt0) iBinder;
                jSONObjectM160701g2 = m160701g(vwt0Var2);
                if (vwt0Var2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(m160695f(this.f140107g));
                    jSONObjectM160701g2.put("errors", jSONArray);
                }
            }
            jSONObjectM160701g = jSONObjectM160701g2;
        }
        jSONObject.put("responseInfo", jSONObjectM160701g);
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public final void m160698c() {
        this.f140112l = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m160699d() {
        this.f140113m = true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m160700e() {
        return this.f140105e != zzdyq.AD_REQUESTED;
    }

    /* JADX INFO: renamed from: g */
    public final JSONObject m160701g(vwt0 vwt0Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", vwt0Var.zzg());
        jSONObject.put("responseSecsSinceEpoch", vwt0Var.zzc());
        jSONObject.put("responseId", vwt0Var.zzi());
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132218e9)).booleanValue()) {
            String strZzd = vwt0Var.zzd();
            if (!TextUtils.isEmpty(strZzd)) {
                x2t0.m206864b("Bidding data: ".concat(String.valueOf(strZzd)));
                jSONObject.put("biddingData", new JSONObject(strZzd));
            }
        }
        if (!TextUtils.isEmpty(this.f140108h)) {
            jSONObject.put("adRequestUrl", this.f140108h);
        }
        if (!TextUtils.isEmpty(this.f140109i)) {
            jSONObject.put("postBody", this.f140109i);
        }
        if (!TextUtils.isEmpty(this.f140110j)) {
            jSONObject.put("adResponseBody", this.f140110j);
        }
        Object obj = this.f140111k;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132257h9)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f140114n);
        }
        JSONArray jSONArray = new JSONArray();
        for (zzu zzuVar : vwt0Var.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzuVar.zza);
            jSONObject2.put("latencyMillis", zzuVar.zzb);
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132231f9)).booleanValue()) {
                jSONObject2.put("credentials", exr0.m118703b().m134102j(zzuVar.zzd));
            }
            zze zzeVar = zzuVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : m160695f(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // p149l.mxt0
    /* JADX INFO: renamed from: u */
    public final void mo97693u(zze zzeVar) {
        if (this.f140101a.m113354p()) {
            this.f140105e = zzdyq.AD_LOAD_FAILED;
            this.f140107g = zzeVar;
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132309l9)).booleanValue()) {
                this.f140101a.m113344f(this.f140102b, this);
            }
        }
    }

    @Override // p149l.r0u0
    /* JADX INFO: renamed from: x */
    public final void mo97694x(zzbze zzbzeVar) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132309l9)).booleanValue() || !this.f140101a.m113354p()) {
            return;
        }
        this.f140101a.m113344f(this.f140102b, this);
    }
}
