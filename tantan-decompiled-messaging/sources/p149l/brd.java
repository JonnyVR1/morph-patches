package p149l;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.p030ui.R$string;
import com.google.mlkit.p033nl.languageid.LanguageIdentifier;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class brd implements l6j0 {

    /* JADX INFO: renamed from: a */
    public final Resources f76892a;

    public brd(Resources resources) {
        this.f76892a = (Resources) p11.m167011e(resources);
    }

    /* JADX INFO: renamed from: i */
    public static int m103528i(C1871k c1871k) {
        int iM157529k = n200.m157529k(c1871k.f7748l);
        if (iM157529k != -1) {
            return iM157529k;
        }
        if (n200.m157532n(c1871k.f7745i) != null) {
            return 2;
        }
        if (n200.m157521c(c1871k.f7745i) != null) {
            return 1;
        }
        if (c1871k.f7753q == -1 && c1871k.f7754r == -1) {
            return (c1871k.f7761y == -1 && c1871k.f7762z == -1) ? -1 : 1;
        }
        return 2;
    }

    @Override // p149l.l6j0
    /* JADX INFO: renamed from: a */
    public String mo103529a(C1871k c1871k) {
        String strM103537j;
        int iM103528i = m103528i(c1871k);
        if (iM103528i == 2) {
            strM103537j = m103537j(m103536h(c1871k), m103535g(c1871k), m103531c(c1871k));
        } else {
            strM103537j = iM103528i == 1 ? m103537j(m103533e(c1871k), m103530b(c1871k), m103531c(c1871k)) : m103533e(c1871k);
        }
        return strM103537j.length() == 0 ? this.f76892a.getString(R$string.f9270D) : strM103537j;
    }

    /* JADX INFO: renamed from: b */
    public final String m103530b(C1871k c1871k) {
        int i = c1871k.f7761y;
        if (i == -1 || i < 1) {
            return "";
        }
        if (i == 1) {
            return this.f76892a.getString(R$string.f9287q);
        }
        if (i == 2) {
            return this.f76892a.getString(R$string.f9296z);
        }
        if (i == 6 || i == 7) {
            return this.f76892a.getString(R$string.f9268B);
        }
        Resources resources = this.f76892a;
        return i != 8 ? resources.getString(R$string.f9267A) : resources.getString(R$string.f9269C);
    }

    /* JADX INFO: renamed from: c */
    public final String m103531c(C1871k c1871k) {
        int i = c1871k.f7744h;
        return i == -1 ? "" : this.f76892a.getString(R$string.f9286p, Float.valueOf(i / 1000000.0f));
    }

    /* JADX INFO: renamed from: d */
    public final String m103532d(C1871k c1871k) {
        return TextUtils.isEmpty(c1871k.f7738b) ? "" : c1871k.f7738b;
    }

    /* JADX INFO: renamed from: e */
    public final String m103533e(C1871k c1871k) {
        String strM103537j = m103537j(m103534f(c1871k), m103536h(c1871k));
        return TextUtils.isEmpty(strM103537j) ? m103532d(c1871k) : strM103537j;
    }

    /* JADX INFO: renamed from: f */
    public final String m103534f(C1871k c1871k) {
        String str = c1871k.f7739c;
        if (TextUtils.isEmpty(str) || LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG.equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = vck0.f180948a >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale localeM197823S = vck0.m197823S();
        String displayName = localeForLanguageTag.getDisplayName(localeM197823S);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeM197823S) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m103535g(C1871k c1871k) {
        int i = c1871k.f7753q;
        int i2 = c1871k.f7754r;
        return (i == -1 || i2 == -1) ? "" : this.f76892a.getString(R$string.f9288r, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: h */
    public final String m103536h(C1871k c1871k) {
        String string = (c1871k.f7741e & 2) != 0 ? this.f76892a.getString(R$string.f9289s) : "";
        if ((c1871k.f7741e & 4) != 0) {
            string = m103537j(string, this.f76892a.getString(R$string.f9292v));
        }
        if ((c1871k.f7741e & 8) != 0) {
            string = m103537j(string, this.f76892a.getString(R$string.f9291u));
        }
        return (c1871k.f7741e & 1088) != 0 ? m103537j(string, this.f76892a.getString(R$string.f9290t)) : string;
    }

    /* JADX INFO: renamed from: j */
    public final String m103537j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f76892a.getString(R$string.f9285o, string, str);
            }
        }
        return string;
    }
}
