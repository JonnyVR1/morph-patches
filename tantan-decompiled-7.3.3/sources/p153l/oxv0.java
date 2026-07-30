package p153l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class oxv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final JSONObject f149690a;

    public oxv0(JSONObject jSONObject) {
        this.f149690a = jSONObject;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f149690a);
        } catch (JSONException unused) {
            d2v0.m113737k("Unable to get cache_state");
        }
    }
}
