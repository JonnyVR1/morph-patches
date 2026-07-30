package p007l;

import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class djx {
    private static djx INSTANCE;

    /* JADX INFO: renamed from: a */
    public int f2582a = 3;

    /* JADX INFO: renamed from: b */
    public int f2583b = 3;

    /* JADX INFO: renamed from: c */
    public int f2584c = 60;

    /* JADX INFO: renamed from: h */
    public static djx m8997h() {
        if (INSTANCE == null) {
            synchronized (djx.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = new djx();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public int m8998a() {
        return this.f2584c;
    }

    /* JADX INFO: renamed from: b */
    public int m8999b() {
        return this.f2582a;
    }

    /* JADX INFO: renamed from: c */
    public int m9000c() {
        return 2;
    }

    /* JADX INFO: renamed from: d */
    public int m9001d() {
        return this.f2583b;
    }

    /* JADX INFO: renamed from: e */
    public int m9002e() {
        return 3;
    }

    /* JADX INFO: renamed from: f */
    public final void m9003f(String str) {
        try {
            int iOptInt = new JSONObject(str).optInt("videoalength", 60);
            if (iOptInt >= 15) {
                this.f2584c = iOptInt;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m9004g(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("horizontal_ratio", 3);
            int iOptInt2 = jSONObject.optInt("vertical_ratio", 3);
            this.f2582a = iOptInt;
            this.f2583b = iOptInt2;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public void m9005i() {
        this.f2582a = 3;
        this.f2583b = 3;
        this.f2584c = 60;
    }

    /* JADX INFO: renamed from: j */
    public void m9006j(String str) {
        m9003f(str);
    }

    /* JADX INFO: renamed from: k */
    public void m9007k(String str) {
        m9004g(str);
    }
}
