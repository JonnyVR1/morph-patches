package p006l;

import com.p000p1.mobile.putong.account.R$string;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.BloodType;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class c43 {
    /* JADX INFO: renamed from: a */
    public static String m13143a(BloodType bloodType) {
        String string = bloodType.toString();
        string.getClass();
        switch (string) {
            case "A":
                return App.e.getString(R$string.f46D);
            case "B":
                return App.e.getString(R$string.f56F);
            case "O":
                return App.e.getString(R$string.f61G);
            case "AB":
                return App.e.getString(R$string.f51E);
            case "UNKNOWN":
                return App.e.getString(R$string.f66H);
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m13144b() {
        Locale locale = Locale.getDefault();
        return (locale != null && "ja".equals(locale.getLanguage())) || (locale != null && "ko".equals(locale.getLanguage()));
    }
}
