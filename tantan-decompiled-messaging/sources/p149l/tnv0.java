package p149l;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class tnv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final JSONObject f171287a;

    public tnv0(JSONObject jSONObject) {
        this.f171287a = jSONObject;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        try {
            JSONObject jSONObjectM171065f = prs0.m171065f((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.f171287a;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectM171065f.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            xsu0.m210834k("Failed putting app indexing json.");
        }
    }
}
