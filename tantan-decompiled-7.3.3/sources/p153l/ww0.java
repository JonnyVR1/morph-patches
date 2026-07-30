package p153l;

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
public final class ww0 {

    /* JADX INFO: renamed from: d */
    public static volatile ww0 f191125d;

    /* JADX INFO: renamed from: e */
    public static final Object f191126e = new Object();

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Context f191129c;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Set<Class<? extends jum<?>>> f191128b = new HashSet();

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Map<Class<?>, Object> f191127a = new HashMap();

    public ww0(@NonNull Context context) {
        this.f191129c = context.getApplicationContext();
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static ww0 m208111d(@NonNull Context context) {
        if (f191125d == null) {
            synchronized (f191126e) {
                try {
                    if (f191125d == null) {
                        f191125d = new ww0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f191125d;
    }

    /* JADX INFO: renamed from: a */
    public void m208112a() {
        try {
            try {
                xdj0.m210464c("Startup");
                m208113b(this.f191129c.getPackageManager().getProviderInfo(new ComponentName(this.f191129c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                xdj0.m210467f();
            } catch (PackageManager.NameNotFoundException e) {
                throw new StartupException(e);
            }
        } catch (Throwable th) {
            xdj0.m210467f();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m208113b(@Nullable Bundle bundle) {
        String string = this.f191129c.getString(R$string.f3120a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (jum.class.isAssignableFrom(cls)) {
                            this.f191128b.add((Class<? extends jum<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends jum<?>>> it = this.f191128b.iterator();
                while (it.hasNext()) {
                    m208114c(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final <T> T m208114c(@NonNull Class<? extends jum<?>> cls, @NonNull Set<Class<?>> set) {
        T t;
        if (xdj0.m210469h()) {
            try {
                xdj0.m210464c(cls.getSimpleName());
            } catch (Throwable th) {
                xdj0.m210467f();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f191127a.containsKey(cls)) {
            t = (T) this.f191127a.get(cls);
        } else {
            set.add(cls);
            try {
                jum<?> jumVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends jum<?>>> listDependencies = jumVarNewInstance.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends jum<?>> cls2 : listDependencies) {
                        if (!this.f191127a.containsKey(cls2)) {
                            m208114c(cls2, set);
                        }
                    }
                }
                t = (T) jumVarNewInstance.mo2996a(this.f191129c);
                set.remove(cls);
                this.f191127a.put(cls, t);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        xdj0.m210467f();
        return t;
    }

    /* JADX INFO: renamed from: e */
    public boolean m208115e(@NonNull Class<? extends jum<?>> cls) {
        return this.f191128b.contains(cls);
    }
}
