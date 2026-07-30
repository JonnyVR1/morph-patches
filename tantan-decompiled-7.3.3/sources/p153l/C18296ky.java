package p153l;

/* JADX INFO: renamed from: l.ky */
/* JADX INFO: loaded from: classes9.dex */
public class C18296ky {
    /* JADX INFO: renamed from: a */
    public static String m151902a(String str) {
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
