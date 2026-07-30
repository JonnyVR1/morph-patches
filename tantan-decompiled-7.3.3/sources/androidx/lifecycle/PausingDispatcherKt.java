package androidx.lifecycle;

import com.clevertap.android.sdk.Constants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.p7f;
import p153l.r5e;
import p153l.vh3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\n\u0010\t\u001aC\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\u000b\u0010\t\u001aK\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\r\u001a\u00020\f2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/Lifecycle;", "Lkotlin/Function2;", "Ll/drb;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Landroidx/lifecycle/Lifecycle;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "b", "Landroidx/lifecycle/Lifecycle$State;", "minState", Constants.INAPP_DATA_TAG, "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-common"}, m88122k = 2, m88123mv = {2, 0, 0}, m88125xi = 48)
@JvmName
public final class PausingDispatcherKt {
    @Deprecated
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m2992a(@NotNull Lifecycle lifecycle, @NotNull Function2<? super drb, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return m2995d(lifecycle, Lifecycle.State.CREATED, function2, continuation);
    }

    @Deprecated
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m2993b(@NotNull Lifecycle lifecycle, @NotNull Function2<? super drb, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return m2995d(lifecycle, Lifecycle.State.RESUMED, function2, continuation);
    }

    @Deprecated
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m2994c(@NotNull Lifecycle lifecycle, @NotNull Function2<? super drb, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return m2995d(lifecycle, Lifecycle.State.STARTED, function2, continuation);
    }

    @Deprecated
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <T> Object m2995d(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State state, @NotNull Function2<? super drb, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return vh3.m201255g(r5e.m179862c().getImmediate(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, function2, null), continuation);
    }
}
