package p007l;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ddj0 {
    /* JADX INFO: renamed from: a */
    public static <T> Spannable m8983a(Context context, int i, CharSequence... charSequenceArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getResources().getString(i));
        int i2 = 0;
        if (charSequenceArr.length == 1) {
            int iIndexOf = spannableStringBuilder.toString().indexOf("%s");
            if (iIndexOf >= 0) {
                spannableStringBuilder.replace(iIndexOf, iIndexOf + 2, charSequenceArr[0]);
                return spannableStringBuilder;
            }
        } else {
            while (i2 < charSequenceArr.length) {
                StringBuilder sb = new StringBuilder("%");
                int i3 = i2 + 1;
                sb.append(i3);
                sb.append("$s");
                String string = sb.toString();
                int iIndexOf2 = spannableStringBuilder.toString().indexOf(string);
                if (iIndexOf2 >= 0) {
                    spannableStringBuilder.replace(iIndexOf2, string.length() + iIndexOf2, charSequenceArr[i2]);
                }
                i2 = i3;
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8984b(CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence);
    }

    /* JADX INFO: renamed from: c */
    public static Spannable m8985c(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StyleSpan(2), 0, str.length(), 0);
        return spannableString;
    }

    /* JADX INFO: renamed from: d */
    public static <T> CharSequence m8986d(List<CharSequence> list, String str) {
        if (list == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < list.size(); i++) {
            CharSequence charSequence = list.get(i);
            if (charSequence != null) {
                spannableStringBuilder.append(charSequence);
                if (i != list.size() - 1) {
                    spannableStringBuilder.append((CharSequence) str);
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: e */
    public static String m8987e(String str) {
        return str != null ? Pattern.compile("\r|\n").matcher(str).replaceAll("") : "";
    }

    /* JADX INFO: renamed from: f */
    public static Spannable m8988f(String str, String str2, CharacterStyle characterStyle) {
        SpannableString spannableString = new SpannableString(str);
        if (characterStyle != null) {
            spannableString.setSpan(characterStyle, str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: g */
    public static String m8989g(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 60;
        return (j3 / 60) + ":" + (j3 % 60) + ":" + (j2 % 60);
    }
}
