package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u000026\u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002 \u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003H\u0002¢\u0006\u0004\b\n\u0010\t\u001a/\u0010\u000b\u001a\u00020\u0007\"\f\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00028\u00000\rj\b\u0012\u0004\u0012\u00028\u0000`\u000e\"\u0004\b\u0000\u0010\u000026\u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0002\u0010\u000f\u001a-\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00028\u00000\rj\b\u0012\u0004\u0012\u00028\u0000`\u000e\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "a", "b", "", "Lkotlin/Function1;", "", "selectors", "", "e", "(Ljava/lang/Object;Ljava/lang/Object;[Lkotlin/jvm/functions/Function1;)I", "f", Constants.INAPP_DATA_TAG, "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "g", "()Ljava/util/Comparator;", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/comparisons/ComparisonsKt")
public class cn5 {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static <T> Comparator<T> m107731b(@NotNull final Function1<? super T, ? extends Comparable<?>>... function1Arr) {
        function1Arr.getClass();
        if (function1Arr.length > 0) {
            return new Comparator() { // from class: l.bn5
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return cn5.m107732c(function1Arr, obj, obj2);
                }
            };
        }
        ig3.m135964a("Failed requirement.");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final int m107732c(Function1[] function1Arr, Object obj, Object obj2) {
        return m107735f(obj, obj2, function1Arr);
    }

    /* JADX INFO: renamed from: d */
    public static <T extends Comparable<?>> int m107733d(@Nullable T t, @Nullable T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    /* JADX INFO: renamed from: e */
    public static <T> int m107734e(T t, T t2, @NotNull Function1<? super T, ? extends Comparable<?>>... function1Arr) {
        function1Arr.getClass();
        if (function1Arr.length > 0) {
            return m107735f(t, t2, function1Arr);
        }
        ig3.m135964a("Failed requirement.");
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static final <T> int m107735f(T t, T t2, Function1<? super T, ? extends Comparable<?>>[] function1Arr) {
        for (Function1<? super T, ? extends Comparable<?>> function1 : function1Arr) {
            int iM107733d = m107733d(function1.invoke(t), function1.invoke(t2));
            if (iM107733d != 0) {
                return iM107733d;
            }
        }
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static <T extends Comparable<? super T>> Comparator<T> m107736g() {
        c0d0 c0d0Var = c0d0.INSTANCE;
        c0d0Var.getClass();
        return c0d0Var;
    }
}
