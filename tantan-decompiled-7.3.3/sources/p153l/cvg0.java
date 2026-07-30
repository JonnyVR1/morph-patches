package p153l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class cvg0 extends uvg0 {
    @Override // p153l.uvg0
    /* JADX INFO: renamed from: a */
    public final oxg0 mo105060a(JSONObject jSONObject) {
        try {
            jSONObject.getString("adUnitId");
            return new cxg0();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
