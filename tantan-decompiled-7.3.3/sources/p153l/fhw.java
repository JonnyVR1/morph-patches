package p153l;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes9.dex */
public class fhw {
    /* JADX INFO: renamed from: a */
    public static void m125605a(String str, String str2) {
        du2.m118062v(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m125606b(String str, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        m125605a(str, stringWriter.toString());
    }

    /* JADX INFO: renamed from: c */
    public static void m125607c(q4f q4fVar) {
        m125605a("[statistics]", q4fVar.m175211c());
    }
}
