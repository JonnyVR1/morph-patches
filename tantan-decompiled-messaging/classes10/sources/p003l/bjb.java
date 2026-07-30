package p003l;

import com.p1.mobile.putong.core.CoreModule;
import java.util.Locale;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bjb extends vwb {
    /* JADX INFO: renamed from: q0 */
    public static boolean m5735q0() {
        Locale locale = CoreModule.b.getResources().getConfiguration().getLocales().get(0);
        return "zh".equalsIgnoreCase(locale.getLanguage()) && "CN".equalsIgnoreCase(locale.getCountry());
    }
}
