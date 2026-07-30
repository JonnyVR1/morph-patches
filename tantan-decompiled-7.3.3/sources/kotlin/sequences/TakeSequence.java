package kotlin.sequences;

import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import p153l.mor;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m88121d2 = {"Lkotlin/sequences/TakeSequence;", p7f.GPS_DIRECTION_TRUE, "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "", "n", "a", "(I)Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/sequences/Sequence;", "sequence", "b", "I", "count", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class TakeSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Sequence<T> sequence;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int count;

    /* JADX INFO: renamed from: kotlin.sequences.TakeSequence$iterator$1 */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m88121d2 = {"kotlin/sequences/TakeSequence$iterator$1", "", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "", "a", "I", "getLeft", "()I", "setLeft", "(I)V", BLiveGiftBubblePopupTitlePosition.left, "b", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C154831 implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public int left;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final Iterator<T> iterator;

        public C154831(TakeSequence<T> takeSequence) {
            this.left = takeSequence.count;
            this.iterator = takeSequence.sequence.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.left > 0 && this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.left;
            if (i != 0) {
                this.left = i - 1;
                return this.iterator.next();
            }
            mor.m159308a();
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    /* JADX INFO: renamed from: a */
    public Sequence<T> mo94128a(int n) {
        int i = this.count;
        return n >= i ? SequencesKt__SequencesKt.m94160i() : new SubSequence(this.sequence, n, i);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new C154831(this);
    }
}
