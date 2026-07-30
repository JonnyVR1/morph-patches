package p009l;

import android.text.TextUtils;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bvv {
    /* JADX INFO: renamed from: a */
    public static boolean m12298a() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.a(language)) {
            return language.startsWith("zh");
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12299b() {
        Locale locale = Locale.getDefault();
        return locale != null && "zh".equals(locale.getLanguage()) && "CN".equals(locale.getCountry());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m12300c() {
        return m12298a() && TextUtils.equals(Locale.getDefault().getScript(), "Hant");
    }
}
