package p153l;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes7.dex */
public class g8g0 {
    /* JADX INFO: renamed from: a */
    public static String m129406a(Exception exc) {
        if (exc == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m129407b() {
        String strValueOf = String.valueOf(System.currentTimeMillis());
        return strValueOf.length() > 5 ? strValueOf.substring(strValueOf.length() - 5, strValueOf.length() - 1) : strValueOf;
    }
}
