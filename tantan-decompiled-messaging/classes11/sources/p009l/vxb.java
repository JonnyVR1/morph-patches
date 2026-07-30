package p009l;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.PushMessage;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.Stack;
import java.util.regex.Pattern;
import l.bne0;
import l.e30;
import l.e6c0;
import l.s4c0;
import l.w2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vxb {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m23744a(RemoteViews remoteViews, Boolean bool) {
        if (bool.booleanValue()) {
            remoteViews.setTextColor(s4c0.X, -1);
            remoteViews.setTextColor(s4c0.W, -1);
        } else {
            remoteViews.setTextColor(s4c0.X, -1291845632);
            remoteViews.setTextColor(s4c0.W, -1291845632);
        }
    }

    /* JADX INFO: renamed from: b */
    public static RemoteViews m23745b(Context context) {
        Notification.Builder builder = new Notification.Builder(context);
        builder.setContentTitle("fakeContentTitle").setContentText("fakeContentText").setTicker("fakeTicker");
        return builder.createContentView();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m23746c(TextView textView, TextView textView2, e30<Boolean> e30Var) {
        int defaultColor = NullChecker.b(textView) ? textView.getTextColors().getDefaultColor() : 0;
        int defaultColor2 = NullChecker.b(textView2) ? textView2.getTextColors().getDefaultColor() : 0;
        if (defaultColor != 0) {
            e30Var.call(Boolean.valueOf(m23751h(defaultColor)));
            return true;
        }
        if (defaultColor2 == 0) {
            return false;
        }
        e30Var.call(Boolean.valueOf(m23751h(defaultColor2)));
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m23747d(RemoteViews remoteViews, e30<Boolean> e30Var) {
        try {
            if (NullChecker.b(remoteViews) && remoteViews.getLayoutId() > 0) {
                TextView textView = null;
                View viewInflate = LayoutInflater.from(App.e).inflate(remoteViews.getLayoutId(), (ViewGroup) null);
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
                if (NullChecker.b(textView)) {
                    e30Var.call(Boolean.valueOf(m23751h(textView.getTextColors().getDefaultColor())));
                    return true;
                }
            }
        } catch (Throwable th) {
            CrashHelper.c(th);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m23748e(RemoteViews remoteViews, e30<Boolean> e30Var) {
        try {
            int iM23750g = m23750g("title");
            int iM23750g2 = m23750g("text");
            if (!NullChecker.b(remoteViews) || remoteViews.getLayoutId() <= 0) {
                return false;
            }
            View viewInflate = LayoutInflater.from(App.e).inflate(remoteViews.getLayoutId(), (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(iM23750g);
            return m23746c(viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null, iM23750g2 > 0 ? (TextView) viewInflate.findViewById(iM23750g2) : null, e30Var);
        } catch (Throwable th) {
            CrashHelper.c(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m23749f(e30<Boolean> e30Var) {
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g */
    public static int m23750g(String str) {
        int identifier = Resources.getSystem().getIdentifier(str, "id", "android");
        if (identifier > 0) {
            return identifier;
        }
        try {
            Field field = Class.forName("com.android.internal.R$id").getField(str);
            field.setAccessible(true);
            return field.getInt(null);
        } catch (Exception e) {
            CrashHelper.c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m23751h(int i) {
        return ((int) ((((float) ((Color.red(i) + Color.green(i)) + Color.blue(i))) / 3.0f) + 0.5f)) >= 128;
    }

    /* JADX INFO: renamed from: i */
    public static RemoteViews m23752i(PushMessage pushMessage, String str) {
        String str2;
        final RemoteViews remoteViews = new RemoteViews(App.e.getPackageName(), (bne0.j() || bne0.l()) ? e6c0.T : e6c0.S);
        m23753j(new e30() { // from class: l.uxb
            public final void call(Object obj) {
                vxb.m23744a(remoteViews, (Boolean) obj);
            }
        });
        String str3 = "Ta在等你，打个招呼";
        if ("superLike.received".equals(pushMessage.intent)) {
            remoteViews.setViewVisibility(s4c0.U, 0);
            remoteViews.setViewVisibility(s4c0.z, 8);
            remoteViews.setImageViewResource(s4c0.U, w2c0.p0);
            str2 = " 超级喜欢你";
        } else if ("conversation.single".equals(pushMessage.intent)) {
            String strReplaceAll = Pattern.compile("<[^>]+>", 2).matcher(pushMessage.value).replaceAll("");
            int iIndexOf = strReplaceAll.indexOf(10);
            remoteViews.setViewVisibility(s4c0.U, 8);
            remoteViews.setViewVisibility(s4c0.z, 0);
            remoteViews.setImageViewResource(s4c0.z, w2c0.g0);
            if (iIndexOf > 0) {
                strReplaceAll = strReplaceAll.subSequence(0, iIndexOf).toString();
            }
            str3 = strReplaceAll;
            str2 = "说：";
        } else {
            remoteViews.setViewVisibility(s4c0.U, 0);
            remoteViews.setViewVisibility(s4c0.z, 8);
            remoteViews.setImageViewResource(s4c0.U, w2c0.F0);
            str2 = " 也喜欢你";
        }
        remoteViews.setTextViewText(s4c0.X, str + str2);
        remoteViews.setTextViewText(s4c0.W, str3);
        return remoteViews;
    }

    /* JADX INFO: renamed from: j */
    public static void m23753j(e30<Boolean> e30Var) {
        RemoteViews remoteViewsM23745b = m23745b(App.e);
        if (m23748e(remoteViewsM23745b, e30Var) || m23747d(remoteViewsM23745b, e30Var)) {
            return;
        }
        m23749f(e30Var);
    }
}
