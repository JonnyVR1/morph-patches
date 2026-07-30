package p006l;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.qed0;
import l.rza;
import l.t100;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class obe0 {

    /* JADX INFO: renamed from: a */
    public static final int f18132a = t100.f(14);

    /* JADX INFO: renamed from: b */
    public static final int f18133b = t100.f(12);

    /* JADX INFO: renamed from: c */
    public static final int f18134c = t100.f(13);

    /* JADX INFO: renamed from: a */
    public static void m20479a(View view, TextView textView) {
        textView.setMaxLines(3);
        textView.setPadding(t100.d(10.0f), 0, t100.d(10.0f), 0);
        textView.setLineSpacing(t100.e, 1.0f);
        textView.getLayoutParams().height = -2;
    }

    /* JADX INFO: renamed from: b */
    public static qed0.a m20480b(int i, int i2) {
        return new qed0.a(1, i2, i, true);
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m20481c(User user, Context context, int[] iArr) {
        String strValueOf;
        String string = context.getString(R$string.f1818Im);
        int i = user.location.distance;
        if (i > 10000) {
            string = context.getString(R$string.f1788Hm);
            strValueOf = "10+";
        } else if (i > 1000) {
            strValueOf = String.valueOf(i / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
            string = context.getString(R$string.f1788Hm);
        } else {
            strValueOf = i > 100 ? String.valueOf(i) : "100";
        }
        String str = strValueOf + string;
        String strValueOf2 = user.age.intValue() > 30 ? "30+" : String.valueOf(user.age);
        String string2 = context.getString(R$string.f2607ip, strValueOf2);
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(TEnum.equals(user.gender, "female") ? R$string.f2577hp : R$string.f2546gp, strValueOf2, str));
        sb.append(" ");
        String string3 = sb.toString();
        SpannableString spannableString = new SpannableString(string3);
        if (string3.contains(str)) {
            int length = strValueOf.length();
            int i2 = f18132a;
            int i3 = f18133b;
            m20491m(spannableString, string3, str, length, i2, i3, iArr);
            if (string3.contains(string2)) {
                m20491m(spannableString, string3, string2, strValueOf2.length(), i2, i3, iArr);
            }
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m20482d(User user) {
        j760<String, String> j760VarM20484f = m20484f(CoreModule.f1533b, user.location.distance);
        String str = ((String) j760VarM20484f.a) + ((String) j760VarM20484f.b);
        String strReplace = String.format(vs80.m25864a(R$string.f2728mn, new Object[0]), str, user.age + "");
        if (CoreModule.m1854P().m11713i().m19779N()) {
            strReplace = strReplace.replace("获取SVIP解密她是谁", "开通特权立即和她聊天！");
        }
        String str2 = strReplace;
        String str3 = String.format(CoreModule.f1533b.getString(R$string.f2759nn), user.age + "");
        SpannableString spannableString = new SpannableString(str2);
        int length = ((String) j760VarM20484f.a).length();
        int i = f18134c;
        int i2 = f18133b;
        m20492n(spannableString, str2, str, length, i, i2);
        m20492n(spannableString, str2, str3, (user.age + "").length(), i, i2);
        return spannableString;
    }

    /* JADX INFO: renamed from: e */
    public static j760<String, String> m20483e(Context context, int i) {
        String strValueOf;
        String string = context.getString(R$string.f1818Im);
        if (i > 99000) {
            string = context.getString(R$string.f1788Hm);
            strValueOf = "99+";
        } else if (i > 1000) {
            String strValueOf2 = String.valueOf(i / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
            string = context.getString(R$string.f1788Hm);
            strValueOf = strValueOf2;
        } else {
            strValueOf = i > 100 ? String.valueOf(i) : "100";
        }
        return vwb.Y(strValueOf, string);
    }

    /* JADX INFO: renamed from: f */
    public static j760<String, String> m20484f(Context context, int i) {
        String strValueOf;
        String string = context.getString(R$string.f1818Im);
        if (i > 10000) {
            string = context.getString(R$string.f1788Hm);
            strValueOf = "10+";
        } else if (i >= 1000) {
            String strValueOf2 = String.valueOf(i / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
            string = context.getString(R$string.f1788Hm);
            strValueOf = strValueOf2;
        } else {
            strValueOf = i > 100 ? String.valueOf(i) : "100";
        }
        return vwb.Y(strValueOf, string);
    }

    /* JADX INFO: renamed from: g */
    public static CharSequence m20485g(User user, View view, TextView textView) {
        return m20486h(user, view, textView, f18132a, f18133b);
    }

    /* JADX INFO: renamed from: h */
    public static CharSequence m20486h(User user, View view, TextView textView, int i, int i2) {
        return m20487i(user, view, textView, i, i2, null);
    }

    /* JADX INFO: renamed from: i */
    public static CharSequence m20487i(User user, View view, TextView textView, int i, int i2, int[] iArr) {
        String str;
        Context context = view.getContext();
        String strValueOf = String.valueOf(user.age);
        boolean z = user.age.intValue() >= 40;
        boolean zG0 = rza.G0();
        j760<String, String> j760VarM20483e = m20483e(context, user.location.distance);
        String str2 = (String) j760VarM20483e.a;
        String str3 = ((String) j760VarM20483e.a) + ((String) j760VarM20483e.b);
        String str4 = strValueOf + context.getString(R$string.f1698Em);
        if (z) {
            str = String.format(view.getContext().getString(R$string.f1938Mm), str3);
        } else {
            str = String.format(view.getContext().getString(R$string.f1668Dm), zG0 ? str3 : str4, zG0 ? str4 : str3);
        }
        String str5 = str;
        SpannableString spannableString = new SpannableString(str5);
        m20490l(spannableString, str5, str3, str2.length(), i, i2);
        if (!z) {
            m20490l(spannableString, str5, str4, strValueOf.length(), i, i2);
        }
        m20479a(view, textView);
        return spannableString;
    }

    /* JADX INFO: renamed from: j */
    public static qed0.a m20488j(int i, int i2) {
        return new qed0.a(1, i2, i, true);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m20489k(User user) {
        return NullChecker.b(user) && TEnum.equals(user.gender, "male") && TEnum.equals(user.settings.getLookingFor(), "female");
    }

    /* JADX INFO: renamed from: l */
    public static void m20490l(SpannableString spannableString, String str, String str2, int i, int i2, int i3) {
        int i4 = t100.d;
        int iIndexOf = str.indexOf(str2);
        spannableString.setSpan(new qed0(i4, -498866, -1, new qed0.a[]{m20480b(i + iIndexOf, i2), m20488j(-1, i3)}), iIndexOf, str2.length() + iIndexOf, 18);
    }

    /* JADX INFO: renamed from: m */
    public static void m20491m(SpannableString spannableString, String str, String str2, int i, int i2, int i3, int[] iArr) {
        int i4 = t100.g;
        int color = Color.parseColor("#ffe8aa");
        int color2 = Color.parseColor("#d59d24");
        int iIndexOf = str.indexOf(str2);
        int length = str2.length();
        qed0 qed0Var = new qed0(i4, color, color2, new qed0.a[]{m20480b(i + iIndexOf, i2), m20488j(-1, i3)});
        int i5 = t100.f;
        int i6 = t100.c;
        qed0Var.c(i5, i6, i6, i6);
        spannableString.setSpan(qed0Var, iIndexOf, length + iIndexOf, 18);
    }

    /* JADX INFO: renamed from: n */
    public static void m20492n(SpannableString spannableString, String str, String str2, int i, int i2, int i3) {
        int i4 = t100.g;
        int color = Color.parseColor("#ffe8aa");
        int color2 = Color.parseColor("#d59d24");
        int iIndexOf = str.indexOf(str2);
        int length = str2.length();
        if (iIndexOf != -1) {
            qed0 qed0VarA = new qed0(i4, color, color2, new qed0.a[]{m20480b(i + iIndexOf, i2), m20488j(-1, i3)}).a(false);
            qed0VarA.d(t100.d(2.0f));
            spannableString.setSpan(qed0VarA, iIndexOf, length + iIndexOf, 18);
        } else {
            CrashHelper.c(new Exception("renderSpanRenderEndSpace childString not find allString：" + str + "--childString：" + str2));
        }
    }
}
