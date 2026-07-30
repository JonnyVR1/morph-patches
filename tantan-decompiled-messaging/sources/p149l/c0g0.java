package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class c0g0 {

    /* JADX INFO: renamed from: a */
    private static final char[] f78145a = "&quot;".toCharArray();

    /* JADX INFO: renamed from: b */
    private static final char[] f78146b = "&apos;".toCharArray();

    /* JADX INFO: renamed from: c */
    private static final char[] f78147c = "&amp;".toCharArray();

    /* JADX INFO: renamed from: d */
    private static final char[] f78148d = "&lt;".toCharArray();

    /* JADX INFO: renamed from: e */
    private static final char[] f78149e = "&gt;".toCharArray();

    /* JADX INFO: renamed from: a */
    public static boolean m104750a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static boolean m104751b(CharSequence charSequence) {
        return !m104750a(charSequence);
    }
}
