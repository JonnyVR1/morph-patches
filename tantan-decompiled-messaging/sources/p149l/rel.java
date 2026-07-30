package p149l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class rel {

    /* JADX INFO: renamed from: a */
    public String f159063a;

    /* JADX INFO: renamed from: b */
    public List<String> f159064b;

    /* JADX INFO: renamed from: c */
    public String f159065c;

    /* JADX INFO: renamed from: d */
    public int f159066d;

    /* JADX INFO: renamed from: e */
    public long f159067e;

    /* JADX INFO: renamed from: a */
    public boolean m179051a() {
        List<String> list = this.f159064b;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<String> it = this.f159064b.iterator();
        while (it.hasNext()) {
            if (TextUtils.isEmpty(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public String m179052b() {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = this.f159064b.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("domain", this.f159063a);
            jSONObject.put("ips", jSONArray);
            jSONObject.put("etag", this.f159065c);
            jSONObject.put("ttl", this.f159066d);
            jSONObject.put("lut", this.f159067e);
            return jSONObject.toString();
        } catch (JSONException e) {
            e5e.m114786c("CosmosSdkDns", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public rel m179053c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f159063a = jSONObject.getString("domain");
            JSONArray jSONArray = jSONObject.getJSONArray("ips");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            this.f159064b = arrayList;
            this.f159065c = jSONObject.optString("etag");
            this.f159066d = jSONObject.getInt("ttl");
            this.f159067e = jSONObject.getLong("lut");
            return this;
        } catch (Exception e) {
            e5e.m114786c("CosmosSdkDns", e);
            return null;
        }
    }
}
