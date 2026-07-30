package kotlinx.coroutines.future;

import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m88121d2 = {"<anonymous>", "", "cause", "", "invoke"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
final class FutureKt$asCompletableFuture$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ CompletableFuture<Unit> $future;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureKt$asCompletableFuture$2(CompletableFuture<Unit> completableFuture) {
        super(1);
        this.$future = completableFuture;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        CompletableFuture<Unit> completableFuture = this.$future;
        if (th == null) {
            completableFuture.complete(Unit.INSTANCE);
        } else {
            completableFuture.completeExceptionally(th);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }
}
