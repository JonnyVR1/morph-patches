package p153l;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public class pqp0 {
    /* JADX INFO: renamed from: a */
    public static String m173375a(Context context) {
        return context.getFilesDir().getAbsolutePath() + File.separator + "web_ab_cache";
    }

    /* JADX INFO: renamed from: b */
    public static String m173376b(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m173375a(context));
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        sb.append(str3);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m173377c(Context context, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(m173375a(context));
        String str4 = File.separator;
        sb.append(str4);
        sb.append(str);
        sb.append(str4);
        sb.append(str2);
        sb.append(str4);
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m173378d(Context context, String str) {
        return m173375a(context) + File.separator + str;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m173379e(Context context, String str, String str2, String str3) {
        return !TextUtils.isEmpty(str2) && new File(m173377c(context, str, str2, str3)).exists();
    }
}
