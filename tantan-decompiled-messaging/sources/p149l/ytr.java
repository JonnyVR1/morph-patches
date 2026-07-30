package p149l;

/* JADX INFO: loaded from: classes13.dex */
public class ytr {

    /* JADX INFO: renamed from: a */
    public static final String f200010a = mu5.f135737e + "/v2";

    /* JADX INFO: renamed from: a */
    public static String m216072a(String str) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        return m216073b("/anchors".concat(str));
    }

    /* JADX INFO: renamed from: b */
    public static String m216073b(String str) {
        return f200010a + str;
    }

    /* JADX INFO: renamed from: c */
    public static String m216074c(String str) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        return m216073b("/fanbase-groups".concat(str));
    }

    /* JADX INFO: renamed from: d */
    public static String m216075d(String str) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        return m216073b("/fanbases".concat(str));
    }

    /* JADX INFO: renamed from: e */
    public static String m216076e(String str) {
        return m216073b("/live" + str);
    }

    /* JADX INFO: renamed from: f */
    public static String m216077f(String str) {
        return m216073b("/lives" + str);
    }

    /* JADX INFO: renamed from: g */
    public static String m216078g(String str) {
        return m216073b("/live-banners" + str);
    }

    /* JADX INFO: renamed from: h */
    public static String m216079h(String str) {
        return m216080i("/me" + str);
    }

    /* JADX INFO: renamed from: i */
    public static String m216080i(String str) {
        return m216073b("/users" + str);
    }
}
