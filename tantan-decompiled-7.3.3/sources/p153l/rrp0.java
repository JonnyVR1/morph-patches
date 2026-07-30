package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.p051p1.mobile.putong.data.WebPageOfflineConfig;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public class rrp0 {
    /* JADX INFO: renamed from: a */
    public static String m182805a(Context context) {
        return context.getFilesDir().getAbsolutePath() + File.separator + "web_offline_cache";
    }

    /* JADX INFO: renamed from: b */
    public static String m182806b(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m182805a(context));
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        sb.append(str3);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m182807c(Context context) {
        return m182805a(context) + File.separator + "download";
    }

    /* JADX INFO: renamed from: d */
    public static String m182808d(Context context, String str) {
        return m182807c(context) + File.separator + str;
    }

    /* JADX INFO: renamed from: e */
    public static String m182809e(Context context, WebPageOfflineConfig webPageOfflineConfig) {
        return m182805a(context) + File.separator + webPageOfflineConfig.index;
    }

    /* JADX INFO: renamed from: f */
    public static String m182810f(Context context, WebPageOfflineConfig webPageOfflineConfig) {
        return "file:" + m182809e(context, webPageOfflineConfig);
    }

    /* JADX INFO: renamed from: g */
    public static String m182811g(Context context, String str) {
        return m182805a(context) + File.separator + str;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m182812h(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return new File(m182806b(context, str, str2)).exists();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m182813i(Context context, String str) {
        return m182812h(context, "download", str);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m182814j(Context context, WebPageOfflineConfig webPageOfflineConfig) {
        return new File(m182809e(context, webPageOfflineConfig)).exists();
    }
}
