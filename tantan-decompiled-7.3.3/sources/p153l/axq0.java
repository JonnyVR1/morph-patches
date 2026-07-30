package p153l;

import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class axq0 implements Comparable<axq0> {

    /* JADX INFO: renamed from: a */
    private final LinkedList<rwq0> f73881a;

    /* JADX INFO: renamed from: b */
    String f73882b;

    /* JADX INFO: renamed from: c */
    private long f73883c;

    /* JADX INFO: renamed from: d */
    protected int f73884d;

    public axq0(String str, int i) {
        this.f73881a = new LinkedList<>();
        this.f73883c = 0L;
        this.f73882b = str;
        this.f73884d = i;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(axq0 axq0Var) {
        if (axq0Var == null) {
            return 1;
        }
        return axq0Var.f73884d - this.f73884d;
    }

    /* JADX INFO: renamed from: b */
    public synchronized axq0 m100784b(JSONObject jSONObject) {
        this.f73883c = jSONObject.getLong("tt");
        this.f73884d = jSONObject.getInt("wt");
        this.f73882b = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("ah");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f73881a.add(new rwq0().m183457b(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public synchronized JSONObject m100785f() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("tt", this.f73883c);
            jSONObject.put("wt", this.f73884d);
            jSONObject.put("host", this.f73882b);
            JSONArray jSONArray = new JSONArray();
            Iterator<rwq0> it = this.f73881a.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m183458c());
            }
            jSONObject.put("ah", jSONArray);
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m100786g(rwq0 rwq0Var) {
        if (rwq0Var != null) {
            try {
                this.f73881a.add(rwq0Var);
                int iM183456a = rwq0Var.m183456a();
                if (iM183456a > 0) {
                    this.f73884d += rwq0Var.m183456a();
                } else {
                    int i = 0;
                    for (int size = this.f73881a.size() - 1; size >= 0 && this.f73881a.get(size).m183456a() < 0; size--) {
                        i++;
                    }
                    this.f73884d += iM183456a * i;
                }
                if (this.f73881a.size() > 30) {
                    this.f73884d -= this.f73881a.remove().m183456a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return this.f73882b + ":" + this.f73884d;
    }

    public axq0(String str) {
        this(str, 0);
    }

    public axq0() {
        this(null, 0);
    }
}
