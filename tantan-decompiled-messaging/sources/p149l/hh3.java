package p149l;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC15486o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"l/ih3", "l/jh3"}, m87232d2 = {}, m87233k = 4, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class hh3 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> gsd<T> m130932a(@NotNull ppb ppbVar, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super ppb, ? super Continuation<? super T>, ? extends Object> function2) {
        return jh3.m141364a(ppbVar, coroutineContext, coroutineStart, function2);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC15486o m130934c(@NotNull ppb ppbVar, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super ppb, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return jh3.m141366c(ppbVar, coroutineContext, coroutineStart, function2);
    }

    /* JADX INFO: renamed from: e */
    public static final <T> T m130936e(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super ppb, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        return (T) ih3.m136183a(coroutineContext, function2);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final <T> Object m130938g(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super ppb, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return jh3.m141368e(coroutineContext, function2, continuation);
    }
}
