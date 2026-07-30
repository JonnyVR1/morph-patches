package p153l;

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

/* JADX INFO: loaded from: classes10.dex */
public final class w3n implements qvl {

    /* JADX INFO: renamed from: e */
    public static volatile w3n f187153e;

    /* JADX INFO: renamed from: a */
    public final Context f187154a;

    /* JADX INFO: renamed from: b */
    public final FirebaseAnalytics f187155b;

    /* JADX INFO: renamed from: c */
    public final AppEventsLogger f187156c;

    /* JADX INFO: renamed from: d */
    public final AppsFlyerLib f187157d = AppsFlyerLib.getInstance();

    public w3n(Context context) {
        this.f187154a = context.getApplicationContext();
        this.f187155b = FirebaseAnalytics.getInstance(context);
        this.f187156c = AppEventsLogger.m7697e(context);
    }

    /* JADX INFO: renamed from: c */
    public static qvl m204771c(Context context) {
        if (f187153e == null) {
            synchronized (w3n.class) {
                try {
                    if (f187153e == null) {
                        f187153e = new w3n(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f187153e;
    }

    /* JADX INFO: renamed from: g */
    public static String m204772g(String str) {
        str.getClass();
        if (str.equals("value")) {
            return AFInAppEventParameterName.REVENUE;
        }
        return !str.equals(FirebaseAnalytics.Param.CURRENCY) ? str : AFInAppEventParameterName.CURRENCY;
    }

    /* JADX INFO: renamed from: h */
    public static String m204773h(String str) {
        str.getClass();
        if (str.equals("value")) {
            return "_valueToSum";
        }
        return !str.equals(FirebaseAnalytics.Param.CURRENCY) ? str : "fb_currency";
    }

    /* JADX INFO: renamed from: i */
    public static String m204774i(String str) {
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

    @Override // p153l.qvl
    /* JADX INFO: renamed from: a */
    public void mo178318a(String str, String str2) {
        this.f187155b.setUserProperty(str, str2);
    }

    @Override // p153l.qvl
    /* JADX INFO: renamed from: b */
    public void mo178319b(String str, Object... objArr) {
        u11.m193894h(objArr.length % 2 == 0);
        m204775d(str, objArr);
        m204776e(str, objArr);
        m204777f(str, objArr);
    }

    /* JADX INFO: renamed from: d */
    public final void m204775d(String str, Object[] objArr) {
        HashMap map = new HashMap();
        for (int i = 0; i < objArr.length; i += 2) {
            Object obj = objArr[i];
            Object obj2 = objArr[i + 1];
            if (NullChecker.m82486a(str) && NullChecker.m82486a(obj2)) {
                map.put(m204772g((String) obj), obj2);
            }
        }
        this.f187157d.logEvent(this.f187154a, str, map);
    }

    /* JADX INFO: renamed from: e */
    public final void m204776e(String str, Object[] objArr) {
        String str2 = "fb_" + str;
        Bundle bundle = new Bundle();
        for (int i = 0; i < objArr.length; i += 2) {
            Object obj = objArr[i];
            Object obj2 = objArr[i + 1];
            if (NullChecker.m82486a(obj) && NullChecker.m82486a(obj2)) {
                String strM204773h = m204773h((String) obj);
                if (obj2 instanceof String) {
                    bundle.putString(strM204773h, (String) obj2);
                } else if (obj2 instanceof Double) {
                    bundle.putDouble(strM204773h, ((Double) obj2).doubleValue());
                } else if (obj2 instanceof Float) {
                    bundle.putFloat(strM204773h, ((Float) obj2).floatValue());
                } else if (obj2 instanceof Integer) {
                    bundle.putInt(strM204773h, ((Integer) obj2).intValue());
                } else if (obj2 instanceof Boolean) {
                    bundle.putBoolean(strM204773h, ((Boolean) obj2).booleanValue());
                }
            }
        }
        try {
            this.f187156c.m7699d(str2, bundle);
        } catch (RejectedExecutionException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m204777f(String str, Object[] objArr) {
        Bundle bundle = new Bundle();
        for (int i = 0; i < objArr.length; i += 2) {
            Object obj = objArr[i];
            Object obj2 = objArr[i + 1];
            if (NullChecker.m82486a(obj) && NullChecker.m82486a(obj2)) {
                String strM204774i = m204774i((String) obj);
                if (obj2 instanceof String) {
                    bundle.putString(strM204774i, (String) obj2);
                } else if (obj2 instanceof Double) {
                    bundle.putDouble(strM204774i, ((Double) obj2).doubleValue());
                } else if (obj2 instanceof Float) {
                    bundle.putFloat(strM204774i, ((Float) obj2).floatValue());
                } else if (obj2 instanceof Integer) {
                    bundle.putInt(strM204774i, ((Integer) obj2).intValue());
                } else if (obj2 instanceof Boolean) {
                    bundle.putBoolean(strM204774i, ((Boolean) obj2).booleanValue());
                }
            }
        }
        this.f187155b.logEvent(str, bundle);
    }
}
