package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import p149l.ur4;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
public /* synthetic */ class BufferedChannelKt$createSegmentFunction$1<E> extends FunctionReferenceImpl implements Function2<Long, ur4<E>, ur4<E>> {
    public static final BufferedChannelKt$createSegmentFunction$1 INSTANCE = new BufferedChannelKt$createSegmentFunction$1();

    public BufferedChannelKt$createSegmentFunction$1() {
        super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Long l2, Object obj) {
        return invoke(l2.longValue(), (ur4) obj);
    }

    @NotNull
    public final ur4<E> invoke(long j, @NotNull ur4<E> ur4Var) {
        return BufferedChannelKt.m93948x(j, ur4Var);
    }
}
