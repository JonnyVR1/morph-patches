package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class phw {

    /* JADX INFO: renamed from: b */
    private static phw f149059b;

    /* JADX INFO: renamed from: a */
    private vsl f149060a;

    private phw() {
    }

    /* JADX INFO: renamed from: b */
    public static phw m169153b() {
        if (f149059b == null) {
            f149059b = new phw();
        }
        return f149059b;
    }

    /* JADX INFO: renamed from: a */
    public vsl m169154a() {
        vsl vslVar = this.f149060a;
        if (vslVar != null) {
            return vslVar;
        }
        ig3.m135964a("请初始化IHttpRequester");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m169155c(vsl vslVar) {
        this.f149060a = vslVar;
    }
}
