package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m87232d2 = {"<anonymous>", "", "e", "invoke"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
final class ExceptionsConstructorKt$safeCtor$1 extends Lambda implements Function1<Throwable, Throwable> {
    final /* synthetic */ Function1<Throwable, Throwable> $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExceptionsConstructorKt$safeCtor$1(Function1<? super Throwable, ? extends Throwable> function1) {
        super(1);
        this.$block = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Throwable invoke(@NotNull Throwable th) {
        Object objM223820constructorimpl;
        Function1<Throwable, Throwable> function1 = this.$block;
        try {
            Result.Companion companion = Result.INSTANCE;
            Throwable thInvoke = function1.invoke(th);
            if (!Intrinsics.m87488d(th.getMessage(), thInvoke.getMessage()) && !Intrinsics.m87488d(thInvoke.getMessage(), th.toString())) {
                thInvoke = null;
            }
            objM223820constructorimpl = Result.m223820constructorimpl(thInvoke);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th2));
        }
        return (Throwable) (Result.m223826isFailureimpl(objM223820constructorimpl) ? null : objM223820constructorimpl);
    }
}
