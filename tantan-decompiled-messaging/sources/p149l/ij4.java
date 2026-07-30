package p149l;

/* JADX INFO: loaded from: classes13.dex */
public class ij4 {
    public static final int PAGE_STYLE_BLACK = 0;
    public static final int PAGE_STYLE_WHITE = 1;

    /* JADX INFO: renamed from: lp */
    public mcr f113496lp;
    public int pageStyle = 0;
    private String tabId;

    public ij4(mcr mcrVar) {
        this.f113496lp = mcrVar;
    }

    /* JADX INFO: renamed from: a */
    public String m136504a() {
        return this.tabId;
    }

    /* JADX INFO: renamed from: b */
    public boolean m136505b() {
        return this.pageStyle == 1;
    }

    /* JADX INFO: renamed from: c */
    public void m136506c(int i) {
        this.pageStyle = i;
    }

    /* JADX INFO: renamed from: d */
    public void m136507d(String str) {
        this.tabId = str;
    }
}
