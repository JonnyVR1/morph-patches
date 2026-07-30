package p149l;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class icj0 {
    /* JADX INFO: renamed from: a */
    public static void m135352a(Spannable spannable, int i, int i2, jcj0 jcj0Var, @Nullable gcj0 gcj0Var, Map<String, jcj0> map, int i3) {
        gcj0 gcj0VarM135356e;
        jcj0 jcj0VarM135357f;
        int i4;
        if (jcj0Var.m140965l() != -1) {
            spannable.setSpan(new StyleSpan(jcj0Var.m140965l()), i, i2, 33);
        }
        if (jcj0Var.m140972s()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (jcj0Var.m140973t()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (jcj0Var.m140970q()) {
            kmf0.m146530a(spannable, new ForegroundColorSpan(jcj0Var.m140956c()), i, i2, 33);
        }
        if (jcj0Var.m140969p()) {
            kmf0.m146530a(spannable, new BackgroundColorSpan(jcj0Var.m140955b()), i, i2, 33);
        }
        if (jcj0Var.m140957d() != null) {
            kmf0.m146530a(spannable, new TypefaceSpan(jcj0Var.m140957d()), i, i2, 33);
        }
        if (jcj0Var.m140968o() != null) {
            qii0 qii0Var = (qii0) p11.m167011e(jcj0Var.m140968o());
            int i5 = qii0Var.f154777a;
            if (i5 == -1) {
                i5 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i4 = 1;
            } else {
                i4 = qii0Var.f154778b;
            }
            int i6 = qii0Var.f154779c;
            if (i6 == -2) {
                i6 = 1;
            }
            kmf0.m146530a(spannable, new rii0(i5, i4, i6), i, i2, 33);
        }
        int iM140963j = jcj0Var.m140963j();
        if (iM140963j == 2) {
            gcj0 gcj0VarM135355d = m135355d(gcj0Var, map);
            if (gcj0VarM135355d != null && (gcj0VarM135356e = m135356e(gcj0VarM135355d, map)) != null) {
                if (gcj0VarM135356e.m125508g() != 1 || gcj0VarM135356e.m125507f(0).f102027b == null) {
                    jwv.m143686f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) vck0.m197866j(gcj0VarM135356e.m125507f(0).f102027b);
                    jcj0 jcj0VarM135357f2 = m135357f(gcj0VarM135356e.f102031f, gcj0VarM135356e.m125512l(), map);
                    int iM140962i = jcj0VarM135357f2 != null ? jcj0VarM135357f2.m140962i() : -1;
                    if (iM140962i == -1 && (jcj0VarM135357f = m135357f(gcj0VarM135355d.f102031f, gcj0VarM135355d.m125512l(), map)) != null) {
                        iM140962i = jcj0VarM135357f.m140962i();
                    }
                    spannable.setSpan(new rid0(str, iM140962i), i, i2, 33);
                }
            }
        } else if (iM140963j == 3 || iM140963j == 4) {
            spannable.setSpan(new ttd(), i, i2, 33);
        }
        if (jcj0Var.m140967n()) {
            kmf0.m146530a(spannable, new pel(), i, i2, 33);
        }
        int iM140959f = jcj0Var.m140959f();
        if (iM140959f == 1) {
            kmf0.m146530a(spannable, new AbsoluteSizeSpan((int) jcj0Var.m140958e(), true), i, i2, 33);
        } else if (iM140959f == 2) {
            kmf0.m146530a(spannable, new RelativeSizeSpan(jcj0Var.m140958e()), i, i2, 33);
        } else {
            if (iM140959f != 3) {
                return;
            }
            kmf0.m146530a(spannable, new RelativeSizeSpan(jcj0Var.m140958e() / 100.0f), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m135353b(String str) {
        return str.replaceAll("\r\n", SignParameters.NEW_LINE).replaceAll(" *\n *", SignParameters.NEW_LINE).replaceAll(SignParameters.NEW_LINE, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).replaceAll("[ \t\\x0B\f\r]+", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    /* JADX INFO: renamed from: c */
    public static void m135354c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static gcj0 m135355d(@Nullable gcj0 gcj0Var, Map<String, jcj0> map) {
        while (gcj0Var != null) {
            jcj0 jcj0VarM135357f = m135357f(gcj0Var.f102031f, gcj0Var.m125512l(), map);
            if (jcj0VarM135357f != null && jcj0VarM135357f.m140963j() == 1) {
                return gcj0Var;
            }
            gcj0Var = gcj0Var.f102035j;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static gcj0 m135356e(gcj0 gcj0Var, Map<String, jcj0> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gcj0Var);
        while (!arrayDeque.isEmpty()) {
            gcj0 gcj0Var2 = (gcj0) arrayDeque.pop();
            jcj0 jcj0VarM135357f = m135357f(gcj0Var2.f102031f, gcj0Var2.m125512l(), map);
            if (jcj0VarM135357f != null && jcj0VarM135357f.m140963j() == 3) {
                return gcj0Var2;
            }
            for (int iM125508g = gcj0Var2.m125508g() - 1; iM125508g >= 0; iM125508g--) {
                arrayDeque.push(gcj0Var2.m125507f(iM125508g));
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static jcj0 m135357f(@Nullable jcj0 jcj0Var, @Nullable String[] strArr, Map<String, jcj0> map) {
        int i = 0;
        if (jcj0Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                jcj0 jcj0Var2 = new jcj0();
                int length = strArr.length;
                while (i < length) {
                    jcj0Var2.m140954a(map.get(strArr[i]));
                    i++;
                }
                return jcj0Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return jcj0Var.m140954a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    jcj0Var.m140954a(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return jcj0Var;
    }
}
