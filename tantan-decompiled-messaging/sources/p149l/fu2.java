package p149l;

/* JADX INFO: loaded from: classes11.dex */
public class fu2 extends du2 {
    /* JADX INFO: renamed from: d */
    public static void m123134d(String str, String str2) {
        if (str2.length() <= 4096) {
            du2.m113670a(str, str2);
            return;
        }
        int iCeil = (int) Math.ceil(((double) str2.length()) / 4096.0d);
        int i = 0;
        while (i < iCeil) {
            int i2 = i * 4096;
            i++;
            du2.m113670a(str, "chunk " + i + " of " + iCeil + ": " + str2.substring(i2, Math.min(i * 4096, str2.length())));
        }
    }
}
