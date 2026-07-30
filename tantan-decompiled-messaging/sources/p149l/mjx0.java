package p149l;

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
public final class mjx0 implements qax0 {

    /* JADX INFO: renamed from: g */
    @GuardedBy("SharedPreferencesLoader.class")
    public static final Map<String, mjx0> f134261g = new e01();

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f134262a;

    /* JADX INFO: renamed from: b */
    public final Runnable f134263b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences.OnSharedPreferenceChangeListener f134264c;

    /* JADX INFO: renamed from: d */
    public final Object f134265d;

    /* JADX INFO: renamed from: e */
    public volatile Map<String, ?> f134266e;

    /* JADX INFO: renamed from: f */
    @GuardedBy("this")
    public final List<u7x0> f134267f;

    public mjx0(SharedPreferences sharedPreferences, Runnable runnable) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: l.ljx0
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                this.f128425a.m154921d(sharedPreferences2, str);
            }
        };
        this.f134264c = onSharedPreferenceChangeListener;
        this.f134265d = new Object();
        this.f134267f = new ArrayList();
        this.f134262a = sharedPreferences;
        this.f134263b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    /* JADX INFO: renamed from: a */
    public static SharedPreferences m154918a(Context context, String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                return ent0.m117291a(context, str, 0, ait0.f70066a);
            }
            if (o1x0.m162270a()) {
                context = context.createDeviceProtectedStorageContext();
            }
            return ent0.m117291a(context, str.substring(12), 0, ait0.f70066a);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static mjx0 m154919b(Context context, String str, Runnable runnable) {
        mjx0 mjx0Var;
        if (!((!o1x0.m162270a() || str.startsWith("direct_boot:")) ? true : o1x0.m162272c(context))) {
            return null;
        }
        synchronized (mjx0.class) {
            try {
                Map<String, mjx0> map = f134261g;
                mjx0Var = map.get(str);
                if (mjx0Var == null) {
                    mjx0Var = new mjx0(m154918a(context, str), runnable);
                    map.put(str, mjx0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mjx0Var;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m154920c() {
        try {
            for (mjx0 mjx0Var : f134261g.values()) {
                mjx0Var.f134262a.unregisterOnSharedPreferenceChangeListener(mjx0Var.f134264c);
            }
            f134261g.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m154921d(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f134265d) {
            this.f134266e = null;
            this.f134263b.run();
        }
        synchronized (this) {
            try {
                Iterator<u7x0> it = this.f134267f.iterator();
                while (it.hasNext()) {
                    it.next().zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.qax0
    @Nullable
    public final Object zza(String str) {
        Map<String, ?> map = this.f134266e;
        if (map == null) {
            synchronized (this.f134265d) {
                try {
                    map = this.f134266e;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f134262a.getAll();
                            this.f134266e = all;
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
