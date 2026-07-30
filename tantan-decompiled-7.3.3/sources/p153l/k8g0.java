package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class k8g0 {

    /* JADX INFO: renamed from: a */
    private static final char[] f124379a = "&quot;".toCharArray();

    /* JADX INFO: renamed from: b */
    private static final char[] f124380b = "&apos;".toCharArray();

    /* JADX INFO: renamed from: c */
    private static final char[] f124381c = "&amp;".toCharArray();

    /* JADX INFO: renamed from: d */
    private static final char[] f124382d = "&lt;".toCharArray();

    /* JADX INFO: renamed from: e */
    private static final char[] f124383e = "&gt;".toCharArray();

    /* JADX INFO: renamed from: a */
    public static boolean m148708a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static boolean m148709b(CharSequence charSequence) {
        return !m148708a(charSequence);
    }
}
