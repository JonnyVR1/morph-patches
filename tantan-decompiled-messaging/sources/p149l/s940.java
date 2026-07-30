package p149l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.p046p1.mobile.putong.feed.data.Reference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class s940 {

    /* JADX INFO: renamed from: a */
    public String f163138a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, String> f163139b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public HashMap<String, String> f163140c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public final String f163141d;

    /* JADX INFO: renamed from: e */
    public String f163142e;

    /* JADX INFO: renamed from: f */
    public String f163143f;

    /* JADX INFO: renamed from: g */
    public final String f163144g;

    public s940(String str, String str2, String str3) {
        this.f163144g = str;
        this.f163141d = str3;
        this.f163142e = str2;
    }

    /* JADX INFO: renamed from: a */
    public String m182694a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) "message");
        jSONObject2.put("id", (Object) this.f163141d);
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("solution", (Object) m182697d(this.f163139b, ""));
        jSONObject3.put("question", (Object) m182696c(this.f163142e));
        jSONObject3.put("survey", (Object) m182698e());
        arrayList.add(jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("solution", (Object) m182697d(this.f163140c, this.f163138a));
        jSONObject4.put("question", (Object) m182696c(this.f163143f));
        jSONObject4.put("survey", (Object) m182698e());
        arrayList.add(jSONObject4);
        jSONObject.put("answers", (Object) arrayList);
        jSONObject.put(Reference.TYPE, (Object) jSONObject2);
        return jSONObject.toJSONString();
    }

    /* JADX INFO: renamed from: b */
    public boolean m182695b(String str) {
        return this.f163139b.containsKey(str);
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m182696c(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) str);
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    public JSONObject m182697d(HashMap<String, String> map, String str) {
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
    public JSONObject m182698e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) this.f163144g);
        return jSONObject;
    }

    /* JADX INFO: renamed from: f */
    public boolean m182699f() {
        return this.f163139b.isEmpty();
    }

    /* JADX INFO: renamed from: g */
    public void m182700g(int i, String str, String str2) {
        if (i == 1) {
            this.f163139b.put(str, str2);
        } else {
            this.f163140c.put(str, str2);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m182701h(int i, String str) {
        if (i == 1) {
            this.f163139b.remove(str);
        } else {
            this.f163140c.remove(str);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m182702i(String str) {
        this.f163138a = str;
    }

    /* JADX INFO: renamed from: j */
    public void m182703j(String str) {
        this.f163143f = str;
    }
}
