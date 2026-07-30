package kotlin;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"", "exception", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lkotlin/Result;", "", "b", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ResultKt {
    @SinceKotlin
    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Object m87238a(@NotNull Throwable th) {
        th.getClass();
        return new Result.Failure(th);
    }

    @SinceKotlin
    @PublishedApi
    /* JADX INFO: renamed from: b */
    public static final void m87239b(@NotNull Object obj) throws Throwable {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}
