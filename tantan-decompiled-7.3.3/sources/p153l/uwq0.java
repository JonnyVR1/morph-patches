package p153l;

import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes2.dex */
public final class uwq0 {

    /* JADX INFO: renamed from: a */
    private String f181317a;

    /* JADX INFO: renamed from: b */
    private int f181318b;

    public uwq0(String str, int i) {
        this.f181317a = str;
        this.f181318b = i;
    }

    /* JADX INFO: renamed from: c */
    public static InetSocketAddress m198387c(String str, int i) {
        uwq0 uwq0VarM198388d = m198388d(str, i);
        return new InetSocketAddress(uwq0VarM198388d.m198390b(), uwq0VarM198388d.m198389a());
    }

    /* JADX INFO: renamed from: d */
    public static uwq0 m198388d(String str, int i) {
        int iLastIndexOf = str.lastIndexOf(":");
        if (iLastIndexOf != -1) {
            String strSubstring = str.substring(0, iLastIndexOf);
            try {
                int i2 = Integer.parseInt(str.substring(iLastIndexOf + 1));
                if (i2 > 0) {
                    i = i2;
                }
            } catch (NumberFormatException unused) {
            }
            str = strSubstring;
        }
        return new uwq0(str, i);
    }

    /* JADX INFO: renamed from: a */
    public int m198389a() {
        return this.f181318b;
    }

    /* JADX INFO: renamed from: b */
    public String m198390b() {
        return this.f181317a;
    }

    public String toString() {
        int i = this.f181318b;
        String str = this.f181317a;
        if (i <= 0) {
            return str;
        }
        return str + ":" + this.f181318b;
    }
}
