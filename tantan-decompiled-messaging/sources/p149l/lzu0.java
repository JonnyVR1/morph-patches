package p149l;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class lzu0 {

    /* JADX INFO: renamed from: a */
    public final uvs0 f130681a;

    public lzu0(uvs0 uvs0Var) {
        this.f130681a = uvs0Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m152364a(Map map, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
        if (jSONObjectOptJSONObject == null) {
            xsu0.m210834k("DSID signal does not exist.");
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
    public final void m152365b() {
        l3t0.m148407a(this.f130681a.mo190784a(), "persistFlags");
    }
}
