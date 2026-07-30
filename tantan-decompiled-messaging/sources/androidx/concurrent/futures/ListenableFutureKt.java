package androidx.concurrent.futures;

import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C15407c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.esi0;
import p149l.gnr;
import p149l.j6f;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/gnr;", "b", "(Ll/gnr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "c", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "concurrent-futures-ktx"}, m87233k = 2, m87234mv = {1, 4, 0})
public final class ListenableFutureKt {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m876b(@NotNull final gnr<T> gnrVar, @NotNull Continuation<? super T> continuation) throws Throwable {
        try {
            if (gnrVar.isDone()) {
                return AbstractResolvableFuture.getUninterruptibly(gnrVar);
            }
            C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
            gnrVar.addListener(new esi0(gnrVar, c15407c), DirectExecutor.INSTANCE);
            c15407c.mo93780x(new Function1<Throwable, Unit>() { // from class: androidx.concurrent.futures.ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$1
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
                    gnrVar.cancel(false);
                }
            });
            Object objM93778v = c15407c.m93778v();
            if (objM93778v == uwp.m196133e()) {
                DebugProbesKt.m87383c(continuation);
            }
            return objM93778v;
        } catch (ExecutionException e) {
            throw m877c(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Throwable m877c(@NotNull ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause == null) {
            Intrinsics.m87497m();
        }
        return cause;
    }
}
