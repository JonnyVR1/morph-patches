package p149l;

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
public class c500 {

    /* JADX INFO: renamed from: b */
    public static final Object f79311b = new Object();

    /* JADX INFO: renamed from: c */
    @Nullable
    public static c500 f79312c;

    /* JADX INFO: renamed from: a */
    @Nullable
    public ComponentRuntime f79313a;

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: c */
    public static c500 m105245c() {
        c500 c500Var;
        synchronized (f79311b) {
            Preconditions.checkState(f79312c != null, "MlKitContext has not been initialized");
            c500Var = (c500) Preconditions.checkNotNull(f79312c);
        }
        return c500Var;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public static c500 m105246d(@NonNull Context context) {
        c500 c500VarM105247e;
        synchronized (f79311b) {
            c500VarM105247e = f79312c;
            if (c500VarM105247e == null) {
                c500VarM105247e = m105247e(context);
            }
        }
        return c500VarM105247e;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static c500 m105247e(@NonNull Context context) {
        c500 c500VarM105248f;
        synchronized (f79311b) {
            c500VarM105248f = m105248f(context, bfi0.f75320a);
        }
        return c500VarM105248f;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static c500 m105248f(@NonNull Context context, @NonNull Executor executor) {
        c500 c500Var;
        synchronized (f79311b) {
            Preconditions.checkState(f79312c == null, "MlKitContext is already initialized");
            c500 c500Var2 = new c500();
            f79312c = c500Var2;
            Context contextM105249g = m105249g(context);
            ComponentRuntime componentRuntimeBuild = ComponentRuntime.builder(executor).addLazyComponentRegistrars(ComponentDiscovery.forContext(contextM105249g, MlKitComponentDiscoveryService.class).discoverLazy()).addComponent(Component.m16676of(contextM105249g, (Class<Context>) Context.class, (Class<? super Context>[]) new Class[0])).addComponent(Component.m16676of(c500Var2, (Class<c500>) c500.class, (Class<? super c500>[]) new Class[0])).build();
            c500Var2.f79313a = componentRuntimeBuild;
            componentRuntimeBuild.initializeEagerComponents(true);
            c500Var = f79312c;
        }
        return c500Var;
    }

    /* JADX INFO: renamed from: g */
    public static Context m105249g(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public <T> T m105250a(@NonNull Class<T> cls) {
        Preconditions.checkState(f79312c == this, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.f79313a);
        return (T) this.f79313a.get(cls);
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public Context m105251b() {
        return (Context) m105250a(Context.class);
    }
}
