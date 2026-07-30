package p153l;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"l/wh3", "l/xh3"}, m88121d2 = {}, m88122k = 4, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class vh3 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> utd<T> m201249a(@NotNull drb drbVar, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super drb, ? super Continuation<? super T>, ? extends Object> function2) {
        return xh3.m210977a(drbVar, coroutineContext, coroutineStart, function2);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC15593o m201251c(@NotNull drb drbVar, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super drb, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return xh3.m210979c(drbVar, coroutineContext, coroutineStart, function2);
    }

    /* JADX INFO: renamed from: e */
    public static final <T> T m201253e(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super drb, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        return (T) wh3.m206333a(coroutineContext, function2);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final <T> Object m201255g(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super drb, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return xh3.m210981e(coroutineContext, function2, continuation);
    }
}
