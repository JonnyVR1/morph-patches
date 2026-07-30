package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.BloodType;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class r43 {
    /* JADX INFO: renamed from: a */
    public static String m179738a(BloodType bloodType) {
        String string = bloodType.toString();
        string.getClass();
        switch (string) {
            case "A":
                return CoreModule.f18263b.getString(R$string.f19632s0);
            case "B":
                return CoreModule.f18263b.getString(R$string.f19694u0);
            case "O":
                return CoreModule.f18263b.getString(R$string.f19725v0);
            case "AB":
                return CoreModule.f18263b.getString(R$string.f19663t0);
            case "UNKNOWN":
                return CoreModule.f18263b.getString(R$string.f19756w0);
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m179739b() {
        Locale locale = Locale.getDefault();
        return (locale != null && "ja".equals(locale.getLanguage())) || (locale != null && "ko".equals(locale.getLanguage()));
    }
}
