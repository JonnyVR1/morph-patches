package kotlin.collections;

import com.p051p1.mobile.putong.live.base.data.BLivePkCategory;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import p153l.p7f;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a5\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0005j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0006H\u0087\b\u001a6\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\t0\bH\u0087\bø\u0001\u0000\u001a \u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a2\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0005j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0006\u001a&\u0010\f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\r\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\b\u001a!\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, m88121d2 = {"sort", "", p7f.GPS_DIRECTION_TRUE, "", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparison", "Lkotlin/Function2;", "", "", "sortWith", "fill", "value", "(Ljava/util/List;Ljava/lang/Object;)V", "shuffle", BLivePkCategory.random, "Ljava/util/Random;", "kotlin-stdlib"}, m88122k = 5, m88123mv = {2, 2, 0}, m88125xi = 49, m88126xs = "kotlin/collections/CollectionsKt")
public class CollectionsKt__MutableCollectionsJVMKt extends CollectionsKt__IteratorsKt {
    @SinceKotlin
    @InlineOnly
    private static final <T> void fill(List<T> list, T t) {
        list.getClass();
        Collections.fill(list, t);
    }

    @SinceKotlin
    @InlineOnly
    private static final <T> void shuffle(List<T> list, Random random) {
        list.getClass();
        random.getClass();
        Collections.shuffle(list, random);
    }

    @Deprecated
    @InlineOnly
    private static final <T> void sort(List<T> list, Comparator<? super T> comparator) {
        list.getClass();
        comparator.getClass();
        throw new NotImplementedError(null, 1, null);
    }

    public static <T> void sortWith(@NotNull List<T> list, @NotNull Comparator<? super T> comparator) {
        list.getClass();
        comparator.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    @SinceKotlin
    @InlineOnly
    private static final <T> void shuffle(List<T> list) {
        list.getClass();
        Collections.shuffle(list);
    }

    @Deprecated
    @InlineOnly
    private static final <T> void sort(List<T> list, Function2<? super T, ? super T, Integer> function2) {
        list.getClass();
        function2.getClass();
        throw new NotImplementedError(null, 1, null);
    }

    public static <T extends Comparable<? super T>> void sort(@NotNull List<T> list) {
        list.getClass();
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
