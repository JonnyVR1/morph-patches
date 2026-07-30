package kotlin.reflect.jvm.internal.impl.storage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.StringsKt;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.oif0;

/* JADX INFO: loaded from: classes2.dex */
public class LockBasedStorageManager implements StorageManager {

    /* JADX INFO: renamed from: d */
    public static final String f66164d = StringsKt.m93429X0(LockBasedStorageManager.class.getCanonicalName(), ".", "");

    /* JADX INFO: renamed from: e */
    public static final StorageManager f66165e = new C15325a("NO_LOCKS", ExceptionHandlingStrategy.f66169a, EmptySimpleLock.INSTANCE);

    /* JADX INFO: renamed from: a */
    public final SimpleLock f66166a;

    /* JADX INFO: renamed from: b */
    public final ExceptionHandlingStrategy f66167b;

    /* JADX INFO: renamed from: c */
    public final String f66168c;

    public interface ExceptionHandlingStrategy {

        /* JADX INFO: renamed from: a */
        public static final ExceptionHandlingStrategy f66169a = new C15324a();

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy$a */
        public static class C15324a implements ExceptionHandlingStrategy {
            /* JADX INFO: renamed from: b */
            public static /* synthetic */ void m92455b(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy
            @NotNull
            /* JADX INFO: renamed from: a */
            public RuntimeException mo92454a(@NotNull Throwable th) {
                if (th == null) {
                    m92455b(0);
                }
                throw ExceptionUtilsKt.m93197b(th);
            }
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        RuntimeException mo92454a(@NotNull Throwable th);
    }

