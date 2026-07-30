package p153l;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class m0w0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final String f134366a;

    public m0w0(String str) {
        this.f134366a = str;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.f134366a)) {
                return;
            }
            v0t0.m198934f(jSONObject, "pii").put("adsid", this.f134366a);
        } catch (JSONException e) {
            dct0.m115299h("Failed putting trustless token.", e);
        }
    }
}
