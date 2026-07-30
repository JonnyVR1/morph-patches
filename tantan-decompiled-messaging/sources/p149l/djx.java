package p149l;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class djx {
    private static djx INSTANCE;

    /* JADX INFO: renamed from: a */
    public int f86577a = 3;

    /* JADX INFO: renamed from: b */
    public int f86578b = 3;

    /* JADX INFO: renamed from: c */
    public int f86579c = 60;

    /* JADX INFO: renamed from: h */
    public static djx m112144h() {
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
    public int m112145a() {
        return this.f86579c;
    }

    /* JADX INFO: renamed from: b */
    public int m112146b() {
        return this.f86577a;
    }

    /* JADX INFO: renamed from: c */
    public int m112147c() {
        return 2;
    }

    /* JADX INFO: renamed from: d */
    public int m112148d() {
        return this.f86578b;
    }

    /* JADX INFO: renamed from: e */
    public int m112149e() {
        return 3;
    }

    /* JADX INFO: renamed from: f */
    public final void m112150f(String str) {
        try {
            int iOptInt = new JSONObject(str).optInt("videoalength", 60);
            if (iOptInt >= 15) {
                this.f86579c = iOptInt;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m112151g(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("horizontal_ratio", 3);
            int iOptInt2 = jSONObject.optInt("vertical_ratio", 3);
            this.f86577a = iOptInt;
            this.f86578b = iOptInt2;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public void m112152i() {
        this.f86577a = 3;
        this.f86578b = 3;
        this.f86579c = 60;
    }

    /* JADX INFO: renamed from: j */
    public void m112153j(String str) {
        m112150f(str);
    }

    /* JADX INFO: renamed from: k */
    public void m112154k(String str) {
        m112151g(str);
    }
}
