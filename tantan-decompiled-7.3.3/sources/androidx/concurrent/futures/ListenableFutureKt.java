package androidx.concurrent.futures;

import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C15514c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.h1j0;
import p153l.hpr;
import p153l.p7f;
import p153l.uyp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/hpr;", "b", "(Ll/hpr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "c", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "concurrent-futures-ktx"}, m88122k = 2, m88123mv = {1, 4, 0})
public final class ListenableFutureKt {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m877b(@NotNull final hpr<T> hprVar, @NotNull Continuation<? super T> continuation) throws Throwable {
        try {
            if (hprVar.isDone()) {
                return AbstractResolvableFuture.getUninterruptibly(hprVar);
            }
            C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
            hprVar.addListener(new h1j0(hprVar, c15514c), DirectExecutor.INSTANCE);
            c15514c.mo94672x(new Function1<Throwable, Unit>() { // from class: androidx.concurrent.futures.ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Throwable th) {
                    hprVar.cancel(false);
                }
            });
            Object objM94670v = c15514c.m94670v();
            if (objM94670v == uyp.m198688e()) {
                DebugProbesKt.m88272c(continuation);
            }
            return objM94670v;
        } catch (ExecutionException e) {
            throw m878c(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Throwable m878c(@NotNull ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause == null) {
            Intrinsics.m88386m();
        }
        return cause;
    }
}
