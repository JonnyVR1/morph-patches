package androidx.lifecycle;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.d4e;
import p149l.ryg0;

/* JADX INFO: renamed from: androidx.lifecycle.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m87232d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "a", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;", "coroutineScope", "lifecycle-common"}, m87233k = 2, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class C0480j {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final LifecycleCoroutineScope m3023a(@NotNull Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        lifecycle.getClass();
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.m2968c().m124197b();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, ryg0.m181663b(null, 1, null).plus(d4e.m109982c().getImmediate()));
        } while (!lifecycle.m2968c().m124196a(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }
}
