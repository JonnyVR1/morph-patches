package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.mor;

/* JADX INFO: loaded from: classes2.dex */
public final class OneElementArrayMap<T> extends ArrayMap<T> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final T f67038a;

    /* JADX INFO: renamed from: b */
    public final int f67039b;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap$iterator$1 */
    public static final class C154621 implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: a */
        public boolean f67040a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OneElementArrayMap<T> f67041b;

        public C154621(OneElementArrayMap<T> oneElementArrayMap) {
            this.f67041b = oneElementArrayMap;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67040a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f67040a) {
                this.f67040a = false;
                return this.f67041b.m94039g();
            }
            mor.m159308a();
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneElementArrayMap(@NotNull T t, int i) {
        super(null);
        t.getClass();
        this.f67038a = t;
        this.f67039b = i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    /* JADX INFO: renamed from: a */
    public int mo94019a() {
        return 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    /* JADX INFO: renamed from: c */
    public void mo94020c(int i, @NotNull T t) {
        t.getClass();
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: f */
    public final int m94038f() {
        return this.f67039b;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final T m94039g() {
        return this.f67038a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @Nullable
    public T get(int i) {
        if (i == this.f67039b) {
            return this.f67038a;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new C154621(this);
    }
}
