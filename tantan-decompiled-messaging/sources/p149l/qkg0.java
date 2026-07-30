package p149l;

import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.PrintWriter;
import java.io.StringWriter;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class qkg0 {

    /* JADX INFO: renamed from: a */
    public static log0 f155121a;

    /* JADX INFO: renamed from: a */
    public static String m175375a(Exception exc) {
        StringBuffer stringBuffer = new StringBuffer();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        exc.printStackTrace(printWriter);
        for (Throwable cause = exc.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        printWriter.close();
        stringBuffer.append(stringWriter.toString());
        stringBuffer.append(SignParameters.NEW_LINE + Log.getStackTraceString(exc));
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m175376b(String str) {
        if (f155121a == null) {
            return;
        }
        LogUtils.file(5, "SudNative", str);
        if (erg0.f92916m) {
            SudLogger.m221573w("SudNative", str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m175377c(String str, String str2) {
        if (f155121a == null) {
            return;
        }
        LogUtils.file(6, str, str2);
        if (erg0.f92916m) {
            SudLogger.m221567e(str, str2);
        } else {
            SudLogger.m221567e(str, str2);
        }
    }
}
