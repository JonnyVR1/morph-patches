package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.p7f;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u0087\bø\u0001\u0000\u001a\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0001¢\u0006\u0002\u0010\b\u001a \u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0001\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a@\u0010\r\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\f0\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000f*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000f0\u000e0\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, m88121d2 = {"Iterable", "", p7f.GPS_DIRECTION_TRUE, "iterator", "Lkotlin/Function0;", "", "collectionSizeOrNull", "", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "collectionSizeOrDefault", "default", "flatten", "", "unzip", "Lkotlin/Pair;", "R", "kotlin-stdlib"}, m88122k = 5, m88123mv = {2, 2, 0}, m88125xi = 49, m88126xs = "kotlin/collections/CollectionsKt")
public class CollectionsKt__IterablesKt extends CollectionsKt__CollectionsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.CollectionsKt__IterablesKt$Iterable$1 */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, m88121d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "iterator", "", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 176)
    @SourceDebugExtension
    public static final class C152301<T> implements Iterable<T>, KMappedMarker {
        final /* synthetic */ Function0<Iterator<T>> $iterator;

        /* JADX WARN: Multi-variable type inference failed */
        public C152301(Function0<? extends Iterator<? extends T>> function0) {
            this.$iterator = function0;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.$iterator.invoke();
        }
    }

    @InlineOnly
    private static final <T> Iterable<T> Iterable(Function0<? extends Iterator<? extends T>> function0) {
        function0.getClass();
        return new C152301(function0);
    }

    @PublishedApi
    public static <T> int collectionSizeOrDefault(@NotNull Iterable<? extends T> iterable, int i) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    @PublishedApi
    @Nullable
    public static final <T> Integer collectionSizeOrNull(@NotNull Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @NotNull
    public static <T> List<T> flatten(@NotNull Iterable<? extends Iterable<? extends T>> iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, it.next());
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Iterable<? extends Pair<? extends T, ? extends R>> iterable) {
        iterable.getClass();
        int iCollectionSizeOrDefault = collectionSizeOrDefault(iterable, 10);
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        ArrayList arrayList2 = new ArrayList(iCollectionSizeOrDefault);
        for (Pair<? extends T, ? extends R> pair : iterable) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return TuplesKt.m88129a(arrayList, arrayList2);
    }
}
