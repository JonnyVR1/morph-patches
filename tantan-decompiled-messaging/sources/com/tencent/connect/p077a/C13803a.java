package com.tencent.connect.p077a;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.p105b.C14363e;
import com.tencent.open.utils.C14392j;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.tencent.connect.a.a */
/* JADX INFO: loaded from: classes13.dex */
public class C13803a {

    /* JADX INFO: renamed from: a */
    private static Class<?> f57023a = null;

    /* JADX INFO: renamed from: b */
    private static Class<?> f57024b = null;

    /* JADX INFO: renamed from: c */
    private static Method f57025c = null;

    /* JADX INFO: renamed from: d */
    private static Method f57026d = null;

    /* JADX INFO: renamed from: e */
    private static Method f57027e = null;

    /* JADX INFO: renamed from: f */
    private static Method f57028f = null;

    /* JADX INFO: renamed from: g */
    private static boolean f57029g = false;

    /* JADX INFO: renamed from: a */
    public static void m81986a(Context context, QQToken qQToken, String str, String... strArr) {
        if (f57029g) {
            m81988b(context, qQToken);
            try {
                f57026d.invoke(f57024b, context, str, strArr);
            } catch (Exception e) {
                SLog.m84307e("OpenConfig", "trackCustomEvent exception: " + e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m81988b(Context context, QQToken qQToken) {
        try {
            if (m81987a(context, qQToken)) {
                f57028f.invoke(f57023a, Boolean.TRUE);
            } else {
                f57028f.invoke(f57023a, Boolean.FALSE);
            }
        } catch (Exception e) {
            SLog.m84307e("OpenConfig", "checkStatStatus exception: " + e.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m81989c(Context context, QQToken qQToken) {
        String str = "Aqc" + qQToken.getAppId();
        try {
            f57023a = Class.forName("com.tencent.stat.StatConfig");
            Class<?> cls = Class.forName("com.tencent.stat.StatService");
            f57024b = cls;
            f57025c = cls.getMethod("reportQQ", Context.class, String.class);
            f57026d = f57024b.getMethod("trackCustomEvent", Context.class, String.class, String[].class);
            Class<?> cls2 = f57024b;
            Class cls3 = Integer.TYPE;
            f57027e = cls2.getMethod("commitEvents", Context.class, cls3);
            Class<?> cls4 = f57023a;
            Class cls5 = Boolean.TYPE;
            f57028f = cls4.getMethod("setEnableStatService", cls5);
            m81988b(context, qQToken);
            f57023a.getMethod("setAutoExceptionCaught", cls5).invoke(f57023a, Boolean.FALSE);
            f57023a.getMethod("setEnableSmartReporting", cls5).invoke(f57023a, Boolean.TRUE);
            f57023a.getMethod("setSendPeriodMinutes", cls3).invoke(f57023a, 1440);
            Class<?> cls6 = Class.forName("com.tencent.stat.StatReportStrategy");
            f57023a.getMethod("setStatSendStrategy", cls6).invoke(f57023a, cls6.getField("PERIOD").get(null));
            f57024b.getMethod("startStatService", Context.class, String.class, String.class).invoke(f57024b, context, str, Class.forName("com.tencent.stat.common.StatConstants").getField("VERSION").get(null));
            f57029g = true;
        } catch (Exception e) {
            SLog.m84307e("OpenConfig", "start4QQConnect exception: " + e.toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m81990d(Context context, QQToken qQToken) {
        if (!TextUtils.isEmpty(qQToken.getOpenId())) {
            C14363e.m84265a().m84268a(qQToken.getOpenId(), qQToken.getAppId(), "2", "1", Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE, "0", "0", "0");
        }
        if (f57029g) {
            m81988b(context, qQToken);
            if (qQToken.getOpenId() != null) {
                try {
                    f57025c.invoke(f57024b, context, qQToken.getOpenId());
                } catch (Exception e) {
                    SLog.m84307e("OpenConfig", "reportQQ exception: " + e.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m81987a(Context context, QQToken qQToken) {
        return C14392j.m84415a(context, qQToken.getAppId()).m84425b("Common_ta_enable");
    }
}
