package p149l;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class gje0 {

    /* JADX INFO: renamed from: a */
    public int f103022a;

    /* JADX INFO: renamed from: b */
    public String f103023b;

    /* JADX INFO: renamed from: c */
    public long f103024c;

    /* JADX INFO: renamed from: d */
    public int f103025d;

    private gje0(int i, String str, long j, int i2) {
        this.f103022a = i;
        this.f103023b = str;
        this.f103024c = j;
        this.f103025d = i2;
    }

    /* JADX INFO: renamed from: b */
    private static gje0 m126477b() {
        return new gje0(-1, "illegal response", System.currentTimeMillis(), 60);
    }

    /* JADX INFO: renamed from: c */
    public static gje0 m126478c() {
        return new gje0(0, "ok", System.currentTimeMillis(), 0);
    }

    /* JADX INFO: renamed from: d */
    public static gje0 m126479d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            gje0 gje0Var = new gje0();
            gje0Var.f103022a = jSONObject.optInt("ec");
            gje0Var.f103023b = jSONObject.optString("em");
            gje0Var.f103024c = jSONObject.optLong("timesec");
            int i = gje0Var.f103022a;
            if (i == 0) {
                gje0Var.f103025d = 0;
                return gje0Var;
            }
            if (i == 600) {
                gje0Var.f103025d = jSONObject.has("data") ? jSONObject.optJSONObject("data").optInt("ct") : 60;
                return gje0Var;
            }
            gje0Var.f103025d = 60;
            return gje0Var;
        } catch (JSONException e) {
            inw.m137183u(e);
            return m126477b();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m126480a() {
        return this.f103022a == 600;
    }

    /* JADX INFO: renamed from: e */
    public boolean m126481e() {
        return this.f103022a == 0;
    }

    @NonNull
    public String toString() {
        try {
            return inw.m137174l().toJson(this);
        } catch (Exception unused) {
            return super.toString();
        }
    }

    private gje0() {
        this.f103022a = -1;
    }
}
