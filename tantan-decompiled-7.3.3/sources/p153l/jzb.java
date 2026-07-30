package p153l;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageIntent;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.Stack;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class jzb {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m147649a(RemoteViews remoteViews, Boolean bool) {
        if (bool.booleanValue()) {
            remoteViews.setTextColor(ycc0.f198441X, -1);
            remoteViews.setTextColor(ycc0.f198440W, -1);
        } else {
            remoteViews.setTextColor(ycc0.f198441X, -1291845632);
            remoteViews.setTextColor(ycc0.f198440W, -1291845632);
        }
    }

    /* JADX INFO: renamed from: b */
    public static RemoteViews m147650b(Context context) {
        Notification.Builder builder = new Notification.Builder(context);
        builder.setContentTitle("fakeContentTitle").setContentText("fakeContentText").setTicker("fakeTicker");
        return builder.createContentView();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m147651c(TextView textView, TextView textView2, y20<Boolean> y20Var) {
        int defaultColor = NullChecker.m82487b(textView) ? textView.getTextColors().getDefaultColor() : 0;
        int defaultColor2 = NullChecker.m82487b(textView2) ? textView2.getTextColors().getDefaultColor() : 0;
        if (defaultColor != 0) {
            y20Var.call(Boolean.valueOf(m147656h(defaultColor)));
            return true;
        }
        if (defaultColor2 == 0) {
            return false;
        }
        y20Var.call(Boolean.valueOf(m147656h(defaultColor2)));
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m147652d(RemoteViews remoteViews, y20<Boolean> y20Var) {
        try {
            if (NullChecker.m82487b(remoteViews) && remoteViews.getLayoutId() > 0) {
                TextView textView = null;
                View viewInflate = LayoutInflater.from(App.f16088e).inflate(remoteViews.getLayoutId(), (ViewGroup) null);
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
                if (NullChecker.m82487b(textView)) {
                    y20Var.call(Boolean.valueOf(m147656h(textView.getTextColors().getDefaultColor())));
                    return true;
                }
            }
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m147653e(RemoteViews remoteViews, y20<Boolean> y20Var) {
        try {
            int iM147655g = m147655g("title");
            int iM147655g2 = m147655g("text");
            if (!NullChecker.m82487b(remoteViews) || remoteViews.getLayoutId() <= 0) {
                return false;
            }
            View viewInflate = LayoutInflater.from(App.f16088e).inflate(remoteViews.getLayoutId(), (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(iM147655g);
            return m147651c(viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null, iM147655g2 > 0 ? (TextView) viewInflate.findViewById(iM147655g2) : null, y20Var);
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m147654f(y20<Boolean> y20Var) {
        y20Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g */
    public static int m147655g(String str) {
        int identifier = Resources.getSystem().getIdentifier(str, "id", "android");
        if (identifier > 0) {
            return identifier;
        }
        try {
            Field field = Class.forName("com.android.internal.R$id").getField(str);
            field.setAccessible(true);
            return field.getInt(null);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m147656h(int i) {
        return ((int) ((((float) ((Color.red(i) + Color.green(i)) + Color.blue(i))) / 3.0f) + 0.5f)) >= 128;
    }

    /* JADX INFO: renamed from: i */
    public static RemoteViews m147657i(PushMessage pushMessage, String str) {
        String str2;
        final RemoteViews remoteViews = new RemoteViews(App.f16088e.getPackageName(), (ive0.m142296j() || ive0.m142298l()) ? jec0.f120451T : jec0.f120450S);
        m147658j(new y20() { // from class: l.izb
            @Override // p153l.y20
            public final void call(Object obj) {
                jzb.m147649a(remoteViews, (Boolean) obj);
            }
        });
        String str3 = "Ta在等你，打个招呼";
        if (PushMessageIntent.superLike_received.equals(pushMessage.intent)) {
            remoteViews.setViewVisibility(ycc0.f198438U, 0);
            remoteViews.setViewVisibility(ycc0.f198494z, 8);
            remoteViews.setImageViewResource(ycc0.f198438U, cbc0.f80789p0);
            str2 = " 超级喜欢你";
        } else if (PushMessageIntent.conversation_single.equals(pushMessage.intent)) {
            String strReplaceAll = Pattern.compile("<[^>]+>", 2).matcher(pushMessage.value).replaceAll("");
            int iIndexOf = strReplaceAll.indexOf(10);
            remoteViews.setViewVisibility(ycc0.f198438U, 8);
            remoteViews.setViewVisibility(ycc0.f198494z, 0);
            remoteViews.setImageViewResource(ycc0.f198494z, cbc0.f80771g0);
            if (iIndexOf > 0) {
                strReplaceAll = strReplaceAll.subSequence(0, iIndexOf).toString();
            }
            str3 = strReplaceAll;
            str2 = "说：";
        } else {
            remoteViews.setViewVisibility(ycc0.f198438U, 0);
            remoteViews.setViewVisibility(ycc0.f198494z, 8);
            remoteViews.setImageViewResource(ycc0.f198438U, cbc0.f80731F0);
            str2 = " 也喜欢你";
        }
        remoteViews.setTextViewText(ycc0.f198441X, str + str2);
        remoteViews.setTextViewText(ycc0.f198440W, str3);
        return remoteViews;
    }

    /* JADX INFO: renamed from: j */
    public static void m147658j(y20<Boolean> y20Var) {
        RemoteViews remoteViewsM147650b = m147650b(App.f16088e);
        if (m147653e(remoteViewsM147650b, y20Var) || m147652d(remoteViewsM147650b, y20Var)) {
            return;
        }
        m147654f(y20Var);
    }
}
