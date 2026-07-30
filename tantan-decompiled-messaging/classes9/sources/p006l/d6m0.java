package p006l;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.p000p1.mobile.putong.core.p004ui.visitor.C0485e;
import com.p1.mobile.putong.data.User;
import java.util.Random;
import l.z0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class d6m0 {

    /* JADX INFO: renamed from: a */
    public static CharSequence[] f10038a = new CharSequence[2];

    /* JADX INFO: renamed from: b */
    public static CharSequence[] f10039b = new CharSequence[5];

    /* JADX INFO: renamed from: c */
    public static CharSequence[] f10040c = new CharSequence[3];

    /* JADX INFO: renamed from: d */
    public static CharSequence[] f10041d = new CharSequence[2];

    /* JADX INFO: renamed from: a */
    public static CharSequence m13809a(Context context, String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(z0c0.d)), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m13810b(Context context, y5m0 y5m0Var, User user, String str) {
        Random random = new Random();
        if (y5m0Var.f28034b.recommendationType.equals("online")) {
            m13811c(user);
            return f10038a[random.nextInt(2)];
        }
        if (y5m0Var.f28034b.recommendationType.equals("sameCity")) {
            m13813e(context, user, str);
            return f10039b[random.nextInt(5)];
        }
        if (y5m0Var.f28034b.recommendationType.equals("visitCount")) {
            m13814f(context, user, y5m0Var.f28034b.visitCount);
            return f10040c[random.nextInt(3)];
        }
        m13812d(user);
        return f10041d[random.nextInt(2)];
    }

    /* JADX INFO: renamed from: c */
    public static void m13811c(User user) {
        f10038a[0] = user.isFemale() ? "她正在等你来聊天" : "他正在等你来聊天";
        f10038a[1] = user.isFemale() ? "她刚好在线" : "他刚好在线";
    }

    /* JADX INFO: renamed from: d */
    public static void m13812d(User user) {
        f10041d[0] = user.isFemale() ? "她很受欢迎" : "他很受欢迎";
        f10041d[1] = user.isFemale() ? "她对你很感兴趣" : "他对你很感兴趣";
    }

    /* JADX INFO: renamed from: e */
    public static void m13813e(Context context, User user, String str) {
        f10039b[0] = user.isFemale() ? m13809a(context, String.format("她也在%s", str), str) : m13809a(context, String.format("他也在%s", str), str);
        f10039b[1] = user.isFemale() ? m13809a(context, String.format("她在%s想认识你", str), str) : m13809a(context, String.format("他也在%s想认识你", str), str);
        f10039b[2] = m13809a(context, String.format("你们都在%s", str), str);
        f10039b[3] = user.isFemale() ? m13809a(context, String.format("她也在%s想认识新朋友", str), str) : m13809a(context, String.format("他也在%s想认识新朋友", str), str);
        f10039b[4] = user.isFemale() ? m13809a(context, String.format("她也在%s想认识同城的朋友", str), str) : m13809a(context, String.format("他也在%s想认识同城的朋友", str), str);
    }

    /* JADX INFO: renamed from: f */
    public static void m13814f(Context context, User user, int i) {
        String strM11481c = C0485e.m11481c(i);
        f10040c[0] = user.isFemale() ? m13809a(context, String.format("她频繁访问了你%s回", strM11481c), strM11481c) : m13809a(context, String.format("他频繁访问了你%s回", strM11481c), strM11481c);
        f10040c[1] = user.isFemale() ? m13809a(context, String.format("她忍不住看了你%s次", strM11481c), strM11481c) : m13809a(context, String.format("他忍不住看了你%s次", strM11481c), strM11481c);
        f10040c[2] = user.isFemale() ? m13809a(context, String.format("她偷偷看过你%s次", strM11481c), strM11481c) : m13809a(context, String.format("他偷偷看过你%s次", strM11481c), strM11481c);
    }
}
