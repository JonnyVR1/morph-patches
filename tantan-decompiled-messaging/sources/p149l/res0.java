package p149l;

import android.os.Bundle;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class res0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    public final ses0 f159085a;

    public res0(ses0 ses0Var) {
        this.f159085a = ses0Var;
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final void mo12863a(Object obj, Map map) {
        if (this.f159085a == null) {
            return;
        }
        String str = (String) map.get(AuthenticationTokenClaims.JSON_KEY_NAME);
        if (str == null) {
            x2t0.m206868f("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleM171060a = null;
        if (map.containsKey(BaseSei.INFO)) {
            try {
                bundleM171060a = prs0.m171060a(new JSONObject((String) map.get(BaseSei.INFO)));
            } catch (JSONException e) {
                x2t0.m206867e("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundleM171060a == null) {
            x2t0.m206866d("Failed to convert ad metadata to Bundle.");
        } else {
            this.f159085a.mo147952K(str, bundleM171060a);
        }
    }
}
