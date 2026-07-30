package p149l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ymv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final String f199065a;

    public ymv0(String str) {
        this.f199065a = str;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.f199065a);
        } catch (JSONException e) {
            xsu0.m210835l("Failed putting Ad ID.", e);
        }
    }
}
