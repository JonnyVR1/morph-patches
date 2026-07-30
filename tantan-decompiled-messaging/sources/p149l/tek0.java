package p149l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;

/* JADX INFO: loaded from: classes13.dex */
public class tek0 {
    /* JADX INFO: renamed from: a */
    public static boolean m188522a(String str) {
        return (TextUtils.isEmpty(str) || str.contains("java.util.concurrent") || str.contains("com.tantanapp.beatles.thread.detector") || str.startsWith("android.")) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static String m188523b(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < stackTraceElementArr.length; i++) {
            String string = stackTraceElementArr[i].toString();
            if (m188522a(string)) {
                sb.append("at ");
                sb.append(string);
                sb.append(SignParameters.NEW_LINE);
            }
        }
        return sb.toString();
    }
}
