package androidx.core.util;

import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import p153l.p7f;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m88121d2 = {"Landroidx/core/util/ContinuationConsumer;", p7f.GPS_DIRECTION_TRUE, "Ljava/util/function/Consumer;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "continuation", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/Continuation;)V", "accept", "", "value", "(Ljava/lang/Object;)V", "toString", "", "core-ktx_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
final class ContinuationConsumer<T> extends AtomicBoolean implements Consumer<T> {

    @NotNull
    private final Continuation<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationConsumer(@NotNull Continuation<? super T> continuation) {
        super(false);
        this.continuation = continuation;
    }

    @Override // java.util.function.Consumer
    public void accept(T value) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(Result.m225066constructorimpl(value));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
