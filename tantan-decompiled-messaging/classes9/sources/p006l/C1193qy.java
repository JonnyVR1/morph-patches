package p006l;

/* JADX INFO: renamed from: l.qy */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1193qy {
    /* JADX INFO: renamed from: a */
    public static String m22513a(String str) {
        if (str.length() <= 4) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder();
        int iMin = Math.min(str.length() - 4, 4);
        for (int i = 0; i < iMin; i++) {
            sb2.append("*");
        }
        return sb.replace(Math.max(0, str.length() - 8), str.length() - 4, sb2.toString()).toString();
    }
}
