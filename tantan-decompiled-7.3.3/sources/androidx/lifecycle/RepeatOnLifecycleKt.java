package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C15531f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.ker;
import p153l.uyp;
import p153l.wg3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001aE\u0010\r\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function2;", "Ll/drb;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/ker;", "b", "(Ll/ker;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-runtime_release"}, m88122k = 2, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class RepeatOnLifecycleKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m2998a(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State state, @NotNull Function2<? super drb, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        if (state == Lifecycle.State.INITIALIZED) {
            wg3.m206174a("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
            return null;
        }
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            return Unit.INSTANCE;
        }
        Object objM94951e = C15531f.m94951e(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, function2, null), continuation);
        return objM94951e == uyp.m198688e() ? objM94951e : Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m2999b(@NotNull ker kerVar, @NotNull Lifecycle.State state, @NotNull Function2<? super drb, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objM2998a = m2998a(kerVar.getLifecycle(), state, function2, continuation);
        return objM2998a == uyp.m198688e() ? objM2998a : Unit.INSTANCE;
    }
}
