package p149l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class iov0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final JSONObject f114205a;

    public iov0(JSONObject jSONObject) {
        this.f114205a = jSONObject;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f114205a);
        } catch (JSONException unused) {
            xsu0.m210834k("Unable to get cache_state");
        }
    }
}
