package p149l;

import com.alibaba.sdk.android.oss.signer.SignParameters;

/* JADX INFO: loaded from: classes13.dex */
public class jji0 {
    /* JADX INFO: renamed from: a */
    public static String m141805a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append("    at ");
            sb.append(stackTraceElement.toString());
            sb.append(SignParameters.NEW_LINE);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m141806b(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
