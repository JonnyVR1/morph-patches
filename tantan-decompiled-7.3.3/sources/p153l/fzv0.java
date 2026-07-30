package p153l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class fzv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final String f101552a;

    /* JADX INFO: renamed from: b */
    public final String f101553b;

    public fzv0(String str, String str2) {
        this.f101552a = str;
        this.f101553b = str2;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        try {
            JSONObject jSONObjectM198934f = v0t0.m198934f((JSONObject) obj, "pii");
            jSONObjectM198934f.put("doritos", this.f101552a);
            jSONObjectM198934f.put("doritos_v2", this.f101553b);
        } catch (JSONException unused) {
            d2v0.m113737k("Failed putting doritos string.");
        }
    }
}
