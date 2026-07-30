package p149l;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public class lhp0 {
    /* JADX INFO: renamed from: a */
    public static String m149848a(Context context) {
        return context.getFilesDir().getAbsolutePath() + File.separator + "web_ab_cache";
    }

    /* JADX INFO: renamed from: b */
    public static String m149849b(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m149848a(context));
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        sb.append(str3);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m149850c(Context context, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(m149848a(context));
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
    public static String m149851d(Context context, String str) {
        return m149848a(context) + File.separator + str;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m149852e(Context context, String str, String str2, String str3) {
        return !TextUtils.isEmpty(str2) && new File(m149850c(context, str, str2, str3)).exists();
    }
}
