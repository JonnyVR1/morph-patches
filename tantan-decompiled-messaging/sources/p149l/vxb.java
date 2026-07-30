package p149l;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageIntent;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.Stack;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class vxb {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m200512a(RemoteViews remoteViews, Boolean bool) {
        if (bool.booleanValue()) {
            remoteViews.setTextColor(s4c0.f162320X, -1);
            remoteViews.setTextColor(s4c0.f162319W, -1);
        } else {
            remoteViews.setTextColor(s4c0.f162320X, -1291845632);
            remoteViews.setTextColor(s4c0.f162319W, -1291845632);
        }
    }

    /* JADX INFO: renamed from: b */
    public static RemoteViews m200513b(Context context) {
        Notification.Builder builder = new Notification.Builder(context);
        builder.setContentTitle("fakeContentTitle").setContentText("fakeContentText").setTicker("fakeTicker");
        return builder.createContentView();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m200514c(TextView textView, TextView textView2, e30<Boolean> e30Var) {
        int defaultColor = NullChecker.m81304b(textView) ? textView.getTextColors().getDefaultColor() : 0;
        int defaultColor2 = NullChecker.m81304b(textView2) ? textView2.getTextColors().getDefaultColor() : 0;
        if (defaultColor != 0) {
            e30Var.call(Boolean.valueOf(m200519h(defaultColor)));
            return true;
        }
        if (defaultColor2 == 0) {
            return false;
        }
        e30Var.call(Boolean.valueOf(m200519h(defaultColor2)));
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m200515d(RemoteViews remoteViews, e30<Boolean> e30Var) {
        try {
            if (NullChecker.m81304b(remoteViews) && remoteViews.getLayoutId() > 0) {
                TextView textView = null;
                View viewInflate = LayoutInflater.from(App.f15369e).inflate(remoteViews.getLayoutId(), (ViewGroup) null);
                Stack stack = new Stack();
                stack.push(viewInflate);
                while (!stack.isEmpty()) {
                    View view = (View) stack.pop();
                    if (view instanceof TextView) {
                        textView = (TextView) view;
                        break;
                    }
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        int childCount = viewGroup.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            stack.push(viewGroup.getChildAt(i));
                        }
                    }
                }
                stack.clear();
                if (NullChecker.m81304b(textView)) {
                    e30Var.call(Boolean.valueOf(m200519h(textView.getTextColors().getDefaultColor())));
                    return true;
                }
            }
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m200516e(RemoteViews remoteViews, e30<Boolean> e30Var) {
        try {
            int iM200518g = m200518g("title");
            int iM200518g2 = m200518g("text");
            if (!NullChecker.m81304b(remoteViews) || remoteViews.getLayoutId() <= 0) {
                return false;
            }
            View viewInflate = LayoutInflater.from(App.f15369e).inflate(remoteViews.getLayoutId(), (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(iM200518g);
            return m200514c(viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null, iM200518g2 > 0 ? (TextView) viewInflate.findViewById(iM200518g2) : null, e30Var);
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m200517f(e30<Boolean> e30Var) {
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g */
    public static int m200518g(String str) {
        int identifier = Resources.getSystem().getIdentifier(str, "id", "android");
        if (identifier > 0) {
            return identifier;
        }
        try {
            Field field = Class.forName("com.android.internal.R$id").getField(str);
            field.setAccessible(true);
            return field.getInt(null);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m200519h(int i) {
        return ((int) ((((float) ((Color.red(i) + Color.green(i)) + Color.blue(i))) / 3.0f) + 0.5f)) >= 128;
    }

    /* JADX INFO: renamed from: i */
    public static RemoteViews m200520i(PushMessage pushMessage, String str) {
        String str2;
        final RemoteViews remoteViews = new RemoteViews(App.f15369e.getPackageName(), (bne0.m102781j() || bne0.m102783l()) ? e6c0.f89538T : e6c0.f89537S);
        m200521j(new e30() { // from class: l.uxb
            @Override // p149l.e30
            public final void call(Object obj) {
                vxb.m200512a(remoteViews, (Boolean) obj);
            }
        });
        String str3 = "Ta在等你，打个招呼";
        if (PushMessageIntent.superLike_received.equals(pushMessage.intent)) {
            remoteViews.setViewVisibility(s4c0.f162317U, 0);
            remoteViews.setViewVisibility(s4c0.f162373z, 8);
            remoteViews.setImageViewResource(s4c0.f162317U, w2c0.f184193p0);
            str2 = " 超级喜欢你";
        } else if (PushMessageIntent.conversation_single.equals(pushMessage.intent)) {
            String strReplaceAll = Pattern.compile("<[^>]+>", 2).matcher(pushMessage.value).replaceAll("");
            int iIndexOf = strReplaceAll.indexOf(10);
            remoteViews.setViewVisibility(s4c0.f162317U, 8);
            remoteViews.setViewVisibility(s4c0.f162373z, 0);
            remoteViews.setImageViewResource(s4c0.f162373z, w2c0.f184175g0);
            if (iIndexOf > 0) {
                strReplaceAll = strReplaceAll.subSequence(0, iIndexOf).toString();
            }
            str3 = strReplaceAll;
            str2 = "说：";
        } else {
            remoteViews.setViewVisibility(s4c0.f162317U, 0);
            remoteViews.setViewVisibility(s4c0.f162373z, 8);
            remoteViews.setImageViewResource(s4c0.f162317U, w2c0.f184135F0);
            str2 = " 也喜欢你";
        }
        remoteViews.setTextViewText(s4c0.f162320X, str + str2);
        remoteViews.setTextViewText(s4c0.f162319W, str3);
        return remoteViews;
    }

    /* JADX INFO: renamed from: j */
    public static void m200521j(e30<Boolean> e30Var) {
        RemoteViews remoteViewsM200513b = m200513b(App.f15369e);
        if (m200516e(remoteViewsM200513b, e30Var) || m200515d(remoteViewsM200513b, e30Var)) {
            return;
        }
        m200517f(e30Var);
    }
}
