package p153l;

import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002J#\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/v26;", p7f.GPS_DIRECTION_TRUE, "Ljava/util/function/BiFunction;", "", "", LovePlanetStage.result, "exception", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/Continuation;", "cont", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class v26<T> implements BiFunction<T, Throwable, Unit> {

    @JvmField
    @Nullable
    public volatile Continuation<? super T> cont;

    /* JADX INFO: renamed from: a */
    public void m199124a(@Nullable T result, @Nullable Throwable exception) {
        Throwable cause;
        Continuation<? super T> continuation = this.cont;
        if (continuation == null) {
            return;
        }
        if (exception == null) {
            continuation.resumeWith(Result.m225066constructorimpl(result));
            return;
        }
        CompletionException completionException = exception instanceof CompletionException ? (CompletionException) exception : null;
        if (completionException != null && (cause = completionException.getCause()) != null) {
            exception = cause;
        }
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m225066constructorimpl(ResultKt.m88127a(exception)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ Unit apply(Object obj, Throwable th) {
        m199124a(obj, th);
        return Unit.INSTANCE;
    }
}
