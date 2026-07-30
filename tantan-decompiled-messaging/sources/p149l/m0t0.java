package p149l;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class m0t0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f130760a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final Object f130761b = new Object();

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f130762c = null;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public final AtomicBoolean f130763d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public final AtomicInteger f130764e = new AtomicInteger(-1);

    /* JADX INFO: renamed from: f */
    public final AtomicReference f130765f = new AtomicReference(null);

    /* JADX INFO: renamed from: g */
    public final AtomicReference f130766g = new AtomicReference(null);

    /* JADX INFO: renamed from: h */
    public final ConcurrentMap f130767h = new ConcurrentHashMap(9);

    /* JADX INFO: renamed from: i */
    public final AtomicReference f130768i = new AtomicReference(null);

    /* JADX INFO: renamed from: j */
    public final BlockingQueue f130769j = new ArrayBlockingQueue(20);

    /* JADX INFO: renamed from: k */
    public final Object f130770k = new Object();

    @VisibleForTesting
    /* JADX INFO: renamed from: q */
    public static final boolean m152521q(Context context) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132248h0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.m12474a(context, ModuleDescriptor.MODULE_ID) < ((Integer) d1s0.m109677c().m144697a(m7s0.f132261i0)).intValue()) {
            return false;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132274j0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m152522a(Context context) {
        Object objM152538r;
        if (m152537p(context) && (objM152538r = m152538r("generateEventId", context)) != null) {
            return objM152538r.toString();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m152523b(final Context context) {
        ExecutorService threadPoolExecutor;
        if (!m152537p(context)) {
            return null;
        }
        long jLongValue = ((Long) d1s0.m109677c().m144697a(m7s0.f132222f0)).longValue();
        if (jLongValue < 0) {
            return (String) m152538r("getAppInstanceId", context);
        }
        if (this.f130760a.get() == null) {
            if (ClientLibraryUtils.isPackageSide()) {
                threadPoolExecutor = nbw0.m158842a().mo145327b(((Integer) d1s0.m109677c().m144697a(m7s0.f132235g0)).intValue(), new l0t0(this), 2);
            } else {
                x6s0 x6s0Var = m7s0.f132235g0;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) d1s0.m109677c().m144697a(x6s0Var)).intValue(), ((Integer) d1s0.m109677c().m144697a(x6s0Var)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new l0t0(this));
            }
            j0t0.m139203a(this.f130760a, null, threadPoolExecutor);
        }
        try {
            return (String) ((ExecutorService) this.f130760a.get()).submit(new Callable() { // from class: l.k0t0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f120513a.m152526e(context);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m152524c(Context context) {
        if (m152537p(context) && m152543w(context, "com.google.android.gms.measurement.AppMeasurement", this.f130765f, true)) {
            try {
                String str = (String) m152539s(context, "getCurrentScreenName").invoke(this.f130765f.get(), null);
                if (str == null) {
                    str = (String) m152539s(context, "getCurrentScreenClass").invoke(this.f130765f.get(), null);
                }
                return str == null ? "" : str;
            } catch (Exception unused) {
                m152542v("getCurrentScreenName", false);
            }
        }
        return "";
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m152525d(Context context) {
        if (!m152537p(context)) {
            return null;
        }
        synchronized (this.f130761b) {
            try {
                String str = this.f130762c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) m152538r("getGmpAppId", context);
                this.f130762c = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String m152526e(Context context) throws Exception {
        return (String) m152538r("getAppInstanceId", context);
    }

    /* JADX INFO: renamed from: f */
    public final void m152527f(Context context, String str) {
        if (m152537p(context)) {
            m152540t(context, str, "beginAdUnitExposure");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m152528g(Context context, String str) {
        if (m152537p(context)) {
            m152540t(context, str, "endAdUnitExposure");
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m152529h(Context context, String str) {
        m152541u(context, "_aa", str, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m152530i(Context context, String str) {
        m152541u(context, "_aq", str, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m152531j(Context context, String str) {
        m152541u(context, "_ac", str, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m152532k(Context context, String str) {
        m152541u(context, "_ai", str, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m152533l(Context context, String str, String str2, String str3, int i) {
        if (m152537p(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            m152541u(context, "_ar", str, bundle);
            xsu0.m210834k("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m152534m(Context context, zzl zzlVar) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132313m0)).booleanValue() && m152537p(context) && m152521q(context)) {
            synchronized (this.f130770k) {
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m152535n(Context context, zzff zzffVar) {
        n0t0.m157287d(context).mo128976b().m200782c(zzffVar);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132313m0)).booleanValue() && m152537p(context) && m152521q(context)) {
            synchronized (this.f130770k) {
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: o */
    public final void m152536o(Context context, String str) {
        if (m152537p(context) && (context instanceof Activity) && m152543w(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f130766g, false)) {
            Method declaredMethod = (Method) this.f130767h.get("setCurrentScreen");
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    this.f130767h.put("setCurrentScreen", declaredMethod);
                } catch (Exception unused) {
                    m152542v("setCurrentScreen", false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.f130766g.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                m152542v("setCurrentScreen", false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX INFO: renamed from: p */
    public final boolean m152537p(Context context) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132157a0)).booleanValue() && !this.f130763d.get()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132287k0)).booleanValue()) {
                return true;
            }
            if (this.f130764e.get() == -1) {
                exr0.m118703b();
                if (i2t0.m134091u(context, 12451000)) {
                    this.f130764e.set(1);
                } else {
                    exr0.m118703b();
                    if (i2t0.m134092v(context)) {
                        x2t0.m206869g("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f130764e.set(0);
                    } else {
                        this.f130764e.set(1);
                    }
                }
            }
            if (this.f130764e.get() == 1) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final Object m152538r(String str, Context context) {
        if (!m152543w(context, "com.google.android.gms.measurement.AppMeasurement", this.f130765f, true)) {
            return null;
        }
        try {
            return m152539s(context, str).invoke(this.f130765f.get(), null);
        } catch (Exception unused) {
            m152542v(str, true);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final Method m152539s(Context context, String str) {
        Method method = (Method) this.f130767h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            this.f130767h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            m152542v(str, false);
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m152540t(Context context, String str, String str2) {
        if (m152543w(context, "com.google.android.gms.measurement.AppMeasurement", this.f130765f, true)) {
            Method declaredMethod = (Method) this.f130767h.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.f130767h.put(str2, declaredMethod);
                } catch (Exception unused) {
                    m152542v(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.f130765f.get(), str);
                xsu0.m210834k("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                m152542v(str2, false);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m152541u(Context context, String str, String str2, @Nullable Bundle bundle) {
        if (m152537p(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                x2t0.m206867e("Invalid event ID: ".concat(String.valueOf(str2)), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (m152543w(context, "com.google.android.gms.measurement.AppMeasurement", this.f130765f, true)) {
                Method declaredMethod = (Method) this.f130767h.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.f130767h.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        m152542v("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.f130765f.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    m152542v("logEventInternal", true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m152542v(String str, boolean z) {
        if (this.f130763d.get()) {
            return;
        }
        x2t0.m206869g("Invoke Firebase method " + str + " error.");
        if (z) {
            x2t0.m206869g("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.f130763d.set(true);
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m152543w(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            j0t0.m139203a(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            return true;
        } catch (Exception unused) {
            m152542v("getInstance", z);
            return false;
        }
    }
}
