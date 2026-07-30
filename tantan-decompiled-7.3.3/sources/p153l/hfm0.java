package p153l;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.p051p1.mobile.putong.core.p058ui.visitor.C9212e;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VisitorsRecommendationType;
import java.util.Random;

/* JADX INFO: loaded from: classes12.dex */
public class hfm0 {

    /* JADX INFO: renamed from: a */
    public static CharSequence[] f109331a = new CharSequence[2];

    /* JADX INFO: renamed from: b */
    public static CharSequence[] f109332b = new CharSequence[5];

    /* JADX INFO: renamed from: c */
    public static CharSequence[] f109333c = new CharSequence[3];

    /* JADX INFO: renamed from: d */
    public static CharSequence[] f109334d = new CharSequence[2];

    /* JADX INFO: renamed from: a */
    public static CharSequence m134812a(Context context, String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(f9c0.f97859d)), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m134813b(Context context, cfm0 cfm0Var, User user, String str) {
        Random random = new Random();
        if (cfm0Var.f81524b.recommendationType.equals("online")) {
            m134814c(user);
            return f109331a[random.nextInt(2)];
        }
        if (cfm0Var.f81524b.recommendationType.equals(VisitorsRecommendationType.sameCity)) {
            m134816e(context, user, str);
            return f109332b[random.nextInt(5)];
        }
        if (cfm0Var.f81524b.recommendationType.equals(VisitorsRecommendationType.visitCount)) {
            m134817f(context, user, cfm0Var.f81524b.visitCount);
            return f109333c[random.nextInt(3)];
        }
        m134815d(user);
        return f109334d[random.nextInt(2)];
    }

    /* JADX INFO: renamed from: c */
    public static void m134814c(User user) {
        f109331a[0] = user.isFemale() ? "她正在等你来聊天" : "他正在等你来聊天";
        f109331a[1] = user.isFemale() ? "她刚好在线" : "他刚好在线";
    }

    /* JADX INFO: renamed from: d */
    public static void m134815d(User user) {
        f109334d[0] = user.isFemale() ? "她很受欢迎" : "他很受欢迎";
        f109334d[1] = user.isFemale() ? "她对你很感兴趣" : "他对你很感兴趣";
    }

    /* JADX INFO: renamed from: e */
    public static void m134816e(Context context, User user, String str) {
        f109332b[0] = user.isFemale() ? m134812a(context, String.format("她也在%s", str), str) : m134812a(context, String.format("他也在%s", str), str);
        f109332b[1] = user.isFemale() ? m134812a(context, String.format("她在%s想认识你", str), str) : m134812a(context, String.format("他也在%s想认识你", str), str);
        f109332b[2] = m134812a(context, String.format("你们都在%s", str), str);
        f109332b[3] = user.isFemale() ? m134812a(context, String.format("她也在%s想认识新朋友", str), str) : m134812a(context, String.format("他也在%s想认识新朋友", str), str);
        f109332b[4] = user.isFemale() ? m134812a(context, String.format("她也在%s想认识同城的朋友", str), str) : m134812a(context, String.format("他也在%s想认识同城的朋友", str), str);
    }

    /* JADX INFO: renamed from: f */
    public static void m134817f(Context context, User user, int i) {
        String strM59146c = C9212e.m59146c(i);
        f109333c[0] = user.isFemale() ? m134812a(context, String.format("她频繁访问了你%s回", strM59146c), strM59146c) : m134812a(context, String.format("他频繁访问了你%s回", strM59146c), strM59146c);
        f109333c[1] = user.isFemale() ? m134812a(context, String.format("她忍不住看了你%s次", strM59146c), strM59146c) : m134812a(context, String.format("他忍不住看了你%s次", strM59146c), strM59146c);
        f109333c[2] = user.isFemale() ? m134812a(context, String.format("她偷偷看过你%s次", strM59146c), strM59146c) : m134812a(context, String.format("他偷偷看过你%s次", strM59146c), strM59146c);
    }
}
