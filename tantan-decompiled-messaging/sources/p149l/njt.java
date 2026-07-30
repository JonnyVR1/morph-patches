package p149l;

/* JADX INFO: loaded from: classes13.dex */
public class njt {

    /* JADX INFO: renamed from: a */
    public String f139331a;

    /* JADX INFO: renamed from: b */
    public int f139332b;

    public njt(String str, int i) {
        this.f139331a = str;
        this.f139332b = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m159791a(String str) {
        return str.substring(str.indexOf(":") + 1);
    }

    /* JADX INFO: renamed from: b */
    public static int m159792b(String str) {
        return Integer.parseInt(str.split(":")[0]);
    }

    /* JADX INFO: renamed from: c */
    public String m159793c() {
        return this.f139332b + ":" + this.f139331a;
    }

    /* JADX INFO: renamed from: d */
    public void m159794d(String str) {
        this.f139331a = str;
    }

    /* JADX INFO: renamed from: e */
    public void m159795e(int i) {
        this.f139332b = i;
    }
}
