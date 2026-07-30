package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import p153l.b16;
import p153l.p7f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Landroidx/core/util/AndroidXContinuationConsumer;", p7f.GPS_DIRECTION_TRUE, "Ll/b16;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/coroutines/Continuation;", "continuation", "<init>", "(Lkotlin/coroutines/Continuation;)V", "value", "", "accept", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/coroutines/Continuation;", "core-ktx_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
final class AndroidXContinuationConsumer<T> extends AtomicBoolean implements b16<T> {

    @NotNull
    private final Continuation<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidXContinuationConsumer(@NotNull Continuation<? super T> continuation) {
        super(false);
        this.continuation = continuation;
    }

    @Override // p153l.b16
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
