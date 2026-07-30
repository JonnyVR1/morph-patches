package p153l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;

/* JADX INFO: loaded from: classes11.dex */
public class znk0 {
    /* JADX INFO: renamed from: a */
    public static boolean m220601a(String str) {
        return (TextUtils.isEmpty(str) || str.contains("java.util.concurrent") || str.contains("com.tantanapp.beatles.thread.detector") || str.startsWith("android.")) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static String m220602b(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < stackTraceElementArr.length; i++) {
            String string = stackTraceElementArr[i].toString();
            if (m220601a(string)) {
                sb.append("at ");
                sb.append(string);
                sb.append(SignParameters.NEW_LINE);
            }
        }
        return sb.toString();
    }
}
