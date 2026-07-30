package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.p7f;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR.\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \n*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m88121d2 = {"Lkotlin/sequences/ConstrainedOnceSequence;", p7f.GPS_DIRECTION_TRUE, "Lkotlin/sequences/Sequence;", "sequence", "<init>", "(Lkotlin/sequences/Sequence;)V", "", "iterator", "()Ljava/util/Iterator;", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "sequenceRef", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ConstrainedOnceSequence<T> implements Sequence<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AtomicReference<Sequence<T>> sequenceRef;

    public ConstrainedOnceSequence(@NotNull Sequence<? extends T> sequence) {
        sequence.getClass();
        this.sequenceRef = new AtomicReference<>(sequence);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        Sequence<T> andSet = this.sequenceRef.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        wtq0.m207906a("This sequence can be consumed only once.");
        return null;
    }
}
