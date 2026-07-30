package p153l;

/* JADX INFO: loaded from: classes10.dex */
public class vu2 extends tu2 {
    /* JADX INFO: renamed from: d */
    public static void m202772d(String str, String str2) {
        if (str2.length() <= 4096) {
            tu2.m192703a(str, str2);
            return;
        }
        int iCeil = (int) Math.ceil(((double) str2.length()) / 4096.0d);
        int i = 0;
        while (i < iCeil) {
            int i2 = i * 4096;
            i++;
            tu2.m192703a(str, "chunk " + i + " of " + iCeil + ": " + str2.substring(i2, Math.min(i * 4096, str2.length())));
        }
    }
}
