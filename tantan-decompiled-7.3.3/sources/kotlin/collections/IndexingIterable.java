package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0006H\u0096\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m88121d2 = {"Lkotlin/collections/IndexingIterable;", p7f.GPS_DIRECTION_TRUE, "", "Lkotlin/collections/IndexedValue;", "iteratorFactory", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "iterator", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IndexingIterable<T> implements Iterable<IndexedValue<? extends T>>, KMappedMarker {

    @NotNull
    private final Function0<Iterator<T>> iteratorFactory;

    /* JADX WARN: Multi-variable type inference failed */
    public IndexingIterable(@NotNull Function0<? extends Iterator<? extends T>> function0) {
        function0.getClass();
        this.iteratorFactory = function0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<IndexedValue<T>> iterator() {
        return new IndexingIterator(this.iteratorFactory.invoke());
    }
}
