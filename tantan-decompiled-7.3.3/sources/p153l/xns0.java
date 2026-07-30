package p153l;

import android.os.Bundle;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class xns0 implements bqs0 {

    /* JADX INFO: renamed from: a */
    public final yns0 f195469a;

    public xns0(yns0 yns0Var) {
        this.f195469a = yns0Var;
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final void mo12917a(Object obj, Map map) {
        if (this.f195469a == null) {
            return;
        }
        String str = (String) map.get(AuthenticationTokenClaims.JSON_KEY_NAME);
        if (str == null) {
            dct0.m115297f("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleM198929a = null;
        if (map.containsKey(BaseSei.INFO)) {
            try {
                bundleM198929a = v0t0.m198929a(new JSONObject((String) map.get(BaseSei.INFO)));
            } catch (JSONException e) {
                dct0.m115296e("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundleM198929a == null) {
            dct0.m115295d("Failed to convert ad metadata to Bundle.");
        } else {
            this.f195469a.mo117708K(str, bundleM198929a);
        }
    }
}
