package p153l;

import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.PrintWriter;
import java.io.StringWriter;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class ysg0 {

    /* JADX INFO: renamed from: a */
    public static twg0 f201404a;

    /* JADX INFO: renamed from: a */
    public static String m217255a(Exception exc) {
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
    public static void m217256b(String str) {
        if (f201404a == null) {
            return;
        }
        LogUtils.file(5, "SudNative", str);
        if (mzg0.f139508m) {
            SudLogger.m222819w("SudNative", str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m217257c(String str, String str2) {
        if (f201404a == null) {
            return;
        }
        LogUtils.file(6, str, str2);
        if (mzg0.f139508m) {
            SudLogger.m222813e(str, str2);
        } else {
            SudLogger.m222813e(str, str2);
        }
    }
}
