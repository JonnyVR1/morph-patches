package p153l;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class tje0 {

    /* JADX INFO: renamed from: a */
    public static final int f174579a = qa00.m175861f(14);

    /* JADX INFO: renamed from: b */
    public static final int f174580b = qa00.m175861f(12);

    /* JADX INFO: renamed from: c */
    public static final int f174581c = qa00.m175861f(13);

    /* JADX INFO: renamed from: a */
    public static void m191428a(View view, TextView textView) {
        textView.setMaxLines(3);
        textView.setPadding(qa00.m175859d(10.0f), 0, qa00.m175859d(10.0f), 0);
        textView.setLineSpacing(qa00.f156318e, 1.0f);
        textView.getLayoutParams().height = -2;
    }

    /* JADX INFO: renamed from: b */
    public static smd0.C20104a m191429b(int i, int i2) {
        return new smd0.C20104a(1, i2, i, true);
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m191430c(User user, Context context, int[] iArr) {
        String strValueOf;
        String string = context.getString(R$string.f19223en);
        int i = user.location.distance;
        if (i > 10000) {
            string = context.getString(R$string.f19193dn);
            strValueOf = "10+";
        } else if (i > 1000) {
            strValueOf = String.valueOf(i / 1000);
            string = context.getString(R$string.f19193dn);
        } else {
            strValueOf = i > 100 ? String.valueOf(i) : "100";
        }
        String str = strValueOf + string;
        String strValueOf2 = user.age.intValue() > 30 ? "30+" : String.valueOf(user.age);
        String string2 = context.getString(R$string.f18435Ep, strValueOf2);
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(TEnum.equals(user.gender, "female") ? R$string.f18404Dp : R$string.f18373Cp, strValueOf2, str));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        String string3 = sb.toString();
        SpannableString spannableString = new SpannableString(string3);
        if (string3.contains(str)) {
            int length = strValueOf.length();
            int i2 = f174579a;
            int i3 = f174580b;
            m191440m(spannableString, string3, str, length, i2, i3, iArr);
            if (string3.contains(string2)) {
                m191440m(spannableString, string3, string2, strValueOf2.length(), i2, i3, iArr);
            }
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m191431d(User user) {
        pf60<String, String> pf60VarM191433f = m191433f(CoreModule.f18263b, user.location.distance);
        String str = pf60VarM191433f.f152156a + pf60VarM191433f.f152157b;
        String strReplace = String.format(z090.m218106a(R$string.f18557In, new Object[0]), str, user.age + "");
        if (CoreModule.m30933P().m143412i().mo180364N()) {
            strReplace = strReplace.replace("获取SVIP解密她是谁", "开通特权立即和她聊天！");
        }
        String str2 = strReplace;
        String str3 = String.format(CoreModule.f18263b.getString(R$string.f18588Jn), user.age + "");
        SpannableString spannableString = new SpannableString(str2);
        int length = pf60VarM191433f.f152156a.length();
        int i = f174581c;
        int i2 = f174580b;
        m191441n(spannableString, str2, str, length, i, i2);
        m191441n(spannableString, str2, str3, (user.age + "").length(), i, i2);
        return spannableString;
    }

    /* JADX INFO: renamed from: e */
    public static pf60<String, String> m191432e(Context context, int i) {
        String strValueOf;
        String string = context.getString(R$string.f19223en);
        if (i > 99000) {
            string = context.getString(R$string.f19193dn);
            strValueOf = "99+";
        } else if (i > 1000) {
            String strValueOf2 = String.valueOf(i / 1000);
            string = context.getString(R$string.f19193dn);
            strValueOf = strValueOf2;
        } else {
            strValueOf = i > 100 ? String.valueOf(i) : "100";
        }
        return jyb.m147494Y(strValueOf, string);
    }

    /* JADX INFO: renamed from: f */
    public static pf60<String, String> m191433f(Context context, int i) {
        String strValueOf;
        String string = context.getString(R$string.f19223en);
        if (i > 10000) {
            string = context.getString(R$string.f19193dn);
            strValueOf = "10+";
        } else if (i >= 1000) {
            String strValueOf2 = String.valueOf(i / 1000);
            string = context.getString(R$string.f19193dn);
            strValueOf = strValueOf2;
        } else {
            strValueOf = i > 100 ? String.valueOf(i) : "100";
        }
        return jyb.m147494Y(strValueOf, string);
    }

    /* JADX INFO: renamed from: g */
    public static CharSequence m191434g(User user, View view, TextView textView) {
        return m191435h(user, view, textView, f174579a, f174580b);
    }

    /* JADX INFO: renamed from: h */
    public static CharSequence m191435h(User user, View view, TextView textView, int i, int i2) {
        return m191436i(user, view, textView, i, i2, null);
    }

    /* JADX INFO: renamed from: i */
    public static CharSequence m191436i(User user, View view, TextView textView, int i, int i2, int[] iArr) {
        String str;
        Context context = view.getContext();
        String strValueOf = String.valueOf(user.age);
        boolean z = user.age.intValue() >= 40;
        boolean zM118949G0 = e1b.m118949G0();
        pf60<String, String> pf60VarM191432e = m191432e(context, user.location.distance);
        String str2 = pf60VarM191432e.f152156a;
        String str3 = pf60VarM191432e.f152156a + pf60VarM191432e.f152157b;
        String str4 = strValueOf + context.getString(R$string.f19100an);
        if (z) {
            str = String.format(view.getContext().getString(R$string.f19346in), str3);
        } else {
            str = String.format(view.getContext().getString(R$string.f19069Zm), zM118949G0 ? str3 : str4, zM118949G0 ? str4 : str3);
        }
        String str5 = str;
        SpannableString spannableString = new SpannableString(str5);
        m191439l(spannableString, str5, str3, str2.length(), i, i2);
        if (!z) {
            m191439l(spannableString, str5, str4, strValueOf.length(), i, i2);
        }
        m191428a(view, textView);
        return spannableString;
    }

    /* JADX INFO: renamed from: j */
    public static smd0.C20104a m191437j(int i, int i2) {
        return new smd0.C20104a(1, i2, i, true);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m191438k(User user) {
        return NullChecker.m82487b(user) && TEnum.equals(user.gender, "male") && TEnum.equals(user.settings.getLookingFor(), "female");
    }

    /* JADX INFO: renamed from: l */
    public static void m191439l(SpannableString spannableString, String str, String str2, int i, int i2, int i3) {
        int i4 = qa00.f156317d;
        int iIndexOf = str.indexOf(str2);
        spannableString.setSpan(new smd0(i4, -498866, -1, m191429b(i + iIndexOf, i2), m191437j(-1, i3)), iIndexOf, str2.length() + iIndexOf, 18);
    }

    /* JADX INFO: renamed from: m */
    public static void m191440m(SpannableString spannableString, String str, String str2, int i, int i2, int i3, int[] iArr) {
        int i4 = qa00.f156320g;
        int color = Color.parseColor("#ffe8aa");
        int color2 = Color.parseColor("#d59d24");
        int iIndexOf = str.indexOf(str2);
        int length = str2.length();
        smd0 smd0Var = new smd0(i4, color, color2, m191429b(i + iIndexOf, i2), m191437j(-1, i3));
        int i5 = qa00.f156319f;
        int i6 = qa00.f156316c;
        smd0Var.m186806c(i5, i6, i6, i6);
        spannableString.setSpan(smd0Var, iIndexOf, length + iIndexOf, 18);
    }

    /* JADX INFO: renamed from: n */
    public static void m191441n(SpannableString spannableString, String str, String str2, int i, int i2, int i3) {
        int i4 = qa00.f156320g;
        int color = Color.parseColor("#ffe8aa");
        int color2 = Color.parseColor("#d59d24");
        int iIndexOf = str.indexOf(str2);
        int length = str2.length();
        if (iIndexOf != -1) {
            smd0 smd0VarM186804a = new smd0(i4, color, color2, m191429b(i + iIndexOf, i2), m191437j(-1, i3)).m186804a(false);
            smd0VarM186804a.m186807d(qa00.m175859d(2.0f));
            spannableString.setSpan(smd0VarM186804a, iIndexOf, length + iIndexOf, 18);
        } else {
            CrashHelper.m82479c(new Exception("renderSpanRenderEndSpace childString not find allString：" + str + "--childString：" + str2));
        }
    }
}
