package p149l;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class nij {

    /* JADX INFO: renamed from: d */
    private static final String[] f139103d = {"e30"};

    /* JADX INFO: renamed from: a */
    public String f139104a;

    /* JADX INFO: renamed from: b */
    public String f139105b;

    /* JADX INFO: renamed from: c */
    public ArrayList<kij> f139106c;

    /* JADX INFO: renamed from: a */
    public static boolean m159512a(String str) {
        int length = f139103d.length;
        for (int i = 0; i < length; i++) {
            if (f139103d[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "GameResourceList{bid='" + this.f139104a + "', version='" + this.f139105b + "', resources=" + this.f139106c + '}';
    }
}
