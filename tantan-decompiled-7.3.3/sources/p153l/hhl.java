package p153l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class hhl {

    /* JADX INFO: renamed from: a */
    public String f109900a;

    /* JADX INFO: renamed from: b */
    public List<String> f109901b;

    /* JADX INFO: renamed from: c */
    public String f109902c;

    /* JADX INFO: renamed from: d */
    public int f109903d;

    /* JADX INFO: renamed from: e */
    public long f109904e;

    /* JADX INFO: renamed from: a */
    public boolean m135071a() {
        List<String> list = this.f109901b;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<String> it = this.f109901b.iterator();
        while (it.hasNext()) {
            if (TextUtils.isEmpty(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public String m135072b() {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = this.f109901b.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("domain", this.f109900a);
            jSONObject.put("ips", jSONArray);
            jSONObject.put("etag", this.f109902c);
            jSONObject.put("ttl", this.f109903d);
            jSONObject.put("lut", this.f109904e);
            return jSONObject.toString();
        } catch (JSONException e) {
            s6e.m184884c("CosmosSdkDns", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public hhl m135073c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f109900a = jSONObject.getString("domain");
            JSONArray jSONArray = jSONObject.getJSONArray("ips");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            this.f109901b = arrayList;
            this.f109902c = jSONObject.optString("etag");
            this.f109903d = jSONObject.getInt("ttl");
            this.f109904e = jSONObject.getLong("lut");
            return this;
        } catch (Exception e) {
            s6e.m184884c("CosmosSdkDns", e);
            return null;
        }
    }
}
