package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class bjb extends vwb {
    /* JADX INFO: renamed from: q0 */
    public static boolean m102165q0() {
        Locale locale = CoreModule.f17544b.getResources().getConfiguration().getLocales().get(0);
        return "zh".equalsIgnoreCase(locale.getLanguage()) && "CN".equalsIgnoreCase(locale.getCountry());
    }
}
