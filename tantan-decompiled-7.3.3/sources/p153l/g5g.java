package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class g5g {

    /* JADX INFO: renamed from: a */
    private volatile String f102324a = null;

    /* JADX INFO: renamed from: b */
    private volatile String f102325b = null;

    /* JADX INFO: renamed from: a */
    public synchronized void m129051a(String str, String str2) {
        this.f102324a = str;
        this.f102325b = str2;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m129052b() {
        this.f102324a = null;
        this.f102325b = null;
    }

    /* JADX INFO: renamed from: c */
    public synchronized String m129053c() {
        return this.f102325b;
    }

    /* JADX INFO: renamed from: d */
    public synchronized String m129054d() {
        return this.f102324a;
    }
}
