package p153l;

import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.data.BloodType;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class s43 {
    /* JADX INFO: renamed from: a */
    public static String m184432a(BloodType bloodType) {
        String string = bloodType.toString();
        string.getClass();
        switch (string) {
            case "A":
                return App.f16088e.getString(R$string.f16776D);
            case "B":
                return App.f16088e.getString(R$string.f16786F);
            case "O":
                return App.f16088e.getString(R$string.f16791G);
            case "AB":
                return App.f16088e.getString(R$string.f16781E);
            case "UNKNOWN":
                return App.f16088e.getString(R$string.f16796H);
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m184433b() {
        Locale locale = Locale.getDefault();
        return (locale != null && "ja".equals(locale.getLanguage())) || (locale != null && "ko".equals(locale.getLanguage()));
    }
}
