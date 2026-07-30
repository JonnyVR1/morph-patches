package p153l;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class lre0 {

    /* JADX INFO: renamed from: a */
    public int f133319a;

    /* JADX INFO: renamed from: b */
    public String f133320b;

    /* JADX INFO: renamed from: c */
    public long f133321c;

    /* JADX INFO: renamed from: d */
    public int f133322d;

    private lre0(int i, String str, long j, int i2) {
        this.f133319a = i;
        this.f133320b = str;
        this.f133321c = j;
        this.f133322d = i2;
    }

    /* JADX INFO: renamed from: b */
    private static lre0 m155618b() {
        return new lre0(-1, "illegal response", System.currentTimeMillis(), 60);
    }

    /* JADX INFO: renamed from: c */
    public static lre0 m155619c() {
        return new lre0(0, "ok", System.currentTimeMillis(), 0);
    }

    /* JADX INFO: renamed from: d */
    public static lre0 m155620d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            lre0 lre0Var = new lre0();
            lre0Var.f133319a = jSONObject.optInt("ec");
            lre0Var.f133320b = jSONObject.optString("em");
            lre0Var.f133321c = jSONObject.optLong("timesec");
            int i = lre0Var.f133319a;
            if (i == 0) {
                lre0Var.f133322d = 0;
                return lre0Var;
            }
            if (i == 600) {
                lre0Var.f133322d = jSONObject.has("data") ? jSONObject.optJSONObject("data").optInt("ct") : 60;
                return lre0Var;
            }
            lre0Var.f133322d = 60;
            return lre0Var;
        } catch (JSONException e) {
            gqw.m131497u(e);
            return m155618b();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m155621a() {
        return this.f133319a == 600;
    }

    /* JADX INFO: renamed from: e */
    public boolean m155622e() {
        return this.f133319a == 0;
    }

    @NonNull
    public String toString() {
        try {
            return gqw.m131488l().toJson(this);
        } catch (Exception unused) {
            return super.toString();
        }
    }

    private lre0() {
        this.f133319a = -1;
    }
}
