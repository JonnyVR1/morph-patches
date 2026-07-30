package p149l;

/* JADX INFO: renamed from: l.qy */
/* JADX INFO: loaded from: classes9.dex */
public class C19604qy {
    /* JADX INFO: renamed from: a */
    public static String m177017a(String str) {
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
