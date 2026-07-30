package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.putong.data.BloodType;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class b43 {
    /* JADX INFO: renamed from: a */
    public static String m12518a(BloodType bloodType) {
        String string = bloodType.toString();
        string.getClass();
        switch (string) {
            case "A":
                return CoreModule.f1533b.getString(R$string.f2888s0);
            case "B":
                return CoreModule.f1533b.getString(R$string.f2948u0);
            case "O":
                return CoreModule.f1533b.getString(R$string.f2978v0);
            case "AB":
                return CoreModule.f1533b.getString(R$string.f2918t0);
            case "UNKNOWN":
                return CoreModule.f1533b.getString(R$string.f3008w0);
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12519b() {
        Locale locale = Locale.getDefault();
        return (locale != null && "ja".equals(locale.getLanguage())) || (locale != null && "ko".equals(locale.getLanguage()));
    }
}
