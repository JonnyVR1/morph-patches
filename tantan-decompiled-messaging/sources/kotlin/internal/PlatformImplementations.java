package kotlin.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.FallbackThreadLocalRandom;
import kotlin.random.Random;
import kotlin.time.Clock;
import kotlin.time.ExperimentalTime;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Lkotlin/internal/PlatformImplementations;", "", "<init>", "()V", "", "cause", "exception", "", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "Lkotlin/random/Random;", "b", "()Lkotlin/random/Random;", "Lkotlin/time/Clock;", "c", "()Lkotlin/time/Clock;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public class PlatformImplementations {

    /* JADX INFO: renamed from: kotlin.internal.PlatformImplementations$a */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, m87232d2 = {"Lkotlin/internal/PlatformImplementations$a;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "a", "Ljava/lang/reflect/Method;", "addSuppressed", "b", "getSuppressed", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C15155a {

        @NotNull
        public static final C15155a INSTANCE = new C15155a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public static final Method addSuppressed;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public static final Method getSuppressed;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            methods.getClass();
            int length = methods.length;
            int i = 0;
            while (true) {
                method = null;
                if (i >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i];
                if (Intrinsics.m87488d(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    parameterTypes.getClass();
                    if (Intrinsics.m87488d(ArraysKt.singleOrNull(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i++;
            }
            addSuppressed = method2;
            for (Method method3 : methods) {
                if (Intrinsics.m87488d(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            getSuppressed = method;
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo87386a(@NotNull Throwable cause, @NotNull Throwable exception) throws IllegalAccessException, InvocationTargetException {
        cause.getClass();
        exception.getClass();
        Method method = C15155a.addSuppressed;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public Random mo87387b() {
        return new FallbackThreadLocalRandom();
    }

    @ExperimentalTime
    @NotNull
    /* JADX INFO: renamed from: c */
    public Clock mo87388c() {
        throw new UnsupportedOperationException("getSystemClock should not be called on the base PlatformImplementations.");
    }
}
