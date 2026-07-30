package p153l;

import com.alibaba.sdk.android.oss.signer.SignParameters;

/* JADX INFO: loaded from: classes11.dex */
public class jsi0 {
    /* JADX INFO: renamed from: a */
    public static String m146842a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append("    at ");
            sb.append(stackTraceElement.toString());
            sb.append(SignParameters.NEW_LINE);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m146843b(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
