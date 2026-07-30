package p149l;

import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.data.BloodType;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class c43 {
    /* JADX INFO: renamed from: a */
    public static String m105199a(BloodType bloodType) {
        String string = bloodType.toString();
        string.getClass();
        switch (string) {
            case "A":
                return App.f15369e.getString(R$string.f16057D);
            case "B":
                return App.f15369e.getString(R$string.f16067F);
            case "O":
                return App.f15369e.getString(R$string.f16072G);
            case "AB":
                return App.f15369e.getString(R$string.f16062E);
            case "UNKNOWN":
                return App.f15369e.getString(R$string.f16077H);
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m105200b() {
        Locale locale = Locale.getDefault();
        return (locale != null && "ja".equals(locale.getLanguage())) || (locale != null && "ko".equals(locale.getLanguage()));
    }
}
