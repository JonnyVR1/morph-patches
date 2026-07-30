package p149l;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class qfu0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f154290a;

    /* JADX INFO: renamed from: b */
    public final jgu0 f154291b;

    /* JADX INFO: renamed from: c */
    public final ogu0 f154292c;

    public qfu0(rmw0 rmw0Var, jgu0 jgu0Var, ogu0 ogu0Var) {
        this.f154290a = rmw0Var;
        this.f154291b = jgu0Var;
        this.f154292c = ogu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final gnr m174373a(final vxv0 vxv0Var, final kxv0 kxv0Var, final JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        gnr gnrVarM142241n;
        final gnr gnrVarMo122102R = this.f154290a.mo122102R(new Callable() { // from class: l.ofu0
            @Override // java.util.concurrent.Callable
            public final Object call() throws zzeml {
                ocu0 ocu0Var = new ocu0();
                JSONObject jSONObject2 = jSONObject;
                ocu0Var.m163566B(jSONObject2.optInt("template_id", -1));
                ocu0Var.m163603k(jSONObject2.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null;
                vxv0 vxv0Var2 = vxv0Var;
                ocu0Var.m163617v(strOptString);
                iyv0 iyv0Var = vxv0Var2.f183477a.f166831a;
                if (!iyv0Var.f115497g.contains(Integer.toString(ocu0Var.m163573P()))) {
                    throw new zzeml(1, "Invalid template ID: " + ocu0Var.m163573P());
                }
                if (ocu0Var.m163573P() == 3) {
                    if (ocu0Var.m163584a() == null) {
                        throw new zzeml(1, "No custom template id for custom template ad response.");
                    }
                    if (!iyv0Var.f115498h.contains(ocu0Var.m163584a())) {
                        throw new zzeml(1, "Unexpected custom template id in the response.");
                    }
                }
                kxv0 kxv0Var2 = kxv0Var;
                ocu0Var.m163620y(jSONObject2.optDouble("rating", -1.0d));
                String strOptString2 = jSONObject2.optString("headline", null);
                if (kxv0Var2.f125170N) {
                    vny0.m199080r();
                    strOptString2 = C2075b.m12305Z() + " : " + strOptString2;
                }
                ocu0Var.m163621z("headline", strOptString2);
                ocu0Var.m163621z("body", jSONObject2.optString("body", null));
                ocu0Var.m163621z("call_to_action", jSONObject2.optString("call_to_action", null));
                ocu0Var.m163621z(PlaceTypes.STORE, jSONObject2.optString(PlaceTypes.STORE, null));
                ocu0Var.m163621z(FirebaseAnalytics.Param.PRICE, jSONObject2.optString(FirebaseAnalytics.Param.PRICE, null));
                ocu0Var.m163621z("advertiser", jSONObject2.optString("advertiser", null));
                return ocu0Var;
            }
        });
        final gnr gnrVarM141343f = this.f154291b.m141343f(jSONObject, "images");
        nxv0 nxv0Var = vxv0Var.f183478b.f178773b;
        jgu0 jgu0Var = this.f154291b;
        final gnr gnrVarM141344g = jgu0Var.m141344g(jSONObject, "images", kxv0Var, nxv0Var);
        final gnr gnrVarM141342e = jgu0Var.m141342e(jSONObject, "secondary_image");
        final gnr gnrVarM141342e2 = jgu0Var.m141342e(jSONObject, "app_icon");
        final gnr gnrVarM141341d = jgu0Var.m141341d(jSONObject, "attribution");
        final gnr gnrVarM141345h = this.f154291b.m141345h(jSONObject, kxv0Var, vxv0Var.f183478b.f178773b);
        final gnr gnrVarM164279a = this.f154292c.m164279a(jSONObject, "custom_assets");
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            if (TextUtils.isEmpty(strOptString)) {
                gnrVarM142241n = jmw0.m142235h(null);
            } else {
                final jgu0 jgu0Var2 = this.f154291b;
                gnrVarM142241n = jmw0.m142241n(jmw0.m142235h(null), new rlw0() { // from class: l.sfu0
                    @Override // p149l.rlw0
                    public final gnr zza(Object obj) {
                        return jgu0Var2.m141340c(strOptString, obj);
                    }
                }, i3t0.f111376e);
            }
        } else {
            gnrVarM142241n = jmw0.m142235h(null);
        }
        final gnr gnrVar = gnrVarM142241n;
        ArrayList arrayList = new ArrayList();
        arrayList.add(gnrVarMo122102R);
        arrayList.add(gnrVarM141343f);
        arrayList.add(gnrVarM141344g);
        arrayList.add(gnrVarM141342e);
        arrayList.add(gnrVarM141342e2);
        arrayList.add(gnrVarM141341d);
        arrayList.add(gnrVarM141345h);
        arrayList.add(gnrVarM164279a);
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132162a5)).booleanValue()) {
            arrayList.add(gnrVar);
        }
        return jmw0.m142228a(arrayList).m137091a(new Callable() { // from class: l.pfu0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ocu0 ocu0Var = (ocu0) gnrVarMo122102R.get();
                ocu0Var.m163611p((List) gnrVarM141343f.get());
                ocu0Var.m163607m((ubs0) gnrVarM141342e2.get());
                ocu0Var.m163612q((ubs0) gnrVarM141342e.get());
                ocu0Var.m163601j((nbs0) gnrVarM141341d.get());
                JSONObject jSONObject2 = jSONObject;
                ocu0Var.m163614s(jgu0.m141333j(jSONObject2));
                ocu0Var.m163605l(jgu0.m141332i(jSONObject2));
                q9t0 q9t0Var = (q9t0) gnrVarM141345h.get();
                if (q9t0Var != null) {
                    ocu0Var.m163569E(q9t0Var);
                    ocu0Var.m163568D(q9t0Var.zzF());
                    ocu0Var.m163567C(q9t0Var.mo13675a());
                }
                q9t0 q9t0Var2 = (q9t0) gnrVarM141344g.get();
                if (q9t0Var2 != null) {
                    ocu0Var.m163610o(q9t0Var2);
                    ocu0Var.m163570F(q9t0Var2.zzF());
                }
                gnr gnrVar2 = gnrVar;
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132162a5)).booleanValue()) {
                    ocu0Var.m163616u(gnrVar2);
                    ocu0Var.m163619x(new n3t0());
                } else {
                    q9t0 q9t0Var3 = (q9t0) gnrVar2.get();
                    if (q9t0Var3 != null) {
                        ocu0Var.m163615t(q9t0Var3);
                    }
                }
                for (ngu0 ngu0Var : (List) gnrVarM164279a.get()) {
                    int i = ngu0Var.f138907a;
                    String str = ngu0Var.f138908b;
                    if (i != 1) {
                        ocu0Var.m163609n(str, ngu0Var.f138910d);
                    } else {
                        ocu0Var.m163621z(str, ngu0Var.f138909c);
                    }
                }
                return ocu0Var;
            }
        }, this.f154290a);
    }
}
