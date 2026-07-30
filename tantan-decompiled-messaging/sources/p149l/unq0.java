package p149l;

import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class unq0 implements Comparable<unq0> {

    /* JADX INFO: renamed from: a */
    private final LinkedList<lnq0> f177421a;

    /* JADX INFO: renamed from: b */
    String f177422b;

    /* JADX INFO: renamed from: c */
    private long f177423c;

    /* JADX INFO: renamed from: d */
    protected int f177424d;

    public unq0(String str, int i) {
        this.f177421a = new LinkedList<>();
        this.f177423c = 0L;
        this.f177422b = str;
        this.f177424d = i;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(unq0 unq0Var) {
        if (unq0Var == null) {
            return 1;
        }
        return unq0Var.f177424d - this.f177424d;
    }

    /* JADX INFO: renamed from: b */
    public synchronized unq0 m194477b(JSONObject jSONObject) {
        this.f177423c = jSONObject.getLong("tt");
        this.f177424d = jSONObject.getInt("wt");
        this.f177422b = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("ah");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f177421a.add(new lnq0().m150708b(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public synchronized JSONObject m194478f() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("tt", this.f177423c);
            jSONObject.put("wt", this.f177424d);
            jSONObject.put("host", this.f177422b);
            JSONArray jSONArray = new JSONArray();
            Iterator<lnq0> it = this.f177421a.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m150709c());
            }
            jSONObject.put("ah", jSONArray);
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m194479g(lnq0 lnq0Var) {
        if (lnq0Var != null) {
            try {
                this.f177421a.add(lnq0Var);
                int iM150707a = lnq0Var.m150707a();
                if (iM150707a > 0) {
                    this.f177424d += lnq0Var.m150707a();
                } else {
                    int i = 0;
                    for (int size = this.f177421a.size() - 1; size >= 0 && this.f177421a.get(size).m150707a() < 0; size--) {
                        i++;
                    }
                    this.f177424d += iM150707a * i;
                }
                if (this.f177421a.size() > 30) {
                    this.f177424d -= this.f177421a.remove().m150707a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return this.f177422b + ":" + this.f177424d;
    }

    public unq0(String str) {
        this(str, 0);
    }

    public unq0() {
        this(null, 0);
    }
}
