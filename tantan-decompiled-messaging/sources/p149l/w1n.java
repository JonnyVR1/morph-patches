package p149l;

import android.content.Context;
import android.os.Bundle;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AppsFlyerLib;
import com.facebook.appevents.AppEventsLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes11.dex */
public final class w1n implements ctl {

    /* JADX INFO: renamed from: e */
    public static volatile w1n f184025e;

    /* JADX INFO: renamed from: a */
    public final Context f184026a;

    /* JADX INFO: renamed from: b */
    public final FirebaseAnalytics f184027b;

    /* JADX INFO: renamed from: c */
    public final AppEventsLogger f184028c;

    /* JADX INFO: renamed from: d */
    public final AppsFlyerLib f184029d = AppsFlyerLib.getInstance();

    public w1n(Context context) {
        this.f184026a = context.getApplicationContext();
        this.f184027b = FirebaseAnalytics.getInstance(context);
        this.f184028c = AppEventsLogger.m7643e(context);
    }

    /* JADX INFO: renamed from: c */
    public static ctl m200938c(Context context) {
        if (f184025e == null) {
            synchronized (w1n.class) {
                try {
                    if (f184025e == null) {
                        f184025e = new w1n(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f184025e;
    }

    /* JADX INFO: renamed from: g */
    public static String m200939g(String str) {
        str.getClass();
        if (str.equals("value")) {
            return AFInAppEventParameterName.REVENUE;
        }
        return !str.equals(FirebaseAnalytics.Param.CURRENCY) ? str : AFInAppEventParameterName.CURRENCY;
    }

    /* JADX INFO: renamed from: h */
    public static String m200940h(String str) {
        str.getClass();
        if (str.equals("value")) {
            return "_valueToSum";
        }
        return !str.equals(FirebaseAnalytics.Param.CURRENCY) ? str : "fb_currency";
    }

    /* JADX INFO: renamed from: i */
    public static String m200941i(String str) {
        str.getClass();
        String str2 = "value";
        if (!str.equals("value")) {
            str2 = FirebaseAnalytics.Param.CURRENCY;
            if (!str.equals(FirebaseAnalytics.Param.CURRENCY)) {
                return str;
            }
        }
        return str2;
    }

    @Override // p149l.ctl
    /* JADX INFO: renamed from: a */
    public void mo108691a(String str, String str2) {
        this.f184027b.setUserProperty(str, str2);
    }

    @Override // p149l.ctl
    /* JADX INFO: renamed from: b */
    public void mo108692b(String str, Object... objArr) {
        n11.m157335h(objArr.length % 2 == 0);
        m200942d(str, objArr);
        m200943e(str, objArr);
        m200944f(str, objArr);
    }

    /* JADX INFO: renamed from: d */
    public final void m200942d(String str, Object[] objArr) {
        HashMap map = new HashMap();
        for (int i = 0; i < objArr.length; i += 2) {
            Object obj = objArr[i];
            Object obj2 = objArr[i + 1];
            if (NullChecker.m81303a(str) && NullChecker.m81303a(obj2)) {
                map.put(m200939g((String) obj), obj2);
            }
        }
        this.f184029d.logEvent(this.f184026a, str, map);
    }

    /* JADX INFO: renamed from: e */
    public final void m200943e(String str, Object[] objArr) {
        String str2 = "fb_" + str;
        Bundle bundle = new Bundle();
        for (int i = 0; i < objArr.length; i += 2) {
            Object obj = objArr[i];
            Object obj2 = objArr[i + 1];
            if (NullChecker.m81303a(obj) && NullChecker.m81303a(obj2)) {
                String strM200940h = m200940h((String) obj);
                if (obj2 instanceof String) {
                    bundle.putString(strM200940h, (String) obj2);
                } else if (obj2 instanceof Double) {
                    bundle.putDouble(strM200940h, ((Double) obj2).doubleValue());
                } else if (obj2 instanceof Float) {
                    bundle.putFloat(strM200940h, ((Float) obj2).floatValue());
                } else if (obj2 instanceof Integer) {
                    bundle.putInt(strM200940h, ((Integer) obj2).intValue());
                } else if (obj2 instanceof Boolean) {
                    bundle.putBoolean(strM200940h, ((Boolean) obj2).booleanValue());
                }
            }
        }
        try {
            this.f184028c.m7645d(str2, bundle);
        } catch (RejectedExecutionException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m200944f(String str, Object[] objArr) {
        Bundle bundle = new Bundle();
        for (int i = 0; i < objArr.length; i += 2) {
            Object obj = objArr[i];
            Object obj2 = objArr[i + 1];
            if (NullChecker.m81303a(obj) && NullChecker.m81303a(obj2)) {
                String strM200941i = m200941i((String) obj);
                if (obj2 instanceof String) {
                    bundle.putString(strM200941i, (String) obj2);
                } else if (obj2 instanceof Double) {
                    bundle.putDouble(strM200941i, ((Double) obj2).doubleValue());
                } else if (obj2 instanceof Float) {
                    bundle.putFloat(strM200941i, ((Float) obj2).floatValue());
                } else if (obj2 instanceof Integer) {
                    bundle.putInt(strM200941i, ((Integer) obj2).intValue());
                } else if (obj2 instanceof Boolean) {
                    bundle.putBoolean(strM200941i, ((Boolean) obj2).booleanValue());
                }
            }
        }
        this.f184027b.logEvent(str, bundle);
    }
}
