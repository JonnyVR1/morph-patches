package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import p149l.hck0;
import p149l.j6f;
import p149l.jck0;
import p149l.lmr;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Lkotlin/sequences/SubSequence;", j6f.GPS_DIRECTION_TRUE, "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "", "startIndex", "endIndex", "<init>", "(Lkotlin/sequences/Sequence;II)V", "n", "a", "(I)Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/sequences/Sequence;", "b", "I", "c", "e", "()I", "count", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class SubSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Sequence<T> sequence;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int startIndex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int endIndex;

    /* JADX INFO: renamed from: kotlin.sequences.SubSequence$iterator$1 */
    @Metadata(m87231d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m87232d2 = {"kotlin/sequences/SubSequence$iterator$1", "", "", "a", "()V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "b", "I", "getPosition", "()I", "setPosition", "(I)V", "position", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C153751 implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final Iterator<T> iterator;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int position;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SubSequence<T> f66547c;

        public C153751(SubSequence<T> subSequence) {
            this.f66547c = subSequence;
            this.iterator = subSequence.sequence.iterator();
        }

        /* JADX INFO: renamed from: a */
        private final void m93319a() {
            while (this.position < this.f66547c.startIndex && this.iterator.hasNext()) {
                this.iterator.next();
                this.position++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m93319a();
            return this.position < this.f66547c.endIndex && this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            m93319a();
            if (this.position < this.f66547c.endIndex) {
                this.position++;
                return this.iterator.next();
            }
            lmr.m150601a();
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubSequence(@NotNull Sequence<? extends T> sequence, int i, int i2) {
        sequence.getClass();
        this.sequence = sequence;
        this.startIndex = i;
        this.endIndex = i2;
        if (i < 0) {
            jck0.m140980a("startIndex should be non-negative, but is ", i);
            throw null;
        }
        if (i2 < 0) {
            jck0.m140980a("endIndex should be non-negative, but is ", i2);
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        hck0.m130443a("endIndex should be not less than startIndex, but was ", i2, " < ", i);
        throw null;
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    /* JADX INFO: renamed from: a */
    public Sequence<T> mo93237a(int n) {
        return n >= m93318e() ? SequencesKt__SequencesKt.m93269i() : new SubSequence(this.sequence, this.startIndex + n, this.endIndex);
    }

    /* JADX INFO: renamed from: e */
    public final int m93318e() {
        return this.endIndex - this.startIndex;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new C153751(this);
    }
}
