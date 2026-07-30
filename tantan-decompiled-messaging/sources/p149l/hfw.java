package p149l;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes9.dex */
public class hfw {
    /* JADX INFO: renamed from: a */
    public static void m130790a(String str, String str2) {
        nt2.m160831v(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m130791b(String str, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        m130790a(str, stringWriter.toString());
    }

    /* JADX INFO: renamed from: c */
    public static void m130792c(l3f l3fVar) {
        m130790a("[statistics]", l3fVar.m148393c());
    }
}
