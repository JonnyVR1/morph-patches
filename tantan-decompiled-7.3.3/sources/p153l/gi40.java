package p153l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.p051p1.mobile.putong.feed.data.Reference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class gi40 {

    /* JADX INFO: renamed from: a */
    public String f104194a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, String> f104195b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public HashMap<String, String> f104196c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public final String f104197d;

    /* JADX INFO: renamed from: e */
    public String f104198e;

    /* JADX INFO: renamed from: f */
    public String f104199f;

    /* JADX INFO: renamed from: g */
    public final String f104200g;

    public gi40(String str, String str2, String str3) {
        this.f104200g = str;
        this.f104197d = str3;
        this.f104198e = str2;
    }

    /* JADX INFO: renamed from: a */
    public String m130285a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) "message");
        jSONObject2.put("id", (Object) this.f104197d);
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("solution", (Object) m130288d(this.f104195b, ""));
        jSONObject3.put("question", (Object) m130287c(this.f104198e));
        jSONObject3.put("survey", (Object) m130289e());
        arrayList.add(jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("solution", (Object) m130288d(this.f104196c, this.f104194a));
        jSONObject4.put("question", (Object) m130287c(this.f104199f));
        jSONObject4.put("survey", (Object) m130289e());
        arrayList.add(jSONObject4);
        jSONObject.put("answers", (Object) arrayList);
        jSONObject.put(Reference.TYPE, (Object) jSONObject2);
        return jSONObject.toJSONString();
    }

    /* JADX INFO: renamed from: b */
    public boolean m130286b(String str) {
        return this.f104195b.containsKey(str);
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m130287c(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) str);
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    public JSONObject m130288d(HashMap<String, String> map, String str) {
        JSONObject jSONObject = new JSONObject();
        if (!map.isEmpty()) {
            JSONObject jSONObject2 = new JSONObject();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("id", (Object) entry.getKey());
                jSONObject3.put("value", (Object) entry.getValue());
                arrayList.add(jSONObject3);
            }
            jSONObject2.put("choices", (Object) arrayList);
            jSONObject.put("selection", (Object) jSONObject2);
        }
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("value", (Object) str);
            jSONObject.put("fillBlank", (Object) jSONObject4);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: e */
    public JSONObject m130289e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) this.f104200g);
        return jSONObject;
    }

    /* JADX INFO: renamed from: f */
    public boolean m130290f() {
        return this.f104195b.isEmpty();
    }

    /* JADX INFO: renamed from: g */
    public void m130291g(int i, String str, String str2) {
        if (i == 1) {
            this.f104195b.put(str, str2);
        } else {
            this.f104196c.put(str, str2);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m130292h(int i, String str) {
        if (i == 1) {
            this.f104195b.remove(str);
        } else {
            this.f104196c.remove(str);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m130293i(String str) {
        this.f104194a = str;
    }

    /* JADX INFO: renamed from: j */
    public void m130294j(String str) {
        this.f104199f = str;
    }
}
