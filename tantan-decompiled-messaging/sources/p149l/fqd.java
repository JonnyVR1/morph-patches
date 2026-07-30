package p149l;

import fi.iki.elonen.NanoHTTPD;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: loaded from: classes2.dex */
public class fqd {
    /* JADX INFO: renamed from: a */
    public static NanoHTTPD.Response m122694a(String str, File file) throws FileNotFoundException {
        return NanoHTTPD.m86934p(NanoHTTPD.Response.Status.OK, str, new FileInputStream(file), file.length());
    }

    /* JADX INFO: renamed from: b */
    public static NanoHTTPD.Response m122695b() {
        return NanoHTTPD.m86935q(NanoHTTPD.Response.Status.BAD_REQUEST, MimeTypes.TEXT_PLAIN, "no bid!");
    }

    /* JADX INFO: renamed from: c */
    public static NanoHTTPD.Response m122696c(NanoHTTPD.Method method) {
        return m122697d("no method implement for : " + method);
    }

    /* JADX INFO: renamed from: d */
    public static NanoHTTPD.Response m122697d(String str) {
        return NanoHTTPD.m86935q(NanoHTTPD.Response.Status.NOT_IMPLEMENTED, MimeTypes.TEXT_PLAIN, str);
    }

    /* JADX INFO: renamed from: e */
    public static NanoHTTPD.Response m122698e(String str, Map<String, String> map, NanoHTTPD.Method method) {
        return m122697d(String.format("no %s method implement for request[%s] with params%s", method != null ? method.toString() : "null", str, map != null ? map.toString() : "null"));
    }

    /* JADX INFO: renamed from: f */
    public static NanoHTTPD.Response m122699f() {
        return NanoHTTPD.m86935q(NanoHTTPD.Response.Status.BAD_REQUEST, MimeTypes.TEXT_PLAIN, "no real uri!");
    }

    /* JADX INFO: renamed from: g */
    public static NanoHTTPD.Response m122700g() {
        return NanoHTTPD.m86935q(NanoHTTPD.Response.Status.FORBIDDEN, MimeTypes.TEXT_PLAIN, "this local server is not for your business!");
    }

    /* JADX INFO: renamed from: h */
    public static NanoHTTPD.Response m122701h(String str) {
        return NanoHTTPD.m86935q(NanoHTTPD.Response.Status.NOT_FOUND, MimeTypes.TEXT_PLAIN, str);
    }

    /* JADX INFO: renamed from: i */
    public static NanoHTTPD.Response m122702i() {
        return NanoHTTPD.m86935q(NanoHTTPD.Response.Status.UNAUTHORIZED, MimeTypes.TEXT_PLAIN, "sign not right!");
    }
}
