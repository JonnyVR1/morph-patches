package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import p153l.ts4;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
public /* synthetic */ class BufferedChannelKt$createSegmentFunction$1<E> extends FunctionReferenceImpl implements Function2<Long, ts4<E>, ts4<E>> {
    public static final BufferedChannelKt$createSegmentFunction$1 INSTANCE = new BufferedChannelKt$createSegmentFunction$1();

    public BufferedChannelKt$createSegmentFunction$1() {
        super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Long l2, Object obj) {
        return invoke(l2.longValue(), (ts4) obj);
    }

    @NotNull
    public final ts4<E> invoke(long j, @NotNull ts4<E> ts4Var) {
        return BufferedChannelKt.m94840x(j, ts4Var);
    }
}
