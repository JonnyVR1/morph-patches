package p009l;

import android.app.Activity;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.WebViewPreAct;
import com.p000p1.mobile.putong.p004ui.webview.WebViewAct;
import com.p1.mobile.putong.api.api.AccountTempApi;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.qib0;
import l.t100;
import l.vwb;
import l.w9j;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class n6a extends i0g0 {

    /* JADX INFO: renamed from: l.n6a$a */
    public class C1043a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f17233a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f17234b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f17235c;

        public C1043a(Activity activity, String str, String str2) {
            this.f17233a = activity;
            this.f17234b = str;
            this.f17235c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Activity activity = this.f17233a;
            AccountTempApi accountTempApi = qib0.L;
            String str = this.f17234b;
            activity.startActivity(accountTempApi == null ? WebViewPreAct.m9723J0(activity, str, this.f17235c) : WebViewAct.m10498Z1(activity, str, this.f17235c));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setFlags(8);
            textPaint.setAntiAlias(true);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static SpannableStringBuilder m18778b0(String str, ArrayList<String> arrayList, final int i, Typeface typeface) {
        return m18779c0(str, arrayList, vwb.Q(arrayList, new w9j() { // from class: l.l6a
            public final Object call(Object obj) {
                return Integer.valueOf(i);
            }
        }), typeface);
    }

    /* JADX INFO: renamed from: c0 */
    public static SpannableStringBuilder m18779c0(String str, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, Typeface typeface) {
        return m18780d0(str, arrayList, arrayList2, typeface, 0);
    }

    /* JADX INFO: renamed from: d0 */
    public static SpannableStringBuilder m18780d0(String str, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, Typeface typeface, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str2 = arrayList.get(i2);
            int iIndexOf = str.indexOf(str2);
            if (iIndexOf != -1) {
                spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typeface, arrayList2.get(i2).intValue(), i), iIndexOf, str2.length() + iIndexOf, 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: p0 */
    public static CharSequence m18783p0(String str, String str2, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + " " + str2);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(t100.f(i)), 0, str.length(), 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: q0 */
    public static SpannableStringBuilder m18784q0(Activity activity, String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < strArr.length; i += 2) {
            String str2 = strArr[i];
            String str3 = strArr[i + 1];
            if (str.indexOf(str2) > 0) {
                spannableStringBuilder.setSpan(new C1043a(activity, str2, str3), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: r0 */
    public static String m18785r0(String str) {
        try {
            return String.format("%.2f", Double.valueOf(Double.parseDouble(str)));
        } catch (NumberFormatException unused) {
            return "0.00";
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static String m18786s0(UserPrivilege userPrivilege) {
        return NullChecker.a(userPrivilege) ? String.format("已过期%s天", Long.valueOf(m18788u0(qib0.H.guessedCurrentServerTime() - userPrivilege.content.expiredTime))) : "";
    }

    /* JADX INFO: renamed from: t0 */
    public static int m18787t0(@NonNull Merchandise merchandise) {
        if (merchandise.weekly()) {
            return 7;
        }
        if (merchandise.monthly()) {
            return 31;
        }
        if (merchandise.quarterly()) {
            return 93;
        }
        if (merchandise.semiAnnual()) {
            return 183;
        }
        if (merchandise.yearly()) {
            return 366;
        }
        return merchandise.quantity * 31;
    }

    /* JADX INFO: renamed from: u0 */
    public static long m18788u0(long j) {
        return (j / 86400000) + 1;
    }

    /* JADX INFO: renamed from: v0 */
    public static SpannableStringBuilder m18789v0(SpannableStringBuilder spannableStringBuilder, ArrayList<String> arrayList, final int i, Typeface typeface) {
        return m18790w0(spannableStringBuilder, arrayList, vwb.Q(arrayList, new w9j() { // from class: l.m6a
            public final Object call(Object obj) {
                return Integer.valueOf(i);
            }
        }), typeface);
    }

    /* JADX INFO: renamed from: w0 */
    public static SpannableStringBuilder m18790w0(SpannableStringBuilder spannableStringBuilder, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, Typeface typeface) {
        return m18791x0(spannableStringBuilder, arrayList, arrayList2, typeface, 0);
    }

    /* JADX INFO: renamed from: x0 */
    public static SpannableStringBuilder m18791x0(SpannableStringBuilder spannableStringBuilder, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, Typeface typeface, int i) {
        String string = spannableStringBuilder.toString();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str = arrayList.get(i2);
            int iIndexOf = string.indexOf(str);
            if (iIndexOf != -1) {
                spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typeface, arrayList2.get(i2).intValue(), i), iIndexOf, str.length() + iIndexOf, 33);
            }
        }
        return spannableStringBuilder;
    }
}
