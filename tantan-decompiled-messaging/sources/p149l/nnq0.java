package p149l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class nnq0 {

    /* JADX INFO: renamed from: a */
    private String f139774a;

    /* JADX INFO: renamed from: b */
    private final ArrayList<mnq0> f139775b = new ArrayList<>();

    public nnq0(String str) {
        if (TextUtils.isEmpty(str)) {
            ig3.m135964a("the host is empty");
            throw null;
        }
        this.f139774a = str;
    }

    /* JADX INFO: renamed from: a */
    public String m160358a() {
        return this.f139774a;
    }

    /* JADX INFO: renamed from: b */
    public ArrayList<mnq0> m160359b() {
        return this.f139775b;
    }

    /* JADX INFO: renamed from: c */
    public synchronized mnq0 m160360c() {
        for (int size = this.f139775b.size() - 1; size >= 0; size--) {
            mnq0 mnq0Var = this.f139775b.get(size);
            if (mnq0Var.m155549p()) {
                rnq0.m180126a().m180137a(mnq0Var.m155534a());
                return mnq0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public synchronized nnq0 m160361d(JSONObject jSONObject) {
        this.f139774a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f139775b.add(new mnq0(this.f139774a).m155538e(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public synchronized JSONObject m160362e() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("host", this.f139774a);
            JSONArray jSONArray = new JSONArray();
            Iterator<mnq0> it = this.f139775b.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m155539f());
            }
            jSONObject.put("fbs", jSONArray);
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m160363f(mnq0 mnq0Var) {
        int i = 0;
        while (i < this.f139775b.size()) {
            try {
                if (this.f139775b.get(i).m155550q(mnq0Var)) {
                    this.f139775b.set(i, mnq0Var);
                    break;
                }
                i++;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i >= this.f139775b.size()) {
            this.f139775b.add(mnq0Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m160364g(boolean z) {
        try {
            for (int size = this.f139775b.size() - 1; size >= 0; size--) {
                mnq0 mnq0Var = this.f139775b.get(size);
                if (z) {
                    if (mnq0Var.m155555w()) {
                        this.f139775b.remove(size);
                    }
                } else if (!mnq0Var.mo155554u()) {
                    this.f139775b.remove(size);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f139774a);
        sb.append(SignParameters.NEW_LINE);
        Iterator<mnq0> it = this.f139775b.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }

    public nnq0() {
    }
}
