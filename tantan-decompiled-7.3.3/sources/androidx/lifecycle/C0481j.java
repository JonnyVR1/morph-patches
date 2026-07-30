package androidx.lifecycle;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.r5e;
import p153l.z6h0;

/* JADX INFO: renamed from: androidx.lifecycle.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m88121d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "a", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;", "coroutineScope", "lifecycle-common"}, m88122k = 2, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class C0481j {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final LifecycleCoroutineScope m3024a(@NotNull Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        lifecycle.getClass();
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.m2969c().m161270b();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, z6h0.m218802b(null, 1, null).plus(r5e.m179862c().getImmediate()));
        } while (!lifecycle.m2969c().m161269a(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }
}
