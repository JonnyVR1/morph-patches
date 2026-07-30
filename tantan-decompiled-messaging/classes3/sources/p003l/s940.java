package p003l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class s940 {

    /* JADX INFO: renamed from: a */
    public String f7156a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, String> f7157b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public HashMap<String, String> f7158c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public final String f7159d;

    /* JADX INFO: renamed from: e */
    public String f7160e;

    /* JADX INFO: renamed from: f */
    public String f7161f;

    /* JADX INFO: renamed from: g */
    public final String f7162g;

    public s940(String str, String str2, String str3) {
        this.f7162g = str;
        this.f7159d = str3;
        this.f7160e = str2;
    }

    /* JADX INFO: renamed from: a */
    public String m7446a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(IjkMediaMeta.IJKM_KEY_TYPE, "message");
        jSONObject2.put("id", this.f7159d);
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("solution", m7449d(this.f7157b, ""));
        jSONObject3.put("question", m7448c(this.f7160e));
        jSONObject3.put("survey", m7450e());
        arrayList.add(jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("solution", m7449d(this.f7158c, this.f7156a));
        jSONObject4.put("question", m7448c(this.f7161f));
        jSONObject4.put("survey", m7450e());
        arrayList.add(jSONObject4);
        jSONObject.put("answers", arrayList);
        jSONObject.put("reference", jSONObject2);
        return jSONObject.toJSONString();
    }

    /* JADX INFO: renamed from: b */
    public boolean m7447b(String str) {
        return this.f7157b.containsKey(str);
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m7448c(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", str);
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    public JSONObject m7449d(HashMap<String, String> map, String str) {
        JSONObject jSONObject = new JSONObject();
        if (!map.isEmpty()) {
            JSONObject jSONObject2 = new JSONObject();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("id", entry.getKey());
                jSONObject3.put("value", entry.getValue());
                arrayList.add(jSONObject3);
            }
            jSONObject2.put("choices", arrayList);
            jSONObject.put("selection", jSONObject2);
        }
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("value", str);
            jSONObject.put("fillBlank", jSONObject4);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: e */
    public JSONObject m7450e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f7162g);
        return jSONObject;
    }

    /* JADX INFO: renamed from: f */
    public boolean m7451f() {
        return this.f7157b.isEmpty();
    }

    /* JADX INFO: renamed from: g */
    public void m7452g(int i, String str, String str2) {
        if (i == 1) {
            this.f7157b.put(str, str2);
        } else {
            this.f7158c.put(str, str2);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m7453h(int i, String str) {
        if (i == 1) {
            this.f7157b.remove(str);
        } else {
            this.f7158c.remove(str);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m7454i(String str) {
        this.f7156a = str;
    }

    /* JADX INFO: renamed from: j */
    public void m7455j(String str) {
        this.f7161f = str;
    }
}
