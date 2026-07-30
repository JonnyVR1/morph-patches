package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class psq0 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public static String f151038a = "wcc-ml-test10.bj";

    /* JADX INFO: renamed from: b */
    public static String f151039b;

    /* JADX INFO: renamed from: a */
    private int f151040a;

    /* JADX INFO: renamed from: a */
    private ssq0 f151041a;

    /* JADX INFO: renamed from: a */
    private boolean f151042a = osq0.f145486s;

    /* JADX INFO: renamed from: b */
    private boolean f151043b = true;

    /* JADX INFO: renamed from: c */
    private String f151044c;

    /* JADX INFO: renamed from: d */
    private String f151045d;

    /* JADX INFO: renamed from: e */
    private String f151046e;

    public psq0(Map<String, Integer> map, int i, String str, ssq0 ssq0Var) {
        m171240a(map, i, str, ssq0Var);
    }

    /* JADX INFO: renamed from: a */
    public static final String m171238a() {
        String str = f151039b;
        if (str != null) {
            return str;
        }
        if (gxq0.m128641c()) {
            return "sandbox.xmpush.xiaomi.com";
        }
        return gxq0.m128642d() ? "10.38.162.35" : "app.chat.xiaomi.net";
    }

    /* JADX INFO: renamed from: b */
    public void m171245b(String str) {
        this.f151046e = str;
    }

    /* JADX INFO: renamed from: c */
    public String m171246c() {
        if (this.f151045d == null) {
            this.f151045d = m171238a();
        }
        return this.f151045d;
    }

    /* JADX INFO: renamed from: b */
    public String m171244b() {
        return this.f151046e;
    }

    /* JADX INFO: renamed from: c */
    public void m171247c(String str) {
        this.f151045d = str;
    }

    /* JADX INFO: renamed from: a */
    public static final void m171239a(String str) {
        if (gxq0.m128642d()) {
            return;
        }
        f151039b = str;
    }

    /* JADX INFO: renamed from: a */
    private void m171240a(Map<String, Integer> map, int i, String str, ssq0 ssq0Var) {
        this.f151040a = i;
        this.f151044c = str;
    }

    /* JADX INFO: renamed from: a */
    public byte[] mo86369a() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public int m171241a() {
        return this.f151040a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m171243a() {
        return this.f151042a;
    }

    /* JADX INFO: renamed from: a */
    public void m171242a(boolean z) {
        this.f151042a = z;
    }
}
