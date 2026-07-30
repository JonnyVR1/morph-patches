package p153l;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class kxv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final String f129249a;

    public kxv0(String str) {
        this.f129249a = str;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        try {
            JSONObject jSONObjectM198934f = v0t0.m198934f((JSONObject) obj, "pii");
            if (TextUtils.isEmpty(this.f129249a)) {
                return;
            }
            jSONObjectM198934f.put("attok", this.f129249a);
        } catch (JSONException e) {
            d2v0.m113738l("Failed putting attestation token.", e);
        }
    }
}
