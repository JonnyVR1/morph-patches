package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ArrayMap<T> implements Iterable<T>, KMappedMarker {
    public /* synthetic */ ArrayMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo93128a();

    /* JADX INFO: renamed from: c */
    public abstract void mo93129c(int i, @NotNull T t);

    @Nullable
    public abstract T get(int i);

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private ArrayMap() {
    }
}
