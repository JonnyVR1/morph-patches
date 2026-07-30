package p149l;

import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes2.dex */
public final class onq0 {

    /* JADX INFO: renamed from: a */
    private String f144816a;

    /* JADX INFO: renamed from: b */
    private int f144817b;

    public onq0(String str, int i) {
        this.f144816a = str;
        this.f144817b = i;
    }

    /* JADX INFO: renamed from: c */
    public static InetSocketAddress m165224c(String str, int i) {
        onq0 onq0VarM165225d = m165225d(str, i);
        return new InetSocketAddress(onq0VarM165225d.m165227b(), onq0VarM165225d.m165226a());
    }

    /* JADX INFO: renamed from: d */
    public static onq0 m165225d(String str, int i) {
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
        return new onq0(str, i);
    }

    /* JADX INFO: renamed from: a */
    public int m165226a() {
        return this.f144817b;
    }

    /* JADX INFO: renamed from: b */
    public String m165227b() {
        return this.f144816a;
    }

    public String toString() {
        int i = this.f144817b;
        String str = this.f144816a;
        if (i <= 0) {
            return str;
        }
        return str + ":" + this.f144817b;
    }
}
