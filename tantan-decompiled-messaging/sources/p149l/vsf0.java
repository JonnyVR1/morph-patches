package p149l;

import com.alibaba.sdk.android.oss.signer.SignParameters;

/* JADX INFO: loaded from: classes13.dex */
public class vsf0 {
    /* JADX INFO: renamed from: a */
    public static String m199866a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append(" at ");
            sb.append(stackTraceElement.toString());
            sb.append(SignParameters.NEW_LINE);
        }
        return sb.toString();
    }
}
