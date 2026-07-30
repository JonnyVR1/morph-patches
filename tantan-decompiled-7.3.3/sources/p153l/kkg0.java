package p153l;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class kkg0 {

    /* JADX INFO: renamed from: a */
    public boolean f127189a;

    /* JADX INFO: renamed from: b */
    public String f127190b;

    /* JADX INFO: renamed from: c */
    public String f127191c;

    /* JADX INFO: renamed from: d */
    public String f127192d;

    /* JADX INFO: renamed from: e */
    public List f127193e;

    /* JADX INFO: renamed from: f */
    public List f127194f;

    /* JADX INFO: renamed from: a */
    public final String m150097a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHit", this.f127189a);
            jSONObject.put("keyWord", this.f127190b);
            jSONObject.put("text", this.f127191c);
            jSONObject.put("wordType", this.f127192d);
            List list = this.f127193e;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f127193e.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject.put("keyWordList", jSONArray);
            }
            List list2 = this.f127194f;
            if (list2 != null && list2.size() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = this.f127194f.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put((Integer) it2.next());
                }
                jSONObject.put("numberList", jSONArray2);
            }
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
