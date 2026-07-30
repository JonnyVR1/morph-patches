package p153l;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class asx {
    private static asx INSTANCE;

    /* JADX INFO: renamed from: a */
    public int f73186a = 3;

    /* JADX INFO: renamed from: b */
    public int f73187b = 3;

    /* JADX INFO: renamed from: c */
    public int f73188c = 60;

    /* JADX INFO: renamed from: h */
    public static asx m99990h() {
        if (INSTANCE == null) {
            synchronized (asx.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = new asx();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public int m99991a() {
        return this.f73188c;
    }

    /* JADX INFO: renamed from: b */
    public int m99992b() {
        return this.f73186a;
    }

    /* JADX INFO: renamed from: c */
    public int m99993c() {
        return 2;
    }

    /* JADX INFO: renamed from: d */
    public int m99994d() {
        return this.f73187b;
    }

    /* JADX INFO: renamed from: e */
    public int m99995e() {
        return 3;
    }

    /* JADX INFO: renamed from: f */
    public final void m99996f(String str) {
        try {
            int iOptInt = new JSONObject(str).optInt("videoalength", 60);
            if (iOptInt >= 15) {
                this.f73188c = iOptInt;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m99997g(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("horizontal_ratio", 3);
            int iOptInt2 = jSONObject.optInt("vertical_ratio", 3);
            this.f73186a = iOptInt;
            this.f73187b = iOptInt2;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public void m99998i() {
        this.f73186a = 3;
        this.f73187b = 3;
        this.f73188c = 60;
    }

    /* JADX INFO: renamed from: j */
    public void m99999j(String str) {
        m99996f(str);
    }

    /* JADX INFO: renamed from: k */
    public void m100000k(String str) {
        m99997g(str);
    }
}
