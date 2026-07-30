package kotlin.reflect.jvm.internal.impl.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class WrappedValues {

    /* JADX INFO: renamed from: a */
    public static final Object f67131a = new C15473a();

    /* JADX INFO: renamed from: b */
    public static volatile boolean f67132b = false;

    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th) {
            super("Rethrow stored exception", th);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$a */
    public static class C15473a {
        public String toString() {
            return "NULL_VALUE";
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m94116a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i == 1 || i == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i != 1 && i != 2) {
            if (i == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static <V> Object m94117b(@Nullable V v2) {
        if (v2 == null && (v2 = (V) f67131a) == null) {
            m94116a(1);
        }
        return v2;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static Object m94118c(@NotNull Throwable th) {
        if (th == null) {
            m94116a(3);
        }
        return new C15474b(th, null);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static <V> V m94119d(@NotNull Object obj) {
        if (obj == null) {
            m94116a(4);
        }
        return (V) m94120e(m94121f(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: e */
    public static <V> V m94120e(@NotNull Object obj) {
        if (obj == 0) {
            m94116a(0);
        }
        if (obj == f67131a) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: f */
    public static <V> V m94121f(@Nullable Object obj) {
        if (!(obj instanceof C15474b)) {
            return obj;
        }
        Throwable thM94123b = ((C15474b) obj).m94123b();
        if (f67132b && ExceptionUtilsKt.m94087a(thM94123b)) {
            throw new WrappedProcessCanceledException(thM94123b);
        }
        throw ExceptionUtilsKt.m94088b(thM94123b);
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$b */
    public static final class C15474b {

        /* JADX INFO: renamed from: a */
        public final Throwable f67133a;

        public C15474b(@NotNull Throwable th) {
            if (th == null) {
                m94122a(0);
            }
            this.f67133a = th;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m94122a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public Throwable m94123b() {
            Throwable th = this.f67133a;
            if (th == null) {
                m94122a(1);
            }
            return th;
        }

        public String toString() {
            return this.f67133a.toString();
        }

        public /* synthetic */ C15474b(Throwable th, C15473a c15473a) {
            this(th);
        }
    }
}
