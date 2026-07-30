package p006l;

import java.io.PrintWriter;
import java.io.StringWriter;
import l.l3f;
import l.nt2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class hfw {
    /* JADX INFO: renamed from: a */
    public static void m16208a(String str, String str2) {
        nt2.v(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m16209b(String str, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        m16208a(str, stringWriter.toString());
    }

    /* JADX INFO: renamed from: c */
    public static void m16210c(l3f l3fVar) {
        m16208a("[statistics]", l3fVar.c());
    }
}
