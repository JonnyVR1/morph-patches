package p153l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class twq0 {

    /* JADX INFO: renamed from: a */
    private String f176419a;

    /* JADX INFO: renamed from: b */
    private final ArrayList<swq0> f176420b = new ArrayList<>();

    public twq0(String str) {
        if (TextUtils.isEmpty(str)) {
            wg3.m206174a("the host is empty");
            throw null;
        }
        this.f176419a = str;
    }

    /* JADX INFO: renamed from: a */
    public String m193359a() {
        return this.f176419a;
    }

    /* JADX INFO: renamed from: b */
    public ArrayList<swq0> m193360b() {
        return this.f176420b;
    }

    /* JADX INFO: renamed from: c */
    public synchronized swq0 m193361c() {
        for (int size = this.f176420b.size() - 1; size >= 0; size--) {
            swq0 swq0Var = this.f176420b.get(size);
            if (swq0Var.m188349p()) {
                xwq0.m213395a().m213406a(swq0Var.m188334a());
                return swq0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public synchronized twq0 m193362d(JSONObject jSONObject) {
        this.f176419a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f176420b.add(new swq0(this.f176419a).m188338e(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public synchronized JSONObject m193363e() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("host", this.f176419a);
            JSONArray jSONArray = new JSONArray();
            Iterator<swq0> it = this.f176420b.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m188339f());
            }
            jSONObject.put("fbs", jSONArray);
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m193364f(swq0 swq0Var) {
        int i = 0;
        while (i < this.f176420b.size()) {
            try {
                if (this.f176420b.get(i).m188350q(swq0Var)) {
                    this.f176420b.set(i, swq0Var);
                    break;
                }
                i++;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i >= this.f176420b.size()) {
            this.f176420b.add(swq0Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m193365g(boolean z) {
        try {
            for (int size = this.f176420b.size() - 1; size >= 0; size--) {
                swq0 swq0Var = this.f176420b.get(size);
                if (z) {
                    if (swq0Var.m188355w()) {
                        this.f176420b.remove(size);
                    }
                } else if (!swq0Var.mo188354u()) {
                    this.f176420b.remove(size);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f176419a);
        sb.append(SignParameters.NEW_LINE);
        Iterator<swq0> it = this.f176420b.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }

    public twq0() {
    }
}
