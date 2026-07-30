package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C15424f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ig3;
import p149l.jcr;
import p149l.ppb;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001aE\u0010\r\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function2;", "Ll/ppb;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/jcr;", "b", "(Ll/jcr;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-runtime_release"}, m87233k = 2, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class RepeatOnLifecycleKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m2997a(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State state, @NotNull Function2<? super ppb, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        if (state == Lifecycle.State.INITIALIZED) {
            ig3.m135964a("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
            return null;
        }
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            return Unit.INSTANCE;
        }
        Object objM94059e = C15424f.m94059e(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, function2, null), continuation);
        return objM94059e == uwp.m196133e() ? objM94059e : Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m2998b(@NotNull jcr jcrVar, @NotNull Lifecycle.State state, @NotNull Function2<? super ppb, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objM2997a = m2997a(jcrVar.getLifecycle(), state, function2, continuation);
        return objM2997a == uwp.m196133e() ? objM2997a : Unit.INSTANCE;
    }
}
