package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzeml;
import com.tencent.open.SocialConstants;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class f4v0 {

    /* JADX INFO: renamed from: a */
    public final dlt0 f97145a;

    /* JADX INFO: renamed from: b */
    public final Context f97146b;

    /* JADX INFO: renamed from: c */
    public final zzcei f97147c;

    /* JADX INFO: renamed from: d */
    public final o7w0 f97148d;

    /* JADX INFO: renamed from: e */
    public final Executor f97149e;

    /* JADX INFO: renamed from: f */
    public final String f97150f;

    /* JADX INFO: renamed from: g */
    public final cew0 f97151g;

    /* JADX INFO: renamed from: h */
    public final c8w0 f97152h;

    /* JADX INFO: renamed from: i */
    public final swu0 f97153i;

    public f4v0(dlt0 dlt0Var, Context context, zzcei zzceiVar, o7w0 o7w0Var, Executor executor, String str, cew0 cew0Var, swu0 swu0Var) {
        this.f97145a = dlt0Var;
        this.f97146b = context;
        this.f97147c = zzceiVar;
        this.f97148d = o7w0Var;
        this.f97149e = executor;
        this.f97150f = str;
        this.f97151g = cew0Var;
        this.f97152h = dlt0Var.mo116866A();
        this.f97153i = swu0Var;
    }

    /* JADX INFO: renamed from: e */
    public static final String m124042e(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public final hpr m124043a() {
        Boolean bool;
        String strM108384b = this.f97148d.f145318d.zzx;
        if (!TextUtils.isEmpty(strM108384b)) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168198X6)).booleanValue()) {
                String strM124042e = m124042e(strM108384b);
                dgs0 dgs0Var = sgs0.f168339i7;
                if (((Boolean) jas0.m144075c().m176505a(dgs0Var)).booleanValue() && strM124042e.isEmpty()) {
                    int iLastIndexOf = strM108384b.lastIndexOf("&request_id=");
                    strM124042e = iLastIndexOf != -1 ? strM108384b.substring(iLastIndexOf + 12) : "";
                }
                if (TextUtils.isEmpty(strM124042e)) {
                    return pvw0.m173980g(new zzeml(15, "Invalid ad string."));
                }
                String strM12412b = this.f97145a.mo116885s().m12412b(strM124042e, this.f97153i);
                if (((Boolean) jas0.m144075c().m176505a(dgs0Var)).booleanValue()) {
                    swu0 swu0Var = this.f97153i;
                    if (!TextUtils.isEmpty(strM12412b)) {
                        try {
                            bool = new JSONObject(strM12412b).optString("is_gbid").equals("true") ? Boolean.TRUE : Boolean.FALSE;
                        } catch (JSONException unused) {
                        }
                        if (bool.booleanValue()) {
                            int iLastIndexOf2 = strM108384b.lastIndexOf("&");
                            String string = null;
                            String strSubstring = iLastIndexOf2 != -1 ? strM108384b.substring(0, iLastIndexOf2) : null;
                            if (!TextUtils.isEmpty(strSubstring)) {
                                try {
                                    byte[] bArrDecode = Base64.decode(strSubstring, 11);
                                    byte[] bytes = strM124042e.getBytes("UTF-8");
                                    try {
                                        string = new JSONObject(strM12412b).getString("arek");
                                    } catch (JSONException e) {
                                        d2v0.m113737k("Failed to get key from QueryJSONMap".concat(e.toString()));
                                        bxy0.m106933q().m120275w(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                    }
                                    strM108384b = c8w0.m108384b(bArrDecode, bytes, string, swu0Var);
                                } catch (UnsupportedEncodingException e2) {
                                    d2v0.m113737k("Failed to decode the adResponse. ".concat(e2.toString()));
                                    bxy0.m106933q().m120275w(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                }
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strM12412b)) {
                    return m124045c(strM108384b, m124046d(strM12412b));
                }
            }
        }
        zzc zzcVar = this.f97148d.f145318d.zzs;
        if (zzcVar != null) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168174V6)).booleanValue()) {
                String str = zzcVar.zza;
                String str2 = zzcVar.zzb;
                String strM124042e2 = m124042e(str);
                String strM124042e3 = m124042e(str2);
                if (TextUtils.isEmpty(strM124042e3) || !strM124042e2.equals(strM124042e3)) {
                    this.f97153i.m188363a().put("ridmm", "true");
                } else {
                    this.f97145a.mo116885s().m12415f(strM124042e2);
                    this.f97153i.m188363a().put("rid", strM124042e2);
                }
            }
            return m124045c(zzcVar.zza, m124046d(zzcVar.zzb));
        }
        return pvw0.m173980g(new zzeml(14, "Mismatch request IDs."));
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hpr m124044b(JSONObject jSONObject) throws Exception {
        return pvw0.m173981h(new b7w0(new y6w0(this.f97148d), a7w0.m96387a(new StringReader(jSONObject.toString()))));
    }

    /* JADX INFO: renamed from: c */
    public final hpr m124045c(final String str, final String str2) {
        rdw0 rdw0VarM176209a = qdw0.m176209a(this.f97146b, 11);
        rdw0VarM176209a.zzh();
        ovs0 ovs0VarM127699a = bxy0.m106924h().m127699a(this.f97146b, this.f97147c, this.f97145a.mo116869D());
        ivs0 ivs0Var = lvs0.f133729b;
        final evs0 evs0VarM169486a = ovs0VarM127699a.m169486a("google.afma.response.normalize", ivs0Var, ivs0Var);
        hpr hprVarM173987n = pvw0.m173987n(pvw0.m173987n(pvw0.m173987n(pvw0.m173981h(""), new xuw0() { // from class: l.c4v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str3 = str;
                String str4 = str2;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put(SocialConstants.TYPE_REQUEST, jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return pvw0.m173981h(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.f97149e), new xuw0() { // from class: l.d4v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return evs0VarM169486a.zzb((JSONObject) obj);
            }
        }, this.f97149e), new xuw0() { // from class: l.e4v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f92161a.m124044b((JSONObject) obj);
            }
        }, this.f97149e);
        bew0.m103785a(hprVarM173987n, this.f97151g, rdw0VarM176209a);
        return hprVarM173987n;
    }

    /* JADX INFO: renamed from: d */
    public final String m124046d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f97150f));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            dct0.m115298g("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }
}
