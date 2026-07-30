package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class sd5 {
    /* JADX INFO: renamed from: a */
    public static void m183443a(Object obj, Object obj2) {
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(strValueOf);
            throw new NullPointerException(sb.toString());
        }
        if (obj2 != null) {
            return;
        }
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(strValueOf2);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }

    /* JADX INFO: renamed from: b */
    public static int m183444b(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public static long m183445c(long j, String str) {
        if (j >= 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: d */
    public static void m183446d(int i, String str) {
        if (i > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38);
        sb.append(str);
        sb.append(" must be positive but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: e */
    public static void m183447e(boolean z) {
        sf80.m183901w(z, "no calls to next() since the last call to remove()");
    }
}
