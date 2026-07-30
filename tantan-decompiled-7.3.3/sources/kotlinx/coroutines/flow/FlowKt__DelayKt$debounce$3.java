package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "emittedItem", "invoke", "(Ljava/lang/Object;)Ljava/lang/Long;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
final class FlowKt__DelayKt$debounce$3 extends Lambda implements Function1<Object, Long> {
    final /* synthetic */ Function1<Object, Duration> $timeout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounce$3(Function1<Object, Duration> function1) {
        super(1);
        this.$timeout = function1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Long invoke(Object obj) {
        return Long.valueOf(DelayKt.m94504d(this.$timeout.invoke(obj).getRawValue()));
    }
}
