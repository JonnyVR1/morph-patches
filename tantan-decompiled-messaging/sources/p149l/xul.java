package p149l;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xul {

    /* JADX INFO: renamed from: a */
    private String f194507a;

    /* JADX INFO: renamed from: b */
    protected String f194508b = System.currentTimeMillis() + "";

    /* JADX INFO: renamed from: c */
    protected String f194509c = mo107257c();

    /* JADX INFO: renamed from: a */
    public abstract boolean mo101935a();

    /* JADX INFO: renamed from: b */
    public String m211116b() {
        return this.f194508b;
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo107257c();

    /* JADX INFO: renamed from: d */
    public void m211117d(String str) {
        this.f194507a = str;
    }

    /* JADX INFO: renamed from: e */
    public abstract JSONObject mo101936e();
}
