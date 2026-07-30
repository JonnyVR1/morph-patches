package p153l;

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
public final class s9t0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f166970a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final Object f166971b = new Object();

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f166972c = null;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public final AtomicBoolean f166973d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public final AtomicInteger f166974e = new AtomicInteger(-1);

    /* JADX INFO: renamed from: f */
    public final AtomicReference f166975f = new AtomicReference(null);

    /* JADX INFO: renamed from: g */
    public final AtomicReference f166976g = new AtomicReference(null);

    /* JADX INFO: renamed from: h */
    public final ConcurrentMap f166977h = new ConcurrentHashMap(9);

    /* JADX INFO: renamed from: i */
    public final AtomicReference f166978i = new AtomicReference(null);

    /* JADX INFO: renamed from: j */
    public final BlockingQueue f166979j = new ArrayBlockingQueue(20);

    /* JADX INFO: renamed from: k */
    public final Object f166980k = new Object();

    @VisibleForTesting
    /* JADX INFO: renamed from: q */
    public static final boolean m185225q(Context context) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168319h0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.m12528a(context, ModuleDescriptor.MODULE_ID) < ((Integer) jas0.m144075c().m176505a(sgs0.f168332i0)).intValue()) {
            return false;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168345j0)).booleanValue()) {
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
    public final String m185226a(Context context) {
        Object objM185242r;
        if (m185241p(context) && (objM185242r = m185242r("generateEventId", context)) != null) {
            return objM185242r.toString();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m185227b(final Context context) {
        ExecutorService threadPoolExecutor;
        if (!m185241p(context)) {
            return null;
        }
        long jLongValue = ((Long) jas0.m144075c().m176505a(sgs0.f168293f0)).longValue();
        if (jLongValue < 0) {
            return (String) m185242r("getAppInstanceId", context);
        }
        if (this.f166970a.get() == null) {
            if (ClientLibraryUtils.isPackageSide()) {
                threadPoolExecutor = tkw0.m191601a().mo176973b(((Integer) jas0.m144075c().m176505a(sgs0.f168306g0)).intValue(), new r9t0(this), 2);
            } else {
                dgs0 dgs0Var = sgs0.f168306g0;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) jas0.m144075c().m176505a(dgs0Var)).intValue(), ((Integer) jas0.m144075c().m176505a(dgs0Var)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new r9t0(this));
            }
            p9t0.m171391a(this.f166970a, null, threadPoolExecutor);
        }
        try {
            return (String) ((ExecutorService) this.f166970a.get()).submit(new Callable() { // from class: l.q9t0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f156263a.m185230e(context);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m185228c(Context context) {
        if (m185241p(context) && m185247w(context, "com.google.android.gms.measurement.AppMeasurement", this.f166975f, true)) {
            try {
                String str = (String) m185243s(context, "getCurrentScreenName").invoke(this.f166975f.get(), null);
                if (str == null) {
                    str = (String) m185243s(context, "getCurrentScreenClass").invoke(this.f166975f.get(), null);
                }
                return str == null ? "" : str;
            } catch (Exception unused) {
                m185246v("getCurrentScreenName", false);
            }
        }
        return "";
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m185229d(Context context) {
        if (!m185241p(context)) {
            return null;
        }
        synchronized (this.f166971b) {
            try {
                String str = this.f166972c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) m185242r("getGmpAppId", context);
                this.f166972c = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String m185230e(Context context) throws Exception {
        return (String) m185242r("getAppInstanceId", context);
    }

    /* JADX INFO: renamed from: f */
    public final void m185231f(Context context, String str) {
        if (m185241p(context)) {
            m185244t(context, str, "beginAdUnitExposure");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m185232g(Context context, String str) {
        if (m185241p(context)) {
            m185244t(context, str, "endAdUnitExposure");
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m185233h(Context context, String str) {
        m185245u(context, "_aa", str, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m185234i(Context context, String str) {
        m185245u(context, "_aq", str, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m185235j(Context context, String str) {
        m185245u(context, "_ac", str, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m185236k(Context context, String str) {
        m185245u(context, "_ai", str, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m185237l(Context context, String str, String str2, String str3, int i) {
        if (m185241p(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            m185245u(context, "_ar", str, bundle);
            d2v0.m113737k("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m185238m(Context context, zzl zzlVar) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168384m0)).booleanValue() && m185241p(context) && m185225q(context)) {
            synchronized (this.f166980k) {
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m185239n(Context context, zzff zzffVar) {
        t9t0.m189767d(context).mo162048b().m103138c(zzffVar);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168384m0)).booleanValue() && m185241p(context) && m185225q(context)) {
            synchronized (this.f166980k) {
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: o */
    public final void m185240o(Context context, String str) {
        if (m185241p(context) && (context instanceof Activity) && m185247w(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f166976g, false)) {
            Method declaredMethod = (Method) this.f166977h.get("setCurrentScreen");
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    this.f166977h.put("setCurrentScreen", declaredMethod);
                } catch (Exception unused) {
                    m185246v("setCurrentScreen", false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.f166976g.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                m185246v("setCurrentScreen", false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX INFO: renamed from: p */
    public final boolean m185241p(Context context) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168228a0)).booleanValue() && !this.f166973d.get()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168358k0)).booleanValue()) {
                return true;
            }
            if (this.f166974e.get() == -1) {
                k6s0.m148569b();
                if (obt0.m167044u(context, 12451000)) {
                    this.f166974e.set(1);
                } else {
                    k6s0.m148569b();
                    if (obt0.m167045v(context)) {
                        dct0.m115298g("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f166974e.set(0);
                    } else {
                        this.f166974e.set(1);
                    }
                }
            }
            if (this.f166974e.get() == 1) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final Object m185242r(String str, Context context) {
        if (!m185247w(context, "com.google.android.gms.measurement.AppMeasurement", this.f166975f, true)) {
            return null;
        }
        try {
            return m185243s(context, str).invoke(this.f166975f.get(), null);
        } catch (Exception unused) {
            m185246v(str, true);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final Method m185243s(Context context, String str) {
        Method method = (Method) this.f166977h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            this.f166977h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            m185246v(str, false);
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m185244t(Context context, String str, String str2) {
        if (m185247w(context, "com.google.android.gms.measurement.AppMeasurement", this.f166975f, true)) {
            Method declaredMethod = (Method) this.f166977h.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.f166977h.put(str2, declaredMethod);
                } catch (Exception unused) {
                    m185246v(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.f166975f.get(), str);
                d2v0.m113737k("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                m185246v(str2, false);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m185245u(Context context, String str, String str2, @Nullable Bundle bundle) {
        if (m185241p(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                dct0.m115296e("Invalid event ID: ".concat(String.valueOf(str2)), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (m185247w(context, "com.google.android.gms.measurement.AppMeasurement", this.f166975f, true)) {
                Method declaredMethod = (Method) this.f166977h.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.f166977h.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        m185246v("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.f166975f.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    m185246v("logEventInternal", true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m185246v(String str, boolean z) {
        if (this.f166973d.get()) {
            return;
        }
        dct0.m115298g("Invoke Firebase method " + str + " error.");
        if (z) {
            dct0.m115298g("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.f166973d.set(true);
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m185247w(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            p9t0.m171391a(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            return true;
        } catch (Exception unused) {
            m185246v("getInstance", z);
            return false;
        }
    }
}
