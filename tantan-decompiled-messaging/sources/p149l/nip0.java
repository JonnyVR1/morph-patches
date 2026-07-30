package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.p046p1.mobile.putong.data.WebPageOfflineConfig;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public class nip0 {
    /* JADX INFO: renamed from: a */
    public static String m159542a(Context context) {
        return context.getFilesDir().getAbsolutePath() + File.separator + "web_offline_cache";
    }

    /* JADX INFO: renamed from: b */
    public static String m159543b(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m159542a(context));
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        sb.append(str3);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m159544c(Context context) {
        return m159542a(context) + File.separator + "download";
    }

    /* JADX INFO: renamed from: d */
    public static String m159545d(Context context, String str) {
        return m159544c(context) + File.separator + str;
    }

    /* JADX INFO: renamed from: e */
    public static String m159546e(Context context, WebPageOfflineConfig webPageOfflineConfig) {
        return m159542a(context) + File.separator + webPageOfflineConfig.index;
    }

    /* JADX INFO: renamed from: f */
    public static String m159547f(Context context, WebPageOfflineConfig webPageOfflineConfig) {
        return "file:" + m159546e(context, webPageOfflineConfig);
    }

    /* JADX INFO: renamed from: g */
    public static String m159548g(Context context, String str) {
        return m159542a(context) + File.separator + str;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m159549h(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return new File(m159543b(context, str, str2)).exists();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m159550i(Context context, String str) {
        return m159549h(context, "download", str);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m159551j(Context context, WebPageOfflineConfig webPageOfflineConfig) {
        return new File(m159546e(context, webPageOfflineConfig)).exists();
    }
}