    public enum NotValue {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$a */
    public static class C15325a extends LockBasedStorageManager {
        public C15325a(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, SimpleLock simpleLock) {
            super(str, exceptionHandlingStrategy, simpleLock, null);
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ void m92456j(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        @NotNull
        /* JADX INFO: renamed from: p */
        public <K, V> C15337m<V> mo92453p(@NotNull String str, K k) {
            if (str == null) {
                m92456j(0);
            }
            C15337m<V> c15337mM92478a = C15337m.m92478a();
            if (c15337mM92478a == null) {
                m92456j(1);
            }
            return c15337mM92478a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$b */
    public class C15326b<T> extends C15333i<T> {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Object f66170d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15326b(LockBasedStorageManager lockBasedStorageManager, Function0 function0, Object obj) {
            super(lockBasedStorageManager, function0);
            this.f66170d = obj;
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m92457a(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C15331g
        @NotNull
        /* JADX INFO: renamed from: c */
        public C15337m<T> mo92458c(boolean z) {
            C15337m<T> c15337mM92479d = C15337m.m92479d(this.f66170d);
            if (c15337mM92479d == null) {
                m92457a(0);
            }
            return c15337mM92479d;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$c */
    public class C15327c<T> extends AbstractC15334j<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Function1 f66172e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Function1 f66173f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15327c(LockBasedStorageManager lockBasedStorageManager, Function0 function0, Function1 function1, Function1 function2) {
            super(lockBasedStorageManager, function0);
            this.f66172e = function1;
            this.f66173f = function2;
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m92459a(int i) {
            String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i != 2 ? 2 : 3];
            if (i != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C15331g
        @NotNull
        /* JADX INFO: renamed from: c */
        public C15337m<T> mo92458c(boolean z) {
            Function1 function1 = this.f66172e;
            if (function1 == null) {
                C15337m<T> c15337mMo92458c = super.mo92458c(z);
                if (c15337mMo92458c == null) {
                    m92459a(0);
                }
                return c15337mMo92458c;
            }
            C15337m<T> c15337mM92479d = C15337m.m92479d(function1.invoke(Boolean.valueOf(z)));
            if (c15337mM92479d == null) {
                m92459a(1);
            }
            return c15337mM92479d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.AbstractC15332h
        /* JADX INFO: renamed from: f */
        public void mo92460f(@NotNull T t) {
            if (t == null) {
                m92459a(2);
            }
            this.f66173f.invoke(t);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$f */
    public static class C15330f<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f66175a;

        /* JADX INFO: renamed from: b */
        public final Function0<? extends V> f66176b;

        public C15330f(K k, Function0<? extends V> function0) {
            this.f66175a = k;
            this.f66176b = function0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f66175a.equals(((C15330f) obj).f66175a);
        }

        public int hashCode() {
            return this.f66175a.hashCode();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$g */
    public static class C15331g<T> implements NullableLazyValue<T> {

        /* JADX INFO: renamed from: a */
        public final LockBasedStorageManager f66177a;

        /* JADX INFO: renamed from: b */
        public final Function0<? extends T> f66178b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public volatile Object f66179c;

        public C15331g(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            if (lockBasedStorageManager == null) {
                m92465a(0);
            }
            if (function0 == null) {
                m92465a(1);
            }
            this.f66179c = NotValue.NOT_COMPUTED;
            this.f66177a = lockBasedStorageManager;
            this.f66178b = function0;
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m92465a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i != 2 && i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX INFO: renamed from: b */
        public void mo92466b(T t) {
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public C15337m<T> mo92458c(boolean z) {
            C15337m<T> c15337mMo92453p = this.f66177a.mo92453p("in a lazy value", null);
            if (c15337mMo92453p == null) {
                m92465a(2);
            }
            return c15337mMo92453p;
        }

        /* JADX INFO: renamed from: d */
        public boolean m92467d() {
            return (this.f66179c == NotValue.NOT_COMPUTED || this.f66179c == NotValue.COMPUTING) ? false : true;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0042 A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x004d A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        @Override // kotlin.jvm.functions.Function0
        public T invoke() {
            T tInvoke;
            C15337m<T> c15337mMo92458c;
            Object obj = this.f66179c;
            if (!(obj instanceof NotValue)) {
                return (T) WrappedValues.m93230f(obj);
            }
            this.f66177a.f66166a.lock();
            try {
                Object obj2 = this.f66179c;
                if (obj2 instanceof NotValue) {
                    NotValue notValue = NotValue.COMPUTING;
                    if (obj2 == notValue) {
                        this.f66179c = NotValue.RECURSION_WAS_DETECTED;
                        C15337m<T> c15337mMo92458c2 = mo92458c(true);
                        if (!c15337mMo92458c2.m92481c()) {
                            tInvoke = c15337mMo92458c2.m92480b();
                        } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                            c15337mMo92458c = mo92458c(false);
                            if (c15337mMo92458c.m92481c()) {
                                this.f66179c = notValue;
                                try {
                                    tInvoke = this.f66178b.invoke();
                                    mo92466b(tInvoke);
                                    this.f66179c = tInvoke;
                                } catch (Throwable th) {
                                    if (ExceptionUtilsKt.m93196a(th)) {
                                        this.f66179c = NotValue.NOT_COMPUTED;
                                        throw th;
                                    }
                                    if (this.f66179c == NotValue.COMPUTING) {
                                        this.f66179c = WrappedValues.m93227c(th);
                                    }
                                    throw this.f66177a.f66167b.mo92454a(th);
                                }
                            } else {
                                tInvoke = c15337mMo92458c.m92480b();
                            }
                        } else {
                            this.f66179c = notValue;
                            tInvoke = this.f66178b.invoke();
                            mo92466b(tInvoke);
                            this.f66179c = tInvoke;
                        }
                    } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                        c15337mMo92458c = mo92458c(false);
                        if (c15337mMo92458c.m92481c()) {
                            tInvoke = c15337mMo92458c.m92480b();
                        } else {
                            this.f66179c = notValue;
                            tInvoke = this.f66178b.invoke();
                            mo92466b(tInvoke);
                            this.f66179c = tInvoke;
                        }
                    } else {
                        this.f66179c = notValue;
                        tInvoke = this.f66178b.invoke();
                        mo92466b(tInvoke);
                        this.f66179c = tInvoke;
                    }
                } else {
                    tInvoke = (T) WrappedValues.m93230f(obj2);
                }
                this.f66177a.f66166a.unlock();
                return tInvoke;
            } catch (Throwable th2) {
                this.f66177a.f66166a.unlock();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$h */
    public static abstract class AbstractC15332h<T> extends C15331g<T> {

        /* JADX INFO: renamed from: d */
        @Nullable
        public volatile oif0<T> f66180d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC15332h(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                m92468a(0);
            }
            if (function0 == null) {
                m92468a(1);
            }
            this.f66180d = null;
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m92468a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C15331g
        /* JADX INFO: renamed from: b */
        public final void mo92466b(T t) {
            this.f66180d = new oif0<>(t);
            try {
                mo92460f(t);
            } finally {
                this.f66180d = null;
            }
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo92460f(T t);

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C15331g, kotlin.jvm.functions.Function0
        public T invoke() {
            oif0<T> oif0Var = this.f66180d;
            return (oif0Var == null || !oif0Var.m164509b()) ? (T) super.invoke() : oif0Var.m164508a();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$i */
    public static class C15333i<T> extends C15331g<T> implements NotNullLazyValue<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15333i(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                m92469a(0);
            }
            if (function0 == null) {
                m92469a(1);
            }
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m92469a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C15331g, kotlin.jvm.functions.Function0
        @NotNull
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                m92469a(2);
            }
            return t;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$j */
    public static abstract class AbstractC15334j<T> extends AbstractC15332h<T> implements NotNullLazyValue<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC15334j(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                m92470a(0);
            }
            if (function0 == null) {
                m92470a(1);
            }
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m92470a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.AbstractC15332h, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C15331g, kotlin.jvm.functions.Function0
        @NotNull
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                m92470a(2);
            }
            return t;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$k */
    public static class C15335k<K, V> implements MemoizedFunctionToNullable<K, V> {

        /* JADX INFO: renamed from: a */
        public final LockBasedStorageManager f66181a;

        /* JADX INFO: renamed from: b */
        public final ConcurrentMap<K, Object> f66182b;

        /* JADX INFO: renamed from: c */
        public final Function1<? super K, ? extends V> f66183c;

        public C15335k(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<K, Object> concurrentMap, @NotNull Function1<? super K, ? extends V> function1) {
            if (lockBasedStorageManager == null) {
                m92471b(0);
            }
            if (concurrentMap == null) {
                m92471b(1);
            }
            if (function1 == null) {
                m92471b(2);
            }
            this.f66181a = lockBasedStorageManager;
            this.f66182b = concurrentMap;
            this.f66183c = function1;
        }

        /* JADX INFO: renamed from: b */
        private static /* synthetic */ void m92471b(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 3 && i != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX INFO: renamed from: c */
        public final AssertionError m92472c(K k, Object obj) {
            return (AssertionError) LockBasedStorageManager.m92441q(new AssertionError("Inconsistent key detected. " + NotValue.COMPUTING + " is expected, was: " + obj + ", most probably race condition detected on input " + k + " under " + this.f66181a));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable
        /* JADX INFO: renamed from: e */
        public boolean mo92473e(K k) {
            Object obj = this.f66182b.get(k);
            return (obj == null || obj == NotValue.COMPUTING) ? false : true;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final AssertionError m92474f(K k, Object obj) {
            AssertionError assertionError = (AssertionError) LockBasedStorageManager.m92441q(new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.f66181a));
            if (assertionError == null) {
                m92471b(4);
            }
            return assertionError;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public C15337m<V> m92475g(K k, boolean z) {
            C15337m<V> c15337mMo92453p = this.f66181a.mo92453p("", k);
            if (c15337mMo92453p == null) {
                m92471b(3);
            }
            return c15337mMo92453p;
        }

        /* JADX INFO: renamed from: h */
        public final AssertionError m92476h(K k, Throwable th) {
            return (AssertionError) LockBasedStorageManager.m92441q(new AssertionError("Unable to remove " + k + " under " + this.f66181a, th));
        }

        /* JADX WARN: Code duplicated, block: B:18:0x003e A[Catch: all -> 0x003b, PHI: r0
          0x003e: PHI (r0v6 java.lang.Object) = (r0v5 java.lang.Object), (r0v16 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:48:0x00a1, B:50:0x00ad, B:51:0x00b1, B:52:0x00b2, B:53:0x00bc, B:55:0x00c0, B:56:0x00ca, B:58:0x00cc, B:59:0x00d0, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:54:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:66:0x0018, inners: #0, #1, #3 }] */
        /* JADX WARN: Code duplicated, block: B:20:0x0042 A[Catch: all -> 0x003b, TryCatch #2 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:48:0x00a1, B:50:0x00ad, B:51:0x00b1, B:52:0x00b2, B:53:0x00bc, B:55:0x00c0, B:56:0x00ca, B:58:0x00cc, B:59:0x00d0, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:54:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:66:0x0018, inners: #0, #1, #3 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x004d A[Catch: all -> 0x003b, TryCatch #2 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:48:0x00a1, B:50:0x00ad, B:51:0x00b1, B:52:0x00b2, B:53:0x00bc, B:55:0x00c0, B:56:0x00ca, B:58:0x00cc, B:59:0x00d0, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:54:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:66:0x0018, inners: #0, #1, #3 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x0052 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:24:0x0054 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:48:0x00a1, B:50:0x00ad, B:51:0x00b1, B:52:0x00b2, B:53:0x00bc, B:55:0x00c0, B:56:0x00ca, B:58:0x00cc, B:59:0x00d0, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:54:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:66:0x0018, inners: #0, #1, #3 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0059  */
        /* JADX WARN: Code duplicated, block: B:29:0x0071  */
        /* JADX WARN: Code duplicated, block: B:31:0x0079 A[Catch: all -> 0x007e, TRY_ENTER, TryCatch #3 {all -> 0x007e, blocks: (B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:67:0x005a, outer: #2 }] */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public V invoke(K k) {
            AssertionError assertionErrorM92474f;
            V vInvoke;
            Object objPut;
            V vM92480b;
            C15337m<V> c15337mM92475g;
            Object obj = this.f66182b.get(k);
            if (obj != null && obj != NotValue.COMPUTING) {
                return (V) WrappedValues.m93228d(obj);
            }
            this.f66181a.f66166a.lock();
            try {
                Object obj2 = this.f66182b.get(k);
                NotValue notValue = NotValue.COMPUTING;
                if (obj2 == notValue) {
                    obj2 = NotValue.RECURSION_WAS_DETECTED;
                    C15337m<V> c15337mM92475g2 = m92475g(k, true);
                    if (!c15337mM92475g2.m92481c()) {
                        vM92480b = c15337mM92475g2.m92480b();
                    } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                        c15337mM92475g = m92475g(k, false);
                        if (!c15337mM92475g.m92481c()) {
                            vM92480b = c15337mM92475g.m92480b();
                        } else {
                            if (obj2 != null) {
                                assertionErrorM92474f = null;
                                try {
                                    this.f66182b.put(k, notValue);
                                    vInvoke = this.f66183c.invoke(k);
                                    objPut = this.f66182b.put(k, WrappedValues.m93226b(vInvoke));
                                    if (objPut == notValue) {
                                        this.f66181a.f66166a.unlock();
                                        return vInvoke;
                                    }
                                    assertionErrorM92474f = m92474f(k, objPut);
                                    throw assertionErrorM92474f;
                                } catch (Throwable th) {
                                    if (ExceptionUtilsKt.m93196a(th)) {
                                        try {
                                            Object objRemove = this.f66182b.remove(k);
                                            if (objRemove != NotValue.COMPUTING) {
                                                throw m92472c(k, objRemove);
                                            }
                                            throw th;
                                        } catch (Throwable th2) {
                                            throw m92476h(k, th2);
                                        }
                                    }
                                    ConcurrentMap<K, Object> concurrentMap = this.f66182b;
                                    if (th != assertionErrorM92474f) {
                                        Object objPut2 = concurrentMap.put(k, WrappedValues.m93227c(th));
                                        if (objPut2 != NotValue.COMPUTING) {
                                            throw m92474f(k, objPut2);
                                        }
                                        throw this.f66181a.f66167b.mo92454a(th);
                                    }
                                    try {
                                        concurrentMap.remove(k);
                                        throw this.f66181a.f66167b.mo92454a(th);
                                    } catch (Throwable th3) {
                                        throw m92476h(k, th3);
                                    }
                                }
                                this.f66181a.f66166a.unlock();
                                throw th;
                            }
                            vM92480b = (V) WrappedValues.m93228d(obj2);
                        }
                    } else {
                        if (obj2 != null) {
                            assertionErrorM92474f = null;
                            this.f66182b.put(k, notValue);
                            vInvoke = this.f66183c.invoke(k);
                            objPut = this.f66182b.put(k, WrappedValues.m93226b(vInvoke));
                            if (objPut == notValue) {
                                this.f66181a.f66166a.unlock();
                                return vInvoke;
                            }
                            assertionErrorM92474f = m92474f(k, objPut);
                            throw assertionErrorM92474f;
                            this.f66181a.f66166a.unlock();
                            throw th;
                        }
                        vM92480b = (V) WrappedValues.m93228d(obj2);
                    }
                } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                    c15337mM92475g = m92475g(k, false);
                    if (!c15337mM92475g.m92481c()) {
                        vM92480b = c15337mM92475g.m92480b();
                    } else {
                        if (obj2 != null) {
                            assertionErrorM92474f = null;
                            this.f66182b.put(k, notValue);
                            vInvoke = this.f66183c.invoke(k);
                            objPut = this.f66182b.put(k, WrappedValues.m93226b(vInvoke));
                            if (objPut == notValue) {
                                this.f66181a.f66166a.unlock();
                                return vInvoke;
                            }
                            assertionErrorM92474f = m92474f(k, objPut);
                            throw assertionErrorM92474f;
                            this.f66181a.f66166a.unlock();
                            throw th;
                        }
                        vM92480b = (V) WrappedValues.m93228d(obj2);
                    }
                } else {
                    if (obj2 != null) {
                        assertionErrorM92474f = null;
                        this.f66182b.put(k, notValue);
                        vInvoke = this.f66183c.invoke(k);
                        objPut = this.f66182b.put(k, WrappedValues.m93226b(vInvoke));
                        if (objPut == notValue) {
                            this.f66181a.f66166a.unlock();
                            return vInvoke;
                        }
                        assertionErrorM92474f = m92474f(k, objPut);
                        throw assertionErrorM92474f;
                        this.f66181a.f66166a.unlock();
                        throw th;
                    }
                    vM92480b = (V) WrappedValues.m93228d(obj2);
                }
                this.f66181a.f66166a.unlock();
                return vM92480b;
            } catch (Throwable th4) {
                this.f66181a.f66166a.unlock();
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$l */
    public static class C15336l<K, V> extends C15335k<K, V> implements MemoizedFunctionToNotNull<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15336l(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<K, Object> concurrentMap, @NotNull Function1<? super K, ? extends V> function1) {
            super(lockBasedStorageManager, concurrentMap, function1);
            if (lockBasedStorageManager == null) {
                m92477b(0);
            }
            if (concurrentMap == null) {
                m92477b(1);
            }
            if (function1 == null) {
                m92477b(2);
            }
        }

        /* JADX INFO: renamed from: b */
        private static /* synthetic */ void m92477b(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C15335k, kotlin.jvm.functions.Function1
        @NotNull
        public V invoke(K k) {
            V v2 = (V) super.invoke(k);
            if (v2 == null) {
                m92477b(3);
            }
            return v2;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$m */
    public static class C15337m<T> {

        /* JADX INFO: renamed from: a */
        public final T f66184a;

        /* JADX INFO: renamed from: b */
        public final boolean f66185b;

        public C15337m(T t, boolean z) {
            this.f66184a = t;
            this.f66185b = z;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public static <T> C15337m<T> m92478a() {
            return new C15337m<>(null, true);
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public static <T> C15337m<T> m92479d(T t) {
            return new C15337m<>(t, false);
        }

        /* JADX INFO: renamed from: b */
        public T m92480b() {
            return this.f66184a;
        }

        /* JADX INFO: renamed from: c */
        public boolean m92481c() {
            return this.f66185b;
        }

        public String toString() {
            return m92481c() ? "FALL_THROUGH" : String.valueOf(this.f66184a);
        }
    }

    public LockBasedStorageManager(@NotNull String str, @NotNull ExceptionHandlingStrategy exceptionHandlingStrategy, @NotNull SimpleLock simpleLock) {
        if (str == null) {
            m92437j(4);
        }
        if (exceptionHandlingStrategy == null) {
            m92437j(5);
        }
        if (simpleLock == null) {
            m92437j(6);
        }
        this.f66166a = simpleLock;
        this.f66167b = exceptionHandlingStrategy;
        this.f66168c = str;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX INFO: renamed from: j */
    private static /* synthetic */ void m92437j(int i) {
        String str = (i == 10 || i == 13 || i == 20 || i == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 10 || i == 13 || i == 20 || i == 37) ? 2 : 3];
        if (i == 1 || i == 3 || i == 5) {
            objArr[0] = "exceptionHandlingStrategy";
        } else if (i != 6) {
            switch (i) {
                case 8:
                    objArr[0] = "exceptionHandlingStrategy";
                    break;
                case 9:
                case 11:
                case 14:
                case 16:
                case 19:
                case 21:
                    objArr[0] = "compute";
                    break;
                case 10:
                case 13:
                case 20:
                case 37:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    break;
                case 12:
                case 17:
                case 25:
                case 27:
                    objArr[0] = "onRecursiveCall";
                    break;
                case 15:
                case 18:
                case 22:
                    objArr[0] = "map";
                    break;
                case 23:
                case 24:
                case 26:
                case 28:
                case 30:
                case 31:
                case 32:
                case 34:
                    objArr[0] = "computable";
                    break;
                case 29:
                case 33:
                    objArr[0] = "postCompute";
                    break;
                case 35:
                    objArr[0] = "source";
                    break;
                case 36:
                    objArr[0] = "throwable";
                    break;
                default:
                    objArr[0] = "debugText";
                    break;
            }
        } else {
            objArr[0] = JoinPoint.SYNCHRONIZATION_LOCK;
        }
        if (i == 10 || i == 13) {
            objArr[1] = "createMemoizedFunction";
        } else if (i == 20) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i != 37) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "<init>";
                break;
            case 7:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case 13:
            case 20:
            case 37:
                break;
            case 19:
            case 21:
            case 22:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 23:
            case 24:
            case 25:
                objArr[2] = "createLazyValue";
                break;
            case 26:
            case 27:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 28:
            case 29:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 30:
                objArr[2] = "createNullableLazyValue";
                break;
            case 31:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 32:
            case 33:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 34:
                objArr[2] = "compute";
                break;
            case 35:
                objArr[2] = "recursionDetectedDefault";
                break;
            case 36:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 10 && i != 13 && i != 20 && i != 37) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static <K> ConcurrentMap<K, Object> m92440m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static <T extends Throwable> T m92441q(@NotNull T t) {
        if (t == null) {
            m92437j(36);
        }
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            if (!stackTrace[i].getClassName().startsWith(f66164d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i, length);
                t.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
                return t;
            }
            i++;
        }
        i = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i, length);
        t.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* JADX INFO: renamed from: a */
    public <T> NotNullLazyValue<T> mo92442a(@NotNull Function0<? extends T> function0, @NotNull T t) {
        if (function0 == null) {
            m92437j(26);
        }
        if (t == null) {
            m92437j(27);
        }
        return new C15326b(this, function0, t);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* JADX INFO: renamed from: b */
    public <T> NotNullLazyValue<T> mo92443b(@NotNull Function0<? extends T> function0, Function1<? super Boolean, ? extends T> function1, @NotNull Function1<? super T, Unit> function2) {
        if (function0 == null) {
            m92437j(28);
        }
        if (function2 == null) {
            m92437j(29);
        }
        return new C15327c(this, function0, function1, function2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* JADX INFO: renamed from: c */
    public <K, V> MemoizedFunctionToNullable<K, V> mo92444c(@NotNull Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            m92437j(19);
        }
        MemoizedFunctionToNullable<K, V> memoizedFunctionToNullableM92452o = m92452o(function1, m92440m());
        if (memoizedFunctionToNullableM92452o == null) {
            m92437j(20);
        }
        return memoizedFunctionToNullableM92452o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* JADX INFO: renamed from: d */
    public <K, V> CacheWithNotNullValues<K, V> mo92445d() {
        return new C15328d(this, m92440m(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* JADX INFO: renamed from: e */
    public <T> NotNullLazyValue<T> mo92446e(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            m92437j(23);
        }
        return new C15333i(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    /* JADX INFO: renamed from: f */
    public <T> T mo92447f(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            m92437j(34);
        }
        this.f66166a.lock();
        try {
            T tInvoke = function0.invoke();
            this.f66166a.unlock();
            return tInvoke;
        } catch (Throwable th) {
            try {
                throw this.f66167b.mo92454a(th);
            } catch (Throwable th2) {
                this.f66166a.unlock();
                throw th2;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* JADX INFO: renamed from: g */
    public <T> NullableLazyValue<T> mo92448g(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            m92437j(30);
        }
        return new C15331g(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* JADX INFO: renamed from: h */
    public <K, V> CacheWithNullableValues<K, V> mo92449h() {
        return new C15329e(this, m92440m(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* JADX INFO: renamed from: i */
    public <K, V> MemoizedFunctionToNotNull<K, V> mo92450i(@NotNull Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            m92437j(9);
        }
        MemoizedFunctionToNotNull<K, V> memoizedFunctionToNotNullM92451n = m92451n(function1, m92440m());
        if (memoizedFunctionToNotNullM92451n == null) {
            m92437j(10);
        }
        return memoizedFunctionToNotNullM92451n;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public <K, V> MemoizedFunctionToNotNull<K, V> m92451n(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            m92437j(14);
        }
        if (concurrentMap == null) {
            m92437j(15);
        }
        return new C15336l(this, concurrentMap, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public <K, V> MemoizedFunctionToNullable<K, V> m92452o(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            m92437j(21);
        }
        if (concurrentMap == null) {
            m92437j(22);
        }
        return new C15335k(this, concurrentMap, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public <K, V> C15337m<V> mo92453p(@NotNull String str, K k) {
        String str2;
        if (str == null) {
            m92437j(35);
        }
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        if (k == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        throw ((AssertionError) m92441q(new AssertionError(sb.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f66168c + ")";
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$d */
    public static class C15328d<K, V> extends C15329e<K, V> implements CacheWithNotNullValues<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15328d(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<C15330f<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, null);
            if (lockBasedStorageManager == null) {
                m92461b(0);
            }
            if (concurrentMap == null) {
                m92461b(1);
            }
        }

        /* JADX INFO: renamed from: b */
        private static /* synthetic */ void m92461b(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C15329e, kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
        @NotNull
        /* JADX INFO: renamed from: a */
        public V mo92435a(K k, @NotNull Function0<? extends V> function0) {
            if (function0 == null) {
                m92461b(2);
            }
            V v2 = (V) super.mo92435a(k, function0);
            if (v2 == null) {
                m92461b(3);
            }
            return v2;
        }

        public /* synthetic */ C15328d(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, C15325a c15325a) {
            this(lockBasedStorageManager, concurrentMap);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$e */
    public static class C15329e<K, V> extends C15335k<C15330f<K, V>, V> implements CacheWithNullableValues<K, V> {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$e$a */
        public class a implements Function1<C15330f<K, V>, V> {
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public V invoke(C15330f<K, V> c15330f) {
                return (V) c15330f.f66176b.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15329e(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<C15330f<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, new a());
            if (lockBasedStorageManager == null) {
                m92462b(0);
            }
            if (concurrentMap == null) {
                m92462b(1);
            }
        }

        /* JADX INFO: renamed from: b */
        private static /* synthetic */ void m92462b(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public V mo92435a(K k, @NotNull Function0<? extends V> function0) {
            if (function0 == null) {
                m92462b(2);
            }
            return invoke(new C15330f(k, function0));
        }

        public /* synthetic */ C15329e(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, C15325a c15325a) {
            this(lockBasedStorageManager, concurrentMap);
        }
    }

    public /* synthetic */ LockBasedStorageManager(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, SimpleLock simpleLock, C15325a c15325a) {
        this(str, exceptionHandlingStrategy, simpleLock);
    }

    public LockBasedStorageManager(String str) {
        this(str, (Runnable) null, (Function1<InterruptedException, Unit>) null);
    }

    public LockBasedStorageManager(String str, @Nullable Runnable runnable, @Nullable Function1<InterruptedException, Unit> function1) {
        this(str, ExceptionHandlingStrategy.f66169a, SimpleLock.Companion.m92483a(runnable, function1));
    }
}
