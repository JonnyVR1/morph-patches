package kotlin.collections;

import com.p046p1.mobile.putong.core.data.MessageType;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0087\n\u001a\"\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a0\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00060\bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, m87232d2 = {"iterator", "", j6f.GPS_DIRECTION_TRUE, "withIndex", "Lkotlin/collections/IndexedValue;", "forEach", "", MessageType.operation, "Lkotlin/Function1;", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__IteratorsKt extends CollectionsKt__IteratorsJVMKt {
    public static final <T> void forEach(@NotNull Iterator<? extends T> it, @NotNull Function1<? super T, Unit> function1) {
        it.getClass();
        function1.getClass();
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> Iterator<T> iterator(Iterator<? extends T> it) {
        it.getClass();
        return it;
    }

    @NotNull
    public static final <T> Iterator<IndexedValue<T>> withIndex(@NotNull Iterator<? extends T> it) {
        it.getClass();
        return new IndexingIterator(it);
    }
}
