package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\u0002¨\u0006\u0004"}, m87232d2 = {"iterator", "", j6f.GPS_DIRECTION_TRUE, "Ljava/util/Enumeration;", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/collections/CollectionsKt")
public class CollectionsKt__IteratorsJVMKt extends CollectionsKt__IterablesKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.CollectionsKt__IteratorsJVMKt$iterator$1 */
    @Metadata(m87231d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0002\u001a\u00020\u0003H\u0096\u0002J\u000e\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"kotlin/collections/CollectionsKt__IteratorsJVMKt$iterator$1", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C151241<T> implements Iterator<T>, KMappedMarker {
        final /* synthetic */ Enumeration<T> $this_iterator;

        public C151241(Enumeration<T> enumeration) {
            this.$this_iterator = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.$this_iterator.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.$this_iterator.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @NotNull
    public static <T> Iterator<T> iterator(@NotNull Enumeration<T> enumeration) {
        enumeration.getClass();
        return new C151241(enumeration);
    }
}
