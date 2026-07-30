package com.tencent.connect.p082a;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.p110b.C14526e;
import com.tencent.open.utils.C14555j;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.tencent.connect.a.a */
/* JADX INFO: loaded from: classes12.dex */
public class C13966a {

    /* JADX INFO: renamed from: a */
    private static Class<?> f57871a = null;

    /* JADX INFO: renamed from: b */
    private static Class<?> f57872b = null;

    /* JADX INFO: renamed from: c */
    private static Method f57873c = null;

    /* JADX INFO: renamed from: d */
    private static Method f57874d = null;

    /* JADX INFO: renamed from: e */
    private static Method f57875e = null;

    /* JADX INFO: renamed from: f */
    private static Method f57876f = null;

    /* JADX INFO: renamed from: g */
    private static boolean f57877g = false;

    /* JADX INFO: renamed from: a */
    public static void m83169a(Context context, QQToken qQToken, String str, String... strArr) {
        if (f57877g) {
            m83171b(context, qQToken);
            try {
                f57874d.invoke(f57872b, context, str, strArr);
            } catch (Exception e) {
                SLog.m85490e("OpenConfig", "trackCustomEvent exception: " + e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m83171b(Context context, QQToken qQToken) {
        try {
            if (m83170a(context, qQToken)) {
                f57876f.invoke(f57871a, Boolean.TRUE);
            } else {
                f57876f.invoke(f57871a, Boolean.FALSE);
            }
        } catch (Exception e) {
            SLog.m85490e("OpenConfig", "checkStatStatus exception: " + e.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m83172c(Context context, QQToken qQToken) {
        String str = "Aqc" + qQToken.getAppId();
        try {
            f57871a = Class.forName("com.tencent.stat.StatConfig");
            Class<?> cls = Class.forName("com.tencent.stat.StatService");
            f57872b = cls;
            f57873c = cls.getMethod("reportQQ", Context.class, String.class);
            f57874d = f57872b.getMethod("trackCustomEvent", Context.class, String.class, String[].class);
            Class<?> cls2 = f57872b;
            Class cls3 = Integer.TYPE;
            f57875e = cls2.getMethod("commitEvents", Context.class, cls3);
            Class<?> cls4 = f57871a;
            Class cls5 = Boolean.TYPE;
            f57876f = cls4.getMethod("setEnableStatService", cls5);
            m83171b(context, qQToken);
            f57871a.getMethod("setAutoExceptionCaught", cls5).invoke(f57871a, Boolean.FALSE);
            f57871a.getMethod("setEnableSmartReporting", cls5).invoke(f57871a, Boolean.TRUE);
            f57871a.getMethod("setSendPeriodMinutes", cls3).invoke(f57871a, 1440);
            Class<?> cls6 = Class.forName("com.tencent.stat.StatReportStrategy");
            f57871a.getMethod("setStatSendStrategy", cls6).invoke(f57871a, cls6.getField("PERIOD").get(null));
            f57872b.getMethod("startStatService", Context.class, String.class, String.class).invoke(f57872b, context, str, Class.forName("com.tencent.stat.common.StatConstants").getField("VERSION").get(null));
            f57877g = true;
        } catch (Exception e) {
            SLog.m85490e("OpenConfig", "start4QQConnect exception: " + e.toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m83173d(Context context, QQToken qQToken) {
        if (!TextUtils.isEmpty(qQToken.getOpenId())) {
            C14526e.m85448a().m85451a(qQToken.getOpenId(), qQToken.getAppId(), "2", "1", Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE, "0", "0", "0");
        }
        if (f57877g) {
            m83171b(context, qQToken);
            if (qQToken.getOpenId() != null) {
                try {
                    f57873c.invoke(f57872b, context, qQToken.getOpenId());
                } catch (Exception e) {
                    SLog.m85490e("OpenConfig", "reportQQ exception: " + e.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m83170a(Context context, QQToken qQToken) {
        return C14555j.m85598a(context, qQToken.getAppId()).m85608b("Common_ta_enable");
    }
}
