package p149l;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.p046p1.mobile.putong.core.p053ui.visitor.C9049e;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VisitorsRecommendationType;
import java.util.Random;

/* JADX INFO: loaded from: classes9.dex */
public class d6m0 {

    /* JADX INFO: renamed from: a */
    public static CharSequence[] f84639a = new CharSequence[2];

    /* JADX INFO: renamed from: b */
    public static CharSequence[] f84640b = new CharSequence[5];

    /* JADX INFO: renamed from: c */
    public static CharSequence[] f84641c = new CharSequence[3];

    /* JADX INFO: renamed from: d */
    public static CharSequence[] f84642d = new CharSequence[2];

    /* JADX INFO: renamed from: a */
    public static CharSequence m110173a(Context context, String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(z0c0.f200976d)), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m110174b(Context context, y5m0 y5m0Var, User user, String str) {
        Random random = new Random();
        if (y5m0Var.f196455b.recommendationType.equals("online")) {
            m110175c(user);
            return f84639a[random.nextInt(2)];
        }
        if (y5m0Var.f196455b.recommendationType.equals(VisitorsRecommendationType.sameCity)) {
            m110177e(context, user, str);
            return f84640b[random.nextInt(5)];
        }
        if (y5m0Var.f196455b.recommendationType.equals(VisitorsRecommendationType.visitCount)) {
            m110178f(context, user, y5m0Var.f196455b.visitCount);
            return f84641c[random.nextInt(3)];
        }
        m110176d(user);
        return f84642d[random.nextInt(2)];
    }

    /* JADX INFO: renamed from: c */
    public static void m110175c(User user) {
        f84639a[0] = user.isFemale() ? "她正在等你来聊天" : "他正在等你来聊天";
        f84639a[1] = user.isFemale() ? "她刚好在线" : "他刚好在线";
    }

    /* JADX INFO: renamed from: d */
    public static void m110176d(User user) {
        f84642d[0] = user.isFemale() ? "她很受欢迎" : "他很受欢迎";
        f84642d[1] = user.isFemale() ? "她对你很感兴趣" : "他对你很感兴趣";
    }

    /* JADX INFO: renamed from: e */
    public static void m110177e(Context context, User user, String str) {
        f84640b[0] = user.isFemale() ? m110173a(context, String.format("她也在%s", str), str) : m110173a(context, String.format("他也在%s", str), str);
        f84640b[1] = user.isFemale() ? m110173a(context, String.format("她在%s想认识你", str), str) : m110173a(context, String.format("他也在%s想认识你", str), str);
        f84640b[2] = m110173a(context, String.format("你们都在%s", str), str);
        f84640b[3] = user.isFemale() ? m110173a(context, String.format("她也在%s想认识新朋友", str), str) : m110173a(context, String.format("他也在%s想认识新朋友", str), str);
        f84640b[4] = user.isFemale() ? m110173a(context, String.format("她也在%s想认识同城的朋友", str), str) : m110173a(context, String.format("他也在%s想认识同城的朋友", str), str);
    }

    /* JADX INFO: renamed from: f */
    public static void m110178f(Context context, User user, int i) {
        String strM57963c = C9049e.m57963c(i);
        f84641c[0] = user.isFemale() ? m110173a(context, String.format("她频繁访问了你%s回", strM57963c), strM57963c) : m110173a(context, String.format("他频繁访问了你%s回", strM57963c), strM57963c);
        f84641c[1] = user.isFemale() ? m110173a(context, String.format("她忍不住看了你%s次", strM57963c), strM57963c) : m110173a(context, String.format("他忍不住看了你%s次", strM57963c), strM57963c);
        f84641c[2] = user.isFemale() ? m110173a(context, String.format("她偷偷看过你%s次", strM57963c), strM57963c) : m110173a(context, String.format("他偷偷看过你%s次", strM57963c), strM57963c);
    }
}
