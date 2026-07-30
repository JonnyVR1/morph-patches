package p153l;

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
public final class mlj0 {
    /* JADX INFO: renamed from: a */
    public static void m158897a(Spannable spannable, int i, int i2, nlj0 nlj0Var, @Nullable klj0 klj0Var, Map<String, nlj0> map, int i3) {
        klj0 klj0VarM158901e;
        nlj0 nlj0VarM158902f;
        int i4;
        if (nlj0Var.m163711l() != -1) {
            spannable.setSpan(new StyleSpan(nlj0Var.m163711l()), i, i2, 33);
        }
        if (nlj0Var.m163718s()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (nlj0Var.m163719t()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (nlj0Var.m163716q()) {
            tuf0.m192748a(spannable, new ForegroundColorSpan(nlj0Var.m163702c()), i, i2, 33);
        }
        if (nlj0Var.m163715p()) {
            tuf0.m192748a(spannable, new BackgroundColorSpan(nlj0Var.m163701b()), i, i2, 33);
        }
        if (nlj0Var.m163703d() != null) {
            tuf0.m192748a(spannable, new TypefaceSpan(nlj0Var.m163703d()), i, i2, 33);
        }
        if (nlj0Var.m163714o() != null) {
            qri0 qri0Var = (qri0) w11.m204369e(nlj0Var.m163714o());
            int i5 = qri0Var.f159130a;
            if (i5 == -1) {
                i5 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i4 = 1;
            } else {
                i4 = qri0Var.f159131b;
            }
            int i6 = qri0Var.f159132c;
            if (i6 == -2) {
                i6 = 1;
            }
            tuf0.m192748a(spannable, new rri0(i5, i4, i6), i, i2, 33);
        }
        int iM163709j = nlj0Var.m163709j();
        if (iM163709j == 2) {
            klj0 klj0VarM158900d = m158900d(klj0Var, map);
            if (klj0VarM158900d != null && (klj0VarM158901e = m158901e(klj0VarM158900d, map)) != null) {
                if (klj0VarM158901e.m150377g() != 1 || klj0VarM158901e.m150376f(0).f127377b == null) {
                    kyv.m152148f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) bmk0.m105144j(klj0VarM158901e.m150376f(0).f127377b);
                    nlj0 nlj0VarM158902f2 = m158902f(klj0VarM158901e.f127381f, klj0VarM158901e.m150381l(), map);
                    int iM163708i = nlj0VarM158902f2 != null ? nlj0VarM158902f2.m163708i() : -1;
                    if (iM163708i == -1 && (nlj0VarM158902f = m158902f(klj0VarM158900d.f127381f, klj0VarM158900d.m150381l(), map)) != null) {
                        iM163708i = nlj0VarM158902f.m163708i();
                    }
                    spannable.setSpan(new uqd0(str, iM163708i), i, i2, 33);
                }
            }
        } else if (iM163709j == 3 || iM163709j == 4) {
            spannable.setSpan(new hvd(), i, i2, 33);
        }
        if (nlj0Var.m163713n()) {
            tuf0.m192748a(spannable, new fhl(), i, i2, 33);
        }
        int iM163705f = nlj0Var.m163705f();
        if (iM163705f == 1) {
            tuf0.m192748a(spannable, new AbsoluteSizeSpan((int) nlj0Var.m163704e(), true), i, i2, 33);
        } else if (iM163705f == 2) {
            tuf0.m192748a(spannable, new RelativeSizeSpan(nlj0Var.m163704e()), i, i2, 33);
        } else {
            if (iM163705f != 3) {
                return;
            }
            tuf0.m192748a(spannable, new RelativeSizeSpan(nlj0Var.m163704e() / 100.0f), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m158898b(String str) {
        return str.replaceAll("\r\n", SignParameters.NEW_LINE).replaceAll(" *\n *", SignParameters.NEW_LINE).replaceAll(SignParameters.NEW_LINE, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).replaceAll("[ \t\\x0B\f\r]+", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    /* JADX INFO: renamed from: c */
    public static void m158899c(SpannableStringBuilder spannableStringBuilder) {
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
    public static klj0 m158900d(@Nullable klj0 klj0Var, Map<String, nlj0> map) {
        while (klj0Var != null) {
            nlj0 nlj0VarM158902f = m158902f(klj0Var.f127381f, klj0Var.m150381l(), map);
            if (nlj0VarM158902f != null && nlj0VarM158902f.m163709j() == 1) {
                return klj0Var;
            }
            klj0Var = klj0Var.f127385j;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static klj0 m158901e(klj0 klj0Var, Map<String, nlj0> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(klj0Var);
        while (!arrayDeque.isEmpty()) {
            klj0 klj0Var2 = (klj0) arrayDeque.pop();
            nlj0 nlj0VarM158902f = m158902f(klj0Var2.f127381f, klj0Var2.m150381l(), map);
            if (nlj0VarM158902f != null && nlj0VarM158902f.m163709j() == 3) {
                return klj0Var2;
            }
            for (int iM150377g = klj0Var2.m150377g() - 1; iM150377g >= 0; iM150377g--) {
                arrayDeque.push(klj0Var2.m150376f(iM150377g));
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static nlj0 m158902f(@Nullable nlj0 nlj0Var, @Nullable String[] strArr, Map<String, nlj0> map) {
        int i = 0;
        if (nlj0Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                nlj0 nlj0Var2 = new nlj0();
                int length = strArr.length;
                while (i < length) {
                    nlj0Var2.m163700a(map.get(strArr[i]));
                    i++;
                }
                return nlj0Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return nlj0Var.m163700a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    nlj0Var.m163700a(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return nlj0Var;
    }
}
