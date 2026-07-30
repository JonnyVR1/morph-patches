package p149l;

import com.google.android.gms.internal.ads.zzcag;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ins0 {

    /* JADX INFO: renamed from: a */
    public final List f114039a;

    /* JADX INFO: renamed from: b */
    public final List f114040b;

    /* JADX INFO: renamed from: c */
    public final List f114041c;

    /* JADX INFO: renamed from: d */
    public final List f114042d;

    /* JADX INFO: renamed from: e */
    public final List f114043e;

    /* JADX INFO: renamed from: f */
    public final List f114044f;

    /* JADX INFO: renamed from: g */
    public final String f114045g;

    /* JADX INFO: renamed from: h */
    public final String f114046h;

    public ins0(JSONObject jSONObject) throws JSONException {
        if (x2t0.m206872j(2)) {
            xsu0.m210834k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                hns0 hns0Var = new hns0(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(hns0Var.f108703v);
                arrayList.add(hns0Var);
                if (i < 0) {
                    Iterator it = hns0Var.f108684c.iterator();
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
        this.f114039a = Collections.unmodifiableList(arrayList);
        this.f114045g = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Settings.TYPE);
        if (jSONObjectOptJSONObject == null) {
            this.f114040b = null;
            this.f114041c = null;
            this.f114042d = null;
            this.f114043e = null;
            this.f114044f = null;
            this.f114046h = null;
            return;
        }
        jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
        vny0.m199071i();
        this.f114040b = jns0.m142389a(jSONObjectOptJSONObject, "click_urls");
        vny0.m199071i();
        this.f114041c = jns0.m142389a(jSONObjectOptJSONObject, "imp_urls");
        vny0.m199071i();
        this.f114042d = jns0.m142389a(jSONObjectOptJSONObject, "downloaded_imp_urls");
        vny0.m199071i();
        this.f114043e = jns0.m142389a(jSONObjectOptJSONObject, "nofill_urls");
        vny0.m199071i();
        this.f114044f = jns0.m142389a(jSONObjectOptJSONObject, "remote_ping_urls");
        jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
        jSONObjectOptJSONObject.optLong(BLiveOperationActionAfterCountdown.refresh, -1L);
        zzcag zzcagVarM13556g = zzcag.m13556g(jSONObjectOptJSONObject.optJSONArray("rewards"));
        if (zzcagVarM13556g == null) {
            this.f114046h = null;
        } else {
            this.f114046h = zzcagVarM13556g.zza;
        }
        jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
        jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
        jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
    }
}
