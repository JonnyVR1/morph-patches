package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import p153l.mor;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Lkotlin/sequences/TakeWhileSequence;", p7f.GPS_DIRECTION_TRUE, "Lkotlin/sequences/Sequence;", "sequence", "Lkotlin/Function1;", "", "predicate", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Lkotlin/sequences/Sequence;", "b", "Lkotlin/jvm/functions/Function1;", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class TakeWhileSequence<T> implements Sequence<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Sequence<T> sequence;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<T, Boolean> predicate;

    /* JADX INFO: renamed from: kotlin.sequences.TakeWhileSequence$iterator$1 */
    @Metadata(m88120d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m88121d2 = {"kotlin/sequences/TakeWhileSequence$iterator$1", "", "", "a", "()V", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "b", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "c", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C154841 implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final Iterator<T> iterator;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int nextState = -1;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public T nextItem;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ TakeWhileSequence<T> f67231d;

        public C154841(TakeWhileSequence<T> takeWhileSequence) {
            this.f67231d = takeWhileSequence;
            this.iterator = takeWhileSequence.sequence.iterator();
        }

        /* JADX INFO: renamed from: a */
        private final void m94215a() {
            if (this.iterator.hasNext()) {
                T next = this.iterator.next();
                if (((Boolean) this.f67231d.predicate.invoke(next)).booleanValue()) {
                    this.nextState = 1;
                    this.nextItem = next;
                    return;
                }
            }
            this.nextState = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState == -1) {
                m94215a();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.nextState == -1) {
                m94215a();
            }
            if (this.nextState == 0) {
                mor.m159308a();
                return null;
            }
            T t = this.nextItem;
            this.nextItem = null;
            this.nextState = -1;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TakeWhileSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        sequence.getClass();
        function1.getClass();
        this.sequence = sequence;
        this.predicate = function1;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new C154841(this);
    }
}
