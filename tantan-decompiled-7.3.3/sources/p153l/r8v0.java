package p153l;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class r8v0 {

    /* JADX INFO: renamed from: a */
    public final a5t0 f161769a;

    public r8v0(a5t0 a5t0Var) {
        this.f161769a = a5t0Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m180248a(Map map, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
        if (jSONObjectOptJSONObject == null) {
            d2v0.m113737k("DSID signal does not exist.");
            return;
        }
        if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
            map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
        }
        if (TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
            return;
        }
        map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
    }

    /* JADX INFO: renamed from: b */
    public final void m180249b() {
        rct0.m180821a(this.f161769a.mo96252a(), "persistFlags");
    }
}
