package kotlin.collections;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.b2s;
import p149l.j6f;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001aA\u0010\u0006\u001a\u0002H\u0007\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\b\"\u0004\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\t\u001a\u0002H\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\n\u001a\u0016\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u000e\u001a&\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0010\"\u000e\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u0011*\b\u0012\u0004\u0012\u0002H\r0\u0003\u001a8\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0010\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u00032\u001a\u0010\u0012\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\r0\u0013j\n\u0012\u0006\b\u0000\u0012\u0002H\r`\u0014\u001a\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00020\u00160\u0003H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u0018*\b\u0012\u0004\u0012\u00020\u00180\u0003H\u0007¢\u0006\u0002\u0010\u0019\u001a)\u0010\u0015\u001a\u0004\u0018\u0001H\r\"\u000e\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u0011*\b\u0012\u0004\u0012\u0002H\r0\u0003H\u0007¢\u0006\u0002\u0010\u001a\u001aG\u0010\u001b\u001a\u0004\u0018\u0001H\r\"\u0004\b\u0000\u0010\r\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0011*\b\u0012\u0004\u0012\u0002H\r0\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u00020\u001dH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a;\u0010\u001f\u001a\u0004\u0018\u0001H\r\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u00032\u001a\u0010\u0012\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\r0\u0013j\n\u0012\u0006\b\u0000\u0012\u0002H\r`\u0014H\u0007¢\u0006\u0002\u0010 \u001a\u0019\u0010!\u001a\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00020\u00160\u0003H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0019\u0010!\u001a\u0004\u0018\u00010\u0018*\b\u0012\u0004\u0012\u00020\u00180\u0003H\u0007¢\u0006\u0002\u0010\u0019\u001a)\u0010!\u001a\u0004\u0018\u0001H\r\"\u000e\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u0011*\b\u0012\u0004\u0012\u0002H\r0\u0003H\u0007¢\u0006\u0002\u0010\u001a\u001aG\u0010\"\u001a\u0004\u0018\u0001H\r\"\u0004\b\u0000\u0010\r\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0011*\b\u0012\u0004\u0012\u0002H\r0\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u00020\u001dH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a;\u0010#\u001a\u0004\u0018\u0001H\r\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u00032\u001a\u0010\u0012\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\r0\u0013j\n\u0012\u0006\b\u0000\u0012\u0002H\r`\u0014H\u0007¢\u0006\u0002\u0010 \u001a5\u0010$\u001a\u00020%\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020%0\u001dH\u0087\bø\u0001\u0000¢\u0006\u0002\b&\u001a5\u0010$\u001a\u00020'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020'0\u001dH\u0087\bø\u0001\u0000¢\u0006\u0002\b(\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, m87232d2 = {"filterIsInstance", "", "R", "", "klass", "Ljava/lang/Class;", "filterIsInstanceTo", b2s.C_ZONE, "", FirebaseAnalytics.Param.DESTINATION, "(Ljava/lang/Iterable;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "reverse", "", j6f.GPS_DIRECTION_TRUE, "", "toSortedSet", "Ljava/util/SortedSet;", "", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", Constants.PRIORITY_MAX, "", "(Ljava/lang/Iterable;)Ljava/lang/Double;", "", "(Ljava/lang/Iterable;)Ljava/lang/Float;", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "maxBy", "selector", "Lkotlin/Function1;", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "maxWith", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/lang/Object;", "min", "minBy", "minWith", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "Ljava/math/BigInteger;", "sumOfBigInteger", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/collections/CollectionsKt")
@SourceDebugExtension
public class CollectionsKt___CollectionsJvmKt extends CollectionsKt__ReversedViewsKt {
    @NotNull
    public static final <R> List<R> filterIsInstance(@NotNull Iterable<?> iterable, @NotNull Class<R> cls) {
        iterable.getClass();
        cls.getClass();
        return (List) filterIsInstanceTo(iterable, new ArrayList(), cls);
    }

    @NotNull
    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(@NotNull Iterable<?> iterable, @NotNull C c, @NotNull Class<R> cls) {
        iterable.getClass();
        c.getClass();
        cls.getClass();
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    @Deprecated
    @SinceKotlin
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Double m223902max(Iterable iterable) {
        iterable.getClass();
        return CollectionsKt___CollectionsKt.m223910maxOrNull((Iterable<Double>) iterable);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        iterable.getClass();
        function1.getClass();
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = function1.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = function1.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Object maxWith(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        comparator.getClass();
        return CollectionsKt___CollectionsKt.maxWithOrNull(iterable, comparator);
    }

    @Deprecated
    @SinceKotlin
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Double m223904min(Iterable iterable) {
        iterable.getClass();
        return CollectionsKt___CollectionsKt.m223918minOrNull((Iterable<Double>) iterable);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        iterable.getClass();
        function1.getClass();
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = function1.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = function1.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Object minWith(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        comparator.getClass();
        return CollectionsKt___CollectionsKt.minWithOrNull(iterable, comparator);
    }

    public static <T> void reverse(@NotNull List<T> list) {
        list.getClass();
        Collections.reverse(list);
    }

    @SinceKotlin
    @InlineOnly
    @JvmName
    @OverloadResolutionByLambdaReturnType
    private static final <T> BigDecimal sumOfBigDecimal(Iterable<? extends T> iterable, Function1<? super T, ? extends BigDecimal> function1) {
        iterable.getClass();
        function1.getClass();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        bigDecimalValueOf.getClass();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(it.next()));
            bigDecimalValueOf.getClass();
        }
        return bigDecimalValueOf;
    }

    @SinceKotlin
    @InlineOnly
    @JvmName
    @OverloadResolutionByLambdaReturnType
    private static final <T> BigInteger sumOfBigInteger(Iterable<? extends T> iterable, Function1<? super T, ? extends BigInteger> function1) {
        iterable.getClass();
        function1.getClass();
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        bigIntegerValueOf.getClass();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(it.next()));
            bigIntegerValueOf.getClass();
        }
        return bigIntegerValueOf;
    }

    @NotNull
    public static final <T> SortedSet<T> toSortedSet(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        iterable.getClass();
        comparator.getClass();
        return (SortedSet) CollectionsKt___CollectionsKt.toCollection(iterable, new TreeSet(comparator));
    }

    @Deprecated
    @SinceKotlin
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Float m223903max(Iterable iterable) {
        iterable.getClass();
        return CollectionsKt___CollectionsKt.m223911maxOrNull((Iterable<Float>) iterable);
    }

    @Deprecated
    @SinceKotlin
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Float m223905min(Iterable iterable) {
        iterable.getClass();
        return CollectionsKt___CollectionsKt.m223919minOrNull((Iterable<Float>) iterable);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Comparable max(Iterable iterable) {
        iterable.getClass();
        return CollectionsKt___CollectionsKt.maxOrNull(iterable);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Comparable min(Iterable iterable) {
        iterable.getClass();
        return CollectionsKt___CollectionsKt.minOrNull(iterable);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(@NotNull Iterable<? extends T> iterable) {
        iterable.getClass();
        return (SortedSet) CollectionsKt___CollectionsKt.toCollection(iterable, new TreeSet());
    }
}
