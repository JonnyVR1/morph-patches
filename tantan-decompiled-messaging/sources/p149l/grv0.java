package p149l;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class grv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final String f104119a;

    public grv0(String str) {
        this.f104119a = str;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.f104119a)) {
                return;
            }
            prs0.m171065f(jSONObject, "pii").put("adsid", this.f104119a);
        } catch (JSONException e) {
            x2t0.m206870h("Failed putting trustless token.", e);
        }
    }
}
