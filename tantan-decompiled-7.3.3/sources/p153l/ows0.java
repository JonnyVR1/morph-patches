package p153l;

import com.google.android.gms.internal.ads.zzcag;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ows0 {

    /* JADX INFO: renamed from: a */
    public final List f149561a;

    /* JADX INFO: renamed from: b */
    public final List f149562b;

    /* JADX INFO: renamed from: c */
    public final List f149563c;

    /* JADX INFO: renamed from: d */
    public final List f149564d;

    /* JADX INFO: renamed from: e */
    public final List f149565e;

    /* JADX INFO: renamed from: f */
    public final List f149566f;

    /* JADX INFO: renamed from: g */
    public final String f149567g;

    /* JADX INFO: renamed from: h */
    public final String f149568h;

    public ows0(JSONObject jSONObject) throws JSONException {
        if (dct0.m115301j(2)) {
            d2v0.m113737k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                nws0 nws0Var = new nws0(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(nws0Var.f144030v);
                arrayList.add(nws0Var);
                if (i < 0) {
                    Iterator it = nws0Var.f144011c.iterator();
                    while (it.hasNext()) {
                        if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                            i = i2;
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f149561a = Collections.unmodifiableList(arrayList);
        this.f149567g = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Settings.TYPE);
        if (jSONObjectOptJSONObject == null) {
            this.f149562b = null;
            this.f149563c = null;
            this.f149564d = null;
            this.f149565e = null;
            this.f149566f = null;
            this.f149568h = null;
            return;
        }
        jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
        bxy0.m106925i();
        this.f149562b = pws0.m174090a(jSONObjectOptJSONObject, "click_urls");
        bxy0.m106925i();
        this.f149563c = pws0.m174090a(jSONObjectOptJSONObject, "imp_urls");
        bxy0.m106925i();
        this.f149564d = pws0.m174090a(jSONObjectOptJSONObject, "downloaded_imp_urls");
        bxy0.m106925i();
        this.f149565e = pws0.m174090a(jSONObjectOptJSONObject, "nofill_urls");
        bxy0.m106925i();
        this.f149566f = pws0.m174090a(jSONObjectOptJSONObject, "remote_ping_urls");
        jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
        jSONObjectOptJSONObject.optLong(BLiveOperationActionAfterCountdown.refresh, -1L);
        zzcag zzcagVarM13610g = zzcag.m13610g(jSONObjectOptJSONObject.optJSONArray("rewards"));
        if (zzcagVarM13610g == null) {
            this.f149568h = null;
        } else {
            this.f149568h = zzcagVarM13610g.zza;
        }
        jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
        jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
        jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
    }
}
