package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p149l.j6f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"<anonymous>", j6f.GPS_DIRECTION_TRUE, "invoke", "()Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
final class StatusRunnable$loadStatusFuture$1 extends Lambda implements Function0<Object> {
    final /* synthetic */ Function1<WorkDatabase, Object> $block;
    final /* synthetic */ WorkDatabase $this_loadStatusFuture;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StatusRunnable$loadStatusFuture$1(Function1<? super WorkDatabase, Object> function1, WorkDatabase workDatabase) {
        super(0);
        this.$block = function1;
        this.$this_loadStatusFuture = workDatabase;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.$block.invoke(this.$this_loadStatusFuture);
    }
}
