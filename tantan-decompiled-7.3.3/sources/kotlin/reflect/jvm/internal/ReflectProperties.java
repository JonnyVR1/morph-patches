package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class ReflectProperties {

    public static class LazySoftVal<T> extends Val<T> implements Function0<T> {

        /* JADX INFO: renamed from: b */
        public final Function0<T> f64393b;

        /* JADX INFO: renamed from: c */
        public volatile SoftReference<Object> f64394c;

        public LazySoftVal(@Nullable T t, @NotNull Function0<T> function0) {
            if (function0 == null) {
                m88886f(0);
            }
            this.f64394c = null;
            this.f64393b = function0;
            if (t != null) {
                this.f64394c = new SoftReference<>(m88887a(t));
            }
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m88886f(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // kotlin.reflect.jvm.internal.ReflectProperties.Val, kotlin.jvm.functions.Function0
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f64394c;
            if (softReference != null && (obj = softReference.get()) != null) {
                return m88889c(obj);
            }
            T tInvoke = this.f64393b.invoke();
            this.f64394c = new SoftReference<>(m88887a(tInvoke));
            return tInvoke;
        }
    }

    public static abstract class Val<T> {

        /* JADX INFO: renamed from: a */
        public static final Object f64395a = new C15280a();

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.ReflectProperties$Val$a */
        public static class C15280a {
        }

        /* JADX INFO: renamed from: a */
        public Object m88887a(T t) {
            return t == null ? f64395a : t;
        }

        /* JADX INFO: renamed from: b */
        public final T m88888b(Object obj, Object obj2) {
            return invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public T m88889c(Object obj) {
            if (obj == f64395a) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m88883a(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static <T> LazySoftVal<T> m88884b(@Nullable T t, @NotNull Function0<T> function0) {
        if (function0 == null) {
            m88883a(0);
        }
        return new LazySoftVal<>(t, function0);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static <T> LazySoftVal<T> m88885c(@NotNull Function0<T> function0) {
        if (function0 == null) {
            m88883a(1);
        }
        return m88884b(null, function0);
    }
}
