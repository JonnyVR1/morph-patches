package kotlinx.coroutines.tasks;

import com.p051p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p153l.ig4;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, Careers.f39580it, "", "invoke"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
final class TasksKt$asDeferredImpl$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ ig4 $cancellationTokenSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TasksKt$asDeferredImpl$2(ig4 ig4Var) {
        super(1);
        this.$cancellationTokenSource = ig4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        this.$cancellationTokenSource.m139763a();
    }
}
