package kotlin.sequences;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m88121d2 = {"Lkotlin/sequences/TransformingIndexedSequence;", p7f.GPS_DIRECTION_TRUE, "R", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "a", "Lkotlin/sequences/Sequence;", "sequence", "Lkotlin/Function2;", "", "b", "Lkotlin/jvm/functions/Function2;", "transformer", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class TransformingIndexedSequence<T, R> implements Sequence<R> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Sequence<T> sequence;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<Integer, T, R> transformer;

    /* JADX INFO: renamed from: kotlin.sequences.TransformingIndexedSequence$iterator$1 */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m88121d2 = {"kotlin/sequences/TransformingIndexedSequence$iterator$1", "", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "a", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "b", "I", "getIndex", "()I", "setIndex", "(I)V", FirebaseAnalytics.Param.INDEX, "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C154851 implements Iterator<R>, KMappedMarker {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final Iterator<T> iterator;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int index;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TransformingIndexedSequence<T, R> f67236c;

        public C154851(TransformingIndexedSequence<T, R> transformingIndexedSequence) {
            this.f67236c = transformingIndexedSequence;
            this.iterator = transformingIndexedSequence.sequence.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            Function2 function2 = this.f67236c.transformer;
            int i = this.index;
            this.index = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            return (R) function2.invoke(Integer.valueOf(i), this.iterator.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<R> iterator() {
        return new C154851(this);
    }
}
