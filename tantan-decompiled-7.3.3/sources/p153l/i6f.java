package p153l;

import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes11.dex */
public class i6f {
    /* JADX INFO: renamed from: a */
    public static String m138813a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.length() > 500 ? str.substring(0, 500) : str;
    }

    /* JADX INFO: renamed from: b */
    public static String m138814b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.getBuffer().toString();
    }
}
