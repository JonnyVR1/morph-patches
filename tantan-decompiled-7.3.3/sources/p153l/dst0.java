package p153l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class dst0 {

    /* JADX INFO: renamed from: a */
    public final Map f90517a;

    /* JADX INFO: renamed from: b */
    public final Map f90518b;

    public dst0(Map map, Map map2) {
        this.f90517a = map;
        this.f90518b = map2;
    }

    /* JADX INFO: renamed from: a */
    public final void m117777a(b7w0 b7w0Var) throws Exception {
        for (z6w0 z6w0Var : b7w0Var.f75343b.f68855c) {
            if (this.f90517a.containsKey(z6w0Var.f203200a)) {
                ((gst0) this.f90517a.get(z6w0Var.f203200a)).mo132150a(z6w0Var.f203201b);
            } else if (this.f90518b.containsKey(z6w0Var.f203200a)) {
                fst0 fst0Var = (fst0) this.f90518b.get(z6w0Var.f203200a);
                JSONObject jSONObject = z6w0Var.f203201b;
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                fst0Var.mo100273a(map);
            }
        }
    }
}
