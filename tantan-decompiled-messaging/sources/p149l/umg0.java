package p149l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class umg0 extends mng0 {
    @Override // p149l.mng0
    /* JADX INFO: renamed from: a */
    public final gpg0 mo146978a(JSONObject jSONObject) {
        try {
            jSONObject.getString("adUnitId");
            return new uog0();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
