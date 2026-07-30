package p149l;

import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class d21 {
    /* JADX INFO: renamed from: a */
    public static String m109702a() {
        return m109704c() ? "帮助与反馈" : "help";
    }

    /* JADX INFO: renamed from: b */
    public static boolean m109703b() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.m81303a(language)) {
            return language.startsWith("en") || language.startsWith("zh");
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m109704c() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.m81303a(language)) {
            return language.startsWith("zh");
        }
        return false;
    }
}
