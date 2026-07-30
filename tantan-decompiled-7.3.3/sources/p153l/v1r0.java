package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class v1r0 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public static String f181994a = "wcc-ml-test10.bj";

    /* JADX INFO: renamed from: b */
    public static String f181995b;

    /* JADX INFO: renamed from: a */
    private int f181996a;

    /* JADX INFO: renamed from: a */
    private y1r0 f181997a;

    /* JADX INFO: renamed from: a */
    private boolean f181998a = u1r0.f177111s;

    /* JADX INFO: renamed from: b */
    private boolean f181999b = true;

    /* JADX INFO: renamed from: c */
    private String f182000c;

    /* JADX INFO: renamed from: d */
    private String f182001d;

    /* JADX INFO: renamed from: e */
    private String f182002e;

    public v1r0(Map<String, Integer> map, int i, String str, y1r0 y1r0Var) {
        m199053a(map, i, str, y1r0Var);
    }

    /* JADX INFO: renamed from: a */
    public static final String m199051a() {
        String str = f181995b;
        if (str != null) {
            return str;
        }
        if (m6r0.m157263c()) {
            return "sandbox.xmpush.xiaomi.com";
        }
        return m6r0.m157264d() ? "10.38.162.35" : "app.chat.xiaomi.net";
    }

    /* JADX INFO: renamed from: b */
    public void m199058b(String str) {
        this.f182002e = str;
    }

    /* JADX INFO: renamed from: c */
    public String m199059c() {
        if (this.f182001d == null) {
            this.f182001d = m199051a();
        }
        return this.f182001d;
    }

    /* JADX INFO: renamed from: b */
    public String m199057b() {
        return this.f182002e;
    }

    /* JADX INFO: renamed from: c */
    public void m199060c(String str) {
        this.f182001d = str;
    }

    /* JADX INFO: renamed from: a */
    public static final void m199052a(String str) {
        if (m6r0.m157264d()) {
            return;
        }
        f181995b = str;
    }

    /* JADX INFO: renamed from: a */
    private void m199053a(Map<String, Integer> map, int i, String str, y1r0 y1r0Var) {
        this.f181996a = i;
        this.f182000c = str;
    }

    /* JADX INFO: renamed from: a */
    public byte[] mo87540a() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public int m199054a() {
        return this.f181996a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m199056a() {
        return this.f181998a;
    }

    /* JADX INFO: renamed from: a */
    public void m199055a(boolean z) {
        this.f181998a = z;
    }
}
