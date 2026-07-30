package p149l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class zpv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final String f204313a;

    /* JADX INFO: renamed from: b */
    public final String f204314b;

    public zpv0(String str, String str2) {
        this.f204313a = str;
        this.f204314b = str2;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        try {
            JSONObject jSONObjectM171065f = prs0.m171065f((JSONObject) obj, "pii");
            jSONObjectM171065f.put("doritos", this.f204313a);
            jSONObjectM171065f.put("doritos_v2", this.f204314b);
        } catch (JSONException unused) {
            xsu0.m210834k("Failed putting doritos string.");
        }
    }
}
