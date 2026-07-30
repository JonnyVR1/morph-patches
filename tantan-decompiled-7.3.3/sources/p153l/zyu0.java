package p153l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public class zyu0 {

    /* JADX INFO: renamed from: j */
    public static volatile zyu0 f206635j;

    /* JADX INFO: renamed from: a */
    public final String f206636a;

    /* JADX INFO: renamed from: b */
    public final Clock f206637b;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f206638c;

    /* JADX INFO: renamed from: d */
    public final ax0 f206639d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("listenerList")
    public final List<Pair<t0y0, BinderC21939b>> f206640e;

    /* JADX INFO: renamed from: f */
    public int f206641f;

    /* JADX INFO: renamed from: g */
    public boolean f206642g;

    /* JADX INFO: renamed from: h */
    public String f206643h;

    /* JADX INFO: renamed from: i */
    public volatile pgu0 f206644i;

    /* JADX INFO: renamed from: l.zyu0$b */
    public static class BinderC21939b extends rru0 {

        /* JADX INFO: renamed from: a */
        public final t0y0 f206649a;

        public BinderC21939b(t0y0 t0y0Var) {
            this.f206649a = t0y0Var;
        }

        @Override // p153l.cou0
        /* JADX INFO: renamed from: G3 */
        public final void mo111709G3(String str, String str2, Bundle bundle, long j) {
            this.f206649a.onEvent(str, str2, bundle, j);
        }

        @Override // p153l.cou0
        public final int zza() {
            return System.identityHashCode(this.f206649a);
        }
    }

    /* JADX INFO: renamed from: l.zyu0$c */
    public static class BinderC21940c extends rru0 {

        /* JADX INFO: renamed from: a */
        public final y0y0 f206650a;

        public BinderC21940c(y0y0 y0y0Var) {
            this.f206650a = y0y0Var;
        }

        @Override // p153l.cou0
        /* JADX INFO: renamed from: G3 */
        public final void mo111709G3(String str, String str2, Bundle bundle, long j) {
            this.f206650a.mo15117a(str, str2, bundle, j);
        }

        @Override // p153l.cou0
        public final int zza() {
            return System.identityHashCode(this.f206650a);
        }
    }

    /* JADX INFO: renamed from: l.zyu0$d */
    public class C21941d implements Application.ActivityLifecycleCallbacks {
        public C21941d() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            zyu0.this.m222204w(new a6w0(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            zyu0.this.m222204w(new wbw0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            zyu0.this.m222204w(new qaw0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            zyu0.this.m222204w(new d7w0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            xhu0 xhu0Var = new xhu0();
            zyu0.this.m222204w(new cdw0(this, activity, xhu0Var));
            Bundle bundleM211077P2 = xhu0Var.m211077P2(50L);
            if (bundleM211077P2 != null) {
                bundle.putAll(bundleM211077P2);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            zyu0.this.m222204w(new h8w0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            zyu0.this.m222204w(new m9w0(this, activity));
        }
    }

    public zyu0(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !m222174P(str2, str3)) {
            this.f206636a = "FA";
        } else {
            this.f206636a = str;
        }
        this.f206637b = DefaultClock.getInstance();
        this.f206638c = v7u0.m200277a().mo161805a(new hev0(this), 1);
        this.f206639d = new ax0(this);
        this.f206640e = new ArrayList();
        if (m222154L(context) && !m222185a0()) {
            this.f206643h = null;
            this.f206642g = true;
            return;
        }
        if (m222174P(str2, str3)) {
            this.f206643h = str2;
        } else {
            this.f206643h = "fa";
        }
        m222204w(new txu0(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new C21941d());
    }

    /* JADX INFO: renamed from: L */
    public static boolean m222154L(Context context) {
        try {
            return new dsx0(context, dsx0.m117784a(context)).m117785b("google_app_id") != null;
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static zyu0 m222157i(@NonNull Context context) {
        return m222158j(context, null, null, null, null);
    }

    /* JADX INFO: renamed from: j */
    public static zyu0 m222158j(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (f206635j == null) {
            synchronized (zyu0.class) {
                try {
                    if (f206635j == null) {
                        f206635j = new zyu0(context, str, str2, str3, bundle);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f206635j;
    }

    /* JADX INFO: renamed from: A */
    public final void m222162A(t0y0 t0y0Var) {
        Preconditions.checkNotNull(t0y0Var);
        synchronized (this.f206640e) {
            for (int i = 0; i < this.f206640e.size(); i++) {
                try {
                    if (t0y0Var.equals(this.f206640e.get(i).first)) {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            BinderC21939b binderC21939b = new BinderC21939b(t0y0Var);
            this.f206640e.add(new Pair<>(t0y0Var, binderC21939b));
            if (this.f206644i != null) {
                try {
                    this.f206644i.registerOnMeasurementEventListener(binderC21939b);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            m222204w(new q3w0(this, binderC21939b));
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m222163B(y0y0 y0y0Var) {
        BinderC21940c binderC21940c = new BinderC21940c(y0y0Var);
        if (this.f206644i != null) {
            try {
                this.f206644i.setEventInterceptor(binderC21940c);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
            }
        }
        m222204w(new dpv0(this, binderC21940c));
    }

    /* JADX INFO: renamed from: C */
    public final void m222164C(boolean z) {
        m222204w(new nwv0(this, z));
    }

    /* JADX INFO: renamed from: F */
    public final ax0 m222165F() {
        return this.f206639d;
    }

    /* JADX INFO: renamed from: G */
    public final void m222166G(Bundle bundle) {
        m222204w(new i8v0(this, bundle));
    }

    /* JADX INFO: renamed from: H */
    public final void m222167H(String str) {
        m222204w(new sgv0(this, str));
    }

    /* JADX INFO: renamed from: I */
    public final void m222168I(String str, String str2) {
        m222203v(null, str, str2, false);
    }

    /* JADX INFO: renamed from: J */
    public final void m222169J(String str, String str2, Bundle bundle) {
        m222202u(str, str2, bundle, true, true, null);
    }

    /* JADX INFO: renamed from: K */
    public final void m222170K(t0y0 t0y0Var) {
        Pair<t0y0, BinderC21939b> pair;
        Preconditions.checkNotNull(t0y0Var);
        synchronized (this.f206640e) {
            int i = 0;
            while (true) {
                try {
                    if (i >= this.f206640e.size()) {
                        pair = null;
                        break;
                    } else {
                        if (t0y0Var.equals(this.f206640e.get(i).first)) {
                            pair = this.f206640e.get(i);
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair == null) {
                return;
            }
            this.f206640e.remove(pair);
            BinderC21939b binderC21939b = (BinderC21939b) pair.second;
            if (this.f206644i != null) {
                try {
                    this.f206644i.unregisterOnMeasurementEventListener(binderC21939b);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            m222204w(new l2w0(this, binderC21939b));
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: M */
    public final Long m222171M() {
        xhu0 xhu0Var = new xhu0();
        m222204w(new buv0(this, xhu0Var));
        return xhu0Var.m211078P3(120000L);
    }

    /* JADX INFO: renamed from: N */
    public final void m222172N(Bundle bundle) {
        m222204w(new zbv0(this, bundle));
    }

    /* JADX INFO: renamed from: O */
    public final void m222173O(String str) {
        m222204w(new nfv0(this, str));
    }

    /* JADX INFO: renamed from: P */
    public final boolean m222174P(String str, String str2) {
        return (str2 == null || str == null || m222185a0()) ? false : true;
    }

    /* JADX INFO: renamed from: R */
    public final String m222175R() {
        return this.f206643h;
    }

    /* JADX INFO: renamed from: S */
    public final void m222176S(Bundle bundle) {
        m222204w(new h1w0(this, bundle));
    }

    /* JADX INFO: renamed from: T */
    public final void m222177T(String str) {
        m222204w(new e7v0(this, str));
    }

    @WorkerThread
    /* JADX INFO: renamed from: U */
    public final String m222178U() {
        xhu0 xhu0Var = new xhu0();
        m222204w(new hvv0(this, xhu0Var));
        return xhu0Var.m211079m4(120000L);
    }

    /* JADX INFO: renamed from: V */
    public final String m222179V() {
        xhu0 xhu0Var = new xhu0();
        m222204w(new whv0(this, xhu0Var));
        return xhu0Var.m211079m4(50L);
    }

    /* JADX INFO: renamed from: W */
    public final String m222180W() {
        xhu0 xhu0Var = new xhu0();
        m222204w(new znv0(this, xhu0Var));
        return xhu0Var.m211079m4(500L);
    }

    /* JADX INFO: renamed from: X */
    public final String m222181X() {
        xhu0 xhu0Var = new xhu0();
        m222204w(new ikv0(this, xhu0Var));
        return xhu0Var.m211079m4(500L);
    }

    /* JADX INFO: renamed from: Y */
    public final String m222182Y() {
        xhu0 xhu0Var = new xhu0();
        m222204w(new cjv0(this, xhu0Var));
        return xhu0Var.m211079m4(500L);
    }

    /* JADX INFO: renamed from: Z */
    public final void m222183Z() {
        m222204w(new tav0(this));
    }

    /* JADX INFO: renamed from: a */
    public final int m222184a(String str) {
        xhu0 xhu0Var = new xhu0();
        m222204w(new prv0(this, str, xhu0Var));
        Integer num = (Integer) xhu0.m211076Y2(xhu0Var.m211077P2(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m222185a0() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m222186b() {
        xhu0 xhu0Var = new xhu0();
        m222204w(new nlv0(this, xhu0Var));
        Long lM211078P3 = xhu0Var.m211078P3(500L);
        if (lM211078P3 != null) {
            return lM211078P3.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f206637b.currentTimeMillis()).nextLong();
        int i = this.f206641f + 1;
        this.f206641f = i;
        return jNextLong + ((long) i);
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m222187c(Bundle bundle, boolean z) {
        xhu0 xhu0Var = new xhu0();
        m222204w(new vsv0(this, bundle, xhu0Var));
        if (z) {
            return xhu0Var.m211077P2(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final Object m222188d(int i) {
        xhu0 xhu0Var = new xhu0();
        m222204w(new vyv0(this, xhu0Var, i));
        return xhu0.m211076Y2(xhu0Var.m211077P2(15000L), Object.class);
    }

    /* JADX INFO: renamed from: e */
    public final List<Bundle> m222189e(String str, String str2) {
        xhu0 xhu0Var = new xhu0();
        m222204w(new p3v0(this, str, str2, xhu0Var));
        List<Bundle> list = (List) xhu0.m211076Y2(xhu0Var.m211077P2(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, Object> m222190f(String str, String str2, boolean z) {
        xhu0 xhu0Var = new xhu0();
        m222204w(new tmv0(this, str, str2, z, xhu0Var));
        Bundle bundleM211077P2 = xhu0Var.m211077P2(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        if (bundleM211077P2 == null || bundleM211077P2.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleM211077P2.size());
        for (String str3 : bundleM211077P2.keySet()) {
            Object obj = bundleM211077P2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: g */
    public final pgu0 m222191g(Context context, boolean z) {
        try {
            return jku0.asInterface(DynamiteModule.m12530e(context, DynamiteModule.f9843e, ModuleDescriptor.MODULE_ID).m12539d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            m222198q(e, true, false);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m222192k(int i, String str, Object obj, Object obj2, Object obj3) {
        m222204w(new jqv0(this, false, 5, str, obj, null, null));
    }

    /* JADX INFO: renamed from: l */
    public final void m222193l(long j) {
        m222204w(new cdv0(this, j));
    }

    /* JADX INFO: renamed from: m */
    public final void m222194m(Activity activity, String str, String str2) {
        m222204w(new a6v0(this, activity, str, str2));
    }

    /* JADX INFO: renamed from: n */
    public final void m222195n(Intent intent) {
        m222204w(new b0w0(this, intent));
    }

    /* JADX INFO: renamed from: o */
    public final void m222196o(Bundle bundle) {
        m222204w(new c0v0(this, bundle));
    }

    /* JADX INFO: renamed from: p */
    public final void m222197p(Boolean bool) {
        m222204w(new n9v0(this, bool));
    }

    /* JADX INFO: renamed from: q */
    public final void m222198q(Exception exc, boolean z, boolean z2) {
        this.f206642g |= z;
        if (!z && z2) {
            m222192k(5, "Error with data collection. Data lost.", exc, null, null);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m222199r(@NonNull String str, Bundle bundle) {
        m222202u(null, str, bundle, false, true, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m222200s(String str, String str2, Bundle bundle) {
        m222204w(new v4v0(this, str, str2, bundle));
    }

    /* JADX INFO: renamed from: t */
    public final void m222201t(String str, String str2, Bundle bundle, long j) {
        m222202u(str, str2, bundle, true, false, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: u */
    public final void m222202u(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l2) {
        m222204w(new v4w0(this, l2, str, str2, bundle, z, z2));
    }

    /* JADX INFO: renamed from: v */
    public final void m222203v(String str, String str2, Object obj, boolean z) {
        m222204w(new k2v0(this, str, str2, obj, z));
    }

    /* JADX INFO: renamed from: w */
    public final void m222204w(AbstractRunnableC21938a abstractRunnableC21938a) {
        this.f206638c.execute(abstractRunnableC21938a);
    }

    /* JADX INFO: renamed from: l.zyu0$a */
    public abstract class AbstractRunnableC21938a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final long f206645a;

        /* JADX INFO: renamed from: b */
        public final long f206646b;

        /* JADX INFO: renamed from: c */
        public final boolean f206647c;

        public AbstractRunnableC21938a(boolean z) {
            this.f206645a = zyu0.this.f206637b.currentTimeMillis();
            this.f206646b = zyu0.this.f206637b.elapsedRealtime();
            this.f206647c = z;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo96344a() throws RemoteException;

        @Override // java.lang.Runnable
        public void run() {
            if (zyu0.this.f206642g) {
                mo106547b();
                return;
            }
            try {
                mo96344a();
            } catch (Exception e) {
                zyu0.this.m222198q(e, false, this.f206647c);
                mo106547b();
            }
        }

        /* JADX INFO: renamed from: b */
        public void mo106547b() {
        }

        public AbstractRunnableC21938a(zyu0 zyu0Var) {
            this(true);
        }
    }
}
