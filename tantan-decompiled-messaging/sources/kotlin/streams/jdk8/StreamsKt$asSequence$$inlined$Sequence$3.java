package kotlin.streams.jdk8;

import java.util.Iterator;
import java.util.stream.LongStream;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, m87232d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class StreamsKt$asSequence$$inlined$Sequence$3 implements Sequence<Long> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LongStream f66569a;

    @Override // kotlin.sequences.Sequence
    public Iterator<Long> iterator() {
        Iterator<Long> it = this.f66569a.iterator();
        it.getClass();
        return it;
    }
}
