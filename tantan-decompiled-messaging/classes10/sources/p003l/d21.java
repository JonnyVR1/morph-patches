package p003l;

import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class d21 {
    /* JADX INFO: renamed from: a */
    public static String m6037a() {
        return m6039c() ? "帮助与反馈" : "help";
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6038b() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.a(language)) {
            return language.startsWith("en") || language.startsWith("zh");
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6039c() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.a(language)) {
            return language.startsWith("zh");
        }
        return false;
    }
}
