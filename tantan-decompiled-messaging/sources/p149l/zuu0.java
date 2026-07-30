package p149l;

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
public final class zuu0 {

    /* JADX INFO: renamed from: a */
    public final xbt0 f204892a;

    /* JADX INFO: renamed from: b */
    public final Context f204893b;

    /* JADX INFO: renamed from: c */
    public final zzcei f204894c;

    /* JADX INFO: renamed from: d */
    public final iyv0 f204895d;

    /* JADX INFO: renamed from: e */
    public final Executor f204896e;

    /* JADX INFO: renamed from: f */
    public final String f204897f;

    /* JADX INFO: renamed from: g */
    public final w4w0 f204898g;

    /* JADX INFO: renamed from: h */
    public final wyv0 f204899h;

    /* JADX INFO: renamed from: i */
    public final mnu0 f204900i;

    public zuu0(xbt0 xbt0Var, Context context, zzcei zzceiVar, iyv0 iyv0Var, Executor executor, String str, w4w0 w4w0Var, mnu0 mnu0Var) {
        this.f204892a = xbt0Var;
        this.f204893b = context;
        this.f204894c = zzceiVar;
        this.f204895d = iyv0Var;
        this.f204896e = executor;
        this.f204897f = str;
        this.f204898g = w4w0Var;
        this.f204899h = xbt0Var.mo135789A();
        this.f204900i = mnu0Var;
    }

    /* JADX INFO: renamed from: e */
    public static final String m220258e(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public final gnr m220259a() {
        Boolean bool;
        String strM206230b = this.f204895d.f115494d.zzx;
        if (!TextUtils.isEmpty(strM206230b)) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132127X6)).booleanValue()) {
                String strM220258e = m220258e(strM206230b);
                x6s0 x6s0Var = m7s0.f132268i7;
                if (((Boolean) d1s0.m109677c().m144697a(x6s0Var)).booleanValue() && strM220258e.isEmpty()) {
                    int iLastIndexOf = strM206230b.lastIndexOf("&request_id=");
                    strM220258e = iLastIndexOf != -1 ? strM206230b.substring(iLastIndexOf + 12) : "";
                }
                if (TextUtils.isEmpty(strM220258e)) {
                    return jmw0.m142234g(new zzeml(15, "Invalid ad string."));
                }
                String strM12358b = this.f204892a.mo135808s().m12358b(strM220258e, this.f204900i);
                if (((Boolean) d1s0.m109677c().m144697a(x6s0Var)).booleanValue()) {
                    mnu0 mnu0Var = this.f204900i;
                    if (!TextUtils.isEmpty(strM12358b)) {
                        try {
                            bool = new JSONObject(strM12358b).optString("is_gbid").equals("true") ? Boolean.TRUE : Boolean.FALSE;
                        } catch (JSONException unused) {
                        }
                        if (bool.booleanValue()) {
                            int iLastIndexOf2 = strM206230b.lastIndexOf("&");
                            String string = null;
                            String strSubstring = iLastIndexOf2 != -1 ? strM206230b.substring(0, iLastIndexOf2) : null;
                            if (!TextUtils.isEmpty(strSubstring)) {
                                try {
                                    byte[] bArrDecode = Base64.decode(strSubstring, 11);
                                    byte[] bytes = strM220258e.getBytes("UTF-8");
                                    try {
                                        string = new JSONObject(strM12358b).getString("arek");
                                    } catch (JSONException e) {
                                        xsu0.m210834k("Failed to get key from QueryJSONMap".concat(e.toString()));
                                        vny0.m199079q().m212290w(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                    }
                                    strM206230b = wyv0.m206230b(bArrDecode, bytes, string, mnu0Var);
                                } catch (UnsupportedEncodingException e2) {
                                    xsu0.m210834k("Failed to decode the adResponse. ".concat(e2.toString()));
                                    vny0.m199079q().m212290w(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                }
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strM12358b)) {
                    return m220261c(strM206230b, m220262d(strM12358b));
                }
            }
        }
        zzc zzcVar = this.f204895d.f115494d.zzs;
        if (zzcVar != null) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132103V6)).booleanValue()) {
                String str = zzcVar.zza;
                String str2 = zzcVar.zzb;
                String strM220258e2 = m220258e(str);
                String strM220258e3 = m220258e(str2);
                if (TextUtils.isEmpty(strM220258e3) || !strM220258e2.equals(strM220258e3)) {
                    this.f204900i.m155566a().put("ridmm", "true");
                } else {
                    this.f204892a.mo135808s().m12361f(strM220258e2);
                    this.f204900i.m155566a().put("rid", strM220258e2);
                }
            }
            return m220261c(zzcVar.zza, m220262d(zzcVar.zzb));
        }
        return jmw0.m142234g(new zzeml(14, "Mismatch request IDs."));
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gnr m220260b(JSONObject jSONObject) throws Exception {
        return jmw0.m142235h(new vxv0(new sxv0(this.f204895d), uxv0.m196212a(new StringReader(jSONObject.toString()))));
    }

    /* JADX INFO: renamed from: c */
    public final gnr m220261c(final String str, final String str2) {
        l4w0 l4w0VarM144514a = k4w0.m144514a(this.f204893b, 11);
        l4w0VarM144514a.zzh();
        ims0 ims0VarM219291a = vny0.m199070h().m219291a(this.f204893b, this.f204894c, this.f204892a.mo135792D());
        cms0 cms0Var = fms0.f98370b;
        final yls0 yls0VarM137088a = ims0VarM219291a.m137088a("google.afma.response.normalize", cms0Var, cms0Var);
        gnr gnrVarM142241n = jmw0.m142241n(jmw0.m142241n(jmw0.m142241n(jmw0.m142235h(""), new rlw0() { // from class: l.wuu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) throws JSONException {
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
                    return jmw0.m142235h(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.f204896e), new rlw0() { // from class: l.xuu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return yls0VarM137088a.zzb((JSONObject) obj);
            }
        }, this.f204896e), new rlw0() { // from class: l.yuu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f200134a.m220260b((JSONObject) obj);
            }
        }, this.f204896e);
        v4w0.m197065a(gnrVarM142241n, this.f204898g, l4w0VarM144514a);
        return gnrVarM142241n;
    }

    /* JADX INFO: renamed from: d */
    public final String m220262d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f204897f));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            x2t0.m206869g("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }
}
