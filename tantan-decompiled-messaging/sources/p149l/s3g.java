package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class s3g {

    /* JADX INFO: renamed from: a */
    private volatile String f162137a = null;

    /* JADX INFO: renamed from: b */
    private volatile String f162138b = null;

    /* JADX INFO: renamed from: a */
    public synchronized void m182160a(String str, String str2) {
        this.f162137a = str;
        this.f162138b = str2;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m182161b() {
        this.f162137a = null;
        this.f162138b = null;
    }

    /* JADX INFO: renamed from: c */
    public synchronized String m182162c() {
        return this.f162138b;
    }

    /* JADX INFO: renamed from: d */
    public synchronized String m182163d() {
        return this.f162137a;
    }
}
