package p153l;

import com.alibaba.sdk.android.oss.signer.SignParameters;

/* JADX INFO: loaded from: classes11.dex */
public class e1g0 {
    /* JADX INFO: renamed from: a */
    public static String m118971a(StackTraceElement[] stackTraceElementArr) {
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
