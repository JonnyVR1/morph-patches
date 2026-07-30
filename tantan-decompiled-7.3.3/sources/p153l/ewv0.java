package p153l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ewv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final String f96202a;

    public ewv0(String str) {
        this.f96202a = str;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.f96202a);
        } catch (JSONException e) {
            d2v0.m113738l("Failed putting Ad ID.", e);
        }
    }
}
