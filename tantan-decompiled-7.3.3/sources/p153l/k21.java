package p153l;

import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class k21 {
    /* JADX INFO: renamed from: a */
    public static String m147937a() {
        return m147939c() ? "帮助与反馈" : "help";
    }

    /* JADX INFO: renamed from: b */
    public static boolean m147938b() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.m82486a(language)) {
            return language.startsWith("en") || language.startsWith("zh");
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m147939c() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.m82486a(language)) {
            return language.startsWith("zh");
        }
        return false;
    }
}
