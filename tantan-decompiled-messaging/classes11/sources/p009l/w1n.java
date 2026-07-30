package p009l;

import android.content.Context;
import android.os.Bundle;
import com.appsflyer.AppsFlyerLib;
import com.facebook.appevents.AppEventsLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.concurrent.RejectedExecutionException;
import l.n11;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class w1n implements ctl {

    /* JADX INFO: renamed from: e */
    public static volatile w1n f21848e;

    /* JADX INFO: renamed from: a */
    public final Context f21849a;

    /* JADX INFO: renamed from: b */
    public final FirebaseAnalytics f21850b;

    /* JADX INFO: renamed from: c */
    public final AppEventsLogger f21851c;

    /* JADX INFO: renamed from: d */
    public final AppsFlyerLib f21852d = AppsFlyerLib.getInstance();

    public w1n(Context context) {
        this.f21849a = context.getApplicationContext();
        this.f21850b = FirebaseAnalytics.getInstance(context);
        this.f21851c = AppEventsLogger.e(context);
    }

    /* JADX INFO: renamed from: c */
    public static ctl m23771c(Context context) {
        if (f21848e == null) {
            synchronized (w1n.class) {
                try {
                    if (f21848e == null) {
                        f21848e = new w1n(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f21848e;
    }

    /* JADX INFO: renamed from: g */
    public static String m23772g(String str) {
        str.getClass();
        if (str.equals("value")) {
            return "af_revenue";
        }
        return !str.equals("currency") ? str : "af_currency";
    }

    /* JADX INFO: renamed from: h */
    public static String m23773h(String str) {
        str.getClass();
        if (str.equals("value")) {
            return "_valueToSum";
        }
        return !str.equals("currency") ? str : "fb_currency";
    }

    /* JADX INFO: renamed from: i */
    public static String m23774i(String str) {
        str.getClass();
        String str2 = "value";
        if (!str.equals("value")) {
            str2 = "currency";
            if (!str.equals("currency")) {
                return str;
            }
        }
        return str2;
    }

    @Override // p009l.ctl
    /* JADX INFO: renamed from: a */
    public void mo12840a(String str, String str2) {
        this.f21850b.setUserProperty(str, str2);
    }

    @Override // p009l.ctl
    /* JADX INFO: renamed from: b */
    public void mo12841b(String str, Object... objArr) {
        n11.h(objArr.length % 2 == 0);
        m23775d(str, objArr);
        m23776e(str, objArr);
        m23777f(str, objArr);
    }

    /* JADX INFO: renamed from: d */
    public final void m23775d(String str, Object[] objArr) {
        HashMap map = new HashMap();
        for (int i = 0; i < objArr.length; i += 2) {
            Object obj = objArr[i];
            Object obj2 = objArr[i + 1];
            if (NullChecker.a(str) && NullChecker.a(obj2)) {
                map.put(m23772g((String) obj), obj2);
            }
        }
        this.f21852d.logEvent(this.f21849a, str, map);
    }

    /* JADX INFO: renamed from: e */
    public final void m23776e(String str, Object[] objArr) {
        String str2 = "fb_" + str;
        Bundle bundle = new Bundle();
        for (int i = 0; i < objArr.length; i += 2) {
            Object obj = objArr[i];
            Object obj2 = objArr[i + 1];
            if (NullChecker.a(obj) && NullChecker.a(obj2)) {
                String strM23773h = m23773h((String) obj);
                if (obj2 instanceof String) {
                    bundle.putString(strM23773h, (String) obj2);
                } else if (obj2 instanceof Double) {
                    bundle.putDouble(strM23773h, ((Double) obj2).doubleValue());
                } else if (obj2 instanceof Float) {
                    bundle.putFloat(strM23773h, ((Float) obj2).floatValue());
                } else if (obj2 instanceof Integer) {
                    bundle.putInt(strM23773h, ((Integer) obj2).intValue());
                } else if (obj2 instanceof Boolean) {
                    bundle.putBoolean(strM23773h, ((Boolean) obj2).booleanValue());
                }
            }
        }
        try {
            this.f21851c.d(str2, bundle);
        } catch (RejectedExecutionException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m23777f(String str, Object[] objArr) {
        Bundle bundle = new Bundle();
        for (int i = 0; i < objArr.length; i += 2) {
            Object obj = objArr[i];
            Object obj2 = objArr[i + 1];
            if (NullChecker.a(obj) && NullChecker.a(obj2)) {
                String strM23774i = m23774i((String) obj);
                if (obj2 instanceof String) {
                    bundle.putString(strM23774i, (String) obj2);
                } else if (obj2 instanceof Double) {
                    bundle.putDouble(strM23774i, ((Double) obj2).doubleValue());
                } else if (obj2 instanceof Float) {
                    bundle.putFloat(strM23774i, ((Float) obj2).floatValue());
                } else if (obj2 instanceof Integer) {
                    bundle.putInt(strM23774i, ((Integer) obj2).intValue());
                } else if (obj2 instanceof Boolean) {
                    bundle.putBoolean(strM23774i, ((Boolean) obj2).booleanValue());
                }
            }
        }
        this.f21850b.logEvent(str, bundle);
    }
}
