package p006l;

import android.text.SpannableStringBuilder;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import l.i0g0;
import l.qed0;
import l.t100;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class dfj {
    /* JADX INFO: renamed from: a */
    public static SpannableStringBuilder m14020a(String str, List<String> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < list.size(); i++) {
            String str2 = list.get(i);
            int iIndexOf = str.indexOf(str2);
            if (iIndexOf != -1) {
                spannableStringBuilder.setSpan(new qed0(t100.d, -866711, -1, new qed0.a[]{new qed0.a(3, t100.d(14.0f), str2.length() + iIndexOf)}), iIndexOf, str2.length() + iIndexOf, 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public static String m14021b(int i) {
        if (!IntlCountryCodeController.m5f()) {
            return i0g0.s(i, false, true);
        }
        int iK = (int) i0g0.K(i);
        if (iK <= 1) {
            return "1 " + CoreModule.f1533b.getString(R$string.f2024Pi);
        }
        if (iK > 99) {
            return "99+ " + CoreModule.f1533b.getString(R$string.f1994Oi);
        }
        return iK + " " + CoreModule.f1533b.getString(R$string.f1994Oi);
    }

    /* JADX INFO: renamed from: c */
    public static String m14022c(int i) {
        if (!IntlCountryCodeController.m5f()) {
            return i0g0.s(i, false, true);
        }
        int iK = (int) i0g0.K(i);
        if (iK <= 1) {
            return "1" + CoreModule.f1533b.getString(R$string.f2024Pi);
        }
        if (iK > 99) {
            return "99+" + CoreModule.f1533b.getString(R$string.f1994Oi);
        }
        return iK + CoreModule.f1533b.getString(R$string.f1994Oi);
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m14023d(User user) {
        String string;
        int iIntValue = user.age.intValue();
        Location location = user.location;
        if (iIntValue >= 40) {
            String strM14021b = m14021b(location.distance);
            return m14020a(TEnum.equals(user.gender, "female") ? CoreModule.f1533b.getString(R$string.f1878Km, strM14021b) : CoreModule.f1533b.getString(R$string.f1908Lm, strM14021b), vwb.f0(new String[]{strM14021b}));
        }
        String strM14021b2 = m14021b(location.distance);
        String str = user.age + CoreModule.f1533b.getString(R$string.f1728Fm);
        boolean zEquals = "zh".equals(CoreModule.f1533b.getResources().getConfiguration().locale.getLanguage());
        Gender gender = user.gender;
        if (zEquals) {
            string = TEnum.equals(gender, "female") ? CoreModule.f1533b.getString(R$string.f1758Gm, strM14021b2, str) : CoreModule.f1533b.getString(R$string.f1848Jm, strM14021b2, str);
        } else {
            string = TEnum.equals(gender, "female") ? CoreModule.f1533b.getString(R$string.f1758Gm, str, strM14021b2) : CoreModule.f1533b.getString(R$string.f1848Jm, str, strM14021b2);
        }
        return m14020a(string, vwb.f0(new String[]{str, strM14021b2}));
    }
}
