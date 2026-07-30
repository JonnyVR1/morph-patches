package p153l;

import org.eclipse.jetty.http.HttpMethods;

/* JADX INFO: loaded from: classes2.dex */
public final class zml {
    /* JADX INFO: renamed from: a */
    public static boolean m220392a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals(HttpMethods.PUT) || str.equals(HttpMethods.DELETE) || str.equals(HttpMethods.MOVE);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m220393b(String str) {
        return (str.equals("GET") || str.equals(HttpMethods.HEAD)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m220394c(String str) {
        return !str.equals("PROPFIND");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m220395d(String str) {
        return str.equals("PROPFIND");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m220396e(String str) {
        return str.equals("POST") || str.equals(HttpMethods.PUT) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
