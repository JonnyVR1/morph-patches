package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class ReflectProperties {

    public static class LazySoftVal<T> extends Val<T> implements Function0<T> {

        /* JADX INFO: renamed from: b */
        public final Function0<T> f63719b;

        /* JADX INFO: renamed from: c */
        public volatile SoftReference<Object> f63720c;

        public LazySoftVal(@Nullable T t, @NotNull Function0<T> function0) {
            if (function0 == null) {
                m87995f(0);
            }
            this.f63720c = null;
            this.f63719b = function0;
            if (t != null) {
                this.f63720c = new SoftReference<>(m87996a(t));
            }
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m87995f(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // kotlin.reflect.jvm.internal.ReflectProperties.Val, kotlin.jvm.functions.Function0
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f63720c;
            if (softReference != null && (obj = softReference.get()) != null) {
                return m87998c(obj);
            }
            T tInvoke = this.f63719b.invoke();
            this.f63720c = new SoftReference<>(m87996a(tInvoke));
            return tInvoke;
        }
    }

    public static abstract class Val<T> {

        /* JADX INFO: renamed from: a */
        public static final Object f63721a = new C15173a();

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.ReflectProperties$Val$a */
        public static class C15173a {
        }

        /* JADX INFO: renamed from: a */
        public Object m87996a(T t) {
            return t == null ? f63721a : t;
        }

        /* JADX INFO: renamed from: b */
        public final T m87997b(Object obj, Object obj2) {
            return invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public T m87998c(Object obj) {
            if (obj == f63721a) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m87992a(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static <T> LazySoftVal<T> m87993b(@Nullable T t, @NotNull Function0<T> function0) {
        if (function0 == null) {
            m87992a(0);
        }
        return new LazySoftVal<>(t, function0);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static <T> LazySoftVal<T> m87994c(@NotNull Function0<T> function0) {
        if (function0 == null) {
            m87992a(1);
        }
        return m87993b(null, function0);
    }
}
