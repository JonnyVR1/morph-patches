package p153l;

import android.text.TextUtils;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class cxv {
    /* JADX INFO: renamed from: a */
    public static boolean m113069a() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.m82486a(language)) {
            return language.startsWith("zh");
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m113070b() {
        Locale locale = Locale.getDefault();
        return locale != null && "zh".equals(locale.getLanguage()) && "CN".equals(locale.getCountry());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m113071c() {
        return m113069a() && TextUtils.equals(Locale.getDefault().getScript(), "Hant");
    }
}
