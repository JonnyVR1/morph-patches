package p153l;

import android.text.SpannableStringBuilder;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class xhj {
    /* JADX INFO: renamed from: a */
    public static SpannableStringBuilder m211046a(String str, List<String> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < list.size(); i++) {
            String str2 = list.get(i);
            int iIndexOf = str.indexOf(str2);
            if (iIndexOf != -1) {
                spannableStringBuilder.setSpan(new smd0(qa00.f156317d, -866711, -1, new smd0.C20104a(3, qa00.m175859d(14.0f), str2.length() + iIndexOf)), iIndexOf, str2.length() + iIndexOf, 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public static String m211047b(int i) {
        if (!IntlCountryCodeController.m29109f()) {
            return q8g0.m175814s(i, false, true);
        }
        int iM175779K = (int) q8g0.m175779K(i);
        if (iM175779K <= 1) {
            return "1 " + CoreModule.f18263b.getString(R$string.f19434lj);
        }
        if (iM175779K > 99) {
            return "99+ " + CoreModule.f18263b.getString(R$string.f19403kj);
        }
        return iM175779K + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f18263b.getString(R$string.f19403kj);
    }

    /* JADX INFO: renamed from: c */
    public static String m211048c(int i) {
        if (!IntlCountryCodeController.m29109f()) {
            return q8g0.m175814s(i, false, true);
        }
        int iM175779K = (int) q8g0.m175779K(i);
        if (iM175779K <= 1) {
            return "1" + CoreModule.f18263b.getString(R$string.f19434lj);
        }
        if (iM175779K > 99) {
            return "99+" + CoreModule.f18263b.getString(R$string.f19403kj);
        }
        return iM175779K + CoreModule.f18263b.getString(R$string.f19403kj);
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m211049d(User user) {
        String string;
        int iIntValue = user.age.intValue();
        Location location = user.location;
        if (iIntValue >= 40) {
            String strM211047b = m211047b(location.distance);
            return m211046a(TEnum.equals(user.gender, "female") ? CoreModule.f18263b.getString(R$string.f19285gn, strM211047b) : CoreModule.f18263b.getString(R$string.f19316hn, strM211047b), jyb.m147507f0(strM211047b));
        }
        String strM211047b2 = m211047b(location.distance);
        String str = user.age + CoreModule.f18263b.getString(R$string.f19131bn);
        boolean zEquals = "zh".equals(CoreModule.f18263b.getResources().getConfiguration().locale.getLanguage());
        Gender gender = user.gender;
        if (zEquals) {
            string = TEnum.equals(gender, "female") ? CoreModule.f18263b.getString(R$string.f19162cn, strM211047b2, str) : CoreModule.f18263b.getString(R$string.f19254fn, strM211047b2, str);
        } else {
            string = TEnum.equals(gender, "female") ? CoreModule.f18263b.getString(R$string.f19162cn, str, strM211047b2) : CoreModule.f18263b.getString(R$string.f19254fn, str, strM211047b2);
        }
        return m211046a(string, jyb.m147507f0(str, strM211047b2));
    }
}
