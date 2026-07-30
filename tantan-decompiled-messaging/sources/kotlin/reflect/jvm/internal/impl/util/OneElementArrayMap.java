package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.lmr;

/* JADX INFO: loaded from: classes2.dex */
public final class OneElementArrayMap<T> extends ArrayMap<T> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final T f66364a;

    /* JADX INFO: renamed from: b */
    public final int f66365b;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap$iterator$1 */
    public static final class C153551 implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: a */
        public boolean f66366a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OneElementArrayMap<T> f66367b;

        public C153551(OneElementArrayMap<T> oneElementArrayMap) {
            this.f66367b = oneElementArrayMap;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66366a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f66366a) {
                this.f66366a = false;
                return this.f66367b.m93148g();
            }
            lmr.m150601a();
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
        this.f66364a = t;
        this.f66365b = i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    /* JADX INFO: renamed from: a */
    public int mo93128a() {
        return 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    /* JADX INFO: renamed from: c */
    public void mo93129c(int i, @NotNull T t) {
        t.getClass();
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: f */
    public final int m93147f() {
        return this.f66365b;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final T m93148g() {
        return this.f66364a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @Nullable
    public T get(int i) {
        if (i == this.f66365b) {
            return this.f66364a;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new C153551(this);
    }
}
