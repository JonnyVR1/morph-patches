package p153l;

/* JADX INFO: loaded from: classes13.dex */
public class zvr {

    /* JADX INFO: renamed from: a */
    public static final String f206280a = qv5.f159701e + "/v2";

    /* JADX INFO: renamed from: a */
    public static String m221801a(String str) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        return m221802b("/anchors".concat(str));
    }

    /* JADX INFO: renamed from: b */
    public static String m221802b(String str) {
        return f206280a + str;
    }

    /* JADX INFO: renamed from: c */
    public static String m221803c(String str) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        return m221802b("/fanbase-groups".concat(str));
    }

    /* JADX INFO: renamed from: d */
    public static String m221804d(String str) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        return m221802b("/fanbases".concat(str));
    }

    /* JADX INFO: renamed from: e */
    public static String m221805e(String str) {
        return m221802b("/live" + str);
    }

    /* JADX INFO: renamed from: f */
    public static String m221806f(String str) {
        return m221802b("/lives" + str);
    }

    /* JADX INFO: renamed from: g */
    public static String m221807g(String str) {
        return m221802b("/live-banners" + str);
    }

    /* JADX INFO: renamed from: h */
    public static String m221808h(String str) {
        return m221809i("/me" + str);
    }

    /* JADX INFO: renamed from: i */
    public static String m221809i(String str) {
        return m221802b("/users" + str);
    }
}
