package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.BloodType;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class b43 {
    /* JADX INFO: renamed from: a */
    public static String m100167a(BloodType bloodType) {
        String string = bloodType.toString();
        string.getClass();
        switch (string) {
            case "A":
                return CoreModule.f17544b.getString(R$string.f18899s0);
            case "B":
                return CoreModule.f17544b.getString(R$string.f18959u0);
            case "O":
                return CoreModule.f17544b.getString(R$string.f18989v0);
            case "AB":
                return CoreModule.f17544b.getString(R$string.f18929t0);
            case "UNKNOWN":
                return CoreModule.f17544b.getString(R$string.f19019w0);
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m100168b() {
        Locale locale = Locale.getDefault();
        return (locale != null && "ja".equals(locale.getLanguage())) || (locale != null && "ko".equals(locale.getLanguage()));
    }
}
