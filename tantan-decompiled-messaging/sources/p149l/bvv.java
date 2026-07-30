package p149l;

import android.text.TextUtils;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class bvv {
    /* JADX INFO: renamed from: a */
    public static boolean m104078a() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.m81303a(language)) {
            return language.startsWith("zh");
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m104079b() {
        Locale locale = Locale.getDefault();
        return locale != null && "zh".equals(locale.getLanguage()) && "CN".equals(locale.getCountry());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m104080c() {
        return m104078a() && TextUtils.equals(Locale.getDefault().getScript(), "Hant");
    }
}
