package p153l;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class zwv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final JSONObject f206387a;

    public zwv0(JSONObject jSONObject) {
        this.f206387a = jSONObject;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        try {
            JSONObject jSONObjectM198934f = v0t0.m198934f((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.f206387a;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectM198934f.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            d2v0.m113737k("Failed putting app indexing json.");
        }
    }
}
