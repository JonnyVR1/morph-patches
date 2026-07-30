package p153l;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzflg;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class e8v0 extends w3t0 {

    /* JADX INFO: renamed from: a */
    public final Context f92569a;

    /* JADX INFO: renamed from: b */
    public final vwv0 f92570b;

    /* JADX INFO: renamed from: c */
    public final twv0 f92571c;

    /* JADX INFO: renamed from: d */
    public final r8v0 f92572d;

    /* JADX INFO: renamed from: e */
    public final xvw0 f92573e;

    /* JADX INFO: renamed from: f */
    public final o8v0 f92574f;

    /* JADX INFO: renamed from: g */
    public final b5t0 f92575g;

    public e8v0(Context context, vwv0 vwv0Var, twv0 twv0Var, o8v0 o8v0Var, r8v0 r8v0Var, xvw0 xvw0Var, b5t0 b5t0Var) {
        this.f92569a = context;
        this.f92570b = vwv0Var;
        this.f92571c = twv0Var;
        this.f92574f = o8v0Var;
        this.f92572d = r8v0Var;
        this.f92573e = xvw0Var;
        this.f92575g = b5t0Var;
    }

    @Override // p153l.x3t0
    /* JADX INFO: renamed from: k2 */
    public final void mo119833k2(zzbym zzbymVar, a4t0 a4t0Var) {
        m119836p8(m119834o8(zzbymVar, Binder.getCallingUid()), a4t0Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a4  */
    /* JADX INFO: renamed from: o8 */
    public final hpr m119834o8(zzbym zzbymVar, int i) {
        hpr hprVarM173981h;
        HashMap map = new HashMap();
        Bundle bundle = zzbymVar.zzc;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    map.put(str, string);
                }
            }
        }
        final g8v0 g8v0Var = new g8v0(zzbymVar.zza, zzbymVar.zzb, map, zzbymVar.zzd, "", zzbymVar.zze);
        twv0 twv0Var = this.f92571c;
        twv0Var.mo193371a(new kzv0(zzbymVar));
        boolean z = g8v0Var.f102720f;
        uwv0 uwv0VarZzb = twv0Var.zzb();
        if (z) {
            String str2 = zzbymVar.zza;
            String str3 = (String) ojs0.f147711b.m149974e();
            if (TextUtils.isEmpty(str3)) {
                hprVarM173981h = pvw0.m173981h(g8v0Var);
            } else {
                String host = Uri.parse(str2).getHost();
                if (TextUtils.isEmpty(host)) {
                    hprVarM173981h = pvw0.m173981h(g8v0Var);
                } else {
                    Iterator it = dpw0.m117427c(bow0.m105711b(';')).m117429d(str3).iterator();
                    while (it.hasNext()) {
                        if (host.endsWith((String) it.next())) {
                            hprVarM173981h = pvw0.m173986m(uwv0VarZzb.mo198391a().m221730a(new JSONObject()), new eow0() { // from class: l.w7v0
                                @Override // p153l.eow0
                                public final Object apply(Object obj) {
                                    g8v0 g8v0Var2 = g8v0Var;
                                    r8v0.m180248a(g8v0Var2.f102717c, (JSONObject) obj);
                                    return g8v0Var2;
                                }
                            }, this.f92573e);
                        }
                    }
                    hprVarM173981h = pvw0.m173981h(g8v0Var);
                }
            }
        } else {
            hprVarM173981h = pvw0.m173981h(g8v0Var);
        }
        lcw0 lcw0VarMo198392b = uwv0VarZzb.mo198392b();
        return pvw0.m173987n(lcw0VarMo198392b.m120409b(zzflg.HTTP, hprVarM173981h).m115307e(new n8v0(this.f92569a, "", this.f92575g, i)).m115303a(), new xuw0() { // from class: l.x7v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) throws JSONException {
                h8v0 h8v0Var = (h8v0) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", h8v0Var.f108275a);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str4 : h8v0Var.f108276b.keySet()) {
                        if (str4 != null) {
                            List<String> list = (List) h8v0Var.f108276b.get(str4);
                            JSONArray jSONArray = new JSONArray();
                            for (String str5 : list) {
                                if (str5 != null) {
                                    jSONArray.put(str5);
                                }
                            }
                            jSONObject2.put(str4, jSONArray);
                        }
                    }
                    jSONObject.put("headers", jSONObject2);
                    Object obj2 = h8v0Var.f108277c;
                    if (obj2 != null) {
                        jSONObject.put("body", obj2);
                    }
                    jSONObject.put("latency", h8v0Var.f108278d);
                    return pvw0.m173981h(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e) {
                    dct0.m115298g("Error converting response to JSONObject: ".concat(String.valueOf(e.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.f92573e);
    }

    @Override // p153l.x3t0
    /* JADX INFO: renamed from: p5 */
    public final void mo119835p5(zzbyi zzbyiVar, a4t0 a4t0Var) {
        fwv0 fwv0Var = new fwv0(zzbyiVar, Binder.getCallingUid());
        vwv0 vwv0Var = this.f92570b;
        vwv0Var.mo105625a(fwv0Var);
        final wwv0 wwv0VarZzb = vwv0Var.zzb();
        lcw0 lcw0VarMo117073b = wwv0VarZzb.mo117073b();
        mbw0 mbw0VarM115303a = lcw0VarMo117073b.m120409b(zzflg.GMS_SIGNALS, pvw0.m173982i()).m115308f(new xuw0() { // from class: l.a8v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return wwv0VarZzb.mo117072a().m221730a(new JSONObject());
            }
        }).m115307e(new kbw0() { // from class: l.z7v0
            @Override // p153l.kbw0
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                d2v0.m113737k("GMS AdRequest Signals: ");
                d2v0.m113737k(jSONObject.toString(2));
                return jSONObject;
            }
        }).m115308f(new xuw0() { // from class: l.y7v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return pvw0.m173981h(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).m115303a();
        m119836p8(mbw0VarM115303a, a4t0Var);
        if (((Boolean) hjs0.f110320d.m149974e()).booleanValue()) {
            final r8v0 r8v0Var = this.f92572d;
            Objects.requireNonNull(r8v0Var);
            mbw0VarM115303a.addListener(new Runnable() { // from class: l.c8v0
                @Override // java.lang.Runnable
                public final void run() {
                    r8v0Var.m180249b();
                }
            }, this.f92573e);
        }
    }

    /* JADX INFO: renamed from: p8 */
    public final void m119836p8(hpr hprVar, a4t0 a4t0Var) {
        pvw0.m173991r(pvw0.m173987n(gvw0.m132580C(hprVar), new xuw0() { // from class: l.b8v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return pvw0.m173981h(u8w0.m195070a((InputStream) obj));
            }
        }, oct0.f146733a), new d8v0(this, a4t0Var), oct0.f146738f);
    }
}
