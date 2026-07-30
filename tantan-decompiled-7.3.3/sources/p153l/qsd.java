package p153l;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.p031ui.R$string;
import com.google.mlkit.p034nl.languageid.LanguageIdentifier;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class qsd implements pfj0 {

    /* JADX INFO: renamed from: a */
    public final Resources f159284a;

    public qsd(Resources resources) {
        this.f159284a = (Resources) w11.m204369e(resources);
    }

    /* JADX INFO: renamed from: i */
    public static int m177760i(C1894k c1894k) {
        int iM149010k = kb00.m149010k(c1894k.f7785l);
        if (iM149010k != -1) {
            return iM149010k;
        }
        if (kb00.m149013n(c1894k.f7782i) != null) {
            return 2;
        }
        if (kb00.m149002c(c1894k.f7782i) != null) {
            return 1;
        }
        if (c1894k.f7790q == -1 && c1894k.f7791r == -1) {
            return (c1894k.f7798y == -1 && c1894k.f7799z == -1) ? -1 : 1;
        }
        return 2;
    }

    @Override // p153l.pfj0
    /* JADX INFO: renamed from: a */
    public String mo172102a(C1894k c1894k) {
        String strM177768j;
        int iM177760i = m177760i(c1894k);
        if (iM177760i == 2) {
            strM177768j = m177768j(m177767h(c1894k), m177766g(c1894k), m177762c(c1894k));
        } else {
            strM177768j = iM177760i == 1 ? m177768j(m177764e(c1894k), m177761b(c1894k), m177762c(c1894k)) : m177764e(c1894k);
        }
        return strM177768j.length() == 0 ? this.f159284a.getString(R$string.f9307D) : strM177768j;
    }

    /* JADX INFO: renamed from: b */
    public final String m177761b(C1894k c1894k) {
        int i = c1894k.f7798y;
        if (i == -1 || i < 1) {
            return "";
        }
        if (i == 1) {
            return this.f159284a.getString(R$string.f9324q);
        }
        if (i == 2) {
            return this.f159284a.getString(R$string.f9333z);
        }
        if (i == 6 || i == 7) {
            return this.f159284a.getString(R$string.f9305B);
        }
        Resources resources = this.f159284a;
        return i != 8 ? resources.getString(R$string.f9304A) : resources.getString(R$string.f9306C);
    }

    /* JADX INFO: renamed from: c */
    public final String m177762c(C1894k c1894k) {
        int i = c1894k.f7781h;
        return i == -1 ? "" : this.f159284a.getString(R$string.f9323p, Float.valueOf(i / 1000000.0f));
    }

    /* JADX INFO: renamed from: d */
    public final String m177763d(C1894k c1894k) {
        return TextUtils.isEmpty(c1894k.f7775b) ? "" : c1894k.f7775b;
    }

    /* JADX INFO: renamed from: e */
    public final String m177764e(C1894k c1894k) {
        String strM177768j = m177768j(m177765f(c1894k), m177767h(c1894k));
        return TextUtils.isEmpty(strM177768j) ? m177763d(c1894k) : strM177768j;
    }

    /* JADX INFO: renamed from: f */
    public final String m177765f(C1894k c1894k) {
        String str = c1894k.f7776c;
        if (TextUtils.isEmpty(str) || LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG.equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = bmk0.f77313a >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale localeM105101S = bmk0.m105101S();
        String displayName = localeForLanguageTag.getDisplayName(localeM105101S);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeM105101S) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m177766g(C1894k c1894k) {
        int i = c1894k.f7790q;
        int i2 = c1894k.f7791r;
        return (i == -1 || i2 == -1) ? "" : this.f159284a.getString(R$string.f9325r, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: h */
    public final String m177767h(C1894k c1894k) {
        String string = (c1894k.f7778e & 2) != 0 ? this.f159284a.getString(R$string.f9326s) : "";
        if ((c1894k.f7778e & 4) != 0) {
            string = m177768j(string, this.f159284a.getString(R$string.f9329v));
        }
        if ((c1894k.f7778e & 8) != 0) {
            string = m177768j(string, this.f159284a.getString(R$string.f9328u));
        }
        return (c1894k.f7778e & 1088) != 0 ? m177768j(string, this.f159284a.getString(R$string.f9327t)) : string;
    }

    /* JADX INFO: renamed from: j */
    public final String m177768j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f159284a.getString(R$string.f9322o, string, str);
            }
        }
        return string;
    }
}
