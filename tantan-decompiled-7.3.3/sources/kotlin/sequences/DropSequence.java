package kotlin.sequences;

import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import p153l.p7f;
import p153l.sr3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Lkotlin/sequences/DropSequence;", p7f.GPS_DIRECTION_TRUE, "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "", "count", "<init>", "(Lkotlin/sequences/Sequence;I)V", "n", "a", "(I)Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/sequences/Sequence;", "b", "I", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class DropSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Sequence<T> sequence;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int count;

    /* JADX INFO: renamed from: kotlin.sequences.DropSequence$iterator$1 */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m88121d2 = {"kotlin/sequences/DropSequence$iterator$1", "", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "", "a", "()V", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "b", "I", "getLeft", "()I", "setLeft", "(I)V", BLiveGiftBubblePopupTitlePosition.left, "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C154751 implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final Iterator<T> iterator;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int left;

        public C154751(DropSequence<T> dropSequence) {
            this.iterator = dropSequence.sequence.iterator();
            this.left = dropSequence.count;
        }

        /* JADX INFO: renamed from: a */
        public final void m94129a() {
            while (this.left > 0 && this.iterator.hasNext()) {
                this.iterator.next();
                this.left--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m94129a();
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            m94129a();
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DropSequence(@NotNull Sequence<? extends T> sequence, int i) {
        sequence.getClass();
        this.sequence = sequence;
        this.count = i;
        if (i >= 0) {
            return;
        }
        sr3.m187590a("count must be non-negative, but was ", i, 46);
        throw null;
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    /* JADX INFO: renamed from: a */
    public Sequence<T> mo94128a(int n) {
        int i = this.count + n;
        return i < 0 ? new DropSequence(this, n) : new DropSequence(this.sequence, i);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new C154751(this);
    }
}
