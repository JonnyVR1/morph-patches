package p149l;

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
public class tpu0 {

    /* JADX INFO: renamed from: j */
    public static volatile tpu0 f171509j;

    /* JADX INFO: renamed from: a */
    public final String f171510a;

    /* JADX INFO: renamed from: b */
    public final Clock f171511b;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f171512c;

    /* JADX INFO: renamed from: d */
    public final tw0 f171513d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("listenerList")
    public final List<Pair<nrx0, BinderC20238b>> f171514e;

    /* JADX INFO: renamed from: f */
    public int f171515f;

    /* JADX INFO: renamed from: g */
    public boolean f171516g;

    /* JADX INFO: renamed from: h */
    public String f171517h;

    /* JADX INFO: renamed from: i */
    public volatile j7u0 f171518i;

    /* JADX INFO: renamed from: l.tpu0$b */
    public static class BinderC20238b extends liu0 {

        /* JADX INFO: renamed from: a */
        public final nrx0 f171523a;

        public BinderC20238b(nrx0 nrx0Var) {
            this.f171523a = nrx0Var;
        }

        @Override // p149l.weu0
        /* JADX INFO: renamed from: G3 */
        public final void mo131149G3(String str, String str2, Bundle bundle, long j) {
            this.f171523a.onEvent(str, str2, bundle, j);
        }

        @Override // p149l.weu0
        public final int zza() {
            return System.identityHashCode(this.f171523a);
        }
    }

    /* JADX INFO: renamed from: l.tpu0$c */
    public static class BinderC20239c extends liu0 {

        /* JADX INFO: renamed from: a */
        public final srx0 f171524a;

        public BinderC20239c(srx0 srx0Var) {
            this.f171524a = srx0Var;
        }

        @Override // p149l.weu0
        /* JADX INFO: renamed from: G3 */
        public final void mo131149G3(String str, String str2, Bundle bundle, long j) {
            this.f171524a.mo15063a(str, str2, bundle, j);
        }

        @Override // p149l.weu0
        public final int zza() {
            return System.identityHashCode(this.f171524a);
        }
    }

