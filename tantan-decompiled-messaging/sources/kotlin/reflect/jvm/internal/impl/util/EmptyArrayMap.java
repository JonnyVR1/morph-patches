package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class EmptyArrayMap extends ArrayMap {

    @NotNull
    public static final EmptyArrayMap INSTANCE = new EmptyArrayMap();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap$iterator$1 */
    public static final class C153541 implements Iterator, KMappedMarker {
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private EmptyArrayMap() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    /* JADX INFO: renamed from: a */
    public int mo93128a() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Void get(int i) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo93129c(int i, @NotNull Void r2) {
        r2.getClass();
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    @NotNull
    public Iterator iterator() {
        return new C153541();
    }
}
