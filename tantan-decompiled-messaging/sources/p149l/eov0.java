package p149l;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class eov0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final String f92499a;

    public eov0(String str) {
        this.f92499a = str;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        try {
            JSONObject jSONObjectM171065f = prs0.m171065f((JSONObject) obj, "pii");
            if (TextUtils.isEmpty(this.f92499a)) {
                return;
            }
            jSONObjectM171065f.put("attok", this.f92499a);
        } catch (JSONException e) {
            xsu0.m210835l("Failed putting attestation token.", e);
        }
    }
}
