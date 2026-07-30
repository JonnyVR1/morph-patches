package p153l;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class wou0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f190194a;

    /* JADX INFO: renamed from: b */
    public final ppu0 f190195b;

    /* JADX INFO: renamed from: c */
    public final upu0 f190196c;

    public wou0(xvw0 xvw0Var, ppu0 ppu0Var, upu0 upu0Var) {
        this.f190194a = xvw0Var;
        this.f190195b = ppu0Var;
        this.f190196c = upu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final hpr m207360a(final b7w0 b7w0Var, final q6w0 q6w0Var, final JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        hpr hprVarM173987n;
        final hpr hprVarMo155969R = this.f190194a.mo155969R(new Callable() { // from class: l.uou0
            @Override // java.util.concurrent.Callable
            public final Object call() throws zzeml {
                ulu0 ulu0Var = new ulu0();
                JSONObject jSONObject2 = jSONObject;
                ulu0Var.m196573B(jSONObject2.optInt("template_id", -1));
                ulu0Var.m196610k(jSONObject2.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null;
                b7w0 b7w0Var2 = b7w0Var;
                ulu0Var.m196624v(strOptString);
                o7w0 o7w0Var = b7w0Var2.f75342a.f197721a;
                if (!o7w0Var.f145321g.contains(Integer.toString(ulu0Var.m196580P()))) {
                    throw new zzeml(1, "Invalid template ID: " + ulu0Var.m196580P());
                }
                if (ulu0Var.m196580P() == 3) {
                    if (ulu0Var.m196591a() == null) {
                        throw new zzeml(1, "No custom template id for custom template ad response.");
                    }
                    if (!o7w0Var.f145322h.contains(ulu0Var.m196591a())) {
                        throw new zzeml(1, "Unexpected custom template id in the response.");
                    }
                }
                q6w0 q6w0Var2 = q6w0Var;
                ulu0Var.m196627y(jSONObject2.optDouble("rating", -1.0d));
                String strOptString2 = jSONObject2.optString("headline", null);
                if (q6w0Var2.f155860N) {
                    bxy0.m106934r();
                    strOptString2 = C2098b.m12359Z() + " : " + strOptString2;
                }
                ulu0Var.m196628z("headline", strOptString2);
                ulu0Var.m196628z("body", jSONObject2.optString("body", null));
                ulu0Var.m196628z("call_to_action", jSONObject2.optString("call_to_action", null));
                ulu0Var.m196628z(PlaceTypes.STORE, jSONObject2.optString(PlaceTypes.STORE, null));
                ulu0Var.m196628z(FirebaseAnalytics.Param.PRICE, jSONObject2.optString(FirebaseAnalytics.Param.PRICE, null));
                ulu0Var.m196628z("advertiser", jSONObject2.optString("advertiser", null));
                return ulu0Var;
            }
        });
        final hpr hprVarM173263f = this.f190195b.m173263f(jSONObject, "images");
        t6w0 t6w0Var = b7w0Var.f75343b.f68854b;
        ppu0 ppu0Var = this.f190195b;
        final hpr hprVarM173264g = ppu0Var.m173264g(jSONObject, "images", q6w0Var, t6w0Var);
        final hpr hprVarM173262e = ppu0Var.m173262e(jSONObject, "secondary_image");
        final hpr hprVarM173262e2 = ppu0Var.m173262e(jSONObject, "app_icon");
        final hpr hprVarM173261d = ppu0Var.m173261d(jSONObject, "attribution");
        final hpr hprVarM173265h = this.f190195b.m173265h(jSONObject, q6w0Var, b7w0Var.f75343b.f68854b);
        final hpr hprVarM197190a = this.f190196c.m197190a(jSONObject, "custom_assets");
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            if (TextUtils.isEmpty(strOptString)) {
                hprVarM173987n = pvw0.m173981h(null);
            } else {
                final ppu0 ppu0Var2 = this.f190195b;
                hprVarM173987n = pvw0.m173987n(pvw0.m173981h(null), new xuw0() { // from class: l.you0
                    @Override // p153l.xuw0
                    public final hpr zza(Object obj) {
                        return ppu0Var2.m173260c(strOptString, obj);
                    }
                }, oct0.f146737e);
            }
        } else {
            hprVarM173987n = pvw0.m173981h(null);
        }
        final hpr hprVar = hprVarM173987n;
        ArrayList arrayList = new ArrayList();
        arrayList.add(hprVarMo155969R);
        arrayList.add(hprVarM173263f);
        arrayList.add(hprVarM173264g);
        arrayList.add(hprVarM173262e);
        arrayList.add(hprVarM173262e2);
        arrayList.add(hprVarM173261d);
        arrayList.add(hprVarM173265h);
        arrayList.add(hprVarM197190a);
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168233a5)).booleanValue()) {
            arrayList.add(hprVar);
        }
        return pvw0.m173974a(arrayList).m169489a(new Callable() { // from class: l.vou0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ulu0 ulu0Var = (ulu0) hprVarMo155969R.get();
                ulu0Var.m196618p((List) hprVarM173263f.get());
                ulu0Var.m196614m((als0) hprVarM173262e2.get());
                ulu0Var.m196619q((als0) hprVarM173262e.get());
                ulu0Var.m196608j((tks0) hprVarM173261d.get());
                JSONObject jSONObject2 = jSONObject;
                ulu0Var.m196621s(ppu0.m173253j(jSONObject2));
                ulu0Var.m196612l(ppu0.m173252i(jSONObject2));
                wit0 wit0Var = (wit0) hprVarM173265h.get();
                if (wit0Var != null) {
                    ulu0Var.m196576E(wit0Var);
                    ulu0Var.m196575D(wit0Var.zzF());
                    ulu0Var.m196574C(wit0Var.mo13729a());
                }
                wit0 wit0Var2 = (wit0) hprVarM173264g.get();
                if (wit0Var2 != null) {
                    ulu0Var.m196617o(wit0Var2);
                    ulu0Var.m196577F(wit0Var2.zzF());
                }
                hpr hprVar2 = hprVar;
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168233a5)).booleanValue()) {
                    ulu0Var.m196623u(hprVar2);
                    ulu0Var.m196626x(new tct0());
                } else {
                    wit0 wit0Var3 = (wit0) hprVar2.get();
                    if (wit0Var3 != null) {
                        ulu0Var.m196622t(wit0Var3);
                    }
                }
                for (tpu0 tpu0Var : (List) hprVarM197190a.get()) {
                    int i = tpu0Var.f175649a;
                    String str = tpu0Var.f175650b;
                    if (i != 1) {
                        ulu0Var.m196616n(str, tpu0Var.f175652d);
                    } else {
                        ulu0Var.m196628z(str, tpu0Var.f175651c);
                    }
                }
                return ulu0Var;
            }
        }, this.f190194a);
    }
}
