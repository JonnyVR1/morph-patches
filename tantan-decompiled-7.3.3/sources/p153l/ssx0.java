package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ssx0 implements wjx0 {

    /* JADX INFO: renamed from: g */
    @GuardedBy("SharedPreferencesLoader.class")
    public static final Map<String, ssx0> f170527g = new l01();

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f170528a;

    /* JADX INFO: renamed from: b */
    public final Runnable f170529b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences.OnSharedPreferenceChangeListener f170530c;

    /* JADX INFO: renamed from: d */
    public final Object f170531d;

    /* JADX INFO: renamed from: e */
    public volatile Map<String, ?> f170532e;

    /* JADX INFO: renamed from: f */
    @GuardedBy("this")
    public final List<ahx0> f170533f;

    public ssx0(SharedPreferences sharedPreferences, Runnable runnable) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: l.rsx0
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                this.f164742a.m187801d(sharedPreferences2, str);
            }
        };
        this.f170530c = onSharedPreferenceChangeListener;
        this.f170531d = new Object();
        this.f170533f = new ArrayList();
        this.f170528a = sharedPreferences;
        this.f170529b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    /* JADX INFO: renamed from: a */
    public static SharedPreferences m187798a(Context context, String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                return kwt0.m151738a(context, str, 0, grt0.f106145a);
            }
            if (uax0.m195203a()) {
                context = context.createDeviceProtectedStorageContext();
            }
            return kwt0.m151738a(context, str.substring(12), 0, grt0.f106145a);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static ssx0 m187799b(Context context, String str, Runnable runnable) {
        ssx0 ssx0Var;
        if (!((!uax0.m195203a() || str.startsWith("direct_boot:")) ? true : uax0.m195205c(context))) {
            return null;
        }
        synchronized (ssx0.class) {
            try {
                Map<String, ssx0> map = f170527g;
                ssx0Var = map.get(str);
                if (ssx0Var == null) {
                    ssx0Var = new ssx0(m187798a(context, str), runnable);
                    map.put(str, ssx0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ssx0Var;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m187800c() {
        try {
            for (ssx0 ssx0Var : f170527g.values()) {
                ssx0Var.f170528a.unregisterOnSharedPreferenceChangeListener(ssx0Var.f170530c);
            }
            f170527g.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m187801d(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f170531d) {
            this.f170532e = null;
            this.f170529b.run();
        }
        synchronized (this) {
            try {
                Iterator<ahx0> it = this.f170533f.iterator();
                while (it.hasNext()) {
                    it.next().zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.wjx0
    @Nullable
    public final Object zza(String str) {
        Map<String, ?> map = this.f170532e;
        if (map == null) {
            synchronized (this.f170531d) {
                try {
                    map = this.f170532e;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f170528a.getAll();
                            this.f170532e = all;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
