package kotlin.collections;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\nH\u0086\u0002J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m87232d2 = {"Lkotlin/collections/IndexingIterator;", j6f.GPS_DIRECTION_TRUE, "", "Lkotlin/collections/IndexedValue;", "iterator", "<init>", "(Ljava/util/Iterator;)V", FirebaseAnalytics.Param.INDEX, "", "hasNext", "", "next", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class IndexingIterator<T> implements Iterator<IndexedValue<? extends T>>, KMappedMarker {
    private int index;

    @NotNull
    private final Iterator<T> iterator;

    /* JADX WARN: Multi-variable type inference failed */
    public IndexingIterator(@NotNull Iterator<? extends T> it) {
        it.getClass();
        this.iterator = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    @NotNull
    public final IndexedValue<T> next() {
        int i = this.index;
        this.index = i + 1;
        if (i < 0) {
            CollectionsKt__CollectionsKt.throwIndexOverflow();
        }
        return new IndexedValue<>(i, this.iterator.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
