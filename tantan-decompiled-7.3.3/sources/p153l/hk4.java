package p153l;

/* JADX INFO: loaded from: classes13.dex */
public class hk4 {
    public static final int PAGE_STYLE_BLACK = 0;
    public static final int PAGE_STYLE_WHITE = 1;

    /* JADX INFO: renamed from: lp */
    public ner f110375lp;
    public int pageStyle = 0;
    private String tabId;

    public hk4(ner nerVar) {
        this.f110375lp = nerVar;
    }

    /* JADX INFO: renamed from: a */
    public String m135615a() {
        return this.tabId;
    }

    /* JADX INFO: renamed from: b */
    public boolean m135616b() {
        return this.pageStyle == 1;
    }

    /* JADX INFO: renamed from: c */
    public void m135617c(int i) {
        this.pageStyle = i;
    }

    /* JADX INFO: renamed from: d */
    public void m135618d(String str) {
        this.tabId = str;
    }
}
