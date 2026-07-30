package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentRuntime;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class rd00 {

    /* JADX INFO: renamed from: b */
    public static final Object f162271b = new Object();

    /* JADX INFO: renamed from: c */
    @Nullable
    public static rd00 f162272c;

    /* JADX INFO: renamed from: a */
    @Nullable
    public ComponentRuntime f162273a;

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: c */
    public static rd00 m180828c() {
        rd00 rd00Var;
        synchronized (f162271b) {
            Preconditions.checkState(f162272c != null, "MlKitContext has not been initialized");
            rd00Var = (rd00) Preconditions.checkNotNull(f162272c);
        }
        return rd00Var;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public static rd00 m180829d(@NonNull Context context) {
        rd00 rd00VarM180830e;
        synchronized (f162271b) {
            rd00VarM180830e = f162272c;
            if (rd00VarM180830e == null) {
                rd00VarM180830e = m180830e(context);
            }
        }
        return rd00VarM180830e;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static rd00 m180830e(@NonNull Context context) {
        rd00 rd00VarM180831f;
        synchronized (f162271b) {
            rd00VarM180831f = m180831f(context, boi0.f77686a);
        }
        return rd00VarM180831f;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static rd00 m180831f(@NonNull Context context, @NonNull Executor executor) {
        rd00 rd00Var;
        synchronized (f162271b) {
            Preconditions.checkState(f162272c == null, "MlKitContext is already initialized");
            rd00 rd00Var2 = new rd00();
            f162272c = rd00Var2;
            Context contextM180832g = m180832g(context);
            ComponentRuntime componentRuntimeBuild = ComponentRuntime.builder(executor).addLazyComponentRegistrars(ComponentDiscovery.forContext(contextM180832g, MlKitComponentDiscoveryService.class).discoverLazy()).addComponent(Component.m16731of(contextM180832g, (Class<Context>) Context.class, (Class<? super Context>[]) new Class[0])).addComponent(Component.m16731of(rd00Var2, (Class<rd00>) rd00.class, (Class<? super rd00>[]) new Class[0])).build();
            rd00Var2.f162273a = componentRuntimeBuild;
            componentRuntimeBuild.initializeEagerComponents(true);
            rd00Var = f162272c;
        }
        return rd00Var;
    }

    /* JADX INFO: renamed from: g */
    public static Context m180832g(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public <T> T m180833a(@NonNull Class<T> cls) {
        Preconditions.checkState(f162272c == this, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.f162273a);
        return (T) this.f162273a.get(cls);
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public Context m180834b() {
        return (Context) m180833a(Context.class);
    }
}
