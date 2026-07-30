package p006l;

import android.content.Context;
import android.text.TextUtils;
import com.p1.mobile.putong.data.WebPageOfflineConfig;
import java.io.File;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class nip0 {
    /* JADX INFO: renamed from: a */
    public static String m20143a(Context context) {
        return context.getFilesDir().getAbsolutePath() + File.separator + "web_offline_cache";
    }

    /* JADX INFO: renamed from: b */
    public static String m20144b(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m20143a(context));
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        sb.append(str3);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m20145c(Context context) {
        return m20143a(context) + File.separator + "download";
    }

    /* JADX INFO: renamed from: d */
    public static String m20146d(Context context, String str) {
        return m20145c(context) + File.separator + str;
    }

    /* JADX INFO: renamed from: e */
    public static String m20147e(Context context, WebPageOfflineConfig webPageOfflineConfig) {
        return m20143a(context) + File.separator + webPageOfflineConfig.index;
    }

    /* JADX INFO: renamed from: f */
    public static String m20148f(Context context, WebPageOfflineConfig webPageOfflineConfig) {
        return "file:" + m20147e(context, webPageOfflineConfig);
    }

    /* JADX INFO: renamed from: g */
    public static String m20149g(Context context, String str) {
        return m20143a(context) + File.separator + str;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m20150h(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return new File(m20144b(context, str, str2)).exists();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m20151i(Context context, String str) {
        return m20150h(context, "download", str);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m20152j(Context context, WebPageOfflineConfig webPageOfflineConfig) {
        return new File(m20147e(context, webPageOfflineConfig)).exists();
    }
}