    /* JADX INFO: renamed from: l.tpu0$d */
    public class C20240d implements Application.ActivityLifecycleCallbacks {
        public C20240d() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            tpu0.this.m190061w(new uwv0(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            tpu0.this.m190061w(new q2w0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            tpu0.this.m190061w(new k1w0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            tpu0.this.m190061w(new xxv0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            r8u0 r8u0Var = new r8u0();
            tpu0.this.m190061w(new w3w0(this, activity, r8u0Var));
            Bundle bundleM178283P2 = r8u0Var.m178283P2(50L);
            if (bundleM178283P2 != null) {
                bundle.putAll(bundleM178283P2);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            tpu0.this.m190061w(new bzv0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            tpu0.this.m190061w(new g0w0(this, activity));
        }
    }

    public tpu0(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !m190031P(str2, str3)) {
            this.f171510a = "FA";
        } else {
            this.f171510a = str;
        }
        this.f171511b = DefaultClock.getInstance();
        this.f171512c = pyt0.m172165a().mo133414a(new b5v0(this), 1);
        this.f171513d = new tw0(this);
        this.f171514e = new ArrayList();
        if (m190011L(context) && !m190042a0()) {
            this.f171517h = null;
            this.f171516g = true;
            return;
        }
        if (m190031P(str2, str3)) {
            this.f171517h = str2;
        } else {
            this.f171517h = "fa";
        }
        m190061w(new nou0(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new C20240d());
    }

    /* JADX INFO: renamed from: L */
    public static boolean m190011L(Context context) {
        try {
            return new xix0(context, xix0.m209682a(context)).m209683b("google_app_id") != null;
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static tpu0 m190014i(@NonNull Context context) {
        return m190015j(context, null, null, null, null);
    }

    /* JADX INFO: renamed from: j */
    public static tpu0 m190015j(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (f171509j == null) {
            synchronized (tpu0.class) {
                try {
                    if (f171509j == null) {
                        f171509j = new tpu0(context, str, str2, str3, bundle);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f171509j;
    }

    /* JADX INFO: renamed from: A */
    public final void m190019A(nrx0 nrx0Var) {
        Preconditions.checkNotNull(nrx0Var);
        synchronized (this.f171514e) {
            for (int i = 0; i < this.f171514e.size(); i++) {
                try {
                    if (nrx0Var.equals(this.f171514e.get(i).first)) {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            BinderC20238b binderC20238b = new BinderC20238b(nrx0Var);
            this.f171514e.add(new Pair<>(nrx0Var, binderC20238b));
            if (this.f171518i != null) {
                try {
                    this.f171518i.registerOnMeasurementEventListener(binderC20238b);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            m190061w(new kuv0(this, binderC20238b));
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m190020B(srx0 srx0Var) {
        BinderC20239c binderC20239c = new BinderC20239c(srx0Var);
        if (this.f171518i != null) {
            try {
                this.f171518i.setEventInterceptor(binderC20239c);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
            }
        }
        m190061w(new xfv0(this, binderC20239c));
    }

    /* JADX INFO: renamed from: C */
    public final void m190021C(boolean z) {
        m190061w(new hnv0(this, z));
    }

    /* JADX INFO: renamed from: F */
    public final tw0 m190022F() {
        return this.f171513d;
    }

    /* JADX INFO: renamed from: G */
    public final void m190023G(Bundle bundle) {
        m190061w(new czu0(this, bundle));
    }

    /* JADX INFO: renamed from: H */
    public final void m190024H(String str) {
        m190061w(new m7v0(this, str));
    }

    /* JADX INFO: renamed from: I */
    public final void m190025I(String str, String str2) {
        m190060v(null, str, str2, false);
    }

    /* JADX INFO: renamed from: J */
    public final void m190026J(String str, String str2, Bundle bundle) {
        m190059u(str, str2, bundle, true, true, null);
    }

    /* JADX INFO: renamed from: K */
    public final void m190027K(nrx0 nrx0Var) {
        Pair<nrx0, BinderC20238b> pair;
        Preconditions.checkNotNull(nrx0Var);
        synchronized (this.f171514e) {
            int i = 0;
            while (true) {
                try {
                    if (i >= this.f171514e.size()) {
                        pair = null;
                        break;
                    } else {
                        if (nrx0Var.equals(this.f171514e.get(i).first)) {
                            pair = this.f171514e.get(i);
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
            this.f171514e.remove(pair);
            BinderC20238b binderC20238b = (BinderC20238b) pair.second;
            if (this.f171518i != null) {
                try {
                    this.f171518i.unregisterOnMeasurementEventListener(binderC20238b);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            m190061w(new ftv0(this, binderC20238b));
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: M */
    public final Long m190028M() {
        r8u0 r8u0Var = new r8u0();
        m190061w(new vkv0(this, r8u0Var));
        return r8u0Var.m178284P3(120000L);
    }

    /* JADX INFO: renamed from: N */
    public final void m190029N(Bundle bundle) {
        m190061w(new t2v0(this, bundle));
    }

    /* JADX INFO: renamed from: O */
    public final void m190030O(String str) {
        m190061w(new h6v0(this, str));
    }

    /* JADX INFO: renamed from: P */
    public final boolean m190031P(String str, String str2) {
        return (str2 == null || str == null || m190042a0()) ? false : true;
    }

    /* JADX INFO: renamed from: R */
    public final String m190032R() {
        return this.f171517h;
    }

    /* JADX INFO: renamed from: S */
    public final void m190033S(Bundle bundle) {
        m190061w(new bsv0(this, bundle));
    }

    /* JADX INFO: renamed from: T */
    public final void m190034T(String str) {
        m190061w(new yxu0(this, str));
    }

    @WorkerThread
    /* JADX INFO: renamed from: U */
    public final String m190035U() {
        r8u0 r8u0Var = new r8u0();
        m190061w(new bmv0(this, r8u0Var));
        return r8u0Var.m178285m4(120000L);
    }

    /* JADX INFO: renamed from: V */
    public final String m190036V() {
        r8u0 r8u0Var = new r8u0();
        m190061w(new q8v0(this, r8u0Var));
        return r8u0Var.m178285m4(50L);
    }

    /* JADX INFO: renamed from: W */
    public final String m190037W() {
        r8u0 r8u0Var = new r8u0();
        m190061w(new tev0(this, r8u0Var));
        return r8u0Var.m178285m4(500L);
    }

    /* JADX INFO: renamed from: X */
    public final String m190038X() {
        r8u0 r8u0Var = new r8u0();
        m190061w(new cbv0(this, r8u0Var));
        return r8u0Var.m178285m4(500L);
    }

    /* JADX INFO: renamed from: Y */
    public final String m190039Y() {
        r8u0 r8u0Var = new r8u0();
        m190061w(new w9v0(this, r8u0Var));
        return r8u0Var.m178285m4(500L);
    }

    /* JADX INFO: renamed from: Z */
    public final void m190040Z() {
        m190061w(new n1v0(this));
    }

    /* JADX INFO: renamed from: a */
    public final int m190041a(String str) {
        r8u0 r8u0Var = new r8u0();
        m190061w(new jiv0(this, str, r8u0Var));
        Integer num = (Integer) r8u0.m178282Y2(r8u0Var.m178283P2(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m190042a0() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m190043b() {
        r8u0 r8u0Var = new r8u0();
        m190061w(new hcv0(this, r8u0Var));
        Long lM178284P3 = r8u0Var.m178284P3(500L);
        if (lM178284P3 != null) {
            return lM178284P3.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f171511b.currentTimeMillis()).nextLong();
        int i = this.f171515f + 1;
        this.f171515f = i;
        return jNextLong + ((long) i);
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m190044c(Bundle bundle, boolean z) {
        r8u0 r8u0Var = new r8u0();
        m190061w(new pjv0(this, bundle, r8u0Var));
        if (z) {
            return r8u0Var.m178283P2(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final Object m190045d(int i) {
        r8u0 r8u0Var = new r8u0();
        m190061w(new ppv0(this, r8u0Var, i));
        return r8u0.m178282Y2(r8u0Var.m178283P2(15000L), Object.class);
    }

    /* JADX INFO: renamed from: e */
    public final List<Bundle> m190046e(String str, String str2) {
        r8u0 r8u0Var = new r8u0();
        m190061w(new juu0(this, str, str2, r8u0Var));
        List<Bundle> list = (List) r8u0.m178282Y2(r8u0Var.m178283P2(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, Object> m190047f(String str, String str2, boolean z) {
        r8u0 r8u0Var = new r8u0();
        m190061w(new ndv0(this, str, str2, z, r8u0Var));
        Bundle bundleM178283P2 = r8u0Var.m178283P2(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        if (bundleM178283P2 == null || bundleM178283P2.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleM178283P2.size());
        for (String str3 : bundleM178283P2.keySet()) {
            Object obj = bundleM178283P2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: g */
    public final j7u0 m190048g(Context context, boolean z) {
        try {
            return dbu0.asInterface(DynamiteModule.m12476e(context, DynamiteModule.f9806e, ModuleDescriptor.MODULE_ID).m12485d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            m190055q(e, true, false);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m190049k(int i, String str, Object obj, Object obj2, Object obj3) {
        m190061w(new dhv0(this, false, 5, str, obj, null, null));
    }

    /* JADX INFO: renamed from: l */
    public final void m190050l(long j) {
        m190061w(new w3v0(this, j));
    }

    /* JADX INFO: renamed from: m */
    public final void m190051m(Activity activity, String str, String str2) {
        m190061w(new uwu0(this, activity, str, str2));
    }

    /* JADX INFO: renamed from: n */
    public final void m190052n(Intent intent) {
        m190061w(new vqv0(this, intent));
    }

    /* JADX INFO: renamed from: o */
    public final void m190053o(Bundle bundle) {
        m190061w(new wqu0(this, bundle));
    }

    /* JADX INFO: renamed from: p */
    public final void m190054p(Boolean bool) {
        m190061w(new h0v0(this, bool));
    }

    /* JADX INFO: renamed from: q */
    public final void m190055q(Exception exc, boolean z, boolean z2) {
        this.f171516g |= z;
        if (!z && z2) {
            m190049k(5, "Error with data collection. Data lost.", exc, null, null);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m190056r(@NonNull String str, Bundle bundle) {
        m190059u(null, str, bundle, false, true, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m190057s(String str, String str2, Bundle bundle) {
        m190061w(new pvu0(this, str, str2, bundle));
    }

    /* JADX INFO: renamed from: t */
    public final void m190058t(String str, String str2, Bundle bundle, long j) {
        m190059u(str, str2, bundle, true, false, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: u */
    public final void m190059u(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l2) {
        m190061w(new pvv0(this, l2, str, str2, bundle, z, z2));
    }

    /* JADX INFO: renamed from: v */
    public final void m190060v(String str, String str2, Object obj, boolean z) {
        m190061w(new etu0(this, str, str2, obj, z));
    }

    /* JADX INFO: renamed from: w */
    public final void m190061w(AbstractRunnableC20237a abstractRunnableC20237a) {
        this.f171512c.execute(abstractRunnableC20237a);
    }

    /* JADX INFO: renamed from: l.tpu0$a */
    public abstract class AbstractRunnableC20237a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final long f171519a;

        /* JADX INFO: renamed from: b */
        public final long f171520b;

        /* JADX INFO: renamed from: c */
        public final boolean f171521c;

        public AbstractRunnableC20237a(boolean z) {
            this.f171519a = tpu0.this.f171511b.currentTimeMillis();
            this.f171520b = tpu0.this.f171511b.elapsedRealtime();
            this.f171521c = z;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo102711a() throws RemoteException;

        @Override // java.lang.Runnable
        public void run() {
            if (tpu0.this.f171516g) {
                mo102712b();
                return;
            }
            try {
                mo102711a();
            } catch (Exception e) {
                tpu0.this.m190055q(e, false, this.f171521c);
                mo102712b();
            }
        }

        /* JADX INFO: renamed from: b */
        public void mo102712b() {
        }

        public AbstractRunnableC20237a(tpu0 tpu0Var) {
            this(true);
        }
    }
}
