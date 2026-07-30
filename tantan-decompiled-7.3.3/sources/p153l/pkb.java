package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class pkb extends jyb {
    /* JADX INFO: renamed from: q0 */
    public static boolean m172596q0() {
        Locale locale = CoreModule.f18263b.getResources().getConfiguration().getLocales().get(0);
        return "zh".equalsIgnoreCase(locale.getLanguage()) && "CN".equalsIgnoreCase(locale.getCountry());
    }
}
