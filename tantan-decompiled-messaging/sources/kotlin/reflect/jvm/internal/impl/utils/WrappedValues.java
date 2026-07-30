package kotlin.reflect.jvm.internal.impl.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class WrappedValues {

    /* JADX INFO: renamed from: a */
    public static final Object f66457a = new C15366a();

    /* JADX INFO: renamed from: b */
    public static volatile boolean f66458b = false;

    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th) {
            super("Rethrow stored exception", th);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$a */
    public static class C15366a {
        public String toString() {
            return "NULL_VALUE";
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m93225a(int i) {
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
    public static <V> Object m93226b(@Nullable V v2) {
        if (v2 == null && (v2 = (V) f66457a) == null) {
            m93225a(1);
        }
        return v2;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static Object m93227c(@NotNull Throwable th) {
        if (th == null) {
            m93225a(3);
        }
        return new C15367b(th, null);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static <V> V m93228d(@NotNull Object obj) {
        if (obj == null) {
            m93225a(4);
        }
        return (V) m93229e(m93230f(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: e */
    public static <V> V m93229e(@NotNull Object obj) {
        if (obj == 0) {
            m93225a(0);
        }
        if (obj == f66457a) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: f */
    public static <V> V m93230f(@Nullable Object obj) {
        if (!(obj instanceof C15367b)) {
            return obj;
        }
        Throwable thM93232b = ((C15367b) obj).m93232b();
        if (f66458b && ExceptionUtilsKt.m93196a(thM93232b)) {
            throw new WrappedProcessCanceledException(thM93232b);
        }
        throw ExceptionUtilsKt.m93197b(thM93232b);
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$b */
    public static final class C15367b {

        /* JADX INFO: renamed from: a */
        public final Throwable f66459a;

        public C15367b(@NotNull Throwable th) {
            if (th == null) {
                m93231a(0);
            }
            this.f66459a = th;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m93231a(int i) {
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
        public Throwable m93232b() {
            Throwable th = this.f66459a;
            if (th == null) {
                m93231a(1);
            }
            return th;
        }

        public String toString() {
            return this.f66459a.toString();
        }

        public /* synthetic */ C15367b(Throwable th, C15366a c15366a) {
            this(th);
        }
    }
}
