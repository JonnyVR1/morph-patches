package p149l;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ccg0 {

    /* JADX INFO: renamed from: a */
    public boolean f80236a;

    /* JADX INFO: renamed from: b */
    public String f80237b;

    /* JADX INFO: renamed from: c */
    public String f80238c;

    /* JADX INFO: renamed from: d */
    public String f80239d;

    /* JADX INFO: renamed from: e */
    public List f80240e;

    /* JADX INFO: renamed from: f */
    public List f80241f;

    /* JADX INFO: renamed from: a */
    public final String m106049a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHit", this.f80236a);
            jSONObject.put("keyWord", this.f80237b);
            jSONObject.put("text", this.f80238c);
            jSONObject.put("wordType", this.f80239d);
            List list = this.f80240e;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f80240e.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject.put("keyWordList", jSONArray);
            }
            List list2 = this.f80241f;
            if (list2 != null && list2.size() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = this.f80241f.iterator();
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
