package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class obe0 {

    /* JADX INFO: renamed from: a */
    public static final int f142905a = t100.m186892f(14);

    /* JADX INFO: renamed from: b */
    public static final int f142906b = t100.m186892f(12);

    /* JADX INFO: renamed from: c */
    public static final int f142907c = t100.m186892f(13);

    /* JADX INFO: renamed from: a */
    public static void m163419a(View view, TextView textView) {
        textView.setMaxLines(3);
        textView.setPadding(t100.m186890d(10.0f), 0, t100.m186890d(10.0f), 0);
        textView.setLineSpacing(t100.f167256e, 1.0f);
        textView.getLayoutParams().height = -2;
    }

    /* JADX INFO: renamed from: b */
    public static qed0.C19470a m163420b(int i, int i2) {
        return new qed0.C19470a(1, i2, i, true);
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m163421c(User user, Context context, int[] iArr) {
        String strValueOf;
        String string = context.getString(R$string.f17829Im);
        int i = user.location.distance;
        if (i > 10000) {
            string = context.getString(R$string.f17799Hm);
            strValueOf = "10+";
        } else if (i > 1000) {
            strValueOf = String.valueOf(i / 1000);
            string = context.getString(R$string.f17799Hm);
        } else {
            strValueOf = i > 100 ? String.valueOf(i) : "100";
        }
        String str = strValueOf + string;
        String strValueOf2 = user.age.intValue() > 30 ? "30+" : String.valueOf(user.age);
        String string2 = context.getString(R$string.f18618ip, strValueOf2);
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(TEnum.equals(user.gender, "female") ? R$string.f18588hp : R$string.f18557gp, strValueOf2, str));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        String string3 = sb.toString();
        SpannableString spannableString = new SpannableString(string3);
        if (string3.contains(str)) {
            int length = strValueOf.length();
            int i2 = f142905a;
            int i3 = f142906b;
            m163431m(spannableString, string3, str, length, i2, i3, iArr);
            if (string3.contains(string2)) {
                m163431m(spannableString, string3, string2, strValueOf2.length(), i2, i3, iArr);
            }
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m163422d(User user) {
        j760<String, String> j760VarM163424f = m163424f(CoreModule.f17544b, user.location.distance);
        String str = j760VarM163424f.f116564a + j760VarM163424f.f116565b;
        String strReplace = String.format(vs80.m199852a(R$string.f18739mn, new Object[0]), str, user.age + "");
        if (CoreModule.m29935P().m94658i().mo158272N()) {
            strReplace = strReplace.replace("获取SVIP解密她是谁", "开通特权立即和她聊天！");
        }
        String str2 = strReplace;
        String str3 = String.format(CoreModule.f17544b.getString(R$string.f18770nn), user.age + "");
        SpannableString spannableString = new SpannableString(str2);
        int length = j760VarM163424f.f116564a.length();
        int i = f142907c;
        int i2 = f142906b;
        m163432n(spannableString, str2, str, length, i, i2);
        m163432n(spannableString, str2, str3, (user.age + "").length(), i, i2);
        return spannableString;
    }

    /* JADX INFO: renamed from: e */
    public static j760<String, String> m163423e(Context context, int i) {
        String strValueOf;
        String string = context.getString(R$string.f17829Im);
        if (i > 99000) {
            string = context.getString(R$string.f17799Hm);
            strValueOf = "99+";
        } else if (i > 1000) {
            String strValueOf2 = String.valueOf(i / 1000);
            string = context.getString(R$string.f17799Hm);
            strValueOf = strValueOf2;
        } else {
            strValueOf = i > 100 ? String.valueOf(i) : "100";
        }
        return vwb.m200311Y(strValueOf, string);
    }

    /* JADX INFO: renamed from: f */
    public static j760<String, String> m163424f(Context context, int i) {
        String strValueOf;
        String string = context.getString(R$string.f17829Im);
        if (i > 10000) {
            string = context.getString(R$string.f17799Hm);
            strValueOf = "10+";
        } else if (i >= 1000) {
            String strValueOf2 = String.valueOf(i / 1000);
            string = context.getString(R$string.f17799Hm);
            strValueOf = strValueOf2;
        } else {
            strValueOf = i > 100 ? String.valueOf(i) : "100";
        }
        return vwb.m200311Y(strValueOf, string);
    }

    /* JADX INFO: renamed from: g */
    public static CharSequence m163425g(User user, View view, TextView textView) {
        return m163426h(user, view, textView, f142905a, f142906b);
    }

    /* JADX INFO: renamed from: h */
    public static CharSequence m163426h(User user, View view, TextView textView, int i, int i2) {
        return m163427i(user, view, textView, i, i2, null);
    }

    /* JADX INFO: renamed from: i */
    public static CharSequence m163427i(User user, View view, TextView textView, int i, int i2, int[] iArr) {
        String str;
        Context context = view.getContext();
        String strValueOf = String.valueOf(user.age);
        boolean z = user.age.intValue() >= 40;
        boolean zM181727G0 = rza.m181727G0();
        j760<String, String> j760VarM163423e = m163423e(context, user.location.distance);
        String str2 = j760VarM163423e.f116564a;
        String str3 = j760VarM163423e.f116564a + j760VarM163423e.f116565b;
        String str4 = strValueOf + context.getString(R$string.f17709Em);
        if (z) {
            str = String.format(view.getContext().getString(R$string.f17949Mm), str3);
        } else {
            str = String.format(view.getContext().getString(R$string.f17679Dm), zM181727G0 ? str3 : str4, zM181727G0 ? str4 : str3);
        }
        String str5 = str;
        SpannableString spannableString = new SpannableString(str5);
        m163430l(spannableString, str5, str3, str2.length(), i, i2);
        if (!z) {
            m163430l(spannableString, str5, str4, strValueOf.length(), i, i2);
        }
        m163419a(view, textView);
        return spannableString;
    }

    /* JADX INFO: renamed from: j */
    public static qed0.C19470a m163428j(int i, int i2) {
        return new qed0.C19470a(1, i2, i, true);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m163429k(User user) {
        return NullChecker.m81304b(user) && TEnum.equals(user.gender, "male") && TEnum.equals(user.settings.getLookingFor(), "female");
    }

    /* JADX INFO: renamed from: l */
    public static void m163430l(SpannableString spannableString, String str, String str2, int i, int i2, int i3) {
        int i4 = t100.f167255d;
        int iIndexOf = str.indexOf(str2);
        spannableString.setSpan(new qed0(i4, -498866, -1, m163420b(i + iIndexOf, i2), m163428j(-1, i3)), iIndexOf, str2.length() + iIndexOf, 18);
    }

    /* JADX INFO: renamed from: m */
    public static void m163431m(SpannableString spannableString, String str, String str2, int i, int i2, int i3, int[] iArr) {
        int i4 = t100.f167258g;
        int color = Color.parseColor("#ffe8aa");
        int color2 = Color.parseColor("#d59d24");
        int iIndexOf = str.indexOf(str2);
        int length = str2.length();
        qed0 qed0Var = new qed0(i4, color, color2, m163420b(i + iIndexOf, i2), m163428j(-1, i3));
        int i5 = t100.f167257f;
        int i6 = t100.f167254c;
        qed0Var.m174190c(i5, i6, i6, i6);
        spannableString.setSpan(qed0Var, iIndexOf, length + iIndexOf, 18);
    }

    /* JADX INFO: renamed from: n */
    public static void m163432n(SpannableString spannableString, String str, String str2, int i, int i2, int i3) {
        int i4 = t100.f167258g;
        int color = Color.parseColor("#ffe8aa");
        int color2 = Color.parseColor("#d59d24");
        int iIndexOf = str.indexOf(str2);
        int length = str2.length();
        if (iIndexOf != -1) {
            qed0 qed0VarM174188a = new qed0(i4, color, color2, m163420b(i + iIndexOf, i2), m163428j(-1, i3)).m174188a(false);
            qed0VarM174188a.m174191d(t100.m186890d(2.0f));
            spannableString.setSpan(qed0VarM174188a, iIndexOf, length + iIndexOf, 18);
        } else {
            CrashHelper.m81296c(new Exception("renderSpanRenderEndSpace childString not find allString：" + str + "--childString：" + str2));
        }
    }
}
