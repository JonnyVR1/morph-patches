package p149l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class xit0 {

    /* JADX INFO: renamed from: a */
    public final Map f193155a;

    /* JADX INFO: renamed from: b */
    public final Map f193156b;

    public xit0(Map map, Map map2) {
        this.f193155a = map;
        this.f193156b = map2;
    }

    /* JADX INFO: renamed from: a */
    public final void m209678a(vxv0 vxv0Var) throws Exception {
        for (txv0 txv0Var : vxv0Var.f183478b.f178774c) {
            if (this.f193155a.containsKey(txv0Var.f172537a)) {
                ((ajt0) this.f193155a.get(txv0Var.f172537a)).mo97010a(txv0Var.f172538b);
            } else if (this.f193156b.containsKey(txv0Var.f172537a)) {
                zit0 zit0Var = (zit0) this.f193156b.get(txv0Var.f172537a);
                JSONObject jSONObject = txv0Var.f172538b;
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                zit0Var.mo102229a(map);
            }
        }
    }
}
