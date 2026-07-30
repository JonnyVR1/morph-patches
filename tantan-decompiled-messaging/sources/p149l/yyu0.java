package p149l;

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
public final class yyu0 extends qus0 {

    /* JADX INFO: renamed from: a */
    public final Context f200820a;

    /* JADX INFO: renamed from: b */
    public final pnv0 f200821b;

    /* JADX INFO: renamed from: c */
    public final nnv0 f200822c;

    /* JADX INFO: renamed from: d */
    public final lzu0 f200823d;

    /* JADX INFO: renamed from: e */
    public final rmw0 f200824e;

    /* JADX INFO: renamed from: f */
    public final izu0 f200825f;

    /* JADX INFO: renamed from: g */
    public final vvs0 f200826g;

    public yyu0(Context context, pnv0 pnv0Var, nnv0 nnv0Var, izu0 izu0Var, lzu0 lzu0Var, rmw0 rmw0Var, vvs0 vvs0Var) {
        this.f200820a = context;
        this.f200821b = pnv0Var;
        this.f200822c = nnv0Var;
        this.f200825f = izu0Var;
        this.f200823d = lzu0Var;
        this.f200824e = rmw0Var;
        this.f200826g = vvs0Var;
    }

    @Override // p149l.rus0
    /* JADX INFO: renamed from: k2 */
    public final void mo171478k2(zzbym zzbymVar, uus0 uus0Var) {
        m216569p8(m216568o8(zzbymVar, Binder.getCallingUid()), uus0Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a4  */
    /* JADX INFO: renamed from: o8 */
    public final gnr m216568o8(zzbym zzbymVar, int i) {
        gnr gnrVarM142235h;
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
        final azu0 azu0Var = new azu0(zzbymVar.zza, zzbymVar.zzb, map, zzbymVar.zzd, "", zzbymVar.zze);
        nnv0 nnv0Var = this.f200822c;
        nnv0Var.mo160370a(new eqv0(zzbymVar));
        boolean z = azu0Var.f72386f;
        onv0 onv0VarZzb = nnv0Var.zzb();
        if (z) {
            String str2 = zzbymVar.zza;
            String str3 = (String) ias0.f112320b.m115379e();
            if (TextUtils.isEmpty(str3)) {
                gnrVarM142235h = jmw0.m142235h(azu0Var);
            } else {
                String host = Uri.parse(str2).getHost();
                if (TextUtils.isEmpty(host)) {
                    gnrVarM142235h = jmw0.m142235h(azu0Var);
                } else {
                    Iterator it = xfw0.m208616c(vew0.m198261b(';')).m208618d(str3).iterator();
                    while (it.hasNext()) {
                        if (host.endsWith((String) it.next())) {
                            gnrVarM142235h = jmw0.m142240m(onv0VarZzb.mo165229a().m189627a(new JSONObject()), new yew0() { // from class: l.qyu0
                                @Override // p149l.yew0
                                public final Object apply(Object obj) {
                                    azu0 azu0Var2 = azu0Var;
                                    lzu0.m152364a(azu0Var2.f72383c, (JSONObject) obj);
                                    return azu0Var2;
                                }
                            }, this.f200824e);
                        }
                    }
                    gnrVarM142235h = jmw0.m142235h(azu0Var);
                }
            }
        } else {
            gnrVarM142235h = jmw0.m142235h(azu0Var);
        }
        f3w0 f3w0VarMo165230b = onv0VarZzb.mo165230b();
        return jmw0.m142241n(f3w0VarMo165230b.m212753b(zzflg.HTTP, gnrVarM142235h).m206877e(new hzu0(this.f200820a, "", this.f200826g, i)).m206873a(), new rlw0() { // from class: l.ryu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) throws JSONException {
                bzu0 bzu0Var = (bzu0) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", bzu0Var.f78062a);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str4 : bzu0Var.f78063b.keySet()) {
                        if (str4 != null) {
                            List<String> list = (List) bzu0Var.f78063b.get(str4);
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
                    Object obj2 = bzu0Var.f78064c;
                    if (obj2 != null) {
                        jSONObject.put("body", obj2);
                    }
                    jSONObject.put("latency", bzu0Var.f78065d);
                    return jmw0.m142235h(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e) {
                    x2t0.m206869g("Error converting response to JSONObject: ".concat(String.valueOf(e.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.f200824e);
    }

    @Override // p149l.rus0
    /* JADX INFO: renamed from: p5 */
    public final void mo171479p5(zzbyi zzbyiVar, uus0 uus0Var) {
        zmv0 zmv0Var = new zmv0(zzbyiVar, Binder.getCallingUid());
        pnv0 pnv0Var = this.f200821b;
        pnv0Var.mo170467a(zmv0Var);
        final qnv0 qnv0VarZzb = pnv0Var.zzb();
        f3w0 f3w0VarMo175703b = qnv0VarZzb.mo175703b();
        g2w0 g2w0VarM206873a = f3w0VarMo175703b.m212753b(zzflg.GMS_SIGNALS, jmw0.m142236i()).m206878f(new rlw0() { // from class: l.uyu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return qnv0VarZzb.mo175702a().m189627a(new JSONObject());
            }
        }).m206877e(new e2w0() { // from class: l.tyu0
            @Override // p149l.e2w0
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                xsu0.m210834k("GMS AdRequest Signals: ");
                xsu0.m210834k(jSONObject.toString(2));
                return jSONObject;
            }
        }).m206878f(new rlw0() { // from class: l.syu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return jmw0.m142235h(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).m206873a();
        m216569p8(g2w0VarM206873a, uus0Var);
        if (((Boolean) bas0.f74719d.m115379e()).booleanValue()) {
            final lzu0 lzu0Var = this.f200823d;
            Objects.requireNonNull(lzu0Var);
            g2w0VarM206873a.addListener(new Runnable() { // from class: l.wyu0
                @Override // java.lang.Runnable
                public final void run() {
                    lzu0Var.m152365b();
                }
            }, this.f200824e);
        }
    }

    /* JADX INFO: renamed from: p8 */
    public final void m216569p8(gnr gnrVar, uus0 uus0Var) {
        jmw0.m142245r(jmw0.m142241n(amw0.m97696C(gnrVar), new rlw0() { // from class: l.vyu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return jmw0.m142235h(ozv0.m166891a((InputStream) obj));
            }
        }, i3t0.f111372a), new xyu0(this, uus0Var), i3t0.f111377f);
    }
}
