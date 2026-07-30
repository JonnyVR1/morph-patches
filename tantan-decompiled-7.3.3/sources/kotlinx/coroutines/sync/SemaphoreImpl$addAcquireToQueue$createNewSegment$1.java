package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.pme0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
public /* synthetic */ class SemaphoreImpl$addAcquireToQueue$createNewSegment$1 extends FunctionReferenceImpl implements Function2<Long, pme0, pme0> {
    public static final SemaphoreImpl$addAcquireToQueue$createNewSegment$1 INSTANCE = new SemaphoreImpl$addAcquireToQueue$createNewSegment$1();

    public SemaphoreImpl$addAcquireToQueue$createNewSegment$1() {
        super(2, SemaphoreKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ pme0 invoke(Long l2, pme0 pme0Var) {
        return invoke(l2.longValue(), pme0Var);
    }

    @NotNull
    public final pme0 invoke(long j, @Nullable pme0 pme0Var) {
        return SemaphoreKt.m95284h(j, pme0Var);
    }
}
