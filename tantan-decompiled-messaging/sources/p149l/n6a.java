package p149l;

import android.app.Activity;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.p065ui.WebViewPreAct;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes11.dex */
public class n6a extends i0g0 {

    /* JADX INFO: renamed from: l.n6a$a */
    public class C18628a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f137280a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f137281b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f137282c;

        public C18628a(Activity activity, String str, String str2) {
            this.f137280a = activity;
            this.f137281b = str;
            this.f137282c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Activity activity = this.f137280a;
            AccountTempApi accountTempApi = qib0.f154697L;
            String str = this.f137281b;
            activity.startActivity(accountTempApi == null ? WebViewPreAct.m79402J0(activity, str, this.f137282c) : WebViewAct.m80164Z1(activity, str, this.f137282c));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setFlags(8);
            textPaint.setAntiAlias(true);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static SpannableStringBuilder m158023b0(String str, ArrayList<String> arrayList, final int i, Typeface typeface) {
        return m158024c0(str, arrayList, vwb.m200303Q(arrayList, new w9j() { // from class: l.l6a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(i);
            }
        }), typeface);
    }

    /* JADX INFO: renamed from: c0 */
    public static SpannableStringBuilder m158024c0(String str, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, Typeface typeface) {
        return m158025d0(str, arrayList, arrayList2, typeface, 0);
    }

    /* JADX INFO: renamed from: d0 */
    public static SpannableStringBuilder m158025d0(String str, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, Typeface typeface, int i) {
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
    public static CharSequence m158028p0(String str, String str2, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(t100.m186892f(i)), 0, str.length(), 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: q0 */
    public static SpannableStringBuilder m158029q0(Activity activity, String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < strArr.length; i += 2) {
            String str2 = strArr[i];
            String str3 = strArr[i + 1];
            if (str.indexOf(str2) > 0) {
                spannableStringBuilder.setSpan(new C18628a(activity, str2, str3), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: r0 */
    public static String m158030r0(String str) {
        try {
            return String.format("%.2f", Double.valueOf(Double.parseDouble(str)));
        } catch (NumberFormatException unused) {
            return "0.00";
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static String m158031s0(UserPrivilege userPrivilege) {
        return NullChecker.m81303a(userPrivilege) ? String.format("已过期%s天", Long.valueOf(m158033u0(qib0.f154693H.guessedCurrentServerTime() - userPrivilege.content.expiredTime))) : "";
    }

    /* JADX INFO: renamed from: t0 */
    public static int m158032t0(@NonNull Merchandise merchandise) {
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
    public static long m158033u0(long j) {
        return (j / 86400000) + 1;
    }

    /* JADX INFO: renamed from: v0 */
    public static SpannableStringBuilder m158034v0(SpannableStringBuilder spannableStringBuilder, ArrayList<String> arrayList, final int i, Typeface typeface) {
        return m158035w0(spannableStringBuilder, arrayList, vwb.m200303Q(arrayList, new w9j() { // from class: l.m6a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(i);
            }
        }), typeface);
    }

    /* JADX INFO: renamed from: w0 */
    public static SpannableStringBuilder m158035w0(SpannableStringBuilder spannableStringBuilder, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, Typeface typeface) {
        return m158036x0(spannableStringBuilder, arrayList, arrayList2, typeface, 0);
    }

    /* JADX INFO: renamed from: x0 */
    public static SpannableStringBuilder m158036x0(SpannableStringBuilder spannableStringBuilder, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, Typeface typeface, int i) {
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
