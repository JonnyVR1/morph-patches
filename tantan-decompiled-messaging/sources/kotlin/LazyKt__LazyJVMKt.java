package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;
import p149l.l9r;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "initializer", "Lkotlin/Lazy;", "b", "(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "Lkotlin/LazyThreadSafetyMode;", "mode", "a", "(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/LazyKt")
public class LazyKt__LazyJVMKt {

    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f63387a;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f63387a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static <T> Lazy<T> m87228a(@NotNull LazyThreadSafetyMode lazyThreadSafetyMode, @NotNull Function0<? extends T> function0) {
        lazyThreadSafetyMode.getClass();
        function0.getClass();
        int i = WhenMappings.f63387a[lazyThreadSafetyMode.ordinal()];
        int i2 = 2;
        if (i == 1) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new SynchronizedLazyImpl(function0, defaultConstructorMarker, i2, defaultConstructorMarker);
        }
        if (i == 2) {
            return new SafePublicationLazyImpl(function0);
        }
        if (i == 3) {
            return new UnsafeLazyImpl(function0);
        }
        l9r.m149037a();
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static <T> Lazy<T> m87229b(@NotNull Function0<? extends T> function0) {
        function0.getClass();
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new SynchronizedLazyImpl(function0, defaultConstructorMarker, 2, defaultConstructorMarker);
    }
}
