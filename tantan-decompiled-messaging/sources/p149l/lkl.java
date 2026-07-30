package p149l;

import org.eclipse.jetty.http.HttpMethods;

/* JADX INFO: loaded from: classes2.dex */
public final class lkl {
    /* JADX INFO: renamed from: a */
    public static boolean m150369a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals(HttpMethods.PUT) || str.equals(HttpMethods.DELETE) || str.equals(HttpMethods.MOVE);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m150370b(String str) {
        return (str.equals("GET") || str.equals(HttpMethods.HEAD)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m150371c(String str) {
        return !str.equals("PROPFIND");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m150372d(String str) {
        return str.equals("PROPFIND");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m150373e(String str) {
        return str.equals("POST") || str.equals(HttpMethods.PUT) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
