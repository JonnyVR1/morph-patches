package p149l;

import android.text.SpannableStringBuilder;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class dfj {
    /* JADX INFO: renamed from: a */
    public static SpannableStringBuilder m111464a(String str, List<String> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < list.size(); i++) {
            String str2 = list.get(i);
            int iIndexOf = str.indexOf(str2);
            if (iIndexOf != -1) {
                spannableStringBuilder.setSpan(new qed0(t100.f167255d, -866711, -1, new qed0.C19470a(3, t100.m186890d(14.0f), str2.length() + iIndexOf)), iIndexOf, str2.length() + iIndexOf, 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public static String m111465b(int i) {
        if (!IntlCountryCodeController.m28110f()) {
            return i0g0.m133879s(i, false, true);
        }
        int iM133844K = (int) i0g0.m133844K(i);
        if (iM133844K <= 1) {
            return "1 " + CoreModule.f17544b.getString(R$string.f18035Pi);
        }
        if (iM133844K > 99) {
            return "99+ " + CoreModule.f17544b.getString(R$string.f18005Oi);
        }
        return iM133844K + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f17544b.getString(R$string.f18005Oi);
    }

    /* JADX INFO: renamed from: c */
    public static String m111466c(int i) {
        if (!IntlCountryCodeController.m28110f()) {
            return i0g0.m133879s(i, false, true);
        }
        int iM133844K = (int) i0g0.m133844K(i);
        if (iM133844K <= 1) {
            return "1" + CoreModule.f17544b.getString(R$string.f18035Pi);
        }
        if (iM133844K > 99) {
            return "99+" + CoreModule.f17544b.getString(R$string.f18005Oi);
        }
        return iM133844K + CoreModule.f17544b.getString(R$string.f18005Oi);
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m111467d(User user) {
        String string;
        int iIntValue = user.age.intValue();
        Location location = user.location;
        if (iIntValue >= 40) {
            String strM111465b = m111465b(location.distance);
            return m111464a(TEnum.equals(user.gender, "female") ? CoreModule.f17544b.getString(R$string.f17889Km, strM111465b) : CoreModule.f17544b.getString(R$string.f17919Lm, strM111465b), vwb.m200324f0(strM111465b));
        }
        String strM111465b2 = m111465b(location.distance);
        String str = user.age + CoreModule.f17544b.getString(R$string.f17739Fm);
        boolean zEquals = "zh".equals(CoreModule.f17544b.getResources().getConfiguration().locale.getLanguage());
        Gender gender = user.gender;
        if (zEquals) {
            string = TEnum.equals(gender, "female") ? CoreModule.f17544b.getString(R$string.f17769Gm, strM111465b2, str) : CoreModule.f17544b.getString(R$string.f17859Jm, strM111465b2, str);
        } else {
            string = TEnum.equals(gender, "female") ? CoreModule.f17544b.getString(R$string.f17769Gm, str, strM111465b2) : CoreModule.f17544b.getString(R$string.f17859Jm, str, strM111465b2);
        }
        return m111464a(string, vwb.m200324f0(str, strM111465b2));
    }
}
