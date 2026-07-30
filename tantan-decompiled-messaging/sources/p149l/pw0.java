package p149l;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.startup.InitializationProvider;
import androidx.startup.R$string;
import androidx.startup.StartupException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class pw0 {

    /* JADX INFO: renamed from: d */
    public static volatile pw0 f151523d;

    /* JADX INFO: renamed from: e */
    public static final Object f151524e = new Object();

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Context f151527c;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Set<Class<? extends hsm<?>>> f151526b = new HashSet();

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Map<Class<?>, Object> f151525a = new HashMap();

    public pw0(@NonNull Context context) {
        this.f151527c = context.getApplicationContext();
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static pw0 m171696d(@NonNull Context context) {
        if (f151523d == null) {
            synchronized (f151524e) {
                try {
                    if (f151523d == null) {
                        f151523d = new pw0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f151523d;
    }

    /* JADX INFO: renamed from: a */
    public void m171697a() {
        try {
            try {
                t4j0.m187208c("Startup");
                m171698b(this.f151527c.getPackageManager().getProviderInfo(new ComponentName(this.f151527c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                t4j0.m187211f();
            } catch (PackageManager.NameNotFoundException e) {
                throw new StartupException(e);
            }
        } catch (Throwable th) {
            t4j0.m187211f();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m171698b(@Nullable Bundle bundle) {
        String string = this.f151527c.getString(R$string.f3120a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (hsm.class.isAssignableFrom(cls)) {
                            this.f151526b.add((Class<? extends hsm<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends hsm<?>>> it = this.f151526b.iterator();
                while (it.hasNext()) {
                    m171699c(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final <T> T m171699c(@NonNull Class<? extends hsm<?>> cls, @NonNull Set<Class<?>> set) {
        T t;
        if (t4j0.m187213h()) {
            try {
                t4j0.m187208c(cls.getSimpleName());
            } catch (Throwable th) {
                t4j0.m187211f();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f151525a.containsKey(cls)) {
            t = (T) this.f151525a.get(cls);
        } else {
            set.add(cls);
            try {
                hsm<?> hsmVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends hsm<?>>> listDependencies = hsmVarNewInstance.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends hsm<?>> cls2 : listDependencies) {
                        if (!this.f151525a.containsKey(cls2)) {
                            m171699c(cls2, set);
                        }
                    }
                }
                t = (T) hsmVarNewInstance.mo2995a(this.f151527c);
                set.remove(cls);
                this.f151525a.put(cls, t);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        t4j0.m187211f();
        return t;
    }

    /* JADX INFO: renamed from: e */
    public boolean m171700e(@NonNull Class<? extends hsm<?>> cls) {
        return this.f151526b.contains(cls);
    }
}
